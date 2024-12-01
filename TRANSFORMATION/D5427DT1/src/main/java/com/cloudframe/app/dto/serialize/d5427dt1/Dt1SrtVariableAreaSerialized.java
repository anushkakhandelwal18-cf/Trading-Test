package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class Dt1SrtVariableAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Dt1SrtVariableAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Dt1SrtVariableAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_1_SRT_VARIABLE_AREA_LENGTH = 59200;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Dt1SrtVariableAreaSerialized
	**/
    public Dt1SrtVariableAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Dt1SrtVariableAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1SrtVariableAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Dt1SrtVariableAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this Dt1SrtVariableAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in Dt1SrtVariableAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_1_SRT_VARIABLE_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  74);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  74);
     }
}
  
