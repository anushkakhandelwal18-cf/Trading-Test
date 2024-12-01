package com.cloudframe.app.rest.o529351u;

/**
 *  The class ULineData51 is used to handle fields declared in it
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

public class ULineData51 {

    protected Logger logger = LoggerFactory.getLogger(ULineData51.class);

    /*  Child Field declaration */
    @Size(min = 0, max = 2)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String ulinePos51 = "";

    @Size(min = 0, max = 6)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String ulineServiceCode51 = "";

    private int uLineDosDate51;

    private BigDecimal uLineChargeAmt51 = BigDecimal.ZERO;

    private BigDecimal uLineNotcovAmt51 = BigDecimal.ZERO;

    @Size(min = 0, max = 3)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String ulineRemarkCd51 = "";

    private int uLineAppUnits51;

    @Size(min = 0, max = 8)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String ulineDiagPointer51 = "";

    /*  End of Field declaration */
    /**
     * 	Returns the value of uLinePos51
     * 	@return uLinePos51
     */
    public String getUlinePos51() {
        return ulinePos51;
    }

    /**
     *  set variable uLinePos51
     *  @param value
     */
    public void setUlinePos51(String value) {
        ulinePos51 = value.trim();
    }

    /**
     * 	Returns the value of uLineServiceCode51
     * 	@return uLineServiceCode51
     */
    public String getUlineServiceCode51() {
        return ulineServiceCode51;
    }

    /**
     *  set variable uLineServiceCode51
     *  @param value
     */
    public void setUlineServiceCode51(String value) {
        ulineServiceCode51 = value.trim();
    }

    public int getULineDosDate51() {
        return uLineDosDate51;
    }

    /**
     *  	Update ULineDosDate51 with the passed value
     * 	@param number
     */
    public void setULineDosDate51(int number) {
        uLineDosDate51 = number;
    }

    public BigDecimal getULineChargeAmt51() {
        return uLineChargeAmt51;
    }

    /**
     *  	Update ULineChargeAmt51 with the passed number
     * 	@param number
     */
    public void setULineChargeAmt51(BigDecimal number) {
        uLineChargeAmt51 = number;
    }

    public BigDecimal getULineNotcovAmt51() {
        return uLineNotcovAmt51;
    }

    /**
     *  	Update ULineNotcovAmt51 with the passed number
     * 	@param number
     */
    public void setULineNotcovAmt51(BigDecimal number) {
        uLineNotcovAmt51 = number;
    }

    /**
     * 	Returns the value of uLineRemarkCd51
     * 	@return uLineRemarkCd51
     */
    public String getUlineRemarkCd51() {
        return ulineRemarkCd51;
    }

    /**
     *  set variable uLineRemarkCd51
     *  @param value
     */
    public void setUlineRemarkCd51(String value) {
        ulineRemarkCd51 = value.trim();
    }

    public int getULineAppUnits51() {
        return uLineAppUnits51;
    }

    /**
     *  	Update ULineAppUnits51 with the passed value
     * 	@param number
     */
    public void setULineAppUnits51(int number) {
        uLineAppUnits51 = number;
    }

    /**
     * 	Returns the value of uLineDiagPointer51
     * 	@return uLineDiagPointer51
     */
    public String getUlineDiagPointer51() {
        return ulineDiagPointer51;
    }

    /**
     *  set variable uLineDiagPointer51
     *  @param value
     */
    public void setUlineDiagPointer51(String value) {
        ulineDiagPointer51 = value.trim();
    }

    @JsonIgnore
public void setULineData51(com.cloudframe.app.dto.o529351u.ULineData51 uLineData51) throws CFException {
        if (ulinePos51 != null && !ulinePos51.isEmpty()) {
            uLineData51.setULinePos51(ulinePos51.toCharArray());
        }
        if (ulineServiceCode51 != null && !ulineServiceCode51.isEmpty()) {
            uLineData51.setULineServiceCode51(ulineServiceCode51.toCharArray());
        }
        uLineData51.setULineDosDate51(uLineDosDate51);
        uLineData51.setULineChargeAmt51(uLineChargeAmt51);
        uLineData51.setULineNotcovAmt51(uLineNotcovAmt51);
        if (ulineRemarkCd51 != null && !ulineRemarkCd51.isEmpty()) {
            uLineData51.setULineRemarkCd51(ulineRemarkCd51.toCharArray());
        }
        uLineData51.setULineAppUnits51(uLineAppUnits51);
        if (ulineDiagPointer51 != null && !ulineDiagPointer51.isEmpty()) {
            uLineData51.setULineDiagPointer51(ulineDiagPointer51.toCharArray());
        }
    }

    @JsonIgnore
public void populateFrom(com.cloudframe.app.dto.o529351u.ULineData51 uLineData51) throws CFException {
        setUlinePos51(String.valueOf(uLineData51.getULinePos51()));
        setUlineServiceCode51(String.valueOf(uLineData51.getULineServiceCode51()));
        setULineDosDate51(uLineData51.getULineDosDate51());
        setULineChargeAmt51(uLineData51.getULineChargeAmt51());
        setULineNotcovAmt51(uLineData51.getULineNotcovAmt51());
        setUlineRemarkCd51(String.valueOf(uLineData51.getULineRemarkCd51()));
        setULineAppUnits51(uLineData51.getULineAppUnits51());
        setUlineDiagPointer51(String.valueOf(uLineData51.getULineDiagPointer51()));
    }
}
