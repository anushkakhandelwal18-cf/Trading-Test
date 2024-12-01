package com.cloudframe.app.rest.o529351u;

/**
 *  The class UGenericTrnslGroup51 is used to handle fields declared in it
 *  @author CloudFrame Inc.
 *  created on 2024-12-01 at 05:44.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

public class UGenericTrnslGroup51 {

    protected Logger logger = LoggerFactory.getLogger(UGenericTrnslGroup51.class);

    /*  Child Field declaration */
    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String ugenericTrnsl51 = "";

    /*  End of Field declaration */
    /**
     * 	Returns the value of uGenericTrnsl51
     * 	@return uGenericTrnsl51
     */
    public String getUgenericTrnsl51() {
        return ugenericTrnsl51;
    }

    /**
     *  set variable uGenericTrnsl51
     *  @param value
     */
    public void setUgenericTrnsl51(String value) {
        ugenericTrnsl51 = value.trim();
    }

    @JsonIgnore
public void setUGenericTrnslGroup51(com.cloudframe.app.dto.o529351u.UGenericTrnslGroup51 uGenericTrnslGroup51) throws CFException {
        if (ugenericTrnsl51 != null && !ugenericTrnsl51.isEmpty()) {
            uGenericTrnslGroup51.setUGenericTrnsl51(ugenericTrnsl51.toCharArray());
        }
    }

    @JsonIgnore
public void populateFrom(com.cloudframe.app.dto.o529351u.UGenericTrnslGroup51 uGenericTrnslGroup51) throws CFException {
        setUgenericTrnsl51(String.valueOf(uGenericTrnslGroup51.getUGenericTrnsl51()));
    }
}
