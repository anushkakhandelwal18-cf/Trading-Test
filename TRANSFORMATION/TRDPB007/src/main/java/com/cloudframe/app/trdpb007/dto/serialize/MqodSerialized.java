package com.cloudframe.app.trdpb007.dto.serialize;

/**
*  The class MqodSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-21 at 09:21. using version 5.0.0.153
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MqodSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MqodSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MQOD_LENGTH = 400;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMqodStrucid;
            protected  int beginMqodVersion;
            protected  int beginMqodObjecttype;
            protected  int beginMqodObjectname;
            protected  int beginMqodObjectqmgrname;
            protected  int beginMqodDynamicqname;
            protected  int beginMqodAlternateuserid;
            protected  int beginMqodRecspresent;
            protected  int beginMqodKnowndestcount;
            protected  int beginMqodUnknowndestcount;
            protected  int beginMqodInvaliddestcount;
            protected  int beginMqodObjectrecoffset;
            protected  int beginMqodResponserecoffset;
            protected  int beginMqodObjectrecptr;
            protected  int beginMqodResponserecptr;
            protected  int beginMqodAlternatesecurityid;
            protected  int beginMqodResolvedqname;
            protected  int beginMqodResolvedqmgrname;
            protected  int beginMqodResolvedtype;
	
	/**
	* Constructor for MqodSerialized
	**/
    public MqodSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MqodSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MQOD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMqodStrucid = getStartOffset() + 0;	// set offset for serialization
  
             beginMqodVersion = getStartOffset() + 4;	// set offset for serialization
  
             beginMqodObjecttype = getStartOffset() + 8;	// set offset for serialization
  
             beginMqodObjectname = getStartOffset() + 12;	// set offset for serialization
  
             beginMqodObjectqmgrname = getStartOffset() + 60;	// set offset for serialization
  
             beginMqodDynamicqname = getStartOffset() + 108;	// set offset for serialization
  
             beginMqodAlternateuserid = getStartOffset() + 156;	// set offset for serialization
  
             beginMqodRecspresent = getStartOffset() + 168;	// set offset for serialization
  
             beginMqodKnowndestcount = getStartOffset() + 172;	// set offset for serialization
  
             beginMqodUnknowndestcount = getStartOffset() + 176;	// set offset for serialization
  
             beginMqodInvaliddestcount = getStartOffset() + 180;	// set offset for serialization
  
             beginMqodObjectrecoffset = getStartOffset() + 184;	// set offset for serialization
  
             beginMqodResponserecoffset = getStartOffset() + 188;	// set offset for serialization
  
             beginMqodObjectrecptr = getStartOffset() + 192;	// set offset for serialization
  
             beginMqodResponserecptr = getStartOffset() + 196;	// set offset for serialization
  
             beginMqodAlternatesecurityid = getStartOffset() + 200;	// set offset for serialization
  
             beginMqodResolvedqname = getStartOffset() + 240;	// set offset for serialization
  
             beginMqodResolvedqmgrname = getStartOffset() + 288;	// set offset for serialization
  
  
  
  
             beginMqodResolvedtype = getStartOffset() + 396;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMqodStrucidCounter = -1;
     public boolean isMqodStrucidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqodStrucidCounter != sharedCounter;
         localMqodStrucidCounter = sharedCounter; return hasModified;
     }
	protected static final int MQOD_STRUCID_LEN = 4;
	/**
	 * 	serialize this MqodStrucid
	 */
   protected void serializeMqodStrucid(char[] mqodStrucid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqodStrucid,0,getStringValue(),beginMqodStrucid,MQOD_STRUCID_LEN);
       localMqodStrucidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqodStrucidConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMqodStrucid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqodStrucid() {	 
   		return (substring(getStringValue(),beginMqodStrucid,beginMqodStrucid + MQOD_STRUCID_LEN));
   	}
         int localMqodVersionCounter = -1;
         public boolean isMqodVersionModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodVersionCounter != sharedCounter;
            localMqodVersionCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_VERSION_LEN = 4;
  	/**
	 * serializeMqodVersion
	 */
	protected void serializeMqodVersion(int mqodVersion) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodVersion,MQOD_VERSION_LEN)
                  ,beginMqodVersion
                  ,MQOD_VERSION_LEN
                 );
            localMqodVersionCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodVersionMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodVersion is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodVersion() {	 
			return (getInt(beginMqodVersion));
   	}
         int localMqodObjecttypeCounter = -1;
         public boolean isMqodObjecttypeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodObjecttypeCounter != sharedCounter;
            localMqodObjecttypeCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_OBJECTTYPE_LEN = 4;
  	/**
	 * serializeMqodObjecttype
	 */
	protected void serializeMqodObjecttype(int mqodObjecttype) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodObjecttype,MQOD_OBJECTTYPE_LEN)
                  ,beginMqodObjecttype
                  ,MQOD_OBJECTTYPE_LEN
                 );
            localMqodObjecttypeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodObjecttypeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodObjecttype is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodObjecttype() {	 
			return (getInt(beginMqodObjecttype));
   	}
     int localMqodObjectnameCounter = -1;
     public boolean isMqodObjectnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqodObjectnameCounter != sharedCounter;
         localMqodObjectnameCounter = sharedCounter; return hasModified;
     }
	protected static final int MQOD_OBJECTNAME_LEN = 48;
	/**
	 * 	serialize this MqodObjectname
	 */
   protected void serializeMqodObjectname(char[] mqodObjectname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqodObjectname,0,getStringValue(),beginMqodObjectname,MQOD_OBJECTNAME_LEN);
       localMqodObjectnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqodObjectnameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshMqodObjectname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqodObjectname() {	 
   		return (substring(getStringValue(),beginMqodObjectname,beginMqodObjectname + MQOD_OBJECTNAME_LEN));
   	}
     int localMqodObjectqmgrnameCounter = -1;
     public boolean isMqodObjectqmgrnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqodObjectqmgrnameCounter != sharedCounter;
         localMqodObjectqmgrnameCounter = sharedCounter; return hasModified;
     }
	protected static final int MQOD_OBJECTQMGRNAME_LEN = 48;
	/**
	 * 	serialize this MqodObjectqmgrname
	 */
   protected void serializeMqodObjectqmgrname(char[] mqodObjectqmgrname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqodObjectqmgrname,0,getStringValue(),beginMqodObjectqmgrname,MQOD_OBJECTQMGRNAME_LEN);
       localMqodObjectqmgrnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqodObjectqmgrnameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshMqodObjectqmgrname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqodObjectqmgrname() {	 
   		return (substring(getStringValue(),beginMqodObjectqmgrname,beginMqodObjectqmgrname + MQOD_OBJECTQMGRNAME_LEN));
   	}
     int localMqodDynamicqnameCounter = -1;
     public boolean isMqodDynamicqnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqodDynamicqnameCounter != sharedCounter;
         localMqodDynamicqnameCounter = sharedCounter; return hasModified;
     }
	protected static final int MQOD_DYNAMICQNAME_LEN = 48;
	/**
	 * 	serialize this MqodDynamicqname
	 */
   protected void serializeMqodDynamicqname(char[] mqodDynamicqname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqodDynamicqname,0,getStringValue(),beginMqodDynamicqname,MQOD_DYNAMICQNAME_LEN);
       localMqodDynamicqnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqodDynamicqnameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshMqodDynamicqname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqodDynamicqname() {	 
   		return (substring(getStringValue(),beginMqodDynamicqname,beginMqodDynamicqname + MQOD_DYNAMICQNAME_LEN));
   	}
     int localMqodAlternateuseridCounter = -1;
     public boolean isMqodAlternateuseridModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqodAlternateuseridCounter != sharedCounter;
         localMqodAlternateuseridCounter = sharedCounter; return hasModified;
     }
	protected static final int MQOD_ALTERNATEUSERID_LEN = 12;
	/**
	 * 	serialize this MqodAlternateuserid
	 */
   protected void serializeMqodAlternateuserid(char[] mqodAlternateuserid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqodAlternateuserid,0,getStringValue(),beginMqodAlternateuserid,MQOD_ALTERNATEUSERID_LEN);
       localMqodAlternateuseridCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqodAlternateuseridConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshMqodAlternateuserid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqodAlternateuserid() {	 
   		return (substring(getStringValue(),beginMqodAlternateuserid,beginMqodAlternateuserid + MQOD_ALTERNATEUSERID_LEN));
   	}
         int localMqodRecspresentCounter = -1;
         public boolean isMqodRecspresentModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodRecspresentCounter != sharedCounter;
            localMqodRecspresentCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_RECSPRESENT_LEN = 4;
  	/**
	 * serializeMqodRecspresent
	 */
	protected void serializeMqodRecspresent(int mqodRecspresent) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodRecspresent,MQOD_RECSPRESENT_LEN)
                  ,beginMqodRecspresent
                  ,MQOD_RECSPRESENT_LEN
                 );
            localMqodRecspresentCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodRecspresentMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodRecspresent is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodRecspresent() {	 
			return (getInt(beginMqodRecspresent));
   	}
         int localMqodKnowndestcountCounter = -1;
         public boolean isMqodKnowndestcountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodKnowndestcountCounter != sharedCounter;
            localMqodKnowndestcountCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_KNOWNDESTCOUNT_LEN = 4;
  	/**
	 * serializeMqodKnowndestcount
	 */
	protected void serializeMqodKnowndestcount(int mqodKnowndestcount) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodKnowndestcount,MQOD_KNOWNDESTCOUNT_LEN)
                  ,beginMqodKnowndestcount
                  ,MQOD_KNOWNDESTCOUNT_LEN
                 );
            localMqodKnowndestcountCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodKnowndestcountMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodKnowndestcount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodKnowndestcount() {	 
			return (getInt(beginMqodKnowndestcount));
   	}
         int localMqodUnknowndestcountCounter = -1;
         public boolean isMqodUnknowndestcountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodUnknowndestcountCounter != sharedCounter;
            localMqodUnknowndestcountCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_UNKNOWNDESTCOUNT_LEN = 4;
  	/**
	 * serializeMqodUnknowndestcount
	 */
	protected void serializeMqodUnknowndestcount(int mqodUnknowndestcount) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodUnknowndestcount,MQOD_UNKNOWNDESTCOUNT_LEN)
                  ,beginMqodUnknowndestcount
                  ,MQOD_UNKNOWNDESTCOUNT_LEN
                 );
            localMqodUnknowndestcountCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodUnknowndestcountMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodUnknowndestcount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodUnknowndestcount() {	 
			return (getInt(beginMqodUnknowndestcount));
   	}
         int localMqodInvaliddestcountCounter = -1;
         public boolean isMqodInvaliddestcountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodInvaliddestcountCounter != sharedCounter;
            localMqodInvaliddestcountCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_INVALIDDESTCOUNT_LEN = 4;
  	/**
	 * serializeMqodInvaliddestcount
	 */
	protected void serializeMqodInvaliddestcount(int mqodInvaliddestcount) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodInvaliddestcount,MQOD_INVALIDDESTCOUNT_LEN)
                  ,beginMqodInvaliddestcount
                  ,MQOD_INVALIDDESTCOUNT_LEN
                 );
            localMqodInvaliddestcountCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodInvaliddestcountMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodInvaliddestcount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodInvaliddestcount() {	 
			return (getInt(beginMqodInvaliddestcount));
   	}
         int localMqodObjectrecoffsetCounter = -1;
         public boolean isMqodObjectrecoffsetModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodObjectrecoffsetCounter != sharedCounter;
            localMqodObjectrecoffsetCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_OBJECTRECOFFSET_LEN = 4;
  	/**
	 * serializeMqodObjectrecoffset
	 */
	protected void serializeMqodObjectrecoffset(int mqodObjectrecoffset) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodObjectrecoffset,MQOD_OBJECTRECOFFSET_LEN)
                  ,beginMqodObjectrecoffset
                  ,MQOD_OBJECTRECOFFSET_LEN
                 );
            localMqodObjectrecoffsetCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodObjectrecoffsetMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodObjectrecoffset is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodObjectrecoffset() {	 
			return (getInt(beginMqodObjectrecoffset));
   	}
         int localMqodResponserecoffsetCounter = -1;
         public boolean isMqodResponserecoffsetModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodResponserecoffsetCounter != sharedCounter;
            localMqodResponserecoffsetCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_RESPONSERECOFFSET_LEN = 4;
  	/**
	 * serializeMqodResponserecoffset
	 */
	protected void serializeMqodResponserecoffset(int mqodResponserecoffset) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodResponserecoffset,MQOD_RESPONSERECOFFSET_LEN)
                  ,beginMqodResponserecoffset
                  ,MQOD_RESPONSERECOFFSET_LEN
                 );
            localMqodResponserecoffsetCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodResponserecoffsetMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodResponserecoffset is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodResponserecoffset() {	 
			return (getInt(beginMqodResponserecoffset));
   	}
     int localMqodObjectrecptrCounter = -1;
     public boolean isMqodObjectrecptrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqodObjectrecptrCounter != sharedCounter;
         localMqodObjectrecptrCounter = sharedCounter; return hasModified; 
     }
   protected static final int MQOD_OBJECTRECPTR_LEN = 4;
  	/**
	 * serializeMqodObjectrecptr
	 */
	protected void serializeMqodObjectrecptr(int mqodObjectrecptr) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodObjectrecptr,MQOD_OBJECTRECPTR_LEN)
                  ,beginMqodObjectrecptr
                  ,MQOD_OBJECTRECPTR_LEN
                 );
            localMqodObjectrecptrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodObjectrecptrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodObjectrecptr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodObjectrecptr() {	 
			return (getInt(beginMqodObjectrecptr));
   	}
     int localMqodResponserecptrCounter = -1;
     public boolean isMqodResponserecptrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqodResponserecptrCounter != sharedCounter;
         localMqodResponserecptrCounter = sharedCounter; return hasModified; 
     }
   protected static final int MQOD_RESPONSERECPTR_LEN = 4;
  	/**
	 * serializeMqodResponserecptr
	 */
	protected void serializeMqodResponserecptr(int mqodResponserecptr) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodResponserecptr,MQOD_RESPONSERECPTR_LEN)
                  ,beginMqodResponserecptr
                  ,MQOD_RESPONSERECPTR_LEN
                 );
            localMqodResponserecptrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodResponserecptrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodResponserecptr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodResponserecptr() {	 
			return (getInt(beginMqodResponserecptr));
   	}
     int localMqodAlternatesecurityidCounter = -1;
     public boolean isMqodAlternatesecurityidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqodAlternatesecurityidCounter != sharedCounter;
         localMqodAlternatesecurityidCounter = sharedCounter; return hasModified;
     }
	protected static final int MQOD_ALTERNATESECURITYID_LEN = 40;
	/**
	 * 	serialize this MqodAlternatesecurityid
	 */
   protected void serializeMqodAlternatesecurityid(char[] mqodAlternatesecurityid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqodAlternatesecurityid,0,getStringValue(),beginMqodAlternatesecurityid,MQOD_ALTERNATESECURITYID_LEN);
       localMqodAlternatesecurityidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqodAlternatesecurityidConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshMqodAlternatesecurityid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqodAlternatesecurityid() {	 
   		return (substring(getStringValue(),beginMqodAlternatesecurityid,beginMqodAlternatesecurityid + MQOD_ALTERNATESECURITYID_LEN));
   	}
     int localMqodResolvedqnameCounter = -1;
     public boolean isMqodResolvedqnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqodResolvedqnameCounter != sharedCounter;
         localMqodResolvedqnameCounter = sharedCounter; return hasModified;
     }
	protected static final int MQOD_RESOLVEDQNAME_LEN = 48;
	/**
	 * 	serialize this MqodResolvedqname
	 */
   protected void serializeMqodResolvedqname(char[] mqodResolvedqname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqodResolvedqname,0,getStringValue(),beginMqodResolvedqname,MQOD_RESOLVEDQNAME_LEN);
       localMqodResolvedqnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqodResolvedqnameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshMqodResolvedqname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqodResolvedqname() {	 
   		return (substring(getStringValue(),beginMqodResolvedqname,beginMqodResolvedqname + MQOD_RESOLVEDQNAME_LEN));
   	}
     int localMqodResolvedqmgrnameCounter = -1;
     public boolean isMqodResolvedqmgrnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqodResolvedqmgrnameCounter != sharedCounter;
         localMqodResolvedqmgrnameCounter = sharedCounter; return hasModified;
     }
	protected static final int MQOD_RESOLVEDQMGRNAME_LEN = 48;
	/**
	 * 	serialize this MqodResolvedqmgrname
	 */
   protected void serializeMqodResolvedqmgrname(char[] mqodResolvedqmgrname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqodResolvedqmgrname,0,getStringValue(),beginMqodResolvedqmgrname,MQOD_RESOLVEDQMGRNAME_LEN);
       localMqodResolvedqmgrnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqodResolvedqmgrnameConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshMqodResolvedqmgrname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqodResolvedqmgrname() {	 
   		return (substring(getStringValue(),beginMqodResolvedqmgrname,beginMqodResolvedqmgrname + MQOD_RESOLVEDQMGRNAME_LEN));
   	}
         int localMqodResolvedtypeCounter = -1;
         public boolean isMqodResolvedtypeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodResolvedtypeCounter != sharedCounter;
            localMqodResolvedtypeCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_RESOLVEDTYPE_LEN = 4;
  	/**
	 * serializeMqodResolvedtype
	 */
	protected void serializeMqodResolvedtype(int mqodResolvedtype) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodResolvedtype,MQOD_RESOLVEDTYPE_LEN)
                  ,beginMqodResolvedtype
                  ,MQOD_RESOLVEDTYPE_LEN
                 );
            localMqodResolvedtypeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodResolvedtypeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodResolvedtype is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodResolvedtype() {	 
			return (getInt(beginMqodResolvedtype));
   	}




}
  
