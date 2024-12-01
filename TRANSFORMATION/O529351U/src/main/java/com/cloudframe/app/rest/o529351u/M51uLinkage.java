package com.cloudframe.app.rest.o529351u;

/**
 *  The class M51uLinkage is used to handle fields declared in it
 *  @author CloudFrame Inc.
 *  created on 2024-12-01 at 05:44.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

public class M51uLinkage {

    protected Logger logger = LoggerFactory.getLogger(M51uLinkage.class);

    /*  Child Field declaration */
    @Size(min = 0, max = 10)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String uicn51 = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String uioRequest51 = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String ucauseCd51 = "";

    @Size(min = 0, max = 2)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String uprovType51 = "";

    private short uPlanVar51;

    @Size(min = 0, max = 6)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String upolicyNo51 = "";

    @Size(min = 0, max = 25)
    @Schema(description = "Default value is empty", defaultValue = "[]")
    List<String> udiagnosisCode51 = new ArrayList<>();

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String uicdVerNbr51 = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String umedicalClaim51 = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String usourceInd51 = "";

    private long uEarliestDos51;

    private short uNbrOfLines51;

    @Size(min = 0, max = 120)
    @Schema(description = "Default value is empty", defaultValue = "[]")
    private List<ULineData51> ulineData51 = new ArrayList<>();

    @Size(min = 0, max = 4)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String ucpeDescCd51 = "";

    @Size(min = 0, max = 120)
    @Schema(description = "Default value is empty", defaultValue = "[]")
    private List<UOutLineData51> uoutLineData51 = new ArrayList<>();

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String ustopAutoSw51 = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String uoutCauseCd51 = "";

    private short uSlotPlanVar51;

    @Size(min = 0, max = 6)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String uslotPolicyNo51 = "";

    /*  End of Field declaration */
    /**
     * 	Returns the value of uIcn51
     * 	@return uIcn51
     */
    public String getUicn51() {
        return uicn51;
    }

    /**
     *  set variable uIcn51
     *  @param value
     */
    public void setUicn51(String value) {
        uicn51 = value.trim();
    }

    /**
     * 	Returns the value of uIoRequest51
     * 	@return uIoRequest51
     */
    public String getUioRequest51() {
        return uioRequest51;
    }

    /**
     *  set variable uIoRequest51
     *  @param value
     */
    public void setUioRequest51(String value) {
        uioRequest51 = value.trim();
    }

    /**
     * 	Returns the value of uCauseCd51
     * 	@return uCauseCd51
     */
    public String getUcauseCd51() {
        return ucauseCd51;
    }

    /**
     *  set variable uCauseCd51
     *  @param value
     */
    public void setUcauseCd51(String value) {
        ucauseCd51 = value.trim();
    }

    /**
     * 	Returns the value of uProvType51
     * 	@return uProvType51
     */
    public String getUprovType51() {
        return uprovType51;
    }

    /**
     *  set variable uProvType51
     *  @param value
     */
    public void setUprovType51(String value) {
        uprovType51 = value.trim();
    }

    /**
     * 	Returns the value of uPlanVar51
     * 	@return uPlanVar51
     */
    public short getUPlanVar51() {
        return uPlanVar51;
    }

    /**
     *  	Updates UPlanVar51 with the value
     * 	@param number
     */
    public void setUPlanVar51(short number) {
        uPlanVar51 = number;
    }

    /**
     * 	Returns the value of uPolicyNo51
     * 	@return uPolicyNo51
     */
    public String getUpolicyNo51() {
        return upolicyNo51;
    }

    /**
     *  set variable uPolicyNo51
     *  @param value
     */
    public void setUpolicyNo51(String value) {
        upolicyNo51 = value.trim();
    }

    /**
     * 	Returns the value of uDiagnosisCode51
     * 	@return uDiagnosisCode51
     */
    public List<String> getUdiagnosisCode51() {
        return udiagnosisCode51;
    }

    /**
     * 	Returns the element at the specified position form the list.
     *   @param index
     * 	@return uDiagnosisCode51
     */
    public String getUdiagnosisCode51(int index) {
        return udiagnosisCode51.get(index);
    }

    /**
     * 	Update UDiagnosisCode51 with the passed value at a given index
     *   @param index
     * 	@param value
     */
    public void setUdiagnosisCode51(List<String> value) {
        udiagnosisCode51 = value;
    }

    /**
     * 	Returns the value of uIcdVerNbr51
     * 	@return uIcdVerNbr51
     */
    public String getUicdVerNbr51() {
        return uicdVerNbr51;
    }

    /**
     *  set variable uIcdVerNbr51
     *  @param value
     */
    public void setUicdVerNbr51(String value) {
        uicdVerNbr51 = value.trim();
    }

    /**
     * 	Returns the value of uMedicalClaim51
     * 	@return uMedicalClaim51
     */
    public String getUmedicalClaim51() {
        return umedicalClaim51;
    }

    /**
     *  set variable uMedicalClaim51
     *  @param value
     */
    public void setUmedicalClaim51(String value) {
        umedicalClaim51 = value.trim();
    }

    /**
     * 	Returns the value of uSourceInd51
     * 	@return uSourceInd51
     */
    public String getUsourceInd51() {
        return usourceInd51;
    }

    /**
     *  set variable uSourceInd51
     *  @param value
     */
    public void setUsourceInd51(String value) {
        usourceInd51 = value.trim();
    }

    /**
     * 	Returns the value of uEarliestDos51
     * 	@return uEarliestDos51
     */
    public long getUEarliestDos51() {
        return uEarliestDos51;
    }

    /**
     *  	Updates UEarliestDos51 with the value
     * 	@param number
     */
    public void setUEarliestDos51(long number) {
        uEarliestDos51 = number;
    }

    public short getUNbrOfLines51() {
        return uNbrOfLines51;
    }

    /**
     *  	Update UNbrOfLines51 with the passed value
     * 	@param number
     */
    public void setUNbrOfLines51(short number) {
        uNbrOfLines51 = number;
    }

    /**
     * 	Returns the  value of uLineData51
     * 	@return uLineData51
     */
    public List<ULineData51> getUlineData51() {
        return ulineData51;
    }

    /**
     * 	Returns the element at the specified position in this list.
     *   @param index
     * 	@return uLineData51
     */
    public ULineData51 getUlineData51(int index) {
        return ulineData51.get(index);
    }

    // *** setArrayGroup.txt starts
    /**
     * 	Update ULineData51 at index with the passed value
     *   @param index
     * 	@param value
     */
    @JsonIgnore
public void setULineData51(int index, com.cloudframe.app.dto.o529351u.ULineData51 value) throws CFException {
        // *** setArrayChild.txt starts
        ulineData51.get(index).setUlinePos51(String.valueOf(value.getULinePos51()));
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        ulineData51.get(index).setUlineServiceCode51(String.valueOf(value.getULineServiceCode51()));
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        ulineData51.get(index).setULineDosDate51(value.getULineDosDate51());
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        ulineData51.get(index).setULineChargeAmt51(value.getULineChargeAmt51());
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        ulineData51.get(index).setULineNotcovAmt51(value.getULineNotcovAmt51());
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        ulineData51.get(index).setUlineRemarkCd51(String.valueOf(value.getULineRemarkCd51()));
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        ulineData51.get(index).setULineAppUnits51(value.getULineAppUnits51());
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        ulineData51.get(index).setUlineDiagPointer51(String.valueOf(value.getULineDiagPointer51()));
        // *** setArrayChild.txt ends
    }

    public void setUlineData51(int index, ULineData51 value) {
        ulineData51.set(index, value);
    }

    // *** setArrayGroup.txt ends
    /**
     * 	Returns the value of uCpeDescCd51
     * 	@return uCpeDescCd51
     */
    public String getUcpeDescCd51() {
        return ucpeDescCd51;
    }

    /**
     *  set variable uCpeDescCd51
     *  @param value
     */
    public void setUcpeDescCd51(String value) {
        ucpeDescCd51 = value.trim();
    }

    /**
     * 	Returns the  value of uOutLineData51
     * 	@return uOutLineData51
     */
    public List<UOutLineData51> getUoutLineData51() {
        return uoutLineData51;
    }

    /**
     * 	Returns the element at the specified position in this list.
     *   @param index
     * 	@return uOutLineData51
     */
    public UOutLineData51 getUoutLineData51(int index) {
        return uoutLineData51.get(index);
    }

    // *** setArrayGroup.txt starts
    /**
     * 	Update UOutLineData51 at index with the passed value
     *   @param index
     * 	@param value
     */
    @JsonIgnore
public void setUOutLineData51(int index, com.cloudframe.app.dto.o529351u.UOutLineData51 value) throws CFException {
        // *** setArrayChild.txt starts
        uoutLineData51.get(index).setUoutLinePos51(String.valueOf(value.getUOutLinePos51()));
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        uoutLineData51.get(index).setUoutLineServiceCode51(String.valueOf(value.getUOutLineServiceCode51()));
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        uoutLineData51.get(index).setUOutLineDosDate51(value.getUOutLineDosDate51());
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        uoutLineData51.get(index).setUOutLineChargeAmt51(value.getUOutLineChargeAmt51());
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        uoutLineData51.get(index).setUOutLineNotcovAmt51(value.getUOutLineNotcovAmt51());
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        uoutLineData51.get(index).setUoutLineRemarkCd51(String.valueOf(value.getUOutLineRemarkCd51()));
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        uoutLineData51.get(index).setUOutLinePlanVar51(value.getUOutLinePlanVar51());
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        uoutLineData51.get(index).setUoutLineCauseCd51(String.valueOf(value.getUOutLineCauseCd51()));
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        uoutLineData51.get(index).setUOutLineAppUnits51(value.getUOutLineAppUnits51());
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        uoutLineData51.get(index).setUoutSpiTblId51(String.valueOf(value.getUOutSpiTblId51()));
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        uoutLineData51.get(index).setUoutPosTierCd51(String.valueOf(value.getUOutPosTierCd51()));
        // *** setArrayChild.txt ends
        // *** setArrayChild.txt starts
        uoutLineData51.get(index).setUoutDiagElgInd51(String.valueOf(value.getUOutDiagElgInd51()));
        // *** setArrayChild.txt ends
    }

    public void setUoutLineData51(int index, UOutLineData51 value) {
        uoutLineData51.set(index, value);
    }

    // *** setArrayGroup.txt ends
    /**
     * 	Returns the value of uStopAutoSw51
     * 	@return uStopAutoSw51
     */
    public String getUstopAutoSw51() {
        return ustopAutoSw51;
    }

    /**
     *  set variable uStopAutoSw51
     *  @param value
     */
    public void setUstopAutoSw51(String value) {
        ustopAutoSw51 = value.trim();
    }

    /**
     * 	Returns the value of uOutCauseCd51
     * 	@return uOutCauseCd51
     */
    public String getUoutCauseCd51() {
        return uoutCauseCd51;
    }

    /**
     *  set variable uOutCauseCd51
     *  @param value
     */
    public void setUoutCauseCd51(String value) {
        uoutCauseCd51 = value.trim();
    }

    /**
     * 	Returns the value of uSlotPlanVar51
     * 	@return uSlotPlanVar51
     */
    public short getUSlotPlanVar51() {
        return uSlotPlanVar51;
    }

    /**
     *  	Updates USlotPlanVar51 with the value
     * 	@param number
     */
    public void setUSlotPlanVar51(short number) {
        uSlotPlanVar51 = number;
    }

    /**
     * 	Returns the value of uSlotPolicyNo51
     * 	@return uSlotPolicyNo51
     */
    public String getUslotPolicyNo51() {
        return uslotPolicyNo51;
    }

    /**
     *  set variable uSlotPolicyNo51
     *  @param value
     */
    public void setUslotPolicyNo51(String value) {
        uslotPolicyNo51 = value.trim();
    }

    @JsonIgnore
public void setM51uLinkage(com.cloudframe.app.dto.o529351u.M51uLinkage m51uLinkage) throws CFException {
        if (uicn51 != null && !uicn51.isEmpty()) {
            m51uLinkage.setUIcn51(uicn51.toCharArray());
        }
        if (uioRequest51 != null && !uioRequest51.isEmpty()) {
            m51uLinkage.setUIoRequest51(uioRequest51.toCharArray());
        }
        if (ucauseCd51 != null && !ucauseCd51.isEmpty()) {
            m51uLinkage.setUCauseCd51(ucauseCd51.toCharArray());
        }
        if (uprovType51 != null && !uprovType51.isEmpty()) {
            m51uLinkage.setUProvType51(uprovType51.toCharArray());
        }
        m51uLinkage.setUPlanVar51(uPlanVar51);
        if (upolicyNo51 != null && !upolicyNo51.isEmpty()) {
            m51uLinkage.setUPolicyNo51(upolicyNo51.toCharArray());
        }
        if (!udiagnosisCode51.isEmpty()) {
            for (int index = 0; index < udiagnosisCode51.size(); index++) {
                m51uLinkage.setUDiagnosisCode51(index, udiagnosisCode51.get(index).toCharArray());
            }
        }
        if (uicdVerNbr51 != null && !uicdVerNbr51.isEmpty()) {
            m51uLinkage.setUIcdVerNbr51(uicdVerNbr51.toCharArray());
        }
        if (umedicalClaim51 != null && !umedicalClaim51.isEmpty()) {
            m51uLinkage.setUMedicalClaim51(umedicalClaim51.toCharArray());
        }
        if (usourceInd51 != null && !usourceInd51.isEmpty()) {
            m51uLinkage.setUSourceInd51(usourceInd51.toCharArray());
        }
        m51uLinkage.setUEarliestDos51(uEarliestDos51);
        m51uLinkage.setUNbrOfLines51(uNbrOfLines51);
        for (int index = 0; index < ulineData51.size(); index++) {
            ulineData51.get(index).setULineData51(m51uLinkage.getULineData51(index));
        }
        if (ucpeDescCd51 != null && !ucpeDescCd51.isEmpty()) {
            m51uLinkage.setUCpeDescCd51(ucpeDescCd51.toCharArray());
        }
        for (int index = 0; index < uoutLineData51.size(); index++) {
            uoutLineData51.get(index).setUOutLineData51(m51uLinkage.getUOutLineData51(index));
        }
        if (ustopAutoSw51 != null && !ustopAutoSw51.isEmpty()) {
            m51uLinkage.setUStopAutoSw51(ustopAutoSw51.toCharArray());
        }
        if (uoutCauseCd51 != null && !uoutCauseCd51.isEmpty()) {
            m51uLinkage.setUOutCauseCd51(uoutCauseCd51.toCharArray());
        }
        m51uLinkage.setUSlotPlanVar51(uSlotPlanVar51);
        if (uslotPolicyNo51 != null && !uslotPolicyNo51.isEmpty()) {
            m51uLinkage.setUSlotPolicyNo51(uslotPolicyNo51.toCharArray());
        }
    }

    @JsonIgnore
public void populateFrom(com.cloudframe.app.dto.o529351u.M51uLinkage m51uLinkage) throws CFException {
        setUicn51(String.valueOf(m51uLinkage.getUIcn51()));
        setUioRequest51(String.valueOf(m51uLinkage.getUIoRequest51()));
        setUcauseCd51(String.valueOf(m51uLinkage.getUCauseCd51()));
        setUprovType51(String.valueOf(m51uLinkage.getUProvType51()));
        setUPlanVar51(m51uLinkage.getUPlanVar51());
        setUpolicyNo51(String.valueOf(m51uLinkage.getUPolicyNo51()));
        udiagnosisCode51.clear();
        m51uLinkage.getUDiagnosisCode51().forEach(item -> {
            String val = CFUtil.trim(item);
            if (!val.isEmpty()) {
                udiagnosisCode51.add(val);
            }
        });
        setUicdVerNbr51(String.valueOf(m51uLinkage.getUIcdVerNbr51()));
        setUmedicalClaim51(String.valueOf(m51uLinkage.getUMedicalClaim51()));
        setUsourceInd51(String.valueOf(m51uLinkage.getUSourceInd51()));
        setUEarliestDos51(m51uLinkage.getUEarliestDos51());
        setUNbrOfLines51(m51uLinkage.getUNbrOfLines51());
        ulineData51.clear();
        m51uLinkage.getULineData51().forEach(item -> {
            if (!CFUtil.trim(item.toCharArray()).isEmpty()) {
                ULineData51 uLineData51Item = new ULineData51();
                try {
                    uLineData51Item.populateFrom(item);
                    ulineData51.add(uLineData51Item);
                } catch (CFException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        setUcpeDescCd51(String.valueOf(m51uLinkage.getUCpeDescCd51()));
        uoutLineData51.clear();
        m51uLinkage.getUOutLineData51().forEach(item -> {
            if (!CFUtil.trim(item.toCharArray()).isEmpty()) {
                UOutLineData51 uOutLineData51Item = new UOutLineData51();
                try {
                    uOutLineData51Item.populateFrom(item);
                    uoutLineData51.add(uOutLineData51Item);
                } catch (CFException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        setUstopAutoSw51(String.valueOf(m51uLinkage.getUStopAutoSw51()));
        setUoutCauseCd51(String.valueOf(m51uLinkage.getUOutCauseCd51()));
        setUSlotPlanVar51(m51uLinkage.getUSlotPlanVar51());
        setUslotPolicyNo51(String.valueOf(m51uLinkage.getUSlotPolicyNo51()));
    }
}
