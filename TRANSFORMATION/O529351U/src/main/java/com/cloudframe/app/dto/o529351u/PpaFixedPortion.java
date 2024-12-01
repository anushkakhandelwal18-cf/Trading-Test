package com.cloudframe.app.dto.o529351u;

/**
*  The class PpaFixedPortion is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PpaFixedPortion extends PpaFixedPortionSerialized { 
   
				private PpaKey ppaKey = new PpaKey();

								private int ppaLastUpdDate;

								private int ppaLastUpdTime;

								private short ppaPpoIdCount;
	
	/**
	* Constructor for PpaFixedPortion
	**/
    public PpaFixedPortion() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PpaFixedPortion. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PpaFixedPortion(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ppaKey.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ppaKey
	 *	@return ppaKey
	 */   
	 public PpaKey getPpaKey() {
   	return ppaKey;
   }
   /**
	* 	Update PpaKey with the passed value
	*   Corresponding COBOL Variable is PPA-KEY
	*	@param value
	*/
   public void setPpaKey(char[] value) {
      ppaKey.setString(value); 
   }   
    
     /**
	 * 	Update PpaKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPpaKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ppaKey.begin,ppaKey.length());
   }
   
     /**
	 * 	Update PpaKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPpaKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ppaKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update PpaKey with another Field
	 *	@param value
	 */
   public void setPpaKey(Field source) {
   	replace(source,0,source.length(),ppaKey.begin,ppaKey.length());
   }  
   
     /**
	 * 	Update PpaKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPpaKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ppaKey.begin,ppaKey.length());
   }
   
     /**
	 * 	Update PpaKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPpaKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ppaKey.begin+targetIndex,targetLen);
   }
	public int getPpaLastUpdDate() throws CFException {
        if (isPpaLastUpdDateModified()) { 
           ppaLastUpdDate = refreshPpaLastUpdDate();
        }
   		return ppaLastUpdDate;
	}
	
	/**
	 * 	Update PpaLastUpdDate with the passed value
	 *  Corresponding COBOL Variable is PPA-LAST-UPD-DATE
	 *	@param number
	 */
	public void setPpaLastUpdDate(int number) {
			ppaLastUpdDate = checkPpaLastUpdDateMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePpaLastUpdDate(ppaLastUpdDate);
	}


	public void setPpaLastUpdDate(long number) {
	    number = checkPpaLastUpdDateMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPpaLastUpdDate((int)number);
	}
	
	public int getPpaLastUpdTime() throws CFException {
        if (isPpaLastUpdTimeModified()) { 
           ppaLastUpdTime = refreshPpaLastUpdTime();
        }
   		return ppaLastUpdTime;
	}
	
	/**
	 * 	Update PpaLastUpdTime with the passed value
	 *  Corresponding COBOL Variable is PPA-LAST-UPD-TIME
	 *	@param number
	 */
	public void setPpaLastUpdTime(int number) {
			ppaLastUpdTime = checkPpaLastUpdTimeMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePpaLastUpdTime(ppaLastUpdTime);
	}


	public void setPpaLastUpdTime(long number) {
	    number = checkPpaLastUpdTimeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPpaLastUpdTime((int)number);
	}
	
	public short getPpaPpoIdCount() throws CFException {
        if (isPpaPpoIdCountModified()) { 
           ppaPpoIdCount = refreshPpaPpoIdCount();
        }
   		return ppaPpoIdCount;
	}
	
	/**
	 * 	Update PpaPpoIdCount with the passed value
	 *  Corresponding COBOL Variable is PPA-PPO-ID-COUNT
	 *	@param number
	 */
	public void setPpaPpoIdCount(short number) {
			ppaPpoIdCount = checkPpaPpoIdCountMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePpaPpoIdCount(ppaPpoIdCount);
	}

	public void setPpaPpoIdCount(int number) {
	    number = checkPpaPpoIdCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPpaPpoIdCount((short)number);
	}
	public void setPpaPpoIdCount(long number) {
	    number = checkPpaPpoIdCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPpaPpoIdCount((short)number);
	}
	


	
	
	

		public static int getPpaFixedPortionFieldLength() {
			return PPA_FIXED_PORTION_LENGTH;
		}

}
  
