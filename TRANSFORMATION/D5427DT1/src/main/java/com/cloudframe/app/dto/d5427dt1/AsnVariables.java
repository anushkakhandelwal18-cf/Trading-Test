package com.cloudframe.app.dto.d5427dt1;

/**
*  The class AsnVariables is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AsnVariables extends AsnVariablesSerialized { 
   

						private char[] asnAbcode = Field.fillLowValue(4);

						private char[] asnNetname = Field.fillLowValue(8);

						private char[] asnPrinsysid = Field.fillLowValue(4);

						private char[] asnInvokingprog = Field.fillLowValue(8);

						private char[] asnProgram = Field.fillLowValue(8);

						private char[] asnApplid = Field.fillLowValue(8);

						private char[] asnSysid = Field.fillLowValue(4);
	
	/**
	* Constructor for AsnVariables
	**/
    public AsnVariables() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AsnVariables. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AsnVariables(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of asnAbcode
	 *	@return asnAbcode
	 */
   public char[] getAsnAbcode() throws CFException{
     if (isAsnAbcodeModified()) { 
        asnAbcode = refreshAsnAbcode();
     }
   		return asnAbcode;
   }

  
	/**
	*  set variable asnAbcode
	*  Corresponding COBOL Variable is ASN-ABCODE
	*  @param value
	**/
   public void setAsnAbcode(char[] value) {
      asnAbcode = checkAsnAbcodeConstraints(value);
      serializeAsnAbcode(asnAbcode);
   } 

     /**
	 * 	Update AsnAbcode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAsnAbcode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAsnAbcode,asnAbcode.length);
   	
   }
   
   public void setAsnAbcode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAsnAbcode,asnAbcode.length);
   	
   }
   
     /**
	 * 	Update AsnAbcode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsnAbcode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsnAbcode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AsnAbcode with another Field
	 *	@param value
	 */
   public void setAsnAbcode(Field source) {
       replace(source,0,source.length(),beginAsnAbcode,ASN_ABCODE_LEN);
   	
   }  
   
     /**
	 * 	Update AsnAbcode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAsnAbcode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAsnAbcode,ASN_ABCODE_LEN);
   	
   }
   
     /**
	 * 	Update AsnAbcode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsnAbcode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsnAbcode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of asnNetname
	 *	@return asnNetname
	 */
   public char[] getAsnNetname() throws CFException{
     if (isAsnNetnameModified()) { 
        asnNetname = refreshAsnNetname();
     }
   		return asnNetname;
   }

  
	/**
	*  set variable asnNetname
	*  Corresponding COBOL Variable is ASN-NETNAME
	*  @param value
	**/
   public void setAsnNetname(char[] value) {
      asnNetname = checkAsnNetnameConstraints(value);
      serializeAsnNetname(asnNetname);
   } 

     /**
	 * 	Update AsnNetname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAsnNetname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAsnNetname,asnNetname.length);
   	
   }
   
   public void setAsnNetname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAsnNetname,asnNetname.length);
   	
   }
   
     /**
	 * 	Update AsnNetname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsnNetname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsnNetname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AsnNetname with another Field
	 *	@param value
	 */
   public void setAsnNetname(Field source) {
       replace(source,0,source.length(),beginAsnNetname,ASN_NETNAME_LEN);
   	
   }  
   
     /**
	 * 	Update AsnNetname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAsnNetname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAsnNetname,ASN_NETNAME_LEN);
   	
   }
   
     /**
	 * 	Update AsnNetname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsnNetname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsnNetname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of asnPrinsysid
	 *	@return asnPrinsysid
	 */
   public char[] getAsnPrinsysid() throws CFException{
     if (isAsnPrinsysidModified()) { 
        asnPrinsysid = refreshAsnPrinsysid();
     }
   		return asnPrinsysid;
   }

  
	/**
	*  set variable asnPrinsysid
	*  Corresponding COBOL Variable is ASN-PRINSYSID
	*  @param value
	**/
   public void setAsnPrinsysid(char[] value) {
      asnPrinsysid = checkAsnPrinsysidConstraints(value);
      serializeAsnPrinsysid(asnPrinsysid);
   } 

     /**
	 * 	Update AsnPrinsysid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAsnPrinsysid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAsnPrinsysid,asnPrinsysid.length);
   	
   }
   
   public void setAsnPrinsysid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAsnPrinsysid,asnPrinsysid.length);
   	
   }
   
     /**
	 * 	Update AsnPrinsysid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsnPrinsysid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsnPrinsysid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AsnPrinsysid with another Field
	 *	@param value
	 */
   public void setAsnPrinsysid(Field source) {
       replace(source,0,source.length(),beginAsnPrinsysid,ASN_PRINSYSID_LEN);
   	
   }  
   
     /**
	 * 	Update AsnPrinsysid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAsnPrinsysid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAsnPrinsysid,ASN_PRINSYSID_LEN);
   	
   }
   
     /**
	 * 	Update AsnPrinsysid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsnPrinsysid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsnPrinsysid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of asnInvokingprog
	 *	@return asnInvokingprog
	 */
   public char[] getAsnInvokingprog() throws CFException{
     if (isAsnInvokingprogModified()) { 
        asnInvokingprog = refreshAsnInvokingprog();
     }
   		return asnInvokingprog;
   }

  
	/**
	*  set variable asnInvokingprog
	*  Corresponding COBOL Variable is ASN-INVOKINGPROG
	*  @param value
	**/
   public void setAsnInvokingprog(char[] value) {
      asnInvokingprog = checkAsnInvokingprogConstraints(value);
      serializeAsnInvokingprog(asnInvokingprog);
   } 

     /**
	 * 	Update AsnInvokingprog 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAsnInvokingprog(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAsnInvokingprog,asnInvokingprog.length);
   	
   }
   
   public void setAsnInvokingprog(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAsnInvokingprog,asnInvokingprog.length);
   	
   }
   
     /**
	 * 	Update AsnInvokingprog 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsnInvokingprog(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsnInvokingprog+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AsnInvokingprog with another Field
	 *	@param value
	 */
   public void setAsnInvokingprog(Field source) {
       replace(source,0,source.length(),beginAsnInvokingprog,ASN_INVOKINGPROG_LEN);
   	
   }  
   
     /**
	 * 	Update AsnInvokingprog 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAsnInvokingprog(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAsnInvokingprog,ASN_INVOKINGPROG_LEN);
   	
   }
   
     /**
	 * 	Update AsnInvokingprog 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsnInvokingprog(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsnInvokingprog+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of asnProgram
	 *	@return asnProgram
	 */
   public char[] getAsnProgram() throws CFException{
     if (isAsnProgramModified()) { 
        asnProgram = refreshAsnProgram();
     }
   		return asnProgram;
   }

  
	/**
	*  set variable asnProgram
	*  Corresponding COBOL Variable is ASN-PROGRAM
	*  @param value
	**/
   public void setAsnProgram(char[] value) {
      asnProgram = checkAsnProgramConstraints(value);
      serializeAsnProgram(asnProgram);
   } 

     /**
	 * 	Update AsnProgram 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAsnProgram(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAsnProgram,asnProgram.length);
   	
   }
   
   public void setAsnProgram(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAsnProgram,asnProgram.length);
   	
   }
   
     /**
	 * 	Update AsnProgram 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsnProgram(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsnProgram+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AsnProgram with another Field
	 *	@param value
	 */
   public void setAsnProgram(Field source) {
       replace(source,0,source.length(),beginAsnProgram,ASN_PROGRAM_LEN);
   	
   }  
   
     /**
	 * 	Update AsnProgram 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAsnProgram(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAsnProgram,ASN_PROGRAM_LEN);
   	
   }
   
     /**
	 * 	Update AsnProgram 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsnProgram(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsnProgram+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of asnApplid
	 *	@return asnApplid
	 */
   public char[] getAsnApplid() throws CFException{
     if (isAsnApplidModified()) { 
        asnApplid = refreshAsnApplid();
     }
   		return asnApplid;
   }

  
	/**
	*  set variable asnApplid
	*  Corresponding COBOL Variable is ASN-APPLID
	*  @param value
	**/
   public void setAsnApplid(char[] value) {
      asnApplid = checkAsnApplidConstraints(value);
      serializeAsnApplid(asnApplid);
   } 

     /**
	 * 	Update AsnApplid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAsnApplid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAsnApplid,asnApplid.length);
   	
   }
   
   public void setAsnApplid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAsnApplid,asnApplid.length);
   	
   }
   
     /**
	 * 	Update AsnApplid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsnApplid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsnApplid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AsnApplid with another Field
	 *	@param value
	 */
   public void setAsnApplid(Field source) {
       replace(source,0,source.length(),beginAsnApplid,ASN_APPLID_LEN);
   	
   }  
   
     /**
	 * 	Update AsnApplid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAsnApplid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAsnApplid,ASN_APPLID_LEN);
   	
   }
   
     /**
	 * 	Update AsnApplid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsnApplid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsnApplid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of asnSysid
	 *	@return asnSysid
	 */
   public char[] getAsnSysid() throws CFException{
     if (isAsnSysidModified()) { 
        asnSysid = refreshAsnSysid();
     }
   		return asnSysid;
   }

  
	/**
	*  set variable asnSysid
	*  Corresponding COBOL Variable is ASN-SYSID
	*  @param value
	**/
   public void setAsnSysid(char[] value) {
      asnSysid = checkAsnSysidConstraints(value);
      serializeAsnSysid(asnSysid);
   } 

     /**
	 * 	Update AsnSysid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAsnSysid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAsnSysid,asnSysid.length);
   	
   }
   
   public void setAsnSysid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAsnSysid,asnSysid.length);
   	
   }
   
     /**
	 * 	Update AsnSysid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsnSysid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsnSysid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AsnSysid with another Field
	 *	@param value
	 */
   public void setAsnSysid(Field source) {
       replace(source,0,source.length(),beginAsnSysid,ASN_SYSID_LEN);
   	
   }  
   
     /**
	 * 	Update AsnSysid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAsnSysid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAsnSysid,ASN_SYSID_LEN);
   	
   }
   
     /**
	 * 	Update AsnSysid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsnSysid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsnSysid+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AsnVariables
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setAsnAbcode(CONSTANTS.SPACE_4);
         setAsnNetname(CONSTANTS.SPACE_8);
         setAsnPrinsysid(CONSTANTS.SPACE_4);
         setAsnInvokingprog(CONSTANTS.SPACE_8);
         setAsnProgram(CONSTANTS.SPACE_8);
         setAsnApplid(CONSTANTS.SPACE_8);
         setAsnSysid(CONSTANTS.SPACE_4);
   }

		public static int getAsnVariablesFieldLength() {
			return ASN_VARIABLES_LENGTH;
		}

}
  
