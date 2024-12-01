package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class M51uLinkageSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class M51uLinkageSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(M51uLinkageSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int M_51U_LINKAGE_LENGTH = 9345;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginUIcn51;
            protected  int beginUIoRequest51;
            protected  int beginUCauseCd51;
            protected  int beginUProvType51;
            protected  int beginUPlanVar51;
            protected  int beginUPolicyNo51;
           protected int beginUDiagnosisCode51;
           protected static final int U_DIAGNOSIS_CODE_51_SIZE = 25;
            protected  int beginUIcdVerNbr51;
            protected  int beginUMedicalClaim51;
            protected  int beginUSourceInd51;
            protected  int beginUEarliestDos51;
            protected  int beginUNbrOfLines51;
           protected int beginULineData51;
           protected static final int U_LINE_DATA_51_SIZE = 120;
            protected  int beginUCpeDescCd51;
           protected int beginUOutLineData51;
           protected static final int U_OUT_LINE_DATA_51_SIZE = 120;
            protected  int beginUStopAutoSw51;
            protected  int beginUOutCauseCd51;
            protected  int beginUSlotPlanVar51;
            protected  int beginUSlotPolicyNo51;
	
	/**
	* Constructor for M51uLinkageSerialized
	**/
    public M51uLinkageSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for M51uLinkageSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public M51uLinkageSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this M51uLinkageSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2595); // serialize this field at offset 2595 by default 
    }
    
	/**
	* sets parent for this M51uLinkageSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2595 by default
    }    
	/**
	* initializes the field in M51uLinkageSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(M_51U_LINKAGE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginUIcn51 = getStartOffset() + 0;	// set offset for serialization
  
             beginUIoRequest51 = getStartOffset() + 10;	// set offset for serialization
  
             beginUCauseCd51 = getStartOffset() + 11;	// set offset for serialization
  
             beginUProvType51 = getStartOffset() + 12;	// set offset for serialization
  
             beginUPlanVar51 = getStartOffset() + 14;	// set offset for serialization
  
             beginUPolicyNo51 = getStartOffset() + 16;	// set offset for serialization
  
	        beginUDiagnosisCode51 = getStartOffset() + 22; // set offset for serialization
  
             beginUIcdVerNbr51 = getStartOffset() + 197;	// set offset for serialization
  
             beginUMedicalClaim51 = getStartOffset() + 198;	// set offset for serialization
  
             beginUSourceInd51 = getStartOffset() + 199;	// set offset for serialization
  
             beginUEarliestDos51 = getStartOffset() + 200;	// set offset for serialization
  
             beginUNbrOfLines51 = getStartOffset() + 208;	// set offset for serialization
  
	        beginULineData51 = getStartOffset() + 211; // set offset for serialization
  
             beginUCpeDescCd51 = getStartOffset() + 4531;	// set offset for serialization
  
	        beginUOutLineData51 = getStartOffset() + 4535; // set offset for serialization
  
             beginUStopAutoSw51 = getStartOffset() + 9335;	// set offset for serialization
  
             beginUOutCauseCd51 = getStartOffset() + 9336;	// set offset for serialization
  
             beginUSlotPlanVar51 = getStartOffset() + 9337;	// set offset for serialization
  
             beginUSlotPolicyNo51 = getStartOffset() + 9339;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localUIcn51Counter = -1;
     public boolean isUIcn51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUIcn51Counter != sharedCounter;
         localUIcn51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_ICN_51_LEN = 10;
	/**
	 * 	serialize this UIcn51
	 */
   protected void serializeUIcn51(char[] uIcn51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uIcn51,0,getStringValue(),beginUIcn51,U_ICN_51_LEN);
       localUIcn51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUIcn51Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshUIcn51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUIcn51() {	 
   		return (substring(getStringValue(),beginUIcn51,beginUIcn51 + U_ICN_51_LEN));
   	}
     int localUIoRequest51Counter = -1;
     public boolean isUIoRequest51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUIoRequest51Counter != sharedCounter;
         localUIoRequest51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_IO_REQUEST_51_LEN = 1;
	/**
	 * 	serialize this UIoRequest51
	 */
   protected void serializeUIoRequest51(char[] uIoRequest51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uIoRequest51,0,getStringValue(),beginUIoRequest51,U_IO_REQUEST_51_LEN);
       localUIoRequest51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUIoRequest51Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshUIoRequest51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUIoRequest51() {	 
   		return (substring(getStringValue(),beginUIoRequest51,beginUIoRequest51 + U_IO_REQUEST_51_LEN));
   	}
     int localUCauseCd51Counter = -1;
     public boolean isUCauseCd51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUCauseCd51Counter != sharedCounter;
         localUCauseCd51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_CAUSE_CD_51_LEN = 1;
	/**
	 * 	serialize this UCauseCd51
	 */
   protected void serializeUCauseCd51(char[] uCauseCd51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uCauseCd51,0,getStringValue(),beginUCauseCd51,U_CAUSE_CD_51_LEN);
       localUCauseCd51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUCauseCd51Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshUCauseCd51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUCauseCd51() {	 
   		return (substring(getStringValue(),beginUCauseCd51,beginUCauseCd51 + U_CAUSE_CD_51_LEN));
   	}
     int localUProvType51Counter = -1;
     public boolean isUProvType51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUProvType51Counter != sharedCounter;
         localUProvType51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_PROV_TYPE_51_LEN = 2;
	/**
	 * 	serialize this UProvType51
	 */
   protected void serializeUProvType51(char[] uProvType51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uProvType51,0,getStringValue(),beginUProvType51,U_PROV_TYPE_51_LEN);
       localUProvType51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUProvType51Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshUProvType51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUProvType51() {	 
   		return (substring(getStringValue(),beginUProvType51,beginUProvType51 + U_PROV_TYPE_51_LEN));
   	}
         int localUPlanVar51Counter = -1;
         public boolean isUPlanVar51Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUPlanVar51Counter != sharedCounter;
            localUPlanVar51Counter = sharedCounter; return hasModified; 
         }
   protected static final int U_PLAN_VAR_51_LEN = 2;
  	/**
	 * serializeUPlanVar51
	 */
	protected void serializeUPlanVar51(short uPlanVar51) {
           replaceValue( //  save the value as string
                   getBinaryString( uPlanVar51,U_PLAN_VAR_51_LEN)
                  ,beginUPlanVar51
                  ,U_PLAN_VAR_51_LEN
                 );
            localUPlanVar51Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkUPlanVar51MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshUPlanVar51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshUPlanVar51() {	 
			return (getShort(beginUPlanVar51));
   	}
     int localUPolicyNo51Counter = -1;
     public boolean isUPolicyNo51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUPolicyNo51Counter != sharedCounter;
         localUPolicyNo51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_POLICY_NO_51_LEN = 6;
	/**
	 * 	serialize this UPolicyNo51
	 */
   protected void serializeUPolicyNo51(char[] uPolicyNo51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uPolicyNo51,0,getStringValue(),beginUPolicyNo51,U_POLICY_NO_51_LEN);
       localUPolicyNo51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUPolicyNo51Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshUPolicyNo51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUPolicyNo51() {	 
   		return (substring(getStringValue(),beginUPolicyNo51,beginUPolicyNo51 + U_POLICY_NO_51_LEN));
   	}
 
   
  protected  static final int U_DIAGNOSIS_CODE_51_LEN = 7;
   /**
	 *	serializeUDiagnosisCode51 as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeUDiagnosisCode51(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginUDiagnosisCode51 + index*U_DIAGNOSIS_CODE_51_LEN)
   	          , U_DIAGNOSIS_CODE_51_LEN 
   	          );
   }
     int localUIcdVerNbr51Counter = -1;
     public boolean isUIcdVerNbr51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUIcdVerNbr51Counter != sharedCounter;
         localUIcdVerNbr51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_ICD_VER_NBR_51_LEN = 1;
	/**
	 * 	serialize this UIcdVerNbr51
	 */
   protected void serializeUIcdVerNbr51(char[] uIcdVerNbr51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uIcdVerNbr51,0,getStringValue(),beginUIcdVerNbr51,U_ICD_VER_NBR_51_LEN);
       localUIcdVerNbr51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUIcdVerNbr51Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshUIcdVerNbr51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUIcdVerNbr51() {	 
   		return (substring(getStringValue(),beginUIcdVerNbr51,beginUIcdVerNbr51 + U_ICD_VER_NBR_51_LEN));
   	}
     int localUMedicalClaim51Counter = -1;
     public boolean isUMedicalClaim51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUMedicalClaim51Counter != sharedCounter;
         localUMedicalClaim51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_MEDICAL_CLAIM_51_LEN = 1;
	/**
	 * 	serialize this UMedicalClaim51
	 */
   protected void serializeUMedicalClaim51(char[] uMedicalClaim51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uMedicalClaim51,0,getStringValue(),beginUMedicalClaim51,U_MEDICAL_CLAIM_51_LEN);
       localUMedicalClaim51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUMedicalClaim51Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshUMedicalClaim51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUMedicalClaim51() {	 
   		return (substring(getStringValue(),beginUMedicalClaim51,beginUMedicalClaim51 + U_MEDICAL_CLAIM_51_LEN));
   	}
     int localUSourceInd51Counter = -1;
     public boolean isUSourceInd51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUSourceInd51Counter != sharedCounter;
         localUSourceInd51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_SOURCE_IND_51_LEN = 1;
	/**
	 * 	serialize this USourceInd51
	 */
   protected void serializeUSourceInd51(char[] uSourceInd51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uSourceInd51,0,getStringValue(),beginUSourceInd51,U_SOURCE_IND_51_LEN);
       localUSourceInd51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUSourceInd51Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshUSourceInd51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUSourceInd51() {	 
   		return (substring(getStringValue(),beginUSourceInd51,beginUSourceInd51 + U_SOURCE_IND_51_LEN));
   	}
     int localUEarliestDos51Counter = -1;
     public boolean isUEarliestDos51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUEarliestDos51Counter != sharedCounter;
         localUEarliestDos51Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of uEarliestDos51
	 *	@return uEarliestDos51
	 */
	public char[]  getUEarliestDos51String() {
	     return getCharArray(beginUEarliestDos51,U_EARLIEST_DOS_51_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean uEarliestDos51IsNumeric() {
	    return isNumeric(beginUEarliestDos51
	                    ,beginUEarliestDos51 + U_EARLIEST_DOS_51_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int U_EARLIEST_DOS_51_LEN = 8;
  	/**
	 * serializeUEarliestDos51
	 */
	protected void serializeUEarliestDos51(long uEarliestDos51) {
		 putNumber(beginUEarliestDos51,uEarliestDos51,U_EARLIEST_DOS_51_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localUEarliestDos51Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeUEarliestDos51
	 */
   	protected  long serializeUEarliestDos51(char[] value) {
	    long  uEarliestDos51;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    uEarliestDos51 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginUEarliestDos51
		       ,8
		      );
		 localUEarliestDos51Counter = shareString.getSerializedField().getModifiedCounter();
		return  uEarliestDos51;
    }

   protected long checkUEarliestDos51MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshUEarliestDos51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshUEarliestDos51() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginUEarliestDos51
			                 ,U_EARLIEST_DOS_51_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("uEarliestDos51", beginUEarliestDos51,U_EARLIEST_DOS_51_LEN);
    }
   	}
        int localUNbrOfLines51Counter = -1;
        public boolean isUNbrOfLines51Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localUNbrOfLines51Counter != sharedCounter;
           localUNbrOfLines51Counter = sharedCounter; return hasModified; 
        }
	    public boolean uNbrOfLines51IsNumeric() {
	      return decimalIsNumeric(beginUNbrOfLines51,U_NBR_OF_LINES_51_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int U_NBR_OF_LINES_51_LEN = 3;
  	/**
	 * 	serializeUNbrOfLines51
	 */
	protected void serializeUNbrOfLines51(short uNbrOfLines51) {
		   putDecimal(beginUNbrOfLines51,uNbrOfLines51,U_NBR_OF_LINES_51_LEN,true);
   }
   

   protected short checkUNbrOfLines51MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_10K /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshUNbrOfLines51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshUNbrOfLines51() throws CFException {	
   	try { 
		 return (getShortDecimal(beginUNbrOfLines51,U_NBR_OF_LINES_51_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("uNbrOfLines51", beginUNbrOfLines51,U_NBR_OF_LINES_51_LEN);
     }
   	}
     int localUCpeDescCd51Counter = -1;
     public boolean isUCpeDescCd51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUCpeDescCd51Counter != sharedCounter;
         localUCpeDescCd51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_CPE_DESC_CD_51_LEN = 4;
	/**
	 * 	serialize this UCpeDescCd51
	 */
   protected void serializeUCpeDescCd51(char[] uCpeDescCd51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uCpeDescCd51,0,getStringValue(),beginUCpeDescCd51,U_CPE_DESC_CD_51_LEN);
       localUCpeDescCd51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUCpeDescCd51Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshUCpeDescCd51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUCpeDescCd51() {	 
   		return (substring(getStringValue(),beginUCpeDescCd51,beginUCpeDescCd51 + U_CPE_DESC_CD_51_LEN));
   	}
     int localUStopAutoSw51Counter = -1;
     public boolean isUStopAutoSw51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUStopAutoSw51Counter != sharedCounter;
         localUStopAutoSw51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_STOP_AUTO_SW_51_LEN = 1;
	/**
	 * 	serialize this UStopAutoSw51
	 */
   protected void serializeUStopAutoSw51(char[] uStopAutoSw51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uStopAutoSw51,0,getStringValue(),beginUStopAutoSw51,U_STOP_AUTO_SW_51_LEN);
       localUStopAutoSw51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUStopAutoSw51Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshUStopAutoSw51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUStopAutoSw51() {	 
   		return (substring(getStringValue(),beginUStopAutoSw51,beginUStopAutoSw51 + U_STOP_AUTO_SW_51_LEN));
   	}
     int localUOutCauseCd51Counter = -1;
     public boolean isUOutCauseCd51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUOutCauseCd51Counter != sharedCounter;
         localUOutCauseCd51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_OUT_CAUSE_CD_51_LEN = 1;
	/**
	 * 	serialize this UOutCauseCd51
	 */
   protected void serializeUOutCauseCd51(char[] uOutCauseCd51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uOutCauseCd51,0,getStringValue(),beginUOutCauseCd51,U_OUT_CAUSE_CD_51_LEN);
       localUOutCauseCd51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUOutCauseCd51Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshUOutCauseCd51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUOutCauseCd51() {	 
   		return (substring(getStringValue(),beginUOutCauseCd51,beginUOutCauseCd51 + U_OUT_CAUSE_CD_51_LEN));
   	}
         int localUSlotPlanVar51Counter = -1;
         public boolean isUSlotPlanVar51Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUSlotPlanVar51Counter != sharedCounter;
            localUSlotPlanVar51Counter = sharedCounter; return hasModified; 
         }
   protected static final int U_SLOT_PLAN_VAR_51_LEN = 2;
  	/**
	 * serializeUSlotPlanVar51
	 */
	protected void serializeUSlotPlanVar51(short uSlotPlanVar51) {
           replaceValue( //  save the value as string
                   getBinaryString( uSlotPlanVar51,U_SLOT_PLAN_VAR_51_LEN)
                  ,beginUSlotPlanVar51
                  ,U_SLOT_PLAN_VAR_51_LEN
                 );
            localUSlotPlanVar51Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkUSlotPlanVar51MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshUSlotPlanVar51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshUSlotPlanVar51() {	 
			return (getShort(beginUSlotPlanVar51));
   	}
     int localUSlotPolicyNo51Counter = -1;
     public boolean isUSlotPolicyNo51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUSlotPolicyNo51Counter != sharedCounter;
         localUSlotPolicyNo51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_SLOT_POLICY_NO_51_LEN = 6;
	/**
	 * 	serialize this USlotPolicyNo51
	 */
   protected void serializeUSlotPolicyNo51(char[] uSlotPolicyNo51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uSlotPolicyNo51,0,getStringValue(),beginUSlotPolicyNo51,U_SLOT_POLICY_NO_51_LEN);
       localUSlotPolicyNo51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUSlotPolicyNo51Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshUSlotPolicyNo51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUSlotPolicyNo51() {	 
   		return (substring(getStringValue(),beginUSlotPolicyNo51,beginUSlotPolicyNo51 + U_SLOT_POLICY_NO_51_LEN));
   	}

		public int uDiagnosisCode51Size() {
			return U_DIAGNOSIS_CODE_51_SIZE;
		}
		public int uLineData51Size() {
			return U_LINE_DATA_51_SIZE;
		}
		public int uOutLineData51Size() {
			return U_OUT_LINE_DATA_51_SIZE;
		}



}
  
