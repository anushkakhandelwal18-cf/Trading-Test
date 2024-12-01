package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class SavDiagnosisCodePoaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SavDiagnosisCodePoaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SavDiagnosisCodePoaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SAV_DIAGNOSIS_CODE_POA_LENGTH = 54;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSavDiagnosisCode;
           protected static final int SAV_DIAGNOSIS_CODE_SIZE = 9;
	
	/**
	* Constructor for SavDiagnosisCodePoaSerialized
	**/
    public SavDiagnosisCodePoaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SavDiagnosisCodePoaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavDiagnosisCodePoaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SavDiagnosisCodePoaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,121); // serialize this field at offset 121 by default 
    }
    
	/**
	* sets parent for this SavDiagnosisCodePoaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 121 by default
    }    
	/**
	* initializes the field in SavDiagnosisCodePoaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SAV_DIAGNOSIS_CODE_POA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSavDiagnosisCode = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int SAV_DIAGNOSIS_CODE_LEN = 6;
   /**
	 *	serializeSavDiagnosisCode as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeSavDiagnosisCode(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginSavDiagnosisCode + index*SAV_DIAGNOSIS_CODE_LEN)
   	          , SAV_DIAGNOSIS_CODE_LEN 
   	          );
   }

		public int savDiagnosisCodeSize() {
			return SAV_DIAGNOSIS_CODE_SIZE;
		}



}
  
