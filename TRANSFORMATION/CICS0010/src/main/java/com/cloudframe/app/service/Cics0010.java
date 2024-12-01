package com.cloudframe.app.service;

import com.cloudframe.app.dto.cics0010.Cics0010Ctx.GetRequest0002InCtx;
import com.cloudframe.app.dto.cics0010.Cics0010Ctx.MainlineInCtx;
import com.cloudframe.app.dto.cics0010.Cics0010Ctx.GetRequestInCtx;
import com.cloudframe.app.dto.cics0010.Cics0010Ctx.GetRequest0003OutCtx;
import com.cloudframe.app.dto.cics0010.Cics0010Ctx.MainlineOutCtx;
import com.cloudframe.app.dto.cics0010.Cics0010Ctx.GetRequest0003InCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.cics0010.Cics0010Ctx.GetRequestOutCtx;
import com.cloudframe.app.dto.cics0010.Cics0010Ctx;
import com.cloudframe.app.dto.cics0010.Cics0010Ctx.GetRequest0002OutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Cics0010 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Cics0010Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE SECTION
     *
     * @return 
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0001-GET-REQUEST
     *
     * @return 
     */
    public GetRequestOutCtx getRequest(GetRequestInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0002-GET-REQUEST
     *
     * @return 
     */
    public GetRequest0002OutCtx getRequest0002(GetRequest0002InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0003-GET-REQUEST
     *
     * @return 
     */
    public GetRequest0003OutCtx getRequest0003(GetRequest0003InCtx methodIn) throws Exception;


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
