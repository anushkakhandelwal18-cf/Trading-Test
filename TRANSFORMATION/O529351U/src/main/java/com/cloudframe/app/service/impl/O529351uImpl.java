package com.cloudframe.app.service.impl;

/* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
import com.cloudframe.app.common.CommonProcess;
import com.cloudframe.app.cics.CICSSession;
import com.cloudframe.app.dto.o529351u.O529351uCtx.*;
import com.cloudframe.app.dto.o529351u.O529351uCtx;
import com.cloudframe.app.service.O529351u;
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
import com.cloudframe.app.exception.Terminate;
import java.math.BigDecimal;
import com.cloudframe.app.cics.TransactionManager;
import com.cloudframe.app.vsam.KeyInfo;
import com.cloudframe.app.data.Field;
import java.math.RoundingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.business.D529351u;
import com.cloudframe.app.business.*;
import com.cloudframe.app.service.*;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.o529351u.*;
import com.cloudframe.app.dto.o529351u.Dfhcommarea;
import com.cloudframe.app.dto.o529351u.FesrKey;
import com.cloudframe.app.dto.o529351u.FesaKey1;
import com.cloudframe.app.dto.o529351u.Vyspi51uCallArea;
import com.cloudframe.app.dto.o529351u.DdEqisAlt;
import com.cloudframe.app.dto.o529351u.W02FnuLineRead;
import com.cloudframe.app.dto.o529351u.FeSpiRulesRecord;
import com.cloudframe.app.dto.o529351u.W02DsplMsgArea;
import com.cloudframe.app.dto.o529351u.W02FnuLineStartbr;
import com.cloudframe.app.dto.o529351u.FeSpiAltPlanRecord;
import com.cloudframe.app.dto.o529351u.W02FnuLineReadnext;
import com.cloudframe.app.dto.o529351u.CsvcProc;
import com.cloudframe.app.dto.o529351u.DsmCallArea;
import com.cloudframe.app.dto.o529351u.EqiRecord;
import com.cloudframe.app.dto.o529351u.CetCicsErrorTableGroup;
import com.cloudframe.app.dto.o529351u.GenTransSpiTableGroup;
import com.cloudframe.app.dto.o529351u.NewTransSpiTableGroup;
import com.cloudframe.app.dto.o529351u.CsvcCodeGroup;
import com.cloudframe.app.dto.o529351u.Ioi02bInterface;
import com.cloudframe.app.dto.o529351u.WorkFields;
import com.cloudframe.app.dto.o529351u.DrstRestartDataArea;
import com.cloudframe.app.dto.o529351u.LsSaveRecord1;
import com.cloudframe.app.dto.o529351u.LsSaveRecord3;
import com.cloudframe.app.dto.o529351u.LsSaveRecord4;
import com.cloudframe.app.dto.o529351u.LsSaveRec1Clminf;
import com.cloudframe.app.dto.o529351u.FrontendHdPmtIcnRecord;
import com.cloudframe.app.dto.o529351u.FrontendMedPmtIcnRecord;
import com.cloudframe.app.dto.o529351u.Work;
import com.cloudframe.app.common.CONSTANTS;

@Component("o529351u")
public class O529351uImpl extends CommonProcess implements O529351u {

    Logger logger = LoggerFactory.getLogger(O529351uImpl.class);

    @Autowired
    @Qualifier("d529351u")
    D529351u d529351u;

    /**
     * process
     * Input  : None
     *
     * Output : None
     *
     * @throws CFException
     */
    public int process(O529351uCtx programCtx) throws Exception {
        try {
            setCodePage("1047");
            // Reset program ended flag
            programCtx.setProgramEnded(false);
            // Added variable to get the output context in place.
            ProcessInCtx methodIn = programCtx.getProcessInCtx();
            // cobolCode::PERFORM 0000-MAIN-LINE
            mainLine(programCtx.getMainLineInCtx());
            /*0000-MAIN-LINE*/
            if (programCtx.isProgramEnded()) {
                return programCtx.getRc();
            }
            // cobolCode::PERFORM 0000-EXIT
            exit(programCtx);
            /*0000-EXIT*/
            if (programCtx.isProgramEnded()) {
                return programCtx.getRc();
            }
        } catch (Exception e) {
            handleErrorCode(e);
            throw e;
        }
        // Exit with return code
        return programCtx.getRc();
        // end of process method
    }

    /**
     * mainLine
     *   This method is derived from
     *   COBOL Paragraph - 0000-MAIN-LINE COBOL Cyclomatic complexity - 14
     * Input  :
     *
     * - m51uFunctionFlag               COBOL Name: M51U-FUNCTION-FLAG
     * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
     * - uIcn51                         COBOL Name: LK-51U-ICN
     * - uNbrOfLines51                  COBOL Name: LK-51U-NBR-OF-LINES
     * - sub01                          COBOL Name: LK-SUB
     * - uStopAutoSw51                  COBOL Name: LK-51U-STOP-AUTO-SW
     * - uOutLineCauseCd51              COBOL Name: LK-51U-OUT-LINE-CAUSE-CD
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - w02AbendingProg                COBOL Name: W02-ABENDING-PROG
     * - functionFlag                   COBOL Name: LK-FUNCTION-FLAG
     * - m51uFunctionFlag               COBOL Name: M51U-FUNCTION-FLAG
     * - illogicalCond                  COBOL Name: LK-ILLOGICAL-COND
     * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
     * - w02FnuIcn                      COBOL Name: W02-FNU-ICN
     * - uIcn51                         COBOL Name: LK-51U-ICN
     * - nbrOfLines                     COBOL Name: WS-NBR-OF-LINES
     * - uNbrOfLines51                  COBOL Name: LK-51U-NBR-OF-LINES
     * - sub01                          COBOL Name: LK-SUB
     * - w02DsplErrInd                  COBOL Name: W02-DSPL-ERR-IND
     * - w02DsplMsg                     COBOL Name: W02-DSPL-MSG
     * - uOutCauseCd51                  COBOL Name: LK-51U-OUT-CAUSE-CD
     * - uOutLineCauseCd51              COBOL Name: LK-51U-OUT-LINE-CAUSE-CD
     * - toCauseCdChanged               COBOL Name: WS-TO-CAUSE-CD-CHANGED
     * - uStopAutoSw51                  COBOL Name: LK-51U-STOP-AUTO-SW
     * - chargeCombined                 COBOL Name: WS-CHARGE-COMBINED
     *
     * @throws CFException
     */
    @Override
    public MainLineOutCtx mainLine(MainLineInCtx methodIn) throws Exception {
        // *81 This paragraph is the main section of this program. it       *
        // *81 checks the requests and starts a browse of the special       *
        // *81 processing instructions file.                                *
        // *81***************************************************************
        // *82***************************************************************
        // *82 0000-main-line                                               *
        // *82                                                              *
        // *82 1. examines the request in the linkage area. depending on the*
        // *82    request, either opens or closes the files.                *
        // *82 2. initializes the storage variables, switches and linkage   *
        // *82    variables.                                                *
        // *82 3. examine the service code, charge  amount and plan variable*
        // *82    and start a browse on the special processing instructions *
        // *82    file.                                                     *
        // *82 4. if the auto switch is set to 'z', exit the section.       *
        // *82 5. examine the service code and populate the storage         *
        // *82    variables with the date of service and charge amount      *
        // *82***************************************************************
        // *---------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        MainLineOutCtx methodOut = methodIn.getMainLineOutCtx();
        // LITERAL_0000 = '0000'
        methodOut.setParagraph(CONSTANTS.LITERAL_0000);
        // cobolCode::MOVE 'O529351U' TO W02-ABENDING-PROG
        // LITERAL_O529351U = 'O529351U'
        methodOut.setW02AbendingProg(CONSTANTS.LITERAL_O529351U);
        // *    Set address of lk-vycci-record to m51u-vycci-pointer
        // cobolCode::MOVE M51U-FUNCTION-FLAG TO LK-FUNCTION-FLAG
        methodOut.setFunctionFlag(methodOut.getM51uFunctionFlag());
        // cobolCode::MOVE M51U-ILLOGICAL-COND-SW TO LK-ILLOGICAL-COND
        methodOut.setIllogicalCond(methodOut.getM51uIllogicalCondSw());
        // *    Move cci-main-prog           to w02-main-prog.
        // **   Set address of ppa-ppoalt-record to cci-ppa-ppoalt-rec-ptr.
        // ******get common work area
        // cobolCode::MOVE LK-51U-ICN TO W02-FNU-ICN
        methodOut.setW02FnuIcn(methodOut.getUIcn51());
        // cobolCode::PERFORM 1000-INITIALIZE THRU 1000-EXIT
        initialize(programCtx.getInitializeInCtx());
        /*1000-INITIALIZE*/
        if (programCtx.isProgramEnded()) {
            return methodOut;
        }
        // cobolCode::PERFORM 1800-READ-GEN-SYS-SWITCH THRU 1800-EXIT
        readGenSysSwitch(programCtx);
        /*1800-READ-GEN-SYS-SWITCH SECTION*/
        if (programCtx.isProgramEnded()) {
            return methodOut;
        }
        // cobolCode::IF LK-51U-NBR-OF-LINES NUMERIC
        if (methodIn.getM51uLinkage().uNbrOfLines51IsNumeric()) {
            // *       Move lk-51u-nbr-of-lines to ws-nbr-of-lines.
            // cobolCode::MOVE LK-51U-NBR-OF-LINES TO WS-NBR-OF-LINES
            methodOut.setNbrOfLines(methodOut.getUNbrOfLines51());
            // cobolCode::PERFORM 2000-MAIN-PROCESSING THRU 2000-EXIT VARYING LK-SUB FROM 1 BY 1 UNTIL LK-SUB > WS-NBR-OF-LINES
            for (methodOut.setSub01(1); (methodOut.getSub01() <= methodOut.getNbrOfLines()); methodOut.setSub01(methodOut.getSub01() + 1)) {
                mainProcessing(programCtx.getMainProcessingInCtx());
                /*2000-MAIN-PROCESSING*/
                if (programCtx.isProgramEnded()) {
                    return methodOut;
                }
            }
        } else // cobolCode::ELSE
        {
            // cobolCode::MOVE 'ERR' TO W02-DSPL-ERR-IND
            // LITERAL_ERR = 'ERR'
            methodOut.setW02DsplErrInd(CONSTANTS.LITERAL_ERR);
            // cobolCode::MOVE 'LK-51U-NBR-OF-LINES ERROR' TO W02-DSPL-MSG
            methodOut.setW02DsplMsg(CONSTANTS.LITERAL_956846606);
            // cobolCode::PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
            writeToSysm(programCtx.getWriteToSysmInCtx());
            /*11100A-WRITE-TO-SYSM SECTION*/
            if (programCtx.isProgramEnded()) {
                return methodOut;
            }
            // cobolCode::SET M51U-ILLOGICAL-COND TO TRUE
            methodOut.setM51uIllogicalCondTrue();
            // cobolCode::PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
            dumpAbend(programCtx);
            /*8000-DUMP-ABEND SECTION*/
            if (programCtx.isProgramEnded()) {
                return methodOut;
            }
        }
        // *00347      Perform 2000-main-processing  thru
        // *00348              2000-exit varying lk-sub from 1 by 1
        // *00349              until lk-sub > ws-nbr-of-lines.
        // cobolCode::IF LK-51U-STOP-AUTO-SW = 'Z'
        // LITERAL_Z = 'Z'
        if (compareChars(methodOut.getUStopAutoSw51(), CONSTANTS.LITERAL_Z) == 0) {
            // cobolCode::GO TO 0000-EXIT
            exit(programCtx);
            return methodOut;
            // cobolCodeEnds::GO TO 0000-EXIT
        }
        // cobolCode::MOVE LK-51U-OUT-LINE-CAUSE-CD (1) TO LK-51U-OUT-CAUSE-CD
        methodOut.setUOutCauseCd51(methodOut.getUOutLineCauseCd51(0));
        // cobolCode::MOVE 'N' TO WS-TO-CAUSE-CD-CHANGED
        // LITERAL_N = 'N'
        methodOut.setToCauseCdChanged(CONSTANTS.LITERAL_N);
        // cobolCode::PERFORM VARYING LK-SUB FROM 1 BY 1 UNTIL LK-SUB > WS-NBR-OF-LINES OR TO-CAUSE-CD-CHANGED
        for (methodOut.setSub01(1); ((methodOut.getSub01() <= methodOut.getNbrOfLines()) && !(methodOut.isToCauseCdChanged1())); methodOut.setSub01(methodOut.getSub01() + 1)) {
            // cobolCode::IF LK-51U-OUT-CAUSE-CD = SPACES
            if ((allSpaces(methodOut.getUOutCauseCd51()))) {
                // cobolCode::MOVE LK-51U-OUT-LINE-CAUSE-CD ( LK-SUB ) TO LK-51U-OUT-CAUSE-CD
                methodOut.setUOutCauseCd51(methodOut.getUOutLineCauseCd51(methodOut.getSub01() - 1));
            } else // cobolCode::ELSE
            {
                // cobolCode::IF LK-51U-OUT-LINE-CAUSE-CD ( LK-SUB ) NOT = SPACES
                if ((!allSpaces(methodOut.getUOutLineCauseCd51(methodOut.getSub01() - 1)))) {
                    // cobolCode::IF LK-51U-OUT-LINE-CAUSE-CD ( LK-SUB ) NOT = LK-51U-OUT-CAUSE-CD
                    if (compareChars(methodOut.getUOutLineCauseCd51(methodOut.getSub01() - 1), methodOut.getUOutCauseCd51()) != 0) {
                        // cobolCode::MOVE 'Y' TO WS-TO-CAUSE-CD-CHANGED
                        // LITERAL_Y = 'Y'
                        methodOut.setToCauseCdChanged(CONSTANTS.LITERAL_Y);
                    }
                }
            }
        }
        // cobolCode::IF TO-CAUSE-CD-CHANGED
        if (methodOut.isToCauseCdChanged1()) {
            // cobolCode::MOVE 'X' TO LK-51U-STOP-AUTO-SW
            // LITERAL_X = 'X'
            methodOut.setUStopAutoSw51(CONSTANTS.LITERAL_X);
            // cobolCode::GO TO 0000-EXIT
            exit(programCtx);
            return methodOut;
            // cobolCodeEnds::GO TO 0000-EXIT
        }
        // cobolCode::MOVE 'N' TO WS-CHARGE-COMBINED
        // LITERAL_N = 'N'
        methodOut.setChargeCombined(CONSTANTS.LITERAL_N);
        // cobolCode::PERFORM 2700-CHIRO-PROCESSING THRU 2700-EXIT VARYING LK-SUB FROM 1 BY 1 UNTIL LK-SUB > WS-NBR-OF-LINES
        for (methodOut.setSub01(1); (methodOut.getSub01() <= methodOut.getNbrOfLines()); methodOut.setSub01(methodOut.getSub01() + 1)) {
            chiroProcessing(programCtx.getChiroProcessingInCtx());
            /*2700-CHIRO-PROCESSING*/
            if (programCtx.isProgramEnded()) {
                return methodOut;
            }
        }
        return methodOut;
    }

    /**
     * exit
     *   This method is derived from
     *   COBOL Paragraph - 0000-EXIT COBOL Cyclomatic complexity - 3
     * Input  : None
     *
     * Output : None
     *
     * @throws CFException
     */
    @Override
    public void exit(O529351uCtx programCtx) throws Exception {
        // cobolCode::GOBACK
        // no need to log, it is a normal termination
        setNotLogged(false);
        programCtx.setProgramEnded(true);
        return;
    }

    /**
     * initialize
     *   This method is derived from
     *   COBOL Paragraph - 1000-INITIALIZE COBOL Cyclomatic complexity - 5
     * Input  :
     *
     * - sub                            COBOL Name: WS-SUB
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - uStopAutoSw51                  COBOL Name: LK-51U-STOP-AUTO-SW
     * - endOfSpiRule                   COBOL Name: WS-END-OF-SPI-RULE
     * - endOfPlanAlt                   COBOL Name: WS-END-OF-PLAN-ALT
     * - planVarFoundSw                 COBOL Name: WS-PLAN-VAR-FOUND-SW
     * - newPlanVarFoundSw              COBOL Name: WS-NEW-PLAN-VAR-FOUND-SW
     * - sub                            COBOL Name: WS-SUB
     * - fesaPolicy01                   COBOL Name: WS-FESA-POLICY
     * - fesaSpiPriDiagInd              COBOL Name: WS-FESA-SPI-PRI-DIAG-IND
     * - fesaSpiDiagElgInd              COBOL Name: WS-FESA-SPI-DIAG-ELG-IND
     * - fesaPlanVar01                  COBOL Name: WS-FESA-PLAN-VAR
     * - fesaEffDate01                  COBOL Name: WS-FESA-EFF-DATE
     * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
     * - fesaPosTierCd                  COBOL Name: WS-FESA-POS-TIER-CD
     * - uOutLinePos51                  COBOL Name: LK-51U-OUT-LINE-POS
     * - uOutLineServiceCode51          COBOL Name: LK-51U-OUT-LINE-SERVICE-CODE
     * - uOutLineRemarkCd51             COBOL Name: LK-51U-OUT-LINE-REMARK-CD
     * - uOutLineCauseCd51              COBOL Name: LK-51U-OUT-LINE-CAUSE-CD
     * - uOutLineDosDate51              COBOL Name: LK-51U-OUT-LINE-DOS-DATE
     * - uOutLineChargeAmt51            COBOL Name: LK-51U-OUT-LINE-CHARGE-AMT
     * - uOutLineNotcovAmt51            COBOL Name: LK-51U-OUT-LINE-NOTCOV-AMT
     * - uOutLineAppUnits51             COBOL Name: LK-51U-OUT-LINE-APP-UNITS
     * - holdPs                         COBOL Name: WS-HOLD-PS
     * - uOutCauseCd51                  COBOL Name: LK-51U-OUT-CAUSE-CD
     * - holdSvc                        COBOL Name: WS-HOLD-SVC
     * - holdCauseCd                    COBOL Name: WS-HOLD-CAUSE-CD
     * - polNo                          COBOL Name: WS-POL-NO
     * - holdSpiTblId                   COBOL Name: WS-HOLD-SPI-TBL-ID
     * - holdPosTierCd                  COBOL Name: WS-HOLD-POS-TIER-CD
     * - holdDiagElgInd                 COBOL Name: WS-HOLD-DIAG-ELG-IND
     * - fcndPs                         COBOL Name: WS-FCND-PS
     * - fcndSvc                        COBOL Name: WS-FCND-SVC
     * - fcndCauseCd                    COBOL Name: WS-FCND-CAUSE-CD
     * - frtoPs                         COBOL Name: WS-FRTO-PS
     * - frtoSvc                        COBOL Name: WS-FRTO-SVC
     * - frtoCauseCd                    COBOL Name: WS-FRTO-CAUSE-CD
     * - ptypPs                         COBOL Name: WS-PTYP-PS
     * - ptypSvc                        COBOL Name: WS-PTYP-SVC
     * - ptypCauseCd                    COBOL Name: WS-PTYP-CAUSE-CD
     * - ricdPs                         COBOL Name: WS-RICD-PS
     * - ricdSvc                        COBOL Name: WS-RICD-SVC
     * - ricdCauseCd                    COBOL Name: WS-RICD-CAUSE-CD
     * - causPs                         COBOL Name: WS-CAUS-PS
     * - causSvc                        COBOL Name: WS-CAUS-SVC
     * - causCauseCd                    COBOL Name: WS-CAUS-CAUSE-CD
     * - ripaPs                         COBOL Name: WS-RIPA-PS
     * - ripaSvc                        COBOL Name: WS-RIPA-SVC
     * - ripaCauseCd                    COBOL Name: WS-RIPA-CAUSE-CD
     * - cflgPs                         COBOL Name: WS-CFLG-PS
     * - cflgSvc                        COBOL Name: WS-CFLG-SVC
     * - cflgCauseCd                    COBOL Name: WS-CFLG-CAUSE-CD
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - nbrMatchedPrev                 COBOL Name: WS-NBR-MATCHED-PREV
     * - planVarPrev                    COBOL Name: WS-PLAN-VAR-PREV
     * - newPlanVarPrev                 COBOL Name: WS-NEW-PLAN-VAR-PREV
     * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
     * - nbrOfNewPlanVar                COBOL Name: WS-NBR-OF-NEW-PLAN-VAR
     * - nbrOfLines                     COBOL Name: WS-NBR-OF-LINES
     * - psSub                          COBOL Name: PS-SUB
     * - svcSub                         COBOL Name: SVC-SUB
     * - pvSub                          COBOL Name: PV-SUB
     * - icd9Sub                        COBOL Name: ICD9-SUB
     * - causeSub                       COBOL Name: CAUSE-SUB
     * - sub01                          COBOL Name: LK-SUB
     * - cflgSub                        COBOL Name: CFLG-SUB
     * - diagSub                        COBOL Name: WS-DIAG-SUB
     * - d51uTestValues                 COBOL Name: D51U-TEST-VALUES
     *
     * @throws CFException
     */
    @Override
    public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 1000-Initialize                                              *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 initializes the switches, return variables, and subscripts   *
        // *81 used in the program.                                         *
        // *81***************************************************************
        // *82***************************************************************
        // *82 1000-initialize                                              *
        // *82                                                              *
        // *82 1. initialize the switches in the storage area to 'n'.       *
        // *82 2. initialize the plan record variables with spaces          *
        // *82 3. populate the line data in the linkage section with spaces/*
        // *82    zeros.                                                    *
        // *82 4. populate the storages variables with spaces/zeroes.       *
        // *82 5. initialize the subscript variables with '1'.              *
        // *82***************************************************************
        // *----------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        InitializeOutCtx methodOut = methodIn.getInitializeOutCtx();
        // LITERAL_1000 = '1000'
        methodOut.setParagraph(CONSTANTS.LITERAL_1000);
        // cobolCode::MOVE 'N' TO LK-51U-STOP-AUTO-SW WS-END-OF-SPI-RULE WS-END-OF-PLAN-ALT WS-PLAN-VAR-FOUND-SW WS-NEW-PLAN-VAR-FOUND-SW
        // LITERAL_N = 'N'
        methodOut.setUStopAutoSw51(CONSTANTS.LITERAL_N);
        methodOut.setEndOfSpiRule(CONSTANTS.LITERAL_N);
        methodOut.setEndOfPlanAlt(CONSTANTS.LITERAL_N);
        methodOut.setPlanVarFoundSw(CONSTANTS.LITERAL_N);
        methodOut.setNewPlanVarFoundSw(CONSTANTS.LITERAL_N);
        // cobolCode::PERFORM VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > 9999
        for (methodOut.setSub(1); ((methodOut.getSub() <= 9999)); methodOut.setSub(methodOut.getSub() + 1)) {
            // ****     Until ws-sub > 25
            // *45917z  until ws-sub > 50
            // cobolCode::MOVE SPACES TO WS-FESA-POLICY ( WS-SUB ) WS-FESA-SPI-PRI-DIAG-IND ( WS-SUB ) WS-FESA-SPI-DIAG-ELG-IND ( WS-SUB )
            methodOut.setFesaPolicy01(methodOut.getSub() - 1, CONSTANTS.SPACE_6);
            methodOut.setFesaSpiPriDiagInd(methodOut.getSub() - 1, CONSTANTS.SPACE);
            methodOut.setFesaSpiDiagElgInd(methodOut.getSub() - 1, CONSTANTS.SPACE);
            // cobolCode::MOVE ZEROS TO WS-FESA-PLAN-VAR ( WS-SUB ) WS-FESA-EFF-DATE ( WS-SUB ) WS-FESA-SPI-NBR ( WS-SUB )
            methodOut.setFesaPlanVar01(methodOut.getSub() - 1, 0);
            methodOut.setFesaEffDate01(methodOut.getSub() - 1, 0);
            methodOut.setFesaSpiNbr01(methodOut.getSub() - 1, 0);
            // cobolCode::MOVE SPACES TO WS-FESA-POS-TIER-CD ( WS-SUB )
            methodOut.setFesaPosTierCd(methodOut.getSub() - 1, CONSTANTS.SPACE);
        }
        // cobolCode::PERFORM VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > 120
        for (methodOut.setSub(1); ((methodOut.getSub() <= 120)); methodOut.setSub(methodOut.getSub() + 1)) {
            // cobolCode::MOVE SPACES TO LK-51U-OUT-LINE-POS ( WS-SUB ) LK-51U-OUT-LINE-SERVICE-CODE ( WS-SUB ) LK-51U-OUT-LINE-REMARK-CD ( WS-SUB ) LK-51U-OUT-LINE-CAUSE-CD ( WS-SUB )
            methodOut.setUOutLinePos51(methodOut.getSub() - 1, CONSTANTS.SPACE_2);
            methodOut.setUOutLineServiceCode51(methodOut.getSub() - 1, CONSTANTS.SPACE_6);
            methodOut.setUOutLineRemarkCd51(methodOut.getSub() - 1, CONSTANTS.SPACE_3);
            methodOut.setUOutLineCauseCd51(methodOut.getSub() - 1, CONSTANTS.SPACE);
            // cobolCode::MOVE ZEROS TO LK-51U-OUT-LINE-DOS-DATE ( WS-SUB ) LK-51U-OUT-LINE-CHARGE-AMT ( WS-SUB ) LK-51U-OUT-LINE-NOTCOV-AMT ( WS-SUB ) LK-51U-OUT-LINE-APP-UNITS ( WS-SUB )
            methodOut.setUOutLineDosDate51(methodOut.getSub() - 1, 0);
            methodOut.setUOutLineChargeAmt51(methodOut.getSub() - 1, BigDecimal.ZERO);
            methodOut.setUOutLineNotcovAmt51(methodOut.getSub() - 1, BigDecimal.ZERO);
            methodOut.setUOutLineAppUnits51(methodOut.getSub() - 1, 0);
        }
        // cobolCode::MOVE SPACES TO WS-HOLD-PS LK-51U-OUT-CAUSE-CD WS-HOLD-SVC WS-HOLD-CAUSE-CD WS-POL-NO WS-HOLD-SPI-TBL-ID WS-HOLD-POS-TIER-CD WS-HOLD-DIAG-ELG-IND WS-FCND-PS WS-FCND-SVC WS-FCND-CAUSE-CD WS-FRTO-PS WS-FRTO-SVC WS-FRTO-CAUSE-CD WS-PTYP-PS WS-PTYP-SVC WS-PTYP-CAUSE-CD WS-RICD-PS WS-RICD-SVC WS-RICD-CAUSE-CD WS-CAUS-PS WS-CAUS-SVC WS-CAUS-CAUSE-CD WS-RIPA-PS WS-RIPA-SVC WS-RIPA-CAUSE-CD WS-CFLG-PS WS-CFLG-SVC WS-CFLG-CAUSE-CD
        methodOut.setHoldPs(CONSTANTS.SPACE_2);
        methodOut.setUOutCauseCd51(CONSTANTS.SPACE);
        methodOut.setHoldSvc(CONSTANTS.SPACE_6);
        methodOut.setHoldCauseCd(CONSTANTS.SPACE);
        methodOut.setPolNo(CONSTANTS.SPACE_6);
        methodOut.setHoldSpiTblId(CONSTANTS.SPACE_7);
        methodOut.setHoldPosTierCd(CONSTANTS.SPACE);
        methodOut.setHoldDiagElgInd(CONSTANTS.SPACE);
        methodOut.setFcndPs(CONSTANTS.SPACE_2);
        methodOut.setFcndSvc(CONSTANTS.SPACE_6);
        methodOut.setFcndCauseCd(CONSTANTS.SPACE);
        methodOut.setFrtoPs(CONSTANTS.SPACE_2);
        methodOut.setFrtoSvc(CONSTANTS.SPACE_6);
        methodOut.setFrtoCauseCd(CONSTANTS.SPACE);
        methodOut.setPtypPs(CONSTANTS.SPACE_2);
        methodOut.setPtypSvc(CONSTANTS.SPACE_6);
        methodOut.setPtypCauseCd(CONSTANTS.SPACE);
        methodOut.setRicdPs(CONSTANTS.SPACE_2);
        methodOut.setRicdSvc(CONSTANTS.SPACE_6);
        methodOut.setRicdCauseCd(CONSTANTS.SPACE);
        methodOut.setCausPs(CONSTANTS.SPACE_2);
        methodOut.setCausSvc(CONSTANTS.SPACE_6);
        methodOut.setCausCauseCd(CONSTANTS.SPACE);
        methodOut.setRipaPs(CONSTANTS.SPACE_2);
        methodOut.setRipaSvc(CONSTANTS.SPACE_6);
        methodOut.setRipaCauseCd(CONSTANTS.SPACE);
        methodOut.setCflgPs(CONSTANTS.SPACE_2);
        methodOut.setCflgSvc(CONSTANTS.SPACE_6);
        methodOut.setCflgCauseCd(CONSTANTS.SPACE);
        // cobolCode::MOVE ZEROS TO WS-NBR-MATCHED WS-NBR-MATCHED-PREV WS-PLAN-VAR-PREV WS-NEW-PLAN-VAR-PREV WS-NBR-OF-PLAN-VAR WS-NBR-OF-NEW-PLAN-VAR WS-NBR-OF-LINES
        methodOut.setNbrMatched(0);
        methodOut.setNbrMatchedPrev(0);
        methodOut.setPlanVarPrev((short) 0);
        methodOut.setNewPlanVarPrev((short) 0);
        methodOut.setNbrOfPlanVar(0);
        methodOut.setNbrOfNewPlanVar(0);
        methodOut.setNbrOfLines(0);
        // cobolCode::MOVE 1 TO WS-SUB PS-SUB SVC-SUB PV-SUB ICD9-SUB CAUSE-SUB LK-SUB CFLG-SUB WS-DIAG-SUB
        // LITERAL_1 = 1
        methodOut.setSub(1);
        methodOut.setPsSub(1);
        methodOut.setSvcSub(1);
        methodOut.setPvSub(1);
        methodOut.setIcd9Sub(1);
        methodOut.setCauseSub(1);
        methodOut.setSub01(1);
        methodOut.setCflgSub(1);
        methodOut.setDiagSub(1);
        // cobolCode::INITIALIZE D51U-TEST-VALUES REPLACING ALPHANUMERIC BY SPACES
        methodOut.getD51uTestValues().initialize();
        return methodOut;
    }

    /**
     * readEqi
     *   This method is derived from
     *   COBOL Paragraph - 1500-READ-EQI COBOL Cyclomatic complexity - 3
     * Input  :
     *
     * - lsEqiRecord                    COBOL Name: LS-EQI-RECORD
     *
     * Output :
     *
     * - eqiAltId                       COBOL Name: WS-EQI-ALT-ID
     * - dfhb0020                       COBOL Name: DFHB0020
     * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
     * - dfhb0021                       COBOL Name: DFHB0021
     * - eqiRecord                      COBOL Name: EQI-RECORD
     * - lsEqiRecord                    COBOL Name: LS-EQI-RECORD
     *
     * @throws CFException
     */
    @Override
    public ReadEqiOutCtx readEqi(ReadEqiInCtx methodIn) throws Exception {
        // Declare local variables used in the method
        final int LS_EQI_RECORD_LENGTH = 48;
        // End of variable declaration
        // *81***************************************************************
        // *81 1500-Read-eqi                                                *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 reads service code equate initiate file from beginning with  *
        // *81 key passed from calling program.                             *
        // *81***************************************************************
        // *82***************************************************************
        // *82 1500-read-eqi                                                *
        // *82                                                              *
        // *82 1. populates service code equate initiate record from linkage*
        // *82    section record obtained from calling program.             *
        // *82 2. browses service code equate initiate file from the        *
        // *82    beginning.                                                *
        // *82 3. validates the file status code. when unsuccessful read,   *
        // *82    exits the section.                                        *
        // *82 4. reads service code equate initiate file                   *
        // *82 5. when file status code is '00' populates service code      *
        // *82    equate initiate file record to linkage section record to  *
        // *82    pass to calling program.                                  *
        // *82***************************************************************
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        ReadEqiOutCtx methodOut = methodIn.getReadEqiOutCtx();
        // cobolCode::MOVE 'U' TO WS-EQI-ALT-ID
        // LITERAL_U = 'U'
        methodOut.setEqiAltId(CONSTANTS.LITERAL_U);
        // *EXEC CICS STARTBR
        // *    FILE      (WS-DD-EQIS-ALT)
        // *    RIDFLD    (SCE-ALT-KEY)
        // *    KEYLENGTH (LENGTH OF SCE-ALT-KEY)
        // *    RESP      (CICS-DFHRESP-CODE)
        // *END-EXEC.
        // cobolCode::MOVE LENGTH OF SCE-ALT-KEY TO DFHB0020
        methodOut.setDfhb0020(SceAltKey.getSceAltKeyFieldLength());
        // cobolCode::STARTBR FILE (WS-DD-EQIS-ALT) RIDFLD (SCE-ALT-KEY) KEYLENGTH (FUNCTION~LENGTH~SCE-ALT-KEY) RESP (CICS-DFHRESP-CODE)
        // start Browsing a file
        TransactionManager.startBrowsing(programCtx.getCicsSession(), methodIn.getDdEqisAlt().toCharArray(), methodIn.getSceAltKey().toCharArray(), "".toCharArray(), /*reqId*/
        "".toCharArray(), /*sysId*/
        SceAltKey.getSceAltKeyFieldLength(), false, /*debkey*/
        false, /*debrec*/
        false, /*rba*/
        false, /*rrn*/
        false, /*xrba*/
        false, /*gteq*/
        false, /*equal*/
        false, /*generic*/
        new KeyInfo(17, 11, 0, false));
        // cobolCode::MOVE EIBRESP TO CICS-DFHRESP-CODE
        methodOut.setCicsDfhrespCode(programCtx.getCicsSession().getEibresp());
        // *    If not ioi-02b-good
        // cobolCode::IF NOT CICS-NORMAL
        if (!(methodOut.isCicsNormal())) {
            // cobolCode::GO TO 1500-X
            return methodOut;
            // cobolCodeEnds::GO TO 1500-X
        }
        // *EXEC CICS READNEXT
        // *    FILE      (WS-DD-EQIS-ALT)
        // *    SET       (ADDRESS OF LS-EQI-RECORD)
        // *    RIDFLD    (SCE-ALT-KEY)
        // *    KEYLENGTH (LENGTH OF SCE-ALT-KEY)
        // *    LENGTH    (LENGTH OF LS-EQI-RECORD)
        // *    RESP      (CICS-DFHRESP-CODE)
        // *END-EXEC.
        // cobolCode::MOVE LENGTH OF LS-EQI-RECORD TO DFHB0020
        methodOut.setDfhb0020(LS_EQI_RECORD_LENGTH);
        // cobolCode::MOVE LENGTH OF SCE-ALT-KEY TO DFHB0021
        methodOut.setDfhb0021(SceAltKey.getSceAltKeyFieldLength());
        // cobolCode::READNEXT FILE (WS-DD-EQIS-ALT) SET (ADDRESS OF LS-EQI-RECORD) RIDFLD (SCE-ALT-KEY) KEYLENGTH (FUNCTION~LENGTH~SCE-ALT-KEY) LENGTH (FUNCTION~LENGTH~LS-EQI-RECORD) RESP (CICS-DFHRESP-CODE)
        // read the next record from a file
        methodOut.setLsEqiRecord(TransactionManager.readNextRecord(programCtx.getCicsSession(), methodIn.getDdEqisAlt().toCharArray(), methodIn.getSceAltKey().toCharArray(), "".toCharArray(), /*Token*/
        "".toCharArray(), /*SysId*/
        SceAltKey.getSceAltKeyFieldLength(), LS_EQI_RECORD_LENGTH, "".toCharArray(), /*ReqId*/
        false, /*rba*/
        false, /*rrn*/
        false, /*xrba*/
        false, /*nosuspend*/
        false, /*uncommitted*/
        false, /*consistent*/
        false, /*repeatable*/
        false).toCharArray());
        // cobolCode::MOVE EIBRESP TO CICS-DFHRESP-CODE
        methodOut.setCicsDfhrespCode(programCtx.getCicsSession().getEibresp());
        // *    If ioi-02b-good
        // *     Set  address of ls-eqi-record to ioi-02b-passed-rec-ptr
        // cobolCode::IF CICS-NORMAL
        if (methodOut.isCicsNormal()) {
            // cobolCode::MOVE LS-EQI-RECORD TO EQI-RECORD
            methodOut.getEqiRecord().setString(methodOut.getLsEqiRecord());
        }
        // cobolCode::ENDBR FILE (WS-DD-EQIS-ALT) RESP (CICS-DFHRESP-CODE)
        // end browsing the file
        TransactionManager.endBrowsing(programCtx.getCicsSession(), methodIn.getDdEqisAlt().toCharArray(), "".toCharArray(), /*sysId*/
        "".toCharArray());
        // cobolCode::MOVE EIBRESP TO CICS-DFHRESP-CODE
        methodOut.setCicsDfhrespCode(programCtx.getCicsSession().getEibresp());
        return methodOut;
    }

    /**
     * mainProcessing
     *   This method is derived from
     *   COBOL Paragraph - 2000-MAIN-PROCESSING COBOL Cyclomatic complexity - 25
     * Input  :
     *
     * - uCcmNOSvcInd51                 COBOL Name: LK-51U-CCM-N-O-SVC-IND
     * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
     * - uLineChargeAmt51               COBOL Name: LK-51U-LINE-CHARGE-AMT
     * - uLineNotcovAmt51               COBOL Name: LK-51U-LINE-NOTCOV-AMT
     * - sub01                          COBOL Name: LK-SUB
     * - uPolicyNo51                    COBOL Name: LK-51U-POLICY-NO
     * - polNo                          COBOL Name: WS-POL-NO
     * - uPlanVar51                     COBOL Name: LK-51U-PLAN-VAR
     * - planVarPrev                    COBOL Name: WS-PLAN-VAR-PREV
     * - planVarFoundSw                 COBOL Name: WS-PLAN-VAR-FOUND-SW
     * - primeSpiSw                     COBOL Name: WS-PRIME-SPI-SW
     * - xrfPlcyCm                      COBOL Name: XRF-PLCY-CM
     * - xrfDivCm                       COBOL Name: XRF-DIV-CM
     * - nbrOfLines                     COBOL Name: WS-NBR-OF-LINES
     * - medSvc                         COBOL Name: MED-SVC
     * - cls15                          COBOL Name: CLS-1-5
     * - ckServCls                      COBOL Name: CK-SERV-CLS
     * - newSpiSw                       COBOL Name: WS-NEW-SPI-SW
     * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
     * - holdPs                         COBOL Name: WS-HOLD-PS
     * - holdSvc                        COBOL Name: WS-HOLD-SVC
     * - holdCauseCd                    COBOL Name: WS-HOLD-CAUSE-CD
     * - holdSpiTblId                   COBOL Name: WS-HOLD-SPI-TBL-ID
     * - holdPosTierCd                  COBOL Name: WS-HOLD-POS-TIER-CD
     * - holdDiagElgInd                 COBOL Name: WS-HOLD-DIAG-ELG-IND
     * - uLineAppUnits51                COBOL Name: LK-51U-LINE-APP-UNITS
     * - uLineDosDate51                 COBOL Name: LK-51U-LINE-DOS-DATE
     *
     * Output :
     *
     * - newServiceCode                 COBOL Name: WS-NEW-SERVICE-CODE
     * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - nbrEqual                       COBOL Name: WS-NBR-EQUAL
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - nbrMatchedPrev                 COBOL Name: WS-NBR-MATCHED-PREV
     * - sub                            COBOL Name: WS-SUB
     * - holdServCd                     COBOL Name: WS-HOLD-SERV-CD
     * - mmiFoundSw                     COBOL Name: WS-MMI-FOUND-SW
     * - withMmiSw2010                  COBOL Name: WS-2010-WITH-MMI-SW
     * - uSlotPlanVar51                 COBOL Name: LK-51U-SLOT-PLAN-VAR
     * - uSlotPolicyNo51                COBOL Name: LK-51U-SLOT-POLICY-NO
     * - polNo                          COBOL Name: WS-POL-NO
     * - xrfPlcyCm                      COBOL Name: XRF-PLCY-CM
     * - planVarPrev                    COBOL Name: WS-PLAN-VAR-PREV
     * - xrfDivCm                       COBOL Name: XRF-DIV-CM
     * - hold51uPolicy                  COBOL Name: WS-HOLD-51U-POLICY
     * - uPolicyNo51                    COBOL Name: LK-51U-POLICY-NO
     * - hold51uPlan                    COBOL Name: WS-HOLD-51U-PLAN
     * - uPlanVar51                     COBOL Name: LK-51U-PLAN-VAR
     * - sub01                          COBOL Name: LK-SUB
     * - nbrOfLines                     COBOL Name: WS-NBR-OF-LINES
     * - uOutLinePos51                  COBOL Name: LK-51U-OUT-LINE-POS
     * - holdPs                         COBOL Name: WS-HOLD-PS
     * - uOutLineServiceCode51          COBOL Name: LK-51U-OUT-LINE-SERVICE-CODE
     * - holdSvc                        COBOL Name: WS-HOLD-SVC
     * - uOutLineCauseCd51              COBOL Name: LK-51U-OUT-LINE-CAUSE-CD
     * - holdCauseCd                    COBOL Name: WS-HOLD-CAUSE-CD
     * - uSpiTblId51                    COBOL Name: LK-51U-SPI-TBL-ID
     * - holdSpiTblId                   COBOL Name: WS-HOLD-SPI-TBL-ID
     * - uOutSpiTblId51                 COBOL Name: LK-51U-OUT-SPI-TBL-ID
     * - uOutPosTierCd51                COBOL Name: LK-51U-OUT-POS-TIER-CD
     * - holdPosTierCd                  COBOL Name: WS-HOLD-POS-TIER-CD
     * - uOutDiagElgInd51               COBOL Name: LK-51U-OUT-DIAG-ELG-IND
     * - holdDiagElgInd                 COBOL Name: WS-HOLD-DIAG-ELG-IND
     * - uOutLineAppUnits51             COBOL Name: LK-51U-OUT-LINE-APP-UNITS
     * - uLineAppUnits51                COBOL Name: LK-51U-LINE-APP-UNITS
     * - uOutLineChargeAmt51            COBOL Name: LK-51U-OUT-LINE-CHARGE-AMT
     * - uLineChargeAmt51               COBOL Name: LK-51U-LINE-CHARGE-AMT
     * - uOutLineNotcovAmt51            COBOL Name: LK-51U-OUT-LINE-NOTCOV-AMT
     * - uLineNotcovAmt51               COBOL Name: LK-51U-LINE-NOTCOV-AMT
     * - uOutLineDosDate51              COBOL Name: LK-51U-OUT-LINE-DOS-DATE
     * - uLineDosDate51                 COBOL Name: LK-51U-LINE-DOS-DATE
     * - fcndPs                         COBOL Name: WS-FCND-PS
     * - fcndSvc                        COBOL Name: WS-FCND-SVC
     * - fcndCauseCd                    COBOL Name: WS-FCND-CAUSE-CD
     * - frtoPs                         COBOL Name: WS-FRTO-PS
     * - frtoSvc                        COBOL Name: WS-FRTO-SVC
     * - frtoCauseCd                    COBOL Name: WS-FRTO-CAUSE-CD
     * - ptypPs                         COBOL Name: WS-PTYP-PS
     * - ptypSvc                        COBOL Name: WS-PTYP-SVC
     * - ptypCauseCd                    COBOL Name: WS-PTYP-CAUSE-CD
     * - ricdPs                         COBOL Name: WS-RICD-PS
     * - ricdSvc                        COBOL Name: WS-RICD-SVC
     * - ricdCauseCd                    COBOL Name: WS-RICD-CAUSE-CD
     * - causPs                         COBOL Name: WS-CAUS-PS
     * - causSvc                        COBOL Name: WS-CAUS-SVC
     * - causCauseCd                    COBOL Name: WS-CAUS-CAUSE-CD
     * - ripaPs                         COBOL Name: WS-RIPA-PS
     * - ripaSvc                        COBOL Name: WS-RIPA-SVC
     * - ripaCauseCd                    COBOL Name: WS-RIPA-CAUSE-CD
     * - cflgPs                         COBOL Name: WS-CFLG-PS
     * - cflgSvc                        COBOL Name: WS-CFLG-SVC
     * - cflgCauseCd                    COBOL Name: WS-CFLG-CAUSE-CD
     * - endOfSpiRule                   COBOL Name: WS-END-OF-SPI-RULE
     * - uStopAutoSw51                  COBOL Name: LK-51U-STOP-AUTO-SW
     *
     * @throws CFException
     */
    @Override
    public MainProcessingOutCtx mainProcessing(MainProcessingInCtx methodIn) throws Exception {
        // *82    Read eqi file to obtain the service code. this is done by *
        // *82    calling vp055a00 program.                                 *
        // *82 8. if the service line matched to the same number of items on*
        // *82    more than one spi(special processing instructions) rule,  *
        // *82    it will not apply any special processing instructions.    *
        // *82    therefore turn off the auto switch.                       *
        // *82    else populate the respective linkage section variables    *
        // *82    with,place of service, service code,cause code,applicable *
        // *82    units, charge amount, not covered amount and date of      *
        // *82    service. also initialize the storage variables            *
        // *82***************************************************************
        // *--------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        MainProcessingOutCtx methodOut = methodIn.getMainProcessingOutCtx();
        // cobolCode::IF LK-51U-CCM-N-O-SVC-IND = 'O'
        // LITERAL_O = 'O'
        if (compareChars(methodIn.getUCcmNOSvcInd51(), CONSTANTS.LITERAL_O) == 0) {
            // cobolCode::MOVE LK-51U-LINE-SERVICE-CODE ( LK-SUB ) TO WS-NEW-SERVICE-CODE
            methodOut.setNewServiceCode(methodOut.getULineServiceCode51(methodOut.getSub01() - 1));
            // cobolCode::IF NEW-SVC-CD
            if (methodOut.isNewSvcCd()) {
                // cobolCode::GO TO 2000-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 2000-EXIT
            }
        }
        // LITERAL_2000 = '2000'
        methodOut.setParagraph(CONSTANTS.LITERAL_2000);
        // cobolCode::MOVE SPACES TO WS-NBR-EQUAL
        methodOut.setNbrEqual(CONSTANTS.SPACE);
        // cobolCode::MOVE ZEROS TO WS-NBR-MATCHED WS-NBR-MATCHED-PREV
        methodOut.setNbrMatched(0);
        methodOut.setNbrMatchedPrev(0);
        // cobolCode::MOVE 1 TO WS-SUB
        // LITERAL_1 = 1
        methodOut.setSub(1);
        // cobolCode::MOVE LK-51U-LINE-SERVICE-CODE ( LK-SUB ) TO WS-HOLD-SERV-CD
        methodOut.setHoldServCd(methodOut.getULineServiceCode51(methodOut.getSub01() - 1));
        // cobolCode::IF INFORMATIONAL-SERV-CD
        if (methodOut.isInformationalServCd()) {
            // cobolCode::GO TO 2000-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 2000-EXIT
        }
        // cobolCode::IF LK-51U-LINE-CHARGE-AMT ( LK-SUB ) = LK-51U-LINE-NOTCOV-AMT ( LK-SUB )
        if ((methodOut.getULineChargeAmt51(methodOut.getSub01() - 1).compareTo(methodOut.getULineNotcovAmt51(methodOut.getSub01() - 1)) == 0)) {
            // cobolCode::GO TO 2000-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 2000-EXIT
        }
        // cobolCode::IF LK-51U-POLICY-NO = WS-POL-NO AND LK-51U-PLAN-VAR = WS-PLAN-VAR-PREV
        if (compareChars(methodOut.getUPolicyNo51(), methodOut.getPolNo()) == 0 && (methodOut.getUPlanVar51() == methodOut.getPlanVarPrev())) {
            // cobolCode::IF PLAN-VAR-FOUND
            // cobolCode::ELSE
            if (!(methodIn.isPlanVarFound())) {
                // cobolCode::GO TO 2000-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 2000-EXIT
            }
        } else // cobolCode::ELSE
        {
            // SPACE = ' '
            methodOut.setMmiFoundSw(CONSTANTS.SPACE);
            // SPACE = ' '
            methodOut.setWithMmiSw2010(CONSTANTS.SPACE);
            // cobolCode::IF FE-PRIME-SPI-TURNED-OFF
            if (methodIn.isFePrimeSpiTurnedOff()) {
                // cobolCode::MOVE ZEROES TO LK-51U-SLOT-PLAN-VAR
                methodOut.setUSlotPlanVar51((short) 0);
                // cobolCode::MOVE SPACES TO LK-51U-SLOT-POLICY-NO
                methodOut.setUSlotPolicyNo51(CONSTANTS.SPACE_6);
            }
            // *If not valued, skip over prime spi logic
            // cobolCode::IF LK-51U-SLOT-PLAN-VAR > ZEROES AND LK-51U-SLOT-POLICY-NO > SPACES
            if ((methodOut.getUSlotPlanVar51() > 0) && (isGreaterThanSpaces(methodOut.getUSlotPolicyNo51()))) {
                // *Get model policy and plan and try to read spi with it
                // cobolCode::MOVE XRF-PLCY-CM TO WS-POL-NO
                methodOut.setPolNo(methodOut.getXrfPlcyCm());
                // cobolCode::MOVE XRF-DIV-CM TO WS-PLAN-VAR-PREV
                methodOut.setPlanVarPrev(methodOut.getXrfDivCm());
                // cobolCode::MOVE LK-51U-POLICY-NO TO WS-HOLD-51U-POLICY
                methodOut.setHold51uPolicy(methodOut.getUPolicyNo51());
                // cobolCode::MOVE LK-51U-PLAN-VAR TO WS-HOLD-51U-PLAN
                methodOut.setHold51uPlan(methodOut.getUPlanVar51());
                // cobolCode::MOVE XRF-PLCY-CM TO LK-51U-POLICY-NO
                methodOut.setUPolicyNo51(methodOut.getXrfPlcyCm());
                // cobolCode::MOVE XRF-DIV-CM TO LK-51U-PLAN-VAR
                methodOut.setUPlanVar51(methodOut.getXrfDivCm());
                // cobolCode::SET 2010-WITH-MMI-POL TO TRUE
                methodOut.setWithMmiPol2010True();
                // cobolCode::PERFORM 2010-READ-PLAN-ALT-FILE THRU 2010-EXIT
                readPlanAltFile(programCtx.getReadPlanAltFileInCtx());
                /*2010-READ-PLAN-ALT-FILE*/
                // cobolCode::IF MMI-ALT-NOT-FOUND OR ( PLAN-VAR-NOT-FOUND )
                if (methodOut.isMmiAltNotFound() || (methodIn.isPlanVarNotFound())) {
                    // *Not found with model, use orig value passed in linkage
                    // *Not found with model, use orig value passed in linkage
                    // SPACE = ' '
                    methodOut.setMmiFoundSw(CONSTANTS.SPACE);
                    // SPACE = ' '
                    methodOut.setWithMmiSw2010(CONSTANTS.SPACE);
                    // cobolCode::MOVE WS-HOLD-51U-POLICY TO LK-51U-POLICY-NO
                    methodOut.setUPolicyNo51(methodOut.getHold51uPolicy());
                    // cobolCode::MOVE WS-HOLD-51U-PLAN TO LK-51U-PLAN-VAR
                    methodOut.setUPlanVar51((short) methodOut.getHold51uPlan());
                    // cobolCode::MOVE LK-51U-POLICY-NO TO WS-POL-NO
                    methodOut.setPolNo(methodOut.getUPolicyNo51());
                    // cobolCode::MOVE LK-51U-PLAN-VAR TO WS-PLAN-VAR-PREV
                    methodOut.setPlanVarPrev(methodOut.getUPlanVar51());
                    // cobolCode::PERFORM 2010-READ-PLAN-ALT-FILE THRU 2010-EXIT
                    readPlanAltFile(programCtx.getReadPlanAltFileInCtx());
                    /*2010-READ-PLAN-ALT-FILE*/
                }
            } else // cobolCode::ELSE
            {
                // ***** Fixed alignment on lines below *******
                // cobolCode::MOVE LK-51U-POLICY-NO TO WS-POL-NO
                methodOut.setPolNo(methodOut.getUPolicyNo51());
                // cobolCode::MOVE LK-51U-PLAN-VAR TO WS-PLAN-VAR-PREV
                methodOut.setPlanVarPrev(methodOut.getUPlanVar51());
                // cobolCode::PERFORM 2010-READ-PLAN-ALT-FILE THRU 2010-EXIT
                readPlanAltFile(programCtx.getReadPlanAltFileInCtx());
                /*2010-READ-PLAN-ALT-FILE*/
            }
            // cobolCode::IF NOT PLAN-VAR-FOUND AND WS-SUB = 1
            // LITERAL_1 = 1
            if (!(methodIn.isPlanVarFound()) && (methodOut.getSub() == 1)) {
                methodOut.setSub01(methodOut.getNbrOfLines());
                // cobolCode::GO TO 2000-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 2000-EXIT
            }
        }
        // cobolCode::PERFORM 2600-CHECK-SERVICE-CODES THRU 2600-EXIT
        checkServiceCodes(programCtx.getCheckServiceCodesInCtx());
        /*2600-CHECK-SERVICE-CODES*/
        // ***           Eqi table read process         ****
        // ******************uhg india changes begin*********************
        // *    if med-svc  = 999999  or cls-1-5 not numeric
        // cobolCode::IF MED-SVC = 999999 OR ( CLS-1-5 NOT NUMERIC AND CK-SERV-CLS (1 : 2) NOT ALPHABETIC)
        // LITERAL_999999 = 999999
        if (compareChars(methodIn.getMedSvc(), CONSTANTS.LITERAL_999999) == 0 || (!(methodIn.getCkServCls().cls15IsNumeric()) && !(isAlphabetic(substring(methodIn.getCkServCls().toCharArray(), 0, 2))))) {
            // ******************Uhg india changes end***********************
            // cobolCode::PERFORM 2650-READ-EQI-FILE THRU 2650-EXIT
            readEqiFile(programCtx.getReadEqiFileInCtx());
            /*2650-READ-EQI-FILE*/
            continueProcess(programCtx.getContinueProcessInCtx());
            /*2650-CONTINUE-PROCESS*/
        }
        // cobolCode::IF FE-SPI-TURNED-ON
        if (methodIn.isFeSpiTurnedOn()) {
            // cobolCode::PERFORM 2030D-READ-SPI-RULES-DB2 THRU 2030D-EXIT VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > WS-NBR-OF-PLAN-VAR
            for (methodOut.setSub(1); (methodOut.getSub() <= methodIn.getNbrOfPlanVar()); methodOut.setSub(methodOut.getSub() + 1)) {
                readSpiRulesDb2(programCtx.getReadSpiRulesDb2InCtx());
                /*2030D-READ-SPI-RULES-DB2 SECTION*/
            }
        } else // cobolCode::ELSE
        {
            // cobolCode::PERFORM 2030-READ-SPI-RULES THRU 2030-EXIT VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > WS-NBR-OF-PLAN-VAR
            for (methodOut.setSub(1); (methodOut.getSub() <= methodIn.getNbrOfPlanVar()); methodOut.setSub(methodOut.getSub() + 1)) {
                readSpiRules(programCtx.getReadSpiRulesInCtx());
                /*2030-READ-SPI-RULES*/
            }
        }
        // *** If the service line matched to the same number of items on mor
        // *** than one spi rule, we will not apply any spis.  in addition, w
        // *** will turn off auto.  tsh 9/93
        // cobolCode::IF NOT-NBR-EQUAL
        if (methodOut.isNotNbrEqual()) {
            // cobolCode::MOVE WS-HOLD-PS TO LK-51U-OUT-LINE-POS ( LK-SUB )
            methodOut.setUOutLinePos51(methodOut.getSub01() - 1, methodOut.getHoldPs());
            // cobolCode::MOVE WS-HOLD-SVC TO LK-51U-OUT-LINE-SERVICE-CODE ( LK-SUB )
            methodOut.setUOutLineServiceCode51(methodOut.getSub01() - 1, methodOut.getHoldSvc());
            // cobolCode::MOVE WS-HOLD-CAUSE-CD TO LK-51U-OUT-LINE-CAUSE-CD ( LK-SUB )
            methodOut.setUOutLineCauseCd51(methodOut.getSub01() - 1, methodOut.getHoldCauseCd());
            // cobolCode::MOVE WS-HOLD-SPI-TBL-ID TO LK-51U-SPI-TBL-ID
            methodOut.setUSpiTblId51(methodOut.getHoldSpiTblId());
            // cobolCode::MOVE WS-HOLD-SPI-TBL-ID TO LK-51U-OUT-SPI-TBL-ID ( LK-SUB )
            methodOut.setUOutSpiTblId51(methodOut.getSub01() - 1, methodOut.getHoldSpiTblId());
            // cobolCode::MOVE WS-HOLD-POS-TIER-CD TO LK-51U-OUT-POS-TIER-CD ( LK-SUB )
            methodOut.setUOutPosTierCd51(methodOut.getSub01() - 1, methodOut.getHoldPosTierCd());
            // cobolCode::MOVE WS-HOLD-DIAG-ELG-IND TO LK-51U-OUT-DIAG-ELG-IND ( LK-SUB )
            methodOut.setUOutDiagElgInd51(methodOut.getSub01() - 1, methodOut.getHoldDiagElgInd());
            // cobolCode::MOVE LK-51U-LINE-APP-UNITS ( LK-SUB ) TO LK-51U-OUT-LINE-APP-UNITS ( LK-SUB )
            methodOut.setUOutLineAppUnits51(methodOut.getSub01() - 1, methodOut.getULineAppUnits51(methodOut.getSub01() - 1));
            // *** Removed move of remark-code because it was causing
            // *** override-code of 'r' being set incorrectly in 51d
            // cobolCode::MOVE LK-51U-LINE-CHARGE-AMT ( LK-SUB ) TO LK-51U-OUT-LINE-CHARGE-AMT ( LK-SUB )
            methodOut.setUOutLineChargeAmt51(methodOut.getSub01() - 1, methodOut.getULineChargeAmt51(methodOut.getSub01() - 1));
            // cobolCode::MOVE LK-51U-LINE-NOTCOV-AMT ( LK-SUB ) TO LK-51U-OUT-LINE-NOTCOV-AMT ( LK-SUB )
            methodOut.setUOutLineNotcovAmt51(methodOut.getSub01() - 1, methodOut.getULineNotcovAmt51(methodOut.getSub01() - 1));
            // cobolCode::MOVE LK-51U-LINE-DOS-DATE ( LK-SUB ) TO LK-51U-OUT-LINE-DOS-DATE ( LK-SUB )
            methodOut.setUOutLineDosDate51(methodOut.getSub01() - 1, methodOut.getULineDosDate51(methodOut.getSub01() - 1));
            // SPACE = ' '
            methodOut.setNbrEqual(CONSTANTS.SPACE);
            // cobolCode::MOVE SPACES TO WS-HOLD-PS
            methodOut.setHoldPs(CONSTANTS.SPACE_2);
            // cobolCode::MOVE SPACES TO WS-HOLD-SVC
            methodOut.setHoldSvc(CONSTANTS.SPACE_6);
            // cobolCode::MOVE SPACES TO WS-HOLD-CAUSE-CD WS-HOLD-SPI-TBL-ID WS-HOLD-POS-TIER-CD WS-HOLD-DIAG-ELG-IND WS-FCND-PS WS-FCND-SVC WS-FCND-CAUSE-CD WS-FRTO-PS WS-FRTO-SVC WS-FRTO-CAUSE-CD WS-PTYP-PS WS-PTYP-SVC WS-PTYP-CAUSE-CD WS-RICD-PS WS-RICD-SVC WS-RICD-CAUSE-CD WS-CAUS-PS WS-CAUS-SVC WS-CAUS-CAUSE-CD WS-RIPA-PS WS-RIPA-SVC WS-RIPA-CAUSE-CD WS-CFLG-PS WS-CFLG-SVC WS-CFLG-CAUSE-CD
            methodOut.setHoldCauseCd(CONSTANTS.SPACE);
            methodOut.setHoldSpiTblId(CONSTANTS.SPACE_7);
            methodOut.setHoldPosTierCd(CONSTANTS.SPACE);
            methodOut.setHoldDiagElgInd(CONSTANTS.SPACE);
            methodOut.setFcndPs(CONSTANTS.SPACE_2);
            methodOut.setFcndSvc(CONSTANTS.SPACE_6);
            methodOut.setFcndCauseCd(CONSTANTS.SPACE);
            methodOut.setFrtoPs(CONSTANTS.SPACE_2);
            methodOut.setFrtoSvc(CONSTANTS.SPACE_6);
            methodOut.setFrtoCauseCd(CONSTANTS.SPACE);
            methodOut.setPtypPs(CONSTANTS.SPACE_2);
            methodOut.setPtypSvc(CONSTANTS.SPACE_6);
            methodOut.setPtypCauseCd(CONSTANTS.SPACE);
            methodOut.setRicdPs(CONSTANTS.SPACE_2);
            methodOut.setRicdSvc(CONSTANTS.SPACE_6);
            methodOut.setRicdCauseCd(CONSTANTS.SPACE);
            methodOut.setCausPs(CONSTANTS.SPACE_2);
            methodOut.setCausSvc(CONSTANTS.SPACE_6);
            methodOut.setCausCauseCd(CONSTANTS.SPACE);
            methodOut.setRipaPs(CONSTANTS.SPACE_2);
            methodOut.setRipaSvc(CONSTANTS.SPACE_6);
            methodOut.setRipaCauseCd(CONSTANTS.SPACE);
            methodOut.setCflgPs(CONSTANTS.SPACE_2);
            methodOut.setCflgSvc(CONSTANTS.SPACE_6);
            methodOut.setCflgCauseCd(CONSTANTS.SPACE);
            // cobolCode::MOVE ZEROS TO WS-NBR-MATCHED
            methodOut.setNbrMatched(0);
            // cobolCode::MOVE ZEROS TO WS-NBR-MATCHED-PREV
            methodOut.setNbrMatchedPrev(0);
            // LITERAL_N = 'N'
            methodOut.setEndOfSpiRule(CONSTANTS.LITERAL_N);
        } else // cobolCode::ELSE
        {
            // cobolCode::IF NBR-EQUAL
            if (methodOut.isNbrEqual1()) {
                // cobolCode::MOVE 'Z' TO LK-51U-STOP-AUTO-SW
                // LITERAL_Z = 'Z'
                methodOut.setUStopAutoSw51(CONSTANTS.LITERAL_Z);
            }
        }
        return methodOut;
    }

    /**
     * readPlanAltFile
     *   This method is derived from
     *   COBOL Paragraph - 2010-READ-PLAN-ALT-FILE COBOL Cyclomatic complexity - 10
     * Input  :
     *
     * - newSpiSw                       COBOL Name: WS-NEW-SPI-SW
     * - uPolicyNo51                    COBOL Name: LK-51U-POLICY-NO
     * - uPlanVar51                     COBOL Name: LK-51U-PLAN-VAR
     * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
     * - sub                            COBOL Name: WS-SUB
     * - endOfPlanAlt                   COBOL Name: WS-END-OF-PLAN-ALT
     * - withMmiSw2010                  COBOL Name: WS-2010-WITH-MMI-SW
     * - ddPlanvara                     COBOL Name: DD-PLANVARA
     * - fesaKey1                       COBOL Name: FESA-KEY1
     * - w02FnuLineStartbr              COBOL Name: W02-FNU-LINE-STARTBR
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - planVarFoundSw                 COBOL Name: WS-PLAN-VAR-FOUND-SW
     * - fesaPolicy                     COBOL Name: FESA-POLICY
     * - uPolicyNo51                    COBOL Name: LK-51U-POLICY-NO
     * - fesaPlanVar                    COBOL Name: FESA-PLAN-VAR
     * - uPlanVar51                     COBOL Name: LK-51U-PLAN-VAR
     * - fesaEffDate                    COBOL Name: FESA-EFF-DATE
     * - fesaSpiNbr                     COBOL Name: FESA-SPI-NBR
     * - fesaPolicy1                    COBOL Name: FESA-POLICY1
     * - fesaPlanVar1                   COBOL Name: FESA-PLAN-VAR1
     * - fesaEffDate1                   COBOL Name: FESA-EFF-DATE1
     * - fesaSpiNbr1                    COBOL Name: FESA-SPI-NBR1
     * - mmiFoundSw                     COBOL Name: WS-MMI-FOUND-SW
     * - w02FnuFileStbr                 COBOL Name: W02-FNU-FILE-STBR
     * - ddPlanvara                     COBOL Name: DD-PLANVARA
     * - w02FnuKeyStbr                  COBOL Name: W02-FNU-KEY-STBR
     * - fesaKey1                       COBOL Name: FESA-KEY1
     * - w02RespCd                      COBOL Name: W02-RESP-CD
     * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
     * - w02DsplMsg                     COBOL Name: W02-DSPL-MSG
     * - w02FnuLineStartbr              COBOL Name: W02-FNU-LINE-STARTBR
     * - w02DsplErrInd                  COBOL Name: W02-DSPL-ERR-IND
     * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
     *
     * @throws CFException
     */
    @Override
    public ReadPlanAltFileOutCtx readPlanAltFile(ReadPlanAltFileInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2010-Read-plan-alt-file                                      *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 this section of the program will start the browse of the plan*
        // *81 alternative file.                                            *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2010-read-plan-alt-file                                      *
        // *82                                                              *
        // *82 1. start browsing the plan alternative file. if the record is*
        // *82    not found,exit the section. if any other error occurs,    *
        // *82    display the error and abort the program.                  *
        // *82 2. if the browse is successful, build and populate a table   *
        // *82    to store the policy number, plan dates and plan variables.*
        // *82 3. populate the working storage variables for the generic    *
        // *82    translators and the additional translators.               *
        // *82***************************************************************
        // *---------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        ReadPlanAltFileOutCtx methodOut = methodIn.getReadPlanAltFileOutCtx();
        // LITERAL_2010 = '2010'
        methodOut.setParagraph(CONSTANTS.LITERAL_2010);
        // LITERAL_N = 'N'
        methodOut.setPlanVarFoundSw(CONSTANTS.LITERAL_N);
        // cobolCode::IF FE-SPI-TURNED-ON
        if (methodIn.isFeSpiTurnedOn()) {
            // cobolCode::PERFORM 2010D-READ-PLAN-ALT-DB2 THRU 2010D-EXIT
            readPlanAltDb2(programCtx.getReadPlanAltDb2InCtx());
            /*2010D-READ-PLAN-ALT-DB2 SECTION*/
            // cobolCode::GO TO 2010-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 2010-EXIT
        }
        // cobolCode::MOVE LK-51U-POLICY-NO TO FESA-POLICY
        methodOut.setFesaPolicy(methodOut.getUPolicyNo51());
        // cobolCode::MOVE LK-51U-PLAN-VAR TO FESA-PLAN-VAR
        methodOut.setFesaPlanVar(methodOut.getUPlanVar51());
        // cobolCode::MOVE ZEROS TO FESA-EFF-DATE FESA-SPI-NBR
        methodOut.setFesaEffDate(0);
        methodOut.setFesaSpiNbr(0);
        // cobolCode::MOVE FESA-POLICY TO FESA-POLICY1
        methodOut.setFesaPolicy1(methodOut.getFesaPolicy());
        // cobolCode::MOVE FESA-PLAN-VAR TO FESA-PLAN-VAR1
        methodOut.setFesaPlanVar1(methodOut.getFesaPlanVar());
        // cobolCode::MOVE FESA-EFF-DATE TO FESA-EFF-DATE1
        methodOut.setFesaEffDate1(methodOut.getFesaEffDate());
        // cobolCode::MOVE FESA-SPI-NBR TO FESA-SPI-NBR1
        methodOut.setFesaSpiNbr1(methodOut.getFesaSpiNbr());
        // cobolCode::PERFORM 2016-START-BROWSE-PLANVARA THRU 2016-EXIT
        startBrowsePlanvara(programCtx.getStartBrowsePlanvaraInCtx());
        /*2016-START-BROWSE-PLANVARA*/
        // cobolCode::EVALUATE TRUE
        if (methodIn.isCicsNormal()) {
            // cobolCode::PERFORM 2020-BUILD-PLAN-ALT-TABLE THRU 2020-EXIT UNTIL WS-SUB > 50 OR END-OF-PLAN-ALT
            while ((methodIn.getSub() <= 50) && !(methodIn.isEndOfPlanAlt1())) {
                buildPlanAltTable(programCtx.getBuildPlanAltTableInCtx());
                /*2020-BUILD-PLAN-ALT-TABLE*/
            }
        } else if (methodIn.isCicsNotfnd()) {
            // cobolCode::IF 2010-WITH-MMI-POL
            if (methodIn.isWithMmiPol2010()) {
                // cobolCode::SET MMI-ALT-NOT-FOUND TO TRUE
                methodOut.setMmiAltNotFoundTrue();
            }
        } else if (methodIn.isCicsEndfile()) {
            ;
        } else {
            // cobolCode::MOVE DD-PLANVARA TO W02-FNU-FILE-STBR
            methodOut.setW02FnuFileStbr(methodOut.getDdPlanvara());
            // cobolCode::MOVE FESA-POLICY TO FESA-POLICY1
            methodOut.setFesaPolicy1(methodOut.getFesaPolicy());
            // cobolCode::MOVE FESA-PLAN-VAR TO FESA-PLAN-VAR1
            methodOut.setFesaPlanVar1(methodOut.getFesaPlanVar());
            // cobolCode::MOVE FESA-EFF-DATE TO FESA-EFF-DATE1
            methodOut.setFesaEffDate1(methodOut.getFesaEffDate());
            // cobolCode::MOVE FESA-SPI-NBR TO FESA-SPI-NBR1
            methodOut.setFesaSpiNbr1(methodOut.getFesaSpiNbr());
            methodOut.setW02FnuKeyStbr(methodOut.getFesaKey1().toCharArray());
            // cobolCode::MOVE CICS-DFHRESP-CODE TO W02-RESP-CD
            methodOut.setW02RespCd(methodOut.getCicsDfhrespCode());
            methodOut.setW02DsplMsg(methodOut.getW02FnuLineStartbr().toCharArray());
            // cobolCode::MOVE 'ERR' TO W02-DSPL-ERR-IND
            // LITERAL_ERR = 'ERR'
            methodOut.setW02DsplErrInd(CONSTANTS.LITERAL_ERR);
            // cobolCode::PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
            writeToSysm(programCtx.getWriteToSysmInCtx());
            /*11100A-WRITE-TO-SYSM SECTION*/
            // cobolCode::SET M51U-ILLOGICAL-COND TO TRUE
            methodOut.setM51uIllogicalCondTrue();
            // cobolCode::PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
            dumpAbend(programCtx);
            /*8000-DUMP-ABEND SECTION*/
        }
        // cobolCode::PERFORM 2018-END-BROWSE-PLANVARA THRU 2018-EXIT
        endBrowsePlanvara(programCtx.getEndBrowsePlanvaraInCtx());
        /*2018-END-BROWSE-PLANVARA*/
        // cobolCode::IF MMI-ALT-NOT-FOUND
        if (methodOut.isMmiAltNotFound()) {
            // cobolCode::GO TO 2010-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 2010-EXIT
        }
        // cobolCode::PERFORM 2013-NEW-SPI-TRANSLATION THRU 2013-EXIT
        newSpiTranslation(programCtx.getNewSpiTranslationInCtx());
        /*2013-NEW-SPI-TRANSLATION*/
        // *** Sdb dec95 deliverable
        // cobolCode::PERFORM 2015-GENERIC-TRANSLATION THRU 2015-EXIT
        genericTranslation(programCtx.getGenericTranslationInCtx());
        /*2015-GENERIC-TRANSLATION*/
        return methodOut;
    }

    /**
     * newSpiTranslation
     *   This method is derived from
     *   COBOL Paragraph - 2013-NEW-SPI-TRANSLATION COBOL Cyclomatic complexity - 5
     * Input  :
     *
     * - sub                            COBOL Name: WS-SUB
     * - uTrnslNdx51                    COBOL Name: LK-51U-TRNSL-NDX
     * - uGenericTrnsl51                COBOL Name: LK-51U-GENERIC-TRNSL
     * - newTransl                      COBOL Name: WS-NEW-TRANSL
     * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
     *
     * Output :
     *
     * - newSub                         COBOL Name: WS-NEW-SUB
     * - sub                            COBOL Name: WS-SUB
     * - newNdx                         COBOL Name: NEW-NDX
     * - uTrnslNdx51                    COBOL Name: LK-51U-TRNSL-NDX
     * - fesaPolicy01                   COBOL Name: WS-FESA-POLICY
     * - fesaPlanVar01                  COBOL Name: WS-FESA-PLAN-VAR
     * - fesaEffDate01                  COBOL Name: WS-FESA-EFF-DATE
     * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
     * - newTransl                      COBOL Name: WS-NEW-TRANSL
     * - planVarFoundSw                 COBOL Name: WS-PLAN-VAR-FOUND-SW
     * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
     *
     * @throws CFException
     */
    @Override
    public NewSpiTranslationOutCtx newSpiTranslation(NewSpiTranslationInCtx methodIn) throws Exception {
        // ***Sdb
        // *81***************************************************************
        // *81 2013-new-spi-translation                                     *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 this section takes care of the two additional spi(special    *
        // *81 processing instructions) which are built to be accessed for  *
        // *81 all policies/plan variations.                                *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2013-new-spi-translation                                     *
        // *82                                                              *
        // *82 1. while the translation index is less than 2, populate the  *
        // *82    storage variables with the policy number('000000'),       *
        // *82    plan variable ('0001'),effective date (zeroes) and new    *
        // *82    translator, when the  generic translater key is set to 'y'*
        // *82***************************************************************
        // *-------------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        NewSpiTranslationOutCtx methodOut = methodIn.getNewSpiTranslationOutCtx();
        methodOut.setNewSub(methodOut.getSub());
        // cobolCode::SET NEW-NDX TO 1
        methodOut.setNewNdx(1);
        // cobolCode::PERFORM VARYING LK-51U-TRNSL-NDX FROM 1 BY 1 UNTIL LK-51U-TRNSL-NDX > 2
        for (methodOut.setUTrnslNdx51(1); ((methodOut.getUTrnslNdx51() <= 2)); methodOut.setUTrnslNdx51(methodOut.getUTrnslNdx51() + 1)) {
            // ****    If ws-new-sub  < 26
            // **45917zif ws-new-sub  < 51
            // cobolCode::IF WS-NEW-SUB < 9999
            if ((methodOut.getNewSub() < 9999)) {
                // cobolCode::IF LK-51U-GENERIC-TRNSL ( LK-51U-TRNSL-NDX ) = 'Y'
                // LITERAL_Y = 'Y'
                if (methodIn.getUGenericTrnsl51(methodOut.getUTrnslNdx51() - 1)[0] == 'Y') {
                    // cobolCode::MOVE '000000' TO WS-FESA-POLICY ( WS-NEW-SUB )
                    // LITERAL_000000 = '000000'
                    methodOut.setFesaPolicy01(methodOut.getNewSub() - 1, CONSTANTS.LITERAL_000000);
                    // cobolCode::MOVE '0001' TO WS-FESA-PLAN-VAR ( WS-NEW-SUB )
                    methodOut.setFesaPlanVar01(methodOut.getNewSub() - 1, 1);
                    // cobolCode::MOVE ZEROES TO WS-FESA-EFF-DATE ( WS-NEW-SUB )
                    methodOut.setFesaEffDate01(methodOut.getNewSub() - 1, 0);
                    // cobolCode::MOVE WS-NEW-TRANSL ( NEW-NDX ) TO WS-FESA-SPI-NBR ( WS-NEW-SUB )
                    methodOut.setFesaSpiNbr01(methodOut.getNewSub() - 1, methodOut.getNewTransl(methodOut.getNewNdx() - 1));
                    // LITERAL_Y = 'Y'
                    methodOut.setPlanVarFoundSw(CONSTANTS.LITERAL_Y);
                    // cobolCode::SET NEW-NDX UP BY 1
                    methodOut.setNewNdx(methodOut.getNewNdx() + 1);
                    // cobolCode::ADD 1 TO WS-NEW-SUB
                    methodOut.setNewSub(methodOut.getNewSub() + 1);
                    // cobolCode::ADD 1 TO WS-NBR-OF-PLAN-VAR
                    methodOut.setNbrOfPlanVar(methodOut.getNbrOfPlanVar() + 1);
                } else // cobolCode::ELSE
                {
                    // cobolCode::SET NEW-NDX UP BY 1
                    methodOut.setNewNdx(methodOut.getNewNdx() + 1);
                }
            }
        }
        return methodOut;
    }

    /**
     * genericTranslation
     *   This method is derived from
     *   COBOL Paragraph - 2015-GENERIC-TRANSLATION COBOL Cyclomatic complexity - 5
     * Input  :
     *
     * - newSub                         COBOL Name: WS-NEW-SUB
     * - uTrnslNdx51                    COBOL Name: LK-51U-TRNSL-NDX
     * - uGenericTrnsl51                COBOL Name: LK-51U-GENERIC-TRNSL
     * - uPolicyNo51                    COBOL Name: LK-51U-POLICY-NO
     * - uPlanVar51                     COBOL Name: LK-51U-PLAN-VAR
     * - genericTransl                  COBOL Name: WS-GENERIC-TRANSL
     * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
     *
     * Output :
     *
     * - genSub                         COBOL Name: WS-GEN-SUB
     * - newSub                         COBOL Name: WS-NEW-SUB
     * - genNdx                         COBOL Name: GEN-NDX
     * - uTrnslNdx51                    COBOL Name: LK-51U-TRNSL-NDX
     * - fesaPolicy01                   COBOL Name: WS-FESA-POLICY
     * - uPolicyNo51                    COBOL Name: LK-51U-POLICY-NO
     * - fesaPlanVar01                  COBOL Name: WS-FESA-PLAN-VAR
     * - uPlanVar51                     COBOL Name: LK-51U-PLAN-VAR
     * - fesaEffDate01                  COBOL Name: WS-FESA-EFF-DATE
     * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
     * - genericTransl                  COBOL Name: WS-GENERIC-TRANSL
     * - planVarFoundSw                 COBOL Name: WS-PLAN-VAR-FOUND-SW
     * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
     *
     * @throws CFException
     */
    @Override
    public GenericTranslationOutCtx genericTranslation(GenericTranslationInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2015-Generic-translation                                     *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 the online plan screen allows the generic translation        *
        // *81 indicators to be set(there are nine generic translations).if *
        // *81 any of the indicators are set, load the generic  tranlsation *
        // *81 to the spi(special processing instructions)  table to be     *
        // *81 applied later in the program.                                *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2015-generic-translation                                     *
        // *82                                                              *
        // *82 1. while the translation index is less than 9, populate the  *
        // *82    storage variables with the policy number, plan variable,  *
        // *82    effective date and generic translator, when then generic  *
        // *82    translator key is set to 'y'                              *
        // *82***************************************************************
        // *-------------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        GenericTranslationOutCtx methodOut = methodIn.getGenericTranslationOutCtx();
        methodOut.setGenSub(methodOut.getNewSub());
        // cobolCode::SET GEN-NDX TO 1
        methodOut.setGenNdx(1);
        // cobolCode::PERFORM VARYING LK-51U-TRNSL-NDX FROM 1 BY 1 UNTIL LK-51U-TRNSL-NDX > 9
        for (methodOut.setUTrnslNdx51(1); ((methodOut.getUTrnslNdx51() <= 9)); methodOut.setUTrnslNdx51(methodOut.getUTrnslNdx51() + 1)) {
            // ****    If ws-gen-sub  < 26
            // **45917zif ws-gen-sub  < 51
            // cobolCode::IF WS-GEN-SUB < 9999
            if ((methodOut.getGenSub() < 9999)) {
                // cobolCode::IF LK-51U-GENERIC-TRNSL ( LK-51U-TRNSL-NDX ) = 'Y'
                // LITERAL_Y = 'Y'
                if (methodIn.getUGenericTrnsl51(methodOut.getUTrnslNdx51() - 1)[0] == 'Y') {
                    // cobolCode::MOVE LK-51U-POLICY-NO TO WS-FESA-POLICY ( WS-GEN-SUB )
                    methodOut.setFesaPolicy01(methodOut.getGenSub() - 1, methodOut.getUPolicyNo51());
                    // cobolCode::MOVE LK-51U-PLAN-VAR TO WS-FESA-PLAN-VAR ( WS-GEN-SUB )
                    methodOut.setFesaPlanVar01(methodOut.getGenSub() - 1, methodOut.getUPlanVar51());
                    // cobolCode::MOVE ZEROES TO WS-FESA-EFF-DATE ( WS-GEN-SUB )
                    methodOut.setFesaEffDate01(methodOut.getGenSub() - 1, 0);
                    // cobolCode::MOVE WS-GENERIC-TRANSL ( GEN-NDX ) TO WS-FESA-SPI-NBR ( WS-GEN-SUB )
                    methodOut.setFesaSpiNbr01(methodOut.getGenSub() - 1, methodOut.getGenericTransl(methodOut.getGenNdx() - 1));
                    // LITERAL_Y = 'Y'
                    methodOut.setPlanVarFoundSw(CONSTANTS.LITERAL_Y);
                    // cobolCode::SET GEN-NDX UP BY 1
                    methodOut.setGenNdx(methodOut.getGenNdx() + 1);
                    // cobolCode::ADD 1 TO WS-GEN-SUB
                    methodOut.setGenSub(methodOut.getGenSub() + 1);
                    // cobolCode::ADD 1 TO WS-NBR-OF-PLAN-VAR
                    methodOut.setNbrOfPlanVar(methodOut.getNbrOfPlanVar() + 1);
                } else // cobolCode::ELSE
                {
                    // cobolCode::SET GEN-NDX UP BY 1
                    methodOut.setGenNdx(methodOut.getGenNdx() + 1);
                }
            }
        }
        return methodOut;
    }

    /**
     * startBrowsePlanvara
     *   This method is derived from
     *   COBOL Paragraph - 2016-START-BROWSE-PLANVARA COBOL Cyclomatic complexity - 1
     * Input  : None
     *
     * Output :
     *
     * - dfhb0020                       COBOL Name: DFHB0020
     * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
     * - cetEibrcd                      COBOL Name: CET-EIBRCD
     *
     * @throws CFException
     */
    @Override
    public StartBrowsePlanvaraOutCtx startBrowsePlanvara(StartBrowsePlanvaraInCtx methodIn) throws Exception {
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        StartBrowsePlanvaraOutCtx methodOut = methodIn.getStartBrowsePlanvaraOutCtx();
        // *EXEC CICS STARTBR
        // *    FILE      (DD-PLANVARA)
        // *    RIDFLD    (FESA-KEY)
        // *    KEYLENGTH (LENGTH OF FESA-KEY)
        // *    RESP      (CICS-DFHRESP-CODE)
        // *END-EXEC.
        // cobolCode::MOVE LENGTH OF FESA-KEY TO DFHB0020
        methodOut.setDfhb0020(FesaKey.getFesaKeyFieldLength());
        // cobolCode::STARTBR FILE (DD-PLANVARA) RIDFLD (FESA-KEY) KEYLENGTH (FUNCTION~LENGTH~FESA-KEY) RESP (CICS-DFHRESP-CODE)
        // start Browsing a file
        TransactionManager.startBrowsing(programCtx.getCicsSession(), methodIn.getDdPlanvara(), methodIn.getFesaKey().toCharArray(), "".toCharArray(), /*reqId*/
        "".toCharArray(), /*sysId*/
        FesaKey.getFesaKeyFieldLength(), false, /*debkey*/
        false, /*debrec*/
        false, /*rba*/
        false, /*rrn*/
        false, /*xrba*/
        false, /*gteq*/
        false, /*equal*/
        false, /*generic*/
        new KeyInfo(0, 17, 0, false));
        // cobolCode::MOVE EIBRESP TO CICS-DFHRESP-CODE
        methodOut.setCicsDfhrespCode(programCtx.getCicsSession().getEibresp());
        // cobolCode::MOVE EIBRCODE TO CET-EIBRCD
        methodOut.setCetEibrcd(programCtx.getCicsSession().getEibrcode());
        return methodOut;
    }

    /**
     * readNextPlanvara
     *   This method is derived from
     *   COBOL Paragraph - 2017-READ-NEXT-PLANVARA COBOL Cyclomatic complexity - 1
     * Input  : None
     *
     * Output :
     *
     * - dfhb0020                       COBOL Name: DFHB0020
     * - dfhb0021                       COBOL Name: DFHB0021
     * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
     * - cetEibrcd                      COBOL Name: CET-EIBRCD
     *
     * @throws CFException
     */
    @Override
    public ReadNextPlanvaraOutCtx readNextPlanvara(ReadNextPlanvaraInCtx methodIn) throws Exception {
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        ReadNextPlanvaraOutCtx methodOut = methodIn.getReadNextPlanvaraOutCtx();
        // *EXEC CICS READNEXT
        // *    FILE      (DD-PLANVARA)
        // *    INTO      (FE-SPI-ALT-PLAN-RECORD)
        // *    RIDFLD    (FESA-KEY)
        // *    KEYLENGTH (LENGTH OF FESA-KEY)
        // *    LENGTH    (LENGTH OF FE-SPI-ALT-PLAN-RECORD)
        // *    RESP      (CICS-DFHRESP-CODE)
        // *END-EXEC.
        // cobolCode::MOVE LENGTH OF FE-SPI-ALT-PLAN-RECORD TO DFHB0020
        methodOut.setDfhb0020(FeSpiAltPlanRecord.getFeSpiAltPlanRecordFieldLength());
        // cobolCode::MOVE LENGTH OF FESA-KEY TO DFHB0021
        methodOut.setDfhb0021(FesaKey.getFesaKeyFieldLength());
        // cobolCode::READNEXT FILE (DD-PLANVARA) INTO (FE-SPI-ALT-PLAN-RECORD) RIDFLD (FESA-KEY) KEYLENGTH (FUNCTION~LENGTH~FESA-KEY) LENGTH (FUNCTION~LENGTH~FE-SPI-ALT-PLAN-RECORD) RESP (CICS-DFHRESP-CODE)
        // read the next record from a file
        methodIn.getFeSpiAltPlanRecord().setString(TransactionManager.readNextRecord(programCtx.getCicsSession(), methodIn.getDdPlanvara(), methodIn.getFesaKey().toCharArray(), "".toCharArray(), /*Token*/
        "".toCharArray(), /*SysId*/
        FesaKey.getFesaKeyFieldLength(), FeSpiAltPlanRecord.getFeSpiAltPlanRecordFieldLength(), "".toCharArray(), /*ReqId*/
        false, /*rba*/
        false, /*rrn*/
        false, /*xrba*/
        false, /*nosuspend*/
        false, /*uncommitted*/
        false, /*consistent*/
        false, /*repeatable*/
        false).toCharArray());
        // cobolCode::MOVE EIBRESP TO CICS-DFHRESP-CODE
        methodOut.setCicsDfhrespCode(programCtx.getCicsSession().getEibresp());
        // cobolCode::MOVE EIBRCODE TO CET-EIBRCD
        methodOut.setCetEibrcd(programCtx.getCicsSession().getEibrcode());
        return methodOut;
    }

    /**
     * endBrowsePlanvara
     *   This method is derived from
     *   COBOL Paragraph - 2018-END-BROWSE-PLANVARA COBOL Cyclomatic complexity - 1
     * Input  : None
     *
     * Output :
     *
     * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
     *
     * @throws CFException
     */
    @Override
    public EndBrowsePlanvaraOutCtx endBrowsePlanvara(EndBrowsePlanvaraInCtx methodIn) throws Exception {
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        EndBrowsePlanvaraOutCtx methodOut = methodIn.getEndBrowsePlanvaraOutCtx();
        // cobolCode::ENDBR FILE (DD-PLANVARA) RESP (CICS-DFHRESP-CODE)
        // end browsing the file
        TransactionManager.endBrowsing(programCtx.getCicsSession(), methodIn.getDdPlanvara(), "".toCharArray(), /*sysId*/
        "".toCharArray());
        // cobolCode::MOVE EIBRESP TO CICS-DFHRESP-CODE
        methodOut.setCicsDfhrespCode(programCtx.getCicsSession().getEibresp());
        return methodOut;
    }

    /**
     * buildPlanAltTable
     *   This method is derived from
     *   COBOL Paragraph - 2020-BUILD-PLAN-ALT-TABLE COBOL Cyclomatic complexity - 9
     * Input  :
     *
     * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
     * - fesaPolicy                     COBOL Name: FESA-POLICY
     * - polNo                          COBOL Name: WS-POL-NO
     * - fesaPlanVar                    COBOL Name: FESA-PLAN-VAR
     * - planVarPrev                    COBOL Name: WS-PLAN-VAR-PREV
     * - fesaEffDate                    COBOL Name: FESA-EFF-DATE
     * - fesaCanDt                      COBOL Name: FESA-CAN-DT
     * - uLineDosDate51                 COBOL Name: LK-51U-LINE-DOS-DATE
     * - planDosYy                      COBOL Name: WS-PLAN-DOS-YY
     * - planDosMm                      COBOL Name: WS-PLAN-DOS-MM
     * - planDosDd                      COBOL Name: WS-PLAN-DOS-DD
     * - planDate                       COBOL Name: WS-PLAN-DATE
     * - fesaSpiNbr                     COBOL Name: FESA-SPI-NBR
     * - sub                            COBOL Name: WS-SUB
     * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
     * - ddPlanvara                     COBOL Name: DD-PLANVARA
     * - fesaKey1                       COBOL Name: FESA-KEY1
     * - w02FnuLineReadnext             COBOL Name: W02-FNU-LINE-READNEXT
     *
     * Output :
     *
     * - endOfPlanAlt                   COBOL Name: WS-END-OF-PLAN-ALT
     * - planEffDate                    COBOL Name: WS-PLAN-EFF-DATE
     * - fesaEffDate                    COBOL Name: FESA-EFF-DATE
     * - planCanDate                    COBOL Name: WS-PLAN-CAN-DATE
     * - fesaCanDt                      COBOL Name: FESA-CAN-DT
     * - planDosDate                    COBOL Name: WS-PLAN-DOS-DATE
     * - uLineDosDate51                 COBOL Name: LK-51U-LINE-DOS-DATE
     * - planYy                         COBOL Name: WS-PLAN-YY
     * - planDosYy                      COBOL Name: WS-PLAN-DOS-YY
     * - planMm                         COBOL Name: WS-PLAN-MM
     * - planDosMm                      COBOL Name: WS-PLAN-DOS-MM
     * - planDd                         COBOL Name: WS-PLAN-DD
     * - planDosDd                      COBOL Name: WS-PLAN-DOS-DD
     * - fesaPolicy01                   COBOL Name: WS-FESA-POLICY
     * - fesaPolicy                     COBOL Name: FESA-POLICY
     * - fesaPlanVar01                  COBOL Name: WS-FESA-PLAN-VAR
     * - fesaPlanVar                    COBOL Name: FESA-PLAN-VAR
     * - fesaEffDate01                  COBOL Name: WS-FESA-EFF-DATE
     * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
     * - fesaSpiNbr                     COBOL Name: FESA-SPI-NBR
     * - planVarFoundSw                 COBOL Name: WS-PLAN-VAR-FOUND-SW
     * - sub                            COBOL Name: WS-SUB
     * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
     * - w02FnuFileRdnxt                COBOL Name: W02-FNU-FILE-RDNXT
     * - ddPlanvara                     COBOL Name: DD-PLANVARA
     * - fesaPolicy1                    COBOL Name: FESA-POLICY1
     * - fesaPlanVar1                   COBOL Name: FESA-PLAN-VAR1
     * - fesaEffDate1                   COBOL Name: FESA-EFF-DATE1
     * - fesaSpiNbr1                    COBOL Name: FESA-SPI-NBR1
     * - w02FnuKeyRdnxt                 COBOL Name: W02-FNU-KEY-RDNXT
     * - fesaKey1                       COBOL Name: FESA-KEY1
     * - w02RespCd                      COBOL Name: W02-RESP-CD
     * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
     * - w02DsplMsg                     COBOL Name: W02-DSPL-MSG
     * - w02FnuLineReadnext             COBOL Name: W02-FNU-LINE-READNEXT
     * - w02DsplErrInd                  COBOL Name: W02-DSPL-ERR-IND
     * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
     *
     * @throws CFException
     */
    @Override
    public BuildPlanAltTableOutCtx buildPlanAltTable(BuildPlanAltTableInCtx methodIn) throws Exception {
        // *81 Built if date of service falls within the plan effective date*
        // *81 and plan cancellation date.                                  *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2020-build-plan-alt-table                                    *
        // *82                                                              *
        // *82 1. read the next record from the plan variation file.        *
        // *82    if the record is not found, or the end of file is reached *
        // *82    set a switch to indicate the same and exit the section. if*
        // *82    any other error occurs, display the error and abort the   *
        // *82    program.                                                  *
        // *82 2. if the policy number and the plan variable in the record  *
        // *82    does not match with the ones in the storage variables,    *
        // *82    exit the paragraph,otherwise                              *
        // *82    -populate the storage variables with the plan dates.      *
        // *82    -check if the date of service falls within the plan       *
        // *82     effective date and the cancel date. also add a century   *
        // *82     variable to the dates.                                   *
        // *82    -built a table to store the policy name, plan variable,   *
        // *82     effective date and special processing instructions number*
        // *82***************************************************************
        // *-------------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        BuildPlanAltTableOutCtx methodOut = methodIn.getBuildPlanAltTableOutCtx();
        // cobolCode::PERFORM 2017-READ-NEXT-PLANVARA THRU 2017-EXIT
        readNextPlanvara(programCtx.getReadNextPlanvaraInCtx());
        /*2017-READ-NEXT-PLANVARA*/
        // cobolCode::EVALUATE TRUE
        if (methodIn.isCicsNormal()) {
            // cobolCode::IF FESA-POLICY NOT = WS-POL-NO OR FESA-PLAN-VAR NOT = WS-PLAN-VAR-PREV
            if (compareChars(methodOut.getFesaPolicy(), methodIn.getPolNo()) != 0 || (methodOut.getFesaPlanVar() != methodIn.getPlanVarPrev())) {
                // LITERAL_Y = 'Y'
                methodOut.setEndOfPlanAlt(CONSTANTS.LITERAL_Y);
                // cobolCode::GO TO 2020-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 2020-EXIT
            } else // cobolCode::ELSE
            {
                // cobolCode::MOVE FESA-EFF-DATE TO WS-PLAN-EFF-DATE
                methodOut.setPlanEffDate(methodOut.getFesaEffDate());
                // cobolCode::MOVE FESA-CAN-DT TO WS-PLAN-CAN-DATE
                methodOut.setPlanCanDate(methodOut.getFesaCanDt());
                // cobolCode::MOVE LK-51U-LINE-DOS-DATE ( LK-SUB ) TO WS-PLAN-DOS-DATE
                methodOut.setPlanDosDate(methodOut.getULineDosDate51(methodIn.getSub01() - 1));
                // cobolCode::MOVE WS-PLAN-DOS-YY TO WS-PLAN-YY
                methodOut.setPlanYy(methodOut.getPlanDosYy());
                // cobolCode::MOVE WS-PLAN-DOS-MM TO WS-PLAN-MM
                methodOut.setPlanMm(methodOut.getPlanDosMm());
                // cobolCode::MOVE WS-PLAN-DOS-DD TO WS-PLAN-DD
                methodOut.setPlanDd(methodOut.getPlanDosDd());
                // cobolCode::PERFORM 2021-ADD-CENTURY-TO-DATES THRU 2021-EXIT
                addCenturyToDates(programCtx.getAddCenturyToDatesInCtx());
                /*2021-ADD-CENTURY-TO-DATES*/
                // cobolCode::IF ( WS-PLAN-DATE NOT < WS-PLAN-EFF-DATE ) AND ( WS-PLAN-DATE NOT > WS-PLAN-CAN-DATE )
                if (((methodIn.getPlanDate() >= methodOut.getPlanEffDate())) && ((methodIn.getPlanDate() <= methodOut.getPlanCanDate()))) {
                    // cobolCode::MOVE FESA-POLICY TO WS-FESA-POLICY ( WS-SUB )
                    methodOut.setFesaPolicy01(methodOut.getSub() - 1, methodOut.getFesaPolicy());
                    // cobolCode::MOVE FESA-PLAN-VAR TO WS-FESA-PLAN-VAR ( WS-SUB )
                    methodOut.setFesaPlanVar01(methodOut.getSub() - 1, methodOut.getFesaPlanVar());
                    // cobolCode::MOVE FESA-EFF-DATE TO WS-FESA-EFF-DATE ( WS-SUB )
                    methodOut.setFesaEffDate01(methodOut.getSub() - 1, methodOut.getFesaEffDate());
                    // cobolCode::MOVE FESA-SPI-NBR TO WS-FESA-SPI-NBR ( WS-SUB )
                    methodOut.setFesaSpiNbr01(methodOut.getSub() - 1, methodOut.getFesaSpiNbr());
                    // LITERAL_Y = 'Y'
                    methodOut.setPlanVarFoundSw(CONSTANTS.LITERAL_Y);
                    // cobolCode::ADD 1 TO WS-SUB WS-NBR-OF-PLAN-VAR
                    methodOut.setSub(methodOut.getSub() + 1);
                    methodOut.setNbrOfPlanVar(methodOut.getNbrOfPlanVar() + 1);
                }
                // cobolCode::ELSE
            }
        } else if ((methodIn.isCicsEof()) || (methodIn.isCicsEndfile())) {
            // LITERAL_Y = 'Y'
            methodOut.setEndOfPlanAlt(CONSTANTS.LITERAL_Y);
            // cobolCode::GO TO 2020-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 2020-EXIT
        } else {
            // cobolCode::MOVE DD-PLANVARA TO W02-FNU-FILE-RDNXT
            methodOut.setW02FnuFileRdnxt(methodOut.getDdPlanvara());
            // cobolCode::MOVE FESA-POLICY TO FESA-POLICY1
            methodOut.setFesaPolicy1(methodOut.getFesaPolicy());
            // cobolCode::MOVE FESA-PLAN-VAR TO FESA-PLAN-VAR1
            methodOut.setFesaPlanVar1(methodOut.getFesaPlanVar());
            // cobolCode::MOVE FESA-EFF-DATE TO FESA-EFF-DATE1
            methodOut.setFesaEffDate1(methodOut.getFesaEffDate());
            // cobolCode::MOVE FESA-SPI-NBR TO FESA-SPI-NBR1
            methodOut.setFesaSpiNbr1(methodOut.getFesaSpiNbr());
            methodOut.setW02FnuKeyRdnxt(methodOut.getFesaKey1().toCharArray());
            // cobolCode::MOVE CICS-DFHRESP-CODE TO W02-RESP-CD
            methodOut.setW02RespCd(methodOut.getCicsDfhrespCode());
            methodOut.setW02DsplMsg(methodOut.getW02FnuLineReadnext().toCharArray());
            // cobolCode::MOVE 'ERR' TO W02-DSPL-ERR-IND
            // LITERAL_ERR = 'ERR'
            methodOut.setW02DsplErrInd(CONSTANTS.LITERAL_ERR);
            // cobolCode::PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
            writeToSysm(programCtx.getWriteToSysmInCtx());
            /*11100A-WRITE-TO-SYSM SECTION*/
            // cobolCode::SET M51U-ILLOGICAL-COND TO TRUE
            methodOut.setM51uIllogicalCondTrue();
            // cobolCode::PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
            dumpAbend(programCtx);
            /*8000-DUMP-ABEND SECTION*/
        }
        return methodOut;
    }

    /**
     * addCenturyToDates
     *   This method is derived from
     *   COBOL Paragraph - 2021-ADD-CENTURY-TO-DATES COBOL Cyclomatic complexity - 13
     * Input  :
     *
     * - fesaEffDate                    COBOL Name: FESA-EFF-DATE
     * - planEffYy                      COBOL Name: WS-PLAN-EFF-YY
     * - fesaCanDt                      COBOL Name: FESA-CAN-DT
     * - planCanYy                      COBOL Name: WS-PLAN-CAN-YY
     * - planDosDate                    COBOL Name: WS-PLAN-DOS-DATE
     * - planYy                         COBOL Name: WS-PLAN-YY
     *
     * Output :
     *
     * - planEffCc                      COBOL Name: WS-PLAN-EFF-CC
     * - planCanCc                      COBOL Name: WS-PLAN-CAN-CC
     * - planCc                         COBOL Name: WS-PLAN-CC
     *
     * @throws CFException
     */
    @Override
    public AddCenturyToDatesOutCtx addCenturyToDates(AddCenturyToDatesInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2021-Add-century-to-dates                                    *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 adds a century part into the date variables, to take care of *
        // *81 y2k problems.                                                *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2021-add-century-to-dates                                    *
        // *82                                                              *
        // *82 1. to each of the date variables, in the record and in the   *
        // *82    storage variables, add the century variable too. this     *
        // *82    section takes care of the y2k conversion.                 *
        // *82***************************************************************
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        AddCenturyToDatesOutCtx methodOut = methodIn.getAddCenturyToDatesOutCtx();
        // cobolCode::EVALUATE TRUE
        if ((methodIn.getFesaEffDate() == 999999)) {
            methodOut.setPlanEffCc(99);
        } else if ((methodIn.getFesaEffDate() == 0)) {
            methodOut.setPlanEffCc(0);
        } else if ((methodIn.getPlanEffYy() > 50)) {
            methodOut.setPlanEffCc(19);
        } else {
            methodOut.setPlanEffCc(20);
        }
        // cobolCode::EVALUATE TRUE
        if ((methodIn.getFesaCanDt() == 999999)) {
            methodOut.setPlanCanCc(99);
        } else if ((methodIn.getFesaCanDt() == 0)) {
            methodOut.setPlanCanCc(0);
        } else if ((methodIn.getPlanCanYy() > 50)) {
            methodOut.setPlanCanCc(19);
        } else {
            methodOut.setPlanCanCc(20);
        }
        // cobolCode::EVALUATE TRUE
        if ((methodIn.getPlanDosDate() == 999999)) {
            methodOut.setPlanCc(99);
        } else if ((methodIn.getPlanDosDate() == 0)) {
            methodOut.setPlanCc(0);
        } else if ((methodIn.getPlanYy() > 50)) {
            methodOut.setPlanCc(19);
        } else {
            methodOut.setPlanCc(20);
        }
        return methodOut;
    }

    /**
     * readSpiRules
     *   This method is derived from
     *   COBOL Paragraph - 2030-READ-SPI-RULES COBOL Cyclomatic complexity - 6
     * Input  :
     *
     * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
     * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
     * - ddSpirules                     COBOL Name: DD-SPIRULES
     * - fesrKey                        COBOL Name: WS-FESR-KEY
     * - w02FnuLineStartbr              COBOL Name: W02-FNU-LINE-STARTBR
     * - endOfSpiRule                   COBOL Name: WS-END-OF-SPI-RULE
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - fesrToPs01                     COBOL Name: FESR-TO-PS
     * - fesrToSvc01                    COBOL Name: FESR-TO-SVC
     * - fesrToCause01                  COBOL Name: FESR-TO-CAUSE
     * - fesrSpiNbr01                   COBOL Name: FESR-SPI-NBR
     * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - w02FnuFileStbr                 COBOL Name: W02-FNU-FILE-STBR
     * - ddSpirules                     COBOL Name: DD-SPIRULES
     * - fesrSpiNbr                     COBOL Name: WS-FESR-SPI-NBR
     * - fesrToPs                       COBOL Name: WS-FESR-TO-PS
     * - fesrToSvc                      COBOL Name: WS-FESR-TO-SVC
     * - fesrToCause                    COBOL Name: WS-FESR-TO-CAUSE
     * - w02FnuKeyStbr                  COBOL Name: W02-FNU-KEY-STBR
     * - fesrKey                        COBOL Name: WS-FESR-KEY
     * - w02RespCd                      COBOL Name: W02-RESP-CD
     * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
     * - w02DsplMsg                     COBOL Name: W02-DSPL-MSG
     * - w02FnuLineStartbr              COBOL Name: W02-FNU-LINE-STARTBR
     * - w02DsplErrInd                  COBOL Name: W02-DSPL-ERR-IND
     * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
     * - endOfSpiRule                   COBOL Name: WS-END-OF-SPI-RULE
     *
     * @throws CFException
     */
    @Override
    public ReadSpiRulesOutCtx readSpiRules(ReadSpiRulesInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2030-Read-spi-rules                                          *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 here program will start browse of spi rules file and performs*
        // *81 read next on spi(special processing information) rules       *
        // *81 record and builds a out service line if spi rules are applied*
        // *81 to an in-service line.                                       *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2030-read-spi-rules                                          *
        // *82                                                              *
        // *82 1. fill the parameter keys with low values (initialize keys) *
        // *82 2. browse the special processing instructions file. if the   *
        // *82    record is not found or the end of file is reached, exit   *
        // *82    the section. if any other error occurs, display the error *
        // *82    and abort the program.                                    *
        // *82 3. read the next record and apply the special processing     *
        // *82    instruction rules individually.                           *
        // *82***************************************************************
        // *---------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        ReadSpiRulesOutCtx methodOut = methodIn.getReadSpiRulesOutCtx();
        // LITERAL_2030 = '2030'
        methodOut.setParagraph(CONSTANTS.LITERAL_2030);
        // cobolCode::MOVE LOW-VALUES TO FESR-TO-PS FESR-TO-SVC FESR-TO-CAUSE
        methodOut.setFesrToPs01(CONSTANTS.LOW_VALUE_1703015893);
        methodOut.setFesrToSvc01(CONSTANTS.LOW_VALUE_1703015769);
        methodOut.setFesrToCause01(CONSTANTS.LOW_VALUE_1703015924);
        // cobolCode::MOVE WS-FESA-SPI-NBR ( WS-SUB ) TO FESR-SPI-NBR
        methodOut.setFesrSpiNbr01(methodOut.getFesaSpiNbr01(methodIn.getSub() - 1));
        // cobolCode::MOVE ZEROS TO WS-NBR-MATCHED
        methodOut.setNbrMatched(0);
        // cobolCode::PERFORM 2041-START-BROWSE-SPIRULES THRU 2041-EXIT
        startBrowseSpirules(programCtx.getStartBrowseSpirulesInCtx());
        /*2041-START-BROWSE-SPIRULES*/
        // cobolCode::EVALUATE TRUE
        if (methodIn.isCicsNormal()) {
            ;
        } else if ((methodIn.isCicsNotfnd()) || (methodIn.isCicsEndfile())) {
            // cobolCode::GO TO 2030-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 2030-EXIT
        } else {
            // cobolCode::MOVE DD-SPIRULES TO W02-FNU-FILE-STBR
            methodOut.setW02FnuFileStbr(methodOut.getDdSpirules());
            // cobolCode::MOVE FESR-SPI-NBR TO WS-FESR-SPI-NBR
            methodOut.setFesrSpiNbr(methodOut.getFesrSpiNbr01());
            // cobolCode::MOVE FESR-TO-PS TO WS-FESR-TO-PS
            methodOut.setFesrToPs(methodOut.getFesrToPs01());
            // cobolCode::MOVE FESR-TO-SVC TO WS-FESR-TO-SVC
            methodOut.setFesrToSvc(methodOut.getFesrToSvc01());
            // cobolCode::MOVE FESR-TO-CAUSE TO WS-FESR-TO-CAUSE
            methodOut.setFesrToCause(methodOut.getFesrToCause01());
            methodOut.setW02FnuKeyStbr(methodOut.getFesrKey().toCharArray());
            // cobolCode::MOVE CICS-DFHRESP-CODE TO W02-RESP-CD
            methodOut.setW02RespCd(methodOut.getCicsDfhrespCode());
            methodOut.setW02DsplMsg(methodOut.getW02FnuLineStartbr().toCharArray());
            // cobolCode::MOVE 'ERR' TO W02-DSPL-ERR-IND
            // LITERAL_ERR = 'ERR'
            methodOut.setW02DsplErrInd(CONSTANTS.LITERAL_ERR);
            // cobolCode::PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
            writeToSysm(programCtx.getWriteToSysmInCtx());
            /*11100A-WRITE-TO-SYSM SECTION*/
            // cobolCode::SET M51U-ILLOGICAL-COND TO TRUE
            methodOut.setM51uIllogicalCondTrue();
            // cobolCode::PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
            dumpAbend(programCtx);
            /*8000-DUMP-ABEND SECTION*/
        }
        // cobolCode::PERFORM 2040-TRANSLATE-SPI-RULE THRU 2040-EXIT UNTIL END-OF-SPI-RULE
        while (!(methodIn.isEndOfSpiRule1())) {
            translateSpiRule(programCtx.getTranslateSpiRuleInCtx());
            /*2040-TRANSLATE-SPI-RULE*/
        }
        // cobolCode::PERFORM 2043-END-BROWSE-SPIRULES THRU 2043-EXIT
        endBrowseSpirules(programCtx.getEndBrowseSpirulesInCtx());
        /*2043-END-BROWSE-SPIRULES*/
        // LITERAL_N = 'N'
        methodOut.setEndOfSpiRule(CONSTANTS.LITERAL_N);
        return methodOut;
    }

    /**
     * translateSpiRule
     *   This method is derived from
     *   COBOL Paragraph - 2040-TRANSLATE-SPI-RULE COBOL Cyclomatic complexity - 6
     * Input  :
     *
     * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
     * - ddSpirules                     COBOL Name: DD-SPIRULES
     * - fesrSpiNbr01                   COBOL Name: FESR-SPI-NBR
     * - fesrToPs01                     COBOL Name: FESR-TO-PS
     * - fesrToSvc01                    COBOL Name: FESR-TO-SVC
     * - fesrToCause01                  COBOL Name: FESR-TO-CAUSE
     * - fesrKey                        COBOL Name: WS-FESR-KEY
     * - w02FnuLineRead                 COBOL Name: W02-FNU-LINE-READ
     * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
     * - sub                            COBOL Name: WS-SUB
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - endOfSpiRule                   COBOL Name: WS-END-OF-SPI-RULE
     * - w02DsplErrInd                  COBOL Name: W02-DSPL-ERR-IND
     * - w02FnuFileRd                   COBOL Name: W02-FNU-FILE-RD
     * - ddSpirules                     COBOL Name: DD-SPIRULES
     * - fesrSpiNbr                     COBOL Name: WS-FESR-SPI-NBR
     * - fesrSpiNbr01                   COBOL Name: FESR-SPI-NBR
     * - fesrToPs                       COBOL Name: WS-FESR-TO-PS
     * - fesrToPs01                     COBOL Name: FESR-TO-PS
     * - fesrToSvc                      COBOL Name: WS-FESR-TO-SVC
     * - fesrToSvc01                    COBOL Name: FESR-TO-SVC
     * - fesrToCause                    COBOL Name: WS-FESR-TO-CAUSE
     * - fesrToCause01                  COBOL Name: FESR-TO-CAUSE
     * - w02FnuKeyRd                    COBOL Name: W02-FNU-KEY-RD
     * - fesrKey                        COBOL Name: WS-FESR-KEY
     * - w02RespCd                      COBOL Name: W02-RESP-CD
     * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
     * - w02DsplMsg                     COBOL Name: W02-DSPL-MSG
     * - w02FnuLineRead                 COBOL Name: W02-FNU-LINE-READ
     * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
     *
     * @throws CFException
     */
    @Override
    public TranslateSpiRuleOutCtx translateSpiRule(TranslateSpiRuleInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2040-Translate-spi-rule                                      *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 reads next rules record and if special processing instruction*
        // *81 number equal to the corresponding valus in the  plan table   *
        // *81 then it applies the rules. rules are applied by matching     *
        // *81 place of service,service, provider type, cause codes and icd9*
        // *81 codes.                                                       *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2040-translate-spi-rule                                      *
        // *82                                                              *
        // *82 1. reads the next record from the rules file.                *
        // *82 2. if the end of the file is reached or the record is not    *
        // *82    found,set a switch to indicate the same and exit  section.*
        // *82 3. if the spi (special processing instructions) number in the*
        // *82    record does not match with the ones in the storage        *
        // *82    variables, exit the section.                              *
        // *82 4. search for a match on place of service, service codes,    *
        // *82    provider types, cause codes and icd9 codes.               *
        // *82***************************************************************
        // *------------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        TranslateSpiRuleOutCtx methodOut = methodIn.getTranslateSpiRuleOutCtx();
        // LITERAL_2040 = '2040'
        methodOut.setParagraph(CONSTANTS.LITERAL_2040);
        // cobolCode::PERFORM 2042-READ-NEXT-SPIRULES THRU 2042-EXIT
        readNextSpirules(programCtx.getReadNextSpirulesInCtx());
        /*2042-READ-NEXT-SPIRULES*/
        // cobolCode::EVALUATE TRUE
        if (methodIn.isCicsNormal()) {
            ;
        } else if (methodIn.isCicsEndfile()) {
            // LITERAL_Y = 'Y'
            methodOut.setEndOfSpiRule(CONSTANTS.LITERAL_Y);
            // cobolCode::GO TO 2040-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 2040-EXIT
        } else if (methodIn.isCicsNotfnd()) {
            // LITERAL_Y = 'Y'
            methodOut.setEndOfSpiRule(CONSTANTS.LITERAL_Y);
            // cobolCode::GO TO 2040-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 2040-EXIT
        } else {
            // cobolCode::MOVE 'ERR' TO W02-DSPL-ERR-IND
            // LITERAL_ERR = 'ERR'
            methodOut.setW02DsplErrInd(CONSTANTS.LITERAL_ERR);
            // cobolCode::MOVE DD-SPIRULES TO W02-FNU-FILE-RD
            methodOut.setW02FnuFileRd(methodOut.getDdSpirules());
            // cobolCode::MOVE FESR-SPI-NBR TO WS-FESR-SPI-NBR
            methodOut.setFesrSpiNbr(methodOut.getFesrSpiNbr01());
            // cobolCode::MOVE FESR-TO-PS TO WS-FESR-TO-PS
            methodOut.setFesrToPs(methodOut.getFesrToPs01());
            // cobolCode::MOVE FESR-TO-SVC TO WS-FESR-TO-SVC
            methodOut.setFesrToSvc(methodOut.getFesrToSvc01());
            // cobolCode::MOVE FESR-TO-CAUSE TO WS-FESR-TO-CAUSE
            methodOut.setFesrToCause(methodOut.getFesrToCause01());
            methodOut.setW02FnuKeyRd(methodOut.getFesrKey().toCharArray());
            // cobolCode::MOVE CICS-DFHRESP-CODE TO W02-RESP-CD
            methodOut.setW02RespCd(methodOut.getCicsDfhrespCode());
            methodOut.setW02DsplMsg(methodOut.getW02FnuLineRead().toCharArray());
            // cobolCode::PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
            writeToSysm(programCtx.getWriteToSysmInCtx());
            /*11100A-WRITE-TO-SYSM SECTION*/
            // cobolCode::SET M51U-ILLOGICAL-COND TO TRUE
            methodOut.setM51uIllogicalCondTrue();
            // cobolCode::PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
            dumpAbend(programCtx);
            /*8000-DUMP-ABEND SECTION*/
        }
        // ***         Go to 2040-exit
        // cobolCode::IF FESR-SPI-NBR NOT = WS-FESA-SPI-NBR ( WS-SUB )
        if ((methodOut.getFesrSpiNbr01() != methodIn.getFesaSpiNbr01(methodIn.getSub() - 1))) {
            // LITERAL_Y = 'Y'
            methodOut.setEndOfSpiRule(CONSTANTS.LITERAL_Y);
            // cobolCode::GO TO 2040-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 2040-EXIT
        }
        // cobolCode::PERFORM 2100-SPI-RULES-PROCESS THRU 2100-EXIT
        spiRulesProcess(programCtx.getSpiRulesProcessInCtx());
        /*2100-SPI-RULES-PROCESS*/
        return methodOut;
    }

    /**
     * startBrowseSpirules
     *   This method is derived from
     *   COBOL Paragraph - 2041-START-BROWSE-SPIRULES COBOL Cyclomatic complexity - 1
     * Input  : None
     *
     * Output :
     *
     * - dfhb0020                       COBOL Name: DFHB0020
     * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
     * - cetEibrcd                      COBOL Name: CET-EIBRCD
     *
     * @throws CFException
     */
    @Override
    public StartBrowseSpirulesOutCtx startBrowseSpirules(StartBrowseSpirulesInCtx methodIn) throws Exception {
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        StartBrowseSpirulesOutCtx methodOut = methodIn.getStartBrowseSpirulesOutCtx();
        // *EXEC CICS STARTBR
        // *     FILE(DD-SPIRULES)
        // *     RIDFLD(FESR-KEY)
        // *     KEYLENGTH (LENGTH OF FESR-KEY)
        // *     RESP(CICS-DFHRESP-CODE)
        // *END-EXEC.
        // cobolCode::MOVE LENGTH OF FESR-KEY TO DFHB0020
        methodOut.setDfhb0020(FesrKey01.getFesrKey01FieldLength());
        // cobolCode::STARTBR FILE(DD-SPIRULES) RIDFLD(FESR-KEY) KEYLENGTH (FUNCTION~LENGTH~FESR-KEY) RESP(CICS-DFHRESP-CODE)
        // start Browsing a file
        TransactionManager.startBrowsing(programCtx.getCicsSession(), methodIn.getDdSpirules(), methodIn.getFesrKey01().toCharArray(), "".toCharArray(), /*reqId*/
        "".toCharArray(), /*sysId*/
        FesrKey01.getFesrKey01FieldLength(), false, /*debkey*/
        false, /*debrec*/
        false, /*rba*/
        false, /*rrn*/
        false, /*xrba*/
        false, /*gteq*/
        false, /*equal*/
        false, /*generic*/
        new KeyInfo(0, 13, 0, false));
        // cobolCode::MOVE EIBRESP TO CICS-DFHRESP-CODE
        methodOut.setCicsDfhrespCode(programCtx.getCicsSession().getEibresp());
        // cobolCode::MOVE EIBRCODE TO CET-EIBRCD
        methodOut.setCetEibrcd(programCtx.getCicsSession().getEibrcode());
        return methodOut;
    }

    /**
     * readNextSpirules
     *   This method is derived from
     *   COBOL Paragraph - 2042-READ-NEXT-SPIRULES COBOL Cyclomatic complexity - 1
     * Input  : None
     *
     * Output :
     *
     * - dfhb0020                       COBOL Name: DFHB0020
     * - dfhb0021                       COBOL Name: DFHB0021
     * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
     * - cetEibrcd                      COBOL Name: CET-EIBRCD
     *
     * @throws CFException
     */
    @Override
    public ReadNextSpirulesOutCtx readNextSpirules(ReadNextSpirulesInCtx methodIn) throws Exception {
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        ReadNextSpirulesOutCtx methodOut = methodIn.getReadNextSpirulesOutCtx();
        // *EXEC CICS READNEXT
        // *     FILE      (DD-SPIRULES)
        // *     INTO      (FE-SPI-RULES-RECORD)
        // *     RIDFLD    (FESR-KEY)
        // *     KEYLENGTH (LENGTH OF FESR-KEY)
        // *     LENGTH    (LENGTH OF FE-SPI-RULES-RECORD)
        // *     RESP      (CICS-DFHRESP-CODE)
        // *END-EXEC.
        // cobolCode::MOVE LENGTH OF FE-SPI-RULES-RECORD TO DFHB0020
        methodOut.setDfhb0020(FeSpiRulesRecord.getFeSpiRulesRecordFieldLength());
        // cobolCode::MOVE LENGTH OF FESR-KEY TO DFHB0021
        methodOut.setDfhb0021(FesrKey01.getFesrKey01FieldLength());
        // cobolCode::READNEXT FILE (DD-SPIRULES) INTO (FE-SPI-RULES-RECORD) RIDFLD (FESR-KEY) KEYLENGTH (FUNCTION~LENGTH~FESR-KEY) LENGTH (FUNCTION~LENGTH~FE-SPI-RULES-RECORD) RESP (CICS-DFHRESP-CODE)
        // read the next record from a file
        methodIn.getFeSpiRulesRecord().setString(TransactionManager.readNextRecord(programCtx.getCicsSession(), methodIn.getDdSpirules(), methodIn.getFesrKey01().toCharArray(), "".toCharArray(), /*Token*/
        "".toCharArray(), /*SysId*/
        FesrKey01.getFesrKey01FieldLength(), FeSpiRulesRecord.getFeSpiRulesRecordFieldLength(), "".toCharArray(), /*ReqId*/
        false, /*rba*/
        false, /*rrn*/
        false, /*xrba*/
        false, /*nosuspend*/
        false, /*uncommitted*/
        false, /*consistent*/
        false, /*repeatable*/
        false).toCharArray());
        // cobolCode::MOVE EIBRESP TO CICS-DFHRESP-CODE
        methodOut.setCicsDfhrespCode(programCtx.getCicsSession().getEibresp());
        // cobolCode::MOVE EIBRCODE TO CET-EIBRCD
        methodOut.setCetEibrcd(programCtx.getCicsSession().getEibrcode());
        return methodOut;
    }

    /**
     * endBrowseSpirules
     *   This method is derived from
     *   COBOL Paragraph - 2043-END-BROWSE-SPIRULES COBOL Cyclomatic complexity - 1
     * Input  : None
     *
     * Output :
     *
     * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
     *
     * @throws CFException
     */
    @Override
    public EndBrowseSpirulesOutCtx endBrowseSpirules(EndBrowseSpirulesInCtx methodIn) throws Exception {
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        EndBrowseSpirulesOutCtx methodOut = methodIn.getEndBrowseSpirulesOutCtx();
        // cobolCode::ENDBR FILE (DD-SPIRULES) RESP (CICS-DFHRESP-CODE)
        // end browsing the file
        TransactionManager.endBrowsing(programCtx.getCicsSession(), methodIn.getDdSpirules(), "".toCharArray(), /*sysId*/
        "".toCharArray());
        // cobolCode::MOVE EIBRESP TO CICS-DFHRESP-CODE
        methodOut.setCicsDfhrespCode(programCtx.getCicsSession().getEibresp());
        return methodOut;
    }

    /**
     * spiRulesProcess
     *   This method is derived from
     *   COBOL Paragraph - 2100-SPI-RULES-PROCESS COBOL Cyclomatic complexity - 35
     * Input  :
     *
     * - fesrFromPs                     COBOL Name: FESR-FROM-PS
     * - psSub                          COBOL Name: PS-SUB
     * - fesrFromFrSvc                  COBOL Name: FESR-FROM-FR-SVC
     * - svcSub                         COBOL Name: SVC-SUB
     * - fesrFromPrvTyp                 COBOL Name: FESR-FROM-PRV-TYP
     * - pvSub                          COBOL Name: PV-SUB
     * - fesrFromFrIcd9                 COBOL Name: FESR-FROM-FR-ICD9
     * - icd9Sub                        COBOL Name: ICD9-SUB
     * - fesrFromCauseCd                COBOL Name: FESR-FROM-CAUSE-CD
     * - causeSub                       COBOL Name: CAUSE-SUB
     * - fesrIpaCd                      COBOL Name: FESR-IPA-CD
     * - fesrToPs01                     COBOL Name: FESR-TO-PS
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - nbrMatchedPrev                 COBOL Name: WS-NBR-MATCHED-PREV
     * - fesrToSvc01                    COBOL Name: FESR-TO-SVC
     * - fesrToCause01                  COBOL Name: FESR-TO-CAUSE
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - fromPsFound                    COBOL Name: WS-FROM-PS-FOUND
     * - fromSvcFound                   COBOL Name: WS-FROM-SVC-FOUND
     * - fromPrvFound                   COBOL Name: WS-FROM-PRV-FOUND
     * - fromIcd9Found                  COBOL Name: WS-FROM-ICD9-FOUND
     * - fromCauseFound                 COBOL Name: WS-FROM-CAUSE-FOUND
     * - ipaCodeFound                   COBOL Name: WS-IPA-CODE-FOUND
     * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
     * - psSub                          COBOL Name: PS-SUB
     * - svcSub                         COBOL Name: SVC-SUB
     * - pvSub                          COBOL Name: PV-SUB
     * - icd9Sub                        COBOL Name: ICD9-SUB
     * - causeSub                       COBOL Name: CAUSE-SUB
     * - holdPs                         COBOL Name: WS-HOLD-PS
     * - fesrToPs01                     COBOL Name: FESR-TO-PS
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - nbrMatchedPrev                 COBOL Name: WS-NBR-MATCHED-PREV
     * - nbrEqual                       COBOL Name: WS-NBR-EQUAL
     * - holdSvc                        COBOL Name: WS-HOLD-SVC
     * - fesrToSvc01                    COBOL Name: FESR-TO-SVC
     * - holdCauseCd                    COBOL Name: WS-HOLD-CAUSE-CD
     * - fesrToCause01                  COBOL Name: FESR-TO-CAUSE
     *
     * @throws CFException
     */
    @Override
    public SpiRulesProcessOutCtx spiRulesProcess(SpiRulesProcessInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2100-Spi-rules-process                                       *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 searches for a match on each of the parameters individually. *
        // *81 all from conditions which exist must match to the claim. as  *
        // *81 soon as one does not match, the spi(special processing       *
        // *81 instructions) does not apply.                                *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2100-spi-rules-process                                       *
        // *82                                                              *
        // *82 1. initialize the found switches.                            *
        // *82 2. perform a search for the place of service, if the place of*
        // *82    service is not found, exit the section.                   *
        // *82 3. perform a search for the service code. if the service code*
        // *82    is not found, exit the section.                           *
        // *82 4. perform a search for the provider code. if the provider   *
        // *82    code is not found, exit the section.                      *
        // *82 5. perform a search for the fr-icd9. if the fr-icd9          *
        // *82    is not found, exit the section.                           *
        // *82 6. perform a search for the cause code. if the cause code    *
        // *82    is not found, exit the section.                           *
        // *82 7. perform a search for the prefered provider organization.  *
        // *82    if the code is not found, exit the section.               *
        // *82 8. if more than one spi matches, apply the spi which matched *
        // *82    to the most "from fields".  if the number is equal, then  *
        // *82    non-select the claim with '48' - mult spi matches.        *
        // *82***************************************************************
        // *------------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        SpiRulesProcessOutCtx methodOut = methodIn.getSpiRulesProcessOutCtx();
        // LITERAL_2100 = '2100'
        methodOut.setParagraph(CONSTANTS.LITERAL_2100);
        // LITERAL_N = 'N'
        methodOut.setFromPsFound(CONSTANTS.LITERAL_N);
        // LITERAL_N = 'N'
        methodOut.setFromSvcFound(CONSTANTS.LITERAL_N);
        // LITERAL_N = 'N'
        methodOut.setFromPrvFound(CONSTANTS.LITERAL_N);
        // LITERAL_N = 'N'
        methodOut.setFromIcd9Found(CONSTANTS.LITERAL_N);
        // LITERAL_N = 'N'
        methodOut.setFromCauseFound(CONSTANTS.LITERAL_N);
        // LITERAL_N = 'N'
        methodOut.setIpaCodeFound(CONSTANTS.LITERAL_N);
        // LITERAL_N = 'N'
        methodOut.setSearchComplete(CONSTANTS.LITERAL_N);
        // cobolCode::IF FESR-FROM-PS (1) NOT = SPACES
        if ((!allSpaces(methodIn.getFesrFromPs(0)))) {
            // cobolCode::PERFORM 2110-SEARCH-PS THRU 2110-EXIT VARYING PS-SUB FROM 1 BY 1 UNTIL PS-SUB > 30 OR SEARCH-COMPLETE OR FROM-PS-FOUND
            for (methodOut.setPsSub(1); (methodOut.getPsSub() <= 30) && !(methodOut.isSearchComplete1()) && !(methodOut.isFromPsFound1()); methodOut.setPsSub(methodOut.getPsSub() + 1)) {
                searchPs(programCtx.getSearchPsInCtx());
                /*2110-SEARCH-PS*/
            }
            // cobolCode::IF NOT FROM-PS-FOUND
            if (!(methodOut.isFromPsFound1())) {
                // cobolCode::GO TO 2100-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 2100-EXIT
            }
        }
        // LITERAL_N = 'N'
        methodOut.setSearchComplete(CONSTANTS.LITERAL_N);
        // cobolCode::IF FESR-FROM-FR-SVC (1) NOT = SPACES
        if ((!allSpaces(methodIn.getFesrFromFrSvc(0)))) {
            // cobolCode::PERFORM 2120-SEARCH-SVC THRU 2120-EXIT VARYING SVC-SUB FROM 1 BY 1 UNTIL SVC-SUB > 198 OR SEARCH-COMPLETE OR FROM-SVC-FOUND
            for (methodOut.setSvcSub(1); (methodOut.getSvcSub() <= 198) && !(methodOut.isSearchComplete1()) && !(methodOut.isFromSvcFound1()); methodOut.setSvcSub(methodOut.getSvcSub() + 1)) {
                searchSvc(programCtx.getSearchSvcInCtx());
                /*2120-SEARCH-SVC*/
            }
            // cobolCode::IF NOT FROM-SVC-FOUND
            if (!(methodOut.isFromSvcFound1())) {
                // cobolCode::GO TO 2100-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 2100-EXIT
            }
        }
        // LITERAL_N = 'N'
        methodOut.setSearchComplete(CONSTANTS.LITERAL_N);
        // cobolCode::IF FESR-FROM-PRV-TYP (1) NOT = SPACES
        if ((!allSpaces(methodIn.getFesrFromPrvTyp(0)))) {
            // cobolCode::PERFORM 2130-SEARCH-PRV THRU 2130-EXIT VARYING PV-SUB FROM 1 BY 1 UNTIL PV-SUB > 80 OR SEARCH-COMPLETE
            for (methodOut.setPvSub(1); (methodOut.getPvSub() <= 80) && !(methodOut.isSearchComplete1()); methodOut.setPvSub(methodOut.getPvSub() + 1)) {
                searchPrv(programCtx.getSearchPrvInCtx());
                /*2130-SEARCH-PRV*/
            }
            // cobolCode::IF NOT FROM-PRV-FOUND
            if (!(methodOut.isFromPrvFound1())) {
                // cobolCode::GO TO 2100-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 2100-EXIT
            }
        }
        // LITERAL_N = 'N'
        methodOut.setSearchComplete(CONSTANTS.LITERAL_N);
        // cobolCode::IF FESR-FROM-FR-ICD9 (1) NOT = SPACES
        if ((!allSpaces(methodIn.getFesrFromFrIcd9(0)))) {
            // cobolCode::PERFORM 2140-SEARCH-ICD9 THRU 2140-EXIT VARYING ICD9-SUB FROM 1 BY 1 UNTIL ICD9-SUB > 100 OR SEARCH-COMPLETE OR FROM-ICD9-FOUND
            for (methodOut.setIcd9Sub(1); (methodOut.getIcd9Sub() <= 100) && !(methodOut.isSearchComplete1()) && !(methodOut.isFromIcd9Found1()); methodOut.setIcd9Sub(methodOut.getIcd9Sub() + 1)) {
                searchIcd9(programCtx.getSearchIcd9InCtx());
                /*2140-SEARCH-ICD9*/
            }
            // cobolCode::IF NOT FROM-ICD9-FOUND
            if (!(methodOut.isFromIcd9Found1())) {
                // cobolCode::GO TO 2100-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 2100-EXIT
            }
        }
        // LITERAL_N = 'N'
        methodOut.setSearchComplete(CONSTANTS.LITERAL_N);
        // cobolCode::IF FESR-FROM-CAUSE-CD (1) NOT = SPACES
        if ((!allSpaces(methodIn.getFesrFromCauseCd(0)))) {
            // cobolCode::PERFORM 2150-SEARCH-CAUSE THRU 2150-EXIT VARYING CAUSE-SUB FROM 1 BY 1 UNTIL CAUSE-SUB > 7 OR SEARCH-COMPLETE OR FROM-CAUSE-FOUND
            for (methodOut.setCauseSub(1); (methodOut.getCauseSub() <= 7) && !(methodOut.isSearchComplete1()) && !(methodOut.isFromCauseFound1()); methodOut.setCauseSub(methodOut.getCauseSub() + 1)) {
                searchCause(programCtx.getSearchCauseInCtx());
                /*2150-SEARCH-CAUSE*/
            }
            // cobolCode::IF NOT FROM-CAUSE-FOUND
            if (!(methodOut.isFromCauseFound1())) {
                // cobolCode::GO TO 2100-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 2100-EXIT
            }
        }
        // LITERAL_N = 'N'
        methodOut.setSearchComplete(CONSTANTS.LITERAL_N);
        // cobolCode::IF FESR-IPA-CD (1) = ZEROES
        // cobolCode::ELSE
        if ((methodIn.getFesrIpaCd(0) != 0)) {
            // cobolCode::PERFORM 2160-MATCH-IPA-TO-PPOALT THRU 2160-EXIT
            matchIpaToPpoalt(programCtx.getMatchIpaToPpoaltInCtx());
            /*2160-MATCH-IPA-TO-PPOALT*/
            // cobolCode::IF NOT IPA-CODE-FOUND
            if (!(methodOut.isIpaCodeFound1())) {
                // cobolCode::GO TO 2100-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 2100-EXIT
            } else // cobolCode::ELSE
            {
                // cobolCode::MOVE FESR-TO-PS TO WS-HOLD-PS
                methodOut.setHoldPs(methodOut.getFesrToPs01());
                // cobolCode::ADD 1 TO WS-NBR-MATCHED
                methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
            }
        }
        // *** If more than one spi matches, apply the spi which matched
        // *** to the most "from fields".  if the number is equal, then
        // *** non-select the claim with '48' - mult spi matches.
        // *** If more than one spi matches, apply the spi which matched
        // *** to the most "from fields".  if the number is equal, then
        // *** non-select the claim with '48' - mult spi matches.
        // LITERAL_N = 'N'
        methodOut.setSearchComplete(CONSTANTS.LITERAL_N);
        // cobolCode::IF WS-NBR-MATCHED > WS-NBR-MATCHED-PREV
        if ((methodOut.getNbrMatched() > methodOut.getNbrMatchedPrev())) {
            // cobolCode::MOVE WS-NBR-MATCHED TO WS-NBR-MATCHED-PREV
            methodOut.setNbrMatchedPrev(methodOut.getNbrMatched());
            // LITERAL_N = 'N'
            methodOut.setNbrEqual(CONSTANTS.LITERAL_N);
            // cobolCode::MOVE FESR-TO-PS TO WS-HOLD-PS
            methodOut.setHoldPs(methodOut.getFesrToPs01());
            // cobolCode::MOVE FESR-TO-SVC TO WS-HOLD-SVC
            methodOut.setHoldSvc(methodOut.getFesrToSvc01());
            // cobolCode::MOVE FESR-TO-CAUSE TO WS-HOLD-CAUSE-CD
            methodOut.setHoldCauseCd(methodOut.getFesrToCause01());
            // cobolCode::MOVE ZEROS TO WS-NBR-MATCHED
            methodOut.setNbrMatched(0);
        } else // cobolCode::ELSE
        {
            // cobolCode::IF WS-NBR-MATCHED = WS-NBR-MATCHED-PREV AND WS-NBR-MATCHED NOT = ZEROS
            if ((methodOut.getNbrMatched() == methodOut.getNbrMatchedPrev()) && (methodOut.getNbrMatched() != 0)) {
                // LITERAL_Y = 'Y'
                methodOut.setNbrEqual(CONSTANTS.LITERAL_Y);
                // cobolCode::MOVE SPACES TO WS-HOLD-PS
                methodOut.setHoldPs(CONSTANTS.SPACE_2);
                // cobolCode::MOVE SPACES TO WS-HOLD-SVC
                methodOut.setHoldSvc(CONSTANTS.SPACE_6);
                // cobolCode::MOVE SPACES TO WS-HOLD-CAUSE-CD
                methodOut.setHoldCauseCd(CONSTANTS.SPACE);
                // cobolCode::MOVE ZEROS TO WS-NBR-MATCHED
                methodOut.setNbrMatched(0);
            }
        }
        return methodOut;
    }

    /**
     * searchPs
     *   This method is derived from
     *   COBOL Paragraph - 2110-SEARCH-PS COBOL Cyclomatic complexity - 3
     * Input  :
     *
     * - fesrFromPs                     COBOL Name: FESR-FROM-PS
     * - psSub                          COBOL Name: PS-SUB
     * - uLinePos51                     COBOL Name: LK-51U-LINE-POS
     * - sub01                          COBOL Name: LK-SUB
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - fromPsFound                    COBOL Name: WS-FROM-PS-FOUND
     *
     * @throws CFException
     */
    @Override
    public SearchPsOutCtx searchPs(SearchPsInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2110-Search-ps                                               *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 checks for a match on the place of service                   *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2110-search-ps                                               *
        // *82                                                              *
        // *82 1. if the place of service is empty, then set a switch to    *
        // *82    indicate that the search is complete.                     *
        // *82 2. if there is a match in the place of service between the   *
        // *82    value in the record and the linkage section,then increment*
        // *82    the counter and set a switch to indicate that a match is  *
        // *82    found.                                                    *
        // *82***************************************************************
        // *-------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        SearchPsOutCtx methodOut = methodIn.getSearchPsOutCtx();
        // LITERAL_2110 = '2110'
        methodOut.setParagraph(CONSTANTS.LITERAL_2110);
        // cobolCode::IF FESR-FROM-PS ( PS-SUB ) EQUAL SPACES
        if ((allSpaces(methodIn.getFesrFromPs(methodIn.getPsSub() - 1)))) {
            // LITERAL_Y = 'Y'
            methodOut.setSearchComplete(CONSTANTS.LITERAL_Y);
        } else // cobolCode::ELSE
        {
            // cobolCode::IF LK-51U-LINE-POS ( LK-SUB ) = FESR-FROM-PS ( PS-SUB )
            if (compareChars(methodIn.getULinePos51(methodIn.getSub01() - 1), methodIn.getFesrFromPs(methodIn.getPsSub() - 1)) == 0) {
                // cobolCode::ADD 1 TO WS-NBR-MATCHED
                methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
                // LITERAL_Y = 'Y'
                methodOut.setFromPsFound(CONSTANTS.LITERAL_Y);
            }
        }
        return methodOut;
    }

    /**
     * searchSvc
     *   This method is derived from
     *   COBOL Paragraph - 2120-SEARCH-SVC COBOL Cyclomatic complexity - 3
     * Input  :
     *
     * - fesrFromFrSvc                  COBOL Name: FESR-FROM-FR-SVC
     * - svcSub                         COBOL Name: SVC-SUB
     * - fesrFromToSvc                  COBOL Name: FESR-FROM-TO-SVC
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
     * - fesrFromToSvc                  COBOL Name: FESR-FROM-TO-SVC
     * - fesrFromFrSvc                  COBOL Name: FESR-FROM-FR-SVC
     *
     * @throws CFException
     */
    @Override
    public SearchSvcOutCtx searchSvc(SearchSvcInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2120-Search-svc                                              *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 this section checks for a match on the service codes         *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2120-search-svc                                              *
        // *82                                                              *
        // *82 1. if the service variable in the record is empty, then set  *
        // *82    a switch to indicate that the search is complete.         *
        // *82 2. perform a check on the service code matches.              *
        // *82 3. when service codes match is found, a flag is set and a    *
        // *82    counter is accumulated to indicate number of matches.     *
        // *82    match should be within to and from spi svc, if both are   *
        // *82    present                                                   *
        // *82***************************************************************
        // *-------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        SearchSvcOutCtx methodOut = methodIn.getSearchSvcOutCtx();
        // LITERAL_2120 = '2120'
        methodOut.setParagraph(CONSTANTS.LITERAL_2120);
        // cobolCode::IF FESR-FROM-FR-SVC ( SVC-SUB ) EQUAL SPACES
        if ((allSpaces(methodOut.getFesrFromFrSvc(methodIn.getSvcSub() - 1)))) {
            // LITERAL_Y = 'Y'
            methodOut.setSearchComplete(CONSTANTS.LITERAL_Y);
            // cobolCode::GO TO 2120-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 2120-EXIT
        } else // cobolCode::ELSE
        {
            // cobolCode::IF FESR-FROM-TO-SVC ( SVC-SUB ) EQUAL SPACES
            if ((allSpaces(methodOut.getFesrFromToSvc(methodIn.getSvcSub() - 1)))) {
                // cobolCode::MOVE FESR-FROM-FR-SVC ( SVC-SUB ) TO FESR-FROM-TO-SVC ( SVC-SUB )
                methodOut.setFesrFromToSvc(methodIn.getSvcSub() - 1, methodOut.getFesrFromFrSvc(methodIn.getSvcSub() - 1));
            }
        }
        // cobolCode::PERFORM 2125-TOPS-CNVSVC-FR-TO THRU 2125-EXIT
        topsCnvsvcFrTo(programCtx.getTopsCnvsvcFrToInCtx());
        /*2125-TOPS-CNVSVC-FR-TO*/
        return methodOut;
    }

    /**
     * topsCnvsvcFrTo
     *   This method is derived from
     *   COBOL Paragraph - 2125-TOPS-CNVSVC-FR-TO COBOL Cyclomatic complexity - 18
     * Input  :
     *
     * - fesrFromToSvc                  COBOL Name: FESR-FROM-TO-SVC
     * - fesrFromFrSvc                  COBOL Name: FESR-FROM-FR-SVC
     * - fesrSvcInd                     COBOL Name: FESR-SVC-IND
     * - svcSub                         COBOL Name: SVC-SUB
     * - medSvc                         COBOL Name: MED-SVC
     * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
     * - uMedicalClaim51                COBOL Name: LK-51U-MEDICAL-CLAIM
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     *
     * Output :
     *
     * - feServTo                       COBOL Name: FE-SERV-TO
     * - fesrFromToSvc                  COBOL Name: FESR-FROM-TO-SVC
     * - feServFr                       COBOL Name: FE-SERV-FR
     * - fesrFromFrSvc                  COBOL Name: FESR-FROM-FR-SVC
     * - servTop                        COBOL Name: WS-SERV-TOP
     * - medSvc                         COBOL Name: MED-SVC
     * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
     * - svc15                          COBOL Name: SVC-1-5
     * - svc6                           COBOL Name: SVC-6
     * - feSvc15Fr                      COBOL Name: FE-SVC-1-5-FR
     * - fromSvcFound                   COBOL Name: WS-FROM-SVC-FOUND
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - feSvc15To                      COBOL Name: FE-SVC-1-5-TO
     * - feSvc6Fr                       COBOL Name: FE-SVC-6-FR
     *
     * @throws CFException
     */
    @Override
    public TopsCnvsvcFrToOutCtx topsCnvsvcFrTo(TopsCnvsvcFrToInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2125-Tops-cnvsvc-fr-to                                       *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 checks for matches on tops service codes.                    *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2125-tops-cnvsvc-fr-to                                       *
        // *82                                                              *
        // *82 1. populate the tops service codes with the appropriate value*
        // *82 2. perform a check on the service codes.                     *
        // *82            1. check for a match on the first five digits.    *
        // *82            2. check for a match on the first six digits.     *
        // *82            3. check for a match on the first three digits.   *
        // *82 3. for every match, increment the match counter.             *
        // *82***************************************************************
        // *-----------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        TopsCnvsvcFrToOutCtx methodOut = methodIn.getTopsCnvsvcFrToOutCtx();
        // cobolCode::MOVE FESR-FROM-TO-SVC ( SVC-SUB ) TO FE-SERV-TO
        methodOut.setFeServTo(methodOut.getFesrFromToSvc(methodIn.getSvcSub() - 1));
        // cobolCode::MOVE FESR-FROM-FR-SVC ( SVC-SUB ) TO FE-SERV-FR
        methodOut.setFeServFr(methodOut.getFesrFromFrSvc(methodIn.getSvcSub() - 1));
        // cobolCode::IF FESR-SVC-IND ( SVC-SUB ) = 'T'
        if (methodIn.getFesrSvcInd(methodIn.getSvcSub() - 1)[0] == 'T') {
            // cobolCode::MOVE MED-SVC TO WS-SERV-TOP
            methodOut.setServTop(methodOut.getMedSvc());
        } else // cobolCode::ELSE
        {
            // cobolCode::MOVE LK-51U-LINE-SERVICE-CODE ( LK-SUB ) TO WS-SERV-TOP
            methodOut.setServTop(methodOut.getULineServiceCode51(methodIn.getSub01() - 1));
        }
        // cobolCode::IF ( SVC-1-5 (1 : 1) = 'C' ) AND LK-51U-MEDICAL-CLAIM NOT = 'Y'
        // LITERAL_Y = 'Y'
        if ((methodOut.getSvc15()[0] == 'C') && methodIn.getUMedicalClaim51()[0] != 'Y') {
            // cobolCode::IF FESR-SVC-IND ( SVC-SUB ) = 'S' AND SVC-6 NOT = SPACES
            if (methodIn.getFesrSvcInd(methodIn.getSvcSub() - 1)[0] == 'S' && (!allSpaces(methodOut.getSvc6()))) {
                // cobolCode::IF ( SVC-1-5 (1 : 3) = FE-SVC-1-5-FR (1 : 3))
                if ((compareChars(substring(methodOut.getSvc15(), 0, 3), substring(methodOut.getFeSvc15Fr(), 0, 3)) == 0)) {
                    // LITERAL_Y = 'Y'
                    methodOut.setFromSvcFound(CONSTANTS.LITERAL_Y);
                    // cobolCode::ADD 1 TO WS-NBR-MATCHED
                    methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
                }
                // cobolCode::GO TO 2125-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 2125-EXIT
            }
            // cobolCode::IF FESR-SVC-IND ( SVC-SUB ) = 'C' OR 'H' AND SVC-6 NOT = SPACES
            if (methodIn.getFesrSvcInd(methodIn.getSvcSub() - 1)[0] == 'C' || methodIn.getFesrSvcInd(methodIn.getSvcSub() - 1)[0] == 'H' && (!allSpaces(methodOut.getSvc6()))) {
                // cobolCode::GO TO 2125-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 2125-EXIT
            }
        }
        // cobolCode::IF ( SVC-1-5 NOT < FE-SVC-1-5-FR ) AND ( SVC-1-5 NOT > FE-SVC-1-5-TO )
        if ((compareChars(methodOut.getSvc15(), methodOut.getFeSvc15Fr()) >= 0) && (compareChars(methodOut.getSvc15(), methodOut.getFeSvc15To()) <= 0)) {
            // *** Do not want a hit on rev code range if it's a medical claim!
            // cobolCode::IF FESR-SVC-IND ( SVC-SUB ) = 'R'
            if (methodIn.getFesrSvcInd(methodIn.getSvcSub() - 1)[0] == 'R') {
                // cobolCode::IF LK-51U-MEDICAL-CLAIM = 'Y'
                // LITERAL_Y = 'Y'
                if (compareChars(methodIn.getUMedicalClaim51(), CONSTANTS.LITERAL_Y) == 0) {
                    // cobolCode::GO TO 2125-EXIT
                    return methodOut;
                    // cobolCodeEnds::GO TO 2125-EXIT
                }
            }
            // cobolCode::IF FE-SVC-6-FR NOT = SPACES
            if ((!allSpaces(methodOut.getFeSvc6Fr()))) {
                // cobolCode::IF SVC-6 = FE-SVC-6-FR
                if (compareChars(methodOut.getSvc6(), methodOut.getFeSvc6Fr()) == 0) {
                    // LITERAL_Y = 'Y'
                    methodOut.setFromSvcFound(CONSTANTS.LITERAL_Y);
                    // cobolCode::ADD 1 TO WS-NBR-MATCHED
                    methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
                } else // cobolCode::ELSE
                {
                    // cobolCode::IF SVC-6 = 'C' AND FE-SVC-6-FR = '2'
                    // LITERAL_2 = '2'
                    if (compareChars(methodOut.getSvc6(), CONSTANTS.LITERAL_C) == 0 && compareChars(methodOut.getFeSvc6Fr(), CONSTANTS.LITERAL_2) == 0) {
                        // LITERAL_Y = 'Y'
                        methodOut.setFromSvcFound(CONSTANTS.LITERAL_Y);
                        // cobolCode::ADD 1 TO WS-NBR-MATCHED
                        methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
                    }
                    // cobolCode::ELSE
                }
            } else // cobolCode::ELSE
            {
                // LITERAL_Y = 'Y'
                methodOut.setFromSvcFound(CONSTANTS.LITERAL_Y);
                // cobolCode::ADD 1 TO WS-NBR-MATCHED
                methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
            }
        }
        return methodOut;
    }

    /**
     * searchPrv
     *   This method is derived from
     *   COBOL Paragraph - 2130-SEARCH-PRV COBOL Cyclomatic complexity - 3
     * Input  :
     *
     * - fesrFromPrvTyp                 COBOL Name: FESR-FROM-PRV-TYP
     * - pvSub                          COBOL Name: PV-SUB
     * - uProvType51                    COBOL Name: LK-51U-PROV-TYPE
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - fromPrvFound                   COBOL Name: WS-FROM-PRV-FOUND
     *
     * @throws CFException
     */
    @Override
    public SearchPrvOutCtx searchPrv(SearchPrvInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2130-Search-prv                                              *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 check for provider type match.                               *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2130-search-prv                                              *
        // *82                                                              *
        // *82 1. if the provider type is empty, then set a switch to       *
        // *82    indicate that the search is complete.                     *
        // *82    else, if the provider type in the record matches with the *
        // *82    one in the linkage area, increment the counter which      *
        // *82    indicates the number of matches.                          *
        // *82***************************************************************
        // *-------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        SearchPrvOutCtx methodOut = methodIn.getSearchPrvOutCtx();
        // LITERAL_2130 = '2130'
        methodOut.setParagraph(CONSTANTS.LITERAL_2130);
        // cobolCode::IF FESR-FROM-PRV-TYP ( PV-SUB ) EQUAL SPACES
        if ((allSpaces(methodIn.getFesrFromPrvTyp(methodIn.getPvSub() - 1)))) {
            // LITERAL_Y = 'Y'
            methodOut.setSearchComplete(CONSTANTS.LITERAL_Y);
        } else // cobolCode::ELSE
        {
            // cobolCode::IF LK-51U-PROV-TYPE = FESR-FROM-PRV-TYP ( PV-SUB )
            if (compareChars(methodIn.getUProvType51(), methodIn.getFesrFromPrvTyp(methodIn.getPvSub() - 1)) == 0) {
                // cobolCode::ADD 1 TO WS-NBR-MATCHED
                methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
                // LITERAL_Y = 'Y'
                methodOut.setFromPrvFound(CONSTANTS.LITERAL_Y);
            }
        }
        return methodOut;
    }

    /**
     * searchIcd9
     *   This method is derived from
     *   COBOL Paragraph - 2140-SEARCH-ICD9 COBOL Cyclomatic complexity - 30
     * Input  :
     *
     * - s1                             COBOL Name: S1
     * - uDiagnosisCode51               COBOL Name: LK-51U-DIAGNOSIS-CODE
     * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
     * - fromIcd9Found                  COBOL Name: WS-FROM-ICD9-FOUND
     * - uMedicalClaim51                COBOL Name: LK-51U-MEDICAL-CLAIM
     * - uLineDiagPointer51             COBOL Name: LK-51U-LINE-DIAG-POINTER
     * - uSourceInd51                   COBOL Name: LK-51U-SOURCE-IND
     * - sub01                          COBOL Name: LK-SUB
     * - fesrFromFrIcd9                 COBOL Name: FESR-FROM-FR-ICD9
     * - icd9Sub                        COBOL Name: ICD9-SUB
     * - fesrFromToIcd9                 COBOL Name: FESR-FROM-TO-ICD9
     * - uIcdVerNbr51                   COBOL Name: LK-51U-ICD-VER-NBR
     * - d51uRicdClmIcdInd              COBOL Name: D51U-RICD-CLM-ICD-IND
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - s1                             COBOL Name: S1
     * - useDiagnosisSw                 COBOL Name: USE-DIAGNOSIS-SW
     * - point                          COBOL Name: WS-POINT
     * - uLineDiagPointer51             COBOL Name: LK-51U-LINE-DIAG-POINTER
     * - point1                         COBOL Name: WS-POINT-1
     * - point2                         COBOL Name: WS-POINT-2
     * - point3                         COBOL Name: WS-POINT-3
     * - point4                         COBOL Name: WS-POINT-4
     * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
     * - fromIcd9Found                  COBOL Name: WS-FROM-ICD9-FOUND
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     *
     * @throws CFException
     */
    @Override
    public SearchIcd9OutCtx searchIcd9(SearchIcd9InCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2140-Search-icd9                                             *
        // *81                                                              *
        // *81 check for icd9 match.                                        *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2140-search-icd9                                             *
        // *82                                                              *
        // *82 1. check if the diagnosis code is spaces.                    *
        // *82 2. examine the mediclaim switch, the source indicator, the   *
        // *82    line drag pointer and populate the use diagnosis switch.  *
        // *82 3. when icd9 match is found, a flag is set and a counter is  *
        // *82    accumulated to indicate number of matches. match should be*
        // *82    within to from spi icd9 when both are present.            *
        // *82***************************************************************
        // *-------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        SearchIcd9OutCtx methodOut = methodIn.getSearchIcd9OutCtx();
        // LITERAL_2140 = '2140'
        methodOut.setParagraph(CONSTANTS.LITERAL_2140);
        // cobolCode::PERFORM VARYING S1 FROM 1 BY 1 UNTIL S1 > 12 OR LK-51U-DIAGNOSIS-CODE (S1) = SPACES OR SEARCH-COMPLETE OR FROM-ICD9-FOUND
        for (methodOut.setS1(1); ((methodOut.getS1() <= 12) && (!allSpaces(methodIn.getUDiagnosisCode51(methodOut.getS1() - 1))) && !(methodIn.isSearchComplete1()) && !(methodIn.isFromIcd9Found1())); methodOut.setS1(methodOut.getS1() + 1)) {
            // *** For medical only check diagnosis where diag pointers apply
            // *** for a given line
            // *** For medical only check diagnosis where diag pointers apply
            // *** for a given line
            // LITERAL_N = 'N'
            methodOut.setUseDiagnosisSw(CONSTANTS.LITERAL_N);
            // cobolCode::IF LK-51U-MEDICAL-CLAIM = 'Y'
            // LITERAL_Y = 'Y'
            if (compareChars(methodIn.getUMedicalClaim51(), CONSTANTS.LITERAL_Y) == 0) {
                // *Dl1201    if s1 < 6
                // cobolCode::IF S1 < 5
                if ((methodOut.getS1() < 5)) {
                    // cobolCode::MOVE LK-51U-LINE-DIAG-POINTER ( LK-SUB ) TO WS-POINT
                    methodOut.getPoint().setString(methodOut.getULineDiagPointer51(methodIn.getSub01() - 1));
                    // cobolCode::IF LK-51U-SOURCE-IND = 'M' AND WS-POINT-1 = 00 AND S1 = 1
                    // LITERAL_1 = 1
                    if (compareChars(methodIn.getUSourceInd51(), CONSTANTS.LITERAL_M) == 0 && (methodOut.getPoint1() == 0) && (methodOut.getS1() == 1)) {
                        // *Dl1201           ws-point-1 = '0'
                        // *Dl1201           ws-point-1 = '0'
                        // LITERAL_Y = 'Y'
                        methodOut.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                    }
                    // cobolCode::IF LK-51U-SOURCE-IND = 'M' AND WS-POINT-1 = 05
                    if (compareChars(methodIn.getUSourceInd51(), CONSTANTS.LITERAL_M) == 0 && (methodOut.getPoint1() == 5)) {
                        // *Dl1201           ws-point-1 = '5'
                        // *Dl1201           ws-point-1 = '5'
                        // LITERAL_Y = 'Y'
                        methodOut.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                    }
                    // *Dl1201        if lk-51u-line-diag-pointer(lk-sub)(1:1)
                    // cobolCode::IF LK-51U-LINE-DIAG-POINTER ( LK-SUB ) (1 : 2) NOT = SPACES AND WS-POINT-1 = S1
                    if (!(Field.allSpaces(methodOut.getULineDiagPointer51(methodIn.getSub01() - 1), (0), 2)) && (methodOut.getPoint1() == methodOut.getS1())) {
                        // LITERAL_Y = 'Y'
                        methodOut.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                    }
                    // *Dl1201        if lk-51u-line-diag-pointer(lk-sub)(2:1)
                    // cobolCode::IF LK-51U-LINE-DIAG-POINTER ( LK-SUB ) (3 : 2) NOT = SPACES AND WS-POINT-2 = S1
                    if (!(Field.allSpaces(methodOut.getULineDiagPointer51(methodIn.getSub01() - 1), (2), 2)) && (methodOut.getPoint2() == methodOut.getS1())) {
                        // LITERAL_Y = 'Y'
                        methodOut.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                    }
                    // *Dl1201        if lk-51u-line-diag-pointer(lk-sub)(3:1)
                    // cobolCode::IF LK-51U-LINE-DIAG-POINTER ( LK-SUB ) (5 : 2) NOT = SPACES AND WS-POINT-3 = S1
                    if (!(Field.allSpaces(methodOut.getULineDiagPointer51(methodIn.getSub01() - 1), (4), 2)) && (methodOut.getPoint3() == methodOut.getS1())) {
                        // LITERAL_Y = 'Y'
                        methodOut.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                    }
                    // *Dl1201        if lk-51u-line-diag-pointer(lk-sub)(4:1)
                    // cobolCode::IF LK-51U-LINE-DIAG-POINTER ( LK-SUB ) (7 : 2) NOT = SPACES AND WS-POINT-4 = S1
                    if (!(Field.allSpaces(methodOut.getULineDiagPointer51(methodIn.getSub01() - 1), (6), 2)) && (methodOut.getPoint4() == methodOut.getS1())) {
                        // LITERAL_Y = 'Y'
                        methodOut.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                    }
                }
            } else // *Dl1201         if lk-51u-line-diag-pointer(lk-sub)(5:1)
            // *dl1201                                      not = spaces
            // *dl1201                  and
            // *dl1201            ws-point-5 = s1
            // *dl1201             move 'y' to use-diagnosis-sw
            // *dl1201         end-if
            // cobolCode::ELSE
            {
                // LITERAL_Y = 'Y'
                methodOut.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
            }
            // cobolCode::IF USE-DIAGNOSIS
            if (methodOut.isUseDiagnosis()) {
                // cobolCode::INSPECT LK-51U-DIAGNOSIS-CODE (S1) REPLACING ALL ' ' BY '0'
                methodIn.setUDiagnosisCode51(methodOut.getS1() - 1, replaceAll(methodIn.getUDiagnosisCode51(methodOut.getS1() - 1), CONSTANTS.SPACE, CONSTANTS.LITERAL_0));
                // cobolCode::INSPECT FESR-FROM-FR-ICD9 ( ICD9-SUB ) REPLACING ALL ' ' BY '0'
                methodIn.setFesrFromFrIcd9(methodIn.getIcd9Sub() - 1, replaceAll(methodIn.getFesrFromFrIcd9(methodIn.getIcd9Sub() - 1), CONSTANTS.SPACE, CONSTANTS.LITERAL_0));
                // cobolCode::INSPECT FESR-FROM-TO-ICD9 ( ICD9-SUB ) REPLACING ALL ' ' BY '0'
                methodIn.setFesrFromToIcd9(methodIn.getIcd9Sub() - 1, replaceAll(methodIn.getFesrFromToIcd9(methodIn.getIcd9Sub() - 1), CONSTANTS.SPACE, CONSTANTS.LITERAL_0));
                // cobolCode::IF FESR-FROM-FR-ICD9 ( ICD9-SUB ) = ZEROS
                if ((allZeros(methodIn.getFesrFromFrIcd9(methodIn.getIcd9Sub() - 1)))) /*  ==  zeros*/
                {
                    // LITERAL_Y = 'Y'
                    methodOut.setSearchComplete(CONSTANTS.LITERAL_Y);
                } else // cobolCode::ELSE
                {
                    // cobolCode::IF FESR-FROM-TO-ICD9 ( ICD9-SUB ) NOT = ZEROS
                    if (!(allZeros(methodIn.getFesrFromToIcd9(methodIn.getIcd9Sub() - 1)))) /*  !=  zeros*/
                    {
                        // *                  If lk-51u-diagnosis-code(s1) not <
                        // cobolCode::IF LK-51U-DIAGNOSIS-CODE (S1) (1 : 5) NOT < FESR-FROM-FR-ICD9 ( ICD9-SUB ) AND LK-51U-DIAGNOSIS-CODE (S1) (1 : 5) NOT > FESR-FROM-TO-ICD9 ( ICD9-SUB ) AND LK-51U-ICD-VER-NBR = D51U-RICD-CLM-ICD-IND ( ICD9-SUB )
                        if (compareChars(substring(methodIn.getUDiagnosisCode51(methodOut.getS1() - 1), 0, 5), methodIn.getFesrFromFrIcd9(methodIn.getIcd9Sub() - 1)) >= 0 && compareChars(substring(methodIn.getUDiagnosisCode51(methodOut.getS1() - 1), 0, 5), methodIn.getFesrFromToIcd9(methodIn.getIcd9Sub() - 1)) <= 0 && compareChars(methodIn.getUIcdVerNbr51(), methodIn.getD51uRicdClmIcdInd(methodIn.getIcd9Sub() - 1)) == 0) {
                            // *                     Lk-51u-diagnosis-code(s1) not >
                            // *                     Lk-51u-diagnosis-code(s1) not >
                            // LITERAL_Y = 'Y'
                            methodOut.setFromIcd9Found(CONSTANTS.LITERAL_Y);
                        }
                    } else // cobolCode::ELSE
                    {
                        // *                  If lk-51u-diagnosis-code(s1) =
                        // cobolCode::IF LK-51U-DIAGNOSIS-CODE (S1) (1 : 5) = FESR-FROM-FR-ICD9 ( ICD9-SUB ) AND LK-51U-ICD-VER-NBR = D51U-RICD-CLM-ICD-IND ( ICD9-SUB )
                        if (compareChars(substring(methodIn.getUDiagnosisCode51(methodOut.getS1() - 1), 0, 5), methodIn.getFesrFromFrIcd9(methodIn.getIcd9Sub() - 1)) == 0 && compareChars(methodIn.getUIcdVerNbr51(), methodIn.getD51uRicdClmIcdInd(methodIn.getIcd9Sub() - 1)) == 0) {
                            // LITERAL_Y = 'Y'
                            methodOut.setFromIcd9Found(CONSTANTS.LITERAL_Y);
                        }
                    }
                }
            }
        }
        // cobolCode::IF FROM-ICD9-FOUND
        if (methodIn.isFromIcd9Found1()) {
            // cobolCode::ADD 1 TO WS-NBR-MATCHED
            methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
        }
        return methodOut;
    }

    /**
     * searchCause
     *   This method is derived from
     *   COBOL Paragraph - 2150-SEARCH-CAUSE COBOL Cyclomatic complexity - 3
     * Input  :
     *
     * - fesrFromCauseCd                COBOL Name: FESR-FROM-CAUSE-CD
     * - causeSub                       COBOL Name: CAUSE-SUB
     * - uCauseCd51                     COBOL Name: LK-51U-CAUSE-CD
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - fromCauseFound                 COBOL Name: WS-FROM-CAUSE-FOUND
     *
     * @throws CFException
     */
    @Override
    public SearchCauseOutCtx searchCause(SearchCauseInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2150-Search-cause                                            *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 this section increments the counter which indicates the      *
        // *81 number of matches when ever a cause code match is found.     *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2150-search-cause                                            *
        // *82                                                              *
        // *82 1. if the cause code for that particular index is empty, it  *
        // *82    denotes that the search is complete. else, increase the   *
        // *82    number of matches by 1.                                   *
        // *82***************************************************************
        // *-------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        SearchCauseOutCtx methodOut = methodIn.getSearchCauseOutCtx();
        // LITERAL_2150 = '2150'
        methodOut.setParagraph(CONSTANTS.LITERAL_2150);
        // cobolCode::IF FESR-FROM-CAUSE-CD ( CAUSE-SUB ) = SPACES
        if ((allSpaces(methodIn.getFesrFromCauseCd(methodIn.getCauseSub() - 1)))) {
            // LITERAL_Y = 'Y'
            methodOut.setSearchComplete(CONSTANTS.LITERAL_Y);
        } else // cobolCode::ELSE
        {
            // cobolCode::IF LK-51U-CAUSE-CD = FESR-FROM-CAUSE-CD ( CAUSE-SUB )
            if (compareChars(methodIn.getUCauseCd51(), methodIn.getFesrFromCauseCd(methodIn.getCauseSub() - 1)) == 0) {
                // cobolCode::ADD 1 TO WS-NBR-MATCHED
                methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
                // LITERAL_Y = 'Y'
                methodOut.setFromCauseFound(CONSTANTS.LITERAL_Y);
            }
        }
        return methodOut;
    }

    /**
     * matchIpaToPpoalt
     *   This method is derived from
     *   COBOL Paragraph - 2160-MATCH-IPA-TO-PPOALT COBOL Cyclomatic complexity - 10
     * Input  :
     *
     * - ppaPpoIdCount                  COBOL Name: PPA-PPO-ID-COUNT
     * - ipaSub                         COBOL Name: IPA-SUB
     * - ppaIpa                         COBOL Name: PPA-IPA
     * - uEarliestDos51                 COBOL Name: LK-51U-EARLIEST-DOS
     * - ppaFirstEffDate                COBOL Name: PPA-FIRST-EFF-DATE
     * - ppaLastCanDate                 COBOL Name: PPA-LAST-CAN-DATE
     * - fesrIpaCd                      COBOL Name: FESR-IPA-CD
     *
     * Output :
     *
     * - ipaSub                         COBOL Name: IPA-SUB
     * - ipaCodeFound                   COBOL Name: WS-IPA-CODE-FOUND
     *
     * @throws CFException
     */
    @Override
    public MatchIpaToPpoaltOutCtx matchIpaToPpoalt(MatchIpaToPpoaltInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2160-Match-ipa-to-ppoalt                                     *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 checks for a match on individual practice association code   *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2160-match-ipa-to-ppoalt                                     *
        // *82                                                              *
        // *82 1. when no prefered provider organization records are found  *
        // *82    exit, the section.                                        *
        // *82 2. if the ppa-ipa is greater than zero                       *
        // *82    - if the earliest date of service is greater than the ppa-*
        // *82      first effective date and the earlist date of service is *
        // *82      less than the last cancel date,                         *
        // *82      - if the ppa-ipa matches with any of the three ipa-codes*
        // *82        then set a switch to indicate that the ipa code is    *
        // *82        found.                                                *
        // *82***************************************************************
        // *------------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        MatchIpaToPpoaltOutCtx methodOut = methodIn.getMatchIpaToPpoaltOutCtx();
        // cobolCode::IF PPA-PPO-ID-COUNT IS NOT NUMERIC
        if (!(methodIn.getPpaFixedPortion().ppaPpoIdCountIsNumeric())) {
            // cobolCode::GO TO 2160-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 2160-EXIT
        }
        // cobolCode::PERFORM VARYING IPA-SUB FROM 1 BY 1 UNTIL IPA-SUB > PPA-PPO-ID-COUNT
        for (methodOut.setIpaSub(1); ((methodOut.getIpaSub() <= methodIn.getPpaPpoIdCount())); methodOut.setIpaSub(methodOut.getIpaSub() + 1)) {
            // cobolCode::IF PPA-IPA ( IPA-SUB ) > ZEROES
            if ((methodIn.getPpaIpa(methodOut.getIpaSub() - 1) > 0)) {
                // cobolCode::IF ( ( LK-51U-EARLIEST-DOS NOT < PPA-FIRST-EFF-DATE ( IPA-SUB )) AND ( LK-51U-EARLIEST-DOS NOT > PPA-LAST-CAN-DATE ( IPA-SUB )))
                if (((((methodIn.getUEarliestDos51() >= methodIn.getPpaFirstEffDate(methodOut.getIpaSub() - 1)))) && (((methodIn.getUEarliestDos51() <= methodIn.getPpaLastCanDate(methodOut.getIpaSub() - 1)))))) {
                    // cobolCode::IF ( ( PPA-IPA ( IPA-SUB ) = FESR-IPA-CD (1)) OR ( PPA-IPA ( IPA-SUB ) = FESR-IPA-CD (2)) OR ( PPA-IPA ( IPA-SUB ) = FESR-IPA-CD (3)))
                    if (((((methodIn.getPpaIpa(methodOut.getIpaSub() - 1) == methodIn.getFesrIpaCd(0)))) || (((methodIn.getPpaIpa(methodOut.getIpaSub() - 1) == methodIn.getFesrIpaCd(1)))) || (((methodIn.getPpaIpa(methodOut.getIpaSub() - 1) == methodIn.getFesrIpaCd(2)))))) {
                        // LITERAL_Y = 'Y'
                        methodOut.setIpaCodeFound(CONSTANTS.LITERAL_Y);
                    }
                }
            }
        }
        return methodOut;
    }

    /**
     * checkServiceCodes
     *   This method is derived from
     *   COBOL Paragraph - 2600-CHECK-SERVICE-CODES COBOL Cyclomatic complexity - 2
     * Input  :
     *
     * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - ckServCls                      COBOL Name: CK-SERV-CLS
     * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
     * - medSvcNbr                      COBOL Name: MED-SVC-NBR
     * - csvcCode                       COBOL Name: CSVC-CODE
     * - topsCnvSvc                     COBOL Name: WS-TOPS-CNV-SVC
     * - medSvc                         COBOL Name: MED-SVC
     * - cls15                          COBOL Name: CLS-1-5
     * - csvcProc                       COBOL Name: CSVC-PROC
     * - servTop                        COBOL Name: WS-SERV-TOP
     *
     * @throws CFException
     */
    @Override
    public CheckServiceCodesOutCtx checkServiceCodes(CheckServiceCodesInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2600-Check-service-codes                                     *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 convert the procedure code into the service code             *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2600-check-service-codes                                     *
        // *82                                                              *
        // *82 1. examine the service code. if necessary convert the        *
        // *82    procedure code into the service code.                     *
        // *82***************************************************************
        // *------------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        CheckServiceCodesOutCtx methodOut = methodIn.getCheckServiceCodesOutCtx();
        // LITERAL_2600 = '2600'
        methodOut.setParagraph(CONSTANTS.LITERAL_2600);
        // cobolCode::MOVE LK-51U-LINE-SERVICE-CODE ( LK-SUB ) TO CK-SERV-CLS
        methodOut.getCkServCls().setString(methodOut.getULineServiceCode51(methodIn.getSub01() - 1));
        // cobolCode::MOVE 0 TO MED-SVC-NBR CSVC-CODE
        // LITERAL_0 = 0
        methodOut.setMedSvcNbr((short) 0);
        methodOut.setCsvcCode(CONSTANTS.LITERAL_0);
        // LITERAL_N = 'N'
        methodOut.setTopsCnvSvc(CONSTANTS.LITERAL_N);
        methodOut.setMedSvc(methodOut.getCkServCls().toCharArray());
        // cobolCode::IF CLS-1-5 IS NUMERIC
        if (methodOut.getCkServCls().cls15IsNumeric()) {
            methodOut.getCsvcProc().setString(methodOut.getCkServCls().getCharArray());
            // cobolCode::PERFORM CONVERT-PROC-TO-SVC-CD THRU CONVERT-PROC-EXIT
            convertProcToSvcCd(programCtx.getConvertProcToSvcCdInCtx());
            /*CONVERT-PROC-TO-SVC-CD SECTION*/
            // cobolCode::MOVE CSVC-CODE TO MED-SVC
            methodOut.setMedSvc(methodOut.getCsvcCode().toCharArray());
            // cobolCode::MOVE MED-SVC TO WS-SERV-TOP
            methodOut.setServTop(methodOut.getMedSvc());
            // LITERAL_Y = 'Y'
            methodOut.setTopsCnvSvc(CONSTANTS.LITERAL_Y);
        }
        return methodOut;
    }

    /**
     * readEqiFile
     *   This method is derived from
     *   COBOL Paragraph - 2650-READ-EQI-FILE COBOL Cyclomatic complexity - 8
     * Input  :
     *
     * - cls15                          COBOL Name: CLS-1-5
     * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
     * - ddEqisAlt                      COBOL Name: WS-DD-EQIS-ALT
     * - sceAltKey                      COBOL Name: SCE-ALT-KEY
     * - w02FnuLineRead                 COBOL Name: W02-FNU-LINE-READ
     * - sceFromHcpcsCpt                COBOL Name: SCE-FROM-HCPCS-CPT
     *
     * Output :
     *
     * - medSvcNbr                      COBOL Name: MED-SVC-NBR
     * - csvcCode                       COBOL Name: CSVC-CODE
     * - topsCnvSvc                     COBOL Name: WS-TOPS-CNV-SVC
     * - sceAltModifier                 COBOL Name: SCE-ALT-MODIFIER
     * - sceAltToHcpcs                  COBOL Name: SCE-ALT-TO-HCPCS
     * - cls15                          COBOL Name: CLS-1-5
     * - sceAltCancDate                 COBOL Name: SCE-ALT-CANC-DATE
     * - sceServiceCode                 COBOL Name: SCE-SERVICE-CODE
     * - w02DsplErrInd                  COBOL Name: W02-DSPL-ERR-IND
     * - w02FnuFileRd                   COBOL Name: W02-FNU-FILE-RD
     * - ddEqisAlt                      COBOL Name: WS-DD-EQIS-ALT
     * - w02FnuKeyRd                    COBOL Name: W02-FNU-KEY-RD
     * - sceAltKey                      COBOL Name: SCE-ALT-KEY
     * - w02RespCd                      COBOL Name: W02-RESP-CD
     * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
     * - w02DsplMsg                     COBOL Name: W02-DSPL-MSG
     * - w02FnuLineRead                 COBOL Name: W02-FNU-LINE-READ
     * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
     *
     * @throws CFException
     */
    @Override
    public ReadEqiFileOutCtx readEqiFile(ReadEqiFileInCtx methodIn) throws Exception {
        // *82 If not  found, assign value of '999999' to the service code  *
        // *82 per system spec.                                             *
        // *82 populate sce-alt-canc-date with all 9's.                     *
        // *82***************************************************************
        // **** Display for testing, comment out                   ****
        // ***  add 1 to scntr.
        // **** if scntr < 12
        // ***       display '51u prior to 27d tread= '  scntr
        // **        display '51u cls-1-5#:    = ' cls-1-5
        // **        display 'ck serv cls value= '  ck-serv-cls
        // **   end-if.
        // **** end of display                                     ****
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        ReadEqiFileOutCtx methodOut = methodIn.getReadEqiFileOutCtx();
        // cobolCode::MOVE 0 TO MED-SVC-NBR CSVC-CODE
        // LITERAL_0 = 0
        methodOut.setMedSvcNbr((short) 0);
        methodOut.setCsvcCode(CONSTANTS.LITERAL_0);
        // LITERAL_N = 'N'
        methodOut.setTopsCnvSvc(CONSTANTS.LITERAL_N);
        // cobolCode::MOVE SPACES TO SCE-ALT-MODIFIER
        methodOut.setSceAltModifier(CONSTANTS.SPACE);
        // cobolCode::MOVE CLS-1-5 TO SCE-ALT-TO-HCPCS
        methodOut.setSceAltToHcpcs(String.valueOf(methodOut.getCls15String()).toCharArray());
        // cobolCode::MOVE 99999999 TO SCE-ALT-CANC-DATE
        methodOut.setSceAltCancDate((long) 99999999);
        // cobolCode::PERFORM 1500-READ-EQI THRU 1500-X
        readEqi(programCtx.getReadEqiInCtx());
        /*1500-READ-EQI*/
        // *                            Frontend-hd-pmt-icn-record
        // *                            frontend-med-pmt-icn-record
        // *                            ls-prvfrc-rec
        // *                            ls-golden-rule-record.
        // cobolCode::EVALUATE TRUE
        if (methodIn.isCicsNormal()) {
            ;
        } else if (methodIn.isCicsNotfnd()) {
            // LITERAL_999999 = 999999
            methodOut.setSceServiceCode(CONSTANTS.LITERAL_999999);
            // cobolCode::GO TO 2650-CONTINUE-PROCESS
            return methodOut;
            // cobolCodeEnds::GO TO 2650-CONTINUE-PROCESS
        } else if (methodIn.isCicsEndfile()) {
            // LITERAL_999999 = 999999
            methodOut.setSceServiceCode(CONSTANTS.LITERAL_999999);
            // cobolCode::GO TO 2650-CONTINUE-PROCESS
            return methodOut;
            // cobolCodeEnds::GO TO 2650-CONTINUE-PROCESS
        } else {
            // cobolCode::MOVE 'ERR' TO W02-DSPL-ERR-IND
            // LITERAL_ERR = 'ERR'
            methodOut.setW02DsplErrInd(CONSTANTS.LITERAL_ERR);
            methodOut.setW02FnuFileRd(methodOut.getDdEqisAlt().toCharArray());
            methodOut.setW02FnuKeyRd(methodOut.getSceAltKey().toCharArray());
            // cobolCode::MOVE CICS-DFHRESP-CODE TO W02-RESP-CD
            methodOut.setW02RespCd(methodOut.getCicsDfhrespCode());
            methodOut.setW02DsplMsg(methodOut.getW02FnuLineRead().toCharArray());
            // cobolCode::PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
            writeToSysm(programCtx.getWriteToSysmInCtx());
            /*11100A-WRITE-TO-SYSM SECTION*/
            // cobolCode::SET M51U-ILLOGICAL-COND TO TRUE
            methodOut.setM51uIllogicalCondTrue();
            // cobolCode::PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
            dumpAbend(programCtx);
            /*8000-DUMP-ABEND SECTION*/
        }
        // cobolCode::IF SCE-ALT-TO-HCPCS = CLS-1-5
        if (compareChars(methodOut.getSceAltToHcpcs(), String.valueOf(methodOut.getCls15String()).toCharArray()) == 0) {
            // cobolCode::GO TO 2650-CONTINUE-PROCESS
            return methodOut;
            // cobolCodeEnds::GO TO 2650-CONTINUE-PROCESS
        }
        // cobolCode::IF CLS-1-5 < SCE-ALT-TO-HCPCS AND CLS-1-5 >= SCE-FROM-HCPCS-CPT
        // cobolCode::ELSE
        if (compareChars(methodIn.getCkServCls().getCls15String(), methodOut.getSceAltToHcpcs()) >= 0 || compareChars(methodIn.getCkServCls().getCls15String(), methodIn.getSceFromHcpcsCpt()) < 0) {
            // LITERAL_999999 = 999999
            methodOut.setSceServiceCode(CONSTANTS.LITERAL_999999);
        }
        return methodOut;
    }

    /**
     * continueProcess
     *   This method is derived from
     *   COBOL Paragraph - 2650-CONTINUE-PROCESS COBOL Cyclomatic complexity - 1
     * Input  :
     *
     * - sceServiceCode                 COBOL Name: SCE-SERVICE-CODE
     *
     * Output :
     *
     * - csvcProc                       COBOL Name: CSVC-PROC
     * - csvcCode                       COBOL Name: CSVC-CODE
     * - sceServiceCode                 COBOL Name: SCE-SERVICE-CODE
     * - medSvc                         COBOL Name: MED-SVC
     * - servTop                        COBOL Name: WS-SERV-TOP
     * - topsCnvSvc                     COBOL Name: WS-TOPS-CNV-SVC
     *
     * @throws CFException
     */
    @Override
    public ContinueProcessOutCtx continueProcess(ContinueProcessInCtx methodIn) throws Exception {
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        ContinueProcessOutCtx methodOut = methodIn.getContinueProcessOutCtx();
        // cobolCode::MOVE SCE-SERVICE-CODE TO CSVC-PROC CSVC-CODE
        methodOut.getCsvcProc().setString(methodOut.getSceServiceCode());
        methodOut.setCsvcCode(methodOut.getSceServiceCode());
        // cobolCode::MOVE CSVC-CODE TO MED-SVC
        methodOut.setMedSvc(methodOut.getCsvcCode().toCharArray());
        // cobolCode::MOVE MED-SVC TO WS-SERV-TOP
        methodOut.setServTop(methodOut.getMedSvc());
        // LITERAL_Y = 'Y'
        methodOut.setTopsCnvSvc(CONSTANTS.LITERAL_Y);
        return methodOut;
    }

    /**
     * chiroProcessing
     *   This method is derived from
     *   COBOL Paragraph - 2700-CHIRO-PROCESSING COBOL Cyclomatic complexity - 12
     * Input  :
     *
     * - uCcmNOSvcInd51                 COBOL Name: LK-51U-CCM-N-O-SVC-IND
     * - uOutLineServiceCode51          COBOL Name: LK-51U-OUT-LINE-SERVICE-CODE
     * - sub01                          COBOL Name: LK-SUB
     * - nbrOfLines                     COBOL Name: WS-NBR-OF-LINES
     * - uOutLineChargeAmt51            COBOL Name: LK-51U-OUT-LINE-CHARGE-AMT
     * - uOutLineNotcovAmt51            COBOL Name: LK-51U-OUT-LINE-NOTCOV-AMT
     * - medSvc                         COBOL Name: MED-SVC
     * - uOutLineDosDate51              COBOL Name: LK-51U-OUT-LINE-DOS-DATE
     *
     * Output :
     *
     * - newServiceCode                 COBOL Name: WS-NEW-SERVICE-CODE
     * - uOutLineServiceCode51          COBOL Name: LK-51U-OUT-LINE-SERVICE-CODE
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - firstTimeThru                  COBOL Name: WS-FIRST-TIME-THRU
     * - mcrLineCharge                  COBOL Name: MCR-LINE-CHARGE
     * - sub01                          COBOL Name: LK-SUB
     * - mcrLineNbr                     COBOL Name: MCR-LINE-NBR
     * - chargeSub                      COBOL Name: CHARGE-SUB
     * - uOutLineChargeAmt51            COBOL Name: LK-51U-OUT-LINE-CHARGE-AMT
     * - prevDateServ                   COBOL Name: WS-PREV-DATE-SERV
     * - uOutLineDosDate51              COBOL Name: LK-51U-OUT-LINE-DOS-DATE
     * - uOutLineNotcovAmt51            COBOL Name: LK-51U-OUT-LINE-NOTCOV-AMT
     * - uOutLineRemarkCd51             COBOL Name: LK-51U-OUT-LINE-REMARK-CD
     * - chargeCombined                 COBOL Name: WS-CHARGE-COMBINED
     * - uOutLineAppUnits51             COBOL Name: LK-51U-OUT-LINE-APP-UNITS
     *
     * @throws CFException
     */
    @Override
    public ChiroProcessingOutCtx chiroProcessing(ChiroProcessingInCtx methodIn) throws Exception {
        // Declare local variables used in the method
        BigDecimal tempDecimal = BigDecimal.ZERO;
        // End of variable declaration
        // *81***************************************************************
        // *81 2700-Chiro-processing                                        *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 depending on the service code populate  the storage variables*
        // *81 with the charge amount and the date of service.              *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2700-chiro-processing                                        *
        // *82                                                              *
        // *82 1. if the service code is 'spth' and if the charge amount    *
        // *82    is not equal to the not covered amount,examine the service*
        // *82    codes, if necessary change the procedure code into the    *
        // *82    service code.                                             *
        // *82 2. if the service code is equal to 90000 or 97000            *
        // *82     - if its entering this paragraph for the first time,     *
        // *82       populate the charge amount and the date of service     *
        // *82       variables with the values in the linkage area.         *
        // *82     - if there already exists such a transaction, then add   *
        // *82       the charge amount to the existing amount, and move the *
        // *82       charge amount to the not covered amount. also move 'hj'*
        // *82       to the remark code, and indicate that the charge amount*
        // *82       has been combined.                                     *
        // *82     - if there does not exist such a transaction, just move  *
        // *82       the charge amount and the date of service into the     *
        // *82       storage variables.                                     *
        // *82 3. if the charge is combined, populate the applicable units  *
        // *82    and the charge amount in the linkage area.                *
        // *82***************************************************************
        // *------------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        ChiroProcessingOutCtx methodOut = methodIn.getChiroProcessingOutCtx();
        // cobolCode::IF LK-51U-CCM-N-O-SVC-IND = 'O'
        // LITERAL_O = 'O'
        if (compareChars(methodIn.getUCcmNOSvcInd51(), CONSTANTS.LITERAL_O) == 0) {
            // cobolCode::MOVE LK-51U-OUT-LINE-SERVICE-CODE ( LK-SUB ) TO WS-NEW-SERVICE-CODE
            methodOut.setNewServiceCode(methodOut.getUOutLineServiceCode51(methodOut.getSub01() - 1));
            // cobolCode::IF NEW-SVC-CD
            if (methodOut.isNewSvcCd()) {
                // cobolCode::GO TO 2700-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 2700-EXIT
            }
        }
        // LITERAL_2700 = '2700'
        methodOut.setParagraph(CONSTANTS.LITERAL_2700);
        // LITERAL_Y = 'Y'
        methodOut.setFirstTimeThru(CONSTANTS.LITERAL_Y);
        // cobolCode::MOVE ZEROS TO MCR-LINE-CHARGE
        methodOut.setMcrLineCharge(BigDecimal.ZERO);
        // cobolCode::PERFORM VARYING LK-SUB FROM 1 BY 1 UNTIL LK-SUB > WS-NBR-OF-LINES
        for (methodOut.setSub01(1); ((methodOut.getSub01() <= methodIn.getNbrOfLines())); methodOut.setSub01(methodOut.getSub01() + 1)) {
            // cobolCode::IF ( LK-51U-OUT-LINE-SERVICE-CODE ( LK-SUB ) = 'SPTH' ) AND ( LK-51U-OUT-LINE-CHARGE-AMT ( LK-SUB )) NOT EQUAL LK-51U-OUT-LINE-NOTCOV-AMT ( LK-SUB )
            if ((compareChars(methodOut.getUOutLineServiceCode51(methodOut.getSub01() - 1), CONSTANTS.LITERAL_SPTH_B2_) == 0) && (methodOut.getUOutLineChargeAmt51(methodOut.getSub01() - 1).compareTo(methodOut.getUOutLineNotcovAmt51(methodOut.getSub01() - 1)) != 0)) {
                // cobolCode::PERFORM 2600-CHECK-SERVICE-CODES THRU 2600-EXIT
                checkServiceCodes(programCtx.getCheckServiceCodesInCtx());
                /*2600-CHECK-SERVICE-CODES*/
                // cobolCode::IF MED-SVC = 90000 OR 97000
                // LITERAL_97000 = 97000
                if (compareChars(methodIn.getMedSvc(), CONSTANTS.LITERAL_90000_B_) == 0 || compareChars(methodIn.getMedSvc(), CONSTANTS.LITERAL_97000_B_) == 0) {
                    // cobolCode::IF FIRST-TIME-THRU
                    if (methodOut.isFirstTimeThru1()) {
                        // LITERAL_N = 'N'
                        methodOut.setFirstTimeThru(CONSTANTS.LITERAL_N);
                        methodOut.setMcrLineNbr(1);
                        // cobolCode::MOVE LK-SUB TO CHARGE-SUB
                        methodOut.setChargeSub(methodOut.getSub01());
                        // cobolCode::MOVE LK-51U-OUT-LINE-CHARGE-AMT ( LK-SUB ) TO MCR-LINE-CHARGE
                        methodOut.setMcrLineCharge(methodOut.getUOutLineChargeAmt51(methodOut.getSub01() - 1));
                        // cobolCode::MOVE LK-51U-OUT-LINE-DOS-DATE ( LK-SUB ) TO WS-PREV-DATE-SERV
                        methodOut.setPrevDateServ(methodOut.getUOutLineDosDate51(methodOut.getSub01() - 1));
                    } else // cobolCode::ELSE
                    {
                        // cobolCode::IF ( LK-51U-OUT-LINE-DOS-DATE ( LK-SUB ) EQUAL WS-PREV-DATE-SERV )
                        if (((methodOut.getUOutLineDosDate51(methodOut.getSub01() - 1) == methodOut.getPrevDateServ()))) {
                            // cobolCode::ADD LK-51U-OUT-LINE-CHARGE-AMT ( LK-SUB ) TO MCR-LINE-CHARGE
                            tempDecimal = methodOut.getMcrLineCharge().add(methodOut.getUOutLineChargeAmt51(methodOut.getSub01() - 1)).setScale(2, RoundingMode.DOWN);
                            methodOut.setMcrLineCharge(tempDecimal);
                            // 
                            // cobolCode::MOVE LK-51U-OUT-LINE-CHARGE-AMT ( LK-SUB ) TO LK-51U-OUT-LINE-NOTCOV-AMT ( LK-SUB )
                            methodOut.setUOutLineNotcovAmt51(methodOut.getSub01() - 1, methodOut.getUOutLineChargeAmt51(methodOut.getSub01() - 1));
                            // cobolCode::MOVE 'HJ' TO LK-51U-OUT-LINE-REMARK-CD ( LK-SUB )
                            methodOut.setUOutLineRemarkCd51(methodOut.getSub01() - 1, CONSTANTS.LITERAL_HJ_B_);
                            // cobolCode::MOVE 'Y' TO WS-CHARGE-COMBINED
                            // LITERAL_Y = 'Y'
                            methodOut.setChargeCombined(CONSTANTS.LITERAL_Y);
                        } else // cobolCode::ELSE
                        {
                            methodOut.setMcrLineNbr(1);
                            // cobolCode::MOVE LK-SUB TO CHARGE-SUB
                            methodOut.setChargeSub(methodOut.getSub01());
                            // cobolCode::MOVE LK-51U-OUT-LINE-CHARGE-AMT ( LK-SUB ) TO MCR-LINE-CHARGE
                            methodOut.setMcrLineCharge(methodOut.getUOutLineChargeAmt51(methodOut.getSub01() - 1));
                            // cobolCode::MOVE LK-51U-OUT-LINE-DOS-DATE ( LK-SUB ) TO WS-PREV-DATE-SERV
                            methodOut.setPrevDateServ(methodOut.getUOutLineDosDate51(methodOut.getSub01() - 1));
                        }
                    }
                }
            }
        }
        // cobolCode::IF CHARGE-COMBINED
        if (methodOut.isChargeCombined1()) {
            // cobolCode::MOVE 'N' TO WS-CHARGE-COMBINED
            // LITERAL_N = 'N'
            methodOut.setChargeCombined(CONSTANTS.LITERAL_N);
            // cobolCode::MOVE MCR-LINE-NBR TO LK-51U-OUT-LINE-APP-UNITS ( CHARGE-SUB )
            methodOut.setUOutLineAppUnits51(methodOut.getChargeSub() - 1, methodOut.getMcrLineNbr());
            // cobolCode::MOVE MCR-LINE-CHARGE TO LK-51U-OUT-LINE-CHARGE-AMT ( CHARGE-SUB )
            methodOut.setUOutLineChargeAmt51(methodOut.getChargeSub() - 1, methodOut.getMcrLineCharge());
        }
        return methodOut;
    }

    /**
     * commonIoCall
     *   This method is derived from
     *   COBOL Paragraph - 9960-COMMON-IO-CALL COBOL Cyclomatic complexity - 5
     * Input  :
     *
     * - ioi02bError                    COBOL Name: IOI-02B-ERROR
     * - w02FnuLineRead                 COBOL Name: W02-FNU-LINE-READ
     *
     * Output :
     *
     * - w02DsplMsg                     COBOL Name: W02-DSPL-MSG
     * - w02FnuLineRead                 COBOL Name: W02-FNU-LINE-READ
     * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
     *
     * @throws CFException
     */
    @Override
    public CommonIoCallOutCtx commonIoCall(CommonIoCallInCtx methodIn) throws Exception {
        // *****************************************************************
        // *   This section calls a tops module.                           *
        // *****************************************************************
        // *========================*
        // *****Call pnc-02b-online-io using dfheiblk ioi-02b-interface
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        CommonIoCallOutCtx methodOut = methodIn.getCommonIoCallOutCtx();
        // cobolCode::EVALUATE TRUE
        if (methodIn.isIoi02bGood()) {
            ;
        } else if ((methodIn.isIoi02bBadRequest()) || (methodIn.isIoi02bNotInitialized())) {
            methodOut.setW02DsplMsg(methodOut.getW02FnuLineRead().toCharArray());
            // cobolCode::PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
            writeToSysm(programCtx.getWriteToSysmInCtx());
            /*11100A-WRITE-TO-SYSM SECTION*/
            // cobolCode::SET M51U-ILLOGICAL-COND TO TRUE
            methodOut.setM51uIllogicalCondTrue();
            // cobolCode::PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
            dumpAbend(programCtx);
            /*8000-DUMP-ABEND SECTION*/
        } else {
            ;
        }
        return methodOut;
    }

    /**
     * writeToSysm
     *   This method is derived from
     *   COBOL Paragraph - 11100A-WRITE-TO-SYSM SECTION COBOL Cyclomatic complexity - 1
     * Input  : None
     *
     * Output :
     *
     * - dfheiv0                        COBOL Name: DFHEIV0
     * - dfhc0040                       COBOL Name: DFHC0040
     * - dfhb0020                       COBOL Name: DFHB0020
     *
     * @throws CFException
     */
    @Override
    public WriteToSysmOutCtx writeToSysm(WriteToSysmInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81                                                              *
        // *81 11100A-write-to-sysm                                         *
        // *81                                                              *
        // *81 business function  :                                         *
        // *81 get the absolute time and write it into the queue            *
        // *81                                                              *
        // *81***************************************************************
        // *82***************************************************************
        // *82                                                              *
        // *82 11100a-write-to-sysm                                         *
        // *82                                                              *
        // *82 1. gets the time and date of the system and writes it into   *
        // *82    the 'sysm' queue                                          *
        // *82 2. initialize message,message comp code,reason code and the  *
        // *82    correction id                                             *
        // *82                                                              *
        // *82 calls     :1. 11101-asktime-formatime                        *
        // *82                                                              *
        // *82***************************************************************
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        WriteToSysmOutCtx methodOut = methodIn.getWriteToSysmOutCtx();
        // cobolCode::PERFORM 11101-ASKTIME-FORMATIME THRU 11101-EXIT
        asktimeFormatime(programCtx.getAsktimeFormatimeInCtx());
        /*11101-ASKTIME-FORMATIME*/
        // *EXEC CICS WRITEQ TD QUEUE   ('SYSM')
        // *                    FROM    (W02-DSPL-MSG-AREA)
        // *                    LENGTH  (LENGTH OF W02-DSPL-MSG-AREA)
        // *                    NOHANDLE
        // *END-EXEC.
        // *EXEC CICS WRITEQ TD QUEUE   ('SYSM')
        // *                    FROM    (W02-DSPL-MSG-AREA)
        // *                    LENGTH  (LENGTH OF W02-DSPL-MSG-AREA)
        // *                    NOHANDLE
        // *END-EXEC.
        methodOut.setDfheiv0(CONSTANTS.LITERAL_651200612);
        // LITERAL_SYSM = 'SYSM'
        methodOut.setDfhc0040(CONSTANTS.LITERAL_SYSM);
        // cobolCode::MOVE LENGTH OF W02-DSPL-MSG-AREA TO DFHB0020
        methodOut.setDfhb0020(W02DsplMsgArea.getW02DsplMsgAreaFieldLength());
        // cobolCode::WRITEQ TD QUEUE ('SYSM') FROM (W02-DSPL-MSG-AREA) LENGTH (FUNCTION~LENGTH~W02-DSPL-MSG-AREA) NOHANDLE
        // write trigger queue
        TransactionManager.writeTriggerQueue(programCtx.getCicsSession(), CONSTANTS.LITERAL_SYSM, methodIn.getW02DsplMsgArea().toCharArray(), -1, "".toCharArray());
        return methodOut;
    }

    /**
     * asktimeFormatime
     *   This method is derived from
     *   COBOL Paragraph - 11101-ASKTIME-FORMATIME COBOL Cyclomatic complexity - 1
     * Input  : None
     *
     * Output :
     *
     * - dfheiv0                        COBOL Name: DFHEIV0
     *
     * @throws CFException
     */
    @Override
    public AsktimeFormatimeOutCtx asktimeFormatime(AsktimeFormatimeInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81                                                              *
        // *81 11101-Asktime-formatime                                      *
        // *81                                                              *
        // *81 business function  :                                         *
        // *81 this section gets the time and date of the system            *
        // *81                                                              *
        // *81***************************************************************
        // *82***************************************************************
        // *82                                                              *
        // *82 11101-asktime-formatime                                      *
        // *82                                                              *
        // *82 1. get the absoulte time and format it                       *
        // *82 2. populate the formatted time to the display message area of*
        // *82    of the time variable                                      *
        // *82                                                              *
        // *82 called by :1. 11100a-write-to-sysm                           *
        // *82                                                              *
        // *82 calls     :none                                              *
        // *82                                                              *
        // *82***************************************************************
        // *EXEC CICS ASKTIME
        // *     ABSTIME (W02-ABSOLUTE-TIME)
        // *END-EXEC.
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        AsktimeFormatimeOutCtx methodOut = methodIn.getAsktimeFormatimeOutCtx();
        methodOut.setDfheiv0(CONSTANTS.LITERAL_946190243);
        // cobolCode::ASKTIME ABSTIME (W02-ABSOLUTE-TIME)
        // ask current time as the number of milliseconds since 00:00 on 1 January 1900
        methodIn.setW02AbsoluteTime(TransactionManager.currentTimeMillis(programCtx.getCicsSession()));
        // *EXEC CICS FORMATTIME
        // *     ABSTIME   (W02-ABSOLUTE-TIME)
        // *     TIME      (W02-MQ-TIME)
        // *     TIMESEP
        // *END-EXEC.
        // *EXEC CICS FORMATTIME
        // *     ABSTIME   (W02-ABSOLUTE-TIME)
        // *     TIME      (W02-MQ-TIME)
        // *     TIMESEP
        // *END-EXEC.
        methodOut.setDfheiv0(CONSTANTS.LITERAL_67423859);
        // cobolCode::FORMATTIME ABSTIME (W02-ABSOLUTE-TIME) TIME (W02-MQ-TIME) TIMESEP
        // format time - based on number of milliseconds since 00:00 on 1 January 1900,
        TransactionManager.setTimeInMillis(programCtx.getCicsSession(), methodIn.getW02AbsoluteTime());
        methodIn.setW02MqTime(TransactionManager.getFormatTimeTIME(programCtx.getCicsSession(), "TIMESEP"));
        return methodOut;
    }

    /**
     * dumpAbend
     *   This method is derived from
     *   COBOL Paragraph - 8000-DUMP-ABEND SECTION COBOL Cyclomatic complexity - 3
     * Input  : None
     *
     * Output :
     *
     * - illogicalCond                  COBOL Name: LK-ILLOGICAL-COND
     * - dfhc0040                       COBOL Name: DFHC0040
     *
     * @throws CFException
     */
    @Override
    public DumpAbendOutCtx dumpAbend(O529351uCtx programCtx) throws Exception {
        // *30                           Should not be commnented.          *
        // *30                           all elements are also changed.     *
        // *81***************************************************************
        // *81 8000-dump-abend                                              *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 dump process per task.                                       *
        // *81***************************************************************
        // *82***************************************************************
        // *82 8000-dump-abend                                              *
        // *82                                                              *
        // *82 1. rollback, dump and return the control to main calling     *
        // *82    program.                                                  *
        // *82                                                              *
        // *82 called by:                                                   *
        // *82 calls    : none                                              *
        // *82***************************************************************
        // *EXEC CICS SYNCPOINT ROLLBACK
        // *END-EXEC.
        // Added variable to get the output context in place.
        DumpAbendOutCtx methodOut = programCtx.getDumpAbendOutCtx();
        // cobolCode::SYNCPOINT ROLLBACK
        // Establish a syncpoint
        TransactionManager.syncpoint(programCtx.getCicsSession(), true, /*toRollback*/
        db2Base);
        // cobolCode::SET ILLOGICAL-COND TO TRUE
        methodOut.setIllogicalCond1True();
        // *EXEC CICS DUMP
        // *     DUMPCODE('BTMQ')
        // *END-EXEC
        // *EXEC CICS DUMP
        // *     DUMPCODE('BTMQ')
        // *END-EXEC
        // LITERAL_BTMQ = 'BTMQ'
        methodOut.setDfhc0040(CONSTANTS.LITERAL_BTMQ);
        // cobolCode::DUMP DUMPCODE('BTMQ')
        /**
         *  User Program is requesting an Exception be thrown at this point
         */
        setException(new CFException("User program is requesting abend/exception be thrown"));
        getException().setAbendCode(CONSTANTS.LITERAL_BTMQ);
        throw getException();
    }

    /**
     * convertProcToSvcCd
     *   This method is derived from
     *   COBOL Paragraph - CONVERT-PROC-TO-SVC-CD SECTION COBOL Cyclomatic complexity - 55
     * Input  :
     *
     * - ctlCntId1                      COBOL Name: CTL-CNT-ID1
     * - csvcP1st5                      COBOL Name: CSVC-P-1ST-5
     * - csvcPLst1                      COBOL Name: CSVC-P-LST-1
     * - csvcPLst1A                     COBOL Name: CSVC-P-LST-1-A
     *
     * Output :
     *
     * - csvcCode1st5                   COBOL Name: CSVC-CODE-1ST-5
     * - csvcCodeLst1                   COBOL Name: CSVC-CODE-LST-1
     * - csvcCode6A                     COBOL Name: CSVC-CODE-6-A
     * - csvcPLst1                      COBOL Name: CSVC-P-LST-1
     * - csvcCode15A                    COBOL Name: CSVC-CODE-1-5-A
     * - csvcCode                       COBOL Name: CSVC-CODE
     *
     * @throws CFException
     */
    @Override
    public ConvertProcToSvcCdOutCtx convertProcToSvcCd(ConvertProcToSvcCdInCtx methodIn) throws Exception {
        // *****************************************************************
        // * Version: nov.93    date: 08/30/93  init: lrd ; new cpt4 mods  *
        // * version: dec.02    date: 09/11/02  init: ram ; mod 8/9  mods  *
        // *****************************************************************
        // ******** convert procedure code to service code ******************
        // *                                                                *
        // *        if a service code is numeric it is really a procedure   *
        // *        code.  this module takes a procedure code and converts  *
        // *        it to a service code.                                   *
        // *                                                                *
        // ******************************************************************
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        ConvertProcToSvcCdOutCtx methodOut = methodIn.getConvertProcToSvcCdOutCtx();
        // cobolCode::IF CTL-CNT-ID1 EQUAL 'V'
        // LITERAL_V = 'V'
        if (compareChars(methodIn.getCtlCntId1(), CONSTANTS.LITERAL_V) == 0) {
            // cobolCode::GO TO CONVERT-PROC-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO CONVERT-PROC-EXIT
        }
        // cobolCode::EVALUATE TRUE
        if (methodIn.isCsvcSurgAnes() && methodIn.isCsvcSurgDigit()) {
            methodOut.setCsvcCode1st5((long) 10000);
            // cobolCode::MOVE '0' TO CSVC-CODE-LST-1
            // LITERAL_0 = '0'
            methodOut.setCsvcCodeLst1(0);
        } else if (methodIn.isCsvcSurgAnes() && methodIn.isCsvcAnesDigit()) {
            methodOut.setCsvcCode1st5((long) 10000);
            // cobolCode::MOVE '4' TO CSVC-CODE-LST-1
            methodOut.setCsvcCodeLst1(4);
        } else if (methodIn.isCsvcSurgAnes() && methodIn.isCsvcSurgAnesDigit()) {
            methodOut.setCsvcCode1st5((long) 10000);
            // cobolCode::MOVE CSVC-P-LST-1 TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(methodOut.getCsvcPLst1());
        } else if (methodIn.isCsvcDiagXray() && methodOut.isCsvcLabXrayDigit()) {
            // LITERAL_70000 = '70000'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_70000);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcRadiotherapy1() && methodIn.isCsvcBlank()) {
            // LITERAL_77000 = '77000'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_77000);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcRadiotherapy2() && methodIn.isCsvcBlank()) {
            // LITERAL_77000 = '77000'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_77000);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcLab() && methodOut.isCsvcLabXrayDigit()) {
            // LITERAL_80000 = '80000'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_80000);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcMedVisit1() && methodOut.isCsvcMedX()) {
            // LITERAL_90000 = '90000'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_90000);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcMedVisit2() && methodOut.isCsvcMedX()) {
            // LITERAL_90100 = '90100'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_90100);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcHospMedVisit1() && methodOut.isCsvcMedX()) {
            // LITERAL_90200 = '90200'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_90200);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcMedVisit3() && methodOut.isCsvcMedX()) {
            // LITERAL_90300 = '90300'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_90300);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcHospMedVisit2() && methodOut.isCsvcMedX()) {
            // LITERAL_90500 = '90500'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_90500);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcConsultation() && methodOut.isCsvcDigit0()) {
            // LITERAL_90600 = '90600'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_90600);
            // LITERAL_0 = '0'
            methodOut.setCsvcCode6A(CONSTANTS.LITERAL_0);
        } else if (methodIn.isCsvcConsultation() && methodOut.isCsvcDigit1()) {
            // LITERAL_90600 = '90600'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_90600);
            // LITERAL_1 = '1'
            methodOut.setCsvcCode6A(CONSTANTS.LITERAL_1);
        } else if (methodIn.isCsvcPsycThrpy() && methodIn.isCsvcBlank()) {
            // LITERAL_90800 = '90800'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_90800);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcPhysMed() && methodIn.isCsvcBlank()) {
            // LITERAL_97000 = '97000'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_97000);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcDialysis() && methodIn.isCsvcBlank()) {
            // LITERAL_90935 = '90935'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_90935);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if ((methodIn.isCsvcDiagServices() && methodOut.isCsvcDiagSerDigit())) {
            // LITERAL_91000 = '91000'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_91000);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcNucMedicine() && methodIn.isCsvcBlank()) {
            // LITERAL_78000 = '78000'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_78000);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcIntenseMed() && methodIn.isCsvcBlank()) {
            // LITERAL_99160 = '99160'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_99160);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcImmunization() && methodIn.isCsvcBlank()) {
            // LITERAL_90700 = '90700'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_90700);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcPreventativeMed() && methodIn.isCsvcBlank()) {
            // LITERAL_90750 = '90750'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_90750);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcInjections() && methodIn.isCsvcBlank()) {
            // LITERAL_90780 = '90780'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_90780);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcSpeechThrpy() && methodIn.isCsvcBlank()) {
            // LITERAL_92507 = '92507'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_92507);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcChemotherapy() && methodIn.isCsvcBlank()) {
            // LITERAL_96500 = '96500'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_96500);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else if (methodIn.isCsvcSpecMedServices() && methodIn.isCsvcBlank()) {
            // LITERAL_29130 = '29130'
            methodOut.setCsvcCode15A(CONSTANTS.LITERAL_29130);
            // cobolCode::MOVE SPACE TO CSVC-CODE-6-A
            methodOut.setCsvcCode6A(CONSTANTS.SPACE);
        } else {
            // cobolCode::MOVE '999999' TO CSVC-CODE
            // LITERAL_999999 = '999999'
            methodOut.setCsvcCode(CONSTANTS.LITERAL_999999);
        }
        return methodOut;
    }

    /**
     * readGenSysSwitch
     *   This method is derived from
     *   COBOL Paragraph - 1800-READ-GEN-SYS-SWITCH SECTION COBOL Cyclomatic complexity - 3
     * Input  : None
     *
     * Output :
     *
     * - newSpiSw                       COBOL Name: WS-NEW-SPI-SW
     * - feSpiEnableInd                 COBOL Name: FE-SPI-ENABLE-IND
     * - fePrimeSpiEnableInd            COBOL Name: FE-PRIME-SPI-ENABLE-IND
     * - primeSpiSw                     COBOL Name: WS-PRIME-SPI-SW
     *
     * @throws CFException
     */
    @Override
    public ReadGenSysSwitchOutCtx readGenSysSwitch(O529351uCtx programCtx) throws Exception {
        // *82 Calls     : 1. d5427rst program                              *
        // *82***************************************************************
        // Added variable to get the output context in place.
        ReadGenSysSwitchOutCtx methodOut = programCtx.getReadGenSysSwitchOutCtx();
        // cobolCode::INITIALIZE WS-NEW-SPI-SW
        methodOut.setNewSpiSw(CONSTANTS.SPACE);
        // *    Perform 1810-gen-sys-restart thru 1810-exit.
        // cobolCode::SET FE-SPI-ENABLED TO TRUE
        methodOut.setFeSpiEnabledTrue();
        // cobolCode::SET FE-PRIME-SPI-ENABLED TO TRUE
        methodOut.setFePrimeSpiEnabledTrue();
        // cobolCode::EVALUATE TRUE
        if (methodOut.isFeSpiEnabled()) {
            // cobolCode::SET FE-SPI-TURNED-ON TO TRUE
            methodOut.setFeSpiTurnedOnTrue();
        }
        // *        When fe-spi-disabled
        // *           set fe-spi-turned-off to true
        // cobolCode::EVALUATE TRUE
        if (methodOut.isFePrimeSpiEnabled()) {
            // cobolCode::SET FE-PRIME-SPI-TURNED-ON TO TRUE
            methodOut.setFePrimeSpiTurnedOnTrue();
        }
        return methodOut;
    }

    /**
     * readPlanAltDb2
     *   This method is derived from
     *   COBOL Paragraph - 2010D-READ-PLAN-ALT-DB2 SECTION COBOL Cyclomatic complexity - 10
     * Input  :
     *
     * - uPolicyNo51                    COBOL Name: LK-51U-POLICY-NO
     * - uPlanVar51                     COBOL Name: LK-51U-PLAN-VAR
     * - planVarPrev                    COBOL Name: WS-PLAN-VAR-PREV
     * - uLineDosDate51                 COBOL Name: LK-51U-LINE-DOS-DATE
     * - planDosYy                      COBOL Name: WS-PLAN-DOS-YY
     * - planDosMm                      COBOL Name: WS-PLAN-DOS-MM
     * - planDosDd                      COBOL Name: WS-PLAN-DOS-DD
     * - planDate                       COBOL Name: WS-PLAN-DATE
     * - sub                            COBOL Name: WS-SUB
     * - d51uPlnvCnt                    COBOL Name: D51U-PLNV-CNT
     * - endOfPlanAlt                   COBOL Name: WS-END-OF-PLAN-ALT
     * - d51uInvReason                  COBOL Name: D51U-INV-REASON
     * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
     * - withMmiSw2010                  COBOL Name: WS-2010-WITH-MMI-SW
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - planVarFoundSw                 COBOL Name: WS-PLAN-VAR-FOUND-SW
     * - dSub                           COBOL Name: D-SUB
     * - fesaPolicy                     COBOL Name: FESA-POLICY
     * - uPolicyNo51                    COBOL Name: LK-51U-POLICY-NO
     * - fesaPlanVar                    COBOL Name: FESA-PLAN-VAR
     * - uPlanVar51                     COBOL Name: LK-51U-PLAN-VAR
     * - fesaEffDate                    COBOL Name: FESA-EFF-DATE
     * - fesaSpiNbr                     COBOL Name: FESA-SPI-NBR
     * - dsmCallArea                    COBOL Name: DSM-CALL-AREA
     * - d51uRequestFields              COBOL Name: D51U-REQUEST-FIELDS
     * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
     * - dsmFuncCd                      COBOL Name: DSM-FUNC-CD
     * - d51uReqFuncCd                  COBOL Name: D51U-REQ-FUNC-CD
     * - d51uKeyPolicy                  COBOL Name: D51U-KEY-POLICY
     * - d51uKeyPlan                    COBOL Name: D51U-KEY-PLAN
     * - planVarPrev                    COBOL Name: WS-PLAN-VAR-PREV
     * - d51uKeyStatus                  COBOL Name: D51U-KEY-STATUS
     * - d51uKeyFeSpi                   COBOL Name: D51U-KEY-FE-SPI
     * - d51uReqCallingProgram          COBOL Name: D51U-REQ-CALLING-PROGRAM
     * - d51uReqCallerType              COBOL Name: D51U-REQ-CALLER-TYPE
     * - planDosDate                    COBOL Name: WS-PLAN-DOS-DATE
     * - uLineDosDate51                 COBOL Name: LK-51U-LINE-DOS-DATE
     * - planYy                         COBOL Name: WS-PLAN-YY
     * - planDosYy                      COBOL Name: WS-PLAN-DOS-YY
     * - planCc                         COBOL Name: WS-PLAN-CC
     * - planMm                         COBOL Name: WS-PLAN-MM
     * - planDosMm                      COBOL Name: WS-PLAN-DOS-MM
     * - planDd                         COBOL Name: WS-PLAN-DD
     * - planDosDd                      COBOL Name: WS-PLAN-DOS-DD
     * - d51uReqDosDate                 COBOL Name: D51U-REQ-DOS-DATE
     * - planDate                       COBOL Name: WS-PLAN-DATE
     * - rc                             COBOL Name: RETURN-CODE
     * - w02DsplErrInd                  COBOL Name: W02-DSPL-ERR-IND
     * - d51uInvReason                  COBOL Name: D51U-INV-REASON
     * - w02RespCd                      COBOL Name: W02-RESP-CD
     * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
     * - w02AbendingProg                COBOL Name: W02-ABENDING-PROG
     * - w02MainProg                    COBOL Name: W02-MAIN-PROG
     * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
     * - mmiFoundSw                     COBOL Name: WS-MMI-FOUND-SW
     *
     * @throws CFException
     */
    @Override
    public ReadPlanAltDb2OutCtx readPlanAltDb2(ReadPlanAltDb2InCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2010D-read-plan-alt-db2                                      *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 this section of the program will start the read  plan        *
        // *81 variation file.                                              *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2010d-read-plan-alt-db2                                      *
        // *82                                                              *
        // *82 1. start browsing the plan alternative file. if the record is*
        // *82    not found,exit the section. if any other error occurs,    *
        // *82    display the error and abort the program.                  *
        // *82 2. if the browse is successful, build and populate a table   *
        // *82    to store the policy number, plan dates and plan variables.*
        // *82 3. populate the working storage variables for the generic    *
        // *82    translators and the additional translators.               *
        // *82***************************************************************
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        ReadPlanAltDb2OutCtx methodOut = methodIn.getReadPlanAltDb2OutCtx();
        // cobolCode::MOVE '2010D' TO WS-PARAGRAPH
        // LITERAL_2010D = '2010D'
        methodOut.setParagraph(CONSTANTS.LITERAL_2010D);
        // LITERAL_N = 'N'
        methodOut.setPlanVarFoundSw(CONSTANTS.LITERAL_N);
        // cobolCode::MOVE 0 TO D-SUB
        // LITERAL_0 = 0
        methodOut.setDSub(0);
        // cobolCode::MOVE LK-51U-POLICY-NO TO FESA-POLICY
        methodOut.setFesaPolicy(methodOut.getUPolicyNo51());
        // cobolCode::MOVE LK-51U-PLAN-VAR TO FESA-PLAN-VAR
        methodOut.setFesaPlanVar(methodOut.getUPlanVar51());
        // cobolCode::MOVE ZEROS TO FESA-EFF-DATE FESA-SPI-NBR
        methodOut.setFesaEffDate(0);
        methodOut.setFesaSpiNbr(0);
        // cobolCode::INITIALIZE DSM-CALL-AREA D51U-REQUEST-FIELDS D51U-RETURN-CODE
        methodOut.getDsmCallArea().initialize();
        methodOut.getD51uRequestFields().initialize();
        methodOut.setD51uReturnCode(0);
        // *45917S          vyspi51u-call-area.
        // *45917S          vyspi51u-call-area.
        methodOut.setDsmFuncCd(1);
        // cobolCode::SET D51U-REQ-SELECT-PLAN TO TRUE
        methodOut.setD51uReqSelectPlanTrue();
        // cobolCode::MOVE LK-51U-POLICY-NO TO D51U-KEY-POLICY
        methodOut.setD51uKeyPolicy(methodOut.getUPolicyNo51());
        // cobolCode::MOVE WS-PLAN-VAR-PREV TO D51U-KEY-PLAN
        methodOut.setD51uKeyPlan(String.valueOf(CFUtil.pad(4, String.valueOf(methodOut.getPlanVarPrev()), "0", CFUtil.LEFT_PAD)).toCharArray());
        // cobolCode::MOVE 'A' TO D51U-KEY-STATUS
        // LITERAL_A = 'A'
        methodOut.setD51uKeyStatus(CONSTANTS.LITERAL_A);
        // cobolCode::MOVE FESA-SPI-NBR TO D51U-KEY-FE-SPI
        methodOut.setD51uKeyFeSpi(String.valueOf(CFUtil.pad(7, String.valueOf(methodOut.getFesaSpiNbr()), "0", CFUtil.LEFT_PAD)).toCharArray());
        // cobolCode::MOVE 'O529351U' TO D51U-REQ-CALLING-PROGRAM
        // LITERAL_O529351U = 'O529351U'
        methodOut.setD51uReqCallingProgram(CONSTANTS.LITERAL_O529351U);
        // cobolCode::SET D51U-REQ-CALLER-ONLINE TO TRUE
        methodOut.setD51uReqCallerOnlineTrue();
        // cobolCode::MOVE LK-51U-LINE-DOS-DATE ( LK-SUB ) TO WS-PLAN-DOS-DATE
        methodOut.setPlanDosDate(methodOut.getULineDosDate51(methodIn.getSub01() - 1));
        // cobolCode::MOVE WS-PLAN-DOS-YY TO WS-PLAN-YY
        methodOut.setPlanYy(methodOut.getPlanDosYy());
        // cobolCode::IF WS-PLAN-YY > 50
        if ((methodOut.getPlanYy() > 50)) {
            methodOut.setPlanCc(19);
        } else // cobolCode::ELSE
        {
            methodOut.setPlanCc(20);
        }
        // cobolCode::MOVE WS-PLAN-DOS-MM TO WS-PLAN-MM
        methodOut.setPlanMm(methodOut.getPlanDosMm());
        // cobolCode::MOVE WS-PLAN-DOS-DD TO WS-PLAN-DD
        methodOut.setPlanDd(methodOut.getPlanDosDd());
        // cobolCode::MOVE WS-PLAN-DATE TO D51U-REQ-DOS-DATE
        methodOut.setD51uReqDosDate(String.valueOf(methodOut.getPlanDateString()).toCharArray());
        // cobolCode::CALL WS-D529351U-DB2-DSM USING DSM-CALL-AREA VYSPI51U-CALL-AREA
        programCtx.setRc(d529351u.call(programCtx.getGlobalCtx().getContext("D529351U"), methodOut.getDsmCallArea(), methodOut.getVyspi51uCallArea()));
        // cobolCode::EVALUATE TRUE
        if (methodOut.isD51uGoodReturn()) {
            // cobolCode::PERFORM 2020D-BUILD-PLAN-ALT-TABLE THRU 2020D-EXIT UNTIL WS-SUB > D51U-PLNV-CNT OR END-OF-PLAN-ALT OR WS-SUB > 9999
            while ((methodIn.getSub() <= methodIn.getD51uPlnvCnt()) && !(methodIn.isEndOfPlanAlt1()) && (methodIn.getSub() <= 9999)) {
                buildPlanAltTable2020D(programCtx.getBuildPlanAltTable2020DInCtx());
                /*2020D-BUILD-PLAN-ALT-TABLE SECTION*/
            }
        } else if (methodOut.isD51uNotFound()) {
            ;
        } else if (methodOut.isD51uDb2Error()) {
            // cobolCode::MOVE D51U-INV-REASON TO W02-DSPL-ERR-IND
            methodOut.setW02DsplErrInd(String.valueOf(methodOut.getD51uInvReasonString()).toCharArray());
            // cobolCode::MOVE D51U-SQL-OR-RESP-CD TO W02-RESP-CD
            methodOut.setW02RespCd(CFUtil.getLong(methodOut.getD51uSqlOrRespCd()));
            // cobolCode::MOVE 'D529351U' TO W02-ABENDING-PROG
            // LITERAL_D529351U = 'D529351U'
            methodOut.setW02AbendingProg(CONSTANTS.LITERAL_D529351U);
            // cobolCode::MOVE 'PLN' TO W02-MAIN-PROG
            // LITERAL_PLN = 'PLN'
            methodOut.setW02MainProg(CONSTANTS.LITERAL_PLN);
            // cobolCode::PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
            writeToSysm(programCtx.getWriteToSysmInCtx());
            /*11100A-WRITE-TO-SYSM SECTION*/
            // cobolCode::SET M51U-ILLOGICAL-COND TO TRUE
            methodOut.setM51uIllogicalCondTrue();
            // cobolCode::PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
            dumpAbend(programCtx);
            /*8000-DUMP-ABEND SECTION*/
        }
        // cobolCode::IF D51U-PLNV-CNT = ZEROES AND 2010-WITH-MMI-POL
        if ((methodIn.getD51uPlnvCnt() == 0) && methodIn.isWithMmiPol2010()) {
            // cobolCode::SET MMI-ALT-NOT-FOUND TO TRUE
            methodOut.setMmiAltNotFoundTrue();
            // cobolCode::GO TO 2010D-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 2010D-EXIT
        }
        // cobolCode::PERFORM 2013-NEW-SPI-TRANSLATION THRU 2013-EXIT
        newSpiTranslation(programCtx.getNewSpiTranslationInCtx());
        /*2013-NEW-SPI-TRANSLATION*/
        // cobolCode::PERFORM 2015-GENERIC-TRANSLATION THRU 2015-EXIT
        genericTranslation(programCtx.getGenericTranslationInCtx());
        /*2015-GENERIC-TRANSLATION*/
        return methodOut;
    }

    /**
     * buildPlanAltTable2020D
     *   This method is derived from
     *   COBOL Paragraph - 2020D-BUILD-PLAN-ALT-TABLE SECTION COBOL Cyclomatic complexity - 3
     * Input  :
     *
     * - dSub                           COBOL Name: D-SUB
     * - d51uRetPolicy                  COBOL Name: D51U-RET-POLICY
     * - polNo                          COBOL Name: WS-POL-NO
     * - d51uRetPlan                    COBOL Name: D51U-RET-PLAN
     * - planVarPrev                    COBOL Name: WS-PLAN-VAR-PREV
     * - d51uRetFeSpi                   COBOL Name: D51U-RET-FE-SPI
     * - d51uRetPosTierCd               COBOL Name: D51U-RET-POS-TIER-CD
     * - d51uRetPriDiagInd              COBOL Name: D51U-RET-PRI-DIAG-IND
     * - d51uRetDiagElgInd              COBOL Name: D51U-RET-DIAG-ELG-IND
     * - sub                            COBOL Name: WS-SUB
     * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
     *
     * Output :
     *
     * - dSub                           COBOL Name: D-SUB
     * - fesaPolicy01                   COBOL Name: WS-FESA-POLICY
     * - d51uRetPolicy                  COBOL Name: D51U-RET-POLICY
     * - fesaPlanVar01                  COBOL Name: WS-FESA-PLAN-VAR
     * - d51uRetPlan                    COBOL Name: D51U-RET-PLAN
     * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
     * - d51uRetFeSpi                   COBOL Name: D51U-RET-FE-SPI
     * - fesaPosTierCd                  COBOL Name: WS-FESA-POS-TIER-CD
     * - d51uRetPosTierCd               COBOL Name: D51U-RET-POS-TIER-CD
     * - fesaSpiPriDiagInd              COBOL Name: WS-FESA-SPI-PRI-DIAG-IND
     * - d51uRetPriDiagInd              COBOL Name: D51U-RET-PRI-DIAG-IND
     * - fesaSpiDiagElgInd              COBOL Name: WS-FESA-SPI-DIAG-ELG-IND
     * - d51uRetDiagElgInd              COBOL Name: D51U-RET-DIAG-ELG-IND
     * - planVarFoundSw                 COBOL Name: WS-PLAN-VAR-FOUND-SW
     * - sub                            COBOL Name: WS-SUB
     * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
     *
     * @throws CFException
     */
    @Override
    public BuildPlanAltTable2020DOutCtx buildPlanAltTable2020D(BuildPlanAltTable2020DInCtx methodIn) throws Exception {
        // *82***************************************************************
        // *82 2020D-build-plan-alt-table                                   *
        // *82                                                              *
        // *82 1. read the next record from the plan variation file.        *
        // *82    if the record is not found, or the end of file is reached *
        // *82    set a switch to indicate the same and exit the section. if*
        // *82    any other error occurs, display the error and abort the   *
        // *82    program.                                                  *
        // *82 2. if the policy number and the plan variable in the record  *
        // *82    does not match with the ones in the storage variables,    *
        // *82    exit the paragraph,otherwise                              *
        // *82    -populate the storage variables with the plan dates.      *
        // *82    -check if the date of service falls within the plan       *
        // *82     effective date and the cancel date. also add a century   *
        // *82     variable to the dates.                                   *
        // *82    -built a table to store the policy name, plan variable,   *
        // *82     effective date and special processing instructions number*
        // *82***************************************************************
        // *-------------------------*
        // *45917S  if d51u-ret-policy(d-sub)  = spaces or low-values
        // *45917s      move 'y' to  ws-end-of-plan-alt
        // *45917s      go to 2020d-exit
        // *45917s  end-if.
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        BuildPlanAltTable2020DOutCtx methodOut = methodIn.getBuildPlanAltTable2020DOutCtx();
        // cobolCode::ADD 1 TO D-SUB
        methodOut.setDSub(methodOut.getDSub() + 1);
        // cobolCode::IF D51U-RET-POLICY ( D-SUB ) = WS-POL-NO AND D51U-RET-PLAN ( D-SUB ) = WS-PLAN-VAR-PREV
        if (compareChars(methodOut.getD51uRetPolicy(methodOut.getDSub() - 1), methodIn.getPolNo()) == 0 && (methodOut.getD51uRetPlan(methodOut.getDSub() - 1) == methodIn.getPlanVarPrev())) {
            // cobolCode::MOVE D51U-RET-POLICY ( D-SUB ) TO WS-FESA-POLICY ( WS-SUB )
            methodOut.setFesaPolicy01(methodOut.getSub() - 1, methodOut.getD51uRetPolicy(methodOut.getDSub() - 1));
            // cobolCode::MOVE D51U-RET-PLAN ( D-SUB ) TO WS-FESA-PLAN-VAR ( WS-SUB )
            methodOut.setFesaPlanVar01(methodOut.getSub() - 1, methodOut.getD51uRetPlan(methodOut.getDSub() - 1));
            // cobolCode::MOVE D51U-RET-FE-SPI ( D-SUB ) TO WS-FESA-SPI-NBR ( WS-SUB )
            methodOut.setFesaSpiNbr01(methodOut.getSub() - 1, CFUtil.getInt(methodOut.getD51uRetFeSpi(methodOut.getDSub() - 1)));
            // cobolCode::MOVE D51U-RET-POS-TIER-CD ( D-SUB ) TO WS-FESA-POS-TIER-CD ( WS-SUB )
            methodOut.setFesaPosTierCd(methodOut.getSub() - 1, methodOut.getD51uRetPosTierCd(methodOut.getDSub() - 1));
            // cobolCode::MOVE D51U-RET-PRI-DIAG-IND ( D-SUB ) TO WS-FESA-SPI-PRI-DIAG-IND ( WS-SUB )
            methodOut.setFesaSpiPriDiagInd(methodOut.getSub() - 1, methodOut.getD51uRetPriDiagInd(methodOut.getDSub() - 1));
            // cobolCode::MOVE D51U-RET-DIAG-ELG-IND ( D-SUB ) TO WS-FESA-SPI-DIAG-ELG-IND ( WS-SUB )
            methodOut.setFesaSpiDiagElgInd(methodOut.getSub() - 1, methodOut.getD51uRetDiagElgInd(methodOut.getDSub() - 1));
            // LITERAL_Y = 'Y'
            methodOut.setPlanVarFoundSw(CONSTANTS.LITERAL_Y);
            // cobolCode::ADD 1 TO WS-SUB WS-NBR-OF-PLAN-VAR
            methodOut.setSub(methodOut.getSub() + 1);
            methodOut.setNbrOfPlanVar(methodOut.getNbrOfPlanVar() + 1);
        }
        return methodOut;
    }

    /**
     * readSpiRulesDb2
     *   This method is derived from
     *   COBOL Paragraph - 2030D-READ-SPI-RULES-DB2 SECTION COBOL Cyclomatic complexity - 6
     * Input  :
     *
     * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
     * - uIcdVerNbr51                   COBOL Name: LK-51U-ICD-VER-NBR
     * - uCauseCd51                     COBOL Name: LK-51U-CAUSE-CD
     * - uProvType51                    COBOL Name: LK-51U-PROV-TYPE
     * - uLinePos51                     COBOL Name: LK-51U-LINE-POS
     * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
     * - fesaSpiPriDiagInd              COBOL Name: WS-FESA-SPI-PRI-DIAG-IND
     * - sub                            COBOL Name: WS-SUB
     * - uDiagnosisCode51               COBOL Name: LK-51U-DIAGNOSIS-CODE
     * - uCpeDescCd51                   COBOL Name: LK-51U-CPE-DESC-CD
     * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
     * - d51uInvReason                  COBOL Name: D51U-INV-REASON
     * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - dsmCallArea                    COBOL Name: DSM-CALL-AREA
     * - d51uRequestFields              COBOL Name: D51U-REQUEST-FIELDS
     * - dsmFuncCd                      COBOL Name: DSM-FUNC-CD
     * - d51uReqFuncCd                  COBOL Name: D51U-REQ-FUNC-CD
     * - d51uKeyFeSpi                   COBOL Name: D51U-KEY-FE-SPI
     * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
     * - d51uKeyStatus                  COBOL Name: D51U-KEY-STATUS
     * - d51uReqCallingProgram          COBOL Name: D51U-REQ-CALLING-PROGRAM
     * - d51uReqCallerType              COBOL Name: D51U-REQ-CALLER-TYPE
     * - d51uLstClmIcdInd               COBOL Name: D51U-LST-CLM-ICD-IND
     * - d51uTestCaus                   COBOL Name: D51U-TEST-CAUS
     * - uCauseCd51                     COBOL Name: LK-51U-CAUSE-CD
     * - d51uTestProvTyp                COBOL Name: D51U-TEST-PROV-TYP
     * - uProvType51                    COBOL Name: LK-51U-PROV-TYPE
     * - d51uTestPos                    COBOL Name: D51U-TEST-POS
     * - uLinePos51                     COBOL Name: LK-51U-LINE-POS
     * - d51uTestSvcCd                  COBOL Name: D51U-TEST-SVC-CD
     * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
     * - primDiagFound                  COBOL Name: WS-PRIM-DIAG-FOUND
     * - d51uTestDiag01                 COBOL Name: D51U-TEST-DIAG-01
     * - uDiagnosisCode51               COBOL Name: LK-51U-DIAGNOSIS-CODE
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
     * - uCpeDescCd51                   COBOL Name: LK-51U-CPE-DESC-CD
     * - rc                             COBOL Name: RETURN-CODE
     * - w02DsplErrInd                  COBOL Name: W02-DSPL-ERR-IND
     * - d51uInvReason                  COBOL Name: D51U-INV-REASON
     * - w02RespCd                      COBOL Name: W02-RESP-CD
     * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
     * - w02AbendingProg                COBOL Name: W02-ABENDING-PROG
     * - w02MainProg                    COBOL Name: W02-MAIN-PROG
     * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
     *
     * @throws CFException
     */
    @Override
    public ReadSpiRulesDb2OutCtx readSpiRulesDb2(ReadSpiRulesDb2InCtx methodIn) throws Exception {
        // *82 2030D-read-spi-rules-db2                                     *
        // *82                                                              *
        // *82 1. fill the parameter keys with low values (initialize keys) *
        // *82 2. browse the special processing instructions file. if the   *
        // *82    record is not found or the end of file is reached, exit   *
        // *82    the section. if any other error occurs, display the error *
        // *82    and abort the program.                                    *
        // *82 3. read the next record and apply the special processing     *
        // *82    instruction rules individually.                           *
        // *82***************************************************************
        // *---------------------*
        // **Perform 2030-read-spi-rules thru
        // **        2030-exit varying ws-sub from 1 by 1
        // **                  until ws-sub > ws-nbr-of-plan-var
        // **
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        ReadSpiRulesDb2OutCtx methodOut = methodIn.getReadSpiRulesDb2OutCtx();
        // cobolCode::MOVE '2030D' TO WS-PARAGRAPH
        // LITERAL_2030D = '2030D'
        methodOut.setParagraph(CONSTANTS.LITERAL_2030D);
        // cobolCode::MOVE ZEROS TO WS-NBR-MATCHED
        methodOut.setNbrMatched(0);
        // cobolCode::INITIALIZE DSM-CALL-AREA D51U-REQUEST-FIELDS
        methodOut.getDsmCallArea().initialize();
        methodOut.getD51uRequestFields().initialize();
        // *45917S          vyspi51u-call-area.
        // *45917S          vyspi51u-call-area.
        methodOut.setDsmFuncCd(2);
        // cobolCode::SET D51U-REQ-SELECT-RULE TO TRUE
        methodOut.setD51uReqSelectRuleTrue();
        // cobolCode::MOVE WS-FESA-SPI-NBR ( WS-SUB ) TO D51U-KEY-FE-SPI
        methodOut.setD51uKeyFeSpi(String.valueOf(CFUtil.pad(7, String.valueOf(methodOut.getFesaSpiNbr01(methodIn.getSub() - 1)), "0", CFUtil.LEFT_PAD)).toCharArray());
        // cobolCode::MOVE 'A' TO D51U-KEY-STATUS
        // LITERAL_A = 'A'
        methodOut.setD51uKeyStatus(CONSTANTS.LITERAL_A);
        // cobolCode::MOVE 'O529351U' TO D51U-REQ-CALLING-PROGRAM
        // LITERAL_O529351U = 'O529351U'
        methodOut.setD51uReqCallingProgram(CONSTANTS.LITERAL_O529351U);
        // cobolCode::SET D51U-REQ-CALLER-ONLINE TO TRUE
        methodOut.setD51uReqCallerOnlineTrue();
        // *
        // cobolCode::IF LK-51U-ICD-VER-NBR = '0'
        // LITERAL_0 = '0'
        if (compareChars(methodIn.getUIcdVerNbr51(), CONSTANTS.LITERAL_0) == 0) {
            // LITERAL_0 = '0'
            methodOut.setD51uLstClmIcdInd(CONSTANTS.LITERAL_0);
        } else // cobolCode::ELSE
        {
            // LITERAL_9 = '9'
            methodOut.setD51uLstClmIcdInd(CONSTANTS.LITERAL_9);
        }
        // *
        // * Add moves from input area to dsm test area
        // *
        // cobolCode::MOVE LK-51U-CAUSE-CD TO D51U-TEST-CAUS
        methodOut.setD51uTestCaus(methodOut.getUCauseCd51());
        // cobolCode::MOVE LK-51U-PROV-TYPE TO D51U-TEST-PROV-TYP
        methodOut.setD51uTestProvTyp(methodOut.getUProvType51());
        // cobolCode::MOVE LK-51U-LINE-POS ( LK-SUB ) TO D51U-TEST-POS
        methodOut.setD51uTestPos(methodOut.getULinePos51(methodIn.getSub01() - 1));
        // *    Move lk-51u-line-service-code(lk-sub) to
        // cobolCode::MOVE LK-51U-LINE-SERVICE-CODE ( LK-SUB ) (1 : 5) TO D51U-TEST-SVC-CD
        methodOut.setD51uTestSvcCd(pad(6, substring(methodOut.getULineServiceCode51(methodIn.getSub01() - 1), 0, 5), SPACE_CHAR, RIGHT_PAD));
        // cobolCode::IF WS-FESA-SPI-PRI-DIAG-IND ( WS-SUB ) = 'Y'
        // LITERAL_Y = 'Y'
        if (methodIn.getFesaSpiPriDiagInd(methodIn.getSub() - 1)[0] == 'Y') {
            // cobolCode::INITIALIZE WS-PRIM-DIAG-FOUND
            methodOut.setPrimDiagFound(CONSTANTS.SPACE);
            // cobolCode::PERFORM 2031D-POPULATE-PRI-DIAG THRU 2031D-EXIT
            populatePriDiag(programCtx.getPopulatePriDiagInCtx());
            /*2031D-POPULATE-PRI-DIAG SECTION*/
        } else // cobolCode::ELSE
        {
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE ( 1) TO D51U-TEST-DIAG-01
            methodOut.setD51uTestDiag01(methodOut.getUDiagnosisCode51(0));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE ( 2) TO D51U-TEST-DIAG-02
            methodOut.setD51uTestDiag02(methodOut.getUDiagnosisCode51(1));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE ( 3) TO D51U-TEST-DIAG-03
            methodOut.setD51uTestDiag03(methodOut.getUDiagnosisCode51(2));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE ( 4) TO D51U-TEST-DIAG-04
            methodOut.setD51uTestDiag04(methodOut.getUDiagnosisCode51(3));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE ( 5) TO D51U-TEST-DIAG-05
            methodOut.setD51uTestDiag05(methodOut.getUDiagnosisCode51(4));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE ( 6) TO D51U-TEST-DIAG-06
            methodOut.setD51uTestDiag06(methodOut.getUDiagnosisCode51(5));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE ( 7) TO D51U-TEST-DIAG-07
            methodOut.setD51uTestDiag07(methodOut.getUDiagnosisCode51(6));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE ( 8) TO D51U-TEST-DIAG-08
            methodOut.setD51uTestDiag08(methodOut.getUDiagnosisCode51(7));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE ( 9) TO D51U-TEST-DIAG-09
            methodOut.setD51uTestDiag09(methodOut.getUDiagnosisCode51(8));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE (10) TO D51U-TEST-DIAG-10
            methodOut.setD51uTestDiag10(methodOut.getUDiagnosisCode51(9));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE (11) TO D51U-TEST-DIAG-11
            methodOut.setD51uTestDiag11(methodOut.getUDiagnosisCode51(10));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE (12) TO D51U-TEST-DIAG-12
            methodOut.setD51uTestDiag12(methodOut.getUDiagnosisCode51(11));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE (13) TO D51U-TEST-DIAG-13
            methodOut.setD51uTestDiag13(methodOut.getUDiagnosisCode51(12));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE (14) TO D51U-TEST-DIAG-14
            methodOut.setD51uTestDiag14(methodOut.getUDiagnosisCode51(13));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE (15) TO D51U-TEST-DIAG-15
            methodOut.setD51uTestDiag15(methodOut.getUDiagnosisCode51(14));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE (16) TO D51U-TEST-DIAG-16
            methodOut.setD51uTestDiag16(methodOut.getUDiagnosisCode51(15));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE (17) TO D51U-TEST-DIAG-17
            methodOut.setD51uTestDiag17(methodOut.getUDiagnosisCode51(16));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE (18) TO D51U-TEST-DIAG-18
            methodOut.setD51uTestDiag18(methodOut.getUDiagnosisCode51(17));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE (19) TO D51U-TEST-DIAG-19
            methodOut.setD51uTestDiag19(methodOut.getUDiagnosisCode51(18));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE (20) TO D51U-TEST-DIAG-20
            methodOut.setD51uTestDiag20(methodOut.getUDiagnosisCode51(19));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE (21) TO D51U-TEST-DIAG-21
            methodOut.setD51uTestDiag21(methodOut.getUDiagnosisCode51(20));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE (22) TO D51U-TEST-DIAG-22
            methodOut.setD51uTestDiag22(methodOut.getUDiagnosisCode51(21));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE (23) TO D51U-TEST-DIAG-23
            methodOut.setD51uTestDiag23(methodOut.getUDiagnosisCode51(22));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE (24) TO D51U-TEST-DIAG-24
            methodOut.setD51uTestDiag24(methodOut.getUDiagnosisCode51(23));
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE (25) TO D51U-TEST-DIAG-25
            methodOut.setD51uTestDiag25(methodOut.getUDiagnosisCode51(24));
        }
        // cobolCode::MOVE LK-51U-CPE-DESC-CD TO D51U-TEST-CPE-DESC-CD
        methodOut.setD51uTestCpeDescCd(methodOut.getUCpeDescCd51());
        // cobolCode::CALL WS-D529351U-DB2-DSM USING DSM-CALL-AREA VYSPI51U-CALL-AREA
        programCtx.setRc(d529351u.call(programCtx.getGlobalCtx().getContext("D529351U"), methodOut.getDsmCallArea(), methodOut.getVyspi51uCallArea()));
        // cobolCode::EVALUATE TRUE
        if (methodIn.isD51uGoodReturn()) {
            // cobolCode::PERFORM 2100D-SPI-RULES-PROCESS THRU 2100D-EXIT
            spiRulesProcess2100D(programCtx.getSpiRulesProcess2100DInCtx());
            /*2100D-SPI-RULES-PROCESS SECTION*/
        } else if (methodIn.isD51uNotFound()) {
            ;
        } else if (methodIn.isD51uDb2Error()) {
            // cobolCode::MOVE D51U-INV-REASON TO W02-DSPL-ERR-IND
            methodOut.setW02DsplErrInd(String.valueOf(methodOut.getD51uInvReasonString()).toCharArray());
            // cobolCode::MOVE D51U-SQL-OR-RESP-CD TO W02-RESP-CD
            methodOut.setW02RespCd(CFUtil.getLong(methodOut.getD51uSqlOrRespCd()));
            // cobolCode::MOVE 'D529351U' TO W02-ABENDING-PROG
            // LITERAL_D529351U = 'D529351U'
            methodOut.setW02AbendingProg(CONSTANTS.LITERAL_D529351U);
            // cobolCode::MOVE 'RUL' TO W02-MAIN-PROG
            // LITERAL_RUL = 'RUL'
            methodOut.setW02MainProg(CONSTANTS.LITERAL_RUL);
            // cobolCode::PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
            writeToSysm(programCtx.getWriteToSysmInCtx());
            /*11100A-WRITE-TO-SYSM SECTION*/
            // cobolCode::SET M51U-ILLOGICAL-COND TO TRUE
            methodOut.setM51uIllogicalCondTrue();
            // cobolCode::PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
            dumpAbend(programCtx);
            /*8000-DUMP-ABEND SECTION*/
        }
        return methodOut;
    }

    /**
     * populatePriDiag
     *   This method is derived from
     *   COBOL Paragraph - 2031D-POPULATE-PRI-DIAG SECTION COBOL Cyclomatic complexity - 8
     * Input  :
     *
     * - uMedicalClaim51                COBOL Name: LK-51U-MEDICAL-CLAIM
     * - s2                             COBOL Name: S2
     * - primDiagFound                  COBOL Name: WS-PRIM-DIAG-FOUND
     * - uLineDiagPointer51             COBOL Name: LK-51U-LINE-DIAG-POINTER
     * - sub01                          COBOL Name: LK-SUB
     * - uDiagnosisCode51               COBOL Name: LK-51U-DIAGNOSIS-CODE
     *
     * Output :
     *
     * - s2                             COBOL Name: S2
     * - point                          COBOL Name: WS-POINT
     * - uLineDiagPointer51             COBOL Name: LK-51U-LINE-DIAG-POINTER
     * - point1                         COBOL Name: WS-POINT-1
     * - d51uTestDiag01                 COBOL Name: D51U-TEST-DIAG-01
     * - uDiagnosisCode51               COBOL Name: LK-51U-DIAGNOSIS-CODE
     * - primDiagFound                  COBOL Name: WS-PRIM-DIAG-FOUND
     *
     * @throws CFException
     */
    @Override
    public PopulatePriDiagOutCtx populatePriDiag(PopulatePriDiagInCtx methodIn) throws Exception {
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        PopulatePriDiagOutCtx methodOut = methodIn.getPopulatePriDiagOutCtx();
        // cobolCode::IF LK-51U-MEDICAL-CLAIM = 'Y'
        // LITERAL_Y = 'Y'
        if (compareChars(methodIn.getUMedicalClaim51(), CONSTANTS.LITERAL_Y) == 0) {
            // cobolCode::PERFORM VARYING S2 FROM +1 BY +1 UNTIL S2 > 25 OR PRIM-DIAG-FOUND
            for (methodOut.setS2(1); ((methodOut.getS2() <= 25) && !(methodOut.isPrimDiagFound1())); methodOut.setS2(methodOut.getS2() + 1)) {
                // cobolCode::IF LK-51U-LINE-DIAG-POINTER ( LK-SUB ) (1 : 2) NOT = '  ' OR '99'
                // LITERAL_99 = '99'
                if (!(Field.compareChar(methodOut.getULineDiagPointer51(methodIn.getSub01() - 1), CONSTANTS.SPACE_2, (0), 2, /*left len*/
                2)) || !(Field.compareChar(methodOut.getULineDiagPointer51(methodIn.getSub01() - 1), CONSTANTS.LITERAL_99, (0), 2, /*left len*/
                2))) {
                    // cobolCode::MOVE LK-51U-LINE-DIAG-POINTER ( LK-SUB ) TO WS-POINT
                    methodOut.getPoint().setString(methodOut.getULineDiagPointer51(methodIn.getSub01() - 1));
                    // cobolCode::IF WS-POINT-1 = S2
                    if ((methodOut.getPoint1() == methodOut.getS2())) {
                        // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE (S2) TO D51U-TEST-DIAG-01
                        methodOut.setD51uTestDiag01(methodOut.getUDiagnosisCode51(methodOut.getS2() - 1));
                        // cobolCode::SET PRIM-DIAG-FOUND TO TRUE
                        methodOut.setPrimDiagFound1True();
                    }
                }
            }
        } else // cobolCode::ELSE
        {
            // cobolCode::MOVE LK-51U-DIAGNOSIS-CODE (1) TO D51U-TEST-DIAG-01
            methodOut.setD51uTestDiag01(methodOut.getUDiagnosisCode51(0));
        }
        return methodOut;
    }

    /**
     * spiRulesProcess2100D
     *   This method is derived from
     *   COBOL Paragraph - 2100D-SPI-RULES-PROCESS SECTION COBOL Cyclomatic complexity - 7
     * Input  :
     *
     * - keySub                         COBOL Name: KEY-SUB
     * - d51uRetDrvPos                  COBOL Name: D51U-RET-DRV-POS
     * - d51uRetDrvSvc                  COBOL Name: D51U-RET-DRV-SVC
     * - d51uRetDrvCau                  COBOL Name: D51U-RET-DRV-CAU
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - keyComplete                    COBOL Name: WS-KEY-COMPLETE
     * - keySub                         COBOL Name: KEY-SUB
     * - fromPsFound                    COBOL Name: WS-FROM-PS-FOUND
     * - fromSvcFound                   COBOL Name: WS-FROM-SVC-FOUND
     * - fromPrvFound                   COBOL Name: WS-FROM-PRV-FOUND
     * - fromIcd9Found                  COBOL Name: WS-FROM-ICD9-FOUND
     * - fromCauseFound                 COBOL Name: WS-FROM-CAUSE-FOUND
     * - ipaCodeFound                   COBOL Name: WS-IPA-CODE-FOUND
     * - ipaAndGtnFound                 COBOL Name: WS-IPA-AND-GTN-FOUND
     * - cpeFlgFound                    COBOL Name: WS-CPE-FLG-FOUND
     * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
     * - fcndPs                         COBOL Name: WS-FCND-PS
     * - fcndSvc                        COBOL Name: WS-FCND-SVC
     * - fcndCauseCd                    COBOL Name: WS-FCND-CAUSE-CD
     * - prevPs                         COBOL Name: WS-PREV-PS
     * - prevSvc                        COBOL Name: WS-PREV-SVC
     * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
     * - frtoPs                         COBOL Name: WS-FRTO-PS
     * - frtoSvc                        COBOL Name: WS-FRTO-SVC
     * - frtoCauseCd                    COBOL Name: WS-FRTO-CAUSE-CD
     * - ptypPs                         COBOL Name: WS-PTYP-PS
     * - ptypSvc                        COBOL Name: WS-PTYP-SVC
     * - ptypCauseCd                    COBOL Name: WS-PTYP-CAUSE-CD
     * - ricdPs                         COBOL Name: WS-RICD-PS
     * - ricdSvc                        COBOL Name: WS-RICD-SVC
     * - ricdCauseCd                    COBOL Name: WS-RICD-CAUSE-CD
     * - causPs                         COBOL Name: WS-CAUS-PS
     * - causSvc                        COBOL Name: WS-CAUS-SVC
     * - causCauseCd                    COBOL Name: WS-CAUS-CAUSE-CD
     * - ripaPs                         COBOL Name: WS-RIPA-PS
     * - ripaSvc                        COBOL Name: WS-RIPA-SVC
     * - ripaCauseCd                    COBOL Name: WS-RIPA-CAUSE-CD
     * - cflgPs                         COBOL Name: WS-CFLG-PS
     * - cflgSvc                        COBOL Name: WS-CFLG-SVC
     * - cflgCauseCd                    COBOL Name: WS-CFLG-CAUSE-CD
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - d51uRetDrvPos                  COBOL Name: D51U-RET-DRV-POS
     * - d51uRetDrvSvc                  COBOL Name: D51U-RET-DRV-SVC
     * - d51uRetDrvCau                  COBOL Name: D51U-RET-DRV-CAU
     *
     * @throws CFException
     */
    @Override
    public SpiRulesProcess2100DOutCtx spiRulesProcess2100D(SpiRulesProcess2100DInCtx methodIn) throws Exception {
        // *82    To the most "from fields".  if the number is equal, then  *
        // *82    non-select the claim with '48' - mult spi matches.        *
        // *82***************************************************************
        // *------------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        SpiRulesProcess2100DOutCtx methodOut = methodIn.getSpiRulesProcess2100DOutCtx();
        // cobolCode::MOVE '2100D' TO WS-PARAGRAPH
        // LITERAL_2100D = '2100D'
        methodOut.setParagraph(CONSTANTS.LITERAL_2100D);
        // LITERAL_N = 'N'
        methodOut.setKeyComplete(CONSTANTS.LITERAL_N);
        // cobolCode::PERFORM VARYING KEY-SUB FROM 1 BY 1 UNTIL KEY-SUB > 99 OR KEY-COMPLETE
        for (methodOut.setKeySub(1); ((methodOut.getKeySub() <= 99) && !(methodOut.isKeyComplete1())); methodOut.setKeySub(methodOut.getKeySub() + 1)) {
            // LITERAL_N = 'N'
            methodOut.setFromPsFound(CONSTANTS.LITERAL_N);
            // LITERAL_N = 'N'
            methodOut.setFromSvcFound(CONSTANTS.LITERAL_N);
            // LITERAL_N = 'N'
            methodOut.setFromPrvFound(CONSTANTS.LITERAL_N);
            // LITERAL_N = 'N'
            methodOut.setFromIcd9Found(CONSTANTS.LITERAL_N);
            // LITERAL_N = 'N'
            methodOut.setFromCauseFound(CONSTANTS.LITERAL_N);
            // LITERAL_N = 'N'
            methodOut.setIpaCodeFound(CONSTANTS.LITERAL_N);
            // LITERAL_N = 'N'
            methodOut.setIpaAndGtnFound(CONSTANTS.LITERAL_N);
            // LITERAL_N = 'N'
            methodOut.setCpeFlgFound(CONSTANTS.LITERAL_N);
            // LITERAL_N = 'N'
            methodOut.setSearchComplete(CONSTANTS.LITERAL_N);
            // cobolCode::MOVE SPACES TO WS-FCND-PS WS-FCND-SVC WS-FCND-CAUSE-CD WS-PREV-PS WS-PREV-SVC WS-PREV-CAUSE-CD WS-FRTO-PS WS-FRTO-SVC WS-FRTO-CAUSE-CD WS-PTYP-PS WS-PTYP-SVC WS-PTYP-CAUSE-CD WS-RICD-PS WS-RICD-SVC WS-RICD-CAUSE-CD WS-CAUS-PS WS-CAUS-SVC WS-CAUS-CAUSE-CD WS-RIPA-PS WS-RIPA-SVC WS-RIPA-CAUSE-CD WS-CFLG-PS WS-CFLG-SVC WS-CFLG-CAUSE-CD
            methodOut.setFcndPs(CONSTANTS.SPACE_2);
            methodOut.setFcndSvc(CONSTANTS.SPACE_6);
            methodOut.setFcndCauseCd(CONSTANTS.SPACE);
            methodOut.setPrevPs(CONSTANTS.SPACE_2);
            methodOut.setPrevSvc(CONSTANTS.SPACE_6);
            methodOut.setPrevCauseCd(CONSTANTS.SPACE);
            methodOut.setFrtoPs(CONSTANTS.SPACE_2);
            methodOut.setFrtoSvc(CONSTANTS.SPACE_6);
            methodOut.setFrtoCauseCd(CONSTANTS.SPACE);
            methodOut.setPtypPs(CONSTANTS.SPACE_2);
            methodOut.setPtypSvc(CONSTANTS.SPACE_6);
            methodOut.setPtypCauseCd(CONSTANTS.SPACE);
            methodOut.setRicdPs(CONSTANTS.SPACE_2);
            methodOut.setRicdSvc(CONSTANTS.SPACE_6);
            methodOut.setRicdCauseCd(CONSTANTS.SPACE);
            methodOut.setCausPs(CONSTANTS.SPACE_2);
            methodOut.setCausSvc(CONSTANTS.SPACE_6);
            methodOut.setCausCauseCd(CONSTANTS.SPACE);
            methodOut.setRipaPs(CONSTANTS.SPACE_2);
            methodOut.setRipaSvc(CONSTANTS.SPACE_6);
            methodOut.setRipaCauseCd(CONSTANTS.SPACE);
            methodOut.setCflgPs(CONSTANTS.SPACE_2);
            methodOut.setCflgSvc(CONSTANTS.SPACE_6);
            methodOut.setCflgCauseCd(CONSTANTS.SPACE);
            // cobolCode::MOVE ZEROS TO WS-NBR-MATCHED
            methodOut.setNbrMatched(0);
            // cobolCode::IF D51U-RET-DRV-POS ( KEY-SUB ) = SPACES AND D51U-RET-DRV-SVC ( KEY-SUB ) = SPACES AND D51U-RET-DRV-CAU ( KEY-SUB ) = SPACES
            if ((allSpaces(methodOut.getD51uRetDrvPos(methodOut.getKeySub() - 1))) && (allSpaces(methodOut.getD51uRetDrvSvc(methodOut.getKeySub() - 1))) && (allSpaces(methodOut.getD51uRetDrvCau(methodOut.getKeySub() - 1)))) {
                // cobolCode::SET KEY-COMPLETE TO TRUE
                methodOut.setKeyComplete1True();
            } else // cobolCode::ELSE
            {
                // cobolCode::MOVE D51U-RET-DRV-POS ( KEY-SUB ) TO WS-PREV-PS
                methodOut.setPrevPs(methodOut.getD51uRetDrvPos(methodOut.getKeySub() - 1));
                // cobolCode::MOVE D51U-RET-DRV-SVC ( KEY-SUB ) TO WS-PREV-SVC
                methodOut.setPrevSvc(methodOut.getD51uRetDrvSvc(methodOut.getKeySub() - 1));
                // cobolCode::MOVE D51U-RET-DRV-CAU ( KEY-SUB ) TO WS-PREV-CAUSE-CD
                methodOut.setPrevCauseCd(methodOut.getD51uRetDrvCau(methodOut.getKeySub() - 1));
                // cobolCode::PERFORM 2100D-MATCHING-RTN THRU 2100D-MATCH-EXIT
                matchingRtn(programCtx.getMatchingRtnInCtx());
                /*2100D-MATCHING-RTN SECTION*/
            }
        }
        return methodOut;
    }

    /**
     * matchingRtn
     *   This method is derived from
     *   COBOL Paragraph - 2100D-MATCHING-RTN SECTION COBOL Cyclomatic complexity - 119
     * Input  :
     *
     * - d51uFcndCnt                    COBOL Name: D51U-FCND-CNT
     * - d51uRetRuleSw                  COBOL Name: D51U-RET-RULE-SW
     * - d51uFrtoCnt                    COBOL Name: D51U-FRTO-CNT
     * - d51uPtypCnt                    COBOL Name: D51U-PTYP-CNT
     * - d51uCausCnt                    COBOL Name: D51U-CAUS-CNT
     * - d51uIcdCnt                     COBOL Name: D51U-ICD-CNT
     * - d51uCflgCnt                    COBOL Name: D51U-CFLG-CNT
     * - keySub                         COBOL Name: KEY-SUB
     * - psSub                          COBOL Name: PS-SUB
     * - fromPsFound                    COBOL Name: WS-FROM-PS-FOUND
     * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
     * - svcSub                         COBOL Name: SVC-SUB
     * - fromSvcFound                   COBOL Name: WS-FROM-SVC-FOUND
     * - pvSub                          COBOL Name: PV-SUB
     * - fromPrvFound                   COBOL Name: WS-FROM-PRV-FOUND
     * - causeSub                       COBOL Name: CAUSE-SUB
     * - fromCauseFound                 COBOL Name: WS-FROM-CAUSE-FOUND
     * - d51uIpaCnt                     COBOL Name: D51U-IPA-CNT
     * - d51uRipaClmIpa1Cd              COBOL Name: D51U-RIPA-CLM-IPA-1-CD
     * - iSub                           COBOL Name: I-SUB
     * - ipaCodeFound                   COBOL Name: WS-IPA-CODE-FOUND
     * - ipaAndGtnFound                 COBOL Name: WS-IPA-AND-GTN-FOUND
     * - cflgSub                        COBOL Name: CFLG-SUB
     * - cpeFlgFound                    COBOL Name: WS-CPE-FLG-FOUND
     * - d51uMoreIcdRecords             COBOL Name: D51U-MORE-ICD-RECORDS
     * - icd9Sub                        COBOL Name: ICD9-SUB
     * - fromIcd9Found                  COBOL Name: WS-FROM-ICD9-FOUND
     * - uIcdVerNbr51                   COBOL Name: LK-51U-ICD-VER-NBR
     * - prevPs                         COBOL Name: WS-PREV-PS
     * - prevSvc                        COBOL Name: WS-PREV-SVC
     * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
     * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
     * - d51uMoreIcdCnt                 COBOL Name: D51U-MORE-ICD-CNT
     * - d51uInvReason                  COBOL Name: D51U-INV-REASON
     * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - nbrMatchedPrev                 COBOL Name: WS-NBR-MATCHED-PREV
     * - d51uKeyFeSpi                   COBOL Name: D51U-KEY-FE-SPI
     * - posSub                         COBOL Name: WS-POS-SUB
     * - d51uPlnvCnt                    COBOL Name: D51U-PLNV-CNT
     * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
     * - fesaPosTierCd                  COBOL Name: WS-FESA-POS-TIER-CD
     * - fesaSpiDiagElgInd              COBOL Name: WS-FESA-SPI-DIAG-ELG-IND
     * - fcndPs                         COBOL Name: WS-FCND-PS
     * - fcndSvc                        COBOL Name: WS-FCND-SVC
     * - fcndCauseCd                    COBOL Name: WS-FCND-CAUSE-CD
     * - frtoPs                         COBOL Name: WS-FRTO-PS
     * - frtoSvc                        COBOL Name: WS-FRTO-SVC
     * - frtoCauseCd                    COBOL Name: WS-FRTO-CAUSE-CD
     * - ptypPs                         COBOL Name: WS-PTYP-PS
     * - ptypSvc                        COBOL Name: WS-PTYP-SVC
     * - ptypCauseCd                    COBOL Name: WS-PTYP-CAUSE-CD
     * - ricdPs                         COBOL Name: WS-RICD-PS
     * - ricdSvc                        COBOL Name: WS-RICD-SVC
     * - ricdCauseCd                    COBOL Name: WS-RICD-CAUSE-CD
     * - causPs                         COBOL Name: WS-CAUS-PS
     * - causSvc                        COBOL Name: WS-CAUS-SVC
     * - causCauseCd                    COBOL Name: WS-CAUS-CAUSE-CD
     * - ripaPs                         COBOL Name: WS-RIPA-PS
     * - ripaSvc                        COBOL Name: WS-RIPA-SVC
     * - ripaCauseCd                    COBOL Name: WS-RIPA-CAUSE-CD
     * - cflgPs                         COBOL Name: WS-CFLG-PS
     * - cflgSvc                        COBOL Name: WS-CFLG-SVC
     * - cflgCauseCd                    COBOL Name: WS-CFLG-CAUSE-CD
     *
     * Output :
     *
     * - sameTable                      COBOL Name: WS-SAME-TABLE
     * - psSub                          COBOL Name: PS-SUB
     * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
     * - svcSub                         COBOL Name: SVC-SUB
     * - pvSub                          COBOL Name: PV-SUB
     * - causeSub                       COBOL Name: CAUSE-SUB
     * - iSub                           COBOL Name: I-SUB
     * - cflgSub                        COBOL Name: CFLG-SUB
     * - icd9Sub                        COBOL Name: ICD9-SUB
     * - d51uLstClmIcdInd               COBOL Name: D51U-LST-CLM-ICD-IND
     * - d51uMoreIcdSwitch              COBOL Name: D51U-MORE-ICD-SWITCH
     * - dsmFuncCd                      COBOL Name: DSM-FUNC-CD
     * - d51uLstClmIcdPos               COBOL Name: D51U-LST-CLM-ICD-POS
     * - prevPs                         COBOL Name: WS-PREV-PS
     * - d51uLstClmIcdSvc               COBOL Name: D51U-LST-CLM-ICD-SVC
     * - prevSvc                        COBOL Name: WS-PREV-SVC
     * - d51uLstClmIcdCau               COBOL Name: D51U-LST-CLM-ICD-CAU
     * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
     * - rc                             COBOL Name: RETURN-CODE
     * - w02DsplErrInd                  COBOL Name: W02-DSPL-ERR-IND
     * - d51uInvReason                  COBOL Name: D51U-INV-REASON
     * - w02RespCd                      COBOL Name: W02-RESP-CD
     * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
     * - w02AbendingProg                COBOL Name: W02-ABENDING-PROG
     * - w02MainProg                    COBOL Name: W02-MAIN-PROG
     * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
     * - nbrMatchedPrev                 COBOL Name: WS-NBR-MATCHED-PREV
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - nbrEqual                       COBOL Name: WS-NBR-EQUAL
     * - holdSpiTblId                   COBOL Name: WS-HOLD-SPI-TBL-ID
     * - d51uKeyFeSpi                   COBOL Name: D51U-KEY-FE-SPI
     * - posTierFoundSw                 COBOL Name: WS-POS-TIER-FOUND-SW
     * - posSub                         COBOL Name: WS-POS-SUB
     * - hold1SpiTblId                  COBOL Name: WS-HOLD1-SPI-TBL-ID
     * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
     * - holdPosTierCd                  COBOL Name: WS-HOLD-POS-TIER-CD
     * - fesaPosTierCd                  COBOL Name: WS-FESA-POS-TIER-CD
     * - holdDiagElgInd                 COBOL Name: WS-HOLD-DIAG-ELG-IND
     * - fesaSpiDiagElgInd              COBOL Name: WS-FESA-SPI-DIAG-ELG-IND
     * - holdPs                         COBOL Name: WS-HOLD-PS
     * - fcndPs                         COBOL Name: WS-FCND-PS
     * - holdSvc                        COBOL Name: WS-HOLD-SVC
     * - fcndSvc                        COBOL Name: WS-FCND-SVC
     * - holdCauseCd                    COBOL Name: WS-HOLD-CAUSE-CD
     * - fcndCauseCd                    COBOL Name: WS-FCND-CAUSE-CD
     * - frtoPs                         COBOL Name: WS-FRTO-PS
     * - frtoSvc                        COBOL Name: WS-FRTO-SVC
     * - frtoCauseCd                    COBOL Name: WS-FRTO-CAUSE-CD
     * - ptypPs                         COBOL Name: WS-PTYP-PS
     * - ptypSvc                        COBOL Name: WS-PTYP-SVC
     * - ptypCauseCd                    COBOL Name: WS-PTYP-CAUSE-CD
     * - ricdPs                         COBOL Name: WS-RICD-PS
     * - ricdSvc                        COBOL Name: WS-RICD-SVC
     * - ricdCauseCd                    COBOL Name: WS-RICD-CAUSE-CD
     * - causPs                         COBOL Name: WS-CAUS-PS
     * - causSvc                        COBOL Name: WS-CAUS-SVC
     * - causCauseCd                    COBOL Name: WS-CAUS-CAUSE-CD
     * - ripaPs                         COBOL Name: WS-RIPA-PS
     * - ripaSvc                        COBOL Name: WS-RIPA-SVC
     * - ripaCauseCd                    COBOL Name: WS-RIPA-CAUSE-CD
     * - cflgPs                         COBOL Name: WS-CFLG-PS
     * - cflgSvc                        COBOL Name: WS-CFLG-SVC
     * - cflgCauseCd                    COBOL Name: WS-CFLG-CAUSE-CD
     *
     * @throws CFException
     */
    @Override
    public MatchingRtnOutCtx matchingRtn(MatchingRtnInCtx methodIn) throws Exception {
        // *
        // *
        // *45917S      if d51u-fcnd-from-cond-pos (1) not = spaces
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        MatchingRtnOutCtx methodOut = methodIn.getMatchingRtnOutCtx();
        // LITERAL_N = 'N'
        methodOut.setSameTable(CONSTANTS.LITERAL_N);
        // cobolCode::IF ( D51U-FCND-CNT = +0 AND D51U-RET-RULE-SW ( KEY-SUB ) (1 : 1) = '1' ) OR ( D51U-FRTO-CNT = +0 AND D51U-RET-RULE-SW ( KEY-SUB ) (2 : 1) = '1' ) OR ( D51U-PTYP-CNT = +0 AND D51U-RET-RULE-SW ( KEY-SUB ) (3 : 1) = '1' ) OR ( D51U-CAUS-CNT = +0 AND D51U-RET-RULE-SW ( KEY-SUB ) (4 : 1) = '1' ) OR ( D51U-ICD-CNT = +0 AND D51U-RET-RULE-SW ( KEY-SUB ) (7 : 1) = '1' ) OR ( D51U-CFLG-CNT = +0 AND D51U-RET-RULE-SW ( KEY-SUB ) (8 : 1) = '1' ) THEN
        // LITERAL_1 = '1'
        if (((methodIn.getD51uFcndCnt() == 0) && methodIn.getD51uRetRuleSw(methodIn.getKeySub() - 1)[0] == '1') || ((methodIn.getD51uFrtoCnt() == 0) && methodIn.getD51uRetRuleSw(methodIn.getKeySub() - 1)[1] == '1') || ((methodIn.getD51uPtypCnt() == 0) && methodIn.getD51uRetRuleSw(methodIn.getKeySub() - 1)[2] == '1') || ((methodIn.getD51uCausCnt() == 0) && methodIn.getD51uRetRuleSw(methodIn.getKeySub() - 1)[3] == '1') || ((methodIn.getD51uIcdCnt() == 0) && methodIn.getD51uRetRuleSw(methodIn.getKeySub() - 1)[6] == '1') || ((methodIn.getD51uCflgCnt() == 0) && methodIn.getD51uRetRuleSw(methodIn.getKeySub() - 1)[7] == '1')) {
            // cobolCode::GO TO 2100D-MATCH-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 2100D-MATCH-EXIT
        }
        // cobolCode::ELSE
        // cobolCode::IF D51U-FCND-CNT > +0 THEN
        if ((methodIn.getD51uFcndCnt() > 0)) {
            // cobolCode::IF D51U-RET-RULE-SW ( KEY-SUB ) (1 : 1) = '1' THEN
            // LITERAL_1 = '1'
            if (methodIn.getD51uRetRuleSw(methodIn.getKeySub() - 1)[0] == '1') {
                // cobolCode::SET SAME-TABLE TO TRUE
                methodOut.setSameTable1True();
            }
            // cobolCode::PERFORM 2110D-SEARCH-PS THRU 2110D-EXIT VARYING PS-SUB FROM 1 BY 1 UNTIL PS-SUB > D51U-FCND-CNT OR FROM-PS-FOUND OR SEARCH-COMPLETE OR PS-SUB > +99
            for (methodOut.setPsSub(1); (methodOut.getPsSub() <= methodIn.getD51uFcndCnt()) && !(methodIn.isFromPsFound1()) && !(methodIn.isSearchComplete1()) && (methodOut.getPsSub() <= 99); methodOut.setPsSub(methodOut.getPsSub() + 1)) {
                searchPs2110D(programCtx.getSearchPs2110DInCtx());
                /*2110D-SEARCH-PS SECTION*/
            }
            // *45917C        until ps-sub > 99 or search-complete
            // cobolCode::IF NOT FROM-PS-FOUND AND SAME-TABLE
            if (!(methodIn.isFromPsFound1()) && methodOut.isSameTable1()) {
                // cobolCode::NEXT SENTENCE
                return methodOut;
            }
        }
        // LITERAL_N = 'N'
        methodOut.setSearchComplete(CONSTANTS.LITERAL_N);
        // LITERAL_N = 'N'
        methodOut.setSameTable(CONSTANTS.LITERAL_N);
        // *45917S      if d51u-frto-clm-frm-svc-cd (1) not = spaces
        // cobolCode::IF D51U-FRTO-CNT > +0 THEN
        if ((methodIn.getD51uFrtoCnt() > 0)) {
            // cobolCode::IF D51U-RET-RULE-SW ( KEY-SUB ) (2 : 1) = '1' THEN
            // LITERAL_1 = '1'
            if (methodIn.getD51uRetRuleSw(methodIn.getKeySub() - 1)[1] == '1') {
                // cobolCode::SET SAME-TABLE TO TRUE
                methodOut.setSameTable1True();
            }
            // cobolCode::PERFORM 2120D-SEARCH-SVC THRU 2120D-EXIT VARYING SVC-SUB FROM 1 BY 1 UNTIL SVC-SUB > D51U-FRTO-CNT OR FROM-SVC-FOUND OR SEARCH-COMPLETE OR SVC-SUB > +9999
            for (methodOut.setSvcSub(1); (methodOut.getSvcSub() <= methodIn.getD51uFrtoCnt()) && !(methodIn.isFromSvcFound1()) && !(methodIn.isSearchComplete1()) && (methodOut.getSvcSub() <= 9999); methodOut.setSvcSub(methodOut.getSvcSub() + 1)) {
                searchSvc2120D(programCtx.getSearchSvc2120DInCtx());
                /*2120D-SEARCH-SVC SECTION*/
            }
            // *45917S        until svc-sub > 9999 or search-complete
            // cobolCode::IF NOT FROM-SVC-FOUND AND SAME-TABLE
            if (!(methodIn.isFromSvcFound1()) && methodOut.isSameTable1()) {
                // cobolCode::NEXT SENTENCE
                return methodOut;
            }
        }
        // LITERAL_N = 'N'
        methodOut.setSameTable(CONSTANTS.LITERAL_N);
        // LITERAL_N = 'N'
        methodOut.setSearchComplete(CONSTANTS.LITERAL_N);
        // *45917S      if d51u-ptyp-prov-typ(1) not = spaces
        // cobolCode::IF D51U-PTYP-CNT > +0 THEN
        if ((methodIn.getD51uPtypCnt() > 0)) {
            // cobolCode::IF D51U-RET-RULE-SW ( KEY-SUB ) (3 : 1) = '1' THEN
            // LITERAL_1 = '1'
            if (methodIn.getD51uRetRuleSw(methodIn.getKeySub() - 1)[2] == '1') {
                // cobolCode::SET SAME-TABLE TO TRUE
                methodOut.setSameTable1True();
            }
            // cobolCode::PERFORM 2130D-SEARCH-PRV THRU 2130D-EXIT VARYING PV-SUB FROM 1 BY 1 UNTIL PV-SUB > D51U-PTYP-CNT OR FROM-PRV-FOUND OR SEARCH-COMPLETE OR PV-SUB > +99
            for (methodOut.setPvSub(1); (methodOut.getPvSub() <= methodIn.getD51uPtypCnt()) && !(methodIn.isFromPrvFound1()) && !(methodIn.isSearchComplete1()) && (methodOut.getPvSub() <= 99); methodOut.setPvSub(methodOut.getPvSub() + 1)) {
                searchPrv2130D(programCtx.getSearchPrv2130DInCtx());
                /*2130D-SEARCH-PRV SECTION*/
            }
            // *45917C        until pv-sub > 99 or search-complete
            // cobolCode::IF NOT FROM-PRV-FOUND AND SAME-TABLE
            if (!(methodIn.isFromPrvFound1()) && methodOut.isSameTable1()) {
                // cobolCode::NEXT SENTENCE
                return methodOut;
            }
        }
        // *       Perform 2140d-search-icd9 thru
        // *               2140d-exit varying icd9-sub from 1 by 1
        // *               until icd9-sub > d51u-icd-cnt
        // *                  or from-icd9-found
        // *                  or search-complete
        // *                  or icd9-sub > +9999
        // *     end-perform
        // *
        // *      if not  from-icd9-found
        // *      and same-table
        // *           next sentence
        // *      end-if
        // *     end-if
        // *       Perform 2140d-search-icd9 thru
        // *               2140d-exit varying icd9-sub from 1 by 1
        // *               until icd9-sub > d51u-icd-cnt
        // *                  or from-icd9-found
        // *                  or search-complete
        // *                  or icd9-sub > +9999
        // *     end-perform
        // *
        // *      if not  from-icd9-found
        // *      and same-table
        // *           next sentence
        // *      end-if
        // *     end-if
        // LITERAL_N = 'N'
        methodOut.setSearchComplete(CONSTANTS.LITERAL_N);
        // LITERAL_N = 'N'
        methodOut.setSameTable(CONSTANTS.LITERAL_N);
        // *45917S      if d51u-caus-clm-cause-cd-1 (1) not = spaces
        // cobolCode::IF D51U-CAUS-CNT > +0 THEN
        if ((methodIn.getD51uCausCnt() > 0)) {
            // cobolCode::IF D51U-RET-RULE-SW ( KEY-SUB ) (4 : 1) = '1' THEN
            // LITERAL_1 = '1'
            if (methodIn.getD51uRetRuleSw(methodIn.getKeySub() - 1)[3] == '1') {
                // cobolCode::SET SAME-TABLE TO TRUE
                methodOut.setSameTable1True();
            }
            // cobolCode::PERFORM 2150D-SEARCH-CAUSE THRU 2150D-EXIT VARYING CAUSE-SUB FROM 1 BY 1 UNTIL CAUSE-SUB > D51U-CAUS-CNT OR FROM-CAUSE-FOUND OR SEARCH-COMPLETE OR CAUSE-SUB > +99
            for (methodOut.setCauseSub(1); (methodOut.getCauseSub() <= methodIn.getD51uCausCnt()) && !(methodIn.isFromCauseFound1()) && !(methodIn.isSearchComplete1()) && (methodOut.getCauseSub() <= 99); methodOut.setCauseSub(methodOut.getCauseSub() + 1)) {
                searchCause2150D(programCtx.getSearchCause2150DInCtx());
                /*2150D-SEARCH-CAUSE SECTION*/
            }
            // *45917C        until cause-sub > 99 or
            // *45917s              search-complete
            // cobolCode::IF NOT FROM-CAUSE-FOUND AND SAME-TABLE
            if (!(methodIn.isFromCauseFound1()) && methodOut.isSameTable1()) {
                // cobolCode::NEXT SENTENCE
                return methodOut;
            }
        }
        // LITERAL_N = 'N'
        methodOut.setSameTable(CONSTANTS.LITERAL_N);
        // LITERAL_N = 'N'
        methodOut.setSearchComplete(CONSTANTS.LITERAL_N);
        // *45917C      if d51u-ripa-clm-ipa-1-cd(1)  = zeroes
        // *d5201a      if d51u-ipa-cnt > +0
        // *d5201e      if d51u-ipa-cnt = 0
        // cobolCode::IF D51U-IPA-CNT = 0 OR D51U-RIPA-CLM-IPA-1-CD (1) = ZEROES
        // cobolCode::ELSE
        if ((methodIn.getD51uIpaCnt() != 0) && (methodIn.getD51uRipaClmIpa1Cd(0) != 0)) {
            // cobolCode::PERFORM 2160D-MATCH-IPA-TO-PPOALT THRU 2160D-EXIT VARYING I-SUB FROM 1 BY 1 UNTIL I-SUB > D51U-IPA-CNT OR IPA-CODE-FOUND OR IPA-AND-GTN-FOUND OR SEARCH-COMPLETE OR I-SUB > +99
            for (methodOut.setISub(1); (methodOut.getISub() <= methodIn.getD51uIpaCnt()) && !(methodIn.isIpaCodeFound1()) && !(methodIn.isIpaAndGtnFound1()) && !(methodIn.isSearchComplete1()) && (methodOut.getISub() <= 99); methodOut.setISub(methodOut.getISub() + 1)) {
                matchIpaToPpoalt2160D(programCtx.getMatchIpaToPpoalt2160DInCtx());
                /*2160D-MATCH-IPA-TO-PPOALT SECTION*/
            }
            // *45917C          until i-sub > 99 or
            // *45917s              search-complete
            // cobolCode::IF NOT IPA-CODE-FOUND AND SAME-TABLE AND NOT IPA-AND-GTN-FOUND
            if (!(methodIn.isIpaCodeFound1()) && methodOut.isSameTable1() && !(methodIn.isIpaAndGtnFound1())) {
                // cobolCode::NEXT SENTENCE
                return methodOut;
            }
        }
        // ****      Else
        // ****            move d51u-ripa-drv-pos(i-sub)  to ws-hold-ps
        // ****            add 1           to ws-nbr-matched
        // ****      Else
        // ****            move d51u-ripa-drv-pos(i-sub)  to ws-hold-ps
        // ****            add 1           to ws-nbr-matched
        // LITERAL_N = 'N'
        methodOut.setSearchComplete(CONSTANTS.LITERAL_N);
        // LITERAL_N = 'N'
        methodOut.setSameTable(CONSTANTS.LITERAL_N);
        // cobolCode::IF D51U-CFLG-CNT > +0 THEN
        if ((methodIn.getD51uCflgCnt() > 0)) {
            // cobolCode::IF D51U-RET-RULE-SW ( KEY-SUB ) (8 : 1) = '1' THEN
            // LITERAL_1 = '1'
            if (methodIn.getD51uRetRuleSw(methodIn.getKeySub() - 1)[7] == '1') {
                // cobolCode::SET SAME-TABLE TO TRUE
                methodOut.setSameTable1True();
            }
            // cobolCode::PERFORM 2170D-SEARCH-CFLG THRU 2170D-EXIT VARYING CFLG-SUB FROM 1 BY 1 UNTIL CFLG-SUB > D51U-CFLG-CNT OR CPE-FLG-FOUND OR SEARCH-COMPLETE OR CFLG-SUB > +99
            for (methodOut.setCflgSub(1); (methodOut.getCflgSub() <= methodIn.getD51uCflgCnt()) && !(methodIn.isCpeFlgFound1()) && !(methodIn.isSearchComplete1()) && (methodOut.getCflgSub() <= 99); methodOut.setCflgSub(methodOut.getCflgSub() + 1)) {
                searchCflg(programCtx.getSearchCflgInCtx());
                /*2170D-SEARCH-CFLG SECTION*/
            }
            // cobolCode::IF NOT CPE-FLG-FOUND AND SAME-TABLE
            if (!(methodIn.isCpeFlgFound1()) && methodOut.isSameTable1()) {
                // cobolCode::NEXT SENTENCE
                return methodOut;
            }
        }
        // *
        // *
        // LITERAL_N = 'N'
        methodOut.setSameTable(CONSTANTS.LITERAL_N);
        // LITERAL_N = 'N'
        methodOut.setSearchComplete(CONSTANTS.LITERAL_N);
        // *
        // *
        // cobolCode::IF D51U-ICD-CNT > +0 THEN
        if ((methodIn.getD51uIcdCnt() > 0)) {
            // cobolCode::IF D51U-ICD-CNT = +0 THEN
            if ((methodIn.getD51uIcdCnt() == 0)) {
                // LITERAL_Y = 'Y'
                methodOut.setSearchComplete(CONSTANTS.LITERAL_Y);
            }
            // cobolCode::IF D51U-RET-RULE-SW ( KEY-SUB ) (7 : 1) = '1' THEN
            // LITERAL_1 = '1'
            if (methodIn.getD51uRetRuleSw(methodIn.getKeySub() - 1)[6] == '1') {
                // cobolCode::SET SAME-TABLE TO TRUE
                methodOut.setSameTable1True();
            }
            // cobolCode::IF D51U-MORE-ICD-RECORDS = 'N'
            // LITERAL_N = 'N'
            if (compareChars(methodIn.getD51uMoreIcdRecords(), CONSTANTS.LITERAL_N) == 0) {
                // cobolCode::IF D51U-ICD-CNT > +0
                if ((methodIn.getD51uIcdCnt() > 0)) {
                    // cobolCode::PERFORM 2140D-SEARCH-ICD9 THRU 2140D-EXIT VARYING ICD9-SUB FROM 1 BY 1 UNTIL ICD9-SUB > D51U-ICD-CNT OR FROM-ICD9-FOUND OR SEARCH-COMPLETE OR ICD9-SUB > +9999
                    for (methodOut.setIcd9Sub(1); (methodOut.getIcd9Sub() <= methodIn.getD51uIcdCnt()) && !(methodIn.isFromIcd9Found1()) && !(methodIn.isSearchComplete1()) && (methodOut.getIcd9Sub() <= 9999); methodOut.setIcd9Sub(methodOut.getIcd9Sub() + 1)) {
                        searchIcd92140D(programCtx.getSearchIcd92140DInCtx());
                        /*2140D-SEARCH-ICD9 SECTION*/
                    }
                }
            } else // cobolCode::ELSE
            {
                // cobolCode::IF LK-51U-ICD-VER-NBR = '0'
                // LITERAL_0 = '0'
                if (compareChars(methodIn.getUIcdVerNbr51(), CONSTANTS.LITERAL_0) == 0) {
                    // LITERAL_0 = '0'
                    methodOut.setD51uLstClmIcdInd(CONSTANTS.LITERAL_0);
                } else // cobolCode::ELSE
                {
                    // LITERAL_9 = '9'
                    methodOut.setD51uLstClmIcdInd(CONSTANTS.LITERAL_9);
                }
                // *
                // cobolCode::SET FIRST-TIME-MORE-ICD TO TRUE
                methodOut.setFirstTimeMoreIcdTrue();
                methodOut.setDsmFuncCd(3);
                // cobolCode::MOVE WS-PREV-PS TO D51U-LST-CLM-ICD-POS
                methodOut.setD51uLstClmIcdPos(methodOut.getPrevPs());
                // cobolCode::MOVE WS-PREV-SVC TO D51U-LST-CLM-ICD-SVC
                methodOut.setD51uLstClmIcdSvc(methodOut.getPrevSvc());
                // cobolCode::MOVE WS-PREV-CAUSE-CD TO D51U-LST-CLM-ICD-CAU
                methodOut.setD51uLstClmIcdCau(methodOut.getPrevCauseCd());
                // cobolCode::CALL WS-D529351U-DB2-DSM USING DSM-CALL-AREA VYSPI51U-CALL-AREA
                programCtx.setRc(d529351u.call(programCtx.getGlobalCtx().getContext("D529351U"), methodOut.getDsmCallArea(), methodOut.getVyspi51uCallArea()));
                // cobolCode::EVALUATE TRUE
                if (methodIn.isD51uGoodReturn()) {
                    // cobolCode::IF D51U-MORE-ICD-CNT > +0
                    if ((methodIn.getD51uMoreIcdCnt() > 0)) {
                        // cobolCode::PERFORM 2140D-SEARCH-ICD9 THRU 2140D-EXIT VARYING ICD9-SUB FROM 1 BY 1 UNTIL ICD9-SUB > D51U-MORE-ICD-CNT OR FROM-ICD9-FOUND OR SEARCH-COMPLETE OR ICD9-SUB > +9999
                        for (methodOut.setIcd9Sub(1); (methodOut.getIcd9Sub() <= methodIn.getD51uMoreIcdCnt()) && !(methodIn.isFromIcd9Found1()) && !(methodIn.isSearchComplete1()) && (methodOut.getIcd9Sub() <= 9999); methodOut.setIcd9Sub(methodOut.getIcd9Sub() + 1)) {
                            searchIcd92140D(programCtx.getSearchIcd92140DInCtx());
                            /*2140D-SEARCH-ICD9 SECTION*/
                        }
                    }
                } else if (methodIn.isD51uNotFound()) {
                    ;
                } else if (methodIn.isD51uDb2Error()) {
                    // cobolCode::MOVE D51U-INV-REASON TO W02-DSPL-ERR-IND
                    methodOut.setW02DsplErrInd(String.valueOf(methodOut.getD51uInvReasonString()).toCharArray());
                    // cobolCode::MOVE D51U-SQL-OR-RESP-CD TO W02-RESP-CD
                    methodOut.setW02RespCd(CFUtil.getLong(methodOut.getD51uSqlOrRespCd()));
                    // cobolCode::MOVE 'D529351U' TO W02-ABENDING-PROG
                    // LITERAL_D529351U = 'D529351U'
                    methodOut.setW02AbendingProg(CONSTANTS.LITERAL_D529351U);
                    // cobolCode::MOVE 'ICD' TO W02-MAIN-PROG
                    // LITERAL_ICD = 'ICD'
                    methodOut.setW02MainProg(CONSTANTS.LITERAL_ICD);
                    // cobolCode::PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
                    writeToSysm(programCtx.getWriteToSysmInCtx());
                    /*11100A-WRITE-TO-SYSM SECTION*/
                    // cobolCode::SET M51U-ILLOGICAL-COND TO TRUE
                    methodOut.setM51uIllogicalCondTrue();
                    // cobolCode::PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
                    dumpAbend(programCtx);
                    /*8000-DUMP-ABEND SECTION*/
                }
                // *
                // cobolCode::IF D51U-MORE-ICD-CNT = +9999
                if ((methodIn.getD51uMoreIcdCnt() == 9999)) {
                    // cobolCode::PERFORM UNTIL D51U-MORE-ICD-CNT = +0 OR D51U-MORE-ICD-CNT < +9999
                    while (((methodIn.getD51uMoreIcdCnt() != 0) && (methodIn.getD51uMoreIcdCnt() >= 9999))) {
                        // cobolCode::SET NOT-FIRST-TIME-MORE-ICD TO TRUE
                        methodOut.setNotFirstTimeMoreIcdTrue();
                        methodOut.setDsmFuncCd(3);
                        // cobolCode::CALL WS-D529351U-DB2-DSM USING DSM-CALL-AREA VYSPI51U-CALL-AREA
                        programCtx.setRc(d529351u.call(programCtx.getGlobalCtx().getContext("D529351U"), methodOut.getDsmCallArea(), methodOut.getVyspi51uCallArea()));
                        // cobolCode::EVALUATE TRUE
                        if (methodIn.isD51uGoodReturn()) {
                            // cobolCode::IF D51U-MORE-ICD-CNT > +0
                            if ((methodIn.getD51uMoreIcdCnt() > 0)) {
                                // cobolCode::PERFORM 2140D-SEARCH-ICD9 THRU 2140D-EXIT VARYING ICD9-SUB FROM 1 BY 1 UNTIL ICD9-SUB > D51U-MORE-ICD-CNT OR FROM-ICD9-FOUND OR SEARCH-COMPLETE OR ICD9-SUB > +9999
                                for (methodOut.setIcd9Sub(1); (methodOut.getIcd9Sub() <= methodIn.getD51uMoreIcdCnt()) && !(methodIn.isFromIcd9Found1()) && !(methodIn.isSearchComplete1()) && (methodOut.getIcd9Sub() <= 9999); methodOut.setIcd9Sub(methodOut.getIcd9Sub() + 1)) {
                                    searchIcd92140D(programCtx.getSearchIcd92140DInCtx());
                                    /*2140D-SEARCH-ICD9 SECTION*/
                                }
                            }
                        } else if (methodIn.isD51uNotFound()) {
                            ;
                        } else if (methodIn.isD51uDb2Error()) {
                            // cobolCode::MOVE D51U-INV-REASON TO W02-DSPL-ERR-IND
                            methodOut.setW02DsplErrInd(String.valueOf(methodOut.getD51uInvReasonString()).toCharArray());
                            // cobolCode::MOVE D51U-SQL-OR-RESP-CD TO W02-RESP-CD
                            methodOut.setW02RespCd(CFUtil.getLong(methodOut.getD51uSqlOrRespCd()));
                            // cobolCode::MOVE 'D529351U' TO W02-ABENDING-PROG
                            // LITERAL_D529351U = 'D529351U'
                            methodOut.setW02AbendingProg(CONSTANTS.LITERAL_D529351U);
                            // cobolCode::MOVE 'ICD' TO W02-MAIN-PROG
                            // LITERAL_ICD = 'ICD'
                            methodOut.setW02MainProg(CONSTANTS.LITERAL_ICD);
                            // cobolCode::PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
                            writeToSysm(programCtx.getWriteToSysmInCtx());
                            /*11100A-WRITE-TO-SYSM SECTION*/
                            // cobolCode::SET M51U-ILLOGICAL-COND TO TRUE
                            methodOut.setM51uIllogicalCondTrue();
                            // cobolCode::PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
                            dumpAbend(programCtx);
                            /*8000-DUMP-ABEND SECTION*/
                        }
                    }
                }
            }
            // *
            // *
            // cobolCode::IF NOT FROM-ICD9-FOUND AND SAME-TABLE
            if (!(methodIn.isFromIcd9Found1()) && methodOut.isSameTable1()) {
                // cobolCode::NEXT SENTENCE
                return methodOut;
            }
        }
        // *
        // *** If more than one spi matches, apply the spi which matched
        // *** to the most "from fields".  if the number is equal, then
        // *** non-select the claim with '48' - mult spi matches.
        // *
        // *** If more than one spi matches, apply the spi which matched
        // *** to the most "from fields".  if the number is equal, then
        // *** non-select the claim with '48' - mult spi matches.
        // LITERAL_N = 'N'
        methodOut.setSearchComplete(CONSTANTS.LITERAL_N);
        // cobolCode::IF WS-NBR-MATCHED > WS-NBR-MATCHED-PREV
        if ((methodOut.getNbrMatched() > methodOut.getNbrMatchedPrev())) {
            // cobolCode::MOVE WS-NBR-MATCHED TO WS-NBR-MATCHED-PREV
            methodOut.setNbrMatchedPrev(methodOut.getNbrMatched());
            // LITERAL_N = 'N'
            methodOut.setNbrEqual(CONSTANTS.LITERAL_N);
            // cobolCode::MOVE D51U-KEY-FE-SPI TO WS-HOLD-SPI-TBL-ID
            methodOut.setHoldSpiTblId(methodOut.getD51uKeyFeSpi());
            // LITERAL_N = 'N'
            methodOut.setPosTierFoundSw(CONSTANTS.LITERAL_N);
            // cobolCode::PERFORM VARYING WS-POS-SUB FROM 1 BY 1 UNTIL WS-POS-SUB > D51U-PLNV-CNT OR +99 OR HOLD-POS-FOUND
            for (methodOut.setPosSub(1); ((methodOut.getPosSub() <= methodIn.getD51uPlnvCnt()) && (methodOut.getPosSub() <= 99) && !(methodOut.isHoldPosFound())); methodOut.setPosSub(methodOut.getPosSub() + 1)) {
                // cobolCode::MOVE WS-FESA-SPI-NBR ( WS-POS-SUB ) TO WS-HOLD1-SPI-TBL-ID
                methodOut.setHold1SpiTblId(String.valueOf(CFUtil.pad(7, String.valueOf(methodOut.getFesaSpiNbr01(methodOut.getPosSub() - 1)), "0", CFUtil.LEFT_PAD)).toCharArray());
                // cobolCode::IF WS-HOLD1-SPI-TBL-ID = WS-HOLD-SPI-TBL-ID
                if (compareChars(methodOut.getHold1SpiTblId(), methodOut.getHoldSpiTblId()) == 0) {
                    // cobolCode::MOVE WS-FESA-POS-TIER-CD ( WS-POS-SUB ) TO WS-HOLD-POS-TIER-CD
                    methodOut.setHoldPosTierCd(methodOut.getFesaPosTierCd(methodOut.getPosSub() - 1));
                    // cobolCode::MOVE WS-FESA-SPI-DIAG-ELG-IND ( WS-POS-SUB ) TO WS-HOLD-DIAG-ELG-IND
                    methodOut.setHoldDiagElgInd(methodOut.getFesaSpiDiagElgInd(methodOut.getPosSub() - 1));
                    // cobolCode::SET HOLD-POS-FOUND TO TRUE
                    methodOut.setHoldPosFoundTrue();
                }
            }
            // cobolCode::IF FROM-PS-FOUND
            if (methodIn.isFromPsFound1()) {
                // cobolCode::MOVE WS-FCND-PS TO WS-HOLD-PS
                methodOut.setHoldPs(methodOut.getFcndPs());
                // cobolCode::MOVE WS-FCND-SVC TO WS-HOLD-SVC
                methodOut.setHoldSvc(methodOut.getFcndSvc());
                // cobolCode::MOVE WS-FCND-CAUSE-CD TO WS-HOLD-CAUSE-CD
                methodOut.setHoldCauseCd(methodOut.getFcndCauseCd());
            }
            // cobolCode::IF FROM-SVC-FOUND
            if (methodIn.isFromSvcFound1()) {
                // cobolCode::MOVE WS-FRTO-PS TO WS-HOLD-PS
                methodOut.setHoldPs(methodOut.getFrtoPs());
                // cobolCode::MOVE WS-FRTO-SVC TO WS-HOLD-SVC
                methodOut.setHoldSvc(methodOut.getFrtoSvc());
                // cobolCode::MOVE WS-FRTO-CAUSE-CD TO WS-HOLD-CAUSE-CD
                methodOut.setHoldCauseCd(methodOut.getFrtoCauseCd());
            }
            // cobolCode::IF FROM-PRV-FOUND
            if (methodIn.isFromPrvFound1()) {
                // cobolCode::MOVE WS-PTYP-PS TO WS-HOLD-PS
                methodOut.setHoldPs(methodOut.getPtypPs());
                // cobolCode::MOVE WS-PTYP-SVC TO WS-HOLD-SVC
                methodOut.setHoldSvc(methodOut.getPtypSvc());
                // cobolCode::MOVE WS-PTYP-CAUSE-CD TO WS-HOLD-CAUSE-CD
                methodOut.setHoldCauseCd(methodOut.getPtypCauseCd());
            }
            // cobolCode::IF FROM-ICD9-FOUND
            if (methodIn.isFromIcd9Found1()) {
                // cobolCode::MOVE WS-RICD-PS TO WS-HOLD-PS
                methodOut.setHoldPs(methodOut.getRicdPs());
                // cobolCode::MOVE WS-RICD-SVC TO WS-HOLD-SVC
                methodOut.setHoldSvc(methodOut.getRicdSvc());
                // cobolCode::MOVE WS-RICD-CAUSE-CD TO WS-HOLD-CAUSE-CD
                methodOut.setHoldCauseCd(methodOut.getRicdCauseCd());
            }
            // cobolCode::IF FROM-CAUSE-FOUND
            if (methodIn.isFromCauseFound1()) {
                // cobolCode::MOVE WS-CAUS-PS TO WS-HOLD-PS
                methodOut.setHoldPs(methodOut.getCausPs());
                // cobolCode::MOVE WS-CAUS-SVC TO WS-HOLD-SVC
                methodOut.setHoldSvc(methodOut.getCausSvc());
                // cobolCode::MOVE WS-CAUS-CAUSE-CD TO WS-HOLD-CAUSE-CD
                methodOut.setHoldCauseCd(methodOut.getCausCauseCd());
            }
            // *          If ipa-code-found
            // cobolCode::IF IPA-CODE-FOUND OR IPA-AND-GTN-FOUND
            if (methodIn.isIpaCodeFound1() || methodIn.isIpaAndGtnFound1()) {
                // cobolCode::MOVE WS-RIPA-PS TO WS-HOLD-PS
                methodOut.setHoldPs(methodOut.getRipaPs());
                // cobolCode::MOVE WS-RIPA-SVC TO WS-HOLD-SVC
                methodOut.setHoldSvc(methodOut.getRipaSvc());
                // cobolCode::MOVE WS-RIPA-CAUSE-CD TO WS-HOLD-CAUSE-CD
                methodOut.setHoldCauseCd(methodOut.getRipaCauseCd());
            }
            // cobolCode::IF CPE-FLG-FOUND
            if (methodIn.isCpeFlgFound1()) {
                // cobolCode::MOVE WS-CFLG-PS TO WS-HOLD-PS
                methodOut.setHoldPs(methodOut.getCflgPs());
                // cobolCode::MOVE WS-CFLG-SVC TO WS-HOLD-SVC
                methodOut.setHoldSvc(methodOut.getCflgSvc());
                // cobolCode::MOVE WS-CFLG-CAUSE-CD TO WS-HOLD-CAUSE-CD
                methodOut.setHoldCauseCd(methodOut.getCflgCauseCd());
            }
            // cobolCode::MOVE ZEROS TO WS-NBR-MATCHED
            methodOut.setNbrMatched(0);
        } else // cobolCode::ELSE
        {
            // cobolCode::IF WS-NBR-MATCHED = WS-NBR-MATCHED-PREV AND WS-NBR-MATCHED NOT = ZEROS
            if ((methodOut.getNbrMatched() == methodOut.getNbrMatchedPrev()) && (methodOut.getNbrMatched() != 0)) {
                // LITERAL_Y = 'Y'
                methodOut.setNbrEqual(CONSTANTS.LITERAL_Y);
                // cobolCode::MOVE SPACES TO WS-HOLD-PS
                methodOut.setHoldPs(CONSTANTS.SPACE_2);
                // cobolCode::MOVE SPACES TO WS-HOLD-SVC
                methodOut.setHoldSvc(CONSTANTS.SPACE_6);
                // cobolCode::MOVE SPACES TO WS-HOLD-CAUSE-CD
                methodOut.setHoldCauseCd(CONSTANTS.SPACE);
                // cobolCode::MOVE SPACES TO WS-HOLD-SPI-TBL-ID WS-HOLD-POS-TIER-CD WS-HOLD-DIAG-ELG-IND WS-FCND-PS WS-FCND-SVC WS-FCND-CAUSE-CD WS-FRTO-PS WS-FRTO-SVC WS-FRTO-CAUSE-CD WS-PTYP-PS WS-PTYP-SVC WS-PTYP-CAUSE-CD WS-RICD-PS WS-RICD-SVC WS-RICD-CAUSE-CD WS-CAUS-PS WS-CAUS-SVC WS-CAUS-CAUSE-CD WS-RIPA-PS WS-RIPA-SVC WS-RIPA-CAUSE-CD WS-CFLG-PS WS-CFLG-SVC WS-CFLG-CAUSE-CD
                methodOut.setHoldSpiTblId(CONSTANTS.SPACE_7);
                methodOut.setHoldPosTierCd(CONSTANTS.SPACE);
                methodOut.setHoldDiagElgInd(CONSTANTS.SPACE);
                methodOut.setFcndPs(CONSTANTS.SPACE_2);
                methodOut.setFcndSvc(CONSTANTS.SPACE_6);
                methodOut.setFcndCauseCd(CONSTANTS.SPACE);
                methodOut.setFrtoPs(CONSTANTS.SPACE_2);
                methodOut.setFrtoSvc(CONSTANTS.SPACE_6);
                methodOut.setFrtoCauseCd(CONSTANTS.SPACE);
                methodOut.setPtypPs(CONSTANTS.SPACE_2);
                methodOut.setPtypSvc(CONSTANTS.SPACE_6);
                methodOut.setPtypCauseCd(CONSTANTS.SPACE);
                methodOut.setRicdPs(CONSTANTS.SPACE_2);
                methodOut.setRicdSvc(CONSTANTS.SPACE_6);
                methodOut.setRicdCauseCd(CONSTANTS.SPACE);
                methodOut.setCausPs(CONSTANTS.SPACE_2);
                methodOut.setCausSvc(CONSTANTS.SPACE_6);
                methodOut.setCausCauseCd(CONSTANTS.SPACE);
                methodOut.setRipaPs(CONSTANTS.SPACE_2);
                methodOut.setRipaSvc(CONSTANTS.SPACE_6);
                methodOut.setRipaCauseCd(CONSTANTS.SPACE);
                methodOut.setCflgPs(CONSTANTS.SPACE_2);
                methodOut.setCflgSvc(CONSTANTS.SPACE_6);
                methodOut.setCflgCauseCd(CONSTANTS.SPACE);
                // cobolCode::MOVE ZEROS TO WS-NBR-MATCHED
                methodOut.setNbrMatched(0);
            }
        }
        return methodOut;
    }

    /**
     * searchPs2110D
     *   This method is derived from
     *   COBOL Paragraph - 2110D-SEARCH-PS SECTION COBOL Cyclomatic complexity - 6
     * Input  :
     *
     * - d51uFcndDrvPos                 COBOL Name: D51U-FCND-DRV-POS
     * - prevPs                         COBOL Name: WS-PREV-PS
     * - d51uFcndDrvSvc                 COBOL Name: D51U-FCND-DRV-SVC
     * - prevSvc                        COBOL Name: WS-PREV-SVC
     * - d51uFcndDrvCau                 COBOL Name: D51U-FCND-DRV-CAU
     * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
     * - psSub                          COBOL Name: PS-SUB
     * - d51uFcndFromCondPos            COBOL Name: D51U-FCND-FROM-COND-POS
     * - uLinePos51                     COBOL Name: LK-51U-LINE-POS
     * - sub01                          COBOL Name: LK-SUB
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - sameTable                      COBOL Name: WS-SAME-TABLE
     * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - fromPsFound                    COBOL Name: WS-FROM-PS-FOUND
     * - fcndPs                         COBOL Name: WS-FCND-PS
     * - d51uFcndDrvPos                 COBOL Name: D51U-FCND-DRV-POS
     * - fcndSvc                        COBOL Name: WS-FCND-SVC
     * - d51uFcndDrvSvc                 COBOL Name: D51U-FCND-DRV-SVC
     * - fcndCauseCd                    COBOL Name: WS-FCND-CAUSE-CD
     * - d51uFcndDrvCau                 COBOL Name: D51U-FCND-DRV-CAU
     *
     * @throws CFException
     */
    @Override
    public SearchPs2110DOutCtx searchPs2110D(SearchPs2110DInCtx methodIn) throws Exception {
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        SearchPs2110DOutCtx methodOut = methodIn.getSearchPs2110DOutCtx();
        // cobolCode::MOVE '2110D' TO WS-PARAGRAPH
        // LITERAL_2110D = '2110D'
        methodOut.setParagraph(CONSTANTS.LITERAL_2110D);
        // cobolCode::IF D51U-FCND-DRV-POS ( PS-SUB ) = WS-PREV-PS AND D51U-FCND-DRV-SVC ( PS-SUB ) = WS-PREV-SVC AND D51U-FCND-DRV-CAU ( PS-SUB ) = WS-PREV-CAUSE-CD
        if (compareChars(methodOut.getD51uFcndDrvPos(methodIn.getPsSub() - 1), methodIn.getPrevPs()) == 0 && compareChars(methodOut.getD51uFcndDrvSvc(methodIn.getPsSub() - 1), methodIn.getPrevSvc()) == 0 && compareChars(methodOut.getD51uFcndDrvCau(methodIn.getPsSub() - 1), methodIn.getPrevCauseCd()) == 0) {
            // cobolCode::SET SAME-TABLE TO TRUE
            methodOut.setSameTable1True();
            // cobolCode::IF D51U-FCND-FROM-COND-POS ( PS-SUB ) EQUAL SPACES
            if ((allSpaces(methodIn.getD51uFcndFromCondPos(methodIn.getPsSub() - 1)))) {
                // LITERAL_Y = 'Y'
                methodOut.setSearchComplete(CONSTANTS.LITERAL_Y);
            } else // cobolCode::ELSE
            {
                // cobolCode::IF LK-51U-LINE-POS ( LK-SUB ) = D51U-FCND-FROM-COND-POS ( PS-SUB )
                if (compareChars(methodIn.getULinePos51(methodIn.getSub01() - 1), methodIn.getD51uFcndFromCondPos(methodIn.getPsSub() - 1)) == 0) {
                    // cobolCode::ADD 1 TO WS-NBR-MATCHED
                    methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
                    // LITERAL_Y = 'Y'
                    methodOut.setFromPsFound(CONSTANTS.LITERAL_Y);
                    // cobolCode::MOVE D51U-FCND-DRV-POS ( PS-SUB ) TO WS-FCND-PS
                    methodOut.setFcndPs(methodOut.getD51uFcndDrvPos(methodIn.getPsSub() - 1));
                    // cobolCode::MOVE D51U-FCND-DRV-SVC ( PS-SUB ) TO WS-FCND-SVC
                    methodOut.setFcndSvc(methodOut.getD51uFcndDrvSvc(methodIn.getPsSub() - 1));
                    // cobolCode::MOVE D51U-FCND-DRV-CAU ( PS-SUB ) TO WS-FCND-CAUSE-CD
                    methodOut.setFcndCauseCd(methodOut.getD51uFcndDrvCau(methodIn.getPsSub() - 1));
                }
            }
        }
        return methodOut;
    }

    /**
     * searchSvc2120D
     *   This method is derived from
     *   COBOL Paragraph - 2120D-SEARCH-SVC SECTION COBOL Cyclomatic complexity - 7
     * Input  :
     *
     * - d51uFrtoDrvPos                 COBOL Name: D51U-FRTO-DRV-POS
     * - prevPs                         COBOL Name: WS-PREV-PS
     * - d51uFrtoDrvSvc                 COBOL Name: D51U-FRTO-DRV-SVC
     * - prevSvc                        COBOL Name: WS-PREV-SVC
     * - d51uFrtoDrvCau                 COBOL Name: D51U-FRTO-DRV-CAU
     * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
     * - svcSub                         COBOL Name: SVC-SUB
     * - d51uFrtoClmFrmSvcCd            COBOL Name: D51U-FRTO-CLM-FRM-SVC-CD
     * - d51uFrtoClmToSvcCd             COBOL Name: D51U-FRTO-CLM-TO-SVC-CD
     * - fromSvcFound                   COBOL Name: WS-FROM-SVC-FOUND
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - sameTable                      COBOL Name: WS-SAME-TABLE
     * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
     * - d51uFrtoClmToSvcCd             COBOL Name: D51U-FRTO-CLM-TO-SVC-CD
     * - d51uFrtoClmFrmSvcCd            COBOL Name: D51U-FRTO-CLM-FRM-SVC-CD
     * - frtoPs                         COBOL Name: WS-FRTO-PS
     * - d51uFrtoDrvPos                 COBOL Name: D51U-FRTO-DRV-POS
     * - frtoSvc                        COBOL Name: WS-FRTO-SVC
     * - d51uFrtoDrvSvc                 COBOL Name: D51U-FRTO-DRV-SVC
     * - frtoCauseCd                    COBOL Name: WS-FRTO-CAUSE-CD
     * - d51uFrtoDrvCau                 COBOL Name: D51U-FRTO-DRV-CAU
     *
     * @throws CFException
     */
    @Override
    public SearchSvc2120DOutCtx searchSvc2120D(SearchSvc2120DInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2120D-search-svc                                             *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 this section checks for a match on the service codes         *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2120d-search-svc                                             *
        // *82                                                              *
        // *82 1. if the service variable in the record is empty, then set  *
        // *82    a switch to indicate that the search is complete.         *
        // *82 2. perform a check on the service code matches.              *
        // *82 3. when service codes match is found, a flag is set and a    *
        // *82    counter is accumulated to indicate number of matches.     *
        // *82    match should be within to and from spi svc, if both are   *
        // *82    present                                                   *
        // *82***************************************************************
        // *-------------------*
        // *Qc9901     if   d51u-frto-drv-pos(svc-sub)  =  spaces
        // *qc9901     and  d51u-frto-drv-svc(svc-sub)  =  spaces
        // *45917c     and  d51u-frto-drv-cau(svc-sub)  =  spaces
        // *45917s         move 'y' to ws-search-complete
        // *45917s         go to 2120d-exit
        // *qc9901     end-if.
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        SearchSvc2120DOutCtx methodOut = methodIn.getSearchSvc2120DOutCtx();
        // cobolCode::MOVE '2120D' TO WS-PARAGRAPH
        // LITERAL_2120D = '2120D'
        methodOut.setParagraph(CONSTANTS.LITERAL_2120D);
        // cobolCode::IF D51U-FRTO-DRV-POS ( SVC-SUB ) = WS-PREV-PS AND D51U-FRTO-DRV-SVC ( SVC-SUB ) = WS-PREV-SVC AND D51U-FRTO-DRV-CAU ( SVC-SUB ) = WS-PREV-CAUSE-CD
        if (compareChars(methodOut.getD51uFrtoDrvPos(methodIn.getSvcSub() - 1), methodIn.getPrevPs()) == 0 && compareChars(methodOut.getD51uFrtoDrvSvc(methodIn.getSvcSub() - 1), methodIn.getPrevSvc()) == 0 && compareChars(methodOut.getD51uFrtoDrvCau(methodIn.getSvcSub() - 1), methodIn.getPrevCauseCd()) == 0) {
            // cobolCode::SET SAME-TABLE TO TRUE
            methodOut.setSameTable1True();
            // cobolCode::IF D51U-FRTO-CLM-FRM-SVC-CD ( SVC-SUB ) EQUAL SPACES
            if ((allSpaces(methodOut.getD51uFrtoClmFrmSvcCd(methodIn.getSvcSub() - 1)))) {
                // LITERAL_Y = 'Y'
                methodOut.setSearchComplete(CONSTANTS.LITERAL_Y);
                // cobolCode::GO TO 2120D-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 2120D-EXIT
            } else // cobolCode::ELSE
            {
                // cobolCode::IF D51U-FRTO-CLM-TO-SVC-CD ( SVC-SUB ) EQUAL SPACES
                if ((allSpaces(methodOut.getD51uFrtoClmToSvcCd(methodIn.getSvcSub() - 1)))) {
                    // cobolCode::MOVE D51U-FRTO-CLM-FRM-SVC-CD ( SVC-SUB ) TO D51U-FRTO-CLM-TO-SVC-CD ( SVC-SUB )
                    methodOut.setD51uFrtoClmToSvcCd(methodIn.getSvcSub() - 1, methodOut.getD51uFrtoClmFrmSvcCd(methodIn.getSvcSub() - 1));
                }
                // cobolCode::PERFORM 2125D-TOPS-CNVSVC-FR-TO THRU 2125D-EXIT
                topsCnvsvcFrTo2125D(programCtx.getTopsCnvsvcFrTo2125DInCtx());
                /*2125D-TOPS-CNVSVC-FR-TO SECTION*/
                // cobolCode::IF FROM-SVC-FOUND
                if (methodIn.isFromSvcFound1()) {
                    // cobolCode::MOVE D51U-FRTO-DRV-POS ( SVC-SUB ) TO WS-FRTO-PS
                    methodOut.setFrtoPs(methodOut.getD51uFrtoDrvPos(methodIn.getSvcSub() - 1));
                    // cobolCode::MOVE D51U-FRTO-DRV-SVC ( SVC-SUB ) TO WS-FRTO-SVC
                    methodOut.setFrtoSvc(methodOut.getD51uFrtoDrvSvc(methodIn.getSvcSub() - 1));
                    // cobolCode::MOVE D51U-FRTO-DRV-CAU ( SVC-SUB ) TO WS-FRTO-CAUSE-CD
                    methodOut.setFrtoCauseCd(methodOut.getD51uFrtoDrvCau(methodIn.getSvcSub() - 1));
                }
            }
        }
        return methodOut;
    }

    /**
     * topsCnvsvcFrTo2125D
     *   This method is derived from
     *   COBOL Paragraph - 2125D-TOPS-CNVSVC-FR-TO SECTION COBOL Cyclomatic complexity - 55
     * Input  :
     *
     * - d51uFrtoClmToSvcCd             COBOL Name: D51U-FRTO-CLM-TO-SVC-CD
     * - d51uFrtoClmFrmSvcCd            COBOL Name: D51U-FRTO-CLM-FRM-SVC-CD
     * - d51uFrtoSvcTypCd               COBOL Name: D51U-FRTO-SVC-TYP-CD
     * - svcSub                         COBOL Name: SVC-SUB
     * - medSvc                         COBOL Name: MED-SVC
     * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
     * - uMedicalClaim51                COBOL Name: LK-51U-MEDICAL-CLAIM
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - svc1af                         COBOL Name: SVC-1AF
     * - svc25af                        COBOL Name: SVC-2-5AF
     * - feSvc1afFr                     COBOL Name: FE-SVC-1AF-FR
     * - feSvc25afFr                    COBOL Name: FE-SVC-2-5AF-FR
     * - feSvc1afTo                     COBOL Name: FE-SVC-1AF-TO
     * - feSvc25afTo                    COBOL Name: FE-SVC-2-5AF-TO
     * - svc14al                        COBOL Name: SVC-1-4AL
     * - svc5al                         COBOL Name: SVC-5AL
     * - feSvc14alFr                    COBOL Name: FE-SVC-1-4AL-FR
     * - feSvc5alFr                     COBOL Name: FE-SVC-5AL-FR
     * - feSvc14alTo                    COBOL Name: FE-SVC-1-4AL-TO
     * - feSvc5alTo                     COBOL Name: FE-SVC-5AL-TO
     *
     * Output :
     *
     * - feServTo                       COBOL Name: FE-SERV-TO
     * - d51uFrtoClmToSvcCd             COBOL Name: D51U-FRTO-CLM-TO-SVC-CD
     * - feServFr                       COBOL Name: FE-SERV-FR
     * - d51uFrtoClmFrmSvcCd            COBOL Name: D51U-FRTO-CLM-FRM-SVC-CD
     * - servTop                        COBOL Name: WS-SERV-TOP
     * - medSvc                         COBOL Name: MED-SVC
     * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
     * - svc15                          COBOL Name: SVC-1-5
     * - svc6                           COBOL Name: SVC-6
     * - feSvc15Fr                      COBOL Name: FE-SVC-1-5-FR
     * - fromSvcFound                   COBOL Name: WS-FROM-SVC-FOUND
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - feSvc15To                      COBOL Name: FE-SVC-1-5-TO
     * - feSvc6Fr                       COBOL Name: FE-SVC-6-FR
     *
     * @throws CFException
     */
    @Override
    public TopsCnvsvcFrTo2125DOutCtx topsCnvsvcFrTo2125D(TopsCnvsvcFrTo2125DInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2125D-tops-cnvsvc-fr-to                                      *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 checks for matches on tops service codes.                    *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2125d-tops-cnvsvc-fr-to                                      *
        // *82                                                              *
        // *82 1. populate the tops service codes with the appropriate value*
        // *82 2. perform a check on the service codes.                     *
        // *82            1. check for a match on the first five digits.    *
        // *82            2. check for a match on the first six digits.     *
        // *82            3. check for a match on the first three digits.   *
        // *82 3. for every match, increment the match counter.             *
        // *82***************************************************************
        // *-----------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        TopsCnvsvcFrTo2125DOutCtx methodOut = methodIn.getTopsCnvsvcFrTo2125DOutCtx();
        // cobolCode::MOVE D51U-FRTO-CLM-TO-SVC-CD ( SVC-SUB ) TO FE-SERV-TO
        methodOut.setFeServTo(methodOut.getD51uFrtoClmToSvcCd(methodIn.getSvcSub() - 1));
        // cobolCode::MOVE D51U-FRTO-CLM-FRM-SVC-CD ( SVC-SUB ) TO FE-SERV-FR
        methodOut.setFeServFr(methodOut.getD51uFrtoClmFrmSvcCd(methodIn.getSvcSub() - 1));
        // cobolCode::IF D51U-FRTO-SVC-TYP-CD ( SVC-SUB ) = 'T'
        if (methodIn.getD51uFrtoSvcTypCd(methodIn.getSvcSub() - 1)[0] == 'T') {
            // cobolCode::MOVE MED-SVC TO WS-SERV-TOP
            methodOut.setServTop(methodOut.getMedSvc());
        } else // cobolCode::ELSE
        {
            // cobolCode::MOVE LK-51U-LINE-SERVICE-CODE ( LK-SUB ) TO WS-SERV-TOP
            methodOut.setServTop(methodOut.getULineServiceCode51(methodIn.getSub01() - 1));
        }
        // cobolCode::IF ( SVC-1-5 (1 : 1) = 'C' ) AND LK-51U-MEDICAL-CLAIM NOT = 'Y'
        // LITERAL_Y = 'Y'
        if ((methodOut.getSvc15()[0] == 'C') && methodIn.getUMedicalClaim51()[0] != 'Y') {
            // cobolCode::IF D51U-FRTO-SVC-TYP-CD ( SVC-SUB ) = 'S' AND SVC-6 NOT = SPACES
            if (methodIn.getD51uFrtoSvcTypCd(methodIn.getSvcSub() - 1)[0] == 'S' && (!allSpaces(methodOut.getSvc6()))) {
                // cobolCode::IF ( SVC-1-5 (1 : 3) = FE-SVC-1-5-FR (1 : 3))
                if ((compareChars(substring(methodOut.getSvc15(), 0, 3), substring(methodOut.getFeSvc15Fr(), 0, 3)) == 0)) {
                    // LITERAL_Y = 'Y'
                    methodOut.setFromSvcFound(CONSTANTS.LITERAL_Y);
                    // cobolCode::ADD 1 TO WS-NBR-MATCHED
                    methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
                }
                // cobolCode::GO TO 2125D-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 2125D-EXIT
            }
            // cobolCode::IF D51U-FRTO-SVC-TYP-CD ( SVC-SUB ) = 'C' OR 'H' AND SVC-6 NOT = SPACES
            if (methodIn.getD51uFrtoSvcTypCd(methodIn.getSvcSub() - 1)[0] == 'C' || methodIn.getD51uFrtoSvcTypCd(methodIn.getSvcSub() - 1)[0] == 'H' && (!allSpaces(methodOut.getSvc6()))) {
                // cobolCode::GO TO 2125D-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 2125D-EXIT
            }
        }
        // cobolCode::IF ( SVC-1-5 NOT < FE-SVC-1-5-FR ) AND ( SVC-1-5 NOT > FE-SVC-1-5-TO )
        if ((compareChars(methodOut.getSvc15(), methodOut.getFeSvc15Fr()) >= 0) && (compareChars(methodOut.getSvc15(), methodOut.getFeSvc15To()) <= 0)) {
            // *** Do not want a hit on rev code range if it's a medical claim!
            // cobolCode::IF D51U-FRTO-SVC-TYP-CD ( SVC-SUB ) = 'R'
            if (methodIn.getD51uFrtoSvcTypCd(methodIn.getSvcSub() - 1)[0] == 'R') {
                // cobolCode::IF LK-51U-MEDICAL-CLAIM = 'Y'
                // LITERAL_Y = 'Y'
                if (compareChars(methodIn.getUMedicalClaim51(), CONSTANTS.LITERAL_Y) == 0) {
                    // cobolCode::GO TO 2125D-EXIT
                    return methodOut;
                    // cobolCodeEnds::GO TO 2125D-EXIT
                }
            }
            // cobolCode::IF D51U-FRTO-SVC-TYP-CD ( SVC-SUB ) = 'C' OR 'H'
            if (methodIn.getD51uFrtoSvcTypCd(methodIn.getSvcSub() - 1)[0] == 'C' || methodIn.getD51uFrtoSvcTypCd(methodIn.getSvcSub() - 1)[0] == 'H') {
                // cobolCode::IF ( FE-SVC-1-5-FR (5 : 1) NOT EQUAL SPACE AND SVC-1-5 (5 : 1) NOT EQUAL SPACE)
                // cobolCode::ELSE
                if ((methodOut.getFeSvc15Fr()[4] == ' ' || methodOut.getSvc15()[4] == ' ')) {
                    // cobolCode::GO TO 2125D-EXIT
                    return methodOut;
                    // cobolCodeEnds::GO TO 2125D-EXIT
                }
                // cobolCode::IF SVC-1-5 (2 : 1) IS ALPHABETIC OR SVC-1-5 (3 : 1) IS ALPHABETIC OR SVC-1-5 (4 : 1) IS ALPHABETIC
                if ((isAlphabetic(substring(methodOut.getSvc15(), 1, 2))) || /*Alphabetic*/
                (isAlphabetic(substring(methodOut.getSvc15(), 2, 3))) || /*Alphabetic*/
                (isAlphabetic(substring(methodOut.getSvc15(), 3, 4)))) /*Alphabetic*/
                {
                    // cobolCode::GO TO 2125D-EXIT
                    return methodOut;
                    // cobolCodeEnds::GO TO 2125D-EXIT
                }
                // cobolCode::IF ( SVC-1AF IS ALPHABETIC) AND ( SVC-2-5AF IS NUMERIC) AND ( FE-SVC-1AF-FR IS ALPHABETIC) AND ( FE-SVC-2-5AF-FR IS NUMERIC) AND ( FE-SVC-1AF-TO IS ALPHABETIC) AND ( FE-SVC-2-5AF-TO IS NUMERIC)
                if (((isAlphabetic(methodIn.getSvc1af()))) && (isNumeric(methodIn.getSvc25af())) && ((isAlphabetic(methodIn.getFeSvc1afFr()))) && (isNumeric(methodIn.getFeSvc25afFr())) && ((isAlphabetic(methodIn.getFeSvc1afTo()))) && (isNumeric(methodIn.getFeSvc25afTo()))) {
                    // ***When from and to range starts with same alpha character
                    // cobolCode::IF ( FE-SVC-1AF-FR = FE-SVC-1AF-TO ) AND ( SVC-1AF = FE-SVC-1AF-FR )
                    if ((compareChars(methodIn.getFeSvc1afFr(), methodIn.getFeSvc1afTo()) == 0) && (compareChars(methodIn.getSvc1af(), methodIn.getFeSvc1afFr()) == 0)) {
                        // cobolCode::IF ( SVC-2-5AF NOT < FE-SVC-2-5AF-FR ) AND ( SVC-2-5AF NOT > FE-SVC-2-5AF-TO )
                        // cobolCode::ELSE
                        if ((compareChars(methodIn.getSvc25af(), methodIn.getFeSvc25afFr()) < 0) || (compareChars(methodIn.getSvc25af(), methodIn.getFeSvc25afTo()) > 0)) {
                            // cobolCode::GO TO 2125D-EXIT
                            return methodOut;
                            // cobolCodeEnds::GO TO 2125D-EXIT
                        }
                    }
                    // ***From and to range has diff alpha,service match to 'from range'
                    // cobolCode::IF ( FE-SVC-1AF-FR NOT = FE-SVC-1AF-TO ) AND ( SVC-1AF = FE-SVC-1AF-FR )
                    if ((compareChars(methodIn.getFeSvc1afFr(), methodIn.getFeSvc1afTo()) != 0) && (compareChars(methodIn.getSvc1af(), methodIn.getFeSvc1afFr()) == 0)) {
                        // cobolCode::IF ( SVC-2-5AF NOT < FE-SVC-2-5AF-FR )
                        // cobolCode::ELSE
                        if ((compareChars(methodIn.getSvc25af(), methodIn.getFeSvc25afFr()) < 0)) {
                            // cobolCode::GO TO 2125D-EXIT
                            return methodOut;
                            // cobolCodeEnds::GO TO 2125D-EXIT
                        }
                    }
                    // ***From and to range has diff alpha,service match with 'to range'
                    // cobolCode::IF ( FE-SVC-1AF-FR NOT = FE-SVC-1AF-TO ) AND ( SVC-1AF = FE-SVC-1AF-TO )
                    if ((compareChars(methodIn.getFeSvc1afFr(), methodIn.getFeSvc1afTo()) != 0) && (compareChars(methodIn.getSvc1af(), methodIn.getFeSvc1afTo()) == 0)) {
                        // cobolCode::IF ( SVC-2-5AF NOT > FE-SVC-2-5AF-TO )
                        // cobolCode::ELSE
                        if ((compareChars(methodIn.getSvc25af(), methodIn.getFeSvc25afTo()) > 0)) {
                            // cobolCode::GO TO 2125D-EXIT
                            return methodOut;
                            // cobolCodeEnds::GO TO 2125D-EXIT
                        }
                    }
                    // ***From and to range has diff alpha,service match in between
                    // ***'from' and 'to' range,no numeric check is required
                    // cobolCode::IF ( FE-SVC-1AF-FR NOT = FE-SVC-1AF-TO ) AND ( SVC-1AF NOT = FE-SVC-1AF-TO ) AND ( SVC-1AF NOT = FE-SVC-1AF-FR )
                    if ((compareChars(methodIn.getFeSvc1afFr(), methodIn.getFeSvc1afTo()) != 0) && (compareChars(methodIn.getSvc1af(), methodIn.getFeSvc1afTo()) != 0) && (compareChars(methodIn.getSvc1af(), methodIn.getFeSvc1afFr()) != 0)) {
                        // cobolCode::IF ( SVC-1AF > FE-SVC-1AF-FR ) AND ( SVC-1AF < FE-SVC-1AF-TO )
                        // cobolCode::ELSE
                        if ((compareChars(methodIn.getSvc1af(), methodIn.getFeSvc1afFr()) <= 0) || (compareChars(methodIn.getSvc1af(), methodIn.getFeSvc1afTo()) >= 0)) {
                            // cobolCode::GO TO 2125D-EXIT
                            return methodOut;
                            // cobolCodeEnds::GO TO 2125D-EXIT
                        }
                    }
                } else // cobolCode::ELSE
                {
                    // cobolCode::IF ( SVC-1-4AL IS NUMERIC) AND ( SVC-5AL IS ALPHABETIC) AND ( FE-SVC-1-4AL-FR IS NUMERIC) AND ( FE-SVC-5AL-FR IS ALPHABETIC) AND ( FE-SVC-1-4AL-TO IS NUMERIC) AND ( FE-SVC-5AL-TO IS ALPHABETIC)
                    if ((isNumeric(methodIn.getSvc14al())) && ((isAlphabetic(methodIn.getSvc5al()))) && (isNumeric(methodIn.getFeSvc14alFr())) && ((isAlphabetic(methodIn.getFeSvc5alFr()))) && (isNumeric(methodIn.getFeSvc14alTo())) && ((isAlphabetic(methodIn.getFeSvc5alTo())))) {
                        // cobolCode::IF FE-SVC-5AL-FR = FE-SVC-5AL-TO
                        if (compareChars(methodIn.getFeSvc5alFr(), methodIn.getFeSvc5alTo()) == 0) {
                            // cobolCode::IF ( SVC-1-4AL NOT < FE-SVC-1-4AL-FR ) AND ( SVC-1-4AL NOT > FE-SVC-1-4AL-TO )
                            // cobolCode::ELSE
                            if ((compareChars(methodIn.getSvc14al(), methodIn.getFeSvc14alFr()) < 0) || (compareChars(methodIn.getSvc14al(), methodIn.getFeSvc14alTo()) > 0)) {
                                // cobolCode::GO TO 2125D-EXIT
                                return methodOut;
                                // cobolCodeEnds::GO TO 2125D-EXIT
                            }
                        }
                    }
                }
            }
            // cobolCode::IF FE-SVC-6-FR NOT = SPACES
            if ((!allSpaces(methodOut.getFeSvc6Fr()))) {
                // cobolCode::IF SVC-6 = FE-SVC-6-FR
                if (compareChars(methodOut.getSvc6(), methodOut.getFeSvc6Fr()) == 0) {
                    // LITERAL_Y = 'Y'
                    methodOut.setFromSvcFound(CONSTANTS.LITERAL_Y);
                    // cobolCode::ADD 1 TO WS-NBR-MATCHED
                    methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
                } else // cobolCode::ELSE
                {
                    // cobolCode::IF SVC-6 = 'C' AND FE-SVC-6-FR = '2'
                    // LITERAL_2 = '2'
                    if (compareChars(methodOut.getSvc6(), CONSTANTS.LITERAL_C) == 0 && compareChars(methodOut.getFeSvc6Fr(), CONSTANTS.LITERAL_2) == 0) {
                        // LITERAL_Y = 'Y'
                        methodOut.setFromSvcFound(CONSTANTS.LITERAL_Y);
                        // cobolCode::ADD 1 TO WS-NBR-MATCHED
                        methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
                    }
                    // cobolCode::ELSE
                }
            } else // cobolCode::ELSE
            {
                // LITERAL_Y = 'Y'
                methodOut.setFromSvcFound(CONSTANTS.LITERAL_Y);
                // cobolCode::ADD 1 TO WS-NBR-MATCHED
                methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
            }
        }
        return methodOut;
    }

    /**
     * searchPrv2130D
     *   This method is derived from
     *   COBOL Paragraph - 2130D-SEARCH-PRV SECTION COBOL Cyclomatic complexity - 6
     * Input  :
     *
     * - d51uPtypDrvPos                 COBOL Name: D51U-PTYP-DRV-POS
     * - prevPs                         COBOL Name: WS-PREV-PS
     * - d51uPtypDrvSvc                 COBOL Name: D51U-PTYP-DRV-SVC
     * - prevSvc                        COBOL Name: WS-PREV-SVC
     * - d51uPtypDrvCau                 COBOL Name: D51U-PTYP-DRV-CAU
     * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
     * - pvSub                          COBOL Name: PV-SUB
     * - d51uPtypProvTyp                COBOL Name: D51U-PTYP-PROV-TYP
     * - uProvType51                    COBOL Name: LK-51U-PROV-TYPE
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - sameTable                      COBOL Name: WS-SAME-TABLE
     * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - fromPrvFound                   COBOL Name: WS-FROM-PRV-FOUND
     * - ptypPs                         COBOL Name: WS-PTYP-PS
     * - d51uPtypDrvPos                 COBOL Name: D51U-PTYP-DRV-POS
     * - ptypSvc                        COBOL Name: WS-PTYP-SVC
     * - d51uPtypDrvSvc                 COBOL Name: D51U-PTYP-DRV-SVC
     * - ptypCauseCd                    COBOL Name: WS-PTYP-CAUSE-CD
     * - d51uPtypDrvCau                 COBOL Name: D51U-PTYP-DRV-CAU
     *
     * @throws CFException
     */
    @Override
    public SearchPrv2130DOutCtx searchPrv2130D(SearchPrv2130DInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2130D-search-prv                                             *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 check for provider type match.                               *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2130d-search-prv                                             *
        // *82                                                              *
        // *82 1. if the provider type is empty, then set a switch to       *
        // *82    indicate that the search is complete.                     *
        // *82    else, if the provider type in the record matches with the *
        // *82    one in the linkage area, increment the counter which      *
        // *82    indicates the number of matches.                          *
        // *82***************************************************************
        // *-------------------*
        // *Qc9901     if   d51u-ptyp-drv-pos(pv-sub)   =  spaces
        // *qc9901     and  d51u-ptyp-drv-svc(pv-sub)   =  spaces
        // *qc9901     and  d51u-ptyp-drv-cau(pv-sub)   =  spaces
        // *qc9901         move 'y' to ws-search-complete
        // *qc9901         go to 2130d-exit
        // *qc9901     end-if.
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        SearchPrv2130DOutCtx methodOut = methodIn.getSearchPrv2130DOutCtx();
        // cobolCode::MOVE '2130D' TO WS-PARAGRAPH
        // LITERAL_2130D = '2130D'
        methodOut.setParagraph(CONSTANTS.LITERAL_2130D);
        // cobolCode::IF D51U-PTYP-DRV-POS ( PV-SUB ) = WS-PREV-PS AND D51U-PTYP-DRV-SVC ( PV-SUB ) = WS-PREV-SVC AND D51U-PTYP-DRV-CAU ( PV-SUB ) = WS-PREV-CAUSE-CD
        if (compareChars(methodOut.getD51uPtypDrvPos(methodIn.getPvSub() - 1), methodIn.getPrevPs()) == 0 && compareChars(methodOut.getD51uPtypDrvSvc(methodIn.getPvSub() - 1), methodIn.getPrevSvc()) == 0 && compareChars(methodOut.getD51uPtypDrvCau(methodIn.getPvSub() - 1), methodIn.getPrevCauseCd()) == 0) {
            // cobolCode::SET SAME-TABLE TO TRUE
            methodOut.setSameTable1True();
            // cobolCode::IF D51U-PTYP-PROV-TYP ( PV-SUB ) EQUAL SPACES
            if ((allSpaces(methodIn.getD51uPtypProvTyp(methodIn.getPvSub() - 1)))) {
                // LITERAL_Y = 'Y'
                methodOut.setSearchComplete(CONSTANTS.LITERAL_Y);
            } else // cobolCode::ELSE
            {
                // cobolCode::IF LK-51U-PROV-TYPE = D51U-PTYP-PROV-TYP ( PV-SUB )
                if (compareChars(methodIn.getUProvType51(), methodIn.getD51uPtypProvTyp(methodIn.getPvSub() - 1)) == 0) {
                    // cobolCode::ADD 1 TO WS-NBR-MATCHED
                    methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
                    // LITERAL_Y = 'Y'
                    methodOut.setFromPrvFound(CONSTANTS.LITERAL_Y);
                    // cobolCode::MOVE D51U-PTYP-DRV-POS ( PV-SUB ) TO WS-PTYP-PS
                    methodOut.setPtypPs(methodOut.getD51uPtypDrvPos(methodIn.getPvSub() - 1));
                    // cobolCode::MOVE D51U-PTYP-DRV-SVC ( PV-SUB ) TO WS-PTYP-SVC
                    methodOut.setPtypSvc(methodOut.getD51uPtypDrvSvc(methodIn.getPvSub() - 1));
                    // cobolCode::MOVE D51U-PTYP-DRV-CAU ( PV-SUB ) TO WS-PTYP-CAUSE-CD
                    methodOut.setPtypCauseCd(methodOut.getD51uPtypDrvCau(methodIn.getPvSub() - 1));
                }
            }
        }
        return methodOut;
    }

    /**
     * searchIcd92140D
     *   This method is derived from
     *   COBOL Paragraph - 2140D-SEARCH-ICD9 SECTION COBOL Cyclomatic complexity - 33
     * Input  :
     *
     * - d51uRicdDrvPos                 COBOL Name: D51U-RICD-DRV-POS
     * - prevPs                         COBOL Name: WS-PREV-PS
     * - d51uRicdDrvSvc                 COBOL Name: D51U-RICD-DRV-SVC
     * - prevSvc                        COBOL Name: WS-PREV-SVC
     * - d51uRicdDrvCau                 COBOL Name: D51U-RICD-DRV-CAU
     * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
     * - icd9Sub                        COBOL Name: ICD9-SUB
     * - s1                             COBOL Name: S1
     * - uDiagnosisCode51               COBOL Name: LK-51U-DIAGNOSIS-CODE
     * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
     * - fromIcd9Found                  COBOL Name: WS-FROM-ICD9-FOUND
     * - uMedicalClaim51                COBOL Name: LK-51U-MEDICAL-CLAIM
     * - uLineDiagPointer51             COBOL Name: LK-51U-LINE-DIAG-POINTER
     * - uSourceInd51                   COBOL Name: LK-51U-SOURCE-IND
     * - sub01                          COBOL Name: LK-SUB
     * - d51uRicdClmIcdFromCd           COBOL Name: D51U-RICD-CLM-ICD-FROM-CD
     * - d51uRicdClmIcdToCd             COBOL Name: D51U-RICD-CLM-ICD-TO-CD
     * - uIcdVerNbr51                   COBOL Name: LK-51U-ICD-VER-NBR
     * - d51uRicdClmIcdInd              COBOL Name: D51U-RICD-CLM-ICD-IND
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - sameTable                      COBOL Name: WS-SAME-TABLE
     * - s1                             COBOL Name: S1
     * - useDiagnosisSw                 COBOL Name: USE-DIAGNOSIS-SW
     * - point                          COBOL Name: WS-POINT
     * - uLineDiagPointer51             COBOL Name: LK-51U-LINE-DIAG-POINTER
     * - point1                         COBOL Name: WS-POINT-1
     * - point2                         COBOL Name: WS-POINT-2
     * - point3                         COBOL Name: WS-POINT-3
     * - point4                         COBOL Name: WS-POINT-4
     * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
     * - fromIcd9Found                  COBOL Name: WS-FROM-ICD9-FOUND
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - ricdPs                         COBOL Name: WS-RICD-PS
     * - d51uRicdDrvPos                 COBOL Name: D51U-RICD-DRV-POS
     * - ricdSvc                        COBOL Name: WS-RICD-SVC
     * - d51uRicdDrvSvc                 COBOL Name: D51U-RICD-DRV-SVC
     * - ricdCauseCd                    COBOL Name: WS-RICD-CAUSE-CD
     * - d51uRicdDrvCau                 COBOL Name: D51U-RICD-DRV-CAU
     *
     * @throws CFException
     */
    @Override
    public SearchIcd92140DOutCtx searchIcd92140D(SearchIcd92140DInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2140D-search-icd9                                            *
        // *81                                                              *
        // *81 check for icd9 match.                                        *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2140d-search-icd9                                            *
        // *82                                                              *
        // *82 1. check if the diagnosis code is spaces.                    *
        // *82 2. examine the mediclaim switch, the source indicator, the   *
        // *82    line drag pointer and populate the use diagnosis switch.  *
        // *82 3. when icd9 match is found, a flag is set and a counter is  *
        // *82    accumulated to indicate number of matches. match should be*
        // *82    within to from spi icd9 when both are present.            *
        // *82***************************************************************
        // *-------------------*
        // *Qc9901     if   d51u-ricd-drv-pos(icd9-sub) =  spaces
        // *qc9901     and  d51u-ricd-drv-svc(icd9-sub) =  spaces
        // *qc9901     and  d51u-ricd-drv-cau(icd9-sub) =  spaces
        // *qc9901           move 'y' to ws-search-complete
        // *qc9901           go to 2140d-exit
        // *qc9901     end-if.
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        SearchIcd92140DOutCtx methodOut = methodIn.getSearchIcd92140DOutCtx();
        // cobolCode::MOVE '2140D' TO WS-PARAGRAPH
        // LITERAL_2140D = '2140D'
        methodOut.setParagraph(CONSTANTS.LITERAL_2140D);
        // cobolCode::IF D51U-RICD-DRV-POS ( ICD9-SUB ) = WS-PREV-PS AND D51U-RICD-DRV-SVC ( ICD9-SUB ) = WS-PREV-SVC AND D51U-RICD-DRV-CAU ( ICD9-SUB ) = WS-PREV-CAUSE-CD
        if (compareChars(methodOut.getD51uRicdDrvPos(methodIn.getIcd9Sub() - 1), methodIn.getPrevPs()) == 0 && compareChars(methodOut.getD51uRicdDrvSvc(methodIn.getIcd9Sub() - 1), methodIn.getPrevSvc()) == 0 && compareChars(methodOut.getD51uRicdDrvCau(methodIn.getIcd9Sub() - 1), methodIn.getPrevCauseCd()) == 0) {
            // cobolCode::SET SAME-TABLE TO TRUE
            methodOut.setSameTable1True();
            // cobolCode::PERFORM VARYING S1 FROM 1 BY 1 UNTIL S1 > 25 OR LK-51U-DIAGNOSIS-CODE (S1) = SPACES OR SEARCH-COMPLETE OR FROM-ICD9-FOUND
            for (methodOut.setS1(1); ((methodOut.getS1() <= 25) && (!allSpaces(methodIn.getUDiagnosisCode51(methodOut.getS1() - 1))) && !(methodIn.isSearchComplete1()) && !(methodIn.isFromIcd9Found1())); methodOut.setS1(methodOut.getS1() + 1)) {
                // *** For medical only check diagnosis where diag pointers apply
                // *** for a given line
                // *** For medical only check diagnosis where diag pointers apply
                // *** for a given line
                // LITERAL_N = 'N'
                methodOut.setUseDiagnosisSw(CONSTANTS.LITERAL_N);
                // cobolCode::IF LK-51U-MEDICAL-CLAIM = 'Y'
                // LITERAL_Y = 'Y'
                if (compareChars(methodIn.getUMedicalClaim51(), CONSTANTS.LITERAL_Y) == 0) {
                    // *45917S    if s1 < 6
                    // *48111a    if s1 < 5
                    // cobolCode::IF S1 < 26
                    if ((methodOut.getS1() < 26)) {
                        // cobolCode::MOVE LK-51U-LINE-DIAG-POINTER ( LK-SUB ) TO WS-POINT
                        methodOut.getPoint().setString(methodOut.getULineDiagPointer51(methodIn.getSub01() - 1));
                        // cobolCode::IF LK-51U-SOURCE-IND = 'M' AND WS-POINT-1 = 00 AND S1 = 1
                        // LITERAL_1 = 1
                        if (compareChars(methodIn.getUSourceInd51(), CONSTANTS.LITERAL_M) == 0 && (methodOut.getPoint1() == 0) && (methodOut.getS1() == 1)) {
                            // *45917S           ws-point-1 = '0'
                            // *45917S           ws-point-1 = '0'
                            // LITERAL_Y = 'Y'
                            methodOut.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                        }
                        // cobolCode::IF LK-51U-SOURCE-IND = 'M' AND WS-POINT-1 = 05
                        if (compareChars(methodIn.getUSourceInd51(), CONSTANTS.LITERAL_M) == 0 && (methodOut.getPoint1() == 5)) {
                            // *45917S           ws-point-1 = '5'
                            // *45917S           ws-point-1 = '5'
                            // LITERAL_Y = 'Y'
                            methodOut.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                        }
                        // *45917S        if lk-51u-line-diag-pointer(lk-sub)(1:1)
                        // cobolCode::IF LK-51U-LINE-DIAG-POINTER ( LK-SUB ) (1 : 2) NOT = SPACES AND WS-POINT-1 = S1
                        if (!(Field.allSpaces(methodOut.getULineDiagPointer51(methodIn.getSub01() - 1), (0), 2)) && (methodOut.getPoint1() == methodOut.getS1())) {
                            // LITERAL_Y = 'Y'
                            methodOut.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                        }
                        // *45917S        if lk-51u-line-diag-pointer(lk-sub)(2:1)
                        // cobolCode::IF LK-51U-LINE-DIAG-POINTER ( LK-SUB ) (3 : 2) NOT = SPACES AND WS-POINT-2 = S1
                        if (!(Field.allSpaces(methodOut.getULineDiagPointer51(methodIn.getSub01() - 1), (2), 2)) && (methodOut.getPoint2() == methodOut.getS1())) {
                            // LITERAL_Y = 'Y'
                            methodOut.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                        }
                        // *45917S        if lk-51u-line-diag-pointer(lk-sub)(3:1)
                        // cobolCode::IF LK-51U-LINE-DIAG-POINTER ( LK-SUB ) (5 : 2) NOT = SPACES AND WS-POINT-3 = S1
                        if (!(Field.allSpaces(methodOut.getULineDiagPointer51(methodIn.getSub01() - 1), (4), 2)) && (methodOut.getPoint3() == methodOut.getS1())) {
                            // LITERAL_Y = 'Y'
                            methodOut.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                        }
                        // *45917S        if lk-51u-line-diag-pointer(lk-sub)(4:1)
                        // cobolCode::IF LK-51U-LINE-DIAG-POINTER ( LK-SUB ) (7 : 2) NOT = SPACES AND WS-POINT-4 = S1
                        if (!(Field.allSpaces(methodOut.getULineDiagPointer51(methodIn.getSub01() - 1), (6), 2)) && (methodOut.getPoint4() == methodOut.getS1())) {
                            // LITERAL_Y = 'Y'
                            methodOut.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                        }
                    }
                } else // *45917S        if lk-51u-line-diag-pointer(lk-sub)(5:1)
                // *45917s                                     not = spaces
                // *45917s                 and
                // *45917s           ws-point-5 = s1
                // *45917s            move 'y' to use-diagnosis-sw
                // *45917s        end-if
                // cobolCode::ELSE
                {
                    // LITERAL_Y = 'Y'
                    methodOut.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                }
                // cobolCode::IF USE-DIAGNOSIS
                if (methodOut.isUseDiagnosis()) {
                    // cobolCode::IF D51U-RICD-CLM-ICD-FROM-CD ( ICD9-SUB ) = SPACES
                    if ((allSpaces(methodIn.getD51uRicdClmIcdFromCd(methodIn.getIcd9Sub() - 1)))) {
                        // LITERAL_Y = 'Y'
                        methodOut.setSearchComplete(CONSTANTS.LITERAL_Y);
                    } else // cobolCode::ELSE
                    {
                        // cobolCode::IF D51U-RICD-CLM-ICD-TO-CD ( ICD9-SUB ) NOT = SPACES
                        if ((!allSpaces(methodIn.getD51uRicdClmIcdToCd(methodIn.getIcd9Sub() - 1)))) {
                            // cobolCode::IF LK-51U-DIAGNOSIS-CODE (S1) NOT < D51U-RICD-CLM-ICD-FROM-CD ( ICD9-SUB ) AND LK-51U-DIAGNOSIS-CODE (S1) NOT > D51U-RICD-CLM-ICD-TO-CD ( ICD9-SUB ) AND LK-51U-ICD-VER-NBR = D51U-RICD-CLM-ICD-IND ( ICD9-SUB )
                            if (compareChars(methodIn.getUDiagnosisCode51(methodOut.getS1() - 1), methodIn.getD51uRicdClmIcdFromCd(methodIn.getIcd9Sub() - 1)) >= 0 && compareChars(methodIn.getUDiagnosisCode51(methodOut.getS1() - 1), methodIn.getD51uRicdClmIcdToCd(methodIn.getIcd9Sub() - 1)) <= 0 && compareChars(methodIn.getUIcdVerNbr51(), methodIn.getD51uRicdClmIcdInd(methodIn.getIcd9Sub() - 1)) == 0) {
                                // LITERAL_Y = 'Y'
                                methodOut.setFromIcd9Found(CONSTANTS.LITERAL_Y);
                            }
                        } else // cobolCode::ELSE
                        {
                            // cobolCode::IF LK-51U-DIAGNOSIS-CODE (S1) = D51U-RICD-CLM-ICD-FROM-CD ( ICD9-SUB ) AND LK-51U-ICD-VER-NBR = D51U-RICD-CLM-ICD-IND ( ICD9-SUB )
                            if (compareChars(methodIn.getUDiagnosisCode51(methodOut.getS1() - 1), methodIn.getD51uRicdClmIcdFromCd(methodIn.getIcd9Sub() - 1)) == 0 && compareChars(methodIn.getUIcdVerNbr51(), methodIn.getD51uRicdClmIcdInd(methodIn.getIcd9Sub() - 1)) == 0) {
                                // LITERAL_Y = 'Y'
                                methodOut.setFromIcd9Found(CONSTANTS.LITERAL_Y);
                            }
                        }
                    }
                }
            }
            // cobolCode::IF FROM-ICD9-FOUND
            if (methodIn.isFromIcd9Found1()) {
                // cobolCode::ADD 1 TO WS-NBR-MATCHED
                methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
                // cobolCode::MOVE D51U-RICD-DRV-POS ( ICD9-SUB ) TO WS-RICD-PS
                methodOut.setRicdPs(methodOut.getD51uRicdDrvPos(methodIn.getIcd9Sub() - 1));
                // cobolCode::MOVE D51U-RICD-DRV-SVC ( ICD9-SUB ) TO WS-RICD-SVC
                methodOut.setRicdSvc(methodOut.getD51uRicdDrvSvc(methodIn.getIcd9Sub() - 1));
                // cobolCode::MOVE D51U-RICD-DRV-CAU ( ICD9-SUB ) TO WS-RICD-CAUSE-CD
                methodOut.setRicdCauseCd(methodOut.getD51uRicdDrvCau(methodIn.getIcd9Sub() - 1));
            }
        }
        return methodOut;
    }

    /**
     * searchCause2150D
     *   This method is derived from
     *   COBOL Paragraph - 2150D-SEARCH-CAUSE SECTION COBOL Cyclomatic complexity - 13
     * Input  :
     *
     * - d51uCausDrvPos                 COBOL Name: D51U-CAUS-DRV-POS
     * - prevPs                         COBOL Name: WS-PREV-PS
     * - d51uCausDrvSvc                 COBOL Name: D51U-CAUS-DRV-SVC
     * - prevSvc                        COBOL Name: WS-PREV-SVC
     * - d51uCausDrvCau                 COBOL Name: D51U-CAUS-DRV-CAU
     * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
     * - causeSub                       COBOL Name: CAUSE-SUB
     * - d51uCausClmCauseCd1            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-1
     * - uCauseCd51                     COBOL Name: LK-51U-CAUSE-CD
     * - d51uCausClmCauseCd2            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-2
     * - d51uCausClmCauseCd3            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-3
     * - d51uCausClmCauseCd4            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-4
     * - d51uCausClmCauseCd5            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-5
     * - d51uCausClmCauseCd6            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-6
     * - d51uCausClmCauseCd7            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-7
     * - d51uCausClmCauseCd8            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-8
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - sameTable                      COBOL Name: WS-SAME-TABLE
     * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - causPs                         COBOL Name: WS-CAUS-PS
     * - d51uCausDrvPos                 COBOL Name: D51U-CAUS-DRV-POS
     * - causSvc                        COBOL Name: WS-CAUS-SVC
     * - d51uCausDrvSvc                 COBOL Name: D51U-CAUS-DRV-SVC
     * - causCauseCd                    COBOL Name: WS-CAUS-CAUSE-CD
     * - d51uCausDrvCau                 COBOL Name: D51U-CAUS-DRV-CAU
     * - fromCauseFound                 COBOL Name: WS-FROM-CAUSE-FOUND
     *
     * @throws CFException
     */
    @Override
    public SearchCause2150DOutCtx searchCause2150D(SearchCause2150DInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2150D-search-cause                                           *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 this section increments the counter which indicates the      *
        // *81 number of matches when ever a cause code match is found.     *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2150d-search-cause                                           *
        // *82                                                              *
        // *82 1. if the cause code for that particular index is empty, it  *
        // *82    denotes that the search is complete. else, increase the   *
        // *82    number of matches by 1.                                   *
        // *82***************************************************************
        // *-------------------*
        // *Qc9901     if  d51u-caus-drv-pos(cause-sub) =  spaces
        // *qc9901     and d51u-caus-drv-svc(cause-sub) =  spaces
        // *qc9901     and d51u-caus-drv-cau(cause-sub) =  spaces
        // *45917s         move 'y' to ws-search-complete
        // *qc9901         go to 2150d-exit
        // *qc9901     end-if.
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        SearchCause2150DOutCtx methodOut = methodIn.getSearchCause2150DOutCtx();
        // cobolCode::MOVE '2150D' TO WS-PARAGRAPH
        // LITERAL_2150D = '2150D'
        methodOut.setParagraph(CONSTANTS.LITERAL_2150D);
        // cobolCode::IF D51U-CAUS-DRV-POS ( CAUSE-SUB ) = WS-PREV-PS AND D51U-CAUS-DRV-SVC ( CAUSE-SUB ) = WS-PREV-SVC AND D51U-CAUS-DRV-CAU ( CAUSE-SUB ) = WS-PREV-CAUSE-CD
        if (compareChars(methodOut.getD51uCausDrvPos(methodIn.getCauseSub() - 1), methodIn.getPrevPs()) == 0 && compareChars(methodOut.getD51uCausDrvSvc(methodIn.getCauseSub() - 1), methodIn.getPrevSvc()) == 0 && compareChars(methodOut.getD51uCausDrvCau(methodIn.getCauseSub() - 1), methodIn.getPrevCauseCd()) == 0) {
            // cobolCode::SET SAME-TABLE TO TRUE
            methodOut.setSameTable1True();
            // cobolCode::IF D51U-CAUS-CLM-CAUSE-CD-1 ( CAUSE-SUB ) = SPACES
            if ((allSpaces(methodIn.getD51uCausClmCauseCd1(methodIn.getCauseSub() - 1)))) {
                // LITERAL_Y = 'Y'
                methodOut.setSearchComplete(CONSTANTS.LITERAL_Y);
            } else // cobolCode::ELSE
            {
                // cobolCode::IF LK-51U-CAUSE-CD = D51U-CAUS-CLM-CAUSE-CD-1 ( CAUSE-SUB ) OR LK-51U-CAUSE-CD = D51U-CAUS-CLM-CAUSE-CD-2 ( CAUSE-SUB ) OR LK-51U-CAUSE-CD = D51U-CAUS-CLM-CAUSE-CD-3 ( CAUSE-SUB ) OR LK-51U-CAUSE-CD = D51U-CAUS-CLM-CAUSE-CD-4 ( CAUSE-SUB ) OR LK-51U-CAUSE-CD = D51U-CAUS-CLM-CAUSE-CD-5 ( CAUSE-SUB ) OR LK-51U-CAUSE-CD = D51U-CAUS-CLM-CAUSE-CD-6 ( CAUSE-SUB ) OR LK-51U-CAUSE-CD = D51U-CAUS-CLM-CAUSE-CD-7 ( CAUSE-SUB ) OR LK-51U-CAUSE-CD = D51U-CAUS-CLM-CAUSE-CD-8 ( CAUSE-SUB )
                if (compareChars(methodIn.getUCauseCd51(), methodIn.getD51uCausClmCauseCd1(methodIn.getCauseSub() - 1)) == 0 || compareChars(methodIn.getUCauseCd51(), methodIn.getD51uCausClmCauseCd2(methodIn.getCauseSub() - 1)) == 0 || compareChars(methodIn.getUCauseCd51(), methodIn.getD51uCausClmCauseCd3(methodIn.getCauseSub() - 1)) == 0 || compareChars(methodIn.getUCauseCd51(), methodIn.getD51uCausClmCauseCd4(methodIn.getCauseSub() - 1)) == 0 || compareChars(methodIn.getUCauseCd51(), methodIn.getD51uCausClmCauseCd5(methodIn.getCauseSub() - 1)) == 0 || compareChars(methodIn.getUCauseCd51(), methodIn.getD51uCausClmCauseCd6(methodIn.getCauseSub() - 1)) == 0 || compareChars(methodIn.getUCauseCd51(), methodIn.getD51uCausClmCauseCd7(methodIn.getCauseSub() - 1)) == 0 || compareChars(methodIn.getUCauseCd51(), methodIn.getD51uCausClmCauseCd8(methodIn.getCauseSub() - 1)) == 0) {
                    // cobolCode::ADD 1 TO WS-NBR-MATCHED
                    methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
                    // cobolCode::MOVE D51U-CAUS-DRV-POS ( CAUSE-SUB ) TO WS-CAUS-PS
                    methodOut.setCausPs(methodOut.getD51uCausDrvPos(methodIn.getCauseSub() - 1));
                    // cobolCode::MOVE D51U-CAUS-DRV-SVC ( CAUSE-SUB ) TO WS-CAUS-SVC
                    methodOut.setCausSvc(methodOut.getD51uCausDrvSvc(methodIn.getCauseSub() - 1));
                    // **45917C     move d51u-caus-drv-cau(cause-sub) to ws-hold-cause-cd
                    // cobolCode::MOVE D51U-CAUS-DRV-CAU ( CAUSE-SUB ) TO WS-CAUS-CAUSE-CD
                    methodOut.setCausCauseCd(methodOut.getD51uCausDrvCau(methodIn.getCauseSub() - 1));
                    // LITERAL_Y = 'Y'
                    methodOut.setFromCauseFound(CONSTANTS.LITERAL_Y);
                }
            }
        }
        return methodOut;
    }

    /**
     * matchIpaToPpoalt2160D
     *   This method is derived from
     *   COBOL Paragraph - 2160D-MATCH-IPA-TO-PPOALT SECTION COBOL Cyclomatic complexity - 33
     * Input  :
     *
     * - d51uRipaDrvPos                 COBOL Name: D51U-RIPA-DRV-POS
     * - prevPs                         COBOL Name: WS-PREV-PS
     * - d51uRipaDrvSvc                 COBOL Name: D51U-RIPA-DRV-SVC
     * - prevSvc                        COBOL Name: WS-PREV-SVC
     * - d51uRipaDrvCau                 COBOL Name: D51U-RIPA-DRV-CAU
     * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
     * - iSub                           COBOL Name: I-SUB
     * - ppaPpoIdCount                  COBOL Name: PPA-PPO-ID-COUNT
     * - d51uRipaClmIpa1Cd              COBOL Name: D51U-RIPA-CLM-IPA-1-CD
     * - d51uRipaGrpTbl1Nbr             COBOL Name: D51U-RIPA-GRP-TBL-1-NBR
     * - d51uRipaGrpTbl2Nbr             COBOL Name: D51U-RIPA-GRP-TBL-2-NBR
     * - d51uRipaGrpTbl3Nbr             COBOL Name: D51U-RIPA-GRP-TBL-3-NBR
     * - ipaSub                         COBOL Name: IPA-SUB
     * - ppaIpa                         COBOL Name: PPA-IPA
     * - ppaGrpTabNo                    COBOL Name: PPA-GRP-TAB-NO
     * - uEarliestDos51                 COBOL Name: LK-51U-EARLIEST-DOS
     * - ppaFirstEffDate                COBOL Name: PPA-FIRST-EFF-DATE
     * - ppaLastCanDate                 COBOL Name: PPA-LAST-CAN-DATE
     * - d51uRipaClmIpa2Cd              COBOL Name: D51U-RIPA-CLM-IPA-2-CD
     * - d51uRipaClmIpa3Cd              COBOL Name: D51U-RIPA-CLM-IPA-3-CD
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     *
     * Output :
     *
     * - gtnLoaded                      COBOL Name: WS-GTN-LOADED
     * - sameTable                      COBOL Name: WS-SAME-TABLE
     * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
     * - ipaSub                         COBOL Name: IPA-SUB
     * - ipaAndGtnFound                 COBOL Name: WS-IPA-AND-GTN-FOUND
     * - ipaCodeFound                   COBOL Name: WS-IPA-CODE-FOUND
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - ripaPs                         COBOL Name: WS-RIPA-PS
     * - d51uRipaDrvPos                 COBOL Name: D51U-RIPA-DRV-POS
     * - ripaSvc                        COBOL Name: WS-RIPA-SVC
     * - d51uRipaDrvSvc                 COBOL Name: D51U-RIPA-DRV-SVC
     * - ripaCauseCd                    COBOL Name: WS-RIPA-CAUSE-CD
     * - d51uRipaDrvCau                 COBOL Name: D51U-RIPA-DRV-CAU
     *
     * @throws CFException
     */
    @Override
    public MatchIpaToPpoalt2160DOutCtx matchIpaToPpoalt2160D(MatchIpaToPpoalt2160DInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2160D-match-ipa-to-ppoalt                                    *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 checks for a match on individual practice association code   *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2160d-match-ipa-to-ppoalt                                    *
        // *82                                                              *
        // *82 1. when no prefered provider organization records are found  *
        // *82    exit, the section.                                        *
        // *82 2. if the ppa-ipa is greater than zero                       *
        // *82    - if the earliest date of service is greater than the ppa-*
        // *82      first effective date and the earlist date of service is *
        // *82      less than the last cancel date,                         *
        // *82      - if the ppa-ipa matches with any of the three ipa-codes*
        // *82        then set a switch to indicate that the ipa code is    *
        // *82        found.                                                *
        // *82***************************************************************
        // *------------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        MatchIpaToPpoalt2160DOutCtx methodOut = methodIn.getMatchIpaToPpoalt2160DOutCtx();
        // LITERAL_N = 'N'
        methodOut.setGtnLoaded(CONSTANTS.LITERAL_N);
        // cobolCode::IF D51U-RIPA-DRV-POS ( I-SUB ) = WS-PREV-PS AND D51U-RIPA-DRV-SVC ( I-SUB ) = WS-PREV-SVC AND D51U-RIPA-DRV-CAU ( I-SUB ) = WS-PREV-CAUSE-CD
        if (compareChars(methodOut.getD51uRipaDrvPos(methodIn.getISub() - 1), methodIn.getPrevPs()) == 0 && compareChars(methodOut.getD51uRipaDrvSvc(methodIn.getISub() - 1), methodIn.getPrevSvc()) == 0 && compareChars(methodOut.getD51uRipaDrvCau(methodIn.getISub() - 1), methodIn.getPrevCauseCd()) == 0) {
            // cobolCode::SET SAME-TABLE TO TRUE
            methodOut.setSameTable1True();
            // cobolCode::IF PPA-PPO-ID-COUNT IS NOT NUMERIC
            if (!(methodIn.getPpaFixedPortion().ppaPpoIdCountIsNumeric())) {
                // LITERAL_Y = 'Y'
                methodOut.setSearchComplete(CONSTANTS.LITERAL_Y);
                // cobolCode::GO TO 2160D-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 2160D-EXIT
            }
            // *Qc9901     if  d51u-ripa-drv-pos(i-sub) = spaces
            // *qc9901     and d51u-ripa-drv-svc(i-sub) = spaces
            // *qc9901     and d51u-ripa-drv-cau(i-sub) = spaces
            // *qc9901         move 'y' to ws-search-complete
            // *qc9901         go to 2160d-exit
            // *qc9901     end-if.
            // *code commented and moved above for 12-2017 so that if there is no
            // *ppo record the same-table and ws-search-complete are both set
            // *
            // *    if  d51u-ripa-drv-pos(i-sub) = ws-prev-ps
            // *    and d51u-ripa-drv-svc(i-sub) = ws-prev-svc
            // *    and d51u-ripa-drv-cau(i-sub) = ws-prev-cause-cd
            // *         set same-table to true
            // cobolCode::IF D51U-RIPA-CLM-IPA-1-CD ( I-SUB ) = ZEROES
            if ((methodIn.getD51uRipaClmIpa1Cd(methodIn.getISub() - 1) == 0)) {
                // LITERAL_Y = 'Y'
                methodOut.setSearchComplete(CONSTANTS.LITERAL_Y);
            } else // cobolCode::ELSE
            {
                // cobolCode::IF D51U-RIPA-GRP-TBL-1-NBR ( I-SUB ) NOT EQUAL SPACES OR D51U-RIPA-GRP-TBL-2-NBR ( I-SUB ) NOT EQUAL SPACES OR D51U-RIPA-GRP-TBL-3-NBR ( I-SUB ) NOT EQUAL SPACES
                if ((!allSpaces(methodIn.getD51uRipaGrpTbl1Nbr(methodIn.getISub() - 1))) || (!allSpaces(methodIn.getD51uRipaGrpTbl2Nbr(methodIn.getISub() - 1))) || (!allSpaces(methodIn.getD51uRipaGrpTbl3Nbr(methodIn.getISub() - 1)))) {
                    // cobolCode::SET GTN-LOADED TO TRUE
                    methodOut.setGtnLoaded1True();
                }
                // cobolCode::PERFORM VARYING IPA-SUB FROM 1 BY 1 UNTIL IPA-SUB > PPA-PPO-ID-COUNT
                for (methodOut.setIpaSub(1); ((methodOut.getIpaSub() <= methodIn.getPpaPpoIdCount())); methodOut.setIpaSub(methodOut.getIpaSub() + 1)) {
                    // cobolCode::IF PPA-IPA ( IPA-SUB ) > ZEROES AND PPA-GRP-TAB-NO ( IPA-SUB ) > SPACES
                    if ((methodIn.getPpaIpa(methodOut.getIpaSub() - 1) > 0) && (isGreaterThanSpaces(methodIn.getPpaGrpTabNo(methodOut.getIpaSub() - 1)))) {
                        // ***70203N   ppa-grp-tab-no (ipa-sub) > zeroes
                        // cobolCode::IF ( ( LK-51U-EARLIEST-DOS NOT < PPA-FIRST-EFF-DATE ( IPA-SUB )) AND ( LK-51U-EARLIEST-DOS NOT > PPA-LAST-CAN-DATE ( IPA-SUB )))
                        if (((((methodIn.getUEarliestDos51() >= methodIn.getPpaFirstEffDate(methodOut.getIpaSub() - 1)))) && (((methodIn.getUEarliestDos51() <= methodIn.getPpaLastCanDate(methodOut.getIpaSub() - 1)))))) {
                            // cobolCode::IF ( PPA-IPA ( IPA-SUB ) = D51U-RIPA-CLM-IPA-1-CD ( I-SUB ) AND PPA-GRP-TAB-NO ( IPA-SUB ) = D51U-RIPA-GRP-TBL-1-NBR ( I-SUB )) OR ( PPA-IPA ( IPA-SUB ) = D51U-RIPA-CLM-IPA-2-CD ( I-SUB ) AND PPA-GRP-TAB-NO ( IPA-SUB ) = D51U-RIPA-GRP-TBL-2-NBR ( I-SUB )) OR ( PPA-IPA ( IPA-SUB ) = D51U-RIPA-CLM-IPA-3-CD ( I-SUB ) AND PPA-GRP-TAB-NO ( IPA-SUB ) = D51U-RIPA-GRP-TBL-3-NBR ( I-SUB ))
                            if (((methodIn.getPpaIpa(methodOut.getIpaSub() - 1) == methodIn.getD51uRipaClmIpa1Cd(methodIn.getISub() - 1)) && compareChars(methodIn.getPpaGrpTabNo(methodOut.getIpaSub() - 1), methodIn.getD51uRipaGrpTbl1Nbr(methodIn.getISub() - 1)) == 0) || ((methodIn.getPpaIpa(methodOut.getIpaSub() - 1) == methodIn.getD51uRipaClmIpa2Cd(methodIn.getISub() - 1)) && compareChars(methodIn.getPpaGrpTabNo(methodOut.getIpaSub() - 1), methodIn.getD51uRipaGrpTbl2Nbr(methodIn.getISub() - 1)) == 0) || ((methodIn.getPpaIpa(methodOut.getIpaSub() - 1) == methodIn.getD51uRipaClmIpa3Cd(methodIn.getISub() - 1)) && compareChars(methodIn.getPpaGrpTabNo(methodOut.getIpaSub() - 1), methodIn.getD51uRipaGrpTbl3Nbr(methodIn.getISub() - 1)) == 0)) {
                                // LITERAL_Y = 'Y'
                                methodOut.setIpaAndGtnFound(CONSTANTS.LITERAL_Y);
                            }
                        }
                    }
                }
                // cobolCode::IF NOT IPA-AND-GTN-FOUND AND NOT GTN-LOADED
                if (!(methodOut.isIpaAndGtnFound1()) && !(methodOut.isGtnLoaded1())) {
                    // cobolCode::PERFORM VARYING IPA-SUB FROM 1 BY 1 UNTIL IPA-SUB > PPA-PPO-ID-COUNT
                    for (methodOut.setIpaSub(1); ((methodOut.getIpaSub() <= methodIn.getPpaPpoIdCount())); methodOut.setIpaSub(methodOut.getIpaSub() + 1)) {
                        // cobolCode::IF PPA-IPA ( IPA-SUB ) > ZEROES
                        if ((methodIn.getPpaIpa(methodOut.getIpaSub() - 1) > 0)) {
                            // cobolCode::IF ( ( LK-51U-EARLIEST-DOS NOT < PPA-FIRST-EFF-DATE ( IPA-SUB )) AND ( LK-51U-EARLIEST-DOS NOT > PPA-LAST-CAN-DATE ( IPA-SUB )))
                            if (((((methodIn.getUEarliestDos51() >= methodIn.getPpaFirstEffDate(methodOut.getIpaSub() - 1)))) && (((methodIn.getUEarliestDos51() <= methodIn.getPpaLastCanDate(methodOut.getIpaSub() - 1)))))) {
                                // cobolCode::IF ( ( PPA-IPA ( IPA-SUB ) = D51U-RIPA-CLM-IPA-1-CD ( I-SUB )) OR ( PPA-IPA ( IPA-SUB ) = D51U-RIPA-CLM-IPA-2-CD ( I-SUB )) OR ( PPA-IPA ( IPA-SUB ) = D51U-RIPA-CLM-IPA-3-CD ( I-SUB )))
                                if (((((methodIn.getPpaIpa(methodOut.getIpaSub() - 1) == methodIn.getD51uRipaClmIpa1Cd(methodIn.getISub() - 1)))) || (((methodIn.getPpaIpa(methodOut.getIpaSub() - 1) == methodIn.getD51uRipaClmIpa2Cd(methodIn.getISub() - 1)))) || (((methodIn.getPpaIpa(methodOut.getIpaSub() - 1) == methodIn.getD51uRipaClmIpa3Cd(methodIn.getISub() - 1)))))) {
                                    // LITERAL_Y = 'Y'
                                    methodOut.setIpaCodeFound(CONSTANTS.LITERAL_Y);
                                }
                            }
                        }
                    }
                }
                // *      If ipa-code-found
                // cobolCode::IF IPA-CODE-FOUND OR IPA-AND-GTN-FOUND
                if (methodOut.isIpaCodeFound1() || methodOut.isIpaAndGtnFound1()) {
                    // cobolCode::ADD 1 TO WS-NBR-MATCHED
                    methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
                    // *45917C    move d51u-ripa-drv-pos(i-sub)  to ws-hold-ps
                    // cobolCode::MOVE D51U-RIPA-DRV-POS ( I-SUB ) TO WS-RIPA-PS
                    methodOut.setRipaPs(methodOut.getD51uRipaDrvPos(methodIn.getISub() - 1));
                    // cobolCode::MOVE D51U-RIPA-DRV-SVC ( I-SUB ) TO WS-RIPA-SVC
                    methodOut.setRipaSvc(methodOut.getD51uRipaDrvSvc(methodIn.getISub() - 1));
                    // cobolCode::MOVE D51U-RIPA-DRV-CAU ( I-SUB ) TO WS-RIPA-CAUSE-CD
                    methodOut.setRipaCauseCd(methodOut.getD51uRipaDrvCau(methodIn.getISub() - 1));
                }
            }
        }
        return methodOut;
    }

    /**
     * searchCflg
     *   This method is derived from
     *   COBOL Paragraph - 2170D-SEARCH-CFLG SECTION COBOL Cyclomatic complexity - 6
     * Input  :
     *
     * - d51uCflgDrvPos                 COBOL Name: D51U-CFLG-DRV-POS
     * - prevPs                         COBOL Name: WS-PREV-PS
     * - d51uCflgDrvSvc                 COBOL Name: D51U-CFLG-DRV-SVC
     * - prevSvc                        COBOL Name: WS-PREV-SVC
     * - d51uCflgDrvCau                 COBOL Name: D51U-CFLG-DRV-CAU
     * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
     * - cflgSub                        COBOL Name: CFLG-SUB
     * - d51uCflgCpeDescCd              COBOL Name: D51U-CFLG-CPE-DESC-CD
     * - uCpeDescCd51                   COBOL Name: LK-51U-CPE-DESC-CD
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     *
     * Output :
     *
     * - paragraph                      COBOL Name: WS-PARAGRAPH
     * - sameTable                      COBOL Name: WS-SAME-TABLE
     * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
     * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
     * - cflgPs                         COBOL Name: WS-CFLG-PS
     * - d51uCflgDrvPos                 COBOL Name: D51U-CFLG-DRV-POS
     * - cflgSvc                        COBOL Name: WS-CFLG-SVC
     * - d51uCflgDrvSvc                 COBOL Name: D51U-CFLG-DRV-SVC
     * - cflgCauseCd                    COBOL Name: WS-CFLG-CAUSE-CD
     * - d51uCflgDrvCau                 COBOL Name: D51U-CFLG-DRV-CAU
     * - cpeFlgFound                    COBOL Name: WS-CPE-FLG-FOUND
     *
     * @throws CFException
     */
    @Override
    public SearchCflgOutCtx searchCflg(SearchCflgInCtx methodIn) throws Exception {
        // *81***************************************************************
        // *81 2170D-search-cflg                                            *
        // *81                                                              *
        // *81 business function:                                           *
        // *81 this section increments the counter which indicates the      *
        // *81 number of matches when ever a cpe flag   match is found.     *
        // *81***************************************************************
        // *82***************************************************************
        // *82 2170d-search-cflg                                            *
        // *82                                                              *
        // *82 1. if the cause code for that particular index is empty, it  *
        // *82    denotes that the search is complete. else, increase the   *
        // *82    number of matches by 1.                                   *
        // *82***************************************************************
        // *-------------------*
        // Added variable to get the program context in place.
        O529351uCtx programCtx = methodIn.getO529351uCtx();
        // Added variable to get the output context in place.
        SearchCflgOutCtx methodOut = methodIn.getSearchCflgOutCtx();
        // cobolCode::MOVE '2170D' TO WS-PARAGRAPH
        // LITERAL_2170D = '2170D'
        methodOut.setParagraph(CONSTANTS.LITERAL_2170D);
        // cobolCode::IF D51U-CFLG-DRV-POS ( CFLG-SUB ) = WS-PREV-PS AND D51U-CFLG-DRV-SVC ( CFLG-SUB ) = WS-PREV-SVC AND D51U-CFLG-DRV-CAU ( CFLG-SUB ) = WS-PREV-CAUSE-CD
        if (compareChars(methodOut.getD51uCflgDrvPos(methodIn.getCflgSub() - 1), methodIn.getPrevPs()) == 0 && compareChars(methodOut.getD51uCflgDrvSvc(methodIn.getCflgSub() - 1), methodIn.getPrevSvc()) == 0 && compareChars(methodOut.getD51uCflgDrvCau(methodIn.getCflgSub() - 1), methodIn.getPrevCauseCd()) == 0) {
            // cobolCode::SET SAME-TABLE TO TRUE
            methodOut.setSameTable1True();
            // cobolCode::IF D51U-CFLG-CPE-DESC-CD ( CFLG-SUB ) = SPACES
            if ((allSpaces(methodIn.getD51uCflgCpeDescCd(methodIn.getCflgSub() - 1)))) {
                // LITERAL_Y = 'Y'
                methodOut.setSearchComplete(CONSTANTS.LITERAL_Y);
            } else // cobolCode::ELSE
            {
                // cobolCode::IF LK-51U-CPE-DESC-CD = D51U-CFLG-CPE-DESC-CD ( CFLG-SUB )
                if (compareChars(methodIn.getUCpeDescCd51(), methodIn.getD51uCflgCpeDescCd(methodIn.getCflgSub() - 1)) == 0) {
                    // cobolCode::ADD 1 TO WS-NBR-MATCHED
                    methodOut.setNbrMatched((short) (methodOut.getNbrMatched() + (short) 1));
                    // cobolCode::MOVE D51U-CFLG-DRV-POS ( CAUSE-SUB ) TO WS-CFLG-PS
                    methodOut.setCflgPs(methodOut.getD51uCflgDrvPos(methodIn.getCauseSub() - 1));
                    // cobolCode::MOVE D51U-CFLG-DRV-SVC ( CAUSE-SUB ) TO WS-CFLG-SVC
                    methodOut.setCflgSvc(methodOut.getD51uCflgDrvSvc(methodIn.getCauseSub() - 1));
                    // cobolCode::MOVE D51U-CFLG-DRV-CAU ( CAUSE-SUB ) TO WS-CFLG-CAUSE-CD
                    methodOut.setCflgCauseCd(methodOut.getD51uCflgDrvCau(methodIn.getCauseSub() - 1));
                    // LITERAL_Y = 'Y'
                    methodOut.setCpeFlgFound(CONSTANTS.LITERAL_Y);
                }
            }
        }
        return methodOut;
    }

    public int call(ProgramContext ctx, Object[] params) throws Exception {
        O529351uCtx programCtx = (O529351uCtx) ctx;
        int len = params.length;
        if (len > 1 && params[1] != null)
            programCtx.getDfhcommarea().set((Field) params[1]);
        // invoke the process and return rc
        return process(programCtx);
    }

    public int call(ProgramContext ctx, Field... parameters) throws Exception {
        O529351uCtx programCtx = (O529351uCtx) ctx;
        for (int index = 0; index < parameters.length; index++) {
            switch(index) {
                case 1:
                    if (parameters[index] != null) {
                        if (parameters[index] instanceof Dfhcommarea) {
                            programCtx.setDfhcommarea((Dfhcommarea) parameters[index]);
                        } else {
                            programCtx.getDfhcommarea().set(parameters[index]);
                        }
                    }
                    break;
            }
        }
        return process(programCtx);
    }

    public void setFromD529351u(O529351uCtx programCtx, Object[] params) {
        int len = params.length;
        if (len > 0)
            if (params[0] instanceof Field)
                programCtx.getDsmCallArea().setString(((Field) params[0]).toCharArray());
            else
                programCtx.getDsmCallArea().setString((char[]) params[0]);
        if (len > 1)
            if (params[1] instanceof Field)
                programCtx.getVyspi51uCallArea().setString(((Field) params[1]).toCharArray());
            else
                programCtx.getVyspi51uCallArea().setString((char[]) params[1]);
    }
}
/* 
*00***************************************************************
*00  licensed materials - property of united health group        *
*00                                                              *
*00    n o t   r e v i e w e d - comments have not been reviewed *
*00                              by sme                          *
*00***************************************************************
*10***************************************************************
*10  program name       :  o529351u.                             *
*10  business function  :  apply special processing instruction  *
*10                        (spi) translations.                   *
*10  designed by        :  n/a.                                  *
*10  programmed by      :  norcross isd.                         *
*10  date coded         :  april 1993.                           *
*10  type               :  batch.                                *
*10***************************************************************
*20***************************************************************
*20  major program process:                                      *
*20                                                              *
*20  this program uses the new policy, plan rule and plan        *
*20  variation file to determine whether a claim can be selected *
*20  for spi(special processing instructions) ps(place of        *
*20  service)/svc(service) substitition.                         *
*20  the program also applies generic translations to claims.    *
*20***************************************************************
*25***************************************************************
*25  parm info:                                                  *
*25                                                              *
*25  format      : n/a                                           *
*25  description : n/a                                           *
*25***************************************************************
*30***************************************************************
*30  program change log:                                         *
*30                                                              *
*30  pr #       date        level#                               *
*30  -----      -----       -------                              *
*30  jamie      april 02    cpt modifier 'c' needed to equate    *
*30  nixon                  to '2' but the spi logic was never   *
*30                         coded with the enhancement put in    *
*30                         99-01.  this hard-codes the equate.  *
*30                         if other equates are needed, there   *
*30                         is probably a better way to do this. *
*30  bob g.     july'93     added generic translation table      *
*30                         to process generic spi nos.          *
*30                         added paragraph 2015.                *
*30  ss         01/28/04    structured comments.                 *
*30  heidi t.   august 04   add eqi read after tops service code *
*30                         copybook read. if service code not   *
*30                         found, read eqi file to obtain       *
*30                         service code.                        *
*30   heidi t.   august 04  change the logic to read hcpcs codes *
*30                         in range.                            *
*30                                                              *
*30   rob kerr   june 05    removed epd-diag-record. it is no    *
*30                         longer used.                         *
*30   s. nichols july 05    sos issue 05-5863                    *
*30   rel0509    sept 05    field  expansion  sprf - 400001912   *
*30                         changes for sep 2005 release         *
*30  angel  antonio  12/05  add golden rule file for sprf 4-3937 *
*30                         dependent termination letters        *
*30   aman      january 06  removed open and close of files as a *
*30                         part of rta release                  *
*30   aman      january 06  added abend logic for rta r1.2       *
*30   rashmi    january 06  added abend logic for rta r1.2       *
*30 rel0608 refai ahamed sprf#4-8105: validating                 *
*30                   lk-line-service-code is a new service code *
*30                   or not when lk-51u-ccm-n-o-svc-ind = 'n'   *
*30 rel0703 deepthi   adding code to applies special processing  *
*30                   instruction(spi) translations              *
*30 rel0703 shine     fix for defect # 20243                     *
*30 rel0804 amit watts fix for sos 08-8798                       *
*30 relq111 janet caille fix for 10-0862, bumping tbl to 50      *
*30 relq311 rohit     hpsm pm10004822 tops modernization         *
*30         kumar     clean-up warning messgaes                  *
*30 relq311 janet caille fix for 10-0935, trnsl c rev codes      *
*30 relq311 girish    sprf 4-41737 icd10 field expansion         *
*30         velivala  defect fix # 10459                         *
*30 relq212 m.silva  added access to db2 spi tables if spi switch*
*30                  to call spi-db2 tables are turned on        *
*30 relq212 m.silva  fix abend in btmq due to dates conversion   *
*30 relq212 m.silva  addtional changes                           *
*30 relq212 m.silva  qc 3211 changes to move derived ps, svc cd  *
*30                  and cause code                              *
*30 relq212 m.silva  qc 3211 increase the diag occurs to 25      *
*30 relq212 m.silva  qc 4796 fix for asra abend                  *
*30 relq212 m.silva  qc5811  include derived ps, svc-cd and      *
*30                  cause cd in matching criteria               *
*30 relq212 m.silva  qc7401  fixed for regresion defect          *
*30 relq212 m.silva  qc9901  spi rules key matching              *
*30 relq312 rohit     hpsm pm10051935 tops modernization         *
*30         kumar     clean-up warning messgaes                  *
*30                   deleted 9998-goback section along with     *
*30                   perform 9998-goback statements coded with  *
*30                   tag p04822 and 45917c after made the       *
*30                   changes in vyerdump cicscopy.              *
*30                      ==== no code drop ====                  *
*30 relq312 p.parakh mdtr-2012-0520-1a-tops                      *
*30 relq312 p.parakh defect fix 7281 and 7267 - ipa match        *
*30 relq312 d.schein regenerate due to new cobparm defect 7743   *
*30 relq312 p.parakh defect fix 7841                             *
*30 relq412 aneesh   sos 12-2017 fe-spi should not be picked     *
*30         murali   without a match on ipa                      *
*30 relq412m rekha kumari sos 12-2073 code change                *
*30 relq113   chet walkuski    sprf# 4-47477 icd10 e-i           *
*30                            compliance release.qc#1247.       *
*30 relq213  ashutosh     - sprf 4-48111 - icd10 e&i             *
*30          savarni        commercial paper claims release      *
*30                       - diagnosis increased from 4 to 12     *
*30                       - dx pointer increased to  4 bytes     *
*30                       - mpi-dx-point increase to 2 bytes     *
*30 relq413 mcdermott     - sprf 4-57589 - new prime spi logic   *
*30                         will try to read spi with model      *
*30                         policy and plan if slot fields valued*
*30                         if not found, use values passed in   *
*30                         policy and plan                      *
*30 relq413 henderson     - sprf 4-57589 - added backout logic   *
*30                                        for prime spi logic   *
*30 relq413 henderson     - sprf 4-57589 - qc 1618 - addl check  *
*30                                        for plan var not found*
*30  rel14q2  hpsm pm10153810 -gaurav b. - fix for icd fetches   *
*30                                        beyond 9999 for table *
*30                                        fe_spi_rule_icd       *
*30                                      - fix for alm#15752-q114*
*30                                                alm#3903 -q214*
*30 q3-14 d schein     remove call to restart table              *
*30                    dtr mdtr-2014-0425-1a-tops                *
*30                    for fe spi  the following values will     *
*30                    be hardcode to on                         *
*30                    fe_spi_switch, fe_prime_spi_switch=on     *
*30 q3-14 d schein     defect 10489 remove warning messages      *
*30 q1-15 girish       changes for mdtr--2013-1014-1a-tops       *
*30       velivala/    added fix for hpsm pm10172289 to handle   *
*30       p.parakh     more than 9999 icd10 codes                *
*30 relq315 nick       4-70293 claims processing                 *
*30         bukwich    added checks to value ipa-and-gtn-found   *
*30 relq415 abhilasha  fix for sos 15-3411                       *
*30 relq116 manoj      fix for sos 15-3533                       *
*30         ganna      added new checks for ipa & gtn processing *
*30 relq116 manoj      fix for alm #4808 for sos 15-3533         *
*30         ganna      ppa-grp-tab-no checked with spaces        *
*30 rel1703 santosh s  fix for sos 17-3880.                      *
*30 rel17q4 gandharvi  prj116714 pharmacy coupon benefits        *
*30         tandon     added new service codes cb0 - cb9         *
*30 rel18q4 derek      prj145017 internal and customer reporting *
*30                                                              *
*30 rel1909 raj s      prj145017 internal and customer reporting *
*30                         added pos-tier-typ-cd field          *
*30 rel1909 jaspuneet  prj179220 msk logic to handle pri-diag-ind*
*30 rel2002 vasanthan  prj196213 alpha codes- fe spi service code*
*30         santhanam  ranges that start and end with alpha.     *
*30 rel2002 vasanthan  prj196213 -defect de295296. to bypass inst*
*30         santhanam  claims to match cpt ranges.               *
*30 rel2105 ankita     prj272472 - emergent non-emergent project*
*30         agarwal    phase 2 and 3                             *
*30 rel2108 vivek      prb1008113 : o529351u to threadsafe       *
*30         dahiya                                               *
*30 rel2109 y.levitis - prj272209 - designated diagnostic        *
*30                     provider (ddp). added  -                 *
*30                     major diagnostic eligible indicator      *
*30***************************************************************
*40***************************************************************
*40  external called programs:                                   *
*40                                                              *
*40  name                  description              call/link    *
*40  ----                  -----------              ---------    *
*40  m5293opi             output interface            call       *
*40  vp055a00             i/o handler                 call       *
*40  d529351u             dsm for spi table           call       *
*40  d5427rst             gen_sys_rst table           call       *
*40***************************************************************
*50***************************************************************
*50  return codes:                                               *
*50                                                              *
*50  code                  description                           *
*50  ---------------       --------------------------------      *
*50  n/a                   n/a                                   *
*50***************************************************************
*60***************************************************************
*60  files used:                                                 *
*60                                                              *
*60  filename              mode           description            *
*60  --------              ----           ----------------       *
*60  spirules              read           spi rules file         *
*60  planvara              read           plan variation file    *
*60  eqifile               read           service code equate    *
*60                                       initiate file          *
*60***************************************************************
*70***************************************************************
*70  tables and access types:                                    *
*70                                                              *
*70  name                  type           access                 *
*70  --------------        ----           -------                *
*70  n/a                   n/a            n/a                    *
*70***************************************************************
*/
