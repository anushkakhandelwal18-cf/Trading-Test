package com.cloudframe.app.cfbooks.dto.serialize;

/**
*  The class NullvarsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 03:00. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class NullvarsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(NullvarsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int NULLVARS_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPageNull;
            protected  int beginRateNull;
            protected  int beginIsbnNull;
            protected  int beginDateNull;
            protected  int beginIdNull;
	
	/**
	* Constructor for NullvarsSerialized
	**/
    public NullvarsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in NullvarsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(NULLVARS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPageNull = getStartOffset() + 0;	// set offset for serialization
  
             beginRateNull = getStartOffset() + 2;	// set offset for serialization
  
             beginIsbnNull = getStartOffset() + 4;	// set offset for serialization
  
             beginDateNull = getStartOffset() + 6;	// set offset for serialization
  
             beginIdNull = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localPageNullCounter = -1;
         public boolean isPageNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPageNullCounter != sharedCounter;
            localPageNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int PAGE_NULL_LEN = 2;
  	/**
	 * serializePageNull
	 */
	protected void serializePageNull(short pageNull) {
           replaceValue( //  save the value as string
                   getBinaryString( pageNull,PAGE_NULL_LEN)
                  ,beginPageNull
                  ,PAGE_NULL_LEN
                 );
            localPageNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkPageNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshPageNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPageNull() {	 
			return (getShort(beginPageNull));
   	}
         int localRateNullCounter = -1;
         public boolean isRateNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRateNullCounter != sharedCounter;
            localRateNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int RATE_NULL_LEN = 2;
  	/**
	 * serializeRateNull
	 */
	protected void serializeRateNull(short rateNull) {
           replaceValue( //  save the value as string
                   getBinaryString( rateNull,RATE_NULL_LEN)
                  ,beginRateNull
                  ,RATE_NULL_LEN
                 );
            localRateNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkRateNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshRateNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshRateNull() {	 
			return (getShort(beginRateNull));
   	}
         int localIsbnNullCounter = -1;
         public boolean isIsbnNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIsbnNullCounter != sharedCounter;
            localIsbnNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int ISBN_NULL_LEN = 2;
  	/**
	 * serializeIsbnNull
	 */
	protected void serializeIsbnNull(short isbnNull) {
           replaceValue( //  save the value as string
                   getBinaryString( isbnNull,ISBN_NULL_LEN)
                  ,beginIsbnNull
                  ,ISBN_NULL_LEN
                 );
            localIsbnNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIsbnNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIsbnNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIsbnNull() {	 
			return (getShort(beginIsbnNull));
   	}
         int localDateNullCounter = -1;
         public boolean isDateNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDateNullCounter != sharedCounter;
            localDateNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int DATE_NULL_LEN = 2;
  	/**
	 * serializeDateNull
	 */
	protected void serializeDateNull(short dateNull) {
           replaceValue( //  save the value as string
                   getBinaryString( dateNull,DATE_NULL_LEN)
                  ,beginDateNull
                  ,DATE_NULL_LEN
                 );
            localDateNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkDateNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshDateNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshDateNull() {	 
			return (getShort(beginDateNull));
   	}
         int localIdNullCounter = -1;
         public boolean isIdNullModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIdNullCounter != sharedCounter;
            localIdNullCounter = sharedCounter; return hasModified; 
         }
   protected static final int ID_NULL_LEN = 2;
  	/**
	 * serializeIdNull
	 */
	protected void serializeIdNull(short idNull) {
           replaceValue( //  save the value as string
                   getBinaryString( idNull,ID_NULL_LEN)
                  ,beginIdNull
                  ,ID_NULL_LEN
                 );
            localIdNullCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIdNullMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIdNull is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIdNull() {	 
			return (getShort(beginIdNull));
   	}




}
  
