package com.cloudframe.app.cfbooks.file.records.serialize;

/**
*  The class RepOpFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 03:00. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RepOpFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RepOpFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REP_OP_FIELDS_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOpBookid;
            protected  int beginOpTitle;
            protected  int beginOpPages;
            protected  int beginOpRating;
            protected  int beginOpIsbn;
            protected  int beginOpPubdate;
            protected  int beginOpPubid;
	
	/**
	* Constructor for RepOpFieldsSerialized
	**/
    public RepOpFieldsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RepOpFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REP_OP_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOpBookid = getStartOffset() + 0;	// set offset for serialization
  
             beginOpTitle = getStartOffset() + 9;	// set offset for serialization
  
             beginOpPages = getStartOffset() + 88;	// set offset for serialization
  
             beginOpRating = getStartOffset() + 94;	// set offset for serialization
  
             beginOpIsbn = getStartOffset() + 100;	// set offset for serialization
  
             beginOpPubdate = getStartOffset() + 115;	// set offset for serialization
  
             beginOpPubid = getStartOffset() + 127;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOpBookidCounter = -1;
     public boolean isOpBookidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOpBookidCounter != sharedCounter;
         localOpBookidCounter = sharedCounter; return hasModified;
     }
	protected static final int OP_BOOKID_LEN = 8;
	/**
	 * 	serialize this OpBookid
	 */
   protected void serializeOpBookid(char[] opBookid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(opBookid,0,getStringValue(),beginOpBookid,OP_BOOKID_LEN);
       localOpBookidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOpBookidConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshOpBookid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOpBookid() {	 
   		return (substring(getStringValue(),beginOpBookid,beginOpBookid + OP_BOOKID_LEN));
   	}
     int localOpTitleCounter = -1;
     public boolean isOpTitleModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOpTitleCounter != sharedCounter;
         localOpTitleCounter = sharedCounter; return hasModified;
     }
	protected static final int OP_TITLE_LEN = 77;
	/**
	 * 	serialize this OpTitle
	 */
   protected void serializeOpTitle(char[] opTitle) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(opTitle,0,getStringValue(),beginOpTitle,OP_TITLE_LEN);
       localOpTitleCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOpTitleConstraints(char[] value) {
   			return super.checkConstraints(value , 77 ,false, false);
   }
    /**
	 *	refreshOpTitle is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOpTitle() {	 
   		return (substring(getStringValue(),beginOpTitle,beginOpTitle + OP_TITLE_LEN));
   	}
     int localOpPagesCounter = -1;
     public boolean isOpPagesModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOpPagesCounter != sharedCounter;
         localOpPagesCounter = sharedCounter; return hasModified;
     }
	protected static final int OP_PAGES_LEN = 4;
	/**
	 * 	serialize this OpPages
	 */
   protected void serializeOpPages(char[] opPages) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(opPages,0,getStringValue(),beginOpPages,OP_PAGES_LEN);
       localOpPagesCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOpPagesConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshOpPages is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOpPages() {	 
   		return (substring(getStringValue(),beginOpPages,beginOpPages + OP_PAGES_LEN));
   	}
     int localOpRatingCounter = -1;
     public boolean isOpRatingModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOpRatingCounter != sharedCounter;
         localOpRatingCounter = sharedCounter; return hasModified;
     }
	protected static final int OP_RATING_LEN = 4;
	/**
	 * 	serialize this OpRating
	 */
   protected void serializeOpRating(char[] opRating) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(opRating,0,getStringValue(),beginOpRating,OP_RATING_LEN);
       localOpRatingCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOpRatingConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshOpRating is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOpRating() {	 
   		return (substring(getStringValue(),beginOpRating,beginOpRating + OP_RATING_LEN));
   	}
     int localOpIsbnCounter = -1;
     public boolean isOpIsbnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOpIsbnCounter != sharedCounter;
         localOpIsbnCounter = sharedCounter; return hasModified;
     }
	protected static final int OP_ISBN_LEN = 13;
	/**
	 * 	serialize this OpIsbn
	 */
   protected void serializeOpIsbn(char[] opIsbn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(opIsbn,0,getStringValue(),beginOpIsbn,OP_ISBN_LEN);
       localOpIsbnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOpIsbnConstraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshOpIsbn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOpIsbn() {	 
   		return (substring(getStringValue(),beginOpIsbn,beginOpIsbn + OP_ISBN_LEN));
   	}
     int localOpPubdateCounter = -1;
     public boolean isOpPubdateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOpPubdateCounter != sharedCounter;
         localOpPubdateCounter = sharedCounter; return hasModified;
     }
	protected static final int OP_PUBDATE_LEN = 10;
	/**
	 * 	serialize this OpPubdate
	 */
   protected void serializeOpPubdate(char[] opPubdate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(opPubdate,0,getStringValue(),beginOpPubdate,OP_PUBDATE_LEN);
       localOpPubdateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOpPubdateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshOpPubdate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOpPubdate() {	 
   		return (substring(getStringValue(),beginOpPubdate,beginOpPubdate + OP_PUBDATE_LEN));
   	}
     int localOpPubidCounter = -1;
     public boolean isOpPubidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOpPubidCounter != sharedCounter;
         localOpPubidCounter = sharedCounter; return hasModified;
     }
	protected static final int OP_PUBID_LEN = 4;
	/**
	 * 	serialize this OpPubid
	 */
   protected void serializeOpPubid(char[] opPubid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(opPubid,0,getStringValue(),beginOpPubid,OP_PUBID_LEN);
       localOpPubidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOpPubidConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshOpPubid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOpPubid() {	 
   		return (substring(getStringValue(),beginOpPubid,beginOpPubid + OP_PUBID_LEN));
   	}




}
  
