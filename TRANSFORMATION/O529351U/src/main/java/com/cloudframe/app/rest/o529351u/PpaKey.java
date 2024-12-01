package com.cloudframe.app.rest.o529351u;

/**
 *  The class PpaKey is used to handle fields declared in it
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

public class PpaKey {

    protected Logger logger = LoggerFactory.getLogger(PpaKey.class);

    /*  Child Field declaration */
    private long ppaProvTinSuff;

    /*  End of Field declaration */
    public long getPpaProvTinSuff() {
        return ppaProvTinSuff;
    }

    /**
     *  	Update PpaProvTinSuff with the passed value
     * 	@param number
     */
    public void setPpaProvTinSuff(long number) {
        ppaProvTinSuff = number;
    }

    @JsonIgnore
public void setPpaKey(com.cloudframe.app.dto.o529351u.PpaKey ppaKey) throws CFException {
        ppaKey.setPpaProvTinSuff(ppaProvTinSuff);
    }

    @JsonIgnore
public void populateFrom(com.cloudframe.app.dto.o529351u.PpaKey ppaKey) throws CFException {
        setPpaProvTinSuff(ppaKey.getPpaProvTinSuff());
    }
}
