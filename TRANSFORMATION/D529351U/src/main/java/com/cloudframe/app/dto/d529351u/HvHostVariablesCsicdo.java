package com.cloudframe.app.dto.d529351u;

/**
*  The class HvHostVariablesCsicdo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class HvHostVariablesCsicdo extends HvHostVariablesCsicdoSerialized { 
   
      private List<char[]> hv3aIcdDrvPos; 

      private List<char[]> hv3bIcdDrvSvc; 

      private List<char[]> hv3cIcdDrvCau; 

      private List<char[]> hv3dIcdTypCd; 

      private List<char[]> hv3eClmFrmIcdCd; 

      private List<char[]> hv3fClmToIcdCd; 

	
	/**
	* Constructor for HvHostVariablesCsicdo
	**/
    public HvHostVariablesCsicdo() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of hv3aIcdDrvPos
	 *  Corresponding COBOL Variable is HV3A-ICD-DRV-POS
	 *	@return hv3aIcdDrvPos
	 */
	public List<char[]> getHv3aIcdDrvPos() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_3A_ICD_DRV_POS_SIZE;index++) {
        	list.add( getHv3aIcdDrvPos( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv3aIcdDrvPos
	 */
	public char[] getHv3aIcdDrvPos(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv3aIcdDrvPos(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_3A_ICD_DRV_POS_SIZE) {
             	index = HV_3A_ICD_DRV_POS_SIZE -1; // can't exceed max array size
             	logger.trace("hv3aIcdDrvPos - Array index exceeded max Size {}, resetting it to max allowed",HV_3A_ICD_DRV_POS_SIZE); 
	    }
   	      return getCharArray( (beginHv3aIcdDrvPos + index*HV_3A_ICD_DRV_POS_LEN) , HV_3A_ICD_DRV_POS_LEN );
    }
    
    
   public int  hv3aIcdDrvPosFieldLength() {
   	return HV_3A_ICD_DRV_POS_LEN;
   }
   
	

  
  	/**
	 *	Update Hv3aIcdDrvPos with the passed value at a given index
	 *  Corresponding COBOL Variable is HV3A-ICD-DRV-POS
	 *  @param index
	 *	@param value
	 */
  public void setHv3aIcdDrvPos(int index,char[] value) {
   	setHv3aIcdDrvPos(index,value,true);
   }
   
   
   /**
	 *	Update Hv3aIcdDrvPos with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv3aIcdDrvPos(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv3aIcdDrvPos(int,String,boolean), reset it to 0",index);
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
		serializeHv3aIcdDrvPos(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv3bIcdDrvSvc
	 *  Corresponding COBOL Variable is HV3B-ICD-DRV-SVC
	 *	@return hv3bIcdDrvSvc
	 */
	public List<char[]> getHv3bIcdDrvSvc() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_3B_ICD_DRV_SVC_SIZE;index++) {
        	list.add( getHv3bIcdDrvSvc( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv3bIcdDrvSvc
	 */
	public char[] getHv3bIcdDrvSvc(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv3bIcdDrvSvc(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_3B_ICD_DRV_SVC_SIZE) {
             	index = HV_3B_ICD_DRV_SVC_SIZE -1; // can't exceed max array size
             	logger.trace("hv3bIcdDrvSvc - Array index exceeded max Size {}, resetting it to max allowed",HV_3B_ICD_DRV_SVC_SIZE); 
	    }
   	      return getCharArray( (beginHv3bIcdDrvSvc + index*HV_3B_ICD_DRV_SVC_LEN) , HV_3B_ICD_DRV_SVC_LEN );
    }
    
    
   public int  hv3bIcdDrvSvcFieldLength() {
   	return HV_3B_ICD_DRV_SVC_LEN;
   }
   
	

  
  	/**
	 *	Update Hv3bIcdDrvSvc with the passed value at a given index
	 *  Corresponding COBOL Variable is HV3B-ICD-DRV-SVC
	 *  @param index
	 *	@param value
	 */
  public void setHv3bIcdDrvSvc(int index,char[] value) {
   	setHv3bIcdDrvSvc(index,value,true);
   }
   
   
   /**
	 *	Update Hv3bIcdDrvSvc with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv3bIcdDrvSvc(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv3bIcdDrvSvc(int,String,boolean), reset it to 0",index);
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
		serializeHv3bIcdDrvSvc(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv3cIcdDrvCau
	 *  Corresponding COBOL Variable is HV3C-ICD-DRV-CAU
	 *	@return hv3cIcdDrvCau
	 */
	public List<char[]> getHv3cIcdDrvCau() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_3C_ICD_DRV_CAU_SIZE;index++) {
        	list.add( getHv3cIcdDrvCau( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv3cIcdDrvCau
	 */
	public char[] getHv3cIcdDrvCau(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv3cIcdDrvCau(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_3C_ICD_DRV_CAU_SIZE) {
             	index = HV_3C_ICD_DRV_CAU_SIZE -1; // can't exceed max array size
             	logger.trace("hv3cIcdDrvCau - Array index exceeded max Size {}, resetting it to max allowed",HV_3C_ICD_DRV_CAU_SIZE); 
	    }
   	      return getCharArray( (beginHv3cIcdDrvCau + index*HV_3C_ICD_DRV_CAU_LEN) , HV_3C_ICD_DRV_CAU_LEN );
    }
    
    
   public int  hv3cIcdDrvCauFieldLength() {
   	return HV_3C_ICD_DRV_CAU_LEN;
   }
   
	

  
  	/**
	 *	Update Hv3cIcdDrvCau with the passed value at a given index
	 *  Corresponding COBOL Variable is HV3C-ICD-DRV-CAU
	 *  @param index
	 *	@param value
	 */
  public void setHv3cIcdDrvCau(int index,char[] value) {
   	setHv3cIcdDrvCau(index,value,true);
   }
   
   
   /**
	 *	Update Hv3cIcdDrvCau with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv3cIcdDrvCau(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv3cIcdDrvCau(int,String,boolean), reset it to 0",index);
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
		serializeHv3cIcdDrvCau(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv3dIcdTypCd
	 *  Corresponding COBOL Variable is HV3D-ICD-TYP-CD
	 *	@return hv3dIcdTypCd
	 */
	public List<char[]> getHv3dIcdTypCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_3D_ICD_TYP_CD_SIZE;index++) {
        	list.add( getHv3dIcdTypCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv3dIcdTypCd
	 */
	public char[] getHv3dIcdTypCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv3dIcdTypCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_3D_ICD_TYP_CD_SIZE) {
             	index = HV_3D_ICD_TYP_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv3dIcdTypCd - Array index exceeded max Size {}, resetting it to max allowed",HV_3D_ICD_TYP_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv3dIcdTypCd + index*HV_3D_ICD_TYP_CD_LEN) , HV_3D_ICD_TYP_CD_LEN );
    }
    
    
   public int  hv3dIcdTypCdFieldLength() {
   	return HV_3D_ICD_TYP_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv3dIcdTypCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV3D-ICD-TYP-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv3dIcdTypCd(int index,char[] value) {
   	setHv3dIcdTypCd(index,value,true);
   }
   
   
   /**
	 *	Update Hv3dIcdTypCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv3dIcdTypCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv3dIcdTypCd(int,String,boolean), reset it to 0",index);
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
		serializeHv3dIcdTypCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv3eClmFrmIcdCd
	 *  Corresponding COBOL Variable is HV3E-CLM-FRM-ICD-CD
	 *	@return hv3eClmFrmIcdCd
	 */
	public List<char[]> getHv3eClmFrmIcdCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_3E_CLM_FRM_ICD_CD_SIZE;index++) {
        	list.add( getHv3eClmFrmIcdCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv3eClmFrmIcdCd
	 */
	public char[] getHv3eClmFrmIcdCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv3eClmFrmIcdCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_3E_CLM_FRM_ICD_CD_SIZE) {
             	index = HV_3E_CLM_FRM_ICD_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv3eClmFrmIcdCd - Array index exceeded max Size {}, resetting it to max allowed",HV_3E_CLM_FRM_ICD_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv3eClmFrmIcdCd + index*HV_3E_CLM_FRM_ICD_CD_LEN) , HV_3E_CLM_FRM_ICD_CD_LEN );
    }
    
    
   public int  hv3eClmFrmIcdCdFieldLength() {
   	return HV_3E_CLM_FRM_ICD_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv3eClmFrmIcdCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV3E-CLM-FRM-ICD-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv3eClmFrmIcdCd(int index,char[] value) {
   	setHv3eClmFrmIcdCd(index,value,true);
   }
   
   
   /**
	 *	Update Hv3eClmFrmIcdCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv3eClmFrmIcdCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv3eClmFrmIcdCd(int,String,boolean), reset it to 0",index);
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
		serializeHv3eClmFrmIcdCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv3fClmToIcdCd
	 *  Corresponding COBOL Variable is HV3F-CLM-TO-ICD-CD
	 *	@return hv3fClmToIcdCd
	 */
	public List<char[]> getHv3fClmToIcdCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_3F_CLM_TO_ICD_CD_SIZE;index++) {
        	list.add( getHv3fClmToIcdCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv3fClmToIcdCd
	 */
	public char[] getHv3fClmToIcdCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv3fClmToIcdCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_3F_CLM_TO_ICD_CD_SIZE) {
             	index = HV_3F_CLM_TO_ICD_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv3fClmToIcdCd - Array index exceeded max Size {}, resetting it to max allowed",HV_3F_CLM_TO_ICD_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv3fClmToIcdCd + index*HV_3F_CLM_TO_ICD_CD_LEN) , HV_3F_CLM_TO_ICD_CD_LEN );
    }
    
    
   public int  hv3fClmToIcdCdFieldLength() {
   	return HV_3F_CLM_TO_ICD_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv3fClmToIcdCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV3F-CLM-TO-ICD-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv3fClmToIcdCd(int index,char[] value) {
   	setHv3fClmToIcdCd(index,value,true);
   }
   
   
   /**
	 *	Update Hv3fClmToIcdCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv3fClmToIcdCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv3fClmToIcdCd(int,String,boolean), reset it to 0",index);
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
		serializeHv3fClmToIcdCd(index,value);		
       }
   }
   

	
	
	

		public static int getHvHostVariablesCsicdoFieldLength() {
			return HV_HOST_VARIABLES_CSICDO_LENGTH;
		}

}
  
