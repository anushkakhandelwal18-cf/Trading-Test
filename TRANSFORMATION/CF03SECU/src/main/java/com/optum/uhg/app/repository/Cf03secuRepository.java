package com.optum.uhg.app.repository;

import com.optum.uhg.app.dto.cf03secu.*;
import com.cloudframe.app.data.Field;


public interface Cf03secuRepository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbdemsec
     */
    public void selectTbdemsec(Sqlca sqlca, Dcltbdemsec dcltbdemsec) throws Exception;

}
