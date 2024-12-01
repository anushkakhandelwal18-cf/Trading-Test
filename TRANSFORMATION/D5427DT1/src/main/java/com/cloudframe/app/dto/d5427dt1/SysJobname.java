package com.cloudframe.app.dto.d5427dt1;

/**
*  The class SysJobname is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class SysJobname extends SysJobnameSerialized { 
   

						private char[] sysJobname14 = Field.fillLowValue(4);

						private char[] sysJobname5 = Field.fillLowValue(1);

						private char[] sysJobnameCicsJobname68 = Field.fillLowValue(3);
	
	/**
	* Constructor for SysJobname
	**/
    public SysJobname() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SysJobname. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SysJobname(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sysJobname14
	 *	@return sysJobname14
	 */
   public char[] getSysJobname14() throws CFException{
     if (isSysJobname14Modified()) { 
        sysJobname14 = refreshSysJobname14();
     }
   		return sysJobname14;
   }

  
	/**
	*  set variable sysJobname14
	*  Corresponding COBOL Variable is SYS-JOBNAME-1-4
	*  @param value
	**/
   public void setSysJobname14(char[] value) {
      sysJobname14 = checkSysJobname14Constraints(value);
      serializeSysJobname14(sysJobname14);
   } 

     /**
	 * 	Update SysJobname14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSysJobname14(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSysJobname14,sysJobname14.length);
   	
   }
   
   public void setSysJobname14(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSysJobname14,sysJobname14.length);
   	
   }
   
     /**
	 * 	Update SysJobname14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSysJobname14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSysJobname14+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SysJobname14 with another Field
	 *	@param value
	 */
   public void setSysJobname14(Field source) {
       replace(source,0,source.length(),beginSysJobname14,SYS_JOBNAME_14_LEN);
   	
   }  
   
     /**
	 * 	Update SysJobname14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSysJobname14(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSysJobname14,SYS_JOBNAME_14_LEN);
   	
   }
   
     /**
	 * 	Update SysJobname14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSysJobname14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSysJobname14+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sysJobname5
	 *	@return sysJobname5
	 */
   public char[] getSysJobname5() throws CFException{
     if (isSysJobname5Modified()) { 
        sysJobname5 = refreshSysJobname5();
     }
   		return sysJobname5;
   }

  
	/**
	*  set variable sysJobname5
	*  Corresponding COBOL Variable is SYS-JOBNAME-5
	*  @param value
	**/
   public void setSysJobname5(char[] value) {
      sysJobname5 = checkSysJobname5Constraints(value);
      serializeSysJobname5(sysJobname5);
   } 

     /**
	 * 	Update SysJobname5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSysJobname5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSysJobname5,sysJobname5.length);
   	
   }
   
   public void setSysJobname5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSysJobname5,sysJobname5.length);
   	
   }
   
     /**
	 * 	Update SysJobname5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSysJobname5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSysJobname5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SysJobname5 with another Field
	 *	@param value
	 */
   public void setSysJobname5(Field source) {
       replace(source,0,source.length(),beginSysJobname5,SYS_JOBNAME_5_LEN);
   	
   }  
   
     /**
	 * 	Update SysJobname5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSysJobname5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSysJobname5,SYS_JOBNAME_5_LEN);
   	
   }
   
     /**
	 * 	Update SysJobname5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSysJobname5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSysJobname5+targetIndex,targetLen);
    
   }
	char[] sysJobnameCicsTest88Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isSysJobnameCicsTest()
	 *	@return  Returns true if isSysJobnameCicsTest() is "T"
	 */
   public boolean isSysJobnameCicsTest() throws CFException {
      return (  compareChars( getSysJobname5() , sysJobnameCicsTest88Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setSysJobnameCicsTestTrue() {  			
    	setSysJobname5( sysJobnameCicsTest88Value);
   	}
	char[] sysJobnameWvCicsProd88Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isSysJobnameWvCicsProd()
	 *	@return  Returns true if isSysJobnameWvCicsProd() is "P"
	 */
   public boolean isSysJobnameWvCicsProd() throws CFException {
      return (  compareChars( getSysJobname5() , sysJobnameWvCicsProd88Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setSysJobnameWvCicsProdTrue() {  			
    	setSysJobname5( sysJobnameWvCicsProd88Value);
   	}
	/**
	 *	Returns the value of sysJobnameCicsJobname68
	 *	@return sysJobnameCicsJobname68
	 */
   public char[] getSysJobnameCicsJobname68() throws CFException{
     if (isSysJobnameCicsJobname68Modified()) { 
        sysJobnameCicsJobname68 = refreshSysJobnameCicsJobname68();
     }
   		return sysJobnameCicsJobname68;
   }

  
	/**
	*  set variable sysJobnameCicsJobname68
	*  Corresponding COBOL Variable is SYS-JOBNAME-CICS-JOBNAME-6-8
	*  @param value
	**/
   public void setSysJobnameCicsJobname68(char[] value) {
      sysJobnameCicsJobname68 = checkSysJobnameCicsJobname68Constraints(value);
      serializeSysJobnameCicsJobname68(sysJobnameCicsJobname68);
   } 

     /**
	 * 	Update SysJobnameCicsJobname68 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSysJobnameCicsJobname68(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSysJobnameCicsJobname68,sysJobnameCicsJobname68.length);
   	
   }
   
   public void setSysJobnameCicsJobname68(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSysJobnameCicsJobname68,sysJobnameCicsJobname68.length);
   	
   }
   
     /**
	 * 	Update SysJobnameCicsJobname68 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSysJobnameCicsJobname68(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSysJobnameCicsJobname68+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SysJobnameCicsJobname68 with another Field
	 *	@param value
	 */
   public void setSysJobnameCicsJobname68(Field source) {
       replace(source,0,source.length(),beginSysJobnameCicsJobname68,SYS_JOBNAME_CICS_JOBNAME_68_LEN);
   	
   }  
   
     /**
	 * 	Update SysJobnameCicsJobname68 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSysJobnameCicsJobname68(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSysJobnameCicsJobname68,SYS_JOBNAME_CICS_JOBNAME_68_LEN);
   	
   }
   
     /**
	 * 	Update SysJobnameCicsJobname68 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSysJobnameCicsJobname68(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSysJobnameCicsJobname68+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes SysJobname
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setSysJobname14(CONSTANTS.SPACE_4);
         setSysJobname5(CONSTANTS.SPACE);
         setSysJobnameCicsJobname68(CONSTANTS.SPACE_3);
   }

		public static int getSysJobnameFieldLength() {
			return SYS_JOBNAME_LENGTH;
		}

}
  
