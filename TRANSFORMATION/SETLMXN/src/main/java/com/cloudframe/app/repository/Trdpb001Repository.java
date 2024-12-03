package com.cloudframe.app.repository;

import com.cloudframe.app.dto.trdpb001.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface Trdpb001Repository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dcltbtrdstq
     * @return 
     */
    public ResultSet openSettlementQueueTrdpb001(Sqlca sqlca, Dcltbtrdstq dcltbtrdstq) throws Exception;

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
    public void fetchSettlementQueueTrdpb001(ResultSet settlementQueueResultSet, Sqlca sqlca, Dcltbtrdstq dcltbtrdstq) throws Exception;

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
     * @parm dcltbtrdord
* @parm sqlca
     */
    public void updateTbtrdord(Dcltbtrdord dcltbtrdord, Sqlca sqlca) throws Exception;

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
