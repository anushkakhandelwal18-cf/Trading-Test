package com.cloudframe.app.cfbooks.dto;

/**
*  The class Dclbooks is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 03:00. using version 5.0.0.161
**/


import com.cloudframe.app.cfbooks.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class Dclbooks extends DclbooksSerialized { 
   

								private int booksBookId;
				private BooksTitle booksTitle = new BooksTitle();

								private int booksTotalPages;

								private BigDecimal booksRating = BigDecimal.ZERO;
				private BooksIsbn booksIsbn = new BooksIsbn();

						private char[] booksPublishedDate = Field.fillLowValue(10);

								private int booksPublisherId;
	
	/**
	* Constructor for Dclbooks
	**/
    public Dclbooks() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			booksTitle.setParent(this,getStartOffset() + 4);
	       			booksIsbn.setParent(this,getStartOffset() + 268);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of booksBookId
	 *	@return booksBookId
	 */
	public int getBooksBookId() throws CFException {
        if (isBooksBookIdModified()) { 
           booksBookId = refreshBooksBookId();
        }
   		return booksBookId;
	}
	
	/**
	 * 	Update BooksBookId with the passed value
	 *  Corresponding COBOL Variable is BOOKS-BOOK-ID
	 *	@param number
	 */
	public void setBooksBookId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    booksBookId = checkBooksBookIdMaxLimit(number); 
		serializeBooksBookId(booksBookId);
	}


	public void setBooksBookId(long number) {
	    number = checkBooksBookIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBooksBookId((int)number);
	}
	
	/**
	 *	Returns the value of booksTitle
	 *	@return booksTitle
	 */   
	 public BooksTitle getBooksTitle() {
   	return booksTitle;
   }
   /**
	* 	Update BooksTitle with the passed value
	*   Corresponding COBOL Variable is BOOKS-TITLE
	*	@param value
	*/
   public void setBooksTitle(char[] value) {
      booksTitle.setString(value); 
   }   
    
     /**
	 * 	Update BooksTitle 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBooksTitle(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,booksTitle.begin,booksTitle.length());
   }
   
     /**
	 * 	Update BooksTitle 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitle(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,booksTitle.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BooksTitle with another Field
	 *	@param value
	 */
   public void setBooksTitle(Field source) {
   	replace(source,0,source.length(),booksTitle.begin,booksTitle.length());
   }  
   
     /**
	 * 	Update BooksTitle 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBooksTitle(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,booksTitle.begin,booksTitle.length());
   }
   
     /**
	 * 	Update BooksTitle 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitle(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,booksTitle.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of booksTotalPages
	 *	@return booksTotalPages
	 */
	public int getBooksTotalPages() throws CFException {
        if (isBooksTotalPagesModified()) { 
           booksTotalPages = refreshBooksTotalPages();
        }
   		return booksTotalPages;
	}
	
	/**
	 * 	Update BooksTotalPages with the passed value
	 *  Corresponding COBOL Variable is BOOKS-TOTAL-PAGES
	 *	@param number
	 */
	public void setBooksTotalPages(int number) {
	     // Truncate if the number is beyond +/- Max range
	    booksTotalPages = checkBooksTotalPagesMaxLimit(number); 
		serializeBooksTotalPages(booksTotalPages);
	}


	public void setBooksTotalPages(long number) {
	    number = checkBooksTotalPagesMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBooksTotalPages((int)number);
	}
	
	public BigDecimal getBooksRating() throws CFException {
        if (isBooksRatingModified()) { 
           booksRating = refreshBooksRating();
        }
   		return booksRating;
	}

    public char[] getBooksRatingString() {
          return  booksRatingString();
    }
	
	/**
	 * 	Update BooksRating with the passed number
	 *  Corresponding COBOL Variable is BOOKS-RATING
	 *	@param number
	 */
	public void setBooksRating(BigDecimal number) {	
     booksRating = checkBooksRatingMaxLimit(number);
	    serializeBooksRating(booksRating);
   }
	/**
	 *	Returns the value of booksIsbn
	 *	@return booksIsbn
	 */   
	 public BooksIsbn getBooksIsbn() {
   	return booksIsbn;
   }
   /**
	* 	Update BooksIsbn with the passed value
	*   Corresponding COBOL Variable is BOOKS-ISBN
	*	@param value
	*/
   public void setBooksIsbn(char[] value) {
      booksIsbn.setString(value); 
   }   
    
     /**
	 * 	Update BooksIsbn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBooksIsbn(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,booksIsbn.begin,booksIsbn.length());
   }
   
     /**
	 * 	Update BooksIsbn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksIsbn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,booksIsbn.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BooksIsbn with another Field
	 *	@param value
	 */
   public void setBooksIsbn(Field source) {
   	replace(source,0,source.length(),booksIsbn.begin,booksIsbn.length());
   }  
   
     /**
	 * 	Update BooksIsbn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBooksIsbn(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,booksIsbn.begin,booksIsbn.length());
   }
   
     /**
	 * 	Update BooksIsbn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksIsbn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,booksIsbn.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of booksPublishedDate
	 *	@return booksPublishedDate
	 */
   public char[] getBooksPublishedDate() throws CFException{
     if (isBooksPublishedDateModified()) { 
        booksPublishedDate = refreshBooksPublishedDate();
     }
   		return booksPublishedDate;
   }

  
	/**
	*  set variable booksPublishedDate
	*  Corresponding COBOL Variable is BOOKS-PUBLISHED-DATE
	*  @param value
	**/
   public void setBooksPublishedDate(char[] value) {
      booksPublishedDate = checkBooksPublishedDateConstraints(value);
      serializeBooksPublishedDate(booksPublishedDate);
   } 

     /**
	 * 	Update BooksPublishedDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBooksPublishedDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBooksPublishedDate,booksPublishedDate.length);
   	
   }
   
   public void setBooksPublishedDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBooksPublishedDate,booksPublishedDate.length);
   	
   }
   
     /**
	 * 	Update BooksPublishedDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksPublishedDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBooksPublishedDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BooksPublishedDate with another Field
	 *	@param value
	 */
   public void setBooksPublishedDate(Field source) {
       replace(source,0,source.length(),beginBooksPublishedDate,BOOKS_PUBLISHED_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update BooksPublishedDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBooksPublishedDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBooksPublishedDate,BOOKS_PUBLISHED_DATE_LEN);
   	
   }
   
     /**
	 * 	Update BooksPublishedDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksPublishedDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBooksPublishedDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of booksPublisherId
	 *	@return booksPublisherId
	 */
	public int getBooksPublisherId() throws CFException {
        if (isBooksPublisherIdModified()) { 
           booksPublisherId = refreshBooksPublisherId();
        }
   		return booksPublisherId;
	}
	
	/**
	 * 	Update BooksPublisherId with the passed value
	 *  Corresponding COBOL Variable is BOOKS-PUBLISHER-ID
	 *	@param number
	 */
	public void setBooksPublisherId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    booksPublisherId = checkBooksPublisherIdMaxLimit(number); 
		serializeBooksPublisherId(booksPublisherId);
	}


	public void setBooksPublisherId(long number) {
	    number = checkBooksPublisherIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBooksPublisherId((int)number);
	}
	

	
	
	

		public static int getDclbooksFieldLength() {
			return DCLBOOKS_LENGTH;
		}

}
  
