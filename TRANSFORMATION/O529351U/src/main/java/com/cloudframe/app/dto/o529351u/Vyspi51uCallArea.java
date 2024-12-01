package com.cloudframe.app.dto.o529351u;

/**
*  The class Vyspi51uCallArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Vyspi51uCallArea extends Vyspi51uCallAreaSerialized { 
   

				private D51uRequestFields d51uRequestFields = new D51uRequestFields();
				private D51uReturnArea d51uReturnArea = new D51uReturnArea();
	
	/**
	* Constructor for Vyspi51uCallArea
	**/
    public Vyspi51uCallArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			d51uRequestFields.setParent(this,getStartOffset() + 24);
	       			d51uReturnArea.setParent(this,getStartOffset() + 262);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("VYSPI51U - STARTS HERE  ").toCharArray()
             , getStartOffset() + 0
             ,24
             );
    }


 

	/**
	 *	Returns the value of d51uRequestFields
	 *	@return d51uRequestFields
	 */   
	 public D51uRequestFields getD51uRequestFields() {
   	return d51uRequestFields;
   }
   /**
	* 	Update D51uRequestFields with the passed value
	*   Corresponding COBOL Variable is D51U-REQUEST-FIELDS
	*	@param value
	*/
   public void setD51uRequestFields(char[] value) {
      d51uRequestFields.setString(value); 
   }   
    
     /**
	 * 	Update D51uRequestFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uRequestFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRequestFields.begin,d51uRequestFields.length());
   }
   
     /**
	 * 	Update D51uRequestFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRequestFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRequestFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uRequestFields with another Field
	 *	@param value
	 */
   public void setD51uRequestFields(Field source) {
   	replace(source,0,source.length(),d51uRequestFields.begin,d51uRequestFields.length());
   }  
   
     /**
	 * 	Update D51uRequestFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uRequestFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uRequestFields.begin,d51uRequestFields.length());
   }
   
     /**
	 * 	Update D51uRequestFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRequestFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uRequestFields.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of d51uReturnArea
	 *	@return d51uReturnArea
	 */   
	 public D51uReturnArea getD51uReturnArea() {
   	return d51uReturnArea;
   }
   /**
	* 	Update D51uReturnArea with the passed value
	*   Corresponding COBOL Variable is D51U-RETURN-AREA
	*	@param value
	*/
   public void setD51uReturnArea(char[] value) {
      d51uReturnArea.setString(value); 
   }   
    
     /**
	 * 	Update D51uReturnArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uReturnArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uReturnArea.begin,d51uReturnArea.length());
   }
   
     /**
	 * 	Update D51uReturnArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uReturnArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uReturnArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uReturnArea with another Field
	 *	@param value
	 */
   public void setD51uReturnArea(Field source) {
   	replace(source,0,source.length(),d51uReturnArea.begin,d51uReturnArea.length());
   }  
   
     /**
	 * 	Update D51uReturnArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uReturnArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uReturnArea.begin,d51uReturnArea.length());
   }
   
     /**
	 * 	Update D51uReturnArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uReturnArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uReturnArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getVyspi51uCallAreaFieldLength() {
			return VYSPI_51U_CALL_AREA_LENGTH;
		}

}
  
