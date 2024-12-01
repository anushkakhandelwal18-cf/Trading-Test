package com.cloudframe.app.rest.o529351u;

/**
 *  The class XrefRecord is used to handle fields declared in it
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
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

public class XrefRecord {

    protected Logger logger = LoggerFactory.getLogger(XrefRecord.class);

    /*  Child Field declaration */
    @JsonProperty("xrfEeDataKey")
    private XrfEeDataKey xrfEeDataKey = new XrfEeDataKey();

    private int xrfAdjstrNum;

    @Size(min = 0, max = 9)
    @Schema(description = "Default value is empty", defaultValue = "[]")
    List<String> xrfCmData = new ArrayList<>();

    private short xrfBankAcctEe;

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfRegionIndEe = "";

    @Size(min = 0, max = 9)
    @Schema(description = "Default value is empty", defaultValue = "[]")
    List<String> xrfPrsInd = new ArrayList<>();

    @JsonProperty("xrfUpdLog")
    private XrfUpdLog xrfUpdLog = new XrfUpdLog();

    private short xrfPortDate;

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfLcaInd = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String xrfSourceSysInd = "";

    /*  End of Field declaration */
    /**
     * 	Returns the value of xrfEeDataKey
     * 	@return xrfEeDataKey
     */
    public XrfEeDataKey getXrfEeDataKey() {
        return xrfEeDataKey;
    }

    // *** setGroup.txt starts
    /**
     *  	Update XrfEeDataKey with the passed value
     * 	@param value
     */
    @JsonIgnore
public void setXrfEeDataKey(com.cloudframe.app.dto.o529351u.XrfEeDataKey value) throws CFException {
        xrfEeDataKey.populateFrom(value);
    }

    /**
     *  	Update XrfEeDataKey with the passed value
     * 	@param value
     */
    public void setXrfEeDataKey(XrfEeDataKey value) {
        xrfEeDataKey = value;
    }

    // *** setGroup.txt ends
    /**
     * 	Returns the value of xrfAdjstrNum
     * 	@return xrfAdjstrNum
     */
    public int getXrfAdjstrNum() {
        return xrfAdjstrNum;
    }

    /**
     *  	Updates XrfAdjstrNum with the value
     * 	@param number
     */
    public void setXrfAdjstrNum(int number) {
        xrfAdjstrNum = number;
    }

    /**
     * 	Returns the value of xrfCmData
     * 	@return xrfCmData
     */
    public List<String> getXrfCmData() {
        return xrfCmData;
    }

    /**
     * 	Returns the element at the specified position form the list.
     *   @param index
     * 	@return xrfCmData
     */
    public String getXrfCmData(int index) {
        return xrfCmData.get(index);
    }

    /**
     * 	Update XrfCmData with the passed value at a given index
     *   @param index
     * 	@param value
     */
    public void setXrfCmData(List<String> value) {
        xrfCmData = value;
    }

    public short getXrfBankAcctEe() {
        return xrfBankAcctEe;
    }

    /**
     *  	Update XrfBankAcctEe with the passed value
     * 	@param number
     */
    public void setXrfBankAcctEe(short number) {
        xrfBankAcctEe = number;
    }

    /**
     * 	Returns the value of xrfRegionIndEe
     * 	@return xrfRegionIndEe
     */
    public String getXrfRegionIndEe() {
        return xrfRegionIndEe;
    }

    /**
     *  set variable xrfRegionIndEe
     *  @param value
     */
    public void setXrfRegionIndEe(String value) {
        xrfRegionIndEe = value.trim();
    }

    /**
     * 	Returns the value of xrfPrsInd
     * 	@return xrfPrsInd
     */
    public List<String> getXrfPrsInd() {
        return xrfPrsInd;
    }

    /**
     * 	Returns the element at the specified position form the list.
     *   @param index
     * 	@return xrfPrsInd
     */
    public String getXrfPrsInd(int index) {
        return xrfPrsInd.get(index);
    }

    /**
     * 	Update XrfPrsInd with the passed value at a given index
     *   @param index
     * 	@param value
     */
    public void setXrfPrsInd(List<String> value) {
        xrfPrsInd = value;
    }

    /**
     * 	Returns the value of xrfUpdLog
     * 	@return xrfUpdLog
     */
    public XrfUpdLog getXrfUpdLog() {
        return xrfUpdLog;
    }

    // *** setGroup.txt starts
    /**
     *  	Update XrfUpdLog with the passed value
     * 	@param value
     */
    @JsonIgnore
public void setXrfUpdLog(com.cloudframe.app.dto.o529351u.XrfUpdLog value) throws CFException {
        xrfUpdLog.populateFrom(value);
    }

    /**
     *  	Update XrfUpdLog with the passed value
     * 	@param value
     */
    public void setXrfUpdLog(XrfUpdLog value) {
        xrfUpdLog = value;
    }

    // *** setGroup.txt ends
    public short getXrfPortDate() {
        return xrfPortDate;
    }

    /**
     *  	Update XrfPortDate with the passed value
     * 	@param number
     */
    public void setXrfPortDate(short number) {
        xrfPortDate = number;
    }

    /**
     * 	Returns the value of xrfLcaInd
     * 	@return xrfLcaInd
     */
    public String getXrfLcaInd() {
        return xrfLcaInd;
    }

    /**
     *  set variable xrfLcaInd
     *  @param value
     */
    public void setXrfLcaInd(String value) {
        xrfLcaInd = value.trim();
    }

    /**
     * 	Returns the value of xrfSourceSysInd
     * 	@return xrfSourceSysInd
     */
    public String getXrfSourceSysInd() {
        return xrfSourceSysInd;
    }

    /**
     *  set variable xrfSourceSysInd
     *  @param value
     */
    public void setXrfSourceSysInd(String value) {
        xrfSourceSysInd = value.trim();
    }

    @JsonIgnore
public void setXrefRecord(com.cloudframe.app.dto.o529351u.XrefRecord xrefRecord) throws CFException {
        xrfEeDataKey.setXrfEeDataKey(xrefRecord.getXrfEeDataKey());
        xrefRecord.setXrfAdjstrNum(xrfAdjstrNum);
        if (!xrfCmData.isEmpty()) {
            for (int index = 0; index < xrfCmData.size(); index++) {
                xrefRecord.setXrfCmData(index, xrfCmData.get(index).toCharArray());
            }
        }
        xrefRecord.setXrfBankAcctEe(xrfBankAcctEe);
        if (xrfRegionIndEe != null && !xrfRegionIndEe.isEmpty()) {
            xrefRecord.setXrfRegionIndEe(xrfRegionIndEe.toCharArray());
        }
        if (!xrfPrsInd.isEmpty()) {
            for (int index = 0; index < xrfPrsInd.size(); index++) {
                xrefRecord.setXrfPrsInd(index, xrfPrsInd.get(index).toCharArray());
            }
        }
        xrfUpdLog.setXrfUpdLog(xrefRecord.getXrfUpdLog());
        xrefRecord.setXrfPortDate(xrfPortDate);
        if (xrfLcaInd != null && !xrfLcaInd.isEmpty()) {
            xrefRecord.setXrfLcaInd(xrfLcaInd.toCharArray());
        }
        if (xrfSourceSysInd != null && !xrfSourceSysInd.isEmpty()) {
            xrefRecord.setXrfSourceSysInd(xrfSourceSysInd.toCharArray());
        }
    }

    @JsonIgnore
public void populateFrom(com.cloudframe.app.dto.o529351u.XrefRecord xrefRecord) throws CFException {
        xrfEeDataKey.populateFrom(xrefRecord.getXrfEeDataKey());
        setXrfAdjstrNum(xrefRecord.getXrfAdjstrNum());
        xrfCmData.clear();
        xrefRecord.getXrfCmData().forEach(item -> {
            String val = CFUtil.trim(item);
            if (!val.isEmpty()) {
                xrfCmData.add(val);
            }
        });
        setXrfBankAcctEe(xrefRecord.getXrfBankAcctEe());
        setXrfRegionIndEe(String.valueOf(xrefRecord.getXrfRegionIndEe()));
        xrfPrsInd.clear();
        xrefRecord.getXrfPrsInd().forEach(item -> {
            String val = CFUtil.trim(item);
            if (!val.isEmpty()) {
                xrfPrsInd.add(val);
            }
        });
        xrfUpdLog.populateFrom(xrefRecord.getXrfUpdLog());
        setXrfPortDate(xrefRecord.getXrfPortDate());
        setXrfLcaInd(String.valueOf(xrefRecord.getXrfLcaInd()));
        setXrfSourceSysInd(String.valueOf(xrefRecord.getXrfSourceSysInd()));
    }
}
