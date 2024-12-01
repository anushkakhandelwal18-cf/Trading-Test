package com.cloudframe.app.dto.d5427dt1;

/**
*  The class LastBitXGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LastBitXGroup extends LastBitXGroupSerialized { 
   

						private char[] lastBitX = Field.fillLowValue(1);

								private int lastBit9;
	
	/**
	* Constructor for LastBitXGroup
	**/
    public LastBitXGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lastBitX
	 *	@return lastBitX
	 */
   public char[] getLastBitX() throws CFException{
     if (isLastBitXModified()) { 
        lastBitX = refreshLastBitX();
     }
   		return lastBitX;
   }

  
	/**
	*  set variable lastBitX
	*  Corresponding COBOL Variable is WS-LAST-BIT-X
	*  @param value
	**/
   public void setLastBitX(char[] value) {
      lastBitX = checkLastBitXConstraints(value);
      serializeLastBitX(lastBitX);
   } 

     /**
	 * 	Update LastBitX 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLastBitX(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLastBitX,lastBitX.length);
   	
   }
   
   public void setLastBitX(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLastBitX,lastBitX.length);
   	
   }
   
     /**
	 * 	Update LastBitX 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLastBitX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLastBitX+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LastBitX with another Field
	 *	@param value
	 */
   public void setLastBitX(Field source) {
       replace(source,0,source.length(),beginLastBitX,LAST_BIT_X_LEN);
   	
   }  
   
     /**
	 * 	Update LastBitX 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLastBitX(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLastBitX,LAST_BIT_X_LEN);
   	
   }
   
     /**
	 * 	Update LastBitX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLastBitX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLastBitX+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lastBit9
	 *	@return lastBit9
	 */
	public int getLastBit9() throws CFException {
       if (isLastBit9Modified()) { 
           lastBit9 = refreshLastBit9();
        }
   		return lastBit9;
	}
	

	
	   
	/**
	 * 	Update LastBit9 with the passed value
	 *  Corresponding COBOL Variable is WS-LAST-BIT-9
	 *	@param number
	 */
	public void setLastBit9(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    lastBit9 = checkLastBit9MaxLimit(number); 
		serializeLastBit9(lastBit9);
	}
	

	public void setLastBit9(long number) {
	    number = checkLastBit9MaxLimit(number); // Truncate if value is beyond +/- Max range
		setLastBit9((int)number);
	}
	
	/**
	 * 	Update LastBit9 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLastBit9(char[] value) throws CFException {
		 lastBit9 = serializeLastBit9(value);
	}
	/**
	 * 	Update LastBit9 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLastBit9String(char[] value) throws CFException {
		 setLastBit9(value);
	}

	
	
	

		public static int getLastBitXGroupFieldLength() {
			return LAST_BIT_XGROUP_LENGTH;
		}

}
  
