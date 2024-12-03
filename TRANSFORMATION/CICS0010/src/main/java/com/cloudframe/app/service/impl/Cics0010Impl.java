package com.cloudframe.app.service.impl;
  /* 
*
* this program does cics get container api
*
*/
  
import com.cloudframe.app.common.CommonProcess;
  import com.cloudframe.app.cics.CICSSession;
import com.cloudframe.app.dto.cics0010.Cics0010Ctx.*;
import com.cloudframe.app.dto.cics0010.Cics0010Ctx;
import com.cloudframe.app.service.Cics0010;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.PostMapping;
  import org.springframework.web.bind.annotation.RequestBody;
  import org.springframework.http.MediaType;
  import org.springframework.http.ResponseEntity;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.cics.TransactionManager;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.cics0010.*;
import com.cloudframe.app.dto.cics0010.DfhcommareaGroup;
import com.cloudframe.app.dto.cics0010.LsDfhcommarea;
import com.cloudframe.app.dto.cics0010.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("cics0010")
  
  public class Cics0010Impl extends CommonProcess implements Cics0010 {
  
  Logger logger = LoggerFactory.getLogger(Cics0010Impl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Cics0010Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
//Added variable to get the output context in place.
ProcessInCtx methodIn = programCtx.getProcessInCtx();
//  cobolCode::PERFORM 0000-MAINLINE
          mainline(programCtx.getMainlineInCtx());/*0000-MAINLINE SECTION*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE SECTION COBOL Cyclomatic complexity - 6
      * Input  : None 

      * Output :  

      * - lsReturnCode                   COBOL Name: LS-RETURN-CODE
      * - lsReturnEibresp                COBOL Name: LS-RETURN-EIBRESP
      * - lsReturnEibresp2               COBOL Name: LS-RETURN-EIBRESP2
      *
      * @throws CFException
      */
      @Override
      public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
Cics0010Ctx programCtx = methodIn.getCics0010Ctx();
//Added variable to get the output context in place.
MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
//  cobolCode::GET CONTAINER('CICS0010-COMAREA') CHANNEL('CLFR-CHANNEL') SET(ADDRESS OF LS-DFHCOMMAREA) FLENGTH(FUNCTION~LENGTH~LS-DFHCOMMAREA) RESP (CICSRESP) RESP2 (CICSRESP2)
          // get data from a container
          	if(programCtx.getGlobalCtx().containerExists(String.valueOf(CONSTANTS.LITERAL_CICS0010_MN_COMAREA).trim())) {
          		methodIn.getLsDfhcommarea().setString(programCtx.getGlobalCtx().fetchContainer(String.valueOf(CONSTANTS.LITERAL_CICS0010_MN_COMAREA).trim()));
               } else {
               }
          methodOut.setLsReturnCode(0);
          methodOut.setLsReturnEibresp((long)0);
          methodOut.setLsReturnEibresp2((long)0);
//  cobolCode::EVALUATE LS-REQUEST-TYPE
          switch(methodIn.getLsRequestType()){
          	case 1:
//  cobolCode::PERFORM 0001-GET-REQUEST THRU 0001-EXIT
              getRequest(programCtx.getGetRequestInCtx());/*0001-GET-REQUEST*/
          break;
          	case 2:
//  cobolCode::PERFORM 0002-GET-REQUEST THRU 0002-EXIT
              getRequest0002(programCtx.getGetRequest0002InCtx());/*0002-GET-REQUEST*/
          break;
          	case 3:
//  cobolCode::PERFORM 0003-GET-REQUEST THRU 0003-EXIT
              getRequest0003(programCtx.getGetRequest0003InCtx());/*0003-GET-REQUEST*/
          break;
          default :
              methodOut.setLsReturnCode(16);
          }
//  cobolCode::PUT CONTAINER('CICS0010-COMAREA') CHANNEL('CLFR-CHANNEL') FROM(LS-DFHCOMMAREA) FLENGTH(FUNCTION~LENGTH~LS-DFHCOMMAREA) RESP (CICSRESP) RESP2 (CICSRESP2)
          // write data to a container
          	programCtx.getGlobalCtx().addContainer(String.valueOf(CONSTANTS.LITERAL_CICS0010_MN_COMAREA).trim(),methodIn.getLsDfhcommarea().toCharArray());
          
          methodIn.setCicsresp(programCtx.getCicsSession().getEibresp());
          methodIn.setCicsresp2(programCtx.getCicsSession().getEibresp2());
          	
//  cobolCode::GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * getRequest 
      *   This method is derived from 
  *   COBOL Paragraph - 0001-GET-REQUEST COBOL Cyclomatic complexity - 3
      * Input  :  

      * - cicsresp                       COBOL Name: CICSRESP
      * - cicsresp2                      COBOL Name: CICSRESP2
      *
      * Output :  

      * - containerLength                COBOL Name: CONTAINER-LENGTH
      * - lsReturnCode                   COBOL Name: LS-RETURN-CODE
      * - lsReturnEibresp                COBOL Name: LS-RETURN-EIBRESP
      * - cicsresp                       COBOL Name: CICSRESP
      * - lsReturnEibresp2               COBOL Name: LS-RETURN-EIBRESP2
      * - cicsresp2                      COBOL Name: CICSRESP2
      *
      * @throws CFException
      */
      @Override
      public GetRequestOutCtx getRequest(GetRequestInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
Cics0010Ctx programCtx = methodIn.getCics0010Ctx();
//Added variable to get the output context in place.
GetRequestOutCtx methodOut = methodIn.getGetRequestOutCtx();
//  cobolCode::MOVE 1000 TO CONTAINER-LENGTH
          methodOut.setContainerLength(1000);
//  cobolCode::GET CONTAINER (CONTAINER-NAME) CHANNEL (CHANNEL-NAME) INTO (LS-REQUEST-DATA) FLENGTH (CONTAINER-LENGTH) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // get data from a container
          	if(programCtx.getGlobalCtx().containerExists(String.valueOf(methodIn.getContainerName()).trim())) {
          		methodIn.setLsRequestData(programCtx.getGlobalCtx().fetchContainer(String.valueOf(methodIn.getContainerName()).trim()));
               } else {
               }
//  cobolCode::IF ( CICSRESP = 0 AND CICSRESP2 = 0 )
//  cobolCode::ELSE
          if ((	( methodOut.getCicsresp() != 0 ) || 	( methodOut.getCicsresp2() != 0 ))) { 
              methodOut.setLsReturnCode(12);
              methodOut.setLsReturnEibresp(methodOut.getCicsresp());
              methodOut.setLsReturnEibresp2(methodOut.getCicsresp2());
          }
      
      return methodOut;
      }
      /**
      * getRequest0002 
      *   This method is derived from 
  *   COBOL Paragraph - 0002-GET-REQUEST COBOL Cyclomatic complexity - 3
      * Input  :  

      * - cicsresp                       COBOL Name: CICSRESP
      * - cicsresp2                      COBOL Name: CICSRESP2
      *
      * Output :  

      * - requestData002                 COBOL Name: WS-002-REQUEST-DATA
      * - containerLength                COBOL Name: CONTAINER-LENGTH
      * - lsRequestData                  COBOL Name: LS-REQUEST-DATA
      * - lsReturnCode                   COBOL Name: LS-RETURN-CODE
      * - lsReturnEibresp                COBOL Name: LS-RETURN-EIBRESP
      * - cicsresp                       COBOL Name: CICSRESP
      * - lsReturnEibresp2               COBOL Name: LS-RETURN-EIBRESP2
      * - cicsresp2                      COBOL Name: CICSRESP2
      *
      * @throws CFException
      */
      @Override
      public GetRequest0002OutCtx getRequest0002(GetRequest0002InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int REQUEST_DATA_002_LENGTH = 100;
			// End of variable declaration

      
// *
//Added variable to get the program context in place.
Cics0010Ctx programCtx = methodIn.getCics0010Ctx();
//Added variable to get the output context in place.
GetRequest0002OutCtx methodOut = methodIn.getGetRequest0002OutCtx();
          methodOut.setRequestData002(CONSTANTS.SPACE_100);
//  cobolCode::MOVE LENGTH OF WS-002-REQUEST-DATA TO CONTAINER-LENGTH
          methodOut.setContainerLength(REQUEST_DATA_002_LENGTH);
//  cobolCode::GET CONTAINER (CONTAINER-NAME) CHANNEL (CHANNEL-NAME) INTO (WS-002-REQUEST-DATA) FLENGTH (CONTAINER-LENGTH) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // get data from a container
          	if(programCtx.getGlobalCtx().containerExists(String.valueOf(methodIn.getContainerName()).trim())) {
          		methodOut.setRequestData002(programCtx.getGlobalCtx().fetchContainer(String.valueOf(methodIn.getContainerName()).trim()));
               } else {
               }
//  cobolCode::IF ( CICSRESP = 0 AND CICSRESP2 = 0 )
          if ((	( methodOut.getCicsresp() == 0 ) && 	( methodOut.getCicsresp2() == 0 ))) { 
//  cobolCode::MOVE WS-002-REQUEST-DATA TO LS-REQUEST-DATA
              methodOut.setLsRequestData(methodOut.getRequestData002());
          }
//  cobolCode::ELSE
          else { 
              methodOut.setLsReturnCode(12);
              methodOut.setLsReturnEibresp(methodOut.getCicsresp());
              methodOut.setLsReturnEibresp2(methodOut.getCicsresp2());
          }
      
      return methodOut;
      }
      /**
      * getRequest0003 
      *   This method is derived from 
  *   COBOL Paragraph - 0003-GET-REQUEST COBOL Cyclomatic complexity - 3
      * Input  :  

      * - cicsresp                       COBOL Name: CICSRESP
      * - cicsresp2                      COBOL Name: CICSRESP2
      * - ls003RequestData               COBOL Name: LS-003-REQUEST-DATA
      *
      * Output :  

      * - containerLength                COBOL Name: CONTAINER-LENGTH
      * - lsRequestData                  COBOL Name: LS-REQUEST-DATA
      * - ls003RequestData               COBOL Name: LS-003-REQUEST-DATA
      * - lsReturnCode                   COBOL Name: LS-RETURN-CODE
      * - lsReturnEibresp                COBOL Name: LS-RETURN-EIBRESP
      * - cicsresp                       COBOL Name: CICSRESP
      * - lsReturnEibresp2               COBOL Name: LS-RETURN-EIBRESP2
      * - cicsresp2                      COBOL Name: CICSRESP2
      *
      * @throws CFException
      */
      @Override
      public GetRequest0003OutCtx getRequest0003(GetRequest0003InCtx methodIn) throws Exception {
      
// *
//Added variable to get the program context in place.
Cics0010Ctx programCtx = methodIn.getCics0010Ctx();
//Added variable to get the output context in place.
GetRequest0003OutCtx methodOut = methodIn.getGetRequest0003OutCtx();
//  cobolCode::MOVE 100 TO CONTAINER-LENGTH
          methodOut.setContainerLength(100);
//  cobolCode::GET CONTAINER (CONTAINER-NAME) CHANNEL (CHANNEL-NAME) SET (ADDRESS OF LS-003-REQUEST-DATA) FLENGTH (CONTAINER-LENGTH) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // get data from a container
          	if(programCtx.getGlobalCtx().containerExists(String.valueOf(methodIn.getContainerName()).trim())) {
          		methodOut.setLs003RequestData(programCtx.getGlobalCtx().fetchContainer(String.valueOf(methodIn.getContainerName()).trim()));
               } else {
               }
//  cobolCode::IF ( CICSRESP = 0 AND CICSRESP2 = 0 )
          if ((	( methodOut.getCicsresp() == 0 ) && 	( methodOut.getCicsresp2() == 0 ))) { 
//  cobolCode::MOVE LS-003-REQUEST-DATA TO LS-REQUEST-DATA
              methodOut.setLsRequestData(methodOut.getLs003RequestData());
          }
//  cobolCode::ELSE
          else { 
              methodOut.setLsReturnCode(12);
              methodOut.setLsReturnEibresp(methodOut.getCicsresp());
              methodOut.setLsReturnEibresp2(methodOut.getCicsresp2());
          }
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Cics0010Ctx programCtx = (Cics0010Ctx) ctx;
      
      int len = params.length;
         if (len > 1 && params[1] != null )
            programCtx.getDfhcommareaGroup().set((Field)params[1]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Cics0010Ctx programCtx = (Cics0010Ctx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 1:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof DfhcommareaGroup) {
                       	programCtx.setDfhcommareaGroup((DfhcommareaGroup) parameters[index]);
                  	} else {
                       	programCtx.getDfhcommareaGroup().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
  
  
  
  
  
  }
