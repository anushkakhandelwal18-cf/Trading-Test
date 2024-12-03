package com.cloudframe.app.trdpb007.dto.serialize;

/**
*  The class MqpmoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 14:02. using version 5.0.0.162
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MqpmoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MqpmoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MQPMO_LENGTH = 176;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMqpmoStrucid;
            protected  int beginMqpmoVersion;
            protected  int beginMqpmoOptions;
            protected  int beginMqpmoTimeout;
            protected  int beginMqpmoContext;
            protected  int beginMqpmoKnowndestcount;
            protected  int beginMqpmoUnknowndestcount;
            protected  int beginMqpmoInvaliddestcount;
            protected  int beginMqpmoResolvedqname;
            protected  int beginMqpmoResolvedqmgrname;
            protected  int beginMqpmoRecspresent;
            protected  int beginMqpmoPutmsgrecfields;
            protected  int beginMqpmoPutmsgrecoffset;
            protected  int beginMqpmoResponserecoffset;
            protected  int beginMqpmoPutmsgrecptr;
            protected  int beginMqpmoResponserecptr;
            protected  int beginMqpmoOriginalmsghandle;
            protected  int beginMqpmoNewmsghandle;
            protected  int beginMqpmoAction;
            protected  int beginMqpmoPublevel;
	
	/**
	* Constructor for MqpmoSerialized
	**/
    public MqpmoSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MqpmoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MQPMO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMqpmoStrucid = getStartOffset() + 0;	// set offset for serialization
  
             beginMqpmoVersion = getStartOffset() + 4;	// set offset for serialization
  
             beginMqpmoOptions = getStartOffset() + 8;	// set offset for serialization
  
             beginMqpmoTimeout = getStartOffset() + 12;	// set offset for serialization
  
             beginMqpmoContext = getStartOffset() + 16;	// set offset for serialization
  
             beginMqpmoKnowndestcount = getStartOffset() + 20;	// set offset for serialization
  
             beginMqpmoUnknowndestcount = getStartOffset() + 24;	// set offset for serialization
  
             beginMqpmoInvaliddestcount = getStartOffset() + 28;	// set offset for serialization
  
             beginMqpmoResolvedqname = getStartOffset() + 32;	// set offset for serialization
  
             beginMqpmoResolvedqmgrname = getStartOffset() + 80;	// set offset for serialization
  
             beginMqpmoRecspresent = getStartOffset() + 128;	// set offset for serialization
  
             beginMqpmoPutmsgrecfields = getStartOffset() + 132;	// set offset for serialization
  
             beginMqpmoPutmsgrecoffset = getStartOffset() + 136;	// set offset for serialization
  
             beginMqpmoResponserecoffset = getStartOffset() + 140;	// set offset for serialization
  
             beginMqpmoPutmsgrecptr = getStartOffset() + 144;	// set offset for serialization
  
             beginMqpmoResponserecptr = getStartOffset() + 148;	// set offset for serialization
  
             beginMqpmoOriginalmsghandle = getStartOffset() + 152;	// set offset for serialization
  
             beginMqpmoNewmsghandle = getStartOffset() + 160;	// set offset for serialization
  
             beginMqpmoAction = getStartOffset() + 168;	// set offset for serialization
  
             beginMqpmoPublevel = getStartOffset() + 172;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMqpmoStrucidCounter = -1;
     public boolean isMqpmoStrucidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqpmoStrucidCounter != sharedCounter;
         localMqpmoStrucidCounter = sharedCounter; return hasModified;
     }
	protected static final int MQPMO_STRUCID_LEN = 4;
	/**
	 * 	serialize this MqpmoStrucid
	 */
   protected void serializeMqpmoStrucid(char[] mqpmoStrucid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqpmoStrucid,0,getStringValue(),beginMqpmoStrucid,MQPMO_STRUCID_LEN);
       localMqpmoStrucidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqpmoStrucidConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMqpmoStrucid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqpmoStrucid() {	 
   		return (substring(getStringValue(),beginMqpmoStrucid,beginMqpmoStrucid + MQPMO_STRUCID_LEN));
   	}
         int localMqpmoVersionCounter = -1;
         public boolean isMqpmoVersionModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqpmoVersionCounter != sharedCounter;
            localMqpmoVersionCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQPMO_VERSION_LEN = 4;
  	/**
	 * serializeMqpmoVersion
	 */
	protected void serializeMqpmoVersion(int mqpmoVersion) {
           replaceValue( //  save the value as string
                   getBinaryString( mqpmoVersion,MQPMO_VERSION_LEN)
                  ,beginMqpmoVersion
                  ,MQPMO_VERSION_LEN
                 );
            localMqpmoVersionCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqpmoVersionMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqpmoVersion is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqpmoVersion() {	 
			return (getInt(beginMqpmoVersion));
   	}
         int localMqpmoOptionsCounter = -1;
         public boolean isMqpmoOptionsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqpmoOptionsCounter != sharedCounter;
            localMqpmoOptionsCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQPMO_OPTIONS_LEN = 4;
  	/**
	 * serializeMqpmoOptions
	 */
	protected void serializeMqpmoOptions(int mqpmoOptions) {
           replaceValue( //  save the value as string
                   getBinaryString( mqpmoOptions,MQPMO_OPTIONS_LEN)
                  ,beginMqpmoOptions
                  ,MQPMO_OPTIONS_LEN
                 );
            localMqpmoOptionsCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqpmoOptionsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqpmoOptions is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqpmoOptions() {	 
			return (getInt(beginMqpmoOptions));
   	}
         int localMqpmoTimeoutCounter = -1;
         public boolean isMqpmoTimeoutModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqpmoTimeoutCounter != sharedCounter;
            localMqpmoTimeoutCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQPMO_TIMEOUT_LEN = 4;
  	/**
	 * serializeMqpmoTimeout
	 */
	protected void serializeMqpmoTimeout(int mqpmoTimeout) {
           replaceValue( //  save the value as string
                   getBinaryString( mqpmoTimeout,MQPMO_TIMEOUT_LEN)
                  ,beginMqpmoTimeout
                  ,MQPMO_TIMEOUT_LEN
                 );
            localMqpmoTimeoutCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqpmoTimeoutMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqpmoTimeout is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqpmoTimeout() {	 
			return (getInt(beginMqpmoTimeout));
   	}
         int localMqpmoContextCounter = -1;
         public boolean isMqpmoContextModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqpmoContextCounter != sharedCounter;
            localMqpmoContextCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQPMO_CONTEXT_LEN = 4;
  	/**
	 * serializeMqpmoContext
	 */
	protected void serializeMqpmoContext(int mqpmoContext) {
           replaceValue( //  save the value as string
                   getBinaryString( mqpmoContext,MQPMO_CONTEXT_LEN)
                  ,beginMqpmoContext
                  ,MQPMO_CONTEXT_LEN
                 );
            localMqpmoContextCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqpmoContextMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqpmoContext is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqpmoContext() {	 
			return (getInt(beginMqpmoContext));
   	}
         int localMqpmoKnowndestcountCounter = -1;
         public boolean isMqpmoKnowndestcountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqpmoKnowndestcountCounter != sharedCounter;
            localMqpmoKnowndestcountCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQPMO_KNOWNDESTCOUNT_LEN = 4;
  	/**
	 * serializeMqpmoKnowndestcount
	 */
	protected void serializeMqpmoKnowndestcount(int mqpmoKnowndestcount) {
           replaceValue( //  save the value as string
                   getBinaryString( mqpmoKnowndestcount,MQPMO_KNOWNDESTCOUNT_LEN)
                  ,beginMqpmoKnowndestcount
                  ,MQPMO_KNOWNDESTCOUNT_LEN
                 );
            localMqpmoKnowndestcountCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqpmoKnowndestcountMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqpmoKnowndestcount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqpmoKnowndestcount() {	 
			return (getInt(beginMqpmoKnowndestcount));
   	}
         int localMqpmoUnknowndestcountCounter = -1;
         public boolean isMqpmoUnknowndestcountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqpmoUnknowndestcountCounter != sharedCounter;
            localMqpmoUnknowndestcountCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQPMO_UNKNOWNDESTCOUNT_LEN = 4;
  	/**
	 * serializeMqpmoUnknowndestcount
	 */
	protected void serializeMqpmoUnknowndestcount(int mqpmoUnknowndestcount) {
           replaceValue( //  save the value as string
                   getBinaryString( mqpmoUnknowndestcount,MQPMO_UNKNOWNDESTCOUNT_LEN)
                  ,beginMqpmoUnknowndestcount
                  ,MQPMO_UNKNOWNDESTCOUNT_LEN
                 );
            localMqpmoUnknowndestcountCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqpmoUnknowndestcountMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqpmoUnknowndestcount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqpmoUnknowndestcount() {	 
			return (getInt(beginMqpmoUnknowndestcount));
   	}
         int localMqpmoInvaliddestcountCounter = -1;
         public boolean isMqpmoInvaliddestcountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqpmoInvaliddestcountCounter != sharedCounter;
            localMqpmoInvaliddestcountCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQPMO_INVALIDDESTCOUNT_LEN = 4;
  	/**
	 * serializeMqpmoInvaliddestcount
	 */
	protected void serializeMqpmoInvaliddestcount(int mqpmoInvaliddestcount) {
           replaceValue( //  save the value as string
                   getBinaryString( mqpmoInvaliddestcount,MQPMO_INVALIDDESTCOUNT_LEN)
                  ,beginMqpmoInvaliddestcount
                  ,MQPMO_INVALIDDESTCOUNT_LEN
                 );
            localMqpmoInvaliddestcountCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqpmoInvaliddestcountMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqpmoInvaliddestcount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqpmoInvaliddestcount() {	 
			return (getInt(beginMqpmoInvaliddestcount));
   	}
     int localMqpmoResolvedqnameCounter = -1;
     public boolean isMqpmoResolvedqnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqpmoResolvedqnameCounter != sharedCounter;
         localMqpmoResolvedqnameCounter = sharedCounter; return hasModified;
     }
	protected static final int MQPMO_RESOLVEDQNAME_LEN = 48;
	/**
	 * 	serialize this MqpmoResolvedqname
	 */
   protected void serializeMqpmoResolvedqname(char[] mqpmoResolvedqname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqpmoResolvedqname,0,getStringValue(),beginMqpmoResolvedqname,MQPMO_RESOLVEDQNAME_LEN);
       localMqpmoResolvedqnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqpmoResolvedqnameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshMqpmoResolvedqname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqpmoResolvedqname() {	 
   		return (substring(getStringValue(),beginMqpmoResolvedqname,beginMqpmoResolvedqname + MQPMO_RESOLVEDQNAME_LEN));
   	}
     int localMqpmoResolvedqmgrnameCounter = -1;
     public boolean isMqpmoResolvedqmgrnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqpmoResolvedqmgrnameCounter != sharedCounter;
         localMqpmoResolvedqmgrnameCounter = sharedCounter; return hasModified;
     }
	protected static final int MQPMO_RESOLVEDQMGRNAME_LEN = 48;
	/**
	 * 	serialize this MqpmoResolvedqmgrname
	 */
   protected void serializeMqpmoResolvedqmgrname(char[] mqpmoResolvedqmgrname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqpmoResolvedqmgrname,0,getStringValue(),beginMqpmoResolvedqmgrname,MQPMO_RESOLVEDQMGRNAME_LEN);
       localMqpmoResolvedqmgrnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqpmoResolvedqmgrnameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshMqpmoResolvedqmgrname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqpmoResolvedqmgrname() {	 
   		return (substring(getStringValue(),beginMqpmoResolvedqmgrname,beginMqpmoResolvedqmgrname + MQPMO_RESOLVEDQMGRNAME_LEN));
   	}
         int localMqpmoRecspresentCounter = -1;
         public boolean isMqpmoRecspresentModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqpmoRecspresentCounter != sharedCounter;
            localMqpmoRecspresentCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQPMO_RECSPRESENT_LEN = 4;
  	/**
	 * serializeMqpmoRecspresent
	 */
	protected void serializeMqpmoRecspresent(int mqpmoRecspresent) {
           replaceValue( //  save the value as string
                   getBinaryString( mqpmoRecspresent,MQPMO_RECSPRESENT_LEN)
                  ,beginMqpmoRecspresent
                  ,MQPMO_RECSPRESENT_LEN
                 );
            localMqpmoRecspresentCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqpmoRecspresentMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqpmoRecspresent is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqpmoRecspresent() {	 
			return (getInt(beginMqpmoRecspresent));
   	}
         int localMqpmoPutmsgrecfieldsCounter = -1;
         public boolean isMqpmoPutmsgrecfieldsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqpmoPutmsgrecfieldsCounter != sharedCounter;
            localMqpmoPutmsgrecfieldsCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQPMO_PUTMSGRECFIELDS_LEN = 4;
  	/**
	 * serializeMqpmoPutmsgrecfields
	 */
	protected void serializeMqpmoPutmsgrecfields(int mqpmoPutmsgrecfields) {
           replaceValue( //  save the value as string
                   getBinaryString( mqpmoPutmsgrecfields,MQPMO_PUTMSGRECFIELDS_LEN)
                  ,beginMqpmoPutmsgrecfields
                  ,MQPMO_PUTMSGRECFIELDS_LEN
                 );
            localMqpmoPutmsgrecfieldsCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqpmoPutmsgrecfieldsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqpmoPutmsgrecfields is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqpmoPutmsgrecfields() {	 
			return (getInt(beginMqpmoPutmsgrecfields));
   	}
         int localMqpmoPutmsgrecoffsetCounter = -1;
         public boolean isMqpmoPutmsgrecoffsetModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqpmoPutmsgrecoffsetCounter != sharedCounter;
            localMqpmoPutmsgrecoffsetCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQPMO_PUTMSGRECOFFSET_LEN = 4;
  	/**
	 * serializeMqpmoPutmsgrecoffset
	 */
	protected void serializeMqpmoPutmsgrecoffset(int mqpmoPutmsgrecoffset) {
           replaceValue( //  save the value as string
                   getBinaryString( mqpmoPutmsgrecoffset,MQPMO_PUTMSGRECOFFSET_LEN)
                  ,beginMqpmoPutmsgrecoffset
                  ,MQPMO_PUTMSGRECOFFSET_LEN
                 );
            localMqpmoPutmsgrecoffsetCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqpmoPutmsgrecoffsetMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqpmoPutmsgrecoffset is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqpmoPutmsgrecoffset() {	 
			return (getInt(beginMqpmoPutmsgrecoffset));
   	}
         int localMqpmoResponserecoffsetCounter = -1;
         public boolean isMqpmoResponserecoffsetModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqpmoResponserecoffsetCounter != sharedCounter;
            localMqpmoResponserecoffsetCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQPMO_RESPONSERECOFFSET_LEN = 4;
  	/**
	 * serializeMqpmoResponserecoffset
	 */
	protected void serializeMqpmoResponserecoffset(int mqpmoResponserecoffset) {
           replaceValue( //  save the value as string
                   getBinaryString( mqpmoResponserecoffset,MQPMO_RESPONSERECOFFSET_LEN)
                  ,beginMqpmoResponserecoffset
                  ,MQPMO_RESPONSERECOFFSET_LEN
                 );
            localMqpmoResponserecoffsetCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqpmoResponserecoffsetMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqpmoResponserecoffset is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqpmoResponserecoffset() {	 
			return (getInt(beginMqpmoResponserecoffset));
   	}
     int localMqpmoPutmsgrecptrCounter = -1;
     public boolean isMqpmoPutmsgrecptrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqpmoPutmsgrecptrCounter != sharedCounter;
         localMqpmoPutmsgrecptrCounter = sharedCounter; return hasModified; 
     }
   protected static final int MQPMO_PUTMSGRECPTR_LEN = 4;
  	/**
	 * serializeMqpmoPutmsgrecptr
	 */
	protected void serializeMqpmoPutmsgrecptr(int mqpmoPutmsgrecptr) {
           replaceValue( //  save the value as string
                   getBinaryString( mqpmoPutmsgrecptr,MQPMO_PUTMSGRECPTR_LEN)
                  ,beginMqpmoPutmsgrecptr
                  ,MQPMO_PUTMSGRECPTR_LEN
                 );
            localMqpmoPutmsgrecptrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqpmoPutmsgrecptrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqpmoPutmsgrecptr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqpmoPutmsgrecptr() {	 
			return (getInt(beginMqpmoPutmsgrecptr));
   	}
     int localMqpmoResponserecptrCounter = -1;
     public boolean isMqpmoResponserecptrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqpmoResponserecptrCounter != sharedCounter;
         localMqpmoResponserecptrCounter = sharedCounter; return hasModified; 
     }
   protected static final int MQPMO_RESPONSERECPTR_LEN = 4;
  	/**
	 * serializeMqpmoResponserecptr
	 */
	protected void serializeMqpmoResponserecptr(int mqpmoResponserecptr) {
           replaceValue( //  save the value as string
                   getBinaryString( mqpmoResponserecptr,MQPMO_RESPONSERECPTR_LEN)
                  ,beginMqpmoResponserecptr
                  ,MQPMO_RESPONSERECPTR_LEN
                 );
            localMqpmoResponserecptrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqpmoResponserecptrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqpmoResponserecptr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqpmoResponserecptr() {	 
			return (getInt(beginMqpmoResponserecptr));
   	}
         int localMqpmoOriginalmsghandleCounter = -1;
         public boolean isMqpmoOriginalmsghandleModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqpmoOriginalmsghandleCounter != sharedCounter;
            localMqpmoOriginalmsghandleCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQPMO_ORIGINALMSGHANDLE_LEN = 8;
  	/**
	 * serializeMqpmoOriginalmsghandle
	 */
	protected void serializeMqpmoOriginalmsghandle(long mqpmoOriginalmsghandle) {
           replaceValue( //  save the value as string
                   getBinaryString( mqpmoOriginalmsghandle,MQPMO_ORIGINALMSGHANDLE_LEN)
                  ,beginMqpmoOriginalmsghandle
                  ,MQPMO_ORIGINALMSGHANDLE_LEN
                 );
            localMqpmoOriginalmsghandleCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkMqpmoOriginalmsghandleMaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     /**
	 *	refreshMqpmoOriginalmsghandle is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMqpmoOriginalmsghandle() {	 
			return (getLong(beginMqpmoOriginalmsghandle));
   	}
         int localMqpmoNewmsghandleCounter = -1;
         public boolean isMqpmoNewmsghandleModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqpmoNewmsghandleCounter != sharedCounter;
            localMqpmoNewmsghandleCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQPMO_NEWMSGHANDLE_LEN = 8;
  	/**
	 * serializeMqpmoNewmsghandle
	 */
	protected void serializeMqpmoNewmsghandle(long mqpmoNewmsghandle) {
           replaceValue( //  save the value as string
                   getBinaryString( mqpmoNewmsghandle,MQPMO_NEWMSGHANDLE_LEN)
                  ,beginMqpmoNewmsghandle
                  ,MQPMO_NEWMSGHANDLE_LEN
                 );
            localMqpmoNewmsghandleCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkMqpmoNewmsghandleMaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     /**
	 *	refreshMqpmoNewmsghandle is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMqpmoNewmsghandle() {	 
			return (getLong(beginMqpmoNewmsghandle));
   	}
         int localMqpmoActionCounter = -1;
         public boolean isMqpmoActionModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqpmoActionCounter != sharedCounter;
            localMqpmoActionCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQPMO_ACTION_LEN = 4;
  	/**
	 * serializeMqpmoAction
	 */
	protected void serializeMqpmoAction(int mqpmoAction) {
           replaceValue( //  save the value as string
                   getBinaryString( mqpmoAction,MQPMO_ACTION_LEN)
                  ,beginMqpmoAction
                  ,MQPMO_ACTION_LEN
                 );
            localMqpmoActionCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqpmoActionMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqpmoAction is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqpmoAction() {	 
			return (getInt(beginMqpmoAction));
   	}
         int localMqpmoPublevelCounter = -1;
         public boolean isMqpmoPublevelModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqpmoPublevelCounter != sharedCounter;
            localMqpmoPublevelCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQPMO_PUBLEVEL_LEN = 4;
  	/**
	 * serializeMqpmoPublevel
	 */
	protected void serializeMqpmoPublevel(int mqpmoPublevel) {
           replaceValue( //  save the value as string
                   getBinaryString( mqpmoPublevel,MQPMO_PUBLEVEL_LEN)
                  ,beginMqpmoPublevel
                  ,MQPMO_PUBLEVEL_LEN
                 );
            localMqpmoPublevelCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqpmoPublevelMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqpmoPublevel is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqpmoPublevel() {	 
			return (getInt(beginMqpmoPublevel));
   	}




}
  
