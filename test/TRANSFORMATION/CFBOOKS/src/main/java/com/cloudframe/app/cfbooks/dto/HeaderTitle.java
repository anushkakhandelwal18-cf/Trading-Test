package com.cloudframe.app.cfbooks.dto;

/**
*  The class HeaderTitle is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 03:00. using version 5.0.0.161
**/


import com.cloudframe.app.cfbooks.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HeaderTitle extends HeaderTitleSerialized { 
   




						private char[] dateR = new char[10];

	
	/**
	* Constructor for HeaderTitle
	**/
    public HeaderTitle() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(50)
             , getStartOffset() + 0
             ,50
             );
       replaceValue( // serialize and save the value
             ("GENERATED BOOK REPORT        ").toCharArray()
             , getStartOffset() + 50
             ,29
             );
       replaceValue( // serialize and save the value
             fillSpace(42)
             , getStartOffset() + 79
             ,42
             );
								setDateR(fillSpace(10));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 131
             ,1
             );
    }


 

	/**
	 *	Returns the value of dateR
	 *	@return dateR
	 */
   public char[] getDateR() throws CFException{
     if (isDateRModified()) { 
        dateR = refreshDateR();
     }
   		return dateR;
   }

  
	/**
	*  set variable dateR
	*  Corresponding COBOL Variable is WS-DATE-R
	*  @param value
	**/
   public void setDateR(char[] value) {
      dateR = checkDateRConstraints(value);
      serializeDateR(dateR);
   } 

     /**
	 * 	Update DateR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDateR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDateR,dateR.length);
   	
   }
   
   public void setDateR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDateR,dateR.length);
   	
   }
   
     /**
	 * 	Update DateR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDateR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DateR with another Field
	 *	@param value
	 */
   public void setDateR(Field source) {
       replace(source,0,source.length(),beginDateR,DATE_R_LEN);
   	
   }  
   
     /**
	 * 	Update DateR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDateR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDateR,DATE_R_LEN);
   	
   }
   
     /**
	 * 	Update DateR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDateR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHeaderTitleFieldLength() {
			return HEADER_TITLE_LENGTH;
		}

}
  
