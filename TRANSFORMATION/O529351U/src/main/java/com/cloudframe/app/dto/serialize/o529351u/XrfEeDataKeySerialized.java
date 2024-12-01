package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class XrfEeDataKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class XrfEeDataKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(XrfEeDataKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int XRF_EE_DATA_KEY_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginXrfMvdEe;
            protected  int beginXrfPlcyEe;
            protected  int beginXrfDivEe;
            protected  int beginXrfClsEe;
	
	/**
	* Constructor for XrfEeDataKeySerialized
	**/
    public XrfEeDataKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for XrfEeDataKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XrfEeDataKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this XrfEeDataKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this XrfEeDataKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in XrfEeDataKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(XRF_EE_DATA_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginXrfMvdEe = getStartOffset() + 0;	// set offset for serialization
  
             beginXrfPlcyEe = getStartOffset() + 1;	// set offset for serialization
  
  
             beginXrfDivEe = getStartOffset() + 8;	// set offset for serialization
  
             beginXrfClsEe = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localXrfMvdEeCounter = -1;
     public boolean isXrfMvdEeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfMvdEeCounter != sharedCounter;
         localXrfMvdEeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of xrfMvdEe
	 *	@return xrfMvdEe
	 */
	public char[]  getXrfMvdEeString() {
	     return getCharArray(beginXrfMvdEe,XRF_MVD_EE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean xrfMvdEeIsNumeric() {
	    return isNumeric(beginXrfMvdEe
	                    ,beginXrfMvdEe + XRF_MVD_EE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int XRF_MVD_EE_LEN = 1;
  	/**
	 * serializeXrfMvdEe
	 */
	protected void serializeXrfMvdEe(int xrfMvdEe) {
		 putNumber(beginXrfMvdEe,xrfMvdEe,XRF_MVD_EE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localXrfMvdEeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeXrfMvdEe
	 */
   	protected  int serializeXrfMvdEe(char[] value) {
	    int  xrfMvdEe;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    xrfMvdEe = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginXrfMvdEe
		       ,1
		      );
		 localXrfMvdEeCounter = shareString.getSerializedField().getModifiedCounter();
		return  xrfMvdEe;
    }

   protected int checkXrfMvdEeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshXrfMvdEe is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshXrfMvdEe() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginXrfMvdEe
			                 ,XRF_MVD_EE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("xrfMvdEe", beginXrfMvdEe,XRF_MVD_EE_LEN);
    }
   	}
     int localXrfPlcyEeCounter = -1;
     public boolean isXrfPlcyEeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfPlcyEeCounter != sharedCounter;
         localXrfPlcyEeCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_PLCY_EE_LEN = 6;
	/**
	 * 	serialize this XrfPlcyEe
	 */
   protected void serializeXrfPlcyEe(char[] xrfPlcyEe) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfPlcyEe,0,getStringValue(),beginXrfPlcyEe,XRF_PLCY_EE_LEN);
       localXrfPlcyEeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfPlcyEeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshXrfPlcyEe is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfPlcyEe() {	 
   		return (substring(getStringValue(),beginXrfPlcyEe,beginXrfPlcyEe + XRF_PLCY_EE_LEN));
   	}
         int localXrfDivEeCounter = -1;
         public boolean isXrfDivEeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localXrfDivEeCounter != sharedCounter;
            localXrfDivEeCounter = sharedCounter; return hasModified; 
         }
   protected static final int XRF_DIV_EE_LEN = 2;
  	/**
	 * serializeXrfDivEe
	 */
	protected void serializeXrfDivEe(short xrfDivEe) {
           replaceValue( //  save the value as string
                   getBinaryString( xrfDivEe,XRF_DIV_EE_LEN)
                  ,beginXrfDivEe
                  ,XRF_DIV_EE_LEN
                 );
            localXrfDivEeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkXrfDivEeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshXrfDivEe is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshXrfDivEe() {	 
			return (getShort(beginXrfDivEe));
   	}
         int localXrfClsEeCounter = -1;
         public boolean isXrfClsEeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localXrfClsEeCounter != sharedCounter;
            localXrfClsEeCounter = sharedCounter; return hasModified; 
         }
   protected static final int XRF_CLS_EE_LEN = 2;
  	/**
	 * serializeXrfClsEe
	 */
	protected void serializeXrfClsEe(short xrfClsEe) {
           replaceValue( //  save the value as string
                   getBinaryString( xrfClsEe,XRF_CLS_EE_LEN)
                  ,beginXrfClsEe
                  ,XRF_CLS_EE_LEN
                 );
            localXrfClsEeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkXrfClsEeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshXrfClsEe is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshXrfClsEe() {	 
			return (getShort(beginXrfClsEe));
   	}




}
  
