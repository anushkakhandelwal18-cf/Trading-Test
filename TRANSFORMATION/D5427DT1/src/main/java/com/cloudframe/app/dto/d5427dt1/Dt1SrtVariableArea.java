package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Dt1SrtVariableArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dt1SrtVariableArea extends Dt1SrtVariableAreaSerialized { 
   
				private Dt1SrtArray dt1SrtArray = new Dt1SrtArray();
	
	/**
	* Constructor for Dt1SrtVariableArea
	**/
    public Dt1SrtVariableArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dt1SrtVariableArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1SrtVariableArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			dt1SrtArray.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of dt1SrtArray
	 *	@return dt1SrtArray
	 */   
	 public Dt1SrtArray getDt1SrtArray() {
   	return dt1SrtArray;
   }
   /**
	* 	Update Dt1SrtArray with the passed value
	*   Corresponding COBOL Variable is DT1-SRT-ARRAY
	*	@param value
	*/
   public void setDt1SrtArray(char[] value) {
      dt1SrtArray.setString(value); 
   }   
    
     /**
	 * 	Update Dt1SrtArray 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtArray(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtArray.begin,dt1SrtArray.length());
   }
   
     /**
	 * 	Update Dt1SrtArray 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtArray(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtArray.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dt1SrtArray with another Field
	 *	@param value
	 */
   public void setDt1SrtArray(Field source) {
   	replace(source,0,source.length(),dt1SrtArray.begin,dt1SrtArray.length());
   }  
   
     /**
	 * 	Update Dt1SrtArray 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtArray(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtArray.begin,dt1SrtArray.length());
   }
   
     /**
	 * 	Update Dt1SrtArray 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtArray(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtArray.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDt1SrtVariableAreaFieldLength() {
			return DT_1_SRT_VARIABLE_AREA_LENGTH;
		}

}
  
