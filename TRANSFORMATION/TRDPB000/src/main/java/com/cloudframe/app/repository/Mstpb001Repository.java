package com.cloudframe.app.repository;

import com.cloudframe.app.mstpb001.dto.*;
import com.cloudframe.app.data.Field;


public interface Mstpb001Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbtrdcus
     */
    public void selectTbtrdcus(Sqlca sqlca, Dcltbtrdcus dcltbtrdcus) throws Exception;

}
