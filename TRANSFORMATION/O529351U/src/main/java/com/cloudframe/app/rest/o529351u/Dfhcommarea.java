package com.cloudframe.app.rest.o529351u;

/**
 *  The class Dfhcommarea is used to handle fields declared in it
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
import jakarta.validation.constraints.Size;

public class Dfhcommarea {

    protected Logger logger = LoggerFactory.getLogger(Dfhcommarea.class);

    /*  Child Field declaration */
    @JsonProperty("xrefRecord")
    private XrefRecord xrefRecord = new XrefRecord();

    @JsonProperty("xrefCmInfo")
    private XrefCmInfo xrefCmInfo = new XrefCmInfo();

    @JsonProperty("linkAreaM51u")
    private LinkAreaM51u linkAreaM51u = new LinkAreaM51u();

    @JsonProperty("ppaPpoaltRecord")
    private PpaPpoaltRecord ppaPpoaltRecord = new PpaPpoaltRecord();

    /*  End of Field declaration */
    /**
     * 	Returns the value of xrefRecord
     * 	@return xrefRecord
     */
    public XrefRecord getXrefRecord() {
        return xrefRecord;
    }

    // *** setGroup.txt starts
    /**
     *  	Update XrefRecord with the passed value
     * 	@param value
     */
    @JsonIgnore
public void setXrefRecord(com.cloudframe.app.dto.o529351u.XrefRecord value) throws CFException {
        xrefRecord.populateFrom(value);
    }

    /**
     *  	Update XrefRecord with the passed value
     * 	@param value
     */
    public void setXrefRecord(XrefRecord value) {
        xrefRecord = value;
    }

    // *** setGroup.txt ends
    /**
     * 	Returns the value of xrefCmInfo
     * 	@return xrefCmInfo
     */
    public XrefCmInfo getXrefCmInfo() {
        return xrefCmInfo;
    }

    // *** setGroup.txt starts
    /**
     *  	Update XrefCmInfo with the passed value
     * 	@param value
     */
    @JsonIgnore
public void setXrefCmInfo(com.cloudframe.app.dto.o529351u.XrefCmInfo value) throws CFException {
        xrefCmInfo.populateFrom(value);
    }

    /**
     *  	Update XrefCmInfo with the passed value
     * 	@param value
     */
    public void setXrefCmInfo(XrefCmInfo value) {
        xrefCmInfo = value;
    }

    // *** setGroup.txt ends
    /**
     * 	Returns the value of linkAreaM51u
     * 	@return linkAreaM51u
     */
    public LinkAreaM51u getLinkAreaM51u() {
        return linkAreaM51u;
    }

    // *** setGroup.txt starts
    /**
     *  	Update LinkAreaM51u with the passed value
     * 	@param value
     */
    @JsonIgnore
public void setLinkAreaM51u(com.cloudframe.app.dto.o529351u.LinkAreaM51u value) throws CFException {
        linkAreaM51u.populateFrom(value);
    }

    /**
     *  	Update LinkAreaM51u with the passed value
     * 	@param value
     */
    public void setLinkAreaM51u(LinkAreaM51u value) {
        linkAreaM51u = value;
    }

    // *** setGroup.txt ends
    /**
     * 	Returns the value of ppaPpoaltRecord
     * 	@return ppaPpoaltRecord
     */
    public PpaPpoaltRecord getPpaPpoaltRecord() {
        return ppaPpoaltRecord;
    }

    // *** setGroup.txt starts
    /**
     *  	Update PpaPpoaltRecord with the passed value
     * 	@param value
     */
    @JsonIgnore
public void setPpaPpoaltRecord(com.cloudframe.app.dto.o529351u.PpaPpoaltRecord value) throws CFException {
        ppaPpoaltRecord.populateFrom(value);
    }

    /**
     *  	Update PpaPpoaltRecord with the passed value
     * 	@param value
     */
    public void setPpaPpoaltRecord(PpaPpoaltRecord value) {
        ppaPpoaltRecord = value;
    }

    // *** setGroup.txt ends
    @JsonIgnore
public void setDfhcommarea(com.cloudframe.app.dto.o529351u.Dfhcommarea dfhcommarea) throws CFException {
        xrefRecord.setXrefRecord(dfhcommarea.getXrefRecord());
        xrefCmInfo.setXrefCmInfo(dfhcommarea.getXrefCmInfo());
        linkAreaM51u.setLinkAreaM51u(dfhcommarea.getLinkAreaM51u());
        ppaPpoaltRecord.setPpaPpoaltRecord(dfhcommarea.getPpaPpoaltRecord());
    }

    @JsonIgnore
public void populateFrom(com.cloudframe.app.dto.o529351u.Dfhcommarea dfhcommarea) throws CFException {
        xrefRecord.populateFrom(dfhcommarea.getXrefRecord());
        xrefCmInfo.populateFrom(dfhcommarea.getXrefCmInfo());
        linkAreaM51u.populateFrom(dfhcommarea.getLinkAreaM51u());
        ppaPpoaltRecord.populateFrom(dfhcommarea.getPpaPpoaltRecord());
    }
}
