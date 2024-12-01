package com.cloudframe.app.dto.o529351u;

/**
*  The class FeSpiAltPlanRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FeSpiAltPlanRecord extends FeSpiAltPlanRecordSerialized { 
   
				private FesaKey fesaKey = new FesaKey();

								private int fesaCanDt;
	
	/**
	* Constructor for FeSpiAltPlanRecord
	**/
    public FeSpiAltPlanRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			fesaKey.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fesaKey
	 *	@return fesaKey
	 */   
	 public FesaKey getFesaKey() {
   	return fesaKey;
   }
   /**
	* 	Update FesaKey with the passed value
	*   Corresponding COBOL Variable is FESA-KEY
	*	@param value
	*/
   public void setFesaKey(char[] value) {
      fesaKey.setString(value); 
   }   
    
     /**
	 * 	Update FesaKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFesaKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fesaKey.begin,fesaKey.length());
   }
   
     /**
	 * 	Update FesaKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesaKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fesaKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FesaKey with another Field
	 *	@param value
	 */
   public void setFesaKey(Field source) {
   	replace(source,0,source.length(),fesaKey.begin,fesaKey.length());
   }  
   
     /**
	 * 	Update FesaKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFesaKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fesaKey.begin,fesaKey.length());
   }
   
     /**
	 * 	Update FesaKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesaKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fesaKey.begin+targetIndex,targetLen);
   }
	public int getFesaCanDt() throws CFException {
        if (isFesaCanDtModified()) { 
           fesaCanDt = refreshFesaCanDt();
        }
   		return fesaCanDt;
	}
	
	/**
	 * 	Update FesaCanDt with the passed value
	 *  Corresponding COBOL Variable is FESA-CAN-DT
	 *	@param number
	 */
	public void setFesaCanDt(int number) {
			fesaCanDt = checkFesaCanDtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeFesaCanDt(fesaCanDt);
	}


	public void setFesaCanDt(long number) {
	    number = checkFesaCanDtMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFesaCanDt((int)number);
	}
	

	
	
	

		public static int getFeSpiAltPlanRecordFieldLength() {
			return FE_SPI_ALT_PLAN_RECORD_LENGTH;
		}

}
  
