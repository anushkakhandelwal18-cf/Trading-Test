package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class XrfRpDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class XrfRpDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(XrfRpDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int XRF_RP_DATA_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginXrfPlcyRp;
            protected  int beginXrfDivRp;
            protected  int beginXrfClsRp;
            protected  int beginXrfSuffRp;
	
	/**
	* Constructor for XrfRpDataSerialized
	**/
    public XrfRpDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for XrfRpDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XrfRpDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this XrfRpDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2512); // serialize this field at offset 2512 by default 
    }
    
	/**
	* sets parent for this XrfRpDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2512 by default
    }    
	/**
	* initializes the field in XrfRpDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(XRF_RP_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginXrfPlcyRp = getStartOffset() + 0;	// set offset for serialization
  
             beginXrfDivRp = getStartOffset() + 6;	// set offset for serialization
  
             beginXrfClsRp = getStartOffset() + 8;	// set offset for serialization
  
             beginXrfSuffRp = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localXrfPlcyRpCounter = -1;
     public boolean isXrfPlcyRpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfPlcyRpCounter != sharedCounter;
         localXrfPlcyRpCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_PLCY_RP_LEN = 6;
	/**
	 * 	serialize this XrfPlcyRp
	 */
   protected void serializeXrfPlcyRp(char[] xrfPlcyRp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfPlcyRp,0,getStringValue(),beginXrfPlcyRp,XRF_PLCY_RP_LEN);
       localXrfPlcyRpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfPlcyRpConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshXrfPlcyRp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfPlcyRp() {	 
   		return (substring(getStringValue(),beginXrfPlcyRp,beginXrfPlcyRp + XRF_PLCY_RP_LEN));
   	}
         int localXrfDivRpCounter = -1;
         public boolean isXrfDivRpModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localXrfDivRpCounter != sharedCounter;
            localXrfDivRpCounter = sharedCounter; return hasModified; 
         }
   protected static final int XRF_DIV_RP_LEN = 2;
  	/**
	 * serializeXrfDivRp
	 */
	protected void serializeXrfDivRp(short xrfDivRp) {
           replaceValue( //  save the value as string
                   getBinaryString( xrfDivRp,XRF_DIV_RP_LEN)
                  ,beginXrfDivRp
                  ,XRF_DIV_RP_LEN
                 );
            localXrfDivRpCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkXrfDivRpMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshXrfDivRp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshXrfDivRp() {	 
			return (getShort(beginXrfDivRp));
   	}
         int localXrfClsRpCounter = -1;
         public boolean isXrfClsRpModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localXrfClsRpCounter != sharedCounter;
            localXrfClsRpCounter = sharedCounter; return hasModified; 
         }
   protected static final int XRF_CLS_RP_LEN = 2;
  	/**
	 * serializeXrfClsRp
	 */
	protected void serializeXrfClsRp(short xrfClsRp) {
           replaceValue( //  save the value as string
                   getBinaryString( xrfClsRp,XRF_CLS_RP_LEN)
                  ,beginXrfClsRp
                  ,XRF_CLS_RP_LEN
                 );
            localXrfClsRpCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkXrfClsRpMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshXrfClsRp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshXrfClsRp() {	 
			return (getShort(beginXrfClsRp));
   	}
     int localXrfSuffRpCounter = -1;
     public boolean isXrfSuffRpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfSuffRpCounter != sharedCounter;
         localXrfSuffRpCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_SUFF_RP_LEN = 2;
	/**
	 * 	serialize this XrfSuffRp
	 */
   protected void serializeXrfSuffRp(char[] xrfSuffRp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfSuffRp,0,getStringValue(),beginXrfSuffRp,XRF_SUFF_RP_LEN);
       localXrfSuffRpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfSuffRpConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshXrfSuffRp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfSuffRp() {	 
   		return (substring(getStringValue(),beginXrfSuffRp,beginXrfSuffRp + XRF_SUFF_RP_LEN));
   	}




}
  
