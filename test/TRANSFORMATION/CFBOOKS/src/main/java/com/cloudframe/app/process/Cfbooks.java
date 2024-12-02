package com.cloudframe.app.process;

import com.cloudframe.app.cfbooks.CfbooksCtx.SqlmainInCtx;
import com.cloudframe.app.cfbooks.CfbooksCtx.SqlErrChkInCtx;
import com.cloudframe.app.cfbooks.CfbooksCtx.SqlErrChkOutCtx;
import com.cloudframe.app.cfbooks.CfbooksCtx.WriteRecordOutCtx;
import com.cloudframe.app.cfbooks.CfbooksCtx.HousekeepingInCtx;
import com.cloudframe.app.cfbooks.CfbooksCtx.FetchCursorOutCtx;
import com.cloudframe.app.cfbooks.CfbooksCtx.WriteRecordInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.cfbooks.CfbooksCtx.WriteHeaderOutCtx;
import com.cloudframe.app.cfbooks.CfbooksCtx;
import com.cloudframe.app.cfbooks.CfbooksCtx.SqlmainOutCtx;
import com.cloudframe.app.cfbooks.CfbooksCtx.WriteHeaderInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.cfbooks.CfbooksCtx.MainOutCtx;
import com.cloudframe.app.cfbooks.CfbooksCtx.InitializeOutCtx;
import com.cloudframe.app.cfbooks.CfbooksCtx.FileErrChkInCtx;
import com.cloudframe.app.cfbooks.CfbooksCtx.InitializeInCtx;
import com.cloudframe.app.cfbooks.CfbooksCtx.HousekeepingOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Cfbooks {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(CfbooksCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN
     *
     * @return 
     */
    public MainOutCtx main(CfbooksCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZE
     *
     * @return 
     */
    public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1100-WRITE-HEADER
     *
     * @return 
     */
    public WriteHeaderOutCtx writeHeader(WriteHeaderInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1200-FETCH-CURSOR
     *
     * @return 
     */
    public FetchCursorOutCtx fetchCursor(CfbooksCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-SQLMAIN
     *
     * @return 
     */
    public SqlmainOutCtx sqlmain(SqlmainInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-WRITE-RECORD
     *
     * @return 
     */
    public WriteRecordOutCtx writeRecord(WriteRecordInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 3000-HOUSEKEEPING
     *
     * @return 
     */
    public HousekeepingOutCtx housekeeping(HousekeepingInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9998-FILE-ERR-CHK
     *
     */
    public void fileErrChk(FileErrChkInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9999-SQL-ERR-CHK
     *
     * @return 
     */
    public SqlErrChkOutCtx sqlErrChk(SqlErrChkInCtx methodIn) throws Exception;


     /**
	 * This will invoke the program given parameters from the
      * caller program.
	 *
	 * @return return code of the program
	 */
     public int call(ProgramContext programCtx, Object[] parameters) throws Exception;

     /**
	 * This will invoke the program given Field parameters from
      * the caller program.
	 *
	 * @return return code of the program
	 */
     public int call(ProgramContext programCtx, Field... parameters) throws Exception;
}
