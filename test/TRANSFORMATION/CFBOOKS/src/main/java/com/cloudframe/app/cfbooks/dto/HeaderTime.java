package com.cloudframe.app.cfbooks.dto;

/**
*  The class HeaderTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 03:00. using version 5.0.0.161
**/


import com.cloudframe.app.cfbooks.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HeaderTime extends HeaderTimeSerialized { 
   


								private int pageNo;


						private char[] timeR = new char[12];

	
	/**
	* Constructor for HeaderTime
	**/
    public HeaderTime() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("PAGE NO. ").toCharArray()
             , getStartOffset() + 0
             ,9
             );
								setPageNo(0);
       replaceValue( // serialize and save the value
             pad(106," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 13
             ,106
             );
								setTimeR(("-           ").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 131
             ,1
             );
    }


 

	/**
	 *	Returns the value of pageNo
	 *	@return pageNo
	 */
	public int getPageNo() throws CFException {
       if (isPageNoModified()) { 
           pageNo = refreshPageNo();
        }
   		return pageNo;
	}
	

	
	   
	/**
	 * 	Update PageNo with the passed value
	 *  Corresponding COBOL Variable is WS-PAGE-NO
	 *	@param number
	 */
	public void setPageNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    pageNo = checkPageNoMaxLimit(number); 
		serializePageNo(pageNo);
	}
	

	public void setPageNo(long number) {
	    number = checkPageNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPageNo((int)number);
	}
	
	/**
	 * 	Update PageNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setPageNo(char[] value) throws CFException {
		 pageNo = serializePageNo(value);
	}
	/**
	 * 	Update PageNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPageNoString(char[] value) throws CFException {
		 setPageNo(value);
	}
	/**
	 *	Returns the value of timeR
	 *	@return timeR
	 */
   public char[] getTimeR() throws CFException{
     if (isTimeRModified()) { 
        timeR = refreshTimeR();
     }
   		return timeR;
   }

  
	/**
	*  set variable timeR
	*  Corresponding COBOL Variable is WS-TIME-R
	*  @param value
	**/
   public void setTimeR(char[] value) {
      timeR = checkTimeRConstraints(value);
      serializeTimeR(timeR);
   } 

     /**
	 * 	Update TimeR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTimeR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTimeR,timeR.length);
   	
   }
   
   public void setTimeR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTimeR,timeR.length);
   	
   }
   
     /**
	 * 	Update TimeR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTimeR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimeR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TimeR with another Field
	 *	@param value
	 */
   public void setTimeR(Field source) {
       replace(source,0,source.length(),beginTimeR,TIME_R_LEN);
   	
   }  
   
     /**
	 * 	Update TimeR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTimeR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTimeR,TIME_R_LEN);
   	
   }
   
     /**
	 * 	Update TimeR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTimeR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTimeR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHeaderTimeFieldLength() {
			return HEADER_TIME_LENGTH;
		}

}
  
