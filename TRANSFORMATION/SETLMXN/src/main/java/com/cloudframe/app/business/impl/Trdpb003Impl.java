package com.cloudframe.app.business.impl;
  /* 
*****************************************************************
*                                                               *
* trdpb002 : money book-keeping program                         *
*                                                               *
*  - settles securities account of buyer/seller by crediting    *
*    seller security account and debiting  buyer security       *
*    account                                                    *
*                                                               *
*****************************************************************
*/
  
import com.cloudframe.app.common.CommonProcess;
import com.cloudframe.app.dto.trdpb003.Trdpb003Ctx.*;
import com.cloudframe.app.dto.trdpb003.Trdpb003Ctx;
import com.cloudframe.app.business.Trdpb003;
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
  import com.cloudframe.app.repository.Trdpb003Repository;
  import com.cloudframe.app.utility.CFUtil;
  import java.util.ArrayList;
  import com.cloudframe.app.data.Field;
  import java.util.Map;
  import java.util.HashMap;
  import java.math.BigDecimal;
import com.cloudframe.app.business.Trdpbexc;
import com.cloudframe.app.business.*;
import com.cloudframe.app.service.*;
  import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.trdpb003.*;
import com.cloudframe.app.dto.trdpb003.TrdOrderPair;
import com.cloudframe.app.dto.trdpb003.Sqlca;
import com.cloudframe.app.dto.trdpb003.ExceptionRecord;
import com.cloudframe.app.dto.trdpb003.ExceptionRecordLenGroup;
import com.cloudframe.app.dto.trdpb003.Dcltbtrdmac;
import com.cloudframe.app.dto.trdpb003.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("trdpb003")
  
  public class Trdpb003Impl extends CommonProcess implements Trdpb003 {
  
  Logger logger = LoggerFactory.getLogger(Trdpb003Impl.class);
  
  
  @Value("${TRDPB003.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("trdpb003Repository")
  Trdpb003Repository trdpb003Repository;
  
  
  
  
  
  
      @Override
      public int setParameter(Trdpb003Ctx programCtx, String trdOrderPair) throws Exception {
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
      public int process(Trdpb003Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("TRDPB003" ,dbQualifier, true/*use Dynamic SQL*/);
//Added variable to get the output context in place.
ProcessInCtx methodIn = programCtx.getProcessInCtx();
//  cobolCode::PERFORM 0000-MAINLINE
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
      public MainlineOutCtx mainline(Trdpb003Ctx programCtx) throws Exception {
//Added variable to get the output context in place.
MainlineOutCtx methodOut = programCtx.getMainlineOutCtx();

// * Set default to booking failed
//  cobolCode::SET TRD-MAC-BOOKING-FAILED TO TRUE
          methodOut.setTrdMacBookingFailedTrue(); 
          
//  cobolCode::SET DEBIT-BUYER TO TRUE
          methodOut.setDebitBuyerTrue(); 
          
//  cobolCode::PERFORM 1000-MAC-BOOKING THRU 1000-EXIT
          macBooking(programCtx.getMacBookingInCtx());/*1000-MAC-BOOKING*/
//  cobolCode::IF TRD-MAC-BOOKING-DONE THEN
          if ( methodOut.isTrdMacBookingDone()  ) { 

// * Reset back to booking failed and attempt crediting seller
//  cobolCode::SET TRD-MAC-BOOKING-FAILED TO TRUE
              methodOut.setTrdMacBookingFailedTrue(); 
              
//  cobolCode::SET CREDIT-SELLER TO TRUE
              methodOut.setCreditSellerTrue(); 
              
//  cobolCode::PERFORM 1000-MAC-BOOKING THRU 1000-EXIT
              macBooking(programCtx.getMacBookingInCtx());/*1000-MAC-BOOKING*/
          }
//  cobolCode::GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * macBooking 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-MAC-BOOKING COBOL Cyclomatic complexity - 13
      * Input  :  

      * - crDbSwtich                     COBOL Name: WS-CR-DB-SWTICH
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - trdSellerMoneyAccNum           COBOL Name: TRD-SELLER-MONEY-ACC-NUM
      * - trdBuyerMoneyAccNum            COBOL Name: TRD-BUYER-MONEY-ACC-NUM
      * - sqlcode                        COBOL Name: SQLCODE
      * - macBalance                     COBOL Name: MAC-BALANCE
      * - trdOrderAmount                 COBOL Name: TRD-ORDER-AMOUNT
      *
      * Output :  

      * - macCurrency                    COBOL Name: MAC-CURRENCY
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - macNumber                      COBOL Name: MAC-NUMBER
      * - trdSellerMoneyAccNum           COBOL Name: TRD-SELLER-MONEY-ACC-NUM
      * - trdBuyerMoneyAccNum            COBOL Name: TRD-BUYER-MONEY-ACC-NUM
      * - trdStatus                      COBOL Name: TRD-STATUS
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      * - exception                      COBOL Name: WS-EXCEPTION
      * - macBalance                     COBOL Name: MAC-BALANCE
      *
      * @throws CFException
      */
      @Override
      public MacBookingOutCtx macBooking(MacBookingInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// *

// *
//Added variable to get the program context in place.
Trdpb003Ctx programCtx = methodIn.getTrdpb003Ctx();
//Added variable to get the output context in place.
MacBookingOutCtx methodOut = methodIn.getMacBookingOutCtx();
//  cobolCode::IF CREDIT-SELLER
          if ( methodIn.isCreditSeller()  ) { 
//  cobolCode::MOVE TRD-CURRENCY TO MAC-CURRENCY
              methodOut.setMacCurrency(methodOut.getTrdCurrency());
//  cobolCode::MOVE TRD-SELLER-MONEY-ACC-NUM TO MAC-NUMBER
              methodOut.setMacNumber(methodOut.getTrdSellerMoneyAccNum());
          }
//  cobolCode::ELSE
          else { 
//  cobolCode::MOVE TRD-CURRENCY TO MAC-CURRENCY
              methodOut.setMacCurrency(methodOut.getTrdCurrency());
//  cobolCode::MOVE TRD-BUYER-MONEY-ACC-NUM TO MAC-NUMBER
              methodOut.setMacNumber(methodOut.getTrdBuyerMoneyAccNum());
          }
//  cobolCode::SELECT MAC_BALANCE FROM TBTRDMAC WHERE MAC_CURRENCY = ? AND MAC_NUMBER = ? FOR UPDATE OF MAC_BALANCE
          programCtx.setMacBookingResultSet(trdpb003Repository.openMacBookingTrdpb003(programCtx.getSqlca(),methodOut.getDcltbtrdmac()));

// *
//  cobolCode::IF SQLCODE NOT = 0 THEN
          if (	( methodOut.getSqlcode() != 0 )) { 
//  cobolCode::SET TRD-MAC-BOOKING-FAILED TO TRUE
              methodOut.setTrdMacBookingFailedTrue(); 
              
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  cobolCode::SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Open MAC_BOOKING Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_676755504);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
//cobolCode::GO TO 1000-EXIT
return methodOut;
//cobolCodeEnds::GO TO 1000-EXIT
          }
//  cobolCode::FETCH MAC_BOOKING INTO ?
          trdpb003Repository.fetchMacBookingTrdpb003(programCtx.getMacBookingResultSet(),programCtx.getSqlca(),methodOut.getDcltbtrdmac());

// *
//  cobolCode::IF SQLCODE = 0 THEN
          if (	( methodOut.getSqlcode() == 0 )) { 
//  cobolCode::IF CREDIT-SELLER
              if ( methodIn.isCreditSeller()  ) { 
//  cobolCode::COMPUTE MAC-BALANCE = MAC-BALANCE + TRD-ORDER-AMOUNT
                  methodOut.setMacBalance(methodOut.getMacBalance().add(methodIn.getTrdOrderAmount()));
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::COMPUTE MAC-BALANCE = MAC-BALANCE - TRD-ORDER-AMOUNT
                  methodOut.setMacBalance(methodOut.getMacBalance().subtract(methodIn.getTrdOrderAmount()));
              }
//  cobolCode::UPDATE TBTRDMAC SET MAC_BALANCE = ? WHERE MAC_CURRENCY = ? AND MAC_NUMBER = ?
              trdpb003Repository.updateTbtrdmac(programCtx.getSqlca(),methodOut.getDcltbtrdmac());

// *            Where current of mac_booking
//  cobolCode::IF SQLCODE = 0 THEN
              if (	( methodOut.getSqlcode() == 0 )) { 
//  cobolCode::SET TRD-MAC-BOOKING-DONE TO TRUE
                  methodOut.setTrdMacBookingDoneTrue(); 
                  
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::SET TRD-MAC-BOOKING-FAILED TO TRUE
                  methodOut.setTrdMacBookingFailedTrue(); 
                  
                  //  FORMAT1016334848 = "----"
                  methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  cobolCode::SET DATA-EXCEPTION TO TRUE
                  methodOut.setDataExceptionTrue(); 
                  
                  methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Update using MAC_BOOKING Cursor failed : ' 'SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_1910377893);
                     charArray.add(CONSTANTS.LITERAL_1775499624);
                     charArray.add(methodOut.getSqlcode_Ws());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              }
          }
//  cobolCode::ELSE
          else { 
//  cobolCode::SET TRD-MAC-BOOKING-FAILED TO TRUE
              methodOut.setTrdMacBookingFailedTrue(); 
              
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  cobolCode::SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Fetch MAC_BOOKING Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_854658556);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
//  cobolCode::CLOSE MAC_BOOKING
          trdpb003Repository.closeMacBookingTrdpb003(programCtx.getMacBookingResultSet(),programCtx.getSqlca());
      
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
Trdpb003Ctx programCtx = methodIn.getTrdpb003Ctx();
//Added variable to get the output context in place.
ReportExceptionOutCtx methodOut = methodIn.getReportExceptionOutCtx();
//  cobolCode::MOVE WS-EXCEPTION TO EXCEPTION-DESC
          methodOut.setExceptionDesc(pad(1000,methodOut.getException(),SPACE_CHAR,RIGHT_PAD));
//  cobolCode::MOVE LENGTH OF WS-EXCEPTION TO EXCEPTION-RECORD-LEN
          methodOut.setExceptionRecordLen((short) EXCEPTION_LENGTH);
//  cobolCode::EVALUATE TRUE
          if  ( methodIn.isSystemException()  ) { 
//  cobolCode::MOVE 'SYSTEM' TO EXCEPTION-TYPE
              methodOut.setExceptionType(CONSTANTS.LITERAL_SYSTEM_B14_);
          }
          else if  ( methodIn.isApplException()  ) { 
//  cobolCode::MOVE 'APPLICATION' TO EXCEPTION-TYPE
              methodOut.setExceptionType(CONSTANTS.LITERAL_APPLICATION_B9_);
          }
          else if  ( methodIn.isDataException()  ) { 
//  cobolCode::MOVE 'DATA' TO EXCEPTION-TYPE
              methodOut.setExceptionType(CONSTANTS.LITERAL_DATA_B16_);
          }
//  cobolCode::ADD 46 TO EXCEPTION-RECORD-LEN
          methodOut.setExceptionRecordLen( (short) (methodOut.getExceptionRecordLen()+(short)46));

// *
//  cobolCode::CALL WS-EXCEPTION-HANDLER USING EXCEPTION-RECORD-LEN , EXCEPTION-RECORD
          
// *
               programCtx.setRc( trdpbexc.call(programCtx.getGlobalCtx().getContext("TRDPBEXC"),methodOut.getExceptionRecordLenGroup(),methodOut.getExceptionRecord()));
          ;
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Trdpb003Ctx programCtx = (Trdpb003Ctx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getTrdOrderPair().set((Field)params[0]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Trdpb003Ctx programCtx = (Trdpb003Ctx) ctx;
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
      
      
      public void setFromTrdpbexc(Trdpb003Ctx programCtx, Object[] params) {
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
