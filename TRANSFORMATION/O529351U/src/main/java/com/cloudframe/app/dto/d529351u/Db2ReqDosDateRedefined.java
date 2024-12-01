package com.cloudframe.app.dto.d529351u;

/**
*  The class Db2ReqDosDateRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Db2ReqDosDateRedefined extends Db2ReqDosDateRedefinedSerialized { 
   

						private char[] db2DosYyyy = Field.fillLowValue(4);

						private char[] db2Dash1 = Field.fillLowValue(1);

						private char[] db2DosMm = Field.fillLowValue(2);

						private char[] db2Dash2 = Field.fillLowValue(1);

						private char[] db2DosDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Db2ReqDosDateRedefined
	**/
    public Db2ReqDosDateRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Db2ReqDosDateRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Db2ReqDosDateRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of db2DosYyyy
	 *	@return db2DosYyyy
	 */
   public char[] getDb2DosYyyy() throws CFException{
     if (isDb2DosYyyyModified()) { 
        db2DosYyyy = refreshDb2DosYyyy();
     }
   		return db2DosYyyy;
   }

  
	/**
	*  set variable db2DosYyyy
	*  Corresponding COBOL Variable is WS-DB2-DOS-YYYY
	*  @param value
	**/
   public void setDb2DosYyyy(char[] value) {
      db2DosYyyy = checkDb2DosYyyyConstraints(value);
      serializeDb2DosYyyy(db2DosYyyy);
   } 

     /**
	 * 	Update Db2DosYyyy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb2DosYyyy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb2DosYyyy,db2DosYyyy.length);
   	
   }
   
   public void setDb2DosYyyy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb2DosYyyy,db2DosYyyy.length);
   	
   }
   
     /**
	 * 	Update Db2DosYyyy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb2DosYyyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2DosYyyy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db2DosYyyy with another Field
	 *	@param value
	 */
   public void setDb2DosYyyy(Field source) {
       replace(source,0,source.length(),beginDb2DosYyyy,DB_2_DOS_YYYY_LEN);
   	
   }  
   
     /**
	 * 	Update Db2DosYyyy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb2DosYyyy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb2DosYyyy,DB_2_DOS_YYYY_LEN);
   	
   }
   
     /**
	 * 	Update Db2DosYyyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb2DosYyyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2DosYyyy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of db2Dash1
	 *	@return db2Dash1
	 */
   public char[] getDb2Dash1() throws CFException{
     if (isDb2Dash1Modified()) { 
        db2Dash1 = refreshDb2Dash1();
     }
   		return db2Dash1;
   }

  
	/**
	*  set variable db2Dash1
	*  Corresponding COBOL Variable is WS-DB2-DASH1
	*  @param value
	**/
   public void setDb2Dash1(char[] value) {
      db2Dash1 = checkDb2Dash1Constraints(value);
      serializeDb2Dash1(db2Dash1);
   } 

     /**
	 * 	Update Db2Dash1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb2Dash1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb2Dash1,db2Dash1.length);
   	
   }
   
   public void setDb2Dash1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb2Dash1,db2Dash1.length);
   	
   }
   
     /**
	 * 	Update Db2Dash1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb2Dash1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2Dash1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db2Dash1 with another Field
	 *	@param value
	 */
   public void setDb2Dash1(Field source) {
       replace(source,0,source.length(),beginDb2Dash1,DB_2_DASH_1_LEN);
   	
   }  
   
     /**
	 * 	Update Db2Dash1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb2Dash1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb2Dash1,DB_2_DASH_1_LEN);
   	
   }
   
     /**
	 * 	Update Db2Dash1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb2Dash1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2Dash1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of db2DosMm
	 *	@return db2DosMm
	 */
   public char[] getDb2DosMm() throws CFException{
     if (isDb2DosMmModified()) { 
        db2DosMm = refreshDb2DosMm();
     }
   		return db2DosMm;
   }

  
	/**
	*  set variable db2DosMm
	*  Corresponding COBOL Variable is WS-DB2-DOS-MM
	*  @param value
	**/
   public void setDb2DosMm(char[] value) {
      db2DosMm = checkDb2DosMmConstraints(value);
      serializeDb2DosMm(db2DosMm);
   } 

     /**
	 * 	Update Db2DosMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb2DosMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb2DosMm,db2DosMm.length);
   	
   }
   
   public void setDb2DosMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb2DosMm,db2DosMm.length);
   	
   }
   
     /**
	 * 	Update Db2DosMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb2DosMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2DosMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db2DosMm with another Field
	 *	@param value
	 */
   public void setDb2DosMm(Field source) {
       replace(source,0,source.length(),beginDb2DosMm,DB_2_DOS_MM_LEN);
   	
   }  
   
     /**
	 * 	Update Db2DosMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb2DosMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb2DosMm,DB_2_DOS_MM_LEN);
   	
   }
   
     /**
	 * 	Update Db2DosMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb2DosMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2DosMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of db2Dash2
	 *	@return db2Dash2
	 */
   public char[] getDb2Dash2() throws CFException{
     if (isDb2Dash2Modified()) { 
        db2Dash2 = refreshDb2Dash2();
     }
   		return db2Dash2;
   }

  
	/**
	*  set variable db2Dash2
	*  Corresponding COBOL Variable is WS-DB2-DASH2
	*  @param value
	**/
   public void setDb2Dash2(char[] value) {
      db2Dash2 = checkDb2Dash2Constraints(value);
      serializeDb2Dash2(db2Dash2);
   } 

     /**
	 * 	Update Db2Dash2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb2Dash2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb2Dash2,db2Dash2.length);
   	
   }
   
   public void setDb2Dash2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb2Dash2,db2Dash2.length);
   	
   }
   
     /**
	 * 	Update Db2Dash2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb2Dash2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2Dash2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db2Dash2 with another Field
	 *	@param value
	 */
   public void setDb2Dash2(Field source) {
       replace(source,0,source.length(),beginDb2Dash2,DB_2_DASH_2_LEN);
   	
   }  
   
     /**
	 * 	Update Db2Dash2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb2Dash2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb2Dash2,DB_2_DASH_2_LEN);
   	
   }
   
     /**
	 * 	Update Db2Dash2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb2Dash2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2Dash2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of db2DosDd
	 *	@return db2DosDd
	 */
   public char[] getDb2DosDd() throws CFException{
     if (isDb2DosDdModified()) { 
        db2DosDd = refreshDb2DosDd();
     }
   		return db2DosDd;
   }

  
	/**
	*  set variable db2DosDd
	*  Corresponding COBOL Variable is WS-DB2-DOS-DD
	*  @param value
	**/
   public void setDb2DosDd(char[] value) {
      db2DosDd = checkDb2DosDdConstraints(value);
      serializeDb2DosDd(db2DosDd);
   } 

     /**
	 * 	Update Db2DosDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb2DosDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb2DosDd,db2DosDd.length);
   	
   }
   
   public void setDb2DosDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb2DosDd,db2DosDd.length);
   	
   }
   
     /**
	 * 	Update Db2DosDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb2DosDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2DosDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db2DosDd with another Field
	 *	@param value
	 */
   public void setDb2DosDd(Field source) {
       replace(source,0,source.length(),beginDb2DosDd,DB_2_DOS_DD_LEN);
   	
   }  
   
     /**
	 * 	Update Db2DosDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb2DosDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb2DosDd,DB_2_DOS_DD_LEN);
   	
   }
   
     /**
	 * 	Update Db2DosDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb2DosDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2DosDd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDb2ReqDosDateRedefinedFieldLength() {
			return DB_2_REQ_DOS_DATE_REDEFINED_LENGTH;
		}

}
  
