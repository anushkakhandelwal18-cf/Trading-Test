  package com.cloudframe.app.process.impl;
  /* 
*----------------------------------------------------------------*
* purpose: write records to trading.queue.                       *
*----------------------------------------------------------------*
*/
  
  import com.cloudframe.app.trdpb007.Trdpb007Ctx.*;
  import com.cloudframe.app.trdpb007.Trdpb007Ctx;
  import com.cloudframe.app.process.Trdpb007;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.trdpb007.file.Scanner;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.mq.CFQueueHandler;
  import com.cloudframe.app.mq.CFQueueResponse;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.trdpb007.dto.*;
  import com.cloudframe.app.trdpb007.dto.PutBuffer;
  import com.cloudframe.app.trdpb007.dto.Mqmd;
  import com.cloudframe.app.trdpb007.dto.Mqod;
  import com.cloudframe.app.trdpb007.dto.Mqpmo;
  import com.cloudframe.app.trdpb007.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("trdpb007")
  
  public class Trdpb007Impl extends CommonProcess implements Trdpb007 {
  
  Logger logger = LoggerFactory.getLogger(Trdpb007Impl.class);
  
  
  
  
  
  
  private CFQueueHandler cfQueueHandler = new CFQueueHandler();
  private CFQueueResponse cfQueueResponse = null;
  
  
    @Autowired
    @Qualifier("trdpb007_scanner")
    Scanner scanner;
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Trdpb007Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  cobolCode::PERFORM 0000-MAINLINE
          mainline(programCtx);/*0000-MAINLINE*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
      		if(scanner.hasOpened()) { 
      			scanner.close();
      		}
      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainline(Trdpb007Ctx programCtx) throws Exception {
//  cobolCode::PERFORM 0010-GET-PROGRAM-INPUTS THRU 0010-EXIT
          getProgramInputs(programCtx);/*0010-GET-PROGRAM-INPUTS*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  cobolCode::PERFORM 0100-MQ-CONNECT THRU 0100-EXIT
          mqConnect(programCtx.getMqConnectInCtx());/*0100-MQ-CONNECT*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  cobolCode::PERFORM 0200-MQ-PUT-ONE THRU 0200-EXIT
          mqPutOne(programCtx.getMqPutOneInCtx());/*0200-MQ-PUT-ONE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  cobolCode::PERFORM 0300-MQ-DISCONNECT THRU 0300-EXIT
          mqDisconnect(programCtx.getMqDisconnectInCtx());/*0300-MQ-DISCONNECT*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//cobolCode::GO TO 9999-EXIT
exit9999(programCtx);
 return ;
//cobolCodeEnds::GO TO 9999-EXIT
      
      }
      /**
      * getProgramInputs 
      *   This method is derived from 
  *   COBOL Paragraph - 0010-GET-PROGRAM-INPUTS COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - tradingParms                   COBOL Name: WS-TRADING-PARMS
      *
      * @throws CFException
      */
      @Override
      public GetProgramInputsOutCtx getProgramInputs(Trdpb007Ctx programCtx) throws Exception {
			// Declare local variables used in the method
			char[] consoleInput = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
//Added variable to get the output context in place.
GetProgramInputsOutCtx methodOut = programCtx.getGetProgramInputsOutCtx();
//  cobolCode::ACCEPT WS-TRADING-PARMS
          consoleInput = scanner.nextLine();
          if (!scanner.hasEnded()) {
             methodOut.setTradingParms(consoleInput);  // read from console and assign
          }
          ;
      
      return methodOut;
      }
      /**
      * mqConnect 
      *   This method is derived from 
  *   COBOL Paragraph - 0100-MQ-CONNECT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - compcode                       COBOL Name: WS-COMPCODE
      * - mqccOk                         COBOL Name: MQCC-OK
      * - reason                         COBOL Name: WS-REASON
      *
      * Output :  

      * - mqm                            COBOL Name: WS-MQM
      * - rc                             COBOL Name: RETURN-CODE
      * - compcodeEdit                   COBOL Name: WS-COMPCODE-EDIT
      * - compcode                       COBOL Name: WS-COMPCODE
      * - reasonEdit                     COBOL Name: WS-REASON-EDIT
      * - reason                         COBOL Name: WS-REASON
      *
      * @throws CFException
      */
      @Override
      public MqConnectOutCtx mqConnect(MqConnectInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			char[] consoleInput = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
//Added variable to get the program context in place.
Trdpb007Ctx programCtx = methodIn.getTrdpb007Ctx();
//Added variable to get the output context in place.
MqConnectOutCtx methodOut = methodIn.getMqConnectOutCtx();
//  cobolCode::ACCEPT WS-MQM
          consoleInput = scanner.nextLine();
          if (!scanner.hasEnded()) {
             methodOut.setMqm(consoleInput);  // read from console and assign
          }
//  cobolCode::CALL 'MQCONN' USING WS-MQM , WS-HCONN , WS-COMPCODE , WS-REASON
          cfQueueResponse = cfQueueHandler.connectQ(methodOut.getMqm());
          methodOut.setHconn(cfQueueResponse.getConnectionHandleId());
          methodOut.setCompcode(cfQueueResponse.getCompCode());
          methodOut.setReason(cfQueueResponse.getReasonCode());
//  cobolCode::IF WS-COMPCODE NOT = MQCC-OK
          if (	( methodOut.getCompcode() != methodIn.getMqccOk() )) { 
//  cobolCode::MOVE WS-COMPCODE TO WS-COMPCODE-EDIT
//  FORMAT_287469588 = "---------9"
              methodOut.setCompcodeEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469588,String.valueOf(methodOut.getCompcode()).toCharArray()));
//  cobolCode::MOVE WS-REASON TO WS-REASON-EDIT
//  FORMAT_287469588 = "---------9"
              methodOut.setReasonEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469588,String.valueOf(methodOut.getReason()).toCharArray()));
//  cobolCode::DISPLAY 'Program MQCONN, Connect Failed:'
              logger.info("Program MQCONN, Connect Failed:"); 
//  cobolCode::DISPLAY 'Comp Code: ' WS-COMPCODE-EDIT
              logger.info("Comp Code: {}", new String(methodOut.getCompcodeEdit())); 
//  cobolCode::DISPLAY 'Reason...: ' WS-REASON-EDIT
              logger.info("Reason...: {}", new String(methodOut.getReasonEdit())); 
//cobolCode::GO TO 9999-EXIT
exit9999(programCtx);
 return methodOut;
//cobolCodeEnds::GO TO 9999-EXIT
          }
          ;
      
      return methodOut;
      }
      /**
      * mqPutOne 
      *   This method is derived from 
  *   COBOL Paragraph - 0200-MQ-PUT-ONE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - mqotQ                          COBOL Name: MQOT-Q
      * - mqmtDatagram                   COBOL Name: MQMT-DATAGRAM
      * - mqciNone                       COBOL Name: MQCI-NONE
      * - mqmiNone                       COBOL Name: MQMI-NONE
      * - mqperNotPersistent             COBOL Name: MQPER-NOT-PERSISTENT
      * - mqpmoNoSyncpoint               COBOL Name: MQPMO-NO-SYNCPOINT
      * - mqpmoDefaultContext            COBOL Name: MQPMO-DEFAULT-CONTEXT
      * - tradingParms                   COBOL Name: WS-TRADING-PARMS
      * - compcode                       COBOL Name: WS-COMPCODE
      * - mqccOk                         COBOL Name: MQCC-OK
      * - reason                         COBOL Name: WS-REASON
      *
      * Output :  

      * - mqodObjecttype                 COBOL Name: MQOD-OBJECTTYPE
      * - mqotQ                          COBOL Name: MQOT-Q
      * - mqodObjectname                 COBOL Name: MQOD-OBJECTNAME
      * - mqmdMsgtype                    COBOL Name: MQMD-MSGTYPE
      * - mqmtDatagram                   COBOL Name: MQMT-DATAGRAM
      * - mqmdCorrelid                   COBOL Name: MQMD-CORRELID
      * - mqciNone                       COBOL Name: MQCI-NONE
      * - mqmdMsgid                      COBOL Name: MQMD-MSGID
      * - mqmiNone                       COBOL Name: MQMI-NONE
      * - mqmdReplytoq                   COBOL Name: MQMD-REPLYTOQ
      * - mqmdReplytoqmgr                COBOL Name: MQMD-REPLYTOQMGR
      * - mqmdPriority                   COBOL Name: MQMD-PRIORITY
      * - mqmdPersistence                COBOL Name: MQMD-PERSISTENCE
      * - mqperNotPersistent             COBOL Name: MQPER-NOT-PERSISTENT
      * - mqpmoOptions                   COBOL Name: MQPMO-OPTIONS
      * - putBuffer                      COBOL Name: WS-PUT-BUFFER
      * - tradingParms                   COBOL Name: WS-TRADING-PARMS
      * - bufflen                        COBOL Name: WS-BUFFLEN
      * - rc                             COBOL Name: RETURN-CODE
      * - compcodeEdit                   COBOL Name: WS-COMPCODE-EDIT
      * - compcode                       COBOL Name: WS-COMPCODE
      * - reasonEdit                     COBOL Name: WS-REASON-EDIT
      * - reason                         COBOL Name: WS-REASON
      *
      * @throws CFException
      */
      @Override
      public MqPutOneOutCtx mqPutOne(MqPutOneInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
//Added variable to get the program context in place.
Trdpb007Ctx programCtx = methodIn.getTrdpb007Ctx();
//Added variable to get the output context in place.
MqPutOneOutCtx methodOut = methodIn.getMqPutOneOutCtx();
//  cobolCode::MOVE MQOT-Q TO MQOD-OBJECTTYPE
          methodOut.setMqodObjecttype(methodOut.getMqotQ());
//  cobolCode::MOVE 'TRADING.QUEUE' TO MQOD-OBJECTNAME
          methodOut.setMqodObjectname(CONSTANTS.LITERAL_1007886308);
//  cobolCode::MOVE MQMT-DATAGRAM TO MQMD-MSGTYPE
          methodOut.setMqmdMsgtype(methodOut.getMqmtDatagram());
//  cobolCode::MOVE MQCI-NONE TO MQMD-CORRELID
          methodOut.setMqmdCorrelid(methodOut.getMqciNone());
//  cobolCode::MOVE MQMI-NONE TO MQMD-MSGID
          methodOut.setMqmdMsgid(methodOut.getMqmiNone());

// *    Move ws-temporary-q       to mqmd-replytoq
//  cobolCode::MOVE SPACES TO MQMD-REPLYTOQ , MQMD-REPLYTOQMGR
          methodOut.setMqmdReplytoq(CONSTANTS.SPACE_48);
          methodOut.setMqmdReplytoqmgr(CONSTANTS.SPACE_48);
          methodOut.setMqmdPriority(5);
//  cobolCode::MOVE MQPER-NOT-PERSISTENT TO MQMD-PERSISTENCE
          methodOut.setMqmdPersistence(methodOut.getMqperNotPersistent());
//  cobolCode::COMPUTE MQPMO-OPTIONS = MQPMO-NO-SYNCPOINT + MQPMO-DEFAULT-CONTEXT
          methodOut.setMqpmoOptions(methodIn.getMqpmoNoSyncpoint() + methodIn.getMqpmoDefaultContext());
//  cobolCode::MOVE WS-TRADING-PARMS TO WS-PUT-BUFFER
          methodOut.getPutBuffer().setString(pad(113,methodOut.getTradingParms(),SPACE_CHAR,RIGHT_PAD));
//  cobolCode::MOVE LENGTH OF CSQ4BIIM-MSG TO WS-BUFFLEN
          methodOut.setBufflen(Csq4biimMsg.getCsq4biimMsgFieldLength());
//  cobolCode::CALL 'MQPUT1' USING WS-HCONN , MQOD , MQMD , MQPMO , WS-BUFFLEN , WS-PUT-BUFFER , WS-COMPCODE , WS-REASON
          cfQueueResponse = cfQueueHandler.putSingleQ(methodOut.getHconn(), methodOut.getMqod(), methodOut.getMqmd(), methodOut.getMqpmo(), methodOut.getBufflen(), methodOut.getPutBuffer().toString());
          methodOut.setCompcode(cfQueueResponse.getCompCode());
          methodOut.setReason(cfQueueResponse.getReasonCode());
//  cobolCode::IF WS-COMPCODE NOT = MQCC-OK
          if (	( methodOut.getCompcode() != methodIn.getMqccOk() )) { 
//  cobolCode::MOVE WS-COMPCODE TO WS-COMPCODE-EDIT
//  FORMAT_287469588 = "---------9"
              methodOut.setCompcodeEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469588,String.valueOf(methodOut.getCompcode()).toCharArray()));
//  cobolCode::MOVE WS-REASON TO WS-REASON-EDIT
//  FORMAT_287469588 = "---------9"
              methodOut.setReasonEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469588,String.valueOf(methodOut.getReason()).toCharArray()));
//  cobolCode::DISPLAY 'Program MQWRITE, Write Failed:'
              logger.info("Program MQWRITE, Write Failed:"); 
//  cobolCode::DISPLAY 'Comp Code: ' WS-COMPCODE-EDIT
              logger.info("Comp Code: {}", new String(methodOut.getCompcodeEdit())); 
//  cobolCode::DISPLAY 'Reason...: ' WS-REASON-EDIT
              logger.info("Reason...: {}", new String(methodOut.getReasonEdit())); 
//cobolCode::GO TO 9999-EXIT
exit9999(programCtx);
 return methodOut;
//cobolCodeEnds::GO TO 9999-EXIT
          }
//  cobolCode::DISPLAY 'Successfull write of: ' WS-PUT-BUFFER
          logger.info("Successfull write of: {}", methodOut.getPutBuffer().toString()); 
          ;
      
      return methodOut;
      }
      /**
      * mqDisconnect 
      *   This method is derived from 
  *   COBOL Paragraph - 0300-MQ-DISCONNECT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - compcode                       COBOL Name: WS-COMPCODE
      * - mqccOk                         COBOL Name: MQCC-OK
      * - reason                         COBOL Name: WS-REASON
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - compcodeEdit                   COBOL Name: WS-COMPCODE-EDIT
      * - compcode                       COBOL Name: WS-COMPCODE
      * - reasonEdit                     COBOL Name: WS-REASON-EDIT
      * - reason                         COBOL Name: WS-REASON
      *
      * @throws CFException
      */
      @Override
      public MqDisconnectOutCtx mqDisconnect(MqDisconnectInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
//Added variable to get the program context in place.
Trdpb007Ctx programCtx = methodIn.getTrdpb007Ctx();
//Added variable to get the output context in place.
MqDisconnectOutCtx methodOut = methodIn.getMqDisconnectOutCtx();
//  cobolCode::CALL 'MQDISC' USING WS-HCONN , WS-COMPCODE , WS-REASON
          cfQueueResponse = cfQueueHandler.disconnectQ(methodOut.getHconn());
          methodOut.setCompcode(cfQueueResponse.getCompCode());
          methodOut.setReason(cfQueueResponse.getReasonCode());
//  cobolCode::IF WS-COMPCODE NOT = MQCC-OK
          if (	( methodOut.getCompcode() != methodIn.getMqccOk() )) { 
//  cobolCode::MOVE WS-COMPCODE TO WS-COMPCODE-EDIT
//  FORMAT_287469588 = "---------9"
              methodOut.setCompcodeEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469588,String.valueOf(methodOut.getCompcode()).toCharArray()));
//  cobolCode::MOVE WS-REASON TO WS-REASON-EDIT
//  FORMAT_287469588 = "---------9"
              methodOut.setReasonEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469588,String.valueOf(methodOut.getReason()).toCharArray()));
//  cobolCode::DISPLAY 'Program MQDISC, Disconnect Failed:'
              logger.info("Program MQDISC, Disconnect Failed:"); 
//  cobolCode::DISPLAY 'Comp Code: ' WS-COMPCODE-EDIT
              logger.info("Comp Code: {}", new String(methodOut.getCompcodeEdit())); 
//  cobolCode::DISPLAY 'Reason...: ' WS-REASON-EDIT
              logger.info("Reason...: {}", new String(methodOut.getReasonEdit())); 
          }
          ;
      
      return methodOut;
      }
      /**
      * exit9999 
      *   This method is derived from 
  *   COBOL Paragraph - 9999-EXIT COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void exit9999(Trdpb007Ctx programCtx) throws Exception {
      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
//  cobolCode::GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
  
  
  
  
  
  
  
  
  }
