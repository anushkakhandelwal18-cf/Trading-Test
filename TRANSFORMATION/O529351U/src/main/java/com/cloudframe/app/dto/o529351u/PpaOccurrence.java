package com.cloudframe.app.dto.o529351u;

/**
*  The class PpaOccurrence is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PpaOccurrence extends PpaOccurrenceSerialized { 
   

						private char[] ppaProduct = Field.fillLowValue(3);

								private short ppaMarketType;

								private int ppaMarket;

								private int ppaIpa;

						private char[] ppaGrpTabNo = Field.fillLowValue(4);

						private char[] ppaContractArrange = Field.fillLowValue(1);

								private int ppaFirstEffDate;

								private int ppaLastCanDate;

						private char[] ppaFacContr = Field.fillLowValue(1);
	
	/**
	* Constructor for PpaOccurrence
	**/
    public PpaOccurrence() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PpaOccurrence. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PpaOccurrence(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ppaProduct
	 *	@return ppaProduct
	 */
   public char[] getPpaProduct() throws CFException{
     if (isPpaProductModified()) { 
        ppaProduct = refreshPpaProduct();
     }
   		return ppaProduct;
   }

  
	/**
	*  set variable ppaProduct
	*  Corresponding COBOL Variable is PPA-PRODUCT
	*  @param value
	**/
   public void setPpaProduct(char[] value) {
      ppaProduct = checkPpaProductConstraints(value);
      serializePpaProduct(ppaProduct);
   } 

     /**
	 * 	Update PpaProduct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPpaProduct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPpaProduct,ppaProduct.length);
   	
   }
   
   public void setPpaProduct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPpaProduct,ppaProduct.length);
   	
   }
   
     /**
	 * 	Update PpaProduct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPpaProduct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPpaProduct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PpaProduct with another Field
	 *	@param value
	 */
   public void setPpaProduct(Field source) {
       replace(source,0,source.length(),beginPpaProduct,PPA_PRODUCT_LEN);
   	
   }  
   
     /**
	 * 	Update PpaProduct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPpaProduct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPpaProduct,PPA_PRODUCT_LEN);
   	
   }
   
     /**
	 * 	Update PpaProduct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPpaProduct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPpaProduct+targetIndex,targetLen);
    
   }
	public short getPpaMarketType() throws CFException {
        if (isPpaMarketTypeModified()) { 
           ppaMarketType = refreshPpaMarketType();
        }
   		return ppaMarketType;
	}
	
	/**
	 * 	Update PpaMarketType with the passed value
	 *  Corresponding COBOL Variable is PPA-MARKET-TYPE
	 *	@param number
	 */
	public void setPpaMarketType(short number) {
			ppaMarketType = checkPpaMarketTypeMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePpaMarketType(ppaMarketType);
	}

	public void setPpaMarketType(int number) {
	    number = checkPpaMarketTypeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPpaMarketType((short)number);
	}
	public void setPpaMarketType(long number) {
	    number = checkPpaMarketTypeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPpaMarketType((short)number);
	}
	

	public int getPpaMarket() throws CFException {
        if (isPpaMarketModified()) { 
           ppaMarket = refreshPpaMarket();
        }
   		return ppaMarket;
	}
	
	/**
	 * 	Update PpaMarket with the passed value
	 *  Corresponding COBOL Variable is PPA-MARKET
	 *	@param number
	 */
	public void setPpaMarket(int number) {
			ppaMarket = checkPpaMarketMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePpaMarket(ppaMarket);
	}


	public void setPpaMarket(long number) {
	    number = checkPpaMarketMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPpaMarket((int)number);
	}
	
	public int getPpaIpa() throws CFException {
        if (isPpaIpaModified()) { 
           ppaIpa = refreshPpaIpa();
        }
   		return ppaIpa;
	}
	
	/**
	 * 	Update PpaIpa with the passed value
	 *  Corresponding COBOL Variable is PPA-IPA
	 *	@param number
	 */
	public void setPpaIpa(int number) {
			ppaIpa = checkPpaIpaMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePpaIpa(ppaIpa);
	}


	public void setPpaIpa(long number) {
	    number = checkPpaIpaMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPpaIpa((int)number);
	}
	
	/**
	 *	Returns the value of ppaGrpTabNo
	 *	@return ppaGrpTabNo
	 */
   public char[] getPpaGrpTabNo() throws CFException{
     if (isPpaGrpTabNoModified()) { 
        ppaGrpTabNo = refreshPpaGrpTabNo();
     }
   		return ppaGrpTabNo;
   }

  
	/**
	*  set variable ppaGrpTabNo
	*  Corresponding COBOL Variable is PPA-GRP-TAB-NO
	*  @param value
	**/
   public void setPpaGrpTabNo(char[] value) {
      ppaGrpTabNo = checkPpaGrpTabNoConstraints(value);
      serializePpaGrpTabNo(ppaGrpTabNo);
   } 

     /**
	 * 	Update PpaGrpTabNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPpaGrpTabNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPpaGrpTabNo,ppaGrpTabNo.length);
   	
   }
   
   public void setPpaGrpTabNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPpaGrpTabNo,ppaGrpTabNo.length);
   	
   }
   
     /**
	 * 	Update PpaGrpTabNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPpaGrpTabNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPpaGrpTabNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PpaGrpTabNo with another Field
	 *	@param value
	 */
   public void setPpaGrpTabNo(Field source) {
       replace(source,0,source.length(),beginPpaGrpTabNo,PPA_GRP_TAB_NO_LEN);
   	
   }  
   
     /**
	 * 	Update PpaGrpTabNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPpaGrpTabNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPpaGrpTabNo,PPA_GRP_TAB_NO_LEN);
   	
   }
   
     /**
	 * 	Update PpaGrpTabNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPpaGrpTabNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPpaGrpTabNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ppaContractArrange
	 *	@return ppaContractArrange
	 */
   public char[] getPpaContractArrange() throws CFException{
     if (isPpaContractArrangeModified()) { 
        ppaContractArrange = refreshPpaContractArrange();
     }
   		return ppaContractArrange;
   }

  
	/**
	*  set variable ppaContractArrange
	*  Corresponding COBOL Variable is PPA-CONTRACT-ARRANGE
	*  @param value
	**/
   public void setPpaContractArrange(char[] value) {
      ppaContractArrange = checkPpaContractArrangeConstraints(value);
      serializePpaContractArrange(ppaContractArrange);
   } 

     /**
	 * 	Update PpaContractArrange 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPpaContractArrange(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPpaContractArrange,ppaContractArrange.length);
   	
   }
   
   public void setPpaContractArrange(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPpaContractArrange,ppaContractArrange.length);
   	
   }
   
     /**
	 * 	Update PpaContractArrange 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPpaContractArrange(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPpaContractArrange+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PpaContractArrange with another Field
	 *	@param value
	 */
   public void setPpaContractArrange(Field source) {
       replace(source,0,source.length(),beginPpaContractArrange,PPA_CONTRACT_ARRANGE_LEN);
   	
   }  
   
     /**
	 * 	Update PpaContractArrange 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPpaContractArrange(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPpaContractArrange,PPA_CONTRACT_ARRANGE_LEN);
   	
   }
   
     /**
	 * 	Update PpaContractArrange 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPpaContractArrange(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPpaContractArrange+targetIndex,targetLen);
    
   }
	public int getPpaFirstEffDate() throws CFException {
        if (isPpaFirstEffDateModified()) { 
           ppaFirstEffDate = refreshPpaFirstEffDate();
        }
   		return ppaFirstEffDate;
	}
	
	/**
	 * 	Update PpaFirstEffDate with the passed value
	 *  Corresponding COBOL Variable is PPA-FIRST-EFF-DATE
	 *	@param number
	 */
	public void setPpaFirstEffDate(int number) {
			ppaFirstEffDate = checkPpaFirstEffDateMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePpaFirstEffDate(ppaFirstEffDate);
	}


	public void setPpaFirstEffDate(long number) {
	    number = checkPpaFirstEffDateMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPpaFirstEffDate((int)number);
	}
	
	public int getPpaLastCanDate() throws CFException {
        if (isPpaLastCanDateModified()) { 
           ppaLastCanDate = refreshPpaLastCanDate();
        }
   		return ppaLastCanDate;
	}
	
	/**
	 * 	Update PpaLastCanDate with the passed value
	 *  Corresponding COBOL Variable is PPA-LAST-CAN-DATE
	 *	@param number
	 */
	public void setPpaLastCanDate(int number) {
			ppaLastCanDate = checkPpaLastCanDateMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePpaLastCanDate(ppaLastCanDate);
	}


	public void setPpaLastCanDate(long number) {
	    number = checkPpaLastCanDateMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPpaLastCanDate((int)number);
	}
	
	/**
	 *	Returns the value of ppaFacContr
	 *	@return ppaFacContr
	 */
   public char[] getPpaFacContr() throws CFException{
     if (isPpaFacContrModified()) { 
        ppaFacContr = refreshPpaFacContr();
     }
   		return ppaFacContr;
   }

  
	/**
	*  set variable ppaFacContr
	*  Corresponding COBOL Variable is PPA-FAC-CONTR
	*  @param value
	**/
   public void setPpaFacContr(char[] value) {
      ppaFacContr = checkPpaFacContrConstraints(value);
      serializePpaFacContr(ppaFacContr);
   } 

     /**
	 * 	Update PpaFacContr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPpaFacContr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPpaFacContr,ppaFacContr.length);
   	
   }
   
   public void setPpaFacContr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPpaFacContr,ppaFacContr.length);
   	
   }
   
     /**
	 * 	Update PpaFacContr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPpaFacContr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPpaFacContr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PpaFacContr with another Field
	 *	@param value
	 */
   public void setPpaFacContr(Field source) {
       replace(source,0,source.length(),beginPpaFacContr,PPA_FAC_CONTR_LEN);
   	
   }  
   
     /**
	 * 	Update PpaFacContr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPpaFacContr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPpaFacContr,PPA_FAC_CONTR_LEN);
   	
   }
   
     /**
	 * 	Update PpaFacContr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPpaFacContr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPpaFacContr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getPpaOccurrenceFieldLength() {
			return PPA_OCCURRENCE_LENGTH;
		}

}
  
