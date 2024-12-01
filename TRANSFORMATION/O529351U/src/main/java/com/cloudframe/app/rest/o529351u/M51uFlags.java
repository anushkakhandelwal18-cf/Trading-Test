package com.cloudframe.app.rest.o529351u;

/**
 *  The class M51uFlags is used to handle fields declared in it
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

public class M51uFlags {

    protected Logger logger = LoggerFactory.getLogger(M51uFlags.class);

    /*  Child Field declaration */
    @Size(min = 0, max = 2)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String m51uFunctionFlag = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String m51uIllogicalCondSw = "";

    /*  End of Field declaration */
    /**
     * 	Returns the value of m51uFunctionFlag
     * 	@return m51uFunctionFlag
     */
    public String getM51uFunctionFlag() {
        return m51uFunctionFlag;
    }

    /**
     *  set variable m51uFunctionFlag
     *  @param value
     */
    public void setM51uFunctionFlag(String value) {
        m51uFunctionFlag = value.trim();
    }

    /**
     * 	Returns the value of m51uIllogicalCondSw
     * 	@return m51uIllogicalCondSw
     */
    public String getM51uIllogicalCondSw() {
        return m51uIllogicalCondSw;
    }

    /**
     *  set variable m51uIllogicalCondSw
     *  @param value
     */
    public void setM51uIllogicalCondSw(String value) {
        m51uIllogicalCondSw = value.trim();
    }

    @JsonIgnore
public void setM51uFlags(com.cloudframe.app.dto.o529351u.M51uFlags m51uFlags) throws CFException {
        if (m51uFunctionFlag != null && !m51uFunctionFlag.isEmpty()) {
            m51uFlags.setM51uFunctionFlag(m51uFunctionFlag.toCharArray());
        }
        if (m51uIllogicalCondSw != null && !m51uIllogicalCondSw.isEmpty()) {
            m51uFlags.setM51uIllogicalCondSw(m51uIllogicalCondSw.toCharArray());
        }
    }

    @JsonIgnore
public void populateFrom(com.cloudframe.app.dto.o529351u.M51uFlags m51uFlags) throws CFException {
        setM51uFunctionFlag(String.valueOf(m51uFlags.getM51uFunctionFlag()));
        setM51uIllogicalCondSw(String.valueOf(m51uFlags.getM51uIllogicalCondSw()));
    }
}
