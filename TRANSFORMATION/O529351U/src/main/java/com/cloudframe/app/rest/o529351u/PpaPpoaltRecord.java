package com.cloudframe.app.rest.o529351u;

/**
 *  The class PpaPpoaltRecord is used to handle fields declared in it
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
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

public class PpaPpoaltRecord {

    protected Logger logger = LoggerFactory.getLogger(PpaPpoaltRecord.class);

    /*  Child Field declaration */
    @JsonProperty("ppaFixedPortion")
    private PpaFixedPortion ppaFixedPortion = new PpaFixedPortion();

    @Size(min = 0, max = 252)
    @Schema(description = "Default value is empty", defaultValue = "[]")
    private List<PpaPpoId> ppaPpoId = new ArrayList<>();

    /*  End of Field declaration */
    /**
     * 	Returns the value of ppaFixedPortion
     * 	@return ppaFixedPortion
     */
    public PpaFixedPortion getPpaFixedPortion() {
        return ppaFixedPortion;
    }

    // *** setGroup.txt starts
    /**
     *  	Update PpaFixedPortion with the passed value
     * 	@param value
     */
    @JsonIgnore
public void setPpaFixedPortion(com.cloudframe.app.dto.o529351u.PpaFixedPortion value) throws CFException {
        ppaFixedPortion.populateFrom(value);
    }

    /**
     *  	Update PpaFixedPortion with the passed value
     * 	@param value
     */
    public void setPpaFixedPortion(PpaFixedPortion value) {
        ppaFixedPortion = value;
    }

    // *** setGroup.txt ends
    /**
     * 	Returns the  value of ppaPpoId
     * 	@return ppaPpoId
     */
    public List<PpaPpoId> getPpaPpoId() {
        return ppaPpoId;
    }

    /**
     * 	Returns the element at the specified position in this list.
     *   @param index
     * 	@return ppaPpoId
     */
    public PpaPpoId getPpaPpoId(int index) {
        return ppaPpoId.get(index);
    }

    // *** setArrayGroup.txt starts
    /**
     * 	Update PpaPpoId at index with the passed value
     *   @param index
     * 	@param value
     */
    @JsonIgnore
public void setPpaPpoId(int index, com.cloudframe.app.dto.o529351u.PpaPpoId value) throws CFException {
        // *** setArrayChild.txt starts
        // Array Group not yet handled
        // *** setArrayChild.txt ends
    }

    public void setPpaPpoId(int index, PpaPpoId value) {
        ppaPpoId.set(index, value);
    }

    // *** setArrayGroup.txt ends
    @JsonIgnore
public void setPpaPpoaltRecord(com.cloudframe.app.dto.o529351u.PpaPpoaltRecord ppaPpoaltRecord) throws CFException {
        ppaFixedPortion.setPpaFixedPortion(ppaPpoaltRecord.getPpaFixedPortion());
        for (int index = 0; index < ppaPpoId.size(); index++) {
            ppaPpoId.get(index).setPpaPpoId(ppaPpoaltRecord.getPpaPpoId(index));
        }
    }

    @JsonIgnore
public void populateFrom(com.cloudframe.app.dto.o529351u.PpaPpoaltRecord ppaPpoaltRecord) throws CFException {
        ppaFixedPortion.populateFrom(ppaPpoaltRecord.getPpaFixedPortion());
        ppaPpoId.clear();
        ppaPpoaltRecord.getPpaPpoId().forEach(item -> {
            if (!CFUtil.trim(item.toCharArray()).isEmpty()) {
                PpaPpoId ppaPpoIdItem = new PpaPpoId();
                try {
                    ppaPpoIdItem.populateFrom(item);
                    ppaPpoId.add(ppaPpoIdItem);
                } catch (CFException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
