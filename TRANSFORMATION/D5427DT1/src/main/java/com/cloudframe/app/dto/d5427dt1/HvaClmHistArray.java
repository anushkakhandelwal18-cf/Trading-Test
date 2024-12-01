package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HvaClmHistArray is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.math.RoundingMode;


public class HvaClmHistArray extends HvaClmHistArraySerialized { 
   

								private short hvaSub;

								private short hvaSub2;
      private List<Short> hvaPartnId; 

      private List<char[]> hvaPartnVal; 

      private List<char[]> hvaProcDt; 

      private List<char[]> hvaProcTm; 

      private List<char[]> hvaPgmIdLstCharVal; 

      private List<Short> hvaIcnSufxVersNbr; 

      private List<char[]> hvaInvnCtlNbr; 

      private List<char[]> hvaIcnSufxCd; 

      private List<Short> hvaLnId; 

      private List<char[]> hvaFlnJulianDtNbr; 

      private List<char[]> hvaFlnSrlNbr; 

      private List<char[]> hvaDftNbr; 

      private List<char[]> hvaFstDt; 

      private List<char[]> hvaLstSrvcDt; 

      private List<char[]> hvaProvTinsuff; 

      private List<char[]> hvaProvScrnNbr; 

      private List<BigDecimal> hvaChrgAmt; 

      private List<char[]> hvaRmrkCd; 

      private List<BigDecimal> hvaNcAmt; 

      private List<char[]> hvaPmtSvcCd; 

      private List<char[]> hvaOvrCd; 

      private List<BigDecimal> hvaCopayAmt; 

      private List<char[]> hvaSrvcCd; 

      private List<char[]> hvaPayCd; 

      private List<char[]> hvaTransCd; 

      private List<char[]> hvaFilmOfcNbr; 

      private List<char[]> hvaClmLvlRsnCd; 

      private List<char[]> hvaAdjtrId; 

      private List<char[]> hvaMbrPrvInd; 

      private List<char[]> hvaNtfyWaivCd; 

      private List<char[]> hvaBankCd; 

      private List<char[]> hvaDivNbr; 

      private List<char[]> hvaClsNbr; 

      private List<char[]> hvaDrgNbr; 

      private List<char[]> hvaFaclOrProfCd; 

      private List<char[]> hvaDlgteInd; 

      private List<char[]> hvaNdbContrId; 

      private List<char[]> hvaClmSmbTypAppCd; 

      private List<char[]> hvaSmbStCd; 

      private List<char[]> hvaProcT1Ind; 

      private List<char[]> hvaAuthNbr; 

      private List<char[]> hvaBaseDedDescTxt; 

      private List<char[]> hvaMmDedDescTxt; 

      private List<char[]> hvaPrsCreatSrcCd; 

      private List<BigDecimal> hvaBaseDedAmt; 

      private List<BigDecimal> hvaBaseAmt; 

      private List<BigDecimal> hvaMmDedAmt; 

      private List<BigDecimal> hvaMmAmt; 

      private List<BigDecimal> hvaMcCrResAmt; 

      private List<BigDecimal> hvaCobCrResAmt; 

      private List<char[]> hvaParInd; 

      private List<BigDecimal> hvaSupAmt; 

      private List<char[]> hvaProvMktNbr; 

      private List<char[]> hvaPpoCd; 

      private List<BigDecimal> hvaPtntRespAmt; 

      private List<char[]> hvaAuthSrcId; 

      private List<char[]> hvaAuthProcCd; 

      private List<char[]> hvaProvNm; 

      private List<char[]> hvaProvEobNm; 

      private List<char[]> hvaProvPrdctCd; 

      private List<char[]> hvaProvMktTypCd; 

      private List<char[]> hvaProvIpaId; 

      private List<char[]> hvaTpsmCd; 

      private List<char[]> hvaProvSpclCd; 

      private List<char[]> hvaProvMedcdReclmInd; 

      private List<char[]> hvaRelSrvcClmLvlInd; 

      private List<char[]> hvaDiagCd; 

      private List<Integer> hvaAuthUniqCnt; 

      private List<Integer> hvaPhysMedcnMskCnt; 

      private List<Short> hvaMskNullInd; 

	
	/**
	* Constructor for HvaClmHistArray
	**/
    public HvaClmHistArray() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of hvaSub
	 *	@return hvaSub
	 */
	public short getHvaSub() throws CFException {
        if (isHvaSubModified()) { 
           hvaSub = refreshHvaSub();
        }
   		return hvaSub;
	}
	
	/**
	 * 	Update HvaSub with the passed value
	 *  Corresponding COBOL Variable is HVA-SUB
	 *	@param number
	 */
	public void setHvaSub(short number) {
	     // Truncate if the number is beyond +/- Max range
	    hvaSub = checkHvaSubMaxLimit(number); 
		serializeHvaSub(hvaSub);
	}

	public void setHvaSub(int number) {
	    number = checkHvaSubMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHvaSub((short)number);
	}
	public void setHvaSub(long number) {
	    number = checkHvaSubMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHvaSub((short)number);
	}
	

	/**
	 *	Returns the value of hvaSub2
	 *	@return hvaSub2
	 */
	public short getHvaSub2() throws CFException {
        if (isHvaSub2Modified()) { 
           hvaSub2 = refreshHvaSub2();
        }
   		return hvaSub2;
	}
	
	/**
	 * 	Update HvaSub2 with the passed value
	 *  Corresponding COBOL Variable is HVA-SUB2
	 *	@param number
	 */
	public void setHvaSub2(short number) {
	     // Truncate if the number is beyond +/- Max range
	    hvaSub2 = checkHvaSub2MaxLimit(number); 
		serializeHvaSub2(hvaSub2);
	}

	public void setHvaSub2(int number) {
	    number = checkHvaSub2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHvaSub2((short)number);
	}
	public void setHvaSub2(long number) {
	    number = checkHvaSub2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHvaSub2((short)number);
	}
	

    /**
	 *	Returns the value of hvaPartnId
	 *  Corresponding COBOL Variable is HVA-PARTN-ID
	 *	@return hvaPartnId
	 */
	public List<Short> getHvaPartnId() throws CFException {
        List<Short>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PARTN_ID_SIZE;index++) {
        	list.add( getHvaPartnId( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return hvaPartnId
	 */
	public short getHvaPartnId(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaPartnId(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PARTN_ID_SIZE) {
             	index = HVA_PARTN_ID_SIZE -1; // can't exceed max array size
             	logger.trace("hvaPartnId - Array index exceeded max Size {}, resetting it to max allowed",HVA_PARTN_ID_SIZE); 
	    }   
         return getShort(beginHvaPartnId+ index*HVA_PARTN_ID_LEN);
   }
	
	/**
	 *	Update HvaPartnId at index with the passed value
	 *  Corresponding COBOL Variable is HVA-PARTN-ID
	 *  @param index
	 *	@param number
	 */
	public void setHvaPartnId(int index,short number) {
	   truncated = false; // reset left over truncated flag
		setHvaPartnId(index,number, true);
	}
	
	public void setHvaPartnId(int index,int number) {
		setHvaPartnId(index,(short)number, true);
	}
	public void setHvaPartnId(int index,long number) {
			setHvaPartnId(index,(short)number, true);
	}
	
	/**
	 *	Update  HvaPartnId at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setHvaPartnId(int index,short value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaPartnId(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PARTN_ID_SIZE) {
             	index = HVA_PARTN_ID_SIZE -1; // can't exceed max array size
             	logger.trace("hvaPartnId - Array index exceeded max Size "+HVA_PARTN_ID_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeHvaPartnId(index,value);
		}
   }
    /**
	 *	Returns the value of hvaPartnVal
	 *  Corresponding COBOL Variable is HVA-PARTN-VAL
	 *	@return hvaPartnVal
	 */
	public List<char[]> getHvaPartnVal() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PARTN_VAL_SIZE;index++) {
        	list.add( getHvaPartnVal( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaPartnVal
	 */
	public char[] getHvaPartnVal(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaPartnVal(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PARTN_VAL_SIZE) {
             	index = HVA_PARTN_VAL_SIZE -1; // can't exceed max array size
             	logger.trace("hvaPartnVal - Array index exceeded max Size {}, resetting it to max allowed",HVA_PARTN_VAL_SIZE); 
	    }
   	      return getCharArray( (beginHvaPartnVal + index*HVA_PARTN_VAL_LEN) , HVA_PARTN_VAL_LEN );
    }
    
    
   public int  hvaPartnValFieldLength() {
   	return HVA_PARTN_VAL_LEN;
   }
   
	

  
  	/**
	 *	Update HvaPartnVal with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PARTN-VAL
	 *  @param index
	 *	@param value
	 */
  public void setHvaPartnVal(int index,char[] value) {
   	setHvaPartnVal(index,value,true);
   }
   
   
   /**
	 *	Update HvaPartnVal with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaPartnVal(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaPartnVal(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 10)  {     
		       value = substring(value,0,10);
           }  else if (value.length < 10) {
		       value = pad(10, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(10).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaPartnVal(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaProcDt
	 *  Corresponding COBOL Variable is HVA-PROC-DT
	 *	@return hvaProcDt
	 */
	public List<char[]> getHvaProcDt() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PROC_DT_SIZE;index++) {
        	list.add( getHvaProcDt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaProcDt
	 */
	public char[] getHvaProcDt(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaProcDt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PROC_DT_SIZE) {
             	index = HVA_PROC_DT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaProcDt - Array index exceeded max Size {}, resetting it to max allowed",HVA_PROC_DT_SIZE); 
	    }
   	      return getCharArray( (beginHvaProcDt + index*HVA_PROC_DT_LEN) , HVA_PROC_DT_LEN );
    }
    
    
   public int  hvaProcDtFieldLength() {
   	return HVA_PROC_DT_LEN;
   }
   
	

  
  	/**
	 *	Update HvaProcDt with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PROC-DT
	 *  @param index
	 *	@param value
	 */
  public void setHvaProcDt(int index,char[] value) {
   	setHvaProcDt(index,value,true);
   }
   
   
   /**
	 *	Update HvaProcDt with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaProcDt(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaProcDt(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 10)  {     
		       value = substring(value,0,10);
           }  else if (value.length < 10) {
		       value = pad(10, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(10).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaProcDt(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaProcTm
	 *  Corresponding COBOL Variable is HVA-PROC-TM
	 *	@return hvaProcTm
	 */
	public List<char[]> getHvaProcTm() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PROC_TM_SIZE;index++) {
        	list.add( getHvaProcTm( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaProcTm
	 */
	public char[] getHvaProcTm(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaProcTm(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PROC_TM_SIZE) {
             	index = HVA_PROC_TM_SIZE -1; // can't exceed max array size
             	logger.trace("hvaProcTm - Array index exceeded max Size {}, resetting it to max allowed",HVA_PROC_TM_SIZE); 
	    }
   	      return getCharArray( (beginHvaProcTm + index*HVA_PROC_TM_LEN) , HVA_PROC_TM_LEN );
    }
    
    
   public int  hvaProcTmFieldLength() {
   	return HVA_PROC_TM_LEN;
   }
   
	

  
  	/**
	 *	Update HvaProcTm with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PROC-TM
	 *  @param index
	 *	@param value
	 */
  public void setHvaProcTm(int index,char[] value) {
   	setHvaProcTm(index,value,true);
   }
   
   
   /**
	 *	Update HvaProcTm with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaProcTm(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaProcTm(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 8)  {     
		       value = substring(value,0,8);
           }  else if (value.length < 8) {
		       value = pad(8, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(8).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaProcTm(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaPgmIdLstCharVal
	 *  Corresponding COBOL Variable is HVA-PGM-ID-LST-CHAR-VAL
	 *	@return hvaPgmIdLstCharVal
	 */
	public List<char[]> getHvaPgmIdLstCharVal() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PGM_ID_LST_CHAR_VAL_SIZE;index++) {
        	list.add( getHvaPgmIdLstCharVal( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaPgmIdLstCharVal
	 */
	public char[] getHvaPgmIdLstCharVal(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaPgmIdLstCharVal(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PGM_ID_LST_CHAR_VAL_SIZE) {
             	index = HVA_PGM_ID_LST_CHAR_VAL_SIZE -1; // can't exceed max array size
             	logger.trace("hvaPgmIdLstCharVal - Array index exceeded max Size {}, resetting it to max allowed",HVA_PGM_ID_LST_CHAR_VAL_SIZE); 
	    }
   	      return getCharArray( (beginHvaPgmIdLstCharVal + index*HVA_PGM_ID_LST_CHAR_VAL_LEN) , HVA_PGM_ID_LST_CHAR_VAL_LEN );
    }
    
    
   public int  hvaPgmIdLstCharValFieldLength() {
   	return HVA_PGM_ID_LST_CHAR_VAL_LEN;
   }
   
	

  
  	/**
	 *	Update HvaPgmIdLstCharVal with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PGM-ID-LST-CHAR-VAL
	 *  @param index
	 *	@param value
	 */
  public void setHvaPgmIdLstCharVal(int index,char[] value) {
   	setHvaPgmIdLstCharVal(index,value,true);
   }
   
   
   /**
	 *	Update HvaPgmIdLstCharVal with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaPgmIdLstCharVal(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaPgmIdLstCharVal(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaPgmIdLstCharVal(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaIcnSufxVersNbr
	 *  Corresponding COBOL Variable is HVA-ICN-SUFX-VERS-NBR
	 *	@return hvaIcnSufxVersNbr
	 */
	public List<Short> getHvaIcnSufxVersNbr() throws CFException {
        List<Short>	list = new ArrayList<>();  
        for (int index =0;index < HVA_ICN_SUFX_VERS_NBR_SIZE;index++) {
        	list.add( getHvaIcnSufxVersNbr( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return hvaIcnSufxVersNbr
	 */
	public short getHvaIcnSufxVersNbr(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaIcnSufxVersNbr(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_ICN_SUFX_VERS_NBR_SIZE) {
             	index = HVA_ICN_SUFX_VERS_NBR_SIZE -1; // can't exceed max array size
             	logger.trace("hvaIcnSufxVersNbr - Array index exceeded max Size {}, resetting it to max allowed",HVA_ICN_SUFX_VERS_NBR_SIZE); 
	    }   
         return getShort(beginHvaIcnSufxVersNbr+ index*HVA_ICN_SUFX_VERS_NBR_LEN);
   }
	
	/**
	 *	Update HvaIcnSufxVersNbr at index with the passed value
	 *  Corresponding COBOL Variable is HVA-ICN-SUFX-VERS-NBR
	 *  @param index
	 *	@param number
	 */
	public void setHvaIcnSufxVersNbr(int index,short number) {
	   truncated = false; // reset left over truncated flag
		setHvaIcnSufxVersNbr(index,number, true);
	}
	
	public void setHvaIcnSufxVersNbr(int index,int number) {
		setHvaIcnSufxVersNbr(index,(short)number, true);
	}
	public void setHvaIcnSufxVersNbr(int index,long number) {
			setHvaIcnSufxVersNbr(index,(short)number, true);
	}
	
	/**
	 *	Update  HvaIcnSufxVersNbr at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setHvaIcnSufxVersNbr(int index,short value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaIcnSufxVersNbr(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_ICN_SUFX_VERS_NBR_SIZE) {
             	index = HVA_ICN_SUFX_VERS_NBR_SIZE -1; // can't exceed max array size
             	logger.trace("hvaIcnSufxVersNbr - Array index exceeded max Size "+HVA_ICN_SUFX_VERS_NBR_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeHvaIcnSufxVersNbr(index,value);
		}
   }
    /**
	 *	Returns the value of hvaInvnCtlNbr
	 *  Corresponding COBOL Variable is HVA-INVN-CTL-NBR
	 *	@return hvaInvnCtlNbr
	 */
	public List<char[]> getHvaInvnCtlNbr() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_INVN_CTL_NBR_SIZE;index++) {
        	list.add( getHvaInvnCtlNbr( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaInvnCtlNbr
	 */
	public char[] getHvaInvnCtlNbr(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaInvnCtlNbr(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_INVN_CTL_NBR_SIZE) {
             	index = HVA_INVN_CTL_NBR_SIZE -1; // can't exceed max array size
             	logger.trace("hvaInvnCtlNbr - Array index exceeded max Size {}, resetting it to max allowed",HVA_INVN_CTL_NBR_SIZE); 
	    }
   	      return getCharArray( (beginHvaInvnCtlNbr + index*HVA_INVN_CTL_NBR_LEN) , HVA_INVN_CTL_NBR_LEN );
    }
    
    
   public int  hvaInvnCtlNbrFieldLength() {
   	return HVA_INVN_CTL_NBR_LEN;
   }
   
	

  
  	/**
	 *	Update HvaInvnCtlNbr with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-INVN-CTL-NBR
	 *  @param index
	 *	@param value
	 */
  public void setHvaInvnCtlNbr(int index,char[] value) {
   	setHvaInvnCtlNbr(index,value,true);
   }
   
   
   /**
	 *	Update HvaInvnCtlNbr with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaInvnCtlNbr(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaInvnCtlNbr(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 10)  {     
		       value = substring(value,0,10);
           }  else if (value.length < 10) {
		       value = pad(10, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(10).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaInvnCtlNbr(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaIcnSufxCd
	 *  Corresponding COBOL Variable is HVA-ICN-SUFX-CD
	 *	@return hvaIcnSufxCd
	 */
	public List<char[]> getHvaIcnSufxCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_ICN_SUFX_CD_SIZE;index++) {
        	list.add( getHvaIcnSufxCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaIcnSufxCd
	 */
	public char[] getHvaIcnSufxCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaIcnSufxCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_ICN_SUFX_CD_SIZE) {
             	index = HVA_ICN_SUFX_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaIcnSufxCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_ICN_SUFX_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaIcnSufxCd + index*HVA_ICN_SUFX_CD_LEN) , HVA_ICN_SUFX_CD_LEN );
    }
    
    
   public int  hvaIcnSufxCdFieldLength() {
   	return HVA_ICN_SUFX_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaIcnSufxCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-ICN-SUFX-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaIcnSufxCd(int index,char[] value) {
   	setHvaIcnSufxCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaIcnSufxCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaIcnSufxCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaIcnSufxCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 2)  {     
		       value = substring(value,0,2);
           }  else if (value.length < 2) {
		       value = pad(2, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(2).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaIcnSufxCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaLnId
	 *  Corresponding COBOL Variable is HVA-LN-ID
	 *	@return hvaLnId
	 */
	public List<Short> getHvaLnId() throws CFException {
        List<Short>	list = new ArrayList<>();  
        for (int index =0;index < HVA_LN_ID_SIZE;index++) {
        	list.add( getHvaLnId( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return hvaLnId
	 */
	public short getHvaLnId(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaLnId(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_LN_ID_SIZE) {
             	index = HVA_LN_ID_SIZE -1; // can't exceed max array size
             	logger.trace("hvaLnId - Array index exceeded max Size {}, resetting it to max allowed",HVA_LN_ID_SIZE); 
	    }   
         return getShort(beginHvaLnId+ index*HVA_LN_ID_LEN);
   }
	
	/**
	 *	Update HvaLnId at index with the passed value
	 *  Corresponding COBOL Variable is HVA-LN-ID
	 *  @param index
	 *	@param number
	 */
	public void setHvaLnId(int index,short number) {
	   truncated = false; // reset left over truncated flag
		setHvaLnId(index,number, true);
	}
	
	public void setHvaLnId(int index,int number) {
		setHvaLnId(index,(short)number, true);
	}
	public void setHvaLnId(int index,long number) {
			setHvaLnId(index,(short)number, true);
	}
	
	/**
	 *	Update  HvaLnId at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setHvaLnId(int index,short value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaLnId(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_LN_ID_SIZE) {
             	index = HVA_LN_ID_SIZE -1; // can't exceed max array size
             	logger.trace("hvaLnId - Array index exceeded max Size "+HVA_LN_ID_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeHvaLnId(index,value);
		}
   }
    /**
	 *	Returns the value of hvaFlnJulianDtNbr
	 *  Corresponding COBOL Variable is HVA-FLN-JULIAN-DT-NBR
	 *	@return hvaFlnJulianDtNbr
	 */
	public List<char[]> getHvaFlnJulianDtNbr() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_FLN_JULIAN_DT_NBR_SIZE;index++) {
        	list.add( getHvaFlnJulianDtNbr( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaFlnJulianDtNbr
	 */
	public char[] getHvaFlnJulianDtNbr(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaFlnJulianDtNbr(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_FLN_JULIAN_DT_NBR_SIZE) {
             	index = HVA_FLN_JULIAN_DT_NBR_SIZE -1; // can't exceed max array size
             	logger.trace("hvaFlnJulianDtNbr - Array index exceeded max Size {}, resetting it to max allowed",HVA_FLN_JULIAN_DT_NBR_SIZE); 
	    }
   	      return getCharArray( (beginHvaFlnJulianDtNbr + index*HVA_FLN_JULIAN_DT_NBR_LEN) , HVA_FLN_JULIAN_DT_NBR_LEN );
    }
    
    
   public int  hvaFlnJulianDtNbrFieldLength() {
   	return HVA_FLN_JULIAN_DT_NBR_LEN;
   }
   
	

  
  	/**
	 *	Update HvaFlnJulianDtNbr with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-FLN-JULIAN-DT-NBR
	 *  @param index
	 *	@param value
	 */
  public void setHvaFlnJulianDtNbr(int index,char[] value) {
   	setHvaFlnJulianDtNbr(index,value,true);
   }
   
   
   /**
	 *	Update HvaFlnJulianDtNbr with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaFlnJulianDtNbr(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaFlnJulianDtNbr(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 5)  {     
		       value = substring(value,0,5);
           }  else if (value.length < 5) {
		       value = pad(5, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(5).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaFlnJulianDtNbr(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaFlnSrlNbr
	 *  Corresponding COBOL Variable is HVA-FLN-SRL-NBR
	 *	@return hvaFlnSrlNbr
	 */
	public List<char[]> getHvaFlnSrlNbr() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_FLN_SRL_NBR_SIZE;index++) {
        	list.add( getHvaFlnSrlNbr( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaFlnSrlNbr
	 */
	public char[] getHvaFlnSrlNbr(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaFlnSrlNbr(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_FLN_SRL_NBR_SIZE) {
             	index = HVA_FLN_SRL_NBR_SIZE -1; // can't exceed max array size
             	logger.trace("hvaFlnSrlNbr - Array index exceeded max Size {}, resetting it to max allowed",HVA_FLN_SRL_NBR_SIZE); 
	    }
   	      return getCharArray( (beginHvaFlnSrlNbr + index*HVA_FLN_SRL_NBR_LEN) , HVA_FLN_SRL_NBR_LEN );
    }
    
    
   public int  hvaFlnSrlNbrFieldLength() {
   	return HVA_FLN_SRL_NBR_LEN;
   }
   
	

  
  	/**
	 *	Update HvaFlnSrlNbr with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-FLN-SRL-NBR
	 *  @param index
	 *	@param value
	 */
  public void setHvaFlnSrlNbr(int index,char[] value) {
   	setHvaFlnSrlNbr(index,value,true);
   }
   
   
   /**
	 *	Update HvaFlnSrlNbr with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaFlnSrlNbr(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaFlnSrlNbr(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 5)  {     
		       value = substring(value,0,5);
           }  else if (value.length < 5) {
		       value = pad(5, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(5).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaFlnSrlNbr(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaDftNbr
	 *  Corresponding COBOL Variable is HVA-DFT-NBR
	 *	@return hvaDftNbr
	 */
	public List<char[]> getHvaDftNbr() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_DFT_NBR_SIZE;index++) {
        	list.add( getHvaDftNbr( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaDftNbr
	 */
	public char[] getHvaDftNbr(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaDftNbr(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_DFT_NBR_SIZE) {
             	index = HVA_DFT_NBR_SIZE -1; // can't exceed max array size
             	logger.trace("hvaDftNbr - Array index exceeded max Size {}, resetting it to max allowed",HVA_DFT_NBR_SIZE); 
	    }
   	      return getCharArray( (beginHvaDftNbr + index*HVA_DFT_NBR_LEN) , HVA_DFT_NBR_LEN );
    }
    
    
   public int  hvaDftNbrFieldLength() {
   	return HVA_DFT_NBR_LEN;
   }
   
	

  
  	/**
	 *	Update HvaDftNbr with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-DFT-NBR
	 *  @param index
	 *	@param value
	 */
  public void setHvaDftNbr(int index,char[] value) {
   	setHvaDftNbr(index,value,true);
   }
   
   
   /**
	 *	Update HvaDftNbr with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaDftNbr(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaDftNbr(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 19)  {     
		       value = substring(value,0,19);
           }  else if (value.length < 19) {
		       value = pad(19, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(19).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaDftNbr(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaFstDt
	 *  Corresponding COBOL Variable is HVA-FST-DT
	 *	@return hvaFstDt
	 */
	public List<char[]> getHvaFstDt() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_FST_DT_SIZE;index++) {
        	list.add( getHvaFstDt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaFstDt
	 */
	public char[] getHvaFstDt(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaFstDt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_FST_DT_SIZE) {
             	index = HVA_FST_DT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaFstDt - Array index exceeded max Size {}, resetting it to max allowed",HVA_FST_DT_SIZE); 
	    }
   	      return getCharArray( (beginHvaFstDt + index*HVA_FST_DT_LEN) , HVA_FST_DT_LEN );
    }
    
    
   public int  hvaFstDtFieldLength() {
   	return HVA_FST_DT_LEN;
   }
   
	

  
  	/**
	 *	Update HvaFstDt with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-FST-DT
	 *  @param index
	 *	@param value
	 */
  public void setHvaFstDt(int index,char[] value) {
   	setHvaFstDt(index,value,true);
   }
   
   
   /**
	 *	Update HvaFstDt with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaFstDt(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaFstDt(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 10)  {     
		       value = substring(value,0,10);
           }  else if (value.length < 10) {
		       value = pad(10, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(10).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaFstDt(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaLstSrvcDt
	 *  Corresponding COBOL Variable is HVA-LST-SRVC-DT
	 *	@return hvaLstSrvcDt
	 */
	public List<char[]> getHvaLstSrvcDt() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_LST_SRVC_DT_SIZE;index++) {
        	list.add( getHvaLstSrvcDt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaLstSrvcDt
	 */
	public char[] getHvaLstSrvcDt(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaLstSrvcDt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_LST_SRVC_DT_SIZE) {
             	index = HVA_LST_SRVC_DT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaLstSrvcDt - Array index exceeded max Size {}, resetting it to max allowed",HVA_LST_SRVC_DT_SIZE); 
	    }
   	      return getCharArray( (beginHvaLstSrvcDt + index*HVA_LST_SRVC_DT_LEN) , HVA_LST_SRVC_DT_LEN );
    }
    
    
   public int  hvaLstSrvcDtFieldLength() {
   	return HVA_LST_SRVC_DT_LEN;
   }
   
	

  
  	/**
	 *	Update HvaLstSrvcDt with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-LST-SRVC-DT
	 *  @param index
	 *	@param value
	 */
  public void setHvaLstSrvcDt(int index,char[] value) {
   	setHvaLstSrvcDt(index,value,true);
   }
   
   
   /**
	 *	Update HvaLstSrvcDt with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaLstSrvcDt(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaLstSrvcDt(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 10)  {     
		       value = substring(value,0,10);
           }  else if (value.length < 10) {
		       value = pad(10, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(10).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaLstSrvcDt(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaProvTinsuff
	 *  Corresponding COBOL Variable is HVA-PROV-TINSUFF
	 *	@return hvaProvTinsuff
	 */
	public List<char[]> getHvaProvTinsuff() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PROV_TINSUFF_SIZE;index++) {
        	list.add( getHvaProvTinsuff( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaProvTinsuff
	 */
	public char[] getHvaProvTinsuff(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaProvTinsuff(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PROV_TINSUFF_SIZE) {
             	index = HVA_PROV_TINSUFF_SIZE -1; // can't exceed max array size
             	logger.trace("hvaProvTinsuff - Array index exceeded max Size {}, resetting it to max allowed",HVA_PROV_TINSUFF_SIZE); 
	    }
   	      return getCharArray( (beginHvaProvTinsuff + index*HVA_PROV_TINSUFF_LEN) , HVA_PROV_TINSUFF_LEN );
    }
    
    
   public int  hvaProvTinsuffFieldLength() {
   	return HVA_PROV_TINSUFF_LEN;
   }
   
	

  
  	/**
	 *	Update HvaProvTinsuff with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PROV-TINSUFF
	 *  @param index
	 *	@param value
	 */
  public void setHvaProvTinsuff(int index,char[] value) {
   	setHvaProvTinsuff(index,value,true);
   }
   
   
   /**
	 *	Update HvaProvTinsuff with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaProvTinsuff(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaProvTinsuff(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 15)  {     
		       value = substring(value,0,15);
           }  else if (value.length < 15) {
		       value = pad(15, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(15).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaProvTinsuff(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaProvScrnNbr
	 *  Corresponding COBOL Variable is HVA-PROV-SCRN-NBR
	 *	@return hvaProvScrnNbr
	 */
	public List<char[]> getHvaProvScrnNbr() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PROV_SCRN_NBR_SIZE;index++) {
        	list.add( getHvaProvScrnNbr( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaProvScrnNbr
	 */
	public char[] getHvaProvScrnNbr(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaProvScrnNbr(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PROV_SCRN_NBR_SIZE) {
             	index = HVA_PROV_SCRN_NBR_SIZE -1; // can't exceed max array size
             	logger.trace("hvaProvScrnNbr - Array index exceeded max Size {}, resetting it to max allowed",HVA_PROV_SCRN_NBR_SIZE); 
	    }
   	      return getCharArray( (beginHvaProvScrnNbr + index*HVA_PROV_SCRN_NBR_LEN) , HVA_PROV_SCRN_NBR_LEN );
    }
    
    
   public int  hvaProvScrnNbrFieldLength() {
   	return HVA_PROV_SCRN_NBR_LEN;
   }
   
	

  
  	/**
	 *	Update HvaProvScrnNbr with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PROV-SCRN-NBR
	 *  @param index
	 *	@param value
	 */
  public void setHvaProvScrnNbr(int index,char[] value) {
   	setHvaProvScrnNbr(index,value,true);
   }
   
   
   /**
	 *	Update HvaProvScrnNbr with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaProvScrnNbr(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaProvScrnNbr(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaProvScrnNbr(index,value);		
       }
   }
   

    /**
	 *	Returns the value of hvaChrgAmt
	 *  Corresponding COBOL Variable is HVA-CHRG-AMT
	 *	@return hvaChrgAmt
	 */
	public List<BigDecimal> getHvaChrgAmt() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < HVA_CHRG_AMT_SIZE;index++) {
        	list.add( getHvaChrgAmt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaChrgAmt
	 */
	public BigDecimal getHvaChrgAmt(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaChrgAmt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_CHRG_AMT_SIZE) {
             	index = HVA_CHRG_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaChrgAmt - Array index exceeded max Size "+HVA_CHRG_AMT_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginHvaChrgAmt+ index*HVA_CHRG_AMT_LEN ,
		HVA_CHRG_AMT_LEN, HVA_CHRG_AMT_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("hvaChrgAmt", beginHvaChrgAmt+ index*HVA_CHRG_AMT_LEN,HVA_CHRG_AMT_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean hvaChrgAmtIsNumeric(int index) {
	    return decimalIsNumeric( beginHvaChrgAmt+ index*HVA_CHRG_AMT_LEN ,HVA_CHRG_AMT_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is HVA-CHRG-AMT
	 *  @param index
	 *	@param number
	 */
	public void setHvaChrgAmt(int index,BigDecimal number) {	
		setHvaChrgAmt(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setHvaChrgAmt(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaChrgAmt(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= HVA_CHRG_AMT_SIZE) {
             	index = HVA_CHRG_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaChrgAmt - Array index exceeded max Size {}, resetting it to max allowed",HVA_CHRG_AMT_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 16) value =   truncate(value,16) ;
		if (setModified) {
			serializeHvaChrgAmt(index,value);
		}
   }

    /**
	 *	Returns the value of hvaRmrkCd
	 *  Corresponding COBOL Variable is HVA-RMRK-CD
	 *	@return hvaRmrkCd
	 */
	public List<char[]> getHvaRmrkCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_RMRK_CD_SIZE;index++) {
        	list.add( getHvaRmrkCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaRmrkCd
	 */
	public char[] getHvaRmrkCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaRmrkCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_RMRK_CD_SIZE) {
             	index = HVA_RMRK_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaRmrkCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_RMRK_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaRmrkCd + index*HVA_RMRK_CD_LEN) , HVA_RMRK_CD_LEN );
    }
    
    
   public int  hvaRmrkCdFieldLength() {
   	return HVA_RMRK_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaRmrkCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-RMRK-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaRmrkCd(int index,char[] value) {
   	setHvaRmrkCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaRmrkCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaRmrkCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaRmrkCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 3)  {     
		       value = substring(value,0,3);
           }  else if (value.length < 3) {
		       value = pad(3, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(3).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaRmrkCd(index,value);		
       }
   }
   

    /**
	 *	Returns the value of hvaNcAmt
	 *  Corresponding COBOL Variable is HVA-NC-AMT
	 *	@return hvaNcAmt
	 */
	public List<BigDecimal> getHvaNcAmt() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < HVA_NC_AMT_SIZE;index++) {
        	list.add( getHvaNcAmt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaNcAmt
	 */
	public BigDecimal getHvaNcAmt(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaNcAmt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_NC_AMT_SIZE) {
             	index = HVA_NC_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaNcAmt - Array index exceeded max Size "+HVA_NC_AMT_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginHvaNcAmt+ index*HVA_NC_AMT_LEN ,
		HVA_NC_AMT_LEN, HVA_NC_AMT_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("hvaNcAmt", beginHvaNcAmt+ index*HVA_NC_AMT_LEN,HVA_NC_AMT_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean hvaNcAmtIsNumeric(int index) {
	    return decimalIsNumeric( beginHvaNcAmt+ index*HVA_NC_AMT_LEN ,HVA_NC_AMT_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is HVA-NC-AMT
	 *  @param index
	 *	@param number
	 */
	public void setHvaNcAmt(int index,BigDecimal number) {	
		setHvaNcAmt(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setHvaNcAmt(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaNcAmt(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= HVA_NC_AMT_SIZE) {
             	index = HVA_NC_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaNcAmt - Array index exceeded max Size {}, resetting it to max allowed",HVA_NC_AMT_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 16) value =   truncate(value,16) ;
		if (setModified) {
			serializeHvaNcAmt(index,value);
		}
   }

    /**
	 *	Returns the value of hvaPmtSvcCd
	 *  Corresponding COBOL Variable is HVA-PMT-SVC-CD
	 *	@return hvaPmtSvcCd
	 */
	public List<char[]> getHvaPmtSvcCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PMT_SVC_CD_SIZE;index++) {
        	list.add( getHvaPmtSvcCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaPmtSvcCd
	 */
	public char[] getHvaPmtSvcCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaPmtSvcCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PMT_SVC_CD_SIZE) {
             	index = HVA_PMT_SVC_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaPmtSvcCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_PMT_SVC_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaPmtSvcCd + index*HVA_PMT_SVC_CD_LEN) , HVA_PMT_SVC_CD_LEN );
    }
    
    
   public int  hvaPmtSvcCdFieldLength() {
   	return HVA_PMT_SVC_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaPmtSvcCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PMT-SVC-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaPmtSvcCd(int index,char[] value) {
   	setHvaPmtSvcCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaPmtSvcCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaPmtSvcCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaPmtSvcCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 6)  {     
		       value = substring(value,0,6);
           }  else if (value.length < 6) {
		       value = pad(6, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(6).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaPmtSvcCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaOvrCd
	 *  Corresponding COBOL Variable is HVA-OVR-CD
	 *	@return hvaOvrCd
	 */
	public List<char[]> getHvaOvrCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_OVR_CD_SIZE;index++) {
        	list.add( getHvaOvrCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaOvrCd
	 */
	public char[] getHvaOvrCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaOvrCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_OVR_CD_SIZE) {
             	index = HVA_OVR_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaOvrCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_OVR_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaOvrCd + index*HVA_OVR_CD_LEN) , HVA_OVR_CD_LEN );
    }
    
    
   public int  hvaOvrCdFieldLength() {
   	return HVA_OVR_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaOvrCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-OVR-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaOvrCd(int index,char[] value) {
   	setHvaOvrCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaOvrCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaOvrCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaOvrCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 2)  {     
		       value = substring(value,0,2);
           }  else if (value.length < 2) {
		       value = pad(2, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(2).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaOvrCd(index,value);		
       }
   }
   

    /**
	 *	Returns the value of hvaCopayAmt
	 *  Corresponding COBOL Variable is HVA-COPAY-AMT
	 *	@return hvaCopayAmt
	 */
	public List<BigDecimal> getHvaCopayAmt() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < HVA_COPAY_AMT_SIZE;index++) {
        	list.add( getHvaCopayAmt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaCopayAmt
	 */
	public BigDecimal getHvaCopayAmt(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaCopayAmt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_COPAY_AMT_SIZE) {
             	index = HVA_COPAY_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaCopayAmt - Array index exceeded max Size "+HVA_COPAY_AMT_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginHvaCopayAmt+ index*HVA_COPAY_AMT_LEN ,
		HVA_COPAY_AMT_LEN, HVA_COPAY_AMT_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("hvaCopayAmt", beginHvaCopayAmt+ index*HVA_COPAY_AMT_LEN,HVA_COPAY_AMT_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean hvaCopayAmtIsNumeric(int index) {
	    return decimalIsNumeric( beginHvaCopayAmt+ index*HVA_COPAY_AMT_LEN ,HVA_COPAY_AMT_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is HVA-COPAY-AMT
	 *  @param index
	 *	@param number
	 */
	public void setHvaCopayAmt(int index,BigDecimal number) {	
		setHvaCopayAmt(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setHvaCopayAmt(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaCopayAmt(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= HVA_COPAY_AMT_SIZE) {
             	index = HVA_COPAY_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaCopayAmt - Array index exceeded max Size {}, resetting it to max allowed",HVA_COPAY_AMT_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 16) value =   truncate(value,16) ;
		if (setModified) {
			serializeHvaCopayAmt(index,value);
		}
   }

    /**
	 *	Returns the value of hvaSrvcCd
	 *  Corresponding COBOL Variable is HVA-SRVC-CD
	 *	@return hvaSrvcCd
	 */
	public List<char[]> getHvaSrvcCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_SRVC_CD_SIZE;index++) {
        	list.add( getHvaSrvcCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaSrvcCd
	 */
	public char[] getHvaSrvcCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaSrvcCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_SRVC_CD_SIZE) {
             	index = HVA_SRVC_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaSrvcCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_SRVC_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaSrvcCd + index*HVA_SRVC_CD_LEN) , HVA_SRVC_CD_LEN );
    }
    
    
   public int  hvaSrvcCdFieldLength() {
   	return HVA_SRVC_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaSrvcCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-SRVC-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaSrvcCd(int index,char[] value) {
   	setHvaSrvcCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaSrvcCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaSrvcCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaSrvcCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 2)  {     
		       value = substring(value,0,2);
           }  else if (value.length < 2) {
		       value = pad(2, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(2).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaSrvcCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaPayCd
	 *  Corresponding COBOL Variable is HVA-PAY-CD
	 *	@return hvaPayCd
	 */
	public List<char[]> getHvaPayCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PAY_CD_SIZE;index++) {
        	list.add( getHvaPayCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaPayCd
	 */
	public char[] getHvaPayCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaPayCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PAY_CD_SIZE) {
             	index = HVA_PAY_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaPayCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_PAY_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaPayCd + index*HVA_PAY_CD_LEN) , HVA_PAY_CD_LEN );
    }
    
    
   public int  hvaPayCdFieldLength() {
   	return HVA_PAY_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaPayCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PAY-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaPayCd(int index,char[] value) {
   	setHvaPayCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaPayCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaPayCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaPayCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaPayCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaTransCd
	 *  Corresponding COBOL Variable is HVA-TRANS-CD
	 *	@return hvaTransCd
	 */
	public List<char[]> getHvaTransCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_TRANS_CD_SIZE;index++) {
        	list.add( getHvaTransCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaTransCd
	 */
	public char[] getHvaTransCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaTransCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_TRANS_CD_SIZE) {
             	index = HVA_TRANS_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaTransCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_TRANS_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaTransCd + index*HVA_TRANS_CD_LEN) , HVA_TRANS_CD_LEN );
    }
    
    
   public int  hvaTransCdFieldLength() {
   	return HVA_TRANS_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaTransCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-TRANS-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaTransCd(int index,char[] value) {
   	setHvaTransCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaTransCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaTransCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaTransCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 2)  {     
		       value = substring(value,0,2);
           }  else if (value.length < 2) {
		       value = pad(2, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(2).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaTransCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaFilmOfcNbr
	 *  Corresponding COBOL Variable is HVA-FILM-OFC-NBR
	 *	@return hvaFilmOfcNbr
	 */
	public List<char[]> getHvaFilmOfcNbr() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_FILM_OFC_NBR_SIZE;index++) {
        	list.add( getHvaFilmOfcNbr( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaFilmOfcNbr
	 */
	public char[] getHvaFilmOfcNbr(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaFilmOfcNbr(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_FILM_OFC_NBR_SIZE) {
             	index = HVA_FILM_OFC_NBR_SIZE -1; // can't exceed max array size
             	logger.trace("hvaFilmOfcNbr - Array index exceeded max Size {}, resetting it to max allowed",HVA_FILM_OFC_NBR_SIZE); 
	    }
   	      return getCharArray( (beginHvaFilmOfcNbr + index*HVA_FILM_OFC_NBR_LEN) , HVA_FILM_OFC_NBR_LEN );
    }
    
    
   public int  hvaFilmOfcNbrFieldLength() {
   	return HVA_FILM_OFC_NBR_LEN;
   }
   
	

  
  	/**
	 *	Update HvaFilmOfcNbr with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-FILM-OFC-NBR
	 *  @param index
	 *	@param value
	 */
  public void setHvaFilmOfcNbr(int index,char[] value) {
   	setHvaFilmOfcNbr(index,value,true);
   }
   
   
   /**
	 *	Update HvaFilmOfcNbr with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaFilmOfcNbr(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaFilmOfcNbr(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 4)  {     
		       value = substring(value,0,4);
           }  else if (value.length < 4) {
		       value = pad(4, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(4).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaFilmOfcNbr(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaClmLvlRsnCd
	 *  Corresponding COBOL Variable is HVA-CLM-LVL-RSN-CD
	 *	@return hvaClmLvlRsnCd
	 */
	public List<char[]> getHvaClmLvlRsnCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_CLM_LVL_RSN_CD_SIZE;index++) {
        	list.add( getHvaClmLvlRsnCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaClmLvlRsnCd
	 */
	public char[] getHvaClmLvlRsnCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaClmLvlRsnCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_CLM_LVL_RSN_CD_SIZE) {
             	index = HVA_CLM_LVL_RSN_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaClmLvlRsnCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_CLM_LVL_RSN_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaClmLvlRsnCd + index*HVA_CLM_LVL_RSN_CD_LEN) , HVA_CLM_LVL_RSN_CD_LEN );
    }
    
    
   public int  hvaClmLvlRsnCdFieldLength() {
   	return HVA_CLM_LVL_RSN_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaClmLvlRsnCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-CLM-LVL-RSN-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaClmLvlRsnCd(int index,char[] value) {
   	setHvaClmLvlRsnCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaClmLvlRsnCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaClmLvlRsnCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaClmLvlRsnCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 3)  {     
		       value = substring(value,0,3);
           }  else if (value.length < 3) {
		       value = pad(3, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(3).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaClmLvlRsnCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaAdjtrId
	 *  Corresponding COBOL Variable is HVA-ADJTR-ID
	 *	@return hvaAdjtrId
	 */
	public List<char[]> getHvaAdjtrId() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_ADJTR_ID_SIZE;index++) {
        	list.add( getHvaAdjtrId( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaAdjtrId
	 */
	public char[] getHvaAdjtrId(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaAdjtrId(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_ADJTR_ID_SIZE) {
             	index = HVA_ADJTR_ID_SIZE -1; // can't exceed max array size
             	logger.trace("hvaAdjtrId - Array index exceeded max Size {}, resetting it to max allowed",HVA_ADJTR_ID_SIZE); 
	    }
   	      return getCharArray( (beginHvaAdjtrId + index*HVA_ADJTR_ID_LEN) , HVA_ADJTR_ID_LEN );
    }
    
    
   public int  hvaAdjtrIdFieldLength() {
   	return HVA_ADJTR_ID_LEN;
   }
   
	

  
  	/**
	 *	Update HvaAdjtrId with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-ADJTR-ID
	 *  @param index
	 *	@param value
	 */
  public void setHvaAdjtrId(int index,char[] value) {
   	setHvaAdjtrId(index,value,true);
   }
   
   
   /**
	 *	Update HvaAdjtrId with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaAdjtrId(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaAdjtrId(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 9)  {     
		       value = substring(value,0,9);
           }  else if (value.length < 9) {
		       value = pad(9, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(9).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaAdjtrId(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaMbrPrvInd
	 *  Corresponding COBOL Variable is HVA-MBR-PRV-IND
	 *	@return hvaMbrPrvInd
	 */
	public List<char[]> getHvaMbrPrvInd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_MBR_PRV_IND_SIZE;index++) {
        	list.add( getHvaMbrPrvInd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaMbrPrvInd
	 */
	public char[] getHvaMbrPrvInd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaMbrPrvInd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_MBR_PRV_IND_SIZE) {
             	index = HVA_MBR_PRV_IND_SIZE -1; // can't exceed max array size
             	logger.trace("hvaMbrPrvInd - Array index exceeded max Size {}, resetting it to max allowed",HVA_MBR_PRV_IND_SIZE); 
	    }
   	      return getCharArray( (beginHvaMbrPrvInd + index*HVA_MBR_PRV_IND_LEN) , HVA_MBR_PRV_IND_LEN );
    }
    
    
   public int  hvaMbrPrvIndFieldLength() {
   	return HVA_MBR_PRV_IND_LEN;
   }
   
	

  
  	/**
	 *	Update HvaMbrPrvInd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-MBR-PRV-IND
	 *  @param index
	 *	@param value
	 */
  public void setHvaMbrPrvInd(int index,char[] value) {
   	setHvaMbrPrvInd(index,value,true);
   }
   
   
   /**
	 *	Update HvaMbrPrvInd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaMbrPrvInd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaMbrPrvInd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaMbrPrvInd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaNtfyWaivCd
	 *  Corresponding COBOL Variable is HVA-NTFY-WAIV-CD
	 *	@return hvaNtfyWaivCd
	 */
	public List<char[]> getHvaNtfyWaivCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_NTFY_WAIV_CD_SIZE;index++) {
        	list.add( getHvaNtfyWaivCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaNtfyWaivCd
	 */
	public char[] getHvaNtfyWaivCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaNtfyWaivCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_NTFY_WAIV_CD_SIZE) {
             	index = HVA_NTFY_WAIV_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaNtfyWaivCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_NTFY_WAIV_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaNtfyWaivCd + index*HVA_NTFY_WAIV_CD_LEN) , HVA_NTFY_WAIV_CD_LEN );
    }
    
    
   public int  hvaNtfyWaivCdFieldLength() {
   	return HVA_NTFY_WAIV_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaNtfyWaivCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-NTFY-WAIV-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaNtfyWaivCd(int index,char[] value) {
   	setHvaNtfyWaivCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaNtfyWaivCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaNtfyWaivCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaNtfyWaivCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 3)  {     
		       value = substring(value,0,3);
           }  else if (value.length < 3) {
		       value = pad(3, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(3).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaNtfyWaivCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaBankCd
	 *  Corresponding COBOL Variable is HVA-BANK-CD
	 *	@return hvaBankCd
	 */
	public List<char[]> getHvaBankCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_BANK_CD_SIZE;index++) {
        	list.add( getHvaBankCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaBankCd
	 */
	public char[] getHvaBankCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaBankCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_BANK_CD_SIZE) {
             	index = HVA_BANK_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaBankCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_BANK_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaBankCd + index*HVA_BANK_CD_LEN) , HVA_BANK_CD_LEN );
    }
    
    
   public int  hvaBankCdFieldLength() {
   	return HVA_BANK_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaBankCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-BANK-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaBankCd(int index,char[] value) {
   	setHvaBankCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaBankCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaBankCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaBankCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 3)  {     
		       value = substring(value,0,3);
           }  else if (value.length < 3) {
		       value = pad(3, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(3).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaBankCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaDivNbr
	 *  Corresponding COBOL Variable is HVA-DIV-NBR
	 *	@return hvaDivNbr
	 */
	public List<char[]> getHvaDivNbr() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_DIV_NBR_SIZE;index++) {
        	list.add( getHvaDivNbr( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaDivNbr
	 */
	public char[] getHvaDivNbr(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaDivNbr(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_DIV_NBR_SIZE) {
             	index = HVA_DIV_NBR_SIZE -1; // can't exceed max array size
             	logger.trace("hvaDivNbr - Array index exceeded max Size {}, resetting it to max allowed",HVA_DIV_NBR_SIZE); 
	    }
   	      return getCharArray( (beginHvaDivNbr + index*HVA_DIV_NBR_LEN) , HVA_DIV_NBR_LEN );
    }
    
    
   public int  hvaDivNbrFieldLength() {
   	return HVA_DIV_NBR_LEN;
   }
   
	

  
  	/**
	 *	Update HvaDivNbr with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-DIV-NBR
	 *  @param index
	 *	@param value
	 */
  public void setHvaDivNbr(int index,char[] value) {
   	setHvaDivNbr(index,value,true);
   }
   
   
   /**
	 *	Update HvaDivNbr with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaDivNbr(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaDivNbr(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 4)  {     
		       value = substring(value,0,4);
           }  else if (value.length < 4) {
		       value = pad(4, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(4).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaDivNbr(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaClsNbr
	 *  Corresponding COBOL Variable is HVA-CLS-NBR
	 *	@return hvaClsNbr
	 */
	public List<char[]> getHvaClsNbr() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_CLS_NBR_SIZE;index++) {
        	list.add( getHvaClsNbr( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaClsNbr
	 */
	public char[] getHvaClsNbr(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaClsNbr(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_CLS_NBR_SIZE) {
             	index = HVA_CLS_NBR_SIZE -1; // can't exceed max array size
             	logger.trace("hvaClsNbr - Array index exceeded max Size {}, resetting it to max allowed",HVA_CLS_NBR_SIZE); 
	    }
   	      return getCharArray( (beginHvaClsNbr + index*HVA_CLS_NBR_LEN) , HVA_CLS_NBR_LEN );
    }
    
    
   public int  hvaClsNbrFieldLength() {
   	return HVA_CLS_NBR_LEN;
   }
   
	

  
  	/**
	 *	Update HvaClsNbr with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-CLS-NBR
	 *  @param index
	 *	@param value
	 */
  public void setHvaClsNbr(int index,char[] value) {
   	setHvaClsNbr(index,value,true);
   }
   
   
   /**
	 *	Update HvaClsNbr with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaClsNbr(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaClsNbr(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 4)  {     
		       value = substring(value,0,4);
           }  else if (value.length < 4) {
		       value = pad(4, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(4).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaClsNbr(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaDrgNbr
	 *  Corresponding COBOL Variable is HVA-DRG-NBR
	 *	@return hvaDrgNbr
	 */
	public List<char[]> getHvaDrgNbr() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_DRG_NBR_SIZE;index++) {
        	list.add( getHvaDrgNbr( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaDrgNbr
	 */
	public char[] getHvaDrgNbr(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaDrgNbr(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_DRG_NBR_SIZE) {
             	index = HVA_DRG_NBR_SIZE -1; // can't exceed max array size
             	logger.trace("hvaDrgNbr - Array index exceeded max Size {}, resetting it to max allowed",HVA_DRG_NBR_SIZE); 
	    }
   	      return getCharArray( (beginHvaDrgNbr + index*HVA_DRG_NBR_LEN) , HVA_DRG_NBR_LEN );
    }
    
    
   public int  hvaDrgNbrFieldLength() {
   	return HVA_DRG_NBR_LEN;
   }
   
	

  
  	/**
	 *	Update HvaDrgNbr with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-DRG-NBR
	 *  @param index
	 *	@param value
	 */
  public void setHvaDrgNbr(int index,char[] value) {
   	setHvaDrgNbr(index,value,true);
   }
   
   
   /**
	 *	Update HvaDrgNbr with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaDrgNbr(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaDrgNbr(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 5)  {     
		       value = substring(value,0,5);
           }  else if (value.length < 5) {
		       value = pad(5, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(5).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaDrgNbr(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaFaclOrProfCd
	 *  Corresponding COBOL Variable is HVA-FACL-OR-PROF-CD
	 *	@return hvaFaclOrProfCd
	 */
	public List<char[]> getHvaFaclOrProfCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_FACL_OR_PROF_CD_SIZE;index++) {
        	list.add( getHvaFaclOrProfCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaFaclOrProfCd
	 */
	public char[] getHvaFaclOrProfCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaFaclOrProfCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_FACL_OR_PROF_CD_SIZE) {
             	index = HVA_FACL_OR_PROF_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaFaclOrProfCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_FACL_OR_PROF_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaFaclOrProfCd + index*HVA_FACL_OR_PROF_CD_LEN) , HVA_FACL_OR_PROF_CD_LEN );
    }
    
    
   public int  hvaFaclOrProfCdFieldLength() {
   	return HVA_FACL_OR_PROF_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaFaclOrProfCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-FACL-OR-PROF-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaFaclOrProfCd(int index,char[] value) {
   	setHvaFaclOrProfCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaFaclOrProfCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaFaclOrProfCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaFaclOrProfCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaFaclOrProfCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaDlgteInd
	 *  Corresponding COBOL Variable is HVA-DLGTE-IND
	 *	@return hvaDlgteInd
	 */
	public List<char[]> getHvaDlgteInd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_DLGTE_IND_SIZE;index++) {
        	list.add( getHvaDlgteInd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaDlgteInd
	 */
	public char[] getHvaDlgteInd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaDlgteInd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_DLGTE_IND_SIZE) {
             	index = HVA_DLGTE_IND_SIZE -1; // can't exceed max array size
             	logger.trace("hvaDlgteInd - Array index exceeded max Size {}, resetting it to max allowed",HVA_DLGTE_IND_SIZE); 
	    }
   	      return getCharArray( (beginHvaDlgteInd + index*HVA_DLGTE_IND_LEN) , HVA_DLGTE_IND_LEN );
    }
    
    
   public int  hvaDlgteIndFieldLength() {
   	return HVA_DLGTE_IND_LEN;
   }
   
	

  
  	/**
	 *	Update HvaDlgteInd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-DLGTE-IND
	 *  @param index
	 *	@param value
	 */
  public void setHvaDlgteInd(int index,char[] value) {
   	setHvaDlgteInd(index,value,true);
   }
   
   
   /**
	 *	Update HvaDlgteInd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaDlgteInd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaDlgteInd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 2)  {     
		       value = substring(value,0,2);
           }  else if (value.length < 2) {
		       value = pad(2, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(2).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaDlgteInd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaNdbContrId
	 *  Corresponding COBOL Variable is HVA-NDB-CONTR-ID
	 *	@return hvaNdbContrId
	 */
	public List<char[]> getHvaNdbContrId() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_NDB_CONTR_ID_SIZE;index++) {
        	list.add( getHvaNdbContrId( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaNdbContrId
	 */
	public char[] getHvaNdbContrId(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaNdbContrId(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_NDB_CONTR_ID_SIZE) {
             	index = HVA_NDB_CONTR_ID_SIZE -1; // can't exceed max array size
             	logger.trace("hvaNdbContrId - Array index exceeded max Size {}, resetting it to max allowed",HVA_NDB_CONTR_ID_SIZE); 
	    }
   	      return getCharArray( (beginHvaNdbContrId + index*HVA_NDB_CONTR_ID_LEN) , HVA_NDB_CONTR_ID_LEN );
    }
    
    
   public int  hvaNdbContrIdFieldLength() {
   	return HVA_NDB_CONTR_ID_LEN;
   }
   
	

  
  	/**
	 *	Update HvaNdbContrId with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-NDB-CONTR-ID
	 *  @param index
	 *	@param value
	 */
  public void setHvaNdbContrId(int index,char[] value) {
   	setHvaNdbContrId(index,value,true);
   }
   
   
   /**
	 *	Update HvaNdbContrId with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaNdbContrId(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaNdbContrId(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 9)  {     
		       value = substring(value,0,9);
           }  else if (value.length < 9) {
		       value = pad(9, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(9).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaNdbContrId(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaClmSmbTypAppCd
	 *  Corresponding COBOL Variable is HVA-CLM-SMB-TYP-APP-CD
	 *	@return hvaClmSmbTypAppCd
	 */
	public List<char[]> getHvaClmSmbTypAppCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_CLM_SMB_TYP_APP_CD_SIZE;index++) {
        	list.add( getHvaClmSmbTypAppCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaClmSmbTypAppCd
	 */
	public char[] getHvaClmSmbTypAppCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaClmSmbTypAppCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_CLM_SMB_TYP_APP_CD_SIZE) {
             	index = HVA_CLM_SMB_TYP_APP_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaClmSmbTypAppCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_CLM_SMB_TYP_APP_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaClmSmbTypAppCd + index*HVA_CLM_SMB_TYP_APP_CD_LEN) , HVA_CLM_SMB_TYP_APP_CD_LEN );
    }
    
    
   public int  hvaClmSmbTypAppCdFieldLength() {
   	return HVA_CLM_SMB_TYP_APP_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaClmSmbTypAppCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-CLM-SMB-TYP-APP-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaClmSmbTypAppCd(int index,char[] value) {
   	setHvaClmSmbTypAppCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaClmSmbTypAppCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaClmSmbTypAppCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaClmSmbTypAppCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaClmSmbTypAppCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaSmbStCd
	 *  Corresponding COBOL Variable is HVA-SMB-ST-CD
	 *	@return hvaSmbStCd
	 */
	public List<char[]> getHvaSmbStCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_SMB_ST_CD_SIZE;index++) {
        	list.add( getHvaSmbStCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaSmbStCd
	 */
	public char[] getHvaSmbStCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaSmbStCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_SMB_ST_CD_SIZE) {
             	index = HVA_SMB_ST_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaSmbStCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_SMB_ST_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaSmbStCd + index*HVA_SMB_ST_CD_LEN) , HVA_SMB_ST_CD_LEN );
    }
    
    
   public int  hvaSmbStCdFieldLength() {
   	return HVA_SMB_ST_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaSmbStCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-SMB-ST-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaSmbStCd(int index,char[] value) {
   	setHvaSmbStCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaSmbStCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaSmbStCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaSmbStCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 2)  {     
		       value = substring(value,0,2);
           }  else if (value.length < 2) {
		       value = pad(2, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(2).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaSmbStCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaProcT1Ind
	 *  Corresponding COBOL Variable is HVA-PROC-T1-IND
	 *	@return hvaProcT1Ind
	 */
	public List<char[]> getHvaProcT1Ind() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PROC_T_1_IND_SIZE;index++) {
        	list.add( getHvaProcT1Ind( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaProcT1Ind
	 */
	public char[] getHvaProcT1Ind(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaProcT1Ind(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PROC_T_1_IND_SIZE) {
             	index = HVA_PROC_T_1_IND_SIZE -1; // can't exceed max array size
             	logger.trace("hvaProcT1Ind - Array index exceeded max Size {}, resetting it to max allowed",HVA_PROC_T_1_IND_SIZE); 
	    }
   	      return getCharArray( (beginHvaProcT1Ind + index*HVA_PROC_T_1_IND_LEN) , HVA_PROC_T_1_IND_LEN );
    }
    
    
   public int  hvaProcT1IndFieldLength() {
   	return HVA_PROC_T_1_IND_LEN;
   }
   
	

  
  	/**
	 *	Update HvaProcT1Ind with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PROC-T1-IND
	 *  @param index
	 *	@param value
	 */
  public void setHvaProcT1Ind(int index,char[] value) {
   	setHvaProcT1Ind(index,value,true);
   }
   
   
   /**
	 *	Update HvaProcT1Ind with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaProcT1Ind(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaProcT1Ind(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaProcT1Ind(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaAuthNbr
	 *  Corresponding COBOL Variable is HVA-AUTH-NBR
	 *	@return hvaAuthNbr
	 */
	public List<char[]> getHvaAuthNbr() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_AUTH_NBR_SIZE;index++) {
        	list.add( getHvaAuthNbr( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaAuthNbr
	 */
	public char[] getHvaAuthNbr(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaAuthNbr(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_AUTH_NBR_SIZE) {
             	index = HVA_AUTH_NBR_SIZE -1; // can't exceed max array size
             	logger.trace("hvaAuthNbr - Array index exceeded max Size {}, resetting it to max allowed",HVA_AUTH_NBR_SIZE); 
	    }
   	      return getCharArray( (beginHvaAuthNbr + index*HVA_AUTH_NBR_LEN) , HVA_AUTH_NBR_LEN );
    }
    
    
   public int  hvaAuthNbrFieldLength() {
   	return HVA_AUTH_NBR_LEN;
   }
   
	

  
  	/**
	 *	Update HvaAuthNbr with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-AUTH-NBR
	 *  @param index
	 *	@param value
	 */
  public void setHvaAuthNbr(int index,char[] value) {
   	setHvaAuthNbr(index,value,true);
   }
   
   
   /**
	 *	Update HvaAuthNbr with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaAuthNbr(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaAuthNbr(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 10)  {     
		       value = substring(value,0,10);
           }  else if (value.length < 10) {
		       value = pad(10, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(10).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaAuthNbr(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaBaseDedDescTxt
	 *  Corresponding COBOL Variable is HVA-BASE-DED-DESC-TXT
	 *	@return hvaBaseDedDescTxt
	 */
	public List<char[]> getHvaBaseDedDescTxt() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_BASE_DED_DESC_TXT_SIZE;index++) {
        	list.add( getHvaBaseDedDescTxt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaBaseDedDescTxt
	 */
	public char[] getHvaBaseDedDescTxt(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaBaseDedDescTxt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_BASE_DED_DESC_TXT_SIZE) {
             	index = HVA_BASE_DED_DESC_TXT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaBaseDedDescTxt - Array index exceeded max Size {}, resetting it to max allowed",HVA_BASE_DED_DESC_TXT_SIZE); 
	    }
   	      return getCharArray( (beginHvaBaseDedDescTxt + index*HVA_BASE_DED_DESC_TXT_LEN) , HVA_BASE_DED_DESC_TXT_LEN );
    }
    
    
   public int  hvaBaseDedDescTxtFieldLength() {
   	return HVA_BASE_DED_DESC_TXT_LEN;
   }
   
	

  
  	/**
	 *	Update HvaBaseDedDescTxt with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-BASE-DED-DESC-TXT
	 *  @param index
	 *	@param value
	 */
  public void setHvaBaseDedDescTxt(int index,char[] value) {
   	setHvaBaseDedDescTxt(index,value,true);
   }
   
   
   /**
	 *	Update HvaBaseDedDescTxt with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaBaseDedDescTxt(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaBaseDedDescTxt(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 2)  {     
		       value = substring(value,0,2);
           }  else if (value.length < 2) {
		       value = pad(2, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(2).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaBaseDedDescTxt(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaMmDedDescTxt
	 *  Corresponding COBOL Variable is HVA-MM-DED-DESC-TXT
	 *	@return hvaMmDedDescTxt
	 */
	public List<char[]> getHvaMmDedDescTxt() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_MM_DED_DESC_TXT_SIZE;index++) {
        	list.add( getHvaMmDedDescTxt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaMmDedDescTxt
	 */
	public char[] getHvaMmDedDescTxt(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaMmDedDescTxt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_MM_DED_DESC_TXT_SIZE) {
             	index = HVA_MM_DED_DESC_TXT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaMmDedDescTxt - Array index exceeded max Size {}, resetting it to max allowed",HVA_MM_DED_DESC_TXT_SIZE); 
	    }
   	      return getCharArray( (beginHvaMmDedDescTxt + index*HVA_MM_DED_DESC_TXT_LEN) , HVA_MM_DED_DESC_TXT_LEN );
    }
    
    
   public int  hvaMmDedDescTxtFieldLength() {
   	return HVA_MM_DED_DESC_TXT_LEN;
   }
   
	

  
  	/**
	 *	Update HvaMmDedDescTxt with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-MM-DED-DESC-TXT
	 *  @param index
	 *	@param value
	 */
  public void setHvaMmDedDescTxt(int index,char[] value) {
   	setHvaMmDedDescTxt(index,value,true);
   }
   
   
   /**
	 *	Update HvaMmDedDescTxt with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaMmDedDescTxt(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaMmDedDescTxt(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 2)  {     
		       value = substring(value,0,2);
           }  else if (value.length < 2) {
		       value = pad(2, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(2).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaMmDedDescTxt(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaPrsCreatSrcCd
	 *  Corresponding COBOL Variable is HVA-PRS-CREAT-SRC-CD
	 *	@return hvaPrsCreatSrcCd
	 */
	public List<char[]> getHvaPrsCreatSrcCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PRS_CREAT_SRC_CD_SIZE;index++) {
        	list.add( getHvaPrsCreatSrcCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaPrsCreatSrcCd
	 */
	public char[] getHvaPrsCreatSrcCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaPrsCreatSrcCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PRS_CREAT_SRC_CD_SIZE) {
             	index = HVA_PRS_CREAT_SRC_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaPrsCreatSrcCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_PRS_CREAT_SRC_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaPrsCreatSrcCd + index*HVA_PRS_CREAT_SRC_CD_LEN) , HVA_PRS_CREAT_SRC_CD_LEN );
    }
    
    
   public int  hvaPrsCreatSrcCdFieldLength() {
   	return HVA_PRS_CREAT_SRC_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaPrsCreatSrcCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PRS-CREAT-SRC-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaPrsCreatSrcCd(int index,char[] value) {
   	setHvaPrsCreatSrcCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaPrsCreatSrcCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaPrsCreatSrcCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaPrsCreatSrcCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 2)  {     
		       value = substring(value,0,2);
           }  else if (value.length < 2) {
		       value = pad(2, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(2).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaPrsCreatSrcCd(index,value);		
       }
   }
   

    /**
	 *	Returns the value of hvaBaseDedAmt
	 *  Corresponding COBOL Variable is HVA-BASE-DED-AMT
	 *	@return hvaBaseDedAmt
	 */
	public List<BigDecimal> getHvaBaseDedAmt() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < HVA_BASE_DED_AMT_SIZE;index++) {
        	list.add( getHvaBaseDedAmt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaBaseDedAmt
	 */
	public BigDecimal getHvaBaseDedAmt(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaBaseDedAmt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_BASE_DED_AMT_SIZE) {
             	index = HVA_BASE_DED_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaBaseDedAmt - Array index exceeded max Size "+HVA_BASE_DED_AMT_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginHvaBaseDedAmt+ index*HVA_BASE_DED_AMT_LEN ,
		HVA_BASE_DED_AMT_LEN, HVA_BASE_DED_AMT_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("hvaBaseDedAmt", beginHvaBaseDedAmt+ index*HVA_BASE_DED_AMT_LEN,HVA_BASE_DED_AMT_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean hvaBaseDedAmtIsNumeric(int index) {
	    return decimalIsNumeric( beginHvaBaseDedAmt+ index*HVA_BASE_DED_AMT_LEN ,HVA_BASE_DED_AMT_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is HVA-BASE-DED-AMT
	 *  @param index
	 *	@param number
	 */
	public void setHvaBaseDedAmt(int index,BigDecimal number) {	
		setHvaBaseDedAmt(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setHvaBaseDedAmt(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaBaseDedAmt(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= HVA_BASE_DED_AMT_SIZE) {
             	index = HVA_BASE_DED_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaBaseDedAmt - Array index exceeded max Size {}, resetting it to max allowed",HVA_BASE_DED_AMT_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 16) value =   truncate(value,16) ;
		if (setModified) {
			serializeHvaBaseDedAmt(index,value);
		}
   }


    /**
	 *	Returns the value of hvaBaseAmt
	 *  Corresponding COBOL Variable is HVA-BASE-AMT
	 *	@return hvaBaseAmt
	 */
	public List<BigDecimal> getHvaBaseAmt() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < HVA_BASE_AMT_SIZE;index++) {
        	list.add( getHvaBaseAmt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaBaseAmt
	 */
	public BigDecimal getHvaBaseAmt(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaBaseAmt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_BASE_AMT_SIZE) {
             	index = HVA_BASE_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaBaseAmt - Array index exceeded max Size "+HVA_BASE_AMT_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginHvaBaseAmt+ index*HVA_BASE_AMT_LEN ,
		HVA_BASE_AMT_LEN, HVA_BASE_AMT_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("hvaBaseAmt", beginHvaBaseAmt+ index*HVA_BASE_AMT_LEN,HVA_BASE_AMT_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean hvaBaseAmtIsNumeric(int index) {
	    return decimalIsNumeric( beginHvaBaseAmt+ index*HVA_BASE_AMT_LEN ,HVA_BASE_AMT_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is HVA-BASE-AMT
	 *  @param index
	 *	@param number
	 */
	public void setHvaBaseAmt(int index,BigDecimal number) {	
		setHvaBaseAmt(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setHvaBaseAmt(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaBaseAmt(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= HVA_BASE_AMT_SIZE) {
             	index = HVA_BASE_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaBaseAmt - Array index exceeded max Size {}, resetting it to max allowed",HVA_BASE_AMT_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 16) value =   truncate(value,16) ;
		if (setModified) {
			serializeHvaBaseAmt(index,value);
		}
   }


    /**
	 *	Returns the value of hvaMmDedAmt
	 *  Corresponding COBOL Variable is HVA-MM-DED-AMT
	 *	@return hvaMmDedAmt
	 */
	public List<BigDecimal> getHvaMmDedAmt() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < HVA_MM_DED_AMT_SIZE;index++) {
        	list.add( getHvaMmDedAmt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaMmDedAmt
	 */
	public BigDecimal getHvaMmDedAmt(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaMmDedAmt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_MM_DED_AMT_SIZE) {
             	index = HVA_MM_DED_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaMmDedAmt - Array index exceeded max Size "+HVA_MM_DED_AMT_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginHvaMmDedAmt+ index*HVA_MM_DED_AMT_LEN ,
		HVA_MM_DED_AMT_LEN, HVA_MM_DED_AMT_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("hvaMmDedAmt", beginHvaMmDedAmt+ index*HVA_MM_DED_AMT_LEN,HVA_MM_DED_AMT_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean hvaMmDedAmtIsNumeric(int index) {
	    return decimalIsNumeric( beginHvaMmDedAmt+ index*HVA_MM_DED_AMT_LEN ,HVA_MM_DED_AMT_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is HVA-MM-DED-AMT
	 *  @param index
	 *	@param number
	 */
	public void setHvaMmDedAmt(int index,BigDecimal number) {	
		setHvaMmDedAmt(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setHvaMmDedAmt(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaMmDedAmt(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= HVA_MM_DED_AMT_SIZE) {
             	index = HVA_MM_DED_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaMmDedAmt - Array index exceeded max Size {}, resetting it to max allowed",HVA_MM_DED_AMT_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 16) value =   truncate(value,16) ;
		if (setModified) {
			serializeHvaMmDedAmt(index,value);
		}
   }


    /**
	 *	Returns the value of hvaMmAmt
	 *  Corresponding COBOL Variable is HVA-MM-AMT
	 *	@return hvaMmAmt
	 */
	public List<BigDecimal> getHvaMmAmt() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < HVA_MM_AMT_SIZE;index++) {
        	list.add( getHvaMmAmt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaMmAmt
	 */
	public BigDecimal getHvaMmAmt(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaMmAmt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_MM_AMT_SIZE) {
             	index = HVA_MM_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaMmAmt - Array index exceeded max Size "+HVA_MM_AMT_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginHvaMmAmt+ index*HVA_MM_AMT_LEN ,
		HVA_MM_AMT_LEN, HVA_MM_AMT_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("hvaMmAmt", beginHvaMmAmt+ index*HVA_MM_AMT_LEN,HVA_MM_AMT_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean hvaMmAmtIsNumeric(int index) {
	    return decimalIsNumeric( beginHvaMmAmt+ index*HVA_MM_AMT_LEN ,HVA_MM_AMT_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is HVA-MM-AMT
	 *  @param index
	 *	@param number
	 */
	public void setHvaMmAmt(int index,BigDecimal number) {	
		setHvaMmAmt(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setHvaMmAmt(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaMmAmt(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= HVA_MM_AMT_SIZE) {
             	index = HVA_MM_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaMmAmt - Array index exceeded max Size {}, resetting it to max allowed",HVA_MM_AMT_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 16) value =   truncate(value,16) ;
		if (setModified) {
			serializeHvaMmAmt(index,value);
		}
   }


    /**
	 *	Returns the value of hvaMcCrResAmt
	 *  Corresponding COBOL Variable is HVA-MC-CR-RES-AMT
	 *	@return hvaMcCrResAmt
	 */
	public List<BigDecimal> getHvaMcCrResAmt() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < HVA_MC_CR_RES_AMT_SIZE;index++) {
        	list.add( getHvaMcCrResAmt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaMcCrResAmt
	 */
	public BigDecimal getHvaMcCrResAmt(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaMcCrResAmt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_MC_CR_RES_AMT_SIZE) {
             	index = HVA_MC_CR_RES_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaMcCrResAmt - Array index exceeded max Size "+HVA_MC_CR_RES_AMT_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginHvaMcCrResAmt+ index*HVA_MC_CR_RES_AMT_LEN ,
		HVA_MC_CR_RES_AMT_LEN, HVA_MC_CR_RES_AMT_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("hvaMcCrResAmt", beginHvaMcCrResAmt+ index*HVA_MC_CR_RES_AMT_LEN,HVA_MC_CR_RES_AMT_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean hvaMcCrResAmtIsNumeric(int index) {
	    return decimalIsNumeric( beginHvaMcCrResAmt+ index*HVA_MC_CR_RES_AMT_LEN ,HVA_MC_CR_RES_AMT_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is HVA-MC-CR-RES-AMT
	 *  @param index
	 *	@param number
	 */
	public void setHvaMcCrResAmt(int index,BigDecimal number) {	
		setHvaMcCrResAmt(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setHvaMcCrResAmt(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaMcCrResAmt(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= HVA_MC_CR_RES_AMT_SIZE) {
             	index = HVA_MC_CR_RES_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaMcCrResAmt - Array index exceeded max Size {}, resetting it to max allowed",HVA_MC_CR_RES_AMT_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 16) value =   truncate(value,16) ;
		if (setModified) {
			serializeHvaMcCrResAmt(index,value);
		}
   }


    /**
	 *	Returns the value of hvaCobCrResAmt
	 *  Corresponding COBOL Variable is HVA-COB-CR-RES-AMT
	 *	@return hvaCobCrResAmt
	 */
	public List<BigDecimal> getHvaCobCrResAmt() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < HVA_COB_CR_RES_AMT_SIZE;index++) {
        	list.add( getHvaCobCrResAmt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaCobCrResAmt
	 */
	public BigDecimal getHvaCobCrResAmt(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaCobCrResAmt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_COB_CR_RES_AMT_SIZE) {
             	index = HVA_COB_CR_RES_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaCobCrResAmt - Array index exceeded max Size "+HVA_COB_CR_RES_AMT_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginHvaCobCrResAmt+ index*HVA_COB_CR_RES_AMT_LEN ,
		HVA_COB_CR_RES_AMT_LEN, HVA_COB_CR_RES_AMT_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("hvaCobCrResAmt", beginHvaCobCrResAmt+ index*HVA_COB_CR_RES_AMT_LEN,HVA_COB_CR_RES_AMT_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean hvaCobCrResAmtIsNumeric(int index) {
	    return decimalIsNumeric( beginHvaCobCrResAmt+ index*HVA_COB_CR_RES_AMT_LEN ,HVA_COB_CR_RES_AMT_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is HVA-COB-CR-RES-AMT
	 *  @param index
	 *	@param number
	 */
	public void setHvaCobCrResAmt(int index,BigDecimal number) {	
		setHvaCobCrResAmt(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setHvaCobCrResAmt(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaCobCrResAmt(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= HVA_COB_CR_RES_AMT_SIZE) {
             	index = HVA_COB_CR_RES_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaCobCrResAmt - Array index exceeded max Size {}, resetting it to max allowed",HVA_COB_CR_RES_AMT_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 16) value =   truncate(value,16) ;
		if (setModified) {
			serializeHvaCobCrResAmt(index,value);
		}
   }

    /**
	 *	Returns the value of hvaParInd
	 *  Corresponding COBOL Variable is HVA-PAR-IND
	 *	@return hvaParInd
	 */
	public List<char[]> getHvaParInd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PAR_IND_SIZE;index++) {
        	list.add( getHvaParInd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaParInd
	 */
	public char[] getHvaParInd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaParInd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PAR_IND_SIZE) {
             	index = HVA_PAR_IND_SIZE -1; // can't exceed max array size
             	logger.trace("hvaParInd - Array index exceeded max Size {}, resetting it to max allowed",HVA_PAR_IND_SIZE); 
	    }
   	      return getCharArray( (beginHvaParInd + index*HVA_PAR_IND_LEN) , HVA_PAR_IND_LEN );
    }
    
    
   public int  hvaParIndFieldLength() {
   	return HVA_PAR_IND_LEN;
   }
   
	

  
  	/**
	 *	Update HvaParInd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PAR-IND
	 *  @param index
	 *	@param value
	 */
  public void setHvaParInd(int index,char[] value) {
   	setHvaParInd(index,value,true);
   }
   
   
   /**
	 *	Update HvaParInd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaParInd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaParInd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaParInd(index,value);		
       }
   }
   

    /**
	 *	Returns the value of hvaSupAmt
	 *  Corresponding COBOL Variable is HVA-SUP-AMT
	 *	@return hvaSupAmt
	 */
	public List<BigDecimal> getHvaSupAmt() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < HVA_SUP_AMT_SIZE;index++) {
        	list.add( getHvaSupAmt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaSupAmt
	 */
	public BigDecimal getHvaSupAmt(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaSupAmt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_SUP_AMT_SIZE) {
             	index = HVA_SUP_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaSupAmt - Array index exceeded max Size "+HVA_SUP_AMT_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginHvaSupAmt+ index*HVA_SUP_AMT_LEN ,
		HVA_SUP_AMT_LEN, HVA_SUP_AMT_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("hvaSupAmt", beginHvaSupAmt+ index*HVA_SUP_AMT_LEN,HVA_SUP_AMT_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean hvaSupAmtIsNumeric(int index) {
	    return decimalIsNumeric( beginHvaSupAmt+ index*HVA_SUP_AMT_LEN ,HVA_SUP_AMT_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is HVA-SUP-AMT
	 *  @param index
	 *	@param number
	 */
	public void setHvaSupAmt(int index,BigDecimal number) {	
		setHvaSupAmt(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setHvaSupAmt(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaSupAmt(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= HVA_SUP_AMT_SIZE) {
             	index = HVA_SUP_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaSupAmt - Array index exceeded max Size {}, resetting it to max allowed",HVA_SUP_AMT_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 16) value =   truncate(value,16) ;
		if (setModified) {
			serializeHvaSupAmt(index,value);
		}
   }

    /**
	 *	Returns the value of hvaProvMktNbr
	 *  Corresponding COBOL Variable is HVA-PROV-MKT-NBR
	 *	@return hvaProvMktNbr
	 */
	public List<char[]> getHvaProvMktNbr() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PROV_MKT_NBR_SIZE;index++) {
        	list.add( getHvaProvMktNbr( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaProvMktNbr
	 */
	public char[] getHvaProvMktNbr(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaProvMktNbr(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PROV_MKT_NBR_SIZE) {
             	index = HVA_PROV_MKT_NBR_SIZE -1; // can't exceed max array size
             	logger.trace("hvaProvMktNbr - Array index exceeded max Size {}, resetting it to max allowed",HVA_PROV_MKT_NBR_SIZE); 
	    }
   	      return getCharArray( (beginHvaProvMktNbr + index*HVA_PROV_MKT_NBR_LEN) , HVA_PROV_MKT_NBR_LEN );
    }
    
    
   public int  hvaProvMktNbrFieldLength() {
   	return HVA_PROV_MKT_NBR_LEN;
   }
   
	

  
  	/**
	 *	Update HvaProvMktNbr with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PROV-MKT-NBR
	 *  @param index
	 *	@param value
	 */
  public void setHvaProvMktNbr(int index,char[] value) {
   	setHvaProvMktNbr(index,value,true);
   }
   
   
   /**
	 *	Update HvaProvMktNbr with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaProvMktNbr(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaProvMktNbr(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 7)  {     
		       value = substring(value,0,7);
           }  else if (value.length < 7) {
		       value = pad(7, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(7).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaProvMktNbr(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaPpoCd
	 *  Corresponding COBOL Variable is HVA-PPO-CD
	 *	@return hvaPpoCd
	 */
	public List<char[]> getHvaPpoCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PPO_CD_SIZE;index++) {
        	list.add( getHvaPpoCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaPpoCd
	 */
	public char[] getHvaPpoCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaPpoCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PPO_CD_SIZE) {
             	index = HVA_PPO_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaPpoCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_PPO_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaPpoCd + index*HVA_PPO_CD_LEN) , HVA_PPO_CD_LEN );
    }
    
    
   public int  hvaPpoCdFieldLength() {
   	return HVA_PPO_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaPpoCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PPO-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaPpoCd(int index,char[] value) {
   	setHvaPpoCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaPpoCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaPpoCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaPpoCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaPpoCd(index,value);		
       }
   }
   

    /**
	 *	Returns the value of hvaPtntRespAmt
	 *  Corresponding COBOL Variable is HVA-PTNT-RESP-AMT
	 *	@return hvaPtntRespAmt
	 */
	public List<BigDecimal> getHvaPtntRespAmt() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < HVA_PTNT_RESP_AMT_SIZE;index++) {
        	list.add( getHvaPtntRespAmt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaPtntRespAmt
	 */
	public BigDecimal getHvaPtntRespAmt(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaPtntRespAmt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PTNT_RESP_AMT_SIZE) {
             	index = HVA_PTNT_RESP_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaPtntRespAmt - Array index exceeded max Size "+HVA_PTNT_RESP_AMT_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginHvaPtntRespAmt+ index*HVA_PTNT_RESP_AMT_LEN ,
		HVA_PTNT_RESP_AMT_LEN, HVA_PTNT_RESP_AMT_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("hvaPtntRespAmt", beginHvaPtntRespAmt+ index*HVA_PTNT_RESP_AMT_LEN,HVA_PTNT_RESP_AMT_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean hvaPtntRespAmtIsNumeric(int index) {
	    return decimalIsNumeric( beginHvaPtntRespAmt+ index*HVA_PTNT_RESP_AMT_LEN ,HVA_PTNT_RESP_AMT_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is HVA-PTNT-RESP-AMT
	 *  @param index
	 *	@param number
	 */
	public void setHvaPtntRespAmt(int index,BigDecimal number) {	
		setHvaPtntRespAmt(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setHvaPtntRespAmt(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaPtntRespAmt(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= HVA_PTNT_RESP_AMT_SIZE) {
             	index = HVA_PTNT_RESP_AMT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaPtntRespAmt - Array index exceeded max Size {}, resetting it to max allowed",HVA_PTNT_RESP_AMT_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 16) value =   truncate(value,16) ;
		if (setModified) {
			serializeHvaPtntRespAmt(index,value);
		}
   }

    /**
	 *	Returns the value of hvaAuthSrcId
	 *  Corresponding COBOL Variable is HVA-AUTH-SRC-ID
	 *	@return hvaAuthSrcId
	 */
	public List<char[]> getHvaAuthSrcId() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_AUTH_SRC_ID_SIZE;index++) {
        	list.add( getHvaAuthSrcId( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaAuthSrcId
	 */
	public char[] getHvaAuthSrcId(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaAuthSrcId(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_AUTH_SRC_ID_SIZE) {
             	index = HVA_AUTH_SRC_ID_SIZE -1; // can't exceed max array size
             	logger.trace("hvaAuthSrcId - Array index exceeded max Size {}, resetting it to max allowed",HVA_AUTH_SRC_ID_SIZE); 
	    }
   	      return getCharArray( (beginHvaAuthSrcId + index*HVA_AUTH_SRC_ID_LEN) , HVA_AUTH_SRC_ID_LEN );
    }
    
    
   public int  hvaAuthSrcIdFieldLength() {
   	return HVA_AUTH_SRC_ID_LEN;
   }
   
	

  
  	/**
	 *	Update HvaAuthSrcId with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-AUTH-SRC-ID
	 *  @param index
	 *	@param value
	 */
  public void setHvaAuthSrcId(int index,char[] value) {
   	setHvaAuthSrcId(index,value,true);
   }
   
   
   /**
	 *	Update HvaAuthSrcId with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaAuthSrcId(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaAuthSrcId(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 3)  {     
		       value = substring(value,0,3);
           }  else if (value.length < 3) {
		       value = pad(3, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(3).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaAuthSrcId(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaAuthProcCd
	 *  Corresponding COBOL Variable is HVA-AUTH-PROC-CD
	 *	@return hvaAuthProcCd
	 */
	public List<char[]> getHvaAuthProcCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_AUTH_PROC_CD_SIZE;index++) {
        	list.add( getHvaAuthProcCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaAuthProcCd
	 */
	public char[] getHvaAuthProcCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaAuthProcCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_AUTH_PROC_CD_SIZE) {
             	index = HVA_AUTH_PROC_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaAuthProcCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_AUTH_PROC_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaAuthProcCd + index*HVA_AUTH_PROC_CD_LEN) , HVA_AUTH_PROC_CD_LEN );
    }
    
    
   public int  hvaAuthProcCdFieldLength() {
   	return HVA_AUTH_PROC_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaAuthProcCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-AUTH-PROC-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaAuthProcCd(int index,char[] value) {
   	setHvaAuthProcCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaAuthProcCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaAuthProcCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaAuthProcCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 5)  {     
		       value = substring(value,0,5);
           }  else if (value.length < 5) {
		       value = pad(5, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(5).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaAuthProcCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaProvNm
	 *  Corresponding COBOL Variable is HVA-PROV-NM
	 *	@return hvaProvNm
	 */
	public List<char[]> getHvaProvNm() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PROV_NM_SIZE;index++) {
        	list.add( getHvaProvNm( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaProvNm
	 */
	public char[] getHvaProvNm(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaProvNm(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PROV_NM_SIZE) {
             	index = HVA_PROV_NM_SIZE -1; // can't exceed max array size
             	logger.trace("hvaProvNm - Array index exceeded max Size {}, resetting it to max allowed",HVA_PROV_NM_SIZE); 
	    }
   	      return getCharArray( (beginHvaProvNm + index*HVA_PROV_NM_LEN) , HVA_PROV_NM_LEN );
    }
    
    
   public int  hvaProvNmFieldLength() {
   	return HVA_PROV_NM_LEN;
   }
   
	

  
  	/**
	 *	Update HvaProvNm with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PROV-NM
	 *  @param index
	 *	@param value
	 */
  public void setHvaProvNm(int index,char[] value) {
   	setHvaProvNm(index,value,true);
   }
   
   
   /**
	 *	Update HvaProvNm with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaProvNm(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaProvNm(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 30)  {     
		       value = substring(value,0,30);
           }  else if (value.length < 30) {
		       value = pad(30, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(30).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaProvNm(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaProvEobNm
	 *  Corresponding COBOL Variable is HVA-PROV-EOB-NM
	 *	@return hvaProvEobNm
	 */
	public List<char[]> getHvaProvEobNm() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PROV_EOB_NM_SIZE;index++) {
        	list.add( getHvaProvEobNm( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaProvEobNm
	 */
	public char[] getHvaProvEobNm(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaProvEobNm(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PROV_EOB_NM_SIZE) {
             	index = HVA_PROV_EOB_NM_SIZE -1; // can't exceed max array size
             	logger.trace("hvaProvEobNm - Array index exceeded max Size {}, resetting it to max allowed",HVA_PROV_EOB_NM_SIZE); 
	    }
   	      return getCharArray( (beginHvaProvEobNm + index*HVA_PROV_EOB_NM_LEN) , HVA_PROV_EOB_NM_LEN );
    }
    
    
   public int  hvaProvEobNmFieldLength() {
   	return HVA_PROV_EOB_NM_LEN;
   }
   
	

  
  	/**
	 *	Update HvaProvEobNm with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PROV-EOB-NM
	 *  @param index
	 *	@param value
	 */
  public void setHvaProvEobNm(int index,char[] value) {
   	setHvaProvEobNm(index,value,true);
   }
   
   
   /**
	 *	Update HvaProvEobNm with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaProvEobNm(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaProvEobNm(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 20)  {     
		       value = substring(value,0,20);
           }  else if (value.length < 20) {
		       value = pad(20, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(20).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaProvEobNm(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaProvPrdctCd
	 *  Corresponding COBOL Variable is HVA-PROV-PRDCT-CD
	 *	@return hvaProvPrdctCd
	 */
	public List<char[]> getHvaProvPrdctCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PROV_PRDCT_CD_SIZE;index++) {
        	list.add( getHvaProvPrdctCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaProvPrdctCd
	 */
	public char[] getHvaProvPrdctCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaProvPrdctCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PROV_PRDCT_CD_SIZE) {
             	index = HVA_PROV_PRDCT_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaProvPrdctCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_PROV_PRDCT_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaProvPrdctCd + index*HVA_PROV_PRDCT_CD_LEN) , HVA_PROV_PRDCT_CD_LEN );
    }
    
    
   public int  hvaProvPrdctCdFieldLength() {
   	return HVA_PROV_PRDCT_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaProvPrdctCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PROV-PRDCT-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaProvPrdctCd(int index,char[] value) {
   	setHvaProvPrdctCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaProvPrdctCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaProvPrdctCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaProvPrdctCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 3)  {     
		       value = substring(value,0,3);
           }  else if (value.length < 3) {
		       value = pad(3, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(3).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaProvPrdctCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaProvMktTypCd
	 *  Corresponding COBOL Variable is HVA-PROV-MKT-TYP-CD
	 *	@return hvaProvMktTypCd
	 */
	public List<char[]> getHvaProvMktTypCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PROV_MKT_TYP_CD_SIZE;index++) {
        	list.add( getHvaProvMktTypCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaProvMktTypCd
	 */
	public char[] getHvaProvMktTypCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaProvMktTypCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PROV_MKT_TYP_CD_SIZE) {
             	index = HVA_PROV_MKT_TYP_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaProvMktTypCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_PROV_MKT_TYP_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaProvMktTypCd + index*HVA_PROV_MKT_TYP_CD_LEN) , HVA_PROV_MKT_TYP_CD_LEN );
    }
    
    
   public int  hvaProvMktTypCdFieldLength() {
   	return HVA_PROV_MKT_TYP_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaProvMktTypCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PROV-MKT-TYP-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaProvMktTypCd(int index,char[] value) {
   	setHvaProvMktTypCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaProvMktTypCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaProvMktTypCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaProvMktTypCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 2)  {     
		       value = substring(value,0,2);
           }  else if (value.length < 2) {
		       value = pad(2, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(2).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaProvMktTypCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaProvIpaId
	 *  Corresponding COBOL Variable is HVA-PROV-IPA-ID
	 *	@return hvaProvIpaId
	 */
	public List<char[]> getHvaProvIpaId() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PROV_IPA_ID_SIZE;index++) {
        	list.add( getHvaProvIpaId( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaProvIpaId
	 */
	public char[] getHvaProvIpaId(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaProvIpaId(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PROV_IPA_ID_SIZE) {
             	index = HVA_PROV_IPA_ID_SIZE -1; // can't exceed max array size
             	logger.trace("hvaProvIpaId - Array index exceeded max Size {}, resetting it to max allowed",HVA_PROV_IPA_ID_SIZE); 
	    }
   	      return getCharArray( (beginHvaProvIpaId + index*HVA_PROV_IPA_ID_LEN) , HVA_PROV_IPA_ID_LEN );
    }
    
    
   public int  hvaProvIpaIdFieldLength() {
   	return HVA_PROV_IPA_ID_LEN;
   }
   
	

  
  	/**
	 *	Update HvaProvIpaId with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PROV-IPA-ID
	 *  @param index
	 *	@param value
	 */
  public void setHvaProvIpaId(int index,char[] value) {
   	setHvaProvIpaId(index,value,true);
   }
   
   
   /**
	 *	Update HvaProvIpaId with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaProvIpaId(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaProvIpaId(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 5)  {     
		       value = substring(value,0,5);
           }  else if (value.length < 5) {
		       value = pad(5, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(5).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaProvIpaId(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaTpsmCd
	 *  Corresponding COBOL Variable is HVA-TPSM-CD
	 *	@return hvaTpsmCd
	 */
	public List<char[]> getHvaTpsmCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_TPSM_CD_SIZE;index++) {
        	list.add( getHvaTpsmCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaTpsmCd
	 */
	public char[] getHvaTpsmCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaTpsmCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_TPSM_CD_SIZE) {
             	index = HVA_TPSM_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaTpsmCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_TPSM_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaTpsmCd + index*HVA_TPSM_CD_LEN) , HVA_TPSM_CD_LEN );
    }
    
    
   public int  hvaTpsmCdFieldLength() {
   	return HVA_TPSM_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaTpsmCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-TPSM-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaTpsmCd(int index,char[] value) {
   	setHvaTpsmCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaTpsmCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaTpsmCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaTpsmCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 3)  {     
		       value = substring(value,0,3);
           }  else if (value.length < 3) {
		       value = pad(3, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(3).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaTpsmCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaProvSpclCd
	 *  Corresponding COBOL Variable is HVA-PROV-SPCL-CD
	 *	@return hvaProvSpclCd
	 */
	public List<char[]> getHvaProvSpclCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PROV_SPCL_CD_SIZE;index++) {
        	list.add( getHvaProvSpclCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaProvSpclCd
	 */
	public char[] getHvaProvSpclCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaProvSpclCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PROV_SPCL_CD_SIZE) {
             	index = HVA_PROV_SPCL_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaProvSpclCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_PROV_SPCL_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaProvSpclCd + index*HVA_PROV_SPCL_CD_LEN) , HVA_PROV_SPCL_CD_LEN );
    }
    
    
   public int  hvaProvSpclCdFieldLength() {
   	return HVA_PROV_SPCL_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaProvSpclCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PROV-SPCL-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaProvSpclCd(int index,char[] value) {
   	setHvaProvSpclCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaProvSpclCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaProvSpclCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaProvSpclCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 3)  {     
		       value = substring(value,0,3);
           }  else if (value.length < 3) {
		       value = pad(3, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(3).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaProvSpclCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaProvMedcdReclmInd
	 *  Corresponding COBOL Variable is HVA-PROV-MEDCD-RECLM-IND
	 *	@return hvaProvMedcdReclmInd
	 */
	public List<char[]> getHvaProvMedcdReclmInd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PROV_MEDCD_RECLM_IND_SIZE;index++) {
        	list.add( getHvaProvMedcdReclmInd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaProvMedcdReclmInd
	 */
	public char[] getHvaProvMedcdReclmInd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaProvMedcdReclmInd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PROV_MEDCD_RECLM_IND_SIZE) {
             	index = HVA_PROV_MEDCD_RECLM_IND_SIZE -1; // can't exceed max array size
             	logger.trace("hvaProvMedcdReclmInd - Array index exceeded max Size {}, resetting it to max allowed",HVA_PROV_MEDCD_RECLM_IND_SIZE); 
	    }
   	      return getCharArray( (beginHvaProvMedcdReclmInd + index*HVA_PROV_MEDCD_RECLM_IND_LEN) , HVA_PROV_MEDCD_RECLM_IND_LEN );
    }
    
    
   public int  hvaProvMedcdReclmIndFieldLength() {
   	return HVA_PROV_MEDCD_RECLM_IND_LEN;
   }
   
	

  
  	/**
	 *	Update HvaProvMedcdReclmInd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-PROV-MEDCD-RECLM-IND
	 *  @param index
	 *	@param value
	 */
  public void setHvaProvMedcdReclmInd(int index,char[] value) {
   	setHvaProvMedcdReclmInd(index,value,true);
   }
   
   
   /**
	 *	Update HvaProvMedcdReclmInd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaProvMedcdReclmInd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaProvMedcdReclmInd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaProvMedcdReclmInd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaRelSrvcClmLvlInd
	 *  Corresponding COBOL Variable is HVA-REL-SRVC-CLM-LVL-IND
	 *	@return hvaRelSrvcClmLvlInd
	 */
	public List<char[]> getHvaRelSrvcClmLvlInd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_REL_SRVC_CLM_LVL_IND_SIZE;index++) {
        	list.add( getHvaRelSrvcClmLvlInd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaRelSrvcClmLvlInd
	 */
	public char[] getHvaRelSrvcClmLvlInd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaRelSrvcClmLvlInd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_REL_SRVC_CLM_LVL_IND_SIZE) {
             	index = HVA_REL_SRVC_CLM_LVL_IND_SIZE -1; // can't exceed max array size
             	logger.trace("hvaRelSrvcClmLvlInd - Array index exceeded max Size {}, resetting it to max allowed",HVA_REL_SRVC_CLM_LVL_IND_SIZE); 
	    }
   	      return getCharArray( (beginHvaRelSrvcClmLvlInd + index*HVA_REL_SRVC_CLM_LVL_IND_LEN) , HVA_REL_SRVC_CLM_LVL_IND_LEN );
    }
    
    
   public int  hvaRelSrvcClmLvlIndFieldLength() {
   	return HVA_REL_SRVC_CLM_LVL_IND_LEN;
   }
   
	

  
  	/**
	 *	Update HvaRelSrvcClmLvlInd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-REL-SRVC-CLM-LVL-IND
	 *  @param index
	 *	@param value
	 */
  public void setHvaRelSrvcClmLvlInd(int index,char[] value) {
   	setHvaRelSrvcClmLvlInd(index,value,true);
   }
   
   
   /**
	 *	Update HvaRelSrvcClmLvlInd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaRelSrvcClmLvlInd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaRelSrvcClmLvlInd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaRelSrvcClmLvlInd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaDiagCd
	 *  Corresponding COBOL Variable is HVA-DIAG-CD
	 *	@return hvaDiagCd
	 */
	public List<char[]> getHvaDiagCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HVA_DIAG_CD_SIZE;index++) {
        	list.add( getHvaDiagCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hvaDiagCd
	 */
	public char[] getHvaDiagCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaDiagCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_DIAG_CD_SIZE) {
             	index = HVA_DIAG_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hvaDiagCd - Array index exceeded max Size {}, resetting it to max allowed",HVA_DIAG_CD_SIZE); 
	    }
   	      return getCharArray( (beginHvaDiagCd + index*HVA_DIAG_CD_LEN) , HVA_DIAG_CD_LEN );
    }
    
    
   public int  hvaDiagCdFieldLength() {
   	return HVA_DIAG_CD_LEN;
   }
   
	

  
  	/**
	 *	Update HvaDiagCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HVA-DIAG-CD
	 *  @param index
	 *	@param value
	 */
  public void setHvaDiagCd(int index,char[] value) {
   	setHvaDiagCd(index,value,true);
   }
   
   
   /**
	 *	Update HvaDiagCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHvaDiagCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaDiagCd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 7)  {     
		       value = substring(value,0,7);
           }  else if (value.length < 7) {
		       value = pad(7, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(7).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeHvaDiagCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hvaAuthUniqCnt
	 *  Corresponding COBOL Variable is HVA-AUTH-UNIQ-CNT
	 *	@return hvaAuthUniqCnt
	 */
	public List<Integer> getHvaAuthUniqCnt() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < HVA_AUTH_UNIQ_CNT_SIZE;index++) {
        	list.add( getHvaAuthUniqCnt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return hvaAuthUniqCnt
	 */
	public int getHvaAuthUniqCnt(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaAuthUniqCnt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_AUTH_UNIQ_CNT_SIZE) {
             	index = HVA_AUTH_UNIQ_CNT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaAuthUniqCnt - Array index exceeded max Size {}, resetting it to max allowed",HVA_AUTH_UNIQ_CNT_SIZE); 
	    }   
		return getInt(beginHvaAuthUniqCnt+ index*HVA_AUTH_UNIQ_CNT_LEN);
   }
	
	/**
	 *	Update HvaAuthUniqCnt at index with the passed value
	 *  Corresponding COBOL Variable is HVA-AUTH-UNIQ-CNT
	 *  @param index
	 *	@param number
	 */
	public void setHvaAuthUniqCnt(int index,int number) {
	   truncated = false; // reset left over truncated flag
		setHvaAuthUniqCnt(index,number, true);
	}
	
	public void setHvaAuthUniqCnt(int index,long number) {
			setHvaAuthUniqCnt(index,(int)number, true);
	}
	
	/**
	 *	Update  HvaAuthUniqCnt at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setHvaAuthUniqCnt(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaAuthUniqCnt(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_AUTH_UNIQ_CNT_SIZE) {
             	index = HVA_AUTH_UNIQ_CNT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaAuthUniqCnt - Array index exceeded max Size "+HVA_AUTH_UNIQ_CNT_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeHvaAuthUniqCnt(index,value);
		}
   }
    /**
	 *	Returns the value of hvaPhysMedcnMskCnt
	 *  Corresponding COBOL Variable is HVA-PHYS-MEDCN-MSK-CNT
	 *	@return hvaPhysMedcnMskCnt
	 */
	public List<Integer> getHvaPhysMedcnMskCnt() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < HVA_PHYS_MEDCN_MSK_CNT_SIZE;index++) {
        	list.add( getHvaPhysMedcnMskCnt( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return hvaPhysMedcnMskCnt
	 */
	public int getHvaPhysMedcnMskCnt(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaPhysMedcnMskCnt(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PHYS_MEDCN_MSK_CNT_SIZE) {
             	index = HVA_PHYS_MEDCN_MSK_CNT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaPhysMedcnMskCnt - Array index exceeded max Size {}, resetting it to max allowed",HVA_PHYS_MEDCN_MSK_CNT_SIZE); 
	    }   
		return getInt(beginHvaPhysMedcnMskCnt+ index*HVA_PHYS_MEDCN_MSK_CNT_LEN);
   }
	
	/**
	 *	Update HvaPhysMedcnMskCnt at index with the passed value
	 *  Corresponding COBOL Variable is HVA-PHYS-MEDCN-MSK-CNT
	 *  @param index
	 *	@param number
	 */
	public void setHvaPhysMedcnMskCnt(int index,int number) {
	   truncated = false; // reset left over truncated flag
		setHvaPhysMedcnMskCnt(index,number, true);
	}
	
	public void setHvaPhysMedcnMskCnt(int index,long number) {
			setHvaPhysMedcnMskCnt(index,(int)number, true);
	}
	
	/**
	 *	Update  HvaPhysMedcnMskCnt at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setHvaPhysMedcnMskCnt(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaPhysMedcnMskCnt(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_PHYS_MEDCN_MSK_CNT_SIZE) {
             	index = HVA_PHYS_MEDCN_MSK_CNT_SIZE -1; // can't exceed max array size
             	logger.trace("hvaPhysMedcnMskCnt - Array index exceeded max Size "+HVA_PHYS_MEDCN_MSK_CNT_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeHvaPhysMedcnMskCnt(index,value);
		}
   }
    /**
	 *	Returns the value of hvaMskNullInd
	 *  Corresponding COBOL Variable is HVA-MSK-NULL-IND
	 *	@return hvaMskNullInd
	 */
	public List<Short> getHvaMskNullInd() throws CFException {
        List<Short>	list = new ArrayList<>();  
        for (int index =0;index < HVA_MSK_NULL_IND_SIZE;index++) {
        	list.add( getHvaMskNullInd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return hvaMskNullInd
	 */
	public short getHvaMskNullInd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHvaMskNullInd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_MSK_NULL_IND_SIZE) {
             	index = HVA_MSK_NULL_IND_SIZE -1; // can't exceed max array size
             	logger.trace("hvaMskNullInd - Array index exceeded max Size {}, resetting it to max allowed",HVA_MSK_NULL_IND_SIZE); 
	    }   
         return getShort(beginHvaMskNullInd+ index*HVA_MSK_NULL_IND_LEN);
   }
	
	/**
	 *	Update HvaMskNullInd at index with the passed value
	 *  Corresponding COBOL Variable is HVA-MSK-NULL-IND
	 *  @param index
	 *	@param number
	 */
	public void setHvaMskNullInd(int index,short number) {
	   truncated = false; // reset left over truncated flag
		setHvaMskNullInd(index,number, true);
	}
	
	public void setHvaMskNullInd(int index,int number) {
		setHvaMskNullInd(index,(short)number, true);
	}
	public void setHvaMskNullInd(int index,long number) {
			setHvaMskNullInd(index,(short)number, true);
	}
	
	/**
	 *	Update  HvaMskNullInd at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setHvaMskNullInd(int index,short value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHvaMskNullInd(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= HVA_MSK_NULL_IND_SIZE) {
             	index = HVA_MSK_NULL_IND_SIZE -1; // can't exceed max array size
             	logger.trace("hvaMskNullInd - Array index exceeded max Size "+HVA_MSK_NULL_IND_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeHvaMskNullInd(index,value);
		}
   }

	
	
	

		public static int getHvaClmHistArrayFieldLength() {
			return HVA_CLM_HIST_ARRAY_LENGTH;
		}

}
  
