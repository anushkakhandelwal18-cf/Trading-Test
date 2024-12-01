package com.cloudframe.app.dto.d529351u;

/**
*  The class HvHostVariablesCsplnv is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class HvHostVariablesCsplnv extends HvHostVariablesCsplnvSerialized { 
   
      private List<char[]> hv01SpiTblId; 

      private List<char[]> hv0aPriDiagInd; 

      private List<char[]> hv14PosTierTypCd; 

      private List<char[]> hv15MjrDiagEligInd; 

	
	/**
	* Constructor for HvHostVariablesCsplnv
	**/
    public HvHostVariablesCsplnv() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of hv01SpiTblId
	 *  Corresponding COBOL Variable is HV01-SPI-TBL-ID
	 *	@return hv01SpiTblId
	 */
	public List<char[]> getHv01SpiTblId() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_01_SPI_TBL_ID_SIZE;index++) {
        	list.add( getHv01SpiTblId( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv01SpiTblId
	 */
	public char[] getHv01SpiTblId(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv01SpiTblId(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_01_SPI_TBL_ID_SIZE) {
             	index = HV_01_SPI_TBL_ID_SIZE -1; // can't exceed max array size
             	logger.trace("hv01SpiTblId - Array index exceeded max Size {}, resetting it to max allowed",HV_01_SPI_TBL_ID_SIZE); 
	    }
   	      return getCharArray( (beginHv01SpiTblId + index*HV_01_SPI_TBL_ID_LEN) , HV_01_SPI_TBL_ID_LEN );
    }
    
    
   public int  hv01SpiTblIdFieldLength() {
   	return HV_01_SPI_TBL_ID_LEN;
   }
   
	

  
  	/**
	 *	Update Hv01SpiTblId with the passed value at a given index
	 *  Corresponding COBOL Variable is HV01-SPI-TBL-ID
	 *  @param index
	 *	@param value
	 */
  public void setHv01SpiTblId(int index,char[] value) {
   	setHv01SpiTblId(index,value,true);
   }
   
   
   /**
	 *	Update Hv01SpiTblId with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv01SpiTblId(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv01SpiTblId(int,String,boolean), reset it to 0",index);
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
		serializeHv01SpiTblId(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv0aPriDiagInd
	 *  Corresponding COBOL Variable is HV0A-PRI-DIAG-IND
	 *	@return hv0aPriDiagInd
	 */
	public List<char[]> getHv0aPriDiagInd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_0A_PRI_DIAG_IND_SIZE;index++) {
        	list.add( getHv0aPriDiagInd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv0aPriDiagInd
	 */
	public char[] getHv0aPriDiagInd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv0aPriDiagInd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_0A_PRI_DIAG_IND_SIZE) {
             	index = HV_0A_PRI_DIAG_IND_SIZE -1; // can't exceed max array size
             	logger.trace("hv0aPriDiagInd - Array index exceeded max Size {}, resetting it to max allowed",HV_0A_PRI_DIAG_IND_SIZE); 
	    }
   	      return getCharArray( (beginHv0aPriDiagInd + index*HV_0A_PRI_DIAG_IND_LEN) , HV_0A_PRI_DIAG_IND_LEN );
    }
    
    
   public int  hv0aPriDiagIndFieldLength() {
   	return HV_0A_PRI_DIAG_IND_LEN;
   }
   
	

  
  	/**
	 *	Update Hv0aPriDiagInd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV0A-PRI-DIAG-IND
	 *  @param index
	 *	@param value
	 */
  public void setHv0aPriDiagInd(int index,char[] value) {
   	setHv0aPriDiagInd(index,value,true);
   }
   
   
   /**
	 *	Update Hv0aPriDiagInd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv0aPriDiagInd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv0aPriDiagInd(int,String,boolean), reset it to 0",index);
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
		serializeHv0aPriDiagInd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv14PosTierTypCd
	 *  Corresponding COBOL Variable is HV14-POS-TIER-TYP-CD
	 *	@return hv14PosTierTypCd
	 */
	public List<char[]> getHv14PosTierTypCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_14_POS_TIER_TYP_CD_SIZE;index++) {
        	list.add( getHv14PosTierTypCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv14PosTierTypCd
	 */
	public char[] getHv14PosTierTypCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv14PosTierTypCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_14_POS_TIER_TYP_CD_SIZE) {
             	index = HV_14_POS_TIER_TYP_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv14PosTierTypCd - Array index exceeded max Size {}, resetting it to max allowed",HV_14_POS_TIER_TYP_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv14PosTierTypCd + index*HV_14_POS_TIER_TYP_CD_LEN) , HV_14_POS_TIER_TYP_CD_LEN );
    }
    
    
   public int  hv14PosTierTypCdFieldLength() {
   	return HV_14_POS_TIER_TYP_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv14PosTierTypCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV14-POS-TIER-TYP-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv14PosTierTypCd(int index,char[] value) {
   	setHv14PosTierTypCd(index,value,true);
   }
   
   
   /**
	 *	Update Hv14PosTierTypCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv14PosTierTypCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv14PosTierTypCd(int,String,boolean), reset it to 0",index);
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
		serializeHv14PosTierTypCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv15MjrDiagEligInd
	 *  Corresponding COBOL Variable is HV15-MJR-DIAG-ELIG-IND
	 *	@return hv15MjrDiagEligInd
	 */
	public List<char[]> getHv15MjrDiagEligInd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_15_MJR_DIAG_ELIG_IND_SIZE;index++) {
        	list.add( getHv15MjrDiagEligInd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv15MjrDiagEligInd
	 */
	public char[] getHv15MjrDiagEligInd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv15MjrDiagEligInd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_15_MJR_DIAG_ELIG_IND_SIZE) {
             	index = HV_15_MJR_DIAG_ELIG_IND_SIZE -1; // can't exceed max array size
             	logger.trace("hv15MjrDiagEligInd - Array index exceeded max Size {}, resetting it to max allowed",HV_15_MJR_DIAG_ELIG_IND_SIZE); 
	    }
   	      return getCharArray( (beginHv15MjrDiagEligInd + index*HV_15_MJR_DIAG_ELIG_IND_LEN) , HV_15_MJR_DIAG_ELIG_IND_LEN );
    }
    
    
   public int  hv15MjrDiagEligIndFieldLength() {
   	return HV_15_MJR_DIAG_ELIG_IND_LEN;
   }
   
	

  
  	/**
	 *	Update Hv15MjrDiagEligInd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV15-MJR-DIAG-ELIG-IND
	 *  @param index
	 *	@param value
	 */
  public void setHv15MjrDiagEligInd(int index,char[] value) {
   	setHv15MjrDiagEligInd(index,value,true);
   }
   
   
   /**
	 *	Update Hv15MjrDiagEligInd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv15MjrDiagEligInd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv15MjrDiagEligInd(int,String,boolean), reset it to 0",index);
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
		serializeHv15MjrDiagEligInd(index,value);		
       }
   }
   

	
	
	

		public static int getHvHostVariablesCsplnvFieldLength() {
			return HV_HOST_VARIABLES_CSPLNV_LENGTH;
		}

}
  
