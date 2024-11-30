package com.cloudframe.app.dto.trdpb000;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

 
 
 
 
 
 
 
 
 
 
 
 
 
import java.sql.ResultSet;
 
 
 


@Context
public class Trdpb000Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    CustomerSummaryRec customerSummaryRec;
    Dcltbtrdsac dcltbtrdsac;
    SettlmentQueueTable settlmentQueueTable;
    ExceptionRecord exceptionRecord;
    Sqlca sqlca;
    ExceptionRecordLenGroup exceptionRecordLenGroup;
    Dcltbtrdlog dcltbtrdlog;
    Work work;
    TrdOrderPair trdOrderPair;
    Dcltbtrdmac dcltbtrdmac;
    Dcltbtrdord dcltbtrdord;
    CustomerIo customerIo;
    Dcltbtrdsum dcltbtrdsum;
    Parm parm;
    SecurityIo securityIo;


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


    ResultSet buySideOrdersResultSet;

    public ResultSet getBuySideOrdersResultSet() {
        return this.buySideOrdersResultSet;
    }

    public void setBuySideOrdersResultSet(ResultSet buySideOrdersResultSet) {
        this.buySideOrdersResultSet = buySideOrdersResultSet;
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


    public CustomerSummaryRec getCustomerSummaryRec() {
        if (customerSummaryRec == null) {
            customerSummaryRec = new CustomerSummaryRec();
        }

        return customerSummaryRec;
    }

    public void setCustomerSummaryRec(CustomerSummaryRec customerSummaryRec) {
        this.customerSummaryRec = customerSummaryRec;
    }
    public Dcltbtrdsac getDcltbtrdsac() {
        if (dcltbtrdsac == null) {
            dcltbtrdsac = new Dcltbtrdsac();
        }

        return dcltbtrdsac;
    }

    public void setDcltbtrdsac(Dcltbtrdsac dcltbtrdsac) {
        this.dcltbtrdsac = dcltbtrdsac;
    }
    public SettlmentQueueTable getSettlmentQueueTable() {
        if (settlmentQueueTable == null) {
            settlmentQueueTable = new SettlmentQueueTable();
        }

        return settlmentQueueTable;
    }

    public void setSettlmentQueueTable(SettlmentQueueTable settlmentQueueTable) {
        this.settlmentQueueTable = settlmentQueueTable;
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
    public Sqlca getSqlca() {
        if (sqlca == null) {
            sqlca = new Sqlca();
        }

        return sqlca;
    }

    public void setSqlca(Sqlca sqlca) {
        this.sqlca = sqlca;
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
    public Dcltbtrdlog getDcltbtrdlog() {
        if (dcltbtrdlog == null) {
            dcltbtrdlog = new Dcltbtrdlog();
        }

        return dcltbtrdlog;
    }

    public void setDcltbtrdlog(Dcltbtrdlog dcltbtrdlog) {
        this.dcltbtrdlog = dcltbtrdlog;
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
    public TrdOrderPair getTrdOrderPair() {
        if (trdOrderPair == null) {
            trdOrderPair = new TrdOrderPair();
        }

        return trdOrderPair;
    }

    public void setTrdOrderPair(TrdOrderPair trdOrderPair) {
        this.trdOrderPair = trdOrderPair;
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
    public Dcltbtrdord getDcltbtrdord() {
        if (dcltbtrdord == null) {
            dcltbtrdord = new Dcltbtrdord();
        }

        return dcltbtrdord;
    }

    public void setDcltbtrdord(Dcltbtrdord dcltbtrdord) {
        this.dcltbtrdord = dcltbtrdord;
    }
    public CustomerIo getCustomerIo() {
        if (customerIo == null) {
            customerIo = new CustomerIo();
        }

        return customerIo;
    }

    public void setCustomerIo(CustomerIo customerIo) {
        this.customerIo = customerIo;
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
    public Parm getParm() {
        if (parm == null) {
            parm = new Parm();
        }

        return parm;
    }

    public void setParm(Parm parm) {
        this.parm = parm;
    }
    public SecurityIo getSecurityIo() {
        if (securityIo == null) {
            securityIo = new SecurityIo();
        }

        return securityIo;
    }

    public void setSecurityIo(SecurityIo securityIo) {
        this.securityIo = securityIo;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += customerSummaryRec.hashCode();
        str += dcltbtrdsac.hashCode();
        str += settlmentQueueTable.hashCode();
        str += exceptionRecord.hashCode();
        str += sqlca.hashCode();
        str += exceptionRecordLenGroup.hashCode();
        str += dcltbtrdlog.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += dcltbtrdmac.hashCode();
        str += dcltbtrdord.hashCode();
        str += customerIo.hashCode();
        str += dcltbtrdsum.hashCode();
        str += parm.hashCode();
        str += securityIo.hashCode();
       return str.hashCode();
    }

    public Trdpb000Ctx clone() {
        Trdpb000Ctx cloneObj = new Trdpb000Ctx();
        cloneObj.customerSummaryRec = new CustomerSummaryRec();
        cloneObj.customerSummaryRec.set(customerSummaryRec.getClonedField());
        cloneObj.dcltbtrdsac = new Dcltbtrdsac();
        cloneObj.dcltbtrdsac.set(dcltbtrdsac.getClonedField());
        cloneObj.settlmentQueueTable = new SettlmentQueueTable();
        cloneObj.settlmentQueueTable.set(settlmentQueueTable.getClonedField());
        cloneObj.exceptionRecord = new ExceptionRecord();
        cloneObj.exceptionRecord.set(exceptionRecord.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.exceptionRecordLenGroup = new ExceptionRecordLenGroup();
        cloneObj.exceptionRecordLenGroup.set(exceptionRecordLenGroup.getClonedField());
        cloneObj.dcltbtrdlog = new Dcltbtrdlog();
        cloneObj.dcltbtrdlog.set(dcltbtrdlog.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdmac = new Dcltbtrdmac();
        cloneObj.dcltbtrdmac.set(dcltbtrdmac.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        cloneObj.customerIo = new CustomerIo();
        cloneObj.customerIo.set(customerIo.getClonedField());
        cloneObj.dcltbtrdsum = new Dcltbtrdsum();
        cloneObj.dcltbtrdsum.set(dcltbtrdsum.getClonedField());
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.securityIo = new SecurityIo();
        cloneObj.securityIo.set(securityIo.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Parm parm = Trdpb000Ctx.this.getParm();


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
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
     Parm parm = Trdpb000Ctx.this.getParm();
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Dcltbtrdlog dcltbtrdlog = Trdpb000Ctx.this.getDcltbtrdlog();
     Work work = Trdpb000Ctx.this.getWork();

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
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Returns the value of dcltbtrdlog
	 *	@return dcltbtrdlog
	 */   
	 public Dcltbtrdlog getDcltbtrdlog() {
   	return dcltbtrdlog;
   }


	/**
	 *	Returns the value of currency01
	 *	@return currency01
	 */
   public char[] getCurrency01() throws CFException  {              
   		return parm.getCurrency01();
   }

  
	/**
	*  set variable currency01
	*  @param value
	**/
   public void setCurrency01(char[] value) throws CFException {
      parm.setCurrency01(value);
   } 

     /**
	 * 	Update Currency01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrency01(char[] source, int sourceIndex) throws CFException {
      parm.setCurrency01(source, sourceIndex);
   	
   }
   
   public void setCurrency01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parm.setCurrency01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currency01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrency01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCurrency01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currency01 with another Field
	 *	@param value
	 */
   public void setCurrency01(Field source) {
      parm.setCurrency01(source);
   }  
   
     /**
	 * 	Update Currency01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrency01(Field source, int sourceIndex,int sourceLen) {
      parm.setCurrency01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currency01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrency01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCurrency01(source, sourceIndex, sourceLen, targetIndex, targetLen);
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


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
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
        str += sqlca.hashCode();
        str += dcltbtrdlog.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dcltbtrdlog = new Dcltbtrdlog();
        cloneObj.dcltbtrdlog.set(dcltbtrdlog.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     Parm parm = Trdpb000Ctx.this.getParm();
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Dcltbtrdlog dcltbtrdlog = Trdpb000Ctx.this.getDcltbtrdlog();
     Work work = Trdpb000Ctx.this.getWork();

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
	 *	Returns the value of dcltbtrdlog
	 *	@return dcltbtrdlog
	 */   
	 public Dcltbtrdlog getDcltbtrdlog() {
   	return dcltbtrdlog;
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
	 *	Returns the value of currency01
	 *	@return currency01
	 */
   public char[] getCurrency01() throws CFException  {              
   		return parm.getCurrency01();
   }

  
	/**
	*  set variable currency01
	*  @param value
	**/
   public void setCurrency01(char[] value) throws CFException {
      parm.setCurrency01(value);
   } 

     /**
	 * 	Update Currency01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrency01(char[] source, int sourceIndex) throws CFException {
      parm.setCurrency01(source, sourceIndex);
   	
   }
   
   public void setCurrency01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parm.setCurrency01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currency01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrency01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCurrency01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currency01 with another Field
	 *	@param value
	 */
   public void setCurrency01(Field source) {
      parm.setCurrency01(source);
   }  
   
     /**
	 * 	Update Currency01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrency01(Field source, int sourceIndex,int sourceLen) {
      parm.setCurrency01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currency01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrency01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCurrency01(source, sourceIndex, sourceLen, targetIndex, targetLen);
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



        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
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
        str += sqlca.hashCode();
        str += dcltbtrdlog.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dcltbtrdlog = new Dcltbtrdlog();
        cloneObj.dcltbtrdlog.set(dcltbtrdlog.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class OrderAcceptanceInCtx implements Cloneable {
     Parm parm = Trdpb000Ctx.this.getParm();
     SettlmentQueueTable settlmentQueueTable = Trdpb000Ctx.this.getSettlmentQueueTable();
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();

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
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Returns the value of ordCustomerId
	 *	@return ordCustomerId
	 */
   public char[] getOrdCustomerId() throws CFException  {              
   		return dcltbtrdord.getOrdCustomerId();
   }

  
	/**
	*  set variable ordCustomerId
	*  @param value
	**/
   public void setOrdCustomerId(char[] value) throws CFException {
      dcltbtrdord.setOrdCustomerId(value);
   } 

     /**
	 * 	Update OrdCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdCustomerId(char[] source, int sourceIndex) throws CFException {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex);
   	
   }
   
   public void setOrdCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OrdCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OrdCustomerId with another Field
	 *	@param value
	 */
   public void setOrdCustomerId(Field source) {
      dcltbtrdord.setOrdCustomerId(source);
   }  
   
     /**
	 * 	Update OrdCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdCustomerId(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OrdCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getOrdQuantity() throws CFException{      
   		return dcltbtrdord.getOrdQuantity();
	}

    public char[] getOrdQuantityString() throws CFException {
          return  dcltbtrdord.getOrdQuantity().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update OrdQuantity with the passed number
	 *	@param number
	 */
	public void setOrdQuantity(BigDecimal number)  throws CFException{
		dcltbtrdord.setOrdQuantity(number);
   }

	public BigDecimal getOrdAmount() throws CFException{      
   		return dcltbtrdord.getOrdAmount();
	}

    public char[] getOrdAmountString() throws CFException {
          return  dcltbtrdord.getOrdAmount().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update OrdAmount with the passed number
	 *	@param number
	 */
	public void setOrdAmount(BigDecimal number)  throws CFException{
		dcltbtrdord.setOrdAmount(number);
   }

	/**
	 *	Returns the value of orderCount
	 *	@return orderCount
	 */
	public int getOrderCount() throws CFException {        
   		return work.getOrderCount();
	}
	
	/**
	 * 	Update OrderCount with the passed value
	 *	@param number
	 */
	public void setOrderCount(int number)  throws CFException{
		work.setOrderCount(number);
	}


	public void setOrderCount(long number)  throws CFException{
		work.setOrderCount((int)number);
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
	 *	Returns the value of currency01
	 *	@return currency01
	 */
   public char[] getCurrency01() throws CFException  {              
   		return parm.getCurrency01();
   }

  
	/**
	*  set variable currency01
	*  @param value
	**/
   public void setCurrency01(char[] value) throws CFException {
      parm.setCurrency01(value);
   } 

     /**
	 * 	Update Currency01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrency01(char[] source, int sourceIndex) throws CFException {
      parm.setCurrency01(source, sourceIndex);
   	
   }
   
   public void setCurrency01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parm.setCurrency01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currency01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrency01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCurrency01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currency01 with another Field
	 *	@param value
	 */
   public void setCurrency01(Field source) {
      parm.setCurrency01(source);
   }  
   
     /**
	 * 	Update Currency01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrency01(Field source, int sourceIndex,int sourceLen) {
      parm.setCurrency01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currency01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrency01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCurrency01(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of stqIndex
	 *	@return stqIndex
	 */
	public short getStqIndex() throws CFException {        
   		return settlmentQueueTable.getStqIndex();
	}
	
	/**
	 * 	Update StqIndex with the passed value
	 *	@param number
	 */
	public void setStqIndex(short number)  throws CFException{
		settlmentQueueTable.setStqIndex(number);
	}

	public void setStqIndex(int number)  throws CFException{
		settlmentQueueTable.setStqIndex((short)number);
	}

	public void setStqIndex(long number)  throws CFException{
		settlmentQueueTable.setStqIndex((short)number);
	}




        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }

        public OrderAcceptanceOutCtx getOrderAcceptanceOutCtx() {
            return new OrderAcceptanceOutCtx();
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
        str += settlmentQueueTable.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += dcltbtrdord.hashCode();
       return str.hashCode();
    }

    public OrderAcceptanceInCtx clone() {
        OrderAcceptanceInCtx cloneObj = new OrderAcceptanceInCtx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.settlmentQueueTable = new SettlmentQueueTable();
        cloneObj.settlmentQueueTable.set(settlmentQueueTable.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        return cloneObj;
    }

    }

    public OrderAcceptanceInCtx getOrderAcceptanceInCtx() {
            return new OrderAcceptanceInCtx();
    }
     public class OrderAcceptanceOutCtx implements Cloneable {
     Parm parm = Trdpb000Ctx.this.getParm();
     SettlmentQueueTable settlmentQueueTable = Trdpb000Ctx.this.getSettlmentQueueTable();
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();

	/**
	 *	Test condition "Y" for isNoMoreOrders()
	 *	@return  Returns true if isNoMoreOrders() is "Y"
	 */
   public boolean isNoMoreOrders() throws CFException {
      return work.isNoMoreOrders();
   }

	/**
	*  set values "Y"
	*/
   	public void setNoMoreOrdersTrue()  throws CFException{  			
    	work.setNoMoreOrdersTrue();
   	}
	/**
	 *	Returns the value of stqCurrency
	 *	@return stqCurrency
	 */
   public char[] getStqCurrency(int index) throws CFException  {              
   		return settlmentQueueTable.getStqCurrency(index);
   }

  
	/**
	*  set variable stqCurrency
	*  @param value
	**/
   public void setStqCurrency(int index,char[] value) throws CFException {
      settlmentQueueTable.setStqCurrency((index),value);
   } 

	/**
	 *	Returns the value of dcltbtrdord
	 *	@return dcltbtrdord
	 */   
	 public Dcltbtrdord getDcltbtrdord() {
   	return dcltbtrdord;
   }


	/**
	 *	Test condition "101" for isAccepted()
	 *	@return  Returns true if isAccepted() is "101"
	 */
   public boolean isAccepted() throws CFException {
      return work.isAccepted();
   }

	/**
	*  set values "101"
	*/
   	public void setAcceptedTrue()  throws CFException{  			
    	work.setAcceptedTrue();
   	}
	/**
	 *	Returns the value of ordCustomerId
	 *	@return ordCustomerId
	 */
   public char[] getOrdCustomerId() throws CFException  {              
   		return dcltbtrdord.getOrdCustomerId();
   }

  
	/**
	*  set variable ordCustomerId
	*  @param value
	**/
   public void setOrdCustomerId(char[] value) throws CFException {
      dcltbtrdord.setOrdCustomerId(value);
   } 

     /**
	 * 	Update OrdCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdCustomerId(char[] source, int sourceIndex) throws CFException {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex);
   	
   }
   
   public void setOrdCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OrdCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OrdCustomerId with another Field
	 *	@param value
	 */
   public void setOrdCustomerId(Field source) {
      dcltbtrdord.setOrdCustomerId(source);
   }  
   
     /**
	 * 	Update OrdCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdCustomerId(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OrdCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

	public BigDecimal getOrdQuantity() throws CFException{      
   		return dcltbtrdord.getOrdQuantity();
	}

    public char[] getOrdQuantityString() throws CFException {
          return  dcltbtrdord.getOrdQuantity().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update OrdQuantity with the passed number
	 *	@param number
	 */
	public void setOrdQuantity(BigDecimal number)  throws CFException{
		dcltbtrdord.setOrdQuantity(number);
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
	 *	Test condition "N" for isNoExceptions()
	 *	@return  Returns true if isNoExceptions() is "N"
	 */
   public boolean isNoExceptions() throws CFException {
      return work.isNoExceptions();
   }

	/**
	*  set values "N"
	*/
   	public void setNoExceptionsTrue()  throws CFException{  			
    	work.setNoExceptionsTrue();
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
	 *	Returns the value of stqIndex
	 *	@return stqIndex
	 */
	public short getStqIndex() throws CFException {        
   		return settlmentQueueTable.getStqIndex();
	}
	
	/**
	 * 	Update StqIndex with the passed value
	 *	@param number
	 */
	public void setStqIndex(short number)  throws CFException{
		settlmentQueueTable.setStqIndex(number);
	}

	public void setStqIndex(int number)  throws CFException{
		settlmentQueueTable.setStqIndex((short)number);
	}

	public void setStqIndex(long number)  throws CFException{
		settlmentQueueTable.setStqIndex((short)number);
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

	public BigDecimal getTrdOrderQty() throws CFException{      
   		return trdOrderPair.getTrdOrderQty();
	}

    public char[] getTrdOrderQtyString() throws CFException {
          return  trdOrderPair.getTrdOrderQty().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update TrdOrderQty with the passed number
	 *	@param number
	 */
	public void setTrdOrderQty(BigDecimal number)  throws CFException{
		trdOrderPair.setTrdOrderQty(number);
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

	public BigDecimal getOrdAmount() throws CFException{      
   		return dcltbtrdord.getOrdAmount();
	}

    public char[] getOrdAmountString() throws CFException {
          return  dcltbtrdord.getOrdAmount().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update OrdAmount with the passed number
	 *	@param number
	 */
	public void setOrdAmount(BigDecimal number)  throws CFException{
		dcltbtrdord.setOrdAmount(number);
   }

	/**
	 *	Returns the value of orderCount
	 *	@return orderCount
	 */
	public int getOrderCount() throws CFException {        
   		return work.getOrderCount();
	}
	
	/**
	 * 	Update OrderCount with the passed value
	 *	@param number
	 */
	public void setOrderCount(int number)  throws CFException{
		work.setOrderCount(number);
	}


	public void setOrderCount(long number)  throws CFException{
		work.setOrderCount((int)number);
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
	 *	Returns the value of currency01
	 *	@return currency01
	 */
   public char[] getCurrency01() throws CFException  {              
   		return parm.getCurrency01();
   }

  
	/**
	*  set variable currency01
	*  @param value
	**/
   public void setCurrency01(char[] value) throws CFException {
      parm.setCurrency01(value);
   } 

     /**
	 * 	Update Currency01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrency01(char[] source, int sourceIndex) throws CFException {
      parm.setCurrency01(source, sourceIndex);
   	
   }
   
   public void setCurrency01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parm.setCurrency01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currency01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrency01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCurrency01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currency01 with another Field
	 *	@param value
	 */
   public void setCurrency01(Field source) {
      parm.setCurrency01(source);
   }  
   
     /**
	 * 	Update Currency01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrency01(Field source, int sourceIndex,int sourceLen) {
      parm.setCurrency01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currency01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrency01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCurrency01(source, sourceIndex, sourceLen, targetIndex, targetLen);
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


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
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
        str += settlmentQueueTable.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += dcltbtrdord.hashCode();
       return str.hashCode();
    }

    public OrderAcceptanceOutCtx clone() {
        OrderAcceptanceOutCtx cloneObj = new OrderAcceptanceOutCtx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.settlmentQueueTable = new SettlmentQueueTable();
        cloneObj.settlmentQueueTable.set(settlmentQueueTable.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        return cloneObj;
    }

    }

    public OrderAcceptanceOutCtx getOrderAcceptanceOutCtx() {
            return new OrderAcceptanceOutCtx();
    }
     public class GetSellSideOrderInCtx implements Cloneable {
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();

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
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Returns the value of dcltbtrdord
	 *	@return dcltbtrdord
	 */   
	 public Dcltbtrdord getDcltbtrdord() {
   	return dcltbtrdord;
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
	 *	Returns the value of ordCustomerId
	 *	@return ordCustomerId
	 */
   public char[] getOrdCustomerId() throws CFException  {              
   		return dcltbtrdord.getOrdCustomerId();
   }

  
	/**
	*  set variable ordCustomerId
	*  @param value
	**/
   public void setOrdCustomerId(char[] value) throws CFException {
      dcltbtrdord.setOrdCustomerId(value);
   } 

     /**
	 * 	Update OrdCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdCustomerId(char[] source, int sourceIndex) throws CFException {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex);
   	
   }
   
   public void setOrdCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OrdCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OrdCustomerId with another Field
	 *	@param value
	 */
   public void setOrdCustomerId(Field source) {
      dcltbtrdord.setOrdCustomerId(source);
   }  
   
     /**
	 * 	Update OrdCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdCustomerId(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OrdCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
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


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }

        public GetSellSideOrderOutCtx getGetSellSideOrderOutCtx() {
            return new GetSellSideOrderOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += dcltbtrdord.hashCode();
       return str.hashCode();
    }

    public GetSellSideOrderInCtx clone() {
        GetSellSideOrderInCtx cloneObj = new GetSellSideOrderInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        return cloneObj;
    }

    }

    public GetSellSideOrderInCtx getGetSellSideOrderInCtx() {
            return new GetSellSideOrderInCtx();
    }
     public class GetSellSideOrderOutCtx implements Cloneable {
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();

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
	 *	Test condition "308" for isOverdueSellerOrdMissing()
	 *	@return  Returns true if isOverdueSellerOrdMissing() is "308"
	 */
   public boolean isOverdueSellerOrdMissing() throws CFException {
      return work.isOverdueSellerOrdMissing();
   }

	/**
	*  set values "308"
	*/
   	public void setOverdueSellerOrdMissingTrue()  throws CFException{  			
    	work.setOverdueSellerOrdMissingTrue();
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
	 *	Test condition "307" for isOverdueSellerOrdstaInvld()
	 *	@return  Returns true if isOverdueSellerOrdstaInvld() is "307"
	 */
   public boolean isOverdueSellerOrdstaInvld() throws CFException {
      return work.isOverdueSellerOrdstaInvld();
   }

	/**
	*  set values "307"
	*/
   	public void setOverdueSellerOrdstaInvldTrue()  throws CFException{  			
    	work.setOverdueSellerOrdstaInvldTrue();
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
	 *	Returns the value of ordCustomerId
	 *	@return ordCustomerId
	 */
   public char[] getOrdCustomerId() throws CFException  {              
   		return dcltbtrdord.getOrdCustomerId();
   }

  
	/**
	*  set variable ordCustomerId
	*  @param value
	**/
   public void setOrdCustomerId(char[] value) throws CFException {
      dcltbtrdord.setOrdCustomerId(value);
   } 

     /**
	 * 	Update OrdCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdCustomerId(char[] source, int sourceIndex) throws CFException {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex);
   	
   }
   
   public void setOrdCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OrdCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OrdCustomerId with another Field
	 *	@param value
	 */
   public void setOrdCustomerId(Field source) {
      dcltbtrdord.setOrdCustomerId(source);
   }  
   
     /**
	 * 	Update OrdCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdCustomerId(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OrdCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "101" for isAccepted()
	 *	@return  Returns true if isAccepted() is "101"
	 */
   public boolean isAccepted() throws CFException {
      return work.isAccepted();
   }

	/**
	*  set values "101"
	*/
   	public void setAcceptedTrue()  throws CFException{  			
    	work.setAcceptedTrue();
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


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += dcltbtrdord.hashCode();
       return str.hashCode();
    }

    public GetSellSideOrderOutCtx clone() {
        GetSellSideOrderOutCtx cloneObj = new GetSellSideOrderOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        return cloneObj;
    }

    }

    public GetSellSideOrderOutCtx getGetSellSideOrderOutCtx() {
            return new GetSellSideOrderOutCtx();
    }
     public class ValidateCustomersInCtx implements Cloneable {
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();
     CustomerIo customerIo = Trdpb000Ctx.this.getCustomerIo();

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
	 *	Returns the value of ordCustomerId
	 *	@return ordCustomerId
	 */
   public char[] getOrdCustomerId() throws CFException  {              
   		return dcltbtrdord.getOrdCustomerId();
   }

  
	/**
	*  set variable ordCustomerId
	*  @param value
	**/
   public void setOrdCustomerId(char[] value) throws CFException {
      dcltbtrdord.setOrdCustomerId(value);
   } 

     /**
	 * 	Update OrdCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdCustomerId(char[] source, int sourceIndex) throws CFException {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex);
   	
   }
   
   public void setOrdCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OrdCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OrdCustomerId with another Field
	 *	@param value
	 */
   public void setOrdCustomerId(Field source) {
      dcltbtrdord.setOrdCustomerId(source);
   }  
   
     /**
	 * 	Update OrdCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdCustomerId(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OrdCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdord.setOrdCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of customerErrorMsg
	 *	@return customerErrorMsg
	 */
   public char[] getCustomerErrorMsg() throws CFException  {              
   		return customerIo.getCustomerErrorMsg();
   }

  
	/**
	*  set variable customerErrorMsg
	*  @param value
	**/
   public void setCustomerErrorMsg(char[] value) throws CFException {
      customerIo.setCustomerErrorMsg(value);
   } 

     /**
	 * 	Update CustomerErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCustomerErrorMsg(char[] source, int sourceIndex) throws CFException {
      customerIo.setCustomerErrorMsg(source, sourceIndex);
   	
   }
   
   public void setCustomerErrorMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      customerIo.setCustomerErrorMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CustomerErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCustomerErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      customerIo.setCustomerErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CustomerErrorMsg with another Field
	 *	@param value
	 */
   public void setCustomerErrorMsg(Field source) {
      customerIo.setCustomerErrorMsg(source);
   }  
   
     /**
	 * 	Update CustomerErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCustomerErrorMsg(Field source, int sourceIndex,int sourceLen) {
      customerIo.setCustomerErrorMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CustomerErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCustomerErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      customerIo.setCustomerErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of customerCheck
	 *	@return customerCheck
	 */
   public char[] getCustomerCheck() throws CFException  {              
   		return work.getCustomerCheck();
   }

  
	/**
	*  set variable customerCheck
	*  @param value
	**/
   public void setCustomerCheck(char[] value) throws CFException {
      work.setCustomerCheck(value);
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
	 *	Returns the value of customerIo
	 *	@return customerIo
	 */   
	 public CustomerIo getCustomerIo() {
   	return customerIo;
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


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }

        public ValidateCustomersOutCtx getValidateCustomersOutCtx() {
            return new ValidateCustomersOutCtx();
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
        str += dcltbtrdord.hashCode();
        str += customerIo.hashCode();
       return str.hashCode();
    }

    public ValidateCustomersInCtx clone() {
        ValidateCustomersInCtx cloneObj = new ValidateCustomersInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        cloneObj.customerIo = new CustomerIo();
        cloneObj.customerIo.set(customerIo.getClonedField());
        return cloneObj;
    }

    }

    public ValidateCustomersInCtx getValidateCustomersInCtx() {
            return new ValidateCustomersInCtx();
    }
     public class ValidateCustomersOutCtx implements Cloneable {
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();
     CustomerIo customerIo = Trdpb000Ctx.this.getCustomerIo();

	/**
	 *	Test condition "A" for isCustomerActive88()
	 *	@return  Returns true if isCustomerActive88() is "A"
	 */
   public boolean isCustomerActive88() throws CFException {
      return customerIo.isCustomerActive88();
   }

	/**
	*  set values "A"
	*/
   	public void setCustomerActive88True()  throws CFException{  			
    	customerIo.setCustomerActive88True();
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
	 *	Test condition "S" for isCustomerException88()
	 *	@return  Returns true if isCustomerException88() is "S"
	 */
   public boolean isCustomerException88() throws CFException {
      return customerIo.isCustomerException88();
   }

	/**
	*  set values "S"
	*/
   	public void setCustomerException88True()  throws CFException{  			
    	customerIo.setCustomerException88True();
   	}
	/**
	 *	Test condition "101" for isAccepted()
	 *	@return  Returns true if isAccepted() is "101"
	 */
   public boolean isAccepted() throws CFException {
      return work.isAccepted();
   }

	/**
	*  set values "101"
	*/
   	public void setAcceptedTrue()  throws CFException{  			
    	work.setAcceptedTrue();
   	}
	/**
	 *	Test condition "302" for isOverdueSellerIdInvld()
	 *	@return  Returns true if isOverdueSellerIdInvld() is "302"
	 */
   public boolean isOverdueSellerIdInvld() throws CFException {
      return work.isOverdueSellerIdInvld();
   }

	/**
	*  set values "302"
	*/
   	public void setOverdueSellerIdInvldTrue()  throws CFException{  			
    	work.setOverdueSellerIdInvldTrue();
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
	 *	Returns the value of customerErrorMsg
	 *	@return customerErrorMsg
	 */
   public char[] getCustomerErrorMsg() throws CFException  {              
   		return customerIo.getCustomerErrorMsg();
   }

  
	/**
	*  set variable customerErrorMsg
	*  @param value
	**/
   public void setCustomerErrorMsg(char[] value) throws CFException {
      customerIo.setCustomerErrorMsg(value);
   } 

     /**
	 * 	Update CustomerErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCustomerErrorMsg(char[] source, int sourceIndex) throws CFException {
      customerIo.setCustomerErrorMsg(source, sourceIndex);
   	
   }
   
   public void setCustomerErrorMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      customerIo.setCustomerErrorMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CustomerErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCustomerErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      customerIo.setCustomerErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CustomerErrorMsg with another Field
	 *	@param value
	 */
   public void setCustomerErrorMsg(Field source) {
      customerIo.setCustomerErrorMsg(source);
   }  
   
     /**
	 * 	Update CustomerErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCustomerErrorMsg(Field source, int sourceIndex,int sourceLen) {
      customerIo.setCustomerErrorMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CustomerErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCustomerErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      customerIo.setCustomerErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of customerId
	 *	@return customerId
	 */
   public char[] getCustomerId() throws CFException  {              
   		return customerIo.getCustomerId();
   }

  
	/**
	*  set variable customerId
	*  @param value
	**/
   public void setCustomerId(char[] value) throws CFException {
      customerIo.setCustomerId(value);
   } 

     /**
	 * 	Update CustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCustomerId(char[] source, int sourceIndex) throws CFException {
      customerIo.setCustomerId(source, sourceIndex);
   	
   }
   
   public void setCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      customerIo.setCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      customerIo.setCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CustomerId with another Field
	 *	@param value
	 */
   public void setCustomerId(Field source) {
      customerIo.setCustomerId(source);
   }  
   
     /**
	 * 	Update CustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCustomerId(Field source, int sourceIndex,int sourceLen) {
      customerIo.setCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      customerIo.setCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of customerIo
	 *	@return customerIo
	 */   
	 public CustomerIo getCustomerIo() {
   	return customerIo;
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
	 *	Test condition "I" for isCustomerInactive88()
	 *	@return  Returns true if isCustomerInactive88() is "I"
	 */
   public boolean isCustomerInactive88() throws CFException {
      return customerIo.isCustomerInactive88();
   }

	/**
	*  set values "I"
	*/
   	public void setCustomerInactive88True()  throws CFException{  			
    	customerIo.setCustomerInactive88True();
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
	 *	Test condition "N" for isCustomerNotFound88()
	 *	@return  Returns true if isCustomerNotFound88() is "N"
	 */
   public boolean isCustomerNotFound88() throws CFException {
      return customerIo.isCustomerNotFound88();
   }

	/**
	*  set values "N"
	*/
   	public void setCustomerNotFound88True()  throws CFException{  			
    	customerIo.setCustomerNotFound88True();
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
	 *	Test condition "301" for isOverdueBuyerIdInvld()
	 *	@return  Returns true if isOverdueBuyerIdInvld() is "301"
	 */
   public boolean isOverdueBuyerIdInvld() throws CFException {
      return work.isOverdueBuyerIdInvld();
   }

	/**
	*  set values "301"
	*/
   	public void setOverdueBuyerIdInvldTrue()  throws CFException{  			
    	work.setOverdueBuyerIdInvldTrue();
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


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
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
        str += dcltbtrdord.hashCode();
        str += customerIo.hashCode();
       return str.hashCode();
    }

    public ValidateCustomersOutCtx clone() {
        ValidateCustomersOutCtx cloneObj = new ValidateCustomersOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        cloneObj.customerIo = new CustomerIo();
        cloneObj.customerIo.set(customerIo.getClonedField());
        return cloneObj;
    }

    }

    public ValidateCustomersOutCtx getValidateCustomersOutCtx() {
            return new ValidateCustomersOutCtx();
    }
     public class ValidateSecurityInCtx implements Cloneable {
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();
     SecurityIo securityIo = Trdpb000Ctx.this.getSecurityIo();

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
	 *	Returns the value of securityCheck
	 *	@return securityCheck
	 */
   public char[] getSecurityCheck() throws CFException  {              
   		return work.getSecurityCheck();
   }

  
	/**
	*  set variable securityCheck
	*  @param value
	**/
   public void setSecurityCheck(char[] value) throws CFException {
      work.setSecurityCheck(value);
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
	 *	Returns the value of securityErrorMsg
	 *	@return securityErrorMsg
	 */
   public char[] getSecurityErrorMsg() throws CFException  {              
   		return securityIo.getSecurityErrorMsg();
   }

  
	/**
	*  set variable securityErrorMsg
	*  @param value
	**/
   public void setSecurityErrorMsg(char[] value) throws CFException {
      securityIo.setSecurityErrorMsg(value);
   } 

     /**
	 * 	Update SecurityErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecurityErrorMsg(char[] source, int sourceIndex) throws CFException {
      securityIo.setSecurityErrorMsg(source, sourceIndex);
   	
   }
   
   public void setSecurityErrorMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityIo.setSecurityErrorMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SecurityErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecurityErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityIo.setSecurityErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SecurityErrorMsg with another Field
	 *	@param value
	 */
   public void setSecurityErrorMsg(Field source) {
      securityIo.setSecurityErrorMsg(source);
   }  
   
     /**
	 * 	Update SecurityErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecurityErrorMsg(Field source, int sourceIndex,int sourceLen) {
      securityIo.setSecurityErrorMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SecurityErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecurityErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityIo.setSecurityErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of securityIo
	 *	@return securityIo
	 */   
	 public SecurityIo getSecurityIo() {
   	return securityIo;
   }



        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }

        public ValidateSecurityOutCtx getValidateSecurityOutCtx() {
            return new ValidateSecurityOutCtx();
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
        str += dcltbtrdord.hashCode();
        str += securityIo.hashCode();
       return str.hashCode();
    }

    public ValidateSecurityInCtx clone() {
        ValidateSecurityInCtx cloneObj = new ValidateSecurityInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        cloneObj.securityIo = new SecurityIo();
        cloneObj.securityIo.set(securityIo.getClonedField());
        return cloneObj;
    }

    }

    public ValidateSecurityInCtx getValidateSecurityInCtx() {
            return new ValidateSecurityInCtx();
    }
     public class ValidateSecurityOutCtx implements Cloneable {
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();
     SecurityIo securityIo = Trdpb000Ctx.this.getSecurityIo();

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
	 *	Test condition "303" for isOverdueSecurityInvld()
	 *	@return  Returns true if isOverdueSecurityInvld() is "303"
	 */
   public boolean isOverdueSecurityInvld() throws CFException {
      return work.isOverdueSecurityInvld();
   }

	/**
	*  set values "303"
	*/
   	public void setOverdueSecurityInvldTrue()  throws CFException{  			
    	work.setOverdueSecurityInvldTrue();
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
	 *	Returns the value of figi
	 *	@return figi
	 */
   public char[] getFigi() throws CFException  {              
   		return securityIo.getFigi();
   }

  
	/**
	*  set variable figi
	*  @param value
	**/
   public void setFigi(char[] value) throws CFException {
      securityIo.setFigi(value);
   } 

     /**
	 * 	Update Figi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFigi(char[] source, int sourceIndex) throws CFException {
      securityIo.setFigi(source, sourceIndex);
   	
   }
   
   public void setFigi(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityIo.setFigi(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Figi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityIo.setFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Figi with another Field
	 *	@param value
	 */
   public void setFigi(Field source) {
      securityIo.setFigi(source);
   }  
   
     /**
	 * 	Update Figi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFigi(Field source, int sourceIndex,int sourceLen) {
      securityIo.setFigi(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Figi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityIo.setFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isSecurityNotFound88()
	 *	@return  Returns true if isSecurityNotFound88() is "N"
	 */
   public boolean isSecurityNotFound88() throws CFException {
      return securityIo.isSecurityNotFound88();
   }

	/**
	*  set values "N"
	*/
   	public void setSecurityNotFound88True()  throws CFException{  			
    	securityIo.setSecurityNotFound88True();
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
	 *	Test condition "S" for isSecurityException88()
	 *	@return  Returns true if isSecurityException88() is "S"
	 */
   public boolean isSecurityException88() throws CFException {
      return securityIo.isSecurityException88();
   }

	/**
	*  set values "S"
	*/
   	public void setSecurityException88True()  throws CFException{  			
    	securityIo.setSecurityException88True();
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
	 *	Test condition "I" for isSecurityInactive88()
	 *	@return  Returns true if isSecurityInactive88() is "I"
	 */
   public boolean isSecurityInactive88() throws CFException {
      return securityIo.isSecurityInactive88();
   }

	/**
	*  set values "I"
	*/
   	public void setSecurityInactive88True()  throws CFException{  			
    	securityIo.setSecurityInactive88True();
   	}
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
	 *	Returns the value of securityErrorMsg
	 *	@return securityErrorMsg
	 */
   public char[] getSecurityErrorMsg() throws CFException  {              
   		return securityIo.getSecurityErrorMsg();
   }

  
	/**
	*  set variable securityErrorMsg
	*  @param value
	**/
   public void setSecurityErrorMsg(char[] value) throws CFException {
      securityIo.setSecurityErrorMsg(value);
   } 

     /**
	 * 	Update SecurityErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecurityErrorMsg(char[] source, int sourceIndex) throws CFException {
      securityIo.setSecurityErrorMsg(source, sourceIndex);
   	
   }
   
   public void setSecurityErrorMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityIo.setSecurityErrorMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SecurityErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecurityErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityIo.setSecurityErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SecurityErrorMsg with another Field
	 *	@param value
	 */
   public void setSecurityErrorMsg(Field source) {
      securityIo.setSecurityErrorMsg(source);
   }  
   
     /**
	 * 	Update SecurityErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecurityErrorMsg(Field source, int sourceIndex,int sourceLen) {
      securityIo.setSecurityErrorMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SecurityErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecurityErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityIo.setSecurityErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of securityIo
	 *	@return securityIo
	 */   
	 public SecurityIo getSecurityIo() {
   	return securityIo;
   }


	/**
	 *	Test condition "A" for isSecurityActive88()
	 *	@return  Returns true if isSecurityActive88() is "A"
	 */
   public boolean isSecurityActive88() throws CFException {
      return securityIo.isSecurityActive88();
   }

	/**
	*  set values "A"
	*/
   	public void setSecurityActive88True()  throws CFException{  			
    	securityIo.setSecurityActive88True();
   	}

        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
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
        str += dcltbtrdord.hashCode();
        str += securityIo.hashCode();
       return str.hashCode();
    }

    public ValidateSecurityOutCtx clone() {
        ValidateSecurityOutCtx cloneObj = new ValidateSecurityOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        cloneObj.securityIo = new SecurityIo();
        cloneObj.securityIo.set(securityIo.getClonedField());
        return cloneObj;
    }

    }

    public ValidateSecurityOutCtx getValidateSecurityOutCtx() {
            return new ValidateSecurityOutCtx();
    }
     public class BuyerSecAccountInCtx implements Cloneable {
     Dcltbtrdsac dcltbtrdsac = Trdpb000Ctx.this.getDcltbtrdsac();
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();

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
	 *	Returns the value of dcltbtrdsac
	 *	@return dcltbtrdsac
	 */   
	 public Dcltbtrdsac getDcltbtrdsac() {
   	return dcltbtrdsac;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Returns the value of sacNumber
	 *	@return sacNumber
	 */
	public int getSacNumber() throws CFException {        
   		return dcltbtrdsac.getSacNumber();
	}
	
	/**
	 * 	Update SacNumber with the passed value
	 *	@param number
	 */
	public void setSacNumber(int number)  throws CFException{
		dcltbtrdsac.setSacNumber(number);
	}


	public void setSacNumber(long number)  throws CFException{
		dcltbtrdsac.setSacNumber((int)number);
	}


	/**
	 *	Returns the value of sacStatus
	 *	@return sacStatus
	 */
   public char[] getSacStatus() throws CFException  {              
   		return dcltbtrdsac.getSacStatus();
   }

  
	/**
	*  set variable sacStatus
	*  @param value
	**/
   public void setSacStatus(char[] value) throws CFException {
      dcltbtrdsac.setSacStatus(value);
   } 

     /**
	 * 	Update SacStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSacStatus(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsac.setSacStatus(source, sourceIndex);
   	
   }
   
   public void setSacStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsac.setSacStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SacStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSacStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsac.setSacStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SacStatus with another Field
	 *	@param value
	 */
   public void setSacStatus(Field source) {
      dcltbtrdsac.setSacStatus(source);
   }  
   
     /**
	 * 	Update SacStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSacStatus(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsac.setSacStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SacStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSacStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsac.setSacStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
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



        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }

        public BuyerSecAccountOutCtx getBuyerSecAccountOutCtx() {
            return new BuyerSecAccountOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dcltbtrdsac.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += dcltbtrdord.hashCode();
       return str.hashCode();
    }

    public BuyerSecAccountInCtx clone() {
        BuyerSecAccountInCtx cloneObj = new BuyerSecAccountInCtx();
        cloneObj.dcltbtrdsac = new Dcltbtrdsac();
        cloneObj.dcltbtrdsac.set(dcltbtrdsac.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        return cloneObj;
    }

    }

    public BuyerSecAccountInCtx getBuyerSecAccountInCtx() {
            return new BuyerSecAccountInCtx();
    }
     public class BuyerSecAccountOutCtx implements Cloneable {
     Dcltbtrdsac dcltbtrdsac = Trdpb000Ctx.this.getDcltbtrdsac();
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();

	/**
	 *	Returns the value of dcltbtrdsac
	 *	@return dcltbtrdsac
	 */   
	 public Dcltbtrdsac getDcltbtrdsac() {
   	return dcltbtrdsac;
   }


	/**
	 *	Returns the value of trdBuyerSecAccNum
	 *	@return trdBuyerSecAccNum
	 */
	public int getTrdBuyerSecAccNum() throws CFException {        
   		return trdOrderPair.getTrdBuyerSecAccNum();
	}
	
	/**
	 * 	Update TrdBuyerSecAccNum with the passed value
	 *	@param number
	 */
	public void setTrdBuyerSecAccNum(int number)  throws CFException{
		trdOrderPair.setTrdBuyerSecAccNum(number);
	}


	public void setTrdBuyerSecAccNum(long number)  throws CFException{
		trdOrderPair.setTrdBuyerSecAccNum((int)number);
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
	 *	Returns the value of sacCustomerId
	 *	@return sacCustomerId
	 */
   public char[] getSacCustomerId() throws CFException  {              
   		return dcltbtrdsac.getSacCustomerId();
   }

  
	/**
	*  set variable sacCustomerId
	*  @param value
	**/
   public void setSacCustomerId(char[] value) throws CFException {
      dcltbtrdsac.setSacCustomerId(value);
   } 

     /**
	 * 	Update SacCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSacCustomerId(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsac.setSacCustomerId(source, sourceIndex);
   	
   }
   
   public void setSacCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsac.setSacCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SacCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSacCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsac.setSacCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SacCustomerId with another Field
	 *	@param value
	 */
   public void setSacCustomerId(Field source) {
      dcltbtrdsac.setSacCustomerId(source);
   }  
   
     /**
	 * 	Update SacCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSacCustomerId(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsac.setSacCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SacCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSacCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsac.setSacCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of sacNumber
	 *	@return sacNumber
	 */
	public int getSacNumber() throws CFException {        
   		return dcltbtrdsac.getSacNumber();
	}
	
	/**
	 * 	Update SacNumber with the passed value
	 *	@param number
	 */
	public void setSacNumber(int number)  throws CFException{
		dcltbtrdsac.setSacNumber(number);
	}


	public void setSacNumber(long number)  throws CFException{
		dcltbtrdsac.setSacNumber((int)number);
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
	 *	Returns the value of accDisp
	 *	@return accDisp
	 */
   public char[] getAccDisp() throws CFException  {              
   		return work.getAccDisp();
   }

  
	/**
	*  set variable accDisp
	*  @param value
	**/
   public void setAccDisp(char[] value) throws CFException {
      work.setAccDisp(value);
   } 

     /**
	 * 	Update AccDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAccDisp(char[] source, int sourceIndex) throws CFException {
      work.setAccDisp(source, sourceIndex);
   	
   }
   
   public void setAccDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setAccDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AccDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAccDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAccDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AccDisp with another Field
	 *	@param value
	 */
   public void setAccDisp(Field source) {
      work.setAccDisp(source);
   }  
   
     /**
	 * 	Update AccDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAccDisp(Field source, int sourceIndex,int sourceLen) {
      work.setAccDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AccDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAccDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAccDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Test condition "304" for isOverdueBuyerAcInvld()
	 *	@return  Returns true if isOverdueBuyerAcInvld() is "304"
	 */
   public boolean isOverdueBuyerAcInvld() throws CFException {
      return work.isOverdueBuyerAcInvld();
   }

	/**
	*  set values "304"
	*/
   	public void setOverdueBuyerAcInvldTrue()  throws CFException{  			
    	work.setOverdueBuyerAcInvldTrue();
   	}
	/**
	 *	Returns the value of sacCurrency
	 *	@return sacCurrency
	 */
   public char[] getSacCurrency() throws CFException  {              
   		return dcltbtrdsac.getSacCurrency();
   }

  
	/**
	*  set variable sacCurrency
	*  @param value
	**/
   public void setSacCurrency(char[] value) throws CFException {
      dcltbtrdsac.setSacCurrency(value);
   } 

     /**
	 * 	Update SacCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSacCurrency(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsac.setSacCurrency(source, sourceIndex);
   	
   }
   
   public void setSacCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsac.setSacCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SacCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSacCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsac.setSacCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SacCurrency with another Field
	 *	@param value
	 */
   public void setSacCurrency(Field source) {
      dcltbtrdsac.setSacCurrency(source);
   }  
   
     /**
	 * 	Update SacCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSacCurrency(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsac.setSacCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SacCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSacCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsac.setSacCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

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


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dcltbtrdsac.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += dcltbtrdord.hashCode();
       return str.hashCode();
    }

    public BuyerSecAccountOutCtx clone() {
        BuyerSecAccountOutCtx cloneObj = new BuyerSecAccountOutCtx();
        cloneObj.dcltbtrdsac = new Dcltbtrdsac();
        cloneObj.dcltbtrdsac.set(dcltbtrdsac.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        return cloneObj;
    }

    }

    public BuyerSecAccountOutCtx getBuyerSecAccountOutCtx() {
            return new BuyerSecAccountOutCtx();
    }
     public class SellerSecAccountInCtx implements Cloneable {
     Dcltbtrdsac dcltbtrdsac = Trdpb000Ctx.this.getDcltbtrdsac();
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();

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
	 *	Returns the value of dcltbtrdsac
	 *	@return dcltbtrdsac
	 */   
	 public Dcltbtrdsac getDcltbtrdsac() {
   	return dcltbtrdsac;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Returns the value of sacNumber
	 *	@return sacNumber
	 */
	public int getSacNumber() throws CFException {        
   		return dcltbtrdsac.getSacNumber();
	}
	
	/**
	 * 	Update SacNumber with the passed value
	 *	@param number
	 */
	public void setSacNumber(int number)  throws CFException{
		dcltbtrdsac.setSacNumber(number);
	}


	public void setSacNumber(long number)  throws CFException{
		dcltbtrdsac.setSacNumber((int)number);
	}


	/**
	 *	Returns the value of sacStatus
	 *	@return sacStatus
	 */
   public char[] getSacStatus() throws CFException  {              
   		return dcltbtrdsac.getSacStatus();
   }

  
	/**
	*  set variable sacStatus
	*  @param value
	**/
   public void setSacStatus(char[] value) throws CFException {
      dcltbtrdsac.setSacStatus(value);
   } 

     /**
	 * 	Update SacStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSacStatus(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsac.setSacStatus(source, sourceIndex);
   	
   }
   
   public void setSacStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsac.setSacStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SacStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSacStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsac.setSacStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SacStatus with another Field
	 *	@param value
	 */
   public void setSacStatus(Field source) {
      dcltbtrdsac.setSacStatus(source);
   }  
   
     /**
	 * 	Update SacStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSacStatus(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsac.setSacStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SacStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSacStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsac.setSacStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
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


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }

        public SellerSecAccountOutCtx getSellerSecAccountOutCtx() {
            return new SellerSecAccountOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dcltbtrdsac.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += dcltbtrdord.hashCode();
       return str.hashCode();
    }

    public SellerSecAccountInCtx clone() {
        SellerSecAccountInCtx cloneObj = new SellerSecAccountInCtx();
        cloneObj.dcltbtrdsac = new Dcltbtrdsac();
        cloneObj.dcltbtrdsac.set(dcltbtrdsac.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        return cloneObj;
    }

    }

    public SellerSecAccountInCtx getSellerSecAccountInCtx() {
            return new SellerSecAccountInCtx();
    }
     public class SellerSecAccountOutCtx implements Cloneable {
     Dcltbtrdsac dcltbtrdsac = Trdpb000Ctx.this.getDcltbtrdsac();
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();

	/**
	 *	Returns the value of dcltbtrdsac
	 *	@return dcltbtrdsac
	 */   
	 public Dcltbtrdsac getDcltbtrdsac() {
   	return dcltbtrdsac;
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
	 *	Returns the value of sacCustomerId
	 *	@return sacCustomerId
	 */
   public char[] getSacCustomerId() throws CFException  {              
   		return dcltbtrdsac.getSacCustomerId();
   }

  
	/**
	*  set variable sacCustomerId
	*  @param value
	**/
   public void setSacCustomerId(char[] value) throws CFException {
      dcltbtrdsac.setSacCustomerId(value);
   } 

     /**
	 * 	Update SacCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSacCustomerId(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsac.setSacCustomerId(source, sourceIndex);
   	
   }
   
   public void setSacCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsac.setSacCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SacCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSacCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsac.setSacCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SacCustomerId with another Field
	 *	@param value
	 */
   public void setSacCustomerId(Field source) {
      dcltbtrdsac.setSacCustomerId(source);
   }  
   
     /**
	 * 	Update SacCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSacCustomerId(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsac.setSacCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SacCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSacCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsac.setSacCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "305" for isOverdueSellerAcInvld()
	 *	@return  Returns true if isOverdueSellerAcInvld() is "305"
	 */
   public boolean isOverdueSellerAcInvld() throws CFException {
      return work.isOverdueSellerAcInvld();
   }

	/**
	*  set values "305"
	*/
   	public void setOverdueSellerAcInvldTrue()  throws CFException{  			
    	work.setOverdueSellerAcInvldTrue();
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
	 *	Returns the value of sacNumber
	 *	@return sacNumber
	 */
	public int getSacNumber() throws CFException {        
   		return dcltbtrdsac.getSacNumber();
	}
	
	/**
	 * 	Update SacNumber with the passed value
	 *	@param number
	 */
	public void setSacNumber(int number)  throws CFException{
		dcltbtrdsac.setSacNumber(number);
	}


	public void setSacNumber(long number)  throws CFException{
		dcltbtrdsac.setSacNumber((int)number);
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
	 *	Returns the value of accDisp
	 *	@return accDisp
	 */
   public char[] getAccDisp() throws CFException  {              
   		return work.getAccDisp();
   }

  
	/**
	*  set variable accDisp
	*  @param value
	**/
   public void setAccDisp(char[] value) throws CFException {
      work.setAccDisp(value);
   } 

     /**
	 * 	Update AccDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAccDisp(char[] source, int sourceIndex) throws CFException {
      work.setAccDisp(source, sourceIndex);
   	
   }
   
   public void setAccDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setAccDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AccDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAccDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAccDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AccDisp with another Field
	 *	@param value
	 */
   public void setAccDisp(Field source) {
      work.setAccDisp(source);
   }  
   
     /**
	 * 	Update AccDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAccDisp(Field source, int sourceIndex,int sourceLen) {
      work.setAccDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AccDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAccDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAccDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of trdSellerSecAccNum
	 *	@return trdSellerSecAccNum
	 */
	public int getTrdSellerSecAccNum() throws CFException {        
   		return trdOrderPair.getTrdSellerSecAccNum();
	}
	
	/**
	 * 	Update TrdSellerSecAccNum with the passed value
	 *	@param number
	 */
	public void setTrdSellerSecAccNum(int number)  throws CFException{
		trdOrderPair.setTrdSellerSecAccNum(number);
	}


	public void setTrdSellerSecAccNum(long number)  throws CFException{
		trdOrderPair.setTrdSellerSecAccNum((int)number);
	}


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Returns the value of sacCurrency
	 *	@return sacCurrency
	 */
   public char[] getSacCurrency() throws CFException  {              
   		return dcltbtrdsac.getSacCurrency();
   }

  
	/**
	*  set variable sacCurrency
	*  @param value
	**/
   public void setSacCurrency(char[] value) throws CFException {
      dcltbtrdsac.setSacCurrency(value);
   } 

     /**
	 * 	Update SacCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSacCurrency(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsac.setSacCurrency(source, sourceIndex);
   	
   }
   
   public void setSacCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsac.setSacCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SacCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSacCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsac.setSacCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SacCurrency with another Field
	 *	@param value
	 */
   public void setSacCurrency(Field source) {
      dcltbtrdsac.setSacCurrency(source);
   }  
   
     /**
	 * 	Update SacCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSacCurrency(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsac.setSacCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SacCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSacCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsac.setSacCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

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


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dcltbtrdsac.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += dcltbtrdord.hashCode();
       return str.hashCode();
    }

    public SellerSecAccountOutCtx clone() {
        SellerSecAccountOutCtx cloneObj = new SellerSecAccountOutCtx();
        cloneObj.dcltbtrdsac = new Dcltbtrdsac();
        cloneObj.dcltbtrdsac.set(dcltbtrdsac.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        return cloneObj;
    }

    }

    public SellerSecAccountOutCtx getSellerSecAccountOutCtx() {
            return new SellerSecAccountOutCtx();
    }
     public class BuyerMoneyAccountInCtx implements Cloneable {
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdmac dcltbtrdmac = Trdpb000Ctx.this.getDcltbtrdmac();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();

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
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Returns the value of dcltbtrdmac
	 *	@return dcltbtrdmac
	 */   
	 public Dcltbtrdmac getDcltbtrdmac() {
   	return dcltbtrdmac;
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
	 *	Returns the value of macStatus
	 *	@return macStatus
	 */
   public char[] getMacStatus() throws CFException  {              
   		return dcltbtrdmac.getMacStatus();
   }

  
	/**
	*  set variable macStatus
	*  @param value
	**/
   public void setMacStatus(char[] value) throws CFException {
      dcltbtrdmac.setMacStatus(value);
   } 

     /**
	 * 	Update MacStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMacStatus(char[] source, int sourceIndex) throws CFException {
      dcltbtrdmac.setMacStatus(source, sourceIndex);
   	
   }
   
   public void setMacStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdmac.setMacStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MacStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMacStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdmac.setMacStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MacStatus with another Field
	 *	@param value
	 */
   public void setMacStatus(Field source) {
      dcltbtrdmac.setMacStatus(source);
   }  
   
     /**
	 * 	Update MacStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMacStatus(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdmac.setMacStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MacStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMacStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdmac.setMacStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
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



        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }

        public BuyerMoneyAccountOutCtx getBuyerMoneyAccountOutCtx() {
            return new BuyerMoneyAccountOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += dcltbtrdmac.hashCode();
        str += dcltbtrdord.hashCode();
       return str.hashCode();
    }

    public BuyerMoneyAccountInCtx clone() {
        BuyerMoneyAccountInCtx cloneObj = new BuyerMoneyAccountInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdmac = new Dcltbtrdmac();
        cloneObj.dcltbtrdmac.set(dcltbtrdmac.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        return cloneObj;
    }

    }

    public BuyerMoneyAccountInCtx getBuyerMoneyAccountInCtx() {
            return new BuyerMoneyAccountInCtx();
    }
     public class BuyerMoneyAccountOutCtx implements Cloneable {
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdmac dcltbtrdmac = Trdpb000Ctx.this.getDcltbtrdmac();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();

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


	/**
	 *	Returns the value of macCustomerId
	 *	@return macCustomerId
	 */
   public char[] getMacCustomerId() throws CFException  {              
   		return dcltbtrdmac.getMacCustomerId();
   }

  
	/**
	*  set variable macCustomerId
	*  @param value
	**/
   public void setMacCustomerId(char[] value) throws CFException {
      dcltbtrdmac.setMacCustomerId(value);
   } 

     /**
	 * 	Update MacCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMacCustomerId(char[] source, int sourceIndex) throws CFException {
      dcltbtrdmac.setMacCustomerId(source, sourceIndex);
   	
   }
   
   public void setMacCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdmac.setMacCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MacCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMacCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdmac.setMacCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MacCustomerId with another Field
	 *	@param value
	 */
   public void setMacCustomerId(Field source) {
      dcltbtrdmac.setMacCustomerId(source);
   }  
   
     /**
	 * 	Update MacCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMacCustomerId(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdmac.setMacCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MacCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMacCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdmac.setMacCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of accDisp
	 *	@return accDisp
	 */
   public char[] getAccDisp() throws CFException  {              
   		return work.getAccDisp();
   }

  
	/**
	*  set variable accDisp
	*  @param value
	**/
   public void setAccDisp(char[] value) throws CFException {
      work.setAccDisp(value);
   } 

     /**
	 * 	Update AccDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAccDisp(char[] source, int sourceIndex) throws CFException {
      work.setAccDisp(source, sourceIndex);
   	
   }
   
   public void setAccDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setAccDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AccDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAccDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAccDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AccDisp with another Field
	 *	@param value
	 */
   public void setAccDisp(Field source) {
      work.setAccDisp(source);
   }  
   
     /**
	 * 	Update AccDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAccDisp(Field source, int sourceIndex,int sourceLen) {
      work.setAccDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AccDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAccDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAccDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of dcltbtrdmac
	 *	@return dcltbtrdmac
	 */   
	 public Dcltbtrdmac getDcltbtrdmac() {
   	return dcltbtrdmac;
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
	 *	Test condition "304" for isOverdueBuyerAcInvld()
	 *	@return  Returns true if isOverdueBuyerAcInvld() is "304"
	 */
   public boolean isOverdueBuyerAcInvld() throws CFException {
      return work.isOverdueBuyerAcInvld();
   }

	/**
	*  set values "304"
	*/
   	public void setOverdueBuyerAcInvldTrue()  throws CFException{  			
    	work.setOverdueBuyerAcInvldTrue();
   	}
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


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += dcltbtrdmac.hashCode();
        str += dcltbtrdord.hashCode();
       return str.hashCode();
    }

    public BuyerMoneyAccountOutCtx clone() {
        BuyerMoneyAccountOutCtx cloneObj = new BuyerMoneyAccountOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdmac = new Dcltbtrdmac();
        cloneObj.dcltbtrdmac.set(dcltbtrdmac.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        return cloneObj;
    }

    }

    public BuyerMoneyAccountOutCtx getBuyerMoneyAccountOutCtx() {
            return new BuyerMoneyAccountOutCtx();
    }
     public class SellerMoneyAccountInCtx implements Cloneable {
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdmac dcltbtrdmac = Trdpb000Ctx.this.getDcltbtrdmac();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();

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
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Returns the value of dcltbtrdmac
	 *	@return dcltbtrdmac
	 */   
	 public Dcltbtrdmac getDcltbtrdmac() {
   	return dcltbtrdmac;
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
	 *	Returns the value of macStatus
	 *	@return macStatus
	 */
   public char[] getMacStatus() throws CFException  {              
   		return dcltbtrdmac.getMacStatus();
   }

  
	/**
	*  set variable macStatus
	*  @param value
	**/
   public void setMacStatus(char[] value) throws CFException {
      dcltbtrdmac.setMacStatus(value);
   } 

     /**
	 * 	Update MacStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMacStatus(char[] source, int sourceIndex) throws CFException {
      dcltbtrdmac.setMacStatus(source, sourceIndex);
   	
   }
   
   public void setMacStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdmac.setMacStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MacStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMacStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdmac.setMacStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MacStatus with another Field
	 *	@param value
	 */
   public void setMacStatus(Field source) {
      dcltbtrdmac.setMacStatus(source);
   }  
   
     /**
	 * 	Update MacStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMacStatus(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdmac.setMacStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MacStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMacStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdmac.setMacStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
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


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }

        public SellerMoneyAccountOutCtx getSellerMoneyAccountOutCtx() {
            return new SellerMoneyAccountOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += dcltbtrdmac.hashCode();
        str += dcltbtrdord.hashCode();
       return str.hashCode();
    }

    public SellerMoneyAccountInCtx clone() {
        SellerMoneyAccountInCtx cloneObj = new SellerMoneyAccountInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdmac = new Dcltbtrdmac();
        cloneObj.dcltbtrdmac.set(dcltbtrdmac.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        return cloneObj;
    }

    }

    public SellerMoneyAccountInCtx getSellerMoneyAccountInCtx() {
            return new SellerMoneyAccountInCtx();
    }
     public class SellerMoneyAccountOutCtx implements Cloneable {
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdmac dcltbtrdmac = Trdpb000Ctx.this.getDcltbtrdmac();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();

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
	 *	Test condition "305" for isOverdueSellerAcInvld()
	 *	@return  Returns true if isOverdueSellerAcInvld() is "305"
	 */
   public boolean isOverdueSellerAcInvld() throws CFException {
      return work.isOverdueSellerAcInvld();
   }

	/**
	*  set values "305"
	*/
   	public void setOverdueSellerAcInvldTrue()  throws CFException{  			
    	work.setOverdueSellerAcInvldTrue();
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


	/**
	 *	Returns the value of macCustomerId
	 *	@return macCustomerId
	 */
   public char[] getMacCustomerId() throws CFException  {              
   		return dcltbtrdmac.getMacCustomerId();
   }

  
	/**
	*  set variable macCustomerId
	*  @param value
	**/
   public void setMacCustomerId(char[] value) throws CFException {
      dcltbtrdmac.setMacCustomerId(value);
   } 

     /**
	 * 	Update MacCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMacCustomerId(char[] source, int sourceIndex) throws CFException {
      dcltbtrdmac.setMacCustomerId(source, sourceIndex);
   	
   }
   
   public void setMacCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdmac.setMacCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MacCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMacCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdmac.setMacCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MacCustomerId with another Field
	 *	@param value
	 */
   public void setMacCustomerId(Field source) {
      dcltbtrdmac.setMacCustomerId(source);
   }  
   
     /**
	 * 	Update MacCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMacCustomerId(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdmac.setMacCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MacCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMacCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdmac.setMacCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of accDisp
	 *	@return accDisp
	 */
   public char[] getAccDisp() throws CFException  {              
   		return work.getAccDisp();
   }

  
	/**
	*  set variable accDisp
	*  @param value
	**/
   public void setAccDisp(char[] value) throws CFException {
      work.setAccDisp(value);
   } 

     /**
	 * 	Update AccDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAccDisp(char[] source, int sourceIndex) throws CFException {
      work.setAccDisp(source, sourceIndex);
   	
   }
   
   public void setAccDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setAccDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AccDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAccDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAccDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AccDisp with another Field
	 *	@param value
	 */
   public void setAccDisp(Field source) {
      work.setAccDisp(source);
   }  
   
     /**
	 * 	Update AccDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAccDisp(Field source, int sourceIndex,int sourceLen) {
      work.setAccDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AccDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAccDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAccDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of dcltbtrdmac
	 *	@return dcltbtrdmac
	 */   
	 public Dcltbtrdmac getDcltbtrdmac() {
   	return dcltbtrdmac;
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


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += dcltbtrdmac.hashCode();
        str += dcltbtrdord.hashCode();
       return str.hashCode();
    }

    public SellerMoneyAccountOutCtx clone() {
        SellerMoneyAccountOutCtx cloneObj = new SellerMoneyAccountOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdmac = new Dcltbtrdmac();
        cloneObj.dcltbtrdmac.set(dcltbtrdmac.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        return cloneObj;
    }

    }

    public SellerMoneyAccountOutCtx getSellerMoneyAccountOutCtx() {
            return new SellerMoneyAccountOutCtx();
    }
     public class UpdateOrderMatchedInCtx implements Cloneable {
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();

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


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }

        public UpdateOrderMatchedOutCtx getUpdateOrderMatchedOutCtx() {
            return new UpdateOrderMatchedOutCtx();
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
        str += dcltbtrdord.hashCode();
       return str.hashCode();
    }

    public UpdateOrderMatchedInCtx clone() {
        UpdateOrderMatchedInCtx cloneObj = new UpdateOrderMatchedInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        return cloneObj;
    }

    }

    public UpdateOrderMatchedInCtx getUpdateOrderMatchedInCtx() {
            return new UpdateOrderMatchedInCtx();
    }
     public class UpdateOrderMatchedOutCtx implements Cloneable {
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();

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
	 *	Test condition "201" for isMatched()
	 *	@return  Returns true if isMatched() is "201"
	 */
   public boolean isMatched() throws CFException {
      return work.isMatched();
   }

	/**
	*  set values "201"
	*/
   	public void setMatchedTrue()  throws CFException{  			
    	work.setMatchedTrue();
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


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
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
        str += dcltbtrdord.hashCode();
       return str.hashCode();
    }

    public UpdateOrderMatchedOutCtx clone() {
        UpdateOrderMatchedOutCtx cloneObj = new UpdateOrderMatchedOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        return cloneObj;
    }

    }

    public UpdateOrderMatchedOutCtx getUpdateOrderMatchedOutCtx() {
            return new UpdateOrderMatchedOutCtx();
    }
     public class WriteToStlmtQueueInCtx implements Cloneable {
     SettlmentQueueTable settlmentQueueTable = Trdpb000Ctx.this.getSettlmentQueueTable();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();

	/**
	 *	Returns the value of trdOrderPair
	 *	@return trdOrderPair
	 */   
	 public TrdOrderPair getTrdOrderPair() {
   	return trdOrderPair;
   }


	/**
	 *	Returns the value of stqIndex
	 *	@return stqIndex
	 */
	public short getStqIndex() throws CFException {        
   		return settlmentQueueTable.getStqIndex();
	}
	
	/**
	 * 	Update StqIndex with the passed value
	 *	@param number
	 */
	public void setStqIndex(short number)  throws CFException{
		settlmentQueueTable.setStqIndex(number);
	}

	public void setStqIndex(int number)  throws CFException{
		settlmentQueueTable.setStqIndex((short)number);
	}

	public void setStqIndex(long number)  throws CFException{
		settlmentQueueTable.setStqIndex((short)number);
	}




        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }

        public WriteToStlmtQueueOutCtx getWriteToStlmtQueueOutCtx() {
            return new WriteToStlmtQueueOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += settlmentQueueTable.hashCode();
        str += trdOrderPair.hashCode();
       return str.hashCode();
    }

    public WriteToStlmtQueueInCtx clone() {
        WriteToStlmtQueueInCtx cloneObj = new WriteToStlmtQueueInCtx();
        cloneObj.settlmentQueueTable = new SettlmentQueueTable();
        cloneObj.settlmentQueueTable.set(settlmentQueueTable.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        return cloneObj;
    }

    }

    public WriteToStlmtQueueInCtx getWriteToStlmtQueueInCtx() {
            return new WriteToStlmtQueueInCtx();
    }
     public class WriteToStlmtQueueOutCtx implements Cloneable {
     SettlmentQueueTable settlmentQueueTable = Trdpb000Ctx.this.getSettlmentQueueTable();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();

	/**
	 *	Returns the value of trdOrderPair
	 *	@return trdOrderPair
	 */   
	 public TrdOrderPair getTrdOrderPair() {
   	return trdOrderPair;
   }


	/**
	 *	Returns the value of stqTrdpair
	 *	@return stqTrdpair
	 */
   public char[] getStqTrdpair(int index) throws CFException  {              
   		return settlmentQueueTable.getStqTrdpair(index);
   }

  
	/**
	*  set variable stqTrdpair
	*  @param value
	**/
   public void setStqTrdpair(int index,char[] value) throws CFException {
      settlmentQueueTable.setStqTrdpair((index),value);
   } 

	/**
	 *	Returns the value of stqIndex
	 *	@return stqIndex
	 */
	public short getStqIndex() throws CFException {        
   		return settlmentQueueTable.getStqIndex();
	}
	
	/**
	 * 	Update StqIndex with the passed value
	 *	@param number
	 */
	public void setStqIndex(short number)  throws CFException{
		settlmentQueueTable.setStqIndex(number);
	}

	public void setStqIndex(int number)  throws CFException{
		settlmentQueueTable.setStqIndex((short)number);
	}

	public void setStqIndex(long number)  throws CFException{
		settlmentQueueTable.setStqIndex((short)number);
	}




        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += settlmentQueueTable.hashCode();
        str += trdOrderPair.hashCode();
       return str.hashCode();
    }

    public WriteToStlmtQueueOutCtx clone() {
        WriteToStlmtQueueOutCtx cloneObj = new WriteToStlmtQueueOutCtx();
        cloneObj.settlmentQueueTable = new SettlmentQueueTable();
        cloneObj.settlmentQueueTable.set(settlmentQueueTable.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        return cloneObj;
    }

    }

    public WriteToStlmtQueueOutCtx getWriteToStlmtQueueOutCtx() {
            return new WriteToStlmtQueueOutCtx();
    }
     public class InsertToStqInCtx implements Cloneable {
     SettlmentQueueTable settlmentQueueTable = Trdpb000Ctx.this.getSettlmentQueueTable();
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Work work = Trdpb000Ctx.this.getWork();

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
	 *	Returns the value of settlmentQueueTable
	 *	@return settlmentQueueTable
	 */   
	 public SettlmentQueueTable getSettlmentQueueTable() {
   	return settlmentQueueTable;
   }


	/**
	 *	Returns the value of stqCurrency
	 *	@return stqCurrency
	 */
   public char[] getStqCurrency(int index) throws CFException  {              
   		return settlmentQueueTable.getStqCurrency(index);
   }

  
	/**
	*  set variable stqCurrency
	*  @param value
	**/
   public void setStqCurrency(int index,char[] value) throws CFException {
      settlmentQueueTable.setStqCurrency((index),value);
   } 

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Returns the value of stqTrdpair
	 *	@return stqTrdpair
	 */
   public char[] getStqTrdpair(int index) throws CFException  {              
   		return settlmentQueueTable.getStqTrdpair(index);
   }

  
	/**
	*  set variable stqTrdpair
	*  @param value
	**/
   public void setStqTrdpair(int index,char[] value) throws CFException {
      settlmentQueueTable.setStqTrdpair((index),value);
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
	 *	Returns the value of stqIndex
	 *	@return stqIndex
	 */
	public short getStqIndex() throws CFException {        
   		return settlmentQueueTable.getStqIndex();
	}
	
	/**
	 * 	Update StqIndex with the passed value
	 *	@param number
	 */
	public void setStqIndex(short number)  throws CFException{
		settlmentQueueTable.setStqIndex(number);
	}

	public void setStqIndex(int number)  throws CFException{
		settlmentQueueTable.setStqIndex((short)number);
	}

	public void setStqIndex(long number)  throws CFException{
		settlmentQueueTable.setStqIndex((short)number);
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


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }

        public InsertToStqOutCtx getInsertToStqOutCtx() {
            return new InsertToStqOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += settlmentQueueTable.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InsertToStqInCtx clone() {
        InsertToStqInCtx cloneObj = new InsertToStqInCtx();
        cloneObj.settlmentQueueTable = new SettlmentQueueTable();
        cloneObj.settlmentQueueTable.set(settlmentQueueTable.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InsertToStqInCtx getInsertToStqInCtx() {
            return new InsertToStqInCtx();
    }
     public class InsertToStqOutCtx implements Cloneable {
     SettlmentQueueTable settlmentQueueTable = Trdpb000Ctx.this.getSettlmentQueueTable();
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Work work = Trdpb000Ctx.this.getWork();

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

        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += settlmentQueueTable.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InsertToStqOutCtx clone() {
        InsertToStqOutCtx cloneObj = new InsertToStqOutCtx();
        cloneObj.settlmentQueueTable = new SettlmentQueueTable();
        cloneObj.settlmentQueueTable.set(settlmentQueueTable.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InsertToStqOutCtx getInsertToStqOutCtx() {
            return new InsertToStqOutCtx();
    }
     public class UpdateOrderInCtx implements Cloneable {
     Parm parm = Trdpb000Ctx.this.getParm();
     CustomerSummaryRec customerSummaryRec = Trdpb000Ctx.this.getCustomerSummaryRec();
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();

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
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Returns the value of currency01
	 *	@return currency01
	 */
   public char[] getCurrency01() throws CFException  {              
   		return parm.getCurrency01();
   }

  
	/**
	*  set variable currency01
	*  @param value
	**/
   public void setCurrency01(char[] value) throws CFException {
      parm.setCurrency01(value);
   } 

     /**
	 * 	Update Currency01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrency01(char[] source, int sourceIndex) throws CFException {
      parm.setCurrency01(source, sourceIndex);
   	
   }
   
   public void setCurrency01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parm.setCurrency01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currency01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrency01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCurrency01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currency01 with another Field
	 *	@param value
	 */
   public void setCurrency01(Field source) {
      parm.setCurrency01(source);
   }  
   
     /**
	 * 	Update Currency01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrency01(Field source, int sourceIndex,int sourceLen) {
      parm.setCurrency01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currency01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrency01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCurrency01(source, sourceIndex, sourceLen, targetIndex, targetLen);
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


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
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
        str += parm.hashCode();
        str += customerSummaryRec.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += dcltbtrdord.hashCode();
       return str.hashCode();
    }

    public UpdateOrderInCtx clone() {
        UpdateOrderInCtx cloneObj = new UpdateOrderInCtx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.customerSummaryRec = new CustomerSummaryRec();
        cloneObj.customerSummaryRec.set(customerSummaryRec.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        return cloneObj;
    }

    }

    public UpdateOrderInCtx getUpdateOrderInCtx() {
            return new UpdateOrderInCtx();
    }
     public class UpdateOrderOutCtx implements Cloneable {
     Parm parm = Trdpb000Ctx.this.getParm();
     CustomerSummaryRec customerSummaryRec = Trdpb000Ctx.this.getCustomerSummaryRec();
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdord dcltbtrdord = Trdpb000Ctx.this.getDcltbtrdord();

	/**
	 *	Returns the value of summaryCurrency
	 *	@return summaryCurrency
	 */
   public char[] getSummaryCurrency() throws CFException  {              
   		return customerSummaryRec.getSummaryCurrency();
   }

  
	/**
	*  set variable summaryCurrency
	*  @param value
	**/
   public void setSummaryCurrency(char[] value) throws CFException {
      customerSummaryRec.setSummaryCurrency(value);
   } 

     /**
	 * 	Update SummaryCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSummaryCurrency(char[] source, int sourceIndex) throws CFException {
      customerSummaryRec.setSummaryCurrency(source, sourceIndex);
   	
   }
   
   public void setSummaryCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      customerSummaryRec.setSummaryCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SummaryCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSummaryCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      customerSummaryRec.setSummaryCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SummaryCurrency with another Field
	 *	@param value
	 */
   public void setSummaryCurrency(Field source) {
      customerSummaryRec.setSummaryCurrency(source);
   }  
   
     /**
	 * 	Update SummaryCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSummaryCurrency(Field source, int sourceIndex,int sourceLen) {
      customerSummaryRec.setSummaryCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SummaryCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSummaryCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      customerSummaryRec.setSummaryCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of customerSummaryRec
	 *	@return customerSummaryRec
	 */   
	 public CustomerSummaryRec getCustomerSummaryRec() {
   	return customerSummaryRec;
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
	 *	Returns the value of currency01
	 *	@return currency01
	 */
   public char[] getCurrency01() throws CFException  {              
   		return parm.getCurrency01();
   }

  
	/**
	*  set variable currency01
	*  @param value
	**/
   public void setCurrency01(char[] value) throws CFException {
      parm.setCurrency01(value);
   } 

     /**
	 * 	Update Currency01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrency01(char[] source, int sourceIndex) throws CFException {
      parm.setCurrency01(source, sourceIndex);
   	
   }
   
   public void setCurrency01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parm.setCurrency01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currency01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrency01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCurrency01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currency01 with another Field
	 *	@param value
	 */
   public void setCurrency01(Field source) {
      parm.setCurrency01(source);
   }  
   
     /**
	 * 	Update Currency01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrency01(Field source, int sourceIndex,int sourceLen) {
      parm.setCurrency01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currency01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrency01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCurrency01(source, sourceIndex, sourceLen, targetIndex, targetLen);
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


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
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
        str += customerSummaryRec.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += dcltbtrdord.hashCode();
       return str.hashCode();
    }

    public UpdateOrderOutCtx clone() {
        UpdateOrderOutCtx cloneObj = new UpdateOrderOutCtx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.customerSummaryRec = new CustomerSummaryRec();
        cloneObj.customerSummaryRec.set(customerSummaryRec.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        return cloneObj;
    }

    }

    public UpdateOrderOutCtx getUpdateOrderOutCtx() {
            return new UpdateOrderOutCtx();
    }
     public class ReportExceptionInCtx implements Cloneable {
     ExceptionRecord exceptionRecord = Trdpb000Ctx.this.getExceptionRecord();
     ExceptionRecordLenGroup exceptionRecordLenGroup = Trdpb000Ctx.this.getExceptionRecordLenGroup();
     Work work = Trdpb000Ctx.this.getWork();

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

        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
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
        str += exceptionRecordLenGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReportExceptionInCtx clone() {
        ReportExceptionInCtx cloneObj = new ReportExceptionInCtx();
        cloneObj.exceptionRecord = new ExceptionRecord();
        cloneObj.exceptionRecord.set(exceptionRecord.getClonedField());
        cloneObj.exceptionRecordLenGroup = new ExceptionRecordLenGroup();
        cloneObj.exceptionRecordLenGroup.set(exceptionRecordLenGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReportExceptionInCtx getReportExceptionInCtx() {
            return new ReportExceptionInCtx();
    }
     public class ReportExceptionOutCtx implements Cloneable {
     ExceptionRecord exceptionRecord = Trdpb000Ctx.this.getExceptionRecord();
     ExceptionRecordLenGroup exceptionRecordLenGroup = Trdpb000Ctx.this.getExceptionRecordLenGroup();
     Work work = Trdpb000Ctx.this.getWork();

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
	 *	Returns the value of exceptionRecord
	 *	@return exceptionRecord
	 */   
	 public ExceptionRecord getExceptionRecord() {
   	return exceptionRecord;
   }


	/**
	 *	Returns the value of exceptionRecordLenGroup
	 *	@return exceptionRecordLenGroup
	 */   
	 public ExceptionRecordLenGroup getExceptionRecordLenGroup() {
   	return exceptionRecordLenGroup;
   }



        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
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
        str += exceptionRecordLenGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ReportExceptionOutCtx clone() {
        ReportExceptionOutCtx cloneObj = new ReportExceptionOutCtx();
        cloneObj.exceptionRecord = new ExceptionRecord();
        cloneObj.exceptionRecord.set(exceptionRecord.getClonedField());
        cloneObj.exceptionRecordLenGroup = new ExceptionRecordLenGroup();
        cloneObj.exceptionRecordLenGroup.set(exceptionRecordLenGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ReportExceptionOutCtx getReportExceptionOutCtx() {
            return new ReportExceptionOutCtx();
    }
     public class LogSummaryInCtx implements Cloneable {
     CustomerSummaryRec customerSummaryRec = Trdpb000Ctx.this.getCustomerSummaryRec();
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdmac dcltbtrdmac = Trdpb000Ctx.this.getDcltbtrdmac();
     Dcltbtrdsum dcltbtrdsum = Trdpb000Ctx.this.getDcltbtrdsum();

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
	 *	Returns the value of customerSummaryRec
	 *	@return customerSummaryRec
	 */   
	 public CustomerSummaryRec getCustomerSummaryRec() {
   	return customerSummaryRec;
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
	 *	Returns the value of dcltbtrdmac
	 *	@return dcltbtrdmac
	 */   
	 public Dcltbtrdmac getDcltbtrdmac() {
   	return dcltbtrdmac;
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
	 *	Returns the value of dcltbtrdsum
	 *	@return dcltbtrdsum
	 */   
	 public Dcltbtrdsum getDcltbtrdsum() {
   	return dcltbtrdsum;
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



        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
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
        str += customerSummaryRec.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += dcltbtrdmac.hashCode();
        str += dcltbtrdsum.hashCode();
       return str.hashCode();
    }

    public LogSummaryInCtx clone() {
        LogSummaryInCtx cloneObj = new LogSummaryInCtx();
        cloneObj.customerSummaryRec = new CustomerSummaryRec();
        cloneObj.customerSummaryRec.set(customerSummaryRec.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdmac = new Dcltbtrdmac();
        cloneObj.dcltbtrdmac.set(dcltbtrdmac.getClonedField());
        cloneObj.dcltbtrdsum = new Dcltbtrdsum();
        cloneObj.dcltbtrdsum.set(dcltbtrdsum.getClonedField());
        return cloneObj;
    }

    }

    public LogSummaryInCtx getLogSummaryInCtx() {
            return new LogSummaryInCtx();
    }
     public class LogSummaryOutCtx implements Cloneable {
     CustomerSummaryRec customerSummaryRec = Trdpb000Ctx.this.getCustomerSummaryRec();
     Sqlca sqlca = Trdpb000Ctx.this.getSqlca();
     Work work = Trdpb000Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb000Ctx.this.getTrdOrderPair();
     Dcltbtrdmac dcltbtrdmac = Trdpb000Ctx.this.getDcltbtrdmac();
     Dcltbtrdsum dcltbtrdsum = Trdpb000Ctx.this.getDcltbtrdsum();

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
	 *	Returns the value of customerSummaryRec
	 *	@return customerSummaryRec
	 */   
	 public CustomerSummaryRec getCustomerSummaryRec() {
   	return customerSummaryRec;
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

	/**
	 *	Returns the value of dcltbtrdmac
	 *	@return dcltbtrdmac
	 */   
	 public Dcltbtrdmac getDcltbtrdmac() {
   	return dcltbtrdmac;
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
	 *	Returns the value of dcltbtrdsum
	 *	@return dcltbtrdsum
	 */   
	 public Dcltbtrdsum getDcltbtrdsum() {
   	return dcltbtrdsum;
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


        public Trdpb000Ctx getTrdpb000Ctx() {
            return Trdpb000Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += customerSummaryRec.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += dcltbtrdmac.hashCode();
        str += dcltbtrdsum.hashCode();
       return str.hashCode();
    }

    public LogSummaryOutCtx clone() {
        LogSummaryOutCtx cloneObj = new LogSummaryOutCtx();
        cloneObj.customerSummaryRec = new CustomerSummaryRec();
        cloneObj.customerSummaryRec.set(customerSummaryRec.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdmac = new Dcltbtrdmac();
        cloneObj.dcltbtrdmac.set(dcltbtrdmac.getClonedField());
        cloneObj.dcltbtrdsum = new Dcltbtrdsum();
        cloneObj.dcltbtrdsum.set(dcltbtrdsum.getClonedField());
        return cloneObj;
    }

    }

    public LogSummaryOutCtx getLogSummaryOutCtx() {
            return new LogSummaryOutCtx();
    }
}
