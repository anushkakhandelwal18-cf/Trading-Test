package com.cloudframe.app.trdpb007.dto;

/**
*  The class Mqpmo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:38. using version 5.0.0.163
**/


import com.cloudframe.app.trdpb007.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Mqpmo extends MqpmoSerialized { 
   

						private char[] mqpmoStrucid = new char[4];

								private int mqpmoVersion;

								private int mqpmoOptions;

								private int mqpmoTimeout;

								private int mqpmoContext;

								private int mqpmoKnowndestcount;

								private int mqpmoUnknowndestcount;

								private int mqpmoInvaliddestcount;

						private char[] mqpmoResolvedqname = new char[48];

						private char[] mqpmoResolvedqmgrname = new char[48];

								private int mqpmoRecspresent;

								private int mqpmoPutmsgrecfields;

								private int mqpmoPutmsgrecoffset;

								private int mqpmoResponserecoffset;

								private int mqpmoPutmsgrecptr;

								private int mqpmoResponserecptr;

								private long mqpmoOriginalmsghandle;

								private long mqpmoNewmsghandle;

								private int mqpmoAction;

								private int mqpmoPublevel;
	
	/**
	* Constructor for Mqpmo
	**/
    public Mqpmo() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMqpmoStrucid(("PMO ").toCharArray());
								setMqpmoVersion(1);
								setMqpmoOptions(0);
								setMqpmoTimeout(-1);
								setMqpmoContext(0);
								setMqpmoKnowndestcount(0);
								setMqpmoUnknowndestcount(0);
								setMqpmoInvaliddestcount(0);
								setMqpmoResolvedqname(fillSpace(48));
								setMqpmoResolvedqmgrname(fillSpace(48));
								setMqpmoRecspresent(0);
								setMqpmoPutmsgrecfields(0);
								setMqpmoPutmsgrecoffset(0);
								setMqpmoResponserecoffset(0);
								setMqpmoOriginalmsghandle(0L);
								setMqpmoNewmsghandle(0L);
								setMqpmoAction(0);
								setMqpmoPublevel(9);
    }


 

	/**
	 *	Returns the value of mqpmoStrucid
	 *	@return mqpmoStrucid
	 */
   public char[] getMqpmoStrucid() throws CFException{
     if (isMqpmoStrucidModified()) { 
        mqpmoStrucid = refreshMqpmoStrucid();
     }
   		return mqpmoStrucid;
   }

  
	/**
	*  set variable mqpmoStrucid
	*  Corresponding COBOL Variable is MQPMO-STRUCID
	*  @param value
	**/
   public void setMqpmoStrucid(char[] value) {
      mqpmoStrucid = checkMqpmoStrucidConstraints(value);
      serializeMqpmoStrucid(mqpmoStrucid);
   } 

     /**
	 * 	Update MqpmoStrucid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqpmoStrucid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqpmoStrucid,mqpmoStrucid.length);
   	
   }
   
   public void setMqpmoStrucid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqpmoStrucid,mqpmoStrucid.length);
   	
   }
   
     /**
	 * 	Update MqpmoStrucid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqpmoStrucid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqpmoStrucid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqpmoStrucid with another Field
	 *	@param value
	 */
   public void setMqpmoStrucid(Field source) {
       replace(source,0,source.length(),beginMqpmoStrucid,MQPMO_STRUCID_LEN);
   	
   }  
   
     /**
	 * 	Update MqpmoStrucid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqpmoStrucid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqpmoStrucid,MQPMO_STRUCID_LEN);
   	
   }
   
     /**
	 * 	Update MqpmoStrucid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqpmoStrucid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqpmoStrucid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqpmoVersion
	 *	@return mqpmoVersion
	 */
	public int getMqpmoVersion() throws CFException {
        if (isMqpmoVersionModified()) { 
           mqpmoVersion = refreshMqpmoVersion();
        }
   		return mqpmoVersion;
	}
	
	/**
	 * 	Update MqpmoVersion with the passed value
	 *  Corresponding COBOL Variable is MQPMO-VERSION
	 *	@param number
	 */
	public void setMqpmoVersion(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoVersion = checkMqpmoVersionMaxLimit(number); 
		serializeMqpmoVersion(mqpmoVersion);
	}


	public void setMqpmoVersion(long number) {
	    number = checkMqpmoVersionMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqpmoVersion((int)number);
	}
	
	/**
	 *	Returns the value of mqpmoOptions
	 *	@return mqpmoOptions
	 */
	public int getMqpmoOptions() throws CFException {
        if (isMqpmoOptionsModified()) { 
           mqpmoOptions = refreshMqpmoOptions();
        }
   		return mqpmoOptions;
	}
	
	/**
	 * 	Update MqpmoOptions with the passed value
	 *  Corresponding COBOL Variable is MQPMO-OPTIONS
	 *	@param number
	 */
	public void setMqpmoOptions(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoOptions = checkMqpmoOptionsMaxLimit(number); 
		serializeMqpmoOptions(mqpmoOptions);
	}


	public void setMqpmoOptions(long number) {
	    number = checkMqpmoOptionsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqpmoOptions((int)number);
	}
	
	/**
	 *	Returns the value of mqpmoTimeout
	 *	@return mqpmoTimeout
	 */
	public int getMqpmoTimeout() throws CFException {
        if (isMqpmoTimeoutModified()) { 
           mqpmoTimeout = refreshMqpmoTimeout();
        }
   		return mqpmoTimeout;
	}
	
	/**
	 * 	Update MqpmoTimeout with the passed value
	 *  Corresponding COBOL Variable is MQPMO-TIMEOUT
	 *	@param number
	 */
	public void setMqpmoTimeout(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoTimeout = checkMqpmoTimeoutMaxLimit(number); 
		serializeMqpmoTimeout(mqpmoTimeout);
	}


	public void setMqpmoTimeout(long number) {
	    number = checkMqpmoTimeoutMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqpmoTimeout((int)number);
	}
	
	/**
	 *	Returns the value of mqpmoContext
	 *	@return mqpmoContext
	 */
	public int getMqpmoContext() throws CFException {
        if (isMqpmoContextModified()) { 
           mqpmoContext = refreshMqpmoContext();
        }
   		return mqpmoContext;
	}
	
	/**
	 * 	Update MqpmoContext with the passed value
	 *  Corresponding COBOL Variable is MQPMO-CONTEXT
	 *	@param number
	 */
	public void setMqpmoContext(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoContext = checkMqpmoContextMaxLimit(number); 
		serializeMqpmoContext(mqpmoContext);
	}


	public void setMqpmoContext(long number) {
	    number = checkMqpmoContextMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqpmoContext((int)number);
	}
	
	/**
	 *	Returns the value of mqpmoKnowndestcount
	 *	@return mqpmoKnowndestcount
	 */
	public int getMqpmoKnowndestcount() throws CFException {
        if (isMqpmoKnowndestcountModified()) { 
           mqpmoKnowndestcount = refreshMqpmoKnowndestcount();
        }
   		return mqpmoKnowndestcount;
	}
	
	/**
	 * 	Update MqpmoKnowndestcount with the passed value
	 *  Corresponding COBOL Variable is MQPMO-KNOWNDESTCOUNT
	 *	@param number
	 */
	public void setMqpmoKnowndestcount(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoKnowndestcount = checkMqpmoKnowndestcountMaxLimit(number); 
		serializeMqpmoKnowndestcount(mqpmoKnowndestcount);
	}


	public void setMqpmoKnowndestcount(long number) {
	    number = checkMqpmoKnowndestcountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqpmoKnowndestcount((int)number);
	}
	
	/**
	 *	Returns the value of mqpmoUnknowndestcount
	 *	@return mqpmoUnknowndestcount
	 */
	public int getMqpmoUnknowndestcount() throws CFException {
        if (isMqpmoUnknowndestcountModified()) { 
           mqpmoUnknowndestcount = refreshMqpmoUnknowndestcount();
        }
   		return mqpmoUnknowndestcount;
	}
	
	/**
	 * 	Update MqpmoUnknowndestcount with the passed value
	 *  Corresponding COBOL Variable is MQPMO-UNKNOWNDESTCOUNT
	 *	@param number
	 */
	public void setMqpmoUnknowndestcount(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoUnknowndestcount = checkMqpmoUnknowndestcountMaxLimit(number); 
		serializeMqpmoUnknowndestcount(mqpmoUnknowndestcount);
	}


	public void setMqpmoUnknowndestcount(long number) {
	    number = checkMqpmoUnknowndestcountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqpmoUnknowndestcount((int)number);
	}
	
	/**
	 *	Returns the value of mqpmoInvaliddestcount
	 *	@return mqpmoInvaliddestcount
	 */
	public int getMqpmoInvaliddestcount() throws CFException {
        if (isMqpmoInvaliddestcountModified()) { 
           mqpmoInvaliddestcount = refreshMqpmoInvaliddestcount();
        }
   		return mqpmoInvaliddestcount;
	}
	
	/**
	 * 	Update MqpmoInvaliddestcount with the passed value
	 *  Corresponding COBOL Variable is MQPMO-INVALIDDESTCOUNT
	 *	@param number
	 */
	public void setMqpmoInvaliddestcount(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoInvaliddestcount = checkMqpmoInvaliddestcountMaxLimit(number); 
		serializeMqpmoInvaliddestcount(mqpmoInvaliddestcount);
	}


	public void setMqpmoInvaliddestcount(long number) {
	    number = checkMqpmoInvaliddestcountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqpmoInvaliddestcount((int)number);
	}
	
	/**
	 *	Returns the value of mqpmoResolvedqname
	 *	@return mqpmoResolvedqname
	 */
   public char[] getMqpmoResolvedqname() throws CFException{
     if (isMqpmoResolvedqnameModified()) { 
        mqpmoResolvedqname = refreshMqpmoResolvedqname();
     }
   		return mqpmoResolvedqname;
   }

  
	/**
	*  set variable mqpmoResolvedqname
	*  Corresponding COBOL Variable is MQPMO-RESOLVEDQNAME
	*  @param value
	**/
   public void setMqpmoResolvedqname(char[] value) {
      mqpmoResolvedqname = checkMqpmoResolvedqnameConstraints(value);
      serializeMqpmoResolvedqname(mqpmoResolvedqname);
   } 

     /**
	 * 	Update MqpmoResolvedqname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqpmoResolvedqname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqpmoResolvedqname,mqpmoResolvedqname.length);
   	
   }
   
   public void setMqpmoResolvedqname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqpmoResolvedqname,mqpmoResolvedqname.length);
   	
   }
   
     /**
	 * 	Update MqpmoResolvedqname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqpmoResolvedqname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqpmoResolvedqname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqpmoResolvedqname with another Field
	 *	@param value
	 */
   public void setMqpmoResolvedqname(Field source) {
       replace(source,0,source.length(),beginMqpmoResolvedqname,MQPMO_RESOLVEDQNAME_LEN);
   	
   }  
   
     /**
	 * 	Update MqpmoResolvedqname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqpmoResolvedqname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqpmoResolvedqname,MQPMO_RESOLVEDQNAME_LEN);
   	
   }
   
     /**
	 * 	Update MqpmoResolvedqname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqpmoResolvedqname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqpmoResolvedqname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqpmoResolvedqmgrname
	 *	@return mqpmoResolvedqmgrname
	 */
   public char[] getMqpmoResolvedqmgrname() throws CFException{
     if (isMqpmoResolvedqmgrnameModified()) { 
        mqpmoResolvedqmgrname = refreshMqpmoResolvedqmgrname();
     }
   		return mqpmoResolvedqmgrname;
   }

  
	/**
	*  set variable mqpmoResolvedqmgrname
	*  Corresponding COBOL Variable is MQPMO-RESOLVEDQMGRNAME
	*  @param value
	**/
   public void setMqpmoResolvedqmgrname(char[] value) {
      mqpmoResolvedqmgrname = checkMqpmoResolvedqmgrnameConstraints(value);
      serializeMqpmoResolvedqmgrname(mqpmoResolvedqmgrname);
   } 

     /**
	 * 	Update MqpmoResolvedqmgrname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqpmoResolvedqmgrname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqpmoResolvedqmgrname,mqpmoResolvedqmgrname.length);
   	
   }
   
   public void setMqpmoResolvedqmgrname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqpmoResolvedqmgrname,mqpmoResolvedqmgrname.length);
   	
   }
   
     /**
	 * 	Update MqpmoResolvedqmgrname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqpmoResolvedqmgrname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqpmoResolvedqmgrname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqpmoResolvedqmgrname with another Field
	 *	@param value
	 */
   public void setMqpmoResolvedqmgrname(Field source) {
       replace(source,0,source.length(),beginMqpmoResolvedqmgrname,MQPMO_RESOLVEDQMGRNAME_LEN);
   	
   }  
   
     /**
	 * 	Update MqpmoResolvedqmgrname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqpmoResolvedqmgrname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqpmoResolvedqmgrname,MQPMO_RESOLVEDQMGRNAME_LEN);
   	
   }
   
     /**
	 * 	Update MqpmoResolvedqmgrname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqpmoResolvedqmgrname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqpmoResolvedqmgrname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqpmoRecspresent
	 *	@return mqpmoRecspresent
	 */
	public int getMqpmoRecspresent() throws CFException {
        if (isMqpmoRecspresentModified()) { 
           mqpmoRecspresent = refreshMqpmoRecspresent();
        }
   		return mqpmoRecspresent;
	}
	
	/**
	 * 	Update MqpmoRecspresent with the passed value
	 *  Corresponding COBOL Variable is MQPMO-RECSPRESENT
	 *	@param number
	 */
	public void setMqpmoRecspresent(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoRecspresent = checkMqpmoRecspresentMaxLimit(number); 
		serializeMqpmoRecspresent(mqpmoRecspresent);
	}


	public void setMqpmoRecspresent(long number) {
	    number = checkMqpmoRecspresentMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqpmoRecspresent((int)number);
	}
	
	/**
	 *	Returns the value of mqpmoPutmsgrecfields
	 *	@return mqpmoPutmsgrecfields
	 */
	public int getMqpmoPutmsgrecfields() throws CFException {
        if (isMqpmoPutmsgrecfieldsModified()) { 
           mqpmoPutmsgrecfields = refreshMqpmoPutmsgrecfields();
        }
   		return mqpmoPutmsgrecfields;
	}
	
	/**
	 * 	Update MqpmoPutmsgrecfields with the passed value
	 *  Corresponding COBOL Variable is MQPMO-PUTMSGRECFIELDS
	 *	@param number
	 */
	public void setMqpmoPutmsgrecfields(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoPutmsgrecfields = checkMqpmoPutmsgrecfieldsMaxLimit(number); 
		serializeMqpmoPutmsgrecfields(mqpmoPutmsgrecfields);
	}


	public void setMqpmoPutmsgrecfields(long number) {
	    number = checkMqpmoPutmsgrecfieldsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqpmoPutmsgrecfields((int)number);
	}
	
	/**
	 *	Returns the value of mqpmoPutmsgrecoffset
	 *	@return mqpmoPutmsgrecoffset
	 */
	public int getMqpmoPutmsgrecoffset() throws CFException {
        if (isMqpmoPutmsgrecoffsetModified()) { 
           mqpmoPutmsgrecoffset = refreshMqpmoPutmsgrecoffset();
        }
   		return mqpmoPutmsgrecoffset;
	}
	
	/**
	 * 	Update MqpmoPutmsgrecoffset with the passed value
	 *  Corresponding COBOL Variable is MQPMO-PUTMSGRECOFFSET
	 *	@param number
	 */
	public void setMqpmoPutmsgrecoffset(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoPutmsgrecoffset = checkMqpmoPutmsgrecoffsetMaxLimit(number); 
		serializeMqpmoPutmsgrecoffset(mqpmoPutmsgrecoffset);
	}


	public void setMqpmoPutmsgrecoffset(long number) {
	    number = checkMqpmoPutmsgrecoffsetMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqpmoPutmsgrecoffset((int)number);
	}
	
	/**
	 *	Returns the value of mqpmoResponserecoffset
	 *	@return mqpmoResponserecoffset
	 */
	public int getMqpmoResponserecoffset() throws CFException {
        if (isMqpmoResponserecoffsetModified()) { 
           mqpmoResponserecoffset = refreshMqpmoResponserecoffset();
        }
   		return mqpmoResponserecoffset;
	}
	
	/**
	 * 	Update MqpmoResponserecoffset with the passed value
	 *  Corresponding COBOL Variable is MQPMO-RESPONSERECOFFSET
	 *	@param number
	 */
	public void setMqpmoResponserecoffset(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoResponserecoffset = checkMqpmoResponserecoffsetMaxLimit(number); 
		serializeMqpmoResponserecoffset(mqpmoResponserecoffset);
	}


	public void setMqpmoResponserecoffset(long number) {
	    number = checkMqpmoResponserecoffsetMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqpmoResponserecoffset((int)number);
	}
	
	/**
	 *	Returns the value of mqpmoPutmsgrecptr
	 *	@return mqpmoPutmsgrecptr
	 */
	public int getMqpmoPutmsgrecptr() throws CFException {
        if (isMqpmoPutmsgrecptrModified()) { 
           mqpmoPutmsgrecptr = refreshMqpmoPutmsgrecptr();
        }
   		return mqpmoPutmsgrecptr;
	}
	
	/**
	 * 	Update MqpmoPutmsgrecptr with the passed value
	 *  Corresponding COBOL Variable is MQPMO-PUTMSGRECPTR
	 *	@param number
	 */
	public void setMqpmoPutmsgrecptr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoPutmsgrecptr = checkMqpmoPutmsgrecptrMaxLimit(number); 
		serializeMqpmoPutmsgrecptr(mqpmoPutmsgrecptr);
	}


	public void setMqpmoPutmsgrecptr(long number) {
	    number = checkMqpmoPutmsgrecptrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqpmoPutmsgrecptr((int)number);
	}
	
	/**
	 *	Returns the value of mqpmoResponserecptr
	 *	@return mqpmoResponserecptr
	 */
	public int getMqpmoResponserecptr() throws CFException {
        if (isMqpmoResponserecptrModified()) { 
           mqpmoResponserecptr = refreshMqpmoResponserecptr();
        }
   		return mqpmoResponserecptr;
	}
	
	/**
	 * 	Update MqpmoResponserecptr with the passed value
	 *  Corresponding COBOL Variable is MQPMO-RESPONSERECPTR
	 *	@param number
	 */
	public void setMqpmoResponserecptr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoResponserecptr = checkMqpmoResponserecptrMaxLimit(number); 
		serializeMqpmoResponserecptr(mqpmoResponserecptr);
	}


	public void setMqpmoResponserecptr(long number) {
	    number = checkMqpmoResponserecptrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqpmoResponserecptr((int)number);
	}
	
	/**
	 *	Returns the value of mqpmoOriginalmsghandle
	 *	@return mqpmoOriginalmsghandle
	 */
	public long getMqpmoOriginalmsghandle() throws CFException {
        if (isMqpmoOriginalmsghandleModified()) { 
           mqpmoOriginalmsghandle = refreshMqpmoOriginalmsghandle();
        }
   		return mqpmoOriginalmsghandle;
	}
	
	/**
	 * 	Update MqpmoOriginalmsghandle with the passed value
	 *  Corresponding COBOL Variable is MQPMO-ORIGINALMSGHANDLE
	 *	@param number
	 */
	public void setMqpmoOriginalmsghandle(long number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoOriginalmsghandle = checkMqpmoOriginalmsghandleMaxLimit(number); 
		serializeMqpmoOriginalmsghandle(mqpmoOriginalmsghandle);
	}


	/**
	 *	Returns the value of mqpmoNewmsghandle
	 *	@return mqpmoNewmsghandle
	 */
	public long getMqpmoNewmsghandle() throws CFException {
        if (isMqpmoNewmsghandleModified()) { 
           mqpmoNewmsghandle = refreshMqpmoNewmsghandle();
        }
   		return mqpmoNewmsghandle;
	}
	
	/**
	 * 	Update MqpmoNewmsghandle with the passed value
	 *  Corresponding COBOL Variable is MQPMO-NEWMSGHANDLE
	 *	@param number
	 */
	public void setMqpmoNewmsghandle(long number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoNewmsghandle = checkMqpmoNewmsghandleMaxLimit(number); 
		serializeMqpmoNewmsghandle(mqpmoNewmsghandle);
	}


	/**
	 *	Returns the value of mqpmoAction
	 *	@return mqpmoAction
	 */
	public int getMqpmoAction() throws CFException {
        if (isMqpmoActionModified()) { 
           mqpmoAction = refreshMqpmoAction();
        }
   		return mqpmoAction;
	}
	
	/**
	 * 	Update MqpmoAction with the passed value
	 *  Corresponding COBOL Variable is MQPMO-ACTION
	 *	@param number
	 */
	public void setMqpmoAction(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoAction = checkMqpmoActionMaxLimit(number); 
		serializeMqpmoAction(mqpmoAction);
	}


	public void setMqpmoAction(long number) {
	    number = checkMqpmoActionMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqpmoAction((int)number);
	}
	
	/**
	 *	Returns the value of mqpmoPublevel
	 *	@return mqpmoPublevel
	 */
	public int getMqpmoPublevel() throws CFException {
        if (isMqpmoPublevelModified()) { 
           mqpmoPublevel = refreshMqpmoPublevel();
        }
   		return mqpmoPublevel;
	}
	
	/**
	 * 	Update MqpmoPublevel with the passed value
	 *  Corresponding COBOL Variable is MQPMO-PUBLEVEL
	 *	@param number
	 */
	public void setMqpmoPublevel(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoPublevel = checkMqpmoPublevelMaxLimit(number); 
		serializeMqpmoPublevel(mqpmoPublevel);
	}


	public void setMqpmoPublevel(long number) {
	    number = checkMqpmoPublevelMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqpmoPublevel((int)number);
	}
	

	
	
	

		public static int getMqpmoFieldLength() {
			return MQPMO_LENGTH;
		}

}
  
