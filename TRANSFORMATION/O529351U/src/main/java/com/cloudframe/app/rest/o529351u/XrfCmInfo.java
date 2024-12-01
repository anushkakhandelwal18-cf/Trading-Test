package com.cloudframe.app.rest.o529351u;

/**
 *  The class XrfCmInfo is used to handle fields declared in it
 *  @author CloudFrame Inc.
 *  created on 2024-12-01 at 05:44.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

public class XrfCmInfo {

    protected Logger logger = LoggerFactory.getLogger(XrfCmInfo.class);

    /*  Child Field declaration */
    @Size(min = 0, max = 6)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfPlcyCm = "";

    private short xrfDivCm;

    private short xrfClsCm;

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfCancCdCm = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfTefraApply = "";

    private int xrfEffDtCm;

    private int xrfCancDtCm;

    @Size(min = 0, max = 5)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfLglEntyCd = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfAcisEnrpInd = "";

    private BigDecimal xrfEnrpDefPct = BigDecimal.ZERO;

    private BigDecimal xrfMnrpDefPct = BigDecimal.ZERO;

    private BigDecimal xrfMnrpPtPct = BigDecimal.ZERO;

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfSurprsMedBilCd = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfEbdsSetId2 = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfAcnInd = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfUhpInd = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfAiInd = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfEnrpErFacInd = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfErWrapInd = "";

    private short xrfLabPct;

    private short xrfDmePct;

    @Size(min = 0, max = 3)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfBusSegPltfm = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfNmaddrCdCm = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfMcSel = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfPlcyAutpayInd = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfRptCdCm = "";

    @Size(min = 0, max = 4)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfMailCdCm = "";

    @JsonProperty("xrfRpData")
    private XrfRpData xrfRpData = new XrfRpData();

    private int xrfFranchCd;

    private short xrfEbdsCovBase;

    private short xrfEbdsCovMme;

    private short xrfEbdsCovMcr;

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfEbdsSetId = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfAaCm = "";

    @Size(min = 0, max = 6)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfRxCm = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfModCm = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfPcsCm = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfCchCm = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfCapInd = "";

    private short xrfApportionmentPct;

    private short xrfPayloc1;

    private short xrfPayloc2;

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfMnnrpInd = "";

    private short xrfMnnrpPct;

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfIplan = "";

    @Size(min = 0, max = 2)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfObligorInd = "";

    @Size(min = 0, max = 2)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfSharedArg = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfMeInd = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfPteInd = "";

    @Size(min = 0, max = 3)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfProductInd = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfFreelookInd = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfEbrInd = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfLimSvcInd = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfOptOutUbhTier = "";

    private int xrfHraApIndLmt;

    private int xrfHraApFamLmt;

    private int xrfDefaultPoc;

    private int xrfPcntRateJqCodesFound;

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfAppealLangInd = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfProrateIntrvl = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfNbSuppressInd = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfProrateEvent = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfCoreMedPrrAuthCd = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfEnrpErInd = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfEnrpNonErInd = "";

    private int xrfEnrpNonErPct;

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfEhbInd = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String filler01 = "";

    /*  End of Field declaration */
    /**
     * 	Returns the value of xrfPlcyCm
     * 	@return xrfPlcyCm
     */
    public String getXrfPlcyCm() {
        return xrfPlcyCm;
    }

    /**
     *  set variable xrfPlcyCm
     *  @param value
     */
    public void setXrfPlcyCm(String value) {
        xrfPlcyCm = value.trim();
    }

    /**
     * 	Returns the value of xrfDivCm
     * 	@return xrfDivCm
     */
    public short getXrfDivCm() {
        return xrfDivCm;
    }

    /**
     *  	Updates XrfDivCm with the value
     * 	@param number
     */
    public void setXrfDivCm(short number) {
        xrfDivCm = number;
    }

    /**
     * 	Returns the value of xrfClsCm
     * 	@return xrfClsCm
     */
    public short getXrfClsCm() {
        return xrfClsCm;
    }

    /**
     *  	Updates XrfClsCm with the value
     * 	@param number
     */
    public void setXrfClsCm(short number) {
        xrfClsCm = number;
    }

    /**
     * 	Returns the value of xrfCancCdCm
     * 	@return xrfCancCdCm
     */
    public String getXrfCancCdCm() {
        return xrfCancCdCm;
    }

    /**
     *  set variable xrfCancCdCm
     *  @param value
     */
    public void setXrfCancCdCm(String value) {
        xrfCancCdCm = value.trim();
    }

    /**
     * 	Returns the value of xrfTefraApply
     * 	@return xrfTefraApply
     */
    public String getXrfTefraApply() {
        return xrfTefraApply;
    }

    /**
     *  set variable xrfTefraApply
     *  @param value
     */
    public void setXrfTefraApply(String value) {
        xrfTefraApply = value.trim();
    }

    /**
     * 	Returns the value of xrfEffDtCm
     * 	@return xrfEffDtCm
     */
    public int getXrfEffDtCm() {
        return xrfEffDtCm;
    }

    /**
     *  	Updates XrfEffDtCm with the value
     * 	@param number
     */
    public void setXrfEffDtCm(int number) {
        xrfEffDtCm = number;
    }

    /**
     * 	Returns the value of xrfCancDtCm
     * 	@return xrfCancDtCm
     */
    public int getXrfCancDtCm() {
        return xrfCancDtCm;
    }

    /**
     *  	Updates XrfCancDtCm with the value
     * 	@param number
     */
    public void setXrfCancDtCm(int number) {
        xrfCancDtCm = number;
    }

    /**
     * 	Returns the value of xrfLglEntyCd
     * 	@return xrfLglEntyCd
     */
    public String getXrfLglEntyCd() {
        return xrfLglEntyCd;
    }

    /**
     *  set variable xrfLglEntyCd
     *  @param value
     */
    public void setXrfLglEntyCd(String value) {
        xrfLglEntyCd = value.trim();
    }

    /**
     * 	Returns the value of xrfAcisEnrpInd
     * 	@return xrfAcisEnrpInd
     */
    public String getXrfAcisEnrpInd() {
        return xrfAcisEnrpInd;
    }

    /**
     *  set variable xrfAcisEnrpInd
     *  @param value
     */
    public void setXrfAcisEnrpInd(String value) {
        xrfAcisEnrpInd = value.trim();
    }

    public BigDecimal getXrfEnrpDefPct() {
        return xrfEnrpDefPct;
    }

    /**
     *  	Update XrfEnrpDefPct with the passed number
     * 	@param number
     */
    public void setXrfEnrpDefPct(BigDecimal number) {
        xrfEnrpDefPct = number;
    }

    public BigDecimal getXrfMnrpDefPct() {
        return xrfMnrpDefPct;
    }

    /**
     *  	Update XrfMnrpDefPct with the passed number
     * 	@param number
     */
    public void setXrfMnrpDefPct(BigDecimal number) {
        xrfMnrpDefPct = number;
    }

    public BigDecimal getXrfMnrpPtPct() {
        return xrfMnrpPtPct;
    }

    /**
     *  	Update XrfMnrpPtPct with the passed number
     * 	@param number
     */
    public void setXrfMnrpPtPct(BigDecimal number) {
        xrfMnrpPtPct = number;
    }

    /**
     * 	Returns the value of xrfSurprsMedBilCd
     * 	@return xrfSurprsMedBilCd
     */
    public String getXrfSurprsMedBilCd() {
        return xrfSurprsMedBilCd;
    }

    /**
     *  set variable xrfSurprsMedBilCd
     *  @param value
     */
    public void setXrfSurprsMedBilCd(String value) {
        xrfSurprsMedBilCd = value.trim();
    }

    /**
     * 	Returns the value of xrfEbdsSetId2
     * 	@return xrfEbdsSetId2
     */
    public String getXrfEbdsSetId2() {
        return xrfEbdsSetId2;
    }

    /**
     *  set variable xrfEbdsSetId2
     *  @param value
     */
    public void setXrfEbdsSetId2(String value) {
        xrfEbdsSetId2 = value.trim();
    }

    /**
     * 	Returns the value of xrfAcnInd
     * 	@return xrfAcnInd
     */
    public String getXrfAcnInd() {
        return xrfAcnInd;
    }

    /**
     *  set variable xrfAcnInd
     *  @param value
     */
    public void setXrfAcnInd(String value) {
        xrfAcnInd = value.trim();
    }

    /**
     * 	Returns the value of xrfUhpInd
     * 	@return xrfUhpInd
     */
    public String getXrfUhpInd() {
        return xrfUhpInd;
    }

    /**
     *  set variable xrfUhpInd
     *  @param value
     */
    public void setXrfUhpInd(String value) {
        xrfUhpInd = value.trim();
    }

    /**
     * 	Returns the value of xrfAiInd
     * 	@return xrfAiInd
     */
    public String getXrfAiInd() {
        return xrfAiInd;
    }

    /**
     *  set variable xrfAiInd
     *  @param value
     */
    public void setXrfAiInd(String value) {
        xrfAiInd = value.trim();
    }

    /**
     * 	Returns the value of xrfEnrpErFacInd
     * 	@return xrfEnrpErFacInd
     */
    public String getXrfEnrpErFacInd() {
        return xrfEnrpErFacInd;
    }

    /**
     *  set variable xrfEnrpErFacInd
     *  @param value
     */
    public void setXrfEnrpErFacInd(String value) {
        xrfEnrpErFacInd = value.trim();
    }

    /**
     * 	Returns the value of xrfErWrapInd
     * 	@return xrfErWrapInd
     */
    public String getXrfErWrapInd() {
        return xrfErWrapInd;
    }

    /**
     *  set variable xrfErWrapInd
     *  @param value
     */
    public void setXrfErWrapInd(String value) {
        xrfErWrapInd = value.trim();
    }

    public short getXrfLabPct() {
        return xrfLabPct;
    }

    /**
     *  	Update XrfLabPct with the passed value
     * 	@param number
     */
    public void setXrfLabPct(short number) {
        xrfLabPct = number;
    }

    public short getXrfDmePct() {
        return xrfDmePct;
    }

    /**
     *  	Update XrfDmePct with the passed value
     * 	@param number
     */
    public void setXrfDmePct(short number) {
        xrfDmePct = number;
    }

    /**
     * 	Returns the value of xrfBusSegPltfm
     * 	@return xrfBusSegPltfm
     */
    public String getXrfBusSegPltfm() {
        return xrfBusSegPltfm;
    }

    /**
     *  set variable xrfBusSegPltfm
     *  @param value
     */
    public void setXrfBusSegPltfm(String value) {
        xrfBusSegPltfm = value.trim();
    }

    /**
     * 	Returns the value of xrfNmaddrCdCm
     * 	@return xrfNmaddrCdCm
     */
    public String getXrfNmaddrCdCm() {
        return xrfNmaddrCdCm;
    }

    /**
     *  set variable xrfNmaddrCdCm
     *  @param value
     */
    public void setXrfNmaddrCdCm(String value) {
        xrfNmaddrCdCm = value.trim();
    }

    /**
     * 	Returns the value of xrfMcSel
     * 	@return xrfMcSel
     */
    public String getXrfMcSel() {
        return xrfMcSel;
    }

    /**
     *  set variable xrfMcSel
     *  @param value
     */
    public void setXrfMcSel(String value) {
        xrfMcSel = value.trim();
    }

    /**
     * 	Returns the value of xrfPlcyAutpayInd
     * 	@return xrfPlcyAutpayInd
     */
    public String getXrfPlcyAutpayInd() {
        return xrfPlcyAutpayInd;
    }

    /**
     *  set variable xrfPlcyAutpayInd
     *  @param value
     */
    public void setXrfPlcyAutpayInd(String value) {
        xrfPlcyAutpayInd = value.trim();
    }

    /**
     * 	Returns the value of xrfRptCdCm
     * 	@return xrfRptCdCm
     */
    public String getXrfRptCdCm() {
        return xrfRptCdCm;
    }

    /**
     *  set variable xrfRptCdCm
     *  @param value
     */
    public void setXrfRptCdCm(String value) {
        xrfRptCdCm = value.trim();
    }

    /**
     * 	Returns the value of xrfMailCdCm
     * 	@return xrfMailCdCm
     */
    public String getXrfMailCdCm() {
        return xrfMailCdCm;
    }

    /**
     *  set variable xrfMailCdCm
     *  @param value
     */
    public void setXrfMailCdCm(String value) {
        xrfMailCdCm = value.trim();
    }

    /**
     * 	Returns the value of xrfRpData
     * 	@return xrfRpData
     */
    public XrfRpData getXrfRpData() {
        return xrfRpData;
    }

    // *** setGroup.txt starts
    /**
     *  	Update XrfRpData with the passed value
     * 	@param value
     */
    @JsonIgnore
public void setXrfRpData(com.cloudframe.app.dto.o529351u.XrfRpData value) throws CFException {
        xrfRpData.populateFrom(value);
    }

    /**
     *  	Update XrfRpData with the passed value
     * 	@param value
     */
    public void setXrfRpData(XrfRpData value) {
        xrfRpData = value;
    }

    // *** setGroup.txt ends
    /**
     * 	Returns the value of xrfFranchCd
     * 	@return xrfFranchCd
     */
    public int getXrfFranchCd() {
        return xrfFranchCd;
    }

    /**
     *  	Updates XrfFranchCd with the value
     * 	@param number
     */
    public void setXrfFranchCd(int number) {
        xrfFranchCd = number;
    }

    /**
     * 	Returns the value of xrfEbdsCovBase
     * 	@return xrfEbdsCovBase
     */
    public short getXrfEbdsCovBase() {
        return xrfEbdsCovBase;
    }

    /**
     *  	Updates XrfEbdsCovBase with the value
     * 	@param number
     */
    public void setXrfEbdsCovBase(short number) {
        xrfEbdsCovBase = number;
    }

    /**
     * 	Returns the value of xrfEbdsCovMme
     * 	@return xrfEbdsCovMme
     */
    public short getXrfEbdsCovMme() {
        return xrfEbdsCovMme;
    }

    /**
     *  	Updates XrfEbdsCovMme with the value
     * 	@param number
     */
    public void setXrfEbdsCovMme(short number) {
        xrfEbdsCovMme = number;
    }

    /**
     * 	Returns the value of xrfEbdsCovMcr
     * 	@return xrfEbdsCovMcr
     */
    public short getXrfEbdsCovMcr() {
        return xrfEbdsCovMcr;
    }

    /**
     *  	Updates XrfEbdsCovMcr with the value
     * 	@param number
     */
    public void setXrfEbdsCovMcr(short number) {
        xrfEbdsCovMcr = number;
    }

    /**
     * 	Returns the value of xrfEbdsSetId
     * 	@return xrfEbdsSetId
     */
    public String getXrfEbdsSetId() {
        return xrfEbdsSetId;
    }

    /**
     *  set variable xrfEbdsSetId
     *  @param value
     */
    public void setXrfEbdsSetId(String value) {
        xrfEbdsSetId = value.trim();
    }

    /**
     * 	Returns the value of xrfAaCm
     * 	@return xrfAaCm
     */
    public String getXrfAaCm() {
        return xrfAaCm;
    }

    /**
     *  set variable xrfAaCm
     *  @param value
     */
    public void setXrfAaCm(String value) {
        xrfAaCm = value.trim();
    }

    /**
     * 	Returns the value of xrfRxCm
     * 	@return xrfRxCm
     */
    public String getXrfRxCm() {
        return xrfRxCm;
    }

    /**
     *  set variable xrfRxCm
     *  @param value
     */
    public void setXrfRxCm(String value) {
        xrfRxCm = value.trim();
    }

    /**
     * 	Returns the value of xrfModCm
     * 	@return xrfModCm
     */
    public String getXrfModCm() {
        return xrfModCm;
    }

    /**
     *  set variable xrfModCm
     *  @param value
     */
    public void setXrfModCm(String value) {
        xrfModCm = value.trim();
    }

    /**
     * 	Returns the value of xrfPcsCm
     * 	@return xrfPcsCm
     */
    public String getXrfPcsCm() {
        return xrfPcsCm;
    }

    /**
     *  set variable xrfPcsCm
     *  @param value
     */
    public void setXrfPcsCm(String value) {
        xrfPcsCm = value.trim();
    }

    /**
     * 	Returns the value of xrfCchCm
     * 	@return xrfCchCm
     */
    public String getXrfCchCm() {
        return xrfCchCm;
    }

    /**
     *  set variable xrfCchCm
     *  @param value
     */
    public void setXrfCchCm(String value) {
        xrfCchCm = value.trim();
    }

    /**
     * 	Returns the value of xrfCapInd
     * 	@return xrfCapInd
     */
    public String getXrfCapInd() {
        return xrfCapInd;
    }

    /**
     *  set variable xrfCapInd
     *  @param value
     */
    public void setXrfCapInd(String value) {
        xrfCapInd = value.trim();
    }

    public short getXrfApportionmentPct() {
        return xrfApportionmentPct;
    }

    /**
     *  	Update XrfApportionmentPct with the passed value
     * 	@param number
     */
    public void setXrfApportionmentPct(short number) {
        xrfApportionmentPct = number;
    }

    public short getXrfPayloc1() {
        return xrfPayloc1;
    }

    /**
     *  	Update XrfPayloc1 with the passed value
     * 	@param number
     */
    public void setXrfPayloc1(short number) {
        xrfPayloc1 = number;
    }

    public short getXrfPayloc2() {
        return xrfPayloc2;
    }

    /**
     *  	Update XrfPayloc2 with the passed value
     * 	@param number
     */
    public void setXrfPayloc2(short number) {
        xrfPayloc2 = number;
    }

    /**
     * 	Returns the value of xrfMnnrpInd
     * 	@return xrfMnnrpInd
     */
    public String getXrfMnnrpInd() {
        return xrfMnnrpInd;
    }

    /**
     *  set variable xrfMnnrpInd
     *  @param value
     */
    public void setXrfMnnrpInd(String value) {
        xrfMnnrpInd = value.trim();
    }

    public short getXrfMnnrpPct() {
        return xrfMnnrpPct;
    }

    /**
     *  	Update XrfMnnrpPct with the passed value
     * 	@param number
     */
    public void setXrfMnnrpPct(short number) {
        xrfMnnrpPct = number;
    }

    /**
     * 	Returns the value of xrfIplan
     * 	@return xrfIplan
     */
    public String getXrfIplan() {
        return xrfIplan;
    }

    /**
     *  set variable xrfIplan
     *  @param value
     */
    public void setXrfIplan(String value) {
        xrfIplan = value.trim();
    }

    /**
     * 	Returns the value of xrfObligorInd
     * 	@return xrfObligorInd
     */
    public String getXrfObligorInd() {
        return xrfObligorInd;
    }

    /**
     *  set variable xrfObligorInd
     *  @param value
     */
    public void setXrfObligorInd(String value) {
        xrfObligorInd = value.trim();
    }

    /**
     * 	Returns the value of xrfSharedArg
     * 	@return xrfSharedArg
     */
    public String getXrfSharedArg() {
        return xrfSharedArg;
    }

    /**
     *  set variable xrfSharedArg
     *  @param value
     */
    public void setXrfSharedArg(String value) {
        xrfSharedArg = value.trim();
    }

    /**
     * 	Returns the value of xrfMeInd
     * 	@return xrfMeInd
     */
    public String getXrfMeInd() {
        return xrfMeInd;
    }

    /**
     *  set variable xrfMeInd
     *  @param value
     */
    public void setXrfMeInd(String value) {
        xrfMeInd = value.trim();
    }

    /**
     * 	Returns the value of xrfPteInd
     * 	@return xrfPteInd
     */
    public String getXrfPteInd() {
        return xrfPteInd;
    }

    /**
     *  set variable xrfPteInd
     *  @param value
     */
    public void setXrfPteInd(String value) {
        xrfPteInd = value.trim();
    }

    /**
     * 	Returns the value of xrfProductInd
     * 	@return xrfProductInd
     */
    public String getXrfProductInd() {
        return xrfProductInd;
    }

    /**
     *  set variable xrfProductInd
     *  @param value
     */
    public void setXrfProductInd(String value) {
        xrfProductInd = value.trim();
    }

    /**
     * 	Returns the value of xrfFreelookInd
     * 	@return xrfFreelookInd
     */
    public String getXrfFreelookInd() {
        return xrfFreelookInd;
    }

    /**
     *  set variable xrfFreelookInd
     *  @param value
     */
    public void setXrfFreelookInd(String value) {
        xrfFreelookInd = value.trim();
    }

    /**
     * 	Returns the value of xrfEbrInd
     * 	@return xrfEbrInd
     */
    public String getXrfEbrInd() {
        return xrfEbrInd;
    }

    /**
     *  set variable xrfEbrInd
     *  @param value
     */
    public void setXrfEbrInd(String value) {
        xrfEbrInd = value.trim();
    }

    /**
     * 	Returns the value of xrfLimSvcInd
     * 	@return xrfLimSvcInd
     */
    public String getXrfLimSvcInd() {
        return xrfLimSvcInd;
    }

    /**
     *  set variable xrfLimSvcInd
     *  @param value
     */
    public void setXrfLimSvcInd(String value) {
        xrfLimSvcInd = value.trim();
    }

    /**
     * 	Returns the value of xrfOptOutUbhTier
     * 	@return xrfOptOutUbhTier
     */
    public String getXrfOptOutUbhTier() {
        return xrfOptOutUbhTier;
    }

    /**
     *  set variable xrfOptOutUbhTier
     *  @param value
     */
    public void setXrfOptOutUbhTier(String value) {
        xrfOptOutUbhTier = value.trim();
    }

    public int getXrfHraApIndLmt() {
        return xrfHraApIndLmt;
    }

    /**
     *  	Update XrfHraApIndLmt with the passed value
     * 	@param number
     */
    public void setXrfHraApIndLmt(int number) {
        xrfHraApIndLmt = number;
    }

    public int getXrfHraApFamLmt() {
        return xrfHraApFamLmt;
    }

    /**
     *  	Update XrfHraApFamLmt with the passed value
     * 	@param number
     */
    public void setXrfHraApFamLmt(int number) {
        xrfHraApFamLmt = number;
    }

    /**
     * 	Returns the value of xrfDefaultPoc
     * 	@return xrfDefaultPoc
     */
    public int getXrfDefaultPoc() {
        return xrfDefaultPoc;
    }

    /**
     *  	Updates XrfDefaultPoc with the value
     * 	@param number
     */
    public void setXrfDefaultPoc(int number) {
        xrfDefaultPoc = number;
    }

    /**
     * 	Returns the value of xrfPcntRateJqCodesFound
     * 	@return xrfPcntRateJqCodesFound
     */
    public int getXrfPcntRateJqCodesFound() {
        return xrfPcntRateJqCodesFound;
    }

    /**
     *  	Updates XrfPcntRateJqCodesFound with the value
     * 	@param number
     */
    public void setXrfPcntRateJqCodesFound(int number) {
        xrfPcntRateJqCodesFound = number;
    }

    /**
     * 	Returns the value of xrfAppealLangInd
     * 	@return xrfAppealLangInd
     */
    public String getXrfAppealLangInd() {
        return xrfAppealLangInd;
    }

    /**
     *  set variable xrfAppealLangInd
     *  @param value
     */
    public void setXrfAppealLangInd(String value) {
        xrfAppealLangInd = value.trim();
    }

    /**
     * 	Returns the value of xrfProrateIntrvl
     * 	@return xrfProrateIntrvl
     */
    public String getXrfProrateIntrvl() {
        return xrfProrateIntrvl;
    }

    /**
     *  set variable xrfProrateIntrvl
     *  @param value
     */
    public void setXrfProrateIntrvl(String value) {
        xrfProrateIntrvl = value.trim();
    }

    /**
     * 	Returns the value of xrfNbSuppressInd
     * 	@return xrfNbSuppressInd
     */
    public String getXrfNbSuppressInd() {
        return xrfNbSuppressInd;
    }

    /**
     *  set variable xrfNbSuppressInd
     *  @param value
     */
    public void setXrfNbSuppressInd(String value) {
        xrfNbSuppressInd = value.trim();
    }

    /**
     * 	Returns the value of xrfProrateEvent
     * 	@return xrfProrateEvent
     */
    public String getXrfProrateEvent() {
        return xrfProrateEvent;
    }

    /**
     *  set variable xrfProrateEvent
     *  @param value
     */
    public void setXrfProrateEvent(String value) {
        xrfProrateEvent = value.trim();
    }

    /**
     * 	Returns the value of xrfCoreMedPrrAuthCd
     * 	@return xrfCoreMedPrrAuthCd
     */
    public String getXrfCoreMedPrrAuthCd() {
        return xrfCoreMedPrrAuthCd;
    }

    /**
     *  set variable xrfCoreMedPrrAuthCd
     *  @param value
     */
    public void setXrfCoreMedPrrAuthCd(String value) {
        xrfCoreMedPrrAuthCd = value.trim();
    }

    /**
     * 	Returns the value of xrfEnrpErInd
     * 	@return xrfEnrpErInd
     */
    public String getXrfEnrpErInd() {
        return xrfEnrpErInd;
    }

    /**
     *  set variable xrfEnrpErInd
     *  @param value
     */
    public void setXrfEnrpErInd(String value) {
        xrfEnrpErInd = value.trim();
    }

    /**
     * 	Returns the value of xrfEnrpNonErInd
     * 	@return xrfEnrpNonErInd
     */
    public String getXrfEnrpNonErInd() {
        return xrfEnrpNonErInd;
    }

    /**
     *  set variable xrfEnrpNonErInd
     *  @param value
     */
    public void setXrfEnrpNonErInd(String value) {
        xrfEnrpNonErInd = value.trim();
    }

    /**
     * 	Returns the value of xrfEnrpNonErPct
     * 	@return xrfEnrpNonErPct
     */
    public int getXrfEnrpNonErPct() {
        return xrfEnrpNonErPct;
    }

    /**
     *  	Updates XrfEnrpNonErPct with the value
     * 	@param number
     */
    public void setXrfEnrpNonErPct(int number) {
        xrfEnrpNonErPct = number;
    }

    /**
     * 	Returns the value of xrfEhbInd
     * 	@return xrfEhbInd
     */
    public String getXrfEhbInd() {
        return xrfEhbInd;
    }

    /**
     *  set variable xrfEhbInd
     *  @param value
     */
    public void setXrfEhbInd(String value) {
        xrfEhbInd = value.trim();
    }

    /**
     * 	Returns the value of filler01
     * 	@return filler01
     */
    public String getFiller01() {
        return filler01;
    }

    /**
     *  set variable filler01
     *  @param value
     */
    public void setFiller01(String value) {
        filler01 = value.trim();
    }

    @JsonIgnore
public void setXrfCmInfo(com.cloudframe.app.dto.o529351u.XrfCmInfo xrfCmInfo) throws CFException {
        if (xrfPlcyCm != null && !xrfPlcyCm.isEmpty()) {
            xrfCmInfo.setXrfPlcyCm(xrfPlcyCm.toCharArray());
        }
        xrfCmInfo.setXrfDivCm(xrfDivCm);
        xrfCmInfo.setXrfClsCm(xrfClsCm);
        if (xrfCancCdCm != null && !xrfCancCdCm.isEmpty()) {
            xrfCmInfo.setXrfCancCdCm(xrfCancCdCm.toCharArray());
        }
        if (xrfTefraApply != null && !xrfTefraApply.isEmpty()) {
            xrfCmInfo.setXrfTefraApply(xrfTefraApply.toCharArray());
        }
        xrfCmInfo.setXrfEffDtCm(xrfEffDtCm);
        xrfCmInfo.setXrfCancDtCm(xrfCancDtCm);
        if (xrfLglEntyCd != null && !xrfLglEntyCd.isEmpty()) {
            xrfCmInfo.setXrfLglEntyCd(xrfLglEntyCd.toCharArray());
        }
        if (xrfAcisEnrpInd != null && !xrfAcisEnrpInd.isEmpty()) {
            xrfCmInfo.setXrfAcisEnrpInd(xrfAcisEnrpInd.toCharArray());
        }
        xrfCmInfo.setXrfEnrpDefPct(xrfEnrpDefPct);
        xrfCmInfo.setXrfMnrpDefPct(xrfMnrpDefPct);
        xrfCmInfo.setXrfMnrpPtPct(xrfMnrpPtPct);
        if (xrfSurprsMedBilCd != null && !xrfSurprsMedBilCd.isEmpty()) {
            xrfCmInfo.setXrfSurprsMedBilCd(xrfSurprsMedBilCd.toCharArray());
        }
        if (xrfEbdsSetId2 != null && !xrfEbdsSetId2.isEmpty()) {
            xrfCmInfo.setXrfEbdsSetId2(xrfEbdsSetId2.toCharArray());
        }
        if (xrfAcnInd != null && !xrfAcnInd.isEmpty()) {
            xrfCmInfo.setXrfAcnInd(xrfAcnInd.toCharArray());
        }
        if (xrfUhpInd != null && !xrfUhpInd.isEmpty()) {
            xrfCmInfo.setXrfUhpInd(xrfUhpInd.toCharArray());
        }
        if (xrfAiInd != null && !xrfAiInd.isEmpty()) {
            xrfCmInfo.setXrfAiInd(xrfAiInd.toCharArray());
        }
        if (xrfEnrpErFacInd != null && !xrfEnrpErFacInd.isEmpty()) {
            xrfCmInfo.setXrfEnrpErFacInd(xrfEnrpErFacInd.toCharArray());
        }
        if (xrfErWrapInd != null && !xrfErWrapInd.isEmpty()) {
            xrfCmInfo.setXrfErWrapInd(xrfErWrapInd.toCharArray());
        }
        xrfCmInfo.setXrfLabPct(xrfLabPct);
        xrfCmInfo.setXrfDmePct(xrfDmePct);
        if (xrfBusSegPltfm != null && !xrfBusSegPltfm.isEmpty()) {
            xrfCmInfo.setXrfBusSegPltfm(xrfBusSegPltfm.toCharArray());
        }
        if (xrfNmaddrCdCm != null && !xrfNmaddrCdCm.isEmpty()) {
            xrfCmInfo.setXrfNmaddrCdCm(xrfNmaddrCdCm.toCharArray());
        }
        if (xrfMcSel != null && !xrfMcSel.isEmpty()) {
            xrfCmInfo.setXrfMcSel(xrfMcSel.toCharArray());
        }
        if (xrfPlcyAutpayInd != null && !xrfPlcyAutpayInd.isEmpty()) {
            xrfCmInfo.setXrfPlcyAutpayInd(xrfPlcyAutpayInd.toCharArray());
        }
        if (xrfRptCdCm != null && !xrfRptCdCm.isEmpty()) {
            xrfCmInfo.setXrfRptCdCm(xrfRptCdCm.toCharArray());
        }
        if (xrfMailCdCm != null && !xrfMailCdCm.isEmpty()) {
            xrfCmInfo.setXrfMailCdCm(xrfMailCdCm.toCharArray());
        }
        xrfRpData.setXrfRpData(xrfCmInfo.getXrfRpData());
        xrfCmInfo.setXrfFranchCd(xrfFranchCd);
        xrfCmInfo.setXrfEbdsCovBase(xrfEbdsCovBase);
        xrfCmInfo.setXrfEbdsCovMme(xrfEbdsCovMme);
        xrfCmInfo.setXrfEbdsCovMcr(xrfEbdsCovMcr);
        if (xrfEbdsSetId != null && !xrfEbdsSetId.isEmpty()) {
            xrfCmInfo.setXrfEbdsSetId(xrfEbdsSetId.toCharArray());
        }
        if (xrfAaCm != null && !xrfAaCm.isEmpty()) {
            xrfCmInfo.setXrfAaCm(xrfAaCm.toCharArray());
        }
        if (xrfRxCm != null && !xrfRxCm.isEmpty()) {
            xrfCmInfo.setXrfRxCm(xrfRxCm.toCharArray());
        }
        if (xrfModCm != null && !xrfModCm.isEmpty()) {
            xrfCmInfo.setXrfModCm(xrfModCm.toCharArray());
        }
        if (xrfPcsCm != null && !xrfPcsCm.isEmpty()) {
            xrfCmInfo.setXrfPcsCm(xrfPcsCm.toCharArray());
        }
        if (xrfCchCm != null && !xrfCchCm.isEmpty()) {
            xrfCmInfo.setXrfCchCm(xrfCchCm.toCharArray());
        }
        if (xrfCapInd != null && !xrfCapInd.isEmpty()) {
            xrfCmInfo.setXrfCapInd(xrfCapInd.toCharArray());
        }
        xrfCmInfo.setXrfApportionmentPct(xrfApportionmentPct);
        xrfCmInfo.setXrfPayloc1(xrfPayloc1);
        xrfCmInfo.setXrfPayloc2(xrfPayloc2);
        if (xrfMnnrpInd != null && !xrfMnnrpInd.isEmpty()) {
            xrfCmInfo.setXrfMnnrpInd(xrfMnnrpInd.toCharArray());
        }
        xrfCmInfo.setXrfMnnrpPct(xrfMnnrpPct);
        if (xrfIplan != null && !xrfIplan.isEmpty()) {
            xrfCmInfo.setXrfIplan(xrfIplan.toCharArray());
        }
        if (xrfObligorInd != null && !xrfObligorInd.isEmpty()) {
            xrfCmInfo.setXrfObligorInd(xrfObligorInd.toCharArray());
        }
        if (xrfSharedArg != null && !xrfSharedArg.isEmpty()) {
            xrfCmInfo.setXrfSharedArg(xrfSharedArg.toCharArray());
        }
        if (xrfMeInd != null && !xrfMeInd.isEmpty()) {
            xrfCmInfo.setXrfMeInd(xrfMeInd.toCharArray());
        }
        if (xrfPteInd != null && !xrfPteInd.isEmpty()) {
            xrfCmInfo.setXrfPteInd(xrfPteInd.toCharArray());
        }
        if (xrfProductInd != null && !xrfProductInd.isEmpty()) {
            xrfCmInfo.setXrfProductInd(xrfProductInd.toCharArray());
        }
        if (xrfFreelookInd != null && !xrfFreelookInd.isEmpty()) {
            xrfCmInfo.setXrfFreelookInd(xrfFreelookInd.toCharArray());
        }
        if (xrfEbrInd != null && !xrfEbrInd.isEmpty()) {
            xrfCmInfo.setXrfEbrInd(xrfEbrInd.toCharArray());
        }
        if (xrfLimSvcInd != null && !xrfLimSvcInd.isEmpty()) {
            xrfCmInfo.setXrfLimSvcInd(xrfLimSvcInd.toCharArray());
        }
        if (xrfOptOutUbhTier != null && !xrfOptOutUbhTier.isEmpty()) {
            xrfCmInfo.setXrfOptOutUbhTier(xrfOptOutUbhTier.toCharArray());
        }
        xrfCmInfo.setXrfHraApIndLmt(xrfHraApIndLmt);
        xrfCmInfo.setXrfHraApFamLmt(xrfHraApFamLmt);
        xrfCmInfo.setXrfDefaultPoc(xrfDefaultPoc);
        xrfCmInfo.setXrfPcntRateJqCodesFound(xrfPcntRateJqCodesFound);
        if (xrfAppealLangInd != null && !xrfAppealLangInd.isEmpty()) {
            xrfCmInfo.setXrfAppealLangInd(xrfAppealLangInd.toCharArray());
        }
        if (xrfProrateIntrvl != null && !xrfProrateIntrvl.isEmpty()) {
            xrfCmInfo.setXrfProrateIntrvl(xrfProrateIntrvl.toCharArray());
        }
        if (xrfNbSuppressInd != null && !xrfNbSuppressInd.isEmpty()) {
            xrfCmInfo.setXrfNbSuppressInd(xrfNbSuppressInd.toCharArray());
        }
        if (xrfProrateEvent != null && !xrfProrateEvent.isEmpty()) {
            xrfCmInfo.setXrfProrateEvent(xrfProrateEvent.toCharArray());
        }
        if (xrfCoreMedPrrAuthCd != null && !xrfCoreMedPrrAuthCd.isEmpty()) {
            xrfCmInfo.setXrfCoreMedPrrAuthCd(xrfCoreMedPrrAuthCd.toCharArray());
        }
        if (xrfEnrpErInd != null && !xrfEnrpErInd.isEmpty()) {
            xrfCmInfo.setXrfEnrpErInd(xrfEnrpErInd.toCharArray());
        }
        if (xrfEnrpNonErInd != null && !xrfEnrpNonErInd.isEmpty()) {
            xrfCmInfo.setXrfEnrpNonErInd(xrfEnrpNonErInd.toCharArray());
        }
        xrfCmInfo.setXrfEnrpNonErPct(xrfEnrpNonErPct);
        if (xrfEhbInd != null && !xrfEhbInd.isEmpty()) {
            xrfCmInfo.setXrfEhbInd(xrfEhbInd.toCharArray());
        }
        if (filler01 != null && !filler01.isEmpty()) {
            xrfCmInfo.setFiller01(filler01.toCharArray());
        }
    }

    @JsonIgnore
public void populateFrom(com.cloudframe.app.dto.o529351u.XrfCmInfo xrfCmInfo) throws CFException {
        setXrfPlcyCm(String.valueOf(xrfCmInfo.getXrfPlcyCm()));
        setXrfDivCm(xrfCmInfo.getXrfDivCm());
        setXrfClsCm(xrfCmInfo.getXrfClsCm());
        setXrfCancCdCm(String.valueOf(xrfCmInfo.getXrfCancCdCm()));
        setXrfTefraApply(String.valueOf(xrfCmInfo.getXrfTefraApply()));
        setXrfEffDtCm(xrfCmInfo.getXrfEffDtCm());
        setXrfCancDtCm(xrfCmInfo.getXrfCancDtCm());
        setXrfLglEntyCd(String.valueOf(xrfCmInfo.getXrfLglEntyCd()));
        setXrfAcisEnrpInd(String.valueOf(xrfCmInfo.getXrfAcisEnrpInd()));
        setXrfEnrpDefPct(xrfCmInfo.getXrfEnrpDefPct());
        setXrfMnrpDefPct(xrfCmInfo.getXrfMnrpDefPct());
        setXrfMnrpPtPct(xrfCmInfo.getXrfMnrpPtPct());
        setXrfSurprsMedBilCd(String.valueOf(xrfCmInfo.getXrfSurprsMedBilCd()));
        setXrfEbdsSetId2(String.valueOf(xrfCmInfo.getXrfEbdsSetId2()));
        setXrfAcnInd(String.valueOf(xrfCmInfo.getXrfAcnInd()));
        setXrfUhpInd(String.valueOf(xrfCmInfo.getXrfUhpInd()));
        setXrfAiInd(String.valueOf(xrfCmInfo.getXrfAiInd()));
        setXrfEnrpErFacInd(String.valueOf(xrfCmInfo.getXrfEnrpErFacInd()));
        setXrfErWrapInd(String.valueOf(xrfCmInfo.getXrfErWrapInd()));
        setXrfLabPct(xrfCmInfo.getXrfLabPct());
        setXrfDmePct(xrfCmInfo.getXrfDmePct());
        setXrfBusSegPltfm(String.valueOf(xrfCmInfo.getXrfBusSegPltfm()));
        setXrfNmaddrCdCm(String.valueOf(xrfCmInfo.getXrfNmaddrCdCm()));
        setXrfMcSel(String.valueOf(xrfCmInfo.getXrfMcSel()));
        setXrfPlcyAutpayInd(String.valueOf(xrfCmInfo.getXrfPlcyAutpayInd()));
        setXrfRptCdCm(String.valueOf(xrfCmInfo.getXrfRptCdCm()));
        setXrfMailCdCm(String.valueOf(xrfCmInfo.getXrfMailCdCm()));
        xrfRpData.populateFrom(xrfCmInfo.getXrfRpData());
        setXrfFranchCd(xrfCmInfo.getXrfFranchCd());
        setXrfEbdsCovBase(xrfCmInfo.getXrfEbdsCovBase());
        setXrfEbdsCovMme(xrfCmInfo.getXrfEbdsCovMme());
        setXrfEbdsCovMcr(xrfCmInfo.getXrfEbdsCovMcr());
        setXrfEbdsSetId(String.valueOf(xrfCmInfo.getXrfEbdsSetId()));
        setXrfAaCm(String.valueOf(xrfCmInfo.getXrfAaCm()));
        setXrfRxCm(String.valueOf(xrfCmInfo.getXrfRxCm()));
        setXrfModCm(String.valueOf(xrfCmInfo.getXrfModCm()));
        setXrfPcsCm(String.valueOf(xrfCmInfo.getXrfPcsCm()));
        setXrfCchCm(String.valueOf(xrfCmInfo.getXrfCchCm()));
        setXrfCapInd(String.valueOf(xrfCmInfo.getXrfCapInd()));
        setXrfApportionmentPct(xrfCmInfo.getXrfApportionmentPct());
        setXrfPayloc1(xrfCmInfo.getXrfPayloc1());
        setXrfPayloc2(xrfCmInfo.getXrfPayloc2());
        setXrfMnnrpInd(String.valueOf(xrfCmInfo.getXrfMnnrpInd()));
        setXrfMnnrpPct(xrfCmInfo.getXrfMnnrpPct());
        setXrfIplan(String.valueOf(xrfCmInfo.getXrfIplan()));
        setXrfObligorInd(String.valueOf(xrfCmInfo.getXrfObligorInd()));
        setXrfSharedArg(String.valueOf(xrfCmInfo.getXrfSharedArg()));
        setXrfMeInd(String.valueOf(xrfCmInfo.getXrfMeInd()));
        setXrfPteInd(String.valueOf(xrfCmInfo.getXrfPteInd()));
        setXrfProductInd(String.valueOf(xrfCmInfo.getXrfProductInd()));
        setXrfFreelookInd(String.valueOf(xrfCmInfo.getXrfFreelookInd()));
        setXrfEbrInd(String.valueOf(xrfCmInfo.getXrfEbrInd()));
        setXrfLimSvcInd(String.valueOf(xrfCmInfo.getXrfLimSvcInd()));
        setXrfOptOutUbhTier(String.valueOf(xrfCmInfo.getXrfOptOutUbhTier()));
        setXrfHraApIndLmt(xrfCmInfo.getXrfHraApIndLmt());
        setXrfHraApFamLmt(xrfCmInfo.getXrfHraApFamLmt());
        setXrfDefaultPoc(xrfCmInfo.getXrfDefaultPoc());
        setXrfPcntRateJqCodesFound(xrfCmInfo.getXrfPcntRateJqCodesFound());
        setXrfAppealLangInd(String.valueOf(xrfCmInfo.getXrfAppealLangInd()));
        setXrfProrateIntrvl(String.valueOf(xrfCmInfo.getXrfProrateIntrvl()));
        setXrfNbSuppressInd(String.valueOf(xrfCmInfo.getXrfNbSuppressInd()));
        setXrfProrateEvent(String.valueOf(xrfCmInfo.getXrfProrateEvent()));
        setXrfCoreMedPrrAuthCd(String.valueOf(xrfCmInfo.getXrfCoreMedPrrAuthCd()));
        setXrfEnrpErInd(String.valueOf(xrfCmInfo.getXrfEnrpErInd()));
        setXrfEnrpNonErInd(String.valueOf(xrfCmInfo.getXrfEnrpNonErInd()));
        setXrfEnrpNonErPct(xrfCmInfo.getXrfEnrpNonErPct());
        setXrfEhbInd(String.valueOf(xrfCmInfo.getXrfEhbInd()));
        setFiller01(String.valueOf(xrfCmInfo.getFiller01()));
    }
}
