package com.optum.uhg.app.service;

import com.optum.uhg.app.dto.cf03secu.Cf03secuCtx;
import com.optum.uhg.app.rest.cf03secu.Dfhcommarea;
import com.optum.uhg.app.dto.cf03secu.Cf03secuCtx.MainlineInCtx;
import com.optum.uhg.app.dto.cf03secu.Cf03secuCtx.MainlineOutCtx;
import com.optum.uhg.app.dto.cf03secu.Cf03secuCtx.GetSecurityOutCtx;
import com.cloudframe.app.data.Field;
import com.optum.uhg.app.dto.cf03secu.Cf03secuCtx.GetSecurityInCtx;
import com.cloudframe.app.dto.ProgramContext;

public interface Cf03secu {

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Cf03secuCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     * @return
     */
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-GET-SECURITY
     *
     * @return
     */
    public GetSecurityOutCtx getSecurity(GetSecurityInCtx methodIn) throws Exception;

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
