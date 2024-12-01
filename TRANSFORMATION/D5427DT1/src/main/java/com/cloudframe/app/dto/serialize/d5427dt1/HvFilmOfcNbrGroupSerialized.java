package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class HvFilmOfcNbrGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvFilmOfcNbrGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvFilmOfcNbrGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_FILM_OFC_NBR_GROUP_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvFilmOfcNbr;
	
	/**
	* Constructor for HvFilmOfcNbrGroupSerialized
	**/
    public HvFilmOfcNbrGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HvFilmOfcNbrGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvFilmOfcNbrGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HvFilmOfcNbrGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,96); // serialize this field at offset 96 by default 
    }
    
	/**
	* sets parent for this HvFilmOfcNbrGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 96 by default
    }    
	/**
	* initializes the field in HvFilmOfcNbrGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_FILM_OFC_NBR_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvFilmOfcNbr = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHvFilmOfcNbrCounter = -1;
     public boolean isHvFilmOfcNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvFilmOfcNbrCounter != sharedCounter;
         localHvFilmOfcNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_FILM_OFC_NBR_LEN = 4;
	/**
	 * 	serialize this HvFilmOfcNbr
	 */
   protected void serializeHvFilmOfcNbr(char[] hvFilmOfcNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvFilmOfcNbr,0,getStringValue(),beginHvFilmOfcNbr,HV_FILM_OFC_NBR_LEN);
       localHvFilmOfcNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvFilmOfcNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshHvFilmOfcNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvFilmOfcNbr() {	 
   		return (substring(getStringValue(),beginHvFilmOfcNbr,beginHvFilmOfcNbr + HV_FILM_OFC_NBR_LEN));
   	}




}
  
