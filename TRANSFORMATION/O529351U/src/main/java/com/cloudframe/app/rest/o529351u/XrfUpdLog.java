package com.cloudframe.app.rest.o529351u;

/**
 *  The class XrfUpdLog is used to handle fields declared in it
 *  @author CloudFrame Inc.
 *  created on 2024-12-01 at 05:44.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import jakarta.validation.constraints.Size;

public class XrfUpdLog {

    protected Logger logger = LoggerFactory.getLogger(XrfUpdLog.class);

    /*  Child Field declaration */
    private int xrfUpdDate;

    private int xrfUpdTime;

    /*  End of Field declaration */
    /**
     * 	Returns the value of xrfUpdDate
     * 	@return xrfUpdDate
     */
    public int getXrfUpdDate() {
        return xrfUpdDate;
    }

    /**
     *  	Updates XrfUpdDate with the value
     * 	@param number
     */
    public void setXrfUpdDate(int number) {
        xrfUpdDate = number;
    }

    /**
     * 	Returns the value of xrfUpdTime
     * 	@return xrfUpdTime
     */
    public int getXrfUpdTime() {
        return xrfUpdTime;
    }

    /**
     *  	Updates XrfUpdTime with the value
     * 	@param number
     */
    public void setXrfUpdTime(int number) {
        xrfUpdTime = number;
    }

    @JsonIgnore
public void setXrfUpdLog(com.cloudframe.app.dto.o529351u.XrfUpdLog xrfUpdLog) throws CFException {
        xrfUpdLog.setXrfUpdDate(xrfUpdDate);
        xrfUpdLog.setXrfUpdTime(xrfUpdTime);
    }

    @JsonIgnore
public void populateFrom(com.cloudframe.app.dto.o529351u.XrfUpdLog xrfUpdLog) throws CFException {
        setXrfUpdDate(xrfUpdLog.getXrfUpdDate());
        setXrfUpdTime(xrfUpdLog.getXrfUpdTime());
    }
}
