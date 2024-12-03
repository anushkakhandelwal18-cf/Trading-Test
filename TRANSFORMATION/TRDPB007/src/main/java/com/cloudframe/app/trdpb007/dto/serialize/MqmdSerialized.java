package com.cloudframe.app.trdpb007.dto.serialize;

/**
*  The class MqmdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 14:02. using version 5.0.0.162
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MqmdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MqmdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MQMD_LENGTH = 324;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMqmdStrucid;
            protected  int beginMqmdVersion;
            protected  int beginMqmdReport;
            protected  int beginMqmdMsgtype;
            protected  int beginMqmdExpiry;
            protected  int beginMqmdFeedback;
            protected  int beginMqmdEncoding;
            protected  int beginMqmdCodedcharsetid;
            protected  int beginMqmdFormat;
            protected  int beginMqmdPriority;
            protected  int beginMqmdPersistence;
            protected  int beginMqmdMsgid;
            protected  int beginMqmdCorrelid;
            protected  int beginMqmdBackoutcount;
            protected  int beginMqmdReplytoq;
            protected  int beginMqmdReplytoqmgr;
            protected  int beginMqmdUseridentifier;
            protected  int beginMqmdAccountingtoken;
            protected  int beginMqmdApplidentitydata;
            protected  int beginMqmdPutappltype;
            protected  int beginMqmdPutapplname;
            protected  int beginMqmdPutdate;
            protected  int beginMqmdPuttime;
            protected  int beginMqmdApplorigindata;
	
	/**
	* Constructor for MqmdSerialized
	**/
    public MqmdSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MqmdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MQMD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMqmdStrucid = getStartOffset() + 0;	// set offset for serialization
  
             beginMqmdVersion = getStartOffset() + 4;	// set offset for serialization
  
             beginMqmdReport = getStartOffset() + 8;	// set offset for serialization
  
             beginMqmdMsgtype = getStartOffset() + 12;	// set offset for serialization
  
             beginMqmdExpiry = getStartOffset() + 16;	// set offset for serialization
  
             beginMqmdFeedback = getStartOffset() + 20;	// set offset for serialization
  
             beginMqmdEncoding = getStartOffset() + 24;	// set offset for serialization
  
             beginMqmdCodedcharsetid = getStartOffset() + 28;	// set offset for serialization
  
             beginMqmdFormat = getStartOffset() + 32;	// set offset for serialization
  
             beginMqmdPriority = getStartOffset() + 40;	// set offset for serialization
  
             beginMqmdPersistence = getStartOffset() + 44;	// set offset for serialization
  
             beginMqmdMsgid = getStartOffset() + 48;	// set offset for serialization
  
             beginMqmdCorrelid = getStartOffset() + 72;	// set offset for serialization
  
             beginMqmdBackoutcount = getStartOffset() + 96;	// set offset for serialization
  
             beginMqmdReplytoq = getStartOffset() + 100;	// set offset for serialization
  
             beginMqmdReplytoqmgr = getStartOffset() + 148;	// set offset for serialization
  
             beginMqmdUseridentifier = getStartOffset() + 196;	// set offset for serialization
  
             beginMqmdAccountingtoken = getStartOffset() + 208;	// set offset for serialization
  
             beginMqmdApplidentitydata = getStartOffset() + 240;	// set offset for serialization
  
             beginMqmdPutappltype = getStartOffset() + 272;	// set offset for serialization
  
             beginMqmdPutapplname = getStartOffset() + 276;	// set offset for serialization
  
             beginMqmdPutdate = getStartOffset() + 304;	// set offset for serialization
  
             beginMqmdPuttime = getStartOffset() + 312;	// set offset for serialization
  
             beginMqmdApplorigindata = getStartOffset() + 320;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMqmdStrucidCounter = -1;
     public boolean isMqmdStrucidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqmdStrucidCounter != sharedCounter;
         localMqmdStrucidCounter = sharedCounter; return hasModified;
     }
	protected static final int MQMD_STRUCID_LEN = 4;
	/**
	 * 	serialize this MqmdStrucid
	 */
   protected void serializeMqmdStrucid(char[] mqmdStrucid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqmdStrucid,0,getStringValue(),beginMqmdStrucid,MQMD_STRUCID_LEN);
       localMqmdStrucidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqmdStrucidConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMqmdStrucid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqmdStrucid() {	 
   		return (substring(getStringValue(),beginMqmdStrucid,beginMqmdStrucid + MQMD_STRUCID_LEN));
   	}
         int localMqmdVersionCounter = -1;
         public boolean isMqmdVersionModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqmdVersionCounter != sharedCounter;
            localMqmdVersionCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQMD_VERSION_LEN = 4;
  	/**
	 * serializeMqmdVersion
	 */
	protected void serializeMqmdVersion(int mqmdVersion) {
           replaceValue( //  save the value as string
                   getBinaryString( mqmdVersion,MQMD_VERSION_LEN)
                  ,beginMqmdVersion
                  ,MQMD_VERSION_LEN
                 );
            localMqmdVersionCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqmdVersionMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqmdVersion is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqmdVersion() {	 
			return (getInt(beginMqmdVersion));
   	}
         int localMqmdReportCounter = -1;
         public boolean isMqmdReportModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqmdReportCounter != sharedCounter;
            localMqmdReportCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQMD_REPORT_LEN = 4;
  	/**
	 * serializeMqmdReport
	 */
	protected void serializeMqmdReport(int mqmdReport) {
           replaceValue( //  save the value as string
                   getBinaryString( mqmdReport,MQMD_REPORT_LEN)
                  ,beginMqmdReport
                  ,MQMD_REPORT_LEN
                 );
            localMqmdReportCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqmdReportMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqmdReport is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqmdReport() {	 
			return (getInt(beginMqmdReport));
   	}
         int localMqmdMsgtypeCounter = -1;
         public boolean isMqmdMsgtypeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqmdMsgtypeCounter != sharedCounter;
            localMqmdMsgtypeCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQMD_MSGTYPE_LEN = 4;
  	/**
	 * serializeMqmdMsgtype
	 */
	protected void serializeMqmdMsgtype(int mqmdMsgtype) {
           replaceValue( //  save the value as string
                   getBinaryString( mqmdMsgtype,MQMD_MSGTYPE_LEN)
                  ,beginMqmdMsgtype
                  ,MQMD_MSGTYPE_LEN
                 );
            localMqmdMsgtypeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqmdMsgtypeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqmdMsgtype is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqmdMsgtype() {	 
			return (getInt(beginMqmdMsgtype));
   	}
         int localMqmdExpiryCounter = -1;
         public boolean isMqmdExpiryModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqmdExpiryCounter != sharedCounter;
            localMqmdExpiryCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQMD_EXPIRY_LEN = 4;
  	/**
	 * serializeMqmdExpiry
	 */
	protected void serializeMqmdExpiry(int mqmdExpiry) {
           replaceValue( //  save the value as string
                   getBinaryString( mqmdExpiry,MQMD_EXPIRY_LEN)
                  ,beginMqmdExpiry
                  ,MQMD_EXPIRY_LEN
                 );
            localMqmdExpiryCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqmdExpiryMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqmdExpiry is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqmdExpiry() {	 
			return (getInt(beginMqmdExpiry));
   	}
         int localMqmdFeedbackCounter = -1;
         public boolean isMqmdFeedbackModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqmdFeedbackCounter != sharedCounter;
            localMqmdFeedbackCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQMD_FEEDBACK_LEN = 4;
  	/**
	 * serializeMqmdFeedback
	 */
	protected void serializeMqmdFeedback(int mqmdFeedback) {
           replaceValue( //  save the value as string
                   getBinaryString( mqmdFeedback,MQMD_FEEDBACK_LEN)
                  ,beginMqmdFeedback
                  ,MQMD_FEEDBACK_LEN
                 );
            localMqmdFeedbackCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqmdFeedbackMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqmdFeedback is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqmdFeedback() {	 
			return (getInt(beginMqmdFeedback));
   	}
         int localMqmdEncodingCounter = -1;
         public boolean isMqmdEncodingModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqmdEncodingCounter != sharedCounter;
            localMqmdEncodingCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQMD_ENCODING_LEN = 4;
  	/**
	 * serializeMqmdEncoding
	 */
	protected void serializeMqmdEncoding(int mqmdEncoding) {
           replaceValue( //  save the value as string
                   getBinaryString( mqmdEncoding,MQMD_ENCODING_LEN)
                  ,beginMqmdEncoding
                  ,MQMD_ENCODING_LEN
                 );
            localMqmdEncodingCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqmdEncodingMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqmdEncoding is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqmdEncoding() {	 
			return (getInt(beginMqmdEncoding));
   	}
         int localMqmdCodedcharsetidCounter = -1;
         public boolean isMqmdCodedcharsetidModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqmdCodedcharsetidCounter != sharedCounter;
            localMqmdCodedcharsetidCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQMD_CODEDCHARSETID_LEN = 4;
  	/**
	 * serializeMqmdCodedcharsetid
	 */
	protected void serializeMqmdCodedcharsetid(int mqmdCodedcharsetid) {
           replaceValue( //  save the value as string
                   getBinaryString( mqmdCodedcharsetid,MQMD_CODEDCHARSETID_LEN)
                  ,beginMqmdCodedcharsetid
                  ,MQMD_CODEDCHARSETID_LEN
                 );
            localMqmdCodedcharsetidCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqmdCodedcharsetidMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqmdCodedcharsetid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqmdCodedcharsetid() {	 
			return (getInt(beginMqmdCodedcharsetid));
   	}
     int localMqmdFormatCounter = -1;
     public boolean isMqmdFormatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqmdFormatCounter != sharedCounter;
         localMqmdFormatCounter = sharedCounter; return hasModified;
     }
	protected static final int MQMD_FORMAT_LEN = 8;
	/**
	 * 	serialize this MqmdFormat
	 */
   protected void serializeMqmdFormat(char[] mqmdFormat) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqmdFormat,0,getStringValue(),beginMqmdFormat,MQMD_FORMAT_LEN);
       localMqmdFormatCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqmdFormatConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMqmdFormat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqmdFormat() {	 
   		return (substring(getStringValue(),beginMqmdFormat,beginMqmdFormat + MQMD_FORMAT_LEN));
   	}
         int localMqmdPriorityCounter = -1;
         public boolean isMqmdPriorityModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqmdPriorityCounter != sharedCounter;
            localMqmdPriorityCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQMD_PRIORITY_LEN = 4;
  	/**
	 * serializeMqmdPriority
	 */
	protected void serializeMqmdPriority(int mqmdPriority) {
           replaceValue( //  save the value as string
                   getBinaryString( mqmdPriority,MQMD_PRIORITY_LEN)
                  ,beginMqmdPriority
                  ,MQMD_PRIORITY_LEN
                 );
            localMqmdPriorityCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqmdPriorityMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqmdPriority is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqmdPriority() {	 
			return (getInt(beginMqmdPriority));
   	}
         int localMqmdPersistenceCounter = -1;
         public boolean isMqmdPersistenceModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqmdPersistenceCounter != sharedCounter;
            localMqmdPersistenceCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQMD_PERSISTENCE_LEN = 4;
  	/**
	 * serializeMqmdPersistence
	 */
	protected void serializeMqmdPersistence(int mqmdPersistence) {
           replaceValue( //  save the value as string
                   getBinaryString( mqmdPersistence,MQMD_PERSISTENCE_LEN)
                  ,beginMqmdPersistence
                  ,MQMD_PERSISTENCE_LEN
                 );
            localMqmdPersistenceCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqmdPersistenceMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqmdPersistence is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqmdPersistence() {	 
			return (getInt(beginMqmdPersistence));
   	}
     int localMqmdMsgidCounter = -1;
     public boolean isMqmdMsgidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqmdMsgidCounter != sharedCounter;
         localMqmdMsgidCounter = sharedCounter; return hasModified;
     }
	protected static final int MQMD_MSGID_LEN = 24;
	/**
	 * 	serialize this MqmdMsgid
	 */
   protected void serializeMqmdMsgid(char[] mqmdMsgid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqmdMsgid,0,getStringValue(),beginMqmdMsgid,MQMD_MSGID_LEN);
       localMqmdMsgidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqmdMsgidConstraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshMqmdMsgid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqmdMsgid() {	 
   		return (substring(getStringValue(),beginMqmdMsgid,beginMqmdMsgid + MQMD_MSGID_LEN));
   	}
     int localMqmdCorrelidCounter = -1;
     public boolean isMqmdCorrelidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqmdCorrelidCounter != sharedCounter;
         localMqmdCorrelidCounter = sharedCounter; return hasModified;
     }
	protected static final int MQMD_CORRELID_LEN = 24;
	/**
	 * 	serialize this MqmdCorrelid
	 */
   protected void serializeMqmdCorrelid(char[] mqmdCorrelid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqmdCorrelid,0,getStringValue(),beginMqmdCorrelid,MQMD_CORRELID_LEN);
       localMqmdCorrelidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqmdCorrelidConstraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshMqmdCorrelid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqmdCorrelid() {	 
   		return (substring(getStringValue(),beginMqmdCorrelid,beginMqmdCorrelid + MQMD_CORRELID_LEN));
   	}
         int localMqmdBackoutcountCounter = -1;
         public boolean isMqmdBackoutcountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqmdBackoutcountCounter != sharedCounter;
            localMqmdBackoutcountCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQMD_BACKOUTCOUNT_LEN = 4;
  	/**
	 * serializeMqmdBackoutcount
	 */
	protected void serializeMqmdBackoutcount(int mqmdBackoutcount) {
           replaceValue( //  save the value as string
                   getBinaryString( mqmdBackoutcount,MQMD_BACKOUTCOUNT_LEN)
                  ,beginMqmdBackoutcount
                  ,MQMD_BACKOUTCOUNT_LEN
                 );
            localMqmdBackoutcountCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqmdBackoutcountMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqmdBackoutcount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqmdBackoutcount() {	 
			return (getInt(beginMqmdBackoutcount));
   	}
     int localMqmdReplytoqCounter = -1;
     public boolean isMqmdReplytoqModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqmdReplytoqCounter != sharedCounter;
         localMqmdReplytoqCounter = sharedCounter; return hasModified;
     }
	protected static final int MQMD_REPLYTOQ_LEN = 48;
	/**
	 * 	serialize this MqmdReplytoq
	 */
   protected void serializeMqmdReplytoq(char[] mqmdReplytoq) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqmdReplytoq,0,getStringValue(),beginMqmdReplytoq,MQMD_REPLYTOQ_LEN);
       localMqmdReplytoqCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqmdReplytoqConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshMqmdReplytoq is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqmdReplytoq() {	 
   		return (substring(getStringValue(),beginMqmdReplytoq,beginMqmdReplytoq + MQMD_REPLYTOQ_LEN));
   	}
     int localMqmdReplytoqmgrCounter = -1;
     public boolean isMqmdReplytoqmgrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqmdReplytoqmgrCounter != sharedCounter;
         localMqmdReplytoqmgrCounter = sharedCounter; return hasModified;
     }
	protected static final int MQMD_REPLYTOQMGR_LEN = 48;
	/**
	 * 	serialize this MqmdReplytoqmgr
	 */
   protected void serializeMqmdReplytoqmgr(char[] mqmdReplytoqmgr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqmdReplytoqmgr,0,getStringValue(),beginMqmdReplytoqmgr,MQMD_REPLYTOQMGR_LEN);
       localMqmdReplytoqmgrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqmdReplytoqmgrConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshMqmdReplytoqmgr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqmdReplytoqmgr() {	 
   		return (substring(getStringValue(),beginMqmdReplytoqmgr,beginMqmdReplytoqmgr + MQMD_REPLYTOQMGR_LEN));
   	}
     int localMqmdUseridentifierCounter = -1;
     public boolean isMqmdUseridentifierModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqmdUseridentifierCounter != sharedCounter;
         localMqmdUseridentifierCounter = sharedCounter; return hasModified;
     }
	protected static final int MQMD_USERIDENTIFIER_LEN = 12;
	/**
	 * 	serialize this MqmdUseridentifier
	 */
   protected void serializeMqmdUseridentifier(char[] mqmdUseridentifier) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqmdUseridentifier,0,getStringValue(),beginMqmdUseridentifier,MQMD_USERIDENTIFIER_LEN);
       localMqmdUseridentifierCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqmdUseridentifierConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshMqmdUseridentifier is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqmdUseridentifier() {	 
   		return (substring(getStringValue(),beginMqmdUseridentifier,beginMqmdUseridentifier + MQMD_USERIDENTIFIER_LEN));
   	}
     int localMqmdAccountingtokenCounter = -1;
     public boolean isMqmdAccountingtokenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqmdAccountingtokenCounter != sharedCounter;
         localMqmdAccountingtokenCounter = sharedCounter; return hasModified;
     }
	protected static final int MQMD_ACCOUNTINGTOKEN_LEN = 32;
	/**
	 * 	serialize this MqmdAccountingtoken
	 */
   protected void serializeMqmdAccountingtoken(char[] mqmdAccountingtoken) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqmdAccountingtoken,0,getStringValue(),beginMqmdAccountingtoken,MQMD_ACCOUNTINGTOKEN_LEN);
       localMqmdAccountingtokenCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqmdAccountingtokenConstraints(char[] value) {
   			return super.checkConstraints(value , 32 ,false, false);
   }
    /**
	 *	refreshMqmdAccountingtoken is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqmdAccountingtoken() {	 
   		return (substring(getStringValue(),beginMqmdAccountingtoken,beginMqmdAccountingtoken + MQMD_ACCOUNTINGTOKEN_LEN));
   	}
     int localMqmdApplidentitydataCounter = -1;
     public boolean isMqmdApplidentitydataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqmdApplidentitydataCounter != sharedCounter;
         localMqmdApplidentitydataCounter = sharedCounter; return hasModified;
     }
	protected static final int MQMD_APPLIDENTITYDATA_LEN = 32;
	/**
	 * 	serialize this MqmdApplidentitydata
	 */
   protected void serializeMqmdApplidentitydata(char[] mqmdApplidentitydata) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqmdApplidentitydata,0,getStringValue(),beginMqmdApplidentitydata,MQMD_APPLIDENTITYDATA_LEN);
       localMqmdApplidentitydataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqmdApplidentitydataConstraints(char[] value) {
   			return super.checkConstraints(value , 32 ,false, false);
   }
    /**
	 *	refreshMqmdApplidentitydata is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqmdApplidentitydata() {	 
   		return (substring(getStringValue(),beginMqmdApplidentitydata,beginMqmdApplidentitydata + MQMD_APPLIDENTITYDATA_LEN));
   	}
         int localMqmdPutappltypeCounter = -1;
         public boolean isMqmdPutappltypeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqmdPutappltypeCounter != sharedCounter;
            localMqmdPutappltypeCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQMD_PUTAPPLTYPE_LEN = 4;
  	/**
	 * serializeMqmdPutappltype
	 */
	protected void serializeMqmdPutappltype(int mqmdPutappltype) {
           replaceValue( //  save the value as string
                   getBinaryString( mqmdPutappltype,MQMD_PUTAPPLTYPE_LEN)
                  ,beginMqmdPutappltype
                  ,MQMD_PUTAPPLTYPE_LEN
                 );
            localMqmdPutappltypeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqmdPutappltypeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqmdPutappltype is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqmdPutappltype() {	 
			return (getInt(beginMqmdPutappltype));
   	}
     int localMqmdPutapplnameCounter = -1;
     public boolean isMqmdPutapplnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqmdPutapplnameCounter != sharedCounter;
         localMqmdPutapplnameCounter = sharedCounter; return hasModified;
     }
	protected static final int MQMD_PUTAPPLNAME_LEN = 28;
	/**
	 * 	serialize this MqmdPutapplname
	 */
   protected void serializeMqmdPutapplname(char[] mqmdPutapplname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqmdPutapplname,0,getStringValue(),beginMqmdPutapplname,MQMD_PUTAPPLNAME_LEN);
       localMqmdPutapplnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqmdPutapplnameConstraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
    /**
	 *	refreshMqmdPutapplname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqmdPutapplname() {	 
   		return (substring(getStringValue(),beginMqmdPutapplname,beginMqmdPutapplname + MQMD_PUTAPPLNAME_LEN));
   	}
     int localMqmdPutdateCounter = -1;
     public boolean isMqmdPutdateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqmdPutdateCounter != sharedCounter;
         localMqmdPutdateCounter = sharedCounter; return hasModified;
     }
	protected static final int MQMD_PUTDATE_LEN = 8;
	/**
	 * 	serialize this MqmdPutdate
	 */
   protected void serializeMqmdPutdate(char[] mqmdPutdate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqmdPutdate,0,getStringValue(),beginMqmdPutdate,MQMD_PUTDATE_LEN);
       localMqmdPutdateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqmdPutdateConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMqmdPutdate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqmdPutdate() {	 
   		return (substring(getStringValue(),beginMqmdPutdate,beginMqmdPutdate + MQMD_PUTDATE_LEN));
   	}
     int localMqmdPuttimeCounter = -1;
     public boolean isMqmdPuttimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqmdPuttimeCounter != sharedCounter;
         localMqmdPuttimeCounter = sharedCounter; return hasModified;
     }
	protected static final int MQMD_PUTTIME_LEN = 8;
	/**
	 * 	serialize this MqmdPuttime
	 */
   protected void serializeMqmdPuttime(char[] mqmdPuttime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqmdPuttime,0,getStringValue(),beginMqmdPuttime,MQMD_PUTTIME_LEN);
       localMqmdPuttimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqmdPuttimeConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMqmdPuttime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqmdPuttime() {	 
   		return (substring(getStringValue(),beginMqmdPuttime,beginMqmdPuttime + MQMD_PUTTIME_LEN));
   	}
     int localMqmdApplorigindataCounter = -1;
     public boolean isMqmdApplorigindataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqmdApplorigindataCounter != sharedCounter;
         localMqmdApplorigindataCounter = sharedCounter; return hasModified;
     }
	protected static final int MQMD_APPLORIGINDATA_LEN = 4;
	/**
	 * 	serialize this MqmdApplorigindata
	 */
   protected void serializeMqmdApplorigindata(char[] mqmdApplorigindata) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mqmdApplorigindata,0,getStringValue(),beginMqmdApplorigindata,MQMD_APPLORIGINDATA_LEN);
       localMqmdApplorigindataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMqmdApplorigindataConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMqmdApplorigindata is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMqmdApplorigindata() {	 
   		return (substring(getStringValue(),beginMqmdApplorigindata,beginMqmdApplorigindata + MQMD_APPLORIGINDATA_LEN));
   	}




}
  
