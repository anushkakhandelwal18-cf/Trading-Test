package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class HoldTransData2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HoldTransData2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HoldTransData2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HOLD_TRANS_DATA_2_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFcndPs;
            protected  int beginFcndSvc;
            protected  int beginFcndCauseCd;
            protected  int beginFrtoPs;
            protected  int beginFrtoSvc;
            protected  int beginFrtoCauseCd;
            protected  int beginPtypPs;
            protected  int beginPtypSvc;
            protected  int beginPtypCauseCd;
            protected  int beginRicdPs;
            protected  int beginRicdSvc;
            protected  int beginRicdCauseCd;
            protected  int beginCausPs;
            protected  int beginCausSvc;
            protected  int beginCausCauseCd;
            protected  int beginRipaPs;
            protected  int beginRipaSvc;
            protected  int beginRipaCauseCd;
            protected  int beginCflgPs;
            protected  int beginCflgSvc;
            protected  int beginCflgCauseCd;
	
	/**
	* Constructor for HoldTransData2Serialized
	**/
    public HoldTransData2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HoldTransData2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HoldTransData2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HoldTransData2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,200018); // serialize this field at offset 200018 by default 
    }
    
	/**
	* sets parent for this HoldTransData2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 200018 by default
    }    
	/**
	* initializes the field in HoldTransData2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HOLD_TRANS_DATA_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFcndPs = getStartOffset() + 0;	// set offset for serialization
  
             beginFcndSvc = getStartOffset() + 2;	// set offset for serialization
  
             beginFcndCauseCd = getStartOffset() + 8;	// set offset for serialization
  
             beginFrtoPs = getStartOffset() + 9;	// set offset for serialization
  
             beginFrtoSvc = getStartOffset() + 11;	// set offset for serialization
  
             beginFrtoCauseCd = getStartOffset() + 17;	// set offset for serialization
  
             beginPtypPs = getStartOffset() + 18;	// set offset for serialization
  
             beginPtypSvc = getStartOffset() + 20;	// set offset for serialization
  
             beginPtypCauseCd = getStartOffset() + 26;	// set offset for serialization
  
             beginRicdPs = getStartOffset() + 27;	// set offset for serialization
  
             beginRicdSvc = getStartOffset() + 29;	// set offset for serialization
  
             beginRicdCauseCd = getStartOffset() + 35;	// set offset for serialization
  
             beginCausPs = getStartOffset() + 36;	// set offset for serialization
  
             beginCausSvc = getStartOffset() + 38;	// set offset for serialization
  
             beginCausCauseCd = getStartOffset() + 44;	// set offset for serialization
  
             beginRipaPs = getStartOffset() + 45;	// set offset for serialization
  
             beginRipaSvc = getStartOffset() + 47;	// set offset for serialization
  
             beginRipaCauseCd = getStartOffset() + 53;	// set offset for serialization
  
             beginCflgPs = getStartOffset() + 54;	// set offset for serialization
  
             beginCflgSvc = getStartOffset() + 56;	// set offset for serialization
  
             beginCflgCauseCd = getStartOffset() + 62;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFcndPsCounter = -1;
     public boolean isFcndPsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFcndPsCounter != sharedCounter;
         localFcndPsCounter = sharedCounter; return hasModified;
     }
	protected static final int FCND_PS_LEN = 2;
	/**
	 * 	serialize this FcndPs
	 */
   protected void serializeFcndPs(char[] fcndPs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fcndPs,0,getStringValue(),beginFcndPs,FCND_PS_LEN);
       localFcndPsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFcndPsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFcndPs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFcndPs() {	 
   		return (substring(getStringValue(),beginFcndPs,beginFcndPs + FCND_PS_LEN));
   	}
     int localFcndSvcCounter = -1;
     public boolean isFcndSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFcndSvcCounter != sharedCounter;
         localFcndSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int FCND_SVC_LEN = 6;
	/**
	 * 	serialize this FcndSvc
	 */
   protected void serializeFcndSvc(char[] fcndSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fcndSvc,0,getStringValue(),beginFcndSvc,FCND_SVC_LEN);
       localFcndSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFcndSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshFcndSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFcndSvc() {	 
   		return (substring(getStringValue(),beginFcndSvc,beginFcndSvc + FCND_SVC_LEN));
   	}
     int localFcndCauseCdCounter = -1;
     public boolean isFcndCauseCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFcndCauseCdCounter != sharedCounter;
         localFcndCauseCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FCND_CAUSE_CD_LEN = 1;
	/**
	 * 	serialize this FcndCauseCd
	 */
   protected void serializeFcndCauseCd(char[] fcndCauseCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fcndCauseCd,0,getStringValue(),beginFcndCauseCd,FCND_CAUSE_CD_LEN);
       localFcndCauseCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFcndCauseCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFcndCauseCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFcndCauseCd() {	 
   		return (substring(getStringValue(),beginFcndCauseCd,beginFcndCauseCd + FCND_CAUSE_CD_LEN));
   	}
     int localFrtoPsCounter = -1;
     public boolean isFrtoPsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFrtoPsCounter != sharedCounter;
         localFrtoPsCounter = sharedCounter; return hasModified;
     }
	protected static final int FRTO_PS_LEN = 2;
	/**
	 * 	serialize this FrtoPs
	 */
   protected void serializeFrtoPs(char[] frtoPs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(frtoPs,0,getStringValue(),beginFrtoPs,FRTO_PS_LEN);
       localFrtoPsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFrtoPsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFrtoPs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFrtoPs() {	 
   		return (substring(getStringValue(),beginFrtoPs,beginFrtoPs + FRTO_PS_LEN));
   	}
     int localFrtoSvcCounter = -1;
     public boolean isFrtoSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFrtoSvcCounter != sharedCounter;
         localFrtoSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int FRTO_SVC_LEN = 6;
	/**
	 * 	serialize this FrtoSvc
	 */
   protected void serializeFrtoSvc(char[] frtoSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(frtoSvc,0,getStringValue(),beginFrtoSvc,FRTO_SVC_LEN);
       localFrtoSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFrtoSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshFrtoSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFrtoSvc() {	 
   		return (substring(getStringValue(),beginFrtoSvc,beginFrtoSvc + FRTO_SVC_LEN));
   	}
     int localFrtoCauseCdCounter = -1;
     public boolean isFrtoCauseCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFrtoCauseCdCounter != sharedCounter;
         localFrtoCauseCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FRTO_CAUSE_CD_LEN = 1;
	/**
	 * 	serialize this FrtoCauseCd
	 */
   protected void serializeFrtoCauseCd(char[] frtoCauseCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(frtoCauseCd,0,getStringValue(),beginFrtoCauseCd,FRTO_CAUSE_CD_LEN);
       localFrtoCauseCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFrtoCauseCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFrtoCauseCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFrtoCauseCd() {	 
   		return (substring(getStringValue(),beginFrtoCauseCd,beginFrtoCauseCd + FRTO_CAUSE_CD_LEN));
   	}
     int localPtypPsCounter = -1;
     public boolean isPtypPsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtypPsCounter != sharedCounter;
         localPtypPsCounter = sharedCounter; return hasModified;
     }
	protected static final int PTYP_PS_LEN = 2;
	/**
	 * 	serialize this PtypPs
	 */
   protected void serializePtypPs(char[] ptypPs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptypPs,0,getStringValue(),beginPtypPs,PTYP_PS_LEN);
       localPtypPsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtypPsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshPtypPs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtypPs() {	 
   		return (substring(getStringValue(),beginPtypPs,beginPtypPs + PTYP_PS_LEN));
   	}
     int localPtypSvcCounter = -1;
     public boolean isPtypSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtypSvcCounter != sharedCounter;
         localPtypSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int PTYP_SVC_LEN = 6;
	/**
	 * 	serialize this PtypSvc
	 */
   protected void serializePtypSvc(char[] ptypSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptypSvc,0,getStringValue(),beginPtypSvc,PTYP_SVC_LEN);
       localPtypSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtypSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshPtypSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtypSvc() {	 
   		return (substring(getStringValue(),beginPtypSvc,beginPtypSvc + PTYP_SVC_LEN));
   	}
     int localPtypCauseCdCounter = -1;
     public boolean isPtypCauseCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtypCauseCdCounter != sharedCounter;
         localPtypCauseCdCounter = sharedCounter; return hasModified;
     }
	protected static final int PTYP_CAUSE_CD_LEN = 1;
	/**
	 * 	serialize this PtypCauseCd
	 */
   protected void serializePtypCauseCd(char[] ptypCauseCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptypCauseCd,0,getStringValue(),beginPtypCauseCd,PTYP_CAUSE_CD_LEN);
       localPtypCauseCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtypCauseCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshPtypCauseCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtypCauseCd() {	 
   		return (substring(getStringValue(),beginPtypCauseCd,beginPtypCauseCd + PTYP_CAUSE_CD_LEN));
   	}
     int localRicdPsCounter = -1;
     public boolean isRicdPsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRicdPsCounter != sharedCounter;
         localRicdPsCounter = sharedCounter; return hasModified;
     }
	protected static final int RICD_PS_LEN = 2;
	/**
	 * 	serialize this RicdPs
	 */
   protected void serializeRicdPs(char[] ricdPs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ricdPs,0,getStringValue(),beginRicdPs,RICD_PS_LEN);
       localRicdPsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRicdPsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRicdPs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRicdPs() {	 
   		return (substring(getStringValue(),beginRicdPs,beginRicdPs + RICD_PS_LEN));
   	}
     int localRicdSvcCounter = -1;
     public boolean isRicdSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRicdSvcCounter != sharedCounter;
         localRicdSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int RICD_SVC_LEN = 6;
	/**
	 * 	serialize this RicdSvc
	 */
   protected void serializeRicdSvc(char[] ricdSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ricdSvc,0,getStringValue(),beginRicdSvc,RICD_SVC_LEN);
       localRicdSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRicdSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRicdSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRicdSvc() {	 
   		return (substring(getStringValue(),beginRicdSvc,beginRicdSvc + RICD_SVC_LEN));
   	}
     int localRicdCauseCdCounter = -1;
     public boolean isRicdCauseCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRicdCauseCdCounter != sharedCounter;
         localRicdCauseCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RICD_CAUSE_CD_LEN = 1;
	/**
	 * 	serialize this RicdCauseCd
	 */
   protected void serializeRicdCauseCd(char[] ricdCauseCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ricdCauseCd,0,getStringValue(),beginRicdCauseCd,RICD_CAUSE_CD_LEN);
       localRicdCauseCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRicdCauseCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRicdCauseCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRicdCauseCd() {	 
   		return (substring(getStringValue(),beginRicdCauseCd,beginRicdCauseCd + RICD_CAUSE_CD_LEN));
   	}
     int localCausPsCounter = -1;
     public boolean isCausPsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausPsCounter != sharedCounter;
         localCausPsCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_PS_LEN = 2;
	/**
	 * 	serialize this CausPs
	 */
   protected void serializeCausPs(char[] causPs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causPs,0,getStringValue(),beginCausPs,CAUS_PS_LEN);
       localCausPsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausPsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCausPs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausPs() {	 
   		return (substring(getStringValue(),beginCausPs,beginCausPs + CAUS_PS_LEN));
   	}
     int localCausSvcCounter = -1;
     public boolean isCausSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausSvcCounter != sharedCounter;
         localCausSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_SVC_LEN = 6;
	/**
	 * 	serialize this CausSvc
	 */
   protected void serializeCausSvc(char[] causSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causSvc,0,getStringValue(),beginCausSvc,CAUS_SVC_LEN);
       localCausSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshCausSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausSvc() {	 
   		return (substring(getStringValue(),beginCausSvc,beginCausSvc + CAUS_SVC_LEN));
   	}
     int localCausCauseCdCounter = -1;
     public boolean isCausCauseCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausCauseCdCounter != sharedCounter;
         localCausCauseCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_CAUSE_CD_LEN = 1;
	/**
	 * 	serialize this CausCauseCd
	 */
   protected void serializeCausCauseCd(char[] causCauseCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causCauseCd,0,getStringValue(),beginCausCauseCd,CAUS_CAUSE_CD_LEN);
       localCausCauseCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausCauseCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCausCauseCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausCauseCd() {	 
   		return (substring(getStringValue(),beginCausCauseCd,beginCausCauseCd + CAUS_CAUSE_CD_LEN));
   	}
     int localRipaPsCounter = -1;
     public boolean isRipaPsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRipaPsCounter != sharedCounter;
         localRipaPsCounter = sharedCounter; return hasModified;
     }
	protected static final int RIPA_PS_LEN = 2;
	/**
	 * 	serialize this RipaPs
	 */
   protected void serializeRipaPs(char[] ripaPs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ripaPs,0,getStringValue(),beginRipaPs,RIPA_PS_LEN);
       localRipaPsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRipaPsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRipaPs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRipaPs() {	 
   		return (substring(getStringValue(),beginRipaPs,beginRipaPs + RIPA_PS_LEN));
   	}
     int localRipaSvcCounter = -1;
     public boolean isRipaSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRipaSvcCounter != sharedCounter;
         localRipaSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int RIPA_SVC_LEN = 6;
	/**
	 * 	serialize this RipaSvc
	 */
   protected void serializeRipaSvc(char[] ripaSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ripaSvc,0,getStringValue(),beginRipaSvc,RIPA_SVC_LEN);
       localRipaSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRipaSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRipaSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRipaSvc() {	 
   		return (substring(getStringValue(),beginRipaSvc,beginRipaSvc + RIPA_SVC_LEN));
   	}
     int localRipaCauseCdCounter = -1;
     public boolean isRipaCauseCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRipaCauseCdCounter != sharedCounter;
         localRipaCauseCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RIPA_CAUSE_CD_LEN = 1;
	/**
	 * 	serialize this RipaCauseCd
	 */
   protected void serializeRipaCauseCd(char[] ripaCauseCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ripaCauseCd,0,getStringValue(),beginRipaCauseCd,RIPA_CAUSE_CD_LEN);
       localRipaCauseCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRipaCauseCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRipaCauseCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRipaCauseCd() {	 
   		return (substring(getStringValue(),beginRipaCauseCd,beginRipaCauseCd + RIPA_CAUSE_CD_LEN));
   	}
     int localCflgPsCounter = -1;
     public boolean isCflgPsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCflgPsCounter != sharedCounter;
         localCflgPsCounter = sharedCounter; return hasModified;
     }
	protected static final int CFLG_PS_LEN = 2;
	/**
	 * 	serialize this CflgPs
	 */
   protected void serializeCflgPs(char[] cflgPs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cflgPs,0,getStringValue(),beginCflgPs,CFLG_PS_LEN);
       localCflgPsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCflgPsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCflgPs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCflgPs() {	 
   		return (substring(getStringValue(),beginCflgPs,beginCflgPs + CFLG_PS_LEN));
   	}
     int localCflgSvcCounter = -1;
     public boolean isCflgSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCflgSvcCounter != sharedCounter;
         localCflgSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int CFLG_SVC_LEN = 6;
	/**
	 * 	serialize this CflgSvc
	 */
   protected void serializeCflgSvc(char[] cflgSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cflgSvc,0,getStringValue(),beginCflgSvc,CFLG_SVC_LEN);
       localCflgSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCflgSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshCflgSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCflgSvc() {	 
   		return (substring(getStringValue(),beginCflgSvc,beginCflgSvc + CFLG_SVC_LEN));
   	}
     int localCflgCauseCdCounter = -1;
     public boolean isCflgCauseCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCflgCauseCdCounter != sharedCounter;
         localCflgCauseCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CFLG_CAUSE_CD_LEN = 1;
	/**
	 * 	serialize this CflgCauseCd
	 */
   protected void serializeCflgCauseCd(char[] cflgCauseCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cflgCauseCd,0,getStringValue(),beginCflgCauseCd,CFLG_CAUSE_CD_LEN);
       localCflgCauseCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCflgCauseCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCflgCauseCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCflgCauseCd() {	 
   		return (substring(getStringValue(),beginCflgCauseCd,beginCflgCauseCd + CFLG_CAUSE_CD_LEN));
   	}




}
  
