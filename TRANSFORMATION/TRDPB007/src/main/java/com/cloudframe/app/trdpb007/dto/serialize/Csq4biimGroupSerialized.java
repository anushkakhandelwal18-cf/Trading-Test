package com.cloudframe.app.trdpb007.dto.serialize;

/**
*  The class Csq4biimGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-21 at 09:21. using version 5.0.0.153
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Csq4biimGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Csq4biimGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CSQ_4BIIM_GROUP_LENGTH = 105;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCsq4biimName;
            protected  int beginCsq4biimSocsecno1;
            protected  int beginCsq4biimSocsecno2;
            protected  int beginCsq4biimSocsecno3;
            protected  int beginCsq4biimBankname;
            protected  int beginCsq4biimBankacname;
            protected  int beginCsq4biimBankacnum;
            protected  int beginCsq4biimLoanreq;
	
	/**
	* Constructor for Csq4biimGroupSerialized
	**/
    public Csq4biimGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Csq4biimGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Csq4biimGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Csq4biimGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this Csq4biimGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in Csq4biimGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CSQ_4BIIM_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCsq4biimName = getStartOffset() + 0;	// set offset for serialization
  
             beginCsq4biimSocsecno1 = getStartOffset() + 20;	// set offset for serialization
  
             beginCsq4biimSocsecno2 = getStartOffset() + 23;	// set offset for serialization
  
             beginCsq4biimSocsecno3 = getStartOffset() + 25;	// set offset for serialization
  
             beginCsq4biimBankname = getStartOffset() + 29;	// set offset for serialization
  
             beginCsq4biimBankacname = getStartOffset() + 59;	// set offset for serialization
  
             beginCsq4biimBankacnum = getStartOffset() + 89;	// set offset for serialization
  
             beginCsq4biimLoanreq = getStartOffset() + 99;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCsq4biimNameCounter = -1;
     public boolean isCsq4biimNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCsq4biimNameCounter != sharedCounter;
         localCsq4biimNameCounter = sharedCounter; return hasModified;
     }
	protected static final int CSQ_4BIIM_NAME_LEN = 20;
	/**
	 * 	serialize this Csq4biimName
	 */
   protected void serializeCsq4biimName(char[] csq4biimName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(csq4biimName,0,getStringValue(),beginCsq4biimName,CSQ_4BIIM_NAME_LEN);
       localCsq4biimNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCsq4biimNameConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshCsq4biimName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCsq4biimName() {	 
   		return (substring(getStringValue(),beginCsq4biimName,beginCsq4biimName + CSQ_4BIIM_NAME_LEN));
   	}
     int localCsq4biimSocsecno1Counter = -1;
     public boolean isCsq4biimSocsecno1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCsq4biimSocsecno1Counter != sharedCounter;
         localCsq4biimSocsecno1Counter = sharedCounter; return hasModified;
     }
	protected static final int CSQ_4BIIM_SOCSECNO_1_LEN = 3;
	/**
	 * 	serialize this Csq4biimSocsecno1
	 */
   protected void serializeCsq4biimSocsecno1(char[] csq4biimSocsecno1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(csq4biimSocsecno1,0,getStringValue(),beginCsq4biimSocsecno1,CSQ_4BIIM_SOCSECNO_1_LEN);
       localCsq4biimSocsecno1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCsq4biimSocsecno1Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCsq4biimSocsecno1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCsq4biimSocsecno1() {	 
   		return (substring(getStringValue(),beginCsq4biimSocsecno1,beginCsq4biimSocsecno1 + CSQ_4BIIM_SOCSECNO_1_LEN));
   	}
     int localCsq4biimSocsecno2Counter = -1;
     public boolean isCsq4biimSocsecno2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCsq4biimSocsecno2Counter != sharedCounter;
         localCsq4biimSocsecno2Counter = sharedCounter; return hasModified;
     }
	protected static final int CSQ_4BIIM_SOCSECNO_2_LEN = 2;
	/**
	 * 	serialize this Csq4biimSocsecno2
	 */
   protected void serializeCsq4biimSocsecno2(char[] csq4biimSocsecno2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(csq4biimSocsecno2,0,getStringValue(),beginCsq4biimSocsecno2,CSQ_4BIIM_SOCSECNO_2_LEN);
       localCsq4biimSocsecno2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCsq4biimSocsecno2Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCsq4biimSocsecno2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCsq4biimSocsecno2() {	 
   		return (substring(getStringValue(),beginCsq4biimSocsecno2,beginCsq4biimSocsecno2 + CSQ_4BIIM_SOCSECNO_2_LEN));
   	}
     int localCsq4biimSocsecno3Counter = -1;
     public boolean isCsq4biimSocsecno3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCsq4biimSocsecno3Counter != sharedCounter;
         localCsq4biimSocsecno3Counter = sharedCounter; return hasModified;
     }
	protected static final int CSQ_4BIIM_SOCSECNO_3_LEN = 4;
	/**
	 * 	serialize this Csq4biimSocsecno3
	 */
   protected void serializeCsq4biimSocsecno3(char[] csq4biimSocsecno3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(csq4biimSocsecno3,0,getStringValue(),beginCsq4biimSocsecno3,CSQ_4BIIM_SOCSECNO_3_LEN);
       localCsq4biimSocsecno3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCsq4biimSocsecno3Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshCsq4biimSocsecno3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCsq4biimSocsecno3() {	 
   		return (substring(getStringValue(),beginCsq4biimSocsecno3,beginCsq4biimSocsecno3 + CSQ_4BIIM_SOCSECNO_3_LEN));
   	}
     int localCsq4biimBanknameCounter = -1;
     public boolean isCsq4biimBanknameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCsq4biimBanknameCounter != sharedCounter;
         localCsq4biimBanknameCounter = sharedCounter; return hasModified;
     }
	protected static final int CSQ_4BIIM_BANKNAME_LEN = 30;
	/**
	 * 	serialize this Csq4biimBankname
	 */
   protected void serializeCsq4biimBankname(char[] csq4biimBankname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(csq4biimBankname,0,getStringValue(),beginCsq4biimBankname,CSQ_4BIIM_BANKNAME_LEN);
       localCsq4biimBanknameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCsq4biimBanknameConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshCsq4biimBankname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCsq4biimBankname() {	 
   		return (substring(getStringValue(),beginCsq4biimBankname,beginCsq4biimBankname + CSQ_4BIIM_BANKNAME_LEN));
   	}
     int localCsq4biimBankacnameCounter = -1;
     public boolean isCsq4biimBankacnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCsq4biimBankacnameCounter != sharedCounter;
         localCsq4biimBankacnameCounter = sharedCounter; return hasModified;
     }
	protected static final int CSQ_4BIIM_BANKACNAME_LEN = 30;
	/**
	 * 	serialize this Csq4biimBankacname
	 */
   protected void serializeCsq4biimBankacname(char[] csq4biimBankacname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(csq4biimBankacname,0,getStringValue(),beginCsq4biimBankacname,CSQ_4BIIM_BANKACNAME_LEN);
       localCsq4biimBankacnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCsq4biimBankacnameConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshCsq4biimBankacname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCsq4biimBankacname() {	 
   		return (substring(getStringValue(),beginCsq4biimBankacname,beginCsq4biimBankacname + CSQ_4BIIM_BANKACNAME_LEN));
   	}
     int localCsq4biimBankacnumCounter = -1;
     public boolean isCsq4biimBankacnumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCsq4biimBankacnumCounter != sharedCounter;
         localCsq4biimBankacnumCounter = sharedCounter; return hasModified;
     }
	protected static final int CSQ_4BIIM_BANKACNUM_LEN = 10;
	/**
	 * 	serialize this Csq4biimBankacnum
	 */
   protected void serializeCsq4biimBankacnum(char[] csq4biimBankacnum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(csq4biimBankacnum,0,getStringValue(),beginCsq4biimBankacnum,CSQ_4BIIM_BANKACNUM_LEN);
       localCsq4biimBankacnumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCsq4biimBankacnumConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCsq4biimBankacnum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCsq4biimBankacnum() {	 
   		return (substring(getStringValue(),beginCsq4biimBankacnum,beginCsq4biimBankacnum + CSQ_4BIIM_BANKACNUM_LEN));
   	}
     int localCsq4biimLoanreqCounter = -1;
     public boolean isCsq4biimLoanreqModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCsq4biimLoanreqCounter != sharedCounter;
         localCsq4biimLoanreqCounter = sharedCounter; return hasModified;
     }
	protected static final int CSQ_4BIIM_LOANREQ_LEN = 6;
	/**
	 * 	serialize this Csq4biimLoanreq
	 */
   protected void serializeCsq4biimLoanreq(char[] csq4biimLoanreq) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(csq4biimLoanreq,0,getStringValue(),beginCsq4biimLoanreq,CSQ_4BIIM_LOANREQ_LEN);
       localCsq4biimLoanreqCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCsq4biimLoanreqConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshCsq4biimLoanreq is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCsq4biimLoanreq() {	 
   		return (substring(getStringValue(),beginCsq4biimLoanreq,beginCsq4biimLoanreq + CSQ_4BIIM_LOANREQ_LEN));
   	}




}
  
