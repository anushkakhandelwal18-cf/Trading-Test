package com.cloudframe.app.process;

import com.cloudframe.app.rt001.Rt001Ctx;
import com.cloudframe.app.rt001.Rt001Ctx.ProgramBeginInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.rt001.Rt001Ctx.ProgramBeginOutCtx;
import com.cloudframe.app.data.Field;


import com.cloudframe.app.dto.ProgramContext;

public interface Rt001 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Rt001Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROGRAM-BEGIN
     *
     * @return 
     */
    public ProgramBeginOutCtx programBegin(ProgramBeginInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROGRAM-DONE
     *
     */
    public void programDone(Rt001Ctx programCtx) throws Exception;


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
