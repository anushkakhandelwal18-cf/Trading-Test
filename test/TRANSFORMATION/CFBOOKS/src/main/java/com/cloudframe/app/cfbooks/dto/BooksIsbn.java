package com.cloudframe.app.cfbooks.dto;

/**
*  The class BooksIsbn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 03:00. using version 5.0.0.161
**/


import com.cloudframe.app.cfbooks.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BooksIsbn extends BooksIsbnSerialized { 
   

								private short booksIsbnLen;

						private char[] booksIsbnText = Field.fillLowValue(13);
	
	/**
	* Constructor for BooksIsbn
	**/
    public BooksIsbn() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BooksIsbn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BooksIsbn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of booksIsbnLen
	 *	@return booksIsbnLen
	 */
	public short getBooksIsbnLen() throws CFException {
        if (isBooksIsbnLenModified()) { 
           booksIsbnLen = refreshBooksIsbnLen();
        }
   		return booksIsbnLen;
	}
	
	/**
	 * 	Update BooksIsbnLen with the passed value
	 *  Corresponding COBOL Variable is BOOKS-ISBN-LEN
	 *	@param number
	 */
	public void setBooksIsbnLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    booksIsbnLen = checkBooksIsbnLenMaxLimit(number); 
		serializeBooksIsbnLen(booksIsbnLen);
	}

	public void setBooksIsbnLen(int number) {
	    number = checkBooksIsbnLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBooksIsbnLen((short)number);
	}
	public void setBooksIsbnLen(long number) {
	    number = checkBooksIsbnLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBooksIsbnLen((short)number);
	}
	

	/**
	 *	Returns the value of booksIsbnText
	 *	@return booksIsbnText
	 */
   public char[] getBooksIsbnText() throws CFException{
     if (isBooksIsbnTextModified()) { 
        booksIsbnText = refreshBooksIsbnText();
     }
   		return booksIsbnText;
   }

  
	/**
	*  set variable booksIsbnText
	*  Corresponding COBOL Variable is BOOKS-ISBN-TEXT
	*  @param value
	**/
   public void setBooksIsbnText(char[] value) {
      booksIsbnText = checkBooksIsbnTextConstraints(value);
      serializeBooksIsbnText(booksIsbnText);
   } 

     /**
	 * 	Update BooksIsbnText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBooksIsbnText(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBooksIsbnText,booksIsbnText.length);
   	
   }
   
   public void setBooksIsbnText(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBooksIsbnText,booksIsbnText.length);
   	
   }
   
     /**
	 * 	Update BooksIsbnText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksIsbnText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBooksIsbnText+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BooksIsbnText with another Field
	 *	@param value
	 */
   public void setBooksIsbnText(Field source) {
       replace(source,0,source.length(),beginBooksIsbnText,BOOKS_ISBN_TEXT_LEN);
   	
   }  
   
     /**
	 * 	Update BooksIsbnText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBooksIsbnText(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBooksIsbnText,BOOKS_ISBN_TEXT_LEN);
   	
   }
   
     /**
	 * 	Update BooksIsbnText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksIsbnText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBooksIsbnText+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBooksIsbnFieldLength() {
			return BOOKS_ISBN_LENGTH;
		}

}
  
