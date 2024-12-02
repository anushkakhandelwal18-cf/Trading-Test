package com.cloudframe.app.process;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.trdpb006.Trdpb006Ctx;
import com.cloudframe.app.trdpb006.Trdpb006Ctx.ClosOrderCursorRptfileInCtx;
import com.cloudframe.app.trdpb006.Trdpb006Ctx.ClosOrderCursorRptfileOutCtx;
import com.cloudframe.app.trdpb006.Trdpb006Ctx.FetchProcessOrdersInCtx;
import com.cloudframe.app.trdpb006.Trdpb006Ctx.FetchProcessOrdersOutCtx;
import com.cloudframe.app.trdpb006.Trdpb006Ctx.InitializeOutCtx;
import com.cloudframe.app.trdpb006.Trdpb006Ctx.MainlineInCtx;
import com.cloudframe.app.trdpb006.Trdpb006Ctx.MainlineOutCtx;
import com.cloudframe.app.trdpb006.Trdpb006Ctx.OpenOrderCursorRptfileInCtx;
import com.cloudframe.app.trdpb006.Trdpb006Ctx.OpenOrderCursorRptfileOutCtx;
import com.cloudframe.app.trdpb006.Trdpb006Ctx.TerminateOutCtx;

public interface Trdpb006 {
  /**
   * This method is derived from Cobol Paragraph - PROCESS
   *
   * @return Return Code of the this class
   */
  public int process(Trdpb006Ctx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0000-MAINLINE
   *
   * @return
   */
  public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1000-INITIALIZE
   *
   * @return
   */
  public InitializeOutCtx initialize(Trdpb006Ctx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2000-OPEN-ORDER-CURSOR-RPTFILE
   *
   * @return
   */
  public OpenOrderCursorRptfileOutCtx openOrderCursorRptfile(OpenOrderCursorRptfileInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3000-FETCH-PROCESS-ORDERS
   *
   * @return
   */
  public FetchProcessOrdersOutCtx fetchProcessOrders(FetchProcessOrdersInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4000-CLOS-ORDER-CURSOR-RPTFILE
   *
   * @return
   */
  public ClosOrderCursorRptfileOutCtx closOrderCursorRptfile(ClosOrderCursorRptfileInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 9999-TERMINATE
   *
   * @return
   */
  public TerminateOutCtx terminate(Trdpb006Ctx programCtx) throws Exception;

  /**
   * This will invoke the program given parameters from the caller program.
   *
   * @return return code of the program
   */
  public int call(ProgramContext programCtx, Object[] parameters) throws Exception;

  /**
   * This will invoke the program given Field parameters from the caller program.
   *
   * @return return code of the program
   */
  public int call(ProgramContext programCtx, Field... parameters) throws Exception;
}
