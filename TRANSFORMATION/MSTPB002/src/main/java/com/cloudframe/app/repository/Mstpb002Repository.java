package com.cloudframe.app.repository;

import com.cloudframe.app.dto.mstpb002.*;

public interface Mstpb002Repository {
  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dcltbtrdsec
   */
  public void selectTbtrdsec(Sqlca sqlca, Dcltbtrdsec dcltbtrdsec) throws Exception;
}
