package com.cloudframe.app.service.impl;
  /* 
*****************************************************************
*                                                               *
* trdpb000 : process trading orders                             *
*                                                               *
*  - transaction starting this program is of format             *
*    t<currencycode> viz. tusd, tinr, tchf and so on.           *
*  - this program is the first series of programs that          *
*    validates & matches buy & sell side orders.                *
*  - multi-threading of this process is based on running        *
*    multiple background transactions for settling trades       *
*    based on currency                                          *
*  - once trades are matched, settlement batch for that         *
*    trade currency should be done                              *
*  - any validation issues will be logged in tbtrdexp table     *
*                                                               *
*****************************************************************
*/
  
import com.cloudframe.app.common.CommonProcess;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.*;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx;
import com.cloudframe.app.service.Trdpb000;
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
  import com.cloudframe.app.repository.Trdpb000Repository;
  import com.cloudframe.app.exception.Terminate;
import com.cloudframe.app.business.Mstpb001;
import com.cloudframe.app.business.*;
import com.cloudframe.app.service.*;
import com.cloudframe.app.business.Mstpb002;
import com.cloudframe.app.business.Trdpbexc;
  import java.math.BigDecimal;
  import java.math.RoundingMode;
  import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.trdpb000.*;
import com.cloudframe.app.dto.trdpb000.SettlmentQueueTable;
import com.cloudframe.app.dto.trdpb000.Parm;
import com.cloudframe.app.dto.trdpb000.Sqlca;
import com.cloudframe.app.dto.trdpb000.SecurityIo;
import com.cloudframe.app.dto.trdpb000.CustomerSummaryRec;
import com.cloudframe.app.dto.trdpb000.ExceptionRecord;
import com.cloudframe.app.dto.trdpb000.Dcltbtrdsum;
import com.cloudframe.app.dto.trdpb000.Dcltbtrdlog;
import com.cloudframe.app.dto.trdpb000.TrdOrderPair;
import com.cloudframe.app.dto.trdpb000.Dcltbtrdord;
import com.cloudframe.app.dto.trdpb000.CustomerIo;
import com.cloudframe.app.dto.trdpb000.Dcltbtrdsac;
import com.cloudframe.app.dto.trdpb000.Dcltbtrdmac;
import com.cloudframe.app.dto.trdpb000.ExceptionRecordLenGroup;
import com.cloudframe.app.dto.trdpb000.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("trdpb000")
  
  public class Trdpb000Impl extends CommonProcess implements Trdpb000 {
  
  Logger logger = LoggerFactory.getLogger(Trdpb000Impl.class);
  
  
  @Value("${timeZoneId:Etc/GMT}")
  private String timeZoneId;
  @Value("${TRDPB000.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("trdpb000Repository")
  Trdpb000Repository trdpb000Repository;
  @Autowired 
  @Qualifier("mstpb001")
  Mstpb001 mstpb001;
  @Autowired 
  @Qualifier("mstpb002")
  Mstpb002 mstpb002;
  @Autowired 
  @Qualifier("trdpbexc")
  Trdpbexc trdpbexc;
  
  
  
  
  
  
      @Override
      public int setParameter(Trdpb000Ctx programCtx, String parm) throws Exception {
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
      public int process(Trdpb000Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("TRDPB000" ,dbQualifier, true/*use Dynamic SQL*/);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
//  PERFORM 0000-MAINLINE
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
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 16
      * Input  :  

      * - currency01                     COBOL Name: LK-CURRENCY
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
      * - currency01                     COBOL Name: LK-CURRENCY
      * - currdate                       COBOL Name: WS-CURRDATE
      * - currtime                       COBOL Name: WS-CURRTIME
      * - logStartTs                     COBOL Name: LOG-START-TS
      * - logEndTs                       COBOL Name: LOG-END-TS
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
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

Trdpb000Ctx programCtx = methodIn.getTrdpb000Ctx();
MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();

// * Validate currency
//  IF VALID-CURRENCY THEN
//  ELSE
          if (!(methodIn.isValidCurrency()) ) { 
//  SET SYSTEM-EXCEPTION TO TRUE
              methodOut.setSystemExceptionTrue(); 
              
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING LK-CURRENCY ' : ' 'Currency parameter passed is invalid' DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(methodOut.getCurrency01());
                 charArray.add(CONSTANTS.LITERAL_B2_CL_);
                 charArray.add(CONSTANTS.LITERAL_1198002197);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }

// * Default chkpt frequency is 100
//  IF LK-CHKP-FREQUENCY < 100 THEN
          if (	( methodOut.getChkpFrequency() < 100 )) { 
              // MOVE 100 TO LK-CHKP-FREQUENCY
              methodOut.setChkpFrequency(100);
          }

// * Log start timestamp
//  INITIALIZE DCLTBTRDLOG
          methodOut.getDcltbtrdlog().initialize();
//  MOVE 'ACCEPTANCE' TO LOG-TRANSACTION
//  LITERAL_ACCEPTANCE = 'ACCEPTANCE'
          methodOut.setLogTransaction(CONSTANTS.LITERAL_ACCEPTANCE);
//  MOVE LK-CURRENCY TO LOG-CURRENCY
          methodOut.setLogCurrency(methodOut.getCurrency01());
//  ACCEPT WS-CURRDATE FROM DATE YYYYMMDD
          methodOut.setCurrdate(CFUtil.getCurrentDateStr("YYYYMMDD")); 
//  ACCEPT WS-CURRTIME FROM TIME
          methodOut.setCurrtime(getCurrentTimeString()); 
//  MOVE SPACES TO LOG-START-TS
          methodOut.setLogStartTs(CONSTANTS.SPACE_26);
//  STRING WS-CURRDATE (1 : 4) '-' WS-CURRDATE (5 : 2) '-' WS-CURRDATE (7 : 2) ' ' WS-CURRTIME (1 : 2) ':' WS-CURRTIME (3 : 2) ':' WS-CURRTIME (5 : 2) DELIMITED BY SIZE INTO LOG-START-TS END-STRING
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
//  PERFORM 1000-ORDER-ACCEPTANCE THRU 1000-EXIT
          orderAcceptance(programCtx.getOrderAcceptanceInCtx());/*1000-ORDER-ACCEPTANCE*/

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
//  ACCEPT WS-CURRDATE FROM DATE YYYYMMDD
          methodOut.setCurrdate(CFUtil.getCurrentDateStr("YYYYMMDD")); 
//  ACCEPT WS-CURRTIME FROM TIME
          methodOut.setCurrtime(getCurrentTimeString()); 
//  MOVE SPACES TO LOG-END-TS
          methodOut.setLogEndTs(CONSTANTS.SPACE_26);
//  STRING WS-CURRDATE (1 : 4) '-' WS-CURRDATE (5 : 2) '-' WS-CURRDATE (7 : 2) ' ' WS-CURRTIME (1 : 2) ':' WS-CURRTIME (3 : 2) ':' WS-CURRTIME (5 : 2) DELIMITED BY SIZE INTO LOG-END-TS END-STRING
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
//  INSERT INTO TBTRDLOG VALUES ( ? , ? , ? , ? )
          trdpb000Repository.insert(methodOut.getDcltbtrdlog(),programCtx.getSqlca());
//  EVALUATE TRUE
          if  (	( methodOut.getSqlcode() == 0 )) { 
              ;
          }
          else if  (	( methodOut.getSqlcode() == -803 )) { 
//  UPDATE TBTRDLOG SET LOG_END_TS = ? WHERE LOG_TRANSACTION = ? AND LOG_CURRENCY = ?
              trdpb000Repository.updateTbtrdlog1(methodOut.getDcltbtrdlog(),programCtx.getSqlca());
//  IF SQLCODE NOT = 0 THEN
              if (	( methodOut.getSqlcode() != 0 )) { 
                  // MOVE SQLCODE TO WS-SQLCODE
                  //  FORMAT1016334848 = "----"
                  methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  SET APPL-EXCEPTION TO TRUE
                  methodOut.setApplExceptionTrue(); 
                  
                  // MOVE SPACES TO WS-EXCEPTION
                  methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'LOG Update Failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_447191562);
                     charArray.add(methodOut.getSqlcode_Ws());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              }
          }
          else   { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'LOG Insert Failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1668654618);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
//  COMMIT
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

// *

// *
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * orderAcceptance 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-ORDER-ACCEPTANCE COBOL Cyclomatic complexity - 40
      * Input  :  

      * - currency01                     COBOL Name: LK-CURRENCY
      * - stqIndex                       COBOL Name: WS-STQ-INDEX
      * - sqlcode                        COBOL Name: SQLCODE
      * - ordCustomerId                  COBOL Name: ORD-CUSTOMER-ID
      * - ordTradeid                     COBOL Name: ORD-TRADEID
      * - ordFigi                        COBOL Name: ORD-FIGI
      * - ordQuantity                    COBOL Name: ORD-QUANTITY
      * - ordAmount                      COBOL Name: ORD-AMOUNT
      * - chkpFrequency                  COBOL Name: LK-CHKP-FREQUENCY
      *
      * Output :  

      * - ordCurrency                    COBOL Name: ORD-CURRENCY
      * - currency01                     COBOL Name: LK-CURRENCY
      * - stqIndex                       COBOL Name: WS-STQ-INDEX
      * - stqCurrency                    COBOL Name: WS-STQ-CURRENCY
      * - ordTradingXchng                COBOL Name: ORD-TRADING-XCHNG
      * - orderStatus                    COBOL Name: WS-ORDER-STATUS
      * - ordStatus                      COBOL Name: ORD-STATUS
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      * - exception                      COBOL Name: WS-EXCEPTION
      * - ordersSwitch                   COBOL Name: WS-ORDERS-SWITCH
      * - orderCount                     COBOL Name: WS-ORDER-COUNT
      * - trdExchange                    COBOL Name: TRD-EXCHANGE
      * - trdBuyerId                     COBOL Name: TRD-BUYER-ID
      * - ordCustomerId                  COBOL Name: ORD-CUSTOMER-ID
      * - trdOrderId                     COBOL Name: TRD-ORDER-ID
      * - ordTradeid                     COBOL Name: ORD-TRADEID
      * - trdFigi                        COBOL Name: TRD-FIGI
      * - ordFigi                        COBOL Name: ORD-FIGI
      * - trdOrderQty                    COBOL Name: TRD-ORDER-QTY
      * - ordQuantity                    COBOL Name: ORD-QUANTITY
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - trdOrderAmount                 COBOL Name: TRD-ORDER-AMOUNT
      * - ordAmount                      COBOL Name: ORD-AMOUNT
      *
      * @throws CFException
      */
      @Override
      public OrderAcceptanceOutCtx orderAcceptance(OrderAcceptanceInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

Trdpb000Ctx programCtx = methodIn.getTrdpb000Ctx();
OrderAcceptanceOutCtx methodOut = methodIn.getOrderAcceptanceOutCtx();
//  MOVE LK-CURRENCY TO ORD-CURRENCY
          methodOut.setOrdCurrency(methodOut.getCurrency01());
//  PERFORM VARYING WS-STQ-INDEX FROM 1 BY 1 UNTIL WS-STQ-INDEX > 100
          for (methodOut.setStqIndex((short)1); (	( methodOut.getStqIndex() <= 100 ) ) ; methodOut.setStqIndex((short)(methodOut.getStqIndex() + 1)) ) {
//  MOVE LK-CURRENCY TO WS-STQ-CURRENCY ( WS-STQ-INDEX )
              methodOut.setStqCurrency(methodOut.getStqIndex() - 1,methodOut.getCurrency01());
          }

// *

// *
//  MOVE 0 TO WS-STQ-INDEX
          methodOut.setStqIndex((short)0);
//  EVALUATE ORD-CURRENCY
          switch(new String(methodOut.getOrdCurrency())){
          	case "EUR":
//  MOVE 'DAX' TO ORD-TRADING-XCHNG
              methodOut.setOrdTradingXchng(CONSTANTS.LITERAL_DAX_B7_);
          break;
          	case "USD":
//  MOVE 'NYSE' TO ORD-TRADING-XCHNG
              methodOut.setOrdTradingXchng(CONSTANTS.LITERAL_NYSE_B6_);
          break;
          	case "CAD":
//  MOVE 'TSX' TO ORD-TRADING-XCHNG
              methodOut.setOrdTradingXchng(CONSTANTS.LITERAL_TSX_B7_);
          break;
          	case "CNY":
//  MOVE 'SSE' TO ORD-TRADING-XCHNG
              methodOut.setOrdTradingXchng(CONSTANTS.LITERAL_SSE_B7_);
          break;
          	case "INR":
//  MOVE 'BSE' TO ORD-TRADING-XCHNG
              methodOut.setOrdTradingXchng(CONSTANTS.LITERAL_BSE_B7_);
          break;
          	case "CHF":
//  MOVE 'SWX' TO ORD-TRADING-XCHNG
              methodOut.setOrdTradingXchng(CONSTANTS.LITERAL_SWX_B7_);
          break;
          	case "JPY":
//  MOVE 'TSE' TO ORD-TRADING-XCHNG
              methodOut.setOrdTradingXchng(CONSTANTS.LITERAL_TSE_B7_);
          break;
          	case "MXN":
//  MOVE 'BMV' TO ORD-TRADING-XCHNG
              methodOut.setOrdTradingXchng(CONSTANTS.LITERAL_BMV_B7_);
          break;
          	case "KRW":
//  MOVE 'KRX' TO ORD-TRADING-XCHNG
              methodOut.setOrdTradingXchng(CONSTANTS.LITERAL_KRX_B7_);
          break;
          	case "GBX":
//  MOVE 'FTSE' TO ORD-TRADING-XCHNG
              methodOut.setOrdTradingXchng(CONSTANTS.LITERAL_FTSE_B6_);
          break;
          }

// *
//  SET ACCEPTED TO TRUE
          methodOut.setAcceptedTrue(); 
          
//  MOVE WS-ORDER-STATUS TO ORD-STATUS
          methodOut.setOrdStatus(methodOut.getOrderStatus());
//  SELECT ORD_TRADEID , ORD_BUY_SELL_IND , ORD_CUSTOMER_ID , ORD_FIGI , ORD_QUANTITY , ORD_CURRENCY , ORD_AMOUNT FROM TBTRDORD WHERE ORD_CURRENCY = ? AND ORD_TRADING_XCHNG = ? AND ORD_BUY_SELL_IND = 'B' AND ORD_STATUS = ?
          programCtx.setBuySideOrdersResultSet(trdpb000Repository.openBuySideOrdersTrdpb000(programCtx.getSqlca(),methodOut.getDcltbtrdord()));

// *
//  IF SQLCODE NOT = 0 THEN
          if (	( methodOut.getSqlcode() != 0 )) { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'Open BUY_SIDE_ORDERS Cursor failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1745636197);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
//  FETCH BUY_SIDE_ORDERS INTO ? , ? , ? , ? , ? , ? , ?
          trdpb000Repository.fetchBuySideOrdersTrdpb000(programCtx.getBuySideOrdersResultSet(),programCtx.getSqlca(),methodOut.getDcltbtrdord());

// *
//  IF SQLCODE = 100 THEN
          if (	( methodOut.getSqlcode() == 100 )) { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  SET NO-MORE-ORDERS TO TRUE
              methodOut.setNoMoreOrdersTrue(); 
              
//  SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'No BUY_SIDE_ORDERS to Settle ' DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_No_B4_BUY_SIDE_ORDERStoSettle);
              joinCharArray = Field.mergeArrays(charArray.get(0));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }

// *

// *

// *
//  MOVE 0 TO WS-ORDER-COUNT
          methodOut.setOrderCount(0);
//  PERFORM UNTIL NO-MORE-ORDERS
          while ((!(methodOut.isNoMoreOrders()) )) {
//  ADD 1 TO WS-ORDER-COUNT
              methodOut.setOrderCount(methodOut.getOrderCount()+1);
//  SET NO-EXCEPTIONS TO TRUE
              methodOut.setNoExceptionsTrue(); 
              

// *
//  MOVE ORD-TRADING-XCHNG TO TRD-EXCHANGE
              methodOut.setTrdExchange(methodOut.getOrdTradingXchng());
//  MOVE ORD-CUSTOMER-ID TO TRD-BUYER-ID
              methodOut.setTrdBuyerId(methodOut.getOrdCustomerId());
//  MOVE ORD-TRADEID TO TRD-ORDER-ID
              methodOut.setTrdOrderId(methodOut.getOrdTradeid());
//  MOVE ORD-FIGI TO TRD-FIGI
              methodOut.setTrdFigi(methodOut.getOrdFigi());
//  MOVE ORD-QUANTITY TO TRD-ORDER-QTY
              methodOut.setTrdOrderQty(methodOut.getOrdQuantity());
//  MOVE ORD-CURRENCY TO TRD-CURRENCY
              methodOut.setTrdCurrency(methodOut.getOrdCurrency());
//  MOVE ORD-AMOUNT TO TRD-ORDER-AMOUNT
              methodOut.setTrdOrderAmount(methodOut.getOrdAmount());

// *
//  PERFORM 5000-GET-SELL-SIDE-ORDER THRU 5000-EXIT
              getSellSideOrder(programCtx.getGetSellSideOrderInCtx());/*5000-GET-SELL-SIDE-ORDER*/

// *
//  IF NO-EXCEPTIONS
              if ( methodOut.isNoExceptions()  ) { 
//  PERFORM 5001-VALIDATE-CUSTOMERS THRU 5001-EXIT
                  validateCustomers(programCtx.getValidateCustomersInCtx());/*5001-VALIDATE-CUSTOMERS*/
              }

// *
//  IF NO-EXCEPTIONS
              if ( methodOut.isNoExceptions()  ) { 
//  PERFORM 5002-VALIDATE-SECURITY THRU 5002-EXIT
                  validateSecurity(programCtx.getValidateSecurityInCtx());/*5002-VALIDATE-SECURITY*/
              }

// *
//  IF NO-EXCEPTIONS
              if ( methodOut.isNoExceptions()  ) { 
//  PERFORM 5003-BUYER-SEC-ACCOUNT THRU 5003-EXIT
                  buyerSecAccount(programCtx.getBuyerSecAccountInCtx());/*5003-BUYER-SEC-ACCOUNT*/
              }

// *
//  IF NO-EXCEPTIONS
              if ( methodOut.isNoExceptions()  ) { 
//  PERFORM 5004-SELLER-SEC-ACCOUNT THRU 5004-EXIT
                  sellerSecAccount(programCtx.getSellerSecAccountInCtx());/*5004-SELLER-SEC-ACCOUNT*/
              }

// *
//  IF NO-EXCEPTIONS
              if ( methodOut.isNoExceptions()  ) { 
//  PERFORM 5005-BUYER-MONEY-ACCOUNT THRU 5005-EXIT
                  buyerMoneyAccount(programCtx.getBuyerMoneyAccountInCtx());/*5005-BUYER-MONEY-ACCOUNT*/
              }

// *
//  IF NO-EXCEPTIONS
              if ( methodOut.isNoExceptions()  ) { 
//  PERFORM 5006-SELLER-MONEY-ACCOUNT THRU 5006-EXIT
                  sellerMoneyAccount(programCtx.getSellerMoneyAccountInCtx());/*5006-SELLER-MONEY-ACCOUNT*/
              }

// *
//  IF NO-EXCEPTIONS
              if ( methodOut.isNoExceptions()  ) { 
//  PERFORM 5007-UPDATE-ORDER-MATCHED THRU 5007-EXIT
                  updateOrderMatched(programCtx.getUpdateOrderMatchedInCtx());/*5007-UPDATE-ORDER-MATCHED*/

// *
//  PERFORM 5008-WRITE-TO-STLMT-QUEUE THRU 5008-EXIT
                  writeToStlmtQueue(programCtx.getWriteToStlmtQueueInCtx());/*5008-WRITE-TO-STLMT-QUEUE*/

// *
//  IF WS-ORDER-COUNT >= LK-CHKP-FREQUENCY
                  if (	( methodOut.getOrderCount() >= methodIn.getChkpFrequency() )) { 
//  COMMIT
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
//  MOVE 0 TO WS-ORDER-COUNT
                      methodOut.setOrderCount(0);
                  }
              }
//  FETCH BUY_SIDE_ORDERS INTO ? , ? , ? , ? , ? , ? , ?
              trdpb000Repository.fetchBuySideOrders1Trdpb000(programCtx.getBuySideOrdersResultSet(),programCtx.getSqlca(),methodOut.getDcltbtrdord());

// *
//  EVALUATE TRUE
              if  (	( methodOut.getSqlcode() == 0 )) { 
                  ;
              }
              else if  (	( methodOut.getSqlcode() == 100 )) { 
//  SET NO-MORE-ORDERS TO TRUE
                  methodOut.setNoMoreOrdersTrue(); 
                  
              }
              else   { 
                  // MOVE SQLCODE TO WS-SQLCODE
                  //  FORMAT1016334848 = "----"
                  methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  SET APPL-EXCEPTION TO TRUE
                  methodOut.setApplExceptionTrue(); 
                  
                  // MOVE SPACES TO WS-EXCEPTION
                  methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'Fetch BUY_SIDE_ORDERS failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_228605957);
                     charArray.add(methodOut.getSqlcode_Ws());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
              }
          }
//  CLOSE BUY_SIDE_ORDERS
          trdpb000Repository.closeBuySideOrdersTrdpb000(programCtx.getBuySideOrdersResultSet(),programCtx.getSqlca());
//  EVALUATE TRUE
          if  (	( methodOut.getSqlcode() == 0 )) { 
              ;
          }
          else   { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'Close BUY_SIDE_ORDERS failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_2007779449);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }

// *
//  IF WS-STQ-INDEX > 0 THEN
          if (	( methodOut.getStqIndex() > 0 ) ) { 
//  PERFORM 5009-INSERT-TO-STQ THRU 5009-EXIT
              insertToStq(programCtx.getInsertToStqInCtx());/*5009-INSERT-TO-STQ*/
          }
//  COMMIT
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
      
      return methodOut;
      }
      /**
      * getSellSideOrder 
      *   This method is derived from 
  *   COBOL Paragraph - 5000-GET-SELL-SIDE-ORDER COBOL Cyclomatic complexity - 9
      * Input  :  

      * - ordStatus                      COBOL Name: ORD-STATUS
      * - ordCustomerId                  COBOL Name: ORD-CUSTOMER-ID
      * - ordTradeid                     COBOL Name: ORD-TRADEID
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - trdExchange                    COBOL Name: TRD-EXCHANGE
      * - trdOrderId                     COBOL Name: TRD-ORDER-ID
      * - trdFigi                        COBOL Name: TRD-FIGI
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      *
      * Output :  

      * - ordBuySellInd                  COBOL Name: ORD-BUY-SELL-IND
      * - orderStatus                    COBOL Name: WS-ORDER-STATUS
      * - ordStatus                      COBOL Name: ORD-STATUS
      * - trdSellerId                    COBOL Name: TRD-SELLER-ID
      * - ordCustomerId                  COBOL Name: ORD-CUSTOMER-ID
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      * - tradeid                        COBOL Name: WS-TRADEID
      * - ordTradeid                     COBOL Name: ORD-TRADEID
      * - exception                      COBOL Name: WS-EXCEPTION
      * - ordCurrency                    COBOL Name: ORD-CURRENCY
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - ordTradingXchng                COBOL Name: ORD-TRADING-XCHNG
      * - trdExchange                    COBOL Name: TRD-EXCHANGE
      * - trdOrderId                     COBOL Name: TRD-ORDER-ID
      * - ordFigi                        COBOL Name: ORD-FIGI
      * - trdFigi                        COBOL Name: TRD-FIGI
      *
      * @throws CFException
      */
      @Override
      public GetSellSideOrderOutCtx getSellSideOrder(GetSellSideOrderInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

Trdpb000Ctx programCtx = methodIn.getTrdpb000Ctx();
GetSellSideOrderOutCtx methodOut = methodIn.getGetSellSideOrderOutCtx();

// *
//  MOVE 'S' TO ORD-BUY-SELL-IND
//  LITERAL_S = 'S'
          methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_S);
//  SELECT ORD_CUSTOMER_ID , ORD_STATUS FROM TBTRDORD WHERE ORD_CURRENCY = ? AND ORD_TRADING_XCHNG = ? AND ORD_TRADEID = ? AND ORD_FIGI = ? AND ORD_BUY_SELL_IND = ? WITH UR
          trdpb000Repository.selectTbtrdord(programCtx.getSqlca(),methodOut.getDcltbtrdord());
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  MOVE ORD-STATUS TO WS-ORDER-STATUS
              methodOut.setOrderStatus(methodOut.getOrdStatus());
//  IF ACCEPTED THEN
              if ( methodOut.isAccepted()  ) { 
//  MOVE ORD-CUSTOMER-ID TO TRD-SELLER-ID
                  methodOut.setTrdSellerId(methodOut.getOrdCustomerId());
                  ;
              }
//  ELSE
              else { 
//  SET DATA-EXCEPTION TO TRUE
                  methodOut.setDataExceptionTrue(); 
                  
                  // MOVE ORD-TRADEID TO WS-TRADEID
                  methodOut.setTradeid(padLeftZeros(9,methodOut.getOrdTradeid(),false));
                  // MOVE SPACES TO WS-EXCEPTION
                  methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'TradeId = ' WS-TRADEID ' : ' 'Rejected - Reason : Seller Side Order ' 'Status Invalid - Order Status = ' WS-ORDER-STATUS DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_869114500);
                     charArray.add(String.valueOf(methodOut.getTradeidString()).toCharArray());
                     charArray.add(CONSTANTS.LITERAL_B2_CL_);
                     charArray.add(CONSTANTS.LITERAL_78908345);
                     charArray.add(CONSTANTS.LITERAL_267520629);
                     charArray.add(methodOut.getOrderStatus());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/

// *
// *                Update buyer side order to overdue
// *
//  SET OVERDUE-SELLER-ORDSTA-INVLD TO TRUE
                  methodOut.setOverdueSellerOrdstaInvldTrue(); 
                  
//  MOVE WS-ORDER-STATUS TO ORD-STATUS
                  methodOut.setOrdStatus(methodOut.getOrderStatus());

// *
//  MOVE TRD-CURRENCY TO ORD-CURRENCY
                  methodOut.setOrdCurrency(methodOut.getTrdCurrency());
//  MOVE TRD-EXCHANGE TO ORD-TRADING-XCHNG
                  methodOut.setOrdTradingXchng(methodOut.getTrdExchange());
//  MOVE TRD-ORDER-ID TO ORD-TRADEID
                  methodOut.setOrdTradeid(methodOut.getTrdOrderId());
//  MOVE TRD-FIGI TO ORD-FIGI
                  methodOut.setOrdFigi(methodOut.getTrdFigi());
//  MOVE 'B' TO ORD-BUY-SELL-IND
//  LITERAL_B = 'B'
                  methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_B);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
                  updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
              }
          break;
          	case 100:
//  SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              // MOVE ORD-TRADEID TO WS-TRADEID
              methodOut.setTradeid(padLeftZeros(9,methodOut.getOrdTradeid(),false));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'TradeId = ' WS-TRADEID ' : ' 'Rejected - Reason : Seller Side Order ' 'Not Found ' DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_869114500);
                 charArray.add(String.valueOf(methodOut.getTradeidString()).toCharArray());
                 charArray.add(CONSTANTS.LITERAL_B2_CL_);
                 charArray.add(CONSTANTS.LITERAL_78908345);
                 charArray.add(CONSTANTS.LITERAL_Not_B2_Found);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/

// *
// *              Update buyer side order to overdue
// *
//  SET OVERDUE-SELLER-ORD-MISSING TO TRUE
              methodOut.setOverdueSellerOrdMissingTrue(); 
              
//  MOVE WS-ORDER-STATUS TO ORD-STATUS
              methodOut.setOrdStatus(methodOut.getOrderStatus());

// *
//  MOVE TRD-CURRENCY TO ORD-CURRENCY
              methodOut.setOrdCurrency(methodOut.getTrdCurrency());
//  MOVE TRD-EXCHANGE TO ORD-TRADING-XCHNG
              methodOut.setOrdTradingXchng(methodOut.getTrdExchange());
//  MOVE TRD-ORDER-ID TO ORD-TRADEID
              methodOut.setOrdTradeid(methodOut.getTrdOrderId());
//  MOVE TRD-FIGI TO ORD-FIGI
              methodOut.setOrdFigi(methodOut.getTrdFigi());
//  MOVE 'B' TO ORD-BUY-SELL-IND
//  LITERAL_B = 'B'
              methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_B);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
              updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
          break;
          default :
//  SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              // MOVE ORD-TRADEID TO WS-TRADEID
              methodOut.setTradeid(padLeftZeros(9,methodOut.getOrdTradeid(),false));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'Seller Order Select Failed - SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1219910025);
                 charArray.add(methodIn.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
      
      return methodOut;
      }
      /**
      * validateCustomers 
      *   This method is derived from 
  *   COBOL Paragraph - 5001-VALIDATE-CUSTOMERS COBOL Cyclomatic complexity - 17
      * Input  :  

      * - trdBuyerId                     COBOL Name: TRD-BUYER-ID
      * - ordTradeid                     COBOL Name: ORD-TRADEID
      * - ordCustomerId                  COBOL Name: ORD-CUSTOMER-ID
      * - trdSellerId                    COBOL Name: TRD-SELLER-ID
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - trdExchange                    COBOL Name: TRD-EXCHANGE
      * - trdOrderId                     COBOL Name: TRD-ORDER-ID
      * - trdFigi                        COBOL Name: TRD-FIGI
      *
      * Output :  

      * - orderStatus                    COBOL Name: WS-ORDER-STATUS
      * - customerIo                     COBOL Name: WS-CUSTOMER-IO
      * - customerId                     COBOL Name: WS-CUSTOMER-ID
      * - trdBuyerId                     COBOL Name: TRD-BUYER-ID
      * - rc                             COBOL Name: RETURN-CODE
      * - customerStatus                 COBOL Name: WS-CUSTOMER-STATUS
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      * - tradeid                        COBOL Name: WS-TRADEID
      * - ordTradeid                     COBOL Name: ORD-TRADEID
      * - exception                      COBOL Name: WS-EXCEPTION
      * - customerErrorMsg               COBOL Name: WS-CUSTOMER-ERROR-MSG
      * - trdSellerId                    COBOL Name: TRD-SELLER-ID
      * - ordStatus                      COBOL Name: ORD-STATUS
      * - ordCurrency                    COBOL Name: ORD-CURRENCY
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - ordTradingXchng                COBOL Name: ORD-TRADING-XCHNG
      * - trdExchange                    COBOL Name: TRD-EXCHANGE
      * - trdOrderId                     COBOL Name: TRD-ORDER-ID
      * - ordFigi                        COBOL Name: ORD-FIGI
      * - trdFigi                        COBOL Name: TRD-FIGI
      * - ordBuySellInd                  COBOL Name: ORD-BUY-SELL-IND
      *
      * @throws CFException
      */
      @Override
      public ValidateCustomersOutCtx validateCustomers(ValidateCustomersInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

Trdpb000Ctx programCtx = methodIn.getTrdpb000Ctx();
ValidateCustomersOutCtx methodOut = methodIn.getValidateCustomersOutCtx();
//  SET ACCEPTED TO TRUE
          methodOut.setAcceptedTrue(); 
          
//  INITIALIZE WS-CUSTOMER-IO
          methodOut.getCustomerIo().initialize();
//  MOVE TRD-BUYER-ID TO WS-CUSTOMER-ID
          methodOut.setCustomerId(methodOut.getTrdBuyerId());
//  CALL WS-CUSTOMER-CHECK USING WS-CUSTOMER-IO END-CALL
          // CALL WS-CUSTOMER-CHECK USING WS-CUSTOMER-IO END-CALL
               programCtx.setRc( mstpb001.call(programCtx.getGlobalCtx().getContext("MSTPB001"),methodOut.getCustomerIo()));

// *
//  EVALUATE TRUE
          if  ( methodOut.isCustomerActive88()  ) { 
              ;
          }
          else if  ( methodOut.isCustomerNotFound88()  ) { 
//  SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              // MOVE ORD-TRADEID TO WS-TRADEID
              methodOut.setTradeid(padLeftZeros(9,methodOut.getOrdTradeid(),false));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'TradeId = ' WS-TRADEID ' : ' 'Rejected - Reason : Customer ' ORD-CUSTOMER-ID ' Not found' DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_869114500);
                 charArray.add(String.valueOf(methodOut.getTradeidString()).toCharArray());
                 charArray.add(CONSTANTS.LITERAL_B2_CL_);
                 charArray.add(CONSTANTS.LITERAL_Rejected_B5_MN_ReasonCL_Customer);
                 charArray.add(methodIn.getOrdCustomerId());
                 charArray.add(CONSTANTS.LITERAL_B2_Notfound);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
          else if  ( methodOut.isCustomerInactive88()  ) { 
//  SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              // MOVE ORD-TRADEID TO WS-TRADEID
              methodOut.setTradeid(padLeftZeros(9,methodOut.getOrdTradeid(),false));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'TradeId = ' WS-TRADEID ' : ' 'Rejected - Reason : Customer ' ORD-CUSTOMER-ID ' Not Active' DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_869114500);
                 charArray.add(String.valueOf(methodOut.getTradeidString()).toCharArray());
                 charArray.add(CONSTANTS.LITERAL_B2_CL_);
                 charArray.add(CONSTANTS.LITERAL_Rejected_B5_MN_ReasonCL_Customer);
                 charArray.add(methodIn.getOrdCustomerId());
                 charArray.add(CONSTANTS.LITERAL_B2_NotActive);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
          else if  ( methodOut.isCustomerException88()  ) { 
//  SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              // MOVE WS-CUSTOMER-ERROR-MSG TO WS-EXCEPTION
              methodOut.setException(methodOut.getCustomerErrorMsg());
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
//  IF 88-CUSTOMER-ACTIVE THEN
//  ELSE
          if (!(methodOut.isCustomerActive88()) ) { 

// * Update buyer/seller order status

// *

// *
// * Validate seller
// *
//  SET OVERDUE-BUYER-ID-INVLD TO TRUE
              methodOut.setOverdueBuyerIdInvldTrue(); 
              
          }
//  INITIALIZE WS-CUSTOMER-IO
          methodOut.getCustomerIo().initialize();
//  MOVE TRD-SELLER-ID TO WS-CUSTOMER-ID
          methodOut.setCustomerId(methodOut.getTrdSellerId());
//  CALL WS-CUSTOMER-CHECK USING WS-CUSTOMER-IO END-CALL
          // CALL WS-CUSTOMER-CHECK USING WS-CUSTOMER-IO END-CALL
               programCtx.setRc( mstpb001.call(programCtx.getGlobalCtx().getContext("MSTPB001"),methodOut.getCustomerIo()));

// *
//  EVALUATE TRUE
          if  ( methodOut.isCustomerActive88()  ) { 
              ;
          }
          else if  ( methodOut.isCustomerNotFound88()  ) { 
//  SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              // MOVE ORD-TRADEID TO WS-TRADEID
              methodOut.setTradeid(padLeftZeros(9,methodOut.getOrdTradeid(),false));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'TradeId = ' WS-TRADEID ' : ' 'Rejected - Reason : Customer ' ORD-CUSTOMER-ID ' Not found' DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_869114500);
                 charArray.add(String.valueOf(methodOut.getTradeidString()).toCharArray());
                 charArray.add(CONSTANTS.LITERAL_B2_CL_);
                 charArray.add(CONSTANTS.LITERAL_Rejected_B5_MN_ReasonCL_Customer);
                 charArray.add(methodIn.getOrdCustomerId());
                 charArray.add(CONSTANTS.LITERAL_B2_Notfound);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
          else if  ( methodOut.isCustomerInactive88()  ) { 
//  SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              // MOVE ORD-TRADEID TO WS-TRADEID
              methodOut.setTradeid(padLeftZeros(9,methodOut.getOrdTradeid(),false));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'TradeId = ' WS-TRADEID ' : ' 'Rejected - Reason : Customer ' ORD-CUSTOMER-ID ' Not Active' DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_869114500);
                 charArray.add(String.valueOf(methodOut.getTradeidString()).toCharArray());
                 charArray.add(CONSTANTS.LITERAL_B2_CL_);
                 charArray.add(CONSTANTS.LITERAL_Rejected_B5_MN_ReasonCL_Customer);
                 charArray.add(methodIn.getOrdCustomerId());
                 charArray.add(CONSTANTS.LITERAL_B2_NotActive);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
          else if  ( methodOut.isCustomerException88()  ) { 
//  SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              // MOVE WS-CUSTOMER-ERROR-MSG TO WS-EXCEPTION
              methodOut.setException(methodOut.getCustomerErrorMsg());
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
//  IF 88-CUSTOMER-ACTIVE THEN
//  ELSE
          if (!(methodOut.isCustomerActive88()) ) { 

// * Update buyer/seller order status
//  SET OVERDUE-SELLER-ID-INVLD TO TRUE
              methodOut.setOverdueSellerIdInvldTrue(); 
              
          }

// *
//  IF OVERDUE-BUYER-ID-INVLD OR OVERDUE-SELLER-ID-INVLD
          if ( methodOut.isOverdueBuyerIdInvld()   ||  methodOut.isOverdueSellerIdInvld()  ) { 
//  MOVE WS-ORDER-STATUS TO ORD-STATUS
              methodOut.setOrdStatus(methodOut.getOrderStatus());
//  MOVE TRD-CURRENCY TO ORD-CURRENCY
              methodOut.setOrdCurrency(methodOut.getTrdCurrency());
//  MOVE TRD-EXCHANGE TO ORD-TRADING-XCHNG
              methodOut.setOrdTradingXchng(methodOut.getTrdExchange());
//  MOVE TRD-ORDER-ID TO ORD-TRADEID
              methodOut.setOrdTradeid(methodOut.getTrdOrderId());
//  MOVE TRD-FIGI TO ORD-FIGI
              methodOut.setOrdFigi(methodOut.getTrdFigi());
//  MOVE 'B' TO ORD-BUY-SELL-IND
//  LITERAL_B = 'B'
              methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_B);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
              updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/

// *
//  MOVE 'S' TO ORD-BUY-SELL-IND
//  LITERAL_S = 'S'
              methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_S);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
              updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
          }
      
      return methodOut;
      }
      /**
      * validateSecurity 
      *   This method is derived from 
  *   COBOL Paragraph - 5002-VALIDATE-SECURITY COBOL Cyclomatic complexity - 8
      * Input  :  

      * - ordFigi                        COBOL Name: ORD-FIGI
      * - ordTradeid                     COBOL Name: ORD-TRADEID
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - trdExchange                    COBOL Name: TRD-EXCHANGE
      * - trdOrderId                     COBOL Name: TRD-ORDER-ID
      * - trdFigi                        COBOL Name: TRD-FIGI
      *
      * Output :  

      * - securityIo                     COBOL Name: WS-SECURITY-IO
      * - figi                           COBOL Name: WS-FIGI
      * - ordFigi                        COBOL Name: ORD-FIGI
      * - rc                             COBOL Name: RETURN-CODE
      * - securityStatus                 COBOL Name: WS-SECURITY-STATUS
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      * - tradeid                        COBOL Name: WS-TRADEID
      * - ordTradeid                     COBOL Name: ORD-TRADEID
      * - exception                      COBOL Name: WS-EXCEPTION
      * - securityErrorMsg               COBOL Name: WS-SECURITY-ERROR-MSG
      * - orderStatus                    COBOL Name: WS-ORDER-STATUS
      * - ordStatus                      COBOL Name: ORD-STATUS
      * - ordCurrency                    COBOL Name: ORD-CURRENCY
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - ordTradingXchng                COBOL Name: ORD-TRADING-XCHNG
      * - trdExchange                    COBOL Name: TRD-EXCHANGE
      * - trdOrderId                     COBOL Name: TRD-ORDER-ID
      * - trdFigi                        COBOL Name: TRD-FIGI
      * - ordBuySellInd                  COBOL Name: ORD-BUY-SELL-IND
      *
      * @throws CFException
      */
      @Override
      public ValidateSecurityOutCtx validateSecurity(ValidateSecurityInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

Trdpb000Ctx programCtx = methodIn.getTrdpb000Ctx();
ValidateSecurityOutCtx methodOut = methodIn.getValidateSecurityOutCtx();
//  INITIALIZE WS-SECURITY-IO
          methodOut.getSecurityIo().initialize();
//  MOVE ORD-FIGI TO WS-FIGI
          methodOut.setFigi(methodOut.getOrdFigi());
//  CALL WS-SECURITY-CHECK USING WS-SECURITY-IO END-CALL
          // CALL WS-SECURITY-CHECK USING WS-SECURITY-IO END-CALL
               programCtx.setRc( mstpb002.call(programCtx.getGlobalCtx().getContext("MSTPB002"),methodOut.getSecurityIo()));

// *
//  EVALUATE TRUE
          if  ( methodOut.isSecurityActive88()  ) { 
              ;
          }
          else if  ( methodOut.isSecurityNotFound88()  ) { 
//  SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              // MOVE ORD-TRADEID TO WS-TRADEID
              methodOut.setTradeid(padLeftZeros(9,methodOut.getOrdTradeid(),false));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'TradeId = ' WS-TRADEID ' : ' 'Rejected - Reason : SECURITY ' ORD-FIGI ' Not found' DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_869114500);
                 charArray.add(String.valueOf(methodOut.getTradeidString()).toCharArray());
                 charArray.add(CONSTANTS.LITERAL_B2_CL_);
                 charArray.add(CONSTANTS.LITERAL_Rejected_B5_MN_ReasonCL_SECURITY);
                 charArray.add(methodOut.getOrdFigi());
                 charArray.add(CONSTANTS.LITERAL_B2_Notfound);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
          else if  ( methodOut.isSecurityInactive88()  ) { 
//  SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              // MOVE ORD-TRADEID TO WS-TRADEID
              methodOut.setTradeid(padLeftZeros(9,methodOut.getOrdTradeid(),false));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'TradeId = ' WS-TRADEID ' : ' 'Rejected - Reason : SECURITY ' ORD-FIGI ' Not Active' DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_869114500);
                 charArray.add(String.valueOf(methodOut.getTradeidString()).toCharArray());
                 charArray.add(CONSTANTS.LITERAL_B2_CL_);
                 charArray.add(CONSTANTS.LITERAL_Rejected_B5_MN_ReasonCL_SECURITY);
                 charArray.add(methodOut.getOrdFigi());
                 charArray.add(CONSTANTS.LITERAL_B2_NotActive);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
          else if  ( methodOut.isSecurityException88()  ) { 
//  SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              // MOVE WS-SECURITY-ERROR-MSG TO WS-EXCEPTION
              methodOut.setException(methodOut.getSecurityErrorMsg());
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
//  IF 88-SECURITY-ACTIVE THEN
//  ELSE
          if (!(methodOut.isSecurityActive88()) ) { 

// * Update buyer/seller order status
//  SET OVERDUE-SECURITY-INVLD TO TRUE
              methodOut.setOverdueSecurityInvldTrue(); 
              
//  MOVE WS-ORDER-STATUS TO ORD-STATUS
              methodOut.setOrdStatus(methodOut.getOrderStatus());

// *
//  MOVE TRD-CURRENCY TO ORD-CURRENCY
              methodOut.setOrdCurrency(methodOut.getTrdCurrency());
//  MOVE TRD-EXCHANGE TO ORD-TRADING-XCHNG
              methodOut.setOrdTradingXchng(methodOut.getTrdExchange());
//  MOVE TRD-ORDER-ID TO ORD-TRADEID
              methodOut.setOrdTradeid(methodOut.getTrdOrderId());
//  MOVE TRD-FIGI TO ORD-FIGI
              methodOut.setOrdFigi(methodOut.getTrdFigi());
//  MOVE 'B' TO ORD-BUY-SELL-IND
//  LITERAL_B = 'B'
              methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_B);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
              updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/

// *
//  MOVE 'S' TO ORD-BUY-SELL-IND
//  LITERAL_S = 'S'
              methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_S);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
              updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
          }
      
      return methodOut;
      }
      /**
      * buyerSecAccount 
      *   This method is derived from 
  *   COBOL Paragraph - 5003-BUYER-SEC-ACCOUNT COBOL Cyclomatic complexity - 9
      * Input  :  

      * - trdBuyerId                     COBOL Name: TRD-BUYER-ID
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - sqlcode                        COBOL Name: SQLCODE
      * - sacStatus                      COBOL Name: SAC-STATUS
      * - sacNumber                      COBOL Name: SAC-NUMBER
      * - tradeid                        COBOL Name: WS-TRADEID
      * - trdExchange                    COBOL Name: TRD-EXCHANGE
      * - trdOrderId                     COBOL Name: TRD-ORDER-ID
      * - trdFigi                        COBOL Name: TRD-FIGI
      *
      * Output :  

      * - sacCustomerId                  COBOL Name: SAC-CUSTOMER-ID
      * - trdBuyerId                     COBOL Name: TRD-BUYER-ID
      * - sacCurrency                    COBOL Name: SAC-CURRENCY
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - trdBuyerSecAccNum              COBOL Name: TRD-BUYER-SEC-ACC-NUM
      * - sacNumber                      COBOL Name: SAC-NUMBER
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      * - accDisp                        COBOL Name: WS-ACC-DISP
      * - exception                      COBOL Name: WS-EXCEPTION
      * - orderStatus                    COBOL Name: WS-ORDER-STATUS
      * - ordStatus                      COBOL Name: ORD-STATUS
      * - ordCurrency                    COBOL Name: ORD-CURRENCY
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
      public BuyerSecAccountOutCtx buyerSecAccount(BuyerSecAccountInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

Trdpb000Ctx programCtx = methodIn.getTrdpb000Ctx();
BuyerSecAccountOutCtx methodOut = methodIn.getBuyerSecAccountOutCtx();

// *
// *
//  MOVE TRD-BUYER-ID TO SAC-CUSTOMER-ID
          methodOut.setSacCustomerId(methodOut.getTrdBuyerId());
//  MOVE TRD-CURRENCY TO SAC-CURRENCY
          methodOut.setSacCurrency(methodOut.getTrdCurrency());
//  SELECT SAC_NUMBER , SAC_STATUS FROM TBTRDSAC WHERE SAC_CUSTOMER_ID = ? AND SAC_CURRENCY = ? WITH UR
          trdpb000Repository.selectTbtrdsac(methodOut.getDcltbtrdsac(),programCtx.getSqlca());
          // MOVE SQLCODE TO WS-SQLCODE
          //  FORMAT1016334848 = "----"
          methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  IF SAC-STATUS = 'A'
//  LITERAL_A = 'A'
              if (compareChars(methodIn.getSacStatus(), CONSTANTS.LITERAL_A) == 0) { 
//  DISPLAY SAC-CUSTOMER-ID '**' SAC-CURRENCY '**' SAC-NUMBER
                  logger.info("{}**{}**{}", new String(methodOut.getSacCustomerId()), new String(methodOut.getSacCurrency()), String.valueOf(methodOut.getSacNumber())); 
//  MOVE SAC-NUMBER TO TRD-BUYER-SEC-ACC-NUM
                  methodOut.setTrdBuyerSecAccNum(methodOut.getSacNumber());
              }
//  ELSE
              else { 
//  SET DATA-EXCEPTION TO TRUE
                  methodOut.setDataExceptionTrue(); 
                  
                  // MOVE SAC-NUMBER TO WS-ACC-DISP
                  //  FORMAT2062690902 = "ZZZZZZZZZ"
                  methodOut.setAccDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT2062690902,String.valueOf(methodOut.getSacNumber()).toCharArray()));
                  // MOVE SPACES TO WS-EXCEPTION
                  methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'TradeId = ' WS-TRADEID ' : ' 'Rejected - Reason : Buyer Security Account' ' Not active - SAC Numnber  = ' WS-ACC-DISP DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_869114500);
                     charArray.add(String.valueOf(methodIn.getTradeidString()).toCharArray());
                     charArray.add(CONSTANTS.LITERAL_B2_CL_);
                     charArray.add(CONSTANTS.LITERAL_666609017);
                     charArray.add(CONSTANTS.LITERAL_1447400037);
                     charArray.add(methodOut.getAccDisp());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/

// *
// *                Update buyer/seller side order to overdue
// *
//  SET OVERDUE-BUYER-AC-INVLD TO TRUE
                  methodOut.setOverdueBuyerAcInvldTrue(); 
                  
//  MOVE WS-ORDER-STATUS TO ORD-STATUS
                  methodOut.setOrdStatus(methodOut.getOrderStatus());

// *
//  MOVE TRD-CURRENCY TO ORD-CURRENCY
                  methodOut.setOrdCurrency(methodOut.getTrdCurrency());
//  MOVE TRD-EXCHANGE TO ORD-TRADING-XCHNG
                  methodOut.setOrdTradingXchng(methodOut.getTrdExchange());
//  MOVE TRD-ORDER-ID TO ORD-TRADEID
                  methodOut.setOrdTradeid(methodOut.getTrdOrderId());
//  MOVE TRD-FIGI TO ORD-FIGI
                  methodOut.setOrdFigi(methodOut.getTrdFigi());
//  MOVE 'B' TO ORD-BUY-SELL-IND
//  LITERAL_B = 'B'
                  methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_B);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
                  updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
//  MOVE 'S' TO ORD-BUY-SELL-IND
//  LITERAL_S = 'S'
                  methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_S);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
                  updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
              }
          break;
          	case 100:
//  SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              // MOVE SAC-NUMBER TO WS-ACC-DISP
              //  FORMAT2062690902 = "ZZZZZZZZZ"
              methodOut.setAccDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT2062690902,String.valueOf(methodOut.getSacNumber()).toCharArray()));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'TradeId = ' WS-TRADEID ' : ' 'Rejected - Reason : Buyer Security Account' ' Not Found  - SAC Numnber  = ' WS-ACC-DISP DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_869114500);
                 charArray.add(String.valueOf(methodIn.getTradeidString()).toCharArray());
                 charArray.add(CONSTANTS.LITERAL_B2_CL_);
                 charArray.add(CONSTANTS.LITERAL_666609017);
                 charArray.add(CONSTANTS.LITERAL_827434643);
                 charArray.add(methodOut.getAccDisp());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/

// *
// *             Update buyer/seller side order to overdue
// *
//  SET OVERDUE-BUYER-AC-INVLD TO TRUE
              methodOut.setOverdueBuyerAcInvldTrue(); 
              
//  MOVE WS-ORDER-STATUS TO ORD-STATUS
              methodOut.setOrdStatus(methodOut.getOrderStatus());

// *
//  MOVE TRD-CURRENCY TO ORD-CURRENCY
              methodOut.setOrdCurrency(methodOut.getTrdCurrency());
//  MOVE TRD-EXCHANGE TO ORD-TRADING-XCHNG
              methodOut.setOrdTradingXchng(methodOut.getTrdExchange());
//  MOVE TRD-ORDER-ID TO ORD-TRADEID
              methodOut.setOrdTradeid(methodOut.getTrdOrderId());
//  MOVE TRD-FIGI TO ORD-FIGI
              methodOut.setOrdFigi(methodOut.getTrdFigi());
//  MOVE 'B' TO ORD-BUY-SELL-IND
//  LITERAL_B = 'B'
              methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_B);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
              updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
//  MOVE 'S' TO ORD-BUY-SELL-IND
//  LITERAL_S = 'S'
              methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_S);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
              updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
          break;
          default :
//  SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              // MOVE SAC-NUMBER TO WS-ACC-DISP
              //  FORMAT2062690902 = "ZZZZZZZZZ"
              methodOut.setAccDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT2062690902,String.valueOf(methodOut.getSacNumber()).toCharArray()));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'Buyer Security Account' ' Select Failed - SQLCODE  = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_Buyer_B2_SecurityAccount);
                 charArray.add(CONSTANTS.LITERAL_1953670068);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
      
      return methodOut;
      }
      /**
      * sellerSecAccount 
      *   This method is derived from 
  *   COBOL Paragraph - 5004-SELLER-SEC-ACCOUNT COBOL Cyclomatic complexity - 9
      * Input  :  

      * - trdSellerId                    COBOL Name: TRD-SELLER-ID
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - sqlcode                        COBOL Name: SQLCODE
      * - sacStatus                      COBOL Name: SAC-STATUS
      * - sacNumber                      COBOL Name: SAC-NUMBER
      * - tradeid                        COBOL Name: WS-TRADEID
      * - trdExchange                    COBOL Name: TRD-EXCHANGE
      * - trdOrderId                     COBOL Name: TRD-ORDER-ID
      * - trdFigi                        COBOL Name: TRD-FIGI
      *
      * Output :  

      * - sacCustomerId                  COBOL Name: SAC-CUSTOMER-ID
      * - trdSellerId                    COBOL Name: TRD-SELLER-ID
      * - sacCurrency                    COBOL Name: SAC-CURRENCY
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - trdSellerSecAccNum             COBOL Name: TRD-SELLER-SEC-ACC-NUM
      * - sacNumber                      COBOL Name: SAC-NUMBER
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      * - accDisp                        COBOL Name: WS-ACC-DISP
      * - exception                      COBOL Name: WS-EXCEPTION
      * - orderStatus                    COBOL Name: WS-ORDER-STATUS
      * - ordStatus                      COBOL Name: ORD-STATUS
      * - ordCurrency                    COBOL Name: ORD-CURRENCY
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
      public SellerSecAccountOutCtx sellerSecAccount(SellerSecAccountInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

Trdpb000Ctx programCtx = methodIn.getTrdpb000Ctx();
SellerSecAccountOutCtx methodOut = methodIn.getSellerSecAccountOutCtx();
//  MOVE TRD-SELLER-ID TO SAC-CUSTOMER-ID
          methodOut.setSacCustomerId(methodOut.getTrdSellerId());
//  MOVE TRD-CURRENCY TO SAC-CURRENCY
          methodOut.setSacCurrency(methodOut.getTrdCurrency());
//  SELECT SAC_NUMBER , SAC_STATUS FROM TBTRDSAC WHERE SAC_CUSTOMER_ID = ? AND SAC_CURRENCY = ? WITH UR
          trdpb000Repository.selectTbtrdsac1(methodOut.getDcltbtrdsac(),programCtx.getSqlca());
          // MOVE SQLCODE TO WS-SQLCODE
          //  FORMAT1016334848 = "----"
          methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  IF SAC-STATUS = 'A'
//  LITERAL_A = 'A'
              if (compareChars(methodIn.getSacStatus(), CONSTANTS.LITERAL_A) == 0) { 
//  MOVE SAC-NUMBER TO TRD-SELLER-SEC-ACC-NUM
                  methodOut.setTrdSellerSecAccNum(methodOut.getSacNumber());
              }
//  ELSE
              else { 
//  SET DATA-EXCEPTION TO TRUE
                  methodOut.setDataExceptionTrue(); 
                  
                  // MOVE SAC-NUMBER TO WS-ACC-DISP
                  //  FORMAT2062690902 = "ZZZZZZZZZ"
                  methodOut.setAccDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT2062690902,String.valueOf(methodOut.getSacNumber()).toCharArray()));
                  // MOVE SPACES TO WS-EXCEPTION
                  methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'TradeId = ' WS-TRADEID ' : ' 'Rejected - Reason : Seller Security Account' ' Not active - SAC Numnber  = ' WS-ACC-DISP DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_869114500);
                     charArray.add(String.valueOf(methodIn.getTradeidString()).toCharArray());
                     charArray.add(CONSTANTS.LITERAL_B2_CL_);
                     charArray.add(CONSTANTS.LITERAL_515132925);
                     charArray.add(CONSTANTS.LITERAL_1447400037);
                     charArray.add(methodOut.getAccDisp());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/

// *
// *                Update buyer/seller side order to overdue
// *
//  SET OVERDUE-SELLER-AC-INVLD TO TRUE
                  methodOut.setOverdueSellerAcInvldTrue(); 
                  
//  MOVE WS-ORDER-STATUS TO ORD-STATUS
                  methodOut.setOrdStatus(methodOut.getOrderStatus());

// *
//  MOVE TRD-CURRENCY TO ORD-CURRENCY
                  methodOut.setOrdCurrency(methodOut.getTrdCurrency());
//  MOVE TRD-EXCHANGE TO ORD-TRADING-XCHNG
                  methodOut.setOrdTradingXchng(methodOut.getTrdExchange());
//  MOVE TRD-ORDER-ID TO ORD-TRADEID
                  methodOut.setOrdTradeid(methodOut.getTrdOrderId());
//  MOVE TRD-FIGI TO ORD-FIGI
                  methodOut.setOrdFigi(methodOut.getTrdFigi());
//  MOVE 'B' TO ORD-BUY-SELL-IND
//  LITERAL_B = 'B'
                  methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_B);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
                  updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
//  MOVE 'S' TO ORD-BUY-SELL-IND
//  LITERAL_S = 'S'
                  methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_S);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
                  updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
              }
          break;
          	case 100:
//  SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              // MOVE SAC-NUMBER TO WS-ACC-DISP
              //  FORMAT2062690902 = "ZZZZZZZZZ"
              methodOut.setAccDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT2062690902,String.valueOf(methodOut.getSacNumber()).toCharArray()));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'TradeId = ' WS-TRADEID ' : ' 'Rejected - Reason : Seller Security Account' ' Not Found  - SAC Numnber  = ' WS-ACC-DISP DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_869114500);
                 charArray.add(String.valueOf(methodIn.getTradeidString()).toCharArray());
                 charArray.add(CONSTANTS.LITERAL_B2_CL_);
                 charArray.add(CONSTANTS.LITERAL_515132925);
                 charArray.add(CONSTANTS.LITERAL_827434643);
                 charArray.add(methodOut.getAccDisp());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/

// *
// *             Update buyer/seller side order to overdue
// *
//  SET OVERDUE-SELLER-AC-INVLD TO TRUE
              methodOut.setOverdueSellerAcInvldTrue(); 
              
//  MOVE WS-ORDER-STATUS TO ORD-STATUS
              methodOut.setOrdStatus(methodOut.getOrderStatus());

// *
//  MOVE TRD-CURRENCY TO ORD-CURRENCY
              methodOut.setOrdCurrency(methodOut.getTrdCurrency());
//  MOVE TRD-EXCHANGE TO ORD-TRADING-XCHNG
              methodOut.setOrdTradingXchng(methodOut.getTrdExchange());
//  MOVE TRD-ORDER-ID TO ORD-TRADEID
              methodOut.setOrdTradeid(methodOut.getTrdOrderId());
//  MOVE TRD-FIGI TO ORD-FIGI
              methodOut.setOrdFigi(methodOut.getTrdFigi());
//  MOVE 'B' TO ORD-BUY-SELL-IND
//  LITERAL_B = 'B'
              methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_B);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
              updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
//  MOVE 'S' TO ORD-BUY-SELL-IND
//  LITERAL_S = 'S'
              methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_S);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
              updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
          break;
          default :
//  SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              // MOVE SAC-NUMBER TO WS-ACC-DISP
              //  FORMAT2062690902 = "ZZZZZZZZZ"
              methodOut.setAccDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT2062690902,String.valueOf(methodOut.getSacNumber()).toCharArray()));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'Seller Security Account' ' Select Failed - SQLCODE  = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_Seller_B2_SecurityAccount);
                 charArray.add(CONSTANTS.LITERAL_1953670068);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
      
      return methodOut;
      }
      /**
      * buyerMoneyAccount 
      *   This method is derived from 
  *   COBOL Paragraph - 5005-BUYER-MONEY-ACCOUNT COBOL Cyclomatic complexity - 9
      * Input  :  

      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - trdBuyerId                     COBOL Name: TRD-BUYER-ID
      * - sqlcode                        COBOL Name: SQLCODE
      * - macStatus                      COBOL Name: MAC-STATUS
      * - macNumber                      COBOL Name: MAC-NUMBER
      * - tradeid                        COBOL Name: WS-TRADEID
      * - trdExchange                    COBOL Name: TRD-EXCHANGE
      * - trdOrderId                     COBOL Name: TRD-ORDER-ID
      * - trdFigi                        COBOL Name: TRD-FIGI
      *
      * Output :  

      * - macCurrency                    COBOL Name: MAC-CURRENCY
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - macCustomerId                  COBOL Name: MAC-CUSTOMER-ID
      * - trdBuyerId                     COBOL Name: TRD-BUYER-ID
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - trdBuyerMoneyAccNum            COBOL Name: TRD-BUYER-MONEY-ACC-NUM
      * - macNumber                      COBOL Name: MAC-NUMBER
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      * - accDisp                        COBOL Name: WS-ACC-DISP
      * - exception                      COBOL Name: WS-EXCEPTION
      * - orderStatus                    COBOL Name: WS-ORDER-STATUS
      * - ordStatus                      COBOL Name: ORD-STATUS
      * - ordCurrency                    COBOL Name: ORD-CURRENCY
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
      public BuyerMoneyAccountOutCtx buyerMoneyAccount(BuyerMoneyAccountInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

Trdpb000Ctx programCtx = methodIn.getTrdpb000Ctx();
BuyerMoneyAccountOutCtx methodOut = methodIn.getBuyerMoneyAccountOutCtx();
//  MOVE TRD-CURRENCY TO MAC-CURRENCY
          methodOut.setMacCurrency(methodOut.getTrdCurrency());
//  MOVE TRD-BUYER-ID TO MAC-CUSTOMER-ID
          methodOut.setMacCustomerId(methodOut.getTrdBuyerId());
//  SELECT MAC_NUMBER , MAC_STATUS FROM TBTRDMAC WHERE MAC_CURRENCY = ? AND MAC_CUSTOMER_ID = ? WITH UR
          trdpb000Repository.selectTbtrdmac(methodOut.getDcltbtrdmac(),programCtx.getSqlca());
          // MOVE SQLCODE TO WS-SQLCODE
          //  FORMAT1016334848 = "----"
          methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  IF MAC-STATUS = 'A'
//  LITERAL_A = 'A'
              if (compareChars(methodIn.getMacStatus(), CONSTANTS.LITERAL_A) == 0) { 
//  MOVE MAC-NUMBER TO TRD-BUYER-MONEY-ACC-NUM
                  methodOut.setTrdBuyerMoneyAccNum(methodOut.getMacNumber());
              }
//  ELSE
              else { 
//  SET DATA-EXCEPTION TO TRUE
                  methodOut.setDataExceptionTrue(); 
                  
                  // MOVE MAC-NUMBER TO WS-ACC-DISP
                  //  FORMAT2062690902 = "ZZZZZZZZZ"
                  methodOut.setAccDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT2062690902,String.valueOf(methodOut.getMacNumber()).toCharArray()));
                  // MOVE SPACES TO WS-EXCEPTION
                  methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'TradeId = ' WS-TRADEID ' : ' 'Rejected - Reason : Buyer Money Account' ' Not active - MAC Numnber  = ' WS-ACC-DISP DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_869114500);
                     charArray.add(String.valueOf(methodIn.getTradeidString()).toCharArray());
                     charArray.add(CONSTANTS.LITERAL_B2_CL_);
                     charArray.add(CONSTANTS.LITERAL_1343196337);
                     charArray.add(CONSTANTS.LITERAL_215637803);
                     charArray.add(methodOut.getAccDisp());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/

// *
// *                Update buyer/seller side order to overdue
// *
//  SET OVERDUE-BUYER-AC-INVLD TO TRUE
                  methodOut.setOverdueBuyerAcInvldTrue(); 
                  
//  MOVE WS-ORDER-STATUS TO ORD-STATUS
                  methodOut.setOrdStatus(methodOut.getOrderStatus());

// *
//  MOVE TRD-CURRENCY TO ORD-CURRENCY
                  methodOut.setOrdCurrency(methodOut.getTrdCurrency());
//  MOVE TRD-EXCHANGE TO ORD-TRADING-XCHNG
                  methodOut.setOrdTradingXchng(methodOut.getTrdExchange());
//  MOVE TRD-ORDER-ID TO ORD-TRADEID
                  methodOut.setOrdTradeid(methodOut.getTrdOrderId());
//  MOVE TRD-FIGI TO ORD-FIGI
                  methodOut.setOrdFigi(methodOut.getTrdFigi());
//  MOVE 'B' TO ORD-BUY-SELL-IND
//  LITERAL_B = 'B'
                  methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_B);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
                  updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
//  MOVE 'S' TO ORD-BUY-SELL-IND
//  LITERAL_S = 'S'
                  methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_S);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
                  updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
              }
          break;
          	case 100:
//  SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              // MOVE MAC-NUMBER TO WS-ACC-DISP
              //  FORMAT2062690902 = "ZZZZZZZZZ"
              methodOut.setAccDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT2062690902,String.valueOf(methodOut.getMacNumber()).toCharArray()));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'TradeId = ' WS-TRADEID ' : ' 'Rejected - Reason : Buyer Money Account' ' Not Found  - MAC Numnber  = ' WS-ACC-DISP DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_869114500);
                 charArray.add(String.valueOf(methodIn.getTradeidString()).toCharArray());
                 charArray.add(CONSTANTS.LITERAL_B2_CL_);
                 charArray.add(CONSTANTS.LITERAL_1343196337);
                 charArray.add(CONSTANTS.LITERAL_2059196877);
                 charArray.add(methodOut.getAccDisp());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/

// *
// *             Update buyer/seller side order to overdue
// *
//  SET OVERDUE-BUYER-AC-INVLD TO TRUE
              methodOut.setOverdueBuyerAcInvldTrue(); 
              
//  MOVE WS-ORDER-STATUS TO ORD-STATUS
              methodOut.setOrdStatus(methodOut.getOrderStatus());

// *
//  MOVE TRD-CURRENCY TO ORD-CURRENCY
              methodOut.setOrdCurrency(methodOut.getTrdCurrency());
//  MOVE TRD-EXCHANGE TO ORD-TRADING-XCHNG
              methodOut.setOrdTradingXchng(methodOut.getTrdExchange());
//  MOVE TRD-ORDER-ID TO ORD-TRADEID
              methodOut.setOrdTradeid(methodOut.getTrdOrderId());
//  MOVE TRD-FIGI TO ORD-FIGI
              methodOut.setOrdFigi(methodOut.getTrdFigi());
//  MOVE 'B' TO ORD-BUY-SELL-IND
//  LITERAL_B = 'B'
              methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_B);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
              updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
//  MOVE 'S' TO ORD-BUY-SELL-IND
//  LITERAL_S = 'S'
              methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_S);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
              updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
          break;
          default :
//  SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              // MOVE MAC-NUMBER TO WS-ACC-DISP
              //  FORMAT2062690902 = "ZZZZZZZZZ"
              methodOut.setAccDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT2062690902,String.valueOf(methodOut.getMacNumber()).toCharArray()));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'Buyer Money Account' ' Select Failed - SQLCODE  = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_Buyer_B2_MoneyAccount);
                 charArray.add(CONSTANTS.LITERAL_1953670068);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
      
      return methodOut;
      }
      /**
      * sellerMoneyAccount 
      *   This method is derived from 
  *   COBOL Paragraph - 5006-SELLER-MONEY-ACCOUNT COBOL Cyclomatic complexity - 9
      * Input  :  

      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - trdSellerId                    COBOL Name: TRD-SELLER-ID
      * - sqlcode                        COBOL Name: SQLCODE
      * - macStatus                      COBOL Name: MAC-STATUS
      * - macNumber                      COBOL Name: MAC-NUMBER
      * - tradeid                        COBOL Name: WS-TRADEID
      * - trdExchange                    COBOL Name: TRD-EXCHANGE
      * - trdOrderId                     COBOL Name: TRD-ORDER-ID
      * - trdFigi                        COBOL Name: TRD-FIGI
      *
      * Output :  

      * - macCurrency                    COBOL Name: MAC-CURRENCY
      * - trdCurrency                    COBOL Name: TRD-CURRENCY
      * - macCustomerId                  COBOL Name: MAC-CUSTOMER-ID
      * - trdSellerId                    COBOL Name: TRD-SELLER-ID
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - trdSellerMoneyAccNum           COBOL Name: TRD-SELLER-MONEY-ACC-NUM
      * - macNumber                      COBOL Name: MAC-NUMBER
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      * - accDisp                        COBOL Name: WS-ACC-DISP
      * - exception                      COBOL Name: WS-EXCEPTION
      * - orderStatus                    COBOL Name: WS-ORDER-STATUS
      * - ordStatus                      COBOL Name: ORD-STATUS
      * - ordCurrency                    COBOL Name: ORD-CURRENCY
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
      public SellerMoneyAccountOutCtx sellerMoneyAccount(SellerMoneyAccountInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

Trdpb000Ctx programCtx = methodIn.getTrdpb000Ctx();
SellerMoneyAccountOutCtx methodOut = methodIn.getSellerMoneyAccountOutCtx();

// *
// *
//  MOVE TRD-CURRENCY TO MAC-CURRENCY
          methodOut.setMacCurrency(methodOut.getTrdCurrency());
//  MOVE TRD-SELLER-ID TO MAC-CUSTOMER-ID
          methodOut.setMacCustomerId(methodOut.getTrdSellerId());
//  SELECT MAC_NUMBER , MAC_STATUS FROM TBTRDMAC WHERE MAC_CURRENCY = ? AND MAC_CUSTOMER_ID = ? WITH UR
          trdpb000Repository.selectTbtrdmac1(methodOut.getDcltbtrdmac(),programCtx.getSqlca());
          // MOVE SQLCODE TO WS-SQLCODE
          //  FORMAT1016334848 = "----"
          methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  IF MAC-STATUS = 'A'
//  LITERAL_A = 'A'
              if (compareChars(methodIn.getMacStatus(), CONSTANTS.LITERAL_A) == 0) { 
//  MOVE MAC-NUMBER TO TRD-SELLER-MONEY-ACC-NUM
                  methodOut.setTrdSellerMoneyAccNum(methodOut.getMacNumber());
              }
//  ELSE
              else { 
//  SET DATA-EXCEPTION TO TRUE
                  methodOut.setDataExceptionTrue(); 
                  
                  // MOVE MAC-NUMBER TO WS-ACC-DISP
                  //  FORMAT2062690902 = "ZZZZZZZZZ"
                  methodOut.setAccDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT2062690902,String.valueOf(methodOut.getMacNumber()).toCharArray()));
                  // MOVE SPACES TO WS-EXCEPTION
                  methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'TradeId = ' WS-TRADEID ' : ' 'Rejected - Reason : Seller Money Account' ' Not active - MAC Numnber  = ' WS-ACC-DISP DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
                  charArray = new ArrayList<char[]>();
                     charArray.add(CONSTANTS.LITERAL_869114500);
                     charArray.add(String.valueOf(methodIn.getTradeidString()).toCharArray());
                     charArray.add(CONSTANTS.LITERAL_B2_CL_);
                     charArray.add(CONSTANTS.LITERAL_616833945);
                     charArray.add(CONSTANTS.LITERAL_215637803);
                     charArray.add(methodOut.getAccDisp());
                  joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5));
                  updated = updateString(methodOut.getException() ,joinCharArray);
                  methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
                  reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/

// *
//  SET OVERDUE-SELLER-AC-INVLD TO TRUE
                  methodOut.setOverdueSellerAcInvldTrue(); 
                  
//  MOVE WS-ORDER-STATUS TO ORD-STATUS
                  methodOut.setOrdStatus(methodOut.getOrderStatus());

// *
//  MOVE TRD-CURRENCY TO ORD-CURRENCY
                  methodOut.setOrdCurrency(methodOut.getTrdCurrency());
//  MOVE TRD-EXCHANGE TO ORD-TRADING-XCHNG
                  methodOut.setOrdTradingXchng(methodOut.getTrdExchange());
//  MOVE TRD-ORDER-ID TO ORD-TRADEID
                  methodOut.setOrdTradeid(methodOut.getTrdOrderId());
//  MOVE TRD-FIGI TO ORD-FIGI
                  methodOut.setOrdFigi(methodOut.getTrdFigi());
//  MOVE 'B' TO ORD-BUY-SELL-IND
//  LITERAL_B = 'B'
                  methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_B);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
                  updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
//  MOVE 'S' TO ORD-BUY-SELL-IND
//  LITERAL_S = 'S'
                  methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_S);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
                  updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
              }
          break;
          	case 100:
//  SET DATA-EXCEPTION TO TRUE
              methodOut.setDataExceptionTrue(); 
              
              // MOVE MAC-NUMBER TO WS-ACC-DISP
              //  FORMAT2062690902 = "ZZZZZZZZZ"
              methodOut.setAccDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT2062690902,String.valueOf(methodOut.getMacNumber()).toCharArray()));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'TradeId = ' WS-TRADEID ' : ' 'Rejected - Reason : Seller Money Account' ' Not Found  - MAC Numnber  = ' WS-ACC-DISP DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_869114500);
                 charArray.add(String.valueOf(methodIn.getTradeidString()).toCharArray());
                 charArray.add(CONSTANTS.LITERAL_B2_CL_);
                 charArray.add(CONSTANTS.LITERAL_616833945);
                 charArray.add(CONSTANTS.LITERAL_2059196877);
                 charArray.add(methodOut.getAccDisp());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/

// *
// *             Update buyer/seller side order to overdue
// *
//  SET OVERDUE-SELLER-AC-INVLD TO TRUE
              methodOut.setOverdueSellerAcInvldTrue(); 
              
//  MOVE WS-ORDER-STATUS TO ORD-STATUS
              methodOut.setOrdStatus(methodOut.getOrderStatus());

// *
//  MOVE TRD-CURRENCY TO ORD-CURRENCY
              methodOut.setOrdCurrency(methodOut.getTrdCurrency());
//  MOVE TRD-EXCHANGE TO ORD-TRADING-XCHNG
              methodOut.setOrdTradingXchng(methodOut.getTrdExchange());
//  MOVE TRD-ORDER-ID TO ORD-TRADEID
              methodOut.setOrdTradeid(methodOut.getTrdOrderId());
//  MOVE TRD-FIGI TO ORD-FIGI
              methodOut.setOrdFigi(methodOut.getTrdFigi());
//  MOVE 'B' TO ORD-BUY-SELL-IND
//  LITERAL_B = 'B'
              methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_B);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
              updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
//  MOVE 'S' TO ORD-BUY-SELL-IND
//  LITERAL_S = 'S'
              methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_S);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
              updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
          break;
          default :
//  SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              // MOVE MAC-NUMBER TO WS-ACC-DISP
              //  FORMAT2062690902 = "ZZZZZZZZZ"
              methodOut.setAccDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT2062690902,String.valueOf(methodOut.getMacNumber()).toCharArray()));
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'Seller Money Account' ' Select Failed - SQLCODE  = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_Seller_B2_MoneyAccount);
                 charArray.add(CONSTANTS.LITERAL_1953670068);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
      
      return methodOut;
      }
      /**
      * updateOrderMatched 
      *   This method is derived from 
  *   COBOL Paragraph - 5007-UPDATE-ORDER-MATCHED COBOL Cyclomatic complexity - 1
      * Input  :  

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
      public UpdateOrderMatchedOutCtx updateOrderMatched(UpdateOrderMatchedInCtx methodIn) throws Exception {
Trdpb000Ctx programCtx = methodIn.getTrdpb000Ctx();
UpdateOrderMatchedOutCtx methodOut = methodIn.getUpdateOrderMatchedOutCtx();
//  SET MATCHED TO TRUE
          methodOut.setMatchedTrue(); 
          
//  MOVE WS-ORDER-STATUS TO ORD-STATUS
          methodOut.setOrdStatus(methodOut.getOrderStatus());
//  MOVE TRD-CURRENCY TO ORD-CURRENCY
          methodOut.setOrdCurrency(methodOut.getTrdCurrency());
//  MOVE TRD-EXCHANGE TO ORD-TRADING-XCHNG
          methodOut.setOrdTradingXchng(methodOut.getTrdExchange());
//  MOVE TRD-ORDER-ID TO ORD-TRADEID
          methodOut.setOrdTradeid(methodOut.getTrdOrderId());
//  MOVE TRD-FIGI TO ORD-FIGI
          methodOut.setOrdFigi(methodOut.getTrdFigi());
//  MOVE 'B' TO ORD-BUY-SELL-IND
//  LITERAL_B = 'B'
          methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_B);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
          updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
//  MOVE 'S' TO ORD-BUY-SELL-IND
//  LITERAL_S = 'S'
          methodOut.setOrdBuySellInd(CONSTANTS.LITERAL_S);
//  PERFORM 8000-UPDATE-ORDER THRU 8000-EXIT
          updateOrder(programCtx.getUpdateOrderInCtx());/*8000-UPDATE-ORDER*/
      
      return methodOut;
      }
      /**
      * writeToStlmtQueue 
      *   This method is derived from 
  *   COBOL Paragraph - 5008-WRITE-TO-STLMT-QUEUE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - stqIndex                       COBOL Name: WS-STQ-INDEX
      * - trdOrderPair                   COBOL Name: TRD-ORDER-PAIR
      *
      * Output :  

      * - stqIndex                       COBOL Name: WS-STQ-INDEX
      * - stqTrdpair                     COBOL Name: WS-STQ-TRDPAIR
      * - trdOrderPair                   COBOL Name: TRD-ORDER-PAIR
      *
      * @throws CFException
      */
      @Override
      public WriteToStlmtQueueOutCtx writeToStlmtQueue(WriteToStlmtQueueInCtx methodIn) throws Exception {
Trdpb000Ctx programCtx = methodIn.getTrdpb000Ctx();
WriteToStlmtQueueOutCtx methodOut = methodIn.getWriteToStlmtQueueOutCtx();
//  ADD 1 TO WS-STQ-INDEX
          methodOut.setStqIndex( (short) (methodOut.getStqIndex()+(short)1));
//  MOVE TRD-ORDER-PAIR TO WS-STQ-TRDPAIR ( WS-STQ-INDEX )
          methodOut.setStqTrdpair(methodOut.getStqIndex() - 1,methodOut.getTrdOrderPair().getCharArray());
//  DISPLAY '(' TRD-ORDER-PAIR ')'
          logger.info("({})", methodOut.getTrdOrderPair().toString()); 

// *
//  IF WS-STQ-INDEX = 100 THEN
          if (	( methodOut.getStqIndex() == 100 ) ) { 
//  PERFORM 5009-INSERT-TO-STQ THRU 5009-EXIT
              insertToStq(programCtx.getInsertToStqInCtx());/*5009-INSERT-TO-STQ*/
//  MOVE 0 TO WS-STQ-INDEX
              methodOut.setStqIndex((short)0);
          }
      
      return methodOut;
      }
      /**
      * insertToStq 
      *   This method is derived from 
  *   COBOL Paragraph - 5009-INSERT-TO-STQ COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - excpType                       COBOL Name: WS-EXCP-TYPE
      * - exception                      COBOL Name: WS-EXCEPTION
      *
      * @throws CFException
      */
      @Override
      public InsertToStqOutCtx insertToStq(InsertToStqInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

Trdpb000Ctx programCtx = methodIn.getTrdpb000Ctx();
InsertToStqOutCtx methodOut = methodIn.getInsertToStqOutCtx();
//  INSERT INTO TBTRDSTQ ( STQ_CURRENCY , STQ_TRADE_DATA ) VALUES ( ? , ? ) FOR ? ROWS NOT ATOMIC CONTINUE ON SQLEXCEPTION
          trdpb000Repository.insertTbtrdstq(methodIn.getSettlmentQueueTable(),programCtx.getSqlca());

// *
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
          break;
          default :
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'Settlement Queue Insert Failed with SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_2074541536);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
          ;
      
      return methodOut;
      }
      /**
      * updateOrder 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-UPDATE-ORDER COBOL Cyclomatic complexity - 9
      * Input  :  

      * - ordStatus                      COBOL Name: ORD-STATUS
      * - ordBuySellInd                  COBOL Name: ORD-BUY-SELL-IND
      * - trdBuyerId                     COBOL Name: TRD-BUYER-ID
      * - trdSellerId                    COBOL Name: TRD-SELLER-ID
      * - currency01                     COBOL Name: LK-CURRENCY
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
      * - summaryCurrency                COBOL Name: WS-SUMMARY-CURRENCY
      * - currency01                     COBOL Name: LK-CURRENCY
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

Trdpb000Ctx programCtx = methodIn.getTrdpb000Ctx();
UpdateOrderOutCtx methodOut = methodIn.getUpdateOrderOutCtx();
//  SET DO-SQL TO TRUE
          methodOut.setDoSqlTrue(); 
          
//  PERFORM UNTIL SQL-DONE
          while ((!(methodOut.isSqlDone()) )) {
              // MOVE 0 TO SQLCODE
              methodOut.setSqlcode(0);
//  UPDATE TBTRDORD SET ORD_STATUS = ? WHERE ORD_CURRENCY = ? AND ORD_TRADING_XCHNG = ? AND ORD_TRADEID = ? AND ORD_FIGI = ? AND ORD_BUY_SELL_IND = ?
              trdpb000Repository.updateTbtrdord(programCtx.getSqlca(),methodIn.getDcltbtrdord());
//  IF SQLCODE = -911 OR -913 THEN
              if (	( methodOut.getSqlcode() == -911 ) || 	( methodOut.getSqlcode() == -913 )) { 
//  SET RETRY-SQL TO TRUE
                  methodOut.setRetrySqlTrue(); 
                  
              }
//  ELSE
              else { 
//  SET SQL-DONE TO TRUE
                  methodOut.setSqlDoneTrue(); 
                  
              }
          }
//  IF SQLCODE NOT = 0 THEN
          if (	( methodOut.getSqlcode() != 0 )) { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'Update of Order failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_973364791);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
//  MOVE ORD-STATUS TO WS-ORDER-STATUS
          methodOut.setOrderStatus(methodOut.getOrdStatus());
//  IF OVERDUE
          if ( methodOut.isOverdue()  ) { 
//  INITIALIZE WS-CUSTOMER-SUMMARY-REC
              methodOut.getCustomerSummaryRec().initialize();
//  SET 88-SUMMARY-NO-BOOKING TO TRUE
              methodOut.setSummaryNoBooking88True(); 
              
//  IF ORD-BUY-SELL-IND = 'B' THEN
//  LITERAL_B = 'B'
              if (compareChars(methodIn.getOrdBuySellInd(), CONSTANTS.LITERAL_B) == 0) { 
//  MOVE TRD-BUYER-ID TO WS-SUMMARY-CUSTOMER-ID
                  methodOut.setSummaryCustomerId(methodOut.getTrdBuyerId());
              }
//  ELSE
              else { 
//  MOVE TRD-SELLER-ID TO WS-SUMMARY-CUSTOMER-ID
                  methodOut.setSummaryCustomerId(methodOut.getTrdSellerId());
              }
//  MOVE LK-CURRENCY TO WS-SUMMARY-CURRENCY
              methodOut.setSummaryCurrency(methodOut.getCurrency01());
//  PERFORM 8001-LOG-SUMMARY THRU 8001-EXIT
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

Trdpb000Ctx programCtx = methodIn.getTrdpb000Ctx();
ReportExceptionOutCtx methodOut = methodIn.getReportExceptionOutCtx();
//  MOVE WS-EXCEPTION TO EXCEPTION-DESC
          methodOut.setExceptionDesc(pad(1000,methodOut.getException(),SPACE_CHAR,RIGHT_PAD));
//  MOVE LENGTH OF WS-EXCEPTION TO EXCEPTION-RECORD-LEN
          methodOut.setExceptionRecordLen((short) EXCEPTION_LENGTH);
//  EVALUATE TRUE
          if  ( methodIn.isSystemException()  ) { 
//  MOVE 'SYSTEM' TO EXCEPTION-TYPE
              methodOut.setExceptionType(CONSTANTS.LITERAL_SYSTEM_B14_);
          }
          else if  ( methodIn.isApplException()  ) { 
//  MOVE 'APPLICATION' TO EXCEPTION-TYPE
              methodOut.setExceptionType(CONSTANTS.LITERAL_APPLICATION_B9_);
          }
          else if  ( methodIn.isDataException()  ) { 
//  MOVE 'DATA' TO EXCEPTION-TYPE
              methodOut.setExceptionType(CONSTANTS.LITERAL_DATA_B16_);
          }
//  ADD 46 TO EXCEPTION-RECORD-LEN
          methodOut.setExceptionRecordLen( (short) (methodOut.getExceptionRecordLen()+(short)46));

// *
//  CALL WS-EXCEPTION-HANDLER USING EXCEPTION-RECORD-LEN , EXCEPTION-RECORD
          
// *
          // CALL WS-EXCEPTION-HANDLER USING EXCEPTION-RECORD-LEN , EXCEPTION-RECORD
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

Trdpb000Ctx programCtx = methodIn.getTrdpb000Ctx();
LogSummaryOutCtx methodOut = methodIn.getLogSummaryOutCtx();

// *
// * Check if customer summary row exits
// *
//  MOVE WS-SUMMARY-CUSTOMER-ID TO SUM-CUSTOMER-ID
          methodOut.setSumCustomerId(methodOut.getSummaryCustomerId());
//  SELECT SUM_CUSTOMER_ID , SUM_OVERDUE , SUM_REJECTED , SUM_SETTLED , SUM_CURRENCY , SUM_OPEN_BALANCE , SUM_TOTAL_DEBIT , SUM_TOTAL_CREDIT , SUM_CLOSE_BALANCE FROM TBTRDSUM WHERE SUM_CUSTOMER_ID = ? FOR UPDATE OF SUM_OVERDUE , SUM_REJECTED , SUM_SETTLED , SUM_CURRENCY , SUM_OPEN_BALANCE , SUM_TOTAL_DEBIT , SUM_TOTAL_CREDIT , SUM_CLOSE_BALANCE
          programCtx.setSummaryCsrResultSet(trdpb000Repository.openSummaryCsrTrdpb000(methodOut.getDcltbtrdsum(),programCtx.getSqlca()));
//  IF SQLCODE NOT = 0 THEN
          if (	( methodOut.getSqlcode() != 0 )) { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'Summary Cursor OPEN Failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_882352633);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
//  FETCH SUMMARY_CSR INTO ? , ? , ? , ? , ? , ? , ? , ? , ?
          trdpb000Repository.fetchSummaryCsrTrdpb000(programCtx.getSummaryCsrResultSet(),methodOut.getDcltbtrdsum(),programCtx.getSqlca());
//  IF SQLCODE = 0 OR 100 THEN
//  ELSE
          if (	( methodOut.getSqlcode() != 0 ) && 	( methodOut.getSqlcode() != 100 )) { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'Summary Cursor OPEN Failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_882352633);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
//  IF SQLCODE = 100 THEN
          if (	( methodOut.getSqlcode() == 100 )) { 
//  SET 88-CUSTOMER-SUMMARY-WRITE TO TRUE
              methodOut.setCustomerSummaryWrite88True(); 
              
//  MOVE ZERO TO SUM-OVERDUE SUM-REJECTED SUM-SETTLED SUM-CURRENCY SUM-OPEN-BALANCE SUM-TOTAL-DEBIT SUM-TOTAL-CREDIT SUM-CLOSE-BALANCE
              methodOut.setSumOverdue(0);
              methodOut.setSumRejected(0);
              methodOut.setSumSettled(0);
              methodOut.setSumCurrency(CONSTANTS.ZERO_3);
              methodOut.setSumOpenBalance(BigDecimal.ZERO);
              methodOut.setSumTotalDebit(BigDecimal.ZERO);
              methodOut.setSumTotalCredit(BigDecimal.ZERO);
              methodOut.setSumCloseBalance(BigDecimal.ZERO);
          }
//  ELSE
          else { 
//  SET 88-CUSTOMER-SUMMARY-REWRITE TO TRUE
              methodOut.setCustomerSummaryRewrite88True(); 
              
              // MOVE DCLTBTRDSUM TO WS-CUSTOMER-SUMMARY-REC
              methodOut.getCustomerSummaryRec().setString(methodOut.getDcltbtrdsum().getCharArray());
          }

// *
//  IF ( 88-SUMMARY-DEBIT OR 88-SUMMARY-CREDIT ) AND SUM-OPEN-BALANCE = 0 THEN
          if (( methodIn.isSummaryDebit88()   ||  methodIn.isSummaryCredit88()  ) && 	( methodOut.getSumOpenBalance().compareTo(BigDecimal.valueOf(0)) == 0)) { 
//  MOVE TRD-CURRENCY TO MAC-CURRENCY
              methodOut.setMacCurrency(methodOut.getTrdCurrency());
//  IF TRD-BUYER-ID = SUM-CUSTOMER-ID
              if (		compareChars(methodIn.getTrdBuyerId(),methodOut.getSumCustomerId()) == 0 ) { 
//  MOVE TRD-BUYER-MONEY-ACC-NUM TO MAC-NUMBER
                  methodOut.setMacNumber(methodOut.getTrdBuyerMoneyAccNum());
              }
//  ELSE
              else { 
//  MOVE TRD-SELLER-MONEY-ACC-NUM TO MAC-NUMBER
                  methodOut.setMacNumber(methodOut.getTrdSellerMoneyAccNum());
              }
//  SELECT MAC_BALANCE FROM TBTRDMAC WHERE MAC_CURRENCY = ? AND MAC_NUMBER = ? WITH UR
              trdpb000Repository.selectTbtrdmac2(methodOut.getDcltbtrdmac(),programCtx.getSqlca());
//  IF SQLCODE = 0 THEN
              if (	( methodOut.getSqlcode() == 0 )) { 
//  IF TRD-BUYER-ID = SUM-CUSTOMER-ID
                  if (		compareChars(methodIn.getTrdBuyerId(),methodOut.getSumCustomerId()) == 0 ) { 
                      methodOut.setSumOpenBalance(methodIn.getMacBalance().add(methodIn.getTrdOrderAmount()));
                  }
//  ELSE
                  else { 
                      methodOut.setSumOpenBalance(methodIn.getMacBalance().subtract(methodIn.getTrdOrderAmount()));
                  }
//  MOVE SUM-OPEN-BALANCE TO SUM-CLOSE-BALANCE
                  methodOut.setSumCloseBalance(methodOut.getSumOpenBalance());
              }
          }
//  EVALUATE TRUE
          if  ( methodIn.isOverdue()  ) { 
//  ADD 1 TO SUM-OVERDUE
              methodOut.setSumOverdue(methodOut.getSumOverdue()+1);
          }
          else if  ( methodIn.isRejected()  ) { 
//  ADD 1 TO SUM-REJECTED
              methodOut.setSumRejected(methodOut.getSumRejected()+1);
          }
          else if  ( methodIn.isSettled()  ) { 
//  ADD 1 TO SUM-SETTLED
              methodOut.setSumSettled(methodOut.getSumSettled()+1);
          }
//  EVALUATE TRUE
          if  ( methodIn.isSummaryDebit88()  ) { 
//  MOVE TRD-CURRENCY TO SUM-CURRENCY
              methodOut.setSumCurrency(methodOut.getTrdCurrency());
//  ADD TRD-ORDER-AMOUNT TO SUM-TOTAL-DEBIT
              tempDecimal = methodOut.getSumTotalDebit().add(methodIn.getTrdOrderAmount()).setScale(2,RoundingMode.DOWN);
              methodOut.setSumTotalDebit(tempDecimal);
              //
//  SUBTRACT TRD-ORDER-AMOUNT FROM SUM-CLOSE-BALANCE
              tempDecimal = methodOut.getSumCloseBalance().subtract(methodIn.getTrdOrderAmount()).setScale(2,RoundingMode.DOWN);
              methodOut.setSumCloseBalance(tempDecimal);
              //
          }
          else if  ( methodIn.isSummaryCredit88()  ) { 
//  MOVE TRD-CURRENCY TO SUM-CURRENCY
              methodOut.setSumCurrency(methodOut.getTrdCurrency());
//  ADD TRD-ORDER-AMOUNT TO SUM-TOTAL-CREDIT
              tempDecimal = methodOut.getSumTotalCredit().add(methodIn.getTrdOrderAmount()).setScale(2,RoundingMode.DOWN);
              methodOut.setSumTotalCredit(tempDecimal);
              //
//  ADD TRD-ORDER-AMOUNT TO SUM-CLOSE-BALANCE
              tempDecimal = methodOut.getSumCloseBalance().add(methodIn.getTrdOrderAmount()).setScale(2,RoundingMode.DOWN);
              methodOut.setSumCloseBalance(tempDecimal);
              //
          }
          else if  ( methodIn.isSummaryNoBooking88()  ) { 
              ;
          }
//  IF 88-CUSTOMER-SUMMARY-WRITE
          if ( methodOut.isCustomerSummaryWrite88()  ) { 

// * Insert   customer summary
              
// * Insert   customer summary
              // MOVE WS-CUSTOMER-SUMMARY-REC TO DCLTBTRDSUM
              methodOut.getDcltbtrdsum().setString(methodOut.getCustomerSummaryRec().getCharArray());
//  INSERT INTO TBTRDSUM VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? )
              trdpb000Repository.insert1(methodOut.getDcltbtrdsum(),programCtx.getSqlca());
          }
//  ELSE
          else { 
//  UPDATE TBTRDSUM SET SUM_OVERDUE = ? , SUM_REJECTED = ? , SUM_SETTLED = ? , SUM_CURRENCY = ? , SUM_OPEN_BALANCE = ? , SUM_TOTAL_DEBIT = ? , SUM_TOTAL_CREDIT = ? , SUM_CLOSE_BALANCE = ? WHERE SUM_CUSTOMER_ID = ?
              trdpb000Repository.updateTbtrdsum(methodOut.getDcltbtrdsum(),programCtx.getSqlca());
          }

// *            Where current of summary_csr
//  IF SQLCODE = 0 THEN
//  ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'Summary Insert/Update Failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_1831842734);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
//  CLOSE SUMMARY_CSR
          trdpb000Repository.closeSummaryCsrTrdpb000(programCtx.getSummaryCsrResultSet(),programCtx.getSqlca());
//  IF SQLCODE NOT = 0 THEN
          if (	( methodOut.getSqlcode() != 0 )) { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  SET APPL-EXCEPTION TO TRUE
              methodOut.setApplExceptionTrue(); 
              
              // MOVE SPACES TO WS-EXCEPTION
              methodOut.setException(CONSTANTS.SPACE_200);
//  STRING 'Summary Cursor CLOSE Failed : SQLCODE = ' WS-SQLCODE DELIMITED BY SIZE INTO WS-EXCEPTION END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_773485255);
                 charArray.add(methodOut.getSqlcode_Ws());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getException() ,joinCharArray);
              methodOut.setException(  (char[])updated.get("string"));
//  PERFORM 9000-REPORT-EXCEPTION THRU 9000-EXIT
              reportException(programCtx.getReportExceptionInCtx());/*9000-REPORT-EXCEPTION*/
          }
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Trdpb000Ctx programCtx = (Trdpb000Ctx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getParm().set((Field)params[0]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Trdpb000Ctx programCtx = (Trdpb000Ctx) ctx;
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
      
      
      public void setFromMstpb001(Trdpb000Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getCustomerIo().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getCustomerIo().setString((char[])params[0] );
      }
      public void setFromMstpb002(Trdpb000Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getSecurityIo().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getSecurityIo().setString((char[])params[0] );
      }
      public void setFromTrdpbexc(Trdpb000Ctx programCtx, Object[] params) {
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
