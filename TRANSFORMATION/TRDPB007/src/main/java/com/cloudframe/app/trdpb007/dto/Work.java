package com.cloudframe.app.trdpb007.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 14:02. using version 5.0.0.162
**/


import com.cloudframe.app.trdpb007.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

						private char[] mqm = new char[48];

								private int hconn;

								private int compcode;

								private int reason;

								private int bufflen;

						private char[] tradingParms = new char[29];

								private char[] compcodeEdit = Field.fillLowValue(10);

								private char[] reasonEdit = Field.fillLowValue(10);

								private int mqmtDatagram;

								private int mqperNotPersistent;

						private char[] mqmiNone = new char[24];

						private char[] mqciNone = new char[24];

								private int mqotQ;

								private int mqpmoNoSyncpoint;

								private int mqpmoDefaultContext;

								private int mqccOk;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMqm(fillSpace(48));
								setTradingParms(fillSpace(29));
								setMqmtDatagram(8);
								setMqperNotPersistent(0);
								setMqmiNone(fillLowValue(24));
								setMqciNone(fillLowValue(24));
								setMqotQ(1);
								setMqpmoNoSyncpoint(4);
								setMqpmoDefaultContext(32);
								setMqccOk(0);
    }


 

	/**
	 *	Returns the value of mqm
	 *	@return mqm
	 */
   public char[] getMqm() throws CFException{
   		return mqm;
   }

  
	/**
	*  set variable mqm
	*  Corresponding COBOL Variable is WS-MQM
	*  @param value
	**/
   public void setMqm(char[] value) {
       value = checkMqmConstraints(value);
       arraycopy(value,0,mqm,0,value.length);
   } 
	public void setMqm(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mqm,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hconn
	 *	@return hconn
	 */
	public int getHconn() throws CFException {
   		return hconn;
	}
	
	/**
	 * 	Update Hconn with the passed value
	 *  Corresponding COBOL Variable is WS-HCONN
	 *	@param number
	 */
	public void setHconn(int number) {
	     // Truncate if the number is beyond +/- Max range
	    hconn = checkHconnMaxLimit(number); 
	}


	public void setHconn(long number) {
	    number = checkHconnMaxLimit(number); // Truncate if value is beyond +/- Max range
		setHconn((int)number);
	}
	
	/**
	 *	Returns the value of compcode
	 *	@return compcode
	 */
	public int getCompcode() throws CFException {
   		return compcode;
	}
	
	/**
	 * 	Update Compcode with the passed value
	 *  Corresponding COBOL Variable is WS-COMPCODE
	 *	@param number
	 */
	public void setCompcode(int number) {
	     // Truncate if the number is beyond +/- Max range
	    compcode = checkCompcodeMaxLimit(number); 
	}


	public void setCompcode(long number) {
	    number = checkCompcodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCompcode((int)number);
	}
	
	/**
	 *	Returns the value of reason
	 *	@return reason
	 */
	public int getReason() throws CFException {
   		return reason;
	}
	
	/**
	 * 	Update Reason with the passed value
	 *  Corresponding COBOL Variable is WS-REASON
	 *	@param number
	 */
	public void setReason(int number) {
	     // Truncate if the number is beyond +/- Max range
	    reason = checkReasonMaxLimit(number); 
	}


	public void setReason(long number) {
	    number = checkReasonMaxLimit(number); // Truncate if value is beyond +/- Max range
		setReason((int)number);
	}
	
	/**
	 *	Returns the value of bufflen
	 *	@return bufflen
	 */
	public int getBufflen() throws CFException {
   		return bufflen;
	}
	
	/**
	 * 	Update Bufflen with the passed value
	 *  Corresponding COBOL Variable is WS-BUFFLEN
	 *	@param number
	 */
	public void setBufflen(int number) {
	     // Truncate if the number is beyond +/- Max range
	    bufflen = checkBufflenMaxLimit(number); 
	}


	public void setBufflen(long number) {
	    number = checkBufflenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBufflen((int)number);
	}
	
	/**
	 *	Returns the value of tradingParms
	 *	@return tradingParms
	 */
   public char[] getTradingParms() throws CFException{
   		return tradingParms;
   }

  
	/**
	*  set variable tradingParms
	*  Corresponding COBOL Variable is WS-TRADING-PARMS
	*  @param value
	**/
   public void setTradingParms(char[] value) {
       value = checkTradingParmsConstraints(value);
       arraycopy(value,0,tradingParms,0,value.length);
   } 
	public void setTradingParms(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tradingParms,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of compcodeEdit
	 *	@return compcodeEdit
	 */
   public char[] getCompcodeEdit() throws CFException{
     if (isCompcodeEditModified()) { 
        compcodeEdit = refreshCompcodeEdit();
     }
   		return compcodeEdit;
   }

  
	/**
	*  set variable compcodeEdit
	*  Corresponding COBOL Variable is WS-COMPCODE-EDIT
	*  @param value
	**/
   public void setCompcodeEdit(char[] value) {
      compcodeEdit = checkCompcodeEditConstraints(value);
      serializeCompcodeEdit(compcodeEdit);
   } 

     /**
	 * 	Update CompcodeEdit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompcodeEdit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCompcodeEdit,compcodeEdit.length);
   	
   }
   
   public void setCompcodeEdit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCompcodeEdit,compcodeEdit.length);
   	
   }
   
     /**
	 * 	Update CompcodeEdit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompcodeEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompcodeEdit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CompcodeEdit with another Field
	 *	@param value
	 */
   public void setCompcodeEdit(Field source) {
       replace(source,0,source.length(),beginCompcodeEdit,COMPCODE_EDIT_LEN);
   	
   }  
   
     /**
	 * 	Update CompcodeEdit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompcodeEdit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCompcodeEdit,COMPCODE_EDIT_LEN);
   	
   }
   
     /**
	 * 	Update CompcodeEdit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompcodeEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompcodeEdit+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of reasonEdit
	 *	@return reasonEdit
	 */
   public char[] getReasonEdit() throws CFException{
     if (isReasonEditModified()) { 
        reasonEdit = refreshReasonEdit();
     }
   		return reasonEdit;
   }

  
	/**
	*  set variable reasonEdit
	*  Corresponding COBOL Variable is WS-REASON-EDIT
	*  @param value
	**/
   public void setReasonEdit(char[] value) {
      reasonEdit = checkReasonEditConstraints(value);
      serializeReasonEdit(reasonEdit);
   } 

     /**
	 * 	Update ReasonEdit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReasonEdit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginReasonEdit,reasonEdit.length);
   	
   }
   
   public void setReasonEdit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginReasonEdit,reasonEdit.length);
   	
   }
   
     /**
	 * 	Update ReasonEdit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReasonEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReasonEdit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ReasonEdit with another Field
	 *	@param value
	 */
   public void setReasonEdit(Field source) {
       replace(source,0,source.length(),beginReasonEdit,REASON_EDIT_LEN);
   	
   }  
   
     /**
	 * 	Update ReasonEdit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReasonEdit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginReasonEdit,REASON_EDIT_LEN);
   	
   }
   
     /**
	 * 	Update ReasonEdit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReasonEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReasonEdit+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mqmtDatagram
	 *	@return mqmtDatagram
	 */
	public int getMqmtDatagram() throws CFException {
   		return mqmtDatagram;
	}
	
	/**
	 * 	Update MqmtDatagram with the passed value
	 *  Corresponding COBOL Variable is MQMT-DATAGRAM
	 *	@param number
	 */
	public void setMqmtDatagram(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqmtDatagram = checkMqmtDatagramMaxLimit(number); 
	}


	public void setMqmtDatagram(long number) {
	    number = checkMqmtDatagramMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqmtDatagram((int)number);
	}
	
	/**
	 *	Returns the value of mqperNotPersistent
	 *	@return mqperNotPersistent
	 */
	public int getMqperNotPersistent() throws CFException {
   		return mqperNotPersistent;
	}
	
	/**
	 * 	Update MqperNotPersistent with the passed value
	 *  Corresponding COBOL Variable is MQPER-NOT-PERSISTENT
	 *	@param number
	 */
	public void setMqperNotPersistent(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqperNotPersistent = checkMqperNotPersistentMaxLimit(number); 
	}


	public void setMqperNotPersistent(long number) {
	    number = checkMqperNotPersistentMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqperNotPersistent((int)number);
	}
	
	/**
	 *	Returns the value of mqmiNone
	 *	@return mqmiNone
	 */
   public char[] getMqmiNone() throws CFException{
   		return mqmiNone;
   }

  
	/**
	*  set variable mqmiNone
	*  Corresponding COBOL Variable is MQMI-NONE
	*  @param value
	**/
   public void setMqmiNone(char[] value) {
       value = checkMqmiNoneConstraints(value);
       arraycopy(value,0,mqmiNone,0,value.length);
   } 
	public void setMqmiNone(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mqmiNone,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of mqciNone
	 *	@return mqciNone
	 */
   public char[] getMqciNone() throws CFException{
   		return mqciNone;
   }

  
	/**
	*  set variable mqciNone
	*  Corresponding COBOL Variable is MQCI-NONE
	*  @param value
	**/
   public void setMqciNone(char[] value) {
       value = checkMqciNoneConstraints(value);
       arraycopy(value,0,mqciNone,0,value.length);
   } 
	public void setMqciNone(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mqciNone,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of mqotQ
	 *	@return mqotQ
	 */
	public int getMqotQ() throws CFException {
   		return mqotQ;
	}
	
	/**
	 * 	Update MqotQ with the passed value
	 *  Corresponding COBOL Variable is MQOT-Q
	 *	@param number
	 */
	public void setMqotQ(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqotQ = checkMqotQMaxLimit(number); 
	}


	public void setMqotQ(long number) {
	    number = checkMqotQMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqotQ((int)number);
	}
	
	/**
	 *	Returns the value of mqpmoNoSyncpoint
	 *	@return mqpmoNoSyncpoint
	 */
	public int getMqpmoNoSyncpoint() throws CFException {
   		return mqpmoNoSyncpoint;
	}
	
	/**
	 * 	Update MqpmoNoSyncpoint with the passed value
	 *  Corresponding COBOL Variable is MQPMO-NO-SYNCPOINT
	 *	@param number
	 */
	public void setMqpmoNoSyncpoint(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoNoSyncpoint = checkMqpmoNoSyncpointMaxLimit(number); 
	}


	public void setMqpmoNoSyncpoint(long number) {
	    number = checkMqpmoNoSyncpointMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqpmoNoSyncpoint((int)number);
	}
	
	/**
	 *	Returns the value of mqpmoDefaultContext
	 *	@return mqpmoDefaultContext
	 */
	public int getMqpmoDefaultContext() throws CFException {
   		return mqpmoDefaultContext;
	}
	
	/**
	 * 	Update MqpmoDefaultContext with the passed value
	 *  Corresponding COBOL Variable is MQPMO-DEFAULT-CONTEXT
	 *	@param number
	 */
	public void setMqpmoDefaultContext(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqpmoDefaultContext = checkMqpmoDefaultContextMaxLimit(number); 
	}


	public void setMqpmoDefaultContext(long number) {
	    number = checkMqpmoDefaultContextMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqpmoDefaultContext((int)number);
	}
	
	/**
	 *	Returns the value of mqccOk
	 *	@return mqccOk
	 */
	public int getMqccOk() throws CFException {
   		return mqccOk;
	}
	
	/**
	 * 	Update MqccOk with the passed value
	 *  Corresponding COBOL Variable is MQCC-OK
	 *	@param number
	 */
	public void setMqccOk(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mqccOk = checkMqccOkMaxLimit(number); 
	}


	public void setMqccOk(long number) {
	    number = checkMqccOkMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMqccOk((int)number);
	}
	

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
