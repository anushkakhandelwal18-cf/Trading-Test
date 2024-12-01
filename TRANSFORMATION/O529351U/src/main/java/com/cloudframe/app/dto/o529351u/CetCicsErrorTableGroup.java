package com.cloudframe.app.dto.o529351u;

/**
*  The class CetCicsErrorTableGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CetCicsErrorTableGroup extends CetCicsErrorTableGroupSerialized { 
   
					private CetCicsErrorTable cetCicsErrorTable = new CetCicsErrorTable();
					private CetCicsErrorTableRedefined01 cetCicsErrorTableRedefined01 = new CetCicsErrorTableRedefined01();

						private char[] cetCicsErrorTableRedefined02 = Field.fillLowValue(6);
					private CetCicsErrorTableRedefined03 cetCicsErrorTableRedefined03 = new CetCicsErrorTableRedefined03();
					private CetCicsErrorTableRedefined cetCicsErrorTableRedefined = new CetCicsErrorTableRedefined();
	
	/**
	* Constructor for CetCicsErrorTableGroup
	**/
    public CetCicsErrorTableGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			cetCicsErrorTable.setParent(this,getStartOffset() + 0);
	       			cetCicsErrorTableRedefined01.setParent(this,getStartOffset() + 0);
	       			cetCicsErrorTableRedefined03.setParent(this,getStartOffset() + 0);
	       			cetCicsErrorTableRedefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of cetCicsErrorTable
	 *	@return cetCicsErrorTable
	 */   
	 public CetCicsErrorTable getCetCicsErrorTable() {
   	return cetCicsErrorTable;
   }
   /**
	* 	Update CetCicsErrorTable with the passed value
	*   Corresponding COBOL Variable is CET-CICS-ERROR-TABLE
	*	@param value
	*/
   public void setCetCicsErrorTable(char[] value) {
      cetCicsErrorTable.setString(value); 
   }   
    
     /**
	 * 	Update CetCicsErrorTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCetCicsErrorTable(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cetCicsErrorTable.begin,cetCicsErrorTable.length());
   }
   
     /**
	 * 	Update CetCicsErrorTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCetCicsErrorTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cetCicsErrorTable.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CetCicsErrorTable with another Field
	 *	@param value
	 */
   public void setCetCicsErrorTable(Field source) {
   	replace(source,0,source.length(),cetCicsErrorTable.begin,cetCicsErrorTable.length());
   }  
   
     /**
	 * 	Update CetCicsErrorTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCetCicsErrorTable(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cetCicsErrorTable.begin,cetCicsErrorTable.length());
   }
   
     /**
	 * 	Update CetCicsErrorTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCetCicsErrorTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cetCicsErrorTable.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cetCicsErrorTableRedefined01
	 *	@return cetCicsErrorTableRedefined01
	 */   
	 public CetCicsErrorTableRedefined01 getCetCicsErrorTableRedefined01() {
   	return cetCicsErrorTableRedefined01;
   }
   /**
	* 	Update CetCicsErrorTableRedefined01 with the passed value
	*   Corresponding COBOL Variable is CET-CICS-ERROR-TABLE-REDEFINED
	*	@param value
	*/
   public void setCetCicsErrorTableRedefined01(char[] value) {
      cetCicsErrorTableRedefined01.setString(value); 
   }   
    
     /**
	 * 	Update CetCicsErrorTableRedefined01 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined01(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cetCicsErrorTableRedefined01.begin,cetCicsErrorTableRedefined01.length());
   }
   
     /**
	 * 	Update CetCicsErrorTableRedefined01 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cetCicsErrorTableRedefined01.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CetCicsErrorTableRedefined01 with another Field
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined01(Field source) {
   	replace(source,0,source.length(),cetCicsErrorTableRedefined01.begin,cetCicsErrorTableRedefined01.length());
   }  
   
     /**
	 * 	Update CetCicsErrorTableRedefined01 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined01(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cetCicsErrorTableRedefined01.begin,cetCicsErrorTableRedefined01.length());
   }
   
     /**
	 * 	Update CetCicsErrorTableRedefined01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cetCicsErrorTableRedefined01.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cetCicsErrorTableRedefined02
	 *	@return cetCicsErrorTableRedefined02
	 */
   public char[] getCetCicsErrorTableRedefined02() throws CFException{
     if (isCetCicsErrorTableRedefined02Modified()) { 
        cetCicsErrorTableRedefined02 = refreshCetCicsErrorTableRedefined02();
     }
   		return cetCicsErrorTableRedefined02;
   }

  
	/**
	*  set variable cetCicsErrorTableRedefined02
	*  Corresponding COBOL Variable is CET-CICS-ERROR-TABLE-REDEFINED
	*  @param value
	**/
   public void setCetCicsErrorTableRedefined02(char[] value) {
      cetCicsErrorTableRedefined02 = checkCetCicsErrorTableRedefined02Constraints(value);
      serializeCetCicsErrorTableRedefined02(cetCicsErrorTableRedefined02);
   } 

     /**
	 * 	Update CetCicsErrorTableRedefined02 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined02(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCetCicsErrorTableRedefined02,cetCicsErrorTableRedefined02.length);
   	
   }
   
   public void setCetCicsErrorTableRedefined02(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCetCicsErrorTableRedefined02,cetCicsErrorTableRedefined02.length);
   	
   }
   
     /**
	 * 	Update CetCicsErrorTableRedefined02 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined02(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCetCicsErrorTableRedefined02+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CetCicsErrorTableRedefined02 with another Field
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined02(Field source) {
       replace(source,0,source.length(),beginCetCicsErrorTableRedefined02,CET_CICS_ERROR_TABLE_REDEFINED_02_LEN);
   	
   }  
   
     /**
	 * 	Update CetCicsErrorTableRedefined02 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined02(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCetCicsErrorTableRedefined02,CET_CICS_ERROR_TABLE_REDEFINED_02_LEN);
   	
   }
   
     /**
	 * 	Update CetCicsErrorTableRedefined02 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined02(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCetCicsErrorTableRedefined02+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cetCicsErrorTableRedefined03
	 *	@return cetCicsErrorTableRedefined03
	 */   
	 public CetCicsErrorTableRedefined03 getCetCicsErrorTableRedefined03() {
   	return cetCicsErrorTableRedefined03;
   }
   /**
	* 	Update CetCicsErrorTableRedefined03 with the passed value
	*   Corresponding COBOL Variable is CET-CICS-ERROR-TABLE-REDEFINED
	*	@param value
	*/
   public void setCetCicsErrorTableRedefined03(char[] value) {
      cetCicsErrorTableRedefined03.setString(value); 
   }   
    
     /**
	 * 	Update CetCicsErrorTableRedefined03 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined03(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cetCicsErrorTableRedefined03.begin,cetCicsErrorTableRedefined03.length());
   }
   
     /**
	 * 	Update CetCicsErrorTableRedefined03 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined03(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cetCicsErrorTableRedefined03.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CetCicsErrorTableRedefined03 with another Field
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined03(Field source) {
   	replace(source,0,source.length(),cetCicsErrorTableRedefined03.begin,cetCicsErrorTableRedefined03.length());
   }  
   
     /**
	 * 	Update CetCicsErrorTableRedefined03 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined03(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cetCicsErrorTableRedefined03.begin,cetCicsErrorTableRedefined03.length());
   }
   
     /**
	 * 	Update CetCicsErrorTableRedefined03 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined03(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cetCicsErrorTableRedefined03.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cetCicsErrorTableRedefined
	 *	@return cetCicsErrorTableRedefined
	 */   
	 public CetCicsErrorTableRedefined getCetCicsErrorTableRedefined() {
   	return cetCicsErrorTableRedefined;
   }
   /**
	* 	Update CetCicsErrorTableRedefined with the passed value
	*   Corresponding COBOL Variable is CET-CICS-ERROR-TABLE-REDEFINED
	*	@param value
	*/
   public void setCetCicsErrorTableRedefined(char[] value) {
      cetCicsErrorTableRedefined.setString(value); 
   }   
    
     /**
	 * 	Update CetCicsErrorTableRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cetCicsErrorTableRedefined.begin,cetCicsErrorTableRedefined.length());
   }
   
     /**
	 * 	Update CetCicsErrorTableRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cetCicsErrorTableRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CetCicsErrorTableRedefined with another Field
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined(Field source) {
   	replace(source,0,source.length(),cetCicsErrorTableRedefined.begin,cetCicsErrorTableRedefined.length());
   }  
   
     /**
	 * 	Update CetCicsErrorTableRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cetCicsErrorTableRedefined.begin,cetCicsErrorTableRedefined.length());
   }
   
     /**
	 * 	Update CetCicsErrorTableRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCetCicsErrorTableRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cetCicsErrorTableRedefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCetCicsErrorTableGroupFieldLength() {
			return CET_CICS_ERROR_TABLE_GROUP_LENGTH;
		}

}
  
