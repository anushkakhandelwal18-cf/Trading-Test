package com.cloudframe.app.repository;

import com.cloudframe.app.trdpb006.dto.*;
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
     * @parm dcltbtrdsec
* @parm work
* @parm sqlca
* @parm dcltbtrdcus
* @parm dcltbtrdord
     */
    public void fetchClientOrdersTrdpb006(ResultSet clientOrdersResultSet, Dcltbtrdsec dcltbtrdsec, Work work, Sqlca sqlca, Dcltbtrdcus dcltbtrdcus, Dcltbtrdord dcltbtrdord) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeClientOrdersTrdpb006(ResultSet clientOrdersResultSet, Sqlca sqlca) throws Exception;

}
