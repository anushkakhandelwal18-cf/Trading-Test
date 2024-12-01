package com.cloudframe.app.dto.d5427dt1;

/**
*  The class IPicstr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IPicstr extends IPicstrSerialized { 
   

								private short iPicstrLength;

						private char[] iPicstrString = Field.fillLowValue(80);
	
	/**
	* Constructor for IPicstr
	**/
    public IPicstr() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of iPicstrLength
	 *	@return iPicstrLength
	 */
	public short getIPicstrLength() throws CFException {
        if (isIPicstrLengthModified()) { 
           iPicstrLength = refreshIPicstrLength();
        }
   		return iPicstrLength;
	}
	
	/**
	 * 	Update IPicstrLength with the passed value
	 *  Corresponding COBOL Variable is I-PICSTR-LENGTH
	 *	@param number
	 */
	public void setIPicstrLength(short number) {
	     // Truncate if the number is beyond +/- Max range
	    iPicstrLength = checkIPicstrLengthMaxLimit(number); 
		serializeIPicstrLength(iPicstrLength);
	}

	public void setIPicstrLength(int number) {
	    number = checkIPicstrLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIPicstrLength((short)number);
	}
	public void setIPicstrLength(long number) {
	    number = checkIPicstrLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIPicstrLength((short)number);
	}
	

	/**
	 *	Returns the value of iPicstrString
	 *	@return iPicstrString
	 */
   public char[] getIPicstrString() throws CFException{
     if (isIPicstrStringModified()) { 
        iPicstrString = refreshIPicstrString();
     }
   		return iPicstrString;
   }

  
	/**
	*  set variable iPicstrString
	*  Corresponding COBOL Variable is I-PICSTR-STRING
	*  @param value
	**/
   public void setIPicstrString(char[] value) {
      iPicstrString = checkIPicstrStringConstraints(value);
      serializeIPicstrString(iPicstrString);
   } 

     /**
	 * 	Update IPicstrString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIPicstrString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIPicstrString,iPicstrString.length);
   	
   }
   
   public void setIPicstrString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIPicstrString,iPicstrString.length);
   	
   }
   
     /**
	 * 	Update IPicstrString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIPicstrString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIPicstrString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IPicstrString with another Field
	 *	@param value
	 */
   public void setIPicstrString(Field source) {
       replace(source,0,source.length(),beginIPicstrString,I_PICSTR_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update IPicstrString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIPicstrString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIPicstrString,I_PICSTR_STRING_LEN);
   	
   }
   
     /**
	 * 	Update IPicstrString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIPicstrString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIPicstrString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIPicstrFieldLength() {
			return I_PICSTR_LENGTH;
		}

}
  
