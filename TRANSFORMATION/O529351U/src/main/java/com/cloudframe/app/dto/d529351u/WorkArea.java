package com.cloudframe.app.dto.d529351u;

/**
*  The class WorkArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WorkArea extends WorkAreaSerialized { 
   

						private char[] dsmPgmName = new char[8];

								private short nullSpiVerNbr;

						private char[] commonRulesSpi = new char[7];

						private char[] db2ReqDosDate = Field.fillLowValue(10);
				private Db2ReqDosDateRedefined db2ReqDosDateRedefined = new Db2ReqDosDateRedefined();
	
	/**
	* Constructor for WorkArea
	**/
    public WorkArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			db2ReqDosDateRedefined.setParent(this,getStartOffset() + 17);
	   	/*  end of offset */
								setDsmPgmName(("D529351U").toCharArray());
								setNullSpiVerNbr((short)0);
								setCommonRulesSpi(fillSpace(7));
    }


 

	/**
	 *	Returns the value of dsmPgmName
	 *	@return dsmPgmName
	 */
   public char[] getDsmPgmName() throws CFException{
     if (isDsmPgmNameModified()) { 
        dsmPgmName = refreshDsmPgmName();
     }
   		return dsmPgmName;
   }

  
	/**
	*  set variable dsmPgmName
	*  Corresponding COBOL Variable is WS-DSM-PGM-NAME
	*  @param value
	**/
   public void setDsmPgmName(char[] value) {
      dsmPgmName = checkDsmPgmNameConstraints(value);
      serializeDsmPgmName(dsmPgmName);
   } 

     /**
	 * 	Update DsmPgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDsmPgmName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDsmPgmName,dsmPgmName.length);
   	
   }
   
   public void setDsmPgmName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDsmPgmName,dsmPgmName.length);
   	
   }
   
     /**
	 * 	Update DsmPgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsmPgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmPgmName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DsmPgmName with another Field
	 *	@param value
	 */
   public void setDsmPgmName(Field source) {
       replace(source,0,source.length(),beginDsmPgmName,DSM_PGM_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update DsmPgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDsmPgmName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDsmPgmName,DSM_PGM_NAME_LEN);
   	
   }
   
     /**
	 * 	Update DsmPgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsmPgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmPgmName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of nullSpiVerNbr
	 *	@return nullSpiVerNbr
	 */
	public short getNullSpiVerNbr() throws CFException {
        if (isNullSpiVerNbrModified()) { 
           nullSpiVerNbr = refreshNullSpiVerNbr();
        }
   		return nullSpiVerNbr;
	}
	
	/**
	 * 	Update NullSpiVerNbr with the passed value
	 *  Corresponding COBOL Variable is WS-NULL-SPI-VER-NBR
	 *	@param number
	 */
	public void setNullSpiVerNbr(short number) {
	     // Truncate if the number is beyond +/- Max range
	    nullSpiVerNbr = checkNullSpiVerNbrMaxLimit(number); 
		serializeNullSpiVerNbr(nullSpiVerNbr);
	}

	public void setNullSpiVerNbr(int number) {
	    number = checkNullSpiVerNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNullSpiVerNbr((short)number);
	}
	public void setNullSpiVerNbr(long number) {
	    number = checkNullSpiVerNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNullSpiVerNbr((short)number);
	}
	

	/**
	 *	Returns the value of commonRulesSpi
	 *	@return commonRulesSpi
	 */
   public char[] getCommonRulesSpi() throws CFException{
     if (isCommonRulesSpiModified()) { 
        commonRulesSpi = refreshCommonRulesSpi();
     }
   		return commonRulesSpi;
   }

  
	/**
	*  set variable commonRulesSpi
	*  Corresponding COBOL Variable is WS-COMMON-RULES-SPI
	*  @param value
	**/
   public void setCommonRulesSpi(char[] value) {
      commonRulesSpi = checkCommonRulesSpiConstraints(value);
      serializeCommonRulesSpi(commonRulesSpi);
   } 

     /**
	 * 	Update CommonRulesSpi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCommonRulesSpi(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCommonRulesSpi,commonRulesSpi.length);
   	
   }
   
   public void setCommonRulesSpi(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCommonRulesSpi,commonRulesSpi.length);
   	
   }
   
     /**
	 * 	Update CommonRulesSpi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCommonRulesSpi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCommonRulesSpi+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CommonRulesSpi with another Field
	 *	@param value
	 */
   public void setCommonRulesSpi(Field source) {
       replace(source,0,source.length(),beginCommonRulesSpi,COMMON_RULES_SPI_LEN);
   	
   }  
   
     /**
	 * 	Update CommonRulesSpi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCommonRulesSpi(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCommonRulesSpi,COMMON_RULES_SPI_LEN);
   	
   }
   
     /**
	 * 	Update CommonRulesSpi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCommonRulesSpi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCommonRulesSpi+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of db2ReqDosDate
	 *	@return db2ReqDosDate
	 */
   public char[] getDb2ReqDosDate() throws CFException{
     if (isDb2ReqDosDateModified()) { 
        db2ReqDosDate = refreshDb2ReqDosDate();
     }
   		return db2ReqDosDate;
   }

  
	/**
	*  set variable db2ReqDosDate
	*  Corresponding COBOL Variable is WS-DB2-REQ-DOS-DATE
	*  @param value
	**/
   public void setDb2ReqDosDate(char[] value) {
      db2ReqDosDate = checkDb2ReqDosDateConstraints(value);
      serializeDb2ReqDosDate(db2ReqDosDate);
   } 

     /**
	 * 	Update Db2ReqDosDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb2ReqDosDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb2ReqDosDate,db2ReqDosDate.length);
   	
   }
   
   public void setDb2ReqDosDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb2ReqDosDate,db2ReqDosDate.length);
   	
   }
   
     /**
	 * 	Update Db2ReqDosDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb2ReqDosDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2ReqDosDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db2ReqDosDate with another Field
	 *	@param value
	 */
   public void setDb2ReqDosDate(Field source) {
       replace(source,0,source.length(),beginDb2ReqDosDate,DB_2_REQ_DOS_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Db2ReqDosDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb2ReqDosDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb2ReqDosDate,DB_2_REQ_DOS_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Db2ReqDosDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb2ReqDosDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2ReqDosDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of db2ReqDosDateRedefined
	 *	@return db2ReqDosDateRedefined
	 */   
	 public Db2ReqDosDateRedefined getDb2ReqDosDateRedefined() {
   	return db2ReqDosDateRedefined;
   }
   /**
	* 	Update Db2ReqDosDateRedefined with the passed value
	*   Corresponding COBOL Variable is WS-DB2-REQ-DOS-DATE-REDEFINED
	*	@param value
	*/
   public void setDb2ReqDosDateRedefined(char[] value) {
      db2ReqDosDateRedefined.setString(value); 
   }   
    
     /**
	 * 	Update Db2ReqDosDateRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDb2ReqDosDateRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,db2ReqDosDateRedefined.begin,db2ReqDosDateRedefined.length());
   }
   
     /**
	 * 	Update Db2ReqDosDateRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb2ReqDosDateRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,db2ReqDosDateRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Db2ReqDosDateRedefined with another Field
	 *	@param value
	 */
   public void setDb2ReqDosDateRedefined(Field source) {
   	replace(source,0,source.length(),db2ReqDosDateRedefined.begin,db2ReqDosDateRedefined.length());
   }  
   
     /**
	 * 	Update Db2ReqDosDateRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDb2ReqDosDateRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,db2ReqDosDateRedefined.begin,db2ReqDosDateRedefined.length());
   }
   
     /**
	 * 	Update Db2ReqDosDateRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb2ReqDosDateRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,db2ReqDosDateRedefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWorkAreaFieldLength() {
			return WORK_AREA_LENGTH;
		}

}
  
