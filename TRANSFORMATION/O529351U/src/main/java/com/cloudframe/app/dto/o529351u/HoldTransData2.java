package com.cloudframe.app.dto.o529351u;

/**
*  The class HoldTransData2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HoldTransData2 extends HoldTransData2Serialized { 
   

						private char[] fcndPs = new char[2];

						private char[] fcndSvc = new char[6];

						private char[] fcndCauseCd = new char[1];

						private char[] frtoPs = new char[2];

						private char[] frtoSvc = new char[6];

						private char[] frtoCauseCd = new char[1];

						private char[] ptypPs = new char[2];

						private char[] ptypSvc = new char[6];

						private char[] ptypCauseCd = new char[1];

						private char[] ricdPs = new char[2];

						private char[] ricdSvc = new char[6];

						private char[] ricdCauseCd = new char[1];

						private char[] causPs = new char[2];

						private char[] causSvc = new char[6];

						private char[] causCauseCd = new char[1];

						private char[] ripaPs = new char[2];

						private char[] ripaSvc = new char[6];

						private char[] ripaCauseCd = new char[1];

						private char[] cflgPs = new char[2];

						private char[] cflgSvc = new char[6];

						private char[] cflgCauseCd = new char[1];
	
	/**
	* Constructor for HoldTransData2
	**/
    public HoldTransData2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HoldTransData2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HoldTransData2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setFcndPs(fillSpace(2));
								setFcndSvc(fillSpace(6));
								setFcndCauseCd(fillSpace(1));
								setFrtoPs(fillSpace(2));
								setFrtoSvc(fillSpace(6));
								setFrtoCauseCd(fillSpace(1));
								setPtypPs(fillSpace(2));
								setPtypSvc(fillSpace(6));
								setPtypCauseCd(fillSpace(1));
								setRicdPs(fillSpace(2));
								setRicdSvc(fillSpace(6));
								setRicdCauseCd(fillSpace(1));
								setCausPs(fillSpace(2));
								setCausSvc(fillSpace(6));
								setCausCauseCd(fillSpace(1));
								setRipaPs(fillSpace(2));
								setRipaSvc(fillSpace(6));
								setRipaCauseCd(fillSpace(1));
								setCflgPs(fillSpace(2));
								setCflgSvc(fillSpace(6));
								setCflgCauseCd(fillSpace(1));
    } 

	/**
	 *	Returns the value of fcndPs
	 *	@return fcndPs
	 */
   public char[] getFcndPs() throws CFException{
     if (isFcndPsModified()) { 
        fcndPs = refreshFcndPs();
     }
   		return fcndPs;
   }

  
	/**
	*  set variable fcndPs
	*  Corresponding COBOL Variable is WS-FCND-PS
	*  @param value
	**/
   public void setFcndPs(char[] value) {
      fcndPs = checkFcndPsConstraints(value);
      serializeFcndPs(fcndPs);
   } 

     /**
	 * 	Update FcndPs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFcndPs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFcndPs,fcndPs.length);
   	
   }
   
   public void setFcndPs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFcndPs,fcndPs.length);
   	
   }
   
     /**
	 * 	Update FcndPs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFcndPs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndPs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FcndPs with another Field
	 *	@param value
	 */
   public void setFcndPs(Field source) {
       replace(source,0,source.length(),beginFcndPs,FCND_PS_LEN);
   	
   }  
   
     /**
	 * 	Update FcndPs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFcndPs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFcndPs,FCND_PS_LEN);
   	
   }
   
     /**
	 * 	Update FcndPs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFcndPs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndPs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fcndSvc
	 *	@return fcndSvc
	 */
   public char[] getFcndSvc() throws CFException{
     if (isFcndSvcModified()) { 
        fcndSvc = refreshFcndSvc();
     }
   		return fcndSvc;
   }

  
	/**
	*  set variable fcndSvc
	*  Corresponding COBOL Variable is WS-FCND-SVC
	*  @param value
	**/
   public void setFcndSvc(char[] value) {
      fcndSvc = checkFcndSvcConstraints(value);
      serializeFcndSvc(fcndSvc);
   } 

     /**
	 * 	Update FcndSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFcndSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFcndSvc,fcndSvc.length);
   	
   }
   
   public void setFcndSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFcndSvc,fcndSvc.length);
   	
   }
   
     /**
	 * 	Update FcndSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFcndSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FcndSvc with another Field
	 *	@param value
	 */
   public void setFcndSvc(Field source) {
       replace(source,0,source.length(),beginFcndSvc,FCND_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update FcndSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFcndSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFcndSvc,FCND_SVC_LEN);
   	
   }
   
     /**
	 * 	Update FcndSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFcndSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fcndCauseCd
	 *	@return fcndCauseCd
	 */
   public char[] getFcndCauseCd() throws CFException{
     if (isFcndCauseCdModified()) { 
        fcndCauseCd = refreshFcndCauseCd();
     }
   		return fcndCauseCd;
   }

  
	/**
	*  set variable fcndCauseCd
	*  Corresponding COBOL Variable is WS-FCND-CAUSE-CD
	*  @param value
	**/
   public void setFcndCauseCd(char[] value) {
      fcndCauseCd = checkFcndCauseCdConstraints(value);
      serializeFcndCauseCd(fcndCauseCd);
   } 

     /**
	 * 	Update FcndCauseCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFcndCauseCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFcndCauseCd,fcndCauseCd.length);
   	
   }
   
   public void setFcndCauseCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFcndCauseCd,fcndCauseCd.length);
   	
   }
   
     /**
	 * 	Update FcndCauseCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFcndCauseCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndCauseCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FcndCauseCd with another Field
	 *	@param value
	 */
   public void setFcndCauseCd(Field source) {
       replace(source,0,source.length(),beginFcndCauseCd,FCND_CAUSE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FcndCauseCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFcndCauseCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFcndCauseCd,FCND_CAUSE_CD_LEN);
   	
   }
   
     /**
	 * 	Update FcndCauseCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFcndCauseCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndCauseCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of frtoPs
	 *	@return frtoPs
	 */
   public char[] getFrtoPs() throws CFException{
     if (isFrtoPsModified()) { 
        frtoPs = refreshFrtoPs();
     }
   		return frtoPs;
   }

  
	/**
	*  set variable frtoPs
	*  Corresponding COBOL Variable is WS-FRTO-PS
	*  @param value
	**/
   public void setFrtoPs(char[] value) {
      frtoPs = checkFrtoPsConstraints(value);
      serializeFrtoPs(frtoPs);
   } 

     /**
	 * 	Update FrtoPs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFrtoPs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFrtoPs,frtoPs.length);
   	
   }
   
   public void setFrtoPs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoPs,frtoPs.length);
   	
   }
   
     /**
	 * 	Update FrtoPs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFrtoPs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoPs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FrtoPs with another Field
	 *	@param value
	 */
   public void setFrtoPs(Field source) {
       replace(source,0,source.length(),beginFrtoPs,FRTO_PS_LEN);
   	
   }  
   
     /**
	 * 	Update FrtoPs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFrtoPs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFrtoPs,FRTO_PS_LEN);
   	
   }
   
     /**
	 * 	Update FrtoPs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFrtoPs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoPs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of frtoSvc
	 *	@return frtoSvc
	 */
   public char[] getFrtoSvc() throws CFException{
     if (isFrtoSvcModified()) { 
        frtoSvc = refreshFrtoSvc();
     }
   		return frtoSvc;
   }

  
	/**
	*  set variable frtoSvc
	*  Corresponding COBOL Variable is WS-FRTO-SVC
	*  @param value
	**/
   public void setFrtoSvc(char[] value) {
      frtoSvc = checkFrtoSvcConstraints(value);
      serializeFrtoSvc(frtoSvc);
   } 

     /**
	 * 	Update FrtoSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFrtoSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFrtoSvc,frtoSvc.length);
   	
   }
   
   public void setFrtoSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoSvc,frtoSvc.length);
   	
   }
   
     /**
	 * 	Update FrtoSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFrtoSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FrtoSvc with another Field
	 *	@param value
	 */
   public void setFrtoSvc(Field source) {
       replace(source,0,source.length(),beginFrtoSvc,FRTO_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update FrtoSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFrtoSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFrtoSvc,FRTO_SVC_LEN);
   	
   }
   
     /**
	 * 	Update FrtoSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFrtoSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of frtoCauseCd
	 *	@return frtoCauseCd
	 */
   public char[] getFrtoCauseCd() throws CFException{
     if (isFrtoCauseCdModified()) { 
        frtoCauseCd = refreshFrtoCauseCd();
     }
   		return frtoCauseCd;
   }

  
	/**
	*  set variable frtoCauseCd
	*  Corresponding COBOL Variable is WS-FRTO-CAUSE-CD
	*  @param value
	**/
   public void setFrtoCauseCd(char[] value) {
      frtoCauseCd = checkFrtoCauseCdConstraints(value);
      serializeFrtoCauseCd(frtoCauseCd);
   } 

     /**
	 * 	Update FrtoCauseCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFrtoCauseCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFrtoCauseCd,frtoCauseCd.length);
   	
   }
   
   public void setFrtoCauseCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoCauseCd,frtoCauseCd.length);
   	
   }
   
     /**
	 * 	Update FrtoCauseCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFrtoCauseCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoCauseCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FrtoCauseCd with another Field
	 *	@param value
	 */
   public void setFrtoCauseCd(Field source) {
       replace(source,0,source.length(),beginFrtoCauseCd,FRTO_CAUSE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FrtoCauseCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFrtoCauseCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFrtoCauseCd,FRTO_CAUSE_CD_LEN);
   	
   }
   
     /**
	 * 	Update FrtoCauseCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFrtoCauseCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoCauseCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptypPs
	 *	@return ptypPs
	 */
   public char[] getPtypPs() throws CFException{
     if (isPtypPsModified()) { 
        ptypPs = refreshPtypPs();
     }
   		return ptypPs;
   }

  
	/**
	*  set variable ptypPs
	*  Corresponding COBOL Variable is WS-PTYP-PS
	*  @param value
	**/
   public void setPtypPs(char[] value) {
      ptypPs = checkPtypPsConstraints(value);
      serializePtypPs(ptypPs);
   } 

     /**
	 * 	Update PtypPs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtypPs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtypPs,ptypPs.length);
   	
   }
   
   public void setPtypPs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtypPs,ptypPs.length);
   	
   }
   
     /**
	 * 	Update PtypPs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtypPs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypPs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtypPs with another Field
	 *	@param value
	 */
   public void setPtypPs(Field source) {
       replace(source,0,source.length(),beginPtypPs,PTYP_PS_LEN);
   	
   }  
   
     /**
	 * 	Update PtypPs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtypPs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtypPs,PTYP_PS_LEN);
   	
   }
   
     /**
	 * 	Update PtypPs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtypPs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypPs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptypSvc
	 *	@return ptypSvc
	 */
   public char[] getPtypSvc() throws CFException{
     if (isPtypSvcModified()) { 
        ptypSvc = refreshPtypSvc();
     }
   		return ptypSvc;
   }

  
	/**
	*  set variable ptypSvc
	*  Corresponding COBOL Variable is WS-PTYP-SVC
	*  @param value
	**/
   public void setPtypSvc(char[] value) {
      ptypSvc = checkPtypSvcConstraints(value);
      serializePtypSvc(ptypSvc);
   } 

     /**
	 * 	Update PtypSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtypSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtypSvc,ptypSvc.length);
   	
   }
   
   public void setPtypSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtypSvc,ptypSvc.length);
   	
   }
   
     /**
	 * 	Update PtypSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtypSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtypSvc with another Field
	 *	@param value
	 */
   public void setPtypSvc(Field source) {
       replace(source,0,source.length(),beginPtypSvc,PTYP_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update PtypSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtypSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtypSvc,PTYP_SVC_LEN);
   	
   }
   
     /**
	 * 	Update PtypSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtypSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptypCauseCd
	 *	@return ptypCauseCd
	 */
   public char[] getPtypCauseCd() throws CFException{
     if (isPtypCauseCdModified()) { 
        ptypCauseCd = refreshPtypCauseCd();
     }
   		return ptypCauseCd;
   }

  
	/**
	*  set variable ptypCauseCd
	*  Corresponding COBOL Variable is WS-PTYP-CAUSE-CD
	*  @param value
	**/
   public void setPtypCauseCd(char[] value) {
      ptypCauseCd = checkPtypCauseCdConstraints(value);
      serializePtypCauseCd(ptypCauseCd);
   } 

     /**
	 * 	Update PtypCauseCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtypCauseCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtypCauseCd,ptypCauseCd.length);
   	
   }
   
   public void setPtypCauseCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtypCauseCd,ptypCauseCd.length);
   	
   }
   
     /**
	 * 	Update PtypCauseCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtypCauseCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypCauseCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtypCauseCd with another Field
	 *	@param value
	 */
   public void setPtypCauseCd(Field source) {
       replace(source,0,source.length(),beginPtypCauseCd,PTYP_CAUSE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update PtypCauseCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtypCauseCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtypCauseCd,PTYP_CAUSE_CD_LEN);
   	
   }
   
     /**
	 * 	Update PtypCauseCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtypCauseCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypCauseCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ricdPs
	 *	@return ricdPs
	 */
   public char[] getRicdPs() throws CFException{
     if (isRicdPsModified()) { 
        ricdPs = refreshRicdPs();
     }
   		return ricdPs;
   }

  
	/**
	*  set variable ricdPs
	*  Corresponding COBOL Variable is WS-RICD-PS
	*  @param value
	**/
   public void setRicdPs(char[] value) {
      ricdPs = checkRicdPsConstraints(value);
      serializeRicdPs(ricdPs);
   } 

     /**
	 * 	Update RicdPs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRicdPs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRicdPs,ricdPs.length);
   	
   }
   
   public void setRicdPs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRicdPs,ricdPs.length);
   	
   }
   
     /**
	 * 	Update RicdPs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRicdPs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdPs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RicdPs with another Field
	 *	@param value
	 */
   public void setRicdPs(Field source) {
       replace(source,0,source.length(),beginRicdPs,RICD_PS_LEN);
   	
   }  
   
     /**
	 * 	Update RicdPs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRicdPs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRicdPs,RICD_PS_LEN);
   	
   }
   
     /**
	 * 	Update RicdPs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRicdPs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdPs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ricdSvc
	 *	@return ricdSvc
	 */
   public char[] getRicdSvc() throws CFException{
     if (isRicdSvcModified()) { 
        ricdSvc = refreshRicdSvc();
     }
   		return ricdSvc;
   }

  
	/**
	*  set variable ricdSvc
	*  Corresponding COBOL Variable is WS-RICD-SVC
	*  @param value
	**/
   public void setRicdSvc(char[] value) {
      ricdSvc = checkRicdSvcConstraints(value);
      serializeRicdSvc(ricdSvc);
   } 

     /**
	 * 	Update RicdSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRicdSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRicdSvc,ricdSvc.length);
   	
   }
   
   public void setRicdSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRicdSvc,ricdSvc.length);
   	
   }
   
     /**
	 * 	Update RicdSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRicdSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RicdSvc with another Field
	 *	@param value
	 */
   public void setRicdSvc(Field source) {
       replace(source,0,source.length(),beginRicdSvc,RICD_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update RicdSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRicdSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRicdSvc,RICD_SVC_LEN);
   	
   }
   
     /**
	 * 	Update RicdSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRicdSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ricdCauseCd
	 *	@return ricdCauseCd
	 */
   public char[] getRicdCauseCd() throws CFException{
     if (isRicdCauseCdModified()) { 
        ricdCauseCd = refreshRicdCauseCd();
     }
   		return ricdCauseCd;
   }

  
	/**
	*  set variable ricdCauseCd
	*  Corresponding COBOL Variable is WS-RICD-CAUSE-CD
	*  @param value
	**/
   public void setRicdCauseCd(char[] value) {
      ricdCauseCd = checkRicdCauseCdConstraints(value);
      serializeRicdCauseCd(ricdCauseCd);
   } 

     /**
	 * 	Update RicdCauseCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRicdCauseCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRicdCauseCd,ricdCauseCd.length);
   	
   }
   
   public void setRicdCauseCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRicdCauseCd,ricdCauseCd.length);
   	
   }
   
     /**
	 * 	Update RicdCauseCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRicdCauseCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdCauseCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RicdCauseCd with another Field
	 *	@param value
	 */
   public void setRicdCauseCd(Field source) {
       replace(source,0,source.length(),beginRicdCauseCd,RICD_CAUSE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update RicdCauseCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRicdCauseCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRicdCauseCd,RICD_CAUSE_CD_LEN);
   	
   }
   
     /**
	 * 	Update RicdCauseCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRicdCauseCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdCauseCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causPs
	 *	@return causPs
	 */
   public char[] getCausPs() throws CFException{
     if (isCausPsModified()) { 
        causPs = refreshCausPs();
     }
   		return causPs;
   }

  
	/**
	*  set variable causPs
	*  Corresponding COBOL Variable is WS-CAUS-PS
	*  @param value
	**/
   public void setCausPs(char[] value) {
      causPs = checkCausPsConstraints(value);
      serializeCausPs(causPs);
   } 

     /**
	 * 	Update CausPs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausPs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausPs,causPs.length);
   	
   }
   
   public void setCausPs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausPs,causPs.length);
   	
   }
   
     /**
	 * 	Update CausPs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausPs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausPs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausPs with another Field
	 *	@param value
	 */
   public void setCausPs(Field source) {
       replace(source,0,source.length(),beginCausPs,CAUS_PS_LEN);
   	
   }  
   
     /**
	 * 	Update CausPs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausPs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausPs,CAUS_PS_LEN);
   	
   }
   
     /**
	 * 	Update CausPs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausPs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausPs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causSvc
	 *	@return causSvc
	 */
   public char[] getCausSvc() throws CFException{
     if (isCausSvcModified()) { 
        causSvc = refreshCausSvc();
     }
   		return causSvc;
   }

  
	/**
	*  set variable causSvc
	*  Corresponding COBOL Variable is WS-CAUS-SVC
	*  @param value
	**/
   public void setCausSvc(char[] value) {
      causSvc = checkCausSvcConstraints(value);
      serializeCausSvc(causSvc);
   } 

     /**
	 * 	Update CausSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausSvc,causSvc.length);
   	
   }
   
   public void setCausSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausSvc,causSvc.length);
   	
   }
   
     /**
	 * 	Update CausSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausSvc with another Field
	 *	@param value
	 */
   public void setCausSvc(Field source) {
       replace(source,0,source.length(),beginCausSvc,CAUS_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update CausSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausSvc,CAUS_SVC_LEN);
   	
   }
   
     /**
	 * 	Update CausSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causCauseCd
	 *	@return causCauseCd
	 */
   public char[] getCausCauseCd() throws CFException{
     if (isCausCauseCdModified()) { 
        causCauseCd = refreshCausCauseCd();
     }
   		return causCauseCd;
   }

  
	/**
	*  set variable causCauseCd
	*  Corresponding COBOL Variable is WS-CAUS-CAUSE-CD
	*  @param value
	**/
   public void setCausCauseCd(char[] value) {
      causCauseCd = checkCausCauseCdConstraints(value);
      serializeCausCauseCd(causCauseCd);
   } 

     /**
	 * 	Update CausCauseCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausCauseCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausCauseCd,causCauseCd.length);
   	
   }
   
   public void setCausCauseCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausCauseCd,causCauseCd.length);
   	
   }
   
     /**
	 * 	Update CausCauseCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausCauseCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausCauseCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausCauseCd with another Field
	 *	@param value
	 */
   public void setCausCauseCd(Field source) {
       replace(source,0,source.length(),beginCausCauseCd,CAUS_CAUSE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CausCauseCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausCauseCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausCauseCd,CAUS_CAUSE_CD_LEN);
   	
   }
   
     /**
	 * 	Update CausCauseCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausCauseCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausCauseCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ripaPs
	 *	@return ripaPs
	 */
   public char[] getRipaPs() throws CFException{
     if (isRipaPsModified()) { 
        ripaPs = refreshRipaPs();
     }
   		return ripaPs;
   }

  
	/**
	*  set variable ripaPs
	*  Corresponding COBOL Variable is WS-RIPA-PS
	*  @param value
	**/
   public void setRipaPs(char[] value) {
      ripaPs = checkRipaPsConstraints(value);
      serializeRipaPs(ripaPs);
   } 

     /**
	 * 	Update RipaPs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRipaPs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRipaPs,ripaPs.length);
   	
   }
   
   public void setRipaPs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRipaPs,ripaPs.length);
   	
   }
   
     /**
	 * 	Update RipaPs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRipaPs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaPs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RipaPs with another Field
	 *	@param value
	 */
   public void setRipaPs(Field source) {
       replace(source,0,source.length(),beginRipaPs,RIPA_PS_LEN);
   	
   }  
   
     /**
	 * 	Update RipaPs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRipaPs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRipaPs,RIPA_PS_LEN);
   	
   }
   
     /**
	 * 	Update RipaPs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRipaPs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaPs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ripaSvc
	 *	@return ripaSvc
	 */
   public char[] getRipaSvc() throws CFException{
     if (isRipaSvcModified()) { 
        ripaSvc = refreshRipaSvc();
     }
   		return ripaSvc;
   }

  
	/**
	*  set variable ripaSvc
	*  Corresponding COBOL Variable is WS-RIPA-SVC
	*  @param value
	**/
   public void setRipaSvc(char[] value) {
      ripaSvc = checkRipaSvcConstraints(value);
      serializeRipaSvc(ripaSvc);
   } 

     /**
	 * 	Update RipaSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRipaSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRipaSvc,ripaSvc.length);
   	
   }
   
   public void setRipaSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRipaSvc,ripaSvc.length);
   	
   }
   
     /**
	 * 	Update RipaSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRipaSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RipaSvc with another Field
	 *	@param value
	 */
   public void setRipaSvc(Field source) {
       replace(source,0,source.length(),beginRipaSvc,RIPA_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update RipaSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRipaSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRipaSvc,RIPA_SVC_LEN);
   	
   }
   
     /**
	 * 	Update RipaSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRipaSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ripaCauseCd
	 *	@return ripaCauseCd
	 */
   public char[] getRipaCauseCd() throws CFException{
     if (isRipaCauseCdModified()) { 
        ripaCauseCd = refreshRipaCauseCd();
     }
   		return ripaCauseCd;
   }

  
	/**
	*  set variable ripaCauseCd
	*  Corresponding COBOL Variable is WS-RIPA-CAUSE-CD
	*  @param value
	**/
   public void setRipaCauseCd(char[] value) {
      ripaCauseCd = checkRipaCauseCdConstraints(value);
      serializeRipaCauseCd(ripaCauseCd);
   } 

     /**
	 * 	Update RipaCauseCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRipaCauseCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRipaCauseCd,ripaCauseCd.length);
   	
   }
   
   public void setRipaCauseCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRipaCauseCd,ripaCauseCd.length);
   	
   }
   
     /**
	 * 	Update RipaCauseCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRipaCauseCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaCauseCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RipaCauseCd with another Field
	 *	@param value
	 */
   public void setRipaCauseCd(Field source) {
       replace(source,0,source.length(),beginRipaCauseCd,RIPA_CAUSE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update RipaCauseCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRipaCauseCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRipaCauseCd,RIPA_CAUSE_CD_LEN);
   	
   }
   
     /**
	 * 	Update RipaCauseCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRipaCauseCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaCauseCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cflgPs
	 *	@return cflgPs
	 */
   public char[] getCflgPs() throws CFException{
     if (isCflgPsModified()) { 
        cflgPs = refreshCflgPs();
     }
   		return cflgPs;
   }

  
	/**
	*  set variable cflgPs
	*  Corresponding COBOL Variable is WS-CFLG-PS
	*  @param value
	**/
   public void setCflgPs(char[] value) {
      cflgPs = checkCflgPsConstraints(value);
      serializeCflgPs(cflgPs);
   } 

     /**
	 * 	Update CflgPs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCflgPs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCflgPs,cflgPs.length);
   	
   }
   
   public void setCflgPs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCflgPs,cflgPs.length);
   	
   }
   
     /**
	 * 	Update CflgPs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCflgPs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCflgPs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CflgPs with another Field
	 *	@param value
	 */
   public void setCflgPs(Field source) {
       replace(source,0,source.length(),beginCflgPs,CFLG_PS_LEN);
   	
   }  
   
     /**
	 * 	Update CflgPs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCflgPs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCflgPs,CFLG_PS_LEN);
   	
   }
   
     /**
	 * 	Update CflgPs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCflgPs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCflgPs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cflgSvc
	 *	@return cflgSvc
	 */
   public char[] getCflgSvc() throws CFException{
     if (isCflgSvcModified()) { 
        cflgSvc = refreshCflgSvc();
     }
   		return cflgSvc;
   }

  
	/**
	*  set variable cflgSvc
	*  Corresponding COBOL Variable is WS-CFLG-SVC
	*  @param value
	**/
   public void setCflgSvc(char[] value) {
      cflgSvc = checkCflgSvcConstraints(value);
      serializeCflgSvc(cflgSvc);
   } 

     /**
	 * 	Update CflgSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCflgSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCflgSvc,cflgSvc.length);
   	
   }
   
   public void setCflgSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCflgSvc,cflgSvc.length);
   	
   }
   
     /**
	 * 	Update CflgSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCflgSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCflgSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CflgSvc with another Field
	 *	@param value
	 */
   public void setCflgSvc(Field source) {
       replace(source,0,source.length(),beginCflgSvc,CFLG_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update CflgSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCflgSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCflgSvc,CFLG_SVC_LEN);
   	
   }
   
     /**
	 * 	Update CflgSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCflgSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCflgSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cflgCauseCd
	 *	@return cflgCauseCd
	 */
   public char[] getCflgCauseCd() throws CFException{
     if (isCflgCauseCdModified()) { 
        cflgCauseCd = refreshCflgCauseCd();
     }
   		return cflgCauseCd;
   }

  
	/**
	*  set variable cflgCauseCd
	*  Corresponding COBOL Variable is WS-CFLG-CAUSE-CD
	*  @param value
	**/
   public void setCflgCauseCd(char[] value) {
      cflgCauseCd = checkCflgCauseCdConstraints(value);
      serializeCflgCauseCd(cflgCauseCd);
   } 

     /**
	 * 	Update CflgCauseCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCflgCauseCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCflgCauseCd,cflgCauseCd.length);
   	
   }
   
   public void setCflgCauseCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCflgCauseCd,cflgCauseCd.length);
   	
   }
   
     /**
	 * 	Update CflgCauseCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCflgCauseCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCflgCauseCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CflgCauseCd with another Field
	 *	@param value
	 */
   public void setCflgCauseCd(Field source) {
       replace(source,0,source.length(),beginCflgCauseCd,CFLG_CAUSE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CflgCauseCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCflgCauseCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCflgCauseCd,CFLG_CAUSE_CD_LEN);
   	
   }
   
     /**
	 * 	Update CflgCauseCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCflgCauseCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCflgCauseCd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHoldTransData2FieldLength() {
			return HOLD_TRANS_DATA_2_LENGTH;
		}

}
  
