package com.cloudframe.app.rest.o529351u;

/**
 *  The class PpaFixedPortion is used to handle fields declared in it
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

public class PpaFixedPortion {

    protected Logger logger = LoggerFactory.getLogger(PpaFixedPortion.class);

    /*  Child Field declaration */
    @JsonProperty("ppaKey")
    private PpaKey ppaKey = new PpaKey();

    private int ppaLastUpdDate;

    private int ppaLastUpdTime;

    private short ppaPpoIdCount;

    /*  End of Field declaration */
    /**
     * 	Returns the value of ppaKey
     * 	@return ppaKey
     */
    public PpaKey getPpaKey() {
        return ppaKey;
    }

    // *** setGroup.txt starts
    /**
     *  	Update PpaKey with the passed value
     * 	@param value
     */
    @JsonIgnore
public void setPpaKey(com.cloudframe.app.dto.o529351u.PpaKey value) throws CFException {
        ppaKey.populateFrom(value);
    }

    /**
     *  	Update PpaKey with the passed value
     * 	@param value
     */
    public void setPpaKey(PpaKey value) {
        ppaKey = value;
    }

    // *** setGroup.txt ends
    public int getPpaLastUpdDate() {
        return ppaLastUpdDate;
    }

    /**
     *  	Update PpaLastUpdDate with the passed value
     * 	@param number
     */
    public void setPpaLastUpdDate(int number) {
        ppaLastUpdDate = number;
    }

    public int getPpaLastUpdTime() {
        return ppaLastUpdTime;
    }

    /**
     *  	Update PpaLastUpdTime with the passed value
     * 	@param number
     */
    public void setPpaLastUpdTime(int number) {
        ppaLastUpdTime = number;
    }

    public short getPpaPpoIdCount() {
        return ppaPpoIdCount;
    }

    /**
     *  	Update PpaPpoIdCount with the passed value
     * 	@param number
     */
    public void setPpaPpoIdCount(short number) {
        ppaPpoIdCount = number;
    }

    @JsonIgnore
public void setPpaFixedPortion(com.cloudframe.app.dto.o529351u.PpaFixedPortion ppaFixedPortion) throws CFException {
        ppaKey.setPpaKey(ppaFixedPortion.getPpaKey());
        ppaFixedPortion.setPpaLastUpdDate(ppaLastUpdDate);
        ppaFixedPortion.setPpaLastUpdTime(ppaLastUpdTime);
        ppaFixedPortion.setPpaPpoIdCount(ppaPpoIdCount);
    }

    @JsonIgnore
public void populateFrom(com.cloudframe.app.dto.o529351u.PpaFixedPortion ppaFixedPortion) throws CFException {
        ppaKey.populateFrom(ppaFixedPortion.getPpaKey());
        setPpaLastUpdDate(ppaFixedPortion.getPpaLastUpdDate());
        setPpaLastUpdTime(ppaFixedPortion.getPpaLastUpdTime());
        setPpaPpoIdCount(ppaFixedPortion.getPpaPpoIdCount());
    }
}
