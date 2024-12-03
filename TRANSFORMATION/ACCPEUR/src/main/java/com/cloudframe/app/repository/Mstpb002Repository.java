package com.cloudframe.app.repository;

import com.cloudframe.app.dto.mstpb002.*;
import com.cloudframe.app.data.Field;


public interface Mstpb002Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbtrdsec
* @parm sqlca
     */
    public void selectTbtrdsec(Dcltbtrdsec dcltbtrdsec, Sqlca sqlca) throws Exception;

}
