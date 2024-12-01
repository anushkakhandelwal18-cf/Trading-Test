package com.cloudframe.app.dto.d5427dt1;

/**
*  The class SysVariables is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class SysVariables extends SysVariablesSerialized { 
   

								private int sysCvdaCicsstatus;

								private int sysCvdaInitstatus;

						private char[] sysDb2conn = Field.fillLowValue(8);
				private SysJobname sysJobname = new SysJobname();

						private char[] sysMqconn = Field.fillLowValue(8);

								private int sysStartupdate;
	
	/**
	* Constructor for SysVariables
	**/
    public SysVariables() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SysVariables. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SysVariables(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			sysJobname.setParent(this,getStartOffset() + 16);
    } 

	/**
	 *	Returns the value of sysCvdaCicsstatus
	 *	@return sysCvdaCicsstatus
	 */
	public int getSysCvdaCicsstatus() throws CFException {
        if (isSysCvdaCicsstatusModified()) { 
           sysCvdaCicsstatus = refreshSysCvdaCicsstatus();
        }
   		return sysCvdaCicsstatus;
	}
	
	/**
	 * 	Update SysCvdaCicsstatus with the passed value
	 *  Corresponding COBOL Variable is SYS-CVDA-CICSSTATUS
	 *	@param number
	 */
	public void setSysCvdaCicsstatus(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sysCvdaCicsstatus = checkSysCvdaCicsstatusMaxLimit(number); 
		serializeSysCvdaCicsstatus(sysCvdaCicsstatus);
	}


	public void setSysCvdaCicsstatus(long number) {
	    number = checkSysCvdaCicsstatusMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSysCvdaCicsstatus((int)number);
	}
	
	/**
	 *	Returns the value of sysCvdaInitstatus
	 *	@return sysCvdaInitstatus
	 */
	public int getSysCvdaInitstatus() throws CFException {
        if (isSysCvdaInitstatusModified()) { 
           sysCvdaInitstatus = refreshSysCvdaInitstatus();
        }
   		return sysCvdaInitstatus;
	}
	
	/**
	 * 	Update SysCvdaInitstatus with the passed value
	 *  Corresponding COBOL Variable is SYS-CVDA-INITSTATUS
	 *	@param number
	 */
	public void setSysCvdaInitstatus(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sysCvdaInitstatus = checkSysCvdaInitstatusMaxLimit(number); 
		serializeSysCvdaInitstatus(sysCvdaInitstatus);
	}


	public void setSysCvdaInitstatus(long number) {
	    number = checkSysCvdaInitstatusMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSysCvdaInitstatus((int)number);
	}
	
	/**
	 *	Returns the value of sysDb2conn
	 *	@return sysDb2conn
	 */
   public char[] getSysDb2conn() throws CFException{
     if (isSysDb2connModified()) { 
        sysDb2conn = refreshSysDb2conn();
     }
   		return sysDb2conn;
   }

  
	/**
	*  set variable sysDb2conn
	*  Corresponding COBOL Variable is SYS-DB2CONN
	*  @param value
	**/
   public void setSysDb2conn(char[] value) {
      sysDb2conn = checkSysDb2connConstraints(value);
      serializeSysDb2conn(sysDb2conn);
   } 

     /**
	 * 	Update SysDb2conn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSysDb2conn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSysDb2conn,sysDb2conn.length);
   	
   }
   
   public void setSysDb2conn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSysDb2conn,sysDb2conn.length);
   	
   }
   
     /**
	 * 	Update SysDb2conn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSysDb2conn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSysDb2conn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SysDb2conn with another Field
	 *	@param value
	 */
   public void setSysDb2conn(Field source) {
       replace(source,0,source.length(),beginSysDb2conn,SYS_DB_2CONN_LEN);
   	
   }  
   
     /**
	 * 	Update SysDb2conn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSysDb2conn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSysDb2conn,SYS_DB_2CONN_LEN);
   	
   }
   
     /**
	 * 	Update SysDb2conn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSysDb2conn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSysDb2conn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sysJobname
	 *	@return sysJobname
	 */   
	 public SysJobname getSysJobname() {
   	return sysJobname;
   }
   /**
	* 	Update SysJobname with the passed value
	*   Corresponding COBOL Variable is SYS-JOBNAME
	*	@param value
	*/
   public void setSysJobname(char[] value) {
      sysJobname.setString(value); 
   }   
    
     /**
	 * 	Update SysJobname 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSysJobname(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sysJobname.begin,sysJobname.length());
   }
   
     /**
	 * 	Update SysJobname 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSysJobname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sysJobname.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SysJobname with another Field
	 *	@param value
	 */
   public void setSysJobname(Field source) {
   	replace(source,0,source.length(),sysJobname.begin,sysJobname.length());
   }  
   
     /**
	 * 	Update SysJobname 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSysJobname(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sysJobname.begin,sysJobname.length());
   }
   
     /**
	 * 	Update SysJobname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSysJobname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sysJobname.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sysMqconn
	 *	@return sysMqconn
	 */
   public char[] getSysMqconn() throws CFException{
     if (isSysMqconnModified()) { 
        sysMqconn = refreshSysMqconn();
     }
   		return sysMqconn;
   }

  
	/**
	*  set variable sysMqconn
	*  Corresponding COBOL Variable is SYS-MQCONN
	*  @param value
	**/
   public void setSysMqconn(char[] value) {
      sysMqconn = checkSysMqconnConstraints(value);
      serializeSysMqconn(sysMqconn);
   } 

     /**
	 * 	Update SysMqconn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSysMqconn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSysMqconn,sysMqconn.length);
   	
   }
   
   public void setSysMqconn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSysMqconn,sysMqconn.length);
   	
   }
   
     /**
	 * 	Update SysMqconn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSysMqconn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSysMqconn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SysMqconn with another Field
	 *	@param value
	 */
   public void setSysMqconn(Field source) {
       replace(source,0,source.length(),beginSysMqconn,SYS_MQCONN_LEN);
   	
   }  
   
     /**
	 * 	Update SysMqconn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSysMqconn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSysMqconn,SYS_MQCONN_LEN);
   	
   }
   
     /**
	 * 	Update SysMqconn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSysMqconn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSysMqconn+targetIndex,targetLen);
    
   }
	public int getSysStartupdate() throws CFException {
        if (isSysStartupdateModified()) { 
           sysStartupdate = refreshSysStartupdate();
        }
   		return sysStartupdate;
	}
	
	/**
	 * 	Update SysStartupdate with the passed value
	 *  Corresponding COBOL Variable is SYS-STARTUPDATE
	 *	@param number
	 */
	public void setSysStartupdate(int number) {
			sysStartupdate = checkSysStartupdateMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSysStartupdate(sysStartupdate);
	}


	public void setSysStartupdate(long number) {
	    number = checkSysStartupdateMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSysStartupdate((int)number);
	}
	

	
	
	
	/**
	 * 	initializes SysVariables
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setSysCvdaCicsstatus(0);
                     setSysCvdaInitstatus(0);
         setSysDb2conn(CONSTANTS.SPACE_8);
          sysJobname.initialize();
     
         setSysMqconn(CONSTANTS.SPACE_8);
                     setSysStartupdate(0);
   }

		public static int getSysVariablesFieldLength() {
			return SYS_VARIABLES_LENGTH;
		}

}
  
