package com.cloudframe.app.cfbooks.dto.serialize;

/**
*  The class BooksIsbnSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 03:00. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BooksIsbnSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BooksIsbnSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BOOKS_ISBN_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBooksIsbnLen;
            protected  int beginBooksIsbnText;
	
	/**
	* Constructor for BooksIsbnSerialized
	**/
    public BooksIsbnSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BooksIsbnSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BooksIsbnSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BooksIsbnSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,268); // serialize this field at offset 268 by default 
    }
    
	/**
	* sets parent for this BooksIsbnSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 268 by default
    }    
	/**
	* initializes the field in BooksIsbnSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BOOKS_ISBN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBooksIsbnLen = getStartOffset() + 0;	// set offset for serialization
  
             beginBooksIsbnText = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localBooksIsbnLenCounter = -1;
         public boolean isBooksIsbnLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBooksIsbnLenCounter != sharedCounter;
            localBooksIsbnLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int BOOKS_ISBN_LEN_LEN = 2;
  	/**
	 * serializeBooksIsbnLen
	 */
	protected void serializeBooksIsbnLen(short booksIsbnLen) {
           replaceValue( //  save the value as string
                   getBinaryString( booksIsbnLen,BOOKS_ISBN_LEN_LEN)
                  ,beginBooksIsbnLen
                  ,BOOKS_ISBN_LEN_LEN
                 );
            localBooksIsbnLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkBooksIsbnLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshBooksIsbnLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshBooksIsbnLen() {	 
			return (getShort(beginBooksIsbnLen));
   	}
     int localBooksIsbnTextCounter = -1;
     public boolean isBooksIsbnTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBooksIsbnTextCounter != sharedCounter;
         localBooksIsbnTextCounter = sharedCounter; return hasModified;
     }
	protected static final int BOOKS_ISBN_TEXT_LEN = 13;
	/**
	 * 	serialize this BooksIsbnText
	 */
   protected void serializeBooksIsbnText(char[] booksIsbnText) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(booksIsbnText,0,getStringValue(),beginBooksIsbnText,BOOKS_ISBN_TEXT_LEN);
       localBooksIsbnTextCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBooksIsbnTextConstraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshBooksIsbnText is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBooksIsbnText() {	 
   		return (substring(getStringValue(),beginBooksIsbnText,beginBooksIsbnText + BOOKS_ISBN_TEXT_LEN));
   	}




}
  
