package com.cloudframe.app.cfcard;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.cfcard.file.records.WfRecord;
import com.cloudframe.app.cfcard.dto.Work;
import com.cloudframe.app.cfcard.file.records.WfOutput;
import com.cloudframe.app.cfcard.dto.Parm;


@Context
public class CfcardCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    WfOutput wfOutput;
    Work work;
    WfRecord wfRecord;
    Parm parm;


    private int rc;

    public GlobalExecutorCtx getGlobalCtx() {
            return globalCtx;
    }

    public void setGlobalCtx(GlobalExecutorCtx globalCtx) {
        this.globalCtx = globalCtx;
    }

    public int getRc() {
        return this.rc;
    }

    public void setRc(int rc) {
        this.rc = rc;
    }



    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }


    public WfOutput getWfOutput() {
        if (wfOutput == null) {
            wfOutput = new WfOutput();
        }

        return wfOutput;
    }

    public void setWfOutput(WfOutput wfOutput) {
        this.wfOutput = wfOutput;
    }
    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
    public WfRecord getWfRecord() {
        if (wfRecord == null) {
            wfRecord = new WfRecord();
        }

        return wfRecord;
    }

    public void setWfRecord(WfRecord wfRecord) {
        this.wfRecord = wfRecord;
    }
    public Parm getParm() {
        if (parm == null) {
            parm = new Parm();
        }

        return parm;
    }

    public void setParm(Parm parm) {
        this.parm = parm;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wfOutput.hashCode();
        str += work.hashCode();
        str += wfRecord.hashCode();
        str += parm.hashCode();
       return str.hashCode();
    }

    public CfcardCtx clone() {
        CfcardCtx cloneObj = new CfcardCtx();
        cloneObj.wfOutput = new WfOutput();
        cloneObj.wfOutput.set(wfOutput.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wfRecord = new WfRecord();
        cloneObj.wfRecord.set(wfRecord.getClonedField());
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Parm parm = CfcardCtx.this.getParm();


        public CfcardCtx getCfcardCtx() {
            return CfcardCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += parm.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainlineInCtx implements Cloneable {
     Work work = CfcardCtx.this.getWork();
     Parm parm = CfcardCtx.this.getParm();

	/**
	 *	Returns the value of parmMonth
	 *	@return parmMonth
	 */
	public int getParmMonth() throws CFException {
   		return parm.getParmMonth();
	}


	/**
	 *	Returns String value of parmMonth
	 *	@return parmMonth
	 */
	public char[]  getParmMonthString() throws CFException {
	     return String.valueOf(parm.getParmMonthString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean parmMonthIsNumeric()  throws CFException{
	    return parm.parmMonthIsNumeric();
	}

	/**
	 * 	Update ParmMonth with the passed value
	 *	@param number
	 */
	public void setParmMonth(int number)  throws CFException{
		parm.setParmMonth(number);
	}
	

	public void setParmMonth(long number)  throws CFException{
	    parm.setParmMonth(number);
	}
	
	
	/**
	 * 	Update ParmMonth with the passed value
	 *	@param value (String or char[])
	 */
	public void setParmMonth(char[] value)  throws CFException {
		parm.setParmMonth(value);
	}
	
	/**
	 * 	Update ParmMonth with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setParmMonthString(char[] value)  throws CFException{
		parm.setParmMonth(value);
	}	

	/**
	 *	Test condition "P" for isProcessed()
	 *	@return  Returns true if isProcessed() is "P"
	 */
   public boolean isProcessed() throws CFException {
      return work.isProcessed();
   }

	/**
	*  set values "P"
	*/
   	public void setProcessedTrue()  throws CFException{  			
    	work.setProcessedTrue();
   	}

        public CfcardCtx getCfcardCtx() {
            return CfcardCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
        str += parm.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class InitializeInCtx implements Cloneable {
     WfOutput wfOutput = CfcardCtx.this.getWfOutput();
     Work work = CfcardCtx.this.getWork();
     WfRecord wfRecord = CfcardCtx.this.getWfRecord();

	/**
	 *	Returns the value of wfOutput
	 *	@return wfOutput
	 */   
	 public WfOutput getWfOutput() {
   	return wfOutput;
   }


	/**
	 *	Returns the value of wfRecord
	 *	@return wfRecord
	 */   
	 public WfRecord getWfRecord() {
   	return wfRecord;
   }



        public CfcardCtx getCfcardCtx() {
            return CfcardCtx.this;
        }

        public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wfOutput.hashCode();
        str += work.hashCode();
        str += wfRecord.hashCode();
       return str.hashCode();
    }

    public InitializeInCtx clone() {
        InitializeInCtx cloneObj = new InitializeInCtx();
        cloneObj.wfOutput = new WfOutput();
        cloneObj.wfOutput.set(wfOutput.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wfRecord = new WfRecord();
        cloneObj.wfRecord.set(wfRecord.getClonedField());
        return cloneObj;
    }

    }

    public InitializeInCtx getInitializeInCtx() {
            return new InitializeInCtx();
    }
     public class InitializeOutCtx implements Cloneable {
     WfOutput wfOutput = CfcardCtx.this.getWfOutput();
     Work work = CfcardCtx.this.getWork();
     WfRecord wfRecord = CfcardCtx.this.getWfRecord();

	/**
	 *	Returns the value of outpStatus
	 *	@return outpStatus
	 */
   public char[] getOutpStatus() throws CFException  {              
   		return work.getOutpStatus();
   }

  
	/**
	*  set variable outpStatus
	*  @param value
	**/
   public void setOutpStatus(char[] value) throws CFException {
      work.setOutpStatus(value);
   } 

	/**
	 *	Returns the value of inp1Status
	 *	@return inp1Status
	 */
   public char[] getInp1Status() throws CFException  {              
   		return work.getInp1Status();
   }

  
	/**
	*  set variable inp1Status
	*  @param value
	**/
   public void setInp1Status(char[] value) throws CFException {
      work.setInp1Status(value);
   } 

	/**
	 *	Returns the value of inp1Cnt
	 *	@return inp1Cnt
	 */
	public long getInp1Cnt() throws CFException {
   		return work.getInp1Cnt();
	}


	/**
	 *	Returns String value of inp1Cnt
	 *	@return inp1Cnt
	 */
	public char[]  getInp1CntString() throws CFException {
	     return String.valueOf(work.getInp1CntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inp1CntIsNumeric()  throws CFException{
	    return work.inp1CntIsNumeric();
	}

	/**
	 * 	Update Inp1Cnt with the passed value
	 *	@param number
	 */
	public void setInp1Cnt(long number)  throws CFException{
		work.setInp1Cnt(number);
	}
	

	
	/**
	 * 	Update Inp1Cnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setInp1Cnt(char[] value)  throws CFException {
		work.setInp1Cnt(value);
	}
	
	/**
	 * 	Update Inp1Cnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInp1CntString(char[] value)  throws CFException{
		work.setInp1Cnt(value);
	}	

	/**
	 *	Returns the value of outpCntW
	 *	@return outpCntW
	 */
	public long getOutpCntW() throws CFException {
   		return work.getOutpCntW();
	}


	/**
	 *	Returns String value of outpCntW
	 *	@return outpCntW
	 */
	public char[]  getOutpCntWString() throws CFException {
	     return String.valueOf(work.getOutpCntWString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outpCntWIsNumeric()  throws CFException{
	    return work.outpCntWIsNumeric();
	}

	/**
	 * 	Update OutpCntW with the passed value
	 *	@param number
	 */
	public void setOutpCntW(long number)  throws CFException{
		work.setOutpCntW(number);
	}
	

	
	/**
	 * 	Update OutpCntW with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutpCntW(char[] value)  throws CFException {
		work.setOutpCntW(value);
	}
	
	/**
	 * 	Update OutpCntW with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutpCntWString(char[] value)  throws CFException{
		work.setOutpCntW(value);
	}	


        public CfcardCtx getCfcardCtx() {
            return CfcardCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wfOutput.hashCode();
        str += work.hashCode();
        str += wfRecord.hashCode();
       return str.hashCode();
    }

    public InitializeOutCtx clone() {
        InitializeOutCtx cloneObj = new InitializeOutCtx();
        cloneObj.wfOutput = new WfOutput();
        cloneObj.wfOutput.set(wfOutput.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wfRecord = new WfRecord();
        cloneObj.wfRecord.set(wfRecord.getClonedField());
        return cloneObj;
    }

    }

    public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
    }
     public class ProcessRecordInCtx implements Cloneable {
     Work work = CfcardCtx.this.getWork();
     WfRecord wfRecord = CfcardCtx.this.getWfRecord();
     Parm parm = CfcardCtx.this.getParm();

	/**
	 *	Returns the value of parmMonth
	 *	@return parmMonth
	 */
	public int getParmMonth() throws CFException {
   		return parm.getParmMonth();
	}


	/**
	 *	Returns String value of parmMonth
	 *	@return parmMonth
	 */
	public char[]  getParmMonthString() throws CFException {
	     return String.valueOf(parm.getParmMonthString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean parmMonthIsNumeric()  throws CFException{
	    return parm.parmMonthIsNumeric();
	}

	/**
	 * 	Update ParmMonth with the passed value
	 *	@param number
	 */
	public void setParmMonth(int number)  throws CFException{
		parm.setParmMonth(number);
	}
	

	public void setParmMonth(long number)  throws CFException{
	    parm.setParmMonth(number);
	}
	
	
	/**
	 * 	Update ParmMonth with the passed value
	 *	@param value (String or char[])
	 */
	public void setParmMonth(char[] value)  throws CFException {
		parm.setParmMonth(value);
	}
	
	/**
	 * 	Update ParmMonth with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setParmMonthString(char[] value)  throws CFException{
		parm.setParmMonth(value);
	}	

	/**
	 *	Returns the value of currentCard
	 *	@return currentCard
	 */
   public char[] getCurrentCard() throws CFException  {              
   		return work.getCurrentCard();
   }

  
	/**
	*  set variable currentCard
	*  @param value
	**/
   public void setCurrentCard(char[] value) throws CFException {
      work.setCurrentCard(value);
   } 

	/**
	 *	Returns the value of wfInCardNumber
	 *	@return wfInCardNumber
	 */
   public char[] getWfInCardNumber() throws CFException  {              
   		return wfRecord.getWfInCardNumber();
   }

  
	/**
	*  set variable wfInCardNumber
	*  @param value
	**/
   public void setWfInCardNumber(char[] value) throws CFException {
      wfRecord.setWfInCardNumber(value);
   } 

     /**
	 * 	Update WfInCardNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWfInCardNumber(char[] source, int sourceIndex) throws CFException {
      wfRecord.setWfInCardNumber(source, sourceIndex);
   	
   }
   
   public void setWfInCardNumber(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wfRecord.setWfInCardNumber(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WfInCardNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWfInCardNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wfRecord.setWfInCardNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WfInCardNumber with another Field
	 *	@param value
	 */
   public void setWfInCardNumber(Field source) {
      wfRecord.setWfInCardNumber(source);
   }  
   
     /**
	 * 	Update WfInCardNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWfInCardNumber(Field source, int sourceIndex,int sourceLen) {
      wfRecord.setWfInCardNumber(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WfInCardNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWfInCardNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wfRecord.setWfInCardNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of inp1Cnt
	 *	@return inp1Cnt
	 */
	public long getInp1Cnt() throws CFException {
   		return work.getInp1Cnt();
	}


	/**
	 *	Returns String value of inp1Cnt
	 *	@return inp1Cnt
	 */
	public char[]  getInp1CntString() throws CFException {
	     return String.valueOf(work.getInp1CntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inp1CntIsNumeric()  throws CFException{
	    return work.inp1CntIsNumeric();
	}

	/**
	 * 	Update Inp1Cnt with the passed value
	 *	@param number
	 */
	public void setInp1Cnt(long number)  throws CFException{
		work.setInp1Cnt(number);
	}
	

	
	/**
	 * 	Update Inp1Cnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setInp1Cnt(char[] value)  throws CFException {
		work.setInp1Cnt(value);
	}
	
	/**
	 * 	Update Inp1Cnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInp1CntString(char[] value)  throws CFException{
		work.setInp1Cnt(value);
	}	


        public CfcardCtx getCfcardCtx() {
            return CfcardCtx.this;
        }

        public ProcessRecordOutCtx getProcessRecordOutCtx() {
            return new ProcessRecordOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
        str += wfRecord.hashCode();
        str += parm.hashCode();
       return str.hashCode();
    }

    public ProcessRecordInCtx clone() {
        ProcessRecordInCtx cloneObj = new ProcessRecordInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wfRecord = new WfRecord();
        cloneObj.wfRecord.set(wfRecord.getClonedField());
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        return cloneObj;
    }

    }

    public ProcessRecordInCtx getProcessRecordInCtx() {
            return new ProcessRecordInCtx();
    }
     public class ProcessRecordOutCtx implements Cloneable {
     Work work = CfcardCtx.this.getWork();
     WfRecord wfRecord = CfcardCtx.this.getWfRecord();
     Parm parm = CfcardCtx.this.getParm();

	/**
	 *	Returns the value of outTotal
	 *	@return outTotal
	 */
	public BigDecimal getOutTotal() throws CFException {
   		return work.getOutTotal();
	}


	 /**
     *	Returns String value of outTotal
     *	@return outTotal
     */
    public char[]  getOutTotalString() throws CFException {
         return work.getOutTotalString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean outTotalIsNumeric() {
        return work.outTotalIsNumeric();
    }
	/**
	 * 	Update OutTotal with the passed number
	 *	@param number
	 */
	public void setOutTotal(BigDecimal number)  throws CFException{
		work.setOutTotal(number);
   }

	/**
	 * 	Update OutTotal with the passed value
	 *	@param value (String or char[]);
	 */
	public void setOutTotal(char[] value)  throws CFException{
		work.setOutTotal(value);
	}   

	/**
	 *	Test condition "P" for isProcessed()
	 *	@return  Returns true if isProcessed() is "P"
	 */
   public boolean isProcessed() throws CFException {
      return work.isProcessed();
   }

	/**
	*  set values "P"
	*/
   	public void setProcessedTrue()  throws CFException{  			
    	work.setProcessedTrue();
   	}
	/**
	 *	Returns the value of currentCard
	 *	@return currentCard
	 */
   public char[] getCurrentCard() throws CFException  {              
   		return work.getCurrentCard();
   }

  
	/**
	*  set variable currentCard
	*  @param value
	**/
   public void setCurrentCard(char[] value) throws CFException {
      work.setCurrentCard(value);
   } 

	/**
	 *	Returns the value of wfRecord
	 *	@return wfRecord
	 */   
	 public WfRecord getWfRecord() {
   	return wfRecord;
   }


	/**
	 *	Returns the value of wfInServiceMm
	 *	@return wfInServiceMm
	 */
   public char[] getWfInServiceMm() throws CFException  {              
   		return wfRecord.getWfInServiceDate().getWfInServiceMm();
   }

  
	/**
	*  set variable wfInServiceMm
	*  @param value
	**/
   public void setWfInServiceMm(char[] value) throws CFException {
      wfRecord.getWfInServiceDate().setWfInServiceMm(value);
   } 

     /**
	 * 	Update WfInServiceMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWfInServiceMm(char[] source, int sourceIndex) throws CFException {
      wfRecord.getWfInServiceDate().setWfInServiceMm(source, sourceIndex);
   	
   }
   
   public void setWfInServiceMm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wfRecord.getWfInServiceDate().setWfInServiceMm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WfInServiceMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWfInServiceMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wfRecord.getWfInServiceDate().setWfInServiceMm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WfInServiceMm with another Field
	 *	@param value
	 */
   public void setWfInServiceMm(Field source) {
      wfRecord.getWfInServiceDate().setWfInServiceMm(source);
   }  
   
     /**
	 * 	Update WfInServiceMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWfInServiceMm(Field source, int sourceIndex,int sourceLen) {
      wfRecord.getWfInServiceDate().setWfInServiceMm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WfInServiceMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWfInServiceMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wfRecord.getWfInServiceDate().setWfInServiceMm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wfInCardNumber
	 *	@return wfInCardNumber
	 */
   public char[] getWfInCardNumber() throws CFException  {              
   		return wfRecord.getWfInCardNumber();
   }

  
	/**
	*  set variable wfInCardNumber
	*  @param value
	**/
   public void setWfInCardNumber(char[] value) throws CFException {
      wfRecord.setWfInCardNumber(value);
   } 

     /**
	 * 	Update WfInCardNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWfInCardNumber(char[] source, int sourceIndex) throws CFException {
      wfRecord.setWfInCardNumber(source, sourceIndex);
   	
   }
   
   public void setWfInCardNumber(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wfRecord.setWfInCardNumber(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WfInCardNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWfInCardNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wfRecord.setWfInCardNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WfInCardNumber with another Field
	 *	@param value
	 */
   public void setWfInCardNumber(Field source) {
      wfRecord.setWfInCardNumber(source);
   }  
   
     /**
	 * 	Update WfInCardNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWfInCardNumber(Field source, int sourceIndex,int sourceLen) {
      wfRecord.setWfInCardNumber(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WfInCardNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWfInCardNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wfRecord.setWfInCardNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of inp1Status
	 *	@return inp1Status
	 */
   public char[] getInp1Status() throws CFException  {              
   		return work.getInp1Status();
   }

  
	/**
	*  set variable inp1Status
	*  @param value
	**/
   public void setInp1Status(char[] value) throws CFException {
      work.setInp1Status(value);
   } 

	/**
	 *	Returns the value of inp1Cnt
	 *	@return inp1Cnt
	 */
	public long getInp1Cnt() throws CFException {
   		return work.getInp1Cnt();
	}


	/**
	 *	Returns String value of inp1Cnt
	 *	@return inp1Cnt
	 */
	public char[]  getInp1CntString() throws CFException {
	     return String.valueOf(work.getInp1CntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inp1CntIsNumeric()  throws CFException{
	    return work.inp1CntIsNumeric();
	}

	/**
	 * 	Update Inp1Cnt with the passed value
	 *	@param number
	 */
	public void setInp1Cnt(long number)  throws CFException{
		work.setInp1Cnt(number);
	}
	

	
	/**
	 * 	Update Inp1Cnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setInp1Cnt(char[] value)  throws CFException {
		work.setInp1Cnt(value);
	}
	
	/**
	 * 	Update Inp1Cnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInp1CntString(char[] value)  throws CFException{
		work.setInp1Cnt(value);
	}	

	/**
	 *	Returns the value of wfInBalance
	 *	@return wfInBalance
	 */
	public BigDecimal getWfInBalance() throws CFException {
   		return wfRecord.getWfInBalance();
	}

    /**
	 *	Returns the String value of wfInBalance
	 *	@return wfInBalance
	 */
	public char[]  getWfInBalanceActualString()  throws CFException{
	    return wfRecord.getWfInBalanceActualString();
	}

	 /**
     *	Returns String value of wfInBalance
     *	@return wfInBalance
     */
    public char[]  getWfInBalanceString() throws CFException {
         return wfRecord.getWfInBalanceString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean wfInBalanceIsNumeric() {
        return wfRecord.wfInBalanceIsNumeric();
    }
	/**
	 * 	Update WfInBalance with the passed number
	 *	@param number
	 */
	public void setWfInBalance(BigDecimal number)  throws CFException{
		wfRecord.setWfInBalance(number);
   }

	/**
	 * 	Update WfInBalance with the passed value
	 *	@param value (String or char[]);
	 */
	public void setWfInBalance(char[] value)  throws CFException{
		wfRecord.setWfInBalance(value);
	}   


        public CfcardCtx getCfcardCtx() {
            return CfcardCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
        str += wfRecord.hashCode();
        str += parm.hashCode();
       return str.hashCode();
    }

    public ProcessRecordOutCtx clone() {
        ProcessRecordOutCtx cloneObj = new ProcessRecordOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wfRecord = new WfRecord();
        cloneObj.wfRecord.set(wfRecord.getClonedField());
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        return cloneObj;
    }

    }

    public ProcessRecordOutCtx getProcessRecordOutCtx() {
            return new ProcessRecordOutCtx();
    }
     public class WriteFileInCtx implements Cloneable {
     WfOutput wfOutput = CfcardCtx.this.getWfOutput();
     Work work = CfcardCtx.this.getWork();
     Parm parm = CfcardCtx.this.getParm();

	/**
	 *	Returns the value of outTotal
	 *	@return outTotal
	 */
	public BigDecimal getOutTotal() throws CFException {
   		return work.getOutTotal();
	}


	 /**
     *	Returns String value of outTotal
     *	@return outTotal
     */
    public char[]  getOutTotalString() throws CFException {
         return work.getOutTotalString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean outTotalIsNumeric() {
        return work.outTotalIsNumeric();
    }
	/**
	 * 	Update OutTotal with the passed number
	 *	@param number
	 */
	public void setOutTotal(BigDecimal number)  throws CFException{
		work.setOutTotal(number);
   }

	/**
	 * 	Update OutTotal with the passed value
	 *	@param value (String or char[]);
	 */
	public void setOutTotal(char[] value)  throws CFException{
		work.setOutTotal(value);
	}   

	/**
	 *	Returns the value of wfOutput
	 *	@return wfOutput
	 */   
	 public WfOutput getWfOutput() {
   	return wfOutput;
   }


	/**
	 *	Returns the value of parmMonth
	 *	@return parmMonth
	 */
	public int getParmMonth() throws CFException {
   		return parm.getParmMonth();
	}


	/**
	 *	Returns String value of parmMonth
	 *	@return parmMonth
	 */
	public char[]  getParmMonthString() throws CFException {
	     return String.valueOf(parm.getParmMonthString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean parmMonthIsNumeric()  throws CFException{
	    return parm.parmMonthIsNumeric();
	}

	/**
	 * 	Update ParmMonth with the passed value
	 *	@param number
	 */
	public void setParmMonth(int number)  throws CFException{
		parm.setParmMonth(number);
	}
	

	public void setParmMonth(long number)  throws CFException{
	    parm.setParmMonth(number);
	}
	
	
	/**
	 * 	Update ParmMonth with the passed value
	 *	@param value (String or char[])
	 */
	public void setParmMonth(char[] value)  throws CFException {
		parm.setParmMonth(value);
	}
	
	/**
	 * 	Update ParmMonth with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setParmMonthString(char[] value)  throws CFException{
		parm.setParmMonth(value);
	}	

	/**
	 *	Returns the value of currentCard
	 *	@return currentCard
	 */
   public char[] getCurrentCard() throws CFException  {              
   		return work.getCurrentCard();
   }

  
	/**
	*  set variable currentCard
	*  @param value
	**/
   public void setCurrentCard(char[] value) throws CFException {
      work.setCurrentCard(value);
   } 

	/**
	 *	Returns the value of outpCntW
	 *	@return outpCntW
	 */
	public long getOutpCntW() throws CFException {
   		return work.getOutpCntW();
	}


	/**
	 *	Returns String value of outpCntW
	 *	@return outpCntW
	 */
	public char[]  getOutpCntWString() throws CFException {
	     return String.valueOf(work.getOutpCntWString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outpCntWIsNumeric()  throws CFException{
	    return work.outpCntWIsNumeric();
	}

	/**
	 * 	Update OutpCntW with the passed value
	 *	@param number
	 */
	public void setOutpCntW(long number)  throws CFException{
		work.setOutpCntW(number);
	}
	

	
	/**
	 * 	Update OutpCntW with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutpCntW(char[] value)  throws CFException {
		work.setOutpCntW(value);
	}
	
	/**
	 * 	Update OutpCntW with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutpCntWString(char[] value)  throws CFException{
		work.setOutpCntW(value);
	}	


        public CfcardCtx getCfcardCtx() {
            return CfcardCtx.this;
        }

        public WriteFileOutCtx getWriteFileOutCtx() {
            return new WriteFileOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wfOutput.hashCode();
        str += work.hashCode();
        str += parm.hashCode();
       return str.hashCode();
    }

    public WriteFileInCtx clone() {
        WriteFileInCtx cloneObj = new WriteFileInCtx();
        cloneObj.wfOutput = new WfOutput();
        cloneObj.wfOutput.set(wfOutput.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        return cloneObj;
    }

    }

    public WriteFileInCtx getWriteFileInCtx() {
            return new WriteFileInCtx();
    }
     public class WriteFileOutCtx implements Cloneable {
     WfOutput wfOutput = CfcardCtx.this.getWfOutput();
     Work work = CfcardCtx.this.getWork();
     Parm parm = CfcardCtx.this.getParm();

	/**
	 *	Returns the value of outTotal
	 *	@return outTotal
	 */
	public BigDecimal getOutTotal() throws CFException {
   		return work.getOutTotal();
	}


	 /**
     *	Returns String value of outTotal
     *	@return outTotal
     */
    public char[]  getOutTotalString() throws CFException {
         return work.getOutTotalString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean outTotalIsNumeric() {
        return work.outTotalIsNumeric();
    }
	/**
	 * 	Update OutTotal with the passed number
	 *	@param number
	 */
	public void setOutTotal(BigDecimal number)  throws CFException{
		work.setOutTotal(number);
   }

	/**
	 * 	Update OutTotal with the passed value
	 *	@param value (String or char[]);
	 */
	public void setOutTotal(char[] value)  throws CFException{
		work.setOutTotal(value);
	}   

	/**
	 *	Returns the value of wfOutput
	 *	@return wfOutput
	 */   
	 public WfOutput getWfOutput() {
   	return wfOutput;
   }


	/**
	 *	Returns the value of outpStatus
	 *	@return outpStatus
	 */
   public char[] getOutpStatus() throws CFException  {              
   		return work.getOutpStatus();
   }

  
	/**
	*  set variable outpStatus
	*  @param value
	**/
   public void setOutpStatus(char[] value) throws CFException {
      work.setOutpStatus(value);
   } 

	/**
	 *	Returns the value of wfOutServiceMm
	 *	@return wfOutServiceMm
	 */
	public int getWfOutServiceMm() throws CFException {
   		return wfOutput.getWfOutServiceMm();
	}


	/**
	 *	Returns String value of wfOutServiceMm
	 *	@return wfOutServiceMm
	 */
	public char[]  getWfOutServiceMmString() throws CFException {
	     return String.valueOf(wfOutput.getWfOutServiceMmString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wfOutServiceMmIsNumeric()  throws CFException{
	    return wfOutput.wfOutServiceMmIsNumeric();
	}

	/**
	 * 	Update WfOutServiceMm with the passed value
	 *	@param number
	 */
	public void setWfOutServiceMm(int number)  throws CFException{
		wfOutput.setWfOutServiceMm(number);
	}
	

	public void setWfOutServiceMm(long number)  throws CFException{
	    wfOutput.setWfOutServiceMm(number);
	}
	
	
	/**
	 * 	Update WfOutServiceMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setWfOutServiceMm(char[] value)  throws CFException {
		wfOutput.setWfOutServiceMm(value);
	}
	
	/**
	 * 	Update WfOutServiceMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWfOutServiceMmString(char[] value)  throws CFException{
		wfOutput.setWfOutServiceMm(value);
	}	

	/**
	 *	Returns the value of parmMonth
	 *	@return parmMonth
	 */
	public int getParmMonth() throws CFException {
   		return parm.getParmMonth();
	}


	/**
	 *	Returns String value of parmMonth
	 *	@return parmMonth
	 */
	public char[]  getParmMonthString() throws CFException {
	     return String.valueOf(parm.getParmMonthString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean parmMonthIsNumeric()  throws CFException{
	    return parm.parmMonthIsNumeric();
	}

	/**
	 * 	Update ParmMonth with the passed value
	 *	@param number
	 */
	public void setParmMonth(int number)  throws CFException{
		parm.setParmMonth(number);
	}
	

	public void setParmMonth(long number)  throws CFException{
	    parm.setParmMonth(number);
	}
	
	
	/**
	 * 	Update ParmMonth with the passed value
	 *	@param value (String or char[])
	 */
	public void setParmMonth(char[] value)  throws CFException {
		parm.setParmMonth(value);
	}
	
	/**
	 * 	Update ParmMonth with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setParmMonthString(char[] value)  throws CFException{
		parm.setParmMonth(value);
	}	

	/**
	 *	Returns the value of wfOutTotal
	 *	@return wfOutTotal
	 */
	public BigDecimal getWfOutTotal() throws CFException {
   		return wfOutput.getWfOutTotal();
	}


	 /**
     *	Returns String value of wfOutTotal
     *	@return wfOutTotal
     */
    public char[]  getWfOutTotalString() throws CFException {
         return wfOutput.getWfOutTotalString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean wfOutTotalIsNumeric() {
        return wfOutput.wfOutTotalIsNumeric();
    }
	/**
	 * 	Update WfOutTotal with the passed number
	 *	@param number
	 */
	public void setWfOutTotal(BigDecimal number)  throws CFException{
		wfOutput.setWfOutTotal(number);
   }

	/**
	 * 	Update WfOutTotal with the passed value
	 *	@param value (String or char[]);
	 */
	public void setWfOutTotal(char[] value)  throws CFException{
		wfOutput.setWfOutTotal(value);
	}   

	/**
	 *	Returns the value of wfOutCardNumber
	 *	@return wfOutCardNumber
	 */
   public char[] getWfOutCardNumber() throws CFException  {              
   		return wfOutput.getWfOutCardNumber();
   }

  
	/**
	*  set variable wfOutCardNumber
	*  @param value
	**/
   public void setWfOutCardNumber(char[] value) throws CFException {
      wfOutput.setWfOutCardNumber(value);
   } 

     /**
	 * 	Update WfOutCardNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWfOutCardNumber(char[] source, int sourceIndex) throws CFException {
      wfOutput.setWfOutCardNumber(source, sourceIndex);
   	
   }
   
   public void setWfOutCardNumber(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wfOutput.setWfOutCardNumber(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WfOutCardNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWfOutCardNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wfOutput.setWfOutCardNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WfOutCardNumber with another Field
	 *	@param value
	 */
   public void setWfOutCardNumber(Field source) {
      wfOutput.setWfOutCardNumber(source);
   }  
   
     /**
	 * 	Update WfOutCardNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWfOutCardNumber(Field source, int sourceIndex,int sourceLen) {
      wfOutput.setWfOutCardNumber(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WfOutCardNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWfOutCardNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wfOutput.setWfOutCardNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currentCard
	 *	@return currentCard
	 */
   public char[] getCurrentCard() throws CFException  {              
   		return work.getCurrentCard();
   }

  
	/**
	*  set variable currentCard
	*  @param value
	**/
   public void setCurrentCard(char[] value) throws CFException {
      work.setCurrentCard(value);
   } 

	/**
	 *	Returns the value of outpCntW
	 *	@return outpCntW
	 */
	public long getOutpCntW() throws CFException {
   		return work.getOutpCntW();
	}


	/**
	 *	Returns String value of outpCntW
	 *	@return outpCntW
	 */
	public char[]  getOutpCntWString() throws CFException {
	     return String.valueOf(work.getOutpCntWString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outpCntWIsNumeric()  throws CFException{
	    return work.outpCntWIsNumeric();
	}

	/**
	 * 	Update OutpCntW with the passed value
	 *	@param number
	 */
	public void setOutpCntW(long number)  throws CFException{
		work.setOutpCntW(number);
	}
	

	
	/**
	 * 	Update OutpCntW with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutpCntW(char[] value)  throws CFException {
		work.setOutpCntW(value);
	}
	
	/**
	 * 	Update OutpCntW with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutpCntWString(char[] value)  throws CFException{
		work.setOutpCntW(value);
	}	


        public CfcardCtx getCfcardCtx() {
            return CfcardCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wfOutput.hashCode();
        str += work.hashCode();
        str += parm.hashCode();
       return str.hashCode();
    }

    public WriteFileOutCtx clone() {
        WriteFileOutCtx cloneObj = new WriteFileOutCtx();
        cloneObj.wfOutput = new WfOutput();
        cloneObj.wfOutput.set(wfOutput.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        return cloneObj;
    }

    }

    public WriteFileOutCtx getWriteFileOutCtx() {
            return new WriteFileOutCtx();
    }
     public class TerminateInCtx implements Cloneable {
     Work work = CfcardCtx.this.getWork();

	/**
	 *	Returns the value of outpStatus
	 *	@return outpStatus
	 */
   public char[] getOutpStatus() throws CFException  {              
   		return work.getOutpStatus();
   }

  
	/**
	*  set variable outpStatus
	*  @param value
	**/
   public void setOutpStatus(char[] value) throws CFException {
      work.setOutpStatus(value);
   } 

	/**
	 *	Returns the value of currentCard
	 *	@return currentCard
	 */
   public char[] getCurrentCard() throws CFException  {              
   		return work.getCurrentCard();
   }

  
	/**
	*  set variable currentCard
	*  @param value
	**/
   public void setCurrentCard(char[] value) throws CFException {
      work.setCurrentCard(value);
   } 

	/**
	 *	Returns the value of inp1Status
	 *	@return inp1Status
	 */
   public char[] getInp1Status() throws CFException  {              
   		return work.getInp1Status();
   }

  
	/**
	*  set variable inp1Status
	*  @param value
	**/
   public void setInp1Status(char[] value) throws CFException {
      work.setInp1Status(value);
   } 

	/**
	 *	Returns the value of outpCntW
	 *	@return outpCntW
	 */
	public long getOutpCntW() throws CFException {
   		return work.getOutpCntW();
	}


	/**
	 *	Returns String value of outpCntW
	 *	@return outpCntW
	 */
	public char[]  getOutpCntWString() throws CFException {
	     return String.valueOf(work.getOutpCntWString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outpCntWIsNumeric()  throws CFException{
	    return work.outpCntWIsNumeric();
	}

	/**
	 * 	Update OutpCntW with the passed value
	 *	@param number
	 */
	public void setOutpCntW(long number)  throws CFException{
		work.setOutpCntW(number);
	}
	

	
	/**
	 * 	Update OutpCntW with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutpCntW(char[] value)  throws CFException {
		work.setOutpCntW(value);
	}
	
	/**
	 * 	Update OutpCntW with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutpCntWString(char[] value)  throws CFException{
		work.setOutpCntW(value);
	}	


        public CfcardCtx getCfcardCtx() {
            return CfcardCtx.this;
        }

        public TerminateOutCtx getTerminateOutCtx() {
            return new TerminateOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public TerminateInCtx clone() {
        TerminateInCtx cloneObj = new TerminateInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TerminateInCtx getTerminateInCtx() {
            return new TerminateInCtx();
    }
     public class TerminateOutCtx implements Cloneable {
     Work work = CfcardCtx.this.getWork();

	/**
	 *	Returns the value of outpStatus
	 *	@return outpStatus
	 */
   public char[] getOutpStatus() throws CFException  {              
   		return work.getOutpStatus();
   }

  
	/**
	*  set variable outpStatus
	*  @param value
	**/
   public void setOutpStatus(char[] value) throws CFException {
      work.setOutpStatus(value);
   } 

	/**
	 *	Returns the value of inp1Status
	 *	@return inp1Status
	 */
   public char[] getInp1Status() throws CFException  {              
   		return work.getInp1Status();
   }

  
	/**
	*  set variable inp1Status
	*  @param value
	**/
   public void setInp1Status(char[] value) throws CFException {
      work.setInp1Status(value);
   } 


        public CfcardCtx getCfcardCtx() {
            return CfcardCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public TerminateOutCtx clone() {
        TerminateOutCtx cloneObj = new TerminateOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TerminateOutCtx getTerminateOutCtx() {
            return new TerminateOutCtx();
    }
     public class AbendOutCtx implements Cloneable {


        public CfcardCtx getCfcardCtx() {
            return CfcardCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
       return str.hashCode();
    }

    public AbendOutCtx clone() {
        AbendOutCtx cloneObj = new AbendOutCtx();
        return cloneObj;
    }

    }

    public AbendOutCtx getAbendOutCtx() {
            return new AbendOutCtx();
    }
}
