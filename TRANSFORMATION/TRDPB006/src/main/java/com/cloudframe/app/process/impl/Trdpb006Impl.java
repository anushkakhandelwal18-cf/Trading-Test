  package com.cloudframe.app.process.impl;
  /* 
*****************************************************************
*                                                               *
* trdpb006 : generate trading order report                      *
*                                                               *
*                                                               *
*****************************************************************
*                                                               *
*/
  
  import com.cloudframe.app.trdpb006.Trdpb006Ctx.*;
  import com.cloudframe.app.trdpb006.Trdpb006Ctx;
  import com.cloudframe.app.process.Trdpb006;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.repository.Trdpb006Repository;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.trdpb006.file.*;
  import com.cloudframe.app.data.Field;
  import java.math.BigDecimal;
  import com.cloudframe.app.trdpb006.dto.*;
  import com.cloudframe.app.trdpb006.dto.Header1;
  import com.cloudframe.app.trdpb006.dto.DetailRec;
  import com.cloudframe.app.trdpb006.dto.PageHeader;
  import com.cloudframe.app.trdpb006.dto.Sqlca;
  import com.cloudframe.app.trdpb006.dto.DetailHdr1;
  import com.cloudframe.app.trdpb006.dto.Dcltbtrdcus;
  import com.cloudframe.app.trdpb006.file.records.ReporderRecord;
  import com.cloudframe.app.trdpb006.dto.Dcltbtrdsec;
  import com.cloudframe.app.trdpb006.dto.Dcltbtrdord;
  import com.cloudframe.app.trdpb006.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("trdpb006")
  
  public class Trdpb006Impl extends CommonProcess implements Trdpb006 {
  
  Logger logger = LoggerFactory.getLogger(Trdpb006Impl.class);
  
  
  @Value("${TRDPB006.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("db2Base")
  Db2Base db2Base;
  @Autowired 
  @Qualifier("trdpb006Repository")
  Trdpb006Repository trdpb006Repository;
  @Autowired 
  @Qualifier("trdpb006_reporder")
  Reporder reporder;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Trdpb006Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("TRDPB006" ,dbQualifier, true/*use Dynamic SQL*/);
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
      		if(reporder.hasOpened() && !reporder.isReadOnly()) { 
      			reporder.flush(); 
      		}
		handleDbAtEnd(db2Base); 
      

      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 4
      * Input  :  

      * - endOfOrdersSw                  COBOL Name: WS-END-OF-ORDERS-SW
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
Trdpb006Ctx programCtx = methodIn.getTrdpb006Ctx();
MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
//  PERFORM 1000-INITIALIZE THRU 1000-EXIT
          initialize(programCtx);/*1000-INITIALIZE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  PERFORM 2000-OPEN-ORDER-CURSOR-RPTFILE THRU 2000-EXIT
          openOrderCursorRptfile(programCtx.getOpenOrderCursorRptfileInCtx());/*2000-OPEN-ORDER-CURSOR-RPTFILE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  PERFORM 3000-FETCH-PROCESS-ORDERS THRU 3000-EXIT UNTIL 88-END-OF-ORDERS
          while (!(methodIn.isEndOfOrders88()) ) {
             fetchProcessOrders(programCtx.getFetchProcessOrdersInCtx());/*3000-FETCH-PROCESS-ORDERS*/
             if (programCtx.isProgramEnded()) {
                 return methodOut;
             }
          }
//  PERFORM 4000-CLOS-ORDER-CURSOR-RPTFILE THRU 4000-EXIT
          closOrderCursorRptfile(programCtx.getClosOrderCursorRptfileInCtx());/*4000-CLOS-ORDER-CURSOR-RPTFILE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
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
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * initialize 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - printHeader                    COBOL Name: WS-PRINT-HEADER
      * - endOfOrdersSw                  COBOL Name: WS-END-OF-ORDERS-SW
      *
      * @throws CFException
      */
      @Override
      public InitializeOutCtx initialize(Trdpb006Ctx programCtx) throws Exception {
      
// *

// *
InitializeOutCtx methodOut = programCtx.getInitializeOutCtx();
//  SET 88-PRINT-PAGE-HEADER TO TRUE
          methodOut.setPrintPageHeader88True(); 
          
//  MOVE SPACES TO WS-END-OF-ORDERS-SW
          methodOut.setEndOfOrdersSw(CONSTANTS.SPACE);
          ;
      
      return methodOut;
      }
      /**
      * openOrderCursorRptfile 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-OPEN-ORDER-CURSOR-RPTFILE COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - reporderFileStatus             COBOL Name: REPORDER-FILE-STATUS
      *
      * @throws CFException
      */
      @Override
      public OpenOrderCursorRptfileOutCtx openOrderCursorRptfile(OpenOrderCursorRptfileInCtx methodIn) throws Exception {
Trdpb006Ctx programCtx = methodIn.getTrdpb006Ctx();
OpenOrderCursorRptfileOutCtx methodOut = methodIn.getOpenOrderCursorRptfileOutCtx();
//  SELECT A.ORD_TRADEID , A.ORD_TRADING_XCHNG , A.ORD_BUY_SELL_IND , A.ORD_CUSTOMER_ID , CUS_DESCRIPTION , A.ORD_FIGI , SEC_SYMBOL , SEC_DESCRIPTION , SEC_TYPE , A.ORD_QUANTITY , A.ORD_CURRENCY , A.ORD_AMOUNT , A.ORD_STATUS , B.ORD_CUSTOMER_ID FROM TBTRDORD A , TBTRDCUS , TBTRDSEC , TBTRDORD B WHERE A.ORD_CUSTOMER_ID = CUS_CUSTOMER_ID AND A.ORD_FIGI = SEC_FIGI AND A.ORD_CURRENCY = B.ORD_CURRENCY AND A.ORD_TRADING_XCHNG= B.ORD_TRADING_XCHNG AND A.ORD_TRADEID = B.ORD_TRADEID AND A.ORD_FIGI = B.ORD_FIGI AND A.ORD_BUY_SELL_IND <> B.ORD_BUY_SELL_IND ORDER BY A.ORD_CUSTOMER_ID ASC , A.ORD_BUY_SELL_IND ASC , A.ORD_CURRENCY ASC , A.ORD_STATUS ASC , A.ORD_TRADEID ASC
          programCtx.setClientOrdersResultSet(trdpb006Repository.openClientOrdersTrdpb006(programCtx.getSqlca()));
//  IF SQLCODE NOT = 0 THEN
          if (	( methodOut.getSqlcode() != 0 )) { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  DISPLAY 'Open Client_orders Cursor Failed - SQLCode = ' WS-SQLCODE
              logger.info("Open Client_orders Cursor Failed - SQLCode = {}", new String(methodOut.getSqlcode_Ws())); 
//  PERFORM 9999-TERMINATE
              terminate(programCtx);/*9999-TERMINATE*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }

// *

// *
//  OPEN OUTPUT REPORDER
          reporder.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),reporder.getFileName(),reporder.getReporderCharSet(),reporder.getReporderCrlfFlag());
          methodOut.setReporderFileStatus(reporder.getStatusString() );
//  IF REPORDER-FILE-STATUS = '00' THEN
//  LITERAL_00 = '00'
//  ELSE
          if (		compareChars(methodOut.getReporderFileStatus(),CONSTANTS.LITERAL_00) != 0 ) { 
//  DISPLAY 'Open Order Report Failed - FileStatus = ' REPORDER-FILE-STATUS
              logger.info("Open Order Report Failed - FileStatus = {}", new String(methodOut.getReporderFileStatus())); 
//  PERFORM 9999-TERMINATE
              terminate(programCtx);/*9999-TERMINATE*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
          ;
      
      return methodOut;
      }
      /**
      * fetchProcessOrders 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-FETCH-PROCESS-ORDERS COBOL Cyclomatic complexity - 27
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      * - reporderRecord                 COBOL Name: REPORDER-RECORD
      * - ordCustomerId                  COBOL Name: ORD-CUSTOMER-ID
      * - prevCustid                     COBOL Name: WS-PREV-CUSTID
      * - ordBuySellInd                  COBOL Name: ORD-BUY-SELL-IND
      * - prevBuySell                    COBOL Name: WS-PREV-BUY-SELL
      * - ordStatus                      COBOL Name: ORD-STATUS
      * - prevOrderStatus                COBOL Name: WS-PREV-ORDER-STATUS
      * - pagenum                        COBOL Name: WS-PAGENUM
      * - cusDescription                 COBOL Name: CUS-DESCRIPTION
      * - ordTradeid                     COBOL Name: ORD-TRADEID
      * - ordTradingXchng                COBOL Name: ORD-TRADING-XCHNG
      * - ordFigi                        COBOL Name: ORD-FIGI
      * - secSymbol                      COBOL Name: SEC-SYMBOL
      * - secDescription                 COBOL Name: SEC-DESCRIPTION
      * - secType                        COBOL Name: SEC-TYPE
      * - ordQuantity                    COBOL Name: ORD-QUANTITY
      * - ordCurrency                    COBOL Name: ORD-CURRENCY
      * - ordAmount                      COBOL Name: ORD-AMOUNT
      * - buyerSellerCustId              COBOL Name: WS-BUYER-SELLER-CUST-ID
      * - maxOrdersPerPage               COBOL Name: WS-MAX-ORDERS-PER-PAGE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - endOfOrdersSw                  COBOL Name: WS-END-OF-ORDERS-SW
      * - reporderFileStatus             COBOL Name: REPORDER-FILE-STATUS
      * - printHeader                    COBOL Name: WS-PRINT-HEADER
      * - prevCustid                     COBOL Name: WS-PREV-CUSTID
      * - ordCustomerId                  COBOL Name: ORD-CUSTOMER-ID
      * - prevBuySell                    COBOL Name: WS-PREV-BUY-SELL
      * - ordBuySellInd                  COBOL Name: ORD-BUY-SELL-IND
      * - prevOrderStatus                COBOL Name: WS-PREV-ORDER-STATUS
      * - ordStatus                      COBOL Name: ORD-STATUS
      * - pagenum                        COBOL Name: WS-PAGENUM
      * - phPagenum                      COBOL Name: WS-PH-PAGENUM
      * - phCustomer                     COBOL Name: WS-PH-CUSTOMER
      * - phCustomerDesc                 COBOL Name: WS-PH-CUSTOMER-DESC
      * - cusDescription                 COBOL Name: CUS-DESCRIPTION
      * - phHeaderFlg                    COBOL Name: WS-PH-HEADER-FLG
      * - orderCount                     COBOL Name: WS-ORDER-COUNT
      * - h1OrderStatusCode              COBOL Name: WS-H1-ORDER-STATUS-CODE
      * - h1OrderStatusDesc              COBOL Name: WS-H1-ORDER-STATUS-DESC
      * - dh1BuyerSeller                 COBOL Name: WS-DH1-BUYER-SELLER
      * - detTradeid                     COBOL Name: WS-DET-TRADEID
      * - ordTradeid                     COBOL Name: ORD-TRADEID
      * - detTradingXchng                COBOL Name: WS-DET-TRADING-XCHNG
      * - ordTradingXchng                COBOL Name: ORD-TRADING-XCHNG
      * - detFigi                        COBOL Name: WS-DET-FIGI
      * - ordFigi                        COBOL Name: ORD-FIGI
      * - detSymbol                      COBOL Name: WS-DET-SYMBOL
      * - secSymbol                      COBOL Name: SEC-SYMBOL
      * - detDescription                 COBOL Name: WS-DET-DESCRIPTION
      * - secDescription                 COBOL Name: SEC-DESCRIPTION
      * - detType                        COBOL Name: WS-DET-TYPE
      * - secType                        COBOL Name: SEC-TYPE
      * - detQuantity                    COBOL Name: WS-DET-QUANTITY
      * - ordQuantity                    COBOL Name: ORD-QUANTITY
      * - detCurrency                    COBOL Name: WS-DET-CURRENCY
      * - ordCurrency                    COBOL Name: ORD-CURRENCY
      * - detAmount                      COBOL Name: WS-DET-AMOUNT
      * - ordAmount                      COBOL Name: ORD-AMOUNT
      * - detBuyerSeller                 COBOL Name: WS-DET-BUYER-SELLER
      * - buyerSellerCustId              COBOL Name: WS-BUYER-SELLER-CUST-ID
      *
      * @throws CFException
      */
      @Override
      public FetchProcessOrdersOutCtx fetchProcessOrders(FetchProcessOrdersInCtx methodIn) throws Exception {
Trdpb006Ctx programCtx = methodIn.getTrdpb006Ctx();
FetchProcessOrdersOutCtx methodOut = methodIn.getFetchProcessOrdersOutCtx();
//  FETCH CLIENT_ORDERS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          trdpb006Repository.fetchClientOrdersTrdpb006(programCtx.getClientOrdersResultSet(),methodOut.getWork(),methodOut.getDcltbtrdsec(),programCtx.getSqlca(),methodOut.getDcltbtrdord(),methodOut.getDcltbtrdcus());

// *

// *
          
// *

// *
          // MOVE SQLCODE TO WS-SQLCODE
          //  FORMAT1016334848 = "----"
          methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
          break;
          	case 100:
//  SET 88-END-OF-ORDERS TO TRUE
              methodOut.setEndOfOrders88True(); 
              
//  WRITE REPORDER-RECORD FROM WS-DETAIL-HDR2
              reporder.writeWithAttribute(methodIn.getDetailHdr2());
              methodOut.getReporderRecord().setString(CONSTANTS.LOW_VALUE_215749166);
              methodOut.setReporderFileStatus(reporder.getStatusString() );
//cobolCode::GO TO 3000-EXIT
return methodOut;
//cobolCodeEnds::GO TO 3000-EXIT
          
          default :
//  DISPLAY 'Fetch of Client_orders Cursor Failed - SQLCode = ' WS-SQLCODE
              logger.info("Fetch of Client_orders Cursor Failed - SQLCode = {}", new String(methodOut.getSqlcode_Ws())); 
//  PERFORM 9999-TERMINATE
              terminate(programCtx);/*9999-TERMINATE*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }

// *
//  IF ORD-CUSTOMER-ID NOT = WS-PREV-CUSTID OR ORD-BUY-SELL-IND NOT = WS-PREV-BUY-SELL
          if (		compareChars(methodOut.getOrdCustomerId(),methodOut.getPrevCustid()) != 0  || 		compareChars(methodOut.getOrdBuySellInd(),methodOut.getPrevBuySell()) != 0 ) { 
//  SET 88-PRINT-PAGE-HEADER TO TRUE
              methodOut.setPrintPageHeader88True(); 
              
          }
//  ELSE
          else { 
//  IF ORD-STATUS NOT = WS-PREV-ORDER-STATUS
              if (		compareChars(methodOut.getOrdStatus(),methodOut.getPrevOrderStatus()) != 0 ) { 
//  SET 88-PRINT-HEADER1 TO TRUE
                  methodOut.setPrintHeader188True(); 
                  
              }
          }

// *
          
// *
          // MOVE ORD-CUSTOMER-ID TO WS-PREV-CUSTID
          methodOut.setPrevCustid(methodOut.getOrdCustomerId());
          // MOVE ORD-BUY-SELL-IND TO WS-PREV-BUY-SELL
          methodOut.setPrevBuySell(methodOut.getOrdBuySellInd());
          // MOVE ORD-STATUS TO WS-PREV-ORDER-STATUS
          methodOut.setPrevOrderStatus(methodOut.getOrdStatus());

// *
//  IF 88-PRINT-PAGE-HEADER
          if ( methodOut.isPrintPageHeader88()  ) { 
//  ADD 1 TO WS-PAGENUM
              methodOut.setPagenum(methodOut.getPagenum()+1);
//  MOVE WS-PAGENUM TO WS-PH-PAGENUM
//  FORMAT_34170218 = "ZZZ"
              methodOut.setPhPagenum(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_34170218,String.valueOf(methodOut.getPagenum()).toCharArray()));
//  MOVE ORD-CUSTOMER-ID TO WS-PH-CUSTOMER
              methodOut.setPhCustomer(methodOut.getOrdCustomerId());
//  MOVE CUS-DESCRIPTION TO WS-PH-CUSTOMER-DESC
              methodOut.setPhCustomerDesc(methodOut.getCusDescription());
//  IF ORD-BUY-SELL-IND = 'B' THEN
//  LITERAL_B = 'B'
              if (compareChars(methodOut.getOrdBuySellInd(), CONSTANTS.LITERAL_B) == 0) { 
//  SET 88-PH-BUY-ORDERS TO TRUE
                  methodOut.setPhBuyOrders88True(); 
                  
              }
//  ELSE
              else { 
//  SET 88-PH-SELL-ORDERS TO TRUE
                  methodOut.setPhSellOrders88True(); 
                  
              }

// *
//  WRITE REPORDER-RECORD FROM WS-EMPTY-HDR
              reporder.writeWithAttribute(methodIn.getEmptyHdr());
              methodOut.getReporderRecord().setString(CONSTANTS.LOW_VALUE_215749166);
              methodOut.setReporderFileStatus(reporder.getStatusString() );
//  WRITE REPORDER-RECORD FROM WS-PAGE-HEADER AFTER ADVANCING PAGE
              reporder.writeWithPageBreakAfter(methodIn.getPageHeader().toCharArray());
              methodOut.getReporderRecord().setString(CONSTANTS.LOW_VALUE_215749166);
              methodOut.setReporderFileStatus(reporder.getStatusString() );
//  SET 88-PRINT-HEADER1 TO TRUE
              methodOut.setPrintHeader188True(); 
              
//  MOVE 0 TO WS-ORDER-COUNT
              methodOut.setOrderCount(0);
          }
//  IF 88-PRINT-HEADER1
          if ( methodOut.isPrintHeader188()  ) { 
              // MOVE ORD-STATUS TO WS-H1-ORDER-STATUS-CODE
              methodOut.setH1OrderStatusCode(padLeftZeros(3,methodOut.getOrdStatus(),false));
//  EVALUATE ORD-STATUS
              switch(new String(methodOut.getOrdStatus())){
              	case "101":
//  MOVE 'Accepted' TO WS-H1-ORDER-STATUS-DESC
                  methodOut.setH1OrderStatusDesc(CONSTANTS.LITERAL_Accepted_B12_);
              break;
              	case "201":
//  MOVE 'Matched' TO WS-H1-ORDER-STATUS-DESC
                  methodOut.setH1OrderStatusDesc(CONSTANTS.LITERAL_Matched_B13_);
              break;
              	case "301":
//  MOVE 'Overdue-Buyer Invld' TO WS-H1-ORDER-STATUS-DESC
                  methodOut.setH1OrderStatusDesc(CONSTANTS.LITERAL_Overdue_MN_Buyer_B2_Invld);
              break;
              	case "302":
//  MOVE 'Overdue-SellerInvld' TO WS-H1-ORDER-STATUS-DESC
                  methodOut.setH1OrderStatusDesc(CONSTANTS.LITERAL_Overdue_MN_SellerInvld_B_);
              break;
              	case "303":
//  MOVE 'Overdue-Security' TO WS-H1-ORDER-STATUS-DESC
                  methodOut.setH1OrderStatusDesc(CONSTANTS.LITERAL_Overdue_MN_Security_B4_);
              break;
              	case "304":
//  MOVE 'Overdue-Buyer Acct' TO WS-H1-ORDER-STATUS-DESC
                  methodOut.setH1OrderStatusDesc(CONSTANTS.LITERAL_Overdue_MN_Buyer_B3_Acct);
              break;
              	case "305":
//  MOVE 'Overdue-Seller Acct' TO WS-H1-ORDER-STATUS-DESC
                  methodOut.setH1OrderStatusDesc(CONSTANTS.LITERAL_Overdue_MN_Seller_B2_Acct);
              break;
              	case "306":
              
              	case "307":
//  MOVE 'Overdue-OrderStatus' TO WS-H1-ORDER-STATUS-DESC
                  methodOut.setH1OrderStatusDesc(CONSTANTS.LITERAL_Overdue_MN_OrderStatus_B_);
              break;
              	case "308":
//  MOVE 'Overdue-MissingOrdr' TO WS-H1-ORDER-STATUS-DESC
                  methodOut.setH1OrderStatusDesc(CONSTANTS.LITERAL_Overdue_MN_MissingOrdr_B_);
              break;
              	case "401":
//  MOVE 'Overdue-Rejected' TO WS-H1-ORDER-STATUS-DESC
                  methodOut.setH1OrderStatusDesc(CONSTANTS.LITERAL_Overdue_MN_Rejected_B4_);
              break;
              	case "601":
//  MOVE 'Settled' TO WS-H1-ORDER-STATUS-DESC
                  methodOut.setH1OrderStatusDesc(CONSTANTS.LITERAL_Settled_B13_);
              break;
              default :
//  MOVE 'Unknown' TO WS-H1-ORDER-STATUS-DESC
                  methodOut.setH1OrderStatusDesc(CONSTANTS.LITERAL_Unknown_B13_);
              }

// *

// *
//  WRITE REPORDER-RECORD FROM WS-EMPTY-HDR
              reporder.writeWithAttribute(methodIn.getEmptyHdr());
              methodOut.getReporderRecord().setString(CONSTANTS.LOW_VALUE_215749166);
              methodOut.setReporderFileStatus(reporder.getStatusString() );
//  WRITE REPORDER-RECORD FROM WS-HEADER1 AFTER ADVANCING 2 LINES
              reporder.writeAfter(methodIn.getHeader1().toCharArray(),2);
              methodOut.getReporderRecord().setString(CONSTANTS.LOW_VALUE_215749166);
              methodOut.setReporderFileStatus(reporder.getStatusString() );

// *

// *
//  WRITE REPORDER-RECORD FROM WS-EMPTY-HDR
              reporder.writeWithAttribute(methodIn.getEmptyHdr());
              methodOut.getReporderRecord().setString(CONSTANTS.LOW_VALUE_215749166);
              methodOut.setReporderFileStatus(reporder.getStatusString() );
//  SET 88-PRINT-DETAIL-HDR TO TRUE
              methodOut.setPrintDetailHdr88True(); 
              
          }

// *
//  IF 88-PRINT-DETAIL-HDR
          if ( methodOut.isPrintDetailHdr88()  ) { 
//  IF ORD-BUY-SELL-IND = 'B' THEN
//  LITERAL_B = 'B'
              if (compareChars(methodOut.getOrdBuySellInd(), CONSTANTS.LITERAL_B) == 0) { 
//  SET 88-DH1-SELLER TO TRUE
                  methodOut.setDh1Seller88True(); 
                  
              }
//  ELSE
              else { 
//  SET 88-DH1-BUYER TO TRUE
                  methodOut.setDh1Buyer88True(); 
                  
              }

// *

// *
//  WRITE REPORDER-RECORD FROM WS-DETAIL-HDR2
              reporder.writeWithAttribute(methodIn.getDetailHdr2());
              methodOut.getReporderRecord().setString(CONSTANTS.LOW_VALUE_215749166);
              methodOut.setReporderFileStatus(reporder.getStatusString() );
//  WRITE REPORDER-RECORD FROM WS-DETAIL-HDR1 AFTER ADVANCING 1 LINE
              reporder.writeAfter(methodIn.getDetailHdr1().toCharArray(),1);
              methodOut.getReporderRecord().setString(CONSTANTS.LOW_VALUE_215749166);
              methodOut.setReporderFileStatus(reporder.getStatusString() );

// *

// *
//  WRITE REPORDER-RECORD FROM WS-DETAIL-HDR2
              reporder.writeWithAttribute(methodIn.getDetailHdr2());
              methodOut.getReporderRecord().setString(CONSTANTS.LOW_VALUE_215749166);
              methodOut.setReporderFileStatus(reporder.getStatusString() );
//  SET 88-PRINT-DETAIL TO TRUE
              methodOut.setPrintDetail88True(); 
              
          }

// *
//  MOVE ORD-TRADEID TO WS-DET-TRADEID
          methodOut.setDetTradeid(methodOut.getOrdTradeid());
//  MOVE ORD-TRADING-XCHNG TO WS-DET-TRADING-XCHNG
          methodOut.setDetTradingXchng(methodOut.getOrdTradingXchng());
//  MOVE ORD-FIGI TO WS-DET-FIGI
          methodOut.setDetFigi(methodOut.getOrdFigi());
//  MOVE SEC-SYMBOL TO WS-DET-SYMBOL
          methodOut.setDetSymbol(methodOut.getSecSymbol());
//  MOVE SEC-DESCRIPTION TO WS-DET-DESCRIPTION
          methodOut.setDetDescription(methodOut.getSecDescription());
//  MOVE SEC-TYPE TO WS-DET-TYPE
          methodOut.setDetType(methodOut.getSecType());
//  MOVE ORD-QUANTITY TO WS-DET-QUANTITY
//  FORMAT_491838655 = "-,---,---.00"
          methodOut.setDetQuantity(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_491838655,methodOut.getOrdQuantity().toPlainString().toCharArray()));
//  MOVE ORD-CURRENCY TO WS-DET-CURRENCY
          methodOut.setDetCurrency(methodOut.getOrdCurrency());
//  MOVE ORD-AMOUNT TO WS-DET-AMOUNT
//  FORMAT_491838655 = "-,---,---.00"
          methodOut.setDetAmount(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_491838655,methodOut.getOrdAmount().toPlainString().toCharArray()));
//  MOVE WS-BUYER-SELLER-CUST-ID TO WS-DET-BUYER-SELLER
          methodOut.setDetBuyerSeller(methodOut.getBuyerSellerCustId());

// *
//  ADD 1 TO WS-ORDER-COUNT
          methodOut.setOrderCount(methodOut.getOrderCount()+1);
//  SET 88-PRINT-DETAIL TO TRUE
          methodOut.setPrintDetail88True(); 
          
//  WRITE REPORDER-RECORD FROM WS-DETAIL-REC
          reporder.writeWithAttribute(methodIn.getDetailRec().toCharArray());
          methodOut.getReporderRecord().setString(CONSTANTS.LOW_VALUE_215749166);
          methodOut.setReporderFileStatus(reporder.getStatusString() );
//  IF WS-ORDER-COUNT > WS-MAX-ORDERS-PER-PAGE THEN
          if (	( methodOut.getOrderCount() > methodIn.getMaxOrdersPerPage() )) { 
//  WRITE REPORDER-RECORD FROM WS-DETAIL-HDR2
              reporder.writeWithAttribute(methodIn.getDetailHdr2());
              methodOut.getReporderRecord().setString(CONSTANTS.LOW_VALUE_215749166);
              methodOut.setReporderFileStatus(reporder.getStatusString() );
//  SET 88-PRINT-PAGE-HEADER TO TRUE
              methodOut.setPrintPageHeader88True(); 
              
          }
          ;
      
      return methodOut;
      }
      /**
      * closOrderCursorRptfile 
      *   This method is derived from 
  *   COBOL Paragraph - 4000-CLOS-ORDER-CURSOR-RPTFILE COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      * - reporderFileStatus             COBOL Name: REPORDER-FILE-STATUS
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public ClosOrderCursorRptfileOutCtx closOrderCursorRptfile(ClosOrderCursorRptfileInCtx methodIn) throws Exception {
Trdpb006Ctx programCtx = methodIn.getTrdpb006Ctx();
ClosOrderCursorRptfileOutCtx methodOut = methodIn.getClosOrderCursorRptfileOutCtx();
//  CLOSE CLIENT_ORDERS
          trdpb006Repository.closeClientOrdersTrdpb006(programCtx.getClientOrdersResultSet(),programCtx.getSqlca());
//  IF SQLCODE NOT = 0 THEN
          if (	( methodOut.getSqlcode() != 0 )) { 
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016334848 = "----"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  DISPLAY 'Close Client_orders Cursor Failed - SQLCode = ' WS-SQLCODE
              logger.info("Close Client_orders Cursor Failed - SQLCode = {}", new String(methodOut.getSqlcode_Ws())); 
//  PERFORM 9999-TERMINATE
              terminate(programCtx);/*9999-TERMINATE*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }

// *

// *
//  CLOSE REPORDER
          reporder.close(); 
          methodOut.setReporderFileStatus(reporder.getStatusString() );
//  IF REPORDER-FILE-STATUS = '00' THEN
//  LITERAL_00 = '00'
//  ELSE
          if (		compareChars(methodOut.getReporderFileStatus(),CONSTANTS.LITERAL_00) != 0 ) { 
//  DISPLAY 'Close Order Report Failed - FileStatus = ' REPORDER-FILE-STATUS
              logger.info("Close Order Report Failed - FileStatus = {}", new String(methodOut.getReporderFileStatus())); 
//  PERFORM 9999-TERMINATE
              terminate(programCtx);/*9999-TERMINATE*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
          ;
      
      return methodOut;
      }
      /**
      * terminate 
      *   This method is derived from 
  *   COBOL Paragraph - 9999-TERMINATE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public TerminateOutCtx terminate(Trdpb006Ctx programCtx) throws Exception {
      
// *
TerminateOutCtx methodOut = programCtx.getTerminateOutCtx();
          // MOVE 16 TO RETURN-CODE
          programCtx.setRc( 16);
//  DISPLAY 'Terminating TRDBP006 due to error!!'
          logger.info("Terminating TRDBP006 due to error!!"); 
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
  
  
  
  
  
  
  
  
  }
