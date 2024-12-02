package com.cloudframe.app.cfbooks.dto.serialize;

/**
*  The class DclbooksSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 03:00. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DclbooksSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DclbooksSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLBOOKS_LENGTH = 297;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBooksBookId;
            protected  int beginBooksTotalPages;
            protected  int beginBooksRating;
            protected  int beginBooksPublishedDate;
            protected  int beginBooksPublisherId;
	
	/**
	* Constructor for DclbooksSerialized
	**/
    public DclbooksSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DclbooksSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLBOOKS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBooksBookId = getStartOffset() + 0;	// set offset for serialization
  
  
             beginBooksTotalPages = getStartOffset() + 261;	// set offset for serialization
  
             beginBooksRating = getStartOffset() + 265;	// set offset for serialization
  
  
             beginBooksPublishedDate = getStartOffset() + 283;	// set offset for serialization
  
             beginBooksPublisherId = getStartOffset() + 293;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localBooksBookIdCounter = -1;
         public boolean isBooksBookIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBooksBookIdCounter != sharedCounter;
            localBooksBookIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int BOOKS_BOOK_ID_LEN = 4;
  	/**
	 * serializeBooksBookId
	 */
	protected void serializeBooksBookId(int booksBookId) {
           replaceValue( //  save the value as string
                   getBinaryString( booksBookId,BOOKS_BOOK_ID_LEN)
                  ,beginBooksBookId
                  ,BOOKS_BOOK_ID_LEN
                 );
            localBooksBookIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBooksBookIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBooksBookId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBooksBookId() {	 
			return (getInt(beginBooksBookId));
   	}
         int localBooksTotalPagesCounter = -1;
         public boolean isBooksTotalPagesModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBooksTotalPagesCounter != sharedCounter;
            localBooksTotalPagesCounter = sharedCounter; return hasModified; 
         }
   protected static final int BOOKS_TOTAL_PAGES_LEN = 4;
  	/**
	 * serializeBooksTotalPages
	 */
	protected void serializeBooksTotalPages(int booksTotalPages) {
           replaceValue( //  save the value as string
                   getBinaryString( booksTotalPages,BOOKS_TOTAL_PAGES_LEN)
                  ,beginBooksTotalPages
                  ,BOOKS_TOTAL_PAGES_LEN
                 );
            localBooksTotalPagesCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBooksTotalPagesMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBooksTotalPages is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBooksTotalPages() {	 
			return (getInt(beginBooksTotalPages));
   	}
        int localBooksRatingCounter = -1;
        public boolean isBooksRatingModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localBooksRatingCounter != sharedCounter;
           localBooksRatingCounter = sharedCounter; return hasModified; 
        }
	    public boolean booksRatingIsNumeric() {
	      return decimalIsNumeric(beginBooksRating,BOOKS_RATING_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] booksRatingString() {
            return getPackedString(beginBooksRating,BOOKS_RATING_LEN);
         }
   protected static final int BOOKS_RATING_LEN = 3;
   protected static final int BOOKS_RATING_SCALE = 2;
  	/**
	 * 	serializeBooksRating
	 */
	protected void serializeBooksRating(BigDecimal booksRating) {
		   putDecimal(beginBooksRating,booksRating,BOOKS_RATING_LEN,BOOKS_RATING_SCALE,true);
		 localBooksRatingCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkBooksRatingMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,4/*precision*/);
   }
     /**
	 *	refreshBooksRating is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBooksRating() throws CFException {	
   	try { 
		 return (getDecimal(beginBooksRating,BOOKS_RATING_LEN,BOOKS_RATING_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("booksRating", beginBooksRating,BOOKS_RATING_LEN);
     }
   	}
     int localBooksPublishedDateCounter = -1;
     public boolean isBooksPublishedDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBooksPublishedDateCounter != sharedCounter;
         localBooksPublishedDateCounter = sharedCounter; return hasModified;
     }
	protected static final int BOOKS_PUBLISHED_DATE_LEN = 10;
	/**
	 * 	serialize this BooksPublishedDate
	 */
   protected void serializeBooksPublishedDate(char[] booksPublishedDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(booksPublishedDate,0,getStringValue(),beginBooksPublishedDate,BOOKS_PUBLISHED_DATE_LEN);
       localBooksPublishedDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBooksPublishedDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBooksPublishedDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBooksPublishedDate() {	 
   		return (substring(getStringValue(),beginBooksPublishedDate,beginBooksPublishedDate + BOOKS_PUBLISHED_DATE_LEN));
   	}
         int localBooksPublisherIdCounter = -1;
         public boolean isBooksPublisherIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBooksPublisherIdCounter != sharedCounter;
            localBooksPublisherIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int BOOKS_PUBLISHER_ID_LEN = 4;
  	/**
	 * serializeBooksPublisherId
	 */
	protected void serializeBooksPublisherId(int booksPublisherId) {
           replaceValue( //  save the value as string
                   getBinaryString( booksPublisherId,BOOKS_PUBLISHER_ID_LEN)
                  ,beginBooksPublisherId
                  ,BOOKS_PUBLISHER_ID_LEN
                 );
            localBooksPublisherIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBooksPublisherIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBooksPublisherId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBooksPublisherId() {	 
			return (getInt(beginBooksPublisherId));
   	}




}
  
