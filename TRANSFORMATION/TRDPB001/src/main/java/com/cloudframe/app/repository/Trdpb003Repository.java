package com.cloudframe.app.repository;

import com.cloudframe.app.trdpb003.dto.*;
import java.sql.ResultSet;

public interface Trdpb003Repository {
  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm dcltbtrdmac
   * @return
   */
  public ResultSet openMacBookingTrdpb003(Sqlca sqlca, Dcltbtrdmac dcltbtrdmac) throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dcltbtrdmac
   */
  public void fetchMacBookingTrdpb003(
      ResultSet macBookingResultSet, Sqlca sqlca, Dcltbtrdmac dcltbtrdmac) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dcltbtrdmac
   */
  public void updateTbtrdmac(Sqlca sqlca, Dcltbtrdmac dcltbtrdmac) throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeMacBookingTrdpb003(ResultSet macBookingResultSet, Sqlca sqlca) throws Exception;
}
