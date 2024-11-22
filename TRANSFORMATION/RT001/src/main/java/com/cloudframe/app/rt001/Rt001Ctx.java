package com.cloudframe.app.rt001;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.rt001.dto.Work;


@Context
public class Rt001Ctx implements ProgramContext, Cloneable {
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

    public Rt001Ctx clone() {
        Rt001Ctx cloneObj = new Rt001Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProgramBeginInCtx implements Cloneable {
     Work work = Rt001Ctx.this.getWork();

	/**
	 *	Returns the value of firstNumber
	 *	@return firstNumber
	 */
	public int getFirstNumber() throws CFException {
   		return work.getFirstNumber();
	}


	/**
	 *	Returns String value of firstNumber
	 *	@return firstNumber
	 */
	public char[]  getFirstNumberString() throws CFException {
	     return String.valueOf(work.getFirstNumberString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean firstNumberIsNumeric()  throws CFException{
	    return work.firstNumberIsNumeric();
	}

	/**
	 * 	Update FirstNumber with the passed value
	 *	@param number
	 */
	public void setFirstNumber(int number)  throws CFException{
		work.setFirstNumber(number);
	}
	

	public void setFirstNumber(long number)  throws CFException{
	    work.setFirstNumber(number);
	}
	
	
	/**
	 * 	Update FirstNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setFirstNumber(char[] value)  throws CFException {
		work.setFirstNumber(value);
	}
	
	/**
	 * 	Update FirstNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFirstNumberString(char[] value)  throws CFException{
		work.setFirstNumber(value);
	}	

	/**
	 *	Returns the value of secondNumber
	 *	@return secondNumber
	 */
	public int getSecondNumber() throws CFException {
   		return work.getSecondNumber();
	}


	/**
	 *	Returns String value of secondNumber
	 *	@return secondNumber
	 */
	public char[]  getSecondNumberString() throws CFException {
	     return String.valueOf(work.getSecondNumberString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean secondNumberIsNumeric()  throws CFException{
	    return work.secondNumberIsNumeric();
	}

	/**
	 * 	Update SecondNumber with the passed value
	 *	@param number
	 */
	public void setSecondNumber(int number)  throws CFException{
		work.setSecondNumber(number);
	}
	

	public void setSecondNumber(long number)  throws CFException{
	    work.setSecondNumber(number);
	}
	
	
	/**
	 * 	Update SecondNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setSecondNumber(char[] value)  throws CFException {
		work.setSecondNumber(value);
	}
	
	/**
	 * 	Update SecondNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSecondNumberString(char[] value)  throws CFException{
		work.setSecondNumber(value);
	}	


        public Rt001Ctx getRt001Ctx() {
            return Rt001Ctx.this;
        }

        public ProgramBeginOutCtx getProgramBeginOutCtx() {
            return new ProgramBeginOutCtx();
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

    public ProgramBeginInCtx clone() {
        ProgramBeginInCtx cloneObj = new ProgramBeginInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProgramBeginInCtx getProgramBeginInCtx() {
            return new ProgramBeginInCtx();
    }
     public class ProgramBeginOutCtx implements Cloneable {
     Work work = Rt001Ctx.this.getWork();

	/**
	 *	Returns the value of theResult
	 *	@return theResult
	 */
	public int getTheResult() throws CFException {
   		return work.getTheResult();
	}


	/**
	 *	Returns String value of theResult
	 *	@return theResult
	 */
	public char[]  getTheResultString() throws CFException {
	     return String.valueOf(work.getTheResultString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean theResultIsNumeric()  throws CFException{
	    return work.theResultIsNumeric();
	}

	/**
	 * 	Update TheResult with the passed value
	 *	@param number
	 */
	public void setTheResult(int number)  throws CFException{
		work.setTheResult(number);
	}
	

	public void setTheResult(long number)  throws CFException{
	    work.setTheResult(number);
	}
	
	
	/**
	 * 	Update TheResult with the passed value
	 *	@param value (String or char[])
	 */
	public void setTheResult(char[] value)  throws CFException {
		work.setTheResult(value);
	}
	
	/**
	 * 	Update TheResult with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTheResultString(char[] value)  throws CFException{
		work.setTheResult(value);
	}	


        public Rt001Ctx getRt001Ctx() {
            return Rt001Ctx.this;
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

    public ProgramBeginOutCtx clone() {
        ProgramBeginOutCtx cloneObj = new ProgramBeginOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProgramBeginOutCtx getProgramBeginOutCtx() {
            return new ProgramBeginOutCtx();
    }
}
