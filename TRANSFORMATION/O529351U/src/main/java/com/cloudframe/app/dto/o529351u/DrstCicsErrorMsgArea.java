package com.cloudframe.app.dto.o529351u;

/**
*  The class DrstCicsErrorMsgArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DrstCicsErrorMsgArea extends DrstCicsErrorMsgAreaSerialized { 
   

						private char[] drstCicsFiller = Field.fillLowValue(33);
	
	/**
	* Constructor for DrstCicsErrorMsgArea
	**/
    public DrstCicsErrorMsgArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DrstCicsErrorMsgArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DrstCicsErrorMsgArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of drstCicsFiller
	 *	@return drstCicsFiller
	 */
   public char[] getDrstCicsFiller() throws CFException{
     if (isDrstCicsFillerModified()) { 
        drstCicsFiller = refreshDrstCicsFiller();
     }
   		return drstCicsFiller;
   }

  
	/**
	*  set variable drstCicsFiller
	*  Corresponding COBOL Variable is DRST-CICS-FILLER
	*  @param value
	**/
   public void setDrstCicsFiller(char[] value) {
      drstCicsFiller = checkDrstCicsFillerConstraints(value);
      serializeDrstCicsFiller(drstCicsFiller);
   } 

     /**
	 * 	Update DrstCicsFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDrstCicsFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDrstCicsFiller,drstCicsFiller.length);
   	
   }
   
   public void setDrstCicsFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDrstCicsFiller,drstCicsFiller.length);
   	
   }
   
     /**
	 * 	Update DrstCicsFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDrstCicsFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrstCicsFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DrstCicsFiller with another Field
	 *	@param value
	 */
   public void setDrstCicsFiller(Field source) {
       replace(source,0,source.length(),beginDrstCicsFiller,DRST_CICS_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update DrstCicsFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDrstCicsFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDrstCicsFiller,DRST_CICS_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update DrstCicsFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDrstCicsFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrstCicsFiller+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDrstCicsErrorMsgAreaFieldLength() {
			return DRST_CICS_ERROR_MSG_AREA_LENGTH;
		}

}
  
