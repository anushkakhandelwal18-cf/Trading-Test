package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class SavRecTyp1FixedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SavRecTyp1FixedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SavRecTyp1FixedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SAV_REC_TYP_1_FIXED_LENGTH = 1056;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSavNbrClminf;
            protected  int beginSavNbrHist;
            protected  int beginSavNbrOfLines;
            protected  int beginSavNbrRec4;
            protected  int beginSavNbrRec4Ins;
	
	/**
	* Constructor for SavRecTyp1FixedSerialized
	**/
    public SavRecTyp1FixedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SavRecTyp1FixedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavRecTyp1FixedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SavRecTyp1FixedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SavRecTyp1FixedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SavRecTyp1FixedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SAV_REC_TYP_1_FIXED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSavNbrClminf = getStartOffset() + 584;	// set offset for serialization
  
             beginSavNbrHist = getStartOffset() + 586;	// set offset for serialization
  
             beginSavNbrOfLines = getStartOffset() + 588;	// set offset for serialization
  
             beginSavNbrRec4 = getStartOffset() + 590;	// set offset for serialization
  
             beginSavNbrRec4Ins = getStartOffset() + 592;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localSavNbrClminfCounter = -1;
         public boolean isSavNbrClminfModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSavNbrClminfCounter != sharedCounter;
            localSavNbrClminfCounter = sharedCounter; return hasModified; 
         }
   protected static final int SAV_NBR_CLMINF_LEN = 2;
  	/**
	 * serializeSavNbrClminf
	 */
	protected void serializeSavNbrClminf(short savNbrClminf) {
           replaceValue( //  save the value as string
                   getBinaryString( savNbrClminf,SAV_NBR_CLMINF_LEN)
                  ,beginSavNbrClminf
                  ,SAV_NBR_CLMINF_LEN
                 );
            localSavNbrClminfCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSavNbrClminfMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSavNbrClminf is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSavNbrClminf() {	 
			return (getShort(beginSavNbrClminf));
   	}
         int localSavNbrHistCounter = -1;
         public boolean isSavNbrHistModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSavNbrHistCounter != sharedCounter;
            localSavNbrHistCounter = sharedCounter; return hasModified; 
         }
   protected static final int SAV_NBR_HIST_LEN = 2;
  	/**
	 * serializeSavNbrHist
	 */
	protected void serializeSavNbrHist(short savNbrHist) {
           replaceValue( //  save the value as string
                   getBinaryString( savNbrHist,SAV_NBR_HIST_LEN)
                  ,beginSavNbrHist
                  ,SAV_NBR_HIST_LEN
                 );
            localSavNbrHistCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSavNbrHistMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSavNbrHist is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSavNbrHist() {	 
			return (getShort(beginSavNbrHist));
   	}
         int localSavNbrOfLinesCounter = -1;
         public boolean isSavNbrOfLinesModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSavNbrOfLinesCounter != sharedCounter;
            localSavNbrOfLinesCounter = sharedCounter; return hasModified; 
         }
   protected static final int SAV_NBR_OF_LINES_LEN = 2;
  	/**
	 * serializeSavNbrOfLines
	 */
	protected void serializeSavNbrOfLines(short savNbrOfLines) {
           replaceValue( //  save the value as string
                   getBinaryString( savNbrOfLines,SAV_NBR_OF_LINES_LEN)
                  ,beginSavNbrOfLines
                  ,SAV_NBR_OF_LINES_LEN
                 );
            localSavNbrOfLinesCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSavNbrOfLinesMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSavNbrOfLines is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSavNbrOfLines() {	 
			return (getShort(beginSavNbrOfLines));
   	}
         int localSavNbrRec4Counter = -1;
         public boolean isSavNbrRec4Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSavNbrRec4Counter != sharedCounter;
            localSavNbrRec4Counter = sharedCounter; return hasModified; 
         }
   protected static final int SAV_NBR_REC_4_LEN = 2;
  	/**
	 * serializeSavNbrRec4
	 */
	protected void serializeSavNbrRec4(short savNbrRec4) {
           replaceValue( //  save the value as string
                   getBinaryString( savNbrRec4,SAV_NBR_REC_4_LEN)
                  ,beginSavNbrRec4
                  ,SAV_NBR_REC_4_LEN
                 );
            localSavNbrRec4Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSavNbrRec4MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSavNbrRec4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSavNbrRec4() {	 
			return (getShort(beginSavNbrRec4));
   	}
         int localSavNbrRec4InsCounter = -1;
         public boolean isSavNbrRec4InsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSavNbrRec4InsCounter != sharedCounter;
            localSavNbrRec4InsCounter = sharedCounter; return hasModified; 
         }
   protected static final int SAV_NBR_REC_4_INS_LEN = 2;
  	/**
	 * serializeSavNbrRec4Ins
	 */
	protected void serializeSavNbrRec4Ins(short savNbrRec4Ins) {
           replaceValue( //  save the value as string
                   getBinaryString( savNbrRec4Ins,SAV_NBR_REC_4_INS_LEN)
                  ,beginSavNbrRec4Ins
                  ,SAV_NBR_REC_4_INS_LEN
                 );
            localSavNbrRec4InsCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSavNbrRec4InsMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSavNbrRec4Ins is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSavNbrRec4Ins() {	 
			return (getShort(beginSavNbrRec4Ins));
   	}




}
  
