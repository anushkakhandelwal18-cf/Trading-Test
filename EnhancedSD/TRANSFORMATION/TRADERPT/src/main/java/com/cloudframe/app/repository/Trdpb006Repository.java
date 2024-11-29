package com.cloudframe.app.repository;

import com.cloudframe.app.dto.trdpb006.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


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
     * @parm dcltbtrdcus
* @parm work
* @parm dcltbtrdord
* @parm sqlca
* @parm dcltbtrdsec
     */
    public void fetchClientOrdersTrdpb006(ResultSet clientOrdersResultSet, Dcltbtrdcus dcltbtrdcus, Work work, Dcltbtrdord dcltbtrdord, Sqlca sqlca, Dcltbtrdsec dcltbtrdsec) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeClientOrdersTrdpb006(ResultSet clientOrdersResultSet, Sqlca sqlca) throws Exception;

}