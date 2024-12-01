package com.cloudframe.app.rest.o529351u;

/**
 *  The class UGenericTranslation51 is used to handle fields declared in it
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
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

public class UGenericTranslation51 {

    protected Logger logger = LoggerFactory.getLogger(UGenericTranslation51.class);

    /*  Child Field declaration */
    @Size(min = 0, max = 9)
    @Schema(description = "Default value is empty", defaultValue = "[]")
    private List<UGenericTrnslGroup51> ugenericTrnslGroup51 = new ArrayList<>();

    /*  End of Field declaration */
    /**
     * 	Returns the  value of uGenericTrnslGroup51
     * 	@return uGenericTrnslGroup51
     */
    public List<UGenericTrnslGroup51> getUgenericTrnslGroup51() {
        return ugenericTrnslGroup51;
    }

    /**
     * 	Returns the element at the specified position in this list.
     *   @param index
     * 	@return uGenericTrnslGroup51
     */
    public UGenericTrnslGroup51 getUgenericTrnslGroup51(int index) {
        return ugenericTrnslGroup51.get(index);
    }

    // *** setArrayGroup.txt starts
    /**
     * 	Update UGenericTrnslGroup51 at index with the passed value
     *   @param index
     * 	@param value
     */
    @JsonIgnore
public void setUGenericTrnslGroup51(int index, com.cloudframe.app.dto.o529351u.UGenericTrnslGroup51 value) throws CFException {
        // *** setArrayChild.txt starts
        ugenericTrnslGroup51.get(index).setUgenericTrnsl51(String.valueOf(value.getUGenericTrnsl51()));
        // *** setArrayChild.txt ends
    }

    public void setUgenericTrnslGroup51(int index, UGenericTrnslGroup51 value) {
        ugenericTrnslGroup51.set(index, value);
    }

    // *** setArrayGroup.txt ends
    @JsonIgnore
public void setUGenericTranslation51(com.cloudframe.app.dto.o529351u.UGenericTranslation51 uGenericTranslation51) throws CFException {
        for (int index = 0; index < ugenericTrnslGroup51.size(); index++) {
            ugenericTrnslGroup51.get(index).setUGenericTrnslGroup51(uGenericTranslation51.getUGenericTrnslGroup51(index));
        }
    }

    @JsonIgnore
public void populateFrom(com.cloudframe.app.dto.o529351u.UGenericTranslation51 uGenericTranslation51) throws CFException {
        ugenericTrnslGroup51.clear();
        uGenericTranslation51.getUGenericTrnslGroup51().forEach(item -> {
            if (!CFUtil.trim(item.toCharArray()).isEmpty()) {
                UGenericTrnslGroup51 uGenericTrnslGroup51Item = new UGenericTrnslGroup51();
                try {
                    uGenericTrnslGroup51Item.populateFrom(item);
                    ugenericTrnslGroup51.add(uGenericTrnslGroup51Item);
                } catch (CFException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
