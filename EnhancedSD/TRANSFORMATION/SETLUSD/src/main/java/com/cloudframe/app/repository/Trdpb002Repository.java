package com.cloudframe.app.repository;

import com.cloudframe.app.dto.trdpb002.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface Trdpb002Repository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dcltbtrdpos
     * @return 
     */
    public ResultSet openPosBookingTrdpb002(Sqlca sqlca, Dcltbtrdpos dcltbtrdpos) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dcltbtrdpos
     */
    public void fetchPosBookingTrdpb002(ResultSet posBookingResultSet, Sqlca sqlca, Dcltbtrdpos dcltbtrdpos) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbtrdpos
     */
    public void updateTbtrdpos(Sqlca sqlca, Dcltbtrdpos dcltbtrdpos) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closePosBookingTrdpb002(ResultSet posBookingResultSet, Sqlca sqlca) throws Exception;

}
