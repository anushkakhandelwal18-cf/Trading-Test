package com.cloudframe.app.dto.d5427dt1;

/**
*  The class OPicstr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OPicstr extends OPicstrSerialized { 
   

								private short oPicstrLength;

						private char[] oPicstrString = Field.fillLowValue(80);
	
	/**
	* Constructor for OPicstr
	**/
    public OPicstr() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of oPicstrLength
	 *	@return oPicstrLength
	 */
	public short getOPicstrLength() throws CFException {
        if (isOPicstrLengthModified()) { 
           oPicstrLength = refreshOPicstrLength();
        }
   		return oPicstrLength;
	}
	
	/**
	 * 	Update OPicstrLength with the passed value
	 *  Corresponding COBOL Variable is O-PICSTR-LENGTH
	 *	@param number
	 */
	public void setOPicstrLength(short number) {
	     // Truncate if the number is beyond +/- Max range
	    oPicstrLength = checkOPicstrLengthMaxLimit(number); 
		serializeOPicstrLength(oPicstrLength);
	}

	public void setOPicstrLength(int number) {
	    number = checkOPicstrLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setOPicstrLength((short)number);
	}
	public void setOPicstrLength(long number) {
	    number = checkOPicstrLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setOPicstrLength((short)number);
	}
	

	/**
	 *	Returns the value of oPicstrString
	 *	@return oPicstrString
	 */
   public char[] getOPicstrString() throws CFException{
     if (isOPicstrStringModified()) { 
        oPicstrString = refreshOPicstrString();
     }
   		return oPicstrString;
   }

  
	/**
	*  set variable oPicstrString
	*  Corresponding COBOL Variable is O-PICSTR-STRING
	*  @param value
	**/
   public void setOPicstrString(char[] value) {
      oPicstrString = checkOPicstrStringConstraints(value);
      serializeOPicstrString(oPicstrString);
   } 

     /**
	 * 	Update OPicstrString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOPicstrString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOPicstrString,oPicstrString.length);
   	
   }
   
   public void setOPicstrString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOPicstrString,oPicstrString.length);
   	
   }
   
     /**
	 * 	Update OPicstrString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOPicstrString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOPicstrString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OPicstrString with another Field
	 *	@param value
	 */
   public void setOPicstrString(Field source) {
       replace(source,0,source.length(),beginOPicstrString,O_PICSTR_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update OPicstrString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOPicstrString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOPicstrString,O_PICSTR_STRING_LEN);
   	
   }
   
     /**
	 * 	Update OPicstrString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOPicstrString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOPicstrString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getOPicstrFieldLength() {
			return O_PICSTR_LENGTH;
		}

}
  
