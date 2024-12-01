package com.cloudframe.app.dto.d5427dt1;

/**
*  The class StandardVars is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class StandardVars extends StandardVarsSerialized { 
   

						private char[] thisViewName = new char[8];

						private char[] db2Paragraph = new char[8];

						private char[] db2Resource = new char[30];

						private char[] db2Action = new char[10];

						private char[] dsntiar01 = new char[8];

						private char[] callingApplication = Field.fillLowValue(8);

								private short iDx;

						private char[] vp776a0001 = new char[8];
				private CurrentVariables currentVariables = new CurrentVariables();
				private AsnVariables asnVariables = new AsnVariables();
				private SysVariables sysVariables = new SysVariables();

						private char[] ceefrst = new char[8];
				private StorageAllocVars storageAllocVars = new StorageAllocVars();
				private Fc fc = new Fc();
	
	/**
	* Constructor for StandardVars
	**/
    public StandardVars() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			currentVariables.setParent(this,getStartOffset() + 82);
	       			asnVariables.setParent(this,getStartOffset() + 134);
	       			sysVariables.setParent(this,getStartOffset() + 178);
	       			storageAllocVars.setParent(this,getStartOffset() + 222);
	       			fc.setParent(this,getStartOffset() + 230);
	   	/*  end of offset */
								setThisViewName(("D5427DT1").toCharArray());
								setDb2Paragraph(fillSpace(8));
								setDb2Resource(fillSpace(30));
								setDb2Action(fillSpace(10));
								setDsntiar01(("DSNTIAR ").toCharArray());
								setVp776a0001(("VP776A00").toCharArray());
								setCeefrst(("CEEFRST ").toCharArray());
    }


 

	/**
	 *	Returns the value of thisViewName
	 *	@return thisViewName
	 */
   public char[] getThisViewName() throws CFException{
     if (isThisViewNameModified()) { 
        thisViewName = refreshThisViewName();
     }
   		return thisViewName;
   }

  
	/**
	*  set variable thisViewName
	*  Corresponding COBOL Variable is THIS-VIEW-NAME
	*  @param value
	**/
   public void setThisViewName(char[] value) {
      thisViewName = checkThisViewNameConstraints(value);
      serializeThisViewName(thisViewName);
   } 

     /**
	 * 	Update ThisViewName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setThisViewName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginThisViewName,thisViewName.length);
   	
   }
   
   public void setThisViewName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginThisViewName,thisViewName.length);
   	
   }
   
     /**
	 * 	Update ThisViewName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setThisViewName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginThisViewName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ThisViewName with another Field
	 *	@param value
	 */
   public void setThisViewName(Field source) {
       replace(source,0,source.length(),beginThisViewName,THIS_VIEW_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update ThisViewName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setThisViewName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginThisViewName,THIS_VIEW_NAME_LEN);
   	
   }
   
     /**
	 * 	Update ThisViewName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setThisViewName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginThisViewName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of db2Paragraph
	 *	@return db2Paragraph
	 */
   public char[] getDb2Paragraph() throws CFException{
     if (isDb2ParagraphModified()) { 
        db2Paragraph = refreshDb2Paragraph();
     }
   		return db2Paragraph;
   }

  
	/**
	*  set variable db2Paragraph
	*  Corresponding COBOL Variable is DB2-PARAGRAPH
	*  @param value
	**/
   public void setDb2Paragraph(char[] value) {
      db2Paragraph = checkDb2ParagraphConstraints(value);
      serializeDb2Paragraph(db2Paragraph);
   } 

     /**
	 * 	Update Db2Paragraph 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb2Paragraph(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb2Paragraph,db2Paragraph.length);
   	
   }
   
   public void setDb2Paragraph(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb2Paragraph,db2Paragraph.length);
   	
   }
   
     /**
	 * 	Update Db2Paragraph 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb2Paragraph(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2Paragraph+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db2Paragraph with another Field
	 *	@param value
	 */
   public void setDb2Paragraph(Field source) {
       replace(source,0,source.length(),beginDb2Paragraph,DB_2_PARAGRAPH_LEN);
   	
   }  
   
     /**
	 * 	Update Db2Paragraph 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb2Paragraph(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb2Paragraph,DB_2_PARAGRAPH_LEN);
   	
   }
   
     /**
	 * 	Update Db2Paragraph 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb2Paragraph(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2Paragraph+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of db2Resource
	 *	@return db2Resource
	 */
   public char[] getDb2Resource() throws CFException{
     if (isDb2ResourceModified()) { 
        db2Resource = refreshDb2Resource();
     }
   		return db2Resource;
   }

  
	/**
	*  set variable db2Resource
	*  Corresponding COBOL Variable is DB2-RESOURCE
	*  @param value
	**/
   public void setDb2Resource(char[] value) {
      db2Resource = checkDb2ResourceConstraints(value);
      serializeDb2Resource(db2Resource);
   } 

     /**
	 * 	Update Db2Resource 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb2Resource(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb2Resource,db2Resource.length);
   	
   }
   
   public void setDb2Resource(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb2Resource,db2Resource.length);
   	
   }
   
     /**
	 * 	Update Db2Resource 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb2Resource(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2Resource+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db2Resource with another Field
	 *	@param value
	 */
   public void setDb2Resource(Field source) {
       replace(source,0,source.length(),beginDb2Resource,DB_2_RESOURCE_LEN);
   	
   }  
   
     /**
	 * 	Update Db2Resource 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb2Resource(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb2Resource,DB_2_RESOURCE_LEN);
   	
   }
   
     /**
	 * 	Update Db2Resource 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb2Resource(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2Resource+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of db2Action
	 *	@return db2Action
	 */
   public char[] getDb2Action() throws CFException{
     if (isDb2ActionModified()) { 
        db2Action = refreshDb2Action();
     }
   		return db2Action;
   }

  
	/**
	*  set variable db2Action
	*  Corresponding COBOL Variable is DB2-ACTION
	*  @param value
	**/
   public void setDb2Action(char[] value) {
      db2Action = checkDb2ActionConstraints(value);
      serializeDb2Action(db2Action);
   } 

     /**
	 * 	Update Db2Action 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb2Action(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb2Action,db2Action.length);
   	
   }
   
   public void setDb2Action(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb2Action,db2Action.length);
   	
   }
   
     /**
	 * 	Update Db2Action 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb2Action(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2Action+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db2Action with another Field
	 *	@param value
	 */
   public void setDb2Action(Field source) {
       replace(source,0,source.length(),beginDb2Action,DB_2_ACTION_LEN);
   	
   }  
   
     /**
	 * 	Update Db2Action 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb2Action(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb2Action,DB_2_ACTION_LEN);
   	
   }
   
     /**
	 * 	Update Db2Action 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb2Action(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb2Action+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dsntiar01
	 *	@return dsntiar01
	 */
   public char[] getDsntiar01() throws CFException{
     if (isDsntiar01Modified()) { 
        dsntiar01 = refreshDsntiar01();
     }
   		return dsntiar01;
   }

  
	/**
	*  set variable dsntiar01
	*  Corresponding COBOL Variable is DSNTIAR
	*  @param value
	**/
   public void setDsntiar01(char[] value) {
      dsntiar01 = checkDsntiar01Constraints(value);
      serializeDsntiar01(dsntiar01);
   } 

     /**
	 * 	Update Dsntiar01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDsntiar01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDsntiar01,dsntiar01.length);
   	
   }
   
   public void setDsntiar01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDsntiar01,dsntiar01.length);
   	
   }
   
     /**
	 * 	Update Dsntiar01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsntiar01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsntiar01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dsntiar01 with another Field
	 *	@param value
	 */
   public void setDsntiar01(Field source) {
       replace(source,0,source.length(),beginDsntiar01,DSNTIAR_01_LEN);
   	
   }  
   
     /**
	 * 	Update Dsntiar01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDsntiar01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDsntiar01,DSNTIAR_01_LEN);
   	
   }
   
     /**
	 * 	Update Dsntiar01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsntiar01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsntiar01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of callingApplication
	 *	@return callingApplication
	 */
   public char[] getCallingApplication() throws CFException{
     if (isCallingApplicationModified()) { 
        callingApplication = refreshCallingApplication();
     }
   		return callingApplication;
   }

  
	/**
	*  set variable callingApplication
	*  Corresponding COBOL Variable is CALLING-APPLICATION
	*  @param value
	**/
   public void setCallingApplication(char[] value) {
      callingApplication = checkCallingApplicationConstraints(value);
      serializeCallingApplication(callingApplication);
   } 

     /**
	 * 	Update CallingApplication 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCallingApplication(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCallingApplication,callingApplication.length);
   	
   }
   
   public void setCallingApplication(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCallingApplication,callingApplication.length);
   	
   }
   
     /**
	 * 	Update CallingApplication 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCallingApplication(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCallingApplication+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CallingApplication with another Field
	 *	@param value
	 */
   public void setCallingApplication(Field source) {
       replace(source,0,source.length(),beginCallingApplication,CALLING_APPLICATION_LEN);
   	
   }  
   
     /**
	 * 	Update CallingApplication 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCallingApplication(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCallingApplication,CALLING_APPLICATION_LEN);
   	
   }
   
     /**
	 * 	Update CallingApplication 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCallingApplication(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCallingApplication+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of iDx
	 *	@return iDx
	 */
	public short getIDx() throws CFException {
        if (isIDxModified()) { 
           iDx = refreshIDx();
        }
   		return iDx;
	}
	
	/**
	 * 	Update IDx with the passed value
	 *  Corresponding COBOL Variable is I-DX
	 *	@param number
	 */
	public void setIDx(short number) {
	     // Truncate if the number is beyond +/- Max range
	    iDx = checkIDxMaxLimit(number); 
		serializeIDx(iDx);
	}

	public void setIDx(int number) {
	    number = checkIDxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIDx((short)number);
	}
	public void setIDx(long number) {
	    number = checkIDxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIDx((short)number);
	}
	

	/**
	 *	Returns the value of vp776a0001
	 *	@return vp776a0001
	 */
   public char[] getVp776a0001() throws CFException{
     if (isVp776a0001Modified()) { 
        vp776a0001 = refreshVp776a0001();
     }
   		return vp776a0001;
   }

  
	/**
	*  set variable vp776a0001
	*  Corresponding COBOL Variable is VP776A00
	*  @param value
	**/
   public void setVp776a0001(char[] value) {
      vp776a0001 = checkVp776a0001Constraints(value);
      serializeVp776a0001(vp776a0001);
   } 

     /**
	 * 	Update Vp776a0001 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVp776a0001(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVp776a0001,vp776a0001.length);
   	
   }
   
   public void setVp776a0001(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVp776a0001,vp776a0001.length);
   	
   }
   
     /**
	 * 	Update Vp776a0001 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVp776a0001(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVp776a0001+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Vp776a0001 with another Field
	 *	@param value
	 */
   public void setVp776a0001(Field source) {
       replace(source,0,source.length(),beginVp776a0001,VP_776A_0001_LEN);
   	
   }  
   
     /**
	 * 	Update Vp776a0001 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVp776a0001(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVp776a0001,VP_776A_0001_LEN);
   	
   }
   
     /**
	 * 	Update Vp776a0001 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVp776a0001(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVp776a0001+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currentVariables
	 *	@return currentVariables
	 */   
	 public CurrentVariables getCurrentVariables() {
   	return currentVariables;
   }
   /**
	* 	Update CurrentVariables with the passed value
	*   Corresponding COBOL Variable is CURRENT-VARIABLES
	*	@param value
	*/
   public void setCurrentVariables(char[] value) {
      currentVariables.setString(value); 
   }   
    
     /**
	 * 	Update CurrentVariables 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCurrentVariables(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,currentVariables.begin,currentVariables.length());
   }
   
     /**
	 * 	Update CurrentVariables 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentVariables(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,currentVariables.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CurrentVariables with another Field
	 *	@param value
	 */
   public void setCurrentVariables(Field source) {
   	replace(source,0,source.length(),currentVariables.begin,currentVariables.length());
   }  
   
     /**
	 * 	Update CurrentVariables 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCurrentVariables(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,currentVariables.begin,currentVariables.length());
   }
   
     /**
	 * 	Update CurrentVariables 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentVariables(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,currentVariables.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of asnVariables
	 *	@return asnVariables
	 */   
	 public AsnVariables getAsnVariables() {
   	return asnVariables;
   }
   /**
	* 	Update AsnVariables with the passed value
	*   Corresponding COBOL Variable is ASN-VARIABLES
	*	@param value
	*/
   public void setAsnVariables(char[] value) {
      asnVariables.setString(value); 
   }   
    
     /**
	 * 	Update AsnVariables 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAsnVariables(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,asnVariables.begin,asnVariables.length());
   }
   
     /**
	 * 	Update AsnVariables 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsnVariables(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,asnVariables.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AsnVariables with another Field
	 *	@param value
	 */
   public void setAsnVariables(Field source) {
   	replace(source,0,source.length(),asnVariables.begin,asnVariables.length());
   }  
   
     /**
	 * 	Update AsnVariables 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAsnVariables(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,asnVariables.begin,asnVariables.length());
   }
   
     /**
	 * 	Update AsnVariables 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsnVariables(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,asnVariables.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sysVariables
	 *	@return sysVariables
	 */   
	 public SysVariables getSysVariables() {
   	return sysVariables;
   }
   /**
	* 	Update SysVariables with the passed value
	*   Corresponding COBOL Variable is SYS-VARIABLES
	*	@param value
	*/
   public void setSysVariables(char[] value) {
      sysVariables.setString(value); 
   }   
    
     /**
	 * 	Update SysVariables 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSysVariables(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sysVariables.begin,sysVariables.length());
   }
   
     /**
	 * 	Update SysVariables 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSysVariables(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sysVariables.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SysVariables with another Field
	 *	@param value
	 */
   public void setSysVariables(Field source) {
   	replace(source,0,source.length(),sysVariables.begin,sysVariables.length());
   }  
   
     /**
	 * 	Update SysVariables 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSysVariables(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sysVariables.begin,sysVariables.length());
   }
   
     /**
	 * 	Update SysVariables 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSysVariables(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sysVariables.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ceefrst
	 *	@return ceefrst
	 */
   public char[] getCeefrst() throws CFException{
     if (isCeefrstModified()) { 
        ceefrst = refreshCeefrst();
     }
   		return ceefrst;
   }

  
	/**
	*  set variable ceefrst
	*  Corresponding COBOL Variable is CEEFRST
	*  @param value
	**/
   public void setCeefrst(char[] value) {
      ceefrst = checkCeefrstConstraints(value);
      serializeCeefrst(ceefrst);
   } 

     /**
	 * 	Update Ceefrst 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCeefrst(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCeefrst,ceefrst.length);
   	
   }
   
   public void setCeefrst(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCeefrst,ceefrst.length);
   	
   }
   
     /**
	 * 	Update Ceefrst 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCeefrst(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCeefrst+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ceefrst with another Field
	 *	@param value
	 */
   public void setCeefrst(Field source) {
       replace(source,0,source.length(),beginCeefrst,CEEFRST_LEN);
   	
   }  
   
     /**
	 * 	Update Ceefrst 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCeefrst(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCeefrst,CEEFRST_LEN);
   	
   }
   
     /**
	 * 	Update Ceefrst 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCeefrst(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCeefrst+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of storageAllocVars
	 *	@return storageAllocVars
	 */   
	 public StorageAllocVars getStorageAllocVars() {
   	return storageAllocVars;
   }
   /**
	* 	Update StorageAllocVars with the passed value
	*   Corresponding COBOL Variable is STORAGE-ALLOC-VARS
	*	@param value
	*/
   public void setStorageAllocVars(char[] value) {
      storageAllocVars.setString(value); 
   }   
    
     /**
	 * 	Update StorageAllocVars 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setStorageAllocVars(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,storageAllocVars.begin,storageAllocVars.length());
   }
   
     /**
	 * 	Update StorageAllocVars 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStorageAllocVars(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,storageAllocVars.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update StorageAllocVars with another Field
	 *	@param value
	 */
   public void setStorageAllocVars(Field source) {
   	replace(source,0,source.length(),storageAllocVars.begin,storageAllocVars.length());
   }  
   
     /**
	 * 	Update StorageAllocVars 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setStorageAllocVars(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,storageAllocVars.begin,storageAllocVars.length());
   }
   
     /**
	 * 	Update StorageAllocVars 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStorageAllocVars(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,storageAllocVars.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of fc
	 *	@return fc
	 */   
	 public Fc getFc() {
   	return fc;
   }
   /**
	* 	Update Fc with the passed value
	*   Corresponding COBOL Variable is FC
	*	@param value
	*/
   public void setFc(char[] value) {
      fc.setString(value); 
   }   
    
     /**
	 * 	Update Fc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fc.begin,fc.length());
   }
   
     /**
	 * 	Update Fc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Fc with another Field
	 *	@param value
	 */
   public void setFc(Field source) {
   	replace(source,0,source.length(),fc.begin,fc.length());
   }  
   
     /**
	 * 	Update Fc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fc.begin,fc.length());
   }
   
     /**
	 * 	Update Fc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fc.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getStandardVarsFieldLength() {
			return STANDARD_VARS_LENGTH;
		}

}
  
