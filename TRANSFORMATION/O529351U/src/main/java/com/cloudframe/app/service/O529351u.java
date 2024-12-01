package com.cloudframe.app.service;

import com.cloudframe.app.dto.o529351u.O529351uCtx.BuildPlanAltTableInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.MainLineInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ReadEqiFileOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.TranslateSpiRuleOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.GenericTranslationOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ReadPlanAltDb2InCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.StartBrowsePlanvaraInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.TopsCnvsvcFrTo2125DInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.DumpAbendOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.InitializeInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.AddCenturyToDatesInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchCause2150DOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ReadEqiFileInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ReadSpiRulesDb2OutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchSvcOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ReadGenSysSwitchOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.MainLineOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.StartBrowseSpirulesInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ReadNextSpirulesOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SpiRulesProcessOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.StartBrowsePlanvaraOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ReadNextSpirulesInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ReadNextPlanvaraInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchPrv2130DOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SpiRulesProcess2100DInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.CheckServiceCodesInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchIcd92140DInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.InitializeOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.AsktimeFormatimeInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.CheckServiceCodesOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchSvc2120DInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ReadNextPlanvaraOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.MatchingRtnOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.AsktimeFormatimeOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.MainProcessingInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.TopsCnvsvcFrToOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ChiroProcessingInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ReadEqiInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchCause2150DInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.MainProcessingOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchCauseOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ReadSpiRulesInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.NewSpiTranslationInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchPsOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.MatchIpaToPpoaltOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.EndBrowseSpirulesOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.TopsCnvsvcFrToInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.StartBrowseSpirulesOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.PopulatePriDiagOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.TopsCnvsvcFrTo2125DOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.GenericTranslationInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.EndBrowsePlanvaraOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.AddCenturyToDatesOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchCflgOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.BuildPlanAltTableOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.EndBrowseSpirulesInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ContinueProcessOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.WriteToSysmOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchPrv2130DInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchPrvOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.WriteToSysmInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchCflgInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchPrvInCtx;
import com.cloudframe.app.rest.o529351u.Dfhcommarea;
import com.cloudframe.app.dto.o529351u.O529351uCtx.EndBrowsePlanvaraInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ConvertProcToSvcCdInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ReadEqiOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.MatchIpaToPpoalt2160DOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchIcd92140DOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchSvc2120DOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SpiRulesProcess2100DOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ReadSpiRulesOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ReadSpiRulesDb2InCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchPsInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchPs2110DInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchCauseInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.BuildPlanAltTable2020DInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.TranslateSpiRuleInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.NewSpiTranslationOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.MatchIpaToPpoaltInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ConvertProcToSvcCdOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ReadPlanAltFileOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SpiRulesProcessInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.BuildPlanAltTable2020DOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ChiroProcessingOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.CommonIoCallOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchSvcInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchIcd9InCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ReadPlanAltFileInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ContinueProcessInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.MatchIpaToPpoalt2160DInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.MatchingRtnInCtx;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchIcd9OutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.ReadPlanAltDb2OutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.SearchPs2110DOutCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.CommonIoCallInCtx;
import com.cloudframe.app.dto.o529351u.O529351uCtx.PopulatePriDiagInCtx;
import com.cloudframe.app.dto.ProgramContext;

public interface O529351u {

    /**
     * This method is derived from Cobol Paragraph - PROCESS
     *
     * @return Return Code of the this class
     */
    public int process(O529351uCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-MAIN-LINE
     *
     * @return
     */
    public MainLineOutCtx mainLine(MainLineInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 0000-EXIT
     */
    public void exit(O529351uCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1000-INITIALIZE
     *
     * @return
     */
    public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1500-READ-EQI
     *
     * @return
     */
    public ReadEqiOutCtx readEqi(ReadEqiInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2000-MAIN-PROCESSING
     *
     * @return
     */
    public MainProcessingOutCtx mainProcessing(MainProcessingInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2010-READ-PLAN-ALT-FILE
     *
     * @return
     */
    public ReadPlanAltFileOutCtx readPlanAltFile(ReadPlanAltFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2013-NEW-SPI-TRANSLATION
     *
     * @return
     */
    public NewSpiTranslationOutCtx newSpiTranslation(NewSpiTranslationInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2015-GENERIC-TRANSLATION
     *
     * @return
     */
    public GenericTranslationOutCtx genericTranslation(GenericTranslationInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2016-START-BROWSE-PLANVARA
     *
     * @return
     */
    public StartBrowsePlanvaraOutCtx startBrowsePlanvara(StartBrowsePlanvaraInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2017-READ-NEXT-PLANVARA
     *
     * @return
     */
    public ReadNextPlanvaraOutCtx readNextPlanvara(ReadNextPlanvaraInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2018-END-BROWSE-PLANVARA
     *
     * @return
     */
    public EndBrowsePlanvaraOutCtx endBrowsePlanvara(EndBrowsePlanvaraInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2020-BUILD-PLAN-ALT-TABLE
     *
     * @return
     */
    public BuildPlanAltTableOutCtx buildPlanAltTable(BuildPlanAltTableInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2021-ADD-CENTURY-TO-DATES
     *
     * @return
     */
    public AddCenturyToDatesOutCtx addCenturyToDates(AddCenturyToDatesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2030-READ-SPI-RULES
     *
     * @return
     */
    public ReadSpiRulesOutCtx readSpiRules(ReadSpiRulesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2040-TRANSLATE-SPI-RULE
     *
     * @return
     */
    public TranslateSpiRuleOutCtx translateSpiRule(TranslateSpiRuleInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2041-START-BROWSE-SPIRULES
     *
     * @return
     */
    public StartBrowseSpirulesOutCtx startBrowseSpirules(StartBrowseSpirulesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2042-READ-NEXT-SPIRULES
     *
     * @return
     */
    public ReadNextSpirulesOutCtx readNextSpirules(ReadNextSpirulesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2043-END-BROWSE-SPIRULES
     *
     * @return
     */
    public EndBrowseSpirulesOutCtx endBrowseSpirules(EndBrowseSpirulesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100-SPI-RULES-PROCESS
     *
     * @return
     */
    public SpiRulesProcessOutCtx spiRulesProcess(SpiRulesProcessInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2110-SEARCH-PS
     *
     * @return
     */
    public SearchPsOutCtx searchPs(SearchPsInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2120-SEARCH-SVC
     *
     * @return
     */
    public SearchSvcOutCtx searchSvc(SearchSvcInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2125-TOPS-CNVSVC-FR-TO
     *
     * @return
     */
    public TopsCnvsvcFrToOutCtx topsCnvsvcFrTo(TopsCnvsvcFrToInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2130-SEARCH-PRV
     *
     * @return
     */
    public SearchPrvOutCtx searchPrv(SearchPrvInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2140-SEARCH-ICD9
     *
     * @return
     */
    public SearchIcd9OutCtx searchIcd9(SearchIcd9InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2150-SEARCH-CAUSE
     *
     * @return
     */
    public SearchCauseOutCtx searchCause(SearchCauseInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2160-MATCH-IPA-TO-PPOALT
     *
     * @return
     */
    public MatchIpaToPpoaltOutCtx matchIpaToPpoalt(MatchIpaToPpoaltInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2600-CHECK-SERVICE-CODES
     *
     * @return
     */
    public CheckServiceCodesOutCtx checkServiceCodes(CheckServiceCodesInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2650-READ-EQI-FILE
     *
     * @return
     */
    public ReadEqiFileOutCtx readEqiFile(ReadEqiFileInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2650-CONTINUE-PROCESS
     *
     * @return
     */
    public ContinueProcessOutCtx continueProcess(ContinueProcessInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2700-CHIRO-PROCESSING
     *
     * @return
     */
    public ChiroProcessingOutCtx chiroProcessing(ChiroProcessingInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 9960-COMMON-IO-CALL
     *
     * @return
     */
    public CommonIoCallOutCtx commonIoCall(CommonIoCallInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 11100A-WRITE-TO-SYSM SECTION
     *
     * @return
     */
    public WriteToSysmOutCtx writeToSysm(WriteToSysmInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 11101-ASKTIME-FORMATIME
     *
     * @return
     */
    public AsktimeFormatimeOutCtx asktimeFormatime(AsktimeFormatimeInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 8000-DUMP-ABEND SECTION
     *
     * @return
     */
    public DumpAbendOutCtx dumpAbend(O529351uCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - CONVERT-PROC-TO-SVC-CD SECTION
     *
     * @return
     */
    public ConvertProcToSvcCdOutCtx convertProcToSvcCd(ConvertProcToSvcCdInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 1800-READ-GEN-SYS-SWITCH SECTION
     *
     * @return
     */
    public ReadGenSysSwitchOutCtx readGenSysSwitch(O529351uCtx programCtx) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2010D-READ-PLAN-ALT-DB2 SECTION
     *
     * @return
     */
    public ReadPlanAltDb2OutCtx readPlanAltDb2(ReadPlanAltDb2InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2020D-BUILD-PLAN-ALT-TABLE SECTION
     *
     * @return
     */
    public BuildPlanAltTable2020DOutCtx buildPlanAltTable2020D(BuildPlanAltTable2020DInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2030D-READ-SPI-RULES-DB2 SECTION
     *
     * @return
     */
    public ReadSpiRulesDb2OutCtx readSpiRulesDb2(ReadSpiRulesDb2InCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2031D-POPULATE-PRI-DIAG SECTION
     *
     * @return
     */
    public PopulatePriDiagOutCtx populatePriDiag(PopulatePriDiagInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100D-SPI-RULES-PROCESS SECTION
     *
     * @return
     */
    public SpiRulesProcess2100DOutCtx spiRulesProcess2100D(SpiRulesProcess2100DInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2100D-MATCHING-RTN SECTION
     *
     * @return
     */
    public MatchingRtnOutCtx matchingRtn(MatchingRtnInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2110D-SEARCH-PS SECTION
     *
     * @return
     */
    public SearchPs2110DOutCtx searchPs2110D(SearchPs2110DInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2120D-SEARCH-SVC SECTION
     *
     * @return
     */
    public SearchSvc2120DOutCtx searchSvc2120D(SearchSvc2120DInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2125D-TOPS-CNVSVC-FR-TO SECTION
     *
     * @return
     */
    public TopsCnvsvcFrTo2125DOutCtx topsCnvsvcFrTo2125D(TopsCnvsvcFrTo2125DInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2130D-SEARCH-PRV SECTION
     *
     * @return
     */
    public SearchPrv2130DOutCtx searchPrv2130D(SearchPrv2130DInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2140D-SEARCH-ICD9 SECTION
     *
     * @return
     */
    public SearchIcd92140DOutCtx searchIcd92140D(SearchIcd92140DInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2150D-SEARCH-CAUSE SECTION
     *
     * @return
     */
    public SearchCause2150DOutCtx searchCause2150D(SearchCause2150DInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2160D-MATCH-IPA-TO-PPOALT SECTION
     *
     * @return
     */
    public MatchIpaToPpoalt2160DOutCtx matchIpaToPpoalt2160D(MatchIpaToPpoalt2160DInCtx methodIn) throws Exception;

    /**
     * This method is derived from Cobol Paragraph - 2170D-SEARCH-CFLG SECTION
     *
     * @return
     */
    public SearchCflgOutCtx searchCflg(SearchCflgInCtx methodIn) throws Exception;

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
