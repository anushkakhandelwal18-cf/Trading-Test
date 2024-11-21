package com.cloudframe.app.process;

import com.cloudframe.app.trdpb004.Trdpb004Ctx;
import com.cloudframe.app.trdpb004.Trdpb004Ctx.ProcessSummaryRptInCtx;
import com.cloudframe.app.trdpb004.Trdpb004Ctx.MainlineOutCtx;
import com.cloudframe.app.trdpb004.Trdpb004Ctx.ProcessSummaryRptOutCtx;
import com.cloudframe.app.trdpb004.Trdpb004Ctx.ProcessTimingsOutCtx;
import com.cloudframe.app.trdpb004.Trdpb004Ctx.ProcessTimingsInCtx;
import com.cloudframe.app.trdpb004.Trdpb004Ctx.ReportExceptionOutCtx;
import com.cloudframe.app.trdpb004.Trdpb004Ctx.ReportExceptionInCtx;
import com.cloudframe.app.trdpb004.Trdpb004Ctx.ProcessExceptionInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.trdpb004.Trdpb004Ctx.InitializeOutCtx;
import com.cloudframe.app.trdpb004.Trdpb004Ctx.ProcessExceptionOutCtx;
import com.cloudframe.app.trdpb004.Trdpb004Ctx.CleanupOutCtx;
import com.cloudframe.app.data.Field;



public interface Trdpb004 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Trdpb004Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return 
     */
    public MainlineOutCtx mainline(Trdpb004Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0001-INITIALIZE
     *
     * @return 
     */
    public InitializeOutCtx initialize(Trdpb004Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-PROCESS-EXCEPTION
     *
     * @return 
     */
    public ProcessExceptionOutCtx processException(ProcessExceptionInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-PROCESS-TIMINGS
     *
     * @return 
     */
    public ProcessTimingsOutCtx processTimings(ProcessTimingsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-PROCESS-SUMMARY-RPT
     *
     * @return 
     */
    public ProcessSummaryRptOutCtx processSummaryRpt(ProcessSummaryRptInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 4000-CLEANUP
     *
     * @return 
     */
    public CleanupOutCtx cleanup(Trdpb004Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9000-REPORT-EXCEPTION
     *
     * @return 
     */
    public ReportExceptionOutCtx reportException(ReportExceptionInCtx methodIn) throws Exception;


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
