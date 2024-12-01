package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class LilianGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LilianGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LilianGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LILIAN_GROUP_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLilian;
	
	/**
	* Constructor for LilianGroupSerialized
	**/
    public LilianGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LilianGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LILIAN_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLilian = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localLilianCounter = -1;
         public boolean isLilianModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLilianCounter != sharedCounter;
            localLilianCounter = sharedCounter; return hasModified; 
         }
   protected static final int LILIAN_LEN = 4;
  	/**
	 * serializeLilian
	 */
	protected void serializeLilian(int lilian) {
           replaceValue( //  save the value as string
                   getBinaryString( lilian,LILIAN_LEN)
                  ,beginLilian
                  ,LILIAN_LEN
                 );
            localLilianCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkLilianMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshLilian is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLilian() {	 
			return (getInt(beginLilian));
   	}




}
  
