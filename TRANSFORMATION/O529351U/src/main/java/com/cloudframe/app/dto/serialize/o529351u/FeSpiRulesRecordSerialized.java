package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class FeSpiRulesRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FeSpiRulesRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FeSpiRulesRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FE_SPI_RULES_RECORD_LENGTH = 4263;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginFesrFromCondPs;
           protected static final int FESR_FROM_COND_PS_SIZE = 30;
           protected int beginFesrFromCondFrToSvc;
           protected static final int FESR_FROM_COND_FR_TO_SVC_SIZE = 198;
           protected int beginFesrFromCondPrvTyp;
           protected static final int FESR_FROM_COND_PRV_TYP_SIZE = 80;
           protected int beginFesrFromCondFrToIcd9;
           protected static final int FESR_FROM_COND_FR_TO_ICD_9_SIZE = 100;
           protected int beginFesrFromCondCause;
           protected static final int FESR_FROM_COND_CAUSE_SIZE = 7;
           protected int beginFesrIpaCode;
           protected static final int FESR_IPA_CODE_SIZE = 3;
	
	/**
	* Constructor for FeSpiRulesRecordSerialized
	**/
    public FeSpiRulesRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FeSpiRulesRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FE_SPI_RULES_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	        beginFesrFromCondPs = getStartOffset() + 27; // set offset for serialization
  
	        beginFesrFromCondFrToSvc = getStartOffset() + 117; // set offset for serialization
  
	        beginFesrFromCondPrvTyp = getStartOffset() + 3087; // set offset for serialization
  
	        beginFesrFromCondFrToIcd9 = getStartOffset() + 3247; // set offset for serialization
  
	        beginFesrFromCondCause = getStartOffset() + 4247; // set offset for serialization
  
	        beginFesrIpaCode = getStartOffset() + 4254; // set offset for serialization
  
	   /*  end of offset */
	}

		public int fesrFromCondPsSize() {
			return FESR_FROM_COND_PS_SIZE;
		}
		public int fesrFromCondFrToSvcSize() {
			return FESR_FROM_COND_FR_TO_SVC_SIZE;
		}
		public int fesrFromCondPrvTypSize() {
			return FESR_FROM_COND_PRV_TYP_SIZE;
		}
		public int fesrFromCondFrToIcd9Size() {
			return FESR_FROM_COND_FR_TO_ICD_9_SIZE;
		}
		public int fesrFromCondCauseSize() {
			return FESR_FROM_COND_CAUSE_SIZE;
		}
		public int fesrIpaCodeSize() {
			return FESR_IPA_CODE_SIZE;
		}



}
  
