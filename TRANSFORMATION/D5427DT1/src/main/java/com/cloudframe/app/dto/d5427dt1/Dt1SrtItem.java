package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Dt1SrtItem is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dt1SrtItem extends Dt1SrtItemSerialized { 
   

								private int dt1SrtFlnCent;

								private long dt1SrtFln;

						private char[] dt1SrtIcn = Field.fillLowValue(10);

								private long dt1SrtDate;

								private long dt1SrtTime;

								private int dt1SrtBankCode;

								private long dt1SrtDraft;

						private char[] dt1SrtPayeeCode = Field.fillLowValue(1);

								private int dt1SrtLineSequence;

						private char[] dt1SrtTranCode = Field.fillLowValue(2);

								private long dt1SrtApproverAltId;

								private short dt1SrtClmItem;

								private int dt1SrtSuffixCd;

								private long dt1SrtProviderId;

								private int dt1SrtHeaderCt;

						private char[] dt1SrtDivNbr = Field.fillLowValue(4);

						private char[] dt1SrtClsNbr = Field.fillLowValue(4);
	
	/**
	* Constructor for Dt1SrtItem
	**/
    public Dt1SrtItem() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dt1SrtItem. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1SrtItem(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dt1SrtFlnCent
	 *	@return dt1SrtFlnCent
	 */
	public int getDt1SrtFlnCent() throws CFException {
       if (isDt1SrtFlnCentModified()) { 
           dt1SrtFlnCent = refreshDt1SrtFlnCent();
        }
   		return dt1SrtFlnCent;
	}
	

	
	   
	/**
	 * 	Update Dt1SrtFlnCent with the passed value
	 *  Corresponding COBOL Variable is DT1-SRT-FLN-CENT
	 *	@param number
	 */
	public void setDt1SrtFlnCent(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1SrtFlnCent = checkDt1SrtFlnCentMaxLimit(number); 
		serializeDt1SrtFlnCent(dt1SrtFlnCent);
	}
	

	public void setDt1SrtFlnCent(long number) {
	    number = checkDt1SrtFlnCentMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1SrtFlnCent((int)number);
	}
	
	/**
	 * 	Update Dt1SrtFlnCent with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1SrtFlnCent(char[] value) throws CFException {
		 dt1SrtFlnCent = serializeDt1SrtFlnCent(value);
	}
	/**
	 * 	Update Dt1SrtFlnCent with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1SrtFlnCentString(char[] value) throws CFException {
		 setDt1SrtFlnCent(value);
	}
	public long getDt1SrtFln() throws CFException {
        if (isDt1SrtFlnModified()) { 
           dt1SrtFln = refreshDt1SrtFln();
        }
   		return dt1SrtFln;
	}
	
	/**
	 * 	Update Dt1SrtFln with the passed value
	 *  Corresponding COBOL Variable is DT1-SRT-FLN
	 *	@param number
	 */
	public void setDt1SrtFln(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			dt1SrtFln = checkDt1SrtFlnMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeDt1SrtFln(dt1SrtFln);
	}


	/**
	 *	Returns the value of dt1SrtIcn
	 *	@return dt1SrtIcn
	 */
   public char[] getDt1SrtIcn() throws CFException{
     if (isDt1SrtIcnModified()) { 
        dt1SrtIcn = refreshDt1SrtIcn();
     }
   		return dt1SrtIcn;
   }

  
	/**
	*  set variable dt1SrtIcn
	*  Corresponding COBOL Variable is DT1-SRT-ICN
	*  @param value
	**/
   public void setDt1SrtIcn(char[] value) {
      dt1SrtIcn = checkDt1SrtIcnConstraints(value);
      serializeDt1SrtIcn(dt1SrtIcn);
   } 

     /**
	 * 	Update Dt1SrtIcn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtIcn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1SrtIcn,dt1SrtIcn.length);
   	
   }
   
   public void setDt1SrtIcn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1SrtIcn,dt1SrtIcn.length);
   	
   }
   
     /**
	 * 	Update Dt1SrtIcn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtIcn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1SrtIcn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1SrtIcn with another Field
	 *	@param value
	 */
   public void setDt1SrtIcn(Field source) {
       replace(source,0,source.length(),beginDt1SrtIcn,DT_1_SRT_ICN_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1SrtIcn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1SrtIcn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1SrtIcn,DT_1_SRT_ICN_LEN);
   	
   }
   
     /**
	 * 	Update Dt1SrtIcn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtIcn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1SrtIcn+targetIndex,targetLen);
    
   }
	public long getDt1SrtDate() throws CFException {
        if (isDt1SrtDateModified()) { 
           dt1SrtDate = refreshDt1SrtDate();
        }
   		return dt1SrtDate;
	}
	
	/**
	 * 	Update Dt1SrtDate with the passed value
	 *  Corresponding COBOL Variable is DT1-SRT-DATE
	 *	@param number
	 */
	public void setDt1SrtDate(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			dt1SrtDate = checkDt1SrtDateMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeDt1SrtDate(dt1SrtDate);
	}


	public long getDt1SrtTime() throws CFException {
        if (isDt1SrtTimeModified()) { 
           dt1SrtTime = refreshDt1SrtTime();
        }
   		return dt1SrtTime;
	}
	
	/**
	 * 	Update Dt1SrtTime with the passed value
	 *  Corresponding COBOL Variable is DT1-SRT-TIME
	 *	@param number
	 */
	public void setDt1SrtTime(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			dt1SrtTime = checkDt1SrtTimeMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeDt1SrtTime(dt1SrtTime);
	}


	public int getDt1SrtBankCode() throws CFException {
        if (isDt1SrtBankCodeModified()) { 
           dt1SrtBankCode = refreshDt1SrtBankCode();
        }
   		return dt1SrtBankCode;
	}
	
	/**
	 * 	Update Dt1SrtBankCode with the passed value
	 *  Corresponding COBOL Variable is DT1-SRT-BANK-CODE
	 *	@param number
	 */
	public void setDt1SrtBankCode(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			dt1SrtBankCode = checkDt1SrtBankCodeMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeDt1SrtBankCode(dt1SrtBankCode);
	}


	public void setDt1SrtBankCode(long number) {
	    number = checkDt1SrtBankCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1SrtBankCode((int)number);
	}
	
	public long getDt1SrtDraft() throws CFException {
        if (isDt1SrtDraftModified()) { 
           dt1SrtDraft = refreshDt1SrtDraft();
        }
   		return dt1SrtDraft;
	}
	
	/**
	 * 	Update Dt1SrtDraft with the passed value
	 *  Corresponding COBOL Variable is DT1-SRT-DRAFT
	 *	@param number
	 */
	public void setDt1SrtDraft(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			dt1SrtDraft = checkDt1SrtDraftMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeDt1SrtDraft(dt1SrtDraft);
	}


	/**
	 *	Returns the value of dt1SrtPayeeCode
	 *	@return dt1SrtPayeeCode
	 */
   public char[] getDt1SrtPayeeCode() throws CFException{
     if (isDt1SrtPayeeCodeModified()) { 
        dt1SrtPayeeCode = refreshDt1SrtPayeeCode();
     }
   		return dt1SrtPayeeCode;
   }

  
	/**
	*  set variable dt1SrtPayeeCode
	*  Corresponding COBOL Variable is DT1-SRT-PAYEE-CODE
	*  @param value
	**/
   public void setDt1SrtPayeeCode(char[] value) {
      dt1SrtPayeeCode = checkDt1SrtPayeeCodeConstraints(value);
      serializeDt1SrtPayeeCode(dt1SrtPayeeCode);
   } 

     /**
	 * 	Update Dt1SrtPayeeCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtPayeeCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1SrtPayeeCode,dt1SrtPayeeCode.length);
   	
   }
   
   public void setDt1SrtPayeeCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1SrtPayeeCode,dt1SrtPayeeCode.length);
   	
   }
   
     /**
	 * 	Update Dt1SrtPayeeCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtPayeeCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1SrtPayeeCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1SrtPayeeCode with another Field
	 *	@param value
	 */
   public void setDt1SrtPayeeCode(Field source) {
       replace(source,0,source.length(),beginDt1SrtPayeeCode,DT_1_SRT_PAYEE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1SrtPayeeCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1SrtPayeeCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1SrtPayeeCode,DT_1_SRT_PAYEE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Dt1SrtPayeeCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtPayeeCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1SrtPayeeCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1SrtLineSequence
	 *	@return dt1SrtLineSequence
	 */
	public int getDt1SrtLineSequence() throws CFException {
       if (isDt1SrtLineSequenceModified()) { 
           dt1SrtLineSequence = refreshDt1SrtLineSequence();
        }
   		return dt1SrtLineSequence;
	}
	

	
	   
	/**
	 * 	Update Dt1SrtLineSequence with the passed value
	 *  Corresponding COBOL Variable is DT1-SRT-LINE-SEQUENCE
	 *	@param number
	 */
	public void setDt1SrtLineSequence(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1SrtLineSequence = checkDt1SrtLineSequenceMaxLimit(number); 
		serializeDt1SrtLineSequence(dt1SrtLineSequence);
	}
	

	public void setDt1SrtLineSequence(long number) {
	    number = checkDt1SrtLineSequenceMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1SrtLineSequence((int)number);
	}
	
	/**
	 * 	Update Dt1SrtLineSequence with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1SrtLineSequence(char[] value) throws CFException {
		 dt1SrtLineSequence = serializeDt1SrtLineSequence(value);
	}
	/**
	 * 	Update Dt1SrtLineSequence with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1SrtLineSequenceString(char[] value) throws CFException {
		 setDt1SrtLineSequence(value);
	}
	/**
	 *	Returns the value of dt1SrtTranCode
	 *	@return dt1SrtTranCode
	 */
   public char[] getDt1SrtTranCode() throws CFException{
     if (isDt1SrtTranCodeModified()) { 
        dt1SrtTranCode = refreshDt1SrtTranCode();
     }
   		return dt1SrtTranCode;
   }

  
	/**
	*  set variable dt1SrtTranCode
	*  Corresponding COBOL Variable is DT1-SRT-TRAN-CODE
	*  @param value
	**/
   public void setDt1SrtTranCode(char[] value) {
      dt1SrtTranCode = checkDt1SrtTranCodeConstraints(value);
      serializeDt1SrtTranCode(dt1SrtTranCode);
   } 

     /**
	 * 	Update Dt1SrtTranCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtTranCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1SrtTranCode,dt1SrtTranCode.length);
   	
   }
   
   public void setDt1SrtTranCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1SrtTranCode,dt1SrtTranCode.length);
   	
   }
   
     /**
	 * 	Update Dt1SrtTranCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtTranCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1SrtTranCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1SrtTranCode with another Field
	 *	@param value
	 */
   public void setDt1SrtTranCode(Field source) {
       replace(source,0,source.length(),beginDt1SrtTranCode,DT_1_SRT_TRAN_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1SrtTranCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1SrtTranCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1SrtTranCode,DT_1_SRT_TRAN_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Dt1SrtTranCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtTranCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1SrtTranCode+targetIndex,targetLen);
    
   }
	public long getDt1SrtApproverAltId() throws CFException {
        if (isDt1SrtApproverAltIdModified()) { 
           dt1SrtApproverAltId = refreshDt1SrtApproverAltId();
        }
   		return dt1SrtApproverAltId;
	}
	
	/**
	 * 	Update Dt1SrtApproverAltId with the passed value
	 *  Corresponding COBOL Variable is DT1-SRT-APPROVER-ALT-ID
	 *	@param number
	 */
	public void setDt1SrtApproverAltId(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			dt1SrtApproverAltId = checkDt1SrtApproverAltIdMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeDt1SrtApproverAltId(dt1SrtApproverAltId);
	}


	public short getDt1SrtClmItem() throws CFException {
        if (isDt1SrtClmItemModified()) { 
           dt1SrtClmItem = refreshDt1SrtClmItem();
        }
   		return dt1SrtClmItem;
	}
	
	/**
	 * 	Update Dt1SrtClmItem with the passed value
	 *  Corresponding COBOL Variable is DT1-SRT-CLM-ITEM
	 *	@param number
	 */
	public void setDt1SrtClmItem(short number) {
			dt1SrtClmItem = checkDt1SrtClmItemMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeDt1SrtClmItem(dt1SrtClmItem);
	}

	public void setDt1SrtClmItem(int number) {
	    number = checkDt1SrtClmItemMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDt1SrtClmItem((short)number);
	}
	public void setDt1SrtClmItem(long number) {
	    number = checkDt1SrtClmItemMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDt1SrtClmItem((short)number);
	}
	

	/**
	 *	Returns the value of dt1SrtSuffixCd
	 *	@return dt1SrtSuffixCd
	 */
	public int getDt1SrtSuffixCd() throws CFException {
       if (isDt1SrtSuffixCdModified()) { 
           dt1SrtSuffixCd = refreshDt1SrtSuffixCd();
        }
   		return dt1SrtSuffixCd;
	}
	

	
	   
	/**
	 * 	Update Dt1SrtSuffixCd with the passed value
	 *  Corresponding COBOL Variable is DT1-SRT-SUFFIX-CD
	 *	@param number
	 */
	public void setDt1SrtSuffixCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1SrtSuffixCd = checkDt1SrtSuffixCdMaxLimit(number); 
		serializeDt1SrtSuffixCd(dt1SrtSuffixCd);
	}
	

	public void setDt1SrtSuffixCd(long number) {
	    number = checkDt1SrtSuffixCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1SrtSuffixCd((int)number);
	}
	
	/**
	 * 	Update Dt1SrtSuffixCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1SrtSuffixCd(char[] value) throws CFException {
		 dt1SrtSuffixCd = serializeDt1SrtSuffixCd(value);
	}
	/**
	 * 	Update Dt1SrtSuffixCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1SrtSuffixCdString(char[] value) throws CFException {
		 setDt1SrtSuffixCd(value);
	}
	/**
	 *	Returns the value of dt1SrtProviderId
	 *	@return dt1SrtProviderId
	 */
	public long getDt1SrtProviderId() throws CFException {
       if (isDt1SrtProviderIdModified()) { 
           dt1SrtProviderId = refreshDt1SrtProviderId();
        }
   		return dt1SrtProviderId;
	}
	

	
	   
	/**
	 * 	Update Dt1SrtProviderId with the passed value
	 *  Corresponding COBOL Variable is DT1-SRT-PROVIDER-ID
	 *	@param number
	 */
	public void setDt1SrtProviderId(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1SrtProviderId = checkDt1SrtProviderIdMaxLimit(number); 
		serializeDt1SrtProviderId(dt1SrtProviderId);
	}
	

	/**
	 * 	Update Dt1SrtProviderId with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1SrtProviderId(char[] value) throws CFException {
		 dt1SrtProviderId = serializeDt1SrtProviderId(value);
	}
	/**
	 * 	Update Dt1SrtProviderId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1SrtProviderIdString(char[] value) throws CFException {
		 setDt1SrtProviderId(value);
	}
	/**
	 *	Returns the value of dt1SrtHeaderCt
	 *	@return dt1SrtHeaderCt
	 */
	public int getDt1SrtHeaderCt() throws CFException {
       if (isDt1SrtHeaderCtModified()) { 
           dt1SrtHeaderCt = refreshDt1SrtHeaderCt();
        }
   		return dt1SrtHeaderCt;
	}
	

	
	   
	/**
	 * 	Update Dt1SrtHeaderCt with the passed value
	 *  Corresponding COBOL Variable is DT1-SRT-HEADER-CT
	 *	@param number
	 */
	public void setDt1SrtHeaderCt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dt1SrtHeaderCt = checkDt1SrtHeaderCtMaxLimit(number); 
		serializeDt1SrtHeaderCt(dt1SrtHeaderCt);
	}
	

	public void setDt1SrtHeaderCt(long number) {
	    number = checkDt1SrtHeaderCtMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDt1SrtHeaderCt((int)number);
	}
	
	/**
	 * 	Update Dt1SrtHeaderCt with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1SrtHeaderCt(char[] value) throws CFException {
		 dt1SrtHeaderCt = serializeDt1SrtHeaderCt(value);
	}
	/**
	 * 	Update Dt1SrtHeaderCt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1SrtHeaderCtString(char[] value) throws CFException {
		 setDt1SrtHeaderCt(value);
	}
	/**
	 *	Returns the value of dt1SrtDivNbr
	 *	@return dt1SrtDivNbr
	 */
   public char[] getDt1SrtDivNbr() throws CFException{
     if (isDt1SrtDivNbrModified()) { 
        dt1SrtDivNbr = refreshDt1SrtDivNbr();
     }
   		return dt1SrtDivNbr;
   }

  
	/**
	*  set variable dt1SrtDivNbr
	*  Corresponding COBOL Variable is DT1-SRT-DIV-NBR
	*  @param value
	**/
   public void setDt1SrtDivNbr(char[] value) {
      dt1SrtDivNbr = checkDt1SrtDivNbrConstraints(value);
      serializeDt1SrtDivNbr(dt1SrtDivNbr);
   } 

     /**
	 * 	Update Dt1SrtDivNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtDivNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1SrtDivNbr,dt1SrtDivNbr.length);
   	
   }
   
   public void setDt1SrtDivNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1SrtDivNbr,dt1SrtDivNbr.length);
   	
   }
   
     /**
	 * 	Update Dt1SrtDivNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtDivNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1SrtDivNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1SrtDivNbr with another Field
	 *	@param value
	 */
   public void setDt1SrtDivNbr(Field source) {
       replace(source,0,source.length(),beginDt1SrtDivNbr,DT_1_SRT_DIV_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1SrtDivNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1SrtDivNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1SrtDivNbr,DT_1_SRT_DIV_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt1SrtDivNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtDivNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1SrtDivNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt1SrtClsNbr
	 *	@return dt1SrtClsNbr
	 */
   public char[] getDt1SrtClsNbr() throws CFException{
     if (isDt1SrtClsNbrModified()) { 
        dt1SrtClsNbr = refreshDt1SrtClsNbr();
     }
   		return dt1SrtClsNbr;
   }

  
	/**
	*  set variable dt1SrtClsNbr
	*  Corresponding COBOL Variable is DT1-SRT-CLS-NBR
	*  @param value
	**/
   public void setDt1SrtClsNbr(char[] value) {
      dt1SrtClsNbr = checkDt1SrtClsNbrConstraints(value);
      serializeDt1SrtClsNbr(dt1SrtClsNbr);
   } 

     /**
	 * 	Update Dt1SrtClsNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtClsNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1SrtClsNbr,dt1SrtClsNbr.length);
   	
   }
   
   public void setDt1SrtClsNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1SrtClsNbr,dt1SrtClsNbr.length);
   	
   }
   
     /**
	 * 	Update Dt1SrtClsNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtClsNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1SrtClsNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1SrtClsNbr with another Field
	 *	@param value
	 */
   public void setDt1SrtClsNbr(Field source) {
       replace(source,0,source.length(),beginDt1SrtClsNbr,DT_1_SRT_CLS_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1SrtClsNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1SrtClsNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1SrtClsNbr,DT_1_SRT_CLS_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Dt1SrtClsNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtClsNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1SrtClsNbr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDt1SrtItemFieldLength() {
			return DT_1_SRT_ITEM_LENGTH;
		}

}
  
