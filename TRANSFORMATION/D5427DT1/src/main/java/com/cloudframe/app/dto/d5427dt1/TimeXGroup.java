package com.cloudframe.app.dto.d5427dt1;

/**
*  The class TimeXGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TimeXGroup extends TimeXGroupSerialized { 
   

						private char[] timeX = Field.fillLowValue(6);

								private long time9;
	
	/**
	* Constructor for TimeXGroup
	**/
    public TimeXGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of timeX
	 *	@return timeX
	 */
   public char[] getTimeX() throws CFException{
     if (isTimeXModified()) { 
        timeX = refreshTimeX();
     }
   		return timeX;
   }

  
	/**
	*  set variable timeX
	*  Corresponding COBOL Variable is WS-TIME-X
	*  @param value
	**/
   public void setTimeX(char[] value) {
      timeX = checkTimeXConstraints(value);
      serializeTimeX(timeX);
   } 

     /**
	 * 	Update TimeX 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTimeX(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTimeX,timeX.length);
   	
   }
   
   public void setTimeX(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTimeX,timeX.length);
   	
   }
   
     /**
	 * 	Update TimeX 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTimeX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimeX+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TimeX with another Field
	 *	@param value
	 */
   public void setTimeX(Field source) {
       replace(source,0,source.length(),beginTimeX,TIME_X_LEN);
   	
   }  
   
     /**
	 * 	Update TimeX 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTimeX(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTimeX,TIME_X_LEN);
   	
   }
   
     /**
	 * 	Update TimeX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTimeX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimeX+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of time9
	 *	@return time9
	 */
	public long getTime9() throws CFException {
       if (isTime9Modified()) { 
           time9 = refreshTime9();
        }
   		return time9;
	}
	

	
	   
	/**
	 * 	Update Time9 with the passed value
	 *  Corresponding COBOL Variable is WS-TIME-9
	 *	@param number
	 */
	public void setTime9(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    time9 = checkTime9MaxLimit(number); 
		serializeTime9(time9);
	}
	

	/**
	 * 	Update Time9 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTime9(char[] value) throws CFException {
		 time9 = serializeTime9(value);
	}
	/**
	 * 	Update Time9 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTime9String(char[] value) throws CFException {
		 setTime9(value);
	}

	
	
	

		public static int getTimeXGroupFieldLength() {
			return TIME_XGROUP_LENGTH;
		}

}
  
