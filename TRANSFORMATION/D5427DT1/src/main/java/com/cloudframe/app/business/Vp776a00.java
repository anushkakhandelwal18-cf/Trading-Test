package com.cloudframe.app.business;

import com.cloudframe.app.dto.vp776a00.Vp776a00Ctx;
import com.cloudframe.app.dto.vp776a00.Vp776a00Ctx.Mainline0000OutCtx;
import com.cloudframe.app.dto.vp776a00.Vp776a00Ctx.CompareDescending0400InCtx;
import com.cloudframe.app.dto.vp776a00.Vp776a00Ctx.SortTheTable0200InCtx;
import com.cloudframe.app.dto.vp776a00.Vp776a00Ctx.CompareAscending0300OutCtx;
import com.cloudframe.app.dto.vp776a00.Vp776a00Ctx.SortTheTable0200OutCtx;
import com.cloudframe.app.dto.vp776a00.Vp776a00Ctx.CompareDescending0400OutCtx;
import com.cloudframe.app.dto.vp776a00.Vp776a00Ctx.CompareAscending0300InCtx;
import com.cloudframe.app.dto.vp776a00.Vp776a00Ctx.ValidateRequest0100OutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.vp776a00.Vp776a00Ctx.ValidateRequest0100InCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Vp776a00 {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(Vp776a00Ctx programCtx, String parm, String parm2, String parm3, String parm4) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Vp776a00Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - MAINLINE-0000 SECTION
     *
     * @return 
     */
    public Mainline0000OutCtx mainline0000(Vp776a00Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - EXIT-0000
     *
     */
    public void exit0000(Vp776a00Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - VALIDATE-REQUEST-0100 SECTION
     *
     * @return 
     */
    public ValidateRequest0100OutCtx validateRequest0100(ValidateRequest0100InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - SORT-THE-TABLE-0200 SECTION
     *
     * @return 
     */
    public SortTheTable0200OutCtx sortTheTable0200(SortTheTable0200InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - COMPARE-ASCENDING-0300 SECTION
     *
     * @return 
     */
    public CompareAscending0300OutCtx compareAscending0300(CompareAscending0300InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - COMPARE-DESCENDING-0400 SECTION
     *
     * @return 
     */
    public CompareDescending0400OutCtx compareDescending0400(CompareDescending0400InCtx methodIn) throws Exception;


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
