package com.cloudframe.app.dto.o529351u;

/**
*  The class PpaPpoaltRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class PpaPpoaltRecord extends PpaPpoaltRecordSerialized { 
   
				private PpaFixedPortion ppaFixedPortion = new PpaFixedPortion();
			private List<PpaPpoId> ppaPpoId = new ArrayList<>();
    	
	
	/**
	* Constructor for PpaPpoaltRecord
	**/
    public PpaPpoaltRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PpaPpoaltRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PpaPpoaltRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ppaFixedPortion.setParent(this,getStartOffset() + 0);
				for (int arrayIndex = 0; arrayIndex < PPA_PPO_ID_SIZE;arrayIndex++) {
						ppaPpoId.add(new PpaPpoId(this, beginPpaPpoId + 
						arrayIndex * PpaPpoId.getPpaPpoIdFieldLength()));
				}
    } 

	/**
	 *	Returns the value of ppaFixedPortion
	 *	@return ppaFixedPortion
	 */   
	 public PpaFixedPortion getPpaFixedPortion() {
   	return ppaFixedPortion;
   }
   /**
	* 	Update PpaFixedPortion with the passed value
	*   Corresponding COBOL Variable is PPA-FIXED-PORTION
	*	@param value
	*/
   public void setPpaFixedPortion(char[] value) {
      ppaFixedPortion.setString(value); 
   }   
    
     /**
	 * 	Update PpaFixedPortion 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPpaFixedPortion(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ppaFixedPortion.begin,ppaFixedPortion.length());
   }
   
     /**
	 * 	Update PpaFixedPortion 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPpaFixedPortion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ppaFixedPortion.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update PpaFixedPortion with another Field
	 *	@param value
	 */
   public void setPpaFixedPortion(Field source) {
   	replace(source,0,source.length(),ppaFixedPortion.begin,ppaFixedPortion.length());
   }  
   
     /**
	 * 	Update PpaFixedPortion 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPpaFixedPortion(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ppaFixedPortion.begin,ppaFixedPortion.length());
   }
   
     /**
	 * 	Update PpaFixedPortion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPpaFixedPortion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ppaFixedPortion.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the  value of ppaPpoId
	 *  Corresponding COBOL Variable is PPA-PPO-ID
	 *	@return ppaPpoId
	 */
   public List<PpaPpoId> getPpaPpoId() {
       return ppaPpoId;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ppaPpoId
	 */
	public PpaPpoId getPpaPpoId(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getPpaPpoId(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= PPA_PPO_ID_SIZE) {
             	index = PPA_PPO_ID_SIZE -1; // can't exceed max array size
             	logger.trace("ppaPpoId - Array index exceeded max Size {}, resetting it to max allowed",PPA_PPO_ID_SIZE); 
	    }
		if (index >= ppaPpoId.size()) {
       		for (int fillIndex =  ppaPpoId.size() -1; fillIndex < index;fillIndex++) {
		       ppaPpoId.add(null);
		    }
			ppaPpoId.set(index,
			   	   	new PpaPpoId(this,beginPpaPpoId + index * PpaPpoId.getPpaPpoIdFieldLength()) 
				                        ); 	
		} 
   	   PpaPpoId value = ppaPpoId.get(index);
   	   if (value == null) {
   	      ppaPpoId.set(index,
			   	   	new PpaPpoId(this,beginPpaPpoId + index * PpaPpoId.getPpaPpoIdFieldLength()) 
				                        ); 
		  value = ppaPpoId.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update PpaPpoId at index with the passed value
	 *  Corresponding COBOL Variable is PPA-PPO-ID
	 *  @param index
	 *	@param value
	 */
  public void setPpaPpoId(int index,char[] value) {
   	getPpaPpoId(index).setString(value);
   }
   
	

	
	
	

		public static int getPpaPpoaltRecordFieldLength() {
			return PPA_PPOALT_RECORD_LENGTH;
		}

}
  
