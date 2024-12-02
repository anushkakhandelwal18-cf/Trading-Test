package com.cloudframe.app.cfbooks.dto.serialize;

/**
*  The class BooksTitleSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 03:00. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BooksTitleSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BooksTitleSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BOOKS_TITLE_LENGTH = 257;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBooksTitleLen;
            protected  int beginBooksTitleText;
	
	/**
	* Constructor for BooksTitleSerialized
	**/
    public BooksTitleSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BooksTitleSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BooksTitleSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BooksTitleSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this BooksTitleSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in BooksTitleSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BOOKS_TITLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBooksTitleLen = getStartOffset() + 0;	// set offset for serialization
  
             beginBooksTitleText = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localBooksTitleLenCounter = -1;
         public boolean isBooksTitleLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBooksTitleLenCounter != sharedCounter;
            localBooksTitleLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int BOOKS_TITLE_LEN_LEN = 2;
  	/**
	 * serializeBooksTitleLen
	 */
	protected void serializeBooksTitleLen(short booksTitleLen) {
           replaceValue( //  save the value as string
                   getBinaryString( booksTitleLen,BOOKS_TITLE_LEN_LEN)
                  ,beginBooksTitleLen
                  ,BOOKS_TITLE_LEN_LEN
                 );
            localBooksTitleLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkBooksTitleLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshBooksTitleLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshBooksTitleLen() {	 
			return (getShort(beginBooksTitleLen));
   	}
     int localBooksTitleTextCounter = -1;
     public boolean isBooksTitleTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBooksTitleTextCounter != sharedCounter;
         localBooksTitleTextCounter = sharedCounter; return hasModified;
     }
	protected static final int BOOKS_TITLE_TEXT_LEN = 255;
	/**
	 * 	serialize this BooksTitleText
	 */
   protected void serializeBooksTitleText(char[] booksTitleText) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(booksTitleText,0,getStringValue(),beginBooksTitleText,BOOKS_TITLE_TEXT_LEN);
       localBooksTitleTextCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBooksTitleTextConstraints(char[] value) {
   			return super.checkConstraints(value , 255 ,false, false);
   }
    /**
	 *	refreshBooksTitleText is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBooksTitleText() {	 
   		return (substring(getStringValue(),beginBooksTitleText,beginBooksTitleText + BOOKS_TITLE_TEXT_LEN));
   	}




}
  
