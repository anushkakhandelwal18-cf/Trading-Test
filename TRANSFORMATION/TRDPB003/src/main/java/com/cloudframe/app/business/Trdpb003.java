package com.cloudframe.app.business;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.trdpb003.Trdpb003Ctx;
import com.cloudframe.app.dto.trdpb003.Trdpb003Ctx.MacBookingInCtx;
import com.cloudframe.app.dto.trdpb003.Trdpb003Ctx.MacBookingOutCtx;
import com.cloudframe.app.dto.trdpb003.Trdpb003Ctx.MainlineOutCtx;
import com.cloudframe.app.dto.trdpb003.Trdpb003Ctx.ReportExceptionInCtx;
import com.cloudframe.app.dto.trdpb003.Trdpb003Ctx.ReportExceptionOutCtx;

public interface Trdpb003 {
  /**
   * This method is derived from Cobol Paragraph -
   *
   * @return return code of program
   */
  public int setParameter(Trdpb003Ctx programCtx, String parm) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - PROCESS
   *
   * @return Return Code of the this class
   */
  public int process(Trdpb003Ctx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0000-MAINLINE
   *
   * @return
   */
  public MainlineOutCtx mainline(Trdpb003Ctx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1000-MAC-BOOKING
   *
   * @return
   */
  public MacBookingOutCtx macBooking(MacBookingInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 9000-REPORT-EXCEPTION
   *
   * @return
   */
  public ReportExceptionOutCtx reportException(ReportExceptionInCtx methodIn) throws Exception;

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
