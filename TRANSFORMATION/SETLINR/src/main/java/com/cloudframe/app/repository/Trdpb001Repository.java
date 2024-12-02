package com.cloudframe.app.repository;

import com.cloudframe.app.dto.trdpb001.*;
import java.sql.ResultSet;

public interface Trdpb001Repository {
  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm dcltbtrdstq
   * @return
   */
  public ResultSet openSettlementQueueTrdpb001(Sqlca sqlca, Dcltbtrdstq dcltbtrdstq)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dcltbtrdlog
   */
  public void insert(Sqlca sqlca, Dcltbtrdlog dcltbtrdlog) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dcltbtrdlog
   */
  public void updateTbtrdlog(Sqlca sqlca, Dcltbtrdlog dcltbtrdlog) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dcltbtrdlog
   */
  public void updateTbtrdlog1(Sqlca sqlca, Dcltbtrdlog dcltbtrdlog) throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dcltbtrdstq
   */
  public void fetchSettlementQueueTrdpb001(
      ResultSet settlementQueueResultSet, Sqlca sqlca, Dcltbtrdstq dcltbtrdstq) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dcltbtrdstq
   */
  public void deleteTbtrdstq(Sqlca sqlca, Dcltbtrdstq dcltbtrdstq) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dcltbtrdstq
   */
  public void deleteTbtrdstq1(Sqlca sqlca, Dcltbtrdstq dcltbtrdstq) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dcltbtrdord
   */
  public void updateTbtrdord(Sqlca sqlca, Dcltbtrdord dcltbtrdord) throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm dcltbtrdsum
   * @return
   */
  public ResultSet openSummaryCsrTrdpb001(Sqlca sqlca, Dcltbtrdsum dcltbtrdsum) throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dcltbtrdsum
   */
  public void fetchSummaryCsrTrdpb001(
      ResultSet summaryCsrResultSet, Sqlca sqlca, Dcltbtrdsum dcltbtrdsum) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dcltbtrdmac
   */
  public void selectTbtrdmac(Sqlca sqlca, Dcltbtrdmac dcltbtrdmac) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dcltbtrdsum
   */
  public void insert1(Sqlca sqlca, Dcltbtrdsum dcltbtrdsum) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dcltbtrdsum
   */
  public void updateTbtrdsum(Sqlca sqlca, Dcltbtrdsum dcltbtrdsum) throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeSummaryCsrTrdpb001(ResultSet summaryCsrResultSet, Sqlca sqlca) throws Exception;
}
