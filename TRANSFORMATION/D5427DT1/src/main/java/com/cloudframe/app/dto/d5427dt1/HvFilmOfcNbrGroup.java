package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HvFilmOfcNbrGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HvFilmOfcNbrGroup extends HvFilmOfcNbrGroupSerialized { 
   

						private char[] hvFilmOfcNbr = new char[4];
	
	/**
	* Constructor for HvFilmOfcNbrGroup
	**/
    public HvFilmOfcNbrGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HvFilmOfcNbrGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvFilmOfcNbrGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvFilmOfcNbr(("0000").toCharArray());
    } 

	/**
	 *	Returns the value of hvFilmOfcNbr
	 *	@return hvFilmOfcNbr
	 */
   public char[] getHvFilmOfcNbr() throws CFException{
     if (isHvFilmOfcNbrModified()) { 
        hvFilmOfcNbr = refreshHvFilmOfcNbr();
     }
   		return hvFilmOfcNbr;
   }

  
	/**
	*  set variable hvFilmOfcNbr
	*  Corresponding COBOL Variable is HV-FILM-OFC-NBR
	*  @param value
	**/
   public void setHvFilmOfcNbr(char[] value) {
      hvFilmOfcNbr = checkHvFilmOfcNbrConstraints(value);
      serializeHvFilmOfcNbr(hvFilmOfcNbr);
   } 

     /**
	 * 	Update HvFilmOfcNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvFilmOfcNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvFilmOfcNbr,hvFilmOfcNbr.length);
   	
   }
   
   public void setHvFilmOfcNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvFilmOfcNbr,hvFilmOfcNbr.length);
   	
   }
   
     /**
	 * 	Update HvFilmOfcNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvFilmOfcNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvFilmOfcNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvFilmOfcNbr with another Field
	 *	@param value
	 */
   public void setHvFilmOfcNbr(Field source) {
       replace(source,0,source.length(),beginHvFilmOfcNbr,HV_FILM_OFC_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update HvFilmOfcNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvFilmOfcNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvFilmOfcNbr,HV_FILM_OFC_NBR_LEN);
   	
   }
   
     /**
	 * 	Update HvFilmOfcNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvFilmOfcNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvFilmOfcNbr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHvFilmOfcNbrGroupFieldLength() {
			return HV_FILM_OFC_NBR_GROUP_LENGTH;
		}

}
  
