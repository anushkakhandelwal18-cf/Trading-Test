package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Dt1SrtContainer is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dt1SrtContainer extends Dt1SrtContainerSerialized { 
   
				private Dt1SrtFixedArea dt1SrtFixedArea = new Dt1SrtFixedArea();
				private Dt1SrtVariableArea dt1SrtVariableArea = new Dt1SrtVariableArea();
	
	/**
	* Constructor for Dt1SrtContainer
	**/
    public Dt1SrtContainer() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			dt1SrtFixedArea.setParent(this,getStartOffset() + 0);
	       			dt1SrtVariableArea.setParent(this,getStartOffset() + 4);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of dt1SrtFixedArea
	 *	@return dt1SrtFixedArea
	 */   
	 public Dt1SrtFixedArea getDt1SrtFixedArea() {
   	return dt1SrtFixedArea;
   }
   /**
	* 	Update Dt1SrtFixedArea with the passed value
	*   Corresponding COBOL Variable is DT1-SRT-FIXED-AREA
	*	@param value
	*/
   public void setDt1SrtFixedArea(char[] value) {
      dt1SrtFixedArea.setString(value); 
   }   
    
     /**
	 * 	Update Dt1SrtFixedArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtFixedArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtFixedArea.begin,dt1SrtFixedArea.length());
   }
   
     /**
	 * 	Update Dt1SrtFixedArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtFixedArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtFixedArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dt1SrtFixedArea with another Field
	 *	@param value
	 */
   public void setDt1SrtFixedArea(Field source) {
   	replace(source,0,source.length(),dt1SrtFixedArea.begin,dt1SrtFixedArea.length());
   }  
   
     /**
	 * 	Update Dt1SrtFixedArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtFixedArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtFixedArea.begin,dt1SrtFixedArea.length());
   }
   
     /**
	 * 	Update Dt1SrtFixedArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtFixedArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtFixedArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dt1SrtVariableArea
	 *	@return dt1SrtVariableArea
	 */   
	 public Dt1SrtVariableArea getDt1SrtVariableArea() {
   	return dt1SrtVariableArea;
   }
   /**
	* 	Update Dt1SrtVariableArea with the passed value
	*   Corresponding COBOL Variable is DT1-SRT-VARIABLE-AREA
	*	@param value
	*/
   public void setDt1SrtVariableArea(char[] value) {
      dt1SrtVariableArea.setString(value); 
   }   
    
     /**
	 * 	Update Dt1SrtVariableArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtVariableArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtVariableArea.begin,dt1SrtVariableArea.length());
   }
   
     /**
	 * 	Update Dt1SrtVariableArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtVariableArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtVariableArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dt1SrtVariableArea with another Field
	 *	@param value
	 */
   public void setDt1SrtVariableArea(Field source) {
   	replace(source,0,source.length(),dt1SrtVariableArea.begin,dt1SrtVariableArea.length());
   }  
   
     /**
	 * 	Update Dt1SrtVariableArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtVariableArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtVariableArea.begin,dt1SrtVariableArea.length());
   }
   
     /**
	 * 	Update Dt1SrtVariableArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtVariableArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dt1SrtVariableArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDt1SrtContainerFieldLength() {
			return DT_1_SRT_CONTAINER_LENGTH;
		}

}
  
