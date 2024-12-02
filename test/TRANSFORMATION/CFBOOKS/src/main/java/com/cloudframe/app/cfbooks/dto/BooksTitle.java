package com.cloudframe.app.cfbooks.dto;

/**
*  The class BooksTitle is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 03:00. using version 5.0.0.161
**/


import com.cloudframe.app.cfbooks.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BooksTitle extends BooksTitleSerialized { 
   

								private short booksTitleLen;

						private char[] booksTitleText = Field.fillLowValue(255);
	
	/**
	* Constructor for BooksTitle
	**/
    public BooksTitle() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BooksTitle. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BooksTitle(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of booksTitleLen
	 *	@return booksTitleLen
	 */
	public short getBooksTitleLen() throws CFException {
        if (isBooksTitleLenModified()) { 
           booksTitleLen = refreshBooksTitleLen();
        }
   		return booksTitleLen;
	}
	
	/**
	 * 	Update BooksTitleLen with the passed value
	 *  Corresponding COBOL Variable is BOOKS-TITLE-LEN
	 *	@param number
	 */
	public void setBooksTitleLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    booksTitleLen = checkBooksTitleLenMaxLimit(number); 
		serializeBooksTitleLen(booksTitleLen);
	}

	public void setBooksTitleLen(int number) {
	    number = checkBooksTitleLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBooksTitleLen((short)number);
	}
	public void setBooksTitleLen(long number) {
	    number = checkBooksTitleLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBooksTitleLen((short)number);
	}
	

	/**
	 *	Returns the value of booksTitleText
	 *	@return booksTitleText
	 */
   public char[] getBooksTitleText() throws CFException{
     if (isBooksTitleTextModified()) { 
        booksTitleText = refreshBooksTitleText();
     }
   		return booksTitleText;
   }

  
	/**
	*  set variable booksTitleText
	*  Corresponding COBOL Variable is BOOKS-TITLE-TEXT
	*  @param value
	**/
   public void setBooksTitleText(char[] value) {
      booksTitleText = checkBooksTitleTextConstraints(value);
      serializeBooksTitleText(booksTitleText);
   } 

     /**
	 * 	Update BooksTitleText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBooksTitleText(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBooksTitleText,booksTitleText.length);
   	
   }
   
   public void setBooksTitleText(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBooksTitleText,booksTitleText.length);
   	
   }
   
     /**
	 * 	Update BooksTitleText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitleText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBooksTitleText+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BooksTitleText with another Field
	 *	@param value
	 */
   public void setBooksTitleText(Field source) {
       replace(source,0,source.length(),beginBooksTitleText,BOOKS_TITLE_TEXT_LEN);
   	
   }  
   
     /**
	 * 	Update BooksTitleText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBooksTitleText(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBooksTitleText,BOOKS_TITLE_TEXT_LEN);
   	
   }
   
     /**
	 * 	Update BooksTitleText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitleText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBooksTitleText+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBooksTitleFieldLength() {
			return BOOKS_TITLE_LENGTH;
		}

}
  
