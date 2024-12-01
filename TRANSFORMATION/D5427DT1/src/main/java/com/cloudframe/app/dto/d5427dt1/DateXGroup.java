package com.cloudframe.app.dto.d5427dt1;

/**
*  The class DateXGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DateXGroup extends DateXGroupSerialized { 
   

						private char[] dateX = Field.fillLowValue(8);

								private long date9;
	
	/**
	* Constructor for DateXGroup
	**/
    public DateXGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of dateX
	 *	@return dateX
	 */
   public char[] getDateX() throws CFException{
     if (isDateXModified()) { 
        dateX = refreshDateX();
     }
   		return dateX;
   }

  
	/**
	*  set variable dateX
	*  Corresponding COBOL Variable is WS-DATE-X
	*  @param value
	**/
   public void setDateX(char[] value) {
      dateX = checkDateXConstraints(value);
      serializeDateX(dateX);
   } 

     /**
	 * 	Update DateX 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDateX(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDateX,dateX.length);
   	
   }
   
   public void setDateX(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDateX,dateX.length);
   	
   }
   
     /**
	 * 	Update DateX 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDateX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateX+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DateX with another Field
	 *	@param value
	 */
   public void setDateX(Field source) {
       replace(source,0,source.length(),beginDateX,DATE_X_LEN);
   	
   }  
   
     /**
	 * 	Update DateX 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDateX(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDateX,DATE_X_LEN);
   	
   }
   
     /**
	 * 	Update DateX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDateX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateX+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of date9
	 *	@return date9
	 */
	public long getDate9() throws CFException {
       if (isDate9Modified()) { 
           date9 = refreshDate9();
        }
   		return date9;
	}
	

	
	   
	/**
	 * 	Update Date9 with the passed value
	 *  Corresponding COBOL Variable is WS-DATE-9
	 *	@param number
	 */
	public void setDate9(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    date9 = checkDate9MaxLimit(number); 
		serializeDate9(date9);
	}
	

	/**
	 * 	Update Date9 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDate9(char[] value) throws CFException {
		 date9 = serializeDate9(value);
	}
	/**
	 * 	Update Date9 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDate9String(char[] value) throws CFException {
		 setDate9(value);
	}

	
	
	

		public static int getDateXGroupFieldLength() {
			return DATE_XGROUP_LENGTH;
		}

}
  
