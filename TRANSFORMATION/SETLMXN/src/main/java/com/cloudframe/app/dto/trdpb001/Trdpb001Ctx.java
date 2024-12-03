package com.cloudframe.app.dto.trdpb001;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

 
 
 
 
 
 
import java.sql.ResultSet;
 
 
 
 
 
 
 


@Context
public class Trdpb001Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Parm parm;
    ExceptionRecord exceptionRecord;
    Dcltbtrdsum dcltbtrdsum;
    Work work;
    Dcltbtrdmac dcltbtrdmac;
    CustomerSummaryRec customerSummaryRec;
    Dcltbtrdord dcltbtrdord;
    TrdOrderPair trdOrderPair;
    Sqlca sqlca;
    Dcltbtrdlog dcltbtrdlog;
    Dcltbtrdstq dcltbtrdstq;
    ExceptionRecordLenGroup exceptionRecordLenGroup;


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


    ResultSet settlementQueueResultSet;

    public ResultSet getSettlementQueueResultSet() {
        return this.settlementQueueResultSet;
    }

    public void setSettlementQueueResultSet(ResultSet settlementQueueResultSet) {
        this.settlementQueueResultSet = settlementQueueResultSet;
    }
    ResultSet summaryCsrResultSet;

    public ResultSet getSummaryCsrResultSet() {
        return this.summaryCsrResultSet;
    }

    public void setSummaryCsrResultSet(ResultSet summaryCsrResultSet) {
        this.summaryCsrResultSet = summaryCsrResultSet;
    }

    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
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
    public ExceptionRecord getExceptionRecord() {
        if (exceptionRecord == null) {
            exceptionRecord = new ExceptionRecord();
        }

        return exceptionRecord;
    }

    public void setExceptionRecord(ExceptionRecord exceptionRecord) {
        this.exceptionRecord = exceptionRecord;
    }
    public Dcltbtrdsum getDcltbtrdsum() {
        if (dcltbtrdsum == null) {
            dcltbtrdsum = new Dcltbtrdsum();
        }

        return dcltbtrdsum;
    }

    public void setDcltbtrdsum(Dcltbtrdsum dcltbtrdsum) {
        this.dcltbtrdsum = dcltbtrdsum;
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
    public Dcltbtrdmac getDcltbtrdmac() {
        if (dcltbtrdmac == null) {
            dcltbtrdmac = new Dcltbtrdmac();
        }

        return dcltbtrdmac;
    }

    public void setDcltbtrdmac(Dcltbtrdmac dcltbtrdmac) {
        this.dcltbtrdmac = dcltbtrdmac;
    }
    public CustomerSummaryRec getCustomerSummaryRec() {
        if (customerSummaryRec == null) {
            customerSummaryRec = new CustomerSummaryRec();
        }

        return customerSummaryRec;
    }

    public void setCustomerSummaryRec(CustomerSummaryRec customerSummaryRec) {
        this.customerSummaryRec = customerSummaryRec;
    }
    public Dcltbtrdord getDcltbtrdord() {
        if (dcltbtrdord == null) {
            dcltbtrdord = new Dcltbtrdord();
        }

        return dcltbtrdord;
    }

    public void setDcltbtrdord(Dcltbtrdord dcltbtrdord) {
        this.dcltbtrdord = dcltbtrdord;
    }
    public TrdOrderPair getTrdOrderPair() {
        if (trdOrderPair == null) {
            trdOrderPair = new TrdOrderPair();
        }

        return trdOrderPair;
    }

    public void setTrdOrderPair(TrdOrderPair trdOrderPair) {
        this.trdOrderPair = trdOrderPair;
    }
    public Sqlca getSqlca() {
        if (sqlca == null) {
            sqlca = new Sqlca();
        }

        return sqlca;
    }

    public void setSqlca(Sqlca sqlca) {
        this.sqlca = sqlca;
    }
    public Dcltbtrdlog getDcltbtrdlog() {
        if (dcltbtrdlog == null) {
            dcltbtrdlog = new Dcltbtrdlog();
        }

        return dcltbtrdlog;
    }

    public void setDcltbtrdlog(Dcltbtrdlog dcltbtrdlog) {
        this.dcltbtrdlog = dcltbtrdlog;
    }
    public Dcltbtrdstq getDcltbtrdstq() {
        if (dcltbtrdstq == null) {
            dcltbtrdstq = new Dcltbtrdstq();
        }

        return dcltbtrdstq;
    }

    public void setDcltbtrdstq(Dcltbtrdstq dcltbtrdstq) {
        this.dcltbtrdstq = dcltbtrdstq;
    }
    public ExceptionRecordLenGroup getExceptionRecordLenGroup() {
        if (exceptionRecordLenGroup == null) {
            exceptionRecordLenGroup = new ExceptionRecordLenGroup();
        }

        return exceptionRecordLenGroup;
    }

    public void setExceptionRecordLenGroup(ExceptionRecordLenGroup exceptionRecordLenGroup) {
        this.exceptionRecordLenGroup = exceptionRecordLenGroup;
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
        str += exceptionRecord.hashCode();
        str += dcltbtrdsum.hashCode();
        str += work.hashCode();
        str += dcltbtrdmac.hashCode();
        str += customerSummaryRec.hashCode();
        str += dcltbtrdord.hashCode();
        str += trdOrderPair.hashCode();
        str += sqlca.hashCode();
        str += dcltbtrdlog.hashCode();
        str += dcltbtrdstq.hashCode();
        str += exceptionRecordLenGroup.hashCode();
       return str.hashCode();
    }

    public Trdpb001Ctx clone() {
        Trdpb001Ctx cloneObj = new Trdpb001Ctx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.exceptionRecord = new ExceptionRecord();
        cloneObj.exceptionRecord.set(exceptionRecord.getClonedField());
        cloneObj.dcltbtrdsum = new Dcltbtrdsum();
        cloneObj.dcltbtrdsum.set(dcltbtrdsum.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dcltbtrdmac = new Dcltbtrdmac();
        cloneObj.dcltbtrdmac.set(dcltbtrdmac.getClonedField());
        cloneObj.customerSummaryRec = new CustomerSummaryRec();
        cloneObj.customerSummaryRec.set(customerSummaryRec.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dcltbtrdlog = new Dcltbtrdlog();
        cloneObj.dcltbtrdlog.set(dcltbtrdlog.getClonedField());
        cloneObj.dcltbtrdstq = new Dcltbtrdstq();
        cloneObj.dcltbtrdstq.set(dcltbtrdstq.getClonedField());
        cloneObj.exceptionRecordLenGroup = new ExceptionRecordLenGroup();
        cloneObj.exceptionRecordLenGroup.set(exceptionRecordLenGroup.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Parm parm = Trdpb001Ctx.this.getParm();


        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
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
     Parm parm = Trdpb001Ctx.this.getParm();
     Work work = Trdpb001Ctx.this.getWork();
     Sqlca sqlca = Trdpb001Ctx.this.getSqlca();
     Dcltbtrdstq dcltbtrdstq = Trdpb001Ctx.this.getDcltbtrdstq();
     Dcltbtrdlog dcltbtrdlog = Trdpb001Ctx.this.getDcltbtrdlog();

	/**
	 *	Returns the value of chkpFrequency
	 *	@return chkpFrequency
	 */
	public int getChkpFrequency() throws CFException {
   		return parm.getChkpFrequency();
	}


	/**
	 *	Returns String value of chkpFrequency
	 *	@return chkpFrequency
	 */
	public char[]  getChkpFrequencyString() throws CFException {
	     return String.valueOf(parm.getChkpFrequencyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chkpFrequencyIsNumeric()  throws CFException{
	    return parm.chkpFrequencyIsNumeric();
	}

	/**
	 * 	Update ChkpFrequency with the passed value
	 *	@param number
	 */
	public void setChkpFrequency(int number)  throws CFException{
		parm.setChkpFrequency(number);
	}
	

	public void setChkpFrequency(long number)  throws CFException{
	    parm.setChkpFrequency(number);
	}
	
	
	/**
	 * 	Update ChkpFrequency with the passed value
	 *	@param value (String or char[])
	 */
	public void setChkpFrequency(char[] value)  throws CFException {
		parm.setChkpFrequency(value);
	}
	
	/**
	 * 	Update ChkpFrequency with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChkpFrequencyString(char[] value)  throws CFException{
		parm.setChkpFrequency(value);
	}	

	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currency
	 *	@return currency
	 */
   public char[] getCurrency() throws CFException  {              
   		return parm.getCurrency();
   }

  
	/**
	*  set variable currency
	*  @param value
	**/
   public void setCurrency(char[] value) throws CFException {
      parm.setCurrency(value);
   } 

     /**
	 * 	Update Currency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrency(char[] source, int sourceIndex) throws CFException {
      parm.setCurrency(source, sourceIndex);
   	
   }
   
   public void setCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parm.setCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currency with another Field
	 *	@param value
	 */
   public void setCurrency(Field source) {
      parm.setCurrency(source);
   }  
   
     /**
	 * 	Update Currency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrency(Field source, int sourceIndex,int sourceLen) {
      parm.setCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Test condition "CAD" "CHF" "CNY" "EUR" "GBX" "INR" "JPY" "KRW" "MXN" "USD" for isValidCurrency()
	 *	@return  Returns true if isValidCurrency() is "CAD" "CHF" "CNY" "EUR" "GBX" "INR" "JPY" "KRW" "MXN" "USD"
	 */
   public boolean isValidCurrency() throws CFException {
      return parm.isValidCurrency();
   }

	/**
	*  set values "CAD" "CHF" "CNY" "EUR" "GBX" "INR" "JPY" "KRW" "MXN" "USD"
	*/
   	public void setValidCurrencyTrue()  throws CFException{  			
    	parm.setValidCurrencyTrue();
   	}
	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}


	/**
	 *	Returns the value of dcltbtrdlog
	 *	@return dcltbtrdlog
	 */   
	 public Dcltbtrdlog getDcltbtrdlog() {
   	return dcltbtrdlog;
   }


	/**
	 *	Returns the value of dcltbtrdstq
	 *	@return dcltbtrdstq
	 */   
	 public Dcltbtrdstq getDcltbtrdstq() {
   	return dcltbtrdstq;
   }



        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
        }

        public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
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
        str += work.hashCode();
        str += sqlca.hashCode();
        str += dcltbtrdstq.hashCode();
        str += dcltbtrdlog.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dcltbtrdstq = new Dcltbtrdstq();
        cloneObj.dcltbtrdstq.set(dcltbtrdstq.getClonedField());
        cloneObj.dcltbtrdlog = new Dcltbtrdlog();
        cloneObj.dcltbtrdlog.set(dcltbtrdlog.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     Parm parm = Trdpb001Ctx.this.getParm();
     Work work = Trdpb001Ctx.this.getWork();
     Sqlca sqlca = Trdpb001Ctx.this.getSqlca();
     Dcltbtrdlog dcltbtrdlog = Trdpb001Ctx.this.getDcltbtrdlog();
     Dcltbtrdstq dcltbtrdstq = Trdpb001Ctx.this.getDcltbtrdstq();

	/**
	 *	Test condition "S" for isStopSettlement88()
	 *	@return  Returns true if isStopSettlement88() is "S"
	 */
   public boolean isStopSettlement88() throws CFException {
      return work.isStopSettlement88();
   }

	/**
	*  set values "S"
	*/
   	public void setStopSettlement88True()  throws CFException{  			
    	work.setStopSettlement88True();
   	}
	/**
	 *	Returns the value of logTransaction
	 *	@return logTransaction
	 */
   public char[] getLogTransaction() throws CFException  {              
   		return dcltbtrdlog.getLogTransaction();
   }

  
	/**
	*  set variable logTransaction
	*  @param value
	**/
   public void setLogTransaction(char[] value) throws CFException {
      dcltbtrdlog.setLogTransaction(value);
   } 

     /**
	 * 	Update LogTransaction 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogTransaction(char[] source, int sourceIndex) throws CFException {
      dcltbtrdlog.setLogTransaction(source, sourceIndex);
   	
   }
   
   public void setLogTransaction(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdlog.setLogTransaction(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogTransaction 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogTransaction(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogTransaction(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogTransaction with another Field
	 *	@param value
	 */
   public void setLogTransaction(Field source) {
      dcltbtrdlog.setLogTransaction(source);
   }  
   
     /**
	 * 	Update LogTransaction 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogTransaction(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdlog.setLogTransaction(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogTransaction 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogTransaction(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogTransaction(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of stqCurrency
	 *	@return stqCurrency
	 */
   public char[] getStqCurrency() throws CFException  {              
   		return dcltbtrdstq.getStqCurrency();
   }

  
	/**
	*  set variable stqCurrency
	*  @param value
	**/
   public void setStqCurrency(char[] value) throws CFException {
      dcltbtrdstq.setStqCurrency(value);
   } 

     /**
	 * 	Update StqCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStqCurrency(char[] source, int sourceIndex) throws CFException {
      dcltbtrdstq.setStqCurrency(source, sourceIndex);
   	
   }
   
   public void setStqCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdstq.setStqCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update StqCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStqCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdstq.setStqCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update StqCurrency with another Field
	 *	@param value
	 */
   public void setStqCurrency(Field source) {
      dcltbtrdstq.setStqCurrency(source);
   }  
   
     /**
	 * 	Update StqCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStqCurrency(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdstq.setStqCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update StqCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStqCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdstq.setStqCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currency
	 *	@return currency
	 */
   public char[] getCurrency() throws CFException  {              
   		return parm.getCurrency();
   }

  
	/**
	*  set variable currency
	*  @param value
	**/
   public void setCurrency(char[] value) throws CFException {
      parm.setCurrency(value);
   } 

     /**
	 * 	Update Currency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrency(char[] source, int sourceIndex) throws CFException {
      parm.setCurrency(source, sourceIndex);
   	
   }
   
   public void setCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parm.setCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currency with another Field
	 *	@param value
	 */
   public void setCurrency(Field source) {
      parm.setCurrency(source);
   }  
   
     /**
	 * 	Update Currency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrency(Field source, int sourceIndex,int sourceLen) {
      parm.setCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "A" for isApplException()
	 *	@return  Returns true if isApplException() is "A"
	 */
   public boolean isApplException() throws CFException {
      return work.isApplException();
   }

	/**
	*  set values "A"
	*/
   	public void setApplExceptionTrue()  throws CFException{  			
    	work.setApplExceptionTrue();
   	}
	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Test condition "S" for isSystemException()
	 *	@return  Returns true if isSystemException() is "S"
	 */
   public boolean isSystemException() throws CFException {
      return work.isSystemException();
   }

	/**
	*  set values "S"
	*/
   	public void setSystemExceptionTrue()  throws CFException{  			
    	work.setSystemExceptionTrue();
   	}
	/**
	 *	Returns the value of logStartTs
	 *	@return logStartTs
	 */
   public char[] getLogStartTs() throws CFException  {              
   		return dcltbtrdlog.getLogStartTs();
   }

  
	/**
	*  set variable logStartTs
	*  @param value
	**/
   public void setLogStartTs(char[] value) throws CFException {
      dcltbtrdlog.setLogStartTs(value);
   } 

     /**
	 * 	Update LogStartTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogStartTs(char[] source, int sourceIndex) throws CFException {
      dcltbtrdlog.setLogStartTs(source, sourceIndex);
   	
   }
   
   public void setLogStartTs(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdlog.setLogStartTs(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogStartTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogStartTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogStartTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogStartTs with another Field
	 *	@param value
	 */
   public void setLogStartTs(Field source) {
      dcltbtrdlog.setLogStartTs(source);
   }  
   
     /**
	 * 	Update LogStartTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogStartTs(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdlog.setLogStartTs(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogStartTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogStartTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogStartTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of exception
	 *	@return exception
	 */
   public char[] getException() throws CFException  {              
   		return work.getException();
   }

  
	/**
	*  set variable exception
	*  @param value
	**/
   public void setException(char[] value) throws CFException {
      work.setException(value);
   } 

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Test condition "C" for isContinueSettlement88()
	 *	@return  Returns true if isContinueSettlement88() is "C"
	 */
   public boolean isContinueSettlement88() throws CFException {
      return work.isContinueSettlement88();
   }

	/**
	*  set values "C"
	*/
   	public void setContinueSettlement88True()  throws CFException{  			
    	work.setContinueSettlement88True();
   	}
	/**
	 *	Returns the value of tradeCount
	 *	@return tradeCount
	 */
	public int getTradeCount() throws CFException {        
   		return work.getTradeCount();
	}
	
	/**
	 * 	Update TradeCount with the passed value
	 *	@param number
	 */
	public void setTradeCount(int number)  throws CFException{
		work.setTradeCount(number);
	}


	public void setTradeCount(long number)  throws CFException{
		work.setTradeCount((int)number);
	}


	/**
	 *	Returns the value of chkpFrequency
	 *	@return chkpFrequency
	 */
	public int getChkpFrequency() throws CFException {
   		return parm.getChkpFrequency();
	}


	/**
	 *	Returns String value of chkpFrequency
	 *	@return chkpFrequency
	 */
	public char[]  getChkpFrequencyString() throws CFException {
	     return String.valueOf(parm.getChkpFrequencyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chkpFrequencyIsNumeric()  throws CFException{
	    return parm.chkpFrequencyIsNumeric();
	}

	/**
	 * 	Update ChkpFrequency with the passed value
	 *	@param number
	 */
	public void setChkpFrequency(int number)  throws CFException{
		parm.setChkpFrequency(number);
	}
	

	public void setChkpFrequency(long number)  throws CFException{
	    parm.setChkpFrequency(number);
	}
	
	
	/**
	 * 	Update ChkpFrequency with the passed value
	 *	@param value (String or char[])
	 */
	public void setChkpFrequency(char[] value)  throws CFException {
		parm.setChkpFrequency(value);
	}
	
	/**
	 * 	Update ChkpFrequency with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChkpFrequencyString(char[] value)  throws CFException{
		parm.setChkpFrequency(value);
	}	

	/**
	 *	Returns the value of logEndTs
	 *	@return logEndTs
	 */
   public char[] getLogEndTs() throws CFException  {              
   		return dcltbtrdlog.getLogEndTs();
   }

  
	/**
	*  set variable logEndTs
	*  @param value
	**/
   public void setLogEndTs(char[] value) throws CFException {
      dcltbtrdlog.setLogEndTs(value);
   } 

     /**
	 * 	Update LogEndTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogEndTs(char[] source, int sourceIndex) throws CFException {
      dcltbtrdlog.setLogEndTs(source, sourceIndex);
   	
   }
   
   public void setLogEndTs(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdlog.setLogEndTs(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogEndTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogEndTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogEndTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogEndTs with another Field
	 *	@param value
	 */
   public void setLogEndTs(Field source) {
      dcltbtrdlog.setLogEndTs(source);
   }  
   
     /**
	 * 	Update LogEndTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogEndTs(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdlog.setLogEndTs(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogEndTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogEndTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogEndTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
   public char[] getSqlcode_Ws() throws CFException  {              
   		return work.getSqlcode_Ws();
   }

  
	/**
	*  set variable sqlcode_Ws
	*  @param value
	**/
   public void setSqlcode_Ws(char[] value) throws CFException {
      work.setSqlcode_Ws(value);
   } 

     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex) throws CFException {
      work.setSqlcode_Ws(source, sourceIndex);
   	
   }
   
   public void setSqlcode_Ws(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlcode_Ws with another Field
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source) {
      work.setSqlcode_Ws(source);
   }  
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currtime
	 *	@return currtime
	 */
   public char[] getCurrtime() throws CFException  {              
   		return work.getCurrtime();
   }

  
	/**
	*  set variable currtime
	*  @param value
	**/
   public void setCurrtime(char[] value) throws CFException {
      work.setCurrtime(value);
   } 

	/**
	 *	Returns the value of currdate
	 *	@return currdate
	 */
   public char[] getCurrdate() throws CFException  {              
   		return work.getCurrdate();
   }

  
	/**
	*  set variable currdate
	*  @param value
	**/
   public void setCurrdate(char[] value) throws CFException {
      work.setCurrdate(value);
   } 

	/**
	 *	Returns the value of logCurrency
	 *	@return logCurrency
	 */
   public char[] getLogCurrency() throws CFException  {              
   		return dcltbtrdlog.getLogCurrency();
   }

  
	/**
	*  set variable logCurrency
	*  @param value
	**/
   public void setLogCurrency(char[] value) throws CFException {
      dcltbtrdlog.setLogCurrency(value);
   } 

     /**
	 * 	Update LogCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogCurrency(char[] source, int sourceIndex) throws CFException {
      dcltbtrdlog.setLogCurrency(source, sourceIndex);
   	
   }
   
   public void setLogCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdlog.setLogCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogCurrency with another Field
	 *	@param value
	 */
   public void setLogCurrency(Field source) {
      dcltbtrdlog.setLogCurrency(source);
   }  
   
     /**
	 * 	Update LogCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogCurrency(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdlog.setLogCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdlog.setLogCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dcltbtrdlog
	 *	@return dcltbtrdlog
	 */   
	 public Dcltbtrdlog getDcltbtrdlog() {
   	return dcltbtrdlog;
   }



        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
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
        str += work.hashCode();
        str += sqlca.hashCode();
        str += dcltbtrdlog.hashCode();
        str += dcltbtrdstq.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dcltbtrdlog = new Dcltbtrdlog();
        cloneObj.dcltbtrdlog.set(dcltbtrdlog.getClonedField());
        cloneObj.dcltbtrdstq = new Dcltbtrdstq();
        cloneObj.dcltbtrdstq.set(dcltbtrdstq.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class TradeSettlementInCtx implements Cloneable {
     Parm parm = Trdpb001Ctx.this.getParm();
     Work work = Trdpb001Ctx.this.getWork();
     Sqlca sqlca = Trdpb001Ctx.this.getSqlca();

	/**
	 *	Returns the value of chkpFrequency
	 *	@return chkpFrequency
	 */
	public int getChkpFrequency() throws CFException {
   		return parm.getChkpFrequency();
	}


	/**
	 *	Returns String value of chkpFrequency
	 *	@return chkpFrequency
	 */
	public char[]  getChkpFrequencyString() throws CFException {
	     return String.valueOf(parm.getChkpFrequencyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chkpFrequencyIsNumeric()  throws CFException{
	    return parm.chkpFrequencyIsNumeric();
	}

	/**
	 * 	Update ChkpFrequency with the passed value
	 *	@param number
	 */
	public void setChkpFrequency(int number)  throws CFException{
		parm.setChkpFrequency(number);
	}
	

	public void setChkpFrequency(long number)  throws CFException{
	    parm.setChkpFrequency(number);
	}
	
	
	/**
	 * 	Update ChkpFrequency with the passed value
	 *	@param value (String or char[])
	 */
	public void setChkpFrequency(char[] value)  throws CFException {
		parm.setChkpFrequency(value);
	}
	
	/**
	 * 	Update ChkpFrequency with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChkpFrequencyString(char[] value)  throws CFException{
		parm.setChkpFrequency(value);
	}	

	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tradeCount
	 *	@return tradeCount
	 */
	public int getTradeCount() throws CFException {        
   		return work.getTradeCount();
	}
	
	/**
	 * 	Update TradeCount with the passed value
	 *	@param number
	 */
	public void setTradeCount(int number)  throws CFException{
		work.setTradeCount(number);
	}


	public void setTradeCount(long number)  throws CFException{
		work.setTradeCount((int)number);
	}


	/**
	 *	Test condition "C" for isContinueSettlement88()
	 *	@return  Returns true if isContinueSettlement88() is "C"
	 */
   public boolean isContinueSettlement88() throws CFException {
      return work.isContinueSettlement88();
   }

	/**
	*  set values "C"
	*/
   	public void setContinueSettlement88True()  throws CFException{  			
    	work.setContinueSettlement88True();
   	}
	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}



        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
        }

        public TradeSettlementOutCtx getTradeSettlementOutCtx() {
            return new TradeSettlementOutCtx();
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
        str += work.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public TradeSettlementInCtx clone() {
        TradeSettlementInCtx cloneObj = new TradeSettlementInCtx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public TradeSettlementInCtx getTradeSettlementInCtx() {
            return new TradeSettlementInCtx();
    }
     public class TradeSettlementOutCtx implements Cloneable {
     Parm parm = Trdpb001Ctx.this.getParm();
     Work work = Trdpb001Ctx.this.getWork();
     Sqlca sqlca = Trdpb001Ctx.this.getSqlca();

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of tradeCount
	 *	@return tradeCount
	 */
	public int getTradeCount() throws CFException {        
   		return work.getTradeCount();
	}
	
	/**
	 * 	Update TradeCount with the passed value
	 *	@param number
	 */
	public void setTradeCount(int number)  throws CFException{
		work.setTradeCount(number);
	}


	public void setTradeCount(long number)  throws CFException{
		work.setTradeCount((int)number);
	}



        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
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
        str += work.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public TradeSettlementOutCtx clone() {
        TradeSettlementOutCtx cloneObj = new TradeSettlementOutCtx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public TradeSettlementOutCtx getTradeSettlementOutCtx() {
            return new TradeSettlementOutCtx();
    }
     public class AccountingInCtx implements Cloneable {
     Work work = Trdpb001Ctx.this.getWork();
     Dcltbtrdord dcltbtrdord = Trdpb001Ctx.this.getDcltbtrdord();
     TrdOrderPair trdOrderPair = Trdpb001Ctx.this.getTrdOrderPair();

	/**
	 *	Returns the value of trdOrderId
	 *	@return trdOrderId
	 */
   public char[] getTrdOrderId() throws CFException  {              
   		return trdOrderPair.getTrdOrderId();
   }

  
	/**
	*  set variable trdOrderId
	*  @param value
	**/
   public void setTrdOrderId(char[] value) throws CFException {
      trdOrderPair.setTrdOrderId(value);
   } 

     /**
	 * 	Update TrdOrderId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdOrderId(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdOrderId(source, sourceIndex);
   	
   }
   
   public void setTrdOrderId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdOrderId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdOrderId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdOrderId with another Field
	 *	@param value
	 */
   public void setTrdOrderId(Field source) {
      trdOrderPair.setTrdOrderId(source);
   }  
   
     /**
	 * 	Update TrdOrderId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdOrderId(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdOrderId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdOrderId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of trdCurrency
	 *	@return trdCurrency
	 */
   public char[] getTrdCurrency() throws CFException  {              
   		return trdOrderPair.getTrdCurrency();
   }

  
	/**
	*  set variable trdCurrency
	*  @param value
	**/
   public void setTrdCurrency(char[] value) throws CFException {
      trdOrderPair.setTrdCurrency(value);
   } 

     /**
	 * 	Update TrdCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdCurrency(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdCurrency(source, sourceIndex);
   	
   }
   
   public void setTrdCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdCurrency with another Field
	 *	@param value
	 */
   public void setTrdCurrency(Field source) {
      trdOrderPair.setTrdCurrency(source);
   }  
   
     /**
	 * 	Update TrdCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdCurrency(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "S" for isTrdSacBookingDone()
	 *	@return  Returns true if isTrdSacBookingDone() is "S"
	 */
   public boolean isTrdSacBookingDone() throws CFException {
      return trdOrderPair.isTrdSacBookingDone();
   }

	/**
	*  set values "S"
	*/
   	public void setTrdSacBookingDoneTrue()  throws CFException{  			
    	trdOrderPair.setTrdSacBookingDoneTrue();
   	}
	/**
	 *	Returns the value of trdFigi
	 *	@return trdFigi
	 */
   public char[] getTrdFigi() throws CFException  {              
   		return trdOrderPair.getTrdFigi();
   }

  
	/**
	*  set variable trdFigi
	*  @param value
	**/
   public void setTrdFigi(char[] value) throws CFException {
      trdOrderPair.setTrdFigi(value);
   } 

     /**
	 * 	Update TrdFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdFigi(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdFigi(source, sourceIndex);
   	
   }
   
   public void setTrdFigi(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdFigi(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdFigi with another Field
	 *	@param value
	 */
   public void setTrdFigi(Field source) {
      trdOrderPair.setTrdFigi(source);
   }  
   
     /**
	 * 	Update TrdFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdFigi(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdFigi(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of trdExchange
	 *	@return trdExchange
	 */
   public char[] getTrdExchange() throws CFException  {              
   		return trdOrderPair.getTrdExchange();
   }

  
	/**
	*  set variable trdExchange
	*  @param value
	**/
   public void setTrdExchange(char[] value) throws CFException {
      trdOrderPair.setTrdExchange(value);
   } 

     /**
	 * 	Update TrdExchange 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdExchange(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdExchange(source, sourceIndex);
   	
   }
   
   public void setTrdExchange(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdExchange(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdExchange 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdExchange(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdExchange(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdExchange with another Field
	 *	@param value
	 */
   public void setTrdExchange(Field source) {
      trdOrderPair.setTrdExchange(source);
   }  
   
     /**
	 * 	Update TrdExchange 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdExchange(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdExchange(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdExchange 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdExchange(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdExchange(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "M" for isTrdMacBookingDone()
	 *	@return  Returns true if isTrdMacBookingDone() is "M"
	 */
   public boolean isTrdMacBookingDone() throws CFException {
      return trdOrderPair.isTrdMacBookingDone();
   }

	/**
	*  set values "M"
	*/
   	public void setTrdMacBookingDoneTrue()  throws CFException{  			
    	trdOrderPair.setTrdMacBookingDoneTrue();
   	}

        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
        }

        public AccountingOutCtx getAccountingOutCtx() {
            return new AccountingOutCtx();
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
        str += dcltbtrdord.hashCode();
        str += trdOrderPair.hashCode();
       return str.hashCode();
    }

    public AccountingInCtx clone() {
        AccountingInCtx cloneObj = new AccountingInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        return cloneObj;
    }

    }

    public AccountingInCtx getAccountingInCtx() {
            return new AccountingInCtx();
    }
     public class AccountingOutCtx implements Cloneable {
     Work work = Trdpb001Ctx.this.getWork();
     Dcltbtrdord dcltbtrdord = Trdpb001Ctx.this.getDcltbtrdord();
     TrdOrderPair trdOrderPair = Trdpb001Ctx.this.getTrdOrderPair();

	/**
	 *	Returns the value of ordStatus
	 *	@return ordStatus
	 */
   public char[] getOrdStatus() throws CFException  {              
   		return dcltbtrdord.getOrdStatus();
   }

  
	/**
	*  set variable ordStatus
	*  @param value
	**/
   public void setOrdStatus(char[] value) throws CFException {
      dcltbtrdord.setOrdStatus(value);
   } 

     /**
	 * 	Update OrdStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdStatus(char[] source, int sourceIndex) throws CFException {
      dcltbtrdord.setOrdStatus(source, sourceIndex);
   	
   }
   
   public void setOrdStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdord.setOrdStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OrdStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OrdStatus with another Field
	 *	@param value
	 */
   public void setOrdStatus(Field source) {
      dcltbtrdord.setOrdStatus(source);
   }  
   
     /**
	 * 	Update OrdStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdStatus(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdord.setOrdStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OrdStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of orderStatus
	 *	@return orderStatus
	 */
   public char[] getOrderStatus() throws CFException  {              
   		return work.getOrderStatus();
   }

  
	/**
	*  set variable orderStatus
	*  @param value
	**/
   public void setOrderStatus(char[] value) throws CFException {
      work.setOrderStatus(value);
   } 

	/**
	 *	Returns the value of ordTradingXchng
	 *	@return ordTradingXchng
	 */
   public char[] getOrdTradingXchng() throws CFException  {              
   		return dcltbtrdord.getOrdTradingXchng();
   }

  
	/**
	*  set variable ordTradingXchng
	*  @param value
	**/
   public void setOrdTradingXchng(char[] value) throws CFException {
      dcltbtrdord.setOrdTradingXchng(value);
   } 

     /**
	 * 	Update OrdTradingXchng 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdTradingXchng(char[] source, int sourceIndex) throws CFException {
      dcltbtrdord.setOrdTradingXchng(source, sourceIndex);
   	
   }
   
   public void setOrdTradingXchng(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdord.setOrdTradingXchng(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OrdTradingXchng 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdTradingXchng(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdTradingXchng(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OrdTradingXchng with another Field
	 *	@param value
	 */
   public void setOrdTradingXchng(Field source) {
      dcltbtrdord.setOrdTradingXchng(source);
   }  
   
     /**
	 * 	Update OrdTradingXchng 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdTradingXchng(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdord.setOrdTradingXchng(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OrdTradingXchng 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdTradingXchng(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdTradingXchng(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of trdCurrency
	 *	@return trdCurrency
	 */
   public char[] getTrdCurrency() throws CFException  {              
   		return trdOrderPair.getTrdCurrency();
   }

  
	/**
	*  set variable trdCurrency
	*  @param value
	**/
   public void setTrdCurrency(char[] value) throws CFException {
      trdOrderPair.setTrdCurrency(value);
   } 

     /**
	 * 	Update TrdCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdCurrency(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdCurrency(source, sourceIndex);
   	
   }
   
   public void setTrdCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdCurrency with another Field
	 *	@param value
	 */
   public void setTrdCurrency(Field source) {
      trdOrderPair.setTrdCurrency(source);
   }  
   
     /**
	 * 	Update TrdCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdCurrency(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ordTradeid
	 *	@return ordTradeid
	 */
   public char[] getOrdTradeid() throws CFException  {              
   		return dcltbtrdord.getOrdTradeid();
   }

  
	/**
	*  set variable ordTradeid
	*  @param value
	**/
   public void setOrdTradeid(char[] value) throws CFException {
      dcltbtrdord.setOrdTradeid(value);
   } 

     /**
	 * 	Update OrdTradeid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdTradeid(char[] source, int sourceIndex) throws CFException {
      dcltbtrdord.setOrdTradeid(source, sourceIndex);
   	
   }
   
   public void setOrdTradeid(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdord.setOrdTradeid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OrdTradeid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdTradeid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdTradeid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OrdTradeid with another Field
	 *	@param value
	 */
   public void setOrdTradeid(Field source) {
      dcltbtrdord.setOrdTradeid(source);
   }  
   
     /**
	 * 	Update OrdTradeid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdTradeid(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdord.setOrdTradeid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OrdTradeid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdTradeid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdTradeid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "601" for isSettled()
	 *	@return  Returns true if isSettled() is "601"
	 */
   public boolean isSettled() throws CFException {
      return work.isSettled();
   }

	/**
	*  set values "601"
	*/
   	public void setSettledTrue()  throws CFException{  			
    	work.setSettledTrue();
   	}
	/**
	 *	Returns the value of trdExchange
	 *	@return trdExchange
	 */
   public char[] getTrdExchange() throws CFException  {              
   		return trdOrderPair.getTrdExchange();
   }

  
	/**
	*  set variable trdExchange
	*  @param value
	**/
   public void setTrdExchange(char[] value) throws CFException {
      trdOrderPair.setTrdExchange(value);
   } 

     /**
	 * 	Update TrdExchange 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdExchange(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdExchange(source, sourceIndex);
   	
   }
   
   public void setTrdExchange(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdExchange(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdExchange 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdExchange(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdExchange(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdExchange with another Field
	 *	@param value
	 */
   public void setTrdExchange(Field source) {
      trdOrderPair.setTrdExchange(source);
   }  
   
     /**
	 * 	Update TrdExchange 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdExchange(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdExchange(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdExchange 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdExchange(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdExchange(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of trdOrderId
	 *	@return trdOrderId
	 */
   public char[] getTrdOrderId() throws CFException  {              
   		return trdOrderPair.getTrdOrderId();
   }

  
	/**
	*  set variable trdOrderId
	*  @param value
	**/
   public void setTrdOrderId(char[] value) throws CFException {
      trdOrderPair.setTrdOrderId(value);
   } 

     /**
	 * 	Update TrdOrderId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdOrderId(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdOrderId(source, sourceIndex);
   	
   }
   
   public void setTrdOrderId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdOrderId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdOrderId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdOrderId with another Field
	 *	@param value
	 */
   public void setTrdOrderId(Field source) {
      trdOrderPair.setTrdOrderId(source);
   }  
   
     /**
	 * 	Update TrdOrderId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdOrderId(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdOrderId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdOrderId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ordBuySellInd
	 *	@return ordBuySellInd
	 */
   public char[] getOrdBuySellInd() throws CFException  {              
   		return dcltbtrdord.getOrdBuySellInd();
   }

  
	/**
	*  set variable ordBuySellInd
	*  @param value
	**/
   public void setOrdBuySellInd(char[] value) throws CFException {
      dcltbtrdord.setOrdBuySellInd(value);
   } 

     /**
	 * 	Update OrdBuySellInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdBuySellInd(char[] source, int sourceIndex) throws CFException {
      dcltbtrdord.setOrdBuySellInd(source, sourceIndex);
   	
   }
   
   public void setOrdBuySellInd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdord.setOrdBuySellInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OrdBuySellInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdBuySellInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdBuySellInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OrdBuySellInd with another Field
	 *	@param value
	 */
   public void setOrdBuySellInd(Field source) {
      dcltbtrdord.setOrdBuySellInd(source);
   }  
   
     /**
	 * 	Update OrdBuySellInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdBuySellInd(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdord.setOrdBuySellInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OrdBuySellInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdBuySellInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdBuySellInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "401" for isRejected()
	 *	@return  Returns true if isRejected() is "401"
	 */
   public boolean isRejected() throws CFException {
      return work.isRejected();
   }

	/**
	*  set values "401"
	*/
   	public void setRejectedTrue()  throws CFException{  			
    	work.setRejectedTrue();
   	}
	/**
	 *	Returns the value of ordFigi
	 *	@return ordFigi
	 */
   public char[] getOrdFigi() throws CFException  {              
   		return dcltbtrdord.getOrdFigi();
   }

  
	/**
	*  set variable ordFigi
	*  @param value
	**/
   public void setOrdFigi(char[] value) throws CFException {
      dcltbtrdord.setOrdFigi(value);
   } 

     /**
	 * 	Update OrdFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdFigi(char[] source, int sourceIndex) throws CFException {
      dcltbtrdord.setOrdFigi(source, sourceIndex);
   	
   }
   
   public void setOrdFigi(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdord.setOrdFigi(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OrdFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OrdFigi with another Field
	 *	@param value
	 */
   public void setOrdFigi(Field source) {
      dcltbtrdord.setOrdFigi(source);
   }  
   
     /**
	 * 	Update OrdFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdFigi(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdord.setOrdFigi(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OrdFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of trdFigi
	 *	@return trdFigi
	 */
   public char[] getTrdFigi() throws CFException  {              
   		return trdOrderPair.getTrdFigi();
   }

  
	/**
	*  set variable trdFigi
	*  @param value
	**/
   public void setTrdFigi(char[] value) throws CFException {
      trdOrderPair.setTrdFigi(value);
   } 

     /**
	 * 	Update TrdFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdFigi(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdFigi(source, sourceIndex);
   	
   }
   
   public void setTrdFigi(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdFigi(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdFigi with another Field
	 *	@param value
	 */
   public void setTrdFigi(Field source) {
      trdOrderPair.setTrdFigi(source);
   }  
   
     /**
	 * 	Update TrdFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdFigi(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdFigi(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ordCurrency
	 *	@return ordCurrency
	 */
   public char[] getOrdCurrency() throws CFException  {              
   		return dcltbtrdord.getOrdCurrency();
   }

  
	/**
	*  set variable ordCurrency
	*  @param value
	**/
   public void setOrdCurrency(char[] value) throws CFException {
      dcltbtrdord.setOrdCurrency(value);
   } 

     /**
	 * 	Update OrdCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdCurrency(char[] source, int sourceIndex) throws CFException {
      dcltbtrdord.setOrdCurrency(source, sourceIndex);
   	
   }
   
   public void setOrdCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdord.setOrdCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OrdCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OrdCurrency with another Field
	 *	@param value
	 */
   public void setOrdCurrency(Field source) {
      dcltbtrdord.setOrdCurrency(source);
   }  
   
     /**
	 * 	Update OrdCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdCurrency(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdord.setOrdCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OrdCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
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
        str += dcltbtrdord.hashCode();
        str += trdOrderPair.hashCode();
       return str.hashCode();
    }

    public AccountingOutCtx clone() {
        AccountingOutCtx cloneObj = new AccountingOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        return cloneObj;
    }

    }

    public AccountingOutCtx getAccountingOutCtx() {
            return new AccountingOutCtx();
    }
     public class SacBookingInCtx implements Cloneable {
     Work work = Trdpb001Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb001Ctx.this.getTrdOrderPair();

	/**
	 *	Returns the value of sacBooking
	 *	@return sacBooking
	 */
   public char[] getSacBooking() throws CFException  {              
   		return work.getSacBooking();
   }

  
	/**
	*  set variable sacBooking
	*  @param value
	**/
   public void setSacBooking(char[] value) throws CFException {
      work.setSacBooking(value);
   } 

	/**
	 *	Returns the value of trdOrderId
	 *	@return trdOrderId
	 */
   public char[] getTrdOrderId() throws CFException  {              
   		return trdOrderPair.getTrdOrderId();
   }

  
	/**
	*  set variable trdOrderId
	*  @param value
	**/
   public void setTrdOrderId(char[] value) throws CFException {
      trdOrderPair.setTrdOrderId(value);
   } 

     /**
	 * 	Update TrdOrderId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdOrderId(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdOrderId(source, sourceIndex);
   	
   }
   
   public void setTrdOrderId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdOrderId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdOrderId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdOrderId with another Field
	 *	@param value
	 */
   public void setTrdOrderId(Field source) {
      trdOrderPair.setTrdOrderId(source);
   }  
   
     /**
	 * 	Update TrdOrderId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdOrderId(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdOrderId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdOrderId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "S" for isTrdSacBookingDone()
	 *	@return  Returns true if isTrdSacBookingDone() is "S"
	 */
   public boolean isTrdSacBookingDone() throws CFException {
      return trdOrderPair.isTrdSacBookingDone();
   }

	/**
	*  set values "S"
	*/
   	public void setTrdSacBookingDoneTrue()  throws CFException{  			
    	trdOrderPair.setTrdSacBookingDoneTrue();
   	}
	/**
	 *	Returns the value of trdOrderPair
	 *	@return trdOrderPair
	 */   
	 public TrdOrderPair getTrdOrderPair() {
   	return trdOrderPair;
   }



        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
        }

        public SacBookingOutCtx getSacBookingOutCtx() {
            return new SacBookingOutCtx();
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
        str += trdOrderPair.hashCode();
       return str.hashCode();
    }

    public SacBookingInCtx clone() {
        SacBookingInCtx cloneObj = new SacBookingInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        return cloneObj;
    }

    }

    public SacBookingInCtx getSacBookingInCtx() {
            return new SacBookingInCtx();
    }
     public class SacBookingOutCtx implements Cloneable {
     Work work = Trdpb001Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb001Ctx.this.getTrdOrderPair();

	/**
	 *	Test condition "D" for isDataException()
	 *	@return  Returns true if isDataException() is "D"
	 */
   public boolean isDataException() throws CFException {
      return work.isDataException();
   }

	/**
	*  set values "D"
	*/
   	public void setDataExceptionTrue()  throws CFException{  			
    	work.setDataExceptionTrue();
   	}
	/**
	 *	Returns the value of tradeid
	 *	@return tradeid
	 */
	public long getTradeid() throws CFException {
   		return work.getTradeid();
	}


	/**
	 *	Returns String value of tradeid
	 *	@return tradeid
	 */
	public char[]  getTradeidString() throws CFException {
	     return String.valueOf(work.getTradeidString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tradeidIsNumeric()  throws CFException{
	    return work.tradeidIsNumeric();
	}

	/**
	 * 	Update Tradeid with the passed value
	 *	@param number
	 */
	public void setTradeid(long number)  throws CFException{
		work.setTradeid(number);
	}
	

	
	/**
	 * 	Update Tradeid with the passed value
	 *	@param value (String or char[])
	 */
	public void setTradeid(char[] value)  throws CFException {
		work.setTradeid(value);
	}
	
	/**
	 * 	Update Tradeid with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTradeidString(char[] value)  throws CFException{
		work.setTradeid(value);
	}	

	/**
	 *	Returns the value of trdOrderId
	 *	@return trdOrderId
	 */
   public char[] getTrdOrderId() throws CFException  {              
   		return trdOrderPair.getTrdOrderId();
   }

  
	/**
	*  set variable trdOrderId
	*  @param value
	**/
   public void setTrdOrderId(char[] value) throws CFException {
      trdOrderPair.setTrdOrderId(value);
   } 

     /**
	 * 	Update TrdOrderId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdOrderId(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdOrderId(source, sourceIndex);
   	
   }
   
   public void setTrdOrderId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdOrderId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdOrderId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdOrderId with another Field
	 *	@param value
	 */
   public void setTrdOrderId(Field source) {
      trdOrderPair.setTrdOrderId(source);
   }  
   
     /**
	 * 	Update TrdOrderId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdOrderId(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdOrderId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdOrderId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of exception
	 *	@return exception
	 */
   public char[] getException() throws CFException  {              
   		return work.getException();
   }

  
	/**
	*  set variable exception
	*  @param value
	**/
   public void setException(char[] value) throws CFException {
      work.setException(value);
   } 

	/**
	 *	Returns the value of trdOrderPair
	 *	@return trdOrderPair
	 */   
	 public TrdOrderPair getTrdOrderPair() {
   	return trdOrderPair;
   }



        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
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
        str += trdOrderPair.hashCode();
       return str.hashCode();
    }

    public SacBookingOutCtx clone() {
        SacBookingOutCtx cloneObj = new SacBookingOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        return cloneObj;
    }

    }

    public SacBookingOutCtx getSacBookingOutCtx() {
            return new SacBookingOutCtx();
    }
     public class MacBookingInCtx implements Cloneable {
     Work work = Trdpb001Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb001Ctx.this.getTrdOrderPair();

	/**
	 *	Returns the value of trdOrderId
	 *	@return trdOrderId
	 */
   public char[] getTrdOrderId() throws CFException  {              
   		return trdOrderPair.getTrdOrderId();
   }

  
	/**
	*  set variable trdOrderId
	*  @param value
	**/
   public void setTrdOrderId(char[] value) throws CFException {
      trdOrderPair.setTrdOrderId(value);
   } 

     /**
	 * 	Update TrdOrderId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdOrderId(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdOrderId(source, sourceIndex);
   	
   }
   
   public void setTrdOrderId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdOrderId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdOrderId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdOrderId with another Field
	 *	@param value
	 */
   public void setTrdOrderId(Field source) {
      trdOrderPair.setTrdOrderId(source);
   }  
   
     /**
	 * 	Update TrdOrderId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdOrderId(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdOrderId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdOrderId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of trdOrderPair
	 *	@return trdOrderPair
	 */   
	 public TrdOrderPair getTrdOrderPair() {
   	return trdOrderPair;
   }


	/**
	 *	Test condition "M" for isTrdMacBookingDone()
	 *	@return  Returns true if isTrdMacBookingDone() is "M"
	 */
   public boolean isTrdMacBookingDone() throws CFException {
      return trdOrderPair.isTrdMacBookingDone();
   }

	/**
	*  set values "M"
	*/
   	public void setTrdMacBookingDoneTrue()  throws CFException{  			
    	trdOrderPair.setTrdMacBookingDoneTrue();
   	}
	/**
	 *	Returns the value of macBooking
	 *	@return macBooking
	 */
   public char[] getMacBooking() throws CFException  {              
   		return work.getMacBooking();
   }

  
	/**
	*  set variable macBooking
	*  @param value
	**/
   public void setMacBooking(char[] value) throws CFException {
      work.setMacBooking(value);
   } 


        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
        }

        public MacBookingOutCtx getMacBookingOutCtx() {
            return new MacBookingOutCtx();
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
        str += trdOrderPair.hashCode();
       return str.hashCode();
    }

    public MacBookingInCtx clone() {
        MacBookingInCtx cloneObj = new MacBookingInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        return cloneObj;
    }

    }

    public MacBookingInCtx getMacBookingInCtx() {
            return new MacBookingInCtx();
    }
     public class MacBookingOutCtx implements Cloneable {
     Work work = Trdpb001Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb001Ctx.this.getTrdOrderPair();

	/**
	 *	Test condition "D" for isDataException()
	 *	@return  Returns true if isDataException() is "D"
	 */
   public boolean isDataException() throws CFException {
      return work.isDataException();
   }

	/**
	*  set values "D"
	*/
   	public void setDataExceptionTrue()  throws CFException{  			
    	work.setDataExceptionTrue();
   	}
	/**
	 *	Returns the value of tradeid
	 *	@return tradeid
	 */
	public long getTradeid() throws CFException {
   		return work.getTradeid();
	}


	/**
	 *	Returns String value of tradeid
	 *	@return tradeid
	 */
	public char[]  getTradeidString() throws CFException {
	     return String.valueOf(work.getTradeidString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tradeidIsNumeric()  throws CFException{
	    return work.tradeidIsNumeric();
	}

	/**
	 * 	Update Tradeid with the passed value
	 *	@param number
	 */
	public void setTradeid(long number)  throws CFException{
		work.setTradeid(number);
	}
	

	
	/**
	 * 	Update Tradeid with the passed value
	 *	@param value (String or char[])
	 */
	public void setTradeid(char[] value)  throws CFException {
		work.setTradeid(value);
	}
	
	/**
	 * 	Update Tradeid with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTradeidString(char[] value)  throws CFException{
		work.setTradeid(value);
	}	

	/**
	 *	Returns the value of trdOrderId
	 *	@return trdOrderId
	 */
   public char[] getTrdOrderId() throws CFException  {              
   		return trdOrderPair.getTrdOrderId();
   }

  
	/**
	*  set variable trdOrderId
	*  @param value
	**/
   public void setTrdOrderId(char[] value) throws CFException {
      trdOrderPair.setTrdOrderId(value);
   } 

     /**
	 * 	Update TrdOrderId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdOrderId(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdOrderId(source, sourceIndex);
   	
   }
   
   public void setTrdOrderId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdOrderId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdOrderId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdOrderId with another Field
	 *	@param value
	 */
   public void setTrdOrderId(Field source) {
      trdOrderPair.setTrdOrderId(source);
   }  
   
     /**
	 * 	Update TrdOrderId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdOrderId(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdOrderId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdOrderId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdOrderId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of exception
	 *	@return exception
	 */
   public char[] getException() throws CFException  {              
   		return work.getException();
   }

  
	/**
	*  set variable exception
	*  @param value
	**/
   public void setException(char[] value) throws CFException {
      work.setException(value);
   } 

	/**
	 *	Returns the value of trdOrderPair
	 *	@return trdOrderPair
	 */   
	 public TrdOrderPair getTrdOrderPair() {
   	return trdOrderPair;
   }



        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
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
        str += trdOrderPair.hashCode();
       return str.hashCode();
    }

    public MacBookingOutCtx clone() {
        MacBookingOutCtx cloneObj = new MacBookingOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        return cloneObj;
    }

    }

    public MacBookingOutCtx getMacBookingOutCtx() {
            return new MacBookingOutCtx();
    }
     public class ReadFromStlmtQueueInCtx implements Cloneable {
     Work work = Trdpb001Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb001Ctx.this.getTrdOrderPair();
     Sqlca sqlca = Trdpb001Ctx.this.getSqlca();
     Dcltbtrdstq dcltbtrdstq = Trdpb001Ctx.this.getDcltbtrdstq();

	/**
	 *	Returns the value of stqTradeData
	 *	@return stqTradeData
	 */
   public char[] getStqTradeData() throws CFException  {              
   		return dcltbtrdstq.getStqTradeData();
   }

  
	/**
	*  set variable stqTradeData
	*  @param value
	**/
   public void setStqTradeData(char[] value) throws CFException {
      dcltbtrdstq.setStqTradeData(value);
   } 

     /**
	 * 	Update StqTradeData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStqTradeData(char[] source, int sourceIndex) throws CFException {
      dcltbtrdstq.setStqTradeData(source, sourceIndex);
   	
   }
   
   public void setStqTradeData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdstq.setStqTradeData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update StqTradeData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStqTradeData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdstq.setStqTradeData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update StqTradeData with another Field
	 *	@param value
	 */
   public void setStqTradeData(Field source) {
      dcltbtrdstq.setStqTradeData(source);
   }  
   
     /**
	 * 	Update StqTradeData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStqTradeData(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdstq.setStqTradeData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update StqTradeData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStqTradeData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdstq.setStqTradeData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of stqCurrency
	 *	@return stqCurrency
	 */
   public char[] getStqCurrency() throws CFException  {              
   		return dcltbtrdstq.getStqCurrency();
   }

  
	/**
	*  set variable stqCurrency
	*  @param value
	**/
   public void setStqCurrency(char[] value) throws CFException {
      dcltbtrdstq.setStqCurrency(value);
   } 

     /**
	 * 	Update StqCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStqCurrency(char[] source, int sourceIndex) throws CFException {
      dcltbtrdstq.setStqCurrency(source, sourceIndex);
   	
   }
   
   public void setStqCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdstq.setStqCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update StqCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStqCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdstq.setStqCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update StqCurrency with another Field
	 *	@param value
	 */
   public void setStqCurrency(Field source) {
      dcltbtrdstq.setStqCurrency(source);
   }  
   
     /**
	 * 	Update StqCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStqCurrency(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdstq.setStqCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update StqCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStqCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdstq.setStqCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of stqId
	 *	@return stqId
	 */
	public int getStqId() throws CFException {        
   		return dcltbtrdstq.getStqId();
	}
	
	/**
	 * 	Update StqId with the passed value
	 *	@param number
	 */
	public void setStqId(int number)  throws CFException{
		dcltbtrdstq.setStqId(number);
	}


	public void setStqId(long number)  throws CFException{
		dcltbtrdstq.setStqId((int)number);
	}


	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}


	/**
	 *	Returns the value of dcltbtrdstq
	 *	@return dcltbtrdstq
	 */   
	 public Dcltbtrdstq getDcltbtrdstq() {
   	return dcltbtrdstq;
   }



        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
        }

        public ReadFromStlmtQueueOutCtx getReadFromStlmtQueueOutCtx() {
            return new ReadFromStlmtQueueOutCtx();
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
        str += trdOrderPair.hashCode();
        str += sqlca.hashCode();
        str += dcltbtrdstq.hashCode();
       return str.hashCode();
    }

    public ReadFromStlmtQueueInCtx clone() {
        ReadFromStlmtQueueInCtx cloneObj = new ReadFromStlmtQueueInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dcltbtrdstq = new Dcltbtrdstq();
        cloneObj.dcltbtrdstq.set(dcltbtrdstq.getClonedField());
        return cloneObj;
    }

    }

    public ReadFromStlmtQueueInCtx getReadFromStlmtQueueInCtx() {
            return new ReadFromStlmtQueueInCtx();
    }
     public class ReadFromStlmtQueueOutCtx implements Cloneable {
     Work work = Trdpb001Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb001Ctx.this.getTrdOrderPair();
     Sqlca sqlca = Trdpb001Ctx.this.getSqlca();
     Dcltbtrdstq dcltbtrdstq = Trdpb001Ctx.this.getDcltbtrdstq();

	/**
	 *	Test condition "S" for isStopSettlement88()
	 *	@return  Returns true if isStopSettlement88() is "S"
	 */
   public boolean isStopSettlement88() throws CFException {
      return work.isStopSettlement88();
   }

	/**
	*  set values "S"
	*/
   	public void setStopSettlement88True()  throws CFException{  			
    	work.setStopSettlement88True();
   	}
	/**
	 *	Returns the value of stqTradeData
	 *	@return stqTradeData
	 */
   public char[] getStqTradeData() throws CFException  {              
   		return dcltbtrdstq.getStqTradeData();
   }

  
	/**
	*  set variable stqTradeData
	*  @param value
	**/
   public void setStqTradeData(char[] value) throws CFException {
      dcltbtrdstq.setStqTradeData(value);
   } 

     /**
	 * 	Update StqTradeData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStqTradeData(char[] source, int sourceIndex) throws CFException {
      dcltbtrdstq.setStqTradeData(source, sourceIndex);
   	
   }
   
   public void setStqTradeData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdstq.setStqTradeData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update StqTradeData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStqTradeData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdstq.setStqTradeData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update StqTradeData with another Field
	 *	@param value
	 */
   public void setStqTradeData(Field source) {
      dcltbtrdstq.setStqTradeData(source);
   }  
   
     /**
	 * 	Update StqTradeData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStqTradeData(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdstq.setStqTradeData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update StqTradeData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStqTradeData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdstq.setStqTradeData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
   public char[] getSqlcode_Ws() throws CFException  {              
   		return work.getSqlcode_Ws();
   }

  
	/**
	*  set variable sqlcode_Ws
	*  @param value
	**/
   public void setSqlcode_Ws(char[] value) throws CFException {
      work.setSqlcode_Ws(value);
   } 

     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex) throws CFException {
      work.setSqlcode_Ws(source, sourceIndex);
   	
   }
   
   public void setSqlcode_Ws(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlcode_Ws with another Field
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source) {
      work.setSqlcode_Ws(source);
   }  
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "A" for isApplException()
	 *	@return  Returns true if isApplException() is "A"
	 */
   public boolean isApplException() throws CFException {
      return work.isApplException();
   }

	/**
	*  set values "A"
	*/
   	public void setApplExceptionTrue()  throws CFException{  			
    	work.setApplExceptionTrue();
   	}
	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of exception
	 *	@return exception
	 */
   public char[] getException() throws CFException  {              
   		return work.getException();
   }

  
	/**
	*  set variable exception
	*  @param value
	**/
   public void setException(char[] value) throws CFException {
      work.setException(value);
   } 

	/**
	 *	Returns the value of trdOrderPair
	 *	@return trdOrderPair
	 */   
	 public TrdOrderPair getTrdOrderPair() {
   	return trdOrderPair;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of dcltbtrdstq
	 *	@return dcltbtrdstq
	 */   
	 public Dcltbtrdstq getDcltbtrdstq() {
   	return dcltbtrdstq;
   }



        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
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
        str += trdOrderPair.hashCode();
        str += sqlca.hashCode();
        str += dcltbtrdstq.hashCode();
       return str.hashCode();
    }

    public ReadFromStlmtQueueOutCtx clone() {
        ReadFromStlmtQueueOutCtx cloneObj = new ReadFromStlmtQueueOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dcltbtrdstq = new Dcltbtrdstq();
        cloneObj.dcltbtrdstq.set(dcltbtrdstq.getClonedField());
        return cloneObj;
    }

    }

    public ReadFromStlmtQueueOutCtx getReadFromStlmtQueueOutCtx() {
            return new ReadFromStlmtQueueOutCtx();
    }
     public class UpdateOrderInCtx implements Cloneable {
     Work work = Trdpb001Ctx.this.getWork();
     CustomerSummaryRec customerSummaryRec = Trdpb001Ctx.this.getCustomerSummaryRec();
     Dcltbtrdord dcltbtrdord = Trdpb001Ctx.this.getDcltbtrdord();
     TrdOrderPair trdOrderPair = Trdpb001Ctx.this.getTrdOrderPair();
     Sqlca sqlca = Trdpb001Ctx.this.getSqlca();

	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ordStatus
	 *	@return ordStatus
	 */
   public char[] getOrdStatus() throws CFException  {              
   		return dcltbtrdord.getOrdStatus();
   }

  
	/**
	*  set variable ordStatus
	*  @param value
	**/
   public void setOrdStatus(char[] value) throws CFException {
      dcltbtrdord.setOrdStatus(value);
   } 

     /**
	 * 	Update OrdStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdStatus(char[] source, int sourceIndex) throws CFException {
      dcltbtrdord.setOrdStatus(source, sourceIndex);
   	
   }
   
   public void setOrdStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdord.setOrdStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OrdStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OrdStatus with another Field
	 *	@param value
	 */
   public void setOrdStatus(Field source) {
      dcltbtrdord.setOrdStatus(source);
   }  
   
     /**
	 * 	Update OrdStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdStatus(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdord.setOrdStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OrdStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of ordTradingXchng
	 *	@return ordTradingXchng
	 */
   public char[] getOrdTradingXchng() throws CFException  {              
   		return dcltbtrdord.getOrdTradingXchng();
   }

  
	/**
	*  set variable ordTradingXchng
	*  @param value
	**/
   public void setOrdTradingXchng(char[] value) throws CFException {
      dcltbtrdord.setOrdTradingXchng(value);
   } 

     /**
	 * 	Update OrdTradingXchng 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdTradingXchng(char[] source, int sourceIndex) throws CFException {
      dcltbtrdord.setOrdTradingXchng(source, sourceIndex);
   	
   }
   
   public void setOrdTradingXchng(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdord.setOrdTradingXchng(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OrdTradingXchng 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdTradingXchng(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdTradingXchng(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OrdTradingXchng with another Field
	 *	@param value
	 */
   public void setOrdTradingXchng(Field source) {
      dcltbtrdord.setOrdTradingXchng(source);
   }  
   
     /**
	 * 	Update OrdTradingXchng 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdTradingXchng(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdord.setOrdTradingXchng(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OrdTradingXchng 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdTradingXchng(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdTradingXchng(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ordTradeid
	 *	@return ordTradeid
	 */
   public char[] getOrdTradeid() throws CFException  {              
   		return dcltbtrdord.getOrdTradeid();
   }

  
	/**
	*  set variable ordTradeid
	*  @param value
	**/
   public void setOrdTradeid(char[] value) throws CFException {
      dcltbtrdord.setOrdTradeid(value);
   } 

     /**
	 * 	Update OrdTradeid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdTradeid(char[] source, int sourceIndex) throws CFException {
      dcltbtrdord.setOrdTradeid(source, sourceIndex);
   	
   }
   
   public void setOrdTradeid(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdord.setOrdTradeid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OrdTradeid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdTradeid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdTradeid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OrdTradeid with another Field
	 *	@param value
	 */
   public void setOrdTradeid(Field source) {
      dcltbtrdord.setOrdTradeid(source);
   }  
   
     /**
	 * 	Update OrdTradeid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdTradeid(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdord.setOrdTradeid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OrdTradeid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdTradeid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdTradeid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of trdBuyerId
	 *	@return trdBuyerId
	 */
   public char[] getTrdBuyerId() throws CFException  {              
   		return trdOrderPair.getTrdBuyerId();
   }

  
	/**
	*  set variable trdBuyerId
	*  @param value
	**/
   public void setTrdBuyerId(char[] value) throws CFException {
      trdOrderPair.setTrdBuyerId(value);
   } 

     /**
	 * 	Update TrdBuyerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdBuyerId(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdBuyerId(source, sourceIndex);
   	
   }
   
   public void setTrdBuyerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdBuyerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdBuyerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdBuyerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdBuyerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdBuyerId with another Field
	 *	@param value
	 */
   public void setTrdBuyerId(Field source) {
      trdOrderPair.setTrdBuyerId(source);
   }  
   
     /**
	 * 	Update TrdBuyerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdBuyerId(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdBuyerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdBuyerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdBuyerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdBuyerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of trdSellerId
	 *	@return trdSellerId
	 */
   public char[] getTrdSellerId() throws CFException  {              
   		return trdOrderPair.getTrdSellerId();
   }

  
	/**
	*  set variable trdSellerId
	*  @param value
	**/
   public void setTrdSellerId(char[] value) throws CFException {
      trdOrderPair.setTrdSellerId(value);
   } 

     /**
	 * 	Update TrdSellerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdSellerId(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdSellerId(source, sourceIndex);
   	
   }
   
   public void setTrdSellerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdSellerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdSellerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdSellerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdSellerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdSellerId with another Field
	 *	@param value
	 */
   public void setTrdSellerId(Field source) {
      trdOrderPair.setTrdSellerId(source);
   }  
   
     /**
	 * 	Update TrdSellerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdSellerId(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdSellerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdSellerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdSellerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdSellerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ordBuySellInd
	 *	@return ordBuySellInd
	 */
   public char[] getOrdBuySellInd() throws CFException  {              
   		return dcltbtrdord.getOrdBuySellInd();
   }

  
	/**
	*  set variable ordBuySellInd
	*  @param value
	**/
   public void setOrdBuySellInd(char[] value) throws CFException {
      dcltbtrdord.setOrdBuySellInd(value);
   } 

     /**
	 * 	Update OrdBuySellInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdBuySellInd(char[] source, int sourceIndex) throws CFException {
      dcltbtrdord.setOrdBuySellInd(source, sourceIndex);
   	
   }
   
   public void setOrdBuySellInd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdord.setOrdBuySellInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OrdBuySellInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdBuySellInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdBuySellInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OrdBuySellInd with another Field
	 *	@param value
	 */
   public void setOrdBuySellInd(Field source) {
      dcltbtrdord.setOrdBuySellInd(source);
   }  
   
     /**
	 * 	Update OrdBuySellInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdBuySellInd(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdord.setOrdBuySellInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OrdBuySellInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdBuySellInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdBuySellInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dcltbtrdord
	 *	@return dcltbtrdord
	 */   
	 public Dcltbtrdord getDcltbtrdord() {
   	return dcltbtrdord;
   }


	/**
	 *	Returns the value of ordFigi
	 *	@return ordFigi
	 */
   public char[] getOrdFigi() throws CFException  {              
   		return dcltbtrdord.getOrdFigi();
   }

  
	/**
	*  set variable ordFigi
	*  @param value
	**/
   public void setOrdFigi(char[] value) throws CFException {
      dcltbtrdord.setOrdFigi(value);
   } 

     /**
	 * 	Update OrdFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdFigi(char[] source, int sourceIndex) throws CFException {
      dcltbtrdord.setOrdFigi(source, sourceIndex);
   	
   }
   
   public void setOrdFigi(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdord.setOrdFigi(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OrdFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OrdFigi with another Field
	 *	@param value
	 */
   public void setOrdFigi(Field source) {
      dcltbtrdord.setOrdFigi(source);
   }  
   
     /**
	 * 	Update OrdFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdFigi(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdord.setOrdFigi(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OrdFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}


	/**
	 *	Returns the value of ordCurrency
	 *	@return ordCurrency
	 */
   public char[] getOrdCurrency() throws CFException  {              
   		return dcltbtrdord.getOrdCurrency();
   }

  
	/**
	*  set variable ordCurrency
	*  @param value
	**/
   public void setOrdCurrency(char[] value) throws CFException {
      dcltbtrdord.setOrdCurrency(value);
   } 

     /**
	 * 	Update OrdCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdCurrency(char[] source, int sourceIndex) throws CFException {
      dcltbtrdord.setOrdCurrency(source, sourceIndex);
   	
   }
   
   public void setOrdCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdord.setOrdCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OrdCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OrdCurrency with another Field
	 *	@param value
	 */
   public void setOrdCurrency(Field source) {
      dcltbtrdord.setOrdCurrency(source);
   }  
   
     /**
	 * 	Update OrdCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdCurrency(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdord.setOrdCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OrdCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
        }

        public UpdateOrderOutCtx getUpdateOrderOutCtx() {
            return new UpdateOrderOutCtx();
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
        str += customerSummaryRec.hashCode();
        str += dcltbtrdord.hashCode();
        str += trdOrderPair.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public UpdateOrderInCtx clone() {
        UpdateOrderInCtx cloneObj = new UpdateOrderInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.customerSummaryRec = new CustomerSummaryRec();
        cloneObj.customerSummaryRec.set(customerSummaryRec.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public UpdateOrderInCtx getUpdateOrderInCtx() {
            return new UpdateOrderInCtx();
    }
     public class UpdateOrderOutCtx implements Cloneable {
     Work work = Trdpb001Ctx.this.getWork();
     CustomerSummaryRec customerSummaryRec = Trdpb001Ctx.this.getCustomerSummaryRec();
     Dcltbtrdord dcltbtrdord = Trdpb001Ctx.this.getDcltbtrdord();
     TrdOrderPair trdOrderPair = Trdpb001Ctx.this.getTrdOrderPair();
     Sqlca sqlca = Trdpb001Ctx.this.getSqlca();

	/**
	 *	Test condition "D" for isDoSql()
	 *	@return  Returns true if isDoSql() is "D"
	 */
   public boolean isDoSql() throws CFException {
      return work.isDoSql();
   }

	/**
	*  set values "D"
	*/
   	public void setDoSqlTrue()  throws CFException{  			
    	work.setDoSqlTrue();
   	}
	/**
	 *	Returns the value of ordStatus
	 *	@return ordStatus
	 */
   public char[] getOrdStatus() throws CFException  {              
   		return dcltbtrdord.getOrdStatus();
   }

  
	/**
	*  set variable ordStatus
	*  @param value
	**/
   public void setOrdStatus(char[] value) throws CFException {
      dcltbtrdord.setOrdStatus(value);
   } 

     /**
	 * 	Update OrdStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdStatus(char[] source, int sourceIndex) throws CFException {
      dcltbtrdord.setOrdStatus(source, sourceIndex);
   	
   }
   
   public void setOrdStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdord.setOrdStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OrdStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OrdStatus with another Field
	 *	@param value
	 */
   public void setOrdStatus(Field source) {
      dcltbtrdord.setOrdStatus(source);
   }  
   
     /**
	 * 	Update OrdStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdStatus(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdord.setOrdStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OrdStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of orderStatus
	 *	@return orderStatus
	 */
   public char[] getOrderStatus() throws CFException  {              
   		return work.getOrderStatus();
   }

  
	/**
	*  set variable orderStatus
	*  @param value
	**/
   public void setOrderStatus(char[] value) throws CFException {
      work.setOrderStatus(value);
   } 

	/**
	 *	Test condition "A" for isApplException()
	 *	@return  Returns true if isApplException() is "A"
	 */
   public boolean isApplException() throws CFException {
      return work.isApplException();
   }

	/**
	*  set values "A"
	*/
   	public void setApplExceptionTrue()  throws CFException{  			
    	work.setApplExceptionTrue();
   	}
	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Test condition "R" for isRetrySql()
	 *	@return  Returns true if isRetrySql() is "R"
	 */
   public boolean isRetrySql() throws CFException {
      return work.isRetrySql();
   }

	/**
	*  set values "R"
	*/
   	public void setRetrySqlTrue()  throws CFException{  			
    	work.setRetrySqlTrue();
   	}
	/**
	 *	Returns the value of customerSummaryRec
	 *	@return customerSummaryRec
	 */   
	 public CustomerSummaryRec getCustomerSummaryRec() {
   	return customerSummaryRec;
   }


	/**
	 *	Returns the value of exception
	 *	@return exception
	 */
   public char[] getException() throws CFException  {              
   		return work.getException();
   }

  
	/**
	*  set variable exception
	*  @param value
	**/
   public void setException(char[] value) throws CFException {
      work.setException(value);
   } 

	/**
	 *	Test condition "601" for isSettled()
	 *	@return  Returns true if isSettled() is "601"
	 */
   public boolean isSettled() throws CFException {
      return work.isSettled();
   }

	/**
	*  set values "601"
	*/
   	public void setSettledTrue()  throws CFException{  			
    	work.setSettledTrue();
   	}
	/**
	 *	Returns the value of summaryCustomerId
	 *	@return summaryCustomerId
	 */
   public char[] getSummaryCustomerId() throws CFException  {              
   		return customerSummaryRec.getSummaryCustomerId();
   }

  
	/**
	*  set variable summaryCustomerId
	*  @param value
	**/
   public void setSummaryCustomerId(char[] value) throws CFException {
      customerSummaryRec.setSummaryCustomerId(value);
   } 

     /**
	 * 	Update SummaryCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSummaryCustomerId(char[] source, int sourceIndex) throws CFException {
      customerSummaryRec.setSummaryCustomerId(source, sourceIndex);
   	
   }
   
   public void setSummaryCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      customerSummaryRec.setSummaryCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SummaryCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSummaryCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      customerSummaryRec.setSummaryCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SummaryCustomerId with another Field
	 *	@param value
	 */
   public void setSummaryCustomerId(Field source) {
      customerSummaryRec.setSummaryCustomerId(source);
   }  
   
     /**
	 * 	Update SummaryCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSummaryCustomerId(Field source, int sourceIndex,int sourceLen) {
      customerSummaryRec.setSummaryCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SummaryCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSummaryCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      customerSummaryRec.setSummaryCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Test condition "D" for isSummaryDebit88()
	 *	@return  Returns true if isSummaryDebit88() is "D"
	 */
   public boolean isSummaryDebit88() throws CFException {
      return work.isSummaryDebit88();
   }

	/**
	*  set values "D"
	*/
   	public void setSummaryDebit88True()  throws CFException{  			
    	work.setSummaryDebit88True();
   	}
	/**
	 *	Returns the value of trdBuyerId
	 *	@return trdBuyerId
	 */
   public char[] getTrdBuyerId() throws CFException  {              
   		return trdOrderPair.getTrdBuyerId();
   }

  
	/**
	*  set variable trdBuyerId
	*  @param value
	**/
   public void setTrdBuyerId(char[] value) throws CFException {
      trdOrderPair.setTrdBuyerId(value);
   } 

     /**
	 * 	Update TrdBuyerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdBuyerId(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdBuyerId(source, sourceIndex);
   	
   }
   
   public void setTrdBuyerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdBuyerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdBuyerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdBuyerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdBuyerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdBuyerId with another Field
	 *	@param value
	 */
   public void setTrdBuyerId(Field source) {
      trdOrderPair.setTrdBuyerId(source);
   }  
   
     /**
	 * 	Update TrdBuyerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdBuyerId(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdBuyerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdBuyerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdBuyerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdBuyerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of trdSellerId
	 *	@return trdSellerId
	 */
   public char[] getTrdSellerId() throws CFException  {              
   		return trdOrderPair.getTrdSellerId();
   }

  
	/**
	*  set variable trdSellerId
	*  @param value
	**/
   public void setTrdSellerId(char[] value) throws CFException {
      trdOrderPair.setTrdSellerId(value);
   } 

     /**
	 * 	Update TrdSellerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdSellerId(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdSellerId(source, sourceIndex);
   	
   }
   
   public void setTrdSellerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdSellerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdSellerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdSellerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdSellerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdSellerId with another Field
	 *	@param value
	 */
   public void setTrdSellerId(Field source) {
      trdOrderPair.setTrdSellerId(source);
   }  
   
     /**
	 * 	Update TrdSellerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdSellerId(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdSellerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdSellerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdSellerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdSellerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
   public char[] getSqlcode_Ws() throws CFException  {              
   		return work.getSqlcode_Ws();
   }

  
	/**
	*  set variable sqlcode_Ws
	*  @param value
	**/
   public void setSqlcode_Ws(char[] value) throws CFException {
      work.setSqlcode_Ws(value);
   } 

     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex) throws CFException {
      work.setSqlcode_Ws(source, sourceIndex);
   	
   }
   
   public void setSqlcode_Ws(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlcode_Ws with another Field
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source) {
      work.setSqlcode_Ws(source);
   }  
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isSummaryNoBooking88()
	 *	@return  Returns true if isSummaryNoBooking88() is "N"
	 */
   public boolean isSummaryNoBooking88() throws CFException {
      return work.isSummaryNoBooking88();
   }

	/**
	*  set values "N"
	*/
   	public void setSummaryNoBooking88True()  throws CFException{  			
    	work.setSummaryNoBooking88True();
   	}
	/**
	 *	Test condition "S" for isSqlDone()
	 *	@return  Returns true if isSqlDone() is "S"
	 */
   public boolean isSqlDone() throws CFException {
      return work.isSqlDone();
   }

	/**
	*  set values "S"
	*/
   	public void setSqlDoneTrue()  throws CFException{  			
    	work.setSqlDoneTrue();
   	}
	/**
	 *	Test condition "C" for isSummaryCredit88()
	 *	@return  Returns true if isSummaryCredit88() is "C"
	 */
   public boolean isSummaryCredit88() throws CFException {
      return work.isSummaryCredit88();
   }

	/**
	*  set values "C"
	*/
   	public void setSummaryCredit88True()  throws CFException{  			
    	work.setSummaryCredit88True();
   	}
	/**
	 *	Test condition "401" for isRejected()
	 *	@return  Returns true if isRejected() is "401"
	 */
   public boolean isRejected() throws CFException {
      return work.isRejected();
   }

	/**
	*  set values "401"
	*/
   	public void setRejectedTrue()  throws CFException{  			
    	work.setRejectedTrue();
   	}

        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
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
        str += customerSummaryRec.hashCode();
        str += dcltbtrdord.hashCode();
        str += trdOrderPair.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public UpdateOrderOutCtx clone() {
        UpdateOrderOutCtx cloneObj = new UpdateOrderOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.customerSummaryRec = new CustomerSummaryRec();
        cloneObj.customerSummaryRec.set(customerSummaryRec.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public UpdateOrderOutCtx getUpdateOrderOutCtx() {
            return new UpdateOrderOutCtx();
    }
     public class ReportExceptionInCtx implements Cloneable {
     ExceptionRecord exceptionRecord = Trdpb001Ctx.this.getExceptionRecord();
     Work work = Trdpb001Ctx.this.getWork();
     ExceptionRecordLenGroup exceptionRecordLenGroup = Trdpb001Ctx.this.getExceptionRecordLenGroup();

	/**
	 *	Test condition "D" for isDataException()
	 *	@return  Returns true if isDataException() is "D"
	 */
   public boolean isDataException() throws CFException {
      return work.isDataException();
   }

	/**
	*  set values "D"
	*/
   	public void setDataExceptionTrue()  throws CFException{  			
    	work.setDataExceptionTrue();
   	}
	/**
	 *	Returns the value of exceptionRecord
	 *	@return exceptionRecord
	 */   
	 public ExceptionRecord getExceptionRecord() {
   	return exceptionRecord;
   }


	/**
	 *	Test condition "A" for isApplException()
	 *	@return  Returns true if isApplException() is "A"
	 */
   public boolean isApplException() throws CFException {
      return work.isApplException();
   }

	/**
	*  set values "A"
	*/
   	public void setApplExceptionTrue()  throws CFException{  			
    	work.setApplExceptionTrue();
   	}
	/**
	 *	Test condition "S" for isSystemException()
	 *	@return  Returns true if isSystemException() is "S"
	 */
   public boolean isSystemException() throws CFException {
      return work.isSystemException();
   }

	/**
	*  set values "S"
	*/
   	public void setSystemExceptionTrue()  throws CFException{  			
    	work.setSystemExceptionTrue();
   	}
	/**
	 *	Returns the value of exception
	 *	@return exception
	 */
   public char[] getException() throws CFException  {              
   		return work.getException();
   }

  
	/**
	*  set variable exception
	*  @param value
	**/
   public void setException(char[] value) throws CFException {
      work.setException(value);
   } 

	/**
	 *	Returns the value of exceptionRecordLenGroup
	 *	@return exceptionRecordLenGroup
	 */   
	 public ExceptionRecordLenGroup getExceptionRecordLenGroup() {
   	return exceptionRecordLenGroup;
   }


	/**
	 *	Returns the value of exceptionHandler
	 *	@return exceptionHandler
	 */
   public char[] getExceptionHandler() throws CFException  {              
   		return work.getExceptionHandler();
   }

  
	/**
	*  set variable exceptionHandler
	*  @param value
	**/
   public void setExceptionHandler(char[] value) throws CFException {
      work.setExceptionHandler(value);
   } 


        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
        }

        public ReportExceptionOutCtx getReportExceptionOutCtx() {
            return new ReportExceptionOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += exceptionRecord.hashCode();
        str += work.hashCode();
        str += exceptionRecordLenGroup.hashCode();
       return str.hashCode();
    }

    public ReportExceptionInCtx clone() {
        ReportExceptionInCtx cloneObj = new ReportExceptionInCtx();
        cloneObj.exceptionRecord = new ExceptionRecord();
        cloneObj.exceptionRecord.set(exceptionRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.exceptionRecordLenGroup = new ExceptionRecordLenGroup();
        cloneObj.exceptionRecordLenGroup.set(exceptionRecordLenGroup.getClonedField());
        return cloneObj;
    }

    }

    public ReportExceptionInCtx getReportExceptionInCtx() {
            return new ReportExceptionInCtx();
    }
     public class ReportExceptionOutCtx implements Cloneable {
     ExceptionRecord exceptionRecord = Trdpb001Ctx.this.getExceptionRecord();
     Work work = Trdpb001Ctx.this.getWork();
     ExceptionRecordLenGroup exceptionRecordLenGroup = Trdpb001Ctx.this.getExceptionRecordLenGroup();

	/**
	 *	Returns the value of exceptionType
	 *	@return exceptionType
	 */
   public char[] getExceptionType() throws CFException  {              
   		return exceptionRecord.getExceptionType();
   }

  
	/**
	*  set variable exceptionType
	*  @param value
	**/
   public void setExceptionType(char[] value) throws CFException {
      exceptionRecord.setExceptionType(value);
   } 

     /**
	 * 	Update ExceptionType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExceptionType(char[] source, int sourceIndex) throws CFException {
      exceptionRecord.setExceptionType(source, sourceIndex);
   	
   }
   
   public void setExceptionType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      exceptionRecord.setExceptionType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExceptionType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExceptionType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      exceptionRecord.setExceptionType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExceptionType with another Field
	 *	@param value
	 */
   public void setExceptionType(Field source) {
      exceptionRecord.setExceptionType(source);
   }  
   
     /**
	 * 	Update ExceptionType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExceptionType(Field source, int sourceIndex,int sourceLen) {
      exceptionRecord.setExceptionType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExceptionType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExceptionType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      exceptionRecord.setExceptionType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of exceptionRecord
	 *	@return exceptionRecord
	 */   
	 public ExceptionRecord getExceptionRecord() {
   	return exceptionRecord;
   }


	/**
	 *	Returns the value of exceptionDesc
	 *	@return exceptionDesc
	 */
   public char[] getExceptionDesc() throws CFException  {              
   		return exceptionRecord.getExceptionDesc();
   }

  
	/**
	*  set variable exceptionDesc
	*  @param value
	**/
   public void setExceptionDesc(char[] value) throws CFException {
      exceptionRecord.setExceptionDesc(value);
   } 

     /**
	 * 	Update ExceptionDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExceptionDesc(char[] source, int sourceIndex) throws CFException {
      exceptionRecord.setExceptionDesc(source, sourceIndex);
   	
   }
   
   public void setExceptionDesc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      exceptionRecord.setExceptionDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExceptionDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExceptionDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      exceptionRecord.setExceptionDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExceptionDesc with another Field
	 *	@param value
	 */
   public void setExceptionDesc(Field source) {
      exceptionRecord.setExceptionDesc(source);
   }  
   
     /**
	 * 	Update ExceptionDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExceptionDesc(Field source, int sourceIndex,int sourceLen) {
      exceptionRecord.setExceptionDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExceptionDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExceptionDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      exceptionRecord.setExceptionDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of exceptionRecordLen
	 *	@return exceptionRecordLen
	 */
	public short getExceptionRecordLen() throws CFException {        
   		return exceptionRecordLenGroup.getExceptionRecordLen();
	}
	
	/**
	 * 	Update ExceptionRecordLen with the passed value
	 *	@param number
	 */
	public void setExceptionRecordLen(short number)  throws CFException{
		exceptionRecordLenGroup.setExceptionRecordLen(number);
	}

	public void setExceptionRecordLen(int number)  throws CFException{
		exceptionRecordLenGroup.setExceptionRecordLen((short)number);
	}

	public void setExceptionRecordLen(long number)  throws CFException{
		exceptionRecordLenGroup.setExceptionRecordLen((short)number);
	}



	/**
	 *	Returns the value of exception
	 *	@return exception
	 */
   public char[] getException() throws CFException  {              
   		return work.getException();
   }

  
	/**
	*  set variable exception
	*  @param value
	**/
   public void setException(char[] value) throws CFException {
      work.setException(value);
   } 

	/**
	 *	Returns the value of exceptionRecordLenGroup
	 *	@return exceptionRecordLenGroup
	 */   
	 public ExceptionRecordLenGroup getExceptionRecordLenGroup() {
   	return exceptionRecordLenGroup;
   }



        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += exceptionRecord.hashCode();
        str += work.hashCode();
        str += exceptionRecordLenGroup.hashCode();
       return str.hashCode();
    }

    public ReportExceptionOutCtx clone() {
        ReportExceptionOutCtx cloneObj = new ReportExceptionOutCtx();
        cloneObj.exceptionRecord = new ExceptionRecord();
        cloneObj.exceptionRecord.set(exceptionRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.exceptionRecordLenGroup = new ExceptionRecordLenGroup();
        cloneObj.exceptionRecordLenGroup.set(exceptionRecordLenGroup.getClonedField());
        return cloneObj;
    }

    }

    public ReportExceptionOutCtx getReportExceptionOutCtx() {
            return new ReportExceptionOutCtx();
    }
     public class LogSummaryInCtx implements Cloneable {
     Dcltbtrdsum dcltbtrdsum = Trdpb001Ctx.this.getDcltbtrdsum();
     Work work = Trdpb001Ctx.this.getWork();
     CustomerSummaryRec customerSummaryRec = Trdpb001Ctx.this.getCustomerSummaryRec();
     Dcltbtrdmac dcltbtrdmac = Trdpb001Ctx.this.getDcltbtrdmac();
     TrdOrderPair trdOrderPair = Trdpb001Ctx.this.getTrdOrderPair();
     Sqlca sqlca = Trdpb001Ctx.this.getSqlca();

	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getMacBalance() throws CFException{      
   		return dcltbtrdmac.getMacBalance();
	}

    public char[] getMacBalanceString() throws CFException {
          return  dcltbtrdmac.getMacBalance().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update MacBalance with the passed number
	 *	@param number
	 */
	public void setMacBalance(BigDecimal number)  throws CFException{
		dcltbtrdmac.setMacBalance(number);
   }

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of customerSummaryRec
	 *	@return customerSummaryRec
	 */   
	 public CustomerSummaryRec getCustomerSummaryRec() {
   	return customerSummaryRec;
   }


	/**
	 *	Returns the value of trdCurrency
	 *	@return trdCurrency
	 */
   public char[] getTrdCurrency() throws CFException  {              
   		return trdOrderPair.getTrdCurrency();
   }

  
	/**
	*  set variable trdCurrency
	*  @param value
	**/
   public void setTrdCurrency(char[] value) throws CFException {
      trdOrderPair.setTrdCurrency(value);
   } 

     /**
	 * 	Update TrdCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdCurrency(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdCurrency(source, sourceIndex);
   	
   }
   
   public void setTrdCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdCurrency with another Field
	 *	@param value
	 */
   public void setTrdCurrency(Field source) {
      trdOrderPair.setTrdCurrency(source);
   }  
   
     /**
	 * 	Update TrdCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdCurrency(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "601" for isSettled()
	 *	@return  Returns true if isSettled() is "601"
	 */
   public boolean isSettled() throws CFException {
      return work.isSettled();
   }

	/**
	*  set values "601"
	*/
   	public void setSettledTrue()  throws CFException{  			
    	work.setSettledTrue();
   	}
	/**
	 *	Returns the value of summaryCustomerId
	 *	@return summaryCustomerId
	 */
   public char[] getSummaryCustomerId() throws CFException  {              
   		return customerSummaryRec.getSummaryCustomerId();
   }

  
	/**
	*  set variable summaryCustomerId
	*  @param value
	**/
   public void setSummaryCustomerId(char[] value) throws CFException {
      customerSummaryRec.setSummaryCustomerId(value);
   } 

     /**
	 * 	Update SummaryCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSummaryCustomerId(char[] source, int sourceIndex) throws CFException {
      customerSummaryRec.setSummaryCustomerId(source, sourceIndex);
   	
   }
   
   public void setSummaryCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      customerSummaryRec.setSummaryCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SummaryCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSummaryCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      customerSummaryRec.setSummaryCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SummaryCustomerId with another Field
	 *	@param value
	 */
   public void setSummaryCustomerId(Field source) {
      customerSummaryRec.setSummaryCustomerId(source);
   }  
   
     /**
	 * 	Update SummaryCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSummaryCustomerId(Field source, int sourceIndex,int sourceLen) {
      customerSummaryRec.setSummaryCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SummaryCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSummaryCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      customerSummaryRec.setSummaryCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Test condition "D" for isSummaryDebit88()
	 *	@return  Returns true if isSummaryDebit88() is "D"
	 */
   public boolean isSummaryDebit88() throws CFException {
      return work.isSummaryDebit88();
   }

	/**
	*  set values "D"
	*/
   	public void setSummaryDebit88True()  throws CFException{  			
    	work.setSummaryDebit88True();
   	}
	/**
	 *	Returns the value of trdBuyerId
	 *	@return trdBuyerId
	 */
   public char[] getTrdBuyerId() throws CFException  {              
   		return trdOrderPair.getTrdBuyerId();
   }

  
	/**
	*  set variable trdBuyerId
	*  @param value
	**/
   public void setTrdBuyerId(char[] value) throws CFException {
      trdOrderPair.setTrdBuyerId(value);
   } 

     /**
	 * 	Update TrdBuyerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdBuyerId(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdBuyerId(source, sourceIndex);
   	
   }
   
   public void setTrdBuyerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdBuyerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdBuyerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdBuyerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdBuyerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdBuyerId with another Field
	 *	@param value
	 */
   public void setTrdBuyerId(Field source) {
      trdOrderPair.setTrdBuyerId(source);
   }  
   
     /**
	 * 	Update TrdBuyerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdBuyerId(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdBuyerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdBuyerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdBuyerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdBuyerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dcltbtrdsum
	 *	@return dcltbtrdsum
	 */   
	 public Dcltbtrdsum getDcltbtrdsum() {
   	return dcltbtrdsum;
   }


	/**
	 *	Test condition "N" for isSummaryNoBooking88()
	 *	@return  Returns true if isSummaryNoBooking88() is "N"
	 */
   public boolean isSummaryNoBooking88() throws CFException {
      return work.isSummaryNoBooking88();
   }

	/**
	*  set values "N"
	*/
   	public void setSummaryNoBooking88True()  throws CFException{  			
    	work.setSummaryNoBooking88True();
   	}
	/**
	 *	Returns the value of trdSellerMoneyAccNum
	 *	@return trdSellerMoneyAccNum
	 */
	public int getTrdSellerMoneyAccNum() throws CFException {        
   		return trdOrderPair.getTrdSellerMoneyAccNum();
	}
	
	/**
	 * 	Update TrdSellerMoneyAccNum with the passed value
	 *	@param number
	 */
	public void setTrdSellerMoneyAccNum(int number)  throws CFException{
		trdOrderPair.setTrdSellerMoneyAccNum(number);
	}


	public void setTrdSellerMoneyAccNum(long number)  throws CFException{
		trdOrderPair.setTrdSellerMoneyAccNum((int)number);
	}


	public BigDecimal getTrdOrderAmount() throws CFException{      
   		return trdOrderPair.getTrdOrderAmount();
	}

    public char[] getTrdOrderAmountString() throws CFException {
          return  trdOrderPair.getTrdOrderAmount().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update TrdOrderAmount with the passed number
	 *	@param number
	 */
	public void setTrdOrderAmount(BigDecimal number)  throws CFException{
		trdOrderPair.setTrdOrderAmount(number);
   }

	/**
	 *	Test condition "301" "302" "303" "304" "305" "306" "307" "308" for isOverdue()
	 *	@return  Returns true if isOverdue() is "301" "302" "303" "304" "305" "306" "307" "308"
	 */
   public boolean isOverdue() throws CFException {
      return work.isOverdue();
   }

	/**
	*  set values "301" "302" "303" "304" "305" "306" "307" "308"
	*/
   	public void setOverdueTrue()  throws CFException{  			
    	work.setOverdueTrue();
   	}
	/**
	 *	Returns the value of trdBuyerMoneyAccNum
	 *	@return trdBuyerMoneyAccNum
	 */
	public int getTrdBuyerMoneyAccNum() throws CFException {        
   		return trdOrderPair.getTrdBuyerMoneyAccNum();
	}
	
	/**
	 * 	Update TrdBuyerMoneyAccNum with the passed value
	 *	@param number
	 */
	public void setTrdBuyerMoneyAccNum(int number)  throws CFException{
		trdOrderPair.setTrdBuyerMoneyAccNum(number);
	}


	public void setTrdBuyerMoneyAccNum(long number)  throws CFException{
		trdOrderPair.setTrdBuyerMoneyAccNum((int)number);
	}


	/**
	 *	Returns the value of dcltbtrdmac
	 *	@return dcltbtrdmac
	 */   
	 public Dcltbtrdmac getDcltbtrdmac() {
   	return dcltbtrdmac;
   }


	/**
	 *	Test condition "C" for isSummaryCredit88()
	 *	@return  Returns true if isSummaryCredit88() is "C"
	 */
   public boolean isSummaryCredit88() throws CFException {
      return work.isSummaryCredit88();
   }

	/**
	*  set values "C"
	*/
   	public void setSummaryCredit88True()  throws CFException{  			
    	work.setSummaryCredit88True();
   	}
	public BigDecimal getSumOpenBalance() throws CFException{      
   		return dcltbtrdsum.getSumOpenBalance();
	}

    public char[] getSumOpenBalanceString() throws CFException {
          return  dcltbtrdsum.getSumOpenBalance().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update SumOpenBalance with the passed number
	 *	@param number
	 */
	public void setSumOpenBalance(BigDecimal number)  throws CFException{
		dcltbtrdsum.setSumOpenBalance(number);
   }

	/**
	 *	Test condition "401" for isRejected()
	 *	@return  Returns true if isRejected() is "401"
	 */
   public boolean isRejected() throws CFException {
      return work.isRejected();
   }

	/**
	*  set values "401"
	*/
   	public void setRejectedTrue()  throws CFException{  			
    	work.setRejectedTrue();
   	}
	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}



        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
        }

        public LogSummaryOutCtx getLogSummaryOutCtx() {
            return new LogSummaryOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dcltbtrdsum.hashCode();
        str += work.hashCode();
        str += customerSummaryRec.hashCode();
        str += dcltbtrdmac.hashCode();
        str += trdOrderPair.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public LogSummaryInCtx clone() {
        LogSummaryInCtx cloneObj = new LogSummaryInCtx();
        cloneObj.dcltbtrdsum = new Dcltbtrdsum();
        cloneObj.dcltbtrdsum.set(dcltbtrdsum.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.customerSummaryRec = new CustomerSummaryRec();
        cloneObj.customerSummaryRec.set(customerSummaryRec.getClonedField());
        cloneObj.dcltbtrdmac = new Dcltbtrdmac();
        cloneObj.dcltbtrdmac.set(dcltbtrdmac.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public LogSummaryInCtx getLogSummaryInCtx() {
            return new LogSummaryInCtx();
    }
     public class LogSummaryOutCtx implements Cloneable {
     Dcltbtrdsum dcltbtrdsum = Trdpb001Ctx.this.getDcltbtrdsum();
     Work work = Trdpb001Ctx.this.getWork();
     Dcltbtrdmac dcltbtrdmac = Trdpb001Ctx.this.getDcltbtrdmac();
     CustomerSummaryRec customerSummaryRec = Trdpb001Ctx.this.getCustomerSummaryRec();
     TrdOrderPair trdOrderPair = Trdpb001Ctx.this.getTrdOrderPair();
     Sqlca sqlca = Trdpb001Ctx.this.getSqlca();

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	public BigDecimal getSumTotalDebit() throws CFException{      
   		return dcltbtrdsum.getSumTotalDebit();
	}

    public char[] getSumTotalDebitString() throws CFException {
          return  dcltbtrdsum.getSumTotalDebit().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update SumTotalDebit with the passed number
	 *	@param number
	 */
	public void setSumTotalDebit(BigDecimal number)  throws CFException{
		dcltbtrdsum.setSumTotalDebit(number);
   }

	public BigDecimal getSumCloseBalance() throws CFException{      
   		return dcltbtrdsum.getSumCloseBalance();
	}

    public char[] getSumCloseBalanceString() throws CFException {
          return  dcltbtrdsum.getSumCloseBalance().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update SumCloseBalance with the passed number
	 *	@param number
	 */
	public void setSumCloseBalance(BigDecimal number)  throws CFException{
		dcltbtrdsum.setSumCloseBalance(number);
   }

	/**
	 *	Returns the value of exception
	 *	@return exception
	 */
   public char[] getException() throws CFException  {              
   		return work.getException();
   }

  
	/**
	*  set variable exception
	*  @param value
	**/
   public void setException(char[] value) throws CFException {
      work.setException(value);
   } 

	/**
	 *	Returns the value of sumOverdue
	 *	@return sumOverdue
	 */
	public int getSumOverdue() throws CFException {        
   		return dcltbtrdsum.getSumOverdue();
	}
	
	/**
	 * 	Update SumOverdue with the passed value
	 *	@param number
	 */
	public void setSumOverdue(int number)  throws CFException{
		dcltbtrdsum.setSumOverdue(number);
	}


	public void setSumOverdue(long number)  throws CFException{
		dcltbtrdsum.setSumOverdue((int)number);
	}


	/**
	 *	Returns the value of sumCurrency
	 *	@return sumCurrency
	 */
   public char[] getSumCurrency() throws CFException  {              
   		return dcltbtrdsum.getSumCurrency();
   }

  
	/**
	*  set variable sumCurrency
	*  @param value
	**/
   public void setSumCurrency(char[] value) throws CFException {
      dcltbtrdsum.setSumCurrency(value);
   } 

     /**
	 * 	Update SumCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSumCurrency(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsum.setSumCurrency(source, sourceIndex);
   	
   }
   
   public void setSumCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsum.setSumCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SumCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSumCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsum.setSumCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SumCurrency with another Field
	 *	@param value
	 */
   public void setSumCurrency(Field source) {
      dcltbtrdsum.setSumCurrency(source);
   }  
   
     /**
	 * 	Update SumCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSumCurrency(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsum.setSumCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SumCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSumCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsum.setSumCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of trdBuyerMoneyAccNum
	 *	@return trdBuyerMoneyAccNum
	 */
	public int getTrdBuyerMoneyAccNum() throws CFException {        
   		return trdOrderPair.getTrdBuyerMoneyAccNum();
	}
	
	/**
	 * 	Update TrdBuyerMoneyAccNum with the passed value
	 *	@param number
	 */
	public void setTrdBuyerMoneyAccNum(int number)  throws CFException{
		trdOrderPair.setTrdBuyerMoneyAccNum(number);
	}


	public void setTrdBuyerMoneyAccNum(long number)  throws CFException{
		trdOrderPair.setTrdBuyerMoneyAccNum((int)number);
	}


	/**
	 *	Returns the value of dcltbtrdmac
	 *	@return dcltbtrdmac
	 */   
	 public Dcltbtrdmac getDcltbtrdmac() {
   	return dcltbtrdmac;
   }


	/**
	 *	Returns the value of sumCustomerId
	 *	@return sumCustomerId
	 */
   public char[] getSumCustomerId() throws CFException  {              
   		return dcltbtrdsum.getSumCustomerId();
   }

  
	/**
	*  set variable sumCustomerId
	*  @param value
	**/
   public void setSumCustomerId(char[] value) throws CFException {
      dcltbtrdsum.setSumCustomerId(value);
   } 

     /**
	 * 	Update SumCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSumCustomerId(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsum.setSumCustomerId(source, sourceIndex);
   	
   }
   
   public void setSumCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsum.setSumCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SumCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSumCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsum.setSumCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SumCustomerId with another Field
	 *	@param value
	 */
   public void setSumCustomerId(Field source) {
      dcltbtrdsum.setSumCustomerId(source);
   }  
   
     /**
	 * 	Update SumCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSumCustomerId(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsum.setSumCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SumCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSumCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsum.setSumCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "R" for isCustomerSummaryRewrite88()
	 *	@return  Returns true if isCustomerSummaryRewrite88() is "R"
	 */
   public boolean isCustomerSummaryRewrite88() throws CFException {
      return work.isCustomerSummaryRewrite88();
   }

	/**
	*  set values "R"
	*/
   	public void setCustomerSummaryRewrite88True()  throws CFException{  			
    	work.setCustomerSummaryRewrite88True();
   	}
	/**
	 *	Test condition "W" for isCustomerSummaryWrite88()
	 *	@return  Returns true if isCustomerSummaryWrite88() is "W"
	 */
   public boolean isCustomerSummaryWrite88() throws CFException {
      return work.isCustomerSummaryWrite88();
   }

	/**
	*  set values "W"
	*/
   	public void setCustomerSummaryWrite88True()  throws CFException{  			
    	work.setCustomerSummaryWrite88True();
   	}
	/**
	 *	Returns the value of sumSettled
	 *	@return sumSettled
	 */
	public int getSumSettled() throws CFException {        
   		return dcltbtrdsum.getSumSettled();
	}
	
	/**
	 * 	Update SumSettled with the passed value
	 *	@param number
	 */
	public void setSumSettled(int number)  throws CFException{
		dcltbtrdsum.setSumSettled(number);
	}


	public void setSumSettled(long number)  throws CFException{
		dcltbtrdsum.setSumSettled((int)number);
	}


	/**
	 *	Test condition "A" for isApplException()
	 *	@return  Returns true if isApplException() is "A"
	 */
   public boolean isApplException() throws CFException {
      return work.isApplException();
   }

	/**
	*  set values "A"
	*/
   	public void setApplExceptionTrue()  throws CFException{  			
    	work.setApplExceptionTrue();
   	}
	/**
	 *	Returns the value of customerSummaryRec
	 *	@return customerSummaryRec
	 */   
	 public CustomerSummaryRec getCustomerSummaryRec() {
   	return customerSummaryRec;
   }


	/**
	 *	Returns the value of trdCurrency
	 *	@return trdCurrency
	 */
   public char[] getTrdCurrency() throws CFException  {              
   		return trdOrderPair.getTrdCurrency();
   }

  
	/**
	*  set variable trdCurrency
	*  @param value
	**/
   public void setTrdCurrency(char[] value) throws CFException {
      trdOrderPair.setTrdCurrency(value);
   } 

     /**
	 * 	Update TrdCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrdCurrency(char[] source, int sourceIndex) throws CFException {
      trdOrderPair.setTrdCurrency(source, sourceIndex);
   	
   }
   
   public void setTrdCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrdCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrdCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrdCurrency with another Field
	 *	@param value
	 */
   public void setTrdCurrency(Field source) {
      trdOrderPair.setTrdCurrency(source);
   }  
   
     /**
	 * 	Update TrdCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrdCurrency(Field source, int sourceIndex,int sourceLen) {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrdCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrdCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trdOrderPair.setTrdCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sumRejected
	 *	@return sumRejected
	 */
	public int getSumRejected() throws CFException {        
   		return dcltbtrdsum.getSumRejected();
	}
	
	/**
	 * 	Update SumRejected with the passed value
	 *	@param number
	 */
	public void setSumRejected(int number)  throws CFException{
		dcltbtrdsum.setSumRejected(number);
	}


	public void setSumRejected(long number)  throws CFException{
		dcltbtrdsum.setSumRejected((int)number);
	}


	/**
	 *	Returns the value of macCurrency
	 *	@return macCurrency
	 */
   public char[] getMacCurrency() throws CFException  {              
   		return dcltbtrdmac.getMacCurrency();
   }

  
	/**
	*  set variable macCurrency
	*  @param value
	**/
   public void setMacCurrency(char[] value) throws CFException {
      dcltbtrdmac.setMacCurrency(value);
   } 

     /**
	 * 	Update MacCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMacCurrency(char[] source, int sourceIndex) throws CFException {
      dcltbtrdmac.setMacCurrency(source, sourceIndex);
   	
   }
   
   public void setMacCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdmac.setMacCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MacCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMacCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdmac.setMacCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MacCurrency with another Field
	 *	@param value
	 */
   public void setMacCurrency(Field source) {
      dcltbtrdmac.setMacCurrency(source);
   }  
   
     /**
	 * 	Update MacCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMacCurrency(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdmac.setMacCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MacCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMacCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdmac.setMacCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of summaryCustomerId
	 *	@return summaryCustomerId
	 */
   public char[] getSummaryCustomerId() throws CFException  {              
   		return customerSummaryRec.getSummaryCustomerId();
   }

  
	/**
	*  set variable summaryCustomerId
	*  @param value
	**/
   public void setSummaryCustomerId(char[] value) throws CFException {
      customerSummaryRec.setSummaryCustomerId(value);
   } 

     /**
	 * 	Update SummaryCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSummaryCustomerId(char[] source, int sourceIndex) throws CFException {
      customerSummaryRec.setSummaryCustomerId(source, sourceIndex);
   	
   }
   
   public void setSummaryCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      customerSummaryRec.setSummaryCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SummaryCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSummaryCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      customerSummaryRec.setSummaryCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SummaryCustomerId with another Field
	 *	@param value
	 */
   public void setSummaryCustomerId(Field source) {
      customerSummaryRec.setSummaryCustomerId(source);
   }  
   
     /**
	 * 	Update SummaryCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSummaryCustomerId(Field source, int sourceIndex,int sourceLen) {
      customerSummaryRec.setSummaryCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SummaryCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSummaryCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      customerSummaryRec.setSummaryCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of dcltbtrdsum
	 *	@return dcltbtrdsum
	 */   
	 public Dcltbtrdsum getDcltbtrdsum() {
   	return dcltbtrdsum;
   }


	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
   public char[] getSqlcode_Ws() throws CFException  {              
   		return work.getSqlcode_Ws();
   }

  
	/**
	*  set variable sqlcode_Ws
	*  @param value
	**/
   public void setSqlcode_Ws(char[] value) throws CFException {
      work.setSqlcode_Ws(value);
   } 

     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex) throws CFException {
      work.setSqlcode_Ws(source, sourceIndex);
   	
   }
   
   public void setSqlcode_Ws(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlcode_Ws with another Field
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source) {
      work.setSqlcode_Ws(source);
   }  
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of trdSellerMoneyAccNum
	 *	@return trdSellerMoneyAccNum
	 */
	public int getTrdSellerMoneyAccNum() throws CFException {        
   		return trdOrderPair.getTrdSellerMoneyAccNum();
	}
	
	/**
	 * 	Update TrdSellerMoneyAccNum with the passed value
	 *	@param number
	 */
	public void setTrdSellerMoneyAccNum(int number)  throws CFException{
		trdOrderPair.setTrdSellerMoneyAccNum(number);
	}


	public void setTrdSellerMoneyAccNum(long number)  throws CFException{
		trdOrderPair.setTrdSellerMoneyAccNum((int)number);
	}


	/**
	 *	Returns the value of macNumber
	 *	@return macNumber
	 */
	public int getMacNumber() throws CFException {        
   		return dcltbtrdmac.getMacNumber();
	}
	
	/**
	 * 	Update MacNumber with the passed value
	 *	@param number
	 */
	public void setMacNumber(int number)  throws CFException{
		dcltbtrdmac.setMacNumber(number);
	}


	public void setMacNumber(long number)  throws CFException{
		dcltbtrdmac.setMacNumber((int)number);
	}


	public BigDecimal getSumOpenBalance() throws CFException{      
   		return dcltbtrdsum.getSumOpenBalance();
	}

    public char[] getSumOpenBalanceString() throws CFException {
          return  dcltbtrdsum.getSumOpenBalance().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update SumOpenBalance with the passed number
	 *	@param number
	 */
	public void setSumOpenBalance(BigDecimal number)  throws CFException{
		dcltbtrdsum.setSumOpenBalance(number);
   }

	public BigDecimal getSumTotalCredit() throws CFException{      
   		return dcltbtrdsum.getSumTotalCredit();
	}

    public char[] getSumTotalCreditString() throws CFException {
          return  dcltbtrdsum.getSumTotalCredit().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update SumTotalCredit with the passed number
	 *	@param number
	 */
	public void setSumTotalCredit(BigDecimal number)  throws CFException{
		dcltbtrdsum.setSumTotalCredit(number);
   }


        public Trdpb001Ctx getTrdpb001Ctx() {
            return Trdpb001Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dcltbtrdsum.hashCode();
        str += work.hashCode();
        str += dcltbtrdmac.hashCode();
        str += customerSummaryRec.hashCode();
        str += trdOrderPair.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public LogSummaryOutCtx clone() {
        LogSummaryOutCtx cloneObj = new LogSummaryOutCtx();
        cloneObj.dcltbtrdsum = new Dcltbtrdsum();
        cloneObj.dcltbtrdsum.set(dcltbtrdsum.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dcltbtrdmac = new Dcltbtrdmac();
        cloneObj.dcltbtrdmac.set(dcltbtrdmac.getClonedField());
        cloneObj.customerSummaryRec = new CustomerSummaryRec();
        cloneObj.customerSummaryRec.set(customerSummaryRec.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public LogSummaryOutCtx getLogSummaryOutCtx() {
            return new LogSummaryOutCtx();
    }
}
