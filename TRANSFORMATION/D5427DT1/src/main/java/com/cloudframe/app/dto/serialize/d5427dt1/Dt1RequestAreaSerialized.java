package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class Dt1RequestAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Dt1RequestAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Dt1RequestAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_1_REQUEST_AREA_LENGTH = 400;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt1ReqViewName;
            protected  int beginDt1ReqViewVersionNbr;
            protected  int beginDt1ReqSearchType;
            protected  int beginDt1ReqEmpid;
            protected  int beginDt1ReqPolicy;
            protected  int beginDt1ReqDepNbr;
            protected  int beginDt1ReqFirstName;
            protected  int beginDt1ReqRel;
            protected  int beginDt1ReqSystem;
            protected  int beginDt1ReqFilmOffice;
            protected  int beginDt1ReqFln;
            protected  int beginDt1ReqIcn;
            protected  int beginDt1ReqFirstServiceDate;
            protected  int beginDt1ReqLastServiceDate;
            protected  int beginDt1ReqProviderTin;
            protected  int beginDt1ReqFundingResp;
            protected  int beginDt1ReqAuthNbr;
            protected  int beginDt1ReqServiceCategory;
           protected int beginDt1ReqSpiCategoryCd;
           protected static final int DT_1_REQ_SPI_CATEGORY_CD_SIZE = 5;
            protected  int beginDt1ReqNextKey;
            protected  int beginDt1ReqClmItemsRequested;
            protected  int beginDt1ReqCptFrom;
            protected  int beginDt1ReqCptThru;
            protected  int beginDt1ReqRevFrom;
            protected  int beginDt1ReqRevThru;
            protected  int beginDt1ReqRemarkCd;
            protected  int beginDt1ReqProvSpclCd;
            protected  int beginDt1ReqCauseCd;
            protected  int beginDt1ReqAppliedToOopInd;
            protected  int beginDt1ReqFillerArea;
	
	/**
	* Constructor for Dt1RequestAreaSerialized
	**/
    public Dt1RequestAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Dt1RequestAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1RequestAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Dt1RequestAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Dt1RequestAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Dt1RequestAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_1_REQUEST_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt1ReqViewName = getStartOffset() + 0;	// set offset for serialization
  
             beginDt1ReqViewVersionNbr = getStartOffset() + 8;	// set offset for serialization
  
             beginDt1ReqSearchType = getStartOffset() + 10;	// set offset for serialization
  
             beginDt1ReqEmpid = getStartOffset() + 11;	// set offset for serialization
  
             beginDt1ReqPolicy = getStartOffset() + 21;	// set offset for serialization
  
             beginDt1ReqDepNbr = getStartOffset() + 27;	// set offset for serialization
  
             beginDt1ReqFirstName = getStartOffset() + 30;	// set offset for serialization
  
             beginDt1ReqRel = getStartOffset() + 46;	// set offset for serialization
  
             beginDt1ReqSystem = getStartOffset() + 48;	// set offset for serialization
  
             beginDt1ReqFilmOffice = getStartOffset() + 49;	// set offset for serialization
  
             beginDt1ReqFln = getStartOffset() + 52;	// set offset for serialization
  
             beginDt1ReqIcn = getStartOffset() + 62;	// set offset for serialization
  
             beginDt1ReqFirstServiceDate = getStartOffset() + 72;	// set offset for serialization
  
             beginDt1ReqLastServiceDate = getStartOffset() + 80;	// set offset for serialization
  
             beginDt1ReqProviderTin = getStartOffset() + 88;	// set offset for serialization
  
             beginDt1ReqFundingResp = getStartOffset() + 97;	// set offset for serialization
  
             beginDt1ReqAuthNbr = getStartOffset() + 98;	// set offset for serialization
  
             beginDt1ReqServiceCategory = getStartOffset() + 148;	// set offset for serialization
  
	        beginDt1ReqSpiCategoryCd = getStartOffset() + 150; // set offset for serialization
  
             beginDt1ReqNextKey = getStartOffset() + 160;	// set offset for serialization
  
             beginDt1ReqClmItemsRequested = getStartOffset() + 240;	// set offset for serialization
  
             beginDt1ReqCptFrom = getStartOffset() + 245;	// set offset for serialization
  
             beginDt1ReqCptThru = getStartOffset() + 252;	// set offset for serialization
  
             beginDt1ReqRevFrom = getStartOffset() + 259;	// set offset for serialization
  
             beginDt1ReqRevThru = getStartOffset() + 264;	// set offset for serialization
  
             beginDt1ReqRemarkCd = getStartOffset() + 269;	// set offset for serialization
  
             beginDt1ReqProvSpclCd = getStartOffset() + 271;	// set offset for serialization
  
             beginDt1ReqCauseCd = getStartOffset() + 274;	// set offset for serialization
  
             beginDt1ReqAppliedToOopInd = getStartOffset() + 275;	// set offset for serialization
  
             beginDt1ReqFillerArea = getStartOffset() + 276;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDt1ReqViewNameCounter = -1;
     public boolean isDt1ReqViewNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqViewNameCounter != sharedCounter;
         localDt1ReqViewNameCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_VIEW_NAME_LEN = 8;
	/**
	 * 	serialize this Dt1ReqViewName
	 */
   protected void serializeDt1ReqViewName(char[] dt1ReqViewName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqViewName,0,getStringValue(),beginDt1ReqViewName,DT_1_REQ_VIEW_NAME_LEN);
       localDt1ReqViewNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqViewNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDt1ReqViewName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqViewName() {	 
   		return (substring(getStringValue(),beginDt1ReqViewName,beginDt1ReqViewName + DT_1_REQ_VIEW_NAME_LEN));
   	}
     int localDt1ReqViewVersionNbrCounter = -1;
     public boolean isDt1ReqViewVersionNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqViewVersionNbrCounter != sharedCounter;
         localDt1ReqViewVersionNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_VIEW_VERSION_NBR_LEN = 2;
	/**
	 * 	serialize this Dt1ReqViewVersionNbr
	 */
   protected void serializeDt1ReqViewVersionNbr(char[] dt1ReqViewVersionNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqViewVersionNbr,0,getStringValue(),beginDt1ReqViewVersionNbr,DT_1_REQ_VIEW_VERSION_NBR_LEN);
       localDt1ReqViewVersionNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqViewVersionNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt1ReqViewVersionNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqViewVersionNbr() {	 
   		return (substring(getStringValue(),beginDt1ReqViewVersionNbr,beginDt1ReqViewVersionNbr + DT_1_REQ_VIEW_VERSION_NBR_LEN));
   	}
     int localDt1ReqSearchTypeCounter = -1;
     public boolean isDt1ReqSearchTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqSearchTypeCounter != sharedCounter;
         localDt1ReqSearchTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_SEARCH_TYPE_LEN = 1;
	/**
	 * 	serialize this Dt1ReqSearchType
	 */
   protected void serializeDt1ReqSearchType(char[] dt1ReqSearchType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqSearchType,0,getStringValue(),beginDt1ReqSearchType,DT_1_REQ_SEARCH_TYPE_LEN);
       localDt1ReqSearchTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqSearchTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ReqSearchType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqSearchType() {	 
   		return (substring(getStringValue(),beginDt1ReqSearchType,beginDt1ReqSearchType + DT_1_REQ_SEARCH_TYPE_LEN));
   	}
     int localDt1ReqEmpidCounter = -1;
     public boolean isDt1ReqEmpidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqEmpidCounter != sharedCounter;
         localDt1ReqEmpidCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_EMPID_LEN = 10;
	/**
	 * 	serialize this Dt1ReqEmpid
	 */
   protected void serializeDt1ReqEmpid(char[] dt1ReqEmpid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqEmpid,0,getStringValue(),beginDt1ReqEmpid,DT_1_REQ_EMPID_LEN);
       localDt1ReqEmpidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqEmpidConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDt1ReqEmpid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqEmpid() {	 
   		return (substring(getStringValue(),beginDt1ReqEmpid,beginDt1ReqEmpid + DT_1_REQ_EMPID_LEN));
   	}
     int localDt1ReqPolicyCounter = -1;
     public boolean isDt1ReqPolicyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqPolicyCounter != sharedCounter;
         localDt1ReqPolicyCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_POLICY_LEN = 6;
	/**
	 * 	serialize this Dt1ReqPolicy
	 */
   protected void serializeDt1ReqPolicy(char[] dt1ReqPolicy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqPolicy,0,getStringValue(),beginDt1ReqPolicy,DT_1_REQ_POLICY_LEN);
       localDt1ReqPolicyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqPolicyConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshDt1ReqPolicy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqPolicy() {	 
   		return (substring(getStringValue(),beginDt1ReqPolicy,beginDt1ReqPolicy + DT_1_REQ_POLICY_LEN));
   	}
     int localDt1ReqDepNbrCounter = -1;
     public boolean isDt1ReqDepNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqDepNbrCounter != sharedCounter;
         localDt1ReqDepNbrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ReqDepNbr
	 *	@return dt1ReqDepNbr
	 */
	public char[]  getDt1ReqDepNbrString() {
	     return getCharArray(beginDt1ReqDepNbr,DT_1_REQ_DEP_NBR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ReqDepNbrIsNumeric() {
	    return isNumeric(beginDt1ReqDepNbr
	                    ,beginDt1ReqDepNbr + DT_1_REQ_DEP_NBR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_REQ_DEP_NBR_LEN = 3;
  	/**
	 * serializeDt1ReqDepNbr
	 */
	protected void serializeDt1ReqDepNbr(int dt1ReqDepNbr) {
		 putNumber(beginDt1ReqDepNbr,dt1ReqDepNbr,DT_1_REQ_DEP_NBR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ReqDepNbrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ReqDepNbr
	 */
   	protected  int serializeDt1ReqDepNbr(char[] value) {
	    int  dt1ReqDepNbr;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ReqDepNbr = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginDt1ReqDepNbr
		       ,3
		      );
		 localDt1ReqDepNbrCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ReqDepNbr;
    }

   protected int checkDt1ReqDepNbrMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ReqDepNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1ReqDepNbr() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1ReqDepNbr
			                 ,DT_1_REQ_DEP_NBR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ReqDepNbr", beginDt1ReqDepNbr,DT_1_REQ_DEP_NBR_LEN);
    }
   	}
     int localDt1ReqFirstNameCounter = -1;
     public boolean isDt1ReqFirstNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqFirstNameCounter != sharedCounter;
         localDt1ReqFirstNameCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_FIRST_NAME_LEN = 16;
	/**
	 * 	serialize this Dt1ReqFirstName
	 */
   protected void serializeDt1ReqFirstName(char[] dt1ReqFirstName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqFirstName,0,getStringValue(),beginDt1ReqFirstName,DT_1_REQ_FIRST_NAME_LEN);
       localDt1ReqFirstNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqFirstNameConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshDt1ReqFirstName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqFirstName() {	 
   		return (substring(getStringValue(),beginDt1ReqFirstName,beginDt1ReqFirstName + DT_1_REQ_FIRST_NAME_LEN));
   	}
     int localDt1ReqRelCounter = -1;
     public boolean isDt1ReqRelModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqRelCounter != sharedCounter;
         localDt1ReqRelCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_REL_LEN = 2;
	/**
	 * 	serialize this Dt1ReqRel
	 */
   protected void serializeDt1ReqRel(char[] dt1ReqRel) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqRel,0,getStringValue(),beginDt1ReqRel,DT_1_REQ_REL_LEN);
       localDt1ReqRelCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqRelConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt1ReqRel is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqRel() {	 
   		return (substring(getStringValue(),beginDt1ReqRel,beginDt1ReqRel + DT_1_REQ_REL_LEN));
   	}
     int localDt1ReqSystemCounter = -1;
     public boolean isDt1ReqSystemModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqSystemCounter != sharedCounter;
         localDt1ReqSystemCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_SYSTEM_LEN = 1;
	/**
	 * 	serialize this Dt1ReqSystem
	 */
   protected void serializeDt1ReqSystem(char[] dt1ReqSystem) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqSystem,0,getStringValue(),beginDt1ReqSystem,DT_1_REQ_SYSTEM_LEN);
       localDt1ReqSystemCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqSystemConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ReqSystem is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqSystem() {	 
   		return (substring(getStringValue(),beginDt1ReqSystem,beginDt1ReqSystem + DT_1_REQ_SYSTEM_LEN));
   	}
     int localDt1ReqFilmOfficeCounter = -1;
     public boolean isDt1ReqFilmOfficeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqFilmOfficeCounter != sharedCounter;
         localDt1ReqFilmOfficeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ReqFilmOffice
	 *	@return dt1ReqFilmOffice
	 */
	public char[]  getDt1ReqFilmOfficeString() {
	     return getCharArray(beginDt1ReqFilmOffice,DT_1_REQ_FILM_OFFICE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ReqFilmOfficeIsNumeric() {
	    return isNumeric(beginDt1ReqFilmOffice
	                    ,beginDt1ReqFilmOffice + DT_1_REQ_FILM_OFFICE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_REQ_FILM_OFFICE_LEN = 3;
  	/**
	 * serializeDt1ReqFilmOffice
	 */
	protected void serializeDt1ReqFilmOffice(int dt1ReqFilmOffice) {
		 putNumber(beginDt1ReqFilmOffice,dt1ReqFilmOffice,DT_1_REQ_FILM_OFFICE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ReqFilmOfficeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ReqFilmOffice
	 */
   	protected  int serializeDt1ReqFilmOffice(char[] value) {
	    int  dt1ReqFilmOffice;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ReqFilmOffice = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginDt1ReqFilmOffice
		       ,3
		      );
		 localDt1ReqFilmOfficeCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ReqFilmOffice;
    }

   protected int checkDt1ReqFilmOfficeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ReqFilmOffice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1ReqFilmOffice() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1ReqFilmOffice
			                 ,DT_1_REQ_FILM_OFFICE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ReqFilmOffice", beginDt1ReqFilmOffice,DT_1_REQ_FILM_OFFICE_LEN);
    }
   	}
     int localDt1ReqFlnCounter = -1;
     public boolean isDt1ReqFlnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqFlnCounter != sharedCounter;
         localDt1ReqFlnCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ReqFln
	 *	@return dt1ReqFln
	 */
	public char[]  getDt1ReqFlnString() {
	     return getCharArray(beginDt1ReqFln,DT_1_REQ_FLN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ReqFlnIsNumeric() {
	    return isNumeric(beginDt1ReqFln
	                    ,beginDt1ReqFln + DT_1_REQ_FLN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_REQ_FLN_LEN = 10;
  	/**
	 * serializeDt1ReqFln
	 */
	protected void serializeDt1ReqFln(long dt1ReqFln) {
		 putNumber(beginDt1ReqFln,dt1ReqFln,DT_1_REQ_FLN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ReqFlnCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ReqFln
	 */
   	protected  long serializeDt1ReqFln(char[] value) {
	    long  dt1ReqFln;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ReqFln = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginDt1ReqFln
		       ,10
		      );
		 localDt1ReqFlnCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ReqFln;
    }

   protected long checkDt1ReqFlnMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ReqFln is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1ReqFln() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDt1ReqFln
			                 ,DT_1_REQ_FLN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ReqFln", beginDt1ReqFln,DT_1_REQ_FLN_LEN);
    }
   	}
     int localDt1ReqIcnCounter = -1;
     public boolean isDt1ReqIcnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqIcnCounter != sharedCounter;
         localDt1ReqIcnCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_ICN_LEN = 10;
	/**
	 * 	serialize this Dt1ReqIcn
	 */
   protected void serializeDt1ReqIcn(char[] dt1ReqIcn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqIcn,0,getStringValue(),beginDt1ReqIcn,DT_1_REQ_ICN_LEN);
       localDt1ReqIcnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqIcnConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDt1ReqIcn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqIcn() {	 
   		return (substring(getStringValue(),beginDt1ReqIcn,beginDt1ReqIcn + DT_1_REQ_ICN_LEN));
   	}
     int localDt1ReqFirstServiceDateCounter = -1;
     public boolean isDt1ReqFirstServiceDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqFirstServiceDateCounter != sharedCounter;
         localDt1ReqFirstServiceDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ReqFirstServiceDate
	 *	@return dt1ReqFirstServiceDate
	 */
	public char[]  getDt1ReqFirstServiceDateString() {
	     return getCharArray(beginDt1ReqFirstServiceDate,DT_1_REQ_FIRST_SERVICE_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ReqFirstServiceDateIsNumeric() {
	    return isNumeric(beginDt1ReqFirstServiceDate
	                    ,beginDt1ReqFirstServiceDate + DT_1_REQ_FIRST_SERVICE_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_REQ_FIRST_SERVICE_DATE_LEN = 8;
  	/**
	 * serializeDt1ReqFirstServiceDate
	 */
	protected void serializeDt1ReqFirstServiceDate(long dt1ReqFirstServiceDate) {
		 putNumber(beginDt1ReqFirstServiceDate,dt1ReqFirstServiceDate,DT_1_REQ_FIRST_SERVICE_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ReqFirstServiceDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ReqFirstServiceDate
	 */
   	protected  long serializeDt1ReqFirstServiceDate(char[] value) {
	    long  dt1ReqFirstServiceDate;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ReqFirstServiceDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginDt1ReqFirstServiceDate
		       ,8
		      );
		 localDt1ReqFirstServiceDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ReqFirstServiceDate;
    }

   protected long checkDt1ReqFirstServiceDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ReqFirstServiceDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1ReqFirstServiceDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDt1ReqFirstServiceDate
			                 ,DT_1_REQ_FIRST_SERVICE_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ReqFirstServiceDate", beginDt1ReqFirstServiceDate,DT_1_REQ_FIRST_SERVICE_DATE_LEN);
    }
   	}
     int localDt1ReqLastServiceDateCounter = -1;
     public boolean isDt1ReqLastServiceDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqLastServiceDateCounter != sharedCounter;
         localDt1ReqLastServiceDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ReqLastServiceDate
	 *	@return dt1ReqLastServiceDate
	 */
	public char[]  getDt1ReqLastServiceDateString() {
	     return getCharArray(beginDt1ReqLastServiceDate,DT_1_REQ_LAST_SERVICE_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ReqLastServiceDateIsNumeric() {
	    return isNumeric(beginDt1ReqLastServiceDate
	                    ,beginDt1ReqLastServiceDate + DT_1_REQ_LAST_SERVICE_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_REQ_LAST_SERVICE_DATE_LEN = 8;
  	/**
	 * serializeDt1ReqLastServiceDate
	 */
	protected void serializeDt1ReqLastServiceDate(long dt1ReqLastServiceDate) {
		 putNumber(beginDt1ReqLastServiceDate,dt1ReqLastServiceDate,DT_1_REQ_LAST_SERVICE_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ReqLastServiceDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ReqLastServiceDate
	 */
   	protected  long serializeDt1ReqLastServiceDate(char[] value) {
	    long  dt1ReqLastServiceDate;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ReqLastServiceDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginDt1ReqLastServiceDate
		       ,8
		      );
		 localDt1ReqLastServiceDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ReqLastServiceDate;
    }

   protected long checkDt1ReqLastServiceDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ReqLastServiceDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1ReqLastServiceDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDt1ReqLastServiceDate
			                 ,DT_1_REQ_LAST_SERVICE_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ReqLastServiceDate", beginDt1ReqLastServiceDate,DT_1_REQ_LAST_SERVICE_DATE_LEN);
    }
   	}
     int localDt1ReqProviderTinCounter = -1;
     public boolean isDt1ReqProviderTinModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqProviderTinCounter != sharedCounter;
         localDt1ReqProviderTinCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ReqProviderTin
	 *	@return dt1ReqProviderTin
	 */
	public char[]  getDt1ReqProviderTinString() {
	     return getCharArray(beginDt1ReqProviderTin,DT_1_REQ_PROVIDER_TIN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ReqProviderTinIsNumeric() {
	    return isNumeric(beginDt1ReqProviderTin
	                    ,beginDt1ReqProviderTin + DT_1_REQ_PROVIDER_TIN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_REQ_PROVIDER_TIN_LEN = 9;
  	/**
	 * serializeDt1ReqProviderTin
	 */
	protected void serializeDt1ReqProviderTin(long dt1ReqProviderTin) {
		 putNumber(beginDt1ReqProviderTin,dt1ReqProviderTin,DT_1_REQ_PROVIDER_TIN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ReqProviderTinCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ReqProviderTin
	 */
   	protected  long serializeDt1ReqProviderTin(char[] value) {
	    long  dt1ReqProviderTin;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ReqProviderTin = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginDt1ReqProviderTin
		       ,9
		      );
		 localDt1ReqProviderTinCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ReqProviderTin;
    }

   protected long checkDt1ReqProviderTinMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ReqProviderTin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1ReqProviderTin() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDt1ReqProviderTin
			                 ,DT_1_REQ_PROVIDER_TIN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ReqProviderTin", beginDt1ReqProviderTin,DT_1_REQ_PROVIDER_TIN_LEN);
    }
   	}
     int localDt1ReqFundingRespCounter = -1;
     public boolean isDt1ReqFundingRespModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqFundingRespCounter != sharedCounter;
         localDt1ReqFundingRespCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_FUNDING_RESP_LEN = 1;
	/**
	 * 	serialize this Dt1ReqFundingResp
	 */
   protected void serializeDt1ReqFundingResp(char[] dt1ReqFundingResp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqFundingResp,0,getStringValue(),beginDt1ReqFundingResp,DT_1_REQ_FUNDING_RESP_LEN);
       localDt1ReqFundingRespCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqFundingRespConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ReqFundingResp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqFundingResp() {	 
   		return (substring(getStringValue(),beginDt1ReqFundingResp,beginDt1ReqFundingResp + DT_1_REQ_FUNDING_RESP_LEN));
   	}
     int localDt1ReqAuthNbrCounter = -1;
     public boolean isDt1ReqAuthNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqAuthNbrCounter != sharedCounter;
         localDt1ReqAuthNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_AUTH_NBR_LEN = 50;
	/**
	 * 	serialize this Dt1ReqAuthNbr
	 */
   protected void serializeDt1ReqAuthNbr(char[] dt1ReqAuthNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqAuthNbr,0,getStringValue(),beginDt1ReqAuthNbr,DT_1_REQ_AUTH_NBR_LEN);
       localDt1ReqAuthNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqAuthNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshDt1ReqAuthNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqAuthNbr() {	 
   		return (substring(getStringValue(),beginDt1ReqAuthNbr,beginDt1ReqAuthNbr + DT_1_REQ_AUTH_NBR_LEN));
   	}
     int localDt1ReqServiceCategoryCounter = -1;
     public boolean isDt1ReqServiceCategoryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqServiceCategoryCounter != sharedCounter;
         localDt1ReqServiceCategoryCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_SERVICE_CATEGORY_LEN = 2;
	/**
	 * 	serialize this Dt1ReqServiceCategory
	 */
   protected void serializeDt1ReqServiceCategory(char[] dt1ReqServiceCategory) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqServiceCategory,0,getStringValue(),beginDt1ReqServiceCategory,DT_1_REQ_SERVICE_CATEGORY_LEN);
       localDt1ReqServiceCategoryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqServiceCategoryConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt1ReqServiceCategory is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqServiceCategory() {	 
   		return (substring(getStringValue(),beginDt1ReqServiceCategory,beginDt1ReqServiceCategory + DT_1_REQ_SERVICE_CATEGORY_LEN));
   	}
 
   
  protected  static final int DT_1_REQ_SPI_CATEGORY_CD_LEN = 2;
   /**
	 *	serializeDt1ReqSpiCategoryCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeDt1ReqSpiCategoryCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginDt1ReqSpiCategoryCd + index*DT_1_REQ_SPI_CATEGORY_CD_LEN)
   	          , DT_1_REQ_SPI_CATEGORY_CD_LEN 
   	          );
   }
     int localDt1ReqNextKeyCounter = -1;
     public boolean isDt1ReqNextKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqNextKeyCounter != sharedCounter;
         localDt1ReqNextKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_NEXT_KEY_LEN = 80;
	/**
	 * 	serialize this Dt1ReqNextKey
	 */
   protected void serializeDt1ReqNextKey(char[] dt1ReqNextKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqNextKey,0,getStringValue(),beginDt1ReqNextKey,DT_1_REQ_NEXT_KEY_LEN);
       localDt1ReqNextKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqNextKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshDt1ReqNextKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqNextKey() {	 
   		return (substring(getStringValue(),beginDt1ReqNextKey,beginDt1ReqNextKey + DT_1_REQ_NEXT_KEY_LEN));
   	}
     int localDt1ReqClmItemsRequestedCounter = -1;
     public boolean isDt1ReqClmItemsRequestedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqClmItemsRequestedCounter != sharedCounter;
         localDt1ReqClmItemsRequestedCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_CLM_ITEMS_REQUESTED_LEN = 5;
	/**
	 * 	serialize this Dt1ReqClmItemsRequested
	 */
   protected void serializeDt1ReqClmItemsRequested(char[] dt1ReqClmItemsRequested) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqClmItemsRequested,0,getStringValue(),beginDt1ReqClmItemsRequested,DT_1_REQ_CLM_ITEMS_REQUESTED_LEN);
       localDt1ReqClmItemsRequestedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqClmItemsRequestedConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshDt1ReqClmItemsRequested is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqClmItemsRequested() {	 
   		return (substring(getStringValue(),beginDt1ReqClmItemsRequested,beginDt1ReqClmItemsRequested + DT_1_REQ_CLM_ITEMS_REQUESTED_LEN));
   	}
     int localDt1ReqCptFromCounter = -1;
     public boolean isDt1ReqCptFromModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqCptFromCounter != sharedCounter;
         localDt1ReqCptFromCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_CPT_FROM_LEN = 7;
	/**
	 * 	serialize this Dt1ReqCptFrom
	 */
   protected void serializeDt1ReqCptFrom(char[] dt1ReqCptFrom) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqCptFrom,0,getStringValue(),beginDt1ReqCptFrom,DT_1_REQ_CPT_FROM_LEN);
       localDt1ReqCptFromCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqCptFromConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshDt1ReqCptFrom is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqCptFrom() {	 
   		return (substring(getStringValue(),beginDt1ReqCptFrom,beginDt1ReqCptFrom + DT_1_REQ_CPT_FROM_LEN));
   	}
     int localDt1ReqCptThruCounter = -1;
     public boolean isDt1ReqCptThruModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqCptThruCounter != sharedCounter;
         localDt1ReqCptThruCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_CPT_THRU_LEN = 7;
	/**
	 * 	serialize this Dt1ReqCptThru
	 */
   protected void serializeDt1ReqCptThru(char[] dt1ReqCptThru) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqCptThru,0,getStringValue(),beginDt1ReqCptThru,DT_1_REQ_CPT_THRU_LEN);
       localDt1ReqCptThruCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqCptThruConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshDt1ReqCptThru is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqCptThru() {	 
   		return (substring(getStringValue(),beginDt1ReqCptThru,beginDt1ReqCptThru + DT_1_REQ_CPT_THRU_LEN));
   	}
     int localDt1ReqRevFromCounter = -1;
     public boolean isDt1ReqRevFromModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqRevFromCounter != sharedCounter;
         localDt1ReqRevFromCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_REV_FROM_LEN = 5;
	/**
	 * 	serialize this Dt1ReqRevFrom
	 */
   protected void serializeDt1ReqRevFrom(char[] dt1ReqRevFrom) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqRevFrom,0,getStringValue(),beginDt1ReqRevFrom,DT_1_REQ_REV_FROM_LEN);
       localDt1ReqRevFromCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqRevFromConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshDt1ReqRevFrom is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqRevFrom() {	 
   		return (substring(getStringValue(),beginDt1ReqRevFrom,beginDt1ReqRevFrom + DT_1_REQ_REV_FROM_LEN));
   	}
     int localDt1ReqRevThruCounter = -1;
     public boolean isDt1ReqRevThruModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqRevThruCounter != sharedCounter;
         localDt1ReqRevThruCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_REV_THRU_LEN = 5;
	/**
	 * 	serialize this Dt1ReqRevThru
	 */
   protected void serializeDt1ReqRevThru(char[] dt1ReqRevThru) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqRevThru,0,getStringValue(),beginDt1ReqRevThru,DT_1_REQ_REV_THRU_LEN);
       localDt1ReqRevThruCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqRevThruConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshDt1ReqRevThru is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqRevThru() {	 
   		return (substring(getStringValue(),beginDt1ReqRevThru,beginDt1ReqRevThru + DT_1_REQ_REV_THRU_LEN));
   	}
     int localDt1ReqRemarkCdCounter = -1;
     public boolean isDt1ReqRemarkCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqRemarkCdCounter != sharedCounter;
         localDt1ReqRemarkCdCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_REMARK_CD_LEN = 2;
	/**
	 * 	serialize this Dt1ReqRemarkCd
	 */
   protected void serializeDt1ReqRemarkCd(char[] dt1ReqRemarkCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqRemarkCd,0,getStringValue(),beginDt1ReqRemarkCd,DT_1_REQ_REMARK_CD_LEN);
       localDt1ReqRemarkCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqRemarkCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt1ReqRemarkCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqRemarkCd() {	 
   		return (substring(getStringValue(),beginDt1ReqRemarkCd,beginDt1ReqRemarkCd + DT_1_REQ_REMARK_CD_LEN));
   	}
     int localDt1ReqProvSpclCdCounter = -1;
     public boolean isDt1ReqProvSpclCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqProvSpclCdCounter != sharedCounter;
         localDt1ReqProvSpclCdCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_PROV_SPCL_CD_LEN = 3;
	/**
	 * 	serialize this Dt1ReqProvSpclCd
	 */
   protected void serializeDt1ReqProvSpclCd(char[] dt1ReqProvSpclCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqProvSpclCd,0,getStringValue(),beginDt1ReqProvSpclCd,DT_1_REQ_PROV_SPCL_CD_LEN);
       localDt1ReqProvSpclCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqProvSpclCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshDt1ReqProvSpclCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqProvSpclCd() {	 
   		return (substring(getStringValue(),beginDt1ReqProvSpclCd,beginDt1ReqProvSpclCd + DT_1_REQ_PROV_SPCL_CD_LEN));
   	}
     int localDt1ReqCauseCdCounter = -1;
     public boolean isDt1ReqCauseCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqCauseCdCounter != sharedCounter;
         localDt1ReqCauseCdCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_CAUSE_CD_LEN = 1;
	/**
	 * 	serialize this Dt1ReqCauseCd
	 */
   protected void serializeDt1ReqCauseCd(char[] dt1ReqCauseCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqCauseCd,0,getStringValue(),beginDt1ReqCauseCd,DT_1_REQ_CAUSE_CD_LEN);
       localDt1ReqCauseCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqCauseCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ReqCauseCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqCauseCd() {	 
   		return (substring(getStringValue(),beginDt1ReqCauseCd,beginDt1ReqCauseCd + DT_1_REQ_CAUSE_CD_LEN));
   	}
     int localDt1ReqAppliedToOopIndCounter = -1;
     public boolean isDt1ReqAppliedToOopIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqAppliedToOopIndCounter != sharedCounter;
         localDt1ReqAppliedToOopIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_APPLIED_TO_OOP_IND_LEN = 1;
	/**
	 * 	serialize this Dt1ReqAppliedToOopInd
	 */
   protected void serializeDt1ReqAppliedToOopInd(char[] dt1ReqAppliedToOopInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqAppliedToOopInd,0,getStringValue(),beginDt1ReqAppliedToOopInd,DT_1_REQ_APPLIED_TO_OOP_IND_LEN);
       localDt1ReqAppliedToOopIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqAppliedToOopIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ReqAppliedToOopInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqAppliedToOopInd() {	 
   		return (substring(getStringValue(),beginDt1ReqAppliedToOopInd,beginDt1ReqAppliedToOopInd + DT_1_REQ_APPLIED_TO_OOP_IND_LEN));
   	}
     int localDt1ReqFillerAreaCounter = -1;
     public boolean isDt1ReqFillerAreaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ReqFillerAreaCounter != sharedCounter;
         localDt1ReqFillerAreaCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_REQ_FILLER_AREA_LEN = 124;
	/**
	 * 	serialize this Dt1ReqFillerArea
	 */
   protected void serializeDt1ReqFillerArea(char[] dt1ReqFillerArea) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ReqFillerArea,0,getStringValue(),beginDt1ReqFillerArea,DT_1_REQ_FILLER_AREA_LEN);
       localDt1ReqFillerAreaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ReqFillerAreaConstraints(char[] value) {
   			return super.checkConstraints(value , 124 ,false, false);
   }
    /**
	 *	refreshDt1ReqFillerArea is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ReqFillerArea() {	 
   		return (substring(getStringValue(),beginDt1ReqFillerArea,beginDt1ReqFillerArea + DT_1_REQ_FILLER_AREA_LEN));
   	}

		public int dt1ReqSpiCategoryCdSize() {
			return DT_1_REQ_SPI_CATEGORY_CD_SIZE;
		}



}
  
