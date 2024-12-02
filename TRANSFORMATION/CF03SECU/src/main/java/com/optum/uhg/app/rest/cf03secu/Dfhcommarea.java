package com.optum.uhg.app.rest.cf03secu;

/**
 *  The class Dfhcommarea is used to handle fields declared in it
 *  @author CloudFrame Inc.
 *  created on 2024-12-02 at 20:31.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

public class Dfhcommarea {

    protected Logger logger = LoggerFactory.getLogger(Dfhcommarea.class);

    /*  Child Field declaration */
    @Size(min = 0, max = 12)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String isin01 = "";

    @Size(min = 0, max = 8)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String sedol01 = "";

    @Size(min = 0, max = 10)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String ric01 = "";

    @Size(min = 0, max = 8)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String intlkey01 = "";

    @Size(min = 0, max = 40)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String company01 = "";

    @Size(min = 0, max = 2)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String country01 = "";

    @Size(min = 0, max = 3)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String currency1 = "";

    @Size(min = 0, max = 40)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String industry01 = "";

    @Size(min = 0, max = 40)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String sector01 = "";

    @Size(min = 0, max = 9)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String ffmcapmilusd01 = "";

    @Size(min = 0, max = 8)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String sectorweight01 = "";

    @Size(min = 0, max = 50)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String secErrorMsg = "";

    /*  End of Field declaration */
    /**
     * 	Returns the value of isin01
     * 	@return isin01
     */
    public String getIsin01() {
        return isin01;
    }

    /**
     *  set variable isin01
     *  @param value
     */
    public void setIsin01(String value) {
        isin01 = value.trim();
    }

    /**
     * 	Returns the value of sedol01
     * 	@return sedol01
     */
    public String getSedol01() {
        return sedol01;
    }

    /**
     *  set variable sedol01
     *  @param value
     */
    public void setSedol01(String value) {
        sedol01 = value.trim();
    }

    /**
     * 	Returns the value of ric01
     * 	@return ric01
     */
    public String getRic01() {
        return ric01;
    }

    /**
     *  set variable ric01
     *  @param value
     */
    public void setRic01(String value) {
        ric01 = value.trim();
    }

    /**
     * 	Returns the value of intlkey01
     * 	@return intlkey01
     */
    public String getIntlkey01() {
        return intlkey01;
    }

    /**
     *  set variable intlkey01
     *  @param value
     */
    public void setIntlkey01(String value) {
        intlkey01 = value.trim();
    }

    /**
     * 	Returns the value of company01
     * 	@return company01
     */
    public String getCompany01() {
        return company01;
    }

    /**
     *  set variable company01
     *  @param value
     */
    public void setCompany01(String value) {
        company01 = value.trim();
    }

    /**
     * 	Returns the value of country01
     * 	@return country01
     */
    public String getCountry01() {
        return country01;
    }

    /**
     *  set variable country01
     *  @param value
     */
    public void setCountry01(String value) {
        country01 = value.trim();
    }

    /**
     * 	Returns the value of currency1
     * 	@return currency1
     */
    public String getCurrency1() {
        return currency1;
    }

    /**
     *  set variable currency1
     *  @param value
     */
    public void setCurrency1(String value) {
        currency1 = value.trim();
    }

    /**
     * 	Returns the value of industry01
     * 	@return industry01
     */
    public String getIndustry01() {
        return industry01;
    }

    /**
     *  set variable industry01
     *  @param value
     */
    public void setIndustry01(String value) {
        industry01 = value.trim();
    }

    /**
     * 	Returns the value of sector01
     * 	@return sector01
     */
    public String getSector01() {
        return sector01;
    }

    /**
     *  set variable sector01
     *  @param value
     */
    public void setSector01(String value) {
        sector01 = value.trim();
    }

    /**
     * 	Returns the value of ffmcapmilusd01
     * 	@return ffmcapmilusd01
     */
    public String getFfmcapmilusd01() {
        return ffmcapmilusd01;
    }

    /**
     *  set variable ffmcapmilusd01
     *  @param value
     */
    public void setFfmcapmilusd01(String value) {
        ffmcapmilusd01 = value.trim();
    }

    /**
     * 	Returns the value of sectorweight01
     * 	@return sectorweight01
     */
    public String getSectorweight01() {
        return sectorweight01;
    }

    /**
     *  set variable sectorweight01
     *  @param value
     */
    public void setSectorweight01(String value) {
        sectorweight01 = value.trim();
    }

    /**
     * 	Returns the value of secErrorMsg
     * 	@return secErrorMsg
     */
    public String getSecErrorMsg() {
        return secErrorMsg;
    }

    /**
     *  set variable secErrorMsg
     *  @param value
     */
    public void setSecErrorMsg(String value) {
        secErrorMsg = value.trim();
    }

    @JsonIgnore
public void setDfhcommarea(com.optum.uhg.app.dto.cf03secu.Dfhcommarea dfhcommarea) throws CFException {
        if (isin01 != null && !isin01.isEmpty()) {
            dfhcommarea.setIsin01(isin01.toCharArray());
        }
        if (sedol01 != null && !sedol01.isEmpty()) {
            dfhcommarea.setSedol01(sedol01.toCharArray());
        }
        if (ric01 != null && !ric01.isEmpty()) {
            dfhcommarea.setRic01(ric01.toCharArray());
        }
        if (intlkey01 != null && !intlkey01.isEmpty()) {
            dfhcommarea.setIntlkey01(intlkey01.toCharArray());
        }
        if (company01 != null && !company01.isEmpty()) {
            dfhcommarea.setCompany01(company01.toCharArray());
        }
        if (country01 != null && !country01.isEmpty()) {
            dfhcommarea.setCountry01(country01.toCharArray());
        }
        if (currency1 != null && !currency1.isEmpty()) {
            dfhcommarea.setCurrency1(currency1.toCharArray());
        }
        if (industry01 != null && !industry01.isEmpty()) {
            dfhcommarea.setIndustry01(industry01.toCharArray());
        }
        if (sector01 != null && !sector01.isEmpty()) {
            dfhcommarea.setSector01(sector01.toCharArray());
        }
        if (ffmcapmilusd01 != null && !ffmcapmilusd01.isEmpty()) {
            dfhcommarea.setFfmcapmilusd01(ffmcapmilusd01.toCharArray());
        }
        if (sectorweight01 != null && !sectorweight01.isEmpty()) {
            dfhcommarea.setSectorweight01(sectorweight01.toCharArray());
        }
        if (secErrorMsg != null && !secErrorMsg.isEmpty()) {
            dfhcommarea.setSecErrorMsg(secErrorMsg.toCharArray());
        }
    }

    @JsonIgnore
public void populateFrom(com.optum.uhg.app.dto.cf03secu.Dfhcommarea dfhcommarea) throws CFException {
        setIsin01(String.valueOf(dfhcommarea.getIsin01()));
        setSedol01(String.valueOf(dfhcommarea.getSedol01()));
        setRic01(String.valueOf(dfhcommarea.getRic01()));
        setIntlkey01(String.valueOf(dfhcommarea.getIntlkey01()));
        setCompany01(String.valueOf(dfhcommarea.getCompany01()));
        setCountry01(String.valueOf(dfhcommarea.getCountry01()));
        setCurrency1(String.valueOf(dfhcommarea.getCurrency1()));
        setIndustry01(String.valueOf(dfhcommarea.getIndustry01()));
        setSector01(String.valueOf(dfhcommarea.getSector01()));
        setFfmcapmilusd01(String.valueOf(dfhcommarea.getFfmcapmilusd01()));
        setSectorweight01(String.valueOf(dfhcommarea.getSectorweight01()));
        setSecErrorMsg(String.valueOf(dfhcommarea.getSecErrorMsg()));
    }
}
