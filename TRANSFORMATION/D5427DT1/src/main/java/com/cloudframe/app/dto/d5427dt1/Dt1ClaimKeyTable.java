package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Dt1ClaimKeyTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dt1ClaimKeyTable extends Dt1ClaimKeyTableSerialized { 
   
				private Dt1ClaimKeyArray dt1ClaimKeyArray = new Dt1ClaimKeyArray();
	
	/**
	* Constructor for Dt1ClaimKeyTable
	**/
    public Dt1ClaimKeyTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			dt1ClaimKeyArray.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of dt1ClaimKeyArray
	 *	@return dt1ClaimKeyArray
	 */   
	 public Dt1ClaimKeyArray getDt1ClaimKeyArray() {
   	return dt1ClaimKeyArray;
   }
   /**
	* 	Update Dt1ClaimKeyArray with the passed value
	*   Corresponding COBOL Variable is DT1-CLAIM-KEY-ARRAY
	*	@param value
	*/
   public void setDt1ClaimKeyArray(char[] value) {
      dt1ClaimKeyArray.setString(value); 
   }   
    
     /**
	 * 	Update Dt1ClaimKeyArray 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDt1ClaimKeyArray(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClaimKeyArray.begin,dt1ClaimKeyArray.length());
   }
   
     /**
	 * 	Update Dt1ClaimKeyArray 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClaimKeyArray(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClaimKeyArray.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dt1ClaimKeyArray with another Field
	 *	@param value
	 */
   public void setDt1ClaimKeyArray(Field source) {
   	replace(source,0,source.length(),dt1ClaimKeyArray.begin,dt1ClaimKeyArray.length());
   }  
   
     /**
	 * 	Update Dt1ClaimKeyArray 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDt1ClaimKeyArray(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClaimKeyArray.begin,dt1ClaimKeyArray.length());
   }
   
     /**
	 * 	Update Dt1ClaimKeyArray 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClaimKeyArray(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClaimKeyArray.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDt1ClaimKeyTableFieldLength() {
			return DT_1_CLAIM_KEY_TABLE_LENGTH;
		}

}
  
