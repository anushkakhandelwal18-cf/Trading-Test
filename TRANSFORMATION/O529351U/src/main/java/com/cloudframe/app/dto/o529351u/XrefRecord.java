package com.cloudframe.app.dto.o529351u;

/**
*  The class XrefRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class XrefRecord extends XrefRecordSerialized { 
   
				private XrfEeDataKey xrfEeDataKey = new XrfEeDataKey();

								private int xrfAdjstrNum;
      private List<char[]> xrfCmData; 


								private short xrfBankAcctEe;

						private char[] xrfRegionIndEe = Field.fillLowValue(1);
      private List<char[]> xrfPrsInd; 

				private XrfUpdLog xrfUpdLog = new XrfUpdLog();

								private short xrfPortDate;

						private char[] xrfLcaInd = Field.fillLowValue(1);

						private char[] xrfSourceSysInd = Field.fillLowValue(1);

	
	/**
	* Constructor for XrefRecord
	**/
    public XrefRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for XrefRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XrefRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			xrfEeDataKey.setParent(this,getStartOffset() + 0);
	       			xrfUpdLog.setParent(this,getStartOffset() + 2296);
    } 

	/**
	 *	Returns the value of xrfEeDataKey
	 *	@return xrfEeDataKey
	 */   
	 public XrfEeDataKey getXrfEeDataKey() {
   	return xrfEeDataKey;
   }
   /**
	* 	Update XrfEeDataKey with the passed value
	*   Corresponding COBOL Variable is XRF-EE-DATA-KEY
	*	@param value
	*/
   public void setXrfEeDataKey(char[] value) {
      xrfEeDataKey.setString(value); 
   }   
    
     /**
	 * 	Update XrfEeDataKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setXrfEeDataKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xrfEeDataKey.begin,xrfEeDataKey.length());
   }
   
     /**
	 * 	Update XrfEeDataKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfEeDataKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xrfEeDataKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update XrfEeDataKey with another Field
	 *	@param value
	 */
   public void setXrfEeDataKey(Field source) {
   	replace(source,0,source.length(),xrfEeDataKey.begin,xrfEeDataKey.length());
   }  
   
     /**
	 * 	Update XrfEeDataKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setXrfEeDataKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xrfEeDataKey.begin,xrfEeDataKey.length());
   }
   
     /**
	 * 	Update XrfEeDataKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfEeDataKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xrfEeDataKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of xrfAdjstrNum
	 *	@return xrfAdjstrNum
	 */
	public int getXrfAdjstrNum() throws CFException {
        if (isXrfAdjstrNumModified()) { 
           xrfAdjstrNum = refreshXrfAdjstrNum();
        }
   		return xrfAdjstrNum;
	}
	
	/**
	 * 	Update XrfAdjstrNum with the passed value
	 *  Corresponding COBOL Variable is XRF-ADJSTR-NUM
	 *	@param number
	 */
	public void setXrfAdjstrNum(int number) {
	     // Truncate if the number is beyond +/- Max range
	    xrfAdjstrNum = checkXrfAdjstrNumMaxLimit(number); 
		serializeXrfAdjstrNum(xrfAdjstrNum);
	}


	public void setXrfAdjstrNum(long number) {
	    number = checkXrfAdjstrNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setXrfAdjstrNum((int)number);
	}
	
    /**
	 *	Returns the value of xrfCmData
	 *  Corresponding COBOL Variable is XRF-CM-DATA
	 *	@return xrfCmData
	 */
	public List<char[]> getXrfCmData() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < XRF_CM_DATA_SIZE;index++) {
        	list.add( getXrfCmData( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return xrfCmData
	 */
	public char[] getXrfCmData(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getXrfCmData(), resetting it to 0",index);
		    index = 0;
        } else if (index >= XRF_CM_DATA_SIZE) {
             	index = XRF_CM_DATA_SIZE -1; // can't exceed max array size
             	logger.trace("xrfCmData - Array index exceeded max Size {}, resetting it to max allowed",XRF_CM_DATA_SIZE); 
	    }
   	      return getCharArray( (beginXrfCmData + index*XRF_CM_DATA_LEN) , XRF_CM_DATA_LEN );
    }
    
    
   public int  xrfCmDataFieldLength() {
   	return XRF_CM_DATA_LEN;
   }
   
	

  
  	/**
	 *	Update XrfCmData with the passed value at a given index
	 *  Corresponding COBOL Variable is XRF-CM-DATA
	 *  @param index
	 *	@param value
	 */
  public void setXrfCmData(int index,char[] value) {
   	setXrfCmData(index,value,true);
   }
   
   
   /**
	 *	Update XrfCmData with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setXrfCmData(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setXrfCmData(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 252)  {     
		       value = substring(value,0,252);
           }  else if (value.length < 252) {
		       value = pad(252, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(252).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeXrfCmData(index,value);		
       }
   }
   
	public short getXrfBankAcctEe() throws CFException {
        if (isXrfBankAcctEeModified()) { 
           xrfBankAcctEe = refreshXrfBankAcctEe();
        }
   		return xrfBankAcctEe;
	}
	
	/**
	 * 	Update XrfBankAcctEe with the passed value
	 *  Corresponding COBOL Variable is XRF-BANK-ACCT-EE
	 *	@param number
	 */
	public void setXrfBankAcctEe(short number) {
			xrfBankAcctEe = checkXrfBankAcctEeMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeXrfBankAcctEe(xrfBankAcctEe);
	}

	public void setXrfBankAcctEe(int number) {
	    number = checkXrfBankAcctEeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfBankAcctEe((short)number);
	}
	public void setXrfBankAcctEe(long number) {
	    number = checkXrfBankAcctEeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfBankAcctEe((short)number);
	}
	

	/**
	 *	Returns the value of xrfRegionIndEe
	 *	@return xrfRegionIndEe
	 */
   public char[] getXrfRegionIndEe() throws CFException{
     if (isXrfRegionIndEeModified()) { 
        xrfRegionIndEe = refreshXrfRegionIndEe();
     }
   		return xrfRegionIndEe;
   }

  
	/**
	*  set variable xrfRegionIndEe
	*  Corresponding COBOL Variable is XRF-REGION-IND-EE
	*  @param value
	**/
   public void setXrfRegionIndEe(char[] value) {
      xrfRegionIndEe = checkXrfRegionIndEeConstraints(value);
      serializeXrfRegionIndEe(xrfRegionIndEe);
   } 

     /**
	 * 	Update XrfRegionIndEe 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfRegionIndEe(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfRegionIndEe,xrfRegionIndEe.length);
   	
   }
   
   public void setXrfRegionIndEe(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfRegionIndEe,xrfRegionIndEe.length);
   	
   }
   
     /**
	 * 	Update XrfRegionIndEe 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfRegionIndEe(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfRegionIndEe+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfRegionIndEe with another Field
	 *	@param value
	 */
   public void setXrfRegionIndEe(Field source) {
       replace(source,0,source.length(),beginXrfRegionIndEe,XRF_REGION_IND_EE_LEN);
   	
   }  
   
     /**
	 * 	Update XrfRegionIndEe 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfRegionIndEe(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfRegionIndEe,XRF_REGION_IND_EE_LEN);
   	
   }
   
     /**
	 * 	Update XrfRegionIndEe 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfRegionIndEe(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfRegionIndEe+targetIndex,targetLen);
    
   }
    /**
	 *	Returns the value of xrfPrsInd
	 *  Corresponding COBOL Variable is XRF-PRS-IND
	 *	@return xrfPrsInd
	 */
	public List<char[]> getXrfPrsInd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < XRF_PRS_IND_SIZE;index++) {
        	list.add( getXrfPrsInd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return xrfPrsInd
	 */
	public char[] getXrfPrsInd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getXrfPrsInd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= XRF_PRS_IND_SIZE) {
             	index = XRF_PRS_IND_SIZE -1; // can't exceed max array size
             	logger.trace("xrfPrsInd - Array index exceeded max Size {}, resetting it to max allowed",XRF_PRS_IND_SIZE); 
	    }
   	      return getCharArray( (beginXrfPrsInd + index*XRF_PRS_IND_LEN) , XRF_PRS_IND_LEN );
    }
    
    
   public int  xrfPrsIndFieldLength() {
   	return XRF_PRS_IND_LEN;
   }
   
	

  
  	/**
	 *	Update XrfPrsInd with the passed value at a given index
	 *  Corresponding COBOL Variable is XRF-PRS-IND
	 *  @param index
	 *	@param value
	 */
  public void setXrfPrsInd(int index,char[] value) {
   	setXrfPrsInd(index,value,true);
   }
   
   
   /**
	 *	Update XrfPrsInd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setXrfPrsInd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setXrfPrsInd(int,String,boolean), reset it to 0",index);
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
		serializeXrfPrsInd(index,value);		
       }
   }
   
	/**
	 *	Returns the value of xrfUpdLog
	 *	@return xrfUpdLog
	 */   
	 public XrfUpdLog getXrfUpdLog() {
   	return xrfUpdLog;
   }
   /**
	* 	Update XrfUpdLog with the passed value
	*   Corresponding COBOL Variable is XRF-UPD-LOG
	*	@param value
	*/
   public void setXrfUpdLog(char[] value) {
      xrfUpdLog.setString(value); 
   }   
    
     /**
	 * 	Update XrfUpdLog 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setXrfUpdLog(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xrfUpdLog.begin,xrfUpdLog.length());
   }
   
     /**
	 * 	Update XrfUpdLog 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfUpdLog(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xrfUpdLog.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update XrfUpdLog with another Field
	 *	@param value
	 */
   public void setXrfUpdLog(Field source) {
   	replace(source,0,source.length(),xrfUpdLog.begin,xrfUpdLog.length());
   }  
   
     /**
	 * 	Update XrfUpdLog 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setXrfUpdLog(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,xrfUpdLog.begin,xrfUpdLog.length());
   }
   
     /**
	 * 	Update XrfUpdLog 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfUpdLog(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,xrfUpdLog.begin+targetIndex,targetLen);
   }
	public short getXrfPortDate() throws CFException {
        if (isXrfPortDateModified()) { 
           xrfPortDate = refreshXrfPortDate();
        }
   		return xrfPortDate;
	}
	
	/**
	 * 	Update XrfPortDate with the passed value
	 *  Corresponding COBOL Variable is XRF-PORT-DATE
	 *	@param number
	 */
	public void setXrfPortDate(short number) {
			xrfPortDate = checkXrfPortDateMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeXrfPortDate(xrfPortDate);
	}

	public void setXrfPortDate(int number) {
	    number = checkXrfPortDateMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfPortDate((short)number);
	}
	public void setXrfPortDate(long number) {
	    number = checkXrfPortDateMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setXrfPortDate((short)number);
	}
	

	/**
	 *	Returns the value of xrfLcaInd
	 *	@return xrfLcaInd
	 */
   public char[] getXrfLcaInd() throws CFException{
     if (isXrfLcaIndModified()) { 
        xrfLcaInd = refreshXrfLcaInd();
     }
   		return xrfLcaInd;
   }

  
	/**
	*  set variable xrfLcaInd
	*  Corresponding COBOL Variable is XRF-LCA-IND
	*  @param value
	**/
   public void setXrfLcaInd(char[] value) {
      xrfLcaInd = checkXrfLcaIndConstraints(value);
      serializeXrfLcaInd(xrfLcaInd);
   } 

     /**
	 * 	Update XrfLcaInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfLcaInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfLcaInd,xrfLcaInd.length);
   	
   }
   
   public void setXrfLcaInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfLcaInd,xrfLcaInd.length);
   	
   }
   
     /**
	 * 	Update XrfLcaInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfLcaInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfLcaInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfLcaInd with another Field
	 *	@param value
	 */
   public void setXrfLcaInd(Field source) {
       replace(source,0,source.length(),beginXrfLcaInd,XRF_LCA_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfLcaInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfLcaInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfLcaInd,XRF_LCA_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfLcaInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfLcaInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfLcaInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xrfSourceSysInd
	 *	@return xrfSourceSysInd
	 */
   public char[] getXrfSourceSysInd() throws CFException{
     if (isXrfSourceSysIndModified()) { 
        xrfSourceSysInd = refreshXrfSourceSysInd();
     }
   		return xrfSourceSysInd;
   }

  
	/**
	*  set variable xrfSourceSysInd
	*  Corresponding COBOL Variable is XRF-SOURCE-SYS-IND
	*  @param value
	**/
   public void setXrfSourceSysInd(char[] value) {
      xrfSourceSysInd = checkXrfSourceSysIndConstraints(value);
      serializeXrfSourceSysInd(xrfSourceSysInd);
   } 

     /**
	 * 	Update XrfSourceSysInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXrfSourceSysInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXrfSourceSysInd,xrfSourceSysInd.length);
   	
   }
   
   public void setXrfSourceSysInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXrfSourceSysInd,xrfSourceSysInd.length);
   	
   }
   
     /**
	 * 	Update XrfSourceSysInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXrfSourceSysInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfSourceSysInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XrfSourceSysInd with another Field
	 *	@param value
	 */
   public void setXrfSourceSysInd(Field source) {
       replace(source,0,source.length(),beginXrfSourceSysInd,XRF_SOURCE_SYS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update XrfSourceSysInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXrfSourceSysInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXrfSourceSysInd,XRF_SOURCE_SYS_IND_LEN);
   	
   }
   
     /**
	 * 	Update XrfSourceSysInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXrfSourceSysInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXrfSourceSysInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getXrefRecordFieldLength() {
			return XREF_RECORD_LENGTH;
		}

}
  
