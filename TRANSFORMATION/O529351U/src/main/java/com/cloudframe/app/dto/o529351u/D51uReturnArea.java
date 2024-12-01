package com.cloudframe.app.dto.o529351u;

/**
*  The class D51uReturnArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uReturnArea extends D51uReturnAreaSerialized { 
   
				private D51uNonArrayData d51uNonArrayData = new D51uNonArrayData();
				private D51uArrayData d51uArrayData = new D51uArrayData();
	
	/**
	* Constructor for D51uReturnArea
	**/
    public D51uReturnArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uReturnArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uReturnArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			d51uNonArrayData.setParent(this,getStartOffset() + 0);
	       			d51uArrayData.setParent(this,getStartOffset() + 89);
    } 

	/**
	 *	Returns the value of d51uNonArrayData
	 *	@return d51uNonArrayData
	 */   
	 public D51uNonArrayData getD51uNonArrayData() {
   	return d51uNonArrayData;
   }
   /**
	* 	Update D51uNonArrayData with the passed value
	*   Corresponding COBOL Variable is D51U-NON-ARRAY-DATA
	*	@param value
	*/
   public void setD51uNonArrayData(char[] value) {
      d51uNonArrayData.setString(value); 
   }   
    
     /**
	 * 	Update D51uNonArrayData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uNonArrayData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uNonArrayData.begin,d51uNonArrayData.length());
   }
   
     /**
	 * 	Update D51uNonArrayData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uNonArrayData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uNonArrayData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uNonArrayData with another Field
	 *	@param value
	 */
   public void setD51uNonArrayData(Field source) {
   	replace(source,0,source.length(),d51uNonArrayData.begin,d51uNonArrayData.length());
   }  
   
     /**
	 * 	Update D51uNonArrayData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uNonArrayData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uNonArrayData.begin,d51uNonArrayData.length());
   }
   
     /**
	 * 	Update D51uNonArrayData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uNonArrayData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uNonArrayData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of d51uArrayData
	 *	@return d51uArrayData
	 */   
	 public D51uArrayData getD51uArrayData() {
   	return d51uArrayData;
   }
   /**
	* 	Update D51uArrayData with the passed value
	*   Corresponding COBOL Variable is D51U-ARRAY-DATA
	*	@param value
	*/
   public void setD51uArrayData(char[] value) {
      d51uArrayData.setString(value); 
   }   
    
     /**
	 * 	Update D51uArrayData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uArrayData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uArrayData.begin,d51uArrayData.length());
   }
   
     /**
	 * 	Update D51uArrayData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uArrayData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uArrayData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uArrayData with another Field
	 *	@param value
	 */
   public void setD51uArrayData(Field source) {
   	replace(source,0,source.length(),d51uArrayData.begin,d51uArrayData.length());
   }  
   
     /**
	 * 	Update D51uArrayData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uArrayData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uArrayData.begin,d51uArrayData.length());
   }
   
     /**
	 * 	Update D51uArrayData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uArrayData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uArrayData.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getD51uReturnAreaFieldLength() {
			return D_51U_RETURN_AREA_LENGTH;
		}

}
  
