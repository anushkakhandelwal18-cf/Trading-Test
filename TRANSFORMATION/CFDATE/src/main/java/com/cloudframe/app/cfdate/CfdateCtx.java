package com.cloudframe.app.cfdate;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.cfdate.dto.Work;


@Context
public class CfdateCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;


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


    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
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

    public CfdateCtx clone() {
        CfdateCtx cloneObj = new CfdateCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Work work = CfdateCtx.this.getWork();

	/**
	 *	Returns the value of integerOfDate
	 *	@return integerOfDate
	 */
	public int getIntegerOfDate() throws CFException {        
   		return work.getIntegerOfDate();
	}
	
	/**
	 * 	Update IntegerOfDate with the passed value
	 *	@param number
	 */
	public void setIntegerOfDate(int number)  throws CFException{
		work.setIntegerOfDate(number);
	}


	public void setIntegerOfDate(long number)  throws CFException{
		work.setIntegerOfDate((int)number);
	}


	/**
	 *	Returns the value of bkupDtIso
	 *	@return bkupDtIso
	 */
	public long getBkupDtIso() throws CFException {
   		return work.getBkupDtIso();
	}


	/**
	 *	Returns String value of bkupDtIso
	 *	@return bkupDtIso
	 */
	public char[]  getBkupDtIsoString() throws CFException {
	     return String.valueOf(work.getBkupDtIsoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bkupDtIsoIsNumeric()  throws CFException{
	    return work.bkupDtIsoIsNumeric();
	}

	/**
	 * 	Update BkupDtIso with the passed value
	 *	@param number
	 */
	public void setBkupDtIso(long number)  throws CFException{
		work.setBkupDtIso(number);
	}
	

	
	/**
	 * 	Update BkupDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setBkupDtIso(char[] value)  throws CFException {
		work.setBkupDtIso(value);
	}
	
	/**
	 * 	Update BkupDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBkupDtIsoString(char[] value)  throws CFException{
		work.setBkupDtIso(value);
	}	


        public CfdateCtx getCfdateCtx() {
            return CfdateCtx.this;
        }

        public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
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

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     Work work = CfdateCtx.this.getWork();

	/**
	 *	Returns the value of julianDate
	 *	@return julianDate
	 */
	public long getJulianDate() throws CFException {
   		return work.getJulianDate();
	}


	/**
	 *	Returns String value of julianDate
	 *	@return julianDate
	 */
	public char[]  getJulianDateString() throws CFException {
	     return String.valueOf(work.getJulianDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean julianDateIsNumeric()  throws CFException{
	    return work.julianDateIsNumeric();
	}

	/**
	 * 	Update JulianDate with the passed value
	 *	@param number
	 */
	public void setJulianDate(long number)  throws CFException{
		work.setJulianDate(number);
	}
	

	
	/**
	 * 	Update JulianDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setJulianDate(char[] value)  throws CFException {
		work.setJulianDate(value);
	}
	
	/**
	 * 	Update JulianDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJulianDateString(char[] value)  throws CFException{
		work.setJulianDate(value);
	}	

	/**
	 *	Returns the value of integerOfDate
	 *	@return integerOfDate
	 */
	public int getIntegerOfDate() throws CFException {        
   		return work.getIntegerOfDate();
	}
	
	/**
	 * 	Update IntegerOfDate with the passed value
	 *	@param number
	 */
	public void setIntegerOfDate(int number)  throws CFException{
		work.setIntegerOfDate(number);
	}


	public void setIntegerOfDate(long number)  throws CFException{
		work.setIntegerOfDate((int)number);
	}


	/**
	 *	Returns the value of bkupDtIso
	 *	@return bkupDtIso
	 */
	public long getBkupDtIso() throws CFException {
   		return work.getBkupDtIso();
	}


	/**
	 *	Returns String value of bkupDtIso
	 *	@return bkupDtIso
	 */
	public char[]  getBkupDtIsoString() throws CFException {
	     return String.valueOf(work.getBkupDtIsoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bkupDtIsoIsNumeric()  throws CFException{
	    return work.bkupDtIsoIsNumeric();
	}

	/**
	 * 	Update BkupDtIso with the passed value
	 *	@param number
	 */
	public void setBkupDtIso(long number)  throws CFException{
		work.setBkupDtIso(number);
	}
	

	
	/**
	 * 	Update BkupDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setBkupDtIso(char[] value)  throws CFException {
		work.setBkupDtIso(value);
	}
	
	/**
	 * 	Update BkupDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBkupDtIsoString(char[] value)  throws CFException{
		work.setBkupDtIso(value);
	}	


        public CfdateCtx getCfdateCtx() {
            return CfdateCtx.this;
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

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
}
