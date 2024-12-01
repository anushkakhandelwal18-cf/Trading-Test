package com.cloudframe.app.dto.d529351u;

/**
*  The class HvHostVariablesCombcr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class HvHostVariablesCombcr extends HvHostVariablesCombcrSerialized { 
   
      private List<char[]> hv2aRecTypCd; 

      private List<char[]> hv2bDerivPlOfSvcCd; 

      private List<char[]> hv2cDerivSvcCd; 

      private List<char[]> hv2dDerivCausCd; 

      private List<char[]> hv2eClmCaus1Cd; 

      private List<char[]> hv2fClmCaus2Cd; 

      private List<char[]> hv2gClmCaus3Cd; 

      private List<char[]> hv2hClmCaus4Cd; 

      private List<char[]> hv2iClmCaus5Cd; 

      private List<char[]> hv2jClmCaus6Cd; 

      private List<char[]> hv2kClmCaus7Cd; 

      private List<char[]> hv2lClmCaus8Cd; 

      private List<char[]> hv2mClmIpa1Cd; 

      private List<char[]> hv2nClmIpa2Cd; 

      private List<char[]> hv2oClmIpa3Cd; 

      private List<char[]> hv2pProvTyp; 

      private List<char[]> hv2qFromCondPos; 

      private List<char[]> hv2rGrpTbl1Nbr; 

      private List<char[]> hv2sGrpTbl2Nbr; 

      private List<char[]> hv2tGrpTbl3Nbr; 

      private List<char[]> hv2uCpeDescCd; 

	
	/**
	* Constructor for HvHostVariablesCombcr
	**/
    public HvHostVariablesCombcr() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of hv2aRecTypCd
	 *  Corresponding COBOL Variable is HV2A-REC-TYP-CD
	 *	@return hv2aRecTypCd
	 */
	public List<char[]> getHv2aRecTypCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2A_REC_TYP_CD_SIZE;index++) {
        	list.add( getHv2aRecTypCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2aRecTypCd
	 */
	public char[] getHv2aRecTypCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2aRecTypCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2A_REC_TYP_CD_SIZE) {
             	index = HV_2A_REC_TYP_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv2aRecTypCd - Array index exceeded max Size {}, resetting it to max allowed",HV_2A_REC_TYP_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv2aRecTypCd + index*HV_2A_REC_TYP_CD_LEN) , HV_2A_REC_TYP_CD_LEN );
    }
    
    
   public int  hv2aRecTypCdFieldLength() {
   	return HV_2A_REC_TYP_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2aRecTypCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2A-REC-TYP-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv2aRecTypCd(int index,char[] value) {
   	setHv2aRecTypCd(index,value,true);
   }
   
   
   /**
	 *	Update Hv2aRecTypCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2aRecTypCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2aRecTypCd(int,String,boolean), reset it to 0",index);
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
		serializeHv2aRecTypCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2bDerivPlOfSvcCd
	 *  Corresponding COBOL Variable is HV2B-DERIV-PL-OF-SVC-CD
	 *	@return hv2bDerivPlOfSvcCd
	 */
	public List<char[]> getHv2bDerivPlOfSvcCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2B_DERIV_PL_OF_SVC_CD_SIZE;index++) {
        	list.add( getHv2bDerivPlOfSvcCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2bDerivPlOfSvcCd
	 */
	public char[] getHv2bDerivPlOfSvcCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2bDerivPlOfSvcCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2B_DERIV_PL_OF_SVC_CD_SIZE) {
             	index = HV_2B_DERIV_PL_OF_SVC_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv2bDerivPlOfSvcCd - Array index exceeded max Size {}, resetting it to max allowed",HV_2B_DERIV_PL_OF_SVC_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv2bDerivPlOfSvcCd + index*HV_2B_DERIV_PL_OF_SVC_CD_LEN) , HV_2B_DERIV_PL_OF_SVC_CD_LEN );
    }
    
    
   public int  hv2bDerivPlOfSvcCdFieldLength() {
   	return HV_2B_DERIV_PL_OF_SVC_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2bDerivPlOfSvcCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2B-DERIV-PL-OF-SVC-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv2bDerivPlOfSvcCd(int index,char[] value) {
   	setHv2bDerivPlOfSvcCd(index,value,true);
   }
   
   
   /**
	 *	Update Hv2bDerivPlOfSvcCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2bDerivPlOfSvcCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2bDerivPlOfSvcCd(int,String,boolean), reset it to 0",index);
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
		serializeHv2bDerivPlOfSvcCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2cDerivSvcCd
	 *  Corresponding COBOL Variable is HV2C-DERIV-SVC-CD
	 *	@return hv2cDerivSvcCd
	 */
	public List<char[]> getHv2cDerivSvcCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2C_DERIV_SVC_CD_SIZE;index++) {
        	list.add( getHv2cDerivSvcCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2cDerivSvcCd
	 */
	public char[] getHv2cDerivSvcCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2cDerivSvcCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2C_DERIV_SVC_CD_SIZE) {
             	index = HV_2C_DERIV_SVC_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv2cDerivSvcCd - Array index exceeded max Size {}, resetting it to max allowed",HV_2C_DERIV_SVC_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv2cDerivSvcCd + index*HV_2C_DERIV_SVC_CD_LEN) , HV_2C_DERIV_SVC_CD_LEN );
    }
    
    
   public int  hv2cDerivSvcCdFieldLength() {
   	return HV_2C_DERIV_SVC_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2cDerivSvcCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2C-DERIV-SVC-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv2cDerivSvcCd(int index,char[] value) {
   	setHv2cDerivSvcCd(index,value,true);
   }
   
   
   /**
	 *	Update Hv2cDerivSvcCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2cDerivSvcCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2cDerivSvcCd(int,String,boolean), reset it to 0",index);
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
		serializeHv2cDerivSvcCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2dDerivCausCd
	 *  Corresponding COBOL Variable is HV2D-DERIV-CAUS-CD
	 *	@return hv2dDerivCausCd
	 */
	public List<char[]> getHv2dDerivCausCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2D_DERIV_CAUS_CD_SIZE;index++) {
        	list.add( getHv2dDerivCausCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2dDerivCausCd
	 */
	public char[] getHv2dDerivCausCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2dDerivCausCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2D_DERIV_CAUS_CD_SIZE) {
             	index = HV_2D_DERIV_CAUS_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv2dDerivCausCd - Array index exceeded max Size {}, resetting it to max allowed",HV_2D_DERIV_CAUS_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv2dDerivCausCd + index*HV_2D_DERIV_CAUS_CD_LEN) , HV_2D_DERIV_CAUS_CD_LEN );
    }
    
    
   public int  hv2dDerivCausCdFieldLength() {
   	return HV_2D_DERIV_CAUS_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2dDerivCausCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2D-DERIV-CAUS-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv2dDerivCausCd(int index,char[] value) {
   	setHv2dDerivCausCd(index,value,true);
   }
   
   
   /**
	 *	Update Hv2dDerivCausCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2dDerivCausCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2dDerivCausCd(int,String,boolean), reset it to 0",index);
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
		serializeHv2dDerivCausCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2eClmCaus1Cd
	 *  Corresponding COBOL Variable is HV2E-CLM-CAUS-1-CD
	 *	@return hv2eClmCaus1Cd
	 */
	public List<char[]> getHv2eClmCaus1Cd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2E_CLM_CAUS_1_CD_SIZE;index++) {
        	list.add( getHv2eClmCaus1Cd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2eClmCaus1Cd
	 */
	public char[] getHv2eClmCaus1Cd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2eClmCaus1Cd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2E_CLM_CAUS_1_CD_SIZE) {
             	index = HV_2E_CLM_CAUS_1_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv2eClmCaus1Cd - Array index exceeded max Size {}, resetting it to max allowed",HV_2E_CLM_CAUS_1_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv2eClmCaus1Cd + index*HV_2E_CLM_CAUS_1_CD_LEN) , HV_2E_CLM_CAUS_1_CD_LEN );
    }
    
    
   public int  hv2eClmCaus1CdFieldLength() {
   	return HV_2E_CLM_CAUS_1_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2eClmCaus1Cd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2E-CLM-CAUS-1-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv2eClmCaus1Cd(int index,char[] value) {
   	setHv2eClmCaus1Cd(index,value,true);
   }
   
   
   /**
	 *	Update Hv2eClmCaus1Cd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2eClmCaus1Cd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2eClmCaus1Cd(int,String,boolean), reset it to 0",index);
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
		serializeHv2eClmCaus1Cd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2fClmCaus2Cd
	 *  Corresponding COBOL Variable is HV2F-CLM-CAUS-2-CD
	 *	@return hv2fClmCaus2Cd
	 */
	public List<char[]> getHv2fClmCaus2Cd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2F_CLM_CAUS_2_CD_SIZE;index++) {
        	list.add( getHv2fClmCaus2Cd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2fClmCaus2Cd
	 */
	public char[] getHv2fClmCaus2Cd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2fClmCaus2Cd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2F_CLM_CAUS_2_CD_SIZE) {
             	index = HV_2F_CLM_CAUS_2_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv2fClmCaus2Cd - Array index exceeded max Size {}, resetting it to max allowed",HV_2F_CLM_CAUS_2_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv2fClmCaus2Cd + index*HV_2F_CLM_CAUS_2_CD_LEN) , HV_2F_CLM_CAUS_2_CD_LEN );
    }
    
    
   public int  hv2fClmCaus2CdFieldLength() {
   	return HV_2F_CLM_CAUS_2_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2fClmCaus2Cd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2F-CLM-CAUS-2-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv2fClmCaus2Cd(int index,char[] value) {
   	setHv2fClmCaus2Cd(index,value,true);
   }
   
   
   /**
	 *	Update Hv2fClmCaus2Cd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2fClmCaus2Cd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2fClmCaus2Cd(int,String,boolean), reset it to 0",index);
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
		serializeHv2fClmCaus2Cd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2gClmCaus3Cd
	 *  Corresponding COBOL Variable is HV2G-CLM-CAUS-3-CD
	 *	@return hv2gClmCaus3Cd
	 */
	public List<char[]> getHv2gClmCaus3Cd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2G_CLM_CAUS_3_CD_SIZE;index++) {
        	list.add( getHv2gClmCaus3Cd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2gClmCaus3Cd
	 */
	public char[] getHv2gClmCaus3Cd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2gClmCaus3Cd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2G_CLM_CAUS_3_CD_SIZE) {
             	index = HV_2G_CLM_CAUS_3_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv2gClmCaus3Cd - Array index exceeded max Size {}, resetting it to max allowed",HV_2G_CLM_CAUS_3_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv2gClmCaus3Cd + index*HV_2G_CLM_CAUS_3_CD_LEN) , HV_2G_CLM_CAUS_3_CD_LEN );
    }
    
    
   public int  hv2gClmCaus3CdFieldLength() {
   	return HV_2G_CLM_CAUS_3_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2gClmCaus3Cd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2G-CLM-CAUS-3-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv2gClmCaus3Cd(int index,char[] value) {
   	setHv2gClmCaus3Cd(index,value,true);
   }
   
   
   /**
	 *	Update Hv2gClmCaus3Cd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2gClmCaus3Cd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2gClmCaus3Cd(int,String,boolean), reset it to 0",index);
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
		serializeHv2gClmCaus3Cd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2hClmCaus4Cd
	 *  Corresponding COBOL Variable is HV2H-CLM-CAUS-4-CD
	 *	@return hv2hClmCaus4Cd
	 */
	public List<char[]> getHv2hClmCaus4Cd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2H_CLM_CAUS_4_CD_SIZE;index++) {
        	list.add( getHv2hClmCaus4Cd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2hClmCaus4Cd
	 */
	public char[] getHv2hClmCaus4Cd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2hClmCaus4Cd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2H_CLM_CAUS_4_CD_SIZE) {
             	index = HV_2H_CLM_CAUS_4_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv2hClmCaus4Cd - Array index exceeded max Size {}, resetting it to max allowed",HV_2H_CLM_CAUS_4_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv2hClmCaus4Cd + index*HV_2H_CLM_CAUS_4_CD_LEN) , HV_2H_CLM_CAUS_4_CD_LEN );
    }
    
    
   public int  hv2hClmCaus4CdFieldLength() {
   	return HV_2H_CLM_CAUS_4_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2hClmCaus4Cd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2H-CLM-CAUS-4-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv2hClmCaus4Cd(int index,char[] value) {
   	setHv2hClmCaus4Cd(index,value,true);
   }
   
   
   /**
	 *	Update Hv2hClmCaus4Cd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2hClmCaus4Cd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2hClmCaus4Cd(int,String,boolean), reset it to 0",index);
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
		serializeHv2hClmCaus4Cd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2iClmCaus5Cd
	 *  Corresponding COBOL Variable is HV2I-CLM-CAUS-5-CD
	 *	@return hv2iClmCaus5Cd
	 */
	public List<char[]> getHv2iClmCaus5Cd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2I_CLM_CAUS_5_CD_SIZE;index++) {
        	list.add( getHv2iClmCaus5Cd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2iClmCaus5Cd
	 */
	public char[] getHv2iClmCaus5Cd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2iClmCaus5Cd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2I_CLM_CAUS_5_CD_SIZE) {
             	index = HV_2I_CLM_CAUS_5_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv2iClmCaus5Cd - Array index exceeded max Size {}, resetting it to max allowed",HV_2I_CLM_CAUS_5_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv2iClmCaus5Cd + index*HV_2I_CLM_CAUS_5_CD_LEN) , HV_2I_CLM_CAUS_5_CD_LEN );
    }
    
    
   public int  hv2iClmCaus5CdFieldLength() {
   	return HV_2I_CLM_CAUS_5_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2iClmCaus5Cd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2I-CLM-CAUS-5-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv2iClmCaus5Cd(int index,char[] value) {
   	setHv2iClmCaus5Cd(index,value,true);
   }
   
   
   /**
	 *	Update Hv2iClmCaus5Cd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2iClmCaus5Cd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2iClmCaus5Cd(int,String,boolean), reset it to 0",index);
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
		serializeHv2iClmCaus5Cd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2jClmCaus6Cd
	 *  Corresponding COBOL Variable is HV2J-CLM-CAUS-6-CD
	 *	@return hv2jClmCaus6Cd
	 */
	public List<char[]> getHv2jClmCaus6Cd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2J_CLM_CAUS_6_CD_SIZE;index++) {
        	list.add( getHv2jClmCaus6Cd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2jClmCaus6Cd
	 */
	public char[] getHv2jClmCaus6Cd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2jClmCaus6Cd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2J_CLM_CAUS_6_CD_SIZE) {
             	index = HV_2J_CLM_CAUS_6_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv2jClmCaus6Cd - Array index exceeded max Size {}, resetting it to max allowed",HV_2J_CLM_CAUS_6_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv2jClmCaus6Cd + index*HV_2J_CLM_CAUS_6_CD_LEN) , HV_2J_CLM_CAUS_6_CD_LEN );
    }
    
    
   public int  hv2jClmCaus6CdFieldLength() {
   	return HV_2J_CLM_CAUS_6_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2jClmCaus6Cd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2J-CLM-CAUS-6-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv2jClmCaus6Cd(int index,char[] value) {
   	setHv2jClmCaus6Cd(index,value,true);
   }
   
   
   /**
	 *	Update Hv2jClmCaus6Cd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2jClmCaus6Cd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2jClmCaus6Cd(int,String,boolean), reset it to 0",index);
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
		serializeHv2jClmCaus6Cd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2kClmCaus7Cd
	 *  Corresponding COBOL Variable is HV2K-CLM-CAUS-7-CD
	 *	@return hv2kClmCaus7Cd
	 */
	public List<char[]> getHv2kClmCaus7Cd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2K_CLM_CAUS_7_CD_SIZE;index++) {
        	list.add( getHv2kClmCaus7Cd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2kClmCaus7Cd
	 */
	public char[] getHv2kClmCaus7Cd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2kClmCaus7Cd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2K_CLM_CAUS_7_CD_SIZE) {
             	index = HV_2K_CLM_CAUS_7_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv2kClmCaus7Cd - Array index exceeded max Size {}, resetting it to max allowed",HV_2K_CLM_CAUS_7_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv2kClmCaus7Cd + index*HV_2K_CLM_CAUS_7_CD_LEN) , HV_2K_CLM_CAUS_7_CD_LEN );
    }
    
    
   public int  hv2kClmCaus7CdFieldLength() {
   	return HV_2K_CLM_CAUS_7_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2kClmCaus7Cd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2K-CLM-CAUS-7-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv2kClmCaus7Cd(int index,char[] value) {
   	setHv2kClmCaus7Cd(index,value,true);
   }
   
   
   /**
	 *	Update Hv2kClmCaus7Cd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2kClmCaus7Cd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2kClmCaus7Cd(int,String,boolean), reset it to 0",index);
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
		serializeHv2kClmCaus7Cd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2lClmCaus8Cd
	 *  Corresponding COBOL Variable is HV2L-CLM-CAUS-8-CD
	 *	@return hv2lClmCaus8Cd
	 */
	public List<char[]> getHv2lClmCaus8Cd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2L_CLM_CAUS_8_CD_SIZE;index++) {
        	list.add( getHv2lClmCaus8Cd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2lClmCaus8Cd
	 */
	public char[] getHv2lClmCaus8Cd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2lClmCaus8Cd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2L_CLM_CAUS_8_CD_SIZE) {
             	index = HV_2L_CLM_CAUS_8_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv2lClmCaus8Cd - Array index exceeded max Size {}, resetting it to max allowed",HV_2L_CLM_CAUS_8_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv2lClmCaus8Cd + index*HV_2L_CLM_CAUS_8_CD_LEN) , HV_2L_CLM_CAUS_8_CD_LEN );
    }
    
    
   public int  hv2lClmCaus8CdFieldLength() {
   	return HV_2L_CLM_CAUS_8_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2lClmCaus8Cd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2L-CLM-CAUS-8-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv2lClmCaus8Cd(int index,char[] value) {
   	setHv2lClmCaus8Cd(index,value,true);
   }
   
   
   /**
	 *	Update Hv2lClmCaus8Cd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2lClmCaus8Cd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2lClmCaus8Cd(int,String,boolean), reset it to 0",index);
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
		serializeHv2lClmCaus8Cd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2mClmIpa1Cd
	 *  Corresponding COBOL Variable is HV2M-CLM-IPA-1-CD
	 *	@return hv2mClmIpa1Cd
	 */
	public List<char[]> getHv2mClmIpa1Cd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2M_CLM_IPA_1_CD_SIZE;index++) {
        	list.add( getHv2mClmIpa1Cd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2mClmIpa1Cd
	 */
	public char[] getHv2mClmIpa1Cd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2mClmIpa1Cd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2M_CLM_IPA_1_CD_SIZE) {
             	index = HV_2M_CLM_IPA_1_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv2mClmIpa1Cd - Array index exceeded max Size {}, resetting it to max allowed",HV_2M_CLM_IPA_1_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv2mClmIpa1Cd + index*HV_2M_CLM_IPA_1_CD_LEN) , HV_2M_CLM_IPA_1_CD_LEN );
    }
    
    
   public int  hv2mClmIpa1CdFieldLength() {
   	return HV_2M_CLM_IPA_1_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2mClmIpa1Cd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2M-CLM-IPA-1-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv2mClmIpa1Cd(int index,char[] value) {
   	setHv2mClmIpa1Cd(index,value,true);
   }
   
   
   /**
	 *	Update Hv2mClmIpa1Cd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2mClmIpa1Cd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2mClmIpa1Cd(int,String,boolean), reset it to 0",index);
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
		serializeHv2mClmIpa1Cd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2nClmIpa2Cd
	 *  Corresponding COBOL Variable is HV2N-CLM-IPA-2-CD
	 *	@return hv2nClmIpa2Cd
	 */
	public List<char[]> getHv2nClmIpa2Cd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2N_CLM_IPA_2_CD_SIZE;index++) {
        	list.add( getHv2nClmIpa2Cd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2nClmIpa2Cd
	 */
	public char[] getHv2nClmIpa2Cd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2nClmIpa2Cd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2N_CLM_IPA_2_CD_SIZE) {
             	index = HV_2N_CLM_IPA_2_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv2nClmIpa2Cd - Array index exceeded max Size {}, resetting it to max allowed",HV_2N_CLM_IPA_2_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv2nClmIpa2Cd + index*HV_2N_CLM_IPA_2_CD_LEN) , HV_2N_CLM_IPA_2_CD_LEN );
    }
    
    
   public int  hv2nClmIpa2CdFieldLength() {
   	return HV_2N_CLM_IPA_2_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2nClmIpa2Cd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2N-CLM-IPA-2-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv2nClmIpa2Cd(int index,char[] value) {
   	setHv2nClmIpa2Cd(index,value,true);
   }
   
   
   /**
	 *	Update Hv2nClmIpa2Cd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2nClmIpa2Cd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2nClmIpa2Cd(int,String,boolean), reset it to 0",index);
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
		serializeHv2nClmIpa2Cd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2oClmIpa3Cd
	 *  Corresponding COBOL Variable is HV2O-CLM-IPA-3-CD
	 *	@return hv2oClmIpa3Cd
	 */
	public List<char[]> getHv2oClmIpa3Cd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2O_CLM_IPA_3_CD_SIZE;index++) {
        	list.add( getHv2oClmIpa3Cd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2oClmIpa3Cd
	 */
	public char[] getHv2oClmIpa3Cd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2oClmIpa3Cd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2O_CLM_IPA_3_CD_SIZE) {
             	index = HV_2O_CLM_IPA_3_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv2oClmIpa3Cd - Array index exceeded max Size {}, resetting it to max allowed",HV_2O_CLM_IPA_3_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv2oClmIpa3Cd + index*HV_2O_CLM_IPA_3_CD_LEN) , HV_2O_CLM_IPA_3_CD_LEN );
    }
    
    
   public int  hv2oClmIpa3CdFieldLength() {
   	return HV_2O_CLM_IPA_3_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2oClmIpa3Cd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2O-CLM-IPA-3-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv2oClmIpa3Cd(int index,char[] value) {
   	setHv2oClmIpa3Cd(index,value,true);
   }
   
   
   /**
	 *	Update Hv2oClmIpa3Cd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2oClmIpa3Cd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2oClmIpa3Cd(int,String,boolean), reset it to 0",index);
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
		serializeHv2oClmIpa3Cd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2pProvTyp
	 *  Corresponding COBOL Variable is HV2P-PROV-TYP
	 *	@return hv2pProvTyp
	 */
	public List<char[]> getHv2pProvTyp() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2P_PROV_TYP_SIZE;index++) {
        	list.add( getHv2pProvTyp( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2pProvTyp
	 */
	public char[] getHv2pProvTyp(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2pProvTyp(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2P_PROV_TYP_SIZE) {
             	index = HV_2P_PROV_TYP_SIZE -1; // can't exceed max array size
             	logger.trace("hv2pProvTyp - Array index exceeded max Size {}, resetting it to max allowed",HV_2P_PROV_TYP_SIZE); 
	    }
   	      return getCharArray( (beginHv2pProvTyp + index*HV_2P_PROV_TYP_LEN) , HV_2P_PROV_TYP_LEN );
    }
    
    
   public int  hv2pProvTypFieldLength() {
   	return HV_2P_PROV_TYP_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2pProvTyp with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2P-PROV-TYP
	 *  @param index
	 *	@param value
	 */
  public void setHv2pProvTyp(int index,char[] value) {
   	setHv2pProvTyp(index,value,true);
   }
   
   
   /**
	 *	Update Hv2pProvTyp with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2pProvTyp(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2pProvTyp(int,String,boolean), reset it to 0",index);
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
		serializeHv2pProvTyp(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2qFromCondPos
	 *  Corresponding COBOL Variable is HV2Q-FROM-COND-POS
	 *	@return hv2qFromCondPos
	 */
	public List<char[]> getHv2qFromCondPos() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2Q_FROM_COND_POS_SIZE;index++) {
        	list.add( getHv2qFromCondPos( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2qFromCondPos
	 */
	public char[] getHv2qFromCondPos(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2qFromCondPos(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2Q_FROM_COND_POS_SIZE) {
             	index = HV_2Q_FROM_COND_POS_SIZE -1; // can't exceed max array size
             	logger.trace("hv2qFromCondPos - Array index exceeded max Size {}, resetting it to max allowed",HV_2Q_FROM_COND_POS_SIZE); 
	    }
   	      return getCharArray( (beginHv2qFromCondPos + index*HV_2Q_FROM_COND_POS_LEN) , HV_2Q_FROM_COND_POS_LEN );
    }
    
    
   public int  hv2qFromCondPosFieldLength() {
   	return HV_2Q_FROM_COND_POS_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2qFromCondPos with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2Q-FROM-COND-POS
	 *  @param index
	 *	@param value
	 */
  public void setHv2qFromCondPos(int index,char[] value) {
   	setHv2qFromCondPos(index,value,true);
   }
   
   
   /**
	 *	Update Hv2qFromCondPos with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2qFromCondPos(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2qFromCondPos(int,String,boolean), reset it to 0",index);
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
		serializeHv2qFromCondPos(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2rGrpTbl1Nbr
	 *  Corresponding COBOL Variable is HV2R-GRP-TBL-1-NBR
	 *	@return hv2rGrpTbl1Nbr
	 */
	public List<char[]> getHv2rGrpTbl1Nbr() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2R_GRP_TBL_1_NBR_SIZE;index++) {
        	list.add( getHv2rGrpTbl1Nbr( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2rGrpTbl1Nbr
	 */
	public char[] getHv2rGrpTbl1Nbr(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2rGrpTbl1Nbr(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2R_GRP_TBL_1_NBR_SIZE) {
             	index = HV_2R_GRP_TBL_1_NBR_SIZE -1; // can't exceed max array size
             	logger.trace("hv2rGrpTbl1Nbr - Array index exceeded max Size {}, resetting it to max allowed",HV_2R_GRP_TBL_1_NBR_SIZE); 
	    }
   	      return getCharArray( (beginHv2rGrpTbl1Nbr + index*HV_2R_GRP_TBL_1_NBR_LEN) , HV_2R_GRP_TBL_1_NBR_LEN );
    }
    
    
   public int  hv2rGrpTbl1NbrFieldLength() {
   	return HV_2R_GRP_TBL_1_NBR_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2rGrpTbl1Nbr with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2R-GRP-TBL-1-NBR
	 *  @param index
	 *	@param value
	 */
  public void setHv2rGrpTbl1Nbr(int index,char[] value) {
   	setHv2rGrpTbl1Nbr(index,value,true);
   }
   
   
   /**
	 *	Update Hv2rGrpTbl1Nbr with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2rGrpTbl1Nbr(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2rGrpTbl1Nbr(int,String,boolean), reset it to 0",index);
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
		serializeHv2rGrpTbl1Nbr(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2sGrpTbl2Nbr
	 *  Corresponding COBOL Variable is HV2S-GRP-TBL-2-NBR
	 *	@return hv2sGrpTbl2Nbr
	 */
	public List<char[]> getHv2sGrpTbl2Nbr() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2S_GRP_TBL_2_NBR_SIZE;index++) {
        	list.add( getHv2sGrpTbl2Nbr( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2sGrpTbl2Nbr
	 */
	public char[] getHv2sGrpTbl2Nbr(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2sGrpTbl2Nbr(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2S_GRP_TBL_2_NBR_SIZE) {
             	index = HV_2S_GRP_TBL_2_NBR_SIZE -1; // can't exceed max array size
             	logger.trace("hv2sGrpTbl2Nbr - Array index exceeded max Size {}, resetting it to max allowed",HV_2S_GRP_TBL_2_NBR_SIZE); 
	    }
   	      return getCharArray( (beginHv2sGrpTbl2Nbr + index*HV_2S_GRP_TBL_2_NBR_LEN) , HV_2S_GRP_TBL_2_NBR_LEN );
    }
    
    
   public int  hv2sGrpTbl2NbrFieldLength() {
   	return HV_2S_GRP_TBL_2_NBR_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2sGrpTbl2Nbr with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2S-GRP-TBL-2-NBR
	 *  @param index
	 *	@param value
	 */
  public void setHv2sGrpTbl2Nbr(int index,char[] value) {
   	setHv2sGrpTbl2Nbr(index,value,true);
   }
   
   
   /**
	 *	Update Hv2sGrpTbl2Nbr with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2sGrpTbl2Nbr(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2sGrpTbl2Nbr(int,String,boolean), reset it to 0",index);
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
		serializeHv2sGrpTbl2Nbr(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2tGrpTbl3Nbr
	 *  Corresponding COBOL Variable is HV2T-GRP-TBL-3-NBR
	 *	@return hv2tGrpTbl3Nbr
	 */
	public List<char[]> getHv2tGrpTbl3Nbr() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2T_GRP_TBL_3_NBR_SIZE;index++) {
        	list.add( getHv2tGrpTbl3Nbr( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2tGrpTbl3Nbr
	 */
	public char[] getHv2tGrpTbl3Nbr(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2tGrpTbl3Nbr(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2T_GRP_TBL_3_NBR_SIZE) {
             	index = HV_2T_GRP_TBL_3_NBR_SIZE -1; // can't exceed max array size
             	logger.trace("hv2tGrpTbl3Nbr - Array index exceeded max Size {}, resetting it to max allowed",HV_2T_GRP_TBL_3_NBR_SIZE); 
	    }
   	      return getCharArray( (beginHv2tGrpTbl3Nbr + index*HV_2T_GRP_TBL_3_NBR_LEN) , HV_2T_GRP_TBL_3_NBR_LEN );
    }
    
    
   public int  hv2tGrpTbl3NbrFieldLength() {
   	return HV_2T_GRP_TBL_3_NBR_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2tGrpTbl3Nbr with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2T-GRP-TBL-3-NBR
	 *  @param index
	 *	@param value
	 */
  public void setHv2tGrpTbl3Nbr(int index,char[] value) {
   	setHv2tGrpTbl3Nbr(index,value,true);
   }
   
   
   /**
	 *	Update Hv2tGrpTbl3Nbr with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2tGrpTbl3Nbr(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2tGrpTbl3Nbr(int,String,boolean), reset it to 0",index);
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
		serializeHv2tGrpTbl3Nbr(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv2uCpeDescCd
	 *  Corresponding COBOL Variable is HV2U-CPE-DESC-CD
	 *	@return hv2uCpeDescCd
	 */
	public List<char[]> getHv2uCpeDescCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_2U_CPE_DESC_CD_SIZE;index++) {
        	list.add( getHv2uCpeDescCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv2uCpeDescCd
	 */
	public char[] getHv2uCpeDescCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv2uCpeDescCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_2U_CPE_DESC_CD_SIZE) {
             	index = HV_2U_CPE_DESC_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv2uCpeDescCd - Array index exceeded max Size {}, resetting it to max allowed",HV_2U_CPE_DESC_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv2uCpeDescCd + index*HV_2U_CPE_DESC_CD_LEN) , HV_2U_CPE_DESC_CD_LEN );
    }
    
    
   public int  hv2uCpeDescCdFieldLength() {
   	return HV_2U_CPE_DESC_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv2uCpeDescCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV2U-CPE-DESC-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv2uCpeDescCd(int index,char[] value) {
   	setHv2uCpeDescCd(index,value,true);
   }
   
   
   /**
	 *	Update Hv2uCpeDescCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv2uCpeDescCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv2uCpeDescCd(int,String,boolean), reset it to 0",index);
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
		serializeHv2uCpeDescCd(index,value);		
       }
   }
   

	
	
	

		public static int getHvHostVariablesCombcrFieldLength() {
			return HV_HOST_VARIABLES_COMBCR_LENGTH;
		}

}
  
