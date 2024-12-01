package com.cloudframe.app.dto.d5427dt1;

/**
*  The class DcladjdClmhstDenormRef is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DcladjdClmhstDenormRef extends DcladjdClmhstDenormRefSerialized { 
   
				private DderefInvnCtlNbrGroup dderefInvnCtlNbrGroup = new DderefInvnCtlNbrGroup();
				private DderefIcnSufxCdGroup dderefIcnSufxCdGroup = new DderefIcnSufxCdGroup();
				private DderefProcDtGroup dderefProcDtGroup = new DderefProcDtGroup();
				private DderefProcTmGroup dderefProcTmGroup = new DderefProcTmGroup();

								private short dderefIcnSufxVersNbr;
				private DderefLnIdGroup dderefLnIdGroup = new DderefLnIdGroup();
				private DderefDepnNbrGroup dderefDepnNbrGroup = new DderefDepnNbrGroup();
				private DderefEeIdGroup dderefEeIdGroup = new DderefEeIdGroup();
				private DderefPgmIdLstCharValGroup dderefPgmIdLstCharValGroup = new DderefPgmIdLstCharValGroup();
				private DderefPolNbrGroup dderefPolNbrGroup = new DderefPolNbrGroup();
	
	/**
	* Constructor for DcladjdClmhstDenormRef
	**/
    public DcladjdClmhstDenormRef() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			dderefInvnCtlNbrGroup.setParent(this,getStartOffset() + 12);
	       			dderefIcnSufxCdGroup.setParent(this,getStartOffset() + 22);
	       			dderefProcDtGroup.setParent(this,getStartOffset() + 24);
	       			dderefProcTmGroup.setParent(this,getStartOffset() + 34);
	       			dderefLnIdGroup.setParent(this,getStartOffset() + 44);
	       			dderefDepnNbrGroup.setParent(this,getStartOffset() + 87);
	       			dderefEeIdGroup.setParent(this,getStartOffset() + 110);
	       			dderefPgmIdLstCharValGroup.setParent(this,getStartOffset() + 227);
	       			dderefPolNbrGroup.setParent(this,getStartOffset() + 238);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of dderefInvnCtlNbrGroup
	 *	@return dderefInvnCtlNbrGroup
	 */   
	 public DderefInvnCtlNbrGroup getDderefInvnCtlNbrGroup() {
   	return dderefInvnCtlNbrGroup;
   }
   /**
	* 	Update DderefInvnCtlNbrGroup with the passed value
	*   Corresponding COBOL Variable is DDEREF-INVN-CTL-NBR-GROUP
	*	@param value
	*/
   public void setDderefInvnCtlNbrGroup(char[] value) {
      dderefInvnCtlNbrGroup.setString(value); 
   }   
    
     /**
	 * 	Update DderefInvnCtlNbrGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDderefInvnCtlNbrGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dderefInvnCtlNbrGroup.begin,dderefInvnCtlNbrGroup.length());
   }
   
     /**
	 * 	Update DderefInvnCtlNbrGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDderefInvnCtlNbrGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dderefInvnCtlNbrGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DderefInvnCtlNbrGroup with another Field
	 *	@param value
	 */
   public void setDderefInvnCtlNbrGroup(Field source) {
   	replace(source,0,source.length(),dderefInvnCtlNbrGroup.begin,dderefInvnCtlNbrGroup.length());
   }  
   
     /**
	 * 	Update DderefInvnCtlNbrGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDderefInvnCtlNbrGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dderefInvnCtlNbrGroup.begin,dderefInvnCtlNbrGroup.length());
   }
   
     /**
	 * 	Update DderefInvnCtlNbrGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDderefInvnCtlNbrGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dderefInvnCtlNbrGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dderefIcnSufxCdGroup
	 *	@return dderefIcnSufxCdGroup
	 */   
	 public DderefIcnSufxCdGroup getDderefIcnSufxCdGroup() {
   	return dderefIcnSufxCdGroup;
   }
   /**
	* 	Update DderefIcnSufxCdGroup with the passed value
	*   Corresponding COBOL Variable is DDEREF-ICN-SUFX-CD-GROUP
	*	@param value
	*/
   public void setDderefIcnSufxCdGroup(char[] value) {
      dderefIcnSufxCdGroup.setString(value); 
   }   
    
     /**
	 * 	Update DderefIcnSufxCdGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDderefIcnSufxCdGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dderefIcnSufxCdGroup.begin,dderefIcnSufxCdGroup.length());
   }
   
     /**
	 * 	Update DderefIcnSufxCdGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDderefIcnSufxCdGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dderefIcnSufxCdGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DderefIcnSufxCdGroup with another Field
	 *	@param value
	 */
   public void setDderefIcnSufxCdGroup(Field source) {
   	replace(source,0,source.length(),dderefIcnSufxCdGroup.begin,dderefIcnSufxCdGroup.length());
   }  
   
     /**
	 * 	Update DderefIcnSufxCdGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDderefIcnSufxCdGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dderefIcnSufxCdGroup.begin,dderefIcnSufxCdGroup.length());
   }
   
     /**
	 * 	Update DderefIcnSufxCdGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDderefIcnSufxCdGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dderefIcnSufxCdGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dderefProcDtGroup
	 *	@return dderefProcDtGroup
	 */   
	 public DderefProcDtGroup getDderefProcDtGroup() {
   	return dderefProcDtGroup;
   }
   /**
	* 	Update DderefProcDtGroup with the passed value
	*   Corresponding COBOL Variable is DDEREF-PROC-DT-GROUP
	*	@param value
	*/
   public void setDderefProcDtGroup(char[] value) {
      dderefProcDtGroup.setString(value); 
   }   
    
     /**
	 * 	Update DderefProcDtGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDderefProcDtGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dderefProcDtGroup.begin,dderefProcDtGroup.length());
   }
   
     /**
	 * 	Update DderefProcDtGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDderefProcDtGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dderefProcDtGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DderefProcDtGroup with another Field
	 *	@param value
	 */
   public void setDderefProcDtGroup(Field source) {
   	replace(source,0,source.length(),dderefProcDtGroup.begin,dderefProcDtGroup.length());
   }  
   
     /**
	 * 	Update DderefProcDtGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDderefProcDtGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dderefProcDtGroup.begin,dderefProcDtGroup.length());
   }
   
     /**
	 * 	Update DderefProcDtGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDderefProcDtGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dderefProcDtGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dderefProcTmGroup
	 *	@return dderefProcTmGroup
	 */   
	 public DderefProcTmGroup getDderefProcTmGroup() {
   	return dderefProcTmGroup;
   }
   /**
	* 	Update DderefProcTmGroup with the passed value
	*   Corresponding COBOL Variable is DDEREF-PROC-TM-GROUP
	*	@param value
	*/
   public void setDderefProcTmGroup(char[] value) {
      dderefProcTmGroup.setString(value); 
   }   
    
     /**
	 * 	Update DderefProcTmGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDderefProcTmGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dderefProcTmGroup.begin,dderefProcTmGroup.length());
   }
   
     /**
	 * 	Update DderefProcTmGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDderefProcTmGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dderefProcTmGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DderefProcTmGroup with another Field
	 *	@param value
	 */
   public void setDderefProcTmGroup(Field source) {
   	replace(source,0,source.length(),dderefProcTmGroup.begin,dderefProcTmGroup.length());
   }  
   
     /**
	 * 	Update DderefProcTmGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDderefProcTmGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dderefProcTmGroup.begin,dderefProcTmGroup.length());
   }
   
     /**
	 * 	Update DderefProcTmGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDderefProcTmGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dderefProcTmGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dderefIcnSufxVersNbr
	 *	@return dderefIcnSufxVersNbr
	 */
	public short getDderefIcnSufxVersNbr() throws CFException {
        if (isDderefIcnSufxVersNbrModified()) { 
           dderefIcnSufxVersNbr = refreshDderefIcnSufxVersNbr();
        }
   		return dderefIcnSufxVersNbr;
	}
	
	/**
	 * 	Update DderefIcnSufxVersNbr with the passed value
	 *  Corresponding COBOL Variable is DDEREF-ICN-SUFX-VERS-NBR
	 *	@param number
	 */
	public void setDderefIcnSufxVersNbr(short number) {
	     // Truncate if the number is beyond +/- Max range
	    dderefIcnSufxVersNbr = checkDderefIcnSufxVersNbrMaxLimit(number); 
		serializeDderefIcnSufxVersNbr(dderefIcnSufxVersNbr);
	}

	public void setDderefIcnSufxVersNbr(int number) {
	    number = checkDderefIcnSufxVersNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDderefIcnSufxVersNbr((short)number);
	}
	public void setDderefIcnSufxVersNbr(long number) {
	    number = checkDderefIcnSufxVersNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDderefIcnSufxVersNbr((short)number);
	}
	

	/**
	 *	Returns the value of dderefLnIdGroup
	 *	@return dderefLnIdGroup
	 */   
	 public DderefLnIdGroup getDderefLnIdGroup() {
   	return dderefLnIdGroup;
   }
   /**
	* 	Update DderefLnIdGroup with the passed value
	*   Corresponding COBOL Variable is DDEREF-LN-ID-GROUP
	*	@param value
	*/
   public void setDderefLnIdGroup(char[] value) {
      dderefLnIdGroup.setString(value); 
   }   
    
     /**
	 * 	Update DderefLnIdGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDderefLnIdGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dderefLnIdGroup.begin,dderefLnIdGroup.length());
   }
   
     /**
	 * 	Update DderefLnIdGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDderefLnIdGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dderefLnIdGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DderefLnIdGroup with another Field
	 *	@param value
	 */
   public void setDderefLnIdGroup(Field source) {
   	replace(source,0,source.length(),dderefLnIdGroup.begin,dderefLnIdGroup.length());
   }  
   
     /**
	 * 	Update DderefLnIdGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDderefLnIdGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dderefLnIdGroup.begin,dderefLnIdGroup.length());
   }
   
     /**
	 * 	Update DderefLnIdGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDderefLnIdGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dderefLnIdGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dderefDepnNbrGroup
	 *	@return dderefDepnNbrGroup
	 */   
	 public DderefDepnNbrGroup getDderefDepnNbrGroup() {
   	return dderefDepnNbrGroup;
   }
   /**
	* 	Update DderefDepnNbrGroup with the passed value
	*   Corresponding COBOL Variable is DDEREF-DEPN-NBR-GROUP
	*	@param value
	*/
   public void setDderefDepnNbrGroup(char[] value) {
      dderefDepnNbrGroup.setString(value); 
   }   
    
     /**
	 * 	Update DderefDepnNbrGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDderefDepnNbrGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dderefDepnNbrGroup.begin,dderefDepnNbrGroup.length());
   }
   
     /**
	 * 	Update DderefDepnNbrGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDderefDepnNbrGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dderefDepnNbrGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DderefDepnNbrGroup with another Field
	 *	@param value
	 */
   public void setDderefDepnNbrGroup(Field source) {
   	replace(source,0,source.length(),dderefDepnNbrGroup.begin,dderefDepnNbrGroup.length());
   }  
   
     /**
	 * 	Update DderefDepnNbrGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDderefDepnNbrGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dderefDepnNbrGroup.begin,dderefDepnNbrGroup.length());
   }
   
     /**
	 * 	Update DderefDepnNbrGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDderefDepnNbrGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dderefDepnNbrGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dderefEeIdGroup
	 *	@return dderefEeIdGroup
	 */   
	 public DderefEeIdGroup getDderefEeIdGroup() {
   	return dderefEeIdGroup;
   }
   /**
	* 	Update DderefEeIdGroup with the passed value
	*   Corresponding COBOL Variable is DDEREF-EE-ID-GROUP
	*	@param value
	*/
   public void setDderefEeIdGroup(char[] value) {
      dderefEeIdGroup.setString(value); 
   }   
    
     /**
	 * 	Update DderefEeIdGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDderefEeIdGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dderefEeIdGroup.begin,dderefEeIdGroup.length());
   }
   
     /**
	 * 	Update DderefEeIdGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDderefEeIdGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dderefEeIdGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DderefEeIdGroup with another Field
	 *	@param value
	 */
   public void setDderefEeIdGroup(Field source) {
   	replace(source,0,source.length(),dderefEeIdGroup.begin,dderefEeIdGroup.length());
   }  
   
     /**
	 * 	Update DderefEeIdGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDderefEeIdGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dderefEeIdGroup.begin,dderefEeIdGroup.length());
   }
   
     /**
	 * 	Update DderefEeIdGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDderefEeIdGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dderefEeIdGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dderefPgmIdLstCharValGroup
	 *	@return dderefPgmIdLstCharValGroup
	 */   
	 public DderefPgmIdLstCharValGroup getDderefPgmIdLstCharValGroup() {
   	return dderefPgmIdLstCharValGroup;
   }
   /**
	* 	Update DderefPgmIdLstCharValGroup with the passed value
	*   Corresponding COBOL Variable is DDEREF-PGM-ID-LST-CHAR-VAL-GROUP
	*	@param value
	*/
   public void setDderefPgmIdLstCharValGroup(char[] value) {
      dderefPgmIdLstCharValGroup.setString(value); 
   }   
    
     /**
	 * 	Update DderefPgmIdLstCharValGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDderefPgmIdLstCharValGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dderefPgmIdLstCharValGroup.begin,dderefPgmIdLstCharValGroup.length());
   }
   
     /**
	 * 	Update DderefPgmIdLstCharValGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDderefPgmIdLstCharValGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dderefPgmIdLstCharValGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DderefPgmIdLstCharValGroup with another Field
	 *	@param value
	 */
   public void setDderefPgmIdLstCharValGroup(Field source) {
   	replace(source,0,source.length(),dderefPgmIdLstCharValGroup.begin,dderefPgmIdLstCharValGroup.length());
   }  
   
     /**
	 * 	Update DderefPgmIdLstCharValGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDderefPgmIdLstCharValGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dderefPgmIdLstCharValGroup.begin,dderefPgmIdLstCharValGroup.length());
   }
   
     /**
	 * 	Update DderefPgmIdLstCharValGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDderefPgmIdLstCharValGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dderefPgmIdLstCharValGroup.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dderefPolNbrGroup
	 *	@return dderefPolNbrGroup
	 */   
	 public DderefPolNbrGroup getDderefPolNbrGroup() {
   	return dderefPolNbrGroup;
   }
   /**
	* 	Update DderefPolNbrGroup with the passed value
	*   Corresponding COBOL Variable is DDEREF-POL-NBR-GROUP
	*	@param value
	*/
   public void setDderefPolNbrGroup(char[] value) {
      dderefPolNbrGroup.setString(value); 
   }   
    
     /**
	 * 	Update DderefPolNbrGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDderefPolNbrGroup(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dderefPolNbrGroup.begin,dderefPolNbrGroup.length());
   }
   
     /**
	 * 	Update DderefPolNbrGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDderefPolNbrGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dderefPolNbrGroup.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DderefPolNbrGroup with another Field
	 *	@param value
	 */
   public void setDderefPolNbrGroup(Field source) {
   	replace(source,0,source.length(),dderefPolNbrGroup.begin,dderefPolNbrGroup.length());
   }  
   
     /**
	 * 	Update DderefPolNbrGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDderefPolNbrGroup(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dderefPolNbrGroup.begin,dderefPolNbrGroup.length());
   }
   
     /**
	 * 	Update DderefPolNbrGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDderefPolNbrGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dderefPolNbrGroup.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDcladjdClmhstDenormRefFieldLength() {
			return DCLADJD_CLMHST_DENORM_REF_LENGTH;
		}

}
  
