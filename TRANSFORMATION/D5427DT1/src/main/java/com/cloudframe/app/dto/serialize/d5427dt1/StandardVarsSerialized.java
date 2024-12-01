package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class StandardVarsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StandardVarsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StandardVarsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int STANDARD_VARS_LENGTH = 238;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginThisViewName;
            protected  int beginDb2Paragraph;
            protected  int beginDb2Resource;
            protected  int beginDb2Action;
            protected  int beginDsntiar01;
            protected  int beginCallingApplication;
            protected  int beginIDx;
            protected  int beginVp776a0001;
            protected  int beginCeefrst;
	
	/**
	* Constructor for StandardVarsSerialized
	**/
    public StandardVarsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in StandardVarsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(STANDARD_VARS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginThisViewName = getStartOffset() + 0;	// set offset for serialization
  
             beginDb2Paragraph = getStartOffset() + 8;	// set offset for serialization
  
             beginDb2Resource = getStartOffset() + 16;	// set offset for serialization
  
             beginDb2Action = getStartOffset() + 46;	// set offset for serialization
  
             beginDsntiar01 = getStartOffset() + 56;	// set offset for serialization
  
             beginCallingApplication = getStartOffset() + 64;	// set offset for serialization
  
             beginIDx = getStartOffset() + 72;	// set offset for serialization
  
             beginVp776a0001 = getStartOffset() + 74;	// set offset for serialization
  
  
  
  
             beginCeefrst = getStartOffset() + 214;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localThisViewNameCounter = -1;
     public boolean isThisViewNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localThisViewNameCounter != sharedCounter;
         localThisViewNameCounter = sharedCounter; return hasModified;
     }
	protected static final int THIS_VIEW_NAME_LEN = 8;
	/**
	 * 	serialize this ThisViewName
	 */
   protected void serializeThisViewName(char[] thisViewName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(thisViewName,0,getStringValue(),beginThisViewName,THIS_VIEW_NAME_LEN);
       localThisViewNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkThisViewNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshThisViewName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshThisViewName() {	 
   		return (substring(getStringValue(),beginThisViewName,beginThisViewName + THIS_VIEW_NAME_LEN));
   	}
     int localDb2ParagraphCounter = -1;
     public boolean isDb2ParagraphModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb2ParagraphCounter != sharedCounter;
         localDb2ParagraphCounter = sharedCounter; return hasModified;
     }
	protected static final int DB_2_PARAGRAPH_LEN = 8;
	/**
	 * 	serialize this Db2Paragraph
	 */
   protected void serializeDb2Paragraph(char[] db2Paragraph) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db2Paragraph,0,getStringValue(),beginDb2Paragraph,DB_2_PARAGRAPH_LEN);
       localDb2ParagraphCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb2ParagraphConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDb2Paragraph is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb2Paragraph() {	 
   		return (substring(getStringValue(),beginDb2Paragraph,beginDb2Paragraph + DB_2_PARAGRAPH_LEN));
   	}
     int localDb2ResourceCounter = -1;
     public boolean isDb2ResourceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb2ResourceCounter != sharedCounter;
         localDb2ResourceCounter = sharedCounter; return hasModified;
     }
	protected static final int DB_2_RESOURCE_LEN = 30;
	/**
	 * 	serialize this Db2Resource
	 */
   protected void serializeDb2Resource(char[] db2Resource) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db2Resource,0,getStringValue(),beginDb2Resource,DB_2_RESOURCE_LEN);
       localDb2ResourceCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb2ResourceConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshDb2Resource is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb2Resource() {	 
   		return (substring(getStringValue(),beginDb2Resource,beginDb2Resource + DB_2_RESOURCE_LEN));
   	}
     int localDb2ActionCounter = -1;
     public boolean isDb2ActionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb2ActionCounter != sharedCounter;
         localDb2ActionCounter = sharedCounter; return hasModified;
     }
	protected static final int DB_2_ACTION_LEN = 10;
	/**
	 * 	serialize this Db2Action
	 */
   protected void serializeDb2Action(char[] db2Action) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db2Action,0,getStringValue(),beginDb2Action,DB_2_ACTION_LEN);
       localDb2ActionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb2ActionConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDb2Action is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb2Action() {	 
   		return (substring(getStringValue(),beginDb2Action,beginDb2Action + DB_2_ACTION_LEN));
   	}
     int localDsntiar01Counter = -1;
     public boolean isDsntiar01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsntiar01Counter != sharedCounter;
         localDsntiar01Counter = sharedCounter; return hasModified;
     }
	protected static final int DSNTIAR_01_LEN = 8;
	/**
	 * 	serialize this Dsntiar01
	 */
   protected void serializeDsntiar01(char[] dsntiar01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dsntiar01,0,getStringValue(),beginDsntiar01,DSNTIAR_01_LEN);
       localDsntiar01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDsntiar01Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDsntiar01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDsntiar01() {	 
   		return (substring(getStringValue(),beginDsntiar01,beginDsntiar01 + DSNTIAR_01_LEN));
   	}
     int localCallingApplicationCounter = -1;
     public boolean isCallingApplicationModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCallingApplicationCounter != sharedCounter;
         localCallingApplicationCounter = sharedCounter; return hasModified;
     }
	protected static final int CALLING_APPLICATION_LEN = 8;
	/**
	 * 	serialize this CallingApplication
	 */
   protected void serializeCallingApplication(char[] callingApplication) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(callingApplication,0,getStringValue(),beginCallingApplication,CALLING_APPLICATION_LEN);
       localCallingApplicationCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCallingApplicationConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCallingApplication is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCallingApplication() {	 
   		return (substring(getStringValue(),beginCallingApplication,beginCallingApplication + CALLING_APPLICATION_LEN));
   	}
         int localIDxCounter = -1;
         public boolean isIDxModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIDxCounter != sharedCounter;
            localIDxCounter = sharedCounter; return hasModified; 
         }
   protected static final int I_DX_LEN = 2;
  	/**
	 * serializeIDx
	 */
	protected void serializeIDx(short iDx) {
           replaceValue( //  save the value as string
                   getBinaryString( iDx,I_DX_LEN)
                  ,beginIDx
                  ,I_DX_LEN
                 );
            localIDxCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIDxMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIDx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIDx() {	 
			return (getShort(beginIDx));
   	}
     int localVp776a0001Counter = -1;
     public boolean isVp776a0001Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVp776a0001Counter != sharedCounter;
         localVp776a0001Counter = sharedCounter; return hasModified;
     }
	protected static final int VP_776A_0001_LEN = 8;
	/**
	 * 	serialize this Vp776a0001
	 */
   protected void serializeVp776a0001(char[] vp776a0001) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(vp776a0001,0,getStringValue(),beginVp776a0001,VP_776A_0001_LEN);
       localVp776a0001Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVp776a0001Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshVp776a0001 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVp776a0001() {	 
   		return (substring(getStringValue(),beginVp776a0001,beginVp776a0001 + VP_776A_0001_LEN));
   	}
     int localCeefrstCounter = -1;
     public boolean isCeefrstModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCeefrstCounter != sharedCounter;
         localCeefrstCounter = sharedCounter; return hasModified;
     }
	protected static final int CEEFRST_LEN = 8;
	/**
	 * 	serialize this Ceefrst
	 */
   protected void serializeCeefrst(char[] ceefrst) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ceefrst,0,getStringValue(),beginCeefrst,CEEFRST_LEN);
       localCeefrstCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCeefrstConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCeefrst is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCeefrst() {	 
   		return (substring(getStringValue(),beginCeefrst,beginCeefrst + CEEFRST_LEN));
   	}




}
  
