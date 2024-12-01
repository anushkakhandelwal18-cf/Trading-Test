package com.cloudframe.app.business.impl;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
import com.cloudframe.app.common.CommonProcess;
import com.cloudframe.app.dto.d529351u.D529351uCtx.*;
import com.cloudframe.app.dto.d529351u.D529351uCtx;
import com.cloudframe.app.business.D529351u;
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
  import com.cloudframe.app.utility.CFUtil;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.repository.D529351uRepository;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.d529351u.*;
import com.cloudframe.app.dto.d529351u.WorkArea;
import com.cloudframe.app.dto.d529351u.Vyspi51uCallArea;
import com.cloudframe.app.dto.d529351u.TestVariables;
import com.cloudframe.app.dto.d529351u.DsmCallArea;
import com.cloudframe.app.dto.d529351u.Sqlca;
import com.cloudframe.app.dto.d529351u.HvHostVariablesCombcr;
import com.cloudframe.app.dto.d529351u.DclfeSpiPlnVar;
import com.cloudframe.app.dto.d529351u.DclfeSpiRuleIcd;
import com.cloudframe.app.dto.d529351u.HvHostVariablesCsplnv;
import com.cloudframe.app.dto.d529351u.DclfeSpiRuleCaus;
import com.cloudframe.app.dto.d529351u.DclfeSpiRuleCpeFlg;
import com.cloudframe.app.dto.d529351u.HvHostVariablesSvcmain;
import com.cloudframe.app.dto.d529351u.DclfeSpiRuleFrCondPos;
import com.cloudframe.app.dto.d529351u.LstIcdKey;
import com.cloudframe.app.dto.d529351u.DclfeSpiRuleIpa;
import com.cloudframe.app.dto.d529351u.DclfeSpiRuleFrToSvc;
import com.cloudframe.app.dto.d529351u.HvHostVariablesCsicdo;
import com.cloudframe.app.dto.d529351u.DclfeSpiRuleProvTyp;
import com.cloudframe.app.dto.d529351u.HvHostVariablesCsfrto;
import com.cloudframe.app.dto.d529351u.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("d529351u")
  
  public class D529351uImpl extends CommonProcess implements D529351u {
  
  Logger logger = LoggerFactory.getLogger(D529351uImpl.class);
  
  
  @Value("${D529351U.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("db2Base")
  Db2Base db2Base;
  @Autowired 
  @Qualifier("d529351uRepository")
  D529351uRepository d529351uRepository;
  
  
  
  
  
  
      @Override
      public int setParameter(D529351uCtx programCtx, String dsmCallArea,String vyspi51uCallArea) throws Exception {
      		if(dsmCallArea != null)
      		    programCtx.getDsmCallArea().setString(com.cloudframe.app.data.Field.getParm(dsmCallArea),new String(CONSTANTS.EBCDIC_ENCODING));
      		if(vyspi51uCallArea != null)
      		    programCtx.getVyspi51uCallArea().setString(com.cloudframe.app.data.Field.getParm(vyspi51uCallArea),new String(CONSTANTS.EBCDIC_ENCODING));
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
      public int process(D529351uCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("D529351U" ,dbQualifier, true/*use Dynamic SQL*/);
//Added variable to get the output context in place.
ProcessInCtx methodIn = programCtx.getProcessInCtx();
//  cobolCode::PERFORM 0000-MAIN-LINE
          mainLine(programCtx);/*0000-MAIN-LINE SECTION*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
          exit(programCtx);/*0000-EXIT*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
		handleDbAtEnd(db2Base); 
      

      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainLine 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-LINE SECTION COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainLine(D529351uCtx programCtx) throws Exception {
//  cobolCode::PERFORM 1000-INITIALIZE THRU 1000-EXIT
          initialize(programCtx.getInitializeInCtx());/*1000-INITIALIZE SECTION*/
//  cobolCode::PERFORM 2000-PROCESSING THRU 2000-EXIT
          processing(programCtx.getProcessingInCtx());/*2000-PROCESSING SECTION*/
      
      }
      /**
      * exit 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-EXIT COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void exit(D529351uCtx programCtx) throws Exception {
//  cobolCode::GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
      /**
      * initialize 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZE SECTION COBOL Cyclomatic complexity - 1
      * Input  :  

      * - dsmFuncCd01                    COBOL Name: DSM-FUNC-CD
      * - d51uKeyFeSpi                   COBOL Name: D51U-KEY-FE-SPI
      * - d51uKeyPolicy                  COBOL Name: D51U-KEY-POLICY
      * - d51uKeyPlan                    COBOL Name: D51U-KEY-PLAN
      * - d51uKeyStatus                  COBOL Name: D51U-KEY-STATUS
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - dclfeSpiPlnVar                 COBOL Name: DCLFE-SPI-PLN-VAR
      * - dclfeSpiRuleFrCondPos          COBOL Name: DCLFE-SPI-RULE-FR-COND-POS
      * - dclfeSpiRuleFrToSvc            COBOL Name: DCLFE-SPI-RULE-FR-TO-SVC
      * - dclfeSpiRuleProvTyp            COBOL Name: DCLFE-SPI-RULE-PROV-TYP
      * - dclfeSpiRuleIcd                COBOL Name: DCLFE-SPI-RULE-ICD
      * - dclfeSpiRuleCaus               COBOL Name: DCLFE-SPI-RULE-CAUS
      * - dclfeSpiRuleIpa                COBOL Name: DCLFE-SPI-RULE-IPA
      * - dclfeSpiRuleCpeFlg             COBOL Name: DCLFE-SPI-RULE-CPE-FLG
      * - d51uNbrOfEntries               COBOL Name: D51U-NBR-OF-ENTRIES
      * - lstIcdKey                      COBOL Name: WS-LST-ICD-KEY
      * - dsmFuncCd                      COBOL Name: WS-DSM-FUNC-CD
      * - dsmFuncCd01                    COBOL Name: DSM-FUNC-CD
      * - causSpiTblId                   COBOL Name: CAUS-SPI-TBL-ID
      * - fcndSpiTblId                   COBOL Name: FCND-SPI-TBL-ID
      * - frtoSpiTblId                   COBOL Name: FRTO-SPI-TBL-ID
      * - ptypSpiTblId                   COBOL Name: PTYP-SPI-TBL-ID
      * - ricdSpiTblId                   COBOL Name: RICD-SPI-TBL-ID
      * - ripaSpiTblId                   COBOL Name: RIPA-SPI-TBL-ID
      * - cpeflSpiTblId                  COBOL Name: CPEFL-SPI-TBL-ID
      * - d51uKeyFeSpi                   COBOL Name: D51U-KEY-FE-SPI
      * - plnvPolNbr                     COBOL Name: PLNV-POL-NBR
      * - d51uKeyPolicy                  COBOL Name: D51U-KEY-POLICY
      * - plnvPlnNbr                     COBOL Name: PLNV-PLN-NBR
      * - d51uKeyPlan                    COBOL Name: D51U-KEY-PLAN
      * - plnvStsCd                      COBOL Name: PLNV-STS-CD
      * - causStsCd                      COBOL Name: CAUS-STS-CD
      * - fcndStsCd                      COBOL Name: FCND-STS-CD
      * - frtoStsCd                      COBOL Name: FRTO-STS-CD
      * - ptypStsCd                      COBOL Name: PTYP-STS-CD
      * - ricdStsCd                      COBOL Name: RICD-STS-CD
      * - ripaStsCd                      COBOL Name: RIPA-STS-CD
      * - cpeflStsCd                     COBOL Name: CPEFL-STS-CD
      * - d51uKeyStatus                  COBOL Name: D51U-KEY-STATUS
      * - frtoSub                        COBOL Name: FRTO-SUB
      * - ptypSub                        COBOL Name: PTYP-SUB
      * - icdSub                         COBOL Name: ICD-SUB
      * - fcndSub                        COBOL Name: FCND-SUB
      * - causSub                        COBOL Name: CAUS-SUB
      * - ipaSub                         COBOL Name: IPA-SUB
      * - cflgSub                        COBOL Name: CFLG-SUB
      *
      * @throws CFException
      */
      @Override
      public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception {
      
// *82 1. Initialize all dclgen fields                              *
// *82 2. format spi fields for all tables key lookup               *
// *82***************************************************************
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
InitializeOutCtx methodOut = methodIn.getInitializeOutCtx();
//  cobolCode::MOVE ZEROES TO WS-SQLCODE
          methodOut.setSqlcode_Ws(0);
//  cobolCode::INITIALIZE DCLFE-SPI-PLN-VAR DCLFE-SPI-RULE-FR-COND-POS DCLFE-SPI-RULE-FR-TO-SVC DCLFE-SPI-RULE-PROV-TYP DCLFE-SPI-RULE-ICD DCLFE-SPI-RULE-CAUS DCLFE-SPI-RULE-IPA DCLFE-SPI-RULE-CPE-FLG
          methodOut.getDclfeSpiPlnVar().initialize();
          methodOut.getDclfeSpiRuleFrCondPos().initialize();
          methodOut.getDclfeSpiRuleFrToSvc().initialize();
          methodOut.getDclfeSpiRuleProvTyp().initialize();
          methodOut.getDclfeSpiRuleIcd().initialize();
          methodOut.getDclfeSpiRuleCaus().initialize();
          methodOut.getDclfeSpiRuleIpa().initialize();
          methodOut.getDclfeSpiRuleCpeFlg().initialize();

// *    Perform varying ws-sub from 1 by 1
// *45917c        until ws-sub > 99
// *         initialize   d51u-ret-rul-cause     (ws-sub)
// *                      d51u-ret-rule-ipa      (ws-sub)
// *    end-perform
// *
//  cobolCode::INITIALIZE D51U-NBR-OF-ENTRIES WS-LST-ICD-KEY
          methodOut.setD51uNbrOfEntries(0);
          methodOut.getLstIcdKey().initialize();

// *                 D51u-more-icd-records
// *    perform varying ws-sub from 1 by 1
// *45917c        until ws-sub > 99
// *         initialize   d51u-ret-rule-fr-cond-pos(ws-sub)
// *    end-perform
// *
// *    perform varying ws-sub from 1 by 1
// *              until ws-sub > 9999
// *         initialize   d51u-ret-rule-icd  (ws-sub)
// *    end-perform
//  cobolCode::MOVE DSM-FUNC-CD TO WS-DSM-FUNC-CD
          methodOut.setDsmFuncCd((short) methodOut.getDsmFuncCd01());
//  cobolCode::MOVE D51U-KEY-FE-SPI TO CAUS-SPI-TBL-ID FCND-SPI-TBL-ID FRTO-SPI-TBL-ID PTYP-SPI-TBL-ID RICD-SPI-TBL-ID RIPA-SPI-TBL-ID CPEFL-SPI-TBL-ID
          methodOut.setCausSpiTblId(methodOut.getD51uKeyFeSpi());
          methodOut.setFcndSpiTblId(methodOut.getD51uKeyFeSpi());
          methodOut.setFrtoSpiTblId(methodOut.getD51uKeyFeSpi());
          methodOut.setPtypSpiTblId(methodOut.getD51uKeyFeSpi());
          methodOut.setRicdSpiTblId(methodOut.getD51uKeyFeSpi());
          methodOut.setRipaSpiTblId(methodOut.getD51uKeyFeSpi());
          methodOut.setCpeflSpiTblId(methodOut.getD51uKeyFeSpi());
//  cobolCode::MOVE D51U-KEY-POLICY TO PLNV-POL-NBR
          methodOut.setPlnvPolNbr(methodOut.getD51uKeyPolicy());
//  cobolCode::MOVE D51U-KEY-PLAN TO PLNV-PLN-NBR
          methodOut.setPlnvPlnNbr(methodOut.getD51uKeyPlan());
//  cobolCode::MOVE D51U-KEY-STATUS TO PLNV-STS-CD CAUS-STS-CD FCND-STS-CD FRTO-STS-CD PTYP-STS-CD RICD-STS-CD RIPA-STS-CD CPEFL-STS-CD
          methodOut.setPlnvStsCd(methodOut.getD51uKeyStatus());
          methodOut.setCausStsCd(methodOut.getD51uKeyStatus());
          methodOut.setFcndStsCd(methodOut.getD51uKeyStatus());
          methodOut.setFrtoStsCd(methodOut.getD51uKeyStatus());
          methodOut.setPtypStsCd(methodOut.getD51uKeyStatus());
          methodOut.setRicdStsCd(methodOut.getD51uKeyStatus());
          methodOut.setRipaStsCd(methodOut.getD51uKeyStatus());
          methodOut.setCpeflStsCd(methodOut.getD51uKeyStatus());

// *
// **   Move d51u-lst-icd-key    to ws-lst-icd-key
// *
//  cobolCode::INITIALIZE FRTO-SUB PTYP-SUB ICD-SUB FCND-SUB CAUS-SUB IPA-SUB CFLG-SUB
          methodOut.setFrtoSub(0);
          methodOut.setPtypSub(0);
          methodOut.setIcdSub(0);
          methodOut.setFcndSub(0);
          methodOut.setCausSub(0);
          methodOut.setIpaSub(0);
          methodOut.setCflgSub(0);
      
      return methodOut;
      }
      /**
      * processing 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PROCESSING SECTION COBOL Cyclomatic complexity - 7
      * Input  :  

      * - dsmFuncCd                      COBOL Name: WS-DSM-FUNC-CD
      * - sub                            COBOL Name: WS-SUB
      * - dsmFuncCd01                    COBOL Name: DSM-FUNC-CD
      *
      * Output :  

      * - sub                            COBOL Name: WS-SUB
      * - d51uRetRuleKeys                COBOL Name: D51U-RET-RULE-KEYS
      * - d51uMoreIcdRecords             COBOL Name: D51U-MORE-ICD-RECORDS
      * - dsmEditErrorField              COBOL Name: DSM-EDIT-ERROR-FIELD
      * - dsmEditErrorValueInt           COBOL Name: DSM-EDIT-ERROR-VALUE-INT
      * - dsmFuncCd01                    COBOL Name: DSM-FUNC-CD
      * - dsmErrSectnName                COBOL Name: DSM-ERR-SECTN-NAME
      * - dsmErrPgmName                  COBOL Name: DSM-ERR-PGM-NAME
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      *
      * @throws CFException
      */
      @Override
      public ProcessingOutCtx processing(ProcessingInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81 2000-Processing                                              *
// *81                                                              *
// *81 business function:                                           *
// *81 process the function code                                    *
// *81***************************************************************
// *82***************************************************************
// *82 2000-processing                                              *
// *82                                                              *
// *82 1.evaluate the function code                                 *
// *82 2.func-cd 1 retrieves data from spi plan variation table     *
// *82 3.func-cd 2 retrieves data from spi plan rules tables        *
// *82                                                              *
// *82***************************************************************
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
ProcessingOutCtx methodOut = methodIn.getProcessingOutCtx();
//  cobolCode::EVALUATE TRUE
          if  ( methodIn.isFuncCd1()  ) { 
//  cobolCode::PERFORM 2100-PROCESS-FUNC-CD-1 THRU 2100-EXIT
              processFuncCd1(programCtx.getProcessFuncCd1InCtx());/*2100-PROCESS-FUNC-CD-1 SECTION*/
          }
          else if  ( methodIn.isFuncCd2()  ) { 
//  cobolCode::PERFORM VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > 99
              for (methodOut.setSub(1); (	( methodOut.getSub() <= 99 )) ; methodOut.setSub(methodOut.getSub() + 1) ) {
//  cobolCode::INITIALIZE D51U-RET-RULE-KEYS ( WS-SUB )
                  methodOut.getD51uRetRuleKeys(methodOut.getSub() - 1).initialize();
              }
//  cobolCode::SET NO-MORE-ICD-RECORDS TO TRUE
              methodOut.setNoMoreIcdRecordsTrue(); 
              
//  cobolCode::PERFORM 2200-PROCESS-FUNC-CD-2 THRU 2200-EXIT
              processFuncCd2(programCtx);/*2200-PROCESS-FUNC-CD-2 SECTION*/
          }
          else if  ( methodIn.isFuncCd3()  ) { 
//  cobolCode::PERFORM 3100-PROCESS-FUNC-CD-3 THRU 3100-EXIT
              processFuncCd3(programCtx.getProcessFuncCd3InCtx());/*3100-PROCESS-FUNC-CD-3 SECTION*/
          }
          else   { 
//  cobolCode::MOVE 'DSM-FUNC-CD' TO DSM-EDIT-ERROR-FIELD
              methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_DSM_MN2_FUNCCD_B19_);
//  cobolCode::MOVE DSM-FUNC-CD TO DSM-EDIT-ERROR-VALUE-INT
//  FORMAT_467480023 = "-999999999999999999"
              methodOut.setDsmEditErrorValueInt(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_467480023,String.valueOf(methodOut.getDsmFuncCd01()).toCharArray()));
//  cobolCode::MOVE '2000-PROCESSI' TO DSM-ERR-SECTN-NAME
              methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1773875177);
//  cobolCode::MOVE 'D529351U' TO DSM-ERR-PGM-NAME
//  LITERAL_D529351U = 'D529351U'
              methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D529351U);
//  cobolCode::SET D51U-INV-FUNC-CD TO TRUE
              methodOut.setD51uInvFuncCdTrue(); 
              
          }
      
      return methodOut;
      }
      /**
      * processFuncCd1 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-PROCESS-FUNC-CD-1 SECTION COBOL Cyclomatic complexity - 3
      * Input  :  

      * - d51uReqDosDate                 COBOL Name: D51U-REQ-DOS-DATE
      *
      * Output :  

      * - fetchEnd                       COBOL Name: WS-FETCH-END
      * - planFoundSw                    COBOL Name: PLAN-FOUND-SW
      * - csSub                          COBOL Name: CS-SUB
      * - planMatch                      COBOL Name: WS-PLAN-MATCH
      * - planEffDate                    COBOL Name: WS-PLAN-EFF-DATE
      * - planCanDate                    COBOL Name: WS-PLAN-CAN-DATE
      * - db2DosYyyy                     COBOL Name: WS-DB2-DOS-YYYY
      * - d51uReqDosDate                 COBOL Name: D51U-REQ-DOS-DATE
      * - db2DosMm                       COBOL Name: WS-DB2-DOS-MM
      * - db2DosDd                       COBOL Name: WS-DB2-DOS-DD
      * - db2Dash1                       COBOL Name: WS-DB2-DASH1
      * - db2Dash2                       COBOL Name: WS-DB2-DASH2
      *
      * @throws CFException
      */
      @Override
      public ProcessFuncCd1OutCtx processFuncCd1(ProcessFuncCd1InCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81 2100-Process-func-cd-1                                       *
// *81                                                              *
// *81 business function:                                           *
// *81 retrieves data from spi plan variation table                 *
// *81***************************************************************
// *82***************************************************************
// *82 2100-process-func-cd-1                                       *
// *82 retrieves data from spi plan variation table                 *
// *82                                                              *
// *82 called by : 1.2000-processing section                        *
// *82 call      : 1.2150-open-csplnv-cursor                        *
// *82***************************************************************
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
ProcessFuncCd1OutCtx methodOut = methodIn.getProcessFuncCd1OutCtx();
//  cobolCode::SET NOT-END-OF-FETCH TO TRUE
          methodOut.setNotEndOfFetchTrue(); 
          
//  cobolCode::SET PLAN-NOT-FOUND TO TRUE
          methodOut.setPlanNotFoundTrue(); 
          
//  cobolCode::INITIALIZE CS-SUB WS-PLAN-MATCH WS-PLAN-EFF-DATE WS-PLAN-CAN-DATE
          methodOut.setCsSub(0);
          methodOut.setPlanMatch(0);
          methodOut.setPlanEffDate(0);
          methodOut.setPlanCanDate(0);
//  cobolCode::MOVE D51U-REQ-DOS-DATE (1 : 4) TO WS-DB2-DOS-YYYY
          methodIn.getWorkArea().replace(methodIn.getVyspi51uCallArea()/*parent*/,54/*fromOffset - (db2DosYyyy) */,4/*fromLen*/,17/*toOffset - (d51uReqDosDate) */,4/*toLen*/);
//  cobolCode::MOVE D51U-REQ-DOS-DATE (5 : 2) TO WS-DB2-DOS-MM
          methodIn.getWorkArea().replace(methodIn.getVyspi51uCallArea()/*parent*/,54+5 - 1/*fromOffset - (db2DosMm) */,2/*fromLen*/,22/*toOffset - (d51uReqDosDate) */,2/*toLen*/);
//  cobolCode::MOVE D51U-REQ-DOS-DATE (7 : 2) TO WS-DB2-DOS-DD
          methodIn.getWorkArea().replace(methodIn.getVyspi51uCallArea()/*parent*/,54+7 - 1/*fromOffset - (db2DosDd) */,2/*fromLen*/,25/*toOffset - (d51uReqDosDate) */,2/*toLen*/);
//  cobolCode::IF WS-DB2-DOS-MM = '99' OR '00' THEN
//  LITERAL_00 = '00'
          if (		compareChars(methodOut.getDb2DosMm(),CONSTANTS.LITERAL_99) == 0  || 		compareChars(methodOut.getDb2DosMm(),CONSTANTS.LITERAL_00) == 0 ) { 
              //  LITERAL_12 = '12'
              methodOut.setDb2DosMm(CONSTANTS.LITERAL_12);
              //  LITERAL_31 = '31'
              methodOut.setDb2DosDd(CONSTANTS.LITERAL_31);
          }
//  cobolCode::MOVE '-' TO WS-DB2-DASH1 , WS-DB2-DASH2
//  LITERAL_MN_ = '-'
          methodOut.setDb2Dash1(CONSTANTS.LITERAL_MN_);
          methodOut.setDb2Dash2(CONSTANTS.LITERAL_MN_);
//  cobolCode::PERFORM 2150-OPEN-CSPLNV-CURSOR THRU 2150-EXIT
          openCsplnvCursor(programCtx.getOpenCsplnvCursorInCtx());/*2150-OPEN-CSPLNV-CURSOR SECTION*/
      
      return methodOut;
      }
      /**
      * openCsplnvCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 2150-OPEN-CSPLNV-CURSOR SECTION COBOL Cyclomatic complexity - 6
      * Input  :  

      * - fetchEnd                       COBOL Name: WS-FETCH-END
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - csSub                          COBOL Name: CS-SUB
      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      @Override
      public OpenCsplnvCursorOutCtx openCsplnvCursor(OpenCsplnvCursorInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *82***************************************************************
// *82 2150-Open-csplnv-cursor                                      *
// *82                                                              *
// *82 1.validate spi nbr based on the key against                  *
// *82                - fe_spi_pln_var table                        *
// *82                                                              *
// *82 called by : 1.2000-processing section                        *
// *82 call      : 1.2180-fetch-csplnv                              *
// *82                                                              *
// *82***************************************************************
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
OpenCsplnvCursorOutCtx methodOut = methodIn.getOpenCsplnvCursorOutCtx();
//  cobolCode::SELECT A.SPI_TBL_ID , B.POS_TIER_TYP_CD , B.PRI_DIAG_IND , B.MJR_DIAG_ELIG_IND FROM FE_SPI_PLN_VAR A INNER JOIN FE_SPI_DESC_HDR B ON B.SPI_TBL_ID = A.SPI_TBL_ID AND B.SPI_STS_CD = 'A' AND B.STS_CD = 'A' WHERE A.POL_NBR = ? AND A.PLN_NBR = ? AND A.EFF_DT <= ? AND A.CANC_DT >= ? AND A.STS_CD = 'A' ORDER BY A.SPI_TBL_ID ASC , A.EFF_DT DESC FOR FETCH ONLY
          programCtx.setCsplnvResultSet(d529351uRepository.openCsplnvD529351u(methodIn.getWorkArea(),methodIn.getDclfeSpiPlnVar(),programCtx.getSqlca()));
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::MOVE 0 TO CS-SUB
              methodOut.setCsSub(0);
//  cobolCode::PERFORM 2180-FETCH-CSPLNV THRU 2180-EXIT UNTIL END-OF-FETCH OR CS-SUB > +9999
              while (!(methodIn.isEndOfFetch())  && 	( methodOut.getCsSub() <= 9999 )) {
                 fetchCsplnv(programCtx.getFetchCsplnvInCtx());/*2180-FETCH-CSPLNV SECTION*/
              }
          break;
          default :
//  cobolCode::SET DSM-DB2-ERROR TO TRUE
              methodOut.setDsmDb2ErrorTrue(); 
              
//  cobolCode::SET D51U-DB2-ERROR TO TRUE
              methodOut.setD51uDb2ErrorTrue(); 
              
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::SET D51U-DB2-OPEN-ERROR TO TRUE
              methodOut.setD51uDb2OpenErrorTrue(); 
              
//  cobolCode::MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              methodOut.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(methodOut.getSqlcode_Ws()).toCharArray()));
//  cobolCode::MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              methodOut.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE '2150-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2150_MN_ = '2150-'
              methodOut.setD51uParagraphNum(CONSTANTS.LITERAL_2150_MN_);
          }
      
      return methodOut;
      }
      /**
      * fetchCsplnv 
      *   This method is derived from 
  *   COBOL Paragraph - 2180-FETCH-CSPLNV SECTION COBOL Cyclomatic complexity - 11
      * Input  :  

      * - sqlerrd                        COBOL Name: SQLERRD
      * - csSub                          COBOL Name: CS-SUB
      * - planMatch                      COBOL Name: WS-PLAN-MATCH
      * - hv01SpiTblId                   COBOL Name: HV01-SPI-TBL-ID
      * - hv14PosTierTypCd               COBOL Name: HV14-POS-TIER-TYP-CD
      * - hv0aPriDiagInd                 COBOL Name: HV0A-PRI-DIAG-IND
      * - hv15MjrDiagEligInd             COBOL Name: HV15-MJR-DIAG-ELIG-IND
      * - plnvPolNbr                     COBOL Name: PLNV-POL-NBR
      * - plnvPlnNbr                     COBOL Name: PLNV-PLN-NBR
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsnnrows                       COBOL Name: DSNNROWS
      * - planFoundSw                    COBOL Name: PLAN-FOUND-SW
      * - hv01Index                      COBOL Name: HV01-INDEX
      * - hv14Index                      COBOL Name: HV14-INDEX
      * - hv0aIndex                      COBOL Name: HV0A-INDEX
      * - hv15Index                      COBOL Name: HV15-INDEX
      * - csSub                          COBOL Name: CS-SUB
      * - planMatch                      COBOL Name: WS-PLAN-MATCH
      * - d51uRetFeSpi                   COBOL Name: D51U-RET-FE-SPI
      * - hv01SpiTblId                   COBOL Name: HV01-SPI-TBL-ID
      * - d51uRetPosTierCd               COBOL Name: D51U-RET-POS-TIER-CD
      * - hv14PosTierTypCd               COBOL Name: HV14-POS-TIER-TYP-CD
      * - d51uRetPriDiagInd              COBOL Name: D51U-RET-PRI-DIAG-IND
      * - hv0aPriDiagInd                 COBOL Name: HV0A-PRI-DIAG-IND
      * - d51uRetDiagElgInd              COBOL Name: D51U-RET-DIAG-ELG-IND
      * - hv15MjrDiagEligInd             COBOL Name: HV15-MJR-DIAG-ELIG-IND
      * - d51uRetStatus                  COBOL Name: D51U-RET-STATUS
      * - d51uRetPolicy                  COBOL Name: D51U-RET-POLICY
      * - plnvPolNbr                     COBOL Name: PLNV-POL-NBR
      * - d51uRetPlan                    COBOL Name: D51U-RET-PLAN
      * - plnvPlnNbr                     COBOL Name: PLNV-PLN-NBR
      * - d51uNbrOfEntries               COBOL Name: D51U-NBR-OF-ENTRIES
      * - fetchEnd                       COBOL Name: WS-FETCH-END
      * - d51uPlnvCnt                    COBOL Name: D51U-PLNV-CNT
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsplnvOutCtx fetchCsplnv(FetchCsplnvInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
FetchCsplnvOutCtx methodOut = methodIn.getFetchCsplnvOutCtx();
// FETCH NEXT ROWSET FROM CSPLNV FOR 100 ROWS INTO  ?    ,   ?    ,   ?    ,   ? 
//  cobolCode::MOVE 100 TO DSNNROWS
          methodOut.setDsnnrows(100);
//  cobolCode::FETCH NEXT ROWSET FROM CSPLNV FOR 100 ROWS INTO ? , ? , ? , ?
          d529351uRepository.fetchCsplnvD529351u(programCtx.getCsplnvResultSet(),methodOut.getHvHostVariablesCsplnv(),programCtx.getSqlca());
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:

// *45917S    if (d51u-req-dos-date  not < ws-plan-eff-date) and
// *45917s       (d51u-req-dos-date  not > ws-plan-can-date)
// *             add +1 to cs-sub
// *             add +1 to ws-plan-match
// *             move plnv-spi-tbl-id to d51u-ret-fe-spi (cs-sub)
// *             move plnv-sts-cd     to d51u-ret-status (cs-sub)
// *             move plnv-pol-nbr    to d51u-ret-policy (cs-sub)
// *             move plnv-pln-nbr    to d51u-ret-plan   (cs-sub)
// *             set plan-found   to true
//  cobolCode::SET PLAN-FOUND TO TRUE
              methodOut.setPlanFoundTrue(); 
              
//  cobolCode::SET HV01-INDEX TO +1
              methodOut.setHv01Index(1); 
              
//  cobolCode::SET HV14-INDEX TO +1
              methodOut.setHv14Index(1); 
              
//  cobolCode::SET HV0A-INDEX TO +1
              methodOut.setHv0aIndex(1); 
              
//  cobolCode::SET HV15-INDEX TO +1
              methodOut.setHv15Index(1); 
              
//  cobolCode::PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < methodIn.getSqlerrd(2);index1++) {
//  cobolCode::ADD +1 TO CS-SUB
                  methodOut.setCsSub(methodOut.getCsSub()+1);
//  cobolCode::IF CS-SUB <= +9999
                  if (	( methodOut.getCsSub() <= 9999 )) { 
//  cobolCode::ADD +1 TO WS-PLAN-MATCH
                      methodOut.setPlanMatch(methodOut.getPlanMatch()+1);
//  cobolCode::MOVE HV01-SPI-TBL-ID ( HV01-INDEX ) TO D51U-RET-FE-SPI ( CS-SUB )
                      methodOut.setD51uRetFeSpi(methodOut.getCsSub() - 1,methodOut.getHv01SpiTblId(methodOut.getHv01Index() - 1));
//  cobolCode::MOVE HV14-POS-TIER-TYP-CD ( HV14-INDEX ) TO D51U-RET-POS-TIER-CD ( CS-SUB )
                      methodOut.setD51uRetPosTierCd(methodOut.getCsSub() - 1,methodOut.getHv14PosTierTypCd(methodOut.getHv14Index() - 1));
//  cobolCode::MOVE HV0A-PRI-DIAG-IND ( HV0A-INDEX ) TO D51U-RET-PRI-DIAG-IND ( CS-SUB )
                      methodOut.setD51uRetPriDiagInd(methodOut.getCsSub() - 1,methodOut.getHv0aPriDiagInd(methodOut.getHv0aIndex() - 1));
//  cobolCode::MOVE HV15-MJR-DIAG-ELIG-IND ( HV15-INDEX ) TO D51U-RET-DIAG-ELG-IND ( CS-SUB )
                      methodOut.setD51uRetDiagElgInd(methodOut.getCsSub() - 1,methodOut.getHv15MjrDiagEligInd(methodOut.getHv15Index() - 1));
//  cobolCode::MOVE 'A' TO D51U-RET-STATUS ( CS-SUB )
//  LITERAL_A = 'A'
                      methodOut.setD51uRetStatus(methodOut.getCsSub() - 1,CONSTANTS.LITERAL_A);
//  cobolCode::MOVE PLNV-POL-NBR TO D51U-RET-POLICY ( CS-SUB )
                      methodOut.setD51uRetPolicy(methodOut.getCsSub() - 1,methodOut.getPlnvPolNbr());
//  cobolCode::MOVE PLNV-PLN-NBR TO D51U-RET-PLAN ( CS-SUB )
                      methodOut.setD51uRetPlan(methodOut.getCsSub() - 1,padLeftZeros(4,methodOut.getPlnvPlnNbr(),false));
                  }
//  cobolCode::SET HV01-INDEX UP BY +1
                  methodOut.setHv01Index(methodOut.getHv01Index() + 1); 
                  
//  cobolCode::SET HV14-INDEX UP BY +1
                  methodOut.setHv14Index(methodOut.getHv14Index() + 1); 
                  
//  cobolCode::SET HV0A-INDEX UP BY +1
                  methodOut.setHv0aIndex(methodOut.getHv0aIndex() + 1); 
                  
//  cobolCode::SET HV15-INDEX UP BY +1
                  methodOut.setHv15Index(methodOut.getHv15Index() + 1); 
                  
              }
          break;
          	case 100:
//  cobolCode::IF SQLERRD (3) > ZERO
              if (	( methodIn.getSqlerrd(2) > 0 )) { 
//  cobolCode::SET PLAN-FOUND TO TRUE
                  methodOut.setPlanFoundTrue(); 
                  
//  cobolCode::SET HV01-INDEX TO +1
                  methodOut.setHv01Index(1); 
                  
//  cobolCode::SET HV14-INDEX TO +1
                  methodOut.setHv14Index(1); 
                  
//  cobolCode::SET HV0A-INDEX TO +1
                  methodOut.setHv0aIndex(1); 
                  
//  cobolCode::SET HV15-INDEX TO +1
                  methodOut.setHv15Index(1); 
                  
              }
//  cobolCode::PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < methodIn.getSqlerrd(2);index1++) {
//  cobolCode::ADD +1 TO CS-SUB
                  methodOut.setCsSub(methodOut.getCsSub()+1);
//  cobolCode::IF CS-SUB <= +9999
                  if (	( methodOut.getCsSub() <= 9999 )) { 
//  cobolCode::ADD +1 TO WS-PLAN-MATCH
                      methodOut.setPlanMatch(methodOut.getPlanMatch()+1);
//  cobolCode::MOVE HV01-SPI-TBL-ID ( HV01-INDEX ) TO D51U-RET-FE-SPI ( CS-SUB )
                      methodOut.setD51uRetFeSpi(methodOut.getCsSub() - 1,methodOut.getHv01SpiTblId(methodOut.getHv01Index() - 1));
//  cobolCode::MOVE HV0A-PRI-DIAG-IND ( HV0A-INDEX ) TO D51U-RET-PRI-DIAG-IND ( CS-SUB )
                      methodOut.setD51uRetPriDiagInd(methodOut.getCsSub() - 1,methodOut.getHv0aPriDiagInd(methodOut.getHv0aIndex() - 1));
//  cobolCode::MOVE 'A' TO D51U-RET-STATUS ( CS-SUB )
//  LITERAL_A = 'A'
                      methodOut.setD51uRetStatus(methodOut.getCsSub() - 1,CONSTANTS.LITERAL_A);
//  cobolCode::MOVE HV14-POS-TIER-TYP-CD ( HV14-INDEX ) TO D51U-RET-POS-TIER-CD ( CS-SUB )
                      methodOut.setD51uRetPosTierCd(methodOut.getCsSub() - 1,methodOut.getHv14PosTierTypCd(methodOut.getHv14Index() - 1));
//  cobolCode::MOVE HV15-MJR-DIAG-ELIG-IND ( HV15-INDEX ) TO D51U-RET-DIAG-ELG-IND ( CS-SUB )
                      methodOut.setD51uRetDiagElgInd(methodOut.getCsSub() - 1,methodOut.getHv15MjrDiagEligInd(methodOut.getHv15Index() - 1));
//  cobolCode::MOVE PLNV-POL-NBR TO D51U-RET-POLICY ( CS-SUB )
                      methodOut.setD51uRetPolicy(methodOut.getCsSub() - 1,methodOut.getPlnvPolNbr());
//  cobolCode::MOVE PLNV-PLN-NBR TO D51U-RET-PLAN ( CS-SUB )
                      methodOut.setD51uRetPlan(methodOut.getCsSub() - 1,padLeftZeros(4,methodOut.getPlnvPlnNbr(),false));
                  }
//  cobolCode::SET HV01-INDEX UP BY +1
                  methodOut.setHv01Index(methodOut.getHv01Index() + 1); 
                  
//  cobolCode::SET HV14-INDEX UP BY +1
                  methodOut.setHv14Index(methodOut.getHv14Index() + 1); 
                  
//  cobolCode::SET HV0A-INDEX UP BY +1
                  methodOut.setHv0aIndex(methodOut.getHv0aIndex() + 1); 
                  
//  cobolCode::SET HV15-INDEX UP BY +1
                  methodOut.setHv15Index(methodOut.getHv15Index() + 1); 
                  
              }
//  cobolCode::IF CS-SUB = 0
              if (	( methodOut.getCsSub() == 0 )) { 
//  cobolCode::SET PLAN-NOT-FOUND TO TRUE
                  methodOut.setPlanNotFoundTrue(); 
                  
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::SET PLAN-FOUND TO TRUE
                  methodOut.setPlanFoundTrue(); 
                  
                  methodOut.setD51uNbrOfEntries(methodOut.getPlanMatch());
              }
//  cobolCode::SET END-OF-FETCH TO TRUE
              methodOut.setEndOfFetchTrue(); 
              
//  cobolCode::MOVE CS-SUB TO D51U-PLNV-CNT
              methodOut.setD51uPlnvCnt(methodOut.getCsSub());
//  cobolCode::PERFORM 2185-CLOSE-CSR THRU 2185-EXIT
              closeCsr(programCtx.getCloseCsrInCtx());/*2185-CLOSE-CSR SECTION*/
          break;
          default :
//  cobolCode::SET PLAN-NOT-FOUND TO TRUE
              methodOut.setPlanNotFoundTrue(); 
              
//  cobolCode::SET END-OF-FETCH TO TRUE
              methodOut.setEndOfFetchTrue(); 
              
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::PERFORM 2185-CLOSE-CSR THRU 2185-EXIT
              closeCsr(programCtx.getCloseCsrInCtx());/*2185-CLOSE-CSR SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsr 
      *   This method is derived from 
  *   COBOL Paragraph - 2185-CLOSE-CSR SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      @Override
      public CloseCsrOutCtx closeCsr(CloseCsrInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
CloseCsrOutCtx methodOut = methodIn.getCloseCsrOutCtx();
//  cobolCode::CLOSE CSPLNV
          d529351uRepository.closeCsplnvD529351u(programCtx.getCsplnvResultSet(),programCtx.getSqlca());
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::SET CLOSE-CSR-OK TO TRUE
              methodOut.setCloseCsrOkTrue(); 
              
          break;
          default :
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::SET CLOSE-CSR-NG TO TRUE
              methodOut.setCloseCsrNgTrue(); 
              
//  cobolCode::SET D51U-DB2-ERROR TO TRUE
              methodOut.setD51uDb2ErrorTrue(); 
              
//  cobolCode::SET D51U-DB2-CLOSE-ERROR TO TRUE
              methodOut.setD51uDb2CloseErrorTrue(); 
              
//  cobolCode::MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              methodOut.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(methodOut.getSqlcode_Ws()).toCharArray()));
//  cobolCode::MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              methodOut.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE '2185-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2185_MN_ = '2185-'
              methodOut.setD51uParagraphNum(CONSTANTS.LITERAL_2185_MN_);
          }
      
      return methodOut;
      }
      /**
      * processFuncCd2 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-PROCESS-FUNC-CD-2 SECTION COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void processFuncCd2(D529351uCtx programCtx) throws Exception {
      
// *81***************************************************************
// *81 2200-Process-func-cd-2                                       *
// *81                                                              *
// *81 business function:                                           *
// *81 select / validate columns the fe spi tables                  *
// *81***************************************************************
// *82***************************************************************
// *82 2200-process-func-cd-2                                       *
// *82                                                              *
// *82 1.                                                           *
// *82                                                              *
// *82 called by : 1.2000-processing section                        *
// *82 call      :                                                  *
// *82***************************************************************
//  cobolCode::PERFORM 2200-PROCESS-FUNC-CD-2-SPLIT0
          processFuncCd2Split0(programCtx.getProcessFuncCd2Split0InCtx());/*2200-PROCESS-FUNC-CD-2-SPLIT0*/
//  cobolCode::PERFORM 2200-PROCESS-FUNC-CD-2-SPLIT1
          processFuncCd2Split1(programCtx.getProcessFuncCd2Split1InCtx());/*2200-PROCESS-FUNC-CD-2-SPLIT1*/
      
      }
      /**
      * processFuncCd2Split0 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-PROCESS-FUNC-CD-2-SPLIT0 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - d51uTestCaus                   COBOL Name: D51U-TEST-CAUS
      * - d51uTestProvTyp                COBOL Name: D51U-TEST-PROV-TYP
      * - d51uTestPos                    COBOL Name: D51U-TEST-POS
      * - d51uTestSvcCd                  COBOL Name: D51U-TEST-SVC-CD
      * - d51uTestDiag01                 COBOL Name: D51U-TEST-DIAG-01
      * - d51uTestDiag02                 COBOL Name: D51U-TEST-DIAG-02
      * - d51uTestDiag03                 COBOL Name: D51U-TEST-DIAG-03
      * - d51uTestDiag04                 COBOL Name: D51U-TEST-DIAG-04
      * - d51uTestDiag05                 COBOL Name: D51U-TEST-DIAG-05
      * - d51uTestDiag06                 COBOL Name: D51U-TEST-DIAG-06
      * - d51uTestDiag07                 COBOL Name: D51U-TEST-DIAG-07
      * - d51uTestDiag08                 COBOL Name: D51U-TEST-DIAG-08
      * - d51uTestDiag09                 COBOL Name: D51U-TEST-DIAG-09
      * - d51uTestDiag10                 COBOL Name: D51U-TEST-DIAG-10
      * - d51uTestDiag11                 COBOL Name: D51U-TEST-DIAG-11
      * - d51uTestDiag12                 COBOL Name: D51U-TEST-DIAG-12
      * - d51uTestDiag13                 COBOL Name: D51U-TEST-DIAG-13
      * - d51uTestDiag14                 COBOL Name: D51U-TEST-DIAG-14
      * - d51uTestDiag15                 COBOL Name: D51U-TEST-DIAG-15
      * - d51uTestDiag16                 COBOL Name: D51U-TEST-DIAG-16
      * - d51uTestDiag17                 COBOL Name: D51U-TEST-DIAG-17
      * - d51uTestDiag18                 COBOL Name: D51U-TEST-DIAG-18
      * - d51uTestDiag19                 COBOL Name: D51U-TEST-DIAG-19
      * - d51uTestDiag20                 COBOL Name: D51U-TEST-DIAG-20
      * - d51uTestDiag21                 COBOL Name: D51U-TEST-DIAG-21
      * - d51uTestDiag22                 COBOL Name: D51U-TEST-DIAG-22
      * - d51uTestDiag23                 COBOL Name: D51U-TEST-DIAG-23
      * - d51uTestDiag24                 COBOL Name: D51U-TEST-DIAG-24
      * - d51uTestDiag25                 COBOL Name: D51U-TEST-DIAG-25
      * - d51uTestCpeDescCd              COBOL Name: D51U-TEST-CPE-DESC-CD
      *
      * Output :  

      * - fetchEndMain                   COBOL Name: WS-FETCH-END-MAIN
      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - testCaus                       COBOL Name: TEST-CAUS
      * - d51uTestCaus                   COBOL Name: D51U-TEST-CAUS
      * - testProvTyp                    COBOL Name: TEST-PROV-TYP
      * - d51uTestProvTyp                COBOL Name: D51U-TEST-PROV-TYP
      * - testPos                        COBOL Name: TEST-POS
      * - d51uTestPos                    COBOL Name: D51U-TEST-POS
      * - testSvcCd                      COBOL Name: TEST-SVC-CD
      * - d51uTestSvcCd                  COBOL Name: D51U-TEST-SVC-CD
      * - testDiag01                     COBOL Name: TEST-DIAG-01
      * - d51uTestDiag01                 COBOL Name: D51U-TEST-DIAG-01
      * - testDiag02                     COBOL Name: TEST-DIAG-02
      * - d51uTestDiag02                 COBOL Name: D51U-TEST-DIAG-02
      * - testDiag03                     COBOL Name: TEST-DIAG-03
      * - d51uTestDiag03                 COBOL Name: D51U-TEST-DIAG-03
      * - testDiag04                     COBOL Name: TEST-DIAG-04
      * - d51uTestDiag04                 COBOL Name: D51U-TEST-DIAG-04
      * - testDiag05                     COBOL Name: TEST-DIAG-05
      * - d51uTestDiag05                 COBOL Name: D51U-TEST-DIAG-05
      * - testDiag06                     COBOL Name: TEST-DIAG-06
      * - d51uTestDiag06                 COBOL Name: D51U-TEST-DIAG-06
      * - testDiag07                     COBOL Name: TEST-DIAG-07
      * - d51uTestDiag07                 COBOL Name: D51U-TEST-DIAG-07
      * - testDiag08                     COBOL Name: TEST-DIAG-08
      * - d51uTestDiag08                 COBOL Name: D51U-TEST-DIAG-08
      * - testDiag09                     COBOL Name: TEST-DIAG-09
      * - d51uTestDiag09                 COBOL Name: D51U-TEST-DIAG-09
      * - testDiag10                     COBOL Name: TEST-DIAG-10
      * - d51uTestDiag10                 COBOL Name: D51U-TEST-DIAG-10
      * - testDiag11                     COBOL Name: TEST-DIAG-11
      * - d51uTestDiag11                 COBOL Name: D51U-TEST-DIAG-11
      * - testDiag12                     COBOL Name: TEST-DIAG-12
      * - d51uTestDiag12                 COBOL Name: D51U-TEST-DIAG-12
      * - testDiag13                     COBOL Name: TEST-DIAG-13
      * - d51uTestDiag13                 COBOL Name: D51U-TEST-DIAG-13
      * - testDiag14                     COBOL Name: TEST-DIAG-14
      * - d51uTestDiag14                 COBOL Name: D51U-TEST-DIAG-14
      * - testDiag15                     COBOL Name: TEST-DIAG-15
      * - d51uTestDiag15                 COBOL Name: D51U-TEST-DIAG-15
      * - testDiag16                     COBOL Name: TEST-DIAG-16
      * - d51uTestDiag16                 COBOL Name: D51U-TEST-DIAG-16
      * - testDiag17                     COBOL Name: TEST-DIAG-17
      * - d51uTestDiag17                 COBOL Name: D51U-TEST-DIAG-17
      * - testDiag18                     COBOL Name: TEST-DIAG-18
      * - d51uTestDiag18                 COBOL Name: D51U-TEST-DIAG-18
      * - testDiag19                     COBOL Name: TEST-DIAG-19
      * - d51uTestDiag19                 COBOL Name: D51U-TEST-DIAG-19
      * - testDiag20                     COBOL Name: TEST-DIAG-20
      * - d51uTestDiag20                 COBOL Name: D51U-TEST-DIAG-20
      * - testDiag21                     COBOL Name: TEST-DIAG-21
      * - d51uTestDiag21                 COBOL Name: D51U-TEST-DIAG-21
      * - testDiag22                     COBOL Name: TEST-DIAG-22
      * - d51uTestDiag22                 COBOL Name: D51U-TEST-DIAG-22
      * - testDiag23                     COBOL Name: TEST-DIAG-23
      * - d51uTestDiag23                 COBOL Name: D51U-TEST-DIAG-23
      * - testDiag24                     COBOL Name: TEST-DIAG-24
      * - d51uTestDiag24                 COBOL Name: D51U-TEST-DIAG-24
      * - testDiag25                     COBOL Name: TEST-DIAG-25
      * - d51uTestDiag25                 COBOL Name: D51U-TEST-DIAG-25
      * - testCpeDescCd                  COBOL Name: TEST-CPE-DESC-CD
      * - d51uTestCpeDescCd              COBOL Name: D51U-TEST-CPE-DESC-CD
      * - causSub                        COBOL Name: CAUS-SUB
      * - d51uCausCnt                    COBOL Name: D51U-CAUS-CNT
      * - causFoundSw                    COBOL Name: CAUS-FOUND-SW
      * - ipaSub                         COBOL Name: IPA-SUB
      * - d51uIpaCnt                     COBOL Name: D51U-IPA-CNT
      * - ipaFoundSw                     COBOL Name: IPA-FOUND-SW
      * - ptypSub                        COBOL Name: PTYP-SUB
      * - d51uPtypCnt                    COBOL Name: D51U-PTYP-CNT
      * - provFoundSw                    COBOL Name: PROV-FOUND-SW
      * - fcndSub                        COBOL Name: FCND-SUB
      * - d51uFcndCnt                    COBOL Name: D51U-FCND-CNT
      * - posFoundSw                     COBOL Name: POS-FOUND-SW
      * - cflgSub                        COBOL Name: CFLG-SUB
      * - d51uCflgCnt                    COBOL Name: D51U-CFLG-CNT
      * - cflgFoundSw                    COBOL Name: CFLG-FOUND-SW
      * - fetchEndComb                   COBOL Name: WS-FETCH-END-COMB
      *
      * @throws CFException
      */
      @Override
      public ProcessFuncCd2Split0OutCtx processFuncCd2Split0(ProcessFuncCd2Split0InCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
ProcessFuncCd2Split0OutCtx methodOut = methodIn.getProcessFuncCd2Split0OutCtx();
//  cobolCode::SET NOT-END-OF-FETCH-MAIN TO TRUE
          methodOut.setNotEndOfFetchMainTrue(); 
          
//  cobolCode::SET CLOSE-CSR-OK TO TRUE
          methodOut.setCloseCsrOkTrue(); 
          
//  cobolCode::MOVE D51U-TEST-CAUS TO TEST-CAUS
          methodOut.setTestCaus(methodOut.getD51uTestCaus());
//  cobolCode::MOVE D51U-TEST-PROV-TYP TO TEST-PROV-TYP
          methodOut.setTestProvTyp(methodOut.getD51uTestProvTyp());
//  cobolCode::MOVE D51U-TEST-POS TO TEST-POS
          methodOut.setTestPos(methodOut.getD51uTestPos());
//  cobolCode::MOVE D51U-TEST-SVC-CD TO TEST-SVC-CD
          methodOut.setTestSvcCd(methodOut.getD51uTestSvcCd());
//  cobolCode::MOVE D51U-TEST-DIAG-01 TO TEST-DIAG-01
          methodOut.setTestDiag01(methodOut.getD51uTestDiag01());
//  cobolCode::MOVE D51U-TEST-DIAG-02 TO TEST-DIAG-02
          methodOut.setTestDiag02(methodOut.getD51uTestDiag02());
//  cobolCode::MOVE D51U-TEST-DIAG-03 TO TEST-DIAG-03
          methodOut.setTestDiag03(methodOut.getD51uTestDiag03());
//  cobolCode::MOVE D51U-TEST-DIAG-04 TO TEST-DIAG-04
          methodOut.setTestDiag04(methodOut.getD51uTestDiag04());
//  cobolCode::MOVE D51U-TEST-DIAG-05 TO TEST-DIAG-05
          methodOut.setTestDiag05(methodOut.getD51uTestDiag05());
//  cobolCode::MOVE D51U-TEST-DIAG-06 TO TEST-DIAG-06
          methodOut.setTestDiag06(methodOut.getD51uTestDiag06());
//  cobolCode::MOVE D51U-TEST-DIAG-07 TO TEST-DIAG-07
          methodOut.setTestDiag07(methodOut.getD51uTestDiag07());
//  cobolCode::MOVE D51U-TEST-DIAG-08 TO TEST-DIAG-08
          methodOut.setTestDiag08(methodOut.getD51uTestDiag08());
//  cobolCode::MOVE D51U-TEST-DIAG-09 TO TEST-DIAG-09
          methodOut.setTestDiag09(methodOut.getD51uTestDiag09());
//  cobolCode::MOVE D51U-TEST-DIAG-10 TO TEST-DIAG-10
          methodOut.setTestDiag10(methodOut.getD51uTestDiag10());
//  cobolCode::MOVE D51U-TEST-DIAG-11 TO TEST-DIAG-11
          methodOut.setTestDiag11(methodOut.getD51uTestDiag11());
//  cobolCode::MOVE D51U-TEST-DIAG-12 TO TEST-DIAG-12
          methodOut.setTestDiag12(methodOut.getD51uTestDiag12());
//  cobolCode::MOVE D51U-TEST-DIAG-13 TO TEST-DIAG-13
          methodOut.setTestDiag13(methodOut.getD51uTestDiag13());
//  cobolCode::MOVE D51U-TEST-DIAG-14 TO TEST-DIAG-14
          methodOut.setTestDiag14(methodOut.getD51uTestDiag14());
//  cobolCode::MOVE D51U-TEST-DIAG-15 TO TEST-DIAG-15
          methodOut.setTestDiag15(methodOut.getD51uTestDiag15());
//  cobolCode::MOVE D51U-TEST-DIAG-16 TO TEST-DIAG-16
          methodOut.setTestDiag16(methodOut.getD51uTestDiag16());
//  cobolCode::MOVE D51U-TEST-DIAG-17 TO TEST-DIAG-17
          methodOut.setTestDiag17(methodOut.getD51uTestDiag17());
//  cobolCode::MOVE D51U-TEST-DIAG-18 TO TEST-DIAG-18
          methodOut.setTestDiag18(methodOut.getD51uTestDiag18());
//  cobolCode::MOVE D51U-TEST-DIAG-19 TO TEST-DIAG-19
          methodOut.setTestDiag19(methodOut.getD51uTestDiag19());
//  cobolCode::MOVE D51U-TEST-DIAG-20 TO TEST-DIAG-20
          methodOut.setTestDiag20(methodOut.getD51uTestDiag20());
//  cobolCode::MOVE D51U-TEST-DIAG-21 TO TEST-DIAG-21
          methodOut.setTestDiag21(methodOut.getD51uTestDiag21());
//  cobolCode::MOVE D51U-TEST-DIAG-22 TO TEST-DIAG-22
          methodOut.setTestDiag22(methodOut.getD51uTestDiag22());
//  cobolCode::MOVE D51U-TEST-DIAG-23 TO TEST-DIAG-23
          methodOut.setTestDiag23(methodOut.getD51uTestDiag23());
//  cobolCode::MOVE D51U-TEST-DIAG-24 TO TEST-DIAG-24
          methodOut.setTestDiag24(methodOut.getD51uTestDiag24());
//  cobolCode::MOVE D51U-TEST-DIAG-25 TO TEST-DIAG-25
          methodOut.setTestDiag25(methodOut.getD51uTestDiag25());
//  cobolCode::MOVE D51U-TEST-CPE-DESC-CD TO TEST-CPE-DESC-CD
          methodOut.setTestCpeDescCd(methodOut.getD51uTestCpeDescCd());
//  cobolCode::PERFORM 2218-OPEN-SVC-MAIN-CSR THRU 2218-EXIT
          openSvcMainCsr(programCtx.getOpenSvcMainCsrInCtx());/*2218-OPEN-SVC-MAIN-CSR SECTION*/

// *
// *
//  cobolCode::MOVE +0 TO CAUS-SUB
          methodOut.setCausSub(0);
//  cobolCode::MOVE CAUS-SUB TO D51U-CAUS-CNT
          methodOut.setD51uCausCnt(methodOut.getCausSub());
//  cobolCode::SET CAUSECD-NOT-FOUND TO TRUE
          methodOut.setCausecdNotFoundTrue(); 
          

// *
//  cobolCode::MOVE +0 TO IPA-SUB
          methodOut.setIpaSub(0);
//  cobolCode::MOVE IPA-SUB TO D51U-IPA-CNT
          methodOut.setD51uIpaCnt(methodOut.getIpaSub());
//  cobolCode::SET IPA-NOT-FOUND TO TRUE
          methodOut.setIpaNotFoundTrue(); 
          

// *
//  cobolCode::MOVE +0 TO PTYP-SUB
          methodOut.setPtypSub(0);
//  cobolCode::MOVE PTYP-SUB TO D51U-PTYP-CNT
          methodOut.setD51uPtypCnt(methodOut.getPtypSub());
//  cobolCode::SET PROVTYP-NOT-FOUND TO TRUE
          methodOut.setProvtypNotFoundTrue(); 
          

// *
//  cobolCode::MOVE +0 TO FCND-SUB
          methodOut.setFcndSub(0);
//  cobolCode::MOVE FCND-SUB TO D51U-FCND-CNT
          methodOut.setD51uFcndCnt(methodOut.getFcndSub());
//  cobolCode::SET POS-NOT-FOUND TO TRUE
          methodOut.setPosNotFoundTrue(); 
          

// *
//  cobolCode::MOVE +0 TO CFLG-SUB
          methodOut.setCflgSub(0);
//  cobolCode::MOVE CFLG-SUB TO D51U-CFLG-CNT
          methodOut.setD51uCflgCnt(methodOut.getCflgSub());
//  cobolCode::SET CFLG-NOT-FOUND TO TRUE
          methodOut.setCflgNotFoundTrue(); 
          

// *
//  cobolCode::SET CLOSE-CSR-OK TO TRUE
          methodOut.setCloseCsrOkTrue(); 
          
//  cobolCode::SET NOT-END-OF-FETCH-COMB TO TRUE
          methodOut.setNotEndOfFetchCombTrue(); 
          
//  cobolCode::PERFORM 2351-OPEN-COMB-CURSOR THRU 2351-EXIT
          openCombCursor(programCtx.getOpenCombCursorInCtx());/*2351-OPEN-COMB-CURSOR SECTION*/
      
      return methodOut;
      }
      /**
      * processFuncCd2Split1 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-PROCESS-FUNC-CD-2-SPLIT1 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - d51uLstClmIcdInd               COBOL Name: D51U-LST-CLM-ICD-IND
      *
      * Output :  

      * - frtoSub                        COBOL Name: FRTO-SUB
      * - d51uFrtoCnt                    COBOL Name: D51U-FRTO-CNT
      * - svcFoundSw                     COBOL Name: SVC-FOUND-SW
      * - fetchEndFrto                   COBOL Name: WS-FETCH-END-FRTO
      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - icdSub                         COBOL Name: ICD-SUB
      * - d51uIcdCnt                     COBOL Name: D51U-ICD-CNT
      * - icdFoundSw                     COBOL Name: ICD-FOUND-SW
      * - lstClmIcdInd                   COBOL Name: WS-LST-CLM-ICD-IND
      * - d51uLstClmIcdInd               COBOL Name: D51U-LST-CLM-ICD-IND
      * - fetchEndIcd                    COBOL Name: WS-FETCH-END-ICD
      *
      * @throws CFException
      */
      @Override
      public ProcessFuncCd2Split1OutCtx processFuncCd2Split1(ProcessFuncCd2Split1InCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
ProcessFuncCd2Split1OutCtx methodOut = methodIn.getProcessFuncCd2Split1OutCtx();

// *
//  cobolCode::MOVE +0 TO FRTO-SUB
          methodOut.setFrtoSub(0);
//  cobolCode::MOVE FRTO-SUB TO D51U-FRTO-CNT
          methodOut.setD51uFrtoCnt(methodOut.getFrtoSub());
//  cobolCode::SET SVCD-NOT-FOUND TO TRUE
          methodOut.setSvcdNotFoundTrue(); 
          

// *
//  cobolCode::SET NOT-END-OF-FETCH-FRTO TO TRUE
          methodOut.setNotEndOfFetchFrtoTrue(); 
          
//  cobolCode::SET CLOSE-CSR-OK TO TRUE
          methodOut.setCloseCsrOkTrue(); 
          
//  cobolCode::PERFORM 2250-OPEN-CSFRTO-CURSOR THRU 2250-EXIT
          openCsfrtoCursor(programCtx.getOpenCsfrtoCursorInCtx());/*2250-OPEN-CSFRTO-CURSOR SECTION*/

// *
//  cobolCode::MOVE +0 TO ICD-SUB
          methodOut.setIcdSub(0);
//  cobolCode::MOVE ICD-SUB TO D51U-ICD-CNT
          methodOut.setD51uIcdCnt(methodOut.getIcdSub());
//  cobolCode::SET ICD-NOT-FOUND TO TRUE
          methodOut.setIcdNotFoundTrue(); 
          
//  cobolCode::MOVE D51U-LST-CLM-ICD-IND TO WS-LST-CLM-ICD-IND
          methodOut.setLstClmIcdInd(methodOut.getD51uLstClmIcdInd());

// *
//  cobolCode::SET NOT-END-OF-FETCH-ICD TO TRUE
          methodOut.setNotEndOfFetchIcdTrue(); 
          
//  cobolCode::SET CLOSE-CSR-OK TO TRUE
          methodOut.setCloseCsrOkTrue(); 
          
//  cobolCode::PERFORM 3200-OPEN-CSICD-CURSOR THRU 3200-EXIT
          openCsicdCursor3200(programCtx.getOpenCsicdCursor3200InCtx());/*3200-OPEN-CSICD-CURSOR SECTION*/
      
      return methodOut;
      }
      /**
      * openCsfrtoCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 2250-OPEN-CSFRTO-CURSOR SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - fetchEndFrto                   COBOL Name: WS-FETCH-END-FRTO
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      @Override
      public OpenCsfrtoCursorOutCtx openCsfrtoCursor(OpenCsfrtoCursorInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
OpenCsfrtoCursorOutCtx methodOut = methodIn.getOpenCsfrtoCursorOutCtx();
//  cobolCode::SELECT DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , CLM_FRM_SVC_CD , CLM_TO_SVC_CD , SVC_TYP_CD FROM FE_SPI_RULE_FR_TO_SVC WHERE SPI_TBL_ID = ? AND STS_CD = 'A' FOR FETCH ONLY
          programCtx.setCsfrtoResultSet(d529351uRepository.openCsfrtoD529351u(methodIn.getDclfeSpiRuleFrToSvc(),programCtx.getSqlca()));
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::PERFORM 2280-FETCH-CSFRTO THRU 2280-EXIT UNTIL END-OF-FETCH-FRTO
              while (!(methodIn.isEndOfFetchFrto()) ) {
                 fetchCsfrto(programCtx.getFetchCsfrtoInCtx());/*2280-FETCH-CSFRTO SECTION*/
              }
          break;
          default :
//  cobolCode::SET DSM-DB2-ERROR TO TRUE
              methodOut.setDsmDb2ErrorTrue(); 
              
//  cobolCode::SET D51U-DB2-ERROR TO TRUE
              methodOut.setD51uDb2ErrorTrue(); 
              
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::SET D51U-DB2-OPEN-ERROR TO TRUE
              methodOut.setD51uDb2OpenErrorTrue(); 
              
//  cobolCode::MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              methodOut.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(methodOut.getSqlcode_Ws()).toCharArray()));
//  cobolCode::MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              methodOut.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE '2250-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2250_MN_ = '2250-'
              methodOut.setD51uParagraphNum(CONSTANTS.LITERAL_2250_MN_);
          }
      
      return methodOut;
      }
      /**
      * fetchCsfrto 
      *   This method is derived from 
  *   COBOL Paragraph - 2280-FETCH-CSFRTO SECTION COBOL Cyclomatic complexity - 11
      * Input  :  

      * - sqlerrd                        COBOL Name: SQLERRD
      * - frtoSub                        COBOL Name: FRTO-SUB
      * - hv08SvcDrvPos                  COBOL Name: HV08-SVC-DRV-POS
      * - hv09SvcDrvSvc                  COBOL Name: HV09-SVC-DRV-SVC
      * - hv10SvcDrvCau                  COBOL Name: HV10-SVC-DRV-CAU
      * - hv11ClmFrmSvcCd                COBOL Name: HV11-CLM-FRM-SVC-CD
      * - hv12ClmToSvcCd                 COBOL Name: HV12-CLM-TO-SVC-CD
      * - hv13SvcTypCd                   COBOL Name: HV13-SVC-TYP-CD
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsnnrows                       COBOL Name: DSNNROWS
      * - hv08Index                      COBOL Name: HV08-INDEX
      * - hv09Index                      COBOL Name: HV09-INDEX
      * - hv10Index                      COBOL Name: HV10-INDEX
      * - hv11Index                      COBOL Name: HV11-INDEX
      * - hv12Index                      COBOL Name: HV12-INDEX
      * - hv13Index                      COBOL Name: HV13-INDEX
      * - frtoSub                        COBOL Name: FRTO-SUB
      * - d51uFrtoDrvPos                 COBOL Name: D51U-FRTO-DRV-POS
      * - hv08SvcDrvPos                  COBOL Name: HV08-SVC-DRV-POS
      * - d51uFrtoDrvSvc                 COBOL Name: D51U-FRTO-DRV-SVC
      * - hv09SvcDrvSvc                  COBOL Name: HV09-SVC-DRV-SVC
      * - d51uFrtoDrvCau                 COBOL Name: D51U-FRTO-DRV-CAU
      * - hv10SvcDrvCau                  COBOL Name: HV10-SVC-DRV-CAU
      * - d51uFrtoClmFrmSvcCd            COBOL Name: D51U-FRTO-CLM-FRM-SVC-CD
      * - hv11ClmFrmSvcCd                COBOL Name: HV11-CLM-FRM-SVC-CD
      * - d51uFrtoClmToSvcCd             COBOL Name: D51U-FRTO-CLM-TO-SVC-CD
      * - hv12ClmToSvcCd                 COBOL Name: HV12-CLM-TO-SVC-CD
      * - d51uFrtoSvcTypCd               COBOL Name: D51U-FRTO-SVC-TYP-CD
      * - hv13SvcTypCd                   COBOL Name: HV13-SVC-TYP-CD
      * - svcFoundSw                     COBOL Name: SVC-FOUND-SW
      * - fetchEndFrto                   COBOL Name: WS-FETCH-END-FRTO
      * - d51uFrtoCnt                    COBOL Name: D51U-FRTO-CNT
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsfrtoOutCtx fetchCsfrto(FetchCsfrtoInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
FetchCsfrtoOutCtx methodOut = methodIn.getFetchCsfrtoOutCtx();
// FETCH NEXT ROWSET FROM CSFRTO FOR 100 ROWS INTO  ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ? 
//  cobolCode::MOVE 100 TO DSNNROWS
          methodOut.setDsnnrows(100);
//  cobolCode::FETCH NEXT ROWSET FROM CSFRTO FOR 100 ROWS INTO ? , ? , ? , ? , ? , ?
          d529351uRepository.fetchCsfrtoD529351u(programCtx.getCsfrtoResultSet(),methodOut.getHvHostVariablesCsfrto(),programCtx.getSqlca());
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:

// *45917C           add +1 to frto-sub
// *45917c           move frto-deriv-pl-of-svc-cd to
// *45917c                            d51u-frto-drv-pos  (frto-sub)
// *45917c           move frto-deriv-svc-cd       to
// *45917c                            d51u-frto-drv-svc  (frto-sub)
// *45917c           move frto-deriv-caus-cd  to
// *45917c                            d51u-frto-drv-cau  (frto-sub)
// *45917c           move frto-clm-frm-svc-cd to
// *45917c                       d51u-frto-clm-frm-svc-cd  (frto-sub)
// *45917c           move frto-clm-to-svc-cd  to
// *45917c                       d51u-frto-clm-to-svc-cd   (frto-sub)
// *45917c           move frto-svc-typ-cd     to
// *45917c                       d51u-frto-svc-typ-cd      (frto-sub)
// *45917c           set svcd-found  to true
//  cobolCode::SET HV08-INDEX TO +1
              methodOut.setHv08Index(1); 
              
//  cobolCode::SET HV09-INDEX TO +1
              methodOut.setHv09Index(1); 
              
//  cobolCode::SET HV10-INDEX TO +1
              methodOut.setHv10Index(1); 
              
//  cobolCode::SET HV11-INDEX TO +1
              methodOut.setHv11Index(1); 
              
//  cobolCode::SET HV12-INDEX TO +1
              methodOut.setHv12Index(1); 
              
//  cobolCode::SET HV13-INDEX TO +1
              methodOut.setHv13Index(1); 
              
//  cobolCode::PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < methodIn.getSqlerrd(2);index1++) {

// ***            Add +1            to frto-sub
// ***          if frto-sub <= +9999
//  cobolCode::IF FRTO-SUB < +9999
                  if (	( methodOut.getFrtoSub() < 9999 )) { 
//  cobolCode::ADD +1 TO FRTO-SUB
                      methodOut.setFrtoSub(methodOut.getFrtoSub()+1);

// *              Move frto-deriv-pl-of-svc-cd
//  cobolCode::MOVE HV08-SVC-DRV-POS ( HV08-INDEX ) TO D51U-FRTO-DRV-POS ( FRTO-SUB )
                      methodOut.setD51uFrtoDrvPos(methodOut.getFrtoSub() - 1,methodOut.getHv08SvcDrvPos(methodOut.getHv08Index() - 1));

// *              Move frto-deriv-svc-cd
//  cobolCode::MOVE HV09-SVC-DRV-SVC ( HV09-INDEX ) TO D51U-FRTO-DRV-SVC ( FRTO-SUB )
                      methodOut.setD51uFrtoDrvSvc(methodOut.getFrtoSub() - 1,methodOut.getHv09SvcDrvSvc(methodOut.getHv09Index() - 1));

// *              Move frto-deriv-caus-cd
//  cobolCode::MOVE HV10-SVC-DRV-CAU ( HV10-INDEX ) TO D51U-FRTO-DRV-CAU ( FRTO-SUB )
                      methodOut.setD51uFrtoDrvCau(methodOut.getFrtoSub() - 1,methodOut.getHv10SvcDrvCau(methodOut.getHv10Index() - 1));
//  cobolCode::MOVE HV11-CLM-FRM-SVC-CD ( HV11-INDEX ) TO D51U-FRTO-CLM-FRM-SVC-CD ( FRTO-SUB )
                      methodOut.setD51uFrtoClmFrmSvcCd(methodOut.getFrtoSub() - 1,methodOut.getHv11ClmFrmSvcCd(methodOut.getHv11Index() - 1));
//  cobolCode::MOVE HV12-CLM-TO-SVC-CD ( HV12-INDEX ) TO D51U-FRTO-CLM-TO-SVC-CD ( FRTO-SUB )
                      methodOut.setD51uFrtoClmToSvcCd(methodOut.getFrtoSub() - 1,methodOut.getHv12ClmToSvcCd(methodOut.getHv12Index() - 1));
//  cobolCode::MOVE HV13-SVC-TYP-CD ( HV13-INDEX ) TO D51U-FRTO-SVC-TYP-CD ( FRTO-SUB )
                      methodOut.setD51uFrtoSvcTypCd(methodOut.getFrtoSub() - 1,methodOut.getHv13SvcTypCd(methodOut.getHv13Index() - 1));
                  }
//  cobolCode::SET HV08-INDEX UP BY +1
                  methodOut.setHv08Index(methodOut.getHv08Index() + 1); 
                  
//  cobolCode::SET HV09-INDEX UP BY +1
                  methodOut.setHv09Index(methodOut.getHv09Index() + 1); 
                  
//  cobolCode::SET HV10-INDEX UP BY +1
                  methodOut.setHv10Index(methodOut.getHv10Index() + 1); 
                  
//  cobolCode::SET HV11-INDEX UP BY +1
                  methodOut.setHv11Index(methodOut.getHv11Index() + 1); 
                  
//  cobolCode::SET HV12-INDEX UP BY +1
                  methodOut.setHv12Index(methodOut.getHv12Index() + 1); 
                  
//  cobolCode::SET HV13-INDEX UP BY +1
                  methodOut.setHv13Index(methodOut.getHv13Index() + 1); 
                  
              }
//  cobolCode::IF FRTO-SUB = +9999
              if (	( methodOut.getFrtoSub() == 9999 )) { 
//  cobolCode::SET SVCD-FOUND TO TRUE
                  methodOut.setSvcdFoundTrue(); 
                  
//  cobolCode::SET END-OF-FETCH-FRTO TO TRUE
                  methodOut.setEndOfFetchFrtoTrue(); 
                  
//  cobolCode::MOVE FRTO-SUB TO D51U-FRTO-CNT
                  methodOut.setD51uFrtoCnt(methodOut.getFrtoSub());
//  cobolCode::PERFORM 2285-CLOSE-CSR THRU 2285-EXIT
                  closeCsr2285(programCtx.getCloseCsr2285InCtx());/*2285-CLOSE-CSR SECTION*/
              }
          break;
          	case 100:
//  cobolCode::SET HV08-INDEX TO +1
              methodOut.setHv08Index(1); 
              
//  cobolCode::SET HV09-INDEX TO +1
              methodOut.setHv09Index(1); 
              
//  cobolCode::SET HV10-INDEX TO +1
              methodOut.setHv10Index(1); 
              
//  cobolCode::SET HV11-INDEX TO +1
              methodOut.setHv11Index(1); 
              
//  cobolCode::SET HV12-INDEX TO +1
              methodOut.setHv12Index(1); 
              
//  cobolCode::SET HV13-INDEX TO +1
              methodOut.setHv13Index(1); 
              
//  cobolCode::PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < methodIn.getSqlerrd(2);index1++) {

// ***            Add +1            to frto-sub
// ***          if frto-sub <= +9999
//  cobolCode::IF FRTO-SUB < +9999
                  if (	( methodOut.getFrtoSub() < 9999 )) { 
//  cobolCode::ADD +1 TO FRTO-SUB
                      methodOut.setFrtoSub(methodOut.getFrtoSub()+1);

// *              Move frto-deriv-pl-of-svc-cd
//  cobolCode::MOVE HV08-SVC-DRV-POS ( HV08-INDEX ) TO D51U-FRTO-DRV-POS ( FRTO-SUB )
                      methodOut.setD51uFrtoDrvPos(methodOut.getFrtoSub() - 1,methodOut.getHv08SvcDrvPos(methodOut.getHv08Index() - 1));

// *              Move frto-deriv-svc-cd
//  cobolCode::MOVE HV09-SVC-DRV-SVC ( HV09-INDEX ) TO D51U-FRTO-DRV-SVC ( FRTO-SUB )
                      methodOut.setD51uFrtoDrvSvc(methodOut.getFrtoSub() - 1,methodOut.getHv09SvcDrvSvc(methodOut.getHv09Index() - 1));

// *              Move frto-deriv-caus-cd
//  cobolCode::MOVE HV10-SVC-DRV-CAU ( HV10-INDEX ) TO D51U-FRTO-DRV-CAU ( FRTO-SUB )
                      methodOut.setD51uFrtoDrvCau(methodOut.getFrtoSub() - 1,methodOut.getHv10SvcDrvCau(methodOut.getHv10Index() - 1));
//  cobolCode::MOVE HV11-CLM-FRM-SVC-CD ( HV11-INDEX ) TO D51U-FRTO-CLM-FRM-SVC-CD ( FRTO-SUB )
                      methodOut.setD51uFrtoClmFrmSvcCd(methodOut.getFrtoSub() - 1,methodOut.getHv11ClmFrmSvcCd(methodOut.getHv11Index() - 1));
//  cobolCode::MOVE HV12-CLM-TO-SVC-CD ( HV12-INDEX ) TO D51U-FRTO-CLM-TO-SVC-CD ( FRTO-SUB )
                      methodOut.setD51uFrtoClmToSvcCd(methodOut.getFrtoSub() - 1,methodOut.getHv12ClmToSvcCd(methodOut.getHv12Index() - 1));
//  cobolCode::MOVE HV13-SVC-TYP-CD ( HV13-INDEX ) TO D51U-FRTO-SVC-TYP-CD ( FRTO-SUB )
                      methodOut.setD51uFrtoSvcTypCd(methodOut.getFrtoSub() - 1,methodOut.getHv13SvcTypCd(methodOut.getHv13Index() - 1));
                  }
//  cobolCode::SET HV08-INDEX UP BY +1
                  methodOut.setHv08Index(methodOut.getHv08Index() + 1); 
                  
//  cobolCode::SET HV09-INDEX UP BY +1
                  methodOut.setHv09Index(methodOut.getHv09Index() + 1); 
                  
//  cobolCode::SET HV10-INDEX UP BY +1
                  methodOut.setHv10Index(methodOut.getHv10Index() + 1); 
                  
//  cobolCode::SET HV11-INDEX UP BY +1
                  methodOut.setHv11Index(methodOut.getHv11Index() + 1); 
                  
//  cobolCode::SET HV12-INDEX UP BY +1
                  methodOut.setHv12Index(methodOut.getHv12Index() + 1); 
                  
//  cobolCode::SET HV13-INDEX UP BY +1
                  methodOut.setHv13Index(methodOut.getHv13Index() + 1); 
                  
              }
//  cobolCode::IF FRTO-SUB = 0
              if (	( methodOut.getFrtoSub() == 0 )) { 
//  cobolCode::SET SVCD-NOT-FOUND TO TRUE
                  methodOut.setSvcdNotFoundTrue(); 
                  
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::SET SVCD-FOUND TO TRUE
                  methodOut.setSvcdFoundTrue(); 
                  
              }
//  cobolCode::SET END-OF-FETCH-FRTO TO TRUE
              methodOut.setEndOfFetchFrtoTrue(); 
              
//  cobolCode::MOVE FRTO-SUB TO D51U-FRTO-CNT
              methodOut.setD51uFrtoCnt(methodOut.getFrtoSub());
//  cobolCode::PERFORM 2285-CLOSE-CSR THRU 2285-EXIT
              closeCsr2285(programCtx.getCloseCsr2285InCtx());/*2285-CLOSE-CSR SECTION*/
          break;
          default :
//  cobolCode::SET SVCD-NOT-FOUND TO TRUE
              methodOut.setSvcdNotFoundTrue(); 
              
//  cobolCode::SET END-OF-FETCH-FRTO TO TRUE
              methodOut.setEndOfFetchFrtoTrue(); 
              
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::PERFORM 2285-CLOSE-CSR THRU 2285-EXIT
              closeCsr2285(programCtx.getCloseCsr2285InCtx());/*2285-CLOSE-CSR SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsr2285 
      *   This method is derived from 
  *   COBOL Paragraph - 2285-CLOSE-CSR SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      @Override
      public CloseCsr2285OutCtx closeCsr2285(CloseCsr2285InCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
CloseCsr2285OutCtx methodOut = methodIn.getCloseCsr2285OutCtx();
//  cobolCode::CLOSE CSFRTO
          d529351uRepository.closeCsfrtoD529351u(programCtx.getCsfrtoResultSet(),programCtx.getSqlca());
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::SET CLOSE-CSR-OK TO TRUE
              methodOut.setCloseCsrOkTrue(); 
              
          break;
          default :
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::SET CLOSE-CSR-NG TO TRUE
              methodOut.setCloseCsrNgTrue(); 
              
//  cobolCode::SET D51U-DB2-ERROR TO TRUE
              methodOut.setD51uDb2ErrorTrue(); 
              
//  cobolCode::SET D51U-DB2-CLOSE-ERROR TO TRUE
              methodOut.setD51uDb2CloseErrorTrue(); 
              
//  cobolCode::MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              methodOut.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(methodOut.getSqlcode_Ws()).toCharArray()));
//  cobolCode::MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              methodOut.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE '2285-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2285_MN_ = '2285-'
              methodOut.setD51uParagraphNum(CONSTANTS.LITERAL_2285_MN_);
          }
      
      return methodOut;
      }
      /**
      * openCsptypCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 2350-OPEN-CSPTYP-CURSOR SECTION COBOL Cyclomatic complexity - 6
      * Input  :  

      * - fetchEndPtyp                   COBOL Name: WS-FETCH-END-PTYP
      * - ptypSub                        COBOL Name: PTYP-SUB
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      @Override
      public OpenCsptypCursorOutCtx openCsptypCursor(OpenCsptypCursorInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81 2350-Open-csptyp-cursor section.                            *
// *81                                                              *
// *81 business function:                                           *
// *81 select / validate columns the fe spi tables                  *
// *81***************************************************************
// *82***************************************************************
// *82 2350-open-csptyp-cursor section                              *
// *82                                                              *
// *82 1.open cursor of this table                                  *
// *82                - fe_spi_rule_prov_typ                        *
// *82                                                              *
// *82 called by : 1.                                               *
// *82 call      :                                                  *
// *82                                                              *
// *82***************************************************************
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
OpenCsptypCursorOutCtx methodOut = methodIn.getOpenCsptypCursorOutCtx();
//  cobolCode::SELECT PROV_TYP FROM FE_SPI_RULE_PROV_TYP WHERE SPI_TBL_ID = ? AND STS_CD = 'A' AND DERIV_PL_OF_SVC_CD = ? AND DERIV_SVC_CD = ? AND DERIV_CAUS_CD = ? FOR FETCH ONLY
          programCtx.setCsptypResultSet(d529351uRepository.openCsptypD529351u(methodIn.getDclfeSpiRuleProvTyp(),programCtx.getSqlca()));
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::PERFORM 2380-FETCH-CSPTYP THRU 2380-EXIT UNTIL END-OF-FETCH-PTYP OR PTYP-SUB > +99
              while (!(methodIn.isEndOfFetchPtyp())  && 	( methodIn.getPtypSub() <= 99 )) {
                 fetchCsptyp(programCtx.getFetchCsptypInCtx());/*2380-FETCH-CSPTYP SECTION*/
              }
          break;
          default :
//  cobolCode::SET DSM-DB2-ERROR TO TRUE
              methodOut.setDsmDb2ErrorTrue(); 
              
//  cobolCode::SET D51U-DB2-ERROR TO TRUE
              methodOut.setD51uDb2ErrorTrue(); 
              
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::SET D51U-DB2-OPEN-ERROR TO TRUE
              methodOut.setD51uDb2OpenErrorTrue(); 
              
//  cobolCode::MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              methodOut.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(methodOut.getSqlcode_Ws()).toCharArray()));
//  cobolCode::MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              methodOut.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE '2350-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2350_MN_ = '2350-'
              methodOut.setD51uParagraphNum(CONSTANTS.LITERAL_2350_MN_);
          }
      
      return methodOut;
      }
      /**
      * fetchCsptyp 
      *   This method is derived from 
  *   COBOL Paragraph - 2380-FETCH-CSPTYP SECTION COBOL Cyclomatic complexity - 7
      * Input  :  

      * - ptypSub                        COBOL Name: PTYP-SUB
      * - ptypDerivPlOfSvcCd             COBOL Name: PTYP-DERIV-PL-OF-SVC-CD
      * - ptypDerivSvcCd                 COBOL Name: PTYP-DERIV-SVC-CD
      * - ptypDerivCausCd                COBOL Name: PTYP-DERIV-CAUS-CD
      * - ptypProvTyp                    COBOL Name: PTYP-PROV-TYP
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - ptypSub                        COBOL Name: PTYP-SUB
      * - d51uPtypDrvPos                 COBOL Name: D51U-PTYP-DRV-POS
      * - ptypDerivPlOfSvcCd             COBOL Name: PTYP-DERIV-PL-OF-SVC-CD
      * - d51uPtypDrvSvc                 COBOL Name: D51U-PTYP-DRV-SVC
      * - ptypDerivSvcCd                 COBOL Name: PTYP-DERIV-SVC-CD
      * - d51uPtypDrvCau                 COBOL Name: D51U-PTYP-DRV-CAU
      * - ptypDerivCausCd                COBOL Name: PTYP-DERIV-CAUS-CD
      * - d51uPtypProvTyp                COBOL Name: D51U-PTYP-PROV-TYP
      * - ptypProvTyp                    COBOL Name: PTYP-PROV-TYP
      * - provFoundSw                    COBOL Name: PROV-FOUND-SW
      * - fetchEndPtyp                   COBOL Name: WS-FETCH-END-PTYP
      * - d51uPtypCnt                    COBOL Name: D51U-PTYP-CNT
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsptypOutCtx fetchCsptyp(FetchCsptypInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
FetchCsptypOutCtx methodOut = methodIn.getFetchCsptypOutCtx();
//  cobolCode::FETCH CSPTYP INTO ?
          d529351uRepository.fetchCsptypD529351u(programCtx.getCsptypResultSet(),methodOut.getDclfeSpiRuleProvTyp(),programCtx.getSqlca());
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
          
          	case 100:
//  cobolCode::IF PTYP-SUB = 0
              if (	( methodOut.getPtypSub() == 0 )) { 
//  cobolCode::SET PROVTYP-NOT-FOUND TO TRUE
                  methodOut.setProvtypNotFoundTrue(); 
                  
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::SET PROVTYP-FOUND TO TRUE
                  methodOut.setProvtypFoundTrue(); 
                  
              }
//  cobolCode::SET END-OF-FETCH-PTYP TO TRUE
              methodOut.setEndOfFetchPtypTrue(); 
              
//  cobolCode::MOVE PTYP-SUB TO D51U-PTYP-CNT
              methodOut.setD51uPtypCnt(methodOut.getPtypSub());
//  cobolCode::PERFORM 2385-CLOSE-CSR THRU 2385-EXIT
              closeCsr2385(programCtx.getCloseCsr2385InCtx());/*2385-CLOSE-CSR SECTION*/
          break;
          default :
//  cobolCode::SET END-OF-FETCH-PTYP TO TRUE
              methodOut.setEndOfFetchPtypTrue(); 
              
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::PERFORM 2385-CLOSE-CSR THRU 2385-EXIT
              closeCsr2385(programCtx.getCloseCsr2385InCtx());/*2385-CLOSE-CSR SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsr2385 
      *   This method is derived from 
  *   COBOL Paragraph - 2385-CLOSE-CSR SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      @Override
      public CloseCsr2385OutCtx closeCsr2385(CloseCsr2385InCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
CloseCsr2385OutCtx methodOut = methodIn.getCloseCsr2385OutCtx();
//  cobolCode::CLOSE CSPTYP
          d529351uRepository.closeCsptypD529351u(programCtx.getCsptypResultSet(),programCtx.getSqlca());
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::SET CLOSE-CSR-OK TO TRUE
              methodOut.setCloseCsrOkTrue(); 
              
          break;
          default :
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::SET CLOSE-CSR-NG TO TRUE
              methodOut.setCloseCsrNgTrue(); 
              
//  cobolCode::SET D51U-DB2-ERROR TO TRUE
              methodOut.setD51uDb2ErrorTrue(); 
              
//  cobolCode::SET D51U-DB2-CLOSE-ERROR TO TRUE
              methodOut.setD51uDb2CloseErrorTrue(); 
              
//  cobolCode::MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              methodOut.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(methodOut.getSqlcode_Ws()).toCharArray()));
//  cobolCode::MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              methodOut.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE '2385-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2385_MN_ = '2385-'
              methodOut.setD51uParagraphNum(CONSTANTS.LITERAL_2385_MN_);
          }
      
      return methodOut;
      }
      /**
      * openCsicdCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 2450-OPEN-CSICD-CURSOR SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      @Override
      public OpenCsicdCursorOutCtx openCsicdCursor(OpenCsicdCursorInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81 2450-Open-csicd-cursor section.                              *
// *81                                                              *
// *81 business function:                                           *
// *81 select / validate columns the fe spi tables                  *
// *81***************************************************************
// *82***************************************************************
// *82 2450-open-csicd-cursor section                               *
// *82                                                              *
// *82 1.open cursor of this table                                  *
// *82                - fe_spi_rule_icd                             *
// *82                                                              *
// *82 called by : 1.                                               *
// *82 call      :                                                  *
// *82                                                              *
// *82***************************************************************
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
OpenCsicdCursorOutCtx methodOut = methodIn.getOpenCsicdCursorOutCtx();
//  cobolCode::SELECT DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , CLM_ICD_IND , CLM_ICD_FROM_CD , CLM_ICD_TO_CD FROM FE_SPI_RULE_ICD WHERE SPI_TBL_ID = ? AND STS_CD = 'A' AND DERIV_PL_OF_SVC_CD = ? AND DERIV_SVC_CD = ? AND DERIV_CAUS_CD = ? AND CLM_ICD_IND = ? AND ( ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? ) ORDER BY CLM_ICD_FROM_CD , CLM_ICD_TO_CD FOR FETCH ONLY
          programCtx.setCsicdResultSet(d529351uRepository.openCsicdD529351u(methodIn.getLstIcdKey(),methodIn.getTestVariables(),programCtx.getSqlca(),methodIn.getDclfeSpiRuleIcd()));
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::PERFORM 2480-FETCH-CSICD THRU 2480-EXIT
              fetchCsicd(programCtx.getFetchCsicdInCtx());/*2480-FETCH-CSICD SECTION*/
          break;
          default :
//  cobolCode::SET DSM-DB2-ERROR TO TRUE
              methodOut.setDsmDb2ErrorTrue(); 
              
//  cobolCode::SET D51U-DB2-ERROR TO TRUE
              methodOut.setD51uDb2ErrorTrue(); 
              
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::SET D51U-DB2-OPEN-ERROR TO TRUE
              methodOut.setD51uDb2OpenErrorTrue(); 
              
//  cobolCode::MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              methodOut.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(methodOut.getSqlcode_Ws()).toCharArray()));
//  cobolCode::MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              methodOut.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE '2450-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2450_MN_ = '2450-'
              methodOut.setD51uParagraphNum(CONSTANTS.LITERAL_2450_MN_);
          }
      
      return methodOut;
      }
      /**
      * fetchCsicd 
      *   This method is derived from 
  *   COBOL Paragraph - 2480-FETCH-CSICD SECTION COBOL Cyclomatic complexity - 11
      * Input  :  

      * - sqlerrd                        COBOL Name: SQLERRD
      * - icdSub                         COBOL Name: ICD-SUB
      * - hv3aIcdDrvPos                  COBOL Name: HV3A-ICD-DRV-POS
      * - hv3bIcdDrvSvc                  COBOL Name: HV3B-ICD-DRV-SVC
      * - hv3cIcdDrvCau                  COBOL Name: HV3C-ICD-DRV-CAU
      * - hv3dIcdTypCd                   COBOL Name: HV3D-ICD-TYP-CD
      * - hv3eClmFrmIcdCd                COBOL Name: HV3E-CLM-FRM-ICD-CD
      * - hv3fClmToIcdCd                 COBOL Name: HV3F-CLM-TO-ICD-CD
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsnnrows                       COBOL Name: DSNNROWS
      * - hv3aIndex                      COBOL Name: HV3A-INDEX
      * - hv3bIndex                      COBOL Name: HV3B-INDEX
      * - hv3cIndex                      COBOL Name: HV3C-INDEX
      * - hv3dIndex                      COBOL Name: HV3D-INDEX
      * - hv3eIndex                      COBOL Name: HV3E-INDEX
      * - hv3fIndex                      COBOL Name: HV3F-INDEX
      * - icdSub                         COBOL Name: ICD-SUB
      * - d51uRicdDrvPos                 COBOL Name: D51U-RICD-DRV-POS
      * - hv3aIcdDrvPos                  COBOL Name: HV3A-ICD-DRV-POS
      * - d51uRicdDrvSvc                 COBOL Name: D51U-RICD-DRV-SVC
      * - hv3bIcdDrvSvc                  COBOL Name: HV3B-ICD-DRV-SVC
      * - d51uRicdDrvCau                 COBOL Name: D51U-RICD-DRV-CAU
      * - hv3cIcdDrvCau                  COBOL Name: HV3C-ICD-DRV-CAU
      * - d51uRicdClmIcdInd              COBOL Name: D51U-RICD-CLM-ICD-IND
      * - hv3dIcdTypCd                   COBOL Name: HV3D-ICD-TYP-CD
      * - d51uRicdClmIcdFromCd           COBOL Name: D51U-RICD-CLM-ICD-FROM-CD
      * - hv3eClmFrmIcdCd                COBOL Name: HV3E-CLM-FRM-ICD-CD
      * - d51uRicdClmIcdToCd             COBOL Name: D51U-RICD-CLM-ICD-TO-CD
      * - hv3fClmToIcdCd                 COBOL Name: HV3F-CLM-TO-ICD-CD
      * - moreIcdFoundSw                 COBOL Name: MORE-ICD-FOUND-SW
      * - d51uMoreIcdCnt                 COBOL Name: D51U-MORE-ICD-CNT
      * - fetchEndIcd                    COBOL Name: WS-FETCH-END-ICD
      * - icdFoundSw                     COBOL Name: ICD-FOUND-SW
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsicdOutCtx fetchCsicd(FetchCsicdInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
FetchCsicdOutCtx methodOut = methodIn.getFetchCsicdOutCtx();
// FETCH NEXT ROWSET FROM CSICD FOR 9999 ROWS INTO  ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ? 
//  cobolCode::MOVE 9999 TO DSNNROWS
          methodOut.setDsnnrows(9999);
//  cobolCode::FETCH NEXT ROWSET FROM CSICD FOR 9999 ROWS INTO ? , ? , ? , ? , ? , ?
          d529351uRepository.fetchCsicdD529351u(programCtx.getCsicdResultSet(),methodOut.getHvHostVariablesCsicdo(),programCtx.getSqlca());
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::SET HV3A-INDEX TO +1
              methodOut.setHv3aIndex(1); 
              
//  cobolCode::SET HV3B-INDEX TO +1
              methodOut.setHv3bIndex(1); 
              
//  cobolCode::SET HV3C-INDEX TO +1
              methodOut.setHv3cIndex(1); 
              
//  cobolCode::SET HV3D-INDEX TO +1
              methodOut.setHv3dIndex(1); 
              
//  cobolCode::SET HV3E-INDEX TO +1
              methodOut.setHv3eIndex(1); 
              
//  cobolCode::SET HV3F-INDEX TO +1
              methodOut.setHv3fIndex(1); 
              
//  cobolCode::PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < methodIn.getSqlerrd(2);index1++) {

// **         Add +1 to icd-sub
// **        if icd-sub > +0 and icd-sub <= +9999
//  cobolCode::IF ICD-SUB < +9999
                  if (	( methodOut.getIcdSub() < 9999 )) { 
//  cobolCode::ADD +1 TO ICD-SUB
                      methodOut.setIcdSub(methodOut.getIcdSub()+1);

// **         Move ricd-deriv-pl-of-svc-cd  to
//  cobolCode::MOVE HV3A-ICD-DRV-POS ( HV3A-INDEX ) TO D51U-RICD-DRV-POS ( ICD-SUB )
                      methodOut.setD51uRicdDrvPos(methodOut.getIcdSub() - 1,methodOut.getHv3aIcdDrvPos(methodOut.getHv3aIndex() - 1));

// **         Move ricd-deriv-svc-cd        to
//  cobolCode::MOVE HV3B-ICD-DRV-SVC ( HV3B-INDEX ) TO D51U-RICD-DRV-SVC ( ICD-SUB )
                      methodOut.setD51uRicdDrvSvc(methodOut.getIcdSub() - 1,methodOut.getHv3bIcdDrvSvc(methodOut.getHv3bIndex() - 1));

// **         Move ricd-deriv-caus-cd       to
//  cobolCode::MOVE HV3C-ICD-DRV-CAU ( HV3C-INDEX ) TO D51U-RICD-DRV-CAU ( ICD-SUB )
                      methodOut.setD51uRicdDrvCau(methodOut.getIcdSub() - 1,methodOut.getHv3cIcdDrvCau(methodOut.getHv3cIndex() - 1));

// **         Move ricd-clm-icd-ind         to
//  cobolCode::MOVE HV3D-ICD-TYP-CD ( HV3D-INDEX ) TO D51U-RICD-CLM-ICD-IND ( ICD-SUB )
                      methodOut.setD51uRicdClmIcdInd(methodOut.getIcdSub() - 1,methodOut.getHv3dIcdTypCd(methodOut.getHv3dIndex() - 1));

// **         Move ricd-clm-icd-from-cd  to
//  cobolCode::MOVE HV3E-CLM-FRM-ICD-CD ( HV3E-INDEX ) TO D51U-RICD-CLM-ICD-FROM-CD ( ICD-SUB )
                      methodOut.setD51uRicdClmIcdFromCd(methodOut.getIcdSub() - 1,methodOut.getHv3eClmFrmIcdCd(methodOut.getHv3eIndex() - 1));

// **         Move ricd-clm-icd-to-cd  to
//  cobolCode::MOVE HV3F-CLM-TO-ICD-CD ( HV3F-INDEX ) TO D51U-RICD-CLM-ICD-TO-CD ( ICD-SUB )
                      methodOut.setD51uRicdClmIcdToCd(methodOut.getIcdSub() - 1,methodOut.getHv3fClmToIcdCd(methodOut.getHv3fIndex() - 1));
                  }

// **         Set icd-found to true
// **        else
// **         move 'y' to d51u-more-icd-records
// **         move +9999 to d51u-icd-cnt
// **         set end-of-fetch-icd  to true
// **         perform 2485-close-csr  thru 2485-exit
//  cobolCode::SET HV3A-INDEX UP BY +1
                  methodOut.setHv3aIndex(methodOut.getHv3aIndex() + 1); 
                  
//  cobolCode::SET HV3B-INDEX UP BY +1
                  methodOut.setHv3bIndex(methodOut.getHv3bIndex() + 1); 
                  
//  cobolCode::SET HV3C-INDEX UP BY +1
                  methodOut.setHv3cIndex(methodOut.getHv3cIndex() + 1); 
                  
//  cobolCode::SET HV3D-INDEX UP BY +1
                  methodOut.setHv3dIndex(methodOut.getHv3dIndex() + 1); 
                  
//  cobolCode::SET HV3E-INDEX UP BY +1
                  methodOut.setHv3eIndex(methodOut.getHv3eIndex() + 1); 
                  
//  cobolCode::SET HV3F-INDEX UP BY +1
                  methodOut.setHv3fIndex(methodOut.getHv3fIndex() + 1); 
                  
              }
//  cobolCode::IF ICD-SUB = +9999
              if (	( methodOut.getIcdSub() == 9999 )) { 
//  cobolCode::SET MORE-ICD-FOUND TO TRUE
                  methodOut.setMoreIcdFoundTrue(); 
                  
//  cobolCode::MOVE ICD-SUB TO D51U-MORE-ICD-CNT
                  methodOut.setD51uMoreIcdCnt(methodOut.getIcdSub());
              }
          break;
          	case 100:
//  cobolCode::SET HV3A-INDEX TO +1
              methodOut.setHv3aIndex(1); 
              
//  cobolCode::SET HV3B-INDEX TO +1
              methodOut.setHv3bIndex(1); 
              
//  cobolCode::SET HV3C-INDEX TO +1
              methodOut.setHv3cIndex(1); 
              
//  cobolCode::SET HV3D-INDEX TO +1
              methodOut.setHv3dIndex(1); 
              
//  cobolCode::SET HV3E-INDEX TO +1
              methodOut.setHv3eIndex(1); 
              
//  cobolCode::SET HV3F-INDEX TO +1
              methodOut.setHv3fIndex(1); 
              
//  cobolCode::PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < methodIn.getSqlerrd(2);index1++) {
//  cobolCode::IF ICD-SUB < +9999
                  if (	( methodOut.getIcdSub() < 9999 )) { 
//  cobolCode::ADD +1 TO ICD-SUB
                      methodOut.setIcdSub(methodOut.getIcdSub()+1);
//  cobolCode::MOVE HV3A-ICD-DRV-POS ( HV3A-INDEX ) TO D51U-RICD-DRV-POS ( ICD-SUB )
                      methodOut.setD51uRicdDrvPos(methodOut.getIcdSub() - 1,methodOut.getHv3aIcdDrvPos(methodOut.getHv3aIndex() - 1));
//  cobolCode::MOVE HV3B-ICD-DRV-SVC ( HV3B-INDEX ) TO D51U-RICD-DRV-SVC ( ICD-SUB )
                      methodOut.setD51uRicdDrvSvc(methodOut.getIcdSub() - 1,methodOut.getHv3bIcdDrvSvc(methodOut.getHv3bIndex() - 1));
//  cobolCode::MOVE HV3C-ICD-DRV-CAU ( HV3C-INDEX ) TO D51U-RICD-DRV-CAU ( ICD-SUB )
                      methodOut.setD51uRicdDrvCau(methodOut.getIcdSub() - 1,methodOut.getHv3cIcdDrvCau(methodOut.getHv3cIndex() - 1));
//  cobolCode::MOVE HV3D-ICD-TYP-CD ( HV3D-INDEX ) TO D51U-RICD-CLM-ICD-IND ( ICD-SUB )
                      methodOut.setD51uRicdClmIcdInd(methodOut.getIcdSub() - 1,methodOut.getHv3dIcdTypCd(methodOut.getHv3dIndex() - 1));
//  cobolCode::MOVE HV3E-CLM-FRM-ICD-CD ( HV3E-INDEX ) TO D51U-RICD-CLM-ICD-FROM-CD ( ICD-SUB )
                      methodOut.setD51uRicdClmIcdFromCd(methodOut.getIcdSub() - 1,methodOut.getHv3eClmFrmIcdCd(methodOut.getHv3eIndex() - 1));
//  cobolCode::MOVE HV3F-CLM-TO-ICD-CD ( HV3F-INDEX ) TO D51U-RICD-CLM-ICD-TO-CD ( ICD-SUB )
                      methodOut.setD51uRicdClmIcdToCd(methodOut.getIcdSub() - 1,methodOut.getHv3fClmToIcdCd(methodOut.getHv3fIndex() - 1));
                  }
//  cobolCode::SET HV3A-INDEX UP BY +1
                  methodOut.setHv3aIndex(methodOut.getHv3aIndex() + 1); 
                  
//  cobolCode::SET HV3B-INDEX UP BY +1
                  methodOut.setHv3bIndex(methodOut.getHv3bIndex() + 1); 
                  
//  cobolCode::SET HV3C-INDEX UP BY +1
                  methodOut.setHv3cIndex(methodOut.getHv3cIndex() + 1); 
                  
//  cobolCode::SET HV3D-INDEX UP BY +1
                  methodOut.setHv3dIndex(methodOut.getHv3dIndex() + 1); 
                  
//  cobolCode::SET HV3E-INDEX UP BY +1
                  methodOut.setHv3eIndex(methodOut.getHv3eIndex() + 1); 
                  
//  cobolCode::SET HV3F-INDEX UP BY +1
                  methodOut.setHv3fIndex(methodOut.getHv3fIndex() + 1); 
                  
              }
//  cobolCode::IF ICD-SUB = 0
              if (	( methodOut.getIcdSub() == 0 )) { 

// **            Set icd-not-found  to true
//  cobolCode::SET MORE-ICD-NOT-FOUND TO TRUE
                  methodOut.setMoreIcdNotFoundTrue(); 
                  
              }
//  cobolCode::ELSE
              else { 

// **            Set icd-found  to true
//  cobolCode::SET MORE-ICD-FOUND TO TRUE
                  methodOut.setMoreIcdFoundTrue(); 
                  
              }
//  cobolCode::SET END-OF-FETCH-ICD TO TRUE
              methodOut.setEndOfFetchIcdTrue(); 
              

// **         Move icd-sub to d51u-icd-cnt
//  cobolCode::MOVE ICD-SUB TO D51U-MORE-ICD-CNT
              methodOut.setD51uMoreIcdCnt(methodOut.getIcdSub());
//  cobolCode::PERFORM 2485-CLOSE-CSR THRU 2485-EXIT
              closeCsr2485(programCtx.getCloseCsr2485InCtx());/*2485-CLOSE-CSR SECTION*/
          break;
          default :
//  cobolCode::SET ICD-NOT-FOUND TO TRUE
              methodOut.setIcdNotFoundTrue(); 
              
//  cobolCode::SET END-OF-FETCH-ICD TO TRUE
              methodOut.setEndOfFetchIcdTrue(); 
              
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::PERFORM 2485-CLOSE-CSR THRU 2485-EXIT
              closeCsr2485(programCtx.getCloseCsr2485InCtx());/*2485-CLOSE-CSR SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsr2485 
      *   This method is derived from 
  *   COBOL Paragraph - 2485-CLOSE-CSR SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      @Override
      public CloseCsr2485OutCtx closeCsr2485(CloseCsr2485InCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
CloseCsr2485OutCtx methodOut = methodIn.getCloseCsr2485OutCtx();
//  cobolCode::CLOSE CSICD
          d529351uRepository.closeCsicdD529351u(programCtx.getCsicdResultSet(),programCtx.getSqlca());
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::SET CLOSE-CSR-OK TO TRUE
              methodOut.setCloseCsrOkTrue(); 
              
          break;
          default :
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::SET CLOSE-CSR-NG TO TRUE
              methodOut.setCloseCsrNgTrue(); 
              
//  cobolCode::SET D51U-DB2-ERROR TO TRUE
              methodOut.setD51uDb2ErrorTrue(); 
              
//  cobolCode::SET D51U-DB2-CLOSE-ERROR TO TRUE
              methodOut.setD51uDb2CloseErrorTrue(); 
              
//  cobolCode::MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              methodOut.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(methodOut.getSqlcode_Ws()).toCharArray()));
//  cobolCode::MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              methodOut.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE '2485-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2485_MN_ = '2485-'
              methodOut.setD51uParagraphNum(CONSTANTS.LITERAL_2485_MN_);
          }
      
      return methodOut;
      }
      /**
      * openCsfcndCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 2550-OPEN-CSFCND-CURSOR SECTION COBOL Cyclomatic complexity - 6
      * Input  :  

      * - fetchEndFcnd                   COBOL Name: WS-FETCH-END-FCND
      * - fcndSub                        COBOL Name: FCND-SUB
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      @Override
      public OpenCsfcndCursorOutCtx openCsfcndCursor(OpenCsfcndCursorInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81 2550-Open-csfcnd-cursor section.                             *
// *81                                                              *
// *81 business function:                                           *
// *81 select / validate columns the fe spi tables                  *
// *81***************************************************************
// *82***************************************************************
// *82 2550-open-csfcnd-cursor section                              *
// *82                                                              *
// *82 1.open cursor and fetch data from:                           *
// *82                - fe_spi_rule_fr_cond_pos                     *
// *82                                                              *
// *82 called by : 1.                                               *
// *82 call      :                                                  *
// *82                                                              *
// *82***************************************************************
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
OpenCsfcndCursorOutCtx methodOut = methodIn.getOpenCsfcndCursorOutCtx();
//  cobolCode::SELECT FROM_COND_POS FROM FE_SPI_RULE_FR_COND_POS WHERE SPI_TBL_ID = ? AND STS_CD = 'A' AND DERIV_PL_OF_SVC_CD = ? AND DERIV_SVC_CD = ? AND DERIV_CAUS_CD = ? FOR FETCH ONLY
          programCtx.setCsfcndResultSet(d529351uRepository.openCsfcndD529351u(methodIn.getDclfeSpiRuleFrCondPos(),programCtx.getSqlca()));
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::PERFORM 2580-FETCH-CSFCND THRU 2580-EXIT UNTIL END-OF-FETCH-FCND OR FCND-SUB > +99
              while (!(methodIn.isEndOfFetchFcnd())  && 	( methodIn.getFcndSub() <= 99 )) {
                 fetchCsfcnd(programCtx.getFetchCsfcndInCtx());/*2580-FETCH-CSFCND SECTION*/
              }
          break;
          default :
//  cobolCode::SET DSM-DB2-ERROR TO TRUE
              methodOut.setDsmDb2ErrorTrue(); 
              
//  cobolCode::SET D51U-DB2-ERROR TO TRUE
              methodOut.setD51uDb2ErrorTrue(); 
              
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::SET D51U-DB2-OPEN-ERROR TO TRUE
              methodOut.setD51uDb2OpenErrorTrue(); 
              
//  cobolCode::MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              methodOut.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(methodOut.getSqlcode_Ws()).toCharArray()));
//  cobolCode::MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              methodOut.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE '2550-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2550_MN_ = '2550-'
              methodOut.setD51uParagraphNum(CONSTANTS.LITERAL_2550_MN_);
          }
      
      return methodOut;
      }
      /**
      * fetchCsfcnd 
      *   This method is derived from 
  *   COBOL Paragraph - 2580-FETCH-CSFCND SECTION COBOL Cyclomatic complexity - 6
      * Input  :  

      * - fcndSub                        COBOL Name: FCND-SUB
      * - fcndDerivPlOfSvcCd             COBOL Name: FCND-DERIV-PL-OF-SVC-CD
      * - fcndDerivSvcCd                 COBOL Name: FCND-DERIV-SVC-CD
      * - fcndDerivCausCd                COBOL Name: FCND-DERIV-CAUS-CD
      * - fcndFromCondPos                COBOL Name: FCND-FROM-COND-POS
      * - csSub                          COBOL Name: CS-SUB
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - fcndSub                        COBOL Name: FCND-SUB
      * - d51uFcndDrvPos                 COBOL Name: D51U-FCND-DRV-POS
      * - fcndDerivPlOfSvcCd             COBOL Name: FCND-DERIV-PL-OF-SVC-CD
      * - d51uFcndDrvSvc                 COBOL Name: D51U-FCND-DRV-SVC
      * - fcndDerivSvcCd                 COBOL Name: FCND-DERIV-SVC-CD
      * - d51uFcndDrvCau                 COBOL Name: D51U-FCND-DRV-CAU
      * - fcndDerivCausCd                COBOL Name: FCND-DERIV-CAUS-CD
      * - d51uFcndFromCondPos            COBOL Name: D51U-FCND-FROM-COND-POS
      * - fcndFromCondPos                COBOL Name: FCND-FROM-COND-POS
      * - posFoundSw                     COBOL Name: POS-FOUND-SW
      * - fetchEndFcnd                   COBOL Name: WS-FETCH-END-FCND
      * - d51uFcndCnt                    COBOL Name: D51U-FCND-CNT
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsfcndOutCtx fetchCsfcnd(FetchCsfcndInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
FetchCsfcndOutCtx methodOut = methodIn.getFetchCsfcndOutCtx();
//  cobolCode::FETCH CSFCND INTO ?
          d529351uRepository.fetchCsfcndD529351u(programCtx.getCsfcndResultSet(),methodOut.getDclfeSpiRuleFrCondPos(),programCtx.getSqlca());
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::ADD +1 TO FCND-SUB
              methodOut.setFcndSub(methodOut.getFcndSub()+1);
//  cobolCode::MOVE FCND-DERIV-PL-OF-SVC-CD TO D51U-FCND-DRV-POS ( FCND-SUB )
              methodOut.setD51uFcndDrvPos(methodOut.getFcndSub() - 1,methodOut.getFcndDerivPlOfSvcCd());
//  cobolCode::MOVE FCND-DERIV-SVC-CD TO D51U-FCND-DRV-SVC ( FCND-SUB )
              methodOut.setD51uFcndDrvSvc(methodOut.getFcndSub() - 1,methodOut.getFcndDerivSvcCd());
//  cobolCode::MOVE FCND-DERIV-CAUS-CD TO D51U-FCND-DRV-CAU ( FCND-SUB )
              methodOut.setD51uFcndDrvCau(methodOut.getFcndSub() - 1,methodOut.getFcndDerivCausCd());
//  cobolCode::MOVE FCND-FROM-COND-POS TO D51U-FCND-FROM-COND-POS ( FCND-SUB )
              methodOut.setD51uFcndFromCondPos(methodOut.getFcndSub() - 1,pad(3,methodOut.getFcndFromCondPos(),SPACE_CHAR,RIGHT_PAD));
//  cobolCode::SET POS-FOUND TO TRUE
              methodOut.setPosFoundTrue(); 
              
          break;
          	case 100:
//  cobolCode::IF CS-SUB = 0
              if (	( methodIn.getCsSub() == 0 )) { 
//  cobolCode::SET POS-NOT-FOUND TO TRUE
                  methodOut.setPosNotFoundTrue(); 
                  
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::SET POS-FOUND TO TRUE
                  methodOut.setPosFoundTrue(); 
                  
              }
//  cobolCode::SET END-OF-FETCH-FCND TO TRUE
              methodOut.setEndOfFetchFcndTrue(); 
              
//  cobolCode::MOVE FCND-SUB TO D51U-FCND-CNT
              methodOut.setD51uFcndCnt(methodOut.getFcndSub());
//  cobolCode::PERFORM 2585-CLOSE-CSR THRU 2585-EXIT
              closeCsr2585(programCtx.getCloseCsr2585InCtx());/*2585-CLOSE-CSR SECTION*/
          break;
          default :
//  cobolCode::SET POS-NOT-FOUND TO TRUE
              methodOut.setPosNotFoundTrue(); 
              
//  cobolCode::SET END-OF-FETCH-FCND TO TRUE
              methodOut.setEndOfFetchFcndTrue(); 
              
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::PERFORM 2585-CLOSE-CSR THRU 2585-EXIT
              closeCsr2585(programCtx.getCloseCsr2585InCtx());/*2585-CLOSE-CSR SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsr2585 
      *   This method is derived from 
  *   COBOL Paragraph - 2585-CLOSE-CSR SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      @Override
      public CloseCsr2585OutCtx closeCsr2585(CloseCsr2585InCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
CloseCsr2585OutCtx methodOut = methodIn.getCloseCsr2585OutCtx();
//  cobolCode::CLOSE CSFCND
          d529351uRepository.closeCsfcndD529351u(programCtx.getCsfcndResultSet(),programCtx.getSqlca());
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::SET CLOSE-CSR-OK TO TRUE
              methodOut.setCloseCsrOkTrue(); 
              
          break;
          default :
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::SET CLOSE-CSR-NG TO TRUE
              methodOut.setCloseCsrNgTrue(); 
              
//  cobolCode::SET D51U-DB2-ERROR TO TRUE
              methodOut.setD51uDb2ErrorTrue(); 
              
//  cobolCode::SET D51U-DB2-CLOSE-ERROR TO TRUE
              methodOut.setD51uDb2CloseErrorTrue(); 
              
//  cobolCode::MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              methodOut.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(methodOut.getSqlcode_Ws()).toCharArray()));
//  cobolCode::MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              methodOut.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE '2585-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2585_MN_ = '2585-'
              methodOut.setD51uParagraphNum(CONSTANTS.LITERAL_2585_MN_);
          }
      
      return methodOut;
      }
      /**
      * selectCauseTable 
      *   This method is derived from 
  *   COBOL Paragraph - 2650-SELECT-CAUSE-TABLE SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - causSub                        COBOL Name: CAUS-SUB
      * - causDerivPlOfSvcCd             COBOL Name: CAUS-DERIV-PL-OF-SVC-CD
      * - causDerivSvcCd                 COBOL Name: CAUS-DERIV-SVC-CD
      * - causDerivCausCd                COBOL Name: CAUS-DERIV-CAUS-CD
      * - causClmCaus1Cd                 COBOL Name: CAUS-CLM-CAUS-1-CD
      * - causClmCaus2Cd                 COBOL Name: CAUS-CLM-CAUS-2-CD
      * - causClmCaus3Cd                 COBOL Name: CAUS-CLM-CAUS-3-CD
      * - causClmCaus4Cd                 COBOL Name: CAUS-CLM-CAUS-4-CD
      * - causClmCaus5Cd                 COBOL Name: CAUS-CLM-CAUS-5-CD
      * - causClmCaus6Cd                 COBOL Name: CAUS-CLM-CAUS-6-CD
      * - causClmCaus7Cd                 COBOL Name: CAUS-CLM-CAUS-7-CD
      * - causClmCaus8Cd                 COBOL Name: CAUS-CLM-CAUS-8-CD
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - causSub                        COBOL Name: CAUS-SUB
      * - d51uCausCnt                    COBOL Name: D51U-CAUS-CNT
      * - d51uCausDrvPos                 COBOL Name: D51U-CAUS-DRV-POS
      * - causDerivPlOfSvcCd             COBOL Name: CAUS-DERIV-PL-OF-SVC-CD
      * - d51uCausDrvSvc                 COBOL Name: D51U-CAUS-DRV-SVC
      * - causDerivSvcCd                 COBOL Name: CAUS-DERIV-SVC-CD
      * - d51uCausDrvCau                 COBOL Name: D51U-CAUS-DRV-CAU
      * - causDerivCausCd                COBOL Name: CAUS-DERIV-CAUS-CD
      * - d51uCausClmCauseCd1            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-1
      * - causClmCaus1Cd                 COBOL Name: CAUS-CLM-CAUS-1-CD
      * - d51uCausClmCauseCd2            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-2
      * - causClmCaus2Cd                 COBOL Name: CAUS-CLM-CAUS-2-CD
      * - d51uCausClmCauseCd3            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-3
      * - causClmCaus3Cd                 COBOL Name: CAUS-CLM-CAUS-3-CD
      * - d51uCausClmCauseCd4            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-4
      * - causClmCaus4Cd                 COBOL Name: CAUS-CLM-CAUS-4-CD
      * - d51uCausClmCauseCd5            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-5
      * - causClmCaus5Cd                 COBOL Name: CAUS-CLM-CAUS-5-CD
      * - d51uCausClmCauseCd6            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-6
      * - causClmCaus6Cd                 COBOL Name: CAUS-CLM-CAUS-6-CD
      * - d51uCausClmCauseCd7            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-7
      * - causClmCaus7Cd                 COBOL Name: CAUS-CLM-CAUS-7-CD
      * - d51uCausClmCauseCd8            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-8
      * - causClmCaus8Cd                 COBOL Name: CAUS-CLM-CAUS-8-CD
      * - causFoundSw                    COBOL Name: CAUS-FOUND-SW
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      @Override
      public SelectCauseTableOutCtx selectCauseTable(SelectCauseTableInCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81 2650-Select-cause-table section.                             *
// *81                                                              *
// *81 business function:                                           *
// *81 select / validate columns the fe spi tables                  *
// *81***************************************************************
// *82***************************************************************
// *82 2650-select-cause-table section                              *
// *82                                                              *
// *82 1.select from this table:                                    *
// *82                - fe_spi_rule_caus                            *
// *82                                                              *
// *82 called by : 1.                                               *
// *82 call      :                                                  *
// *82                                                              *
// *82***************************************************************
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
SelectCauseTableOutCtx methodOut = methodIn.getSelectCauseTableOutCtx();
//  cobolCode::SELECT CLM_CAUS_1_CD , CLM_CAUS_2_CD , CLM_CAUS_3_CD , CLM_CAUS_4_CD , CLM_CAUS_5_CD , CLM_CAUS_6_CD , CLM_CAUS_7_CD , CLM_CAUS_8_CD FROM FE_SPI_RULE_CAUS WHERE SPI_TBL_ID = ? AND STS_CD = 'A' AND DERIV_PL_OF_SVC_CD = ? AND DERIV_SVC_CD = ? AND DERIV_CAUS_CD = ? FETCH FIRST 1 ROW ONLY
          d529351uRepository.selectFeSpiRuleCaus(methodOut.getDclfeSpiRuleCaus(),programCtx.getSqlca());
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::ADD 1 TO CAUS-SUB
              methodOut.setCausSub(methodOut.getCausSub()+1);
//  cobolCode::MOVE CAUS-SUB TO D51U-CAUS-CNT
              methodOut.setD51uCausCnt(methodOut.getCausSub());
//  cobolCode::MOVE CAUS-DERIV-PL-OF-SVC-CD TO D51U-CAUS-DRV-POS ( CAUS-SUB )
              methodOut.setD51uCausDrvPos(methodOut.getCausSub() - 1,methodOut.getCausDerivPlOfSvcCd());
//  cobolCode::MOVE CAUS-DERIV-SVC-CD TO D51U-CAUS-DRV-SVC ( CAUS-SUB )
              methodOut.setD51uCausDrvSvc(methodOut.getCausSub() - 1,methodOut.getCausDerivSvcCd());
//  cobolCode::MOVE CAUS-DERIV-CAUS-CD TO D51U-CAUS-DRV-CAU ( CAUS-SUB )
              methodOut.setD51uCausDrvCau(methodOut.getCausSub() - 1,methodOut.getCausDerivCausCd());
//  cobolCode::MOVE CAUS-CLM-CAUS-1-CD TO D51U-CAUS-CLM-CAUSE-CD-1 ( CAUS-SUB )
              methodOut.setD51uCausClmCauseCd1(methodOut.getCausSub() - 1,methodOut.getCausClmCaus1Cd());
//  cobolCode::MOVE CAUS-CLM-CAUS-2-CD TO D51U-CAUS-CLM-CAUSE-CD-2 ( CAUS-SUB )
              methodOut.setD51uCausClmCauseCd2(methodOut.getCausSub() - 1,methodOut.getCausClmCaus2Cd());
//  cobolCode::MOVE CAUS-CLM-CAUS-3-CD TO D51U-CAUS-CLM-CAUSE-CD-3 ( CAUS-SUB )
              methodOut.setD51uCausClmCauseCd3(methodOut.getCausSub() - 1,methodOut.getCausClmCaus3Cd());
//  cobolCode::MOVE CAUS-CLM-CAUS-4-CD TO D51U-CAUS-CLM-CAUSE-CD-4 ( CAUS-SUB )
              methodOut.setD51uCausClmCauseCd4(methodOut.getCausSub() - 1,methodOut.getCausClmCaus4Cd());
//  cobolCode::MOVE CAUS-CLM-CAUS-5-CD TO D51U-CAUS-CLM-CAUSE-CD-5 ( CAUS-SUB )
              methodOut.setD51uCausClmCauseCd5(methodOut.getCausSub() - 1,methodOut.getCausClmCaus5Cd());
//  cobolCode::MOVE CAUS-CLM-CAUS-6-CD TO D51U-CAUS-CLM-CAUSE-CD-6 ( CAUS-SUB )
              methodOut.setD51uCausClmCauseCd6(methodOut.getCausSub() - 1,methodOut.getCausClmCaus6Cd());
//  cobolCode::MOVE CAUS-CLM-CAUS-7-CD TO D51U-CAUS-CLM-CAUSE-CD-7 ( CAUS-SUB )
              methodOut.setD51uCausClmCauseCd7(methodOut.getCausSub() - 1,methodOut.getCausClmCaus7Cd());
//  cobolCode::MOVE CAUS-CLM-CAUS-8-CD TO D51U-CAUS-CLM-CAUSE-CD-8 ( CAUS-SUB )
              methodOut.setD51uCausClmCauseCd8(methodOut.getCausSub() - 1,methodOut.getCausClmCaus8Cd());
//  cobolCode::SET CAUSECD-FOUND TO TRUE
              methodOut.setCausecdFoundTrue(); 
              
          break;
          	case +100:
//  cobolCode::SET CAUSECD-NOT-FOUND TO TRUE
              methodOut.setCausecdNotFoundTrue(); 
              
//  cobolCode::MOVE CAUS-SUB TO D51U-CAUS-CNT
              methodOut.setD51uCausCnt(methodOut.getCausSub());
          break;
          default :
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::SET D51U-DB2-ERROR TO TRUE
              methodOut.setD51uDb2ErrorTrue(); 
              
//  cobolCode::SET D51U-DB2-SELECT-ERROR TO TRUE
              methodOut.setD51uDb2SelectErrorTrue(); 
              
//  cobolCode::MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              methodOut.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(methodOut.getSqlcode_Ws()).toCharArray()));
//  cobolCode::MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              methodOut.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE '2650-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2650_MN_ = '2650-'
              methodOut.setD51uParagraphNum(CONSTANTS.LITERAL_2650_MN_);
//  cobolCode::SET CAUSECD-NOT-FOUND TO TRUE
              methodOut.setCausecdNotFoundTrue(); 
              
          }
      
      return methodOut;
      }
      /**
      * selectIpaTable 
      *   This method is derived from 
  *   COBOL Paragraph - 2750-SELECT-IPA-TABLE SECTION COBOL Cyclomatic complexity - 11
      * Input  :  

      * - ipaSub                         COBOL Name: IPA-SUB
      * - ripaClmIpa1Cd                  COBOL Name: RIPA-CLM-IPA-1-CD
      * - d51uIpaCnt                     COBOL Name: D51U-IPA-CNT
      * - ripaClmIpa2Cd                  COBOL Name: RIPA-CLM-IPA-2-CD
      * - ripaClmIpa3Cd                  COBOL Name: RIPA-CLM-IPA-3-CD
      * - ripaSpiTblId                   COBOL Name: RIPA-SPI-TBL-ID
      * - ripaDerivPlOfSvcCd             COBOL Name: RIPA-DERIV-PL-OF-SVC-CD
      * - ripaDerivSvcCd                 COBOL Name: RIPA-DERIV-SVC-CD
      * - ripaDerivCausCd                COBOL Name: RIPA-DERIV-CAUS-CD
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - ipaSub                         COBOL Name: IPA-SUB
      * - d51uRipaClmIpa1Cd              COBOL Name: D51U-RIPA-CLM-IPA-1-CD
      * - d51uIpaCnt                     COBOL Name: D51U-IPA-CNT
      * - ripaClmIpa1Cd                  COBOL Name: RIPA-CLM-IPA-1-CD
      * - d51uRipaClmIpa2Cd              COBOL Name: D51U-RIPA-CLM-IPA-2-CD
      * - ripaClmIpa2Cd                  COBOL Name: RIPA-CLM-IPA-2-CD
      * - d51uRipaClmIpa3Cd              COBOL Name: D51U-RIPA-CLM-IPA-3-CD
      * - ripaClmIpa3Cd                  COBOL Name: RIPA-CLM-IPA-3-CD
      * - d51uRipaSpiTblId               COBOL Name: D51U-RIPA-SPI-TBL-ID
      * - ripaSpiTblId                   COBOL Name: RIPA-SPI-TBL-ID
      * - d51uRipaDrvPos                 COBOL Name: D51U-RIPA-DRV-POS
      * - ripaDerivPlOfSvcCd             COBOL Name: RIPA-DERIV-PL-OF-SVC-CD
      * - d51uRipaDrvSvc                 COBOL Name: D51U-RIPA-DRV-SVC
      * - ripaDerivSvcCd                 COBOL Name: RIPA-DERIV-SVC-CD
      * - d51uRipaDrvCau                 COBOL Name: D51U-RIPA-DRV-CAU
      * - ripaDerivCausCd                COBOL Name: RIPA-DERIV-CAUS-CD
      * - ipaFoundSw                     COBOL Name: IPA-FOUND-SW
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      @Override
      public SelectIpaTableOutCtx selectIpaTable(SelectIpaTableInCtx methodIn) throws Exception {
      
// *82***************************************************************
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
SelectIpaTableOutCtx methodOut = methodIn.getSelectIpaTableOutCtx();
//  cobolCode::SELECT CLM_IPA_1_CD , CLM_IPA_2_CD , CLM_IPA_3_CD FROM FE_SPI_RULE_IPA WHERE SPI_TBL_ID = ? AND STS_CD = 'A' AND DERIV_PL_OF_SVC_CD = ? AND DERIV_SVC_CD = ? AND DERIV_CAUS_CD = ? FETCH FIRST 1 ROW ONLY
          d529351uRepository.selectFeSpiRuleIpa(methodOut.getDclfeSpiRuleIpa(),programCtx.getSqlca());
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::ADD 1 TO IPA-SUB
              methodOut.setIpaSub(methodOut.getIpaSub()+1);

// ***     Move ipa-sub to d51u-ipa-cnt
//  cobolCode::IF RIPA-CLM-IPA-1-CD = SPACES OR LOW-VALUES
              if (        ( allSpaces(methodOut.getRipaClmIpa1Cd())   ) || 			( checkLowValue(methodOut.getRipaClmIpa1Cd()) ) ) { 
//  cobolCode::MOVE ZEROES TO D51U-RIPA-CLM-IPA-1-CD ( IPA-SUB )
                  methodOut.setD51uRipaClmIpa1Cd(methodOut.getIpaSub() - 1,0);
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::ADD 1 TO D51U-IPA-CNT
                  methodOut.setD51uIpaCnt(methodOut.getD51uIpaCnt()+1);
//  cobolCode::MOVE RIPA-CLM-IPA-1-CD TO D51U-RIPA-CLM-IPA-1-CD ( IPA-SUB )
                  methodOut.setD51uRipaClmIpa1Cd(methodOut.getIpaSub() - 1,padLeftZeros(3,methodOut.getRipaClmIpa1Cd(),false));
              }
//  cobolCode::IF RIPA-CLM-IPA-2-CD = SPACES OR LOW-VALUES
              if (        ( allSpaces(methodOut.getRipaClmIpa2Cd())   ) || 			( checkLowValue(methodOut.getRipaClmIpa2Cd()) ) ) { 
//  cobolCode::MOVE ZEROES TO D51U-RIPA-CLM-IPA-2-CD ( IPA-SUB )
                  methodOut.setD51uRipaClmIpa2Cd(methodOut.getIpaSub() - 1,0);
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::MOVE RIPA-CLM-IPA-2-CD TO D51U-RIPA-CLM-IPA-2-CD ( IPA-SUB )
                  methodOut.setD51uRipaClmIpa2Cd(methodOut.getIpaSub() - 1,padLeftZeros(3,methodOut.getRipaClmIpa2Cd(),false));
              }
//  cobolCode::IF RIPA-CLM-IPA-3-CD = SPACES OR LOW-VALUES
              if (        ( allSpaces(methodOut.getRipaClmIpa3Cd())   ) || 			( checkLowValue(methodOut.getRipaClmIpa3Cd()) ) ) { 
//  cobolCode::MOVE ZEROES TO D51U-RIPA-CLM-IPA-3-CD ( IPA-SUB )
                  methodOut.setD51uRipaClmIpa3Cd(methodOut.getIpaSub() - 1,0);
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::MOVE RIPA-CLM-IPA-3-CD TO D51U-RIPA-CLM-IPA-3-CD ( IPA-SUB )
                  methodOut.setD51uRipaClmIpa3Cd(methodOut.getIpaSub() - 1,padLeftZeros(3,methodOut.getRipaClmIpa3Cd(),false));
              }
//  cobolCode::MOVE RIPA-SPI-TBL-ID TO D51U-RIPA-SPI-TBL-ID ( IPA-SUB )
              methodOut.setD51uRipaSpiTblId(methodOut.getIpaSub() - 1,methodOut.getRipaSpiTblId());
//  cobolCode::MOVE RIPA-DERIV-PL-OF-SVC-CD TO D51U-RIPA-DRV-POS ( IPA-SUB )
              methodOut.setD51uRipaDrvPos(methodOut.getIpaSub() - 1,methodOut.getRipaDerivPlOfSvcCd());
//  cobolCode::MOVE RIPA-DERIV-SVC-CD TO D51U-RIPA-DRV-SVC ( IPA-SUB )
              methodOut.setD51uRipaDrvSvc(methodOut.getIpaSub() - 1,methodOut.getRipaDerivSvcCd());
//  cobolCode::MOVE RIPA-DERIV-CAUS-CD TO D51U-RIPA-DRV-CAU ( IPA-SUB )
              methodOut.setD51uRipaDrvCau(methodOut.getIpaSub() - 1,methodOut.getRipaDerivCausCd());
//  cobolCode::SET IPA-FOUND TO TRUE
              methodOut.setIpaFoundTrue(); 
              
          break;
          	case +100:
//  cobolCode::SET IPA-NOT-FOUND TO TRUE
              methodOut.setIpaNotFoundTrue(); 
              

// ***     Move ipa-sub to d51u-ipa-cnt
//  cobolCode::MOVE IPA-SUB TO D51U-IPA-CNT
              methodOut.setD51uIpaCnt(methodOut.getIpaSub());
          break;
          default :
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::SET D51U-DB2-ERROR TO TRUE
              methodOut.setD51uDb2ErrorTrue(); 
              
//  cobolCode::SET D51U-DB2-SELECT-ERROR TO TRUE
              methodOut.setD51uDb2SelectErrorTrue(); 
              
//  cobolCode::MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              methodOut.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(methodOut.getSqlcode_Ws()).toCharArray()));
//  cobolCode::MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              methodOut.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE '2750-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2750_MN_ = '2750-'
              methodOut.setD51uParagraphNum(CONSTANTS.LITERAL_2750_MN_);
//  cobolCode::SET IPA-NOT-FOUND TO TRUE
              methodOut.setIpaNotFoundTrue(); 
              
          }
      
      return methodOut;
      }
      /**
      * openSvcMainCsr 
      *   This method is derived from 
  *   COBOL Paragraph - 2218-OPEN-SVC-MAIN-CSR SECTION COBOL Cyclomatic complexity - 7
      * Input  :  

      * - fetchEndMain                   COBOL Name: WS-FETCH-END-MAIN
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - mainCtr                        COBOL Name: WS-MAIN-CTR
      * - dsmLogArea                     COBOL Name: DSM-LOG-AREA
      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - dsmErrTblName                  COBOL Name: DSM-ERR-TBL-NAME
      * - dsmErrTblAction                COBOL Name: DSM-ERR-TBL-ACTION
      * - dsmErrSectnName                COBOL Name: DSM-ERR-SECTN-NAME
      * - dsmErrPgmName                  COBOL Name: DSM-ERR-PGM-NAME
      * - dsmSqlcode                     COBOL Name: DSM-SQLCODE
      *
      * @throws CFException
      */
      @Override
      public OpenSvcMainCsrOutCtx openSvcMainCsr(OpenSvcMainCsrInCtx methodIn) throws Exception {
      
// *
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
OpenSvcMainCsrOutCtx methodOut = methodIn.getOpenSvcMainCsrOutCtx();
//  cobolCode::SELECT DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , POS_IND || SVC_IND || PROV_IND || CAUS_IND || IPA_IND || GTN_IND || ICD_IND || CPE_DESC_IND FROM FE_SPI_DENORM WHERE SPI_TBL_ID = ? FOR FETCH ONLY WITH UR
          programCtx.setSvcMainCsrResultSet(d529351uRepository.openSvcMainCsrD529351u(methodIn.getDclfeSpiRuleFrToSvc(),programCtx.getSqlca()));
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:

// *           Initialize  ws-main-ctr
//  cobolCode::MOVE +0 TO WS-MAIN-CTR
              methodOut.setMainCtr(0);
//  cobolCode::PERFORM 2318-FETCH-SVC-MAIN-CSR THRU 2318-EXIT UNTIL END-OF-FETCH-MAIN OR WS-MAIN-CTR > +99
              while (!(methodIn.isEndOfFetchMain())  && 	( methodOut.getMainCtr() <= 99 )) {
                 fetchSvcMainCsr(programCtx.getFetchSvcMainCsrInCtx());/*2318-FETCH-SVC-MAIN-CSR SECTION*/
              }
          break;
          	case +100:
          break;
          default :
//  cobolCode::INITIALIZE DSM-LOG-AREA
              methodOut.getDsmLogArea().initialize();
//  cobolCode::SET DSM-DB2-ERROR TO TRUE
              methodOut.setDsmDb2ErrorTrue(); 
              
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::MOVE 'OPEN-SVC-CSR' TO DSM-ERR-TBL-NAME
              methodOut.setDsmErrTblName(CONSTANTS.LITERAL_OPEN_MN2_SVCCSR_B13_);
//  cobolCode::MOVE 'OPEN SVC-MAIN-CSR' TO DSM-ERR-TBL-ACTION
//  LITERAL_OPEN_B_SVC_MN2_MAINCSR = 'OPEN SVC-MAIN-CSR'
              methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_OPEN_B_SVC_MN2_MAINCSR);
//  cobolCode::MOVE '2218-OPEN-SVC-MAIN-CSR' TO DSM-ERR-SECTN-NAME
              methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_2038928312);
//  cobolCode::MOVE 'D529351U' TO DSM-ERR-PGM-NAME
//  LITERAL_D529351U = 'D529351U'
              methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE WS-SQLCODE TO DSM-SQLCODE
              methodOut.setDsmSqlcode( methodOut.getSqlcode_Ws());
          }
      
      return methodOut;
      }
      /**
      * fetchSvcMainCsr 
      *   This method is derived from 
  *   COBOL Paragraph - 2318-FETCH-SVC-MAIN-CSR SECTION COBOL Cyclomatic complexity - 8
      * Input  :  

      * - sqlerrd                        COBOL Name: SQLERRD
      * - sqlcode                        COBOL Name: SQLCODE
      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      *
      * Output :  

      * - dsnnrows                       COBOL Name: DSNNROWS
      * - hv04Index                      COBOL Name: HV04-INDEX
      * - hv05Index                      COBOL Name: HV05-INDEX
      * - hv06Index                      COBOL Name: HV06-INDEX
      * - hv07Index                      COBOL Name: HV07-INDEX
      * - fetchEndMain                   COBOL Name: WS-FETCH-END-MAIN
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - dsmLogArea                     COBOL Name: DSM-LOG-AREA
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - dsmErrTblName                  COBOL Name: DSM-ERR-TBL-NAME
      * - dsmErrTblAction                COBOL Name: DSM-ERR-TBL-ACTION
      * - dsmErrSectnName                COBOL Name: DSM-ERR-SECTN-NAME
      * - dsmErrPgmName                  COBOL Name: DSM-ERR-PGM-NAME
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      *
      * @throws CFException
      */
      @Override
      public FetchSvcMainCsrOutCtx fetchSvcMainCsr(FetchSvcMainCsrInCtx methodIn) throws Exception {
      
// *
// FETCH NEXT ROWSET FROM SVC-MAIN-CSR FOR 100 ROWS INTO  ?    ,    ?    ,    ?    ,    ? 
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
FetchSvcMainCsrOutCtx methodOut = methodIn.getFetchSvcMainCsrOutCtx();
//  cobolCode::MOVE 100 TO DSNNROWS
          methodOut.setDsnnrows(100);
//  cobolCode::FETCH NEXT ROWSET FROM SVC-MAIN-CSR FOR 100 ROWS INTO ? , ? , ? , ?
          d529351uRepository.fetchSvcMainCsrD529351u(programCtx.getSvcMainCsrResultSet(),methodOut.getHvHostVariablesSvcmain(),programCtx.getSqlca());

// *
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::SET HV04-INDEX TO +1
              methodOut.setHv04Index(1); 
              
//  cobolCode::SET HV05-INDEX TO +1
              methodOut.setHv05Index(1); 
              
//  cobolCode::SET HV06-INDEX TO +1
              methodOut.setHv06Index(1); 
              
//  cobolCode::SET HV07-INDEX TO +1
              methodOut.setHv07Index(1); 
              
//  cobolCode::PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < methodIn.getSqlerrd(2);index1++) {
//  cobolCode::PERFORM 2418-MOVE-SVC-MAIN-CSR THRU 2418-EXIT
                  moveSvcMainCsr(programCtx);/*2418-MOVE-SVC-MAIN-CSR SECTION*/
//  cobolCode::SET HV04-INDEX UP BY +1
                  methodOut.setHv04Index(methodOut.getHv04Index() + 1); 
                  
//  cobolCode::SET HV05-INDEX UP BY +1
                  methodOut.setHv05Index(methodOut.getHv05Index() + 1); 
                  
//  cobolCode::SET HV06-INDEX UP BY +1
                  methodOut.setHv06Index(methodOut.getHv06Index() + 1); 
                  
//  cobolCode::SET HV07-INDEX UP BY +1
                  methodOut.setHv07Index(methodOut.getHv07Index() + 1); 
                  
              }
          break;
          	case +100:
//  cobolCode::SET HV04-INDEX TO +1
              methodOut.setHv04Index(1); 
              
//  cobolCode::SET HV05-INDEX TO +1
              methodOut.setHv05Index(1); 
              
//  cobolCode::SET HV06-INDEX TO +1
              methodOut.setHv06Index(1); 
              
//  cobolCode::SET HV07-INDEX TO +1
              methodOut.setHv07Index(1); 
              
//  cobolCode::PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < methodIn.getSqlerrd(2);index1++) {
//  cobolCode::PERFORM 2418-MOVE-SVC-MAIN-CSR THRU 2418-EXIT
                  moveSvcMainCsr(programCtx);/*2418-MOVE-SVC-MAIN-CSR SECTION*/
//  cobolCode::SET HV04-INDEX UP BY +1
                  methodOut.setHv04Index(methodOut.getHv04Index() + 1); 
                  
//  cobolCode::SET HV05-INDEX UP BY +1
                  methodOut.setHv05Index(methodOut.getHv05Index() + 1); 
                  
//  cobolCode::SET HV06-INDEX UP BY +1
                  methodOut.setHv06Index(methodOut.getHv06Index() + 1); 
                  
//  cobolCode::SET HV07-INDEX UP BY +1
                  methodOut.setHv07Index(methodOut.getHv07Index() + 1); 
                  
              }
//  cobolCode::SET END-OF-FETCH-MAIN TO TRUE
              methodOut.setEndOfFetchMainTrue(); 
              
//  cobolCode::PERFORM 2518-CLOSE-SVC-MAIN-CSR THRU 2518-EXIT
              closeSvcMainCsr(programCtx.getCloseSvcMainCsrInCtx());/*2518-CLOSE-SVC-MAIN-CSR SECTION*/
          break;
          default :
//  cobolCode::SET END-OF-FETCH-MAIN TO TRUE
              methodOut.setEndOfFetchMainTrue(); 
              
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::PERFORM 2518-CLOSE-SVC-MAIN-CSR THRU 2518-EXIT
              closeSvcMainCsr(programCtx.getCloseSvcMainCsrInCtx());/*2518-CLOSE-SVC-MAIN-CSR SECTION*/
//  cobolCode::IF CLOSE-CSR-NG
              if ( methodIn.isCloseCsrNg()  ) { 
//  cobolCode::INITIALIZE DSM-LOG-AREA
                  methodOut.getDsmLogArea().initialize();
//  cobolCode::SET D51U-DB2-ERROR TO TRUE
                  methodOut.setD51uDb2ErrorTrue(); 
                  
//  cobolCode::SET D51U-DB2-CLOSE-ERROR TO TRUE
                  methodOut.setD51uDb2CloseErrorTrue(); 
                  
//  cobolCode::SET DSM-DB2-ERROR TO TRUE
                  methodOut.setDsmDb2ErrorTrue(); 
                  
//  cobolCode::MOVE 'SVC-MAIN-CSR' TO DSM-ERR-TBL-NAME
                  methodOut.setDsmErrTblName(CONSTANTS.LITERAL_SVC_MN2_MAINCSR_B13_);
//  cobolCode::MOVE 'FETCH SVC-MAIN-CSR' TO DSM-ERR-TBL-ACTION
//  LITERAL_FETCH_B_SVC_MN2_MAINCSR = 'FETCH SVC-MAIN-CSR'
                  methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B_SVC_MN2_MAINCSR);
//  cobolCode::MOVE '2318-FETCH-SVC-MAIN-CSR' TO DSM-ERR-SECTN-NAME
                  methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_774437619);
//  cobolCode::MOVE 'D529351U' TO DSM-ERR-PGM-NAME
//  LITERAL_D529351U = 'D529351U'
                  methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
                  methodOut.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(methodOut.getSqlcode_Ws()).toCharArray()));
//cobolCode::GO TO 2318-EXIT
return methodOut;
//cobolCodeEnds::GO TO 2318-EXIT
              }
          }
      
      return methodOut;
      }
      /**
      * moveSvcMainCsr 
      *   This method is derived from 
  *   COBOL Paragraph - 2418-MOVE-SVC-MAIN-CSR SECTION COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void moveSvcMainCsr(D529351uCtx programCtx) throws Exception {
      
// *

// *    Add +1  to ws-main-ctr.

// *    Perform 2250-open-csfrto-cursor thru 2250-exit.
// *    perform 2350-open-csptyp-cursor thru 2350-exit.
// *    perform 2450-open-csicd-cursor  thru 2450-exit.
// *    perform 2550-open-csfcnd-cursor thru 2550-exit.
//  cobolCode::PERFORM 2618-MOVE-SVC-KEY-CSR THRU 2618-EXIT
          moveSvcKeyCsr(programCtx.getMoveSvcKeyCsrInCtx());/*2618-MOVE-SVC-KEY-CSR SECTION*/
      
      }
      /**
      * moveSvcKeyCsr 
      *   This method is derived from 
  *   COBOL Paragraph - 2618-MOVE-SVC-KEY-CSR SECTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - mainCtr                        COBOL Name: WS-MAIN-CTR
      * - hv04KeyDrvPos                  COBOL Name: HV04-KEY-DRV-POS
      * - hv05KeyDrvSvc                  COBOL Name: HV05-KEY-DRV-SVC
      * - hv06KeyDrvCau                  COBOL Name: HV06-KEY-DRV-CAU
      * - hv07RuleSw                     COBOL Name: HV07-RULE-SW
      *
      * Output :  

      * - mainCtr                        COBOL Name: WS-MAIN-CTR
      * - d51uRetDrvPos                  COBOL Name: D51U-RET-DRV-POS
      * - hv04KeyDrvPos                  COBOL Name: HV04-KEY-DRV-POS
      * - d51uRetDrvSvc                  COBOL Name: D51U-RET-DRV-SVC
      * - hv05KeyDrvSvc                  COBOL Name: HV05-KEY-DRV-SVC
      * - d51uRetDrvCau                  COBOL Name: D51U-RET-DRV-CAU
      * - hv06KeyDrvCau                  COBOL Name: HV06-KEY-DRV-CAU
      * - d51uRetRuleSw                  COBOL Name: D51U-RET-RULE-SW
      * - hv07RuleSw                     COBOL Name: HV07-RULE-SW
      *
      * @throws CFException
      */
      @Override
      public MoveSvcKeyCsrOutCtx moveSvcKeyCsr(MoveSvcKeyCsrInCtx methodIn) throws Exception {
      
// *
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
MoveSvcKeyCsrOutCtx methodOut = methodIn.getMoveSvcKeyCsrOutCtx();
//  cobolCode::IF WS-MAIN-CTR < +99
          if (	( methodOut.getMainCtr() < 99 )) { 
//  cobolCode::ADD +1 TO WS-MAIN-CTR
              methodOut.setMainCtr(methodOut.getMainCtr()+1);
//  cobolCode::MOVE HV04-KEY-DRV-POS ( HV04-INDEX ) TO D51U-RET-DRV-POS ( WS-MAIN-CTR )
              methodOut.setD51uRetDrvPos(methodOut.getMainCtr() - 1,methodOut.getHv04KeyDrvPos(methodIn.getHv04Index() - 1));
//  cobolCode::MOVE HV05-KEY-DRV-SVC ( HV05-INDEX ) TO D51U-RET-DRV-SVC ( WS-MAIN-CTR )
              methodOut.setD51uRetDrvSvc(methodOut.getMainCtr() - 1,methodOut.getHv05KeyDrvSvc(methodIn.getHv05Index() - 1));
//  cobolCode::MOVE HV06-KEY-DRV-CAU ( HV06-INDEX ) TO D51U-RET-DRV-CAU ( WS-MAIN-CTR )
              methodOut.setD51uRetDrvCau(methodOut.getMainCtr() - 1,methodOut.getHv06KeyDrvCau(methodIn.getHv06Index() - 1));
//  cobolCode::MOVE HV07-RULE-SW ( HV07-INDEX ) TO D51U-RET-RULE-SW ( WS-MAIN-CTR )
              methodOut.setD51uRetRuleSw(methodOut.getMainCtr() - 1,methodOut.getHv07RuleSw(methodIn.getHv07Index() - 1));
          }
      
      return methodOut;
      }
      /**
      * closeSvcMainCsr 
      *   This method is derived from 
  *   COBOL Paragraph - 2518-CLOSE-SVC-MAIN-CSR SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - dsmLogArea                     COBOL Name: DSM-LOG-AREA
      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - dsmErrTblName                  COBOL Name: DSM-ERR-TBL-NAME
      * - dsmErrTblAction                COBOL Name: DSM-ERR-TBL-ACTION
      * - dsmErrSectnName                COBOL Name: DSM-ERR-SECTN-NAME
      * - dsmErrPgmName                  COBOL Name: DSM-ERR-PGM-NAME
      * - dsmSqlcode                     COBOL Name: DSM-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public CloseSvcMainCsrOutCtx closeSvcMainCsr(CloseSvcMainCsrInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
CloseSvcMainCsrOutCtx methodOut = methodIn.getCloseSvcMainCsrOutCtx();
//  cobolCode::CLOSE SVC-MAIN-CSR
          d529351uRepository.closeSvcMainCsrD529351u(programCtx.getSvcMainCsrResultSet(),programCtx.getSqlca());
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::SET CLOSE-CSR-OK TO TRUE
              methodOut.setCloseCsrOkTrue(); 
              
          break;
          default :
//  cobolCode::SET CLOSE-CSR-NG TO TRUE
              methodOut.setCloseCsrNgTrue(); 
              
//  cobolCode::IF WS-SQLCODE = ZEROS
              if (	( methodIn.getSqlcode_Ws() == 0 )) { 
//  cobolCode::INITIALIZE DSM-LOG-AREA
                  methodOut.getDsmLogArea().initialize();
//  cobolCode::SET DSM-DB2-ERROR TO TRUE
                  methodOut.setDsmDb2ErrorTrue(); 
                  
//  cobolCode::MOVE 'SVC-MAIN-CSR' TO DSM-ERR-TBL-NAME
                  methodOut.setDsmErrTblName(CONSTANTS.LITERAL_SVC_MN2_MAINCSR_B13_);
//  cobolCode::MOVE 'CLOSE SVC-MAIN-CSR' TO DSM-ERR-TBL-ACTION
//  LITERAL_CLOSE_B_SVC_MN2_MAINCSR = 'CLOSE SVC-MAIN-CSR'
                  methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_CLOSE_B_SVC_MN2_MAINCSR);
//  cobolCode::MOVE '2518-CLOSE-SVC-MAIN-CSR' TO DSM-ERR-SECTN-NAME
                  methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1560171085);
//  cobolCode::MOVE 'D529351U' TO DSM-ERR-PGM-NAME
//  LITERAL_D529351U = 'D529351U'
                  methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE SQLCODE TO DSM-SQLCODE
                  methodOut.setDsmSqlcode( methodOut.getSqlcode());
              }
          }
      
      return methodOut;
      }
      /**
      * openCombCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 2351-OPEN-COMB-CURSOR SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - fetchEndComb                   COBOL Name: WS-FETCH-END-COMB
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      @Override
      public OpenCombCursorOutCtx openCombCursor(OpenCombCursorInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
OpenCombCursorOutCtx methodOut = methodIn.getOpenCombCursorOutCtx();
//  cobolCode::DECLARE COMB_CUR CURSOR WITH ROWSET POSITIONING FOR SELECT '1' REC_TYP_CD , DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , CLM_CAUS_1_CD , CLM_CAUS_2_CD , CLM_CAUS_3_CD , CLM_CAUS_4_CD , CLM_CAUS_5_CD , CLM_CAUS_6_CD , CLM_CAUS_7_CD , CLM_CAUS_8_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_1_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_2_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_3_CD , CHAR ( SPACE ( 2 ) ) PROV_TYP , CHAR ( SPACE ( 2 ) ) FROM_COND_POS , CHAR ( SPACE ( 4 ) ) GRP_TBL_1_NBR , CHAR ( SPACE ( 4 ) ) GRP_TBL_2_NBR , CHAR ( SPACE ( 4 ) ) GRP_TBL_3_NBR , CHAR ( SPACE ( 4 ) ) CPE_DESC_CD FROM FE_SPI_RULE_CAUS WHERE SPI_TBL_ID = ? AND STS_CD = 'A' AND ( CLM_CAUS_1_CD = ? OR CLM_CAUS_2_CD = ? OR CLM_CAUS_3_CD = ? OR CLM_CAUS_4_CD = ? OR CLM_CAUS_5_CD = ? OR CLM_CAUS_6_CD = ? OR CLM_CAUS_7_CD = ? OR CLM_CAUS_8_CD = ? ) UNION ALL SELECT '2' REC_TYP_CD , DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_1_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_2_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_3_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_4_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_5_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_6_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_7_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_8_CD , CLM_IPA_1_CD , CLM_IPA_2_CD , CLM_IPA_3_CD , CHAR ( SPACE ( 2 ) ) PROV_TYP , CHAR ( SPACE ( 2 ) ) FROM_COND_POS , GRP_TBL_1_NBR , GRP_TBL_2_NBR , GRP_TBL_3_NBR , CHAR ( SPACE ( 4 ) ) CPE_DESC_CD FROM FE_SPI_RULE_IPA WHERE SPI_TBL_ID = ? AND STS_CD = 'A' UNION ALL SELECT '3' REC_TYP_CD , DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_1_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_2_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_3_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_4_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_5_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_6_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_7_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_8_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_1_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_2_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_3_CD , PROV_TYP , CHAR ( SPACE ( 2 ) ) FROM_COND_POS , CHAR ( SPACE ( 4 ) ) GRP_TBL_1_NBR , CHAR ( SPACE ( 4 ) ) GRP_TBL_2_NBR , CHAR ( SPACE ( 4 ) ) GRP_TBL_3_NBR , CHAR ( SPACE ( 4 ) ) CPE_DESC_CD FROM FE_SPI_RULE_PROV_TYP WHERE SPI_TBL_ID = ? AND STS_CD = 'A' AND PROV_TYP = ? UNION ALL SELECT '4' REC_TYP_CD , DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_1_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_2_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_3_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_4_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_5_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_6_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_7_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_8_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_1_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_2_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_3_CD , CHAR ( SPACE ( 2 ) ) PROV_TYP , FROM_COND_POS , CHAR ( SPACE ( 4 ) ) GRP_TBL_1_NBR , CHAR ( SPACE ( 4 ) ) GRP_TBL_2_NBR , CHAR ( SPACE ( 4 ) ) GRP_TBL_3_NBR , CHAR ( SPACE ( 4 ) ) CPE_DESC_CD FROM FE_SPI_RULE_FR_COND_POS WHERE SPI_TBL_ID = ? AND STS_CD = 'A' AND FROM_COND_POS = ? UNION ALL SELECT '5' REC_TYP_CD , DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_1_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_2_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_3_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_4_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_5_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_6_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_7_CD , CHAR ( SPACE ( 1 ) ) CLM_CAUS_8_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_1_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_2_CD , CHAR ( SPACE ( 3 ) ) CLM_IPA_3_CD , CHAR ( SPACE ( 2 ) ) PROV_TYP , CHAR ( SPACE ( 2 ) ) FROM_COND_POS , CHAR ( SPACE ( 4 ) ) GRP_TBL_1_NBR , CHAR ( SPACE ( 4 ) ) GRP_TBL_2_NBR , CHAR ( SPACE ( 4 ) ) GRP_TBL_3_NBR , CPE_DESC_CD FROM FE_SPI_RULE_CPE_FLG WHERE SPI_TBL_ID = ? AND STS_CD = 'A' AND CPE_DESC_CD = ? FOR FETCH ONLY
          programCtx.setCombCurResultSet(d529351uRepository.openCombCurD529351u(methodIn.getDclfeSpiRuleFrCondPos(),methodIn.getDclfeSpiRuleCaus(),methodIn.getTestVariables(),methodIn.getDclfeSpiRuleIpa(),methodIn.getDclfeSpiRuleProvTyp(),programCtx.getSqlca(),methodIn.getDclfeSpiRuleCpeFlg()));
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::PERFORM 2352-FETCH-COMB THRU 2352-EXIT UNTIL END-OF-FETCH-COMB
              while (!(methodIn.isEndOfFetchComb()) ) {
                 fetchComb(programCtx.getFetchCombInCtx());/*2352-FETCH-COMB SECTION*/
              }
          break;
          default :
//  cobolCode::SET DSM-DB2-ERROR TO TRUE
              methodOut.setDsmDb2ErrorTrue(); 
              
//  cobolCode::SET D51U-DB2-ERROR TO TRUE
              methodOut.setD51uDb2ErrorTrue(); 
              
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::SET D51U-DB2-OPEN-ERROR TO TRUE
              methodOut.setD51uDb2OpenErrorTrue(); 
              
//  cobolCode::MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              methodOut.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(methodOut.getSqlcode_Ws()).toCharArray()));
//  cobolCode::MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              methodOut.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE '2351-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2351_MN_ = '2351-'
              methodOut.setD51uParagraphNum(CONSTANTS.LITERAL_2351_MN_);
          }
      
      return methodOut;
      }
      /**
      * fetchComb 
      *   This method is derived from 
  *   COBOL Paragraph - 2352-FETCH-COMB SECTION COBOL Cyclomatic complexity - 17
      * Input  :  

      * - sqlerrd                        COBOL Name: SQLERRD
      * - hv2aRecTypCd                   COBOL Name: HV2A-REC-TYP-CD
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsnnrows                       COBOL Name: DSNNROWS
      * - hv2bIndex                      COBOL Name: HV2B-INDEX
      * - hv2cIndex                      COBOL Name: HV2C-INDEX
      * - hv2dIndex                      COBOL Name: HV2D-INDEX
      * - hv2eIndex                      COBOL Name: HV2E-INDEX
      * - hv2fIndex                      COBOL Name: HV2F-INDEX
      * - hv2gIndex                      COBOL Name: HV2G-INDEX
      * - hv2hIndex                      COBOL Name: HV2H-INDEX
      * - hv2iIndex                      COBOL Name: HV2I-INDEX
      * - hv2jIndex                      COBOL Name: HV2J-INDEX
      * - hv2kIndex                      COBOL Name: HV2K-INDEX
      * - hv2lIndex                      COBOL Name: HV2L-INDEX
      * - hv2mIndex                      COBOL Name: HV2M-INDEX
      * - hv2nIndex                      COBOL Name: HV2N-INDEX
      * - hv2oIndex                      COBOL Name: HV2O-INDEX
      * - hv2pIndex                      COBOL Name: HV2P-INDEX
      * - hv2qIndex                      COBOL Name: HV2Q-INDEX
      * - hv2aIndex                      COBOL Name: HV2A-INDEX
      * - hv2rIndex                      COBOL Name: HV2R-INDEX
      * - hv2sIndex                      COBOL Name: HV2S-INDEX
      * - hv2tIndex                      COBOL Name: HV2T-INDEX
      * - hv2uIndex                      COBOL Name: HV2U-INDEX
      * - fetchEndComb                   COBOL Name: WS-FETCH-END-COMB
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public FetchCombOutCtx fetchComb(FetchCombInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
FetchCombOutCtx methodOut = methodIn.getFetchCombOutCtx();
// FETCH NEXT ROWSET FROM COMB_CUR FOR 100 ROWS INTO  ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ?   ,    ? 
//  cobolCode::MOVE 100 TO DSNNROWS
          methodOut.setDsnnrows(100);
//  cobolCode::FETCH NEXT ROWSET FROM COMB_CUR FOR 100 ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
          d529351uRepository.fetchCombCurD529351u(programCtx.getCombCurResultSet(),methodOut.getHvHostVariablesCombcr(),programCtx.getSqlca());
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::SET HV2B-INDEX TO +1
              methodOut.setHv2bIndex(1); 
              
//  cobolCode::SET HV2C-INDEX TO +1
              methodOut.setHv2cIndex(1); 
              
//  cobolCode::SET HV2D-INDEX TO +1
              methodOut.setHv2dIndex(1); 
              
//  cobolCode::SET HV2E-INDEX TO +1
              methodOut.setHv2eIndex(1); 
              
//  cobolCode::SET HV2F-INDEX TO +1
              methodOut.setHv2fIndex(1); 
              
//  cobolCode::SET HV2G-INDEX TO +1
              methodOut.setHv2gIndex(1); 
              
//  cobolCode::SET HV2H-INDEX TO +1
              methodOut.setHv2hIndex(1); 
              
//  cobolCode::SET HV2I-INDEX TO +1
              methodOut.setHv2iIndex(1); 
              
//  cobolCode::SET HV2J-INDEX TO +1
              methodOut.setHv2jIndex(1); 
              
//  cobolCode::SET HV2K-INDEX TO +1
              methodOut.setHv2kIndex(1); 
              
//  cobolCode::SET HV2L-INDEX TO +1
              methodOut.setHv2lIndex(1); 
              
//  cobolCode::SET HV2M-INDEX TO +1
              methodOut.setHv2mIndex(1); 
              
//  cobolCode::SET HV2N-INDEX TO +1
              methodOut.setHv2nIndex(1); 
              
//  cobolCode::SET HV2O-INDEX TO +1
              methodOut.setHv2oIndex(1); 
              
//  cobolCode::SET HV2P-INDEX TO +1
              methodOut.setHv2pIndex(1); 
              
//  cobolCode::SET HV2Q-INDEX TO +1
              methodOut.setHv2qIndex(1); 
              
//  cobolCode::SET HV2A-INDEX TO +1
              methodOut.setHv2aIndex(1); 
              
//  cobolCode::SET HV2R-INDEX TO +1
              methodOut.setHv2rIndex(1); 
              
//  cobolCode::SET HV2S-INDEX TO +1
              methodOut.setHv2sIndex(1); 
              
//  cobolCode::SET HV2T-INDEX TO +1
              methodOut.setHv2tIndex(1); 
              
//  cobolCode::SET HV2U-INDEX TO +1
              methodOut.setHv2uIndex(1); 
              
//  cobolCode::PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < methodIn.getSqlerrd(2);index1++) {
//  cobolCode::IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '1'
                  if (methodIn.getHv2aRecTypCd(methodOut.getHv2aIndex() - 1)[0] == '1') { 
//  cobolCode::PERFORM 2653-MOVE-CAUSE-TABLE THRU 2653-EXIT
                      moveCauseTable(programCtx.getMoveCauseTableInCtx());/*2653-MOVE-CAUSE-TABLE SECTION*/
                  }
//  cobolCode::ELSE
                  else { 
//  cobolCode::IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '2'
                      if (methodIn.getHv2aRecTypCd(methodOut.getHv2aIndex() - 1)[0] == '2') { 
//  cobolCode::PERFORM 2654-MOVE-IPA-TABLE THRU 2654-EXIT
                          moveIpaTable(programCtx.getMoveIpaTableInCtx());/*2654-MOVE-IPA-TABLE SECTION*/
                      }
//  cobolCode::ELSE
                      else { 
//  cobolCode::IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '3'
                          if (methodIn.getHv2aRecTypCd(methodOut.getHv2aIndex() - 1)[0] == '3') { 
//  cobolCode::PERFORM 2655-MOVE-CSPTYP THRU 2655-EXIT
                              moveCsptyp(programCtx.getMoveCsptypInCtx());/*2655-MOVE-CSPTYP SECTION*/
                          }
//  cobolCode::ELSE
                          else { 
//  cobolCode::IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '4'
                              if (methodIn.getHv2aRecTypCd(methodOut.getHv2aIndex() - 1)[0] == '4') { 
//  cobolCode::PERFORM 2656-MOVE-CSFCND THRU 2656-EXIT
                                  moveCsfcnd(programCtx.getMoveCsfcndInCtx());/*2656-MOVE-CSFCND SECTION*/
                              }
//  cobolCode::IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '5'
                              if (methodIn.getHv2aRecTypCd(methodOut.getHv2aIndex() - 1)[0] == '5') { 
//  cobolCode::PERFORM 2657-MOVE-CFLG-TABLE THRU 2657-EXIT
                                  moveCflgTable(programCtx.getMoveCflgTableInCtx());/*2657-MOVE-CFLG-TABLE SECTION*/
                              }
                          }
                      }
                  }
//  cobolCode::SET HV2B-INDEX UP BY +1
                  methodOut.setHv2bIndex(methodOut.getHv2bIndex() + 1); 
                  
//  cobolCode::SET HV2C-INDEX UP BY +1
                  methodOut.setHv2cIndex(methodOut.getHv2cIndex() + 1); 
                  
//  cobolCode::SET HV2D-INDEX UP BY +1
                  methodOut.setHv2dIndex(methodOut.getHv2dIndex() + 1); 
                  
//  cobolCode::SET HV2E-INDEX UP BY +1
                  methodOut.setHv2eIndex(methodOut.getHv2eIndex() + 1); 
                  
//  cobolCode::SET HV2F-INDEX UP BY +1
                  methodOut.setHv2fIndex(methodOut.getHv2fIndex() + 1); 
                  
//  cobolCode::SET HV2G-INDEX UP BY +1
                  methodOut.setHv2gIndex(methodOut.getHv2gIndex() + 1); 
                  
//  cobolCode::SET HV2H-INDEX UP BY +1
                  methodOut.setHv2hIndex(methodOut.getHv2hIndex() + 1); 
                  
//  cobolCode::SET HV2I-INDEX UP BY +1
                  methodOut.setHv2iIndex(methodOut.getHv2iIndex() + 1); 
                  
//  cobolCode::SET HV2J-INDEX UP BY +1
                  methodOut.setHv2jIndex(methodOut.getHv2jIndex() + 1); 
                  
//  cobolCode::SET HV2K-INDEX UP BY +1
                  methodOut.setHv2kIndex(methodOut.getHv2kIndex() + 1); 
                  
//  cobolCode::SET HV2L-INDEX UP BY +1
                  methodOut.setHv2lIndex(methodOut.getHv2lIndex() + 1); 
                  
//  cobolCode::SET HV2M-INDEX UP BY +1
                  methodOut.setHv2mIndex(methodOut.getHv2mIndex() + 1); 
                  
//  cobolCode::SET HV2N-INDEX UP BY +1
                  methodOut.setHv2nIndex(methodOut.getHv2nIndex() + 1); 
                  
//  cobolCode::SET HV2O-INDEX UP BY +1
                  methodOut.setHv2oIndex(methodOut.getHv2oIndex() + 1); 
                  
//  cobolCode::SET HV2P-INDEX UP BY +1
                  methodOut.setHv2pIndex(methodOut.getHv2pIndex() + 1); 
                  
//  cobolCode::SET HV2Q-INDEX UP BY +1
                  methodOut.setHv2qIndex(methodOut.getHv2qIndex() + 1); 
                  
//  cobolCode::SET HV2A-INDEX UP BY +1
                  methodOut.setHv2aIndex(methodOut.getHv2aIndex() + 1); 
                  
//  cobolCode::SET HV2R-INDEX UP BY +1
                  methodOut.setHv2rIndex(methodOut.getHv2rIndex() + 1); 
                  
//  cobolCode::SET HV2S-INDEX UP BY +1
                  methodOut.setHv2sIndex(methodOut.getHv2sIndex() + 1); 
                  
//  cobolCode::SET HV2T-INDEX UP BY +1
                  methodOut.setHv2tIndex(methodOut.getHv2tIndex() + 1); 
                  
//  cobolCode::SET HV2U-INDEX UP BY +1
                  methodOut.setHv2uIndex(methodOut.getHv2uIndex() + 1); 
                  
              }
          break;
          	case 100:
//  cobolCode::SET HV2B-INDEX TO +1
              methodOut.setHv2bIndex(1); 
              
//  cobolCode::SET HV2C-INDEX TO +1
              methodOut.setHv2cIndex(1); 
              
//  cobolCode::SET HV2D-INDEX TO +1
              methodOut.setHv2dIndex(1); 
              
//  cobolCode::SET HV2E-INDEX TO +1
              methodOut.setHv2eIndex(1); 
              
//  cobolCode::SET HV2F-INDEX TO +1
              methodOut.setHv2fIndex(1); 
              
//  cobolCode::SET HV2G-INDEX TO +1
              methodOut.setHv2gIndex(1); 
              
//  cobolCode::SET HV2H-INDEX TO +1
              methodOut.setHv2hIndex(1); 
              
//  cobolCode::SET HV2I-INDEX TO +1
              methodOut.setHv2iIndex(1); 
              
//  cobolCode::SET HV2J-INDEX TO +1
              methodOut.setHv2jIndex(1); 
              
//  cobolCode::SET HV2K-INDEX TO +1
              methodOut.setHv2kIndex(1); 
              
//  cobolCode::SET HV2L-INDEX TO +1
              methodOut.setHv2lIndex(1); 
              
//  cobolCode::SET HV2M-INDEX TO +1
              methodOut.setHv2mIndex(1); 
              
//  cobolCode::SET HV2N-INDEX TO +1
              methodOut.setHv2nIndex(1); 
              
//  cobolCode::SET HV2O-INDEX TO +1
              methodOut.setHv2oIndex(1); 
              
//  cobolCode::SET HV2P-INDEX TO +1
              methodOut.setHv2pIndex(1); 
              
//  cobolCode::SET HV2Q-INDEX TO +1
              methodOut.setHv2qIndex(1); 
              
//  cobolCode::SET HV2A-INDEX TO +1
              methodOut.setHv2aIndex(1); 
              
//  cobolCode::SET HV2R-INDEX TO +1
              methodOut.setHv2rIndex(1); 
              
//  cobolCode::SET HV2S-INDEX TO +1
              methodOut.setHv2sIndex(1); 
              
//  cobolCode::SET HV2T-INDEX TO +1
              methodOut.setHv2tIndex(1); 
              
//  cobolCode::SET HV2U-INDEX TO +1
              methodOut.setHv2uIndex(1); 
              
//  cobolCode::PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < methodIn.getSqlerrd(2);index1++) {
//  cobolCode::IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '1'
                  if (methodIn.getHv2aRecTypCd(methodOut.getHv2aIndex() - 1)[0] == '1') { 
//  cobolCode::PERFORM 2653-MOVE-CAUSE-TABLE THRU 2653-EXIT
                      moveCauseTable(programCtx.getMoveCauseTableInCtx());/*2653-MOVE-CAUSE-TABLE SECTION*/
                  }
//  cobolCode::ELSE
                  else { 
//  cobolCode::IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '2'
                      if (methodIn.getHv2aRecTypCd(methodOut.getHv2aIndex() - 1)[0] == '2') { 
//  cobolCode::PERFORM 2654-MOVE-IPA-TABLE THRU 2654-EXIT
                          moveIpaTable(programCtx.getMoveIpaTableInCtx());/*2654-MOVE-IPA-TABLE SECTION*/
                      }
//  cobolCode::ELSE
                      else { 
//  cobolCode::IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '3'
                          if (methodIn.getHv2aRecTypCd(methodOut.getHv2aIndex() - 1)[0] == '3') { 
//  cobolCode::PERFORM 2655-MOVE-CSPTYP THRU 2655-EXIT
                              moveCsptyp(programCtx.getMoveCsptypInCtx());/*2655-MOVE-CSPTYP SECTION*/
                          }
//  cobolCode::ELSE
                          else { 
//  cobolCode::IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '4'
                              if (methodIn.getHv2aRecTypCd(methodOut.getHv2aIndex() - 1)[0] == '4') { 
//  cobolCode::PERFORM 2656-MOVE-CSFCND THRU 2656-EXIT
                                  moveCsfcnd(programCtx.getMoveCsfcndInCtx());/*2656-MOVE-CSFCND SECTION*/
                              }
//  cobolCode::IF HV2A-REC-TYP-CD ( HV2A-INDEX ) = '5'
                              if (methodIn.getHv2aRecTypCd(methodOut.getHv2aIndex() - 1)[0] == '5') { 
//  cobolCode::PERFORM 2657-MOVE-CFLG-TABLE THRU 2657-EXIT
                                  moveCflgTable(programCtx.getMoveCflgTableInCtx());/*2657-MOVE-CFLG-TABLE SECTION*/
                              }
                          }
                      }
                  }
//  cobolCode::SET HV2B-INDEX UP BY +1
                  methodOut.setHv2bIndex(methodOut.getHv2bIndex() + 1); 
                  
//  cobolCode::SET HV2C-INDEX UP BY +1
                  methodOut.setHv2cIndex(methodOut.getHv2cIndex() + 1); 
                  
//  cobolCode::SET HV2D-INDEX UP BY +1
                  methodOut.setHv2dIndex(methodOut.getHv2dIndex() + 1); 
                  
//  cobolCode::SET HV2E-INDEX UP BY +1
                  methodOut.setHv2eIndex(methodOut.getHv2eIndex() + 1); 
                  
//  cobolCode::SET HV2F-INDEX UP BY +1
                  methodOut.setHv2fIndex(methodOut.getHv2fIndex() + 1); 
                  
//  cobolCode::SET HV2G-INDEX UP BY +1
                  methodOut.setHv2gIndex(methodOut.getHv2gIndex() + 1); 
                  
//  cobolCode::SET HV2H-INDEX UP BY +1
                  methodOut.setHv2hIndex(methodOut.getHv2hIndex() + 1); 
                  
//  cobolCode::SET HV2I-INDEX UP BY +1
                  methodOut.setHv2iIndex(methodOut.getHv2iIndex() + 1); 
                  
//  cobolCode::SET HV2J-INDEX UP BY +1
                  methodOut.setHv2jIndex(methodOut.getHv2jIndex() + 1); 
                  
//  cobolCode::SET HV2K-INDEX UP BY +1
                  methodOut.setHv2kIndex(methodOut.getHv2kIndex() + 1); 
                  
//  cobolCode::SET HV2L-INDEX UP BY +1
                  methodOut.setHv2lIndex(methodOut.getHv2lIndex() + 1); 
                  
//  cobolCode::SET HV2M-INDEX UP BY +1
                  methodOut.setHv2mIndex(methodOut.getHv2mIndex() + 1); 
                  
//  cobolCode::SET HV2N-INDEX UP BY +1
                  methodOut.setHv2nIndex(methodOut.getHv2nIndex() + 1); 
                  
//  cobolCode::SET HV2O-INDEX UP BY +1
                  methodOut.setHv2oIndex(methodOut.getHv2oIndex() + 1); 
                  
//  cobolCode::SET HV2P-INDEX UP BY +1
                  methodOut.setHv2pIndex(methodOut.getHv2pIndex() + 1); 
                  
//  cobolCode::SET HV2Q-INDEX UP BY +1
                  methodOut.setHv2qIndex(methodOut.getHv2qIndex() + 1); 
                  
//  cobolCode::SET HV2A-INDEX UP BY +1
                  methodOut.setHv2aIndex(methodOut.getHv2aIndex() + 1); 
                  
//  cobolCode::SET HV2R-INDEX UP BY +1
                  methodOut.setHv2rIndex(methodOut.getHv2rIndex() + 1); 
                  
//  cobolCode::SET HV2S-INDEX UP BY +1
                  methodOut.setHv2sIndex(methodOut.getHv2sIndex() + 1); 
                  
//  cobolCode::SET HV2T-INDEX UP BY +1
                  methodOut.setHv2tIndex(methodOut.getHv2tIndex() + 1); 
                  
//  cobolCode::SET HV2U-INDEX UP BY +1
                  methodOut.setHv2uIndex(methodOut.getHv2uIndex() + 1); 
                  
              }
//  cobolCode::SET END-OF-FETCH-COMB TO TRUE
              methodOut.setEndOfFetchCombTrue(); 
              
//  cobolCode::PERFORM 2353-CLOSE-COMB-CSR THRU 2353-EXIT
              closeCombCsr(programCtx.getCloseCombCsrInCtx());/*2353-CLOSE-COMB-CSR SECTION*/
          break;
          default :
//  cobolCode::SET END-OF-FETCH-COMB TO TRUE
              methodOut.setEndOfFetchCombTrue(); 
              
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::PERFORM 2353-CLOSE-COMB-CSR THRU 2353-EXIT
              closeCombCsr(programCtx.getCloseCombCsrInCtx());/*2353-CLOSE-COMB-CSR SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCombCsr 
      *   This method is derived from 
  *   COBOL Paragraph - 2353-CLOSE-COMB-CSR SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      @Override
      public CloseCombCsrOutCtx closeCombCsr(CloseCombCsrInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
CloseCombCsrOutCtx methodOut = methodIn.getCloseCombCsrOutCtx();
//  cobolCode::CLOSE COMB_CUR
          d529351uRepository.closeCombCurD529351u(programCtx.getCombCurResultSet(),programCtx.getSqlca());
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::SET CLOSE-CSR-OK TO TRUE
              methodOut.setCloseCsrOkTrue(); 
              
          break;
          default :
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::SET CLOSE-CSR-NG TO TRUE
              methodOut.setCloseCsrNgTrue(); 
              
//  cobolCode::SET D51U-DB2-ERROR TO TRUE
              methodOut.setD51uDb2ErrorTrue(); 
              
//  cobolCode::SET D51U-DB2-CLOSE-ERROR TO TRUE
              methodOut.setD51uDb2CloseErrorTrue(); 
              
//  cobolCode::MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              methodOut.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(methodOut.getSqlcode_Ws()).toCharArray()));
//  cobolCode::MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              methodOut.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE '2353-' TO D51U-PARAGRAPH-NUM
//  LITERAL_2353_MN_ = '2353-'
              methodOut.setD51uParagraphNum(CONSTANTS.LITERAL_2353_MN_);
          }
      
      return methodOut;
      }
      /**
      * moveCauseTable 
      *   This method is derived from 
  *   COBOL Paragraph - 2653-MOVE-CAUSE-TABLE SECTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - causSub                        COBOL Name: CAUS-SUB
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - hv2eClmCaus1Cd                 COBOL Name: HV2E-CLM-CAUS-1-CD
      * - hv2fClmCaus2Cd                 COBOL Name: HV2F-CLM-CAUS-2-CD
      * - hv2gClmCaus3Cd                 COBOL Name: HV2G-CLM-CAUS-3-CD
      * - hv2hClmCaus4Cd                 COBOL Name: HV2H-CLM-CAUS-4-CD
      * - hv2iClmCaus5Cd                 COBOL Name: HV2I-CLM-CAUS-5-CD
      * - hv2jClmCaus6Cd                 COBOL Name: HV2J-CLM-CAUS-6-CD
      * - hv2kClmCaus7Cd                 COBOL Name: HV2K-CLM-CAUS-7-CD
      * - hv2lClmCaus8Cd                 COBOL Name: HV2L-CLM-CAUS-8-CD
      *
      * Output :  

      * - causSub                        COBOL Name: CAUS-SUB
      * - d51uCausCnt                    COBOL Name: D51U-CAUS-CNT
      * - causFoundSw                    COBOL Name: CAUS-FOUND-SW
      * - d51uCausDrvPos                 COBOL Name: D51U-CAUS-DRV-POS
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - d51uCausDrvSvc                 COBOL Name: D51U-CAUS-DRV-SVC
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - d51uCausDrvCau                 COBOL Name: D51U-CAUS-DRV-CAU
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - d51uCausClmCauseCd1            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-1
      * - hv2eClmCaus1Cd                 COBOL Name: HV2E-CLM-CAUS-1-CD
      * - d51uCausClmCauseCd2            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-2
      * - hv2fClmCaus2Cd                 COBOL Name: HV2F-CLM-CAUS-2-CD
      * - d51uCausClmCauseCd3            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-3
      * - hv2gClmCaus3Cd                 COBOL Name: HV2G-CLM-CAUS-3-CD
      * - d51uCausClmCauseCd4            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-4
      * - hv2hClmCaus4Cd                 COBOL Name: HV2H-CLM-CAUS-4-CD
      * - d51uCausClmCauseCd5            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-5
      * - hv2iClmCaus5Cd                 COBOL Name: HV2I-CLM-CAUS-5-CD
      * - d51uCausClmCauseCd6            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-6
      * - hv2jClmCaus6Cd                 COBOL Name: HV2J-CLM-CAUS-6-CD
      * - d51uCausClmCauseCd7            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-7
      * - hv2kClmCaus7Cd                 COBOL Name: HV2K-CLM-CAUS-7-CD
      * - d51uCausClmCauseCd8            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-8
      * - hv2lClmCaus8Cd                 COBOL Name: HV2L-CLM-CAUS-8-CD
      *
      * @throws CFException
      */
      @Override
      public MoveCauseTableOutCtx moveCauseTable(MoveCauseTableInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
MoveCauseTableOutCtx methodOut = methodIn.getMoveCauseTableOutCtx();
//  cobolCode::IF CAUS-SUB < +99
          if (	( methodOut.getCausSub() < 99 )) { 
//  cobolCode::ADD 1 TO CAUS-SUB
              methodOut.setCausSub(methodOut.getCausSub()+1);
//  cobolCode::MOVE CAUS-SUB TO D51U-CAUS-CNT
              methodOut.setD51uCausCnt(methodOut.getCausSub());
//  cobolCode::SET CAUSECD-FOUND TO TRUE
              methodOut.setCausecdFoundTrue(); 
              
//  cobolCode::MOVE HV2B-DERIV-PL-OF-SVC-CD ( HV2B-INDEX ) TO D51U-CAUS-DRV-POS ( CAUS-SUB )
              methodOut.setD51uCausDrvPos(methodOut.getCausSub() - 1,methodOut.getHv2bDerivPlOfSvcCd(methodIn.getHv2bIndex() - 1));
//  cobolCode::MOVE HV2C-DERIV-SVC-CD ( HV2C-INDEX ) TO D51U-CAUS-DRV-SVC ( CAUS-SUB )
              methodOut.setD51uCausDrvSvc(methodOut.getCausSub() - 1,methodOut.getHv2cDerivSvcCd(methodIn.getHv2cIndex() - 1));
//  cobolCode::MOVE HV2D-DERIV-CAUS-CD ( HV2D-INDEX ) TO D51U-CAUS-DRV-CAU ( CAUS-SUB )
              methodOut.setD51uCausDrvCau(methodOut.getCausSub() - 1,methodOut.getHv2dDerivCausCd(methodIn.getHv2dIndex() - 1));
//  cobolCode::MOVE HV2E-CLM-CAUS-1-CD ( HV2E-INDEX ) TO D51U-CAUS-CLM-CAUSE-CD-1 ( CAUS-SUB )
              methodOut.setD51uCausClmCauseCd1(methodOut.getCausSub() - 1,methodOut.getHv2eClmCaus1Cd(methodIn.getHv2eIndex() - 1));
//  cobolCode::MOVE HV2F-CLM-CAUS-2-CD ( HV2F-INDEX ) TO D51U-CAUS-CLM-CAUSE-CD-2 ( CAUS-SUB )
              methodOut.setD51uCausClmCauseCd2(methodOut.getCausSub() - 1,methodOut.getHv2fClmCaus2Cd(methodIn.getHv2fIndex() - 1));
//  cobolCode::MOVE HV2G-CLM-CAUS-3-CD ( HV2G-INDEX ) TO D51U-CAUS-CLM-CAUSE-CD-3 ( CAUS-SUB )
              methodOut.setD51uCausClmCauseCd3(methodOut.getCausSub() - 1,methodOut.getHv2gClmCaus3Cd(methodIn.getHv2gIndex() - 1));
//  cobolCode::MOVE HV2H-CLM-CAUS-4-CD ( HV2H-INDEX ) TO D51U-CAUS-CLM-CAUSE-CD-4 ( CAUS-SUB )
              methodOut.setD51uCausClmCauseCd4(methodOut.getCausSub() - 1,methodOut.getHv2hClmCaus4Cd(methodIn.getHv2hIndex() - 1));
//  cobolCode::MOVE HV2I-CLM-CAUS-5-CD ( HV2I-INDEX ) TO D51U-CAUS-CLM-CAUSE-CD-5 ( CAUS-SUB )
              methodOut.setD51uCausClmCauseCd5(methodOut.getCausSub() - 1,methodOut.getHv2iClmCaus5Cd(methodIn.getHv2iIndex() - 1));
//  cobolCode::MOVE HV2J-CLM-CAUS-6-CD ( HV2J-INDEX ) TO D51U-CAUS-CLM-CAUSE-CD-6 ( CAUS-SUB )
              methodOut.setD51uCausClmCauseCd6(methodOut.getCausSub() - 1,methodOut.getHv2jClmCaus6Cd(methodIn.getHv2jIndex() - 1));
//  cobolCode::MOVE HV2K-CLM-CAUS-7-CD ( HV2K-INDEX ) TO D51U-CAUS-CLM-CAUSE-CD-7 ( CAUS-SUB )
              methodOut.setD51uCausClmCauseCd7(methodOut.getCausSub() - 1,methodOut.getHv2kClmCaus7Cd(methodIn.getHv2kIndex() - 1));
//  cobolCode::MOVE HV2L-CLM-CAUS-8-CD ( HV2L-INDEX ) TO D51U-CAUS-CLM-CAUSE-CD-8 ( CAUS-SUB )
              methodOut.setD51uCausClmCauseCd8(methodOut.getCausSub() - 1,methodOut.getHv2lClmCaus8Cd(methodIn.getHv2lIndex() - 1));
          }
      
      return methodOut;
      }
      /**
      * moveIpaTable 
      *   This method is derived from 
  *   COBOL Paragraph - 2654-MOVE-IPA-TABLE SECTION COBOL Cyclomatic complexity - 20
      * Input  :  

      * - ipaSub                         COBOL Name: IPA-SUB
      * - ripaSpiTblId                   COBOL Name: RIPA-SPI-TBL-ID
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - hv2mClmIpa1Cd                  COBOL Name: HV2M-CLM-IPA-1-CD
      * - hv2mIndex                      COBOL Name: HV2M-INDEX
      * - d51uIpaCnt                     COBOL Name: D51U-IPA-CNT
      * - hv2nClmIpa2Cd                  COBOL Name: HV2N-CLM-IPA-2-CD
      * - hv2nIndex                      COBOL Name: HV2N-INDEX
      * - hv2oClmIpa3Cd                  COBOL Name: HV2O-CLM-IPA-3-CD
      * - hv2oIndex                      COBOL Name: HV2O-INDEX
      * - hv2rGrpTbl1Nbr                 COBOL Name: HV2R-GRP-TBL-1-NBR
      * - hv2rIndex                      COBOL Name: HV2R-INDEX
      * - hv2sGrpTbl2Nbr                 COBOL Name: HV2S-GRP-TBL-2-NBR
      * - hv2sIndex                      COBOL Name: HV2S-INDEX
      * - hv2tGrpTbl3Nbr                 COBOL Name: HV2T-GRP-TBL-3-NBR
      * - hv2tIndex                      COBOL Name: HV2T-INDEX
      *
      * Output :  

      * - ipaSub                         COBOL Name: IPA-SUB
      * - ipaFoundSw                     COBOL Name: IPA-FOUND-SW
      * - d51uRipaSpiTblId               COBOL Name: D51U-RIPA-SPI-TBL-ID
      * - ripaSpiTblId                   COBOL Name: RIPA-SPI-TBL-ID
      * - d51uRipaDrvPos                 COBOL Name: D51U-RIPA-DRV-POS
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - d51uRipaDrvSvc                 COBOL Name: D51U-RIPA-DRV-SVC
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - d51uRipaDrvCau                 COBOL Name: D51U-RIPA-DRV-CAU
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - d51uRipaClmIpa1Cd              COBOL Name: D51U-RIPA-CLM-IPA-1-CD
      * - d51uIpaCnt                     COBOL Name: D51U-IPA-CNT
      * - hv2mClmIpa1Cd                  COBOL Name: HV2M-CLM-IPA-1-CD
      * - d51uRipaClmIpa2Cd              COBOL Name: D51U-RIPA-CLM-IPA-2-CD
      * - hv2nClmIpa2Cd                  COBOL Name: HV2N-CLM-IPA-2-CD
      * - d51uRipaClmIpa3Cd              COBOL Name: D51U-RIPA-CLM-IPA-3-CD
      * - hv2oClmIpa3Cd                  COBOL Name: HV2O-CLM-IPA-3-CD
      * - d51uRipaGrpTbl1Nbr             COBOL Name: D51U-RIPA-GRP-TBL-1-NBR
      * - hv2rGrpTbl1Nbr                 COBOL Name: HV2R-GRP-TBL-1-NBR
      * - d51uRipaGrpTbl2Nbr             COBOL Name: D51U-RIPA-GRP-TBL-2-NBR
      * - hv2sGrpTbl2Nbr                 COBOL Name: HV2S-GRP-TBL-2-NBR
      * - d51uRipaGrpTbl3Nbr             COBOL Name: D51U-RIPA-GRP-TBL-3-NBR
      * - hv2tGrpTbl3Nbr                 COBOL Name: HV2T-GRP-TBL-3-NBR
      *
      * @throws CFException
      */
      @Override
      public MoveIpaTableOutCtx moveIpaTable(MoveIpaTableInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
MoveIpaTableOutCtx methodOut = methodIn.getMoveIpaTableOutCtx();
//  cobolCode::IF IPA-SUB < +99
          if (	( methodOut.getIpaSub() < 99 )) { 
//  cobolCode::ADD 1 TO IPA-SUB
              methodOut.setIpaSub(methodOut.getIpaSub()+1);
//  cobolCode::SET IPA-FOUND TO TRUE
              methodOut.setIpaFoundTrue(); 
              
//  cobolCode::MOVE RIPA-SPI-TBL-ID TO D51U-RIPA-SPI-TBL-ID ( IPA-SUB )
              methodOut.setD51uRipaSpiTblId(methodOut.getIpaSub() - 1,methodOut.getRipaSpiTblId());
//  cobolCode::MOVE HV2B-DERIV-PL-OF-SVC-CD ( HV2B-INDEX ) TO D51U-RIPA-DRV-POS ( IPA-SUB )
              methodOut.setD51uRipaDrvPos(methodOut.getIpaSub() - 1,methodOut.getHv2bDerivPlOfSvcCd(methodIn.getHv2bIndex() - 1));
//  cobolCode::MOVE HV2C-DERIV-SVC-CD ( HV2C-INDEX ) TO D51U-RIPA-DRV-SVC ( IPA-SUB )
              methodOut.setD51uRipaDrvSvc(methodOut.getIpaSub() - 1,methodOut.getHv2cDerivSvcCd(methodIn.getHv2cIndex() - 1));
//  cobolCode::MOVE HV2D-DERIV-CAUS-CD ( HV2D-INDEX ) TO D51U-RIPA-DRV-CAU ( IPA-SUB )
              methodOut.setD51uRipaDrvCau(methodOut.getIpaSub() - 1,methodOut.getHv2dDerivCausCd(methodIn.getHv2dIndex() - 1));
//  cobolCode::IF HV2M-CLM-IPA-1-CD ( HV2M-INDEX ) = SPACES OR LOW-VALUES OR HIGH-VALUES
              if (        ( allSpaces(methodOut.getHv2mClmIpa1Cd(methodIn.getHv2mIndex() - 1))   ) || 			( checkLowValue(methodOut.getHv2mClmIpa1Cd(methodIn.getHv2mIndex() - 1)) )  || ( isHighValue(methodOut.getHv2mClmIpa1Cd(methodIn.getHv2mIndex() - 1)) ) ) { 
//  cobolCode::MOVE ZEROES TO D51U-RIPA-CLM-IPA-1-CD ( IPA-SUB )
                  methodOut.setD51uRipaClmIpa1Cd(methodOut.getIpaSub() - 1,0);
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::ADD 1 TO D51U-IPA-CNT
                  methodOut.setD51uIpaCnt(methodOut.getD51uIpaCnt()+1);
//  cobolCode::MOVE HV2M-CLM-IPA-1-CD ( HV2M-INDEX ) TO D51U-RIPA-CLM-IPA-1-CD ( IPA-SUB )
                  methodOut.setD51uRipaClmIpa1Cd(methodOut.getIpaSub() - 1,CFUtil.getInt(methodOut.getHv2mClmIpa1Cd(methodIn.getHv2mIndex() - 1)));
              }
//  cobolCode::IF HV2N-CLM-IPA-2-CD ( HV2N-INDEX ) = SPACES OR LOW-VALUES OR HIGH-VALUES
              if (        ( allSpaces(methodOut.getHv2nClmIpa2Cd(methodIn.getHv2nIndex() - 1))   ) || 			( checkLowValue(methodOut.getHv2nClmIpa2Cd(methodIn.getHv2nIndex() - 1)) )  || ( isHighValue(methodOut.getHv2nClmIpa2Cd(methodIn.getHv2nIndex() - 1)) ) ) { 
//  cobolCode::MOVE ZEROES TO D51U-RIPA-CLM-IPA-2-CD ( IPA-SUB )
                  methodOut.setD51uRipaClmIpa2Cd(methodOut.getIpaSub() - 1,0);
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::MOVE HV2N-CLM-IPA-2-CD ( HV2N-INDEX ) TO D51U-RIPA-CLM-IPA-2-CD ( IPA-SUB )
                  methodOut.setD51uRipaClmIpa2Cd(methodOut.getIpaSub() - 1,CFUtil.getInt(methodOut.getHv2nClmIpa2Cd(methodIn.getHv2nIndex() - 1)));
              }
//  cobolCode::IF HV2O-CLM-IPA-3-CD ( HV2O-INDEX ) = SPACES OR LOW-VALUES OR HIGH-VALUES
              if (        ( allSpaces(methodOut.getHv2oClmIpa3Cd(methodIn.getHv2oIndex() - 1))   ) || 			( checkLowValue(methodOut.getHv2oClmIpa3Cd(methodIn.getHv2oIndex() - 1)) )  || ( isHighValue(methodOut.getHv2oClmIpa3Cd(methodIn.getHv2oIndex() - 1)) ) ) { 
//  cobolCode::MOVE ZEROES TO D51U-RIPA-CLM-IPA-3-CD ( IPA-SUB )
                  methodOut.setD51uRipaClmIpa3Cd(methodOut.getIpaSub() - 1,0);
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::MOVE HV2O-CLM-IPA-3-CD ( HV2O-INDEX ) TO D51U-RIPA-CLM-IPA-3-CD ( IPA-SUB )
                  methodOut.setD51uRipaClmIpa3Cd(methodOut.getIpaSub() - 1,CFUtil.getInt(methodOut.getHv2oClmIpa3Cd(methodIn.getHv2oIndex() - 1)));
              }
//  cobolCode::IF HV2R-GRP-TBL-1-NBR ( HV2R-INDEX ) = SPACES OR LOW-VALUES OR HIGH-VALUES
              if (        ( allSpaces(methodOut.getHv2rGrpTbl1Nbr(methodIn.getHv2rIndex() - 1))   ) || 			( checkLowValue(methodOut.getHv2rGrpTbl1Nbr(methodIn.getHv2rIndex() - 1)) )  || ( isHighValue(methodOut.getHv2rGrpTbl1Nbr(methodIn.getHv2rIndex() - 1)) ) ) { 

// ***70293N    move   zeroes
//  cobolCode::MOVE SPACES TO D51U-RIPA-GRP-TBL-1-NBR ( IPA-SUB )
                  methodOut.setD51uRipaGrpTbl1Nbr(methodOut.getIpaSub() - 1,CONSTANTS.SPACE_4);
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::MOVE HV2R-GRP-TBL-1-NBR ( HV2R-INDEX ) TO D51U-RIPA-GRP-TBL-1-NBR ( IPA-SUB )
                  methodOut.setD51uRipaGrpTbl1Nbr(methodOut.getIpaSub() - 1,methodOut.getHv2rGrpTbl1Nbr(methodIn.getHv2rIndex() - 1));
              }
//  cobolCode::IF HV2S-GRP-TBL-2-NBR ( HV2S-INDEX ) = SPACES OR LOW-VALUES OR HIGH-VALUES
              if (        ( allSpaces(methodOut.getHv2sGrpTbl2Nbr(methodIn.getHv2sIndex() - 1))   ) || 			( checkLowValue(methodOut.getHv2sGrpTbl2Nbr(methodIn.getHv2sIndex() - 1)) )  || ( isHighValue(methodOut.getHv2sGrpTbl2Nbr(methodIn.getHv2sIndex() - 1)) ) ) { 

// ***70293N    move   zeroes
//  cobolCode::MOVE SPACES TO D51U-RIPA-GRP-TBL-2-NBR ( IPA-SUB )
                  methodOut.setD51uRipaGrpTbl2Nbr(methodOut.getIpaSub() - 1,CONSTANTS.SPACE_4);
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::MOVE HV2S-GRP-TBL-2-NBR ( HV2S-INDEX ) TO D51U-RIPA-GRP-TBL-2-NBR ( IPA-SUB )
                  methodOut.setD51uRipaGrpTbl2Nbr(methodOut.getIpaSub() - 1,methodOut.getHv2sGrpTbl2Nbr(methodIn.getHv2sIndex() - 1));
              }
//  cobolCode::IF HV2T-GRP-TBL-3-NBR ( HV2T-INDEX ) = SPACES OR LOW-VALUES OR HIGH-VALUES
              if (        ( allSpaces(methodOut.getHv2tGrpTbl3Nbr(methodIn.getHv2tIndex() - 1))   ) || 			( checkLowValue(methodOut.getHv2tGrpTbl3Nbr(methodIn.getHv2tIndex() - 1)) )  || ( isHighValue(methodOut.getHv2tGrpTbl3Nbr(methodIn.getHv2tIndex() - 1)) ) ) { 

// ***70293N    move   zeroes
//  cobolCode::MOVE SPACES TO D51U-RIPA-GRP-TBL-3-NBR ( IPA-SUB )
                  methodOut.setD51uRipaGrpTbl3Nbr(methodOut.getIpaSub() - 1,CONSTANTS.SPACE_4);
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::MOVE HV2T-GRP-TBL-3-NBR ( HV2T-INDEX ) TO D51U-RIPA-GRP-TBL-3-NBR ( IPA-SUB )
                  methodOut.setD51uRipaGrpTbl3Nbr(methodOut.getIpaSub() - 1,methodOut.getHv2tGrpTbl3Nbr(methodIn.getHv2tIndex() - 1));
              }
          }
      
      return methodOut;
      }
      /**
      * moveCsptyp 
      *   This method is derived from 
  *   COBOL Paragraph - 2655-MOVE-CSPTYP SECTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ptypSub                        COBOL Name: PTYP-SUB
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - hv2pProvTyp                    COBOL Name: HV2P-PROV-TYP
      *
      * Output :  

      * - ptypSub                        COBOL Name: PTYP-SUB
      * - provFoundSw                    COBOL Name: PROV-FOUND-SW
      * - d51uPtypCnt                    COBOL Name: D51U-PTYP-CNT
      * - d51uPtypDrvPos                 COBOL Name: D51U-PTYP-DRV-POS
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - d51uPtypDrvSvc                 COBOL Name: D51U-PTYP-DRV-SVC
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - d51uPtypDrvCau                 COBOL Name: D51U-PTYP-DRV-CAU
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - d51uPtypProvTyp                COBOL Name: D51U-PTYP-PROV-TYP
      * - hv2pProvTyp                    COBOL Name: HV2P-PROV-TYP
      *
      * @throws CFException
      */
      @Override
      public MoveCsptypOutCtx moveCsptyp(MoveCsptypInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
MoveCsptypOutCtx methodOut = methodIn.getMoveCsptypOutCtx();
//  cobolCode::IF PTYP-SUB < +99
          if (	( methodOut.getPtypSub() < 99 )) { 
//  cobolCode::ADD +1 TO PTYP-SUB
              methodOut.setPtypSub(methodOut.getPtypSub()+1);
//  cobolCode::SET PROVTYP-FOUND TO TRUE
              methodOut.setProvtypFoundTrue(); 
              
//  cobolCode::MOVE PTYP-SUB TO D51U-PTYP-CNT
              methodOut.setD51uPtypCnt(methodOut.getPtypSub());
//  cobolCode::MOVE HV2B-DERIV-PL-OF-SVC-CD ( HV2B-INDEX ) TO D51U-PTYP-DRV-POS ( PTYP-SUB )
              methodOut.setD51uPtypDrvPos(methodOut.getPtypSub() - 1,methodOut.getHv2bDerivPlOfSvcCd(methodIn.getHv2bIndex() - 1));
//  cobolCode::MOVE HV2C-DERIV-SVC-CD ( HV2C-INDEX ) TO D51U-PTYP-DRV-SVC ( PTYP-SUB )
              methodOut.setD51uPtypDrvSvc(methodOut.getPtypSub() - 1,methodOut.getHv2cDerivSvcCd(methodIn.getHv2cIndex() - 1));
//  cobolCode::MOVE HV2D-DERIV-CAUS-CD ( HV2D-INDEX ) TO D51U-PTYP-DRV-CAU ( PTYP-SUB )
              methodOut.setD51uPtypDrvCau(methodOut.getPtypSub() - 1,methodOut.getHv2dDerivCausCd(methodIn.getHv2dIndex() - 1));
//  cobolCode::MOVE HV2P-PROV-TYP ( HV2P-INDEX ) TO D51U-PTYP-PROV-TYP ( PTYP-SUB )
              methodOut.setD51uPtypProvTyp(methodOut.getPtypSub() - 1,methodOut.getHv2pProvTyp(methodIn.getHv2pIndex() - 1));
          }
      
      return methodOut;
      }
      /**
      * moveCsfcnd 
      *   This method is derived from 
  *   COBOL Paragraph - 2656-MOVE-CSFCND SECTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - fcndSub                        COBOL Name: FCND-SUB
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - hv2qFromCondPos                COBOL Name: HV2Q-FROM-COND-POS
      *
      * Output :  

      * - fcndSub                        COBOL Name: FCND-SUB
      * - posFoundSw                     COBOL Name: POS-FOUND-SW
      * - d51uFcndCnt                    COBOL Name: D51U-FCND-CNT
      * - d51uFcndDrvPos                 COBOL Name: D51U-FCND-DRV-POS
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - d51uFcndDrvSvc                 COBOL Name: D51U-FCND-DRV-SVC
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - d51uFcndDrvCau                 COBOL Name: D51U-FCND-DRV-CAU
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - d51uFcndFromCondPos            COBOL Name: D51U-FCND-FROM-COND-POS
      * - hv2qFromCondPos                COBOL Name: HV2Q-FROM-COND-POS
      *
      * @throws CFException
      */
      @Override
      public MoveCsfcndOutCtx moveCsfcnd(MoveCsfcndInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
MoveCsfcndOutCtx methodOut = methodIn.getMoveCsfcndOutCtx();
//  cobolCode::IF FCND-SUB < +99
          if (	( methodOut.getFcndSub() < 99 )) { 
//  cobolCode::ADD +1 TO FCND-SUB
              methodOut.setFcndSub(methodOut.getFcndSub()+1);
//  cobolCode::SET POS-FOUND TO TRUE
              methodOut.setPosFoundTrue(); 
              
//  cobolCode::MOVE FCND-SUB TO D51U-FCND-CNT
              methodOut.setD51uFcndCnt(methodOut.getFcndSub());
//  cobolCode::MOVE HV2B-DERIV-PL-OF-SVC-CD ( HV2B-INDEX ) TO D51U-FCND-DRV-POS ( FCND-SUB )
              methodOut.setD51uFcndDrvPos(methodOut.getFcndSub() - 1,methodOut.getHv2bDerivPlOfSvcCd(methodIn.getHv2bIndex() - 1));
//  cobolCode::MOVE HV2C-DERIV-SVC-CD ( HV2C-INDEX ) TO D51U-FCND-DRV-SVC ( FCND-SUB )
              methodOut.setD51uFcndDrvSvc(methodOut.getFcndSub() - 1,methodOut.getHv2cDerivSvcCd(methodIn.getHv2cIndex() - 1));
//  cobolCode::MOVE HV2D-DERIV-CAUS-CD ( HV2D-INDEX ) TO D51U-FCND-DRV-CAU ( FCND-SUB )
              methodOut.setD51uFcndDrvCau(methodOut.getFcndSub() - 1,methodOut.getHv2dDerivCausCd(methodIn.getHv2dIndex() - 1));
//  cobolCode::MOVE HV2Q-FROM-COND-POS ( HV2Q-INDEX ) TO D51U-FCND-FROM-COND-POS ( FCND-SUB )
              methodOut.setD51uFcndFromCondPos(methodOut.getFcndSub() - 1,pad(3,methodOut.getHv2qFromCondPos(methodIn.getHv2qIndex() - 1),SPACE_CHAR,RIGHT_PAD));
          }
      
      return methodOut;
      }
      /**
      * moveCflgTable 
      *   This method is derived from 
  *   COBOL Paragraph - 2657-MOVE-CFLG-TABLE SECTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - cflgSub                        COBOL Name: CFLG-SUB
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - hv2uCpeDescCd                  COBOL Name: HV2U-CPE-DESC-CD
      *
      * Output :  

      * - cflgSub                        COBOL Name: CFLG-SUB
      * - d51uCflgCnt                    COBOL Name: D51U-CFLG-CNT
      * - cflgFoundSw                    COBOL Name: CFLG-FOUND-SW
      * - d51uCflgDrvPos                 COBOL Name: D51U-CFLG-DRV-POS
      * - hv2bDerivPlOfSvcCd             COBOL Name: HV2B-DERIV-PL-OF-SVC-CD
      * - d51uCflgDrvSvc                 COBOL Name: D51U-CFLG-DRV-SVC
      * - hv2cDerivSvcCd                 COBOL Name: HV2C-DERIV-SVC-CD
      * - d51uCflgDrvCau                 COBOL Name: D51U-CFLG-DRV-CAU
      * - hv2dDerivCausCd                COBOL Name: HV2D-DERIV-CAUS-CD
      * - d51uCflgCpeDescCd              COBOL Name: D51U-CFLG-CPE-DESC-CD
      * - hv2uCpeDescCd                  COBOL Name: HV2U-CPE-DESC-CD
      *
      * @throws CFException
      */
      @Override
      public MoveCflgTableOutCtx moveCflgTable(MoveCflgTableInCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
MoveCflgTableOutCtx methodOut = methodIn.getMoveCflgTableOutCtx();
//  cobolCode::IF CFLG-SUB < +99
          if (	( methodOut.getCflgSub() < 99 )) { 
//  cobolCode::ADD 1 TO CFLG-SUB
              methodOut.setCflgSub(methodOut.getCflgSub()+1);
//  cobolCode::MOVE CFLG-SUB TO D51U-CFLG-CNT
              methodOut.setD51uCflgCnt(methodOut.getCflgSub());
//  cobolCode::SET CFLG-FOUND TO TRUE
              methodOut.setCflgFoundTrue(); 
              
//  cobolCode::MOVE HV2B-DERIV-PL-OF-SVC-CD ( HV2B-INDEX ) TO D51U-CFLG-DRV-POS ( CFLG-SUB )
              methodOut.setD51uCflgDrvPos(methodOut.getCflgSub() - 1,methodOut.getHv2bDerivPlOfSvcCd(methodIn.getHv2bIndex() - 1));
//  cobolCode::MOVE HV2C-DERIV-SVC-CD ( HV2C-INDEX ) TO D51U-CFLG-DRV-SVC ( CFLG-SUB )
              methodOut.setD51uCflgDrvSvc(methodOut.getCflgSub() - 1,methodOut.getHv2cDerivSvcCd(methodIn.getHv2cIndex() - 1));
//  cobolCode::MOVE HV2D-DERIV-CAUS-CD ( HV2D-INDEX ) TO D51U-CFLG-DRV-CAU ( CFLG-SUB )
              methodOut.setD51uCflgDrvCau(methodOut.getCflgSub() - 1,methodOut.getHv2dDerivCausCd(methodIn.getHv2dIndex() - 1));
//  cobolCode::MOVE HV2U-CPE-DESC-CD ( HV2U-INDEX ) TO D51U-CFLG-CPE-DESC-CD ( CFLG-SUB )
              methodOut.setD51uCflgCpeDescCd(methodOut.getCflgSub() - 1,methodOut.getHv2uCpeDescCd(methodIn.getHv2uIndex() - 1));
          }
      
      return methodOut;
      }
      /**
      * processFuncCd3 
      *   This method is derived from 
  *   COBOL Paragraph - 3100-PROCESS-FUNC-CD-3 SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sub                            COBOL Name: WS-SUB
      * - d51uMoreIcdSwitch              COBOL Name: D51U-MORE-ICD-SWITCH
      * - d51uKeyFeSpi                   COBOL Name: D51U-KEY-FE-SPI
      * - d51uLstClmIcdPos               COBOL Name: D51U-LST-CLM-ICD-POS
      * - d51uLstClmIcdSvc               COBOL Name: D51U-LST-CLM-ICD-SVC
      * - d51uLstClmIcdCau               COBOL Name: D51U-LST-CLM-ICD-CAU
      * - d51uLstClmIcdInd               COBOL Name: D51U-LST-CLM-ICD-IND
      *
      * Output :  

      * - sub                            COBOL Name: WS-SUB
      * - d51uRetRuleIcd                 COBOL Name: D51U-RET-RULE-ICD
      * - icdSub                         COBOL Name: ICD-SUB
      * - d51uMoreIcdCnt                 COBOL Name: D51U-MORE-ICD-CNT
      * - moreIcdFoundSw                 COBOL Name: MORE-ICD-FOUND-SW
      * - fetchEndIcd                    COBOL Name: WS-FETCH-END-ICD
      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - ricdSpiTblId                   COBOL Name: RICD-SPI-TBL-ID
      * - d51uKeyFeSpi                   COBOL Name: D51U-KEY-FE-SPI
      * - lstClmIcdPos                   COBOL Name: WS-LST-CLM-ICD-POS
      * - ricdDerivPlOfSvcCd             COBOL Name: RICD-DERIV-PL-OF-SVC-CD
      * - d51uLstClmIcdPos               COBOL Name: D51U-LST-CLM-ICD-POS
      * - lstClmIcdSvc                   COBOL Name: WS-LST-CLM-ICD-SVC
      * - ricdDerivSvcCd                 COBOL Name: RICD-DERIV-SVC-CD
      * - d51uLstClmIcdSvc               COBOL Name: D51U-LST-CLM-ICD-SVC
      * - lstClmIcdCau                   COBOL Name: WS-LST-CLM-ICD-CAU
      * - ricdDerivCausCd                COBOL Name: RICD-DERIV-CAUS-CD
      * - d51uLstClmIcdCau               COBOL Name: D51U-LST-CLM-ICD-CAU
      * - lstClmIcdInd                   COBOL Name: WS-LST-CLM-ICD-IND
      * - d51uLstClmIcdInd               COBOL Name: D51U-LST-CLM-ICD-IND
      *
      * @throws CFException
      */
      @Override
      public ProcessFuncCd3OutCtx processFuncCd3(ProcessFuncCd3InCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81 3100-Process-func-cd-3                                       *
// *81                                                              *
// *81 business function:                                           *
// *81 process icd rule table for records in excess of 9999         *
// *81***************************************************************
// *82***************************************************************
// *82 3100-process-func-cd-3                                       *
// *82                                                              *
// *82 1. fetch this cursor                                         *
// *82               csicd_first_9999_spi                           *
// *82                                                              *
// *82 called by : 1.2000-processing section                        *
// *82 call      :                                                  *
// *82***************************************************************

// **   Move 'n'                    to d51u-more-icd-records.
// **   move 'n'                    to ws-fetch-end-icd.
// **
// **
// *== populate fields required for cursor fetch (csicd_b9999)
// **   move d51u-ricd-drv-pos(01)  to ricd-deriv-pl-of-svc-cd
// **   move d51u-ricd-drv-svc(01)  to ricd-deriv-svc-cd
// **   move d51u-ricd-drv-cau(01)  to ricd-deriv-caus-cd
// *== initialize the return fields
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
ProcessFuncCd3OutCtx methodOut = methodIn.getProcessFuncCd3OutCtx();
//  cobolCode::PERFORM VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > +9999
          for (methodOut.setSub(1); (	( methodOut.getSub() <= 9999 )) ; methodOut.setSub(methodOut.getSub() + 1) ) {
//  cobolCode::INITIALIZE D51U-RET-RULE-ICD ( WS-SUB )
              methodOut.getD51uRetRuleIcd(methodOut.getSub() - 1).initialize();
          }

// *==
//  cobolCode::MOVE +0 TO ICD-SUB
          methodOut.setIcdSub(0);
//  cobolCode::MOVE ICD-SUB TO D51U-MORE-ICD-CNT
          methodOut.setD51uMoreIcdCnt(methodOut.getIcdSub());
//  cobolCode::SET MORE-ICD-NOT-FOUND TO TRUE
          methodOut.setMoreIcdNotFoundTrue(); 
          
//  cobolCode::SET NOT-END-OF-FETCH-ICD TO TRUE
          methodOut.setNotEndOfFetchIcdTrue(); 
          
//  cobolCode::SET CLOSE-CSR-OK TO TRUE
          methodOut.setCloseCsrOkTrue(); 
          

// *
// ***  Perform  3200-open-csicd-cursor   thru  3200-exit.
// *
//  cobolCode::IF FIRST-TIME-MORE-ICD
          if ( methodIn.isFirstTimeMoreIcd()  ) { 
//  cobolCode::MOVE D51U-KEY-FE-SPI TO RICD-SPI-TBL-ID
              methodOut.setRicdSpiTblId(methodOut.getD51uKeyFeSpi());
//  cobolCode::MOVE D51U-LST-CLM-ICD-POS TO WS-LST-CLM-ICD-POS RICD-DERIV-PL-OF-SVC-CD
              methodOut.setLstClmIcdPos(methodOut.getD51uLstClmIcdPos());
              methodOut.setRicdDerivPlOfSvcCd(methodOut.getD51uLstClmIcdPos());
//  cobolCode::MOVE D51U-LST-CLM-ICD-SVC TO WS-LST-CLM-ICD-SVC RICD-DERIV-SVC-CD
              methodOut.setLstClmIcdSvc(methodOut.getD51uLstClmIcdSvc());
              methodOut.setRicdDerivSvcCd(methodOut.getD51uLstClmIcdSvc());
//  cobolCode::MOVE D51U-LST-CLM-ICD-CAU TO WS-LST-CLM-ICD-CAU RICD-DERIV-CAUS-CD
              methodOut.setLstClmIcdCau(methodOut.getD51uLstClmIcdCau());
              methodOut.setRicdDerivCausCd(methodOut.getD51uLstClmIcdCau());
//  cobolCode::MOVE D51U-LST-CLM-ICD-IND TO WS-LST-CLM-ICD-IND
              methodOut.setLstClmIcdInd(methodOut.getD51uLstClmIcdInd());
//  cobolCode::PERFORM 2450-OPEN-CSICD-CURSOR THRU 2450-EXIT
              openCsicdCursor(programCtx.getOpenCsicdCursorInCtx());/*2450-OPEN-CSICD-CURSOR SECTION*/
          }
//  cobolCode::ELSE
          else { 
//  cobolCode::PERFORM 2480-FETCH-CSICD THRU 2480-EXIT
              fetchCsicd(programCtx.getFetchCsicdInCtx());/*2480-FETCH-CSICD SECTION*/
          }
      
      return methodOut;
      }
      /**
      * openCsicdCursor3200 
      *   This method is derived from 
  *   COBOL Paragraph - 3200-OPEN-CSICD-CURSOR SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - fetchEndIcd                    COBOL Name: WS-FETCH-END-ICD
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsmReturnCode                  COBOL Name: DSM-RETURN-CODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      @Override
      public OpenCsicdCursor3200OutCtx openCsicdCursor3200(OpenCsicdCursor3200InCtx methodIn) throws Exception {
      
// *81***************************************************************
// *81 3200-Open-csicd-cursor section.                              *
// *81                                                              *
// *81 business function:                                           *
// *81 select / validate columns the fe spi tables                  *
// *81***************************************************************
// *82***************************************************************
// *82 3200-open-csicd-cursor section                               *
// *82                                                              *
// *82 1.open cursor of this table                                  *
// *82                - fe_spi_rule_icd                             *
// *82                                                              *
// *82 ccsicded by : 1.                                             *
// *82 call      :                                                  *
// *82                                                              *
// *82***************************************************************
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
OpenCsicdCursor3200OutCtx methodOut = methodIn.getOpenCsicdCursor3200OutCtx();
//  cobolCode::SELECT DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , CLM_ICD_IND , CLM_ICD_FROM_CD , CLM_ICD_TO_CD FROM FE_SPI_RULE_ICD WHERE ( SPI_TBL_ID = ? AND STS_CD = 'A' AND CLM_ICD_IND = ? ) AND ( ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR ( CLM_ICD_FROM_CD <= ? AND CLM_ICD_TO_CD >= ? ) OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? OR CLM_ICD_FROM_CD = ? ) ORDER BY DERIV_PL_OF_SVC_CD , DERIV_SVC_CD , DERIV_CAUS_CD , CLM_ICD_FROM_CD , CLM_ICD_TO_CD FOR FETCH ONLY
          programCtx.setCsicdFirst9999SpiResultSet(d529351uRepository.openCsicdFirst9999SpiD529351u(methodIn.getLstIcdKey(),methodIn.getTestVariables(),programCtx.getSqlca(),methodIn.getDclfeSpiRuleIcd()));
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::PERFORM 3250-FETCH-CSICD THRU 3250-EXIT UNTIL END-OF-FETCH-ICD
              while (!(methodIn.isEndOfFetchIcd()) ) {
                 fetchCsicd3250(programCtx.getFetchCsicd3250InCtx());/*3250-FETCH-CSICD SECTION*/
              }
          break;
          default :
//  cobolCode::SET DSM-DB2-ERROR TO TRUE
              methodOut.setDsmDb2ErrorTrue(); 
              
//  cobolCode::SET D51U-DB2-ERROR TO TRUE
              methodOut.setD51uDb2ErrorTrue(); 
              
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::SET D51U-DB2-OPEN-ERROR TO TRUE
              methodOut.setD51uDb2OpenErrorTrue(); 
              
//  cobolCode::MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              methodOut.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(methodOut.getSqlcode_Ws()).toCharArray()));
//  cobolCode::MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              methodOut.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE '3200-' TO D51U-PARAGRAPH-NUM
//  LITERAL_3200_MN_ = '3200-'
              methodOut.setD51uParagraphNum(CONSTANTS.LITERAL_3200_MN_);
          }
      
      return methodOut;
      }
      /**
      * fetchCsicd3250 
      *   This method is derived from 
  *   COBOL Paragraph - 3250-FETCH-CSICD SECTION COBOL Cyclomatic complexity - 11
      * Input  :  

      * - sqlerrd                        COBOL Name: SQLERRD
      * - icdSub                         COBOL Name: ICD-SUB
      * - hv3aIcdDrvPos                  COBOL Name: HV3A-ICD-DRV-POS
      * - hv3bIcdDrvSvc                  COBOL Name: HV3B-ICD-DRV-SVC
      * - hv3cIcdDrvCau                  COBOL Name: HV3C-ICD-DRV-CAU
      * - hv3dIcdTypCd                   COBOL Name: HV3D-ICD-TYP-CD
      * - hv3eClmFrmIcdCd                COBOL Name: HV3E-CLM-FRM-ICD-CD
      * - hv3fClmToIcdCd                 COBOL Name: HV3F-CLM-TO-ICD-CD
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - dsnnrows                       COBOL Name: DSNNROWS
      * - hv3aIndex                      COBOL Name: HV3A-INDEX
      * - hv3bIndex                      COBOL Name: HV3B-INDEX
      * - hv3cIndex                      COBOL Name: HV3C-INDEX
      * - hv3dIndex                      COBOL Name: HV3D-INDEX
      * - hv3eIndex                      COBOL Name: HV3E-INDEX
      * - hv3fIndex                      COBOL Name: HV3F-INDEX
      * - icdSub                         COBOL Name: ICD-SUB
      * - d51uRicdDrvPos                 COBOL Name: D51U-RICD-DRV-POS
      * - hv3aIcdDrvPos                  COBOL Name: HV3A-ICD-DRV-POS
      * - d51uRicdDrvSvc                 COBOL Name: D51U-RICD-DRV-SVC
      * - hv3bIcdDrvSvc                  COBOL Name: HV3B-ICD-DRV-SVC
      * - d51uRicdDrvCau                 COBOL Name: D51U-RICD-DRV-CAU
      * - hv3cIcdDrvCau                  COBOL Name: HV3C-ICD-DRV-CAU
      * - d51uRicdClmIcdInd              COBOL Name: D51U-RICD-CLM-ICD-IND
      * - hv3dIcdTypCd                   COBOL Name: HV3D-ICD-TYP-CD
      * - d51uRicdClmIcdFromCd           COBOL Name: D51U-RICD-CLM-ICD-FROM-CD
      * - hv3eClmFrmIcdCd                COBOL Name: HV3E-CLM-FRM-ICD-CD
      * - d51uRicdClmIcdToCd             COBOL Name: D51U-RICD-CLM-ICD-TO-CD
      * - hv3fClmToIcdCd                 COBOL Name: HV3F-CLM-TO-ICD-CD
      * - icdFoundSw                     COBOL Name: ICD-FOUND-SW
      * - d51uIcdCnt                     COBOL Name: D51U-ICD-CNT
      * - fetchEndIcd                    COBOL Name: WS-FETCH-END-ICD
      * - d51uMoreIcdRecords             COBOL Name: D51U-MORE-ICD-RECORDS
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public FetchCsicd3250OutCtx fetchCsicd3250(FetchCsicd3250InCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
FetchCsicd3250OutCtx methodOut = methodIn.getFetchCsicd3250OutCtx();
// FETCH NEXT ROWSET FROM CSICD_FIRST_9999_SPI FOR 9999 ROWS INTO  ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ? 
//  cobolCode::MOVE 9999 TO DSNNROWS
          methodOut.setDsnnrows(9999);
//  cobolCode::FETCH NEXT ROWSET FROM CSICD_FIRST_9999_SPI FOR 9999 ROWS INTO ? , ? , ? , ? , ? , ?
          d529351uRepository.fetchCsicdFirst9999SpiD529351u(programCtx.getCsicdFirst9999SpiResultSet(),methodOut.getHvHostVariablesCsicdo(),programCtx.getSqlca());
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:

// ***        Add +1 to icd-sub
//  cobolCode::SET HV3A-INDEX TO +1
              methodOut.setHv3aIndex(1); 
              
//  cobolCode::SET HV3B-INDEX TO +1
              methodOut.setHv3bIndex(1); 
              
//  cobolCode::SET HV3C-INDEX TO +1
              methodOut.setHv3cIndex(1); 
              
//  cobolCode::SET HV3D-INDEX TO +1
              methodOut.setHv3dIndex(1); 
              
//  cobolCode::SET HV3E-INDEX TO +1
              methodOut.setHv3eIndex(1); 
              
//  cobolCode::SET HV3F-INDEX TO +1
              methodOut.setHv3fIndex(1); 
              
//  cobolCode::PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < methodIn.getSqlerrd(2);index1++) {

// ***       If icd-sub > +0 and icd-sub <= +9999
//  cobolCode::IF ICD-SUB < +9999
                  if (	( methodOut.getIcdSub() < 9999 )) { 
//  cobolCode::ADD +1 TO ICD-SUB
                      methodOut.setIcdSub(methodOut.getIcdSub()+1);

// ***        Move ricd-deriv-pl-of-svc-cd  to
//  cobolCode::MOVE HV3A-ICD-DRV-POS ( HV3A-INDEX ) TO D51U-RICD-DRV-POS ( ICD-SUB )
                      methodOut.setD51uRicdDrvPos(methodOut.getIcdSub() - 1,methodOut.getHv3aIcdDrvPos(methodOut.getHv3aIndex() - 1));

// ***        Move ricd-deriv-svc-cd        to
//  cobolCode::MOVE HV3B-ICD-DRV-SVC ( HV3B-INDEX ) TO D51U-RICD-DRV-SVC ( ICD-SUB )
                      methodOut.setD51uRicdDrvSvc(methodOut.getIcdSub() - 1,methodOut.getHv3bIcdDrvSvc(methodOut.getHv3bIndex() - 1));

// ***        Move ricd-deriv-caus-cd       to
//  cobolCode::MOVE HV3C-ICD-DRV-CAU ( HV3C-INDEX ) TO D51U-RICD-DRV-CAU ( ICD-SUB )
                      methodOut.setD51uRicdDrvCau(methodOut.getIcdSub() - 1,methodOut.getHv3cIcdDrvCau(methodOut.getHv3cIndex() - 1));

// ***        Move ricd-clm-icd-ind      to
//  cobolCode::MOVE HV3D-ICD-TYP-CD ( HV3D-INDEX ) TO D51U-RICD-CLM-ICD-IND ( ICD-SUB )
                      methodOut.setD51uRicdClmIcdInd(methodOut.getIcdSub() - 1,methodOut.getHv3dIcdTypCd(methodOut.getHv3dIndex() - 1));

// ***        Move ricd-clm-icd-from-cd  to
//  cobolCode::MOVE HV3E-CLM-FRM-ICD-CD ( HV3E-INDEX ) TO D51U-RICD-CLM-ICD-FROM-CD ( ICD-SUB )
                      methodOut.setD51uRicdClmIcdFromCd(methodOut.getIcdSub() - 1,methodOut.getHv3eClmFrmIcdCd(methodOut.getHv3eIndex() - 1));

// ***        Move ricd-clm-icd-to-cd  to
//  cobolCode::MOVE HV3F-CLM-TO-ICD-CD ( HV3F-INDEX ) TO D51U-RICD-CLM-ICD-TO-CD ( ICD-SUB )
                      methodOut.setD51uRicdClmIcdToCd(methodOut.getIcdSub() - 1,methodOut.getHv3fClmToIcdCd(methodOut.getHv3fIndex() - 1));
                  }

// ***        Set icd-found to true
// ***       else
// ***        move 'y'                to d51u-more-icd-records
// ***        move +9999 to d51u-icd-cnt
// ***        perform 3260-close-csr   thru 3260-exit
//  cobolCode::SET HV3A-INDEX UP BY +1
                  methodOut.setHv3aIndex(methodOut.getHv3aIndex() + 1); 
                  
//  cobolCode::SET HV3B-INDEX UP BY +1
                  methodOut.setHv3bIndex(methodOut.getHv3bIndex() + 1); 
                  
//  cobolCode::SET HV3C-INDEX UP BY +1
                  methodOut.setHv3cIndex(methodOut.getHv3cIndex() + 1); 
                  
//  cobolCode::SET HV3D-INDEX UP BY +1
                  methodOut.setHv3dIndex(methodOut.getHv3dIndex() + 1); 
                  
//  cobolCode::SET HV3E-INDEX UP BY +1
                  methodOut.setHv3eIndex(methodOut.getHv3eIndex() + 1); 
                  
//  cobolCode::SET HV3F-INDEX UP BY +1
                  methodOut.setHv3fIndex(methodOut.getHv3fIndex() + 1); 
                  
              }
//  cobolCode::IF ICD-SUB = +9999
              if (	( methodOut.getIcdSub() == 9999 )) { 
//  cobolCode::SET ICD-FOUND TO TRUE
                  methodOut.setIcdFoundTrue(); 
                  
//  cobolCode::MOVE ICD-SUB TO D51U-ICD-CNT
                  methodOut.setD51uIcdCnt(methodOut.getIcdSub());
//  cobolCode::SET END-OF-FETCH-ICD TO TRUE
                  methodOut.setEndOfFetchIcdTrue(); 
                  
//  cobolCode::SET MORE-ICD-RECORDS TO TRUE
                  methodOut.setMoreIcdRecordsTrue(); 
                  
//  cobolCode::PERFORM 3260-CLOSE-CSR THRU 3260-EXIT
                  closeCsr3260(programCtx.getCloseCsr3260InCtx());/*3260-CLOSE-CSR SECTION*/
              }
          break;
          	case 100:
//  cobolCode::SET HV3A-INDEX TO +1
              methodOut.setHv3aIndex(1); 
              
//  cobolCode::SET HV3B-INDEX TO +1
              methodOut.setHv3bIndex(1); 
              
//  cobolCode::SET HV3C-INDEX TO +1
              methodOut.setHv3cIndex(1); 
              
//  cobolCode::SET HV3D-INDEX TO +1
              methodOut.setHv3dIndex(1); 
              
//  cobolCode::SET HV3E-INDEX TO +1
              methodOut.setHv3eIndex(1); 
              
//  cobolCode::SET HV3F-INDEX TO +1
              methodOut.setHv3fIndex(1); 
              
//  cobolCode::PERFORM SQLERRD (3) TIMES
              for (int index1 = 0; index1 < methodIn.getSqlerrd(2);index1++) {
//  cobolCode::IF ICD-SUB < +9999
                  if (	( methodOut.getIcdSub() < 9999 )) { 
//  cobolCode::ADD +1 TO ICD-SUB
                      methodOut.setIcdSub(methodOut.getIcdSub()+1);
//  cobolCode::MOVE HV3A-ICD-DRV-POS ( HV3A-INDEX ) TO D51U-RICD-DRV-POS ( ICD-SUB )
                      methodOut.setD51uRicdDrvPos(methodOut.getIcdSub() - 1,methodOut.getHv3aIcdDrvPos(methodOut.getHv3aIndex() - 1));
//  cobolCode::MOVE HV3B-ICD-DRV-SVC ( HV3B-INDEX ) TO D51U-RICD-DRV-SVC ( ICD-SUB )
                      methodOut.setD51uRicdDrvSvc(methodOut.getIcdSub() - 1,methodOut.getHv3bIcdDrvSvc(methodOut.getHv3bIndex() - 1));
//  cobolCode::MOVE HV3C-ICD-DRV-CAU ( HV3C-INDEX ) TO D51U-RICD-DRV-CAU ( ICD-SUB )
                      methodOut.setD51uRicdDrvCau(methodOut.getIcdSub() - 1,methodOut.getHv3cIcdDrvCau(methodOut.getHv3cIndex() - 1));
//  cobolCode::MOVE HV3D-ICD-TYP-CD ( HV3D-INDEX ) TO D51U-RICD-CLM-ICD-IND ( ICD-SUB )
                      methodOut.setD51uRicdClmIcdInd(methodOut.getIcdSub() - 1,methodOut.getHv3dIcdTypCd(methodOut.getHv3dIndex() - 1));
//  cobolCode::MOVE HV3E-CLM-FRM-ICD-CD ( HV3E-INDEX ) TO D51U-RICD-CLM-ICD-FROM-CD ( ICD-SUB )
                      methodOut.setD51uRicdClmIcdFromCd(methodOut.getIcdSub() - 1,methodOut.getHv3eClmFrmIcdCd(methodOut.getHv3eIndex() - 1));
//  cobolCode::MOVE HV3F-CLM-TO-ICD-CD ( HV3F-INDEX ) TO D51U-RICD-CLM-ICD-TO-CD ( ICD-SUB )
                      methodOut.setD51uRicdClmIcdToCd(methodOut.getIcdSub() - 1,methodOut.getHv3fClmToIcdCd(methodOut.getHv3fIndex() - 1));
                  }
//  cobolCode::SET HV3A-INDEX UP BY +1
                  methodOut.setHv3aIndex(methodOut.getHv3aIndex() + 1); 
                  
//  cobolCode::SET HV3B-INDEX UP BY +1
                  methodOut.setHv3bIndex(methodOut.getHv3bIndex() + 1); 
                  
//  cobolCode::SET HV3C-INDEX UP BY +1
                  methodOut.setHv3cIndex(methodOut.getHv3cIndex() + 1); 
                  
//  cobolCode::SET HV3D-INDEX UP BY +1
                  methodOut.setHv3dIndex(methodOut.getHv3dIndex() + 1); 
                  
//  cobolCode::SET HV3E-INDEX UP BY +1
                  methodOut.setHv3eIndex(methodOut.getHv3eIndex() + 1); 
                  
//  cobolCode::SET HV3F-INDEX UP BY +1
                  methodOut.setHv3fIndex(methodOut.getHv3fIndex() + 1); 
                  
              }
//  cobolCode::IF ICD-SUB = 0
              if (	( methodOut.getIcdSub() == 0 )) { 
//  cobolCode::SET ICD-NOT-FOUND TO TRUE
                  methodOut.setIcdNotFoundTrue(); 
                  
              }
//  cobolCode::ELSE
              else { 
//  cobolCode::SET ICD-FOUND TO TRUE
                  methodOut.setIcdFoundTrue(); 
                  
              }
//  cobolCode::SET END-OF-FETCH-ICD TO TRUE
              methodOut.setEndOfFetchIcdTrue(); 
              
//  cobolCode::MOVE ICD-SUB TO D51U-ICD-CNT
              methodOut.setD51uIcdCnt(methodOut.getIcdSub());
//  cobolCode::PERFORM 3260-CLOSE-CSR THRU 3260-EXIT
              closeCsr3260(programCtx.getCloseCsr3260InCtx());/*3260-CLOSE-CSR SECTION*/
          break;
          default :
//  cobolCode::SET ICD-NOT-FOUND TO TRUE
              methodOut.setIcdNotFoundTrue(); 
              
//  cobolCode::SET END-OF-FETCH-ICD TO TRUE
              methodOut.setEndOfFetchIcdTrue(); 
              
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::PERFORM 3260-CLOSE-CSR THRU 3260-EXIT
              closeCsr3260(programCtx.getCloseCsr3260InCtx());/*3260-CLOSE-CSR SECTION*/
          }
      
      return methodOut;
      }
      /**
      * closeCsr3260 
      *   This method is derived from 
  *   COBOL Paragraph - 3260-CLOSE-CSR SECTION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - closeCsrInd                    COBOL Name: CLOSE-CSR-IND
      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - d51uDebugTracer                COBOL Name: D51U-DEBUG-TRACER
      * - d51uParagraphNum               COBOL Name: D51U-PARAGRAPH-NUM
      *
      * @throws CFException
      */
      @Override
      public CloseCsr3260OutCtx closeCsr3260(CloseCsr3260InCtx methodIn) throws Exception {
//Added variable to get the program context in place.
D529351uCtx programCtx = methodIn.getD529351uCtx();
//Added variable to get the output context in place.
CloseCsr3260OutCtx methodOut = methodIn.getCloseCsr3260OutCtx();
//  cobolCode::CLOSE CSICD_FIRST_9999_SPI
          d529351uRepository.closeCsicdFirst9999SpiD529351u(programCtx.getCsicdFirst9999SpiResultSet(),programCtx.getSqlca());
//  cobolCode::EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  cobolCode::SET CLOSE-CSR-OK TO TRUE
              methodOut.setCloseCsrOkTrue(); 
              
          break;
          default :
//  cobolCode::MOVE SQLCODE TO WS-SQLCODE
              methodOut.setSqlcode_Ws(methodOut.getSqlcode());
//  cobolCode::SET CLOSE-CSR-NG TO TRUE
              methodOut.setCloseCsrNgTrue(); 
              
//  cobolCode::SET D51U-DB2-ERROR TO TRUE
              methodOut.setD51uDb2ErrorTrue(); 
              
//  cobolCode::SET D51U-DB2-CLOSE-ERROR TO TRUE
              methodOut.setD51uDb2CloseErrorTrue(); 
              
//  cobolCode::MOVE WS-SQLCODE TO D51U-SQL-OR-RESP-CD
//  FORMAT_431311340 = "-999999999"
              methodOut.setD51uSqlOrRespCd(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_431311340,String.valueOf(methodOut.getSqlcode_Ws()).toCharArray()));
//  cobolCode::MOVE 'D529351U' TO D51U-DEBUG-TRACER
//  LITERAL_D529351U = 'D529351U'
              methodOut.setD51uDebugTracer(CONSTANTS.LITERAL_D529351U);
//  cobolCode::MOVE '3260-' TO D51U-PARAGRAPH-NUM
//  LITERAL_3260_MN_ = '3260-'
              methodOut.setD51uParagraphNum(CONSTANTS.LITERAL_3260_MN_);
          }
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      D529351uCtx programCtx = (D529351uCtx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getDsmCallArea().set((Field)params[0]);
         if (len > 1 && params[1] != null )
            programCtx.getVyspi51uCallArea().set((Field)params[1]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      D529351uCtx programCtx = (D529351uCtx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof DsmCallArea) {
                       	programCtx.setDsmCallArea((DsmCallArea) parameters[index]);
                  	} else {
                       	programCtx.getDsmCallArea().set(parameters[index]);
                  	}
                  }
                
                  break;
              case 1:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Vyspi51uCallArea) {
                       	programCtx.setVyspi51uCallArea((Vyspi51uCallArea) parameters[index]);
                  	} else {
                       	programCtx.getVyspi51uCallArea().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
  
  
  
  
  
  }
  /* 
*00***************************************************************
*00    licenced materials - property of united health group      *
*00                                                              *
*00***************************************************************
*10***************************************************************
*10  program name       :  d529351u                              *
*10  business function  :  db2 data service module of o529351u   *
*10  designed by        :  marife silva                          *
*10  programmed by      :  marife silva                          *
*10  date coded         :  feb. 2012.                            *
*10  type               :  batch/online                          *
*10***************************************************************
*20***************************************************************
*20  major program process:                                      *
*20                                                              *
*20  this db2 dsm module receives function code / spi nbr        *
*20  policy / plan - validates them against spi db2 tables       *
*20  and send back response to the calling program               *
*20                                                              *
*80 func-cd - entered       access spi tables       by           *
*80 ------------------      --------------------   ----          *
*80 1 - policy/plan         fe_spi_pln_var         policy + plan *
*80 2 - spi                 fe_spi_rule_fr_to_svc                *
*80                         fe_spi_rule_prov_typ                 *
*80                         fe_spi_rule_ipa                      *
*80                         fe_spi_rule_caus                     *
*80                         fe_spi_rule_icd                      *
*80                         fe_spi_rule_fr_cond_pos              *
*80                         fe_spi_rule_cpe_flg                  *
******************************************************************
*20***************************************************************
*30***************************************************************
*30  program change log:                                         *
*30                                                              *
*30  release  developer   description                            *
*30  -------  ----------  ---------------------------------      *
*30  rel12q2  m.silva     sprf 4-45917 - icd10 tf case install   *
*30                       initial delivery                       *
*30  rel12q2  m.silva     qc1810-fix cursor                      *
*30                       qc1782-addtl changes                   *
*30  rel12q2  m.silva     qc3211-changes to move derived ps      *
*30                       svc cd and cause code                  *
*30  rel12q2  m.silva     qc5490- fix for -811 for ipa           *
*30  rel12q2  m.silva     qc3670- per dss change - bypass spi no *
*30                       if not active in description table     *
*30                       qc5744- fix for cause code select      *
*30  rel12q2  m.silva     qc5811  corrected subscripts           *
*30  rel12q2  m.silva     qc6693  performance tuning             *
*30  rel12q2  m.silva     qc8025  change ws-sub from 9 to binary *
*30                       as part of performance tuning          *
*30  rel12q2  m.silva     qc9901  move return rules keys         *
*30                       to fix slotting issue                  *
*30  rel12q3  p.parakh    mdtr-2012-0520-1a-tops                 *
*30  rel12q3  p.parakh    defect fix 3841 - sqlcode - 181        *
*30  rel12q3  p.parakh    defect fix 5450(dev identified) for    *
*30                       date conversion from cob to db2        *
*30  rel12q3  p.parakh    defect fix 6274 - non-select 48        *
*30  rel12q3  y.levitis   defect fix 7841                        *
*30                       - increment d51u-ipa-cnt               *
*30  rel12q4  pranjal     uncommenting part of the fix for       *
*30                       defect 7841 for sos 12-2108            *
*30  rel13q3  chuck       mdtr-2013-0207-1a                      *
*30           haatvedt/   added rowset positioning for csplnv &  *
*30           p.parakh    csfrto cursors                         *
*30  rel14q2  hpsm pm10153810 -gaurav b. - fix for icd fetches   *
*30                                        beyond 9999 for table *
*30                                        fe_spi_rule_icd       *
*30  rel15q1  mdtr-2013-1014-1a-tops/    - marie's dtr changes   *
*30           hpsm pm10172289            - marie's dtr changes   *
*30           girish velivala/             create new indexes on *
*30           p.parakh                     fe_spi_rule_caus      *
*30                                        fe_spi_rule_ipa       *
*30                                        fe_spi_rule_prov_typ  *
*30                                       fe_spi_rule_fr_cond_pos*
*30                -  added rowset cursor for derive rules       *
*30                -  added rowset cursor for svc codes          *
*30                -  added rowset cursor for icd codes and to   *
*30                -  fetching pos, svc and caus-cd from csicd,  *
*30                   csfrto and csicd_first_9999_spi also       *
*30                         handle more than 9999 codes that     *
*30                         would handle issue with icd10 codes  *
*30                         for hpsm pm10153810                  *
*30  rel15q3  nick        4-70293 claims processing              *
*30           bukwich     added -grp-tbl-#-nbr                   *
*30  rel15q3  joe leva    4-70293 alm 7323                       *
*30  rel16q1  manoj       fix for alm 4808 for sos 15-3533s      *
*30           ganna       moving spaces to d51u-grp-tbl-1/2/3    *
*30  rel17m8  derek       replaced union to get spi catagories   *
*30           backus      with denorm table                      *
*30                       mdtr-2016-0405-1a-tops                 *
*30  rel18q4  derek       prj145017 internal and customer        *
*30           backus      reporting                              *
*30  rel1909  raj s       prj145017 internal and customer        *
*30                       reporting - pos-tier-typ field         *
*30  rel1909  jaspuneet   prj179220 msk adding pri-diag-ind      *
*30  rel2105  ankita      prj272472 - emergent non-emergent      *
*30           agarwal     project phase 2 and 3                  *
*30 rel21m09  y.levitis  - prj272209 - designated diagnostic     *
*30                        provider (ddp). added  -              *
*30                        major diagnostic eligible indicator   *
*30***************************************************************
*40***************************************************************
*40  external called programs:                                   *
*40                                                              *
*40  name         description        call/link/xctl/start        *
*40  ----     --------------------   --------------------        *
*40                                                              *
*40***************************************************************
*50***************************************************************
*50  return codes:                                               *
*50                                                              *
*50  code                 description                            *
*50  ---------------      ------------------------------------   *
*50                                                              *
*50***************************************************************
*60***************************************************************
*60  database used:                                              *
*60                                                              *
*60            database                  description             *
*60            --------                  ----------------        *
*60                                                              *
*60***************************************************************
*70***************************************************************
*70  tables and access types:                                    *
*70       name                        access                     *
*70  --------------                   -------                    *
*70  fe_spi_desc                      select                     *
*70  fe_spi_rule_fr_cond_pos          select                     *
*70  fe_spi_rule_fr_to_svc            select                     *
*70  fe_spi_rule_prov_typ             select                     *
*70  fe_spi_rule_icd                  select                     *
*70  fe_spi_rule_caus                 select                     *
*70  fe_spi_rule_ipa                  select                     *
*70  fe_spi_rule_cpe_flg              select                     *
*70***************************************************************
*/
