package com.cloudframe.app.dto.trdpb003;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

 
 
import java.sql.ResultSet;
 
 
 
 
 


@Context
public class Trdpb003Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Sqlca sqlca;
    ExceptionRecordLenGroup exceptionRecordLenGroup;
    Work work;
    TrdOrderPair trdOrderPair;
    ExceptionRecord exceptionRecord;
    Dcltbtrdmac dcltbtrdmac;


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


    ResultSet macBookingResultSet;

    public ResultSet getMacBookingResultSet() {
        return this.macBookingResultSet;
    }

    public void setMacBookingResultSet(ResultSet macBookingResultSet) {
        this.macBookingResultSet = macBookingResultSet;
    }

    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
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
    public ExceptionRecord getExceptionRecord() {
        if (exceptionRecord == null) {
            exceptionRecord = new ExceptionRecord();
        }

        return exceptionRecord;
    }

    public void setExceptionRecord(ExceptionRecord exceptionRecord) {
        this.exceptionRecord = exceptionRecord;
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


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
        str += exceptionRecordLenGroup.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += exceptionRecord.hashCode();
        str += dcltbtrdmac.hashCode();
       return str.hashCode();
    }

    public Trdpb003Ctx clone() {
        Trdpb003Ctx cloneObj = new Trdpb003Ctx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.exceptionRecordLenGroup = new ExceptionRecordLenGroup();
        cloneObj.exceptionRecordLenGroup.set(exceptionRecordLenGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.exceptionRecord = new ExceptionRecord();
        cloneObj.exceptionRecord.set(exceptionRecord.getClonedField());
        cloneObj.dcltbtrdmac = new Dcltbtrdmac();
        cloneObj.dcltbtrdmac.set(dcltbtrdmac.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     TrdOrderPair trdOrderPair = Trdpb003Ctx.this.getTrdOrderPair();


        public Trdpb003Ctx getTrdpb003Ctx() {
            return Trdpb003Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += trdOrderPair.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     Work work = Trdpb003Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb003Ctx.this.getTrdOrderPair();

	/**
	 *	Test condition "C" for isDebitBuyer()
	 *	@return  Returns true if isDebitBuyer() is "C"
	 */
   public boolean isDebitBuyer() throws CFException {
      return work.isDebitBuyer();
   }

	/**
	*  set values "C"
	*/
   	public void setDebitBuyerTrue()  throws CFException{  			
    	work.setDebitBuyerTrue();
   	}
	/**
	 *	Test condition "D" for isCreditSeller()
	 *	@return  Returns true if isCreditSeller() is "D"
	 */
   public boolean isCreditSeller() throws CFException {
      return work.isCreditSeller();
   }

	/**
	*  set values "D"
	*/
   	public void setCreditSellerTrue()  throws CFException{  			
    	work.setCreditSellerTrue();
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
	 *	Test condition "N" for isTrdMacBookingFailed()
	 *	@return  Returns true if isTrdMacBookingFailed() is "N"
	 */
   public boolean isTrdMacBookingFailed() throws CFException {
      return trdOrderPair.isTrdMacBookingFailed();
   }

	/**
	*  set values "N"
	*/
   	public void setTrdMacBookingFailedTrue()  throws CFException{  			
    	trdOrderPair.setTrdMacBookingFailedTrue();
   	}

        public Trdpb003Ctx getTrdpb003Ctx() {
            return Trdpb003Ctx.this;
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

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class MacBookingInCtx implements Cloneable {
     Sqlca sqlca = Trdpb003Ctx.this.getSqlca();
     Work work = Trdpb003Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb003Ctx.this.getTrdOrderPair();
     Dcltbtrdmac dcltbtrdmac = Trdpb003Ctx.this.getDcltbtrdmac();

	/**
	 *	Test condition "D" for isCreditSeller()
	 *	@return  Returns true if isCreditSeller() is "D"
	 */
   public boolean isCreditSeller() throws CFException {
      return work.isCreditSeller();
   }

	/**
	*  set values "D"
	*/
   	public void setCreditSellerTrue()  throws CFException{  			
    	work.setCreditSellerTrue();
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



        public Trdpb003Ctx getTrdpb003Ctx() {
            return Trdpb003Ctx.this;
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
        str += sqlca.hashCode();
        str += work.hashCode();
        str += trdOrderPair.hashCode();
        str += dcltbtrdmac.hashCode();
       return str.hashCode();
    }

    public MacBookingInCtx clone() {
        MacBookingInCtx cloneObj = new MacBookingInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdmac = new Dcltbtrdmac();
        cloneObj.dcltbtrdmac.set(dcltbtrdmac.getClonedField());
        return cloneObj;
    }

    }

    public MacBookingInCtx getMacBookingInCtx() {
            return new MacBookingInCtx();
    }
     public class MacBookingOutCtx implements Cloneable {
     Sqlca sqlca = Trdpb003Ctx.this.getSqlca();
     Work work = Trdpb003Ctx.this.getWork();
     TrdOrderPair trdOrderPair = Trdpb003Ctx.this.getTrdOrderPair();
     Dcltbtrdmac dcltbtrdmac = Trdpb003Ctx.this.getDcltbtrdmac();

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
	 *	Test condition "N" for isTrdMacBookingFailed()
	 *	@return  Returns true if isTrdMacBookingFailed() is "N"
	 */
   public boolean isTrdMacBookingFailed() throws CFException {
      return trdOrderPair.isTrdMacBookingFailed();
   }

	/**
	*  set values "N"
	*/
   	public void setTrdMacBookingFailedTrue()  throws CFException{  			
    	trdOrderPair.setTrdMacBookingFailedTrue();
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

        public Trdpb003Ctx getTrdpb003Ctx() {
            return Trdpb003Ctx.this;
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
       return str.hashCode();
    }

    public MacBookingOutCtx clone() {
        MacBookingOutCtx cloneObj = new MacBookingOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.trdOrderPair = new TrdOrderPair();
        cloneObj.trdOrderPair.set(trdOrderPair.getClonedField());
        cloneObj.dcltbtrdmac = new Dcltbtrdmac();
        cloneObj.dcltbtrdmac.set(dcltbtrdmac.getClonedField());
        return cloneObj;
    }

    }

    public MacBookingOutCtx getMacBookingOutCtx() {
            return new MacBookingOutCtx();
    }
     public class ReportExceptionInCtx implements Cloneable {
     Work work = Trdpb003Ctx.this.getWork();
     ExceptionRecordLenGroup exceptionRecordLenGroup = Trdpb003Ctx.this.getExceptionRecordLenGroup();
     ExceptionRecord exceptionRecord = Trdpb003Ctx.this.getExceptionRecord();

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

        public Trdpb003Ctx getTrdpb003Ctx() {
            return Trdpb003Ctx.this;
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
        str += work.hashCode();
        str += exceptionRecordLenGroup.hashCode();
        str += exceptionRecord.hashCode();
       return str.hashCode();
    }

    public ReportExceptionInCtx clone() {
        ReportExceptionInCtx cloneObj = new ReportExceptionInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.exceptionRecordLenGroup = new ExceptionRecordLenGroup();
        cloneObj.exceptionRecordLenGroup.set(exceptionRecordLenGroup.getClonedField());
        cloneObj.exceptionRecord = new ExceptionRecord();
        cloneObj.exceptionRecord.set(exceptionRecord.getClonedField());
        return cloneObj;
    }

    }

    public ReportExceptionInCtx getReportExceptionInCtx() {
            return new ReportExceptionInCtx();
    }
     public class ReportExceptionOutCtx implements Cloneable {
     ExceptionRecordLenGroup exceptionRecordLenGroup = Trdpb003Ctx.this.getExceptionRecordLenGroup();
     Work work = Trdpb003Ctx.this.getWork();
     ExceptionRecord exceptionRecord = Trdpb003Ctx.this.getExceptionRecord();

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
	 *	Returns the value of exceptionRecordLenGroup
	 *	@return exceptionRecordLenGroup
	 */   
	 public ExceptionRecordLenGroup getExceptionRecordLenGroup() {
   	return exceptionRecordLenGroup;
   }


	/**
	 *	Returns the value of exceptionRecord
	 *	@return exceptionRecord
	 */   
	 public ExceptionRecord getExceptionRecord() {
   	return exceptionRecord;
   }


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


        public Trdpb003Ctx getTrdpb003Ctx() {
            return Trdpb003Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += exceptionRecordLenGroup.hashCode();
        str += work.hashCode();
        str += exceptionRecord.hashCode();
       return str.hashCode();
    }

    public ReportExceptionOutCtx clone() {
        ReportExceptionOutCtx cloneObj = new ReportExceptionOutCtx();
        cloneObj.exceptionRecordLenGroup = new ExceptionRecordLenGroup();
        cloneObj.exceptionRecordLenGroup.set(exceptionRecordLenGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.exceptionRecord = new ExceptionRecord();
        cloneObj.exceptionRecord.set(exceptionRecord.getClonedField());
        return cloneObj;
    }

    }

    public ReportExceptionOutCtx getReportExceptionOutCtx() {
            return new ReportExceptionOutCtx();
    }
}
