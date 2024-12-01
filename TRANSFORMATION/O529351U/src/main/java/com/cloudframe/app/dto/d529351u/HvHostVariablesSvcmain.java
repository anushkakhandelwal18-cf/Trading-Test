package com.cloudframe.app.dto.d529351u;

/**
*  The class HvHostVariablesSvcmain is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class HvHostVariablesSvcmain extends HvHostVariablesSvcmainSerialized { 
   
      private List<char[]> hv04KeyDrvPos; 

      private List<char[]> hv05KeyDrvSvc; 

      private List<char[]> hv06KeyDrvCau; 

      private List<char[]> hv07RuleSw; 

	
	/**
	* Constructor for HvHostVariablesSvcmain
	**/
    public HvHostVariablesSvcmain() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of hv04KeyDrvPos
	 *  Corresponding COBOL Variable is HV04-KEY-DRV-POS
	 *	@return hv04KeyDrvPos
	 */
	public List<char[]> getHv04KeyDrvPos() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_04_KEY_DRV_POS_SIZE;index++) {
        	list.add( getHv04KeyDrvPos( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv04KeyDrvPos
	 */
	public char[] getHv04KeyDrvPos(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv04KeyDrvPos(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_04_KEY_DRV_POS_SIZE) {
             	index = HV_04_KEY_DRV_POS_SIZE -1; // can't exceed max array size
             	logger.trace("hv04KeyDrvPos - Array index exceeded max Size {}, resetting it to max allowed",HV_04_KEY_DRV_POS_SIZE); 
	    }
   	      return getCharArray( (beginHv04KeyDrvPos + index*HV_04_KEY_DRV_POS_LEN) , HV_04_KEY_DRV_POS_LEN );
    }
    
    
   public int  hv04KeyDrvPosFieldLength() {
   	return HV_04_KEY_DRV_POS_LEN;
   }
   
	

  
  	/**
	 *	Update Hv04KeyDrvPos with the passed value at a given index
	 *  Corresponding COBOL Variable is HV04-KEY-DRV-POS
	 *  @param index
	 *	@param value
	 */
  public void setHv04KeyDrvPos(int index,char[] value) {
   	setHv04KeyDrvPos(index,value,true);
   }
   
   
   /**
	 *	Update Hv04KeyDrvPos with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv04KeyDrvPos(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv04KeyDrvPos(int,String,boolean), reset it to 0",index);
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
		serializeHv04KeyDrvPos(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv05KeyDrvSvc
	 *  Corresponding COBOL Variable is HV05-KEY-DRV-SVC
	 *	@return hv05KeyDrvSvc
	 */
	public List<char[]> getHv05KeyDrvSvc() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_05_KEY_DRV_SVC_SIZE;index++) {
        	list.add( getHv05KeyDrvSvc( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv05KeyDrvSvc
	 */
	public char[] getHv05KeyDrvSvc(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv05KeyDrvSvc(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_05_KEY_DRV_SVC_SIZE) {
             	index = HV_05_KEY_DRV_SVC_SIZE -1; // can't exceed max array size
             	logger.trace("hv05KeyDrvSvc - Array index exceeded max Size {}, resetting it to max allowed",HV_05_KEY_DRV_SVC_SIZE); 
	    }
   	      return getCharArray( (beginHv05KeyDrvSvc + index*HV_05_KEY_DRV_SVC_LEN) , HV_05_KEY_DRV_SVC_LEN );
    }
    
    
   public int  hv05KeyDrvSvcFieldLength() {
   	return HV_05_KEY_DRV_SVC_LEN;
   }
   
	

  
  	/**
	 *	Update Hv05KeyDrvSvc with the passed value at a given index
	 *  Corresponding COBOL Variable is HV05-KEY-DRV-SVC
	 *  @param index
	 *	@param value
	 */
  public void setHv05KeyDrvSvc(int index,char[] value) {
   	setHv05KeyDrvSvc(index,value,true);
   }
   
   
   /**
	 *	Update Hv05KeyDrvSvc with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv05KeyDrvSvc(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv05KeyDrvSvc(int,String,boolean), reset it to 0",index);
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
		serializeHv05KeyDrvSvc(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv06KeyDrvCau
	 *  Corresponding COBOL Variable is HV06-KEY-DRV-CAU
	 *	@return hv06KeyDrvCau
	 */
	public List<char[]> getHv06KeyDrvCau() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_06_KEY_DRV_CAU_SIZE;index++) {
        	list.add( getHv06KeyDrvCau( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv06KeyDrvCau
	 */
	public char[] getHv06KeyDrvCau(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv06KeyDrvCau(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_06_KEY_DRV_CAU_SIZE) {
             	index = HV_06_KEY_DRV_CAU_SIZE -1; // can't exceed max array size
             	logger.trace("hv06KeyDrvCau - Array index exceeded max Size {}, resetting it to max allowed",HV_06_KEY_DRV_CAU_SIZE); 
	    }
   	      return getCharArray( (beginHv06KeyDrvCau + index*HV_06_KEY_DRV_CAU_LEN) , HV_06_KEY_DRV_CAU_LEN );
    }
    
    
   public int  hv06KeyDrvCauFieldLength() {
   	return HV_06_KEY_DRV_CAU_LEN;
   }
   
	

  
  	/**
	 *	Update Hv06KeyDrvCau with the passed value at a given index
	 *  Corresponding COBOL Variable is HV06-KEY-DRV-CAU
	 *  @param index
	 *	@param value
	 */
  public void setHv06KeyDrvCau(int index,char[] value) {
   	setHv06KeyDrvCau(index,value,true);
   }
   
   
   /**
	 *	Update Hv06KeyDrvCau with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv06KeyDrvCau(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv06KeyDrvCau(int,String,boolean), reset it to 0",index);
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
		serializeHv06KeyDrvCau(index,value);		
       }
   }
   
    /**
	 *	Returns the value of hv07RuleSw
	 *  Corresponding COBOL Variable is HV07-RULE-SW
	 *	@return hv07RuleSw
	 */
	public List<char[]> getHv07RuleSw() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < HV_07_RULE_SW_SIZE;index++) {
        	list.add( getHv07RuleSw( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return hv07RuleSw
	 */
	public char[] getHv07RuleSw(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getHv07RuleSw(), resetting it to 0",index);
		    index = 0;
        } else if (index >= HV_07_RULE_SW_SIZE) {
             	index = HV_07_RULE_SW_SIZE -1; // can't exceed max array size
             	logger.trace("hv07RuleSw - Array index exceeded max Size {}, resetting it to max allowed",HV_07_RULE_SW_SIZE); 
	    }
   	      return getCharArray( (beginHv07RuleSw + index*HV_07_RULE_SW_LEN) , HV_07_RULE_SW_LEN );
    }
    
    
   public int  hv07RuleSwFieldLength() {
   	return HV_07_RULE_SW_LEN;
   }
   
	

  
  	/**
	 *	Update Hv07RuleSw with the passed value at a given index
	 *  Corresponding COBOL Variable is HV07-RULE-SW
	 *  @param index
	 *	@param value
	 */
  public void setHv07RuleSw(int index,char[] value) {
   	setHv07RuleSw(index,value,true);
   }
   
   
   /**
	 *	Update Hv07RuleSw with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setHv07RuleSw(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setHv07RuleSw(int,String,boolean), reset it to 0",index);
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
		serializeHv07RuleSw(index,value);		
       }
   }
   

	
	
	

		public static int getHvHostVariablesSvcmainFieldLength() {
			return HV_HOST_VARIABLES_SVCMAIN_LENGTH;
		}

}
  
