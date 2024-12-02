package com.cloudframe.app.repository;

import com.cloudframe.app.dto.trdpb002.*;
import java.sql.ResultSet;

public interface Trdpb002Repository {
  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm dcltbtrdpos
   * @parm sqlca
   * @return
   */
  public ResultSet openPosBookingTrdpb002(Dcltbtrdpos dcltbtrdpos, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm dcltbtrdpos
   * @parm sqlca
   */
  public void fetchPosBookingTrdpb002(
      ResultSet posBookingResultSet, Dcltbtrdpos dcltbtrdpos, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dcltbtrdpos
   * @parm sqlca
   */
  public void updateTbtrdpos(Dcltbtrdpos dcltbtrdpos, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closePosBookingTrdpb002(ResultSet posBookingResultSet, Sqlca sqlca) throws Exception;
}
