package com.cloudframe.app.trdpb007.dto;

/**
*  The class Mqod is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 13:21. using version 5.0.0.161
**/


import com.cloudframe.app.trdpb007.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Mqod extends MqodSerialized { 
   

						private char[] mqodStrucid = new char[4];

								private int mqodVersion;

								private int mqodObjecttype;

						private char[] mqodObjectname = new char[48];

						private char[] mqodObjectqmgrname = new char[48];

						private char[] mqodDynamicqname = new char[48];

						private char[] mqodAlternateuserid = new char[12];

								private int mqodRecspresent;

								private int mqodKnowndestcount;

								private int mqodUnknowndestcount;

								private int mqodInvaliddestcount;

								private int mqodObjectrecoffset;

								private int mqodResponserecoffset;

								private int mqodObjectrecptr;

								private int mqodResponserecptr;

						private char[] mqodAlternatesecurityid = new char[40];

						private char[] mqodResolvedqname = new char[48];

						private char[] mqodResolvedqmgrname = new char[48];
				private MqodObjectstring mqodObjectstring = new MqodObjectstring();
				private MqodSelectionstring mqodSelectionstring = new MqodSelectionstring();
				private MqodResobjectstring mqodResobjectstring = new MqodResobjectstring();

								private int mqodResolvedtype;
	
	/**
	* Constructor for Mqod
	**/
    public Mqod() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			mqodObjectstring.setParent(this,getStartOffset() + 336);
	       			mqodSelectionstring.setParent(this,getStartOffset() + 356);
	       			mqodResobjectstring.setParent(this,getStartOffset() + 376);
	   	/*  end of offset */
								setMqodStrucid(("OD  ").toCharArray());
								setMqodVersion(1);
								setMqodObjecttype(1);
								setMqodObjectname(fillSpace(48));
								setMqodObjectqmgrname(fillSpace(48));
								setMqodDynamicqname(("CSQ.*                                           ").toCharArray());
								setMqodAlternateuserid(fillSpace(12));
								setMqodRecspresent(0);
								setMqodKnowndestcount(0);
								setMqodUnknowndestcount(0);
								setMqodInvaliddestcount(0);
								setMqodObjectrecoffset(0);
								setMqodResponserecoffset(0);
								setMqodAlternatesecurityid(fillLowValue(40));
								setMqodResolvedqname(fillSpace(48));
								setMqodResolvedqmgrname(fillSpace(48));
								setMqodResolvedtype(0);
    }


 

	/**
	 *	Returns the value of mqodStrucid
	 *	@return mqodStrucid
	 */
   public char[] getMqodStrucid() throws CFException{
     if (isMqodStrucidModified()) { 
        mqodStrucid = refreshMqodStrucid();
     }
   		return mqodStrucid;
   }

  
	/**
	*  set variable mqodStrucid
	*  Corresponding COBOL Variable is MQOD-STRUCID
	*  @param value
	**/
   public void setMqodStrucid(char[] value) {
      mqodStrucid = checkMqodStrucidConstraints(value);
      serializeMqodStrucid(mqodStrucid);
   } 

     /**
	 * 	Update MqodStrucid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqodStrucid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqodStrucid,mqodStrucid.length);
   	
   }
   
   public void setMqodStrucid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqodStrucid,mqodStrucid.length);
   	
   }
   
     /**
	 * 	Update MqodStrucid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqodStrucid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqodStrucid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqodStrucid with another Field
	 *	@param value
	 */
   public void setMqodStrucid(Field source) {
       replace(source,0,source.length(),beginMqodStrucid,MQOD_STRUCID_LEN);
   	
   }  
   
     /**
	 * 	Update MqodStrucid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqodStrucid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqodStrucid,MQOD_STRUCID_LEN);
   	
   }
   
     /**
	 * 	Update MqodStrucid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqodStrucid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqodStrucid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqodVersion
	 *	@return mqodVersion
	 */
	public int getMqodVersion() throws CFException {
        if (isMqodVersionModified()) { 
           mqodVersion = refreshMqodVersion();
        }
   		return mqodVersion;
	}
	
	/**
	 * 	Update MqodVersion with the passed value
	 *  Corresponding COBOL Variable is MQOD-VERSION
	 *	@param number
	 */
	public void setMqodVersion(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodVersion = checkMqodVersionMaxLimit(number); 
		serializeMqodVersion(mqodVersion);
	}


	public void setMqodVersion(long number) {
	    number = checkMqodVersionMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodVersion((int)number);
	}
	
	/**
	 *	Returns the value of mqodObjecttype
	 *	@return mqodObjecttype
	 */
	public int getMqodObjecttype() throws CFException {
        if (isMqodObjecttypeModified()) { 
           mqodObjecttype = refreshMqodObjecttype();
        }
   		return mqodObjecttype;
	}
	
	/**
	 * 	Update MqodObjecttype with the passed value
	 *  Corresponding COBOL Variable is MQOD-OBJECTTYPE
	 *	@param number
	 */
	public void setMqodObjecttype(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodObjecttype = checkMqodObjecttypeMaxLimit(number); 
		serializeMqodObjecttype(mqodObjecttype);
	}


	public void setMqodObjecttype(long number) {
	    number = checkMqodObjecttypeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodObjecttype((int)number);
	}
	
	/**
	 *	Returns the value of mqodObjectname
	 *	@return mqodObjectname
	 */
   public char[] getMqodObjectname() throws CFException{
     if (isMqodObjectnameModified()) { 
        mqodObjectname = refreshMqodObjectname();
     }
   		return mqodObjectname;
   }

  
	/**
	*  set variable mqodObjectname
	*  Corresponding COBOL Variable is MQOD-OBJECTNAME
	*  @param value
	**/
   public void setMqodObjectname(char[] value) {
      mqodObjectname = checkMqodObjectnameConstraints(value);
      serializeMqodObjectname(mqodObjectname);
   } 

     /**
	 * 	Update MqodObjectname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqodObjectname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqodObjectname,mqodObjectname.length);
   	
   }
   
   public void setMqodObjectname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqodObjectname,mqodObjectname.length);
   	
   }
   
     /**
	 * 	Update MqodObjectname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqodObjectname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqodObjectname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqodObjectname with another Field
	 *	@param value
	 */
   public void setMqodObjectname(Field source) {
       replace(source,0,source.length(),beginMqodObjectname,MQOD_OBJECTNAME_LEN);
   	
   }  
   
     /**
	 * 	Update MqodObjectname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqodObjectname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqodObjectname,MQOD_OBJECTNAME_LEN);
   	
   }
   
     /**
	 * 	Update MqodObjectname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqodObjectname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqodObjectname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqodObjectqmgrname
	 *	@return mqodObjectqmgrname
	 */
   public char[] getMqodObjectqmgrname() throws CFException{
     if (isMqodObjectqmgrnameModified()) { 
        mqodObjectqmgrname = refreshMqodObjectqmgrname();
     }
   		return mqodObjectqmgrname;
   }

  
	/**
	*  set variable mqodObjectqmgrname
	*  Corresponding COBOL Variable is MQOD-OBJECTQMGRNAME
	*  @param value
	**/
   public void setMqodObjectqmgrname(char[] value) {
      mqodObjectqmgrname = checkMqodObjectqmgrnameConstraints(value);
      serializeMqodObjectqmgrname(mqodObjectqmgrname);
   } 

     /**
	 * 	Update MqodObjectqmgrname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqodObjectqmgrname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqodObjectqmgrname,mqodObjectqmgrname.length);
   	
   }
   
   public void setMqodObjectqmgrname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqodObjectqmgrname,mqodObjectqmgrname.length);
   	
   }
   
     /**
	 * 	Update MqodObjectqmgrname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqodObjectqmgrname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqodObjectqmgrname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqodObjectqmgrname with another Field
	 *	@param value
	 */
   public void setMqodObjectqmgrname(Field source) {
       replace(source,0,source.length(),beginMqodObjectqmgrname,MQOD_OBJECTQMGRNAME_LEN);
   	
   }  
   
     /**
	 * 	Update MqodObjectqmgrname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqodObjectqmgrname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqodObjectqmgrname,MQOD_OBJECTQMGRNAME_LEN);
   	
   }
   
     /**
	 * 	Update MqodObjectqmgrname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqodObjectqmgrname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqodObjectqmgrname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqodDynamicqname
	 *	@return mqodDynamicqname
	 */
   public char[] getMqodDynamicqname() throws CFException{
     if (isMqodDynamicqnameModified()) { 
        mqodDynamicqname = refreshMqodDynamicqname();
     }
   		return mqodDynamicqname;
   }

  
	/**
	*  set variable mqodDynamicqname
	*  Corresponding COBOL Variable is MQOD-DYNAMICQNAME
	*  @param value
	**/
   public void setMqodDynamicqname(char[] value) {
      mqodDynamicqname = checkMqodDynamicqnameConstraints(value);
      serializeMqodDynamicqname(mqodDynamicqname);
   } 

     /**
	 * 	Update MqodDynamicqname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqodDynamicqname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqodDynamicqname,mqodDynamicqname.length);
   	
   }
   
   public void setMqodDynamicqname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqodDynamicqname,mqodDynamicqname.length);
   	
   }
   
     /**
	 * 	Update MqodDynamicqname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqodDynamicqname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqodDynamicqname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqodDynamicqname with another Field
	 *	@param value
	 */
   public void setMqodDynamicqname(Field source) {
       replace(source,0,source.length(),beginMqodDynamicqname,MQOD_DYNAMICQNAME_LEN);
   	
   }  
   
     /**
	 * 	Update MqodDynamicqname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqodDynamicqname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqodDynamicqname,MQOD_DYNAMICQNAME_LEN);
   	
   }
   
     /**
	 * 	Update MqodDynamicqname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqodDynamicqname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqodDynamicqname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqodAlternateuserid
	 *	@return mqodAlternateuserid
	 */
   public char[] getMqodAlternateuserid() throws CFException{
     if (isMqodAlternateuseridModified()) { 
        mqodAlternateuserid = refreshMqodAlternateuserid();
     }
   		return mqodAlternateuserid;
   }

  
	/**
	*  set variable mqodAlternateuserid
	*  Corresponding COBOL Variable is MQOD-ALTERNATEUSERID
	*  @param value
	**/
   public void setMqodAlternateuserid(char[] value) {
      mqodAlternateuserid = checkMqodAlternateuseridConstraints(value);
      serializeMqodAlternateuserid(mqodAlternateuserid);
   } 

     /**
	 * 	Update MqodAlternateuserid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqodAlternateuserid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqodAlternateuserid,mqodAlternateuserid.length);
   	
   }
   
   public void setMqodAlternateuserid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqodAlternateuserid,mqodAlternateuserid.length);
   	
   }
   
     /**
	 * 	Update MqodAlternateuserid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqodAlternateuserid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqodAlternateuserid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqodAlternateuserid with another Field
	 *	@param value
	 */
   public void setMqodAlternateuserid(Field source) {
       replace(source,0,source.length(),beginMqodAlternateuserid,MQOD_ALTERNATEUSERID_LEN);
   	
   }  
   
     /**
	 * 	Update MqodAlternateuserid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqodAlternateuserid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqodAlternateuserid,MQOD_ALTERNATEUSERID_LEN);
   	
   }
   
     /**
	 * 	Update MqodAlternateuserid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqodAlternateuserid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqodAlternateuserid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqodRecspresent
	 *	@return mqodRecspresent
	 */
	public int getMqodRecspresent() throws CFException {
        if (isMqodRecspresentModified()) { 
           mqodRecspresent = refreshMqodRecspresent();
        }
   		return mqodRecspresent;
	}
	
	/**
	 * 	Update MqodRecspresent with the passed value
	 *  Corresponding COBOL Variable is MQOD-RECSPRESENT
	 *	@param number
	 */
	public void setMqodRecspresent(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodRecspresent = checkMqodRecspresentMaxLimit(number); 
		serializeMqodRecspresent(mqodRecspresent);
	}


	public void setMqodRecspresent(long number) {
	    number = checkMqodRecspresentMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodRecspresent((int)number);
	}
	
	/**
	 *	Returns the value of mqodKnowndestcount
	 *	@return mqodKnowndestcount
	 */
	public int getMqodKnowndestcount() throws CFException {
        if (isMqodKnowndestcountModified()) { 
           mqodKnowndestcount = refreshMqodKnowndestcount();
        }
   		return mqodKnowndestcount;
	}
	
	/**
	 * 	Update MqodKnowndestcount with the passed value
	 *  Corresponding COBOL Variable is MQOD-KNOWNDESTCOUNT
	 *	@param number
	 */
	public void setMqodKnowndestcount(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodKnowndestcount = checkMqodKnowndestcountMaxLimit(number); 
		serializeMqodKnowndestcount(mqodKnowndestcount);
	}


	public void setMqodKnowndestcount(long number) {
	    number = checkMqodKnowndestcountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodKnowndestcount((int)number);
	}
	
	/**
	 *	Returns the value of mqodUnknowndestcount
	 *	@return mqodUnknowndestcount
	 */
	public int getMqodUnknowndestcount() throws CFException {
        if (isMqodUnknowndestcountModified()) { 
           mqodUnknowndestcount = refreshMqodUnknowndestcount();
        }
   		return mqodUnknowndestcount;
	}
	
	/**
	 * 	Update MqodUnknowndestcount with the passed value
	 *  Corresponding COBOL Variable is MQOD-UNKNOWNDESTCOUNT
	 *	@param number
	 */
	public void setMqodUnknowndestcount(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodUnknowndestcount = checkMqodUnknowndestcountMaxLimit(number); 
		serializeMqodUnknowndestcount(mqodUnknowndestcount);
	}


	public void setMqodUnknowndestcount(long number) {
	    number = checkMqodUnknowndestcountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodUnknowndestcount((int)number);
	}
	
	/**
	 *	Returns the value of mqodInvaliddestcount
	 *	@return mqodInvaliddestcount
	 */
	public int getMqodInvaliddestcount() throws CFException {
        if (isMqodInvaliddestcountModified()) { 
           mqodInvaliddestcount = refreshMqodInvaliddestcount();
        }
   		return mqodInvaliddestcount;
	}
	
	/**
	 * 	Update MqodInvaliddestcount with the passed value
	 *  Corresponding COBOL Variable is MQOD-INVALIDDESTCOUNT
	 *	@param number
	 */
	public void setMqodInvaliddestcount(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodInvaliddestcount = checkMqodInvaliddestcountMaxLimit(number); 
		serializeMqodInvaliddestcount(mqodInvaliddestcount);
	}


	public void setMqodInvaliddestcount(long number) {
	    number = checkMqodInvaliddestcountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodInvaliddestcount((int)number);
	}
	
	/**
	 *	Returns the value of mqodObjectrecoffset
	 *	@return mqodObjectrecoffset
	 */
	public int getMqodObjectrecoffset() throws CFException {
        if (isMqodObjectrecoffsetModified()) { 
           mqodObjectrecoffset = refreshMqodObjectrecoffset();
        }
   		return mqodObjectrecoffset;
	}
	
	/**
	 * 	Update MqodObjectrecoffset with the passed value
	 *  Corresponding COBOL Variable is MQOD-OBJECTRECOFFSET
	 *	@param number
	 */
	public void setMqodObjectrecoffset(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodObjectrecoffset = checkMqodObjectrecoffsetMaxLimit(number); 
		serializeMqodObjectrecoffset(mqodObjectrecoffset);
	}


	public void setMqodObjectrecoffset(long number) {
	    number = checkMqodObjectrecoffsetMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodObjectrecoffset((int)number);
	}
	
	/**
	 *	Returns the value of mqodResponserecoffset
	 *	@return mqodResponserecoffset
	 */
	public int getMqodResponserecoffset() throws CFException {
        if (isMqodResponserecoffsetModified()) { 
           mqodResponserecoffset = refreshMqodResponserecoffset();
        }
   		return mqodResponserecoffset;
	}
	
	/**
	 * 	Update MqodResponserecoffset with the passed value
	 *  Corresponding COBOL Variable is MQOD-RESPONSERECOFFSET
	 *	@param number
	 */
	public void setMqodResponserecoffset(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodResponserecoffset = checkMqodResponserecoffsetMaxLimit(number); 
		serializeMqodResponserecoffset(mqodResponserecoffset);
	}


	public void setMqodResponserecoffset(long number) {
	    number = checkMqodResponserecoffsetMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodResponserecoffset((int)number);
	}
	
	/**
	 *	Returns the value of mqodObjectrecptr
	 *	@return mqodObjectrecptr
	 */
	public int getMqodObjectrecptr() throws CFException {
        if (isMqodObjectrecptrModified()) { 
           mqodObjectrecptr = refreshMqodObjectrecptr();
        }
   		return mqodObjectrecptr;
	}
	
	/**
	 * 	Update MqodObjectrecptr with the passed value
	 *  Corresponding COBOL Variable is MQOD-OBJECTRECPTR
	 *	@param number
	 */
	public void setMqodObjectrecptr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodObjectrecptr = checkMqodObjectrecptrMaxLimit(number); 
		serializeMqodObjectrecptr(mqodObjectrecptr);
	}


	public void setMqodObjectrecptr(long number) {
	    number = checkMqodObjectrecptrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodObjectrecptr((int)number);
	}
	
	/**
	 *	Returns the value of mqodResponserecptr
	 *	@return mqodResponserecptr
	 */
	public int getMqodResponserecptr() throws CFException {
        if (isMqodResponserecptrModified()) { 
           mqodResponserecptr = refreshMqodResponserecptr();
        }
   		return mqodResponserecptr;
	}
	
	/**
	 * 	Update MqodResponserecptr with the passed value
	 *  Corresponding COBOL Variable is MQOD-RESPONSERECPTR
	 *	@param number
	 */
	public void setMqodResponserecptr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodResponserecptr = checkMqodResponserecptrMaxLimit(number); 
		serializeMqodResponserecptr(mqodResponserecptr);
	}


	public void setMqodResponserecptr(long number) {
	    number = checkMqodResponserecptrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodResponserecptr((int)number);
	}
	
	/**
	 *	Returns the value of mqodAlternatesecurityid
	 *	@return mqodAlternatesecurityid
	 */
   public char[] getMqodAlternatesecurityid() throws CFException{
     if (isMqodAlternatesecurityidModified()) { 
        mqodAlternatesecurityid = refreshMqodAlternatesecurityid();
     }
   		return mqodAlternatesecurityid;
   }

  
	/**
	*  set variable mqodAlternatesecurityid
	*  Corresponding COBOL Variable is MQOD-ALTERNATESECURITYID
	*  @param value
	**/
   public void setMqodAlternatesecurityid(char[] value) {
      mqodAlternatesecurityid = checkMqodAlternatesecurityidConstraints(value);
      serializeMqodAlternatesecurityid(mqodAlternatesecurityid);
   } 

     /**
	 * 	Update MqodAlternatesecurityid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqodAlternatesecurityid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqodAlternatesecurityid,mqodAlternatesecurityid.length);
   	
   }
   
   public void setMqodAlternatesecurityid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqodAlternatesecurityid,mqodAlternatesecurityid.length);
   	
   }
   
     /**
	 * 	Update MqodAlternatesecurityid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqodAlternatesecurityid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqodAlternatesecurityid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqodAlternatesecurityid with another Field
	 *	@param value
	 */
   public void setMqodAlternatesecurityid(Field source) {
       replace(source,0,source.length(),beginMqodAlternatesecurityid,MQOD_ALTERNATESECURITYID_LEN);
   	
   }  
   
     /**
	 * 	Update MqodAlternatesecurityid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqodAlternatesecurityid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqodAlternatesecurityid,MQOD_ALTERNATESECURITYID_LEN);
   	
   }
   
     /**
	 * 	Update MqodAlternatesecurityid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqodAlternatesecurityid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqodAlternatesecurityid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqodResolvedqname
	 *	@return mqodResolvedqname
	 */
   public char[] getMqodResolvedqname() throws CFException{
     if (isMqodResolvedqnameModified()) { 
        mqodResolvedqname = refreshMqodResolvedqname();
     }
   		return mqodResolvedqname;
   }

  
	/**
	*  set variable mqodResolvedqname
	*  Corresponding COBOL Variable is MQOD-RESOLVEDQNAME
	*  @param value
	**/
   public void setMqodResolvedqname(char[] value) {
      mqodResolvedqname = checkMqodResolvedqnameConstraints(value);
      serializeMqodResolvedqname(mqodResolvedqname);
   } 

     /**
	 * 	Update MqodResolvedqname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqodResolvedqname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqodResolvedqname,mqodResolvedqname.length);
   	
   }
   
   public void setMqodResolvedqname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqodResolvedqname,mqodResolvedqname.length);
   	
   }
   
     /**
	 * 	Update MqodResolvedqname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqodResolvedqname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqodResolvedqname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqodResolvedqname with another Field
	 *	@param value
	 */
   public void setMqodResolvedqname(Field source) {
       replace(source,0,source.length(),beginMqodResolvedqname,MQOD_RESOLVEDQNAME_LEN);
   	
   }  
   
     /**
	 * 	Update MqodResolvedqname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqodResolvedqname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqodResolvedqname,MQOD_RESOLVEDQNAME_LEN);
   	
   }
   
     /**
	 * 	Update MqodResolvedqname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqodResolvedqname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqodResolvedqname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqodResolvedqmgrname
	 *	@return mqodResolvedqmgrname
	 */
   public char[] getMqodResolvedqmgrname() throws CFException{
     if (isMqodResolvedqmgrnameModified()) { 
        mqodResolvedqmgrname = refreshMqodResolvedqmgrname();
     }
   		return mqodResolvedqmgrname;
   }

  
	/**
	*  set variable mqodResolvedqmgrname
	*  Corresponding COBOL Variable is MQOD-RESOLVEDQMGRNAME
	*  @param value
	**/
   public void setMqodResolvedqmgrname(char[] value) {
      mqodResolvedqmgrname = checkMqodResolvedqmgrnameConstraints(value);
      serializeMqodResolvedqmgrname(mqodResolvedqmgrname);
   } 

     /**
	 * 	Update MqodResolvedqmgrname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqodResolvedqmgrname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMqodResolvedqmgrname,mqodResolvedqmgrname.length);
   	
   }
   
   public void setMqodResolvedqmgrname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMqodResolvedqmgrname,mqodResolvedqmgrname.length);
   	
   }
   
     /**
	 * 	Update MqodResolvedqmgrname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqodResolvedqmgrname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqodResolvedqmgrname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MqodResolvedqmgrname with another Field
	 *	@param value
	 */
   public void setMqodResolvedqmgrname(Field source) {
       replace(source,0,source.length(),beginMqodResolvedqmgrname,MQOD_RESOLVEDQMGRNAME_LEN);
   	
   }  
   
     /**
	 * 	Update MqodResolvedqmgrname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqodResolvedqmgrname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMqodResolvedqmgrname,MQOD_RESOLVEDQMGRNAME_LEN);
   	
   }
   
     /**
	 * 	Update MqodResolvedqmgrname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqodResolvedqmgrname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMqodResolvedqmgrname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqodObjectstring
	 *	@return mqodObjectstring
	 */   
	 public MqodObjectstring getMqodObjectstring() {
   	return mqodObjectstring;
   }
   /**
	* 	Update MqodObjectstring with the passed value
	*   Corresponding COBOL Variable is MQOD-OBJECTSTRING
	*	@param value
	*/
   public void setMqodObjectstring(char[] value) {
      mqodObjectstring.setString(value); 
   }   
    
     /**
	 * 	Update MqodObjectstring 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMqodObjectstring(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mqodObjectstring.begin,mqodObjectstring.length());
   }
   
     /**
	 * 	Update MqodObjectstring 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqodObjectstring(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mqodObjectstring.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MqodObjectstring with another Field
	 *	@param value
	 */
   public void setMqodObjectstring(Field source) {
   	replace(source,0,source.length(),mqodObjectstring.begin,mqodObjectstring.length());
   }  
   
     /**
	 * 	Update MqodObjectstring 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMqodObjectstring(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mqodObjectstring.begin,mqodObjectstring.length());
   }
   
     /**
	 * 	Update MqodObjectstring 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqodObjectstring(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mqodObjectstring.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of mqodSelectionstring
	 *	@return mqodSelectionstring
	 */   
	 public MqodSelectionstring getMqodSelectionstring() {
   	return mqodSelectionstring;
   }
   /**
	* 	Update MqodSelectionstring with the passed value
	*   Corresponding COBOL Variable is MQOD-SELECTIONSTRING
	*	@param value
	*/
   public void setMqodSelectionstring(char[] value) {
      mqodSelectionstring.setString(value); 
   }   
    
     /**
	 * 	Update MqodSelectionstring 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMqodSelectionstring(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mqodSelectionstring.begin,mqodSelectionstring.length());
   }
   
     /**
	 * 	Update MqodSelectionstring 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqodSelectionstring(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mqodSelectionstring.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MqodSelectionstring with another Field
	 *	@param value
	 */
   public void setMqodSelectionstring(Field source) {
   	replace(source,0,source.length(),mqodSelectionstring.begin,mqodSelectionstring.length());
   }  
   
     /**
	 * 	Update MqodSelectionstring 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMqodSelectionstring(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mqodSelectionstring.begin,mqodSelectionstring.length());
   }
   
     /**
	 * 	Update MqodSelectionstring 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqodSelectionstring(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mqodSelectionstring.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of mqodResobjectstring
	 *	@return mqodResobjectstring
	 */   
	 public MqodResobjectstring getMqodResobjectstring() {
   	return mqodResobjectstring;
   }
   /**
	* 	Update MqodResobjectstring with the passed value
	*   Corresponding COBOL Variable is MQOD-RESOBJECTSTRING
	*	@param value
	*/
   public void setMqodResobjectstring(char[] value) {
      mqodResobjectstring.setString(value); 
   }   
    
     /**
	 * 	Update MqodResobjectstring 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMqodResobjectstring(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mqodResobjectstring.begin,mqodResobjectstring.length());
   }
   
     /**
	 * 	Update MqodResobjectstring 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqodResobjectstring(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mqodResobjectstring.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MqodResobjectstring with another Field
	 *	@param value
	 */
   public void setMqodResobjectstring(Field source) {
   	replace(source,0,source.length(),mqodResobjectstring.begin,mqodResobjectstring.length());
   }  
   
     /**
	 * 	Update MqodResobjectstring 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMqodResobjectstring(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mqodResobjectstring.begin,mqodResobjectstring.length());
   }
   
     /**
	 * 	Update MqodResobjectstring 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqodResobjectstring(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mqodResobjectstring.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of mqodResolvedtype
	 *	@return mqodResolvedtype
	 */
	public int getMqodResolvedtype() throws CFException {
        if (isMqodResolvedtypeModified()) { 
           mqodResolvedtype = refreshMqodResolvedtype();
        }
   		return mqodResolvedtype;
	}
	
	/**
	 * 	Update MqodResolvedtype with the passed value
	 *  Corresponding COBOL Variable is MQOD-RESOLVEDTYPE
	 *	@param number
	 */
	public void setMqodResolvedtype(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqodResolvedtype = checkMqodResolvedtypeMaxLimit(number); 
		serializeMqodResolvedtype(mqodResolvedtype);
	}


	public void setMqodResolvedtype(long number) {
	    number = checkMqodResolvedtypeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqodResolvedtype((int)number);
	}
	

	
	
	

		public static int getMqodFieldLength() {
			return MQOD_LENGTH;
		}

}
  
