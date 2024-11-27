package com.cloudframe.app.repository;

import com.cloudframe.app.mstpb001.dto.*;
import com.cloudframe.app.data.Field;


public interface Mstpb001Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbtrdcus
* @parm sqlca
     */
    public void selectTbtrdcus(Dcltbtrdcus dcltbtrdcus, Sqlca sqlca) throws Exception;

}
