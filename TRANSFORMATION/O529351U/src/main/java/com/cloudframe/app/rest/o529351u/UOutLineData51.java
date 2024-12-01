package com.cloudframe.app.rest.o529351u;

/**
 *  The class UOutLineData51 is used to handle fields declared in it
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
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

public class UOutLineData51 {

    protected Logger logger = LoggerFactory.getLogger(UOutLineData51.class);

    /*  Child Field declaration */
    @Size(min = 0, max = 2)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String uoutLinePos51 = "";

    @Size(min = 0, max = 6)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String uoutLineServiceCode51 = "";

    private int uOutLineDosDate51;

    private BigDecimal uOutLineChargeAmt51 = BigDecimal.ZERO;

    private BigDecimal uOutLineNotcovAmt51 = BigDecimal.ZERO;

    @Size(min = 0, max = 3)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String uoutLineRemarkCd51 = "";

    private short uOutLinePlanVar51;

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String uoutLineCauseCd51 = "";

    private int uOutLineAppUnits51;

    @Size(min = 0, max = 7)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String uoutSpiTblId51 = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String uoutPosTierCd51 = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String uoutDiagElgInd51 = "";

    /*  End of Field declaration */
    /**
     * 	Returns the value of uOutLinePos51
     * 	@return uOutLinePos51
     */
    public String getUoutLinePos51() {
        return uoutLinePos51;
    }

    /**
     *  set variable uOutLinePos51
     *  @param value
     */
    public void setUoutLinePos51(String value) {
        uoutLinePos51 = value.trim();
    }

    /**
     * 	Returns the value of uOutLineServiceCode51
     * 	@return uOutLineServiceCode51
     */
    public String getUoutLineServiceCode51() {
        return uoutLineServiceCode51;
    }

    /**
     *  set variable uOutLineServiceCode51
     *  @param value
     */
    public void setUoutLineServiceCode51(String value) {
        uoutLineServiceCode51 = value.trim();
    }

    public int getUOutLineDosDate51() {
        return uOutLineDosDate51;
    }

    /**
     *  	Update UOutLineDosDate51 with the passed value
     * 	@param number
     */
    public void setUOutLineDosDate51(int number) {
        uOutLineDosDate51 = number;
    }

    public BigDecimal getUOutLineChargeAmt51() {
        return uOutLineChargeAmt51;
    }

    /**
     *  	Update UOutLineChargeAmt51 with the passed number
     * 	@param number
     */
    public void setUOutLineChargeAmt51(BigDecimal number) {
        uOutLineChargeAmt51 = number;
    }

    public BigDecimal getUOutLineNotcovAmt51() {
        return uOutLineNotcovAmt51;
    }

    /**
     *  	Update UOutLineNotcovAmt51 with the passed number
     * 	@param number
     */
    public void setUOutLineNotcovAmt51(BigDecimal number) {
        uOutLineNotcovAmt51 = number;
    }

    /**
     * 	Returns the value of uOutLineRemarkCd51
     * 	@return uOutLineRemarkCd51
     */
    public String getUoutLineRemarkCd51() {
        return uoutLineRemarkCd51;
    }

    /**
     *  set variable uOutLineRemarkCd51
     *  @param value
     */
    public void setUoutLineRemarkCd51(String value) {
        uoutLineRemarkCd51 = value.trim();
    }

    /**
     * 	Returns the value of uOutLinePlanVar51
     * 	@return uOutLinePlanVar51
     */
    public short getUOutLinePlanVar51() {
        return uOutLinePlanVar51;
    }

    /**
     *  	Updates UOutLinePlanVar51 with the value
     * 	@param number
     */
    public void setUOutLinePlanVar51(short number) {
        uOutLinePlanVar51 = number;
    }

    /**
     * 	Returns the value of uOutLineCauseCd51
     * 	@return uOutLineCauseCd51
     */
    public String getUoutLineCauseCd51() {
        return uoutLineCauseCd51;
    }

    /**
     *  set variable uOutLineCauseCd51
     *  @param value
     */
    public void setUoutLineCauseCd51(String value) {
        uoutLineCauseCd51 = value.trim();
    }

    public int getUOutLineAppUnits51() {
        return uOutLineAppUnits51;
    }

    /**
     *  	Update UOutLineAppUnits51 with the passed value
     * 	@param number
     */
    public void setUOutLineAppUnits51(int number) {
        uOutLineAppUnits51 = number;
    }

    /**
     * 	Returns the value of uOutSpiTblId51
     * 	@return uOutSpiTblId51
     */
    public String getUoutSpiTblId51() {
        return uoutSpiTblId51;
    }

    /**
     *  set variable uOutSpiTblId51
     *  @param value
     */
    public void setUoutSpiTblId51(String value) {
        uoutSpiTblId51 = value.trim();
    }

    /**
     * 	Returns the value of uOutPosTierCd51
     * 	@return uOutPosTierCd51
     */
    public String getUoutPosTierCd51() {
        return uoutPosTierCd51;
    }

    /**
     *  set variable uOutPosTierCd51
     *  @param value
     */
    public void setUoutPosTierCd51(String value) {
        uoutPosTierCd51 = value.trim();
    }

    /**
     * 	Returns the value of uOutDiagElgInd51
     * 	@return uOutDiagElgInd51
     */
    public String getUoutDiagElgInd51() {
        return uoutDiagElgInd51;
    }

    /**
     *  set variable uOutDiagElgInd51
     *  @param value
     */
    public void setUoutDiagElgInd51(String value) {
        uoutDiagElgInd51 = value.trim();
    }

    @JsonIgnore
public void setUOutLineData51(com.cloudframe.app.dto.o529351u.UOutLineData51 uOutLineData51) throws CFException {
        if (uoutLinePos51 != null && !uoutLinePos51.isEmpty()) {
            uOutLineData51.setUOutLinePos51(uoutLinePos51.toCharArray());
        }
        if (uoutLineServiceCode51 != null && !uoutLineServiceCode51.isEmpty()) {
            uOutLineData51.setUOutLineServiceCode51(uoutLineServiceCode51.toCharArray());
        }
        uOutLineData51.setUOutLineDosDate51(uOutLineDosDate51);
        uOutLineData51.setUOutLineChargeAmt51(uOutLineChargeAmt51);
        uOutLineData51.setUOutLineNotcovAmt51(uOutLineNotcovAmt51);
        if (uoutLineRemarkCd51 != null && !uoutLineRemarkCd51.isEmpty()) {
            uOutLineData51.setUOutLineRemarkCd51(uoutLineRemarkCd51.toCharArray());
        }
        uOutLineData51.setUOutLinePlanVar51(uOutLinePlanVar51);
        if (uoutLineCauseCd51 != null && !uoutLineCauseCd51.isEmpty()) {
            uOutLineData51.setUOutLineCauseCd51(uoutLineCauseCd51.toCharArray());
        }
        uOutLineData51.setUOutLineAppUnits51(uOutLineAppUnits51);
        if (uoutSpiTblId51 != null && !uoutSpiTblId51.isEmpty()) {
            uOutLineData51.setUOutSpiTblId51(uoutSpiTblId51.toCharArray());
        }
        if (uoutPosTierCd51 != null && !uoutPosTierCd51.isEmpty()) {
            uOutLineData51.setUOutPosTierCd51(uoutPosTierCd51.toCharArray());
        }
        if (uoutDiagElgInd51 != null && !uoutDiagElgInd51.isEmpty()) {
            uOutLineData51.setUOutDiagElgInd51(uoutDiagElgInd51.toCharArray());
        }
    }

    @JsonIgnore
public void populateFrom(com.cloudframe.app.dto.o529351u.UOutLineData51 uOutLineData51) throws CFException {
        setUoutLinePos51(String.valueOf(uOutLineData51.getUOutLinePos51()));
        setUoutLineServiceCode51(String.valueOf(uOutLineData51.getUOutLineServiceCode51()));
        setUOutLineDosDate51(uOutLineData51.getUOutLineDosDate51());
        setUOutLineChargeAmt51(uOutLineData51.getUOutLineChargeAmt51());
        setUOutLineNotcovAmt51(uOutLineData51.getUOutLineNotcovAmt51());
        setUoutLineRemarkCd51(String.valueOf(uOutLineData51.getUOutLineRemarkCd51()));
        setUOutLinePlanVar51(uOutLineData51.getUOutLinePlanVar51());
        setUoutLineCauseCd51(String.valueOf(uOutLineData51.getUOutLineCauseCd51()));
        setUOutLineAppUnits51(uOutLineData51.getUOutLineAppUnits51());
        setUoutSpiTblId51(String.valueOf(uOutLineData51.getUOutSpiTblId51()));
        setUoutPosTierCd51(String.valueOf(uOutLineData51.getUOutPosTierCd51()));
        setUoutDiagElgInd51(String.valueOf(uOutLineData51.getUOutDiagElgInd51()));
    }
}
