package com.cloudframe.app.repository;

import com.cloudframe.app.dto.trdpb000.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface Trdpb000Repository {
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
     * This method will handle the sql operations for a open query.
     *
     * @parm dcltbtrdord
* @parm sqlca
     * @return 
     */
    public ResultSet openBuySideOrdersTrdpb000(Dcltbtrdord dcltbtrdord, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dcltbtrdord
* @parm sqlca
     */
    public void fetchBuySideOrdersTrdpb000(ResultSet buySideOrdersResultSet, Dcltbtrdord dcltbtrdord, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dcltbtrdord
* @parm sqlca
     */
    public void fetchBuySideOrders1Trdpb000(ResultSet buySideOrdersResultSet, Dcltbtrdord dcltbtrdord, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeBuySideOrdersTrdpb000(ResultSet buySideOrdersResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbtrdord
* @parm sqlca
     */
    public void selectTbtrdord(Dcltbtrdord dcltbtrdord, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbtrdsac
     */
    public void selectTbtrdsac(Sqlca sqlca, Dcltbtrdsac dcltbtrdsac) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbtrdsac
     */
    public void selectTbtrdsac1(Sqlca sqlca, Dcltbtrdsac dcltbtrdsac) throws Exception;

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
     * @parm dcltbtrdmac
* @parm sqlca
     */
    public void selectTbtrdmac1(Dcltbtrdmac dcltbtrdmac, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a batch-insert query.
     *
     * @parm sqlca
* @parm settlmentQueueTable
     */
    public void insertTbtrdstq(Sqlca sqlca, SettlmentQueueTable settlmentQueueTable) throws Exception;

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
     * @parm sqlca
* @parm dcltbtrdsum
     * @return 
     */
    public ResultSet openSummaryCsrTrdpb000(Sqlca sqlca, Dcltbtrdsum dcltbtrdsum) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dcltbtrdsum
     */
    public void fetchSummaryCsrTrdpb000(ResultSet summaryCsrResultSet, Sqlca sqlca, Dcltbtrdsum dcltbtrdsum) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbtrdmac
* @parm sqlca
     */
    public void selectTbtrdmac2(Dcltbtrdmac dcltbtrdmac, Sqlca sqlca) throws Exception;

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
    public void closeSummaryCsrTrdpb000(ResultSet summaryCsrResultSet, Sqlca sqlca) throws Exception;

}