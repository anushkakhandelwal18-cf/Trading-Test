package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class PointSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PointSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PointSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int POINT_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPoint1;
            protected  int beginPoint2;
            protected  int beginPoint3;
            protected  int beginPoint4;
	
	/**
	* Constructor for PointSerialized
	**/
    public PointSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PointSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PointSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PointSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,200087); // serialize this field at offset 200087 by default 
    }
    
	/**
	* sets parent for this PointSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 200087 by default
    }    
	/**
	* initializes the field in PointSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(POINT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPoint1 = getStartOffset() + 0;	// set offset for serialization
  
             beginPoint2 = getStartOffset() + 2;	// set offset for serialization
  
             beginPoint3 = getStartOffset() + 4;	// set offset for serialization
  
             beginPoint4 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPoint1Counter = -1;
     public boolean isPoint1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPoint1Counter != sharedCounter;
         localPoint1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of point1
	 *	@return point1
	 */
	public char[]  getPoint1String() {
	     return getCharArray(beginPoint1,POINT_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean point1IsNumeric() {
	    return isNumeric(beginPoint1
	                    ,beginPoint1 + POINT_1_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int POINT_1_LEN = 2;
  	/**
	 * serializePoint1
	 */
	protected void serializePoint1(int point1) {
		 putNumber(beginPoint1,point1,POINT_1_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPoint1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePoint1
	 */
   	protected  int serializePoint1(char[] value) {
	    int  point1;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    point1 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPoint1
		       ,2
		      );
		 localPoint1Counter = shareString.getSerializedField().getModifiedCounter();
		return  point1;
    }

   protected int checkPoint1MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPoint1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPoint1() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPoint1
			                 ,POINT_1_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("point1", beginPoint1,POINT_1_LEN);
    }
   	}
     int localPoint2Counter = -1;
     public boolean isPoint2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPoint2Counter != sharedCounter;
         localPoint2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of point2
	 *	@return point2
	 */
	public char[]  getPoint2String() {
	     return getCharArray(beginPoint2,POINT_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean point2IsNumeric() {
	    return isNumeric(beginPoint2
	                    ,beginPoint2 + POINT_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int POINT_2_LEN = 2;
  	/**
	 * serializePoint2
	 */
	protected void serializePoint2(int point2) {
		 putNumber(beginPoint2,point2,POINT_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPoint2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePoint2
	 */
   	protected  int serializePoint2(char[] value) {
	    int  point2;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    point2 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPoint2
		       ,2
		      );
		 localPoint2Counter = shareString.getSerializedField().getModifiedCounter();
		return  point2;
    }

   protected int checkPoint2MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPoint2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPoint2() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPoint2
			                 ,POINT_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("point2", beginPoint2,POINT_2_LEN);
    }
   	}
     int localPoint3Counter = -1;
     public boolean isPoint3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPoint3Counter != sharedCounter;
         localPoint3Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of point3
	 *	@return point3
	 */
	public char[]  getPoint3String() {
	     return getCharArray(beginPoint3,POINT_3_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean point3IsNumeric() {
	    return isNumeric(beginPoint3
	                    ,beginPoint3 + POINT_3_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int POINT_3_LEN = 2;
  	/**
	 * serializePoint3
	 */
	protected void serializePoint3(int point3) {
		 putNumber(beginPoint3,point3,POINT_3_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPoint3Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePoint3
	 */
   	protected  int serializePoint3(char[] value) {
	    int  point3;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    point3 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPoint3
		       ,2
		      );
		 localPoint3Counter = shareString.getSerializedField().getModifiedCounter();
		return  point3;
    }

   protected int checkPoint3MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPoint3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPoint3() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPoint3
			                 ,POINT_3_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("point3", beginPoint3,POINT_3_LEN);
    }
   	}
     int localPoint4Counter = -1;
     public boolean isPoint4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPoint4Counter != sharedCounter;
         localPoint4Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of point4
	 *	@return point4
	 */
	public char[]  getPoint4String() {
	     return getCharArray(beginPoint4,POINT_4_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean point4IsNumeric() {
	    return isNumeric(beginPoint4
	                    ,beginPoint4 + POINT_4_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int POINT_4_LEN = 2;
  	/**
	 * serializePoint4
	 */
	protected void serializePoint4(int point4) {
		 putNumber(beginPoint4,point4,POINT_4_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPoint4Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePoint4
	 */
   	protected  int serializePoint4(char[] value) {
	    int  point4;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    point4 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPoint4
		       ,2
		      );
		 localPoint4Counter = shareString.getSerializedField().getModifiedCounter();
		return  point4;
    }

   protected int checkPoint4MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPoint4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPoint4() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPoint4
			                 ,POINT_4_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("point4", beginPoint4,POINT_4_LEN);
    }
   	}




}
  
