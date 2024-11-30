package com.cloudframe.app.service;

import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.UpdateOrderOutCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.LogSummaryOutCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.InsertToStqOutCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.GetSellSideOrderInCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.ReportExceptionInCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.ValidateCustomersOutCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.GetSellSideOrderOutCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.WriteToStlmtQueueOutCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.BuyerMoneyAccountOutCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.ValidateCustomersInCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.ReportExceptionOutCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.MainlineOutCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.OrderAcceptanceInCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.InsertToStqInCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.BuyerSecAccountInCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.SellerMoneyAccountInCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.SellerSecAccountInCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.OrderAcceptanceOutCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.ValidateSecurityInCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.MainlineInCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.SellerSecAccountOutCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.BuyerSecAccountOutCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.UpdateOrderMatchedOutCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.UpdateOrderMatchedInCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.WriteToStlmtQueueInCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.BuyerMoneyAccountInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.ValidateSecurityOutCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.LogSummaryInCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.SellerMoneyAccountOutCtx;
import com.cloudframe.app.dto.trdpb000.Trdpb000Ctx.UpdateOrderInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Trdpb000 {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Trdpb000Ctx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Trdpb000Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-ORDER-ACCEPTANCE
     *
     * @return 
     */
    public OrderAcceptanceOutCtx orderAcceptance(OrderAcceptanceInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5000-GET-SELL-SIDE-ORDER
     *
     * @return 
     */
    public GetSellSideOrderOutCtx getSellSideOrder(GetSellSideOrderInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5001-VALIDATE-CUSTOMERS
     *
     * @return 
     */
    public ValidateCustomersOutCtx validateCustomers(ValidateCustomersInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5002-VALIDATE-SECURITY
     *
     * @return 
     */
    public ValidateSecurityOutCtx validateSecurity(ValidateSecurityInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5003-BUYER-SEC-ACCOUNT
     *
     * @return 
     */
    public BuyerSecAccountOutCtx buyerSecAccount(BuyerSecAccountInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5004-SELLER-SEC-ACCOUNT
     *
     * @return 
     */
    public SellerSecAccountOutCtx sellerSecAccount(SellerSecAccountInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5005-BUYER-MONEY-ACCOUNT
     *
     * @return 
     */
    public BuyerMoneyAccountOutCtx buyerMoneyAccount(BuyerMoneyAccountInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5006-SELLER-MONEY-ACCOUNT
     *
     * @return 
     */
    public SellerMoneyAccountOutCtx sellerMoneyAccount(SellerMoneyAccountInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5007-UPDATE-ORDER-MATCHED
     *
     * @return 
     */
    public UpdateOrderMatchedOutCtx updateOrderMatched(UpdateOrderMatchedInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5008-WRITE-TO-STLMT-QUEUE
     *
     * @return 
     */
    public WriteToStlmtQueueOutCtx writeToStlmtQueue(WriteToStlmtQueueInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5009-INSERT-TO-STQ
     *
     * @return 
     */
    public InsertToStqOutCtx insertToStq(InsertToStqInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-UPDATE-ORDER
     *
     * @return 
     */
    public UpdateOrderOutCtx updateOrder(UpdateOrderInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-REPORT-EXCEPTION
     *
     * @return 
     */
    public ReportExceptionOutCtx reportException(ReportExceptionInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8001-LOG-SUMMARY
     *
     * @return 
     */
    public LogSummaryOutCtx logSummary(LogSummaryInCtx methodIn) throws Exception;


     /**
	 * This will invoke the program given parameters from the
      * caller program.
	 *
	 * @return return code of the program
	 */
     public int call(ProgramContext programCtx, Object[] parameters) throws Exception;

     /**
	 * This will invoke the program given Field parameters from
      * the caller program.
	 *
	 * @return return code of the program
	 */
     public int call(ProgramContext programCtx, Field... parameters) throws Exception;
}
