package com.cloudframe.app.rest.o529351u;

/**
 *  The class LinkAreaM51u is used to handle fields declared in it
 *  @author CloudFrame Inc.
 *  created on 2024-12-01 at 05:44.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

public class LinkAreaM51u {

    protected Logger logger = LoggerFactory.getLogger(LinkAreaM51u.class);

    /*  Child Field declaration */
    @JsonProperty("m51uFlags")
    private M51uFlags m51uFlags = new M51uFlags();

    @JsonProperty("m51uLinkage")
    private M51uLinkage m51uLinkage = new M51uLinkage();

    @JsonProperty("uGenericTranslation51")
    private UGenericTranslation51 uGenericTranslation51 = new UGenericTranslation51();

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String uccmNOSvcInd51 = "";

    @Size(min = 0, max = 7)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String uspiTblId51 = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String uhcrProcessSw51 = "";

    @Size(min = 0, max = 3)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String uhcrSpiSw51 = "";

    /*  End of Field declaration */
    /**
     * 	Returns the value of m51uFlags
     * 	@return m51uFlags
     */
    public M51uFlags getM51uFlags() {
        return m51uFlags;
    }

    // *** setGroup.txt starts
    /**
     *  	Update M51uFlags with the passed value
     * 	@param value
     */
    @JsonIgnore
public void setM51uFlags(com.cloudframe.app.dto.o529351u.M51uFlags value) throws CFException {
        m51uFlags.populateFrom(value);
    }

    /**
     *  	Update M51uFlags with the passed value
     * 	@param value
     */
    public void setM51uFlags(M51uFlags value) {
        m51uFlags = value;
    }

    // *** setGroup.txt ends
    /**
     * 	Returns the value of m51uLinkage
     * 	@return m51uLinkage
     */
    public M51uLinkage getM51uLinkage() {
        return m51uLinkage;
    }

    // *** setGroup.txt starts
    /**
     *  	Update M51uLinkage with the passed value
     * 	@param value
     */
    @JsonIgnore
public void setM51uLinkage(com.cloudframe.app.dto.o529351u.M51uLinkage value) throws CFException {
        m51uLinkage.populateFrom(value);
    }

    /**
     *  	Update M51uLinkage with the passed value
     * 	@param value
     */
    public void setM51uLinkage(M51uLinkage value) {
        m51uLinkage = value;
    }

    // *** setGroup.txt ends
    /**
     * 	Returns the value of uGenericTranslation51
     * 	@return uGenericTranslation51
     */
    public UGenericTranslation51 getUGenericTranslation51() {
        return uGenericTranslation51;
    }

    // *** setGroup.txt starts
    /**
     *  	Update UGenericTranslation51 with the passed value
     * 	@param value
     */
    @JsonIgnore
public void setUGenericTranslation51(com.cloudframe.app.dto.o529351u.UGenericTranslation51 value) throws CFException {
        uGenericTranslation51.populateFrom(value);
    }

    /**
     *  	Update UGenericTranslation51 with the passed value
     * 	@param value
     */
    public void setUGenericTranslation51(UGenericTranslation51 value) {
        uGenericTranslation51 = value;
    }

    // *** setGroup.txt ends
    /**
     * 	Returns the value of uCcmNOSvcInd51
     * 	@return uCcmNOSvcInd51
     */
    public String getUccmNOSvcInd51() {
        return uccmNOSvcInd51;
    }

    /**
     *  set variable uCcmNOSvcInd51
     *  @param value
     */
    public void setUccmNOSvcInd51(String value) {
        uccmNOSvcInd51 = value.trim();
    }

    /**
     * 	Returns the value of uSpiTblId51
     * 	@return uSpiTblId51
     */
    public String getUspiTblId51() {
        return uspiTblId51;
    }

    /**
     *  set variable uSpiTblId51
     *  @param value
     */
    public void setUspiTblId51(String value) {
        uspiTblId51 = value.trim();
    }

    /**
     * 	Returns the value of uHcrProcessSw51
     * 	@return uHcrProcessSw51
     */
    public String getUhcrProcessSw51() {
        return uhcrProcessSw51;
    }

    /**
     *  set variable uHcrProcessSw51
     *  @param value
     */
    public void setUhcrProcessSw51(String value) {
        uhcrProcessSw51 = value.trim();
    }

    /**
     * 	Returns the value of uHcrSpiSw51
     * 	@return uHcrSpiSw51
     */
    public String getUhcrSpiSw51() {
        return uhcrSpiSw51;
    }

    /**
     *  set variable uHcrSpiSw51
     *  @param value
     */
    public void setUhcrSpiSw51(String value) {
        uhcrSpiSw51 = value.trim();
    }

    @JsonIgnore
public void setLinkAreaM51u(com.cloudframe.app.dto.o529351u.LinkAreaM51u linkAreaM51u) throws CFException {
        m51uFlags.setM51uFlags(linkAreaM51u.getM51uFlags());
        m51uLinkage.setM51uLinkage(linkAreaM51u.getM51uLinkage());
        uGenericTranslation51.setUGenericTranslation51(linkAreaM51u.getUGenericTranslation51());
        if (uccmNOSvcInd51 != null && !uccmNOSvcInd51.isEmpty()) {
            linkAreaM51u.setUCcmNOSvcInd51(uccmNOSvcInd51.toCharArray());
        }
        if (uspiTblId51 != null && !uspiTblId51.isEmpty()) {
            linkAreaM51u.setUSpiTblId51(uspiTblId51.toCharArray());
        }
        if (uhcrProcessSw51 != null && !uhcrProcessSw51.isEmpty()) {
            linkAreaM51u.setUHcrProcessSw51(uhcrProcessSw51.toCharArray());
        }
        if (uhcrSpiSw51 != null && !uhcrSpiSw51.isEmpty()) {
            linkAreaM51u.setUHcrSpiSw51(uhcrSpiSw51.toCharArray());
        }
    }

    @JsonIgnore
public void populateFrom(com.cloudframe.app.dto.o529351u.LinkAreaM51u linkAreaM51u) throws CFException {
        m51uFlags.populateFrom(linkAreaM51u.getM51uFlags());
        m51uLinkage.populateFrom(linkAreaM51u.getM51uLinkage());
        uGenericTranslation51.populateFrom(linkAreaM51u.getUGenericTranslation51());
        setUccmNOSvcInd51(String.valueOf(linkAreaM51u.getUCcmNOSvcInd51()));
        setUspiTblId51(String.valueOf(linkAreaM51u.getUSpiTblId51()));
        setUhcrProcessSw51(String.valueOf(linkAreaM51u.getUHcrProcessSw51()));
        setUhcrSpiSw51(String.valueOf(linkAreaM51u.getUHcrSpiSw51()));
    }
}
