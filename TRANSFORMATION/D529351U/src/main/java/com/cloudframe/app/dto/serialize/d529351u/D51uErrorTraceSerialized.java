package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uErrorTraceSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uErrorTraceSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uErrorTraceSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_ERROR_TRACE_LENGTH = 23;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginD51uSqlOrRespCd;
            protected  int beginD51uDebugTracer;
            protected  int beginD51uParagraphNum;
	
	/**
	* Constructor for D51uErrorTraceSerialized
	**/
    public D51uErrorTraceSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uErrorTraceSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uErrorTraceSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uErrorTraceSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,268); // serialize this field at offset 268 by default 
    }
    
	/**
	* sets parent for this D51uErrorTraceSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 268 by default
    }    
	/**
	* initializes the field in D51uErrorTraceSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_ERROR_TRACE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginD51uSqlOrRespCd = getStartOffset() + 0;	// set offset for serialization
  
             beginD51uDebugTracer = getStartOffset() + 10;	// set offset for serialization
  
             beginD51uParagraphNum = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localD51uSqlOrRespCdCounter = -1;
     public boolean isD51uSqlOrRespCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uSqlOrRespCdCounter != sharedCounter;
         localD51uSqlOrRespCdCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_SQL_OR_RESP_CD_LEN = 10;
	/**
	 * 	serialize this D51uSqlOrRespCd
	 */
   protected void serializeD51uSqlOrRespCd(char[] d51uSqlOrRespCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uSqlOrRespCd,0,getStringValue(),beginD51uSqlOrRespCd,D_51U_SQL_OR_RESP_CD_LEN);
       localD51uSqlOrRespCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uSqlOrRespCdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshD51uSqlOrRespCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uSqlOrRespCd() {	 
   		return (substring(getStringValue(),beginD51uSqlOrRespCd,beginD51uSqlOrRespCd + D_51U_SQL_OR_RESP_CD_LEN));
   	}
     int localD51uDebugTracerCounter = -1;
     public boolean isD51uDebugTracerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uDebugTracerCounter != sharedCounter;
         localD51uDebugTracerCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_DEBUG_TRACER_LEN = 8;
	/**
	 * 	serialize this D51uDebugTracer
	 */
   protected void serializeD51uDebugTracer(char[] d51uDebugTracer) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uDebugTracer,0,getStringValue(),beginD51uDebugTracer,D_51U_DEBUG_TRACER_LEN);
       localD51uDebugTracerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uDebugTracerConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshD51uDebugTracer is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uDebugTracer() {	 
   		return (substring(getStringValue(),beginD51uDebugTracer,beginD51uDebugTracer + D_51U_DEBUG_TRACER_LEN));
   	}
     int localD51uParagraphNumCounter = -1;
     public boolean isD51uParagraphNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uParagraphNumCounter != sharedCounter;
         localD51uParagraphNumCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_PARAGRAPH_NUM_LEN = 5;
	/**
	 * 	serialize this D51uParagraphNum
	 */
   protected void serializeD51uParagraphNum(char[] d51uParagraphNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uParagraphNum,0,getStringValue(),beginD51uParagraphNum,D_51U_PARAGRAPH_NUM_LEN);
       localD51uParagraphNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uParagraphNumConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshD51uParagraphNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uParagraphNum() {	 
   		return (substring(getStringValue(),beginD51uParagraphNum,beginD51uParagraphNum + D_51U_PARAGRAPH_NUM_LEN));
   	}




}
  
