package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class CurrentVariablesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurrentVariablesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurrentVariablesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CURRENT_VARIABLES_LENGTH = 52;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCurrentChannelName;
            protected  int beginCurrentContainerName;
            protected  int beginCurrentContainerLength;
            protected  int beginCurrentContainerLayout;
            protected  int beginCicsresp;
            protected  int beginCicsresp2;
	
	/**
	* Constructor for CurrentVariablesSerialized
	**/
    public CurrentVariablesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CurrentVariablesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentVariablesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CurrentVariablesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,82); // serialize this field at offset 82 by default 
    }
    
	/**
	* sets parent for this CurrentVariablesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 82 by default
    }    
	/**
	* initializes the field in CurrentVariablesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CURRENT_VARIABLES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCurrentChannelName = getStartOffset() + 0;	// set offset for serialization
  
             beginCurrentContainerName = getStartOffset() + 16;	// set offset for serialization
  
             beginCurrentContainerLength = getStartOffset() + 32;	// set offset for serialization
  
             beginCurrentContainerLayout = getStartOffset() + 36;	// set offset for serialization
  
             beginCicsresp = getStartOffset() + 44;	// set offset for serialization
  
             beginCicsresp2 = getStartOffset() + 48;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCurrentChannelNameCounter = -1;
     public boolean isCurrentChannelNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrentChannelNameCounter != sharedCounter;
         localCurrentChannelNameCounter = sharedCounter; return hasModified;
     }
	protected static final int CURRENT_CHANNEL_NAME_LEN = 16;
	/**
	 * 	serialize this CurrentChannelName
	 */
   protected void serializeCurrentChannelName(char[] currentChannelName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currentChannelName,0,getStringValue(),beginCurrentChannelName,CURRENT_CHANNEL_NAME_LEN);
       localCurrentChannelNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrentChannelNameConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshCurrentChannelName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrentChannelName() {	 
   		return (substring(getStringValue(),beginCurrentChannelName,beginCurrentChannelName + CURRENT_CHANNEL_NAME_LEN));
   	}
     int localCurrentContainerNameCounter = -1;
     public boolean isCurrentContainerNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrentContainerNameCounter != sharedCounter;
         localCurrentContainerNameCounter = sharedCounter; return hasModified;
     }
	protected static final int CURRENT_CONTAINER_NAME_LEN = 16;
	/**
	 * 	serialize this CurrentContainerName
	 */
   protected void serializeCurrentContainerName(char[] currentContainerName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currentContainerName,0,getStringValue(),beginCurrentContainerName,CURRENT_CONTAINER_NAME_LEN);
       localCurrentContainerNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrentContainerNameConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshCurrentContainerName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrentContainerName() {	 
   		return (substring(getStringValue(),beginCurrentContainerName,beginCurrentContainerName + CURRENT_CONTAINER_NAME_LEN));
   	}
         int localCurrentContainerLengthCounter = -1;
         public boolean isCurrentContainerLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCurrentContainerLengthCounter != sharedCounter;
            localCurrentContainerLengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int CURRENT_CONTAINER_LENGTH_LEN = 4;
  	/**
	 * serializeCurrentContainerLength
	 */
	protected void serializeCurrentContainerLength(int currentContainerLength) {
           replaceValue( //  save the value as string
                   getBinaryString( currentContainerLength,CURRENT_CONTAINER_LENGTH_LEN)
                  ,beginCurrentContainerLength
                  ,CURRENT_CONTAINER_LENGTH_LEN
                 );
            localCurrentContainerLengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCurrentContainerLengthMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshCurrentContainerLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCurrentContainerLength() {	 
			return (getInt(beginCurrentContainerLength));
   	}
     int localCurrentContainerLayoutCounter = -1;
     public boolean isCurrentContainerLayoutModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrentContainerLayoutCounter != sharedCounter;
         localCurrentContainerLayoutCounter = sharedCounter; return hasModified;
     }
	protected static final int CURRENT_CONTAINER_LAYOUT_LEN = 8;
	/**
	 * 	serialize this CurrentContainerLayout
	 */
   protected void serializeCurrentContainerLayout(char[] currentContainerLayout) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currentContainerLayout,0,getStringValue(),beginCurrentContainerLayout,CURRENT_CONTAINER_LAYOUT_LEN);
       localCurrentContainerLayoutCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrentContainerLayoutConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCurrentContainerLayout is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrentContainerLayout() {	 
   		return (substring(getStringValue(),beginCurrentContainerLayout,beginCurrentContainerLayout + CURRENT_CONTAINER_LAYOUT_LEN));
   	}
         int localCicsrespCounter = -1;
         public boolean isCicsrespModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCicsrespCounter != sharedCounter;
            localCicsrespCounter = sharedCounter; return hasModified; 
         }
   protected static final int CICSRESP_LEN = 4;
  	/**
	 * serializeCicsresp
	 */
	protected void serializeCicsresp(int cicsresp) {
           replaceValue( //  save the value as string
                   getBinaryString( cicsresp,CICSRESP_LEN)
                  ,beginCicsresp
                  ,CICSRESP_LEN
                 );
            localCicsrespCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCicsrespMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshCicsresp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCicsresp() {	 
			return (getInt(beginCicsresp));
   	}
         int localCicsresp2Counter = -1;
         public boolean isCicsresp2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCicsresp2Counter != sharedCounter;
            localCicsresp2Counter = sharedCounter; return hasModified; 
         }
   protected static final int CICSRESP_2_LEN = 4;
  	/**
	 * serializeCicsresp2
	 */
	protected void serializeCicsresp2(int cicsresp2) {
           replaceValue( //  save the value as string
                   getBinaryString( cicsresp2,CICSRESP_2_LEN)
                  ,beginCicsresp2
                  ,CICSRESP_2_LEN
                 );
            localCicsresp2Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCicsresp2MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshCicsresp2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCicsresp2() {	 
			return (getInt(beginCicsresp2));
   	}




}
  
