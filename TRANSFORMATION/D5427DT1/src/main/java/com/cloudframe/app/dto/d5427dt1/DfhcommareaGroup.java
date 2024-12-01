package com.cloudframe.app.dto.d5427dt1;

/**
*  The class DfhcommareaGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DfhcommareaGroup extends DfhcommareaGroupSerialized { 
   

						private char[] dfhcommarea = Field.fillLowValue(1);
	
	/**
	* Constructor for DfhcommareaGroup
	**/
    public DfhcommareaGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of dfhcommarea
	 *	@return dfhcommarea
	 */
   public char[] getDfhcommarea() throws CFException{
     if (isDfhcommareaModified()) { 
        dfhcommarea = refreshDfhcommarea();
     }
   		return dfhcommarea;
   }

  
	/**
	*  set variable dfhcommarea
	*  Corresponding COBOL Variable is DFHCOMMAREA
	*  @param value
	**/
   public void setDfhcommarea(char[] value) {
      dfhcommarea = checkDfhcommareaConstraints(value);
      serializeDfhcommarea(dfhcommarea);
   } 

     /**
	 * 	Update Dfhcommarea 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDfhcommarea(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDfhcommarea,dfhcommarea.length);
   	
   }
   
   public void setDfhcommarea(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDfhcommarea,dfhcommarea.length);
   	
   }
   
     /**
	 * 	Update Dfhcommarea 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDfhcommarea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDfhcommarea+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dfhcommarea with another Field
	 *	@param value
	 */
   public void setDfhcommarea(Field source) {
       replace(source,0,source.length(),beginDfhcommarea,DFHCOMMAREA_LEN);
   	
   }  
   
     /**
	 * 	Update Dfhcommarea 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDfhcommarea(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDfhcommarea,DFHCOMMAREA_LEN);
   	
   }
   
     /**
	 * 	Update Dfhcommarea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDfhcommarea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDfhcommarea+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDfhcommareaGroupFieldLength() {
			return DFHCOMMAREA_GROUP_LENGTH;
		}

}
  
