package com.cloudframe.app.dto.d529351u;

/**
*  The class HvHostVariablesCsfrto is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class HvHostVariablesCsfrto extends HvHostVariablesCsfrtoSerialized { 
   
      private List<char[]> hv08SvcDrvPos; 

      private List<char[]> hv09SvcDrvSvc; 

      private List<char[]> hv10SvcDrvCau; 

      private List<char[]> hv11ClmFrmSvcCd; 

      private List<char[]> hv12ClmToSvcCd; 

      private List<char[]> hv13SvcTypCd; 

	
	/**
	* Constructor for HvHostVariablesCsfrto
	**/
    public HvHostVariablesCsfrto() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of hv08SvcDrvPos
	 *  Corresponding COBOL Variable is HV08-SVC-DRV-POS
	 *	@return hv08SvcDrvPos
	 */
	public List<char[]> getHv08SvcDrvPos() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_08_SVC_DRV_POS_SIZE;index++) {
        	list.add( getHv08SvcDrvPos( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv08SvcDrvPos
	 */
	public char[] getHv08SvcDrvPos(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv08SvcDrvPos(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_08_SVC_DRV_POS_SIZE) {
             	index = HV_08_SVC_DRV_POS_SIZE -1; // can't exceed max array size
             	logger.trace("hv08SvcDrvPos - Array index exceeded max Size {}, resetting it to max allowed",HV_08_SVC_DRV_POS_SIZE); 
	    }
   	      return getCharArray( (beginHv08SvcDrvPos + index*HV_08_SVC_DRV_POS_LEN) , HV_08_SVC_DRV_POS_LEN );
    }
    
    
   public int  hv08SvcDrvPosFieldLength() {
   	return HV_08_SVC_DRV_POS_LEN;
   }
   
	

  
  	/**
	 *	Update Hv08SvcDrvPos with the passed value at a given index
	 *  Corresponding COBOL Variable is HV08-SVC-DRV-POS
	 *  @param index
	 *	@param value
	 */
  public void setHv08SvcDrvPos(int index,char[] value) {
   	setHv08SvcDrvPos(index,value,true);
   }
   
   
   /**
	 *	Update Hv08SvcDrvPos with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv08SvcDrvPos(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv08SvcDrvPos(int,String,boolean), reset it to 0",index);
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
		serializeHv08SvcDrvPos(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv09SvcDrvSvc
	 *  Corresponding COBOL Variable is HV09-SVC-DRV-SVC
	 *	@return hv09SvcDrvSvc
	 */
	public List<char[]> getHv09SvcDrvSvc() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_09_SVC_DRV_SVC_SIZE;index++) {
        	list.add( getHv09SvcDrvSvc( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv09SvcDrvSvc
	 */
	public char[] getHv09SvcDrvSvc(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv09SvcDrvSvc(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_09_SVC_DRV_SVC_SIZE) {
             	index = HV_09_SVC_DRV_SVC_SIZE -1; // can't exceed max array size
             	logger.trace("hv09SvcDrvSvc - Array index exceeded max Size {}, resetting it to max allowed",HV_09_SVC_DRV_SVC_SIZE); 
	    }
   	      return getCharArray( (beginHv09SvcDrvSvc + index*HV_09_SVC_DRV_SVC_LEN) , HV_09_SVC_DRV_SVC_LEN );
    }
    
    
   public int  hv09SvcDrvSvcFieldLength() {
   	return HV_09_SVC_DRV_SVC_LEN;
   }
   
	

  
  	/**
	 *	Update Hv09SvcDrvSvc with the passed value at a given index
	 *  Corresponding COBOL Variable is HV09-SVC-DRV-SVC
	 *  @param index
	 *	@param value
	 */
  public void setHv09SvcDrvSvc(int index,char[] value) {
   	setHv09SvcDrvSvc(index,value,true);
   }
   
   
   /**
	 *	Update Hv09SvcDrvSvc with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv09SvcDrvSvc(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv09SvcDrvSvc(int,String,boolean), reset it to 0",index);
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
		serializeHv09SvcDrvSvc(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv10SvcDrvCau
	 *  Corresponding COBOL Variable is HV10-SVC-DRV-CAU
	 *	@return hv10SvcDrvCau
	 */
	public List<char[]> getHv10SvcDrvCau() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_10_SVC_DRV_CAU_SIZE;index++) {
        	list.add( getHv10SvcDrvCau( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv10SvcDrvCau
	 */
	public char[] getHv10SvcDrvCau(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv10SvcDrvCau(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_10_SVC_DRV_CAU_SIZE) {
             	index = HV_10_SVC_DRV_CAU_SIZE -1; // can't exceed max array size
             	logger.trace("hv10SvcDrvCau - Array index exceeded max Size {}, resetting it to max allowed",HV_10_SVC_DRV_CAU_SIZE); 
	    }
   	      return getCharArray( (beginHv10SvcDrvCau + index*HV_10_SVC_DRV_CAU_LEN) , HV_10_SVC_DRV_CAU_LEN );
    }
    
    
   public int  hv10SvcDrvCauFieldLength() {
   	return HV_10_SVC_DRV_CAU_LEN;
   }
   
	

  
  	/**
	 *	Update Hv10SvcDrvCau with the passed value at a given index
	 *  Corresponding COBOL Variable is HV10-SVC-DRV-CAU
	 *  @param index
	 *	@param value
	 */
  public void setHv10SvcDrvCau(int index,char[] value) {
   	setHv10SvcDrvCau(index,value,true);
   }
   
   
   /**
	 *	Update Hv10SvcDrvCau with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv10SvcDrvCau(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv10SvcDrvCau(int,String,boolean), reset it to 0",index);
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
		serializeHv10SvcDrvCau(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv11ClmFrmSvcCd
	 *  Corresponding COBOL Variable is HV11-CLM-FRM-SVC-CD
	 *	@return hv11ClmFrmSvcCd
	 */
	public List<char[]> getHv11ClmFrmSvcCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_11_CLM_FRM_SVC_CD_SIZE;index++) {
        	list.add( getHv11ClmFrmSvcCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv11ClmFrmSvcCd
	 */
	public char[] getHv11ClmFrmSvcCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv11ClmFrmSvcCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_11_CLM_FRM_SVC_CD_SIZE) {
             	index = HV_11_CLM_FRM_SVC_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv11ClmFrmSvcCd - Array index exceeded max Size {}, resetting it to max allowed",HV_11_CLM_FRM_SVC_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv11ClmFrmSvcCd + index*HV_11_CLM_FRM_SVC_CD_LEN) , HV_11_CLM_FRM_SVC_CD_LEN );
    }
    
    
   public int  hv11ClmFrmSvcCdFieldLength() {
   	return HV_11_CLM_FRM_SVC_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv11ClmFrmSvcCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV11-CLM-FRM-SVC-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv11ClmFrmSvcCd(int index,char[] value) {
   	setHv11ClmFrmSvcCd(index,value,true);
   }
   
   
   /**
	 *	Update Hv11ClmFrmSvcCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv11ClmFrmSvcCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv11ClmFrmSvcCd(int,String,boolean), reset it to 0",index);
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
		serializeHv11ClmFrmSvcCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv12ClmToSvcCd
	 *  Corresponding COBOL Variable is HV12-CLM-TO-SVC-CD
	 *	@return hv12ClmToSvcCd
	 */
	public List<char[]> getHv12ClmToSvcCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_12_CLM_TO_SVC_CD_SIZE;index++) {
        	list.add( getHv12ClmToSvcCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv12ClmToSvcCd
	 */
	public char[] getHv12ClmToSvcCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv12ClmToSvcCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_12_CLM_TO_SVC_CD_SIZE) {
             	index = HV_12_CLM_TO_SVC_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv12ClmToSvcCd - Array index exceeded max Size {}, resetting it to max allowed",HV_12_CLM_TO_SVC_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv12ClmToSvcCd + index*HV_12_CLM_TO_SVC_CD_LEN) , HV_12_CLM_TO_SVC_CD_LEN );
    }
    
    
   public int  hv12ClmToSvcCdFieldLength() {
   	return HV_12_CLM_TO_SVC_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv12ClmToSvcCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV12-CLM-TO-SVC-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv12ClmToSvcCd(int index,char[] value) {
   	setHv12ClmToSvcCd(index,value,true);
   }
   
   
   /**
	 *	Update Hv12ClmToSvcCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv12ClmToSvcCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv12ClmToSvcCd(int,String,boolean), reset it to 0",index);
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
		serializeHv12ClmToSvcCd(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv13SvcTypCd
	 *  Corresponding COBOL Variable is HV13-SVC-TYP-CD
	 *	@return hv13SvcTypCd
	 */
	public List<char[]> getHv13SvcTypCd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_13_SVC_TYP_CD_SIZE;index++) {
        	list.add( getHv13SvcTypCd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv13SvcTypCd
	 */
	public char[] getHv13SvcTypCd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv13SvcTypCd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_13_SVC_TYP_CD_SIZE) {
             	index = HV_13_SVC_TYP_CD_SIZE -1; // can't exceed max array size
             	logger.trace("hv13SvcTypCd - Array index exceeded max Size {}, resetting it to max allowed",HV_13_SVC_TYP_CD_SIZE); 
	    }
   	      return getCharArray( (beginHv13SvcTypCd + index*HV_13_SVC_TYP_CD_LEN) , HV_13_SVC_TYP_CD_LEN );
    }
    
    
   public int  hv13SvcTypCdFieldLength() {
   	return HV_13_SVC_TYP_CD_LEN;
   }
   
	

  
  	/**
	 *	Update Hv13SvcTypCd with the passed value at a given index
	 *  Corresponding COBOL Variable is HV13-SVC-TYP-CD
	 *  @param index
	 *	@param value
	 */
  public void setHv13SvcTypCd(int index,char[] value) {
   	setHv13SvcTypCd(index,value,true);
   }
   
   
   /**
	 *	Update Hv13SvcTypCd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv13SvcTypCd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv13SvcTypCd(int,String,boolean), reset it to 0",index);
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
		serializeHv13SvcTypCd(index,value);		
       }
   }
   

	
	
	

		public static int getHvHostVariablesCsfrtoFieldLength() {
			return HV_HOST_VARIABLES_CSFRTO_LENGTH;
		}

}
  
