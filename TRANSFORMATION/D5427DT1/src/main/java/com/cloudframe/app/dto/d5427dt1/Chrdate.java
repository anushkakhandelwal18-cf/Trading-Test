package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Chrdate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Chrdate extends ChrdateSerialized { 
   

								private short chrdateLength;

						private char[] chrdateString = Field.fillLowValue(10);
	
	/**
	* Constructor for Chrdate
	**/
    public Chrdate() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setChrdateLength((short)10);
    }


 

	/**
	 *	Returns the value of chrdateLength
	 *	@return chrdateLength
	 */
	public short getChrdateLength() throws CFException {
        if (isChrdateLengthModified()) { 
           chrdateLength = refreshChrdateLength();
        }
   		return chrdateLength;
	}
	
	/**
	 * 	Update ChrdateLength with the passed value
	 *  Corresponding COBOL Variable is CHRDATE-LENGTH
	 *	@param number
	 */
	public void setChrdateLength(short number) {
	     // Truncate if the number is beyond +/- Max range
	    chrdateLength = checkChrdateLengthMaxLimit(number); 
		serializeChrdateLength(chrdateLength);
	}

	public void setChrdateLength(int number) {
	    number = checkChrdateLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setChrdateLength((short)number);
	}
	public void setChrdateLength(long number) {
	    number = checkChrdateLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setChrdateLength((short)number);
	}
	

	/**
	 *	Returns the value of chrdateString
	 *	@return chrdateString
	 */
   public char[] getChrdateString() throws CFException{
     if (isChrdateStringModified()) { 
        chrdateString = refreshChrdateString();
     }
   		return chrdateString;
   }

  
	/**
	*  set variable chrdateString
	*  Corresponding COBOL Variable is CHRDATE-STRING
	*  @param value
	**/
   public void setChrdateString(char[] value) {
      chrdateString = checkChrdateStringConstraints(value);
      serializeChrdateString(chrdateString);
   } 

     /**
	 * 	Update ChrdateString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setChrdateString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginChrdateString,chrdateString.length);
   	
   }
   
   public void setChrdateString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginChrdateString,chrdateString.length);
   	
   }
   
     /**
	 * 	Update ChrdateString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChrdateString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChrdateString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ChrdateString with another Field
	 *	@param value
	 */
   public void setChrdateString(Field source) {
       replace(source,0,source.length(),beginChrdateString,CHRDATE_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update ChrdateString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setChrdateString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginChrdateString,CHRDATE_STRING_LEN);
   	
   }
   
     /**
	 * 	Update ChrdateString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChrdateString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChrdateString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getChrdateFieldLength() {
			return CHRDATE_LENGTH;
		}

}
  
