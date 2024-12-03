package com.cloudframe.app.repository;

import com.cloudframe.app.dto.trdpb003.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface Trdpb003Repository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dcltbtrdmac
* @parm sqlca
     * @return 
     */
    public ResultSet openMacBookingTrdpb003(Dcltbtrdmac dcltbtrdmac, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dcltbtrdmac
* @parm sqlca
     */
    public void fetchMacBookingTrdpb003(ResultSet macBookingResultSet, Dcltbtrdmac dcltbtrdmac, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbtrdmac
* @parm sqlca
     */
    public void updateTbtrdmac(Dcltbtrdmac dcltbtrdmac, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeMacBookingTrdpb003(ResultSet macBookingResultSet, Sqlca sqlca) throws Exception;

}
