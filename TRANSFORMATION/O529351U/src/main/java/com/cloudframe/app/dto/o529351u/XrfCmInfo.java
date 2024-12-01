package com.cloudframe.app.dto.o529351u;

/**
*  The class XrfCmInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class XrfCmInfo extends XrfCmInfoSerialized { 
   

						private char[] xrfPlcyCm = Field.fillLowValue(6);

								private short xrfDivCm;

								private short xrfClsCm;

						private char[] xrfCancCdCm = Field.fillLowValue(1);

						private char[] xrfTefraApply = Field.fillLowValue(1);

								private int xrfEffDtCm;

								private int xrfCancDtCm;

						private char[] xrfLglEntyCd = Field.fillLowValue(5);

						private char[] xrfAcisEnrpInd = Field.fillLowValue(1);

								private BigDecimal xrfEnrpDefPct = BigDecimal.ZERO;

								private BigDecimal xrfMnrpDefPct = BigDecimal.ZERO;

								private BigDecimal xrfMnrpPtPct = BigDecimal.ZERO;

						private char[] xrfSurprsMedBilCd = Field.fillLowValue(1);


						private char[] xrfEbdsSetId2 = Field.fillLowValue(1);

						private char[] xrfAcnInd = Field.fillLowValue(1);

						private char[] xrfUhpInd = Field.fillLowValue(1);

						private char[] xrfAiInd = Field.fillLowValue(1);

						private char[] xrfEnrpErFacInd = Field.fillLowValue(1);

						private char[] xrfErWrapInd = Field.fillLowValue(1);

								private short xrfLabPct;

								private short xrfDmePct;

						private char[] xrfBusSegPltfm = Field.fillLowValue(3);


						private char[] xrfNmaddrCdCm = Field.fillLowValue(1);

						private char[] xrfMcSel = Field.fillLowValue(1);

						private char[] xrfPlcyAutpayInd = Field.fillLowValue(1);

						private char[] xrfRptCdCm = Field.fillLowValue(1);

						private char[] xrfMailCdCm = Field.fillLowValue(4);
				private XrfRpData xrfRpData = new XrfRpData();

								private int xrfFranchCd;

								private short xrfEbdsCovBase;

								private short xrfEbdsCovMme;

								private short xrfEbdsCovMcr;

						private char[] xrfEbdsSetId = Field.fillLowValue(1);

						private char[] xrfAaCm = Field.fillLowValue(1);

						private char[] xrfRxCm = Field.fillLowValue(6);

						private char[] xrfModCm = Field.fillLowValue(1);

						private char[] xrfPcsCm = Field.fillLowValue(1);

						private char[] xrfCchCm = Field.fillLowValue(1);

						private char[] xrfCapInd = Field.fillLowValue(1);

								private short xrfApportionmentPct;

								private short xrfPayloc1;

								private short xrfPayloc2;

						private char[] xrfMnnrpInd = Field.fillLowValue(1);

								private short xrfMnnrpPct;

						private char[] xrfIplan = Field.fillLowValue(1);

						private char[] xrfObligorInd = Field.fillLowValue(2);

						private char[] xrfSharedArg = Field.fillLowValue(2);

						private char[] xrfMeInd = Field.fillLowValue(1);

						private char[] xrfPteInd = Field.fillLowValue(1);

						private char[] xrfProductInd = Field.fillLowValue(3);

						private char[] xrfFreelookInd = Field.fillLowValue(1);

						private char[] xrfEbrInd = Field.fillLowValue(1);

						private char[] xrfLimSvcInd = Field.fillLowValue(1);

						private char[] xrfOptOutUbhTier = Field.fillLowValue(1);

								private int xrfHraApIndLmt;

								private int xrfHraApFamLmt;

								private int xrfDefaultPoc;

								private int xrfPcntRateJqCodesFound;

						private char[] xrfAppealLangInd = Field.fillLowValue(1);

						private char[] xrfProrateIntrvl = Field.fillLowValue(1);

						private char[] xrfNbSuppressInd = Field.fillLowValue(1);

						private char[] xrfProrateEvent = Field.fillLowValue(1);

						private char[] xrfCoreMedPrrAuthCd = Field.fillLowValue(1);

						private char[] xrfEnrpErInd = Field.fillLowValue(1);

						private char[] xrfEnrpNonErInd = Field.fillLowValue(1);

								private int xrfEnrpNonErPct;

						private char[] xrfEhbInd = Field.fillLowValue(1);

						private char[] filler01 = Field.fillLowValue(1);
	
	/**
	* Constructor for XrfCmInfo
	**/
    public XrfCmInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for XrfCmInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XrfCmInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			xrfRpData.setParent(this,getStartOffset() + 172);
    } 

	/**
	 *	Returns the value of xrfPlcyCm
	 *	@return xrfPlcyCm
	 */
   public char[] getXrfPlcyCm() throws CFException{
     if (isXrfPlcyCmModified()) { 
        xrfPlcyCm = refreshXrfPlcyCm();
     }
   		return xrfPlcyCm;
   }

  
	/**
	*  set variable xrfPlcyCm
	*  Corresponding COBOL Variable is XRF-PLCY-CM
	*  @param value
	**/
   public void setXrfPlcyCm(char[] value) {
      xrfPlcyCm = checkXrfPlcyCmConstraints(value);
      serializeXrfPlcyCm(xrfPlcyCm);
   } 

     /**
	 * 	Update XrfPlcyCm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfPlcyCm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfPlcyCm,xrfPlcyCm.length);
   	
   }
   
   public void setXrfPlcyCm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfPlcyCm,xrfPlcyCm.length);
   	
   }
   
     /**
	 * 	Update XrfPlcyCm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfPlcyCm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfPlcyCm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfPlcyCm with another Field
	 *	@param value
	 */
   public void setXrfPlcyCm(Field source) {
       replace(source,0,source.length(),beginXrfPlcyCm,XRF_PLCY_CM_LEN);
   	
   }  
   
     /**
	 * 	Update XrfPlcyCm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfPlcyCm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfPlcyCm,XRF_PLCY_CM_LEN);
   	
   }
   
     /**
	 * 	Update XrfPlcyCm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfPlcyCm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfPlcyCm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfDivCm
	 *	@return xrfDivCm
	 */
	public short getXrfDivCm() throws CFException {
        if (isXrfDivCmModified()) { 
           xrfDivCm = refreshXrfDivCm();
        }
   		return xrfDivCm;
	}
	
	/**
	 * 	Update XrfDivCm with the passed value
	 *  Corresponding COBOL Variable is XRF-DIV-CM
	 *	@param number
	 */
	public void setXrfDivCm(short number) {
	     // Truncate if the number is beyond +/- Max range
	    xrfDivCm = checkXrfDivCmMaxLimit(number); 
		serializeXrfDivCm(xrfDivCm);
	}

	public void setXrfDivCm(int number) {
	    number = checkXrfDivCmMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfDivCm((short)number);
	}
	public void setXrfDivCm(long number) {
	    number = checkXrfDivCmMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfDivCm((short)number);
	}
	

	/**
	 *	Returns the value of xrfClsCm
	 *	@return xrfClsCm
	 */
	public short getXrfClsCm() throws CFException {
        if (isXrfClsCmModified()) { 
           xrfClsCm = refreshXrfClsCm();
        }
   		return xrfClsCm;
	}
	
	/**
	 * 	Update XrfClsCm with the passed value
	 *  Corresponding COBOL Variable is XRF-CLS-CM
	 *	@param number
	 */
	public void setXrfClsCm(short number) {
	     // Truncate if the number is beyond +/- Max range
	    xrfClsCm = checkXrfClsCmMaxLimit(number); 
		serializeXrfClsCm(xrfClsCm);
	}

	public void setXrfClsCm(int number) {
	    number = checkXrfClsCmMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfClsCm((short)number);
	}
	public void setXrfClsCm(long number) {
	    number = checkXrfClsCmMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfClsCm((short)number);
	}
	

	/**
	 *	Returns the value of xrfCancCdCm
	 *	@return xrfCancCdCm
	 */
   public char[] getXrfCancCdCm() throws CFException{
     if (isXrfCancCdCmModified()) { 
        xrfCancCdCm = refreshXrfCancCdCm();
     }
   		return xrfCancCdCm;
   }

  
	/**
	*  set variable xrfCancCdCm
	*  Corresponding COBOL Variable is XRF-CANC-CD-CM
	*  @param value
	**/
   public void setXrfCancCdCm(char[] value) {
      xrfCancCdCm = checkXrfCancCdCmConstraints(value);
      serializeXrfCancCdCm(xrfCancCdCm);
   } 

     /**
	 * 	Update XrfCancCdCm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfCancCdCm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfCancCdCm,xrfCancCdCm.length);
   	
   }
   
   public void setXrfCancCdCm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfCancCdCm,xrfCancCdCm.length);
   	
   }
   
     /**
	 * 	Update XrfCancCdCm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfCancCdCm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfCancCdCm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfCancCdCm with another Field
	 *	@param value
	 */
   public void setXrfCancCdCm(Field source) {
       replace(source,0,source.length(),beginXrfCancCdCm,XRF_CANC_CD_CM_LEN);
   	
   }  
   
     /**
	 * 	Update XrfCancCdCm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfCancCdCm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfCancCdCm,XRF_CANC_CD_CM_LEN);
   	
   }
   
     /**
	 * 	Update XrfCancCdCm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfCancCdCm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfCancCdCm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfTefraApply
	 *	@return xrfTefraApply
	 */
   public char[] getXrfTefraApply() throws CFException{
     if (isXrfTefraApplyModified()) { 
        xrfTefraApply = refreshXrfTefraApply();
     }
   		return xrfTefraApply;
   }

  
	/**
	*  set variable xrfTefraApply
	*  Corresponding COBOL Variable is XRF-TEFRA-APPLY
	*  @param value
	**/
   public void setXrfTefraApply(char[] value) {
      xrfTefraApply = checkXrfTefraApplyConstraints(value);
      serializeXrfTefraApply(xrfTefraApply);
   } 

     /**
	 * 	Update XrfTefraApply 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfTefraApply(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfTefraApply,xrfTefraApply.length);
   	
   }
   
   public void setXrfTefraApply(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfTefraApply,xrfTefraApply.length);
   	
   }
   
     /**
	 * 	Update XrfTefraApply 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfTefraApply(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfTefraApply+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfTefraApply with another Field
	 *	@param value
	 */
   public void setXrfTefraApply(Field source) {
       replace(source,0,source.length(),beginXrfTefraApply,XRF_TEFRA_APPLY_LEN);
   	
   }  
   
     /**
	 * 	Update XrfTefraApply 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfTefraApply(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfTefraApply,XRF_TEFRA_APPLY_LEN);
   	
   }
   
     /**
	 * 	Update XrfTefraApply 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfTefraApply(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfTefraApply+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfEffDtCm
	 *	@return xrfEffDtCm
	 */
	public int getXrfEffDtCm() throws CFException {
        if (isXrfEffDtCmModified()) { 
           xrfEffDtCm = refreshXrfEffDtCm();
        }
   		return xrfEffDtCm;
	}
	
	/**
	 * 	Update XrfEffDtCm with the passed value
	 *  Corresponding COBOL Variable is XRF-EFF-DT-CM
	 *	@param number
	 */
	public void setXrfEffDtCm(int number) {
	     // Truncate if the number is beyond +/- Max range
	    xrfEffDtCm = checkXrfEffDtCmMaxLimit(number); 
		serializeXrfEffDtCm(xrfEffDtCm);
	}


	public void setXrfEffDtCm(long number) {
	    number = checkXrfEffDtCmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setXrfEffDtCm((int)number);
	}
	
	/**
	 *	Returns the value of xrfCancDtCm
	 *	@return xrfCancDtCm
	 */
	public int getXrfCancDtCm() throws CFException {
        if (isXrfCancDtCmModified()) { 
           xrfCancDtCm = refreshXrfCancDtCm();
        }
   		return xrfCancDtCm;
	}
	
	/**
	 * 	Update XrfCancDtCm with the passed value
	 *  Corresponding COBOL Variable is XRF-CANC-DT-CM
	 *	@param number
	 */
	public void setXrfCancDtCm(int number) {
	     // Truncate if the number is beyond +/- Max range
	    xrfCancDtCm = checkXrfCancDtCmMaxLimit(number); 
		serializeXrfCancDtCm(xrfCancDtCm);
	}


	public void setXrfCancDtCm(long number) {
	    number = checkXrfCancDtCmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setXrfCancDtCm((int)number);
	}
	
	/**
	 *	Returns the value of xrfLglEntyCd
	 *	@return xrfLglEntyCd
	 */
   public char[] getXrfLglEntyCd() throws CFException{
     if (isXrfLglEntyCdModified()) { 
        xrfLglEntyCd = refreshXrfLglEntyCd();
     }
   		return xrfLglEntyCd;
   }

  
	/**
	*  set variable xrfLglEntyCd
	*  Corresponding COBOL Variable is XRF-LGL-ENTY-CD
	*  @param value
	**/
   public void setXrfLglEntyCd(char[] value) {
      xrfLglEntyCd = checkXrfLglEntyCdConstraints(value);
      serializeXrfLglEntyCd(xrfLglEntyCd);
   } 

     /**
	 * 	Update XrfLglEntyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfLglEntyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfLglEntyCd,xrfLglEntyCd.length);
   	
   }
   
   public void setXrfLglEntyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfLglEntyCd,xrfLglEntyCd.length);
   	
   }
   
     /**
	 * 	Update XrfLglEntyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfLglEntyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfLglEntyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfLglEntyCd with another Field
	 *	@param value
	 */
   public void setXrfLglEntyCd(Field source) {
       replace(source,0,source.length(),beginXrfLglEntyCd,XRF_LGL_ENTY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update XrfLglEntyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfLglEntyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfLglEntyCd,XRF_LGL_ENTY_CD_LEN);
   	
   }
   
     /**
	 * 	Update XrfLglEntyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfLglEntyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfLglEntyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfAcisEnrpInd
	 *	@return xrfAcisEnrpInd
	 */
   public char[] getXrfAcisEnrpInd() throws CFException{
     if (isXrfAcisEnrpIndModified()) { 
        xrfAcisEnrpInd = refreshXrfAcisEnrpInd();
     }
   		return xrfAcisEnrpInd;
   }

  
	/**
	*  set variable xrfAcisEnrpInd
	*  Corresponding COBOL Variable is XRF-ACIS-ENRP-IND
	*  @param value
	**/
   public void setXrfAcisEnrpInd(char[] value) {
      xrfAcisEnrpInd = checkXrfAcisEnrpIndConstraints(value);
      serializeXrfAcisEnrpInd(xrfAcisEnrpInd);
   } 

     /**
	 * 	Update XrfAcisEnrpInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfAcisEnrpInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfAcisEnrpInd,xrfAcisEnrpInd.length);
   	
   }
   
   public void setXrfAcisEnrpInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfAcisEnrpInd,xrfAcisEnrpInd.length);
   	
   }
   
     /**
	 * 	Update XrfAcisEnrpInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfAcisEnrpInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfAcisEnrpInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfAcisEnrpInd with another Field
	 *	@param value
	 */
   public void setXrfAcisEnrpInd(Field source) {
       replace(source,0,source.length(),beginXrfAcisEnrpInd,XRF_ACIS_ENRP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfAcisEnrpInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfAcisEnrpInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfAcisEnrpInd,XRF_ACIS_ENRP_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfAcisEnrpInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfAcisEnrpInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfAcisEnrpInd+targetIndex,targetLen);
    
   }
	public BigDecimal getXrfEnrpDefPct() throws CFException {
        if (isXrfEnrpDefPctModified()) { 
           xrfEnrpDefPct = refreshXrfEnrpDefPct();
        }
   		return xrfEnrpDefPct;
	}

    public char[] getXrfEnrpDefPctString() {
          return  xrfEnrpDefPctString();
    }
	
	/**
	 * 	Update XrfEnrpDefPct with the passed number
	 *  Corresponding COBOL Variable is XRF-ENRP-DEF-PCT
	 *	@param number
	 */
	public void setXrfEnrpDefPct(BigDecimal number) {	
     xrfEnrpDefPct = checkXrfEnrpDefPctMaxLimit(number);
	    serializeXrfEnrpDefPct(xrfEnrpDefPct);
   }
	public BigDecimal getXrfMnrpDefPct() throws CFException {
        if (isXrfMnrpDefPctModified()) { 
           xrfMnrpDefPct = refreshXrfMnrpDefPct();
        }
   		return xrfMnrpDefPct;
	}

    public char[] getXrfMnrpDefPctString() {
          return  xrfMnrpDefPctString();
    }
	
	/**
	 * 	Update XrfMnrpDefPct with the passed number
	 *  Corresponding COBOL Variable is XRF-MNRP-DEF-PCT
	 *	@param number
	 */
	public void setXrfMnrpDefPct(BigDecimal number) {	
     xrfMnrpDefPct = checkXrfMnrpDefPctMaxLimit(number);
	    serializeXrfMnrpDefPct(xrfMnrpDefPct);
   }
	public BigDecimal getXrfMnrpPtPct() throws CFException {
        if (isXrfMnrpPtPctModified()) { 
           xrfMnrpPtPct = refreshXrfMnrpPtPct();
        }
   		return xrfMnrpPtPct;
	}

    public char[] getXrfMnrpPtPctString() {
          return  xrfMnrpPtPctString();
    }
	
	/**
	 * 	Update XrfMnrpPtPct with the passed number
	 *  Corresponding COBOL Variable is XRF-MNRP-PT-PCT
	 *	@param number
	 */
	public void setXrfMnrpPtPct(BigDecimal number) {	
     xrfMnrpPtPct = checkXrfMnrpPtPctMaxLimit(number);
	    serializeXrfMnrpPtPct(xrfMnrpPtPct);
   }
	/**
	 *	Returns the value of xrfSurprsMedBilCd
	 *	@return xrfSurprsMedBilCd
	 */
   public char[] getXrfSurprsMedBilCd() throws CFException{
     if (isXrfSurprsMedBilCdModified()) { 
        xrfSurprsMedBilCd = refreshXrfSurprsMedBilCd();
     }
   		return xrfSurprsMedBilCd;
   }

  
	/**
	*  set variable xrfSurprsMedBilCd
	*  Corresponding COBOL Variable is XRF-SURPRS-MED-BIL-CD
	*  @param value
	**/
   public void setXrfSurprsMedBilCd(char[] value) {
      xrfSurprsMedBilCd = checkXrfSurprsMedBilCdConstraints(value);
      serializeXrfSurprsMedBilCd(xrfSurprsMedBilCd);
   } 

     /**
	 * 	Update XrfSurprsMedBilCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfSurprsMedBilCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfSurprsMedBilCd,xrfSurprsMedBilCd.length);
   	
   }
   
   public void setXrfSurprsMedBilCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfSurprsMedBilCd,xrfSurprsMedBilCd.length);
   	
   }
   
     /**
	 * 	Update XrfSurprsMedBilCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfSurprsMedBilCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfSurprsMedBilCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfSurprsMedBilCd with another Field
	 *	@param value
	 */
   public void setXrfSurprsMedBilCd(Field source) {
       replace(source,0,source.length(),beginXrfSurprsMedBilCd,XRF_SURPRS_MED_BIL_CD_LEN);
   	
   }  
   
     /**
	 * 	Update XrfSurprsMedBilCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfSurprsMedBilCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfSurprsMedBilCd,XRF_SURPRS_MED_BIL_CD_LEN);
   	
   }
   
     /**
	 * 	Update XrfSurprsMedBilCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfSurprsMedBilCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfSurprsMedBilCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfEbdsSetId2
	 *	@return xrfEbdsSetId2
	 */
   public char[] getXrfEbdsSetId2() throws CFException{
     if (isXrfEbdsSetId2Modified()) { 
        xrfEbdsSetId2 = refreshXrfEbdsSetId2();
     }
   		return xrfEbdsSetId2;
   }

  
	/**
	*  set variable xrfEbdsSetId2
	*  Corresponding COBOL Variable is XRF-EBDS-SET-ID-2
	*  @param value
	**/
   public void setXrfEbdsSetId2(char[] value) {
      xrfEbdsSetId2 = checkXrfEbdsSetId2Constraints(value);
      serializeXrfEbdsSetId2(xrfEbdsSetId2);
   } 

     /**
	 * 	Update XrfEbdsSetId2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfEbdsSetId2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfEbdsSetId2,xrfEbdsSetId2.length);
   	
   }
   
   public void setXrfEbdsSetId2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEbdsSetId2,xrfEbdsSetId2.length);
   	
   }
   
     /**
	 * 	Update XrfEbdsSetId2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfEbdsSetId2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEbdsSetId2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfEbdsSetId2 with another Field
	 *	@param value
	 */
   public void setXrfEbdsSetId2(Field source) {
       replace(source,0,source.length(),beginXrfEbdsSetId2,XRF_EBDS_SET_ID_2_LEN);
   	
   }  
   
     /**
	 * 	Update XrfEbdsSetId2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfEbdsSetId2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfEbdsSetId2,XRF_EBDS_SET_ID_2_LEN);
   	
   }
   
     /**
	 * 	Update XrfEbdsSetId2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfEbdsSetId2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEbdsSetId2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfAcnInd
	 *	@return xrfAcnInd
	 */
   public char[] getXrfAcnInd() throws CFException{
     if (isXrfAcnIndModified()) { 
        xrfAcnInd = refreshXrfAcnInd();
     }
   		return xrfAcnInd;
   }

  
	/**
	*  set variable xrfAcnInd
	*  Corresponding COBOL Variable is XRF-ACN-IND
	*  @param value
	**/
   public void setXrfAcnInd(char[] value) {
      xrfAcnInd = checkXrfAcnIndConstraints(value);
      serializeXrfAcnInd(xrfAcnInd);
   } 

     /**
	 * 	Update XrfAcnInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfAcnInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfAcnInd,xrfAcnInd.length);
   	
   }
   
   public void setXrfAcnInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfAcnInd,xrfAcnInd.length);
   	
   }
   
     /**
	 * 	Update XrfAcnInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfAcnInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfAcnInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfAcnInd with another Field
	 *	@param value
	 */
   public void setXrfAcnInd(Field source) {
       replace(source,0,source.length(),beginXrfAcnInd,XRF_ACN_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfAcnInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfAcnInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfAcnInd,XRF_ACN_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfAcnInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfAcnInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfAcnInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfUhpInd
	 *	@return xrfUhpInd
	 */
   public char[] getXrfUhpInd() throws CFException{
     if (isXrfUhpIndModified()) { 
        xrfUhpInd = refreshXrfUhpInd();
     }
   		return xrfUhpInd;
   }

  
	/**
	*  set variable xrfUhpInd
	*  Corresponding COBOL Variable is XRF-UHP-IND
	*  @param value
	**/
   public void setXrfUhpInd(char[] value) {
      xrfUhpInd = checkXrfUhpIndConstraints(value);
      serializeXrfUhpInd(xrfUhpInd);
   } 

     /**
	 * 	Update XrfUhpInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfUhpInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfUhpInd,xrfUhpInd.length);
   	
   }
   
   public void setXrfUhpInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfUhpInd,xrfUhpInd.length);
   	
   }
   
     /**
	 * 	Update XrfUhpInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfUhpInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfUhpInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfUhpInd with another Field
	 *	@param value
	 */
   public void setXrfUhpInd(Field source) {
       replace(source,0,source.length(),beginXrfUhpInd,XRF_UHP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfUhpInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfUhpInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfUhpInd,XRF_UHP_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfUhpInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfUhpInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfUhpInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfAiInd
	 *	@return xrfAiInd
	 */
   public char[] getXrfAiInd() throws CFException{
     if (isXrfAiIndModified()) { 
        xrfAiInd = refreshXrfAiInd();
     }
   		return xrfAiInd;
   }

  
	/**
	*  set variable xrfAiInd
	*  Corresponding COBOL Variable is XRF-AI-IND
	*  @param value
	**/
   public void setXrfAiInd(char[] value) {
      xrfAiInd = checkXrfAiIndConstraints(value);
      serializeXrfAiInd(xrfAiInd);
   } 

     /**
	 * 	Update XrfAiInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfAiInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfAiInd,xrfAiInd.length);
   	
   }
   
   public void setXrfAiInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfAiInd,xrfAiInd.length);
   	
   }
   
     /**
	 * 	Update XrfAiInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfAiInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfAiInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfAiInd with another Field
	 *	@param value
	 */
   public void setXrfAiInd(Field source) {
       replace(source,0,source.length(),beginXrfAiInd,XRF_AI_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfAiInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfAiInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfAiInd,XRF_AI_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfAiInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfAiInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfAiInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfEnrpErFacInd
	 *	@return xrfEnrpErFacInd
	 */
   public char[] getXrfEnrpErFacInd() throws CFException{
     if (isXrfEnrpErFacIndModified()) { 
        xrfEnrpErFacInd = refreshXrfEnrpErFacInd();
     }
   		return xrfEnrpErFacInd;
   }

  
	/**
	*  set variable xrfEnrpErFacInd
	*  Corresponding COBOL Variable is XRF-ENRP-ER-FAC-IND
	*  @param value
	**/
   public void setXrfEnrpErFacInd(char[] value) {
      xrfEnrpErFacInd = checkXrfEnrpErFacIndConstraints(value);
      serializeXrfEnrpErFacInd(xrfEnrpErFacInd);
   } 

     /**
	 * 	Update XrfEnrpErFacInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfEnrpErFacInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfEnrpErFacInd,xrfEnrpErFacInd.length);
   	
   }
   
   public void setXrfEnrpErFacInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEnrpErFacInd,xrfEnrpErFacInd.length);
   	
   }
   
     /**
	 * 	Update XrfEnrpErFacInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfEnrpErFacInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEnrpErFacInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfEnrpErFacInd with another Field
	 *	@param value
	 */
   public void setXrfEnrpErFacInd(Field source) {
       replace(source,0,source.length(),beginXrfEnrpErFacInd,XRF_ENRP_ER_FAC_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfEnrpErFacInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfEnrpErFacInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfEnrpErFacInd,XRF_ENRP_ER_FAC_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfEnrpErFacInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfEnrpErFacInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEnrpErFacInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfErWrapInd
	 *	@return xrfErWrapInd
	 */
   public char[] getXrfErWrapInd() throws CFException{
     if (isXrfErWrapIndModified()) { 
        xrfErWrapInd = refreshXrfErWrapInd();
     }
   		return xrfErWrapInd;
   }

  
	/**
	*  set variable xrfErWrapInd
	*  Corresponding COBOL Variable is XRF-ER-WRAP-IND
	*  @param value
	**/
   public void setXrfErWrapInd(char[] value) {
      xrfErWrapInd = checkXrfErWrapIndConstraints(value);
      serializeXrfErWrapInd(xrfErWrapInd);
   } 

     /**
	 * 	Update XrfErWrapInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfErWrapInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfErWrapInd,xrfErWrapInd.length);
   	
   }
   
   public void setXrfErWrapInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfErWrapInd,xrfErWrapInd.length);
   	
   }
   
     /**
	 * 	Update XrfErWrapInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfErWrapInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfErWrapInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfErWrapInd with another Field
	 *	@param value
	 */
   public void setXrfErWrapInd(Field source) {
       replace(source,0,source.length(),beginXrfErWrapInd,XRF_ER_WRAP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfErWrapInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfErWrapInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfErWrapInd,XRF_ER_WRAP_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfErWrapInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfErWrapInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfErWrapInd+targetIndex,targetLen);
    
   }
	public short getXrfLabPct() throws CFException {
        if (isXrfLabPctModified()) { 
           xrfLabPct = refreshXrfLabPct();
        }
   		return xrfLabPct;
	}
	
	/**
	 * 	Update XrfLabPct with the passed value
	 *  Corresponding COBOL Variable is XRF-LAB-PCT
	 *	@param number
	 */
	public void setXrfLabPct(short number) {
			xrfLabPct = checkXrfLabPctMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeXrfLabPct(xrfLabPct);
	}

	public void setXrfLabPct(int number) {
	    number = checkXrfLabPctMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfLabPct((short)number);
	}
	public void setXrfLabPct(long number) {
	    number = checkXrfLabPctMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfLabPct((short)number);
	}
	

	public short getXrfDmePct() throws CFException {
        if (isXrfDmePctModified()) { 
           xrfDmePct = refreshXrfDmePct();
        }
   		return xrfDmePct;
	}
	
	/**
	 * 	Update XrfDmePct with the passed value
	 *  Corresponding COBOL Variable is XRF-DME-PCT
	 *	@param number
	 */
	public void setXrfDmePct(short number) {
			xrfDmePct = checkXrfDmePctMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeXrfDmePct(xrfDmePct);
	}

	public void setXrfDmePct(int number) {
	    number = checkXrfDmePctMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfDmePct((short)number);
	}
	public void setXrfDmePct(long number) {
	    number = checkXrfDmePctMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfDmePct((short)number);
	}
	

	/**
	 *	Returns the value of xrfBusSegPltfm
	 *	@return xrfBusSegPltfm
	 */
   public char[] getXrfBusSegPltfm() throws CFException{
     if (isXrfBusSegPltfmModified()) { 
        xrfBusSegPltfm = refreshXrfBusSegPltfm();
     }
   		return xrfBusSegPltfm;
   }

  
	/**
	*  set variable xrfBusSegPltfm
	*  Corresponding COBOL Variable is XRF-BUS-SEG-PLTFM
	*  @param value
	**/
   public void setXrfBusSegPltfm(char[] value) {
      xrfBusSegPltfm = checkXrfBusSegPltfmConstraints(value);
      serializeXrfBusSegPltfm(xrfBusSegPltfm);
   } 

     /**
	 * 	Update XrfBusSegPltfm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfBusSegPltfm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfBusSegPltfm,xrfBusSegPltfm.length);
   	
   }
   
   public void setXrfBusSegPltfm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfBusSegPltfm,xrfBusSegPltfm.length);
   	
   }
   
     /**
	 * 	Update XrfBusSegPltfm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfBusSegPltfm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfBusSegPltfm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfBusSegPltfm with another Field
	 *	@param value
	 */
   public void setXrfBusSegPltfm(Field source) {
       replace(source,0,source.length(),beginXrfBusSegPltfm,XRF_BUS_SEG_PLTFM_LEN);
   	
   }  
   
     /**
	 * 	Update XrfBusSegPltfm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfBusSegPltfm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfBusSegPltfm,XRF_BUS_SEG_PLTFM_LEN);
   	
   }
   
     /**
	 * 	Update XrfBusSegPltfm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfBusSegPltfm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfBusSegPltfm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfNmaddrCdCm
	 *	@return xrfNmaddrCdCm
	 */
   public char[] getXrfNmaddrCdCm() throws CFException{
     if (isXrfNmaddrCdCmModified()) { 
        xrfNmaddrCdCm = refreshXrfNmaddrCdCm();
     }
   		return xrfNmaddrCdCm;
   }

  
	/**
	*  set variable xrfNmaddrCdCm
	*  Corresponding COBOL Variable is XRF-NMADDR-CD-CM
	*  @param value
	**/
   public void setXrfNmaddrCdCm(char[] value) {
      xrfNmaddrCdCm = checkXrfNmaddrCdCmConstraints(value);
      serializeXrfNmaddrCdCm(xrfNmaddrCdCm);
   } 

     /**
	 * 	Update XrfNmaddrCdCm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfNmaddrCdCm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfNmaddrCdCm,xrfNmaddrCdCm.length);
   	
   }
   
   public void setXrfNmaddrCdCm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfNmaddrCdCm,xrfNmaddrCdCm.length);
   	
   }
   
     /**
	 * 	Update XrfNmaddrCdCm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfNmaddrCdCm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfNmaddrCdCm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfNmaddrCdCm with another Field
	 *	@param value
	 */
   public void setXrfNmaddrCdCm(Field source) {
       replace(source,0,source.length(),beginXrfNmaddrCdCm,XRF_NMADDR_CD_CM_LEN);
   	
   }  
   
     /**
	 * 	Update XrfNmaddrCdCm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfNmaddrCdCm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfNmaddrCdCm,XRF_NMADDR_CD_CM_LEN);
   	
   }
   
     /**
	 * 	Update XrfNmaddrCdCm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfNmaddrCdCm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfNmaddrCdCm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfMcSel
	 *	@return xrfMcSel
	 */
   public char[] getXrfMcSel() throws CFException{
     if (isXrfMcSelModified()) { 
        xrfMcSel = refreshXrfMcSel();
     }
   		return xrfMcSel;
   }

  
	/**
	*  set variable xrfMcSel
	*  Corresponding COBOL Variable is XRF-MC-SEL
	*  @param value
	**/
   public void setXrfMcSel(char[] value) {
      xrfMcSel = checkXrfMcSelConstraints(value);
      serializeXrfMcSel(xrfMcSel);
   } 

     /**
	 * 	Update XrfMcSel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfMcSel(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfMcSel,xrfMcSel.length);
   	
   }
   
   public void setXrfMcSel(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfMcSel,xrfMcSel.length);
   	
   }
   
     /**
	 * 	Update XrfMcSel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfMcSel(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfMcSel+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfMcSel with another Field
	 *	@param value
	 */
   public void setXrfMcSel(Field source) {
       replace(source,0,source.length(),beginXrfMcSel,XRF_MC_SEL_LEN);
   	
   }  
   
     /**
	 * 	Update XrfMcSel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfMcSel(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfMcSel,XRF_MC_SEL_LEN);
   	
   }
   
     /**
	 * 	Update XrfMcSel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfMcSel(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfMcSel+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfPlcyAutpayInd
	 *	@return xrfPlcyAutpayInd
	 */
   public char[] getXrfPlcyAutpayInd() throws CFException{
     if (isXrfPlcyAutpayIndModified()) { 
        xrfPlcyAutpayInd = refreshXrfPlcyAutpayInd();
     }
   		return xrfPlcyAutpayInd;
   }

  
	/**
	*  set variable xrfPlcyAutpayInd
	*  Corresponding COBOL Variable is XRF-PLCY-AUTPAY-IND
	*  @param value
	**/
   public void setXrfPlcyAutpayInd(char[] value) {
      xrfPlcyAutpayInd = checkXrfPlcyAutpayIndConstraints(value);
      serializeXrfPlcyAutpayInd(xrfPlcyAutpayInd);
   } 

     /**
	 * 	Update XrfPlcyAutpayInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfPlcyAutpayInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfPlcyAutpayInd,xrfPlcyAutpayInd.length);
   	
   }
   
   public void setXrfPlcyAutpayInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfPlcyAutpayInd,xrfPlcyAutpayInd.length);
   	
   }
   
     /**
	 * 	Update XrfPlcyAutpayInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfPlcyAutpayInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfPlcyAutpayInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfPlcyAutpayInd with another Field
	 *	@param value
	 */
   public void setXrfPlcyAutpayInd(Field source) {
       replace(source,0,source.length(),beginXrfPlcyAutpayInd,XRF_PLCY_AUTPAY_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfPlcyAutpayInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfPlcyAutpayInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfPlcyAutpayInd,XRF_PLCY_AUTPAY_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfPlcyAutpayInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfPlcyAutpayInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfPlcyAutpayInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfRptCdCm
	 *	@return xrfRptCdCm
	 */
   public char[] getXrfRptCdCm() throws CFException{
     if (isXrfRptCdCmModified()) { 
        xrfRptCdCm = refreshXrfRptCdCm();
     }
   		return xrfRptCdCm;
   }

  
	/**
	*  set variable xrfRptCdCm
	*  Corresponding COBOL Variable is XRF-RPT-CD-CM
	*  @param value
	**/
   public void setXrfRptCdCm(char[] value) {
      xrfRptCdCm = checkXrfRptCdCmConstraints(value);
      serializeXrfRptCdCm(xrfRptCdCm);
   } 

     /**
	 * 	Update XrfRptCdCm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfRptCdCm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfRptCdCm,xrfRptCdCm.length);
   	
   }
   
   public void setXrfRptCdCm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfRptCdCm,xrfRptCdCm.length);
   	
   }
   
     /**
	 * 	Update XrfRptCdCm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfRptCdCm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfRptCdCm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfRptCdCm with another Field
	 *	@param value
	 */
   public void setXrfRptCdCm(Field source) {
       replace(source,0,source.length(),beginXrfRptCdCm,XRF_RPT_CD_CM_LEN);
   	
   }  
   
     /**
	 * 	Update XrfRptCdCm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfRptCdCm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfRptCdCm,XRF_RPT_CD_CM_LEN);
   	
   }
   
     /**
	 * 	Update XrfRptCdCm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfRptCdCm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfRptCdCm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfMailCdCm
	 *	@return xrfMailCdCm
	 */
   public char[] getXrfMailCdCm() throws CFException{
     if (isXrfMailCdCmModified()) { 
        xrfMailCdCm = refreshXrfMailCdCm();
     }
   		return xrfMailCdCm;
   }

  
	/**
	*  set variable xrfMailCdCm
	*  Corresponding COBOL Variable is XRF-MAIL-CD-CM
	*  @param value
	**/
   public void setXrfMailCdCm(char[] value) {
      xrfMailCdCm = checkXrfMailCdCmConstraints(value);
      serializeXrfMailCdCm(xrfMailCdCm);
   } 

     /**
	 * 	Update XrfMailCdCm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfMailCdCm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfMailCdCm,xrfMailCdCm.length);
   	
   }
   
   public void setXrfMailCdCm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfMailCdCm,xrfMailCdCm.length);
   	
   }
   
     /**
	 * 	Update XrfMailCdCm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfMailCdCm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfMailCdCm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfMailCdCm with another Field
	 *	@param value
	 */
   public void setXrfMailCdCm(Field source) {
       replace(source,0,source.length(),beginXrfMailCdCm,XRF_MAIL_CD_CM_LEN);
   	
   }  
   
     /**
	 * 	Update XrfMailCdCm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfMailCdCm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfMailCdCm,XRF_MAIL_CD_CM_LEN);
   	
   }
   
     /**
	 * 	Update XrfMailCdCm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfMailCdCm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfMailCdCm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfRpData
	 *	@return xrfRpData
	 */   
	 public XrfRpData getXrfRpData() {
   	return xrfRpData;
   }
   /**
	* 	Update XrfRpData with the passed value
	*   Corresponding COBOL Variable is XRF-RP-DATA
	*	@param value
	*/
   public void setXrfRpData(char[] value) {
      xrfRpData.setString(value); 
   }   
    
     /**
	 * 	Update XrfRpData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setXrfRpData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xrfRpData.begin,xrfRpData.length());
   }
   
     /**
	 * 	Update XrfRpData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfRpData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xrfRpData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update XrfRpData with another Field
	 *	@param value
	 */
   public void setXrfRpData(Field source) {
   	replace(source,0,source.length(),xrfRpData.begin,xrfRpData.length());
   }  
   
     /**
	 * 	Update XrfRpData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setXrfRpData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xrfRpData.begin,xrfRpData.length());
   }
   
     /**
	 * 	Update XrfRpData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfRpData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xrfRpData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of xrfFranchCd
	 *	@return xrfFranchCd
	 */
	public int getXrfFranchCd() throws CFException {
        if (isXrfFranchCdModified()) { 
           xrfFranchCd = refreshXrfFranchCd();
        }
   		return xrfFranchCd;
	}
	
	/**
	 * 	Update XrfFranchCd with the passed value
	 *  Corresponding COBOL Variable is XRF-FRANCH-CD
	 *	@param number
	 */
	public void setXrfFranchCd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    xrfFranchCd = checkXrfFranchCdMaxLimit(number); 
		serializeXrfFranchCd(xrfFranchCd);
	}


	public void setXrfFranchCd(long number) {
	    number = checkXrfFranchCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setXrfFranchCd((int)number);
	}
	
	/**
	 *	Returns the value of xrfEbdsCovBase
	 *	@return xrfEbdsCovBase
	 */
	public short getXrfEbdsCovBase() throws CFException {
        if (isXrfEbdsCovBaseModified()) { 
           xrfEbdsCovBase = refreshXrfEbdsCovBase();
        }
   		return xrfEbdsCovBase;
	}
	
	/**
	 * 	Update XrfEbdsCovBase with the passed value
	 *  Corresponding COBOL Variable is XRF-EBDS-COV-BASE
	 *	@param number
	 */
	public void setXrfEbdsCovBase(short number) {
	     // Truncate if the number is beyond +/- Max range
	    xrfEbdsCovBase = checkXrfEbdsCovBaseMaxLimit(number); 
		serializeXrfEbdsCovBase(xrfEbdsCovBase);
	}

	public void setXrfEbdsCovBase(int number) {
	    number = checkXrfEbdsCovBaseMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfEbdsCovBase((short)number);
	}
	public void setXrfEbdsCovBase(long number) {
	    number = checkXrfEbdsCovBaseMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfEbdsCovBase((short)number);
	}
	

	/**
	 *	Returns the value of xrfEbdsCovMme
	 *	@return xrfEbdsCovMme
	 */
	public short getXrfEbdsCovMme() throws CFException {
        if (isXrfEbdsCovMmeModified()) { 
           xrfEbdsCovMme = refreshXrfEbdsCovMme();
        }
   		return xrfEbdsCovMme;
	}
	
	/**
	 * 	Update XrfEbdsCovMme with the passed value
	 *  Corresponding COBOL Variable is XRF-EBDS-COV-MME
	 *	@param number
	 */
	public void setXrfEbdsCovMme(short number) {
	     // Truncate if the number is beyond +/- Max range
	    xrfEbdsCovMme = checkXrfEbdsCovMmeMaxLimit(number); 
		serializeXrfEbdsCovMme(xrfEbdsCovMme);
	}

	public void setXrfEbdsCovMme(int number) {
	    number = checkXrfEbdsCovMmeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfEbdsCovMme((short)number);
	}
	public void setXrfEbdsCovMme(long number) {
	    number = checkXrfEbdsCovMmeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfEbdsCovMme((short)number);
	}
	

	/**
	 *	Returns the value of xrfEbdsCovMcr
	 *	@return xrfEbdsCovMcr
	 */
	public short getXrfEbdsCovMcr() throws CFException {
        if (isXrfEbdsCovMcrModified()) { 
           xrfEbdsCovMcr = refreshXrfEbdsCovMcr();
        }
   		return xrfEbdsCovMcr;
	}
	
	/**
	 * 	Update XrfEbdsCovMcr with the passed value
	 *  Corresponding COBOL Variable is XRF-EBDS-COV-MCR
	 *	@param number
	 */
	public void setXrfEbdsCovMcr(short number) {
	     // Truncate if the number is beyond +/- Max range
	    xrfEbdsCovMcr = checkXrfEbdsCovMcrMaxLimit(number); 
		serializeXrfEbdsCovMcr(xrfEbdsCovMcr);
	}

	public void setXrfEbdsCovMcr(int number) {
	    number = checkXrfEbdsCovMcrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfEbdsCovMcr((short)number);
	}
	public void setXrfEbdsCovMcr(long number) {
	    number = checkXrfEbdsCovMcrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfEbdsCovMcr((short)number);
	}
	

	/**
	 *	Returns the value of xrfEbdsSetId
	 *	@return xrfEbdsSetId
	 */
   public char[] getXrfEbdsSetId() throws CFException{
     if (isXrfEbdsSetIdModified()) { 
        xrfEbdsSetId = refreshXrfEbdsSetId();
     }
   		return xrfEbdsSetId;
   }

  
	/**
	*  set variable xrfEbdsSetId
	*  Corresponding COBOL Variable is XRF-EBDS-SET-ID
	*  @param value
	**/
   public void setXrfEbdsSetId(char[] value) {
      xrfEbdsSetId = checkXrfEbdsSetIdConstraints(value);
      serializeXrfEbdsSetId(xrfEbdsSetId);
   } 

     /**
	 * 	Update XrfEbdsSetId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfEbdsSetId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfEbdsSetId,xrfEbdsSetId.length);
   	
   }
   
   public void setXrfEbdsSetId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEbdsSetId,xrfEbdsSetId.length);
   	
   }
   
     /**
	 * 	Update XrfEbdsSetId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfEbdsSetId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEbdsSetId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfEbdsSetId with another Field
	 *	@param value
	 */
   public void setXrfEbdsSetId(Field source) {
       replace(source,0,source.length(),beginXrfEbdsSetId,XRF_EBDS_SET_ID_LEN);
   	
   }  
   
     /**
	 * 	Update XrfEbdsSetId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfEbdsSetId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfEbdsSetId,XRF_EBDS_SET_ID_LEN);
   	
   }
   
     /**
	 * 	Update XrfEbdsSetId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfEbdsSetId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEbdsSetId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfAaCm
	 *	@return xrfAaCm
	 */
   public char[] getXrfAaCm() throws CFException{
     if (isXrfAaCmModified()) { 
        xrfAaCm = refreshXrfAaCm();
     }
   		return xrfAaCm;
   }

  
	/**
	*  set variable xrfAaCm
	*  Corresponding COBOL Variable is XRF-AA-CM
	*  @param value
	**/
   public void setXrfAaCm(char[] value) {
      xrfAaCm = checkXrfAaCmConstraints(value);
      serializeXrfAaCm(xrfAaCm);
   } 

     /**
	 * 	Update XrfAaCm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfAaCm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfAaCm,xrfAaCm.length);
   	
   }
   
   public void setXrfAaCm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfAaCm,xrfAaCm.length);
   	
   }
   
     /**
	 * 	Update XrfAaCm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfAaCm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfAaCm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfAaCm with another Field
	 *	@param value
	 */
   public void setXrfAaCm(Field source) {
       replace(source,0,source.length(),beginXrfAaCm,XRF_AA_CM_LEN);
   	
   }  
   
     /**
	 * 	Update XrfAaCm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfAaCm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfAaCm,XRF_AA_CM_LEN);
   	
   }
   
     /**
	 * 	Update XrfAaCm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfAaCm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfAaCm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfRxCm
	 *	@return xrfRxCm
	 */
   public char[] getXrfRxCm() throws CFException{
     if (isXrfRxCmModified()) { 
        xrfRxCm = refreshXrfRxCm();
     }
   		return xrfRxCm;
   }

  
	/**
	*  set variable xrfRxCm
	*  Corresponding COBOL Variable is XRF-RX-CM
	*  @param value
	**/
   public void setXrfRxCm(char[] value) {
      xrfRxCm = checkXrfRxCmConstraints(value);
      serializeXrfRxCm(xrfRxCm);
   } 

     /**
	 * 	Update XrfRxCm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfRxCm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfRxCm,xrfRxCm.length);
   	
   }
   
   public void setXrfRxCm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfRxCm,xrfRxCm.length);
   	
   }
   
     /**
	 * 	Update XrfRxCm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfRxCm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfRxCm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfRxCm with another Field
	 *	@param value
	 */
   public void setXrfRxCm(Field source) {
       replace(source,0,source.length(),beginXrfRxCm,XRF_RX_CM_LEN);
   	
   }  
   
     /**
	 * 	Update XrfRxCm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfRxCm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfRxCm,XRF_RX_CM_LEN);
   	
   }
   
     /**
	 * 	Update XrfRxCm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfRxCm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfRxCm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfModCm
	 *	@return xrfModCm
	 */
   public char[] getXrfModCm() throws CFException{
     if (isXrfModCmModified()) { 
        xrfModCm = refreshXrfModCm();
     }
   		return xrfModCm;
   }

  
	/**
	*  set variable xrfModCm
	*  Corresponding COBOL Variable is XRF-MOD-CM
	*  @param value
	**/
   public void setXrfModCm(char[] value) {
      xrfModCm = checkXrfModCmConstraints(value);
      serializeXrfModCm(xrfModCm);
   } 

     /**
	 * 	Update XrfModCm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfModCm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfModCm,xrfModCm.length);
   	
   }
   
   public void setXrfModCm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfModCm,xrfModCm.length);
   	
   }
   
     /**
	 * 	Update XrfModCm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfModCm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfModCm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfModCm with another Field
	 *	@param value
	 */
   public void setXrfModCm(Field source) {
       replace(source,0,source.length(),beginXrfModCm,XRF_MOD_CM_LEN);
   	
   }  
   
     /**
	 * 	Update XrfModCm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfModCm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfModCm,XRF_MOD_CM_LEN);
   	
   }
   
     /**
	 * 	Update XrfModCm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfModCm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfModCm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfPcsCm
	 *	@return xrfPcsCm
	 */
   public char[] getXrfPcsCm() throws CFException{
     if (isXrfPcsCmModified()) { 
        xrfPcsCm = refreshXrfPcsCm();
     }
   		return xrfPcsCm;
   }

  
	/**
	*  set variable xrfPcsCm
	*  Corresponding COBOL Variable is XRF-PCS-CM
	*  @param value
	**/
   public void setXrfPcsCm(char[] value) {
      xrfPcsCm = checkXrfPcsCmConstraints(value);
      serializeXrfPcsCm(xrfPcsCm);
   } 

     /**
	 * 	Update XrfPcsCm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfPcsCm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfPcsCm,xrfPcsCm.length);
   	
   }
   
   public void setXrfPcsCm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfPcsCm,xrfPcsCm.length);
   	
   }
   
     /**
	 * 	Update XrfPcsCm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfPcsCm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfPcsCm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfPcsCm with another Field
	 *	@param value
	 */
   public void setXrfPcsCm(Field source) {
       replace(source,0,source.length(),beginXrfPcsCm,XRF_PCS_CM_LEN);
   	
   }  
   
     /**
	 * 	Update XrfPcsCm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfPcsCm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfPcsCm,XRF_PCS_CM_LEN);
   	
   }
   
     /**
	 * 	Update XrfPcsCm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfPcsCm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfPcsCm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfCchCm
	 *	@return xrfCchCm
	 */
   public char[] getXrfCchCm() throws CFException{
     if (isXrfCchCmModified()) { 
        xrfCchCm = refreshXrfCchCm();
     }
   		return xrfCchCm;
   }

  
	/**
	*  set variable xrfCchCm
	*  Corresponding COBOL Variable is XRF-CCH-CM
	*  @param value
	**/
   public void setXrfCchCm(char[] value) {
      xrfCchCm = checkXrfCchCmConstraints(value);
      serializeXrfCchCm(xrfCchCm);
   } 

     /**
	 * 	Update XrfCchCm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfCchCm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfCchCm,xrfCchCm.length);
   	
   }
   
   public void setXrfCchCm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfCchCm,xrfCchCm.length);
   	
   }
   
     /**
	 * 	Update XrfCchCm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfCchCm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfCchCm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfCchCm with another Field
	 *	@param value
	 */
   public void setXrfCchCm(Field source) {
       replace(source,0,source.length(),beginXrfCchCm,XRF_CCH_CM_LEN);
   	
   }  
   
     /**
	 * 	Update XrfCchCm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfCchCm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfCchCm,XRF_CCH_CM_LEN);
   	
   }
   
     /**
	 * 	Update XrfCchCm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfCchCm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfCchCm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfCapInd
	 *	@return xrfCapInd
	 */
   public char[] getXrfCapInd() throws CFException{
     if (isXrfCapIndModified()) { 
        xrfCapInd = refreshXrfCapInd();
     }
   		return xrfCapInd;
   }

  
	/**
	*  set variable xrfCapInd
	*  Corresponding COBOL Variable is XRF-CAP-IND
	*  @param value
	**/
   public void setXrfCapInd(char[] value) {
      xrfCapInd = checkXrfCapIndConstraints(value);
      serializeXrfCapInd(xrfCapInd);
   } 

     /**
	 * 	Update XrfCapInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfCapInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfCapInd,xrfCapInd.length);
   	
   }
   
   public void setXrfCapInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfCapInd,xrfCapInd.length);
   	
   }
   
     /**
	 * 	Update XrfCapInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfCapInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfCapInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfCapInd with another Field
	 *	@param value
	 */
   public void setXrfCapInd(Field source) {
       replace(source,0,source.length(),beginXrfCapInd,XRF_CAP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfCapInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfCapInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfCapInd,XRF_CAP_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfCapInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfCapInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfCapInd+targetIndex,targetLen);
    
   }
	public short getXrfApportionmentPct() throws CFException {
        if (isXrfApportionmentPctModified()) { 
           xrfApportionmentPct = refreshXrfApportionmentPct();
        }
   		return xrfApportionmentPct;
	}
	
	/**
	 * 	Update XrfApportionmentPct with the passed value
	 *  Corresponding COBOL Variable is XRF-APPORTIONMENT-PCT
	 *	@param number
	 */
	public void setXrfApportionmentPct(short number) {
			xrfApportionmentPct = checkXrfApportionmentPctMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeXrfApportionmentPct(xrfApportionmentPct);
	}

	public void setXrfApportionmentPct(int number) {
	    number = checkXrfApportionmentPctMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfApportionmentPct((short)number);
	}
	public void setXrfApportionmentPct(long number) {
	    number = checkXrfApportionmentPctMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfApportionmentPct((short)number);
	}
	

	public short getXrfPayloc1() throws CFException {
        if (isXrfPayloc1Modified()) { 
           xrfPayloc1 = refreshXrfPayloc1();
        }
   		return xrfPayloc1;
	}
	
	/**
	 * 	Update XrfPayloc1 with the passed value
	 *  Corresponding COBOL Variable is XRF-PAYLOC-1
	 *	@param number
	 */
	public void setXrfPayloc1(short number) {
			xrfPayloc1 = checkXrfPayloc1MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeXrfPayloc1(xrfPayloc1);
	}

	public void setXrfPayloc1(int number) {
	    number = checkXrfPayloc1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfPayloc1((short)number);
	}
	public void setXrfPayloc1(long number) {
	    number = checkXrfPayloc1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfPayloc1((short)number);
	}
	

	public short getXrfPayloc2() throws CFException {
        if (isXrfPayloc2Modified()) { 
           xrfPayloc2 = refreshXrfPayloc2();
        }
   		return xrfPayloc2;
	}
	
	/**
	 * 	Update XrfPayloc2 with the passed value
	 *  Corresponding COBOL Variable is XRF-PAYLOC-2
	 *	@param number
	 */
	public void setXrfPayloc2(short number) {
			xrfPayloc2 = checkXrfPayloc2MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeXrfPayloc2(xrfPayloc2);
	}

	public void setXrfPayloc2(int number) {
	    number = checkXrfPayloc2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfPayloc2((short)number);
	}
	public void setXrfPayloc2(long number) {
	    number = checkXrfPayloc2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfPayloc2((short)number);
	}
	

	/**
	 *	Returns the value of xrfMnnrpInd
	 *	@return xrfMnnrpInd
	 */
   public char[] getXrfMnnrpInd() throws CFException{
     if (isXrfMnnrpIndModified()) { 
        xrfMnnrpInd = refreshXrfMnnrpInd();
     }
   		return xrfMnnrpInd;
   }

  
	/**
	*  set variable xrfMnnrpInd
	*  Corresponding COBOL Variable is XRF-MNNRP-IND
	*  @param value
	**/
   public void setXrfMnnrpInd(char[] value) {
      xrfMnnrpInd = checkXrfMnnrpIndConstraints(value);
      serializeXrfMnnrpInd(xrfMnnrpInd);
   } 

     /**
	 * 	Update XrfMnnrpInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfMnnrpInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfMnnrpInd,xrfMnnrpInd.length);
   	
   }
   
   public void setXrfMnnrpInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfMnnrpInd,xrfMnnrpInd.length);
   	
   }
   
     /**
	 * 	Update XrfMnnrpInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfMnnrpInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfMnnrpInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfMnnrpInd with another Field
	 *	@param value
	 */
   public void setXrfMnnrpInd(Field source) {
       replace(source,0,source.length(),beginXrfMnnrpInd,XRF_MNNRP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfMnnrpInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfMnnrpInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfMnnrpInd,XRF_MNNRP_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfMnnrpInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfMnnrpInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfMnnrpInd+targetIndex,targetLen);
    
   }
	public short getXrfMnnrpPct() throws CFException {
        if (isXrfMnnrpPctModified()) { 
           xrfMnnrpPct = refreshXrfMnnrpPct();
        }
   		return xrfMnnrpPct;
	}
	
	/**
	 * 	Update XrfMnnrpPct with the passed value
	 *  Corresponding COBOL Variable is XRF-MNNRP-PCT
	 *	@param number
	 */
	public void setXrfMnnrpPct(short number) {
			xrfMnnrpPct = checkXrfMnnrpPctMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeXrfMnnrpPct(xrfMnnrpPct);
	}

	public void setXrfMnnrpPct(int number) {
	    number = checkXrfMnnrpPctMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfMnnrpPct((short)number);
	}
	public void setXrfMnnrpPct(long number) {
	    number = checkXrfMnnrpPctMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfMnnrpPct((short)number);
	}
	

	/**
	 *	Returns the value of xrfIplan
	 *	@return xrfIplan
	 */
   public char[] getXrfIplan() throws CFException{
     if (isXrfIplanModified()) { 
        xrfIplan = refreshXrfIplan();
     }
   		return xrfIplan;
   }

  
	/**
	*  set variable xrfIplan
	*  Corresponding COBOL Variable is XRF-IPLAN
	*  @param value
	**/
   public void setXrfIplan(char[] value) {
      xrfIplan = checkXrfIplanConstraints(value);
      serializeXrfIplan(xrfIplan);
   } 

     /**
	 * 	Update XrfIplan 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfIplan(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfIplan,xrfIplan.length);
   	
   }
   
   public void setXrfIplan(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfIplan,xrfIplan.length);
   	
   }
   
     /**
	 * 	Update XrfIplan 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfIplan(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfIplan+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfIplan with another Field
	 *	@param value
	 */
   public void setXrfIplan(Field source) {
       replace(source,0,source.length(),beginXrfIplan,XRF_IPLAN_LEN);
   	
   }  
   
     /**
	 * 	Update XrfIplan 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfIplan(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfIplan,XRF_IPLAN_LEN);
   	
   }
   
     /**
	 * 	Update XrfIplan 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfIplan(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfIplan+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfObligorInd
	 *	@return xrfObligorInd
	 */
   public char[] getXrfObligorInd() throws CFException{
     if (isXrfObligorIndModified()) { 
        xrfObligorInd = refreshXrfObligorInd();
     }
   		return xrfObligorInd;
   }

  
	/**
	*  set variable xrfObligorInd
	*  Corresponding COBOL Variable is XRF-OBLIGOR-IND
	*  @param value
	**/
   public void setXrfObligorInd(char[] value) {
      xrfObligorInd = checkXrfObligorIndConstraints(value);
      serializeXrfObligorInd(xrfObligorInd);
   } 

     /**
	 * 	Update XrfObligorInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfObligorInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfObligorInd,xrfObligorInd.length);
   	
   }
   
   public void setXrfObligorInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfObligorInd,xrfObligorInd.length);
   	
   }
   
     /**
	 * 	Update XrfObligorInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfObligorInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfObligorInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfObligorInd with another Field
	 *	@param value
	 */
   public void setXrfObligorInd(Field source) {
       replace(source,0,source.length(),beginXrfObligorInd,XRF_OBLIGOR_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfObligorInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfObligorInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfObligorInd,XRF_OBLIGOR_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfObligorInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfObligorInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfObligorInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfSharedArg
	 *	@return xrfSharedArg
	 */
   public char[] getXrfSharedArg() throws CFException{
     if (isXrfSharedArgModified()) { 
        xrfSharedArg = refreshXrfSharedArg();
     }
   		return xrfSharedArg;
   }

  
	/**
	*  set variable xrfSharedArg
	*  Corresponding COBOL Variable is XRF-SHARED-ARG
	*  @param value
	**/
   public void setXrfSharedArg(char[] value) {
      xrfSharedArg = checkXrfSharedArgConstraints(value);
      serializeXrfSharedArg(xrfSharedArg);
   } 

     /**
	 * 	Update XrfSharedArg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfSharedArg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfSharedArg,xrfSharedArg.length);
   	
   }
   
   public void setXrfSharedArg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfSharedArg,xrfSharedArg.length);
   	
   }
   
     /**
	 * 	Update XrfSharedArg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfSharedArg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfSharedArg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfSharedArg with another Field
	 *	@param value
	 */
   public void setXrfSharedArg(Field source) {
       replace(source,0,source.length(),beginXrfSharedArg,XRF_SHARED_ARG_LEN);
   	
   }  
   
     /**
	 * 	Update XrfSharedArg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfSharedArg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfSharedArg,XRF_SHARED_ARG_LEN);
   	
   }
   
     /**
	 * 	Update XrfSharedArg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfSharedArg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfSharedArg+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfMeInd
	 *	@return xrfMeInd
	 */
   public char[] getXrfMeInd() throws CFException{
     if (isXrfMeIndModified()) { 
        xrfMeInd = refreshXrfMeInd();
     }
   		return xrfMeInd;
   }

  
	/**
	*  set variable xrfMeInd
	*  Corresponding COBOL Variable is XRF-ME-IND
	*  @param value
	**/
   public void setXrfMeInd(char[] value) {
      xrfMeInd = checkXrfMeIndConstraints(value);
      serializeXrfMeInd(xrfMeInd);
   } 

     /**
	 * 	Update XrfMeInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfMeInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfMeInd,xrfMeInd.length);
   	
   }
   
   public void setXrfMeInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfMeInd,xrfMeInd.length);
   	
   }
   
     /**
	 * 	Update XrfMeInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfMeInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfMeInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfMeInd with another Field
	 *	@param value
	 */
   public void setXrfMeInd(Field source) {
       replace(source,0,source.length(),beginXrfMeInd,XRF_ME_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfMeInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfMeInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfMeInd,XRF_ME_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfMeInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfMeInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfMeInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfPteInd
	 *	@return xrfPteInd
	 */
   public char[] getXrfPteInd() throws CFException{
     if (isXrfPteIndModified()) { 
        xrfPteInd = refreshXrfPteInd();
     }
   		return xrfPteInd;
   }

  
	/**
	*  set variable xrfPteInd
	*  Corresponding COBOL Variable is XRF-PTE-IND
	*  @param value
	**/
   public void setXrfPteInd(char[] value) {
      xrfPteInd = checkXrfPteIndConstraints(value);
      serializeXrfPteInd(xrfPteInd);
   } 

     /**
	 * 	Update XrfPteInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfPteInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfPteInd,xrfPteInd.length);
   	
   }
   
   public void setXrfPteInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfPteInd,xrfPteInd.length);
   	
   }
   
     /**
	 * 	Update XrfPteInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfPteInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfPteInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfPteInd with another Field
	 *	@param value
	 */
   public void setXrfPteInd(Field source) {
       replace(source,0,source.length(),beginXrfPteInd,XRF_PTE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfPteInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfPteInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfPteInd,XRF_PTE_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfPteInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfPteInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfPteInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfProductInd
	 *	@return xrfProductInd
	 */
   public char[] getXrfProductInd() throws CFException{
     if (isXrfProductIndModified()) { 
        xrfProductInd = refreshXrfProductInd();
     }
   		return xrfProductInd;
   }

  
	/**
	*  set variable xrfProductInd
	*  Corresponding COBOL Variable is XRF-PRODUCT-IND
	*  @param value
	**/
   public void setXrfProductInd(char[] value) {
      xrfProductInd = checkXrfProductIndConstraints(value);
      serializeXrfProductInd(xrfProductInd);
   } 

     /**
	 * 	Update XrfProductInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfProductInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfProductInd,xrfProductInd.length);
   	
   }
   
   public void setXrfProductInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfProductInd,xrfProductInd.length);
   	
   }
   
     /**
	 * 	Update XrfProductInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfProductInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfProductInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfProductInd with another Field
	 *	@param value
	 */
   public void setXrfProductInd(Field source) {
       replace(source,0,source.length(),beginXrfProductInd,XRF_PRODUCT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfProductInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfProductInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfProductInd,XRF_PRODUCT_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfProductInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfProductInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfProductInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfFreelookInd
	 *	@return xrfFreelookInd
	 */
   public char[] getXrfFreelookInd() throws CFException{
     if (isXrfFreelookIndModified()) { 
        xrfFreelookInd = refreshXrfFreelookInd();
     }
   		return xrfFreelookInd;
   }

  
	/**
	*  set variable xrfFreelookInd
	*  Corresponding COBOL Variable is XRF-FREELOOK-IND
	*  @param value
	**/
   public void setXrfFreelookInd(char[] value) {
      xrfFreelookInd = checkXrfFreelookIndConstraints(value);
      serializeXrfFreelookInd(xrfFreelookInd);
   } 

     /**
	 * 	Update XrfFreelookInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfFreelookInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfFreelookInd,xrfFreelookInd.length);
   	
   }
   
   public void setXrfFreelookInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfFreelookInd,xrfFreelookInd.length);
   	
   }
   
     /**
	 * 	Update XrfFreelookInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfFreelookInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfFreelookInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfFreelookInd with another Field
	 *	@param value
	 */
   public void setXrfFreelookInd(Field source) {
       replace(source,0,source.length(),beginXrfFreelookInd,XRF_FREELOOK_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfFreelookInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfFreelookInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfFreelookInd,XRF_FREELOOK_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfFreelookInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfFreelookInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfFreelookInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfEbrInd
	 *	@return xrfEbrInd
	 */
   public char[] getXrfEbrInd() throws CFException{
     if (isXrfEbrIndModified()) { 
        xrfEbrInd = refreshXrfEbrInd();
     }
   		return xrfEbrInd;
   }

  
	/**
	*  set variable xrfEbrInd
	*  Corresponding COBOL Variable is XRF-EBR-IND
	*  @param value
	**/
   public void setXrfEbrInd(char[] value) {
      xrfEbrInd = checkXrfEbrIndConstraints(value);
      serializeXrfEbrInd(xrfEbrInd);
   } 

     /**
	 * 	Update XrfEbrInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfEbrInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfEbrInd,xrfEbrInd.length);
   	
   }
   
   public void setXrfEbrInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEbrInd,xrfEbrInd.length);
   	
   }
   
     /**
	 * 	Update XrfEbrInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfEbrInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEbrInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfEbrInd with another Field
	 *	@param value
	 */
   public void setXrfEbrInd(Field source) {
       replace(source,0,source.length(),beginXrfEbrInd,XRF_EBR_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfEbrInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfEbrInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfEbrInd,XRF_EBR_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfEbrInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfEbrInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEbrInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfLimSvcInd
	 *	@return xrfLimSvcInd
	 */
   public char[] getXrfLimSvcInd() throws CFException{
     if (isXrfLimSvcIndModified()) { 
        xrfLimSvcInd = refreshXrfLimSvcInd();
     }
   		return xrfLimSvcInd;
   }

  
	/**
	*  set variable xrfLimSvcInd
	*  Corresponding COBOL Variable is XRF-LIM-SVC-IND
	*  @param value
	**/
   public void setXrfLimSvcInd(char[] value) {
      xrfLimSvcInd = checkXrfLimSvcIndConstraints(value);
      serializeXrfLimSvcInd(xrfLimSvcInd);
   } 

     /**
	 * 	Update XrfLimSvcInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfLimSvcInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfLimSvcInd,xrfLimSvcInd.length);
   	
   }
   
   public void setXrfLimSvcInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfLimSvcInd,xrfLimSvcInd.length);
   	
   }
   
     /**
	 * 	Update XrfLimSvcInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfLimSvcInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfLimSvcInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfLimSvcInd with another Field
	 *	@param value
	 */
   public void setXrfLimSvcInd(Field source) {
       replace(source,0,source.length(),beginXrfLimSvcInd,XRF_LIM_SVC_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfLimSvcInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfLimSvcInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfLimSvcInd,XRF_LIM_SVC_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfLimSvcInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfLimSvcInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfLimSvcInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfOptOutUbhTier
	 *	@return xrfOptOutUbhTier
	 */
   public char[] getXrfOptOutUbhTier() throws CFException{
     if (isXrfOptOutUbhTierModified()) { 
        xrfOptOutUbhTier = refreshXrfOptOutUbhTier();
     }
   		return xrfOptOutUbhTier;
   }

  
	/**
	*  set variable xrfOptOutUbhTier
	*  Corresponding COBOL Variable is XRF-OPT-OUT-UBH-TIER
	*  @param value
	**/
   public void setXrfOptOutUbhTier(char[] value) {
      xrfOptOutUbhTier = checkXrfOptOutUbhTierConstraints(value);
      serializeXrfOptOutUbhTier(xrfOptOutUbhTier);
   } 

     /**
	 * 	Update XrfOptOutUbhTier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfOptOutUbhTier(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfOptOutUbhTier,xrfOptOutUbhTier.length);
   	
   }
   
   public void setXrfOptOutUbhTier(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfOptOutUbhTier,xrfOptOutUbhTier.length);
   	
   }
   
     /**
	 * 	Update XrfOptOutUbhTier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfOptOutUbhTier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfOptOutUbhTier+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfOptOutUbhTier with another Field
	 *	@param value
	 */
   public void setXrfOptOutUbhTier(Field source) {
       replace(source,0,source.length(),beginXrfOptOutUbhTier,XRF_OPT_OUT_UBH_TIER_LEN);
   	
   }  
   
     /**
	 * 	Update XrfOptOutUbhTier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfOptOutUbhTier(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfOptOutUbhTier,XRF_OPT_OUT_UBH_TIER_LEN);
   	
   }
   
     /**
	 * 	Update XrfOptOutUbhTier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfOptOutUbhTier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfOptOutUbhTier+targetIndex,targetLen);
    
   }
	public int getXrfHraApIndLmt() throws CFException {
        if (isXrfHraApIndLmtModified()) { 
           xrfHraApIndLmt = refreshXrfHraApIndLmt();
        }
   		return xrfHraApIndLmt;
	}
	
	/**
	 * 	Update XrfHraApIndLmt with the passed value
	 *  Corresponding COBOL Variable is XRF-HRA-AP-IND-LMT
	 *	@param number
	 */
	public void setXrfHraApIndLmt(int number) {
			xrfHraApIndLmt = checkXrfHraApIndLmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeXrfHraApIndLmt(xrfHraApIndLmt);
	}


	public void setXrfHraApIndLmt(long number) {
	    number = checkXrfHraApIndLmtMaxLimit(number); // Truncate if value is beyond +/- Max range
		setXrfHraApIndLmt((int)number);
	}
	
	public int getXrfHraApFamLmt() throws CFException {
        if (isXrfHraApFamLmtModified()) { 
           xrfHraApFamLmt = refreshXrfHraApFamLmt();
        }
   		return xrfHraApFamLmt;
	}
	
	/**
	 * 	Update XrfHraApFamLmt with the passed value
	 *  Corresponding COBOL Variable is XRF-HRA-AP-FAM-LMT
	 *	@param number
	 */
	public void setXrfHraApFamLmt(int number) {
			xrfHraApFamLmt = checkXrfHraApFamLmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeXrfHraApFamLmt(xrfHraApFamLmt);
	}


	public void setXrfHraApFamLmt(long number) {
	    number = checkXrfHraApFamLmtMaxLimit(number); // Truncate if value is beyond +/- Max range
		setXrfHraApFamLmt((int)number);
	}
	
	/**
	 *	Returns the value of xrfDefaultPoc
	 *	@return xrfDefaultPoc
	 */
	public int getXrfDefaultPoc() throws CFException {
       if (isXrfDefaultPocModified()) { 
           xrfDefaultPoc = refreshXrfDefaultPoc();
        }
   		return xrfDefaultPoc;
	}
	

	
	   
	/**
	 * 	Update XrfDefaultPoc with the passed value
	 *  Corresponding COBOL Variable is XRF-DEFAULT-POC
	 *	@param number
	 */
	public void setXrfDefaultPoc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    xrfDefaultPoc = checkXrfDefaultPocMaxLimit(number); 
		serializeXrfDefaultPoc(xrfDefaultPoc);
	}
	

	public void setXrfDefaultPoc(long number) {
	    number = checkXrfDefaultPocMaxLimit(number); // Truncate if value is beyond +/- Max range
		setXrfDefaultPoc((int)number);
	}
	
	/**
	 * 	Update XrfDefaultPoc with the passed value
	 *	@param value (String or char[])
	 */
	public void setXrfDefaultPoc(char[] value) throws CFException {
		 xrfDefaultPoc = serializeXrfDefaultPoc(value);
	}
	/**
	 * 	Update XrfDefaultPoc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setXrfDefaultPocString(char[] value) throws CFException {
		 setXrfDefaultPoc(value);
	}
	/**
	 *	Returns the value of xrfPcntRateJqCodesFound
	 *	@return xrfPcntRateJqCodesFound
	 */
	public int getXrfPcntRateJqCodesFound() throws CFException {
       if (isXrfPcntRateJqCodesFoundModified()) { 
           xrfPcntRateJqCodesFound = refreshXrfPcntRateJqCodesFound();
        }
   		return xrfPcntRateJqCodesFound;
	}
	

	
	   
	/**
	 * 	Update XrfPcntRateJqCodesFound with the passed value
	 *  Corresponding COBOL Variable is XRF-PCNT-RATE-JQ-CODES-FOUND
	 *	@param number
	 */
	public void setXrfPcntRateJqCodesFound(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    xrfPcntRateJqCodesFound = checkXrfPcntRateJqCodesFoundMaxLimit(number); 
		serializeXrfPcntRateJqCodesFound(xrfPcntRateJqCodesFound);
	}
	

	public void setXrfPcntRateJqCodesFound(long number) {
	    number = checkXrfPcntRateJqCodesFoundMaxLimit(number); // Truncate if value is beyond +/- Max range
		setXrfPcntRateJqCodesFound((int)number);
	}
	
	/**
	 * 	Update XrfPcntRateJqCodesFound with the passed value
	 *	@param value (String or char[])
	 */
	public void setXrfPcntRateJqCodesFound(char[] value) throws CFException {
		 xrfPcntRateJqCodesFound = serializeXrfPcntRateJqCodesFound(value);
	}
	/**
	 * 	Update XrfPcntRateJqCodesFound with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setXrfPcntRateJqCodesFoundString(char[] value) throws CFException {
		 setXrfPcntRateJqCodesFound(value);
	}
	/**
	 *	Returns the value of xrfAppealLangInd
	 *	@return xrfAppealLangInd
	 */
   public char[] getXrfAppealLangInd() throws CFException{
     if (isXrfAppealLangIndModified()) { 
        xrfAppealLangInd = refreshXrfAppealLangInd();
     }
   		return xrfAppealLangInd;
   }

  
	/**
	*  set variable xrfAppealLangInd
	*  Corresponding COBOL Variable is XRF-APPEAL-LANG-IND
	*  @param value
	**/
   public void setXrfAppealLangInd(char[] value) {
      xrfAppealLangInd = checkXrfAppealLangIndConstraints(value);
      serializeXrfAppealLangInd(xrfAppealLangInd);
   } 

     /**
	 * 	Update XrfAppealLangInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfAppealLangInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfAppealLangInd,xrfAppealLangInd.length);
   	
   }
   
   public void setXrfAppealLangInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfAppealLangInd,xrfAppealLangInd.length);
   	
   }
   
     /**
	 * 	Update XrfAppealLangInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfAppealLangInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfAppealLangInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfAppealLangInd with another Field
	 *	@param value
	 */
   public void setXrfAppealLangInd(Field source) {
       replace(source,0,source.length(),beginXrfAppealLangInd,XRF_APPEAL_LANG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfAppealLangInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfAppealLangInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfAppealLangInd,XRF_APPEAL_LANG_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfAppealLangInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfAppealLangInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfAppealLangInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfProrateIntrvl
	 *	@return xrfProrateIntrvl
	 */
   public char[] getXrfProrateIntrvl() throws CFException{
     if (isXrfProrateIntrvlModified()) { 
        xrfProrateIntrvl = refreshXrfProrateIntrvl();
     }
   		return xrfProrateIntrvl;
   }

  
	/**
	*  set variable xrfProrateIntrvl
	*  Corresponding COBOL Variable is XRF-PRORATE-INTRVL
	*  @param value
	**/
   public void setXrfProrateIntrvl(char[] value) {
      xrfProrateIntrvl = checkXrfProrateIntrvlConstraints(value);
      serializeXrfProrateIntrvl(xrfProrateIntrvl);
   } 

     /**
	 * 	Update XrfProrateIntrvl 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfProrateIntrvl(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfProrateIntrvl,xrfProrateIntrvl.length);
   	
   }
   
   public void setXrfProrateIntrvl(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfProrateIntrvl,xrfProrateIntrvl.length);
   	
   }
   
     /**
	 * 	Update XrfProrateIntrvl 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfProrateIntrvl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfProrateIntrvl+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfProrateIntrvl with another Field
	 *	@param value
	 */
   public void setXrfProrateIntrvl(Field source) {
       replace(source,0,source.length(),beginXrfProrateIntrvl,XRF_PRORATE_INTRVL_LEN);
   	
   }  
   
     /**
	 * 	Update XrfProrateIntrvl 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfProrateIntrvl(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfProrateIntrvl,XRF_PRORATE_INTRVL_LEN);
   	
   }
   
     /**
	 * 	Update XrfProrateIntrvl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfProrateIntrvl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfProrateIntrvl+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfNbSuppressInd
	 *	@return xrfNbSuppressInd
	 */
   public char[] getXrfNbSuppressInd() throws CFException{
     if (isXrfNbSuppressIndModified()) { 
        xrfNbSuppressInd = refreshXrfNbSuppressInd();
     }
   		return xrfNbSuppressInd;
   }

  
	/**
	*  set variable xrfNbSuppressInd
	*  Corresponding COBOL Variable is XRF-NB-SUPPRESS-IND
	*  @param value
	**/
   public void setXrfNbSuppressInd(char[] value) {
      xrfNbSuppressInd = checkXrfNbSuppressIndConstraints(value);
      serializeXrfNbSuppressInd(xrfNbSuppressInd);
   } 

     /**
	 * 	Update XrfNbSuppressInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfNbSuppressInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfNbSuppressInd,xrfNbSuppressInd.length);
   	
   }
   
   public void setXrfNbSuppressInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfNbSuppressInd,xrfNbSuppressInd.length);
   	
   }
   
     /**
	 * 	Update XrfNbSuppressInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfNbSuppressInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfNbSuppressInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfNbSuppressInd with another Field
	 *	@param value
	 */
   public void setXrfNbSuppressInd(Field source) {
       replace(source,0,source.length(),beginXrfNbSuppressInd,XRF_NB_SUPPRESS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfNbSuppressInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfNbSuppressInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfNbSuppressInd,XRF_NB_SUPPRESS_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfNbSuppressInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfNbSuppressInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfNbSuppressInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfProrateEvent
	 *	@return xrfProrateEvent
	 */
   public char[] getXrfProrateEvent() throws CFException{
     if (isXrfProrateEventModified()) { 
        xrfProrateEvent = refreshXrfProrateEvent();
     }
   		return xrfProrateEvent;
   }

  
	/**
	*  set variable xrfProrateEvent
	*  Corresponding COBOL Variable is XRF-PRORATE-EVENT
	*  @param value
	**/
   public void setXrfProrateEvent(char[] value) {
      xrfProrateEvent = checkXrfProrateEventConstraints(value);
      serializeXrfProrateEvent(xrfProrateEvent);
   } 

     /**
	 * 	Update XrfProrateEvent 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfProrateEvent(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfProrateEvent,xrfProrateEvent.length);
   	
   }
   
   public void setXrfProrateEvent(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfProrateEvent,xrfProrateEvent.length);
   	
   }
   
     /**
	 * 	Update XrfProrateEvent 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfProrateEvent(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfProrateEvent+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfProrateEvent with another Field
	 *	@param value
	 */
   public void setXrfProrateEvent(Field source) {
       replace(source,0,source.length(),beginXrfProrateEvent,XRF_PRORATE_EVENT_LEN);
   	
   }  
   
     /**
	 * 	Update XrfProrateEvent 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfProrateEvent(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfProrateEvent,XRF_PRORATE_EVENT_LEN);
   	
   }
   
     /**
	 * 	Update XrfProrateEvent 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfProrateEvent(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfProrateEvent+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfCoreMedPrrAuthCd
	 *	@return xrfCoreMedPrrAuthCd
	 */
   public char[] getXrfCoreMedPrrAuthCd() throws CFException{
     if (isXrfCoreMedPrrAuthCdModified()) { 
        xrfCoreMedPrrAuthCd = refreshXrfCoreMedPrrAuthCd();
     }
   		return xrfCoreMedPrrAuthCd;
   }

  
	/**
	*  set variable xrfCoreMedPrrAuthCd
	*  Corresponding COBOL Variable is XRF-CORE-MED-PRR-AUTH-CD
	*  @param value
	**/
   public void setXrfCoreMedPrrAuthCd(char[] value) {
      xrfCoreMedPrrAuthCd = checkXrfCoreMedPrrAuthCdConstraints(value);
      serializeXrfCoreMedPrrAuthCd(xrfCoreMedPrrAuthCd);
   } 

     /**
	 * 	Update XrfCoreMedPrrAuthCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfCoreMedPrrAuthCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfCoreMedPrrAuthCd,xrfCoreMedPrrAuthCd.length);
   	
   }
   
   public void setXrfCoreMedPrrAuthCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfCoreMedPrrAuthCd,xrfCoreMedPrrAuthCd.length);
   	
   }
   
     /**
	 * 	Update XrfCoreMedPrrAuthCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfCoreMedPrrAuthCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfCoreMedPrrAuthCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfCoreMedPrrAuthCd with another Field
	 *	@param value
	 */
   public void setXrfCoreMedPrrAuthCd(Field source) {
       replace(source,0,source.length(),beginXrfCoreMedPrrAuthCd,XRF_CORE_MED_PRR_AUTH_CD_LEN);
   	
   }  
   
     /**
	 * 	Update XrfCoreMedPrrAuthCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfCoreMedPrrAuthCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfCoreMedPrrAuthCd,XRF_CORE_MED_PRR_AUTH_CD_LEN);
   	
   }
   
     /**
	 * 	Update XrfCoreMedPrrAuthCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfCoreMedPrrAuthCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfCoreMedPrrAuthCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfEnrpErInd
	 *	@return xrfEnrpErInd
	 */
   public char[] getXrfEnrpErInd() throws CFException{
     if (isXrfEnrpErIndModified()) { 
        xrfEnrpErInd = refreshXrfEnrpErInd();
     }
   		return xrfEnrpErInd;
   }

  
	/**
	*  set variable xrfEnrpErInd
	*  Corresponding COBOL Variable is XRF-ENRP-ER-IND
	*  @param value
	**/
   public void setXrfEnrpErInd(char[] value) {
      xrfEnrpErInd = checkXrfEnrpErIndConstraints(value);
      serializeXrfEnrpErInd(xrfEnrpErInd);
   } 

     /**
	 * 	Update XrfEnrpErInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfEnrpErInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfEnrpErInd,xrfEnrpErInd.length);
   	
   }
   
   public void setXrfEnrpErInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEnrpErInd,xrfEnrpErInd.length);
   	
   }
   
     /**
	 * 	Update XrfEnrpErInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfEnrpErInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEnrpErInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfEnrpErInd with another Field
	 *	@param value
	 */
   public void setXrfEnrpErInd(Field source) {
       replace(source,0,source.length(),beginXrfEnrpErInd,XRF_ENRP_ER_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfEnrpErInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfEnrpErInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfEnrpErInd,XRF_ENRP_ER_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfEnrpErInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfEnrpErInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEnrpErInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfEnrpNonErInd
	 *	@return xrfEnrpNonErInd
	 */
   public char[] getXrfEnrpNonErInd() throws CFException{
     if (isXrfEnrpNonErIndModified()) { 
        xrfEnrpNonErInd = refreshXrfEnrpNonErInd();
     }
   		return xrfEnrpNonErInd;
   }

  
	/**
	*  set variable xrfEnrpNonErInd
	*  Corresponding COBOL Variable is XRF-ENRP-NON-ER-IND
	*  @param value
	**/
   public void setXrfEnrpNonErInd(char[] value) {
      xrfEnrpNonErInd = checkXrfEnrpNonErIndConstraints(value);
      serializeXrfEnrpNonErInd(xrfEnrpNonErInd);
   } 

     /**
	 * 	Update XrfEnrpNonErInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfEnrpNonErInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfEnrpNonErInd,xrfEnrpNonErInd.length);
   	
   }
   
   public void setXrfEnrpNonErInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEnrpNonErInd,xrfEnrpNonErInd.length);
   	
   }
   
     /**
	 * 	Update XrfEnrpNonErInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfEnrpNonErInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEnrpNonErInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfEnrpNonErInd with another Field
	 *	@param value
	 */
   public void setXrfEnrpNonErInd(Field source) {
       replace(source,0,source.length(),beginXrfEnrpNonErInd,XRF_ENRP_NON_ER_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfEnrpNonErInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfEnrpNonErInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfEnrpNonErInd,XRF_ENRP_NON_ER_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfEnrpNonErInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfEnrpNonErInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEnrpNonErInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfEnrpNonErPct
	 *	@return xrfEnrpNonErPct
	 */
	public int getXrfEnrpNonErPct() throws CFException {
       if (isXrfEnrpNonErPctModified()) { 
           xrfEnrpNonErPct = refreshXrfEnrpNonErPct();
        }
   		return xrfEnrpNonErPct;
	}
	

	
	   
	/**
	 * 	Update XrfEnrpNonErPct with the passed value
	 *  Corresponding COBOL Variable is XRF-ENRP-NON-ER-PCT
	 *	@param number
	 */
	public void setXrfEnrpNonErPct(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    xrfEnrpNonErPct = checkXrfEnrpNonErPctMaxLimit(number); 
		serializeXrfEnrpNonErPct(xrfEnrpNonErPct);
	}
	

	public void setXrfEnrpNonErPct(long number) {
	    number = checkXrfEnrpNonErPctMaxLimit(number); // Truncate if value is beyond +/- Max range
		setXrfEnrpNonErPct((int)number);
	}
	
	/**
	 * 	Update XrfEnrpNonErPct with the passed value
	 *	@param value (String or char[])
	 */
	public void setXrfEnrpNonErPct(char[] value) throws CFException {
		 xrfEnrpNonErPct = serializeXrfEnrpNonErPct(value);
	}
	/**
	 * 	Update XrfEnrpNonErPct with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setXrfEnrpNonErPctString(char[] value) throws CFException {
		 setXrfEnrpNonErPct(value);
	}
	/**
	 *	Returns the value of xrfEhbInd
	 *	@return xrfEhbInd
	 */
   public char[] getXrfEhbInd() throws CFException{
     if (isXrfEhbIndModified()) { 
        xrfEhbInd = refreshXrfEhbInd();
     }
   		return xrfEhbInd;
   }

  
	/**
	*  set variable xrfEhbInd
	*  Corresponding COBOL Variable is XRF-EHB-IND
	*  @param value
	**/
   public void setXrfEhbInd(char[] value) {
      xrfEhbInd = checkXrfEhbIndConstraints(value);
      serializeXrfEhbInd(xrfEhbInd);
   } 

     /**
	 * 	Update XrfEhbInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfEhbInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfEhbInd,xrfEhbInd.length);
   	
   }
   
   public void setXrfEhbInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEhbInd,xrfEhbInd.length);
   	
   }
   
     /**
	 * 	Update XrfEhbInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfEhbInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEhbInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfEhbInd with another Field
	 *	@param value
	 */
   public void setXrfEhbInd(Field source) {
       replace(source,0,source.length(),beginXrfEhbInd,XRF_EHB_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfEhbInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfEhbInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfEhbInd,XRF_EHB_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfEhbInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfEhbInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfEhbInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler01
	 *	@return filler01
	 */
   public char[] getFiller01() throws CFException{
     if (isFiller01Modified()) { 
        filler01 = refreshFiller01();
     }
   		return filler01;
   }

  
	/**
	*  set variable filler01
	*  Corresponding COBOL Variable is FILLER-01
	*  @param value
	**/
   public void setFiller01(char[] value) {
      filler01 = checkFiller01Constraints(value);
      serializeFiller01(filler01);
   } 

     /**
	 * 	Update Filler01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller01,filler01.length);
   	
   }
   
   public void setFiller01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller01,filler01.length);
   	
   }
   
     /**
	 * 	Update Filler01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler01 with another Field
	 *	@param value
	 */
   public void setFiller01(Field source) {
       replace(source,0,source.length(),beginFiller01,FILLER_01_LEN);
   	
   }  
   
     /**
	 * 	Update Filler01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller01,FILLER_01_LEN);
   	
   }
   
     /**
	 * 	Update Filler01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller01+targetIndex,targetLen);
    
   }

	
	
	

		public static int getXrfCmInfoFieldLength() {
			return XRF_CM_INFO_LENGTH;
		}

}
  
