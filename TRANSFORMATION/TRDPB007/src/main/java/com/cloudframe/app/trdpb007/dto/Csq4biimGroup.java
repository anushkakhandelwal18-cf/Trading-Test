package com.cloudframe.app.trdpb007.dto;

/**
*  The class Csq4biimGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:02. using version 5.0.0.163
**/


import com.cloudframe.app.trdpb007.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Csq4biimGroup extends Csq4biimGroupSerialized { 
   

						private char[] csq4biimName = Field.fillLowValue(20);

						private char[] csq4biimSocsecno1 = Field.fillLowValue(3);

						private char[] csq4biimSocsecno2 = Field.fillLowValue(2);

						private char[] csq4biimSocsecno3 = Field.fillLowValue(4);

						private char[] csq4biimBankname = Field.fillLowValue(30);

						private char[] csq4biimBankacname = Field.fillLowValue(30);

						private char[] csq4biimBankacnum = Field.fillLowValue(10);

						private char[] csq4biimLoanreq = Field.fillLowValue(6);
	
	/**
	* Constructor for Csq4biimGroup
	**/
    public Csq4biimGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Csq4biimGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Csq4biimGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of csq4biimName
	 *	@return csq4biimName
	 */
   public char[] getCsq4biimName() throws CFException{
     if (isCsq4biimNameModified()) { 
        csq4biimName = refreshCsq4biimName();
     }
   		return csq4biimName;
   }

  
	/**
	*  set variable csq4biimName
	*  Corresponding COBOL Variable is CSQ4BIIM-NAME
	*  @param value
	**/
   public void setCsq4biimName(char[] value) {
      csq4biimName = checkCsq4biimNameConstraints(value);
      serializeCsq4biimName(csq4biimName);
   } 

     /**
	 * 	Update Csq4biimName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCsq4biimName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCsq4biimName,csq4biimName.length);
   	
   }
   
   public void setCsq4biimName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimName,csq4biimName.length);
   	
   }
   
     /**
	 * 	Update Csq4biimName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Csq4biimName with another Field
	 *	@param value
	 */
   public void setCsq4biimName(Field source) {
       replace(source,0,source.length(),beginCsq4biimName,CSQ_4BIIM_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Csq4biimName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCsq4biimName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCsq4biimName,CSQ_4BIIM_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Csq4biimName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of csq4biimSocsecno1
	 *	@return csq4biimSocsecno1
	 */
   public char[] getCsq4biimSocsecno1() throws CFException{
     if (isCsq4biimSocsecno1Modified()) { 
        csq4biimSocsecno1 = refreshCsq4biimSocsecno1();
     }
   		return csq4biimSocsecno1;
   }

  
	/**
	*  set variable csq4biimSocsecno1
	*  Corresponding COBOL Variable is CSQ4BIIM-SOCSECNO1
	*  @param value
	**/
   public void setCsq4biimSocsecno1(char[] value) {
      csq4biimSocsecno1 = checkCsq4biimSocsecno1Constraints(value);
      serializeCsq4biimSocsecno1(csq4biimSocsecno1);
   } 

     /**
	 * 	Update Csq4biimSocsecno1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCsq4biimSocsecno1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCsq4biimSocsecno1,csq4biimSocsecno1.length);
   	
   }
   
   public void setCsq4biimSocsecno1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimSocsecno1,csq4biimSocsecno1.length);
   	
   }
   
     /**
	 * 	Update Csq4biimSocsecno1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimSocsecno1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimSocsecno1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Csq4biimSocsecno1 with another Field
	 *	@param value
	 */
   public void setCsq4biimSocsecno1(Field source) {
       replace(source,0,source.length(),beginCsq4biimSocsecno1,CSQ_4BIIM_SOCSECNO_1_LEN);
   	
   }  
   
     /**
	 * 	Update Csq4biimSocsecno1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCsq4biimSocsecno1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCsq4biimSocsecno1,CSQ_4BIIM_SOCSECNO_1_LEN);
   	
   }
   
     /**
	 * 	Update Csq4biimSocsecno1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimSocsecno1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimSocsecno1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of csq4biimSocsecno2
	 *	@return csq4biimSocsecno2
	 */
   public char[] getCsq4biimSocsecno2() throws CFException{
     if (isCsq4biimSocsecno2Modified()) { 
        csq4biimSocsecno2 = refreshCsq4biimSocsecno2();
     }
   		return csq4biimSocsecno2;
   }

  
	/**
	*  set variable csq4biimSocsecno2
	*  Corresponding COBOL Variable is CSQ4BIIM-SOCSECNO2
	*  @param value
	**/
   public void setCsq4biimSocsecno2(char[] value) {
      csq4biimSocsecno2 = checkCsq4biimSocsecno2Constraints(value);
      serializeCsq4biimSocsecno2(csq4biimSocsecno2);
   } 

     /**
	 * 	Update Csq4biimSocsecno2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCsq4biimSocsecno2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCsq4biimSocsecno2,csq4biimSocsecno2.length);
   	
   }
   
   public void setCsq4biimSocsecno2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimSocsecno2,csq4biimSocsecno2.length);
   	
   }
   
     /**
	 * 	Update Csq4biimSocsecno2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimSocsecno2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimSocsecno2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Csq4biimSocsecno2 with another Field
	 *	@param value
	 */
   public void setCsq4biimSocsecno2(Field source) {
       replace(source,0,source.length(),beginCsq4biimSocsecno2,CSQ_4BIIM_SOCSECNO_2_LEN);
   	
   }  
   
     /**
	 * 	Update Csq4biimSocsecno2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCsq4biimSocsecno2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCsq4biimSocsecno2,CSQ_4BIIM_SOCSECNO_2_LEN);
   	
   }
   
     /**
	 * 	Update Csq4biimSocsecno2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimSocsecno2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimSocsecno2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of csq4biimSocsecno3
	 *	@return csq4biimSocsecno3
	 */
   public char[] getCsq4biimSocsecno3() throws CFException{
     if (isCsq4biimSocsecno3Modified()) { 
        csq4biimSocsecno3 = refreshCsq4biimSocsecno3();
     }
   		return csq4biimSocsecno3;
   }

  
	/**
	*  set variable csq4biimSocsecno3
	*  Corresponding COBOL Variable is CSQ4BIIM-SOCSECNO3
	*  @param value
	**/
   public void setCsq4biimSocsecno3(char[] value) {
      csq4biimSocsecno3 = checkCsq4biimSocsecno3Constraints(value);
      serializeCsq4biimSocsecno3(csq4biimSocsecno3);
   } 

     /**
	 * 	Update Csq4biimSocsecno3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCsq4biimSocsecno3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCsq4biimSocsecno3,csq4biimSocsecno3.length);
   	
   }
   
   public void setCsq4biimSocsecno3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimSocsecno3,csq4biimSocsecno3.length);
   	
   }
   
     /**
	 * 	Update Csq4biimSocsecno3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimSocsecno3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimSocsecno3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Csq4biimSocsecno3 with another Field
	 *	@param value
	 */
   public void setCsq4biimSocsecno3(Field source) {
       replace(source,0,source.length(),beginCsq4biimSocsecno3,CSQ_4BIIM_SOCSECNO_3_LEN);
   	
   }  
   
     /**
	 * 	Update Csq4biimSocsecno3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCsq4biimSocsecno3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCsq4biimSocsecno3,CSQ_4BIIM_SOCSECNO_3_LEN);
   	
   }
   
     /**
	 * 	Update Csq4biimSocsecno3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimSocsecno3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimSocsecno3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of csq4biimBankname
	 *	@return csq4biimBankname
	 */
   public char[] getCsq4biimBankname() throws CFException{
     if (isCsq4biimBanknameModified()) { 
        csq4biimBankname = refreshCsq4biimBankname();
     }
   		return csq4biimBankname;
   }

  
	/**
	*  set variable csq4biimBankname
	*  Corresponding COBOL Variable is CSQ4BIIM-BANKNAME
	*  @param value
	**/
   public void setCsq4biimBankname(char[] value) {
      csq4biimBankname = checkCsq4biimBanknameConstraints(value);
      serializeCsq4biimBankname(csq4biimBankname);
   } 

     /**
	 * 	Update Csq4biimBankname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCsq4biimBankname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCsq4biimBankname,csq4biimBankname.length);
   	
   }
   
   public void setCsq4biimBankname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimBankname,csq4biimBankname.length);
   	
   }
   
     /**
	 * 	Update Csq4biimBankname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimBankname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimBankname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Csq4biimBankname with another Field
	 *	@param value
	 */
   public void setCsq4biimBankname(Field source) {
       replace(source,0,source.length(),beginCsq4biimBankname,CSQ_4BIIM_BANKNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Csq4biimBankname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCsq4biimBankname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCsq4biimBankname,CSQ_4BIIM_BANKNAME_LEN);
   	
   }
   
     /**
	 * 	Update Csq4biimBankname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimBankname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimBankname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of csq4biimBankacname
	 *	@return csq4biimBankacname
	 */
   public char[] getCsq4biimBankacname() throws CFException{
     if (isCsq4biimBankacnameModified()) { 
        csq4biimBankacname = refreshCsq4biimBankacname();
     }
   		return csq4biimBankacname;
   }

  
	/**
	*  set variable csq4biimBankacname
	*  Corresponding COBOL Variable is CSQ4BIIM-BANKACNAME
	*  @param value
	**/
   public void setCsq4biimBankacname(char[] value) {
      csq4biimBankacname = checkCsq4biimBankacnameConstraints(value);
      serializeCsq4biimBankacname(csq4biimBankacname);
   } 

     /**
	 * 	Update Csq4biimBankacname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCsq4biimBankacname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCsq4biimBankacname,csq4biimBankacname.length);
   	
   }
   
   public void setCsq4biimBankacname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimBankacname,csq4biimBankacname.length);
   	
   }
   
     /**
	 * 	Update Csq4biimBankacname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimBankacname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimBankacname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Csq4biimBankacname with another Field
	 *	@param value
	 */
   public void setCsq4biimBankacname(Field source) {
       replace(source,0,source.length(),beginCsq4biimBankacname,CSQ_4BIIM_BANKACNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Csq4biimBankacname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCsq4biimBankacname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCsq4biimBankacname,CSQ_4BIIM_BANKACNAME_LEN);
   	
   }
   
     /**
	 * 	Update Csq4biimBankacname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimBankacname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimBankacname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of csq4biimBankacnum
	 *	@return csq4biimBankacnum
	 */
   public char[] getCsq4biimBankacnum() throws CFException{
     if (isCsq4biimBankacnumModified()) { 
        csq4biimBankacnum = refreshCsq4biimBankacnum();
     }
   		return csq4biimBankacnum;
   }

  
	/**
	*  set variable csq4biimBankacnum
	*  Corresponding COBOL Variable is CSQ4BIIM-BANKACNUM
	*  @param value
	**/
   public void setCsq4biimBankacnum(char[] value) {
      csq4biimBankacnum = checkCsq4biimBankacnumConstraints(value);
      serializeCsq4biimBankacnum(csq4biimBankacnum);
   } 

     /**
	 * 	Update Csq4biimBankacnum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCsq4biimBankacnum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCsq4biimBankacnum,csq4biimBankacnum.length);
   	
   }
   
   public void setCsq4biimBankacnum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimBankacnum,csq4biimBankacnum.length);
   	
   }
   
     /**
	 * 	Update Csq4biimBankacnum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimBankacnum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimBankacnum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Csq4biimBankacnum with another Field
	 *	@param value
	 */
   public void setCsq4biimBankacnum(Field source) {
       replace(source,0,source.length(),beginCsq4biimBankacnum,CSQ_4BIIM_BANKACNUM_LEN);
   	
   }  
   
     /**
	 * 	Update Csq4biimBankacnum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCsq4biimBankacnum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCsq4biimBankacnum,CSQ_4BIIM_BANKACNUM_LEN);
   	
   }
   
     /**
	 * 	Update Csq4biimBankacnum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimBankacnum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimBankacnum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of csq4biimLoanreq
	 *	@return csq4biimLoanreq
	 */
   public char[] getCsq4biimLoanreq() throws CFException{
     if (isCsq4biimLoanreqModified()) { 
        csq4biimLoanreq = refreshCsq4biimLoanreq();
     }
   		return csq4biimLoanreq;
   }

  
	/**
	*  set variable csq4biimLoanreq
	*  Corresponding COBOL Variable is CSQ4BIIM-LOANREQ
	*  @param value
	**/
   public void setCsq4biimLoanreq(char[] value) {
      csq4biimLoanreq = checkCsq4biimLoanreqConstraints(value);
      serializeCsq4biimLoanreq(csq4biimLoanreq);
   } 

     /**
	 * 	Update Csq4biimLoanreq 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCsq4biimLoanreq(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCsq4biimLoanreq,csq4biimLoanreq.length);
   	
   }
   
   public void setCsq4biimLoanreq(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimLoanreq,csq4biimLoanreq.length);
   	
   }
   
     /**
	 * 	Update Csq4biimLoanreq 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimLoanreq(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimLoanreq+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Csq4biimLoanreq with another Field
	 *	@param value
	 */
   public void setCsq4biimLoanreq(Field source) {
       replace(source,0,source.length(),beginCsq4biimLoanreq,CSQ_4BIIM_LOANREQ_LEN);
   	
   }  
   
     /**
	 * 	Update Csq4biimLoanreq 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCsq4biimLoanreq(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCsq4biimLoanreq,CSQ_4BIIM_LOANREQ_LEN);
   	
   }
   
     /**
	 * 	Update Csq4biimLoanreq 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimLoanreq(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsq4biimLoanreq+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCsq4biimGroupFieldLength() {
			return CSQ_4BIIM_GROUP_LENGTH;
		}

}
  
