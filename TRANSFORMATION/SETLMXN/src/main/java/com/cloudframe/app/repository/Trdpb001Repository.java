package com.cloudframe.app.repository;

import com.cloudframe.app.dto.trdpb001.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface Trdpb001Repository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dcltbtrdstq
* @parm sqlca
     * @return 
     */
    public ResultSet openSettlementQueueTrdpb001(Dcltbtrdstq dcltbtrdstq, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbtrdlog
* @parm sqlca
     */
    public void insert(Dcltbtrdlog dcltbtrdlog, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbtrdlog
* @parm sqlca
     */
    public void updateTbtrdlog(Dcltbtrdlog dcltbtrdlog, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbtrdlog
* @parm sqlca
     */
    public void updateTbtrdlog1(Dcltbtrdlog dcltbtrdlog, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dcltbtrdstq
* @parm sqlca
     */
    public void fetchSettlementQueueTrdpb001(ResultSet settlementQueueResultSet, Dcltbtrdstq dcltbtrdstq, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbtrdstq
* @parm sqlca
     */
    public void deleteTbtrdstq(Dcltbtrdstq dcltbtrdstq, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbtrdstq
* @parm sqlca
     */
    public void deleteTbtrdstq1(Dcltbtrdstq dcltbtrdstq, Sqlca sqlca) throws Exception;

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
     * @parm dcltbtrdsum
* @parm sqlca
     * @return 
     */
    public ResultSet openSummaryCsrTrdpb001(Dcltbtrdsum dcltbtrdsum, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dcltbtrdsum
* @parm sqlca
     */
    public void fetchSummaryCsrTrdpb001(ResultSet summaryCsrResultSet, Dcltbtrdsum dcltbtrdsum, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbtrdmac
* @parm sqlca
     */
    public void selectTbtrdmac(Dcltbtrdmac dcltbtrdmac, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbtrdsum
* @parm sqlca
     */
    public void insert1(Dcltbtrdsum dcltbtrdsum, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbtrdsum
* @parm sqlca
     */
    public void updateTbtrdsum(Dcltbtrdsum dcltbtrdsum, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeSummaryCsrTrdpb001(ResultSet summaryCsrResultSet, Sqlca sqlca) throws Exception;

}