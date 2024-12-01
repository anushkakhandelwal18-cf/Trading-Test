package com.cloudframe.app.business.impl;
  /* 
*00***************************************************************
*00   licensed materials - property of united health group       *
*00***************************************************************
*10***************************************************************
*10                                                              *
*10   program name      : vp776a00.                              *
*10   business function : the purpose of the program is to       *
*10                       validate sort request parameter and    *
*10                       sort the table  during the end process *
*10                       for each system                        *
*10   designed by       : n/a.                                   *
*10   programmed by     : dave morgan                            *
*10   date coded        : oct 5,1995.                            *
*10   frequency used    : on-line.                               *
*10   type              : on request.                            *
*10                                                              *
*10***************************************************************
*20***************************************************************
*20                                                              *
*20   major program process                                      *
*20   ---------------------                                      *
*20                                                              *
*20   the purpose of the  program is to validate sort request    *
*20   parameter and sort the table(ascending  or descending      *
*20   order)                                                     *
*20                                                              *
*20***************************************************************
*30***************************************************************
*30                                                              *
*30   program change history:                                    *
*30   ----------------------                                     *
*30                                                              *
*30    pr #       date        level#                             *
*30    rkm        08/25/03    structured comments                *
*30                                                              *
*30***************************************************************
*40***************************************************************
*40                                                              *
*40   called modules                                             *
*40   --------------                                             *
*40                                                              *
*40   name      description              call/link               *
*40   ----      -----------              ---------               *
*40    n/a          n/a                     n/a                  *
*40                                                              *
*40***************************************************************
*50***************************************************************
*50                                                              *
*50   return code                                                *
*50   -----------                                                *
*50                                                              *
*50   code                            description                *
*50   -------------------------       -----------                *
*50   srp-good-return       =00       successful completion      *
*50   srp-count-error       =02       entry count error          *
*50   srp-entry-length-error=03       entry length  error        *
*50   srp-key-start-error   =04       key start error            *
*50   srp-key-length-error  =05       key length error           *
*50   srp-sequence-error    =06       sequence error             *
*50                                                              *
*50***************************************************************
*60***************************************************************
*60                                                              *
*60   files used                                                 *
*60   ----------                                                 *
*60                                                              *
*60   file name          mode         description                *
*60   ----------         ----         -----------                *
*60     n/a               n/a             n/a                    *
*60                                                              *
*60***************************************************************
*70***************************************************************
*70                                                              *
*70   tables and access types                                    *
*70   -----------------------                                    *
*70                                                              *
*70   name            type       access                          *
*70   ----            ----       ------                          *
*70   n/a             n/a        n/a                             *
*70                                                              *
*70***************************************************************
*/
  
import com.cloudframe.app.common.CommonProcess;
import com.cloudframe.app.dto.vp776a00.Vp776a00Ctx.*;
import com.cloudframe.app.dto.vp776a00.Vp776a00Ctx;
import com.cloudframe.app.business.Vp776a00;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import java.math.BigDecimal;
  import java.math.RoundingMode;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.vp776a00.*;
import com.cloudframe.app.dto.vp776a00.DfhcommareaGroup;
import com.cloudframe.app.dto.vp776a00.SrpSortRequestParameters;
import com.cloudframe.app.dto.vp776a00.SdtSortDataTableGroup;
import com.cloudframe.app.dto.vp776a00.Sc2SortCompare2Group;
import com.cloudframe.app.dto.vp776a00.Sc1SortCompare1Group;
import com.cloudframe.app.dto.vp776a00.PwaPointerGroup;
import com.cloudframe.app.dto.vp776a00.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("vp776a00")
  
  public class Vp776a00Impl extends CommonProcess implements Vp776a00 {
  
  Logger logger = LoggerFactory.getLogger(Vp776a00Impl.class);
  
  
  
  
  
  
  
  
  
  
      @Override
      public int setParameter(Vp776a00Ctx programCtx, String dfheiblk,String dfhcommareaGroup,String srpSortRequestParameters,String sdtSortDataTableGroup) throws Exception {
      		if(dfhcommareaGroup != null)
      		    programCtx.getDfhcommareaGroup().setString(com.cloudframe.app.data.Field.getParm(dfhcommareaGroup),new String(CONSTANTS.EBCDIC_ENCODING));
      		if(srpSortRequestParameters != null)
      		    programCtx.getSrpSortRequestParameters().setString(com.cloudframe.app.data.Field.getParm(srpSortRequestParameters),new String(CONSTANTS.EBCDIC_ENCODING));
      		if(sdtSortDataTableGroup != null)
      		    programCtx.getSdtSortDataTableGroup().setString(com.cloudframe.app.data.Field.getParm(sdtSortDataTableGroup),new String(CONSTANTS.EBCDIC_ENCODING));
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
      public int process(Vp776a00Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
//Added variable to get the output context in place.
ProcessInCtx methodIn = programCtx.getProcessInCtx();
//  cobolCode::PERFORM MAINLINE-0000
          mainline0000(programCtx);/*MAINLINE-0000 SECTION*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
          exit0000(programCtx);/*EXIT-0000*/
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
      * mainline0000 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-0000 SECTION COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - srpReturnCode                  COBOL Name: SRP-RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public Mainline0000OutCtx mainline0000(Vp776a00Ctx programCtx) throws Exception {
      
// *82 Called by :none                                              *
// *82 calls     :1.validate-request-0100                           *
// *82            2.sort-the-table-0200                             *
// *82                                                              *
// *82***************************************************************
//Added variable to get the output context in place.
Mainline0000OutCtx methodOut = programCtx.getMainline0000OutCtx();
//  cobolCode::SET SRP-GOOD-RETURN TO TRUE
          methodOut.setSrpGoodReturnTrue(); 
          
//  cobolCode::PERFORM VALIDATE-REQUEST-0100
          validateRequest0100(programCtx.getValidateRequest0100InCtx());/*VALIDATE-REQUEST-0100 SECTION*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  cobolCode::IF SRP-GOOD-RETURN
//  cobolCode::ELSE
          if (!(methodOut.isSrpGoodReturn()) ) { 
//cobolCode::GO TO EXIT-0000
exit0000(programCtx);
 return methodOut;
//cobolCodeEnds::GO TO EXIT-0000
          }
//  cobolCode::PERFORM SORT-THE-TABLE-0200
          sortTheTable0200(programCtx.getSortTheTable0200InCtx());/*SORT-THE-TABLE-0200 SECTION*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
      
      return methodOut;
      }
      /**
      * exit0000 
      *   This method is derived from 
  *   COBOL Paragraph - EXIT-0000 COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void exit0000(Vp776a00Ctx programCtx) throws Exception {
//  cobolCode::GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
      /**
      * validateRequest0100 
      *   This method is derived from 
  *   COBOL Paragraph - VALIDATE-REQUEST-0100 SECTION COBOL Cyclomatic complexity - 14
      * Input  :  

      * - srpEntryCount                  COBOL Name: SRP-ENTRY-COUNT
      * - srpEntryLength                 COBOL Name: SRP-ENTRY-LENGTH
      * - sc1SortCompare1                COBOL Name: SC1-SORT-COMPARE-1
      * - srpKeyStart                    COBOL Name: SRP-KEY-START
      * - srpKeyLength                   COBOL Name: SRP-KEY-LENGTH
      * - srpSequence                    COBOL Name: SRP-SEQUENCE
      *
      * Output :  

      * - srpReturnCode                  COBOL Name: SRP-RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public ValidateRequest0100OutCtx validateRequest0100(ValidateRequest0100InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int SC_1_SORT_COMPARE_1_LENGTH = 32767;
			// End of variable declaration

      
// *82                                                              *
// *82 Called by :1.mainline-0000                                   *
// *82 calls     :  n/a                                             *
// *82                                                              *
// *82***************************************************************
//Added variable to get the program context in place.
Vp776a00Ctx programCtx = methodIn.getVp776a00Ctx();
//Added variable to get the output context in place.
ValidateRequest0100OutCtx methodOut = methodIn.getValidateRequest0100OutCtx();
//  cobolCode::IF ( SRP-ENTRY-COUNT NUMERIC) AND ( SRP-ENTRY-COUNT > 0)
//  cobolCode::ELSE
          if ((         !(methodIn.getSrpSortRequestParameters().srpEntryCountIsNumeric() ) ) || (	( methodIn.getSrpEntryCount() <= 0 ))) { 
//  cobolCode::SET SRP-COUNT-ERROR TO TRUE
              methodOut.setSrpCountErrorTrue(); 
              
//cobolCode::GO TO EXIT-0100
return methodOut;
//cobolCodeEnds::GO TO EXIT-0100
          }
//  cobolCode::IF ( SRP-ENTRY-LENGTH NUMERIC) AND ( SRP-ENTRY-LENGTH > 0) AND ( SRP-ENTRY-LENGTH NOT > LENGTH OF SC1-SORT-COMPARE-1 )
//  cobolCode::ELSE
          if ((         !(methodIn.getSrpSortRequestParameters().srpEntryLengthIsNumeric() ) ) || (	( methodIn.getSrpEntryLength() <= 0 )) || (	( methodIn.getSrpEntryLength() > SC_1_SORT_COMPARE_1_LENGTH ))) { 
//  cobolCode::SET SRP-ENTRY-LENGTH-ERROR TO TRUE
              methodOut.setSrpEntryLengthErrorTrue(); 
              
//cobolCode::GO TO EXIT-0100
return methodOut;
//cobolCodeEnds::GO TO EXIT-0100
          }
//  cobolCode::IF ( SRP-KEY-START NUMERIC) AND ( SRP-KEY-START > 0) AND ( SRP-KEY-START NOT > SRP-ENTRY-LENGTH )
//  cobolCode::ELSE
          if ((         !(methodIn.getSrpSortRequestParameters().srpKeyStartIsNumeric() ) ) || (	( methodIn.getSrpKeyStart() <= 0 )) || (	( methodIn.getSrpKeyStart() > methodIn.getSrpEntryLength() ))) { 
//  cobolCode::SET SRP-KEY-START-ERROR TO TRUE
              methodOut.setSrpKeyStartErrorTrue(); 
              
//cobolCode::GO TO EXIT-0100
return methodOut;
//cobolCodeEnds::GO TO EXIT-0100
          }
//  cobolCode::IF ( SRP-KEY-LENGTH NUMERIC) AND ( SRP-KEY-LENGTH > 0) AND ( SRP-KEY-LENGTH NOT > SRP-ENTRY-LENGTH )
//  cobolCode::ELSE
          if ((         !(methodIn.getSrpSortRequestParameters().srpKeyLengthIsNumeric() ) ) || (	( methodIn.getSrpKeyLength() <= 0 )) || (	( methodIn.getSrpKeyLength() > methodIn.getSrpEntryLength() ))) { 
//  cobolCode::SET SRP-KEY-LENGTH-ERROR TO TRUE
              methodOut.setSrpKeyLengthErrorTrue(); 
              
//cobolCode::GO TO EXIT-0100
return methodOut;
//cobolCodeEnds::GO TO EXIT-0100
          }
//  cobolCode::IF ( SRP-SEQUENCE = 'A' OR 'D' )
//  LITERAL_D = 'D'
//  cobolCode::ELSE
          if ((methodIn.getSrpSequence()[0] != 'A' && methodIn.getSrpSequence()[0] != 'D')) { 
//  cobolCode::SET SRP-SEQUENCE-ERROR TO TRUE
              methodOut.setSrpSequenceErrorTrue(); 
              
//cobolCode::GO TO EXIT-0100
return methodOut;
//cobolCodeEnds::GO TO EXIT-0100
          }
      
      return methodOut;
      }
      /**
      * sortTheTable0200 
      *   This method is derived from 
  *   COBOL Paragraph - SORT-THE-TABLE-0200 SECTION COBOL Cyclomatic complexity - 7
      * Input  :  

      * - srpEntryCount                  COBOL Name: SRP-ENTRY-COUNT
      * - pwaSub1                        COBOL Name: PWA-SUB1
      * - sdtSortDataTable               COBOL Name: SDT-SORT-DATA-TABLE
      * - pwaAddress                     COBOL Name: PWA-ADDRESS
      * - srpEntryLength                 COBOL Name: SRP-ENTRY-LENGTH
      * - srpSequence                    COBOL Name: SRP-SEQUENCE
      *
      * Output :  

      * - pwaSortGap                     COBOL Name: PWA-SORT-GAP
      * - srpEntryCount                  COBOL Name: SRP-ENTRY-COUNT
      * - pwaSortSwitch                  COBOL Name: PWA-SORT-SWITCH
      * - pwaLimit                       COBOL Name: PWA-LIMIT
      * - pwaSub1                        COBOL Name: PWA-SUB1
      * - pwaSub2                        COBOL Name: PWA-SUB2
      * - pwaPointer                     COBOL Name: PWA-POINTER
      * - pwaAddress                     COBOL Name: PWA-ADDRESS
      * - sc1SortCompare1                COBOL Name: SC1-SORT-COMPARE-1
      * - sc2SortCompare2                COBOL Name: SC2-SORT-COMPARE-2
      *
      * @throws CFException
      */
      @Override
      public SortTheTable0200OutCtx sortTheTable0200(SortTheTable0200InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			BigDecimal tempDecimal = BigDecimal.ZERO;
			// End of variable declaration

      
// *82     -Sort the table in ascending order otherwise             *
// *82      sort the table in descending order                      *
// *82                                                              *
// *82 called by :1.mainline-0000                                   *
// *82 calls     :1.compare-ascending-0300                          *
// *82            2.compare-descending-0400                         *
// *82                                                              *
// *82***************************************************************

// *
// *    Use comb sort to arrange table by sort key.
// *
//Added variable to get the program context in place.
Vp776a00Ctx programCtx = methodIn.getVp776a00Ctx();
//Added variable to get the output context in place.
SortTheTable0200OutCtx methodOut = methodIn.getSortTheTable0200OutCtx();
//  cobolCode::MOVE SRP-ENTRY-COUNT TO PWA-SORT-GAP
          methodOut.setPwaSortGap((short) methodOut.getSrpEntryCount());
//  cobolCode::SET PWA-SORT-INCOMPLETE TO TRUE
          methodOut.setPwaSortIncompleteTrue(); 
          
//  cobolCode::PERFORM UNTIL PWA-SORT-COMPLETE AND PWA-SORT-GAP < 2
          while ((!(methodOut.isPwaSortComplete())  || 	( methodOut.getPwaSortGap() >= 2 ) )) {
//  cobolCode::DIVIDE PWA-SORT-GAP BY 1.3 GIVING PWA-SORT-GAP
              methodOut.setPwaSortGap(BigDecimal.valueOf(methodOut.getPwaSortGap()).divide(BigDecimal.valueOf(1.3),0,RoundingMode.DOWN).shortValue());
//  cobolCode::IF PWA-SORT-GAP < 1
              if (	( methodOut.getPwaSortGap() < 1 ) ) { 
                  methodOut.setPwaSortGap((short)1);
              }
//  cobolCode::SET PWA-SORT-COMPLETE TO TRUE
              methodOut.setPwaSortCompleteTrue(); 
              
//  cobolCode::SUBTRACT PWA-SORT-GAP FROM SRP-ENTRY-COUNT GIVING PWA-LIMIT
              methodOut.setPwaLimit( (short) ((short) methodOut.getSrpEntryCount()-methodOut.getPwaSortGap()));
//  cobolCode::PERFORM VARYING PWA-SUB1 FROM 1 BY 1 UNTIL PWA-SUB1 > PWA-LIMIT
              for (methodOut.setPwaSub1((short)1); (	( methodOut.getPwaSub1() <= methodOut.getPwaLimit() )) ; methodOut.setPwaSub1((short)(methodOut.getPwaSub1() + 1)) ) {
//  cobolCode::COMPUTE PWA-SUB2 = PWA-SUB1 + PWA-SORT-GAP END-COMPUTE
                  methodOut.setPwaSub2((short) (methodOut.getPwaSub1() + methodOut.getPwaSortGap()));
//  cobolCode::SET PWA-POINTER TO ADDRESS OF SDT-SORT-DATA-TABLE
                  methodOut.setPwaPointer(setObject(methodIn.getSdtSortDataTableGroup())); 
                  
//  cobolCode::COMPUTE PWA-ADDRESS = PWA-ADDRESS + ( ( PWA-SUB1 - 1) * SRP-ENTRY-LENGTH ) END-COMPUTE
                  methodOut.setPwaAddress(methodOut.getPwaAddress() +  (  ( methodOut.getPwaSub1() - 1 )  * methodIn.getSrpEntryLength() ) );
//  cobolCode::SET ADDRESS OF SC1-SORT-COMPARE-1 TO PWA-POINTER
                  methodIn.getSc1SortCompare1Group().set(getObject(methodOut.getPwaPointer())); 
                  
//  cobolCode::SET PWA-POINTER TO ADDRESS OF SDT-SORT-DATA-TABLE
                  methodOut.setPwaPointer(setObject(methodIn.getSdtSortDataTableGroup())); 
                  
//  cobolCode::COMPUTE PWA-ADDRESS = PWA-ADDRESS + ( ( PWA-SUB2 - 1) * SRP-ENTRY-LENGTH ) END-COMPUTE
                  methodOut.setPwaAddress(methodOut.getPwaAddress() +  (  ( methodOut.getPwaSub2() - 1 )  * methodIn.getSrpEntryLength() ) );
//  cobolCode::SET ADDRESS OF SC2-SORT-COMPARE-2 TO PWA-POINTER
                  methodIn.getSc2SortCompare2Group().set(getObject(methodOut.getPwaPointer())); 
                  
//  cobolCode::IF SRP-SEQUENCE = 'A'
//  LITERAL_A = 'A'
                  if (compareChars(methodIn.getSrpSequence(), CONSTANTS.LITERAL_A) == 0) { 
//  cobolCode::PERFORM COMPARE-ASCENDING-0300
                      compareAscending0300(programCtx.getCompareAscending0300InCtx());/*COMPARE-ASCENDING-0300 SECTION*/
                  }
//  cobolCode::ELSE
                  else { 
//  cobolCode::PERFORM COMPARE-DESCENDING-0400
                      compareDescending0400(programCtx.getCompareDescending0400InCtx());/*COMPARE-DESCENDING-0400 SECTION*/
                  }
              }
          }
      
      return methodOut;
      }
      /**
      * compareAscending0300 
      *   This method is derived from 
  *   COBOL Paragraph - COMPARE-ASCENDING-0300 SECTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sc1SortCompare1                COBOL Name: SC1-SORT-COMPARE-1
      * - sc2SortCompare2                COBOL Name: SC2-SORT-COMPARE-2
      * - srpKeyStart                    COBOL Name: SRP-KEY-START
      * - srpKeyLength                   COBOL Name: SRP-KEY-LENGTH
      *
      * Output :  

      * - pwaSwapEntry                   COBOL Name: PWA-SWAP-ENTRY
      * - sc1SortCompare1                COBOL Name: SC1-SORT-COMPARE-1
      * - sc2SortCompare2                COBOL Name: SC2-SORT-COMPARE-2
      * - pwaSortSwitch                  COBOL Name: PWA-SORT-SWITCH
      *
      * @throws CFException
      */
      @Override
      public CompareAscending0300OutCtx compareAscending0300(CompareAscending0300InCtx methodIn) throws Exception {
      
// *82 Called by :1.sort-the-table-0200                             *
// *82 calls     :  n/a                                             *
// *82                                                              *
// *82***************************************************************
//Added variable to get the program context in place.
Vp776a00Ctx programCtx = methodIn.getVp776a00Ctx();
//Added variable to get the output context in place.
CompareAscending0300OutCtx methodOut = methodIn.getCompareAscending0300OutCtx();
//  cobolCode::IF SC1-SORT-COMPARE-1 ( SRP-KEY-START : SRP-KEY-LENGTH ) > SC2-SORT-COMPARE-2 ( SRP-KEY-START : SRP-KEY-LENGTH )
          if (		compareChars(substring(methodOut.getSc1SortCompare1(),(methodIn.getSrpKeyStart()-1), (methodIn.getSrpKeyLength() + (methodIn.getSrpKeyStart() - 1)) ),substring(methodOut.getSc2SortCompare2(),(methodIn.getSrpKeyStart()-1), (methodIn.getSrpKeyLength() + (methodIn.getSrpKeyStart() - 1)) )) > 0 ) { 
//  cobolCode::MOVE SC1-SORT-COMPARE-1 (1 : SRP-ENTRY-LENGTH ) TO PWA-SWAP-ENTRY (1 : SRP-ENTRY-LENGTH )
              methodOut.setPwaSwapEntry(replace(methodOut.getPwaSwapEntry(),substring(methodOut.getSc1SortCompare1(),0,methodIn.getSrpEntryLength()),0,methodIn.getSrpEntryLength()));
//  cobolCode::MOVE SC2-SORT-COMPARE-2 (1 : SRP-ENTRY-LENGTH ) TO SC1-SORT-COMPARE-1 (1 : SRP-ENTRY-LENGTH )
              methodOut.getSc1SortCompare1Group().replace(methodOut.getSc2SortCompare2Group()/*parent*/,0/*fromOffset - (sc1SortCompare1) */,methodIn.getSrpEntryLength()/*fromLen*/,0/*toOffset - (sc2SortCompare2) */,methodIn.getSrpEntryLength()/*toLen*/);
//  cobolCode::MOVE PWA-SWAP-ENTRY (1 : SRP-ENTRY-LENGTH ) TO SC2-SORT-COMPARE-2 (1 : SRP-ENTRY-LENGTH )
              methodOut.setSc2SortCompare2(methodOut.getPwaSwapEntry(),0/* pwaSwapEntry */ ,methodIn.getSrpEntryLength(),0,methodIn.getSrpEntryLength() /* field,sourceIndex,sourceLen,targetIndex,targetLen */);
//  cobolCode::SET PWA-SORT-INCOMPLETE TO TRUE
              methodOut.setPwaSortIncompleteTrue(); 
              
          }
      
      return methodOut;
      }
      /**
      * compareDescending0400 
      *   This method is derived from 
  *   COBOL Paragraph - COMPARE-DESCENDING-0400 SECTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sc1SortCompare1                COBOL Name: SC1-SORT-COMPARE-1
      * - sc2SortCompare2                COBOL Name: SC2-SORT-COMPARE-2
      * - srpKeyStart                    COBOL Name: SRP-KEY-START
      * - srpKeyLength                   COBOL Name: SRP-KEY-LENGTH
      *
      * Output :  

      * - pwaSwapEntry                   COBOL Name: PWA-SWAP-ENTRY
      * - sc1SortCompare1                COBOL Name: SC1-SORT-COMPARE-1
      * - sc2SortCompare2                COBOL Name: SC2-SORT-COMPARE-2
      * - pwaSortSwitch                  COBOL Name: PWA-SORT-SWITCH
      *
      * @throws CFException
      */
      @Override
      public CompareDescending0400OutCtx compareDescending0400(CompareDescending0400InCtx methodIn) throws Exception {
      
// *82 Called by :1.sort-the-table-0200                             *
// *82 calls     :  n/a                                             *
// *82                                                              *
// *82***************************************************************
//Added variable to get the program context in place.
Vp776a00Ctx programCtx = methodIn.getVp776a00Ctx();
//Added variable to get the output context in place.
CompareDescending0400OutCtx methodOut = methodIn.getCompareDescending0400OutCtx();
//  cobolCode::IF SC1-SORT-COMPARE-1 ( SRP-KEY-START : SRP-KEY-LENGTH ) < SC2-SORT-COMPARE-2 ( SRP-KEY-START : SRP-KEY-LENGTH )
          if (		compareChars(substring(methodOut.getSc1SortCompare1(),(methodIn.getSrpKeyStart()-1), (methodIn.getSrpKeyLength() + (methodIn.getSrpKeyStart() - 1)) ),substring(methodOut.getSc2SortCompare2(),(methodIn.getSrpKeyStart()-1), (methodIn.getSrpKeyLength() + (methodIn.getSrpKeyStart() - 1)) )) < 0 ) { 
//  cobolCode::MOVE SC1-SORT-COMPARE-1 (1 : SRP-ENTRY-LENGTH ) TO PWA-SWAP-ENTRY (1 : SRP-ENTRY-LENGTH )
              methodOut.setPwaSwapEntry(replace(methodOut.getPwaSwapEntry(),substring(methodOut.getSc1SortCompare1(),0,methodIn.getSrpEntryLength()),0,methodIn.getSrpEntryLength()));
//  cobolCode::MOVE SC2-SORT-COMPARE-2 (1 : SRP-ENTRY-LENGTH ) TO SC1-SORT-COMPARE-1 (1 : SRP-ENTRY-LENGTH )
              methodOut.getSc1SortCompare1Group().replace(methodOut.getSc2SortCompare2Group()/*parent*/,0/*fromOffset - (sc1SortCompare1) */,methodIn.getSrpEntryLength()/*fromLen*/,0/*toOffset - (sc2SortCompare2) */,methodIn.getSrpEntryLength()/*toLen*/);
//  cobolCode::MOVE PWA-SWAP-ENTRY (1 : SRP-ENTRY-LENGTH ) TO SC2-SORT-COMPARE-2 (1 : SRP-ENTRY-LENGTH )
              methodOut.setSc2SortCompare2(methodOut.getPwaSwapEntry(),0/* pwaSwapEntry */ ,methodIn.getSrpEntryLength(),0,methodIn.getSrpEntryLength() /* field,sourceIndex,sourceLen,targetIndex,targetLen */);
//  cobolCode::SET PWA-SORT-INCOMPLETE TO TRUE
              methodOut.setPwaSortIncompleteTrue(); 
              
          }
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Vp776a00Ctx programCtx = (Vp776a00Ctx) ctx;
      
      int len = params.length;
         if (len > 1 && params[1] != null )
            programCtx.getDfhcommareaGroup().set((Field)params[1]);
         if (len > 2 && params[2] != null )
            programCtx.getSrpSortRequestParameters().set((Field)params[2]);
         if (len > 3 && params[3] != null )
            programCtx.getSdtSortDataTableGroup().set((Field)params[3]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Vp776a00Ctx programCtx = (Vp776a00Ctx) ctx;
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
              case 2:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof SrpSortRequestParameters) {
                       	programCtx.setSrpSortRequestParameters((SrpSortRequestParameters) parameters[index]);
                  	} else {
                       	programCtx.getSrpSortRequestParameters().set(parameters[index]);
                  	}
                  }
                
                  break;
              case 3:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof SdtSortDataTableGroup) {
                       	programCtx.setSdtSortDataTableGroup((SdtSortDataTableGroup) parameters[index]);
                  	} else {
                       	programCtx.getSdtSortDataTableGroup().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
  
  
  
  
  
  }
