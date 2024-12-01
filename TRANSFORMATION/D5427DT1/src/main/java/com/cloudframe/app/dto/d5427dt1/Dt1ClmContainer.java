package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Dt1ClmContainer is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dt1ClmContainer extends Dt1ClmContainerSerialized { 
   
				private Dt1ClmFixedArea dt1ClmFixedArea = new Dt1ClmFixedArea();
				private Dt1ClmVariableArea dt1ClmVariableArea = new Dt1ClmVariableArea();
	
	/**
	* Constructor for Dt1ClmContainer
	**/
    public Dt1ClmContainer() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			dt1ClmFixedArea.setParent(this,getStartOffset() + 0);
	       			dt1ClmVariableArea.setParent(this,getStartOffset() + 16);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of dt1ClmFixedArea
	 *	@return dt1ClmFixedArea
	 */   
	 public Dt1ClmFixedArea getDt1ClmFixedArea() {
   	return dt1ClmFixedArea;
   }
   /**
	* 	Update Dt1ClmFixedArea with the passed value
	*   Corresponding COBOL Variable is DT1-CLM-FIXED-AREA
	*	@param value
	*/
   public void setDt1ClmFixedArea(char[] value) {
      dt1ClmFixedArea.setString(value); 
   }   
    
     /**
	 * 	Update Dt1ClmFixedArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmFixedArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClmFixedArea.begin,dt1ClmFixedArea.length());
   }
   
     /**
	 * 	Update Dt1ClmFixedArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmFixedArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClmFixedArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dt1ClmFixedArea with another Field
	 *	@param value
	 */
   public void setDt1ClmFixedArea(Field source) {
   	replace(source,0,source.length(),dt1ClmFixedArea.begin,dt1ClmFixedArea.length());
   }  
   
     /**
	 * 	Update Dt1ClmFixedArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmFixedArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClmFixedArea.begin,dt1ClmFixedArea.length());
   }
   
     /**
	 * 	Update Dt1ClmFixedArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmFixedArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClmFixedArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dt1ClmVariableArea
	 *	@return dt1ClmVariableArea
	 */   
	 public Dt1ClmVariableArea getDt1ClmVariableArea() {
   	return dt1ClmVariableArea;
   }
   /**
	* 	Update Dt1ClmVariableArea with the passed value
	*   Corresponding COBOL Variable is DT1-CLM-VARIABLE-AREA
	*	@param value
	*/
   public void setDt1ClmVariableArea(char[] value) {
      dt1ClmVariableArea.setString(value); 
   }   
    
     /**
	 * 	Update Dt1ClmVariableArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmVariableArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClmVariableArea.begin,dt1ClmVariableArea.length());
   }
   
     /**
	 * 	Update Dt1ClmVariableArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmVariableArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClmVariableArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dt1ClmVariableArea with another Field
	 *	@param value
	 */
   public void setDt1ClmVariableArea(Field source) {
   	replace(source,0,source.length(),dt1ClmVariableArea.begin,dt1ClmVariableArea.length());
   }  
   
     /**
	 * 	Update Dt1ClmVariableArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDt1ClmVariableArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClmVariableArea.begin,dt1ClmVariableArea.length());
   }
   
     /**
	 * 	Update Dt1ClmVariableArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClmVariableArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1ClmVariableArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDt1ClmContainerFieldLength() {
			return DT_1_CLM_CONTAINER_LENGTH;
		}

}
  
