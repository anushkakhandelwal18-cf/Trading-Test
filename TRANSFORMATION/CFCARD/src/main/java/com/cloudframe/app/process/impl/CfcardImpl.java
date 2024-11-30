  package com.cloudframe.app.process.impl;
  /* 
*---------------------------------------------
* cfcard  - aggregate balance for credit card
*           to output file
*--------------------------------------------
*/
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.cfcard.file.*;
  import com.cloudframe.app.cfcard.CfcardCtx.*;
  import com.cloudframe.app.cfcard.CfcardCtx;
  import com.cloudframe.app.process.Cfcard;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import java.math.BigDecimal;
  import java.math.RoundingMode;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.cfcard.dto.*;
  import com.cloudframe.app.cfcard.dto.Parm;
  import com.cloudframe.app.cfcard.file.records.WfOutput;
  import com.cloudframe.app.cfcard.file.records.WfRecord;
  import com.cloudframe.app.cfcard.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("cfcard")
  
  public class CfcardImpl extends CommonProcess implements Cfcard {
  
  Logger logger = LoggerFactory.getLogger(CfcardImpl.class);
  
  
  
  
  @Autowired 
  @Qualifier("cfcard_flInputFile")
  FlInputFile flInputFile;
  @Autowired 
  @Qualifier("cfcard_flOutputFile")
  FlOutputFile flOutputFile;
  
  
  
  
  
  
      @Override
      public int setParameter(CfcardCtx programCtx, String parm) throws Exception {
      		if(parm != null)
      		    programCtx.getParm().setString(com.cloudframe.app.data.Field.getParm(parm),new String(CONSTANTS.EBCDIC_ENCODING));
      		setInitDone(false);
      		process(programCtx);
      		return programCtx.getRc();
      }
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(CfcardCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
//Added variable to get the output context in place.
ProcessInCtx methodIn = programCtx.getProcessInCtx();
//  cobolCode::PERFORM 0000-MAINLINE
//  PERFORM 0000-MAINLINE
          mainline(programCtx.getMainlineInCtx());/*0000-MAINLINE*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
      		if(flInputFile.hasOpened() && !flInputFile.isReadOnly()) { 
      			flInputFile.flush(); 
      		}
      		if(flOutputFile.hasOpened() && !flOutputFile.isReadOnly()) { 
      			flOutputFile.flush(); 
      		}
      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - parmMonth                      COBOL Name: LK-PARM-MONTH
      * - doneStatus                     COBOL Name: WS-DONE-STATUS
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainline(MainlineInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
CfcardCtx programCtx = methodIn.getCfcardCtx();

// *

// *
//  cobolCode::DISPLAY 'SERVICE MONTH ' LK-PARM-MONTH
//  DISPLAY 'SERVICE MONTH ' LK-PARM-MONTH
          logger.info("SERVICE MONTH {}", String.valueOf(methodIn.getParmMonth())); 
//  cobolCode::PERFORM 0100-INITIALIZE THRU 0100-EXIT
//  PERFORM 0100-INITIALIZE THRU 0100-EXIT
          initialize(programCtx.getInitializeInCtx());/*0100-INITIALIZE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }

// *
//  cobolCode::PERFORM 0200-PROCESS-RECORD THRU 0200-EXIT UNTIL WS-PROCESSED
//  PERFORM 0200-PROCESS-RECORD THRU 0200-EXIT UNTIL WS-PROCESSED
          while (!(methodIn.isProcessed()) ) {
             processRecord(programCtx.getProcessRecordInCtx());/*0200-PROCESS-RECORD*/
             if (programCtx.isProgramEnded()) {
                 return ;
             }
          }

// *
//  cobolCode::PERFORM 0300-TERMINATE THRU 0300-EXIT
//  PERFORM 0300-TERMINATE THRU 0300-EXIT
          terminate(programCtx.getTerminateInCtx());/*0300-TERMINATE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
      
      }
      /**
      * initialize 
      *   This method is derived from 
  *   COBOL Paragraph - 0100-INITIALIZE COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - inp1Status                     COBOL Name: WS-INP1-STATUS
      * - outpStatus                     COBOL Name: WS-OUTP-STATUS
      * - inp1Cnt                        COBOL Name: WS-INP1-CNT
      * - outpCntW                       COBOL Name: WS-OUTP-CNT-W
      *
      * @throws CFException
      */
      @Override
      public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception {
      
// *

// *
//Added variable to get the program context in place.
CfcardCtx programCtx = methodIn.getCfcardCtx();
//Added variable to get the output context in place.
InitializeOutCtx methodOut = methodIn.getInitializeOutCtx();
//  cobolCode::OPEN INPUT FL-INPUT-FILE
//  OPEN INPUT FL-INPUT-FILE
          flInputFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),flInputFile.getFileName(),flInputFile.getFlInputFileCharSet(),flInputFile.getFlInputFileCrlfFlag());
          methodOut.setInp1Status(flInputFile.getStatusString() );
//  cobolCode::IF NOT ( WS-INP1-STATUS = '00' )
//  IF NOT ( WS-INP1-STATUS = '00' )
//  LITERAL_00 = '00'
          if ((		compareChars(methodOut.getInp1Status(),CONSTANTS.LITERAL_00) != 0 )) { 
//  cobolCode::DISPLAY 'OPEN INP1-FILE ERROR ' WS-INP1-STATUS
//  DISPLAY 'OPEN INP1-FILE ERROR ' WS-INP1-STATUS
              logger.info("OPEN INP1-FILE ERROR {}", new String(methodOut.getInp1Status())); 
//  cobolCode::PERFORM 9100-ABEND THRU 9100-ABEND-EXIT
//  PERFORM 9100-ABEND THRU 9100-ABEND-EXIT
              abend(programCtx);/*9100-ABEND*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  cobolCode::OPEN OUTPUT FL-OUTPUT-FILE
//  OPEN OUTPUT FL-OUTPUT-FILE
          flOutputFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),flOutputFile.getFileName(),flOutputFile.getFlOutputFileCharSet(),flOutputFile.getFlOutputFileCrlfFlag());
          methodOut.setOutpStatus(flOutputFile.getStatusString() );
//  cobolCode::IF NOT ( WS-OUTP-STATUS = '00' )
//  IF NOT ( WS-OUTP-STATUS = '00' )
//  LITERAL_00 = '00'
          if ((		compareChars(methodOut.getOutpStatus(),CONSTANTS.LITERAL_00) != 0 )) { 
//  cobolCode::DISPLAY 'OPEN OUTP-FILE ERROR ' WS-OUTP-STATUS
//  DISPLAY 'OPEN OUTP-FILE ERROR ' WS-OUTP-STATUS
              logger.info("OPEN OUTP-FILE ERROR {}", new String(methodOut.getOutpStatus())); 
//  cobolCode::PERFORM 9100-ABEND THRU 9100-ABEND-EXIT
//  PERFORM 9100-ABEND THRU 9100-ABEND-EXIT
              abend(programCtx);/*9100-ABEND*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
          // MOVE 0 TO WS-INP1-CNT
          methodOut.setInp1Cnt((long)0);
          // MOVE 0 TO WS-OUTP-CNT-W
          methodOut.setOutpCntW((long)0);
          ;
      
      return methodOut;
      }
      /**
      * processRecord 
      *   This method is derived from 
  *   COBOL Paragraph - 0200-PROCESS-RECORD COBOL Cyclomatic complexity - 8
      * Input  :  

      * - inp1Cnt                        COBOL Name: WS-INP1-CNT
      * - parmMonth                      COBOL Name: LK-PARM-MONTH
      * - currentCard                    COBOL Name: WS-CURRENT-CARD
      *
      * Output :  

      * - wfRecord                       COBOL Name: WF-RECORD
      * - inp1Status                     COBOL Name: WS-INP1-STATUS
      * - inp1Cnt                        COBOL Name: WS-INP1-CNT
      * - wfInServiceMm                  COBOL Name: WF-IN-SERVICE-MM
      * - doneStatus                     COBOL Name: WS-DONE-STATUS
      * - wfInCardNumber                 COBOL Name: WF-IN-CARD-NUMBER
      * - currentCard                    COBOL Name: WS-CURRENT-CARD
      * - outTotal                       COBOL Name: WS-OUT-TOTAL
      * - wfInBalance                    COBOL Name: WF-IN-BALANCE
      *
      * @throws CFException
      */
      @Override
      public ProcessRecordOutCtx processRecord(ProcessRecordInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			BigDecimal tempDecimal = BigDecimal.ZERO;
			// End of variable declaration

      
// *

// *

// *
//Added variable to get the program context in place.
CfcardCtx programCtx = methodIn.getCfcardCtx();
//Added variable to get the output context in place.
ProcessRecordOutCtx methodOut = methodIn.getProcessRecordOutCtx();
          // READ FL-INPUT-FILE
          flInputFile.read();
          methodOut.setInp1Status(flInputFile.getStatusString());
          if (!flInputFile.hasEnded()) {
              methodOut.getWfRecord().setString(flInputFile.getRecord());
          }
//  cobolCode::IF NOT ( WS-INP1-STATUS = '00' OR '10' )
//  IF NOT ( WS-INP1-STATUS = '00' OR '10' )
//  LITERAL_10 = '10'
          if ((		compareChars(methodOut.getInp1Status(),CONSTANTS.LITERAL_00) != 0  && 		compareChars(methodOut.getInp1Status(),CONSTANTS.LITERAL_10) != 0 )) { 
//  cobolCode::DISPLAY 'READ  INP1-FILE ERROR ' WS-INP1-STATUS WF-RECORD
//  DISPLAY 'READ  INP1-FILE ERROR ' WS-INP1-STATUS WF-RECORD
              logger.info("READ  INP1-FILE ERROR {}{}", new String(methodOut.getInp1Status()), methodOut.getWfRecord().toString()); 
//  cobolCode::PERFORM 9100-ABEND THRU 9100-ABEND-EXIT
//  PERFORM 9100-ABEND THRU 9100-ABEND-EXIT
              abend(programCtx);/*9100-ABEND*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }

// *
//  cobolCode::ADD 1 TO WS-INP1-CNT
//  ADD 1 TO WS-INP1-CNT
          methodOut.setInp1Cnt(methodOut.getInp1Cnt()+(long)1);
//  cobolCode::IF WS-INP1-STATUS = '10' OR WF-IN-SERVICE-MM > LK-PARM-MONTH
//  IF WS-INP1-STATUS = '10' OR WF-IN-SERVICE-MM > LK-PARM-MONTH
          if (		compareChars(methodOut.getInp1Status(),CONSTANTS.LITERAL_10) == 0  || compareChars(methodOut.getWfInServiceMm(),String.valueOf(methodIn.getParmMonthString()).toCharArray()) > 0) { 
//  cobolCode::SET WS-PROCESSED TO TRUE
//  SET WS-PROCESSED TO TRUE
              methodOut.setProcessedTrue(); 
              
//cobolCode::GO TO 0200-EXIT
return methodOut;
//cobolCodeEnds::GO TO 0200-EXIT
          }

// *
// * If the month on the file is lower than requested skip
// *
//  cobolCode::IF WF-IN-SERVICE-MM < LK-PARM-MONTH THEN
//  IF WF-IN-SERVICE-MM < LK-PARM-MONTH THEN
          if (compareChars(methodOut.getWfInServiceMm(),String.valueOf(methodIn.getParmMonthString()).toCharArray()) < 0) { 
//cobolCode::GO TO 0200-EXIT
return methodOut;
//cobolCodeEnds::GO TO 0200-EXIT
          }

// *
//  cobolCode::IF WS-CURRENT-CARD = ALL ZEROS
//  IF WS-CURRENT-CARD = ALL ZEROS
          if (( allZeros(methodOut.getCurrentCard()) ) /*  ==  zeros*/) { 
              // MOVE WF-IN-CARD-NUMBER TO WS-CURRENT-CARD
              methodOut.setCurrentCard(methodOut.getWfInCardNumber());
//  cobolCode::MOVE ZERO TO WS-OUT-TOTAL
//  MOVE ZERO TO WS-OUT-TOTAL
              methodOut.setOutTotal(BigDecimal.ZERO);
          }

// *
//  cobolCode::IF WS-CURRENT-CARD EQUAL WF-IN-CARD-NUMBER
//  IF WS-CURRENT-CARD EQUAL WF-IN-CARD-NUMBER
          if (		compareChars(methodOut.getCurrentCard(),methodOut.getWfInCardNumber()) == 0 ) { 
//  cobolCode::ADD WF-IN-BALANCE TO WS-OUT-TOTAL
//  ADD WF-IN-BALANCE TO WS-OUT-TOTAL
              tempDecimal = methodOut.getOutTotal().add(methodOut.getWfInBalance()).setScale(3,RoundingMode.DOWN);
              methodOut.setOutTotal(tempDecimal);
              //
          }
//  cobolCode::ELSE
//  ELSE
          else { 

// *
//  cobolCode::PERFORM 0250-WRITE-FILE THRU 0250-EXIT
//  PERFORM 0250-WRITE-FILE THRU 0250-EXIT
              writeFile(programCtx.getWriteFileInCtx());/*0250-WRITE-FILE*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }

// *
              
// *
              // MOVE WF-IN-CARD-NUMBER TO WS-CURRENT-CARD
              methodOut.setCurrentCard(methodOut.getWfInCardNumber());
//  cobolCode::MOVE WF-IN-BALANCE TO WS-OUT-TOTAL
//  MOVE WF-IN-BALANCE TO WS-OUT-TOTAL
              methodOut.setOutTotal(methodOut.getWfInBalance());
          }
      
      return methodOut;
      }
      /**
      * writeFile 
      *   This method is derived from 
  *   COBOL Paragraph - 0250-WRITE-FILE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - parmMonth                      COBOL Name: LK-PARM-MONTH
      * - currentCard                    COBOL Name: WS-CURRENT-CARD
      * - outTotal                       COBOL Name: WS-OUT-TOTAL
      * - wfOutput                       COBOL Name: WF-OUTPUT
      * - outpCntW                       COBOL Name: WS-OUTP-CNT-W
      *
      * Output :  

      * - wfOutServiceMm                 COBOL Name: WF-OUT-SERVICE-MM
      * - parmMonth                      COBOL Name: LK-PARM-MONTH
      * - wfOutCardNumber                COBOL Name: WF-OUT-CARD-NUMBER
      * - currentCard                    COBOL Name: WS-CURRENT-CARD
      * - wfOutTotal                     COBOL Name: WF-OUT-TOTAL
      * - outTotal                       COBOL Name: WS-OUT-TOTAL
      * - outpStatus                     COBOL Name: WS-OUTP-STATUS
      * - outpCntW                       COBOL Name: WS-OUTP-CNT-W
      *
      * @throws CFException
      */
      @Override
      public WriteFileOutCtx writeFile(WriteFileInCtx methodIn) throws Exception {
      
// *

// *
//Added variable to get the program context in place.
CfcardCtx programCtx = methodIn.getCfcardCtx();
//Added variable to get the output context in place.
WriteFileOutCtx methodOut = methodIn.getWriteFileOutCtx();
//  cobolCode::MOVE LK-PARM-MONTH TO WF-OUT-SERVICE-MM
//  MOVE LK-PARM-MONTH TO WF-OUT-SERVICE-MM
          methodOut.setWfOutServiceMm(methodOut.getParmMonth());
//  cobolCode::MOVE WS-CURRENT-CARD TO WF-OUT-CARD-NUMBER
//  MOVE WS-CURRENT-CARD TO WF-OUT-CARD-NUMBER
          methodOut.setWfOutCardNumber(methodOut.getCurrentCard());
//  cobolCode::MOVE WS-OUT-TOTAL TO WF-OUT-TOTAL
//  MOVE WS-OUT-TOTAL TO WF-OUT-TOTAL
          methodOut.setWfOutTotal(methodOut.getOutTotal());

// *

// *
//  cobolCode::WRITE WF-OUTPUT
//  WRITE WF-OUTPUT
          flOutputFile.write(methodOut.getWfOutput().toCharArray()); 
          methodOut.getWfOutput().setString(CONSTANTS.LOW_VALUE_1253883881);
          methodOut.setOutpStatus(flOutputFile.getStatusString() );
//  cobolCode::IF NOT ( WS-OUTP-STATUS = '00' OR '22' )
//  IF NOT ( WS-OUTP-STATUS = '00' OR '22' )
//  LITERAL_22 = '22'
          if ((		compareChars(methodOut.getOutpStatus(),CONSTANTS.LITERAL_00) != 0  && 		compareChars(methodOut.getOutpStatus(),CONSTANTS.LITERAL_22) != 0 )) { 
//  cobolCode::DISPLAY 'WRITE OUTP-FILE ERROR ' WS-OUTP-STATUS WF-OUTPUT
//  DISPLAY 'WRITE OUTP-FILE ERROR ' WS-OUTP-STATUS WF-OUTPUT
              logger.info("WRITE OUTP-FILE ERROR {}{}", new String(methodOut.getOutpStatus()), methodOut.getWfOutput().toString()); 
//  cobolCode::PERFORM 9100-ABEND THRU 9100-ABEND-EXIT
//  PERFORM 9100-ABEND THRU 9100-ABEND-EXIT
              abend(programCtx);/*9100-ABEND*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }

// *
//  cobolCode::ADD 1 TO WS-OUTP-CNT-W
//  ADD 1 TO WS-OUTP-CNT-W
          methodOut.setOutpCntW(methodOut.getOutpCntW()+(long)1);
      
      return methodOut;
      }
      /**
      * terminate 
      *   This method is derived from 
  *   COBOL Paragraph - 0300-TERMINATE COBOL Cyclomatic complexity - 6
      * Input  :  

      * - currentCard                    COBOL Name: WS-CURRENT-CARD
      * - inp1Status                     COBOL Name: WS-INP1-STATUS
      * - outpStatus                     COBOL Name: WS-OUTP-STATUS
      * - outpCntW                       COBOL Name: WS-OUTP-CNT-W
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public TerminateOutCtx terminate(TerminateInCtx methodIn) throws Exception {
      
// *

// *

// *        When input file had no records then skip
//Added variable to get the program context in place.
CfcardCtx programCtx = methodIn.getCfcardCtx();
//Added variable to get the output context in place.
TerminateOutCtx methodOut = methodIn.getTerminateOutCtx();
//  cobolCode::IF WS-CURRENT-CARD = SPACES OR LOW-VALUES THEN
//  IF WS-CURRENT-CARD = SPACES OR LOW-VALUES THEN
//  cobolCode::ELSE
//  ELSE
          if (        ( !allSpaces(methodIn.getCurrentCard())  ) && !( checkLowValue(methodIn.getCurrentCard()) ) ) { 

// *        Write the last city record
//  cobolCode::PERFORM 0250-WRITE-FILE THRU 0250-EXIT
//  PERFORM 0250-WRITE-FILE THRU 0250-EXIT
              writeFile(programCtx.getWriteFileInCtx());/*0250-WRITE-FILE*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }

// *
//  cobolCode::CLOSE FL-INPUT-FILE
//  CLOSE FL-INPUT-FILE
          flInputFile.close(); 
          methodOut.setInp1Status(flInputFile.getStatusString() );
//  cobolCode::IF NOT ( WS-INP1-STATUS = '00' )
//  IF NOT ( WS-INP1-STATUS = '00' )
//  LITERAL_00 = '00'
          if ((		compareChars(methodOut.getInp1Status(),CONSTANTS.LITERAL_00) != 0 )) { 
//  cobolCode::DISPLAY 'CLOSE INP1-FILE ERROR ' WS-INP1-STATUS
//  DISPLAY 'CLOSE INP1-FILE ERROR ' WS-INP1-STATUS
              logger.info("CLOSE INP1-FILE ERROR {}", new String(methodOut.getInp1Status())); 
//  cobolCode::PERFORM 9100-ABEND THRU 9100-ABEND-EXIT
//  PERFORM 9100-ABEND THRU 9100-ABEND-EXIT
              abend(programCtx);/*9100-ABEND*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  cobolCode::CLOSE FL-OUTPUT-FILE
//  CLOSE FL-OUTPUT-FILE
          flOutputFile.close(); 
          methodOut.setOutpStatus(flOutputFile.getStatusString() );
//  cobolCode::IF NOT ( WS-OUTP-STATUS = '00' )
//  IF NOT ( WS-OUTP-STATUS = '00' )
//  LITERAL_00 = '00'
          if ((		compareChars(methodOut.getOutpStatus(),CONSTANTS.LITERAL_00) != 0 )) { 
//  cobolCode::DISPLAY 'CLOSE OUTP-FILE ERROR ' WS-OUTP-STATUS
//  DISPLAY 'CLOSE OUTP-FILE ERROR ' WS-OUTP-STATUS
              logger.info("CLOSE OUTP-FILE ERROR {}", new String(methodOut.getOutpStatus())); 
//  cobolCode::PERFORM 9100-ABEND THRU 9100-ABEND-EXIT
//  PERFORM 9100-ABEND THRU 9100-ABEND-EXIT
              abend(programCtx);/*9100-ABEND*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  cobolCode::DISPLAY 'RECORDS WRITTEN    ' WS-OUTP-CNT-W
//  DISPLAY 'RECORDS WRITTEN    ' WS-OUTP-CNT-W
          logger.info("RECORDS WRITTEN    {}", String.valueOf(methodIn.getOutpCntW())); 
//  cobolCode::DISPLAY 'PROGRAM CFCITY  ENDED SUCCESSFULLY'
//  DISPLAY 'PROGRAM CFCITY  ENDED SUCCESSFULLY'
          logger.info("PROGRAM CFCITY  ENDED SUCCESSFULLY"); 
//  cobolCode::GOBACK
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * abend 
      *   This method is derived from 
  *   COBOL Paragraph - 9100-ABEND COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public AbendOutCtx abend(CfcardCtx programCtx) throws Exception {
//Added variable to get the output context in place.
AbendOutCtx methodOut = programCtx.getAbendOutCtx();
//  cobolCode::DISPLAY 'PROGRAM CFCARD  ENDED UNSUCCESSFULLY'
//  DISPLAY 'PROGRAM CFCARD  ENDED UNSUCCESSFULLY'
          logger.info("PROGRAM CFCARD  ENDED UNSUCCESSFULLY"); 
          // MOVE 12 TO RETURN-CODE
          programCtx.setRc( 12);
//  cobolCode::GOBACK
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      CfcardCtx programCtx = (CfcardCtx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getParm().set((Field)params[0]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      CfcardCtx programCtx = (CfcardCtx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Parm) {
                       	programCtx.setParm((Parm) parameters[index]);
                  	} else {
                       	programCtx.getParm().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
  
  
  
  
  
  }
