package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class D51uRetRulIpaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uRetRulIpaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uRetRulIpaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_RET_RUL_IPA_LENGTH = 3663;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginD51uRetRuleIpa;
           protected static final int D_51U_RET_RULE_IPA_SIZE = 99;
	
	/**
	* Constructor for D51uRetRulIpaSerialized
	**/
    public D51uRetRulIpaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uRetRulIpaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulIpaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uRetRulIpaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,633060); // serialize this field at offset 633060 by default 
    }
    
	/**
	* sets parent for this D51uRetRulIpaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 633060 by default
    }    
	/**
	* initializes the field in D51uRetRulIpaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_RET_RUL_IPA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginD51uRetRuleIpa = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int d51uRetRuleIpaSize() {
			return D_51U_RET_RULE_IPA_SIZE;
		}



}
  
