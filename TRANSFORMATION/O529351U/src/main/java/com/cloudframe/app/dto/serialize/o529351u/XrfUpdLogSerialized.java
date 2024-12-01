package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class XrfUpdLogSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class XrfUpdLogSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(XrfUpdLogSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int XRF_UPD_LOG_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginXrfUpdDate;
            protected  int beginXrfUpdTime;
	
	/**
	* Constructor for XrfUpdLogSerialized
	**/
    public XrfUpdLogSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for XrfUpdLogSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XrfUpdLogSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this XrfUpdLogSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2296); // serialize this field at offset 2296 by default 
    }
    
	/**
	* sets parent for this XrfUpdLogSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2296 by default
    }    
	/**
	* initializes the field in XrfUpdLogSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(XRF_UPD_LOG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginXrfUpdDate = getStartOffset() + 0;	// set offset for serialization
  
             beginXrfUpdTime = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localXrfUpdDateCounter = -1;
         public boolean isXrfUpdDateModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localXrfUpdDateCounter != sharedCounter;
            localXrfUpdDateCounter = sharedCounter; return hasModified; 
         }
   protected static final int XRF_UPD_DATE_LEN = 4;
  	/**
	 * serializeXrfUpdDate
	 */
	protected void serializeXrfUpdDate(int xrfUpdDate) {
           replaceValue( //  save the value as string
                   getBinaryString( xrfUpdDate,XRF_UPD_DATE_LEN)
                  ,beginXrfUpdDate
                  ,XRF_UPD_DATE_LEN
                 );
            localXrfUpdDateCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkXrfUpdDateMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshXrfUpdDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshXrfUpdDate() {	 
			return (getInt(beginXrfUpdDate));
   	}
         int localXrfUpdTimeCounter = -1;
         public boolean isXrfUpdTimeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localXrfUpdTimeCounter != sharedCounter;
            localXrfUpdTimeCounter = sharedCounter; return hasModified; 
         }
   protected static final int XRF_UPD_TIME_LEN = 4;
  	/**
	 * serializeXrfUpdTime
	 */
	protected void serializeXrfUpdTime(int xrfUpdTime) {
           replaceValue( //  save the value as string
                   getBinaryString( xrfUpdTime,XRF_UPD_TIME_LEN)
                  ,beginXrfUpdTime
                  ,XRF_UPD_TIME_LEN
                 );
            localXrfUpdTimeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkXrfUpdTimeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshXrfUpdTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshXrfUpdTime() {	 
			return (getInt(beginXrfUpdTime));
   	}




}
  
