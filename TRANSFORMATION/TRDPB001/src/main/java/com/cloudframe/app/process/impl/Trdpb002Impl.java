  package com.cloudframe.app.process.impl;
  /* 
*****************************************************************
*                                                               *
* trdpb002 : securities book-keeping program                    *
*                                                               *
*  - settles securities account of buyer/seller by debiting     *
*    seller security account and crediting buyer security       *
*    account                                                    *
*                                                               *
*****************************************************************
*/
  
  import com.cloudframe.app.trdpb002.Trdpb002Ctx.*;
  import com.cloudframe.app.trdpb002.Trdpb002Ctx;
  import com.cloudframe.app.process.Trdpb002;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.repository.Trdpb002Repository;
  import com.cloudframe.app.utility.CFUtil;
  import java.util.ArrayList;
  import com.cloudframe.app.data.Field;
  import java.util.Map;
  import java.util.HashMap;
  import java.math.BigDecimal;
  import com.cloudframe.app.process.Trdpbexc;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.trdpb002.dto.*;
  import com.cloudframe.app.trdpb002.dto.TrdOrderPair;
  import com.cloudframe.app.trdpb002.dto.Sqlca;
  import com.cloudframe.app.trdpb002.dto.ExceptionRecordLenGroup;
  import com.cloudframe.app.trdpb002.dto.Dcltbtrdpos;
  import com.cloudframe.app.trdpb002.dto.ExceptionRecord;
  import com.cloudframe.app.trdpb002.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("trdpb002")
  
  public class Trdpb002Impl extends CommonProcess implements Trdpb002 {
  
  Logger logger = LoggerFactory.getLogger(Trdpb002Impl.class);
  
  
  @Value("${TRDPB002.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("trdpb002Repository")
  Trdpb002Repository trdpb002Repository;
  
  
  
  
  
  
      @Override
      public int setParameter(Trdpb002Ctx programCtx, String trdOrderPair) throws Exception {
      		if(trdOrderPair != null)
      		    programCtx.getTrdOrderPair().setString(com.cloudframe.app.data.Field.getParm(trdOrderPair),new String(CONSTANTS.EBCDIC_ENCODING));
      		setInitDone(false);
      		process(programCtx);
      		return programCtx.getRc();
      }
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Trdpb002Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("TRDPB002" ,dbQualifier, true/*use Dynamic SQL*/);
//Added variable to get the output context in place.
ProcessInCtx methodIn = programCtx.getProcessInCtx();
//  cobolCode::PERFORM 0000-MAINLINE
//  PERFORM 0000-MAINLINE
          mainline(programCtx);/*0000-MAINLINE*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
		handleDbAtEnd(db2Base); 
      

      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - trdStatus                      COBOL Name: TRD-STATUS
      * - crDbSwtich                     COBOL Name: WS-CR-DB-SWTICH
      *
      * @throws CFException
      */
      @Override
      public MainlineOutCtx mainline(Trdpb002Ctx programCtx) throws Exception {
//Added variable to get the output context in place.
MainlineOutCtx methodOut = programCtx.getMainlineOutCtx();

// * Set default to booking failed
//  cobolCode::SET TRD-SAC-BOOKING-FAILED TO TRUE
//  SET TRD-SAC-BOOKING-FAILED TO TRUE
          methodOut.setTrdSacBookingFailedTrue(); 
          
//  cobolCode::SET DEBIT-SELLER TO TRUE
//  SET DEBIT-SELLER TO TRUE
          methodOut.setDebitSellerTrue(); 
          
//  cobolCode::PERFORM 1000-SAC-BOOKING THRU 1000-EXIT
//  PERFORM 1000-SAC-BOOKING THRU 1000-EXIT
          sacBooking(programCtx.getSacBookingInCtx());/*1000-SAC-BOOKING*/
//  cobolCode::IF TRD-SAC-BOOKING-DONE THEN
//  IF TRD-SAC-BOOKING-DONE THEN
          if ( methodOut.isTrdSacBookingDone()  ) { 

// * Reset back to booking failed and attempt crediting seller
//  cobolCode::SET TRD-SAC-BOOKING-FAILED TO TRUE
//  SET TRD-SAC-BOOKING-FAILED TO TRUE
              methodOut.setTrdSacBookingFailedTrue(); 
              
//  cobolCode::SET CREDIT-BUYER TO TRUE
//  SET CREDIT-BUYER TO TRUE
              methodOut.setCreditBuyerTrue(); 
              
//  cobolCode::PERFORM 1000-SAC-BOOKING THRU 1000-EXIT
//  PERFORM 1000-SAC-BOOKING THRU 1000-EXIT
              sacBooking(programCtx.getSacBookingInCtx());/*1000-SAC-BOOKING*/
          }
//  cobolCode::GOBACK
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * sacBooking 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-SAC-BOOKING COBOL Cyclomatic complexity - 13
      * Input  :  

      * - crDbSwtich                     COBOL Name: WS-CR-DB-SWTICH
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - trdSellerSecAccNum             COBOL Name: TRD-SELLER-SEC-ACC-NUM
      * - trdFigi                        COBOL Name: TRD-FIGI
      * - trdBuyerSecAccNum              COBOL Name: TRD-BUYER-SEC-ACC-NUM
      * - sqlcode                        COBOL Name: SQLCODE
      * - posBalance                     COBOL Name: POS-BALANCE
      * - trdOrderQty                    COBOL Name: TRD-ORDER-QTY
      *
      * Output :  

      * - posCurrency                    COBOL Name: POS-CURRENCY
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - posSacNumber                   COBOL Name: POS-SAC-NUMBER
      * - trdSellerSecAccNum             COBOL Name: TRD-SELLER-SEC-ACC-NUM
      * - posFigi                        COBOL Name: POS-FIGI
      * - trdFigi                        COBOL Name: TRD-FIGI
      * - trdBuyerSecAccNum              COBOL Name: TRD-BUYER-SEC-ACC-NUM
      * - trdStatus                      COBOL Name: TRD-STATUS
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      * - exception                      COBOL Name: WS-EXCEPTION
      * - posBalance                     COBOL Name: POS-BALANCE
      *
      * @throws CFException
      */
      @Override
      public SacBookingOutCtx sacBooking(SacBookingInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// *

// *
//Added variable to get the program context in place.
Trdpb002Ctx programCtx = methodIn.getTrdpb002Ctx();
//Added variable to get the output context in place.
SacBookingOutCtx methodOut = methodIn.getSacBookingOutCtx();
//  cobolCode::IF DEBIT-SELLER
//  IF DEBIT-SELLER
          if ( methodIn.isDebitSeller()  ) { 
//  cobolCode::MOVE TRD-CURRENCY TO POS-CURRENCY
//  MOVE TRD-CURRENCY TO POS-CURRENCY
              methodOut.setPosCurrency(methodOut.getTrdCurrency());
//  cobolCode::MOVE TRD-SELLER-SEC-ACC-NUM TO POS-SAC-NUMBER
//  MOVE TRD-SELLER-SEC-ACC-NUM TO POS-SAC-NUMBER
              methodOut.setPosSacNumber(methodOut.getTrdSellerSecAccNum());
//  cobolCode::MOVE TRD-FIGI TO POS-FIGI
//  MOVE TRD-FIGI TO POS-FIGI
              methodOut.setPosFigi(methodOut.getTrdFigi());
//  cobolCode::DISPLAY 'TRD-CURRENCY          =' TRD-CURRENCY
//  DISPLAY 'TRD-CURRENCY          =' TRD-CURRENCY
              logger.info("TRD-CURRENCY          ={}", new String(methodOut.getTrdCurrency())); 
//  cobolCode::DISPLAY 'TRD-SELLER-SEC-ACC-NUM=' TRD-SELLER-SEC-ACC-NUM
//  DISPLAY 'TRD-SELLER-SEC-ACC-NUM=' TRD-SELLER-SEC-ACC-NUM
              logger.info("TRD-SELLER-SEC-ACC-NUM={}", String.valueOf(methodOut.getTrdSellerSecAccNum())); 
//  cobolCode::DISPLAY 'TRD-FIGI              =' TRD-FIGI
//  DISPLAY 'TRD-FIGI              =' TRD-FIGI
              logger.info("TRD-FIGI              ={}", new String(methodOut.getTrdFigi())); 
          }
//  cobolCode::ELSE
//  ELSE
          else { 
//  cobolCode::MOVE TRD-CURRENCY TO POS-CURRENCY
//  MOVE TRD-CURRENCY TO POS-CURRENCY
              methodOut.setPosCurrency(methodOut.getTrdCurrency());
//  cobolCode::MOVE TRD-BUYER-SEC-ACC-NUM TO POS-SAC-NUMBER
//  MOVE TRD-BUYER-SEC-ACC-NUM TO POS-SAC-NUMBER
              methodOut.setPosSacNumber(methodOut.getTrdBuyerSecAccNum());
//  cobolCode::MOVE TRD-FIGI TO POS-FIGI
//  MOVE TRD-FIGI TO POS-FIGI
              methodOut.setPosFigi(methodOut.getTrdFigi());
//  cobolCode::DISPLAY 'TRD-CURRENCY          =' TRD-CURRENCY
//  DISPLAY 'TRD-CURRENCY          =' TRD-CURRENCY
              logger.info("TRD-CURRENCY          ={}", new String(methodOut.getTrdCurrency())); 
//  cobolCode::DISPLAY 'TRD-BUYER-SEC-ACC-NUM =' TRD-BUYER-SEC-ACC-NUM
//  DISPLAY 'TRD-BUYER-SEC-ACC-NUM =' TRD-BUYER-SEC-ACC-NUM
              logger.info("TRD-BUYER-SEC-ACC-NUM ={}", String.valueOf(methodOut.getTrdBuyerSecAccNum())); 
//  cobolCode::DISPLAY 'TRD-FIGI              =' TRD-FIGI
//  DISPLAY 'TRD-FIGI              =' TRD-FIGI
              logger.info("TRD-FIGI              ={}", new String(methodOut.getTrdFigi())); 
          }
//  cobolCode::SELECT POS_BALANCE FROM TBTRDPOS WHERE POS_CURRENCY = ? AND POS_SAC_NUMBER = ? AND POS_FIGI = ? FOR UPDATE OF POS_BALANCE
//  SELECT POS_BALANCE FROM TBTRDPOS WHERE POS_CURRENCY = ? AND POS_SAC_NUMBER = ? AND POS_FIGI = ? FOR UPDATE OF POS_BALANCE
          programCtx.setPosBookingResultSet(trdpb002Repository.openPosBookingTrdpb002(methodOut.getDcltbtrdpos(),programCtx.getSqlca()));

// *
//  cobolCode::IF SQLCODE NOT = 0 THEN
//  IF SQLCODE NOT = 0 THEN
          if (	( methodOut.getSqlcode() != 0 )) { 
//  cobolCode::SET TRD-SAC-BOOKING-FAILED TO TRUE
//  SET TRD-SAC-BOOKING-FAILED TO TRUE
              methodOut.setTrdSacBookingFailedTrue(); 
              
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  cobolCode::SET DATA-EXCEPTION TO TRUE
//  SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Open POS_BOOKING Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Open POS_BOOKING Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1079101867);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
//cobolCode::GO TO 1000-EXIT
return methodOut;
//cobolCodeEnds::GO TO 1000-EXIT
          }
//  cobolCode::FETCH POS_BOOKING INTO ?
//  FETCH POS_BOOKING INTO ?
          trdpb002Repository.fetchPosBookingTrdpb002(programCtx.getPosBookingResultSet(),methodOut.getDcltbtrdpos(),programCtx.getSqlca());

// *
//  cobolCode::IF SQLCODE = 0 THEN
//  IF SQLCODE = 0 THEN
          if (	( methodOut.getSqlcode() == 0 )) { 
//  cobolCode::IF DEBIT-SELLER
//  IF DEBIT-SELLER
              if ( methodIn.isDebitSeller()  ) { 
//  cobolCode::COMPUTE POS-BALANCE = POS-BALANCE - TRD-ORDER-QTY
                  methodOut.setPosBalance(methodOut.getPosBalance().subtract(methodIn.getTrdOrderQty()));
              }
//  cobolCode::ELSE
//  ELSE
              else { 
//  cobolCode::COMPUTE POS-BALANCE = POS-BALANCE + TRD-ORDER-QTY
                  methodOut.setPosBalance(methodOut.getPosBalance().add(methodIn.getTrdOrderQty()));
              }
//  cobolCode::UPDATE TBTRDPOS SET POS_BALANCE = ? WHERE POS_CURRENCY = ? AND POS_SAC_NUMBER = ? AND POS_FIGI = ?
//  UPDATE TBTRDPOS SET POS_BALANCE = ? WHERE POS_CURRENCY = ? AND POS_SAC_NUMBER = ? AND POS_FIGI = ?
              trdpb002Repository.updateTbtrdpos(methodOut.getDcltbtrdpos(),programCtx.getSqlca());

// *            Where current of pos_booking
//  cobolCode::IF SQLCODE = 0 THEN
//  IF SQLCODE = 0 THEN
              if (	( methodOut.getSqlcode() == 0 )) { 
//  cobolCode::SET TRD-SAC-BOOKING-DONE TO TRUE
//  SET TRD-SAC-BOOKING-DONE TO TRUE
                  methodOut.setTrdSacBookingDoneTrue(); 
                  
              }
//  cobolCode::ELSE
//  ELSE
              else { 
//  cobolCode::SET TRD-SAC-BOOKING-FAILED TO TRUE
//  SET TRD-SAC-BOOKING-FAILED TO TRUE
                  methodOut.setTrdSacBookingFailedTrue(); 
                  
                  // MOVE SQLCODE TO WS-SQLCODE
                  //  FORMAT1016334848 = "----"
                  methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  cobolCode::SET DATA-EXCEPTION TO TRUE
//  SET DATA-EXCEPTION TO TRUE
                  methodOut.setDataExceptionTrue(); 
                  
                  // MOVE SPACES TO WS-EXCEPTION
                  methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Update using POS_BOOKING Cursor failed : ' 'SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Update using POS_BOOKING Cursor failed : ' 'SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_896462048);
                     charArray.add(CONSTANTS.LITERAL_1775499624);
                     charArray.add(methodOut.getSqlcode_Ws());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              }
          }
//  cobolCode::ELSE
//  ELSE
          else { 
//  cobolCode::SET TRD-SAC-BOOKING-FAILED TO TRUE
//  SET TRD-SAC-BOOKING-FAILED TO TRUE
              methodOut.setTrdSacBookingFailedTrue(); 
              
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  cobolCode::SET DATA-EXCEPTION TO TRUE
//  SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::DISPLAY 'SQLCODE = ' WS-SQLCODE
//  DISPLAY 'SQLCODE = ' WS-SQLCODE
              logger.info("SQLCODE = {}", new String(methodOut.getSqlcode_Ws())); 
//  cobolCode::DISPLAY 'POS-CURRENCY   = ' POS-CURRENCY
//  DISPLAY 'POS-CURRENCY   = ' POS-CURRENCY
              logger.info("POS-CURRENCY   = {}", new String(methodOut.getPosCurrency())); 
//  cobolCode::DISPLAY 'POS-SAC-NUMBER = ' POS-SAC-NUMBER
//  DISPLAY 'POS-SAC-NUMBER = ' POS-SAC-NUMBER
              logger.info("POS-SAC-NUMBER = {}", String.valueOf(methodOut.getPosSacNumber())); 
//  cobolCode::DISPLAY 'POS-FIGI       = ' POS-FIGI
//  DISPLAY 'POS-FIGI       = ' POS-FIGI
              logger.info("POS-FIGI       = {}", new String(methodOut.getPosFigi())); 
//  cobolCode::STRING 'Fetch POS_BOOKING Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
//  STRING 'Fetch POS_BOOKING Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_452312193);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
//  cobolCode::CLOSE POS_BOOKING
//  CLOSE POS_BOOKING
          trdpb002Repository.closePosBookingTrdpb002(programCtx.getPosBookingResultSet(),programCtx.getSqlca());
      
      return methodOut;
      }
      /**
      * reportException 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-REPORT-EXCEPTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - exception                      COBOL Name: WS-EXCEPTION
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      *
      * Output :  

      * - exceptionDesc                  COBOL Name: EXCEPTION-DESC
      * - exception                      COBOL Name: WS-EXCEPTION
      * - exceptionRecordLen             COBOL Name: EXCEPTION-RECORD-LEN
      * - exceptionType                  COBOL Name: EXCEPTION-TYPE
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public ReportExceptionOutCtx reportException(ReportExceptionInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int EXCEPTION_LENGTH = 200;
			// End of variable declaration

//Added variable to get the program context in place.
Trdpb002Ctx programCtx = methodIn.getTrdpb002Ctx();
//Added variable to get the output context in place.
ReportExceptionOutCtx methodOut = methodIn.getReportExceptionOutCtx();
//  cobolCode::MOVE WS-EXCEPTION TO EXCEPTION-DESC
//  MOVE WS-EXCEPTION TO EXCEPTION-DESC
          methodOut.setExceptionDesc(pad(1000,methodOut.getException(),SPACE_CHAR,RIGHT_PAD));
//  cobolCode::MOVE LENGTH OF WS-EXCEPTION TO EXCEPTION-RECORD-LEN
//  MOVE LENGTH OF WS-EXCEPTION TO EXCEPTION-RECORD-LEN
          methodOut.setExceptionRecordLen((short) EXCEPTION_LENGTH);
//  cobolCode::EVALUATE TRUE
//  EVALUATE TRUE
          if  ( methodIn.isSystemException()  ) { 
//  cobolCode::MOVE 'SYSTEM' TO EXCEPTION-TYPE
//  MOVE 'SYSTEM' TO EXCEPTION-TYPE
              methodOut.setExceptionType(CONSTANTS.LITERAL_SYSTEM_B14_);
          }
          else if  ( methodIn.isApplException()  ) { 
//  cobolCode::MOVE 'APPLICATION' TO EXCEPTION-TYPE
//  MOVE 'APPLICATION' TO EXCEPTION-TYPE
              methodOut.setExceptionType(CONSTANTS.LITERAL_APPLICATION_B9_);
          }
          else if  ( methodIn.isDataException()  ) { 
//  cobolCode::MOVE 'DATA' TO EXCEPTION-TYPE
//  MOVE 'DATA' TO EXCEPTION-TYPE
              methodOut.setExceptionType(CONSTANTS.LITERAL_DATA_B16_);
          }
//  cobolCode::ADD 46 TO EXCEPTION-RECORD-LEN
//  ADD 46 TO EXCEPTION-RECORD-LEN
          methodOut.setExceptionRecordLen( (short) (methodOut.getExceptionRecordLen()+(short)46));

// *
//  cobolCode::CALL WS-EXCEPTION-HANDLER USING EXCEPTION-RECORD-LEN , EXCEPTION-RECORD
//  CALL WS-EXCEPTION-HANDLER USING EXCEPTION-RECORD-LEN , EXCEPTION-RECORD
          
// *
          // CALL WS-EXCEPTION-HANDLER USING EXCEPTION-RECORD-LEN , EXCEPTION-RECORD
               programCtx.setRc( trdpbexc.call(programCtx.getGlobalCtx().getContext("TRDPBEXC"),methodOut.getExceptionRecordLenGroup(),methodOut.getExceptionRecord()));
          ;
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Trdpb002Ctx programCtx = (Trdpb002Ctx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getTrdOrderPair().set((Field)params[0]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Trdpb002Ctx programCtx = (Trdpb002Ctx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof TrdOrderPair) {
                       	programCtx.setTrdOrderPair((TrdOrderPair) parameters[index]);
                  	} else {
                       	programCtx.getTrdOrderPair().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
      public void setFromTrdpbexc(Trdpb002Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getExceptionRecordLenGroup().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getExceptionRecordLenGroup().setString((char[])params[0] );
         if (len > 1)
         if(params[1] instanceof Field) 
   programCtx.getExceptionRecord().setString(((Field)params[1] ).toCharArray());
 else    programCtx.getExceptionRecord().setString((char[])params[1] );
      }
  
  
  
  
  
  }
