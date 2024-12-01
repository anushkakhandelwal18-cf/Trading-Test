package com.cloudframe.app.dto.o529351u;

/**
*  The class HoldTransData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HoldTransData extends HoldTransDataSerialized { 
   

						private char[] holdPs = new char[2];

						private char[] holdSvc = new char[6];

						private char[] holdCauseCd = new char[1];

						private char[] holdSpiTblId = new char[7];

						private char[] hold1SpiTblId = new char[7];

						private char[] holdPosTierCd = new char[1];

						private char[] holdDiagElgInd = new char[1];
	
	/**
	* Constructor for HoldTransData
	**/
    public HoldTransData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HoldTransData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HoldTransData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHoldPs(fillSpace(2));
								setHoldSvc(fillSpace(6));
								setHoldCauseCd(fillSpace(1));
								setHoldSpiTblId(fillSpace(7));
								setHold1SpiTblId(fillSpace(7));
								setHoldPosTierCd(fillSpace(1));
								setHoldDiagElgInd(fillSpace(1));
    } 

	/**
	 *	Returns the value of holdPs
	 *	@return holdPs
	 */
   public char[] getHoldPs() throws CFException{
     if (isHoldPsModified()) { 
        holdPs = refreshHoldPs();
     }
   		return holdPs;
   }

  
	/**
	*  set variable holdPs
	*  Corresponding COBOL Variable is WS-HOLD-PS
	*  @param value
	**/
   public void setHoldPs(char[] value) {
      holdPs = checkHoldPsConstraints(value);
      serializeHoldPs(holdPs);
   } 

     /**
	 * 	Update HoldPs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHoldPs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHoldPs,holdPs.length);
   	
   }
   
   public void setHoldPs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHoldPs,holdPs.length);
   	
   }
   
     /**
	 * 	Update HoldPs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHoldPs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHoldPs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HoldPs with another Field
	 *	@param value
	 */
   public void setHoldPs(Field source) {
       replace(source,0,source.length(),beginHoldPs,HOLD_PS_LEN);
   	
   }  
   
     /**
	 * 	Update HoldPs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHoldPs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHoldPs,HOLD_PS_LEN);
   	
   }
   
     /**
	 * 	Update HoldPs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHoldPs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHoldPs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of holdSvc
	 *	@return holdSvc
	 */
   public char[] getHoldSvc() throws CFException{
     if (isHoldSvcModified()) { 
        holdSvc = refreshHoldSvc();
     }
   		return holdSvc;
   }

  
	/**
	*  set variable holdSvc
	*  Corresponding COBOL Variable is WS-HOLD-SVC
	*  @param value
	**/
   public void setHoldSvc(char[] value) {
      holdSvc = checkHoldSvcConstraints(value);
      serializeHoldSvc(holdSvc);
   } 

     /**
	 * 	Update HoldSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHoldSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHoldSvc,holdSvc.length);
   	
   }
   
   public void setHoldSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHoldSvc,holdSvc.length);
   	
   }
   
     /**
	 * 	Update HoldSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHoldSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHoldSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HoldSvc with another Field
	 *	@param value
	 */
   public void setHoldSvc(Field source) {
       replace(source,0,source.length(),beginHoldSvc,HOLD_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update HoldSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHoldSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHoldSvc,HOLD_SVC_LEN);
   	
   }
   
     /**
	 * 	Update HoldSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHoldSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHoldSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of holdCauseCd
	 *	@return holdCauseCd
	 */
   public char[] getHoldCauseCd() throws CFException{
     if (isHoldCauseCdModified()) { 
        holdCauseCd = refreshHoldCauseCd();
     }
   		return holdCauseCd;
   }

  
	/**
	*  set variable holdCauseCd
	*  Corresponding COBOL Variable is WS-HOLD-CAUSE-CD
	*  @param value
	**/
   public void setHoldCauseCd(char[] value) {
      holdCauseCd = checkHoldCauseCdConstraints(value);
      serializeHoldCauseCd(holdCauseCd);
   } 

     /**
	 * 	Update HoldCauseCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHoldCauseCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHoldCauseCd,holdCauseCd.length);
   	
   }
   
   public void setHoldCauseCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHoldCauseCd,holdCauseCd.length);
   	
   }
   
     /**
	 * 	Update HoldCauseCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHoldCauseCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHoldCauseCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HoldCauseCd with another Field
	 *	@param value
	 */
   public void setHoldCauseCd(Field source) {
       replace(source,0,source.length(),beginHoldCauseCd,HOLD_CAUSE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update HoldCauseCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHoldCauseCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHoldCauseCd,HOLD_CAUSE_CD_LEN);
   	
   }
   
     /**
	 * 	Update HoldCauseCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHoldCauseCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHoldCauseCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of holdSpiTblId
	 *	@return holdSpiTblId
	 */
   public char[] getHoldSpiTblId() throws CFException{
     if (isHoldSpiTblIdModified()) { 
        holdSpiTblId = refreshHoldSpiTblId();
     }
   		return holdSpiTblId;
   }

  
	/**
	*  set variable holdSpiTblId
	*  Corresponding COBOL Variable is WS-HOLD-SPI-TBL-ID
	*  @param value
	**/
   public void setHoldSpiTblId(char[] value) {
      holdSpiTblId = checkHoldSpiTblIdConstraints(value);
      serializeHoldSpiTblId(holdSpiTblId);
   } 

     /**
	 * 	Update HoldSpiTblId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHoldSpiTblId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHoldSpiTblId,holdSpiTblId.length);
   	
   }
   
   public void setHoldSpiTblId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHoldSpiTblId,holdSpiTblId.length);
   	
   }
   
     /**
	 * 	Update HoldSpiTblId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHoldSpiTblId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHoldSpiTblId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HoldSpiTblId with another Field
	 *	@param value
	 */
   public void setHoldSpiTblId(Field source) {
       replace(source,0,source.length(),beginHoldSpiTblId,HOLD_SPI_TBL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update HoldSpiTblId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHoldSpiTblId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHoldSpiTblId,HOLD_SPI_TBL_ID_LEN);
   	
   }
   
     /**
	 * 	Update HoldSpiTblId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHoldSpiTblId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHoldSpiTblId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hold1SpiTblId
	 *	@return hold1SpiTblId
	 */
   public char[] getHold1SpiTblId() throws CFException{
     if (isHold1SpiTblIdModified()) { 
        hold1SpiTblId = refreshHold1SpiTblId();
     }
   		return hold1SpiTblId;
   }

  
	/**
	*  set variable hold1SpiTblId
	*  Corresponding COBOL Variable is WS-HOLD1-SPI-TBL-ID
	*  @param value
	**/
   public void setHold1SpiTblId(char[] value) {
      hold1SpiTblId = checkHold1SpiTblIdConstraints(value);
      serializeHold1SpiTblId(hold1SpiTblId);
   } 

     /**
	 * 	Update Hold1SpiTblId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHold1SpiTblId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHold1SpiTblId,hold1SpiTblId.length);
   	
   }
   
   public void setHold1SpiTblId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHold1SpiTblId,hold1SpiTblId.length);
   	
   }
   
     /**
	 * 	Update Hold1SpiTblId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHold1SpiTblId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHold1SpiTblId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hold1SpiTblId with another Field
	 *	@param value
	 */
   public void setHold1SpiTblId(Field source) {
       replace(source,0,source.length(),beginHold1SpiTblId,HOLD_1_SPI_TBL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Hold1SpiTblId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHold1SpiTblId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHold1SpiTblId,HOLD_1_SPI_TBL_ID_LEN);
   	
   }
   
     /**
	 * 	Update Hold1SpiTblId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHold1SpiTblId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHold1SpiTblId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of holdPosTierCd
	 *	@return holdPosTierCd
	 */
   public char[] getHoldPosTierCd() throws CFException{
     if (isHoldPosTierCdModified()) { 
        holdPosTierCd = refreshHoldPosTierCd();
     }
   		return holdPosTierCd;
   }

  
	/**
	*  set variable holdPosTierCd
	*  Corresponding COBOL Variable is WS-HOLD-POS-TIER-CD
	*  @param value
	**/
   public void setHoldPosTierCd(char[] value) {
      holdPosTierCd = checkHoldPosTierCdConstraints(value);
      serializeHoldPosTierCd(holdPosTierCd);
   } 

     /**
	 * 	Update HoldPosTierCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHoldPosTierCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHoldPosTierCd,holdPosTierCd.length);
   	
   }
   
   public void setHoldPosTierCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHoldPosTierCd,holdPosTierCd.length);
   	
   }
   
     /**
	 * 	Update HoldPosTierCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHoldPosTierCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHoldPosTierCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HoldPosTierCd with another Field
	 *	@param value
	 */
   public void setHoldPosTierCd(Field source) {
       replace(source,0,source.length(),beginHoldPosTierCd,HOLD_POS_TIER_CD_LEN);
   	
   }  
   
     /**
	 * 	Update HoldPosTierCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHoldPosTierCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHoldPosTierCd,HOLD_POS_TIER_CD_LEN);
   	
   }
   
     /**
	 * 	Update HoldPosTierCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHoldPosTierCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHoldPosTierCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of holdDiagElgInd
	 *	@return holdDiagElgInd
	 */
   public char[] getHoldDiagElgInd() throws CFException{
     if (isHoldDiagElgIndModified()) { 
        holdDiagElgInd = refreshHoldDiagElgInd();
     }
   		return holdDiagElgInd;
   }

  
	/**
	*  set variable holdDiagElgInd
	*  Corresponding COBOL Variable is WS-HOLD-DIAG-ELG-IND
	*  @param value
	**/
   public void setHoldDiagElgInd(char[] value) {
      holdDiagElgInd = checkHoldDiagElgIndConstraints(value);
      serializeHoldDiagElgInd(holdDiagElgInd);
   } 

     /**
	 * 	Update HoldDiagElgInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHoldDiagElgInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHoldDiagElgInd,holdDiagElgInd.length);
   	
   }
   
   public void setHoldDiagElgInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHoldDiagElgInd,holdDiagElgInd.length);
   	
   }
   
     /**
	 * 	Update HoldDiagElgInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHoldDiagElgInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHoldDiagElgInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HoldDiagElgInd with another Field
	 *	@param value
	 */
   public void setHoldDiagElgInd(Field source) {
       replace(source,0,source.length(),beginHoldDiagElgInd,HOLD_DIAG_ELG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update HoldDiagElgInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHoldDiagElgInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHoldDiagElgInd,HOLD_DIAG_ELG_IND_LEN);
   	
   }
   
     /**
	 * 	Update HoldDiagElgInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHoldDiagElgInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHoldDiagElgInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHoldTransDataFieldLength() {
			return HOLD_TRANS_DATA_LENGTH;
		}

}
  
