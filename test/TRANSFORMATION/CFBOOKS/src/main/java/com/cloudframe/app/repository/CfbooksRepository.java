package com.cloudframe.app.repository;

import com.cloudframe.app.cfbooks.dto.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface CfbooksRepository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     * @return 
     */
    public ResultSet openBookscurCfbooks(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeBookscurCfbooks(ResultSet bookscurResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dclbooks
* @parm nullvars
     */
    public void fetchBookscurCfbooks(ResultSet bookscurResultSet, Sqlca sqlca, Dclbooks dclbooks, Nullvars nullvars) throws Exception;

}
