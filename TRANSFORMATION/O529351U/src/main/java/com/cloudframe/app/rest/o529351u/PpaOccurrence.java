package com.cloudframe.app.rest.o529351u;

/**
 *  The class PpaOccurrence is used to handle fields declared in it
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

public class PpaOccurrence {

    protected Logger logger = LoggerFactory.getLogger(PpaOccurrence.class);

    /*  Child Field declaration */
    @Size(min = 0, max = 3)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String ppaProduct = "";

    private short ppaMarketType;

    private int ppaMarket;

    private int ppaIpa;

    @Size(min = 0, max = 4)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String ppaGrpTabNo = "";

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String ppaContractArrange = "";

    private int ppaFirstEffDate;

    private int ppaLastCanDate;

    @Size(min = 0, max = 1)
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String ppaFacContr = "";

    /*  End of Field declaration */
    /**
     * 	Returns the value of ppaProduct
     * 	@return ppaProduct
     */
    public String getPpaProduct() {
        return ppaProduct;
    }

    /**
     *  set variable ppaProduct
     *  @param value
     */
    public void setPpaProduct(String value) {
        ppaProduct = value.trim();
    }

    public short getPpaMarketType() {
        return ppaMarketType;
    }

    /**
     *  	Update PpaMarketType with the passed value
     * 	@param number
     */
    public void setPpaMarketType(short number) {
        ppaMarketType = number;
    }

    public int getPpaMarket() {
        return ppaMarket;
    }

    /**
     *  	Update PpaMarket with the passed value
     * 	@param number
     */
    public void setPpaMarket(int number) {
        ppaMarket = number;
    }

    public int getPpaIpa() {
        return ppaIpa;
    }

    /**
     *  	Update PpaIpa with the passed value
     * 	@param number
     */
    public void setPpaIpa(int number) {
        ppaIpa = number;
    }

    /**
     * 	Returns the value of ppaGrpTabNo
     * 	@return ppaGrpTabNo
     */
    public String getPpaGrpTabNo() {
        return ppaGrpTabNo;
    }

    /**
     *  set variable ppaGrpTabNo
     *  @param value
     */
    public void setPpaGrpTabNo(String value) {
        ppaGrpTabNo = value.trim();
    }

    /**
     * 	Returns the value of ppaContractArrange
     * 	@return ppaContractArrange
     */
    public String getPpaContractArrange() {
        return ppaContractArrange;
    }

    /**
     *  set variable ppaContractArrange
     *  @param value
     */
    public void setPpaContractArrange(String value) {
        ppaContractArrange = value.trim();
    }

    public int getPpaFirstEffDate() {
        return ppaFirstEffDate;
    }

    /**
     *  	Update PpaFirstEffDate with the passed value
     * 	@param number
     */
    public void setPpaFirstEffDate(int number) {
        ppaFirstEffDate = number;
    }

    public int getPpaLastCanDate() {
        return ppaLastCanDate;
    }

    /**
     *  	Update PpaLastCanDate with the passed value
     * 	@param number
     */
    public void setPpaLastCanDate(int number) {
        ppaLastCanDate = number;
    }

    /**
     * 	Returns the value of ppaFacContr
     * 	@return ppaFacContr
     */
    public String getPpaFacContr() {
        return ppaFacContr;
    }

    /**
     *  set variable ppaFacContr
     *  @param value
     */
    public void setPpaFacContr(String value) {
        ppaFacContr = value.trim();
    }

    @JsonIgnore
public void setPpaOccurrence(com.cloudframe.app.dto.o529351u.PpaOccurrence ppaOccurrence) throws CFException {
        if (ppaProduct != null && !ppaProduct.isEmpty()) {
            ppaOccurrence.setPpaProduct(ppaProduct.toCharArray());
        }
        ppaOccurrence.setPpaMarketType(ppaMarketType);
        ppaOccurrence.setPpaMarket(ppaMarket);
        ppaOccurrence.setPpaIpa(ppaIpa);
        if (ppaGrpTabNo != null && !ppaGrpTabNo.isEmpty()) {
            ppaOccurrence.setPpaGrpTabNo(ppaGrpTabNo.toCharArray());
        }
        if (ppaContractArrange != null && !ppaContractArrange.isEmpty()) {
            ppaOccurrence.setPpaContractArrange(ppaContractArrange.toCharArray());
        }
        ppaOccurrence.setPpaFirstEffDate(ppaFirstEffDate);
        ppaOccurrence.setPpaLastCanDate(ppaLastCanDate);
        if (ppaFacContr != null && !ppaFacContr.isEmpty()) {
            ppaOccurrence.setPpaFacContr(ppaFacContr.toCharArray());
        }
    }

    @JsonIgnore
public void populateFrom(com.cloudframe.app.dto.o529351u.PpaOccurrence ppaOccurrence) throws CFException {
        setPpaProduct(String.valueOf(ppaOccurrence.getPpaProduct()));
        setPpaMarketType(ppaOccurrence.getPpaMarketType());
        setPpaMarket(ppaOccurrence.getPpaMarket());
        setPpaIpa(ppaOccurrence.getPpaIpa());
        setPpaGrpTabNo(String.valueOf(ppaOccurrence.getPpaGrpTabNo()));
        setPpaContractArrange(String.valueOf(ppaOccurrence.getPpaContractArrange()));
        setPpaFirstEffDate(ppaOccurrence.getPpaFirstEffDate());
        setPpaLastCanDate(ppaOccurrence.getPpaLastCanDate());
        setPpaFacContr(String.valueOf(ppaOccurrence.getPpaFacContr()));
    }
}
