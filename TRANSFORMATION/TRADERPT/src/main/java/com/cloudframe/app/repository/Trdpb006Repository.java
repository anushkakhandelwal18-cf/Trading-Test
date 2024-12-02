package com.cloudframe.app.repository;

import com.cloudframe.app.dto.trdpb006.*;
import java.sql.ResultSet;

public interface Trdpb006Repository {
  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @return
   */
  public ResultSet openClientOrdersTrdpb006(Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dcltbtrdord
   * @parm dcltbtrdsec
   * @parm dcltbtrdcus
   * @parm work
   */
  public void fetchClientOrdersTrdpb006(
      ResultSet clientOrdersResultSet,
      Sqlca sqlca,
      Dcltbtrdord dcltbtrdord,
      Dcltbtrdsec dcltbtrdsec,
      Dcltbtrdcus dcltbtrdcus,
      Work work)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeClientOrdersTrdpb006(ResultSet clientOrdersResultSet, Sqlca sqlca)
      throws Exception;
}
