package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uRetRulCpeFlgDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uRetRulCpeFlgDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uRetRulCpeFlgDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_RET_RUL_CPE_FLG_DATA_LENGTH = 1287;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginD51uRetRulCpeFlg;
           protected static final int D_51U_RET_RUL_CPE_FLG_SIZE = 99;
	
	/**
	* Constructor for D51uRetRulCpeFlgDataSerialized
	**/
    public D51uRetRulCpeFlgDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uRetRulCpeFlgDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulCpeFlgDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uRetRulCpeFlgDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,879570); // serialize this field at offset 879570 by default 
    }
    
	/**
	* sets parent for this D51uRetRulCpeFlgDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 879570 by default
    }    
	/**
	* initializes the field in D51uRetRulCpeFlgDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_RET_RUL_CPE_FLG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginD51uRetRulCpeFlg = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int d51uRetRulCpeFlgSize() {
			return D_51U_RET_RUL_CPE_FLG_SIZE;
		}



}
  
