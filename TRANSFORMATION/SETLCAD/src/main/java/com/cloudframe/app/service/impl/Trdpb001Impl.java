package com.cloudframe.app.service.impl;
  /* 
*****************************************************************
*                                                               *
* trdpb001 : order settlement                                   *
*                                                               *
*  - multi-threading of this process is based on running        *
*    multiple batch jobs for settling trades based on           *
*    currency                                                   *
*                                                               *
*****************************************************************
*/
  
import com.cloudframe.app.common.CommonProcess;
import com.cloudframe.app.dto.trdpb001.Trdpb001Ctx.*;
import com.cloudframe.app.dto.trdpb001.Trdpb001Ctx;
import com.cloudframe.app.service.Trdpb001;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import java.util.ArrayList;
  import com.cloudframe.app.data.Field;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.utility.CFUtil;
  import java.util.Calendar;
  import java.util.TimeZone;
  import java.util.Date;
  import org.springframework.beans.factory.annotation.Value;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.repository.Trdpb001Repository;
  import com.cloudframe.app.exception.Terminate;
import com.cloudframe.app.business.Trdpb002;
import com.cloudframe.app.business.*;
import com.cloudframe.app.service.*;
import com.cloudframe.app.business.Trdpb003;
import com.cloudframe.app.business.Trdpbexc;
  import java.math.BigDecimal;
  import java.math.RoundingMode;
  import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.trdpb001.*;
import com.cloudframe.app.dto.trdpb001.Dcltbtrdord;
import com.cloudframe.app.dto.trdpb001.Sqlca;
import com.cloudframe.app.dto.trdpb001.Parm;
import com.cloudframe.app.dto.trdpb001.ExceptionRecordLenGroup;
import com.cloudframe.app.dto.trdpb001.TrdOrderPair;
import com.cloudframe.app.dto.trdpb001.CustomerSummaryRec;
import com.cloudframe.app.dto.trdpb001.Dcltbtrdlog;
import com.cloudframe.app.dto.trdpb001.Dcltbtrdmac;
import com.cloudframe.app.dto.trdpb001.ExceptionRecord;
import com.cloudframe.app.dto.trdpb001.Dcltbtrdstq;
import com.cloudframe.app.dto.trdpb001.Dcltbtrdsum;
import com.cloudframe.app.dto.trdpb001.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("trdpb001")
  
  public class Trdpb001Impl extends CommonProcess implements Trdpb001 {
  
  Logger logger = LoggerFactory.getLogger(Trdpb001Impl.class);
  
  
  @Value("${timeZoneId:Etc/GMT}")
  private String timeZoneId;
  @Value("${TRDPB001.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("trdpb001Repository")
  Trdpb001Repository trdpb001Repository;
  @Autowired 
  @Qualifier("trdpb002")
  Trdpb002 trdpb002;
  @Autowired 
  @Qualifier("trdpb003")
  Trdpb003 trdpb003;
  
  
  
  
  
  
      @Override
      public int setParameter(Trdpb001Ctx programCtx, String parm) throws Exception {
      		if(parm != null)
      		    programCtx.getParm().setString(com.cloudframe.app.data.Field.getParm(parm),new String(CONSTANTS.EBCDIC_ENCODING));
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
      public int process(Trdpb001Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("TRDPB001" ,dbQualifier, true/*use Dynamic SQL*/);
//Added variable to get the output context in place.
ProcessInCtx methodIn = programCtx.getProcessInCtx();
//  cobolCode::PERFORM 0000-MAINLINE
          mainline(programCtx.getMainlineInCtx());/*0000-MAINLINE*/
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
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 20
      * Input  :  

      * - currency                       COBOL Name: LK-CURRENCY
      * - chkpFrequency                  COBOL Name: LK-CHKP-FREQUENCY
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - excpType                       COBOL Name: WS-EXCP-TYPE
      * - exception                      COBOL Name: WS-EXCEPTION
      * - chkpFrequency                  COBOL Name: LK-CHKP-FREQUENCY
      * - dcltbtrdlog                    COBOL Name: DCLTBTRDLOG
      * - logTransaction                 COBOL Name: LOG-TRANSACTION
      * - logCurrency                    COBOL Name: LOG-CURRENCY
      * - currency                       COBOL Name: LK-CURRENCY
      * - currdate                       COBOL Name: WS-CURRDATE
      * - currtime                       COBOL Name: WS-CURRTIME
      * - logStartTs                     COBOL Name: LOG-START-TS
      * - stqCurrency                    COBOL Name: STQ-CURRENCY
      * - settlementSwitch               COBOL Name: WS-SETTLEMENT-SWITCH
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - tradeCount                     COBOL Name: WS-TRADE-COUNT
      * - logEndTs                       COBOL Name: LOG-END-TS
      *
      * @throws CFException
      */
      @Override
      public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

//Added variable to get the program context in place.
Trdpb001Ctx programCtx = methodIn.getTrdpb001Ctx();
//Added variable to get the output context in place.
MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();

// * Validate currency
//  cobolCode::IF VALID-CURRENCY THEN
//  cobolCode::ELSE
          if (!(methodIn.isValidCurrency()) ) { 
//  cobolCode::SET SYSTEM-EXCEPTION TO TRUE
              methodOut.setSystemExceptionTrue(); 
              
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING LK-CURRENCY ' : ' 'Currency parameter passed is invalid' DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(methodOut.getCurrency());
                 charArray.add(CONSTANTS.LITERAL_B2_CL_);
                 charArray.add(CONSTANTS.LITERAL_1198002197);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }

// * Default chkpt frequency is 100
//  cobolCode::IF LK-CHKP-FREQUENCY < 100 THEN
          if (	( methodOut.getChkpFrequency() < 100 )) { 
              methodOut.setChkpFrequency(100);
          }

// *
// * Log start timestamp
//  cobolCode::INITIALIZE DCLTBTRDLOG
          methodOut.getDcltbtrdlog().initialize();
//  cobolCode::MOVE 'SETTLEMENT' TO LOG-TRANSACTION
//  LITERAL_SETTLEMENT = 'SETTLEMENT'
          methodOut.setLogTransaction(CONSTANTS.LITERAL_SETTLEMENT);
//  cobolCode::MOVE LK-CURRENCY TO LOG-CURRENCY
          methodOut.setLogCurrency(methodOut.getCurrency());
//  cobolCode::ACCEPT WS-CURRDATE FROM DATE YYYYMMDD
          methodOut.setCurrdate(CFUtil.getCurrentDateStr("YYYYMMDD")); 
//  cobolCode::ACCEPT WS-CURRTIME FROM TIME
          methodOut.setCurrtime(getCurrentTimeString()); 
//  cobolCode::MOVE SPACES TO LOG-START-TS
          methodOut.setLogStartTs(CONSTANTS.SPACE_26);
//  cobolCode::STRING WS-CURRDATE (1 : 4) '-' WS-CURRDATE (5 : 2) '-' WS-CURRDATE (7 : 2) ' ' WS-CURRTIME (1 : 2) ':' WS-CURRTIME (3 : 2) ':' WS-CURRTIME (5 : 2) DELIMITED BY SIZE INTO LOG-START-TS END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(substring(methodOut.getCurrdate(),0,4));
             charArray.add(CONSTANTS.LITERAL_MN_);
             charArray.add(substring(methodOut.getCurrdate(),4,6));
             charArray.add(CONSTANTS.LITERAL_MN_);
             charArray.add(substring(methodOut.getCurrdate(),6,8));
             charArray.add(CONSTANTS.SPACE);
             charArray.add(substring(methodOut.getCurrtime(),0,2));
             charArray.add(CONSTANTS.LITERAL_CL_);
             charArray.add(substring(methodOut.getCurrtime(),2,4));
             charArray.add(CONSTANTS.LITERAL_CL_);
             charArray.add(substring(methodOut.getCurrtime(),4,6));
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5),charArray.get(6),charArray.get(7),charArray.get(8),charArray.get(9),charArray.get(10));
          updated = updateString(methodOut.getLogStartTs() ,joinCharArray);
          methodOut.setLogStartTs(  (char[])updated.get("string"));

// *
// *    If sqlcode not = 0 then
// *       move sqlcode to ws-sqlcode
// *       set appl-exception to true
// *       move spaces to ws-exception
// *       string
// *          'log set start timestamp failed : sqlcode = '
// *          ws-sqlcode
// *          delimited by size
// *         into ws-exception
// *       end-string
// *       perform 9000-report-exception
// *          thru 9000-exit
// *    end-if
// *
//  cobolCode::MOVE LK-CURRENCY TO STQ-CURRENCY
          methodOut.setStqCurrency(methodOut.getCurrency());
//  cobolCode::SET 88-CONTINUE-SETTLEMENT TO TRUE
          methodOut.setContinueSettlement88True(); 
          
//  cobolCode::SELECT STQ_ID , STQ_TRADE_DATA FROM TBTRDSTQ WHERE STQ_CURRENCY = ? ORDER BY STQ_CURRENCY ASC , STQ_ID ASC
          programCtx.setSettlementQueueResultSet(trdpb001Repository.openSettlementQueueTrdpb001(programCtx.getSqlca(),methodIn.getDcltbtrdstq()));

// *
//  cobolCode::IF SQLCODE NOT = 0 THEN
          if (	( methodOut.getSqlcode() != 0 )) { 
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  cobolCode::SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Open SETTLEMENT_QUEUE Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_380627626);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }

// *

// *
//  cobolCode::MOVE 0 TO WS-TRADE-COUNT
          methodOut.setTradeCount(0);
//  cobolCode::PERFORM 1000-TRADE-SETTLEMENT THRU 1000-EXIT UNTIL 88-STOP-SETTLEMENT
          while (!(methodOut.isStopSettlement88()) ) {
             tradeSettlement(programCtx.getTradeSettlementInCtx());/*1000-TRADE-SETTLEMENT*/
          }
//  cobolCode::ACCEPT WS-CURRDATE FROM DATE YYYYMMDD
          methodOut.setCurrdate(CFUtil.getCurrentDateStr("YYYYMMDD")); 
//  cobolCode::ACCEPT WS-CURRTIME FROM TIME
          methodOut.setCurrtime(getCurrentTimeString()); 
//  cobolCode::MOVE SPACES TO LOG-END-TS
          methodOut.setLogEndTs(CONSTANTS.SPACE_26);
//  cobolCode::STRING WS-CURRDATE (1 : 4) '-' WS-CURRDATE (5 : 2) '-' WS-CURRDATE (7 : 2) ' ' WS-CURRTIME (1 : 2) ':' WS-CURRTIME (3 : 2) ':' WS-CURRTIME (5 : 2) DELIMITED BY SIZE INTO LOG-END-TS END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(substring(methodOut.getCurrdate(),0,4));
             charArray.add(CONSTANTS.LITERAL_MN_);
             charArray.add(substring(methodOut.getCurrdate(),4,6));
             charArray.add(CONSTANTS.LITERAL_MN_);
             charArray.add(substring(methodOut.getCurrdate(),6,8));
             charArray.add(CONSTANTS.SPACE);
             charArray.add(substring(methodOut.getCurrtime(),0,2));
             charArray.add(CONSTANTS.LITERAL_CL_);
             charArray.add(substring(methodOut.getCurrtime(),2,4));
             charArray.add(CONSTANTS.LITERAL_CL_);
             charArray.add(substring(methodOut.getCurrtime(),4,6));
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5),charArray.get(6),charArray.get(7),charArray.get(8),charArray.get(9),charArray.get(10));
          updated = updateString(methodOut.getLogEndTs() ,joinCharArray);
          methodOut.setLogEndTs(  (char[])updated.get("string"));
//  cobolCode::INSERT INTO TBTRDLOG VALUES ( ? , ? , ? , ? )
          trdpb001Repository.insert(methodOut.getDcltbtrdlog(),programCtx.getSqlca());
//  cobolCode::EVALUATE TRUE
          if  (	( methodOut.getSqlcode() == 0 )) { 
              ;
          }
          else if  (	( methodOut.getSqlcode() == -803 )) { 
//  cobolCode::UPDATE TBTRDLOG SET LOG_END_TS = ? WHERE LOG_TRANSACTION = ? AND LOG_CURRENCY = ?
              trdpb001Repository.updateTbtrdlog1(methodOut.getDcltbtrdlog(),programCtx.getSqlca());
//  cobolCode::IF SQLCODE NOT = 0 THEN
              if (	( methodOut.getSqlcode() != 0 )) { 
                  //  FORMAT1016334848 = "----"
                  methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  cobolCode::SET APPL-EXCEPTION TO TRUE
                  methodOut.setApplExceptionTrue(); 
                  
                  methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'LOG Update Failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_447191562);
                     charArray.add(methodOut.getSqlcode_Ws());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              }
          }
          else   { 
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  cobolCode::SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'LOG Insert Failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1668654618);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
//  cobolCode::COMMIT
          try {
          	// COMMIT
          	// reset SQLCODE
          	methodOut.setSqlcode(0);
             // execute jdbc commit
             db2Base.commit();
          }
           catch (SQLException e) {
                     methodOut.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
                 }
           catch(Exception e) {
             handleErrorCode(e);
          }

// *
//  cobolCode::GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * tradeSettlement 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-TRADE-SETTLEMENT COBOL Cyclomatic complexity - 4
      * Input  :  

      * - tradeCount                     COBOL Name: WS-TRADE-COUNT
      * - settlementSwitch               COBOL Name: WS-SETTLEMENT-SWITCH
      * - chkpFrequency                  COBOL Name: LK-CHKP-FREQUENCY
      *
      * Output :  

      * - tradeCount                     COBOL Name: WS-TRADE-COUNT
      *
      * @throws CFException
      */
      @Override
      public TradeSettlementOutCtx tradeSettlement(TradeSettlementInCtx methodIn) throws Exception {
      
// *

// *

// *
//Added variable to get the program context in place.
Trdpb001Ctx programCtx = methodIn.getTrdpb001Ctx();
//Added variable to get the output context in place.
TradeSettlementOutCtx methodOut = methodIn.getTradeSettlementOutCtx();
//  cobolCode::ADD 1 TO WS-TRADE-COUNT
          methodOut.setTradeCount(methodOut.getTradeCount()+1);
//  cobolCode::PERFORM 5000-READ-FROM-STLMT-QUEUE THRU 5000-EXIT
          readFromStlmtQueue(programCtx.getReadFromStlmtQueueInCtx());/*5000-READ-FROM-STLMT-QUEUE*/

// *
//  cobolCode::IF 88-CONTINUE-SETTLEMENT
          if ( methodIn.isContinueSettlement88()  ) { 
//  cobolCode::PERFORM 2000-ACCOUNTING THRU 2000-EXIT
              accounting(programCtx.getAccountingInCtx());/*2000-ACCOUNTING*/

// *
//  cobolCode::IF WS-TRADE-COUNT >= LK-CHKP-FREQUENCY
              if (	( methodOut.getTradeCount() >= methodIn.getChkpFrequency() )) { 
//  cobolCode::COMMIT
                  try {
                  	// COMMIT
                  	// reset SQLCODE
                  	methodOut.setSqlcode(0);
                     // execute jdbc commit
                     db2Base.commit();
                  }
                   catch (SQLException e) {
                             methodOut.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
                         }
                   catch(Exception e) {
                     handleErrorCode(e);
                  }
//  cobolCode::MOVE 0 TO WS-TRADE-COUNT
                  methodOut.setTradeCount(0);
              }
          }
      
      return methodOut;
      }
      /**
      * accounting 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-ACCOUNTING COBOL Cyclomatic complexity - 3
      * Input  :  

      * - trdStatus                      COBOL Name: TRD-STATUS
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - trdExchange                    COBOL Name: TRD-EXCHANGE
      * - trdOrderId                     COBOL Name: TRD-ORDER-ID
      * - trdFigi                        COBOL Name: TRD-FIGI
      *
      * Output :  

      * - orderStatus                    COBOL Name: WS-ORDER-STATUS
      * - ordStatus                      COBOL Name: ORD-STATUS
      * - ordCurrency                    COBOL Name: ORD-CURRENCY
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - ordTradingXchng                COBOL Name: ORD-TRADING-XCHNG
      * - trdExchange                    COBOL Name: TRD-EXCHANGE
      * - ordTradeid                     COBOL Name: ORD-TRADEID
      * - trdOrderId                     COBOL Name: TRD-ORDER-ID
      * - ordFigi                        COBOL Name: ORD-FIGI
      * - trdFigi                        COBOL Name: TRD-FIGI
      * - ordBuySellInd                  COBOL Name: ORD-BUY-SELL-IND
      *
      * @throws CFException
      */
      @Override
      public AccountingOutCtx accounting(AccountingInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
Trdpb001Ctx programCtx = methodIn.getTrdpb001Ctx();
//Added variable to get the output context in place.
AccountingOutCtx methodOut = methodIn.getAccountingOutCtx();
//  cobolCode::PERFORM 2001-SAC-BOOKING THRU 2001-EXIT
          sacBooking(programCtx.getSacBookingInCtx());/*2001-SAC-BOOKING*/

// *
//  cobolCode::IF TRD-SAC-BOOKING-DONE
          if ( methodIn.isTrdSacBookingDone()  ) { 
//  cobolCode::PERFORM 2002-MAC-BOOKING THRU 2002-EXIT
              macBooking(programCtx.getMacBookingInCtx());/*2002-MAC-BOOKING*/
          }

// *

// * Update buyer/seller order status to settled
//  cobolCode::IF TRD-MAC-BOOKING-DONE
          if ( methodIn.isTrdMacBookingDone()  ) { 
//  cobolCode::SET SETTLED TO TRUE
              methodOut.setSettledTrue(); 
              
          }
//  cobolCode::ELSE
          else { 

// * Update buyer/seller order status to rejected
//  cobolCode::SET REJECTED TO TRUE
              methodOut.setRejectedTrue(); 
              
          }
//  cobolCode::MOVE WS-ORDER-STATUS TO ORD-STATUS
          methodOut.setOrdStatus(methodOut.getOrderStatus());
//  cobolCode::MOVE TRD-CURRENCY TO ORD-CURRENCY
          methodOut.setOrdCurrency(methodOut.getTrdCurrency());
//  cobolCode::MOVE TRD-EXCHANGE TO ORD-TRADING-XCHNG
          methodOut.setOrdTradingXchng(methodOut.getTrdExchange());
//  cobolCode::MOVE TRD-ORDER-ID TO ORD-TRADEID
          methodOut.setOrdTradeid(methodOut.getTrdOrderId());
//  cobolCode::MOVE TRD-FIGI TO ORD-FIGI
          methodOut.setOrdFigi(methodOut.getTrdFigi());
//  cobolCode::MOVE 'B' TO ORD-BUY-SELL-IND
//  LITERAL_B = 'B'
          methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_B);
//  cobolCode::PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
          updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/

// *
//  cobolCode::MOVE 'S' TO ORD-BUY-SELL-IND
//  LITERAL_S = 'S'
          methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_S);
//  cobolCode::PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
          updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
          ;
      
      return methodOut;
      }
      /**
      * sacBooking 
      *   This method is derived from 
  *   COBOL Paragraph - 2001-SAC-BOOKING COBOL Cyclomatic complexity - 3
      * Input  :  

      * - trdStatus                      COBOL Name: TRD-STATUS
      * - trdOrderId                     COBOL Name: TRD-ORDER-ID
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      * - tradeid                        COBOL Name: WS-TRADEID
      * - trdOrderId                     COBOL Name: TRD-ORDER-ID
      * - exception                      COBOL Name: WS-EXCEPTION
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

//Added variable to get the program context in place.
Trdpb001Ctx programCtx = methodIn.getTrdpb001Ctx();
//Added variable to get the output context in place.
SacBookingOutCtx methodOut = methodIn.getSacBookingOutCtx();
//  cobolCode::CALL WS-SAC-BOOKING USING TRD-ORDER-PAIR END-CALL
               programCtx.setRc( trdpb002.call(programCtx.getGlobalCtx().getContext("TRDPB002"),methodOut.getTrdOrderPair()));

// *
//  cobolCode::IF TRD-SAC-BOOKING-DONE
//  cobolCode::ELSE
          if (!(methodIn.isTrdSacBookingDone()) ) { 
//  cobolCode::SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              methodOut.setTradeid(padLeftZeros(9,methodOut.getTrdOrderId(),false));
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'TradeId = ' WS-TRADEID ' : ' 'Rejected - Reason : Security Bookings Failed' DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_869114500);
                 charArray.add(String.valueOf(methodOut.getTradeidString()).toCharArray());
                 charArray.add(CONSTANTS.LITERAL_B2_CL_);
                 charArray.add(CONSTANTS.LITERAL_1893084304);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
          ;
      
      return methodOut;
      }
      /**
      * macBooking 
      *   This method is derived from 
  *   COBOL Paragraph - 2002-MAC-BOOKING COBOL Cyclomatic complexity - 3
      * Input  :  

      * - trdStatus                      COBOL Name: TRD-STATUS
      * - trdOrderId                     COBOL Name: TRD-ORDER-ID
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      * - tradeid                        COBOL Name: WS-TRADEID
      * - trdOrderId                     COBOL Name: TRD-ORDER-ID
      * - exception                      COBOL Name: WS-EXCEPTION
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

//Added variable to get the program context in place.
Trdpb001Ctx programCtx = methodIn.getTrdpb001Ctx();
//Added variable to get the output context in place.
MacBookingOutCtx methodOut = methodIn.getMacBookingOutCtx();
//  cobolCode::CALL WS-MAC-BOOKING USING TRD-ORDER-PAIR END-CALL
               programCtx.setRc( trdpb003.call(programCtx.getGlobalCtx().getContext("TRDPB003"),methodOut.getTrdOrderPair()));

// *
//  cobolCode::IF TRD-MAC-BOOKING-DONE
//  cobolCode::ELSE
          if (!(methodIn.isTrdMacBookingDone()) ) { 
//  cobolCode::SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              methodOut.setTradeid(padLeftZeros(9,methodOut.getTrdOrderId(),false));
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'TradeId = ' WS-TRADEID ' : ' 'Rejected - Reason : Money Bookings Failed' DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_869114500);
                 charArray.add(String.valueOf(methodOut.getTradeidString()).toCharArray());
                 charArray.add(CONSTANTS.LITERAL_B2_CL_);
                 charArray.add(CONSTANTS.LITERAL_658084946);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
          ;
      
      return methodOut;
      }
      /**
      * readFromStlmtQueue 
      *   This method is derived from 
  *   COBOL Paragraph - 5000-READ-FROM-STLMT-QUEUE COBOL Cyclomatic complexity - 9
      * Input  :  

      * - stqTradeData                   COBOL Name: STQ-TRADE-DATA
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - trdOrderPair                   COBOL Name: TRD-ORDER-PAIR
      * - stqTradeData                   COBOL Name: STQ-TRADE-DATA
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      * - exception                      COBOL Name: WS-EXCEPTION
      * - settlementSwitch               COBOL Name: WS-SETTLEMENT-SWITCH
      *
      * @throws CFException
      */
      @Override
      public ReadFromStlmtQueueOutCtx readFromStlmtQueue(ReadFromStlmtQueueInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

//Added variable to get the program context in place.
Trdpb001Ctx programCtx = methodIn.getTrdpb001Ctx();
//Added variable to get the output context in place.
ReadFromStlmtQueueOutCtx methodOut = methodIn.getReadFromStlmtQueueOutCtx();
//  cobolCode::FETCH SETTLEMENT_QUEUE INTO ? , ?
          trdpb001Repository.fetchSettlementQueueTrdpb001(programCtx.getSettlementQueueResultSet(),programCtx.getSqlca(),methodOut.getDcltbtrdstq());

// *
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::MOVE STQ-TRADE-DATA TO TRD-ORDER-PAIR
              methodOut.getTrdOrderPair().setString(methodOut.getStqTradeData());
//  cobolCode::DELETE FROM TBTRDSTQ WHERE STQ_CURRENCY = ? AND STQ_ID = ?
              trdpb001Repository.deleteTbtrdstq1(programCtx.getSqlca(),methodOut.getDcltbtrdstq());
//  cobolCode::IF SQLCODE NOT = 0 THEN
              if (	( methodOut.getSqlcode() != 0 )) { 
                  //  FORMAT1016334848 = "----"
                  methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  cobolCode::SET APPL-EXCEPTION TO TRUE
                  methodOut.setApplExceptionTrue(); 
                  
                  methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Delete on TBTRDSTQ failed : ' 'SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_Delete_B5_onTBTRDSTQfailedCL_);
                     charArray.add(CONSTANTS.LITERAL_1775499624);
                     charArray.add(methodOut.getSqlcode_Ws());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              }
          break;
          	case 100:
//  cobolCode::SET 88-STOP-SETTLEMENT TO TRUE
              methodOut.setStopSettlement88True(); 
              
          break;
          default :
//  cobolCode::SET 88-STOP-SETTLEMENT TO TRUE
              methodOut.setStopSettlement88True(); 
              
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  cobolCode::SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Fetch SETTLEMENT_QUEUE Cursor failed : ' 'SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1099744550);
                 charArray.add(CONSTANTS.LITERAL_1775499624);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
      
      return methodOut;
      }
      /**
      * updateOrder 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-UPDATE-ORDER COBOL Cyclomatic complexity - 11
      * Input  :  

      * - ordStatus                      COBOL Name: ORD-STATUS
      * - ordBuySellInd                  COBOL Name: ORD-BUY-SELL-IND
      * - trdBuyerId                     COBOL Name: TRD-BUYER-ID
      * - trdSellerId                    COBOL Name: TRD-SELLER-ID
      *
      * Output :  

      * - retrySwitch                    COBOL Name: WS-RETRY-SWITCH
      * - sqlcode                        COBOL Name: SQLCODE
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      * - exception                      COBOL Name: WS-EXCEPTION
      * - orderStatus                    COBOL Name: WS-ORDER-STATUS
      * - ordStatus                      COBOL Name: ORD-STATUS
      * - customerSummaryRec             COBOL Name: WS-CUSTOMER-SUMMARY-REC
      * - summaryDebitCreditSw           COBOL Name: WS-SUMMARY-DEBIT-CREDIT-SW
      * - summaryCustomerId              COBOL Name: WS-SUMMARY-CUSTOMER-ID
      * - trdBuyerId                     COBOL Name: TRD-BUYER-ID
      * - trdSellerId                    COBOL Name: TRD-SELLER-ID
      *
      * @throws CFException
      */
      @Override
      public UpdateOrderOutCtx updateOrder(UpdateOrderInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

//Added variable to get the program context in place.
Trdpb001Ctx programCtx = methodIn.getTrdpb001Ctx();
//Added variable to get the output context in place.
UpdateOrderOutCtx methodOut = methodIn.getUpdateOrderOutCtx();
//  cobolCode::SET DO-SQL TO TRUE
          methodOut.setDoSqlTrue(); 
          
//  cobolCode::PERFORM UNTIL SQL-DONE
          while ((!(methodOut.isSqlDone()) )) {
              methodOut.setSqlcode(0);
//  cobolCode::UPDATE TBTRDORD SET ORD_STATUS = ? WHERE ORD_CURRENCY = ? AND ORD_TRADING_XCHNG = ? AND ORD_TRADEID = ? AND ORD_FIGI = ? AND ORD_BUY_SELL_IND = ?
              trdpb001Repository.updateTbtrdord(methodIn.getDcltbtrdord(),programCtx.getSqlca());
//  cobolCode::IF SQLCODE = -911 OR -913 THEN
              if (	( methodOut.getSqlcode() == -911 ) || 	( methodOut.getSqlcode() == -913 )) { 
//  cobolCode::SET RETRY-SQL TO TRUE
                  methodOut.setRetrySqlTrue(); 
                  
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::SET SQL-DONE TO TRUE
                  methodOut.setSqlDoneTrue(); 
                  
              }
          }
//  cobolCode::IF SQLCODE NOT = 0 THEN
          if (	( methodOut.getSqlcode() != 0 )) { 
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  cobolCode::SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Update of Order failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_973364791);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
//  cobolCode::MOVE ORD-STATUS TO WS-ORDER-STATUS
          methodOut.setOrderStatus(methodOut.getOrdStatus());
//  cobolCode::IF REJECTED OR SETTLED
          if ( methodOut.isRejected()   ||  methodOut.isSettled()  ) { 
//  cobolCode::INITIALIZE WS-CUSTOMER-SUMMARY-REC
              methodOut.getCustomerSummaryRec().initialize();
//  cobolCode::IF REJECTED
              if ( methodOut.isRejected()  ) { 
//  cobolCode::SET 88-SUMMARY-NO-BOOKING TO TRUE
                  methodOut.setSummaryNoBooking88True(); 
                  
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::IF ORD-BUY-SELL-IND = 'B' THEN
//  LITERAL_B = 'B'
                  if (compareChars(methodIn.getOrdBuySellInd(), CONSTANTS.LITERAL_B) == 0) { 
//  cobolCode::MOVE TRD-BUYER-ID TO WS-SUMMARY-CUSTOMER-ID
                      methodOut.setSummaryCustomerId(methodOut.getTrdBuyerId());
//  cobolCode::SET 88-SUMMARY-DEBIT TO TRUE
                      methodOut.setSummaryDebit88True(); 
                      
                  }
//  cobolCode::ELSE
                  else { 
//  cobolCode::MOVE TRD-SELLER-ID TO WS-SUMMARY-CUSTOMER-ID
                      methodOut.setSummaryCustomerId(methodOut.getTrdSellerId());
//  cobolCode::SET 88-SUMMARY-CREDIT TO TRUE
                      methodOut.setSummaryCredit88True(); 
                      
                  }
              }
//  cobolCode::PERFORM 8001-LOG-SUMMARY THRU 8001-EXIT
              logSummary(programCtx.getLogSummaryInCtx());/*8001-LOG-SUMMARY*/
          }
      
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
Trdpb001Ctx programCtx = methodIn.getTrdpb001Ctx();
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
      /**
      * logSummary 
      *   This method is derived from 
  *   COBOL Paragraph - 8001-LOG-SUMMARY COBOL Cyclomatic complexity - 30
      * Input  :  

      * - summaryCustomerId              COBOL Name: WS-SUMMARY-CUSTOMER-ID
      * - sqlcode                        COBOL Name: SQLCODE
      * - dcltbtrdsum                    COBOL Name: DCLTBTRDSUM
      * - summaryDebitCreditSw           COBOL Name: WS-SUMMARY-DEBIT-CREDIT-SW
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - trdBuyerId                     COBOL Name: TRD-BUYER-ID
      * - trdBuyerMoneyAccNum            COBOL Name: TRD-BUYER-MONEY-ACC-NUM
      * - trdSellerMoneyAccNum           COBOL Name: TRD-SELLER-MONEY-ACC-NUM
      * - macBalance                     COBOL Name: MAC-BALANCE
      * - trdOrderAmount                 COBOL Name: TRD-ORDER-AMOUNT
      * - orderStatus                    COBOL Name: WS-ORDER-STATUS
      *
      * Output :  

      * - sumCustomerId                  COBOL Name: SUM-CUSTOMER-ID
      * - summaryCustomerId              COBOL Name: WS-SUMMARY-CUSTOMER-ID
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      * - exception                      COBOL Name: WS-EXCEPTION
      * - customerSummaryWriteSw         COBOL Name: WS-CUSTOMER-SUMMARY-WRITE-SW
      * - sumOverdue                     COBOL Name: SUM-OVERDUE
      * - sumRejected                    COBOL Name: SUM-REJECTED
      * - sumSettled                     COBOL Name: SUM-SETTLED
      * - sumCurrency                    COBOL Name: SUM-CURRENCY
      * - sumOpenBalance                 COBOL Name: SUM-OPEN-BALANCE
      * - sumTotalDebit                  COBOL Name: SUM-TOTAL-DEBIT
      * - sumTotalCredit                 COBOL Name: SUM-TOTAL-CREDIT
      * - sumCloseBalance                COBOL Name: SUM-CLOSE-BALANCE
      * - customerSummaryRec             COBOL Name: WS-CUSTOMER-SUMMARY-REC
      * - dcltbtrdsum                    COBOL Name: DCLTBTRDSUM
      * - macCurrency                    COBOL Name: MAC-CURRENCY
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - macNumber                      COBOL Name: MAC-NUMBER
      * - trdBuyerMoneyAccNum            COBOL Name: TRD-BUYER-MONEY-ACC-NUM
      * - trdSellerMoneyAccNum           COBOL Name: TRD-SELLER-MONEY-ACC-NUM
      *
      * @throws CFException
      */
      @Override
      public LogSummaryOutCtx logSummary(LogSummaryInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			BigDecimal tempDecimal = BigDecimal.ZERO;
			// End of variable declaration

//Added variable to get the program context in place.
Trdpb001Ctx programCtx = methodIn.getTrdpb001Ctx();
//Added variable to get the output context in place.
LogSummaryOutCtx methodOut = methodIn.getLogSummaryOutCtx();

// *
// * Check if customer summary row exits
// *
//  cobolCode::MOVE WS-SUMMARY-CUSTOMER-ID TO SUM-CUSTOMER-ID
          methodOut.setSumCustomerId(methodOut.getSummaryCustomerId());
//  cobolCode::SELECT SUM_CUSTOMER_ID , SUM_OVERDUE , SUM_REJECTED , SUM_SETTLED , SUM_CURRENCY , SUM_OPEN_BALANCE , SUM_TOTAL_DEBIT , SUM_TOTAL_CREDIT , SUM_CLOSE_BALANCE FROM TBTRDSUM WHERE SUM_CUSTOMER_ID = ? FOR UPDATE OF SUM_OVERDUE , SUM_REJECTED , SUM_SETTLED , SUM_CURRENCY , SUM_OPEN_BALANCE , SUM_TOTAL_DEBIT , SUM_TOTAL_CREDIT , SUM_CLOSE_BALANCE
          programCtx.setSummaryCsrResultSet(trdpb001Repository.openSummaryCsrTrdpb001(methodOut.getDcltbtrdsum(),programCtx.getSqlca()));
//  cobolCode::IF SQLCODE NOT = 0 THEN
          if (	( methodOut.getSqlcode() != 0 )) { 
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  cobolCode::SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Summary Cursor OPEN Failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_882352633);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
//  cobolCode::FETCH SUMMARY_CSR INTO ? , ? , ? , ? , ? , ? , ? , ? , ?
          trdpb001Repository.fetchSummaryCsrTrdpb001(programCtx.getSummaryCsrResultSet(),methodOut.getDcltbtrdsum(),programCtx.getSqlca());
//  cobolCode::IF SQLCODE = 0 OR 100 THEN
//  cobolCode::ELSE
          if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != 100 )) { 
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  cobolCode::SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Summary Cursor OPEN Failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_882352633);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
//  cobolCode::IF SQLCODE = 100 THEN
          if (	( methodOut.getSqlcode() == 100 )) { 
//  cobolCode::SET 88-CUSTOMER-SUMMARY-WRITE TO TRUE
              methodOut.setCustomerSummaryWrite88True(); 
              
//  cobolCode::MOVE ZERO TO SUM-OVERDUE SUM-REJECTED SUM-SETTLED SUM-CURRENCY SUM-OPEN-BALANCE SUM-TOTAL-DEBIT SUM-TOTAL-CREDIT SUM-CLOSE-BALANCE
              methodOut.setSumOverdue(0);
              methodOut.setSumRejected(0);
              methodOut.setSumSettled(0);
              methodOut.setSumCurrency(CONSTANTS.ZERO_3);
              methodOut.setSumOpenBalance(BigDecimal.ZERO);
              methodOut.setSumTotalDebit(BigDecimal.ZERO);
              methodOut.setSumTotalCredit(BigDecimal.ZERO);
              methodOut.setSumCloseBalance(BigDecimal.ZERO);
          }
//  cobolCode::ELSE
          else { 
//  cobolCode::SET 88-CUSTOMER-SUMMARY-REWRITE TO TRUE
              methodOut.setCustomerSummaryRewrite88True(); 
              
              methodOut.getCustomerSummaryRec().setString(methodOut.getDcltbtrdsum().getCharArray());
          }

// *
//  cobolCode::IF ( 88-SUMMARY-DEBIT OR 88-SUMMARY-CREDIT ) AND SUM-OPEN-BALANCE = 0 THEN
          if (( methodIn.isSummaryDebit88()   ||  methodIn.isSummaryCredit88()  ) && 	( methodOut.getSumOpenBalance().compareTo(BigDecimal.valueOf(0)) == 0)) { 
//  cobolCode::MOVE TRD-CURRENCY TO MAC-CURRENCY
              methodOut.setMacCurrency(methodOut.getTrdCurrency());
//  cobolCode::IF TRD-BUYER-ID = SUM-CUSTOMER-ID
              if (		compareChars(methodIn.getTrdBuyerId(),methodOut.getSumCustomerId()) == 0 ) { 
//  cobolCode::MOVE TRD-BUYER-MONEY-ACC-NUM TO MAC-NUMBER
                  methodOut.setMacNumber(methodOut.getTrdBuyerMoneyAccNum());
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::MOVE TRD-SELLER-MONEY-ACC-NUM TO MAC-NUMBER
                  methodOut.setMacNumber(methodOut.getTrdSellerMoneyAccNum());
              }
//  cobolCode::SELECT MAC_BALANCE FROM TBTRDMAC WHERE MAC_CURRENCY = ? AND MAC_NUMBER = ? WITH UR
              trdpb001Repository.selectTbtrdmac(methodOut.getDcltbtrdmac(),programCtx.getSqlca());
//  cobolCode::IF SQLCODE = 0 THEN
              if (	( methodOut.getSqlcode() == 0 )) { 
//  cobolCode::IF TRD-BUYER-ID = SUM-CUSTOMER-ID
                  if (		compareChars(methodIn.getTrdBuyerId(),methodOut.getSumCustomerId()) == 0 ) { 
//  cobolCode::COMPUTE SUM-OPEN-BALANCE = MAC-BALANCE + TRD-ORDER-AMOUNT
                      methodOut.setSumOpenBalance(methodIn.getMacBalance().add(methodIn.getTrdOrderAmount()));
                  }
//  cobolCode::ELSE
                  else { 
//  cobolCode::COMPUTE SUM-OPEN-BALANCE = MAC-BALANCE - TRD-ORDER-AMOUNT
                      methodOut.setSumOpenBalance(methodIn.getMacBalance().subtract(methodIn.getTrdOrderAmount()));
                  }
//  cobolCode::MOVE SUM-OPEN-BALANCE TO SUM-CLOSE-BALANCE
                  methodOut.setSumCloseBalance(methodOut.getSumOpenBalance());
              }
          }
//  cobolCode::EVALUATE TRUE
          if  ( methodIn.isOverdue()  ) { 
//  cobolCode::ADD 1 TO SUM-OVERDUE
              methodOut.setSumOverdue(methodOut.getSumOverdue()+1);
          }
          else if  ( methodIn.isRejected()  ) { 
//  cobolCode::ADD 1 TO SUM-REJECTED
              methodOut.setSumRejected(methodOut.getSumRejected()+1);
          }
          else if  ( methodIn.isSettled()  ) { 
//  cobolCode::ADD 1 TO SUM-SETTLED
              methodOut.setSumSettled(methodOut.getSumSettled()+1);
          }
//  cobolCode::EVALUATE TRUE
          if  ( methodIn.isSummaryDebit88()  ) { 
//  cobolCode::MOVE TRD-CURRENCY TO SUM-CURRENCY
              methodOut.setSumCurrency(methodOut.getTrdCurrency());
//  cobolCode::ADD TRD-ORDER-AMOUNT TO SUM-TOTAL-DEBIT
              tempDecimal = methodOut.getSumTotalDebit().add(methodIn.getTrdOrderAmount()).setScale(2,RoundingMode.DOWN);
              methodOut.setSumTotalDebit(tempDecimal);
              //
//  cobolCode::SUBTRACT TRD-ORDER-AMOUNT FROM SUM-CLOSE-BALANCE
              tempDecimal = methodOut.getSumCloseBalance().subtract(methodIn.getTrdOrderAmount()).setScale(2,RoundingMode.DOWN);
              methodOut.setSumCloseBalance(tempDecimal);
              //
          }
          else if  ( methodIn.isSummaryCredit88()  ) { 
//  cobolCode::MOVE TRD-CURRENCY TO SUM-CURRENCY
              methodOut.setSumCurrency(methodOut.getTrdCurrency());
//  cobolCode::ADD TRD-ORDER-AMOUNT TO SUM-TOTAL-CREDIT
              tempDecimal = methodOut.getSumTotalCredit().add(methodIn.getTrdOrderAmount()).setScale(2,RoundingMode.DOWN);
              methodOut.setSumTotalCredit(tempDecimal);
              //
//  cobolCode::ADD TRD-ORDER-AMOUNT TO SUM-CLOSE-BALANCE
              tempDecimal = methodOut.getSumCloseBalance().add(methodIn.getTrdOrderAmount()).setScale(2,RoundingMode.DOWN);
              methodOut.setSumCloseBalance(tempDecimal);
              //
          }
          else if  ( methodIn.isSummaryNoBooking88()  ) { 
              ;
          }
//  cobolCode::IF 88-CUSTOMER-SUMMARY-WRITE
          if ( methodOut.isCustomerSummaryWrite88()  ) { 

// * Insert   customer summary
              
// * Insert   customer summary
              methodOut.getDcltbtrdsum().setString(methodOut.getCustomerSummaryRec().getCharArray());
//  cobolCode::INSERT INTO TBTRDSUM VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? )
              trdpb001Repository.insert1(methodOut.getDcltbtrdsum(),programCtx.getSqlca());
          }
//  cobolCode::ELSE
          else { 
//  cobolCode::UPDATE TBTRDSUM SET SUM_OVERDUE = ? , SUM_REJECTED = ? , SUM_SETTLED = ? , SUM_CURRENCY = ? , SUM_OPEN_BALANCE = ? , SUM_TOTAL_DEBIT = ? , SUM_TOTAL_CREDIT = ? , SUM_CLOSE_BALANCE = ? WHERE SUM_CUSTOMER_ID = ?
              trdpb001Repository.updateTbtrdsum(methodOut.getDcltbtrdsum(),programCtx.getSqlca());
          }

// *            Where current of summary_csr
//  cobolCode::IF SQLCODE = 0 THEN
//  cobolCode::ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  cobolCode::SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Summary Insert/Update Failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1831842734);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
//  cobolCode::CLOSE SUMMARY_CSR
          trdpb001Repository.closeSummaryCsrTrdpb001(programCtx.getSummaryCsrResultSet(),programCtx.getSqlca());
//  cobolCode::IF SQLCODE NOT = 0 THEN
          if (	( methodOut.getSqlcode() != 0 )) { 
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  cobolCode::SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              methodOut.setException(CONSTANTS.SPACE_200);
//  cobolCode::STRING 'Summary Cursor CLOSE Failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_773485255);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  cobolCode::PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Trdpb001Ctx programCtx = (Trdpb001Ctx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getParm().set((Field)params[0]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Trdpb001Ctx programCtx = (Trdpb001Ctx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Parm) {
                       	programCtx.setParm((Parm) parameters[index]);
                  	} else {
                       	programCtx.getParm().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
      public void setFromTrdpb002(Trdpb001Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getTrdOrderPair().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getTrdOrderPair().setString((char[])params[0] );
      }
      public void setFromTrdpb003(Trdpb001Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getTrdOrderPair().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getTrdOrderPair().setString((char[])params[0] );
      }
      public void setFromTrdpbexc(Trdpb001Ctx programCtx, Object[] params) {
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
  
      /**
       * Returns String value currentTime in hhmmssSS format
       * @return time as String and formatted as hhmmssSS
       */
      private char[] getCurrentTimeString() {
      	Calendar cal = getLocalTime();
      	String hh = cal.get(Calendar.HOUR_OF_DAY)+""; if (hh.length() < 2) hh = "0"+hh;
      	String mm = cal.get(Calendar.MINUTE)+""; if (mm.length() < 2) mm = "0"+mm;
      	String ss = cal.get(Calendar.SECOND)+""; if (ss.length() < 2) ss = "0"+ss;
      	String millis = cal.get(Calendar.MILLISECOND)+""; 
      	String millisFinal = "00";
      	if (millis.length() > 0)
      	{
      		if (millis.length() < 2) millisFinal = "0"+millis;
      		else millisFinal = millis.substring(0,2);
      	}
      	String tm = hh+mm+ss+millisFinal;
      	return tm.toCharArray();
      }
       /**
        * This function set calendar to use the local timezone
        * It is used to get date or time
        * @return zoned calendar
        */
      private Calendar getLocalTime()	{
       	// find the zone offset
      	TimeZone zone = null;
      	// check to see if timeZoneOffset override is set via application.properties
            	if (timeZoneId.length() > 0)
            		zone = TimeZone.getTimeZone(timeZoneId);
      	else
      		zone = TimeZone.getDefault(); 		
      	Calendar zonedCal = Calendar.getInstance();
      	zonedCal.setTimeZone(zone);
      	zonedCal.setTime(new java.util.Date());
      	return zonedCal;
      }
  
  
  
  
  }
