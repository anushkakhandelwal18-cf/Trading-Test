package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class FesrFromCondPrvTypSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FesrFromCondPrvTypSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FesrFromCondPrvTypSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FESR_FROM_COND_PRV_TYP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFesrFromPrvTyp;
	
	/**
	* Constructor for FesrFromCondPrvTypSerialized
	**/
    public FesrFromCondPrvTypSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FesrFromCondPrvTypSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrFromCondPrvTypSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FesrFromCondPrvTypSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3087); // serialize this field at offset 3087 by default 
    }
    
	/**
	* sets parent for this FesrFromCondPrvTypSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3087 by default
    }    
	/**
	* initializes the field in FesrFromCondPrvTypSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FESR_FROM_COND_PRV_TYP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFesrFromPrvTyp = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFesrFromPrvTypCounter = -1;
     public boolean isFesrFromPrvTypModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesrFromPrvTypCounter != sharedCounter;
         localFesrFromPrvTypCounter = sharedCounter; return hasModified;
     }
	protected static final int FESR_FROM_PRV_TYP_LEN = 2;
	/**
	 * 	serialize this FesrFromPrvTyp
	 */
   protected void serializeFesrFromPrvTyp(char[] fesrFromPrvTyp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesrFromPrvTyp,0,getStringValue(),beginFesrFromPrvTyp,FESR_FROM_PRV_TYP_LEN);
       localFesrFromPrvTypCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesrFromPrvTypConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFesrFromPrvTyp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesrFromPrvTyp() {	 
   		return (substring(getStringValue(),beginFesrFromPrvTyp,beginFesrFromPrvTyp + FESR_FROM_PRV_TYP_LEN));
   	}




}
  
