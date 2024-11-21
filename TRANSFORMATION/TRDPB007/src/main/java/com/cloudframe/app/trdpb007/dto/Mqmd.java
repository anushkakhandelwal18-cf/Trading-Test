package com.cloudframe.app.trdpb007.dto;

/**
*  The class Mqmd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-21 at 09:21. using version 5.0.0.153
**/


import com.cloudframe.app.trdpb007.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Mqmd extends MqmdSerialized { 
   

						private char[] mqmdStrucid = new char[4];

								private int mqmdVersion;

								private int mqmdReport;

								private int mqmdMsgtype;

								private int mqmdExpiry;

								private int mqmdFeedback;

								private int mqmdEncoding;

								private int mqmdCodedcharsetid;

						private char[] mqmdFormat = new char[8];

								private int mqmdPriority;

								private int mqmdPersistence;

						private char[] mqmdMsgid = new char[24];

						private char[] mqmdCorrelid = new char[24];

								private int mqmdBackoutcount;

						private char[] mqmdReplytoq = new char[48];

						private char[] mqmdReplytoqmgr = new char[48];

						private char[] mqmdUseridentifier = new char[12];

						private char[] mqmdAccountingtoken = new char[32];

						private char[] mqmdApplidentitydata = new char[32];

								private int mqmdPutappltype;

						private char[] mqmdPutapplname = new char[28];

						private char[] mqmdPutdate = new char[8];

						private char[] mqmdPuttime = new char[8];

						private char[] mqmdApplorigindata = new char[4];
	
	/**
	* Constructor for Mqmd
	**/
    public Mqmd() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMqmdStrucid(("MD  ").toCharArray());
								setMqmdVersion(1);
								setMqmdReport(0);
								setMqmdMsgtype(8);
								setMqmdExpiry(-1);
								setMqmdFeedback(0);
								setMqmdEncoding(785);
								setMqmdCodedcharsetid(0);
								setMqmdFormat(fillSpace(8));
								setMqmdPriority(-1);
								setMqmdPersistence(2);
								setMqmdMsgid(fillLowValue(24));
								setMqmdCorrelid(fillLowValue(24));
								setMqmdBackoutcount(0);
								setMqmdReplytoq(fillSpace(48));
								setMqmdReplytoqmgr(fillSpace(48));
								setMqmdUseridentifier(fillSpace(12));
								setMqmdAccountingtoken(fillLowValue(32));
								setMqmdApplidentitydata(fillSpace(32));
								setMqmdPutappltype(0);
								setMqmdPutapplname(fillSpace(28));
								setMqmdPutdate(fillSpace(8));
								setMqmdPuttime(fillSpace(8));
								setMqmdApplorigindata(fillSpace(4));
    }


 

	/**
	 *	Returns the value of mqmdStrucid
	 *	@return mqmdStrucid
	 */
   public char[] getMqmdStrucid() throws CFException{
     if (isMqmdStrucidModified()) { 
        mqmdStrucid = refreshMqmdStrucid();
     }
   		return mqmdStrucid;
   }

  
	/**
	*  set variable mqmdStrucid
	*  Corresponding COBOL Variable is MQMD-STRUCID
	*  @param value
	**/
   public void setMqmdStrucid(char[] value) {
      mqmdStrucid = checkMqmdStrucidConstraints(value);
      serializeMqmdStrucid(mqmdStrucid);
   } 

     /**
	 * 	Update MqmdStrucid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqmdStrucid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqmdStrucid,mqmdStrucid.length);
   	
   }
   
   public void setMqmdStrucid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdStrucid,mqmdStrucid.length);
   	
   }
   
     /**
	 * 	Update MqmdStrucid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqmdStrucid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdStrucid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqmdStrucid with another Field
	 *	@param value
	 */
   public void setMqmdStrucid(Field source) {
       replace(source,0,source.length(),beginMqmdStrucid,MQMD_STRUCID_LEN);
   	
   }  
   
     /**
	 * 	Update MqmdStrucid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqmdStrucid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqmdStrucid,MQMD_STRUCID_LEN);
   	
   }
   
     /**
	 * 	Update MqmdStrucid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqmdStrucid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdStrucid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqmdVersion
	 *	@return mqmdVersion
	 */
	public int getMqmdVersion() throws CFException {
        if (isMqmdVersionModified()) { 
           mqmdVersion = refreshMqmdVersion();
        }
   		return mqmdVersion;
	}
	
	/**
	 * 	Update MqmdVersion with the passed value
	 *  Corresponding COBOL Variable is MQMD-VERSION
	 *	@param number
	 */
	public void setMqmdVersion(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqmdVersion = checkMqmdVersionMaxLimit(number); 
		serializeMqmdVersion(mqmdVersion);
	}


	public void setMqmdVersion(long number) {
	    number = checkMqmdVersionMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqmdVersion((int)number);
	}
	
	/**
	 *	Returns the value of mqmdReport
	 *	@return mqmdReport
	 */
	public int getMqmdReport() throws CFException {
        if (isMqmdReportModified()) { 
           mqmdReport = refreshMqmdReport();
        }
   		return mqmdReport;
	}
	
	/**
	 * 	Update MqmdReport with the passed value
	 *  Corresponding COBOL Variable is MQMD-REPORT
	 *	@param number
	 */
	public void setMqmdReport(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqmdReport = checkMqmdReportMaxLimit(number); 
		serializeMqmdReport(mqmdReport);
	}


	public void setMqmdReport(long number) {
	    number = checkMqmdReportMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqmdReport((int)number);
	}
	
	/**
	 *	Returns the value of mqmdMsgtype
	 *	@return mqmdMsgtype
	 */
	public int getMqmdMsgtype() throws CFException {
        if (isMqmdMsgtypeModified()) { 
           mqmdMsgtype = refreshMqmdMsgtype();
        }
   		return mqmdMsgtype;
	}
	
	/**
	 * 	Update MqmdMsgtype with the passed value
	 *  Corresponding COBOL Variable is MQMD-MSGTYPE
	 *	@param number
	 */
	public void setMqmdMsgtype(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqmdMsgtype = checkMqmdMsgtypeMaxLimit(number); 
		serializeMqmdMsgtype(mqmdMsgtype);
	}


	public void setMqmdMsgtype(long number) {
	    number = checkMqmdMsgtypeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqmdMsgtype((int)number);
	}
	
	/**
	 *	Returns the value of mqmdExpiry
	 *	@return mqmdExpiry
	 */
	public int getMqmdExpiry() throws CFException {
        if (isMqmdExpiryModified()) { 
           mqmdExpiry = refreshMqmdExpiry();
        }
   		return mqmdExpiry;
	}
	
	/**
	 * 	Update MqmdExpiry with the passed value
	 *  Corresponding COBOL Variable is MQMD-EXPIRY
	 *	@param number
	 */
	public void setMqmdExpiry(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqmdExpiry = checkMqmdExpiryMaxLimit(number); 
		serializeMqmdExpiry(mqmdExpiry);
	}


	public void setMqmdExpiry(long number) {
	    number = checkMqmdExpiryMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqmdExpiry((int)number);
	}
	
	/**
	 *	Returns the value of mqmdFeedback
	 *	@return mqmdFeedback
	 */
	public int getMqmdFeedback() throws CFException {
        if (isMqmdFeedbackModified()) { 
           mqmdFeedback = refreshMqmdFeedback();
        }
   		return mqmdFeedback;
	}
	
	/**
	 * 	Update MqmdFeedback with the passed value
	 *  Corresponding COBOL Variable is MQMD-FEEDBACK
	 *	@param number
	 */
	public void setMqmdFeedback(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqmdFeedback = checkMqmdFeedbackMaxLimit(number); 
		serializeMqmdFeedback(mqmdFeedback);
	}


	public void setMqmdFeedback(long number) {
	    number = checkMqmdFeedbackMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqmdFeedback((int)number);
	}
	
	/**
	 *	Returns the value of mqmdEncoding
	 *	@return mqmdEncoding
	 */
	public int getMqmdEncoding() throws CFException {
        if (isMqmdEncodingModified()) { 
           mqmdEncoding = refreshMqmdEncoding();
        }
   		return mqmdEncoding;
	}
	
	/**
	 * 	Update MqmdEncoding with the passed value
	 *  Corresponding COBOL Variable is MQMD-ENCODING
	 *	@param number
	 */
	public void setMqmdEncoding(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqmdEncoding = checkMqmdEncodingMaxLimit(number); 
		serializeMqmdEncoding(mqmdEncoding);
	}


	public void setMqmdEncoding(long number) {
	    number = checkMqmdEncodingMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqmdEncoding((int)number);
	}
	
	/**
	 *	Returns the value of mqmdCodedcharsetid
	 *	@return mqmdCodedcharsetid
	 */
	public int getMqmdCodedcharsetid() throws CFException {
        if (isMqmdCodedcharsetidModified()) { 
           mqmdCodedcharsetid = refreshMqmdCodedcharsetid();
        }
   		return mqmdCodedcharsetid;
	}
	
	/**
	 * 	Update MqmdCodedcharsetid with the passed value
	 *  Corresponding COBOL Variable is MQMD-CODEDCHARSETID
	 *	@param number
	 */
	public void setMqmdCodedcharsetid(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqmdCodedcharsetid = checkMqmdCodedcharsetidMaxLimit(number); 
		serializeMqmdCodedcharsetid(mqmdCodedcharsetid);
	}


	public void setMqmdCodedcharsetid(long number) {
	    number = checkMqmdCodedcharsetidMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqmdCodedcharsetid((int)number);
	}
	
	/**
	 *	Returns the value of mqmdFormat
	 *	@return mqmdFormat
	 */
   public char[] getMqmdFormat() throws CFException{
     if (isMqmdFormatModified()) { 
        mqmdFormat = refreshMqmdFormat();
     }
   		return mqmdFormat;
   }

  
	/**
	*  set variable mqmdFormat
	*  Corresponding COBOL Variable is MQMD-FORMAT
	*  @param value
	**/
   public void setMqmdFormat(char[] value) {
      mqmdFormat = checkMqmdFormatConstraints(value);
      serializeMqmdFormat(mqmdFormat);
   } 

     /**
	 * 	Update MqmdFormat 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqmdFormat(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqmdFormat,mqmdFormat.length);
   	
   }
   
   public void setMqmdFormat(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdFormat,mqmdFormat.length);
   	
   }
   
     /**
	 * 	Update MqmdFormat 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqmdFormat(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdFormat+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqmdFormat with another Field
	 *	@param value
	 */
   public void setMqmdFormat(Field source) {
       replace(source,0,source.length(),beginMqmdFormat,MQMD_FORMAT_LEN);
   	
   }  
   
     /**
	 * 	Update MqmdFormat 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqmdFormat(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqmdFormat,MQMD_FORMAT_LEN);
   	
   }
   
     /**
	 * 	Update MqmdFormat 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqmdFormat(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdFormat+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqmdPriority
	 *	@return mqmdPriority
	 */
	public int getMqmdPriority() throws CFException {
        if (isMqmdPriorityModified()) { 
           mqmdPriority = refreshMqmdPriority();
        }
   		return mqmdPriority;
	}
	
	/**
	 * 	Update MqmdPriority with the passed value
	 *  Corresponding COBOL Variable is MQMD-PRIORITY
	 *	@param number
	 */
	public void setMqmdPriority(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqmdPriority = checkMqmdPriorityMaxLimit(number); 
		serializeMqmdPriority(mqmdPriority);
	}


	public void setMqmdPriority(long number) {
	    number = checkMqmdPriorityMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqmdPriority((int)number);
	}
	
	/**
	 *	Returns the value of mqmdPersistence
	 *	@return mqmdPersistence
	 */
	public int getMqmdPersistence() throws CFException {
        if (isMqmdPersistenceModified()) { 
           mqmdPersistence = refreshMqmdPersistence();
        }
   		return mqmdPersistence;
	}
	
	/**
	 * 	Update MqmdPersistence with the passed value
	 *  Corresponding COBOL Variable is MQMD-PERSISTENCE
	 *	@param number
	 */
	public void setMqmdPersistence(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqmdPersistence = checkMqmdPersistenceMaxLimit(number); 
		serializeMqmdPersistence(mqmdPersistence);
	}


	public void setMqmdPersistence(long number) {
	    number = checkMqmdPersistenceMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqmdPersistence((int)number);
	}
	
	/**
	 *	Returns the value of mqmdMsgid
	 *	@return mqmdMsgid
	 */
   public char[] getMqmdMsgid() throws CFException{
     if (isMqmdMsgidModified()) { 
        mqmdMsgid = refreshMqmdMsgid();
     }
   		return mqmdMsgid;
   }

  
	/**
	*  set variable mqmdMsgid
	*  Corresponding COBOL Variable is MQMD-MSGID
	*  @param value
	**/
   public void setMqmdMsgid(char[] value) {
      mqmdMsgid = checkMqmdMsgidConstraints(value);
      serializeMqmdMsgid(mqmdMsgid);
   } 

     /**
	 * 	Update MqmdMsgid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqmdMsgid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqmdMsgid,mqmdMsgid.length);
   	
   }
   
   public void setMqmdMsgid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdMsgid,mqmdMsgid.length);
   	
   }
   
     /**
	 * 	Update MqmdMsgid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqmdMsgid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdMsgid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqmdMsgid with another Field
	 *	@param value
	 */
   public void setMqmdMsgid(Field source) {
       replace(source,0,source.length(),beginMqmdMsgid,MQMD_MSGID_LEN);
   	
   }  
   
     /**
	 * 	Update MqmdMsgid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqmdMsgid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqmdMsgid,MQMD_MSGID_LEN);
   	
   }
   
     /**
	 * 	Update MqmdMsgid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqmdMsgid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdMsgid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqmdCorrelid
	 *	@return mqmdCorrelid
	 */
   public char[] getMqmdCorrelid() throws CFException{
     if (isMqmdCorrelidModified()) { 
        mqmdCorrelid = refreshMqmdCorrelid();
     }
   		return mqmdCorrelid;
   }

  
	/**
	*  set variable mqmdCorrelid
	*  Corresponding COBOL Variable is MQMD-CORRELID
	*  @param value
	**/
   public void setMqmdCorrelid(char[] value) {
      mqmdCorrelid = checkMqmdCorrelidConstraints(value);
      serializeMqmdCorrelid(mqmdCorrelid);
   } 

     /**
	 * 	Update MqmdCorrelid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqmdCorrelid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqmdCorrelid,mqmdCorrelid.length);
   	
   }
   
   public void setMqmdCorrelid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdCorrelid,mqmdCorrelid.length);
   	
   }
   
     /**
	 * 	Update MqmdCorrelid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqmdCorrelid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdCorrelid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqmdCorrelid with another Field
	 *	@param value
	 */
   public void setMqmdCorrelid(Field source) {
       replace(source,0,source.length(),beginMqmdCorrelid,MQMD_CORRELID_LEN);
   	
   }  
   
     /**
	 * 	Update MqmdCorrelid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqmdCorrelid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqmdCorrelid,MQMD_CORRELID_LEN);
   	
   }
   
     /**
	 * 	Update MqmdCorrelid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqmdCorrelid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdCorrelid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqmdBackoutcount
	 *	@return mqmdBackoutcount
	 */
	public int getMqmdBackoutcount() throws CFException {
        if (isMqmdBackoutcountModified()) { 
           mqmdBackoutcount = refreshMqmdBackoutcount();
        }
   		return mqmdBackoutcount;
	}
	
	/**
	 * 	Update MqmdBackoutcount with the passed value
	 *  Corresponding COBOL Variable is MQMD-BACKOUTCOUNT
	 *	@param number
	 */
	public void setMqmdBackoutcount(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqmdBackoutcount = checkMqmdBackoutcountMaxLimit(number); 
		serializeMqmdBackoutcount(mqmdBackoutcount);
	}


	public void setMqmdBackoutcount(long number) {
	    number = checkMqmdBackoutcountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqmdBackoutcount((int)number);
	}
	
	/**
	 *	Returns the value of mqmdReplytoq
	 *	@return mqmdReplytoq
	 */
   public char[] getMqmdReplytoq() throws CFException{
     if (isMqmdReplytoqModified()) { 
        mqmdReplytoq = refreshMqmdReplytoq();
     }
   		return mqmdReplytoq;
   }

  
	/**
	*  set variable mqmdReplytoq
	*  Corresponding COBOL Variable is MQMD-REPLYTOQ
	*  @param value
	**/
   public void setMqmdReplytoq(char[] value) {
      mqmdReplytoq = checkMqmdReplytoqConstraints(value);
      serializeMqmdReplytoq(mqmdReplytoq);
   } 

     /**
	 * 	Update MqmdReplytoq 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqmdReplytoq(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqmdReplytoq,mqmdReplytoq.length);
   	
   }
   
   public void setMqmdReplytoq(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdReplytoq,mqmdReplytoq.length);
   	
   }
   
     /**
	 * 	Update MqmdReplytoq 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqmdReplytoq(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdReplytoq+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqmdReplytoq with another Field
	 *	@param value
	 */
   public void setMqmdReplytoq(Field source) {
       replace(source,0,source.length(),beginMqmdReplytoq,MQMD_REPLYTOQ_LEN);
   	
   }  
   
     /**
	 * 	Update MqmdReplytoq 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqmdReplytoq(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqmdReplytoq,MQMD_REPLYTOQ_LEN);
   	
   }
   
     /**
	 * 	Update MqmdReplytoq 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqmdReplytoq(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdReplytoq+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqmdReplytoqmgr
	 *	@return mqmdReplytoqmgr
	 */
   public char[] getMqmdReplytoqmgr() throws CFException{
     if (isMqmdReplytoqmgrModified()) { 
        mqmdReplytoqmgr = refreshMqmdReplytoqmgr();
     }
   		return mqmdReplytoqmgr;
   }

  
	/**
	*  set variable mqmdReplytoqmgr
	*  Corresponding COBOL Variable is MQMD-REPLYTOQMGR
	*  @param value
	**/
   public void setMqmdReplytoqmgr(char[] value) {
      mqmdReplytoqmgr = checkMqmdReplytoqmgrConstraints(value);
      serializeMqmdReplytoqmgr(mqmdReplytoqmgr);
   } 

     /**
	 * 	Update MqmdReplytoqmgr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqmdReplytoqmgr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqmdReplytoqmgr,mqmdReplytoqmgr.length);
   	
   }
   
   public void setMqmdReplytoqmgr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdReplytoqmgr,mqmdReplytoqmgr.length);
   	
   }
   
     /**
	 * 	Update MqmdReplytoqmgr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqmdReplytoqmgr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdReplytoqmgr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqmdReplytoqmgr with another Field
	 *	@param value
	 */
   public void setMqmdReplytoqmgr(Field source) {
       replace(source,0,source.length(),beginMqmdReplytoqmgr,MQMD_REPLYTOQMGR_LEN);
   	
   }  
   
     /**
	 * 	Update MqmdReplytoqmgr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqmdReplytoqmgr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqmdReplytoqmgr,MQMD_REPLYTOQMGR_LEN);
   	
   }
   
     /**
	 * 	Update MqmdReplytoqmgr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqmdReplytoqmgr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdReplytoqmgr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqmdUseridentifier
	 *	@return mqmdUseridentifier
	 */
   public char[] getMqmdUseridentifier() throws CFException{
     if (isMqmdUseridentifierModified()) { 
        mqmdUseridentifier = refreshMqmdUseridentifier();
     }
   		return mqmdUseridentifier;
   }

  
	/**
	*  set variable mqmdUseridentifier
	*  Corresponding COBOL Variable is MQMD-USERIDENTIFIER
	*  @param value
	**/
   public void setMqmdUseridentifier(char[] value) {
      mqmdUseridentifier = checkMqmdUseridentifierConstraints(value);
      serializeMqmdUseridentifier(mqmdUseridentifier);
   } 

     /**
	 * 	Update MqmdUseridentifier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqmdUseridentifier(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqmdUseridentifier,mqmdUseridentifier.length);
   	
   }
   
   public void setMqmdUseridentifier(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdUseridentifier,mqmdUseridentifier.length);
   	
   }
   
     /**
	 * 	Update MqmdUseridentifier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqmdUseridentifier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdUseridentifier+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqmdUseridentifier with another Field
	 *	@param value
	 */
   public void setMqmdUseridentifier(Field source) {
       replace(source,0,source.length(),beginMqmdUseridentifier,MQMD_USERIDENTIFIER_LEN);
   	
   }  
   
     /**
	 * 	Update MqmdUseridentifier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqmdUseridentifier(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqmdUseridentifier,MQMD_USERIDENTIFIER_LEN);
   	
   }
   
     /**
	 * 	Update MqmdUseridentifier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqmdUseridentifier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdUseridentifier+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqmdAccountingtoken
	 *	@return mqmdAccountingtoken
	 */
   public char[] getMqmdAccountingtoken() throws CFException{
     if (isMqmdAccountingtokenModified()) { 
        mqmdAccountingtoken = refreshMqmdAccountingtoken();
     }
   		return mqmdAccountingtoken;
   }

  
	/**
	*  set variable mqmdAccountingtoken
	*  Corresponding COBOL Variable is MQMD-ACCOUNTINGTOKEN
	*  @param value
	**/
   public void setMqmdAccountingtoken(char[] value) {
      mqmdAccountingtoken = checkMqmdAccountingtokenConstraints(value);
      serializeMqmdAccountingtoken(mqmdAccountingtoken);
   } 

     /**
	 * 	Update MqmdAccountingtoken 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqmdAccountingtoken(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqmdAccountingtoken,mqmdAccountingtoken.length);
   	
   }
   
   public void setMqmdAccountingtoken(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdAccountingtoken,mqmdAccountingtoken.length);
   	
   }
   
     /**
	 * 	Update MqmdAccountingtoken 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqmdAccountingtoken(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdAccountingtoken+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqmdAccountingtoken with another Field
	 *	@param value
	 */
   public void setMqmdAccountingtoken(Field source) {
       replace(source,0,source.length(),beginMqmdAccountingtoken,MQMD_ACCOUNTINGTOKEN_LEN);
   	
   }  
   
     /**
	 * 	Update MqmdAccountingtoken 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqmdAccountingtoken(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqmdAccountingtoken,MQMD_ACCOUNTINGTOKEN_LEN);
   	
   }
   
     /**
	 * 	Update MqmdAccountingtoken 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqmdAccountingtoken(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdAccountingtoken+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqmdApplidentitydata
	 *	@return mqmdApplidentitydata
	 */
   public char[] getMqmdApplidentitydata() throws CFException{
     if (isMqmdApplidentitydataModified()) { 
        mqmdApplidentitydata = refreshMqmdApplidentitydata();
     }
   		return mqmdApplidentitydata;
   }

  
	/**
	*  set variable mqmdApplidentitydata
	*  Corresponding COBOL Variable is MQMD-APPLIDENTITYDATA
	*  @param value
	**/
   public void setMqmdApplidentitydata(char[] value) {
      mqmdApplidentitydata = checkMqmdApplidentitydataConstraints(value);
      serializeMqmdApplidentitydata(mqmdApplidentitydata);
   } 

     /**
	 * 	Update MqmdApplidentitydata 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqmdApplidentitydata(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqmdApplidentitydata,mqmdApplidentitydata.length);
   	
   }
   
   public void setMqmdApplidentitydata(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdApplidentitydata,mqmdApplidentitydata.length);
   	
   }
   
     /**
	 * 	Update MqmdApplidentitydata 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqmdApplidentitydata(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdApplidentitydata+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqmdApplidentitydata with another Field
	 *	@param value
	 */
   public void setMqmdApplidentitydata(Field source) {
       replace(source,0,source.length(),beginMqmdApplidentitydata,MQMD_APPLIDENTITYDATA_LEN);
   	
   }  
   
     /**
	 * 	Update MqmdApplidentitydata 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqmdApplidentitydata(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqmdApplidentitydata,MQMD_APPLIDENTITYDATA_LEN);
   	
   }
   
     /**
	 * 	Update MqmdApplidentitydata 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqmdApplidentitydata(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdApplidentitydata+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqmdPutappltype
	 *	@return mqmdPutappltype
	 */
	public int getMqmdPutappltype() throws CFException {
        if (isMqmdPutappltypeModified()) { 
           mqmdPutappltype = refreshMqmdPutappltype();
        }
   		return mqmdPutappltype;
	}
	
	/**
	 * 	Update MqmdPutappltype with the passed value
	 *  Corresponding COBOL Variable is MQMD-PUTAPPLTYPE
	 *	@param number
	 */
	public void setMqmdPutappltype(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqmdPutappltype = checkMqmdPutappltypeMaxLimit(number); 
		serializeMqmdPutappltype(mqmdPutappltype);
	}


	public void setMqmdPutappltype(long number) {
	    number = checkMqmdPutappltypeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqmdPutappltype((int)number);
	}
	
	/**
	 *	Returns the value of mqmdPutapplname
	 *	@return mqmdPutapplname
	 */
   public char[] getMqmdPutapplname() throws CFException{
     if (isMqmdPutapplnameModified()) { 
        mqmdPutapplname = refreshMqmdPutapplname();
     }
   		return mqmdPutapplname;
   }

  
	/**
	*  set variable mqmdPutapplname
	*  Corresponding COBOL Variable is MQMD-PUTAPPLNAME
	*  @param value
	**/
   public void setMqmdPutapplname(char[] value) {
      mqmdPutapplname = checkMqmdPutapplnameConstraints(value);
      serializeMqmdPutapplname(mqmdPutapplname);
   } 

     /**
	 * 	Update MqmdPutapplname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqmdPutapplname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqmdPutapplname,mqmdPutapplname.length);
   	
   }
   
   public void setMqmdPutapplname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdPutapplname,mqmdPutapplname.length);
   	
   }
   
     /**
	 * 	Update MqmdPutapplname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqmdPutapplname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdPutapplname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqmdPutapplname with another Field
	 *	@param value
	 */
   public void setMqmdPutapplname(Field source) {
       replace(source,0,source.length(),beginMqmdPutapplname,MQMD_PUTAPPLNAME_LEN);
   	
   }  
   
     /**
	 * 	Update MqmdPutapplname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqmdPutapplname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqmdPutapplname,MQMD_PUTAPPLNAME_LEN);
   	
   }
   
     /**
	 * 	Update MqmdPutapplname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqmdPutapplname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdPutapplname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqmdPutdate
	 *	@return mqmdPutdate
	 */
   public char[] getMqmdPutdate() throws CFException{
     if (isMqmdPutdateModified()) { 
        mqmdPutdate = refreshMqmdPutdate();
     }
   		return mqmdPutdate;
   }

  
	/**
	*  set variable mqmdPutdate
	*  Corresponding COBOL Variable is MQMD-PUTDATE
	*  @param value
	**/
   public void setMqmdPutdate(char[] value) {
      mqmdPutdate = checkMqmdPutdateConstraints(value);
      serializeMqmdPutdate(mqmdPutdate);
   } 

     /**
	 * 	Update MqmdPutdate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqmdPutdate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqmdPutdate,mqmdPutdate.length);
   	
   }
   
   public void setMqmdPutdate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdPutdate,mqmdPutdate.length);
   	
   }
   
     /**
	 * 	Update MqmdPutdate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqmdPutdate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdPutdate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqmdPutdate with another Field
	 *	@param value
	 */
   public void setMqmdPutdate(Field source) {
       replace(source,0,source.length(),beginMqmdPutdate,MQMD_PUTDATE_LEN);
   	
   }  
   
     /**
	 * 	Update MqmdPutdate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqmdPutdate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqmdPutdate,MQMD_PUTDATE_LEN);
   	
   }
   
     /**
	 * 	Update MqmdPutdate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqmdPutdate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdPutdate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqmdPuttime
	 *	@return mqmdPuttime
	 */
   public char[] getMqmdPuttime() throws CFException{
     if (isMqmdPuttimeModified()) { 
        mqmdPuttime = refreshMqmdPuttime();
     }
   		return mqmdPuttime;
   }

  
	/**
	*  set variable mqmdPuttime
	*  Corresponding COBOL Variable is MQMD-PUTTIME
	*  @param value
	**/
   public void setMqmdPuttime(char[] value) {
      mqmdPuttime = checkMqmdPuttimeConstraints(value);
      serializeMqmdPuttime(mqmdPuttime);
   } 

     /**
	 * 	Update MqmdPuttime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqmdPuttime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqmdPuttime,mqmdPuttime.length);
   	
   }
   
   public void setMqmdPuttime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdPuttime,mqmdPuttime.length);
   	
   }
   
     /**
	 * 	Update MqmdPuttime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqmdPuttime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdPuttime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqmdPuttime with another Field
	 *	@param value
	 */
   public void setMqmdPuttime(Field source) {
       replace(source,0,source.length(),beginMqmdPuttime,MQMD_PUTTIME_LEN);
   	
   }  
   
     /**
	 * 	Update MqmdPuttime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqmdPuttime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqmdPuttime,MQMD_PUTTIME_LEN);
   	
   }
   
     /**
	 * 	Update MqmdPuttime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqmdPuttime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdPuttime+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqmdApplorigindata
	 *	@return mqmdApplorigindata
	 */
   public char[] getMqmdApplorigindata() throws CFException{
     if (isMqmdApplorigindataModified()) { 
        mqmdApplorigindata = refreshMqmdApplorigindata();
     }
   		return mqmdApplorigindata;
   }

  
	/**
	*  set variable mqmdApplorigindata
	*  Corresponding COBOL Variable is MQMD-APPLORIGINDATA
	*  @param value
	**/
   public void setMqmdApplorigindata(char[] value) {
      mqmdApplorigindata = checkMqmdApplorigindataConstraints(value);
      serializeMqmdApplorigindata(mqmdApplorigindata);
   } 

     /**
	 * 	Update MqmdApplorigindata 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqmdApplorigindata(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqmdApplorigindata,mqmdApplorigindata.length);
   	
   }
   
   public void setMqmdApplorigindata(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdApplorigindata,mqmdApplorigindata.length);
   	
   }
   
     /**
	 * 	Update MqmdApplorigindata 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqmdApplorigindata(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdApplorigindata+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqmdApplorigindata with another Field
	 *	@param value
	 */
   public void setMqmdApplorigindata(Field source) {
       replace(source,0,source.length(),beginMqmdApplorigindata,MQMD_APPLORIGINDATA_LEN);
   	
   }  
   
     /**
	 * 	Update MqmdApplorigindata 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqmdApplorigindata(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqmdApplorigindata,MQMD_APPLORIGINDATA_LEN);
   	
   }
   
     /**
	 * 	Update MqmdApplorigindata 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqmdApplorigindata(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqmdApplorigindata+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMqmdFieldLength() {
			return MQMD_LENGTH;
		}

}
  
