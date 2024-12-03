package com.cloudframe.app.process;

import com.cloudframe.app.trdpb007.Trdpb007Ctx.MqDisconnectInCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.trdpb007.Trdpb007Ctx.MqPutOneInCtx;
import com.cloudframe.app.trdpb007.Trdpb007Ctx;
import com.cloudframe.app.trdpb007.Trdpb007Ctx.GetProgramInputsOutCtx;
import com.cloudframe.app.trdpb007.Trdpb007Ctx.MqConnectOutCtx;
import com.cloudframe.app.trdpb007.Trdpb007Ctx.MqPutOneOutCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.trdpb007.Trdpb007Ctx.MqConnectInCtx;
import com.cloudframe.app.trdpb007.Trdpb007Ctx.MqDisconnectOutCtx;


import com.cloudframe.app.dto.ProgramContext;

public interface Trdpb007 {
    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(Trdpb007Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAINLINE
     *
     */
    public void mainline(Trdpb007Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0010-GET-PROGRAM-INPUTS
     *
     * @return 
     */
    public GetProgramInputsOutCtx getProgramInputs(Trdpb007Ctx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0100-MQ-CONNECT
     *
     * @return 
     */
    public MqConnectOutCtx mqConnect(MqConnectInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0200-MQ-PUT-ONE
     *
     * @return 
     */
    public MqPutOneOutCtx mqPutOne(MqPutOneInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0300-MQ-DISCONNECT
     *
     * @return 
     */
    public MqDisconnectOutCtx mqDisconnect(MqDisconnectInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9999-EXIT
     *
     */
    public void exit9999(Trdpb007Ctx programCtx) throws Exception;


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
