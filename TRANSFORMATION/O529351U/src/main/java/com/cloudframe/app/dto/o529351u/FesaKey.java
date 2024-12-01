package com.cloudframe.app.dto.o529351u;

/**
*  The class FesaKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FesaKey extends FesaKeySerialized { 
   

						private char[] fesaPolicy = Field.fillLowValue(6);

								private int fesaPlanVar;

								private int fesaEffDate;

								private int fesaSpiNbr;
	
	/**
	* Constructor for FesaKey
	**/
    public FesaKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FesaKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesaKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of fesaPolicy
	 *	@return fesaPolicy
	 */
   public char[] getFesaPolicy() throws CFException{
     if (isFesaPolicyModified()) { 
        fesaPolicy = refreshFesaPolicy();
     }
   		return fesaPolicy;
   }

  
	/**
	*  set variable fesaPolicy
	*  Corresponding COBOL Variable is FESA-POLICY
	*  @param value
	**/
   public void setFesaPolicy(char[] value) {
      fesaPolicy = checkFesaPolicyConstraints(value);
      serializeFesaPolicy(fesaPolicy);
   } 

     /**
	 * 	Update FesaPolicy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesaPolicy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesaPolicy,fesaPolicy.length);
   	
   }
   
   public void setFesaPolicy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesaPolicy,fesaPolicy.length);
   	
   }
   
     /**
	 * 	Update FesaPolicy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesaPolicy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesaPolicy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesaPolicy with another Field
	 *	@param value
	 */
   public void setFesaPolicy(Field source) {
       replace(source,0,source.length(),beginFesaPolicy,FESA_POLICY_LEN);
   	
   }  
   
     /**
	 * 	Update FesaPolicy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesaPolicy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesaPolicy,FESA_POLICY_LEN);
   	
   }
   
     /**
	 * 	Update FesaPolicy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesaPolicy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesaPolicy+targetIndex,targetLen);
    
   }
	public int getFesaPlanVar() throws CFException {
        if (isFesaPlanVarModified()) { 
           fesaPlanVar = refreshFesaPlanVar();
        }
   		return fesaPlanVar;
	}
	
	/**
	 * 	Update FesaPlanVar with the passed value
	 *  Corresponding COBOL Variable is FESA-PLAN-VAR
	 *	@param number
	 */
	public void setFesaPlanVar(int number) {
			fesaPlanVar = checkFesaPlanVarMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeFesaPlanVar(fesaPlanVar);
	}


	public void setFesaPlanVar(long number) {
	    number = checkFesaPlanVarMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFesaPlanVar((int)number);
	}
	
	public int getFesaEffDate() throws CFException {
        if (isFesaEffDateModified()) { 
           fesaEffDate = refreshFesaEffDate();
        }
   		return fesaEffDate;
	}
	
	/**
	 * 	Update FesaEffDate with the passed value
	 *  Corresponding COBOL Variable is FESA-EFF-DATE
	 *	@param number
	 */
	public void setFesaEffDate(int number) {
			fesaEffDate = checkFesaEffDateMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeFesaEffDate(fesaEffDate);
	}


	public void setFesaEffDate(long number) {
	    number = checkFesaEffDateMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFesaEffDate((int)number);
	}
	
	public int getFesaSpiNbr() throws CFException {
        if (isFesaSpiNbrModified()) { 
           fesaSpiNbr = refreshFesaSpiNbr();
        }
   		return fesaSpiNbr;
	}
	
	/**
	 * 	Update FesaSpiNbr with the passed value
	 *  Corresponding COBOL Variable is FESA-SPI-NBR
	 *	@param number
	 */
	public void setFesaSpiNbr(int number) {
			fesaSpiNbr = checkFesaSpiNbrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeFesaSpiNbr(fesaSpiNbr);
	}


	public void setFesaSpiNbr(long number) {
	    number = checkFesaSpiNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFesaSpiNbr((int)number);
	}
	

	
	
	

		public static int getFesaKeyFieldLength() {
			return FESA_KEY_LENGTH;
		}

}
  
