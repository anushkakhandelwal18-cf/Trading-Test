package com.cloudframe.app.process;

import com.cloudframe.app.trdpb001.Trdpb001Ctx.ReadFromStlmtQueueInCtx;
import com.cloudframe.app.trdpb001.Trdpb001Ctx.MacBookingInCtx;
import com.cloudframe.app.trdpb001.Trdpb001Ctx.ReadFromStlmtQueueOutCtx;
import com.cloudframe.app.trdpb001.Trdpb001Ctx.SacBookingInCtx;
import com.cloudframe.app.trdpb001.Trdpb001Ctx.AccountingOutCtx;
import com.cloudframe.app.trdpb001.Trdpb001Ctx.MacBookingOutCtx;
import com.cloudframe.app.trdpb001.Trdpb001Ctx.MainlineInCtx;
import com.cloudframe.app.trdpb001.Trdpb001Ctx.TradeSettlementInCtx;
import com.cloudframe.app.trdpb001.Trdpb001Ctx;
import com.cloudframe.app.trdpb001.Trdpb001Ctx.SacBookingOutCtx;
import com.cloudframe.app.trdpb001.Trdpb001Ctx.LogSummaryInCtx;
import com.cloudframe.app.trdpb001.Trdpb001Ctx.MainlineOutCtx;
import com.cloudframe.app.trdpb001.Trdpb001Ctx.AccountingInCtx;
import com.cloudframe.app.trdpb001.Trdpb001Ctx.ReportExceptionOutCtx;
import com.cloudframe.app.trdpb001.Trdpb001Ctx.UpdateOrderOutCtx;
import com.cloudframe.app.trdpb001.Trdpb001Ctx.TradeSettlementOutCtx;
import com.cloudframe.app.trdpb001.Trdpb001Ctx.UpdateOrderInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.trdpb001.Trdpb001Ctx.ReportExceptionInCtx;
import com.cloudframe.app.trdpb001.Trdpb001Ctx.LogSummaryOutCtx;



public interface Trdpb001 {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Trdpb001Ctx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Trdpb001Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-TRADE-SETTLEMENT
     *
     * @return 
     */
    public TradeSettlementOutCtx tradeSettlement(TradeSettlementInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-ACCOUNTING
     *
     * @return 
     */
    public AccountingOutCtx accounting(AccountingInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2001-SAC-BOOKING
     *
     * @return 
     */
    public SacBookingOutCtx sacBooking(SacBookingInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2002-MAC-BOOKING
     *
     * @return 
     */
    public MacBookingOutCtx macBooking(MacBookingInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 5000-READ-FROM-STLMT-QUEUE
     *
     * @return 
     */
    public ReadFromStlmtQueueOutCtx readFromStlmtQueue(ReadFromStlmtQueueInCtx methodIn) throws Exception;

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
     public int call(Object[] parameters) throws Exception;

     /**
	 * This will invoke the program given Field parameters from
      * the caller program.
	 *
	 * @return return code of the program
	 */
     public int call(Field... parameters) throws Exception;
}
