package com.cloudframe.app.process;

import com.cloudframe.app.cfcard.CfcardCtx;
import com.cloudframe.app.cfcard.CfcardCtx.MainlineInCtx;
import com.cloudframe.app.cfcard.CfcardCtx.AbendOutCtx;
import com.cloudframe.app.cfcard.CfcardCtx.InitializeOutCtx;
import com.cloudframe.app.cfcard.CfcardCtx.InitializeInCtx;
import com.cloudframe.app.cfcard.CfcardCtx.TerminateInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.cfcard.CfcardCtx.WriteFileOutCtx;
import com.cloudframe.app.cfcard.CfcardCtx.WriteFileInCtx;
import com.cloudframe.app.cfcard.CfcardCtx.ProcessRecordOutCtx;
import com.cloudframe.app.cfcard.CfcardCtx.TerminateOutCtx;
import com.cloudframe.app.cfcard.CfcardCtx.ProcessRecordInCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Cfcard {
    /**
     * This method is derived from Cobol Paragraph - 
     *
     * @return return code of program
     */
    public int setParameter(CfcardCtx programCtx, String parm) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(CfcardCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(MainlineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-INITIALIZE
     *
     * @return 
     */
    public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0200-PROCESS-RECORD
     *
     * @return 
     */
    public ProcessRecordOutCtx processRecord(ProcessRecordInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0250-WRITE-FILE
     *
     * @return 
     */
    public WriteFileOutCtx writeFile(WriteFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0300-TERMINATE
     *
     * @return 
     */
    public TerminateOutCtx terminate(TerminateInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9100-ABEND
     *
     * @return 
     */
    public AbendOutCtx abend(CfcardCtx programCtx) throws Exception;


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
