package com.optum.uhg.app.dto.cf03secu;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

 
 
import com.cloudframe.app.cics.CICSSession;
 
 
 


@Context
public class Cf03secuCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    Dfhcommarea dfhcommarea;
    Sqlca sqlca;
    Dcltbdemsec dcltbdemsec;


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

    CICSSession cicsSession = new CICSSession();

    public CICSSession getCicsSession() {
        return this.cicsSession;
    }

    public void setCicsSession(CICSSession cicsSession) {
        this.cicsSession = cicsSession;
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
    public Dfhcommarea getDfhcommarea() {
        if (dfhcommarea == null) {
            dfhcommarea = new Dfhcommarea();
        }

        return dfhcommarea;
    }

    public void setDfhcommarea(Dfhcommarea dfhcommarea) {
        this.dfhcommarea = dfhcommarea;
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
    public Dcltbdemsec getDcltbdemsec() {
        if (dcltbdemsec == null) {
            dcltbdemsec = new Dcltbdemsec();
        }

        return dcltbdemsec;
    }

    public void setDcltbdemsec(Dcltbdemsec dcltbdemsec) {
        this.dcltbdemsec = dcltbdemsec;
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
        str += dfhcommarea.hashCode();
        str += sqlca.hashCode();
        str += dcltbdemsec.hashCode();
       return str.hashCode();
    }

    public Cf03secuCtx clone() {
        Cf03secuCtx cloneObj = new Cf03secuCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dcltbdemsec = new Dcltbdemsec();
        cloneObj.dcltbdemsec.set(dcltbdemsec.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Dfhcommarea dfhcommarea = Cf03secuCtx.this.getDfhcommarea();


        public Cf03secuCtx getCf03secuCtx() {
            return Cf03secuCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dfhcommarea.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainlineInCtx implements Cloneable {
     Work work = Cf03secuCtx.this.getWork();

	/**
	 *	Returns the value of counter
	 *	@return counter
	 */
	public int getCounter() throws CFException {
   		return work.getCounter();
	}


	/**
	 *	Returns String value of counter
	 *	@return counter
	 */
	public char[]  getCounterString() throws CFException {
	     return String.valueOf(work.getCounterString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean counterIsNumeric()  throws CFException{
	    return work.counterIsNumeric();
	}

	/**
	 * 	Update Counter with the passed value
	 *	@param number
	 */
	public void setCounter(int number)  throws CFException{
		work.setCounter(number);
	}
	

	public void setCounter(long number)  throws CFException{
	    work.setCounter(number);
	}
	
	
	/**
	 * 	Update Counter with the passed value
	 *	@param value (String or char[])
	 */
	public void setCounter(char[] value)  throws CFException {
		work.setCounter(value);
	}
	
	/**
	 * 	Update Counter with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCounterString(char[] value)  throws CFException{
		work.setCounter(value);
	}	


        public Cf03secuCtx getCf03secuCtx() {
            return Cf03secuCtx.this;
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
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     Work work = Cf03secuCtx.this.getWork();

	/**
	 *	Returns the value of counter
	 *	@return counter
	 */
	public int getCounter() throws CFException {
   		return work.getCounter();
	}


	/**
	 *	Returns String value of counter
	 *	@return counter
	 */
	public char[]  getCounterString() throws CFException {
	     return String.valueOf(work.getCounterString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean counterIsNumeric()  throws CFException{
	    return work.counterIsNumeric();
	}

	/**
	 * 	Update Counter with the passed value
	 *	@param number
	 */
	public void setCounter(int number)  throws CFException{
		work.setCounter(number);
	}
	

	public void setCounter(long number)  throws CFException{
	    work.setCounter(number);
	}
	
	
	/**
	 * 	Update Counter with the passed value
	 *	@param value (String or char[])
	 */
	public void setCounter(char[] value)  throws CFException {
		work.setCounter(value);
	}
	
	/**
	 * 	Update Counter with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCounterString(char[] value)  throws CFException{
		work.setCounter(value);
	}	


        public Cf03secuCtx getCf03secuCtx() {
            return Cf03secuCtx.this;
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

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class GetSecurityInCtx implements Cloneable {
     Work work = Cf03secuCtx.this.getWork();
     Dfhcommarea dfhcommarea = Cf03secuCtx.this.getDfhcommarea();
     Dcltbdemsec dcltbdemsec = Cf03secuCtx.this.getDcltbdemsec();
     Sqlca sqlca = Cf03secuCtx.this.getSqlca();

	/**
	 *	Returns the value of industry
	 *	@return industry
	 */
   public char[] getIndustry() throws CFException  {              
   		return dcltbdemsec.getIndustry();
   }

  
	/**
	*  set variable industry
	*  @param value
	**/
   public void setIndustry(char[] value) throws CFException {
      dcltbdemsec.setIndustry(value);
   } 

     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setIndustry(source, sourceIndex);
   	
   }
   
   public void setIndustry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setIndustry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry with another Field
	 *	@param value
	 */
   public void setIndustry(Field source) {
      dcltbdemsec.setIndustry(source);
   }  
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setIndustry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of intlkey
	 *	@return intlkey
	 */
   public char[] getIntlkey() throws CFException  {              
   		return dcltbdemsec.getIntlkey();
   }

  
	/**
	*  set variable intlkey
	*  @param value
	**/
   public void setIntlkey(char[] value) throws CFException {
      dcltbdemsec.setIntlkey(value);
   } 

     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setIntlkey(source, sourceIndex);
   	
   }
   
   public void setIntlkey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setIntlkey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey with another Field
	 *	@param value
	 */
   public void setIntlkey(Field source) {
      dcltbdemsec.setIntlkey(source);
   }  
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setIntlkey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry() throws CFException  {              
   		return dcltbdemsec.getCountry();
   }

  
	/**
	*  set variable country
	*  @param value
	**/
   public void setCountry(char[] value) throws CFException {
      dcltbdemsec.setCountry(value);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setCountry(source, sourceIndex);
   	
   }
   
   public void setCountry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setCountry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(Field source) {
      dcltbdemsec.setCountry(source);
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setCountry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sedol
	 *	@return sedol
	 */
   public char[] getSedol() throws CFException  {              
   		return dcltbdemsec.getSedol();
   }

  
	/**
	*  set variable sedol
	*  @param value
	**/
   public void setSedol(char[] value) throws CFException {
      dcltbdemsec.setSedol(value);
   } 

     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setSedol(source, sourceIndex);
   	
   }
   
   public void setSedol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setSedol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol with another Field
	 *	@param value
	 */
   public void setSedol(Field source) {
      dcltbdemsec.setSedol(source);
   }  
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setSedol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of dcltbdemsec
	 *	@return dcltbdemsec
	 */   
	 public Dcltbdemsec getDcltbdemsec() {
   	return dcltbdemsec;
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
	 *	Returns the value of isin01
	 *	@return isin01
	 */
   public char[] getIsin01() throws CFException  {              
   		return dfhcommarea.getIsin01();
   }

  
	/**
	*  set variable isin01
	*  @param value
	**/
   public void setIsin01(char[] value) throws CFException {
      dfhcommarea.setIsin01(value);
   } 

     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin01(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setIsin01(source, sourceIndex);
   	
   }
   
   public void setIsin01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setIsin01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin01 with another Field
	 *	@param value
	 */
   public void setIsin01(Field source) {
      dfhcommarea.setIsin01(source);
   }  
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin01(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setIsin01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight
	 *	@return sectorweight
	 */
   public char[] getSectorweight() throws CFException  {              
   		return dcltbdemsec.getSectorweight();
   }

  
	/**
	*  set variable sectorweight
	*  @param value
	**/
   public void setSectorweight(char[] value) throws CFException {
      dcltbdemsec.setSectorweight(value);
   } 

     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setSectorweight(source, sourceIndex);
   	
   }
   
   public void setSectorweight(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setSectorweight(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight with another Field
	 *	@param value
	 */
   public void setSectorweight(Field source) {
      dcltbdemsec.setSectorweight(source);
   }  
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setSectorweight(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ffmcapmilusd
	 *	@return ffmcapmilusd
	 */
	public int getFfmcapmilusd() throws CFException {        
   		return dcltbdemsec.getFfmcapmilusd();
	}
	
	/**
	 * 	Update Ffmcapmilusd with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd(int number)  throws CFException{
		dcltbdemsec.setFfmcapmilusd(number);
	}


	public void setFfmcapmilusd(long number)  throws CFException{
		dcltbdemsec.setFfmcapmilusd((int)number);
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
	 *	Returns the value of sector
	 *	@return sector
	 */
   public char[] getSector() throws CFException  {              
   		return dcltbdemsec.getSector();
   }

  
	/**
	*  set variable sector
	*  @param value
	**/
   public void setSector(char[] value) throws CFException {
      dcltbdemsec.setSector(value);
   } 

     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setSector(source, sourceIndex);
   	
   }
   
   public void setSector(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setSector(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector with another Field
	 *	@param value
	 */
   public void setSector(Field source) {
      dcltbdemsec.setSector(source);
   }  
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setSector(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of company
	 *	@return company
	 */
   public char[] getCompany() throws CFException  {              
   		return dcltbdemsec.getCompany();
   }

  
	/**
	*  set variable company
	*  @param value
	**/
   public void setCompany(char[] value) throws CFException {
      dcltbdemsec.setCompany(value);
   } 

     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setCompany(source, sourceIndex);
   	
   }
   
   public void setCompany(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setCompany(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company with another Field
	 *	@param value
	 */
   public void setCompany(Field source) {
      dcltbdemsec.setCompany(source);
   }  
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setCompany(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric
	 *	@return ric
	 */
   public char[] getRic() throws CFException  {              
   		return dcltbdemsec.getRic();
   }

  
	/**
	*  set variable ric
	*  @param value
	**/
   public void setRic(char[] value) throws CFException {
      dcltbdemsec.setRic(value);
   } 

     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setRic(source, sourceIndex);
   	
   }
   
   public void setRic(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setRic(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric with another Field
	 *	@param value
	 */
   public void setRic(Field source) {
      dcltbdemsec.setRic(source);
   }  
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setRic(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
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


        public Cf03secuCtx getCf03secuCtx() {
            return Cf03secuCtx.this;
        }

        public GetSecurityOutCtx getGetSecurityOutCtx() {
            return new GetSecurityOutCtx();
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
        str += dfhcommarea.hashCode();
        str += dcltbdemsec.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public GetSecurityInCtx clone() {
        GetSecurityInCtx cloneObj = new GetSecurityInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        cloneObj.dcltbdemsec = new Dcltbdemsec();
        cloneObj.dcltbdemsec.set(dcltbdemsec.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public GetSecurityInCtx getGetSecurityInCtx() {
            return new GetSecurityInCtx();
    }
     public class GetSecurityOutCtx implements Cloneable {
     Work work = Cf03secuCtx.this.getWork();
     Dfhcommarea dfhcommarea = Cf03secuCtx.this.getDfhcommarea();
     Dcltbdemsec dcltbdemsec = Cf03secuCtx.this.getDcltbdemsec();
     Sqlca sqlca = Cf03secuCtx.this.getSqlca();

	/**
	 *	Returns the value of industry
	 *	@return industry
	 */
   public char[] getIndustry() throws CFException  {              
   		return dcltbdemsec.getIndustry();
   }

  
	/**
	*  set variable industry
	*  @param value
	**/
   public void setIndustry(char[] value) throws CFException {
      dcltbdemsec.setIndustry(value);
   } 

     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setIndustry(source, sourceIndex);
   	
   }
   
   public void setIndustry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setIndustry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry with another Field
	 *	@param value
	 */
   public void setIndustry(Field source) {
      dcltbdemsec.setIndustry(source);
   }  
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setIndustry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of intlkey01
	 *	@return intlkey01
	 */
   public char[] getIntlkey01() throws CFException  {              
   		return dfhcommarea.getIntlkey01();
   }

  
	/**
	*  set variable intlkey01
	*  @param value
	**/
   public void setIntlkey01(char[] value) throws CFException {
      dfhcommarea.setIntlkey01(value);
   } 

     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey01(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setIntlkey01(source, sourceIndex);
   	
   }
   
   public void setIntlkey01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setIntlkey01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setIntlkey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey01 with another Field
	 *	@param value
	 */
   public void setIntlkey01(Field source) {
      dfhcommarea.setIntlkey01(source);
   }  
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey01(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setIntlkey01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setIntlkey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company01
	 *	@return company01
	 */
   public char[] getCompany01() throws CFException  {              
   		return dfhcommarea.getCompany01();
   }

  
	/**
	*  set variable company01
	*  @param value
	**/
   public void setCompany01(char[] value) throws CFException {
      dfhcommarea.setCompany01(value);
   } 

     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany01(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setCompany01(source, sourceIndex);
   	
   }
   
   public void setCompany01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setCompany01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setCompany01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company01 with another Field
	 *	@param value
	 */
   public void setCompany01(Field source) {
      dfhcommarea.setCompany01(source);
   }  
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany01(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setCompany01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setCompany01(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of sectorweight
	 *	@return sectorweight
	 */
   public char[] getSectorweight() throws CFException  {              
   		return dcltbdemsec.getSectorweight();
   }

  
	/**
	*  set variable sectorweight
	*  @param value
	**/
   public void setSectorweight(char[] value) throws CFException {
      dcltbdemsec.setSectorweight(value);
   } 

     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setSectorweight(source, sourceIndex);
   	
   }
   
   public void setSectorweight(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setSectorweight(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight with another Field
	 *	@param value
	 */
   public void setSectorweight(Field source) {
      dcltbdemsec.setSectorweight(source);
   }  
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setSectorweight(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of industry01
	 *	@return industry01
	 */
   public char[] getIndustry01() throws CFException  {              
   		return dfhcommarea.getIndustry01();
   }

  
	/**
	*  set variable industry01
	*  @param value
	**/
   public void setIndustry01(char[] value) throws CFException {
      dfhcommarea.setIndustry01(value);
   } 

     /**
	 * 	Update Industry01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry01(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setIndustry01(source, sourceIndex);
   	
   }
   
   public void setIndustry01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setIndustry01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setIndustry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry01 with another Field
	 *	@param value
	 */
   public void setIndustry01(Field source) {
      dfhcommarea.setIndustry01(source);
   }  
   
     /**
	 * 	Update Industry01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry01(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setIndustry01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setIndustry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sector
	 *	@return sector
	 */
   public char[] getSector() throws CFException  {              
   		return dcltbdemsec.getSector();
   }

  
	/**
	*  set variable sector
	*  @param value
	**/
   public void setSector(char[] value) throws CFException {
      dcltbdemsec.setSector(value);
   } 

     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setSector(source, sourceIndex);
   	
   }
   
   public void setSector(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setSector(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector with another Field
	 *	@param value
	 */
   public void setSector(Field source) {
      dcltbdemsec.setSector(source);
   }  
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setSector(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ffmcapmilusd01
	 *	@return ffmcapmilusd01
	 */
   public char[] getFfmcapmilusd01() throws CFException  {              
   		return dfhcommarea.getFfmcapmilusd01();
   }

  
	/**
	*  set variable ffmcapmilusd01
	*  @param value
	**/
   public void setFfmcapmilusd01(char[] value) throws CFException {
      dfhcommarea.setFfmcapmilusd01(value);
   } 

     /**
	 * 	Update Ffmcapmilusd01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFfmcapmilusd01(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setFfmcapmilusd01(source, sourceIndex);
   	
   }
   
   public void setFfmcapmilusd01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setFfmcapmilusd01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ffmcapmilusd01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFfmcapmilusd01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setFfmcapmilusd01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ffmcapmilusd01 with another Field
	 *	@param value
	 */
   public void setFfmcapmilusd01(Field source) {
      dfhcommarea.setFfmcapmilusd01(source);
   }  
   
     /**
	 * 	Update Ffmcapmilusd01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFfmcapmilusd01(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setFfmcapmilusd01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ffmcapmilusd01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFfmcapmilusd01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setFfmcapmilusd01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company
	 *	@return company
	 */
   public char[] getCompany() throws CFException  {              
   		return dcltbdemsec.getCompany();
   }

  
	/**
	*  set variable company
	*  @param value
	**/
   public void setCompany(char[] value) throws CFException {
      dcltbdemsec.setCompany(value);
   } 

     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setCompany(source, sourceIndex);
   	
   }
   
   public void setCompany(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setCompany(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company with another Field
	 *	@param value
	 */
   public void setCompany(Field source) {
      dcltbdemsec.setCompany(source);
   }  
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setCompany(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric01
	 *	@return ric01
	 */
   public char[] getRic01() throws CFException  {              
   		return dfhcommarea.getRic01();
   }

  
	/**
	*  set variable ric01
	*  @param value
	**/
   public void setRic01(char[] value) throws CFException {
      dfhcommarea.setRic01(value);
   } 

     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic01(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setRic01(source, sourceIndex);
   	
   }
   
   public void setRic01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setRic01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setRic01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric01 with another Field
	 *	@param value
	 */
   public void setRic01(Field source) {
      dfhcommarea.setRic01(source);
   }  
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic01(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setRic01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setRic01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric
	 *	@return ric
	 */
   public char[] getRic() throws CFException  {              
   		return dcltbdemsec.getRic();
   }

  
	/**
	*  set variable ric
	*  @param value
	**/
   public void setRic(char[] value) throws CFException {
      dcltbdemsec.setRic(value);
   } 

     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setRic(source, sourceIndex);
   	
   }
   
   public void setRic(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setRic(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric with another Field
	 *	@param value
	 */
   public void setRic(Field source) {
      dcltbdemsec.setRic(source);
   }  
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setRic(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of isin
	 *	@return isin
	 */
   public char[] getIsin() throws CFException  {              
   		return dcltbdemsec.getIsin();
   }

  
	/**
	*  set variable isin
	*  @param value
	**/
   public void setIsin(char[] value) throws CFException {
      dcltbdemsec.setIsin(value);
   } 

     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setIsin(source, sourceIndex);
   	
   }
   
   public void setIsin(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setIsin(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin with another Field
	 *	@param value
	 */
   public void setIsin(Field source) {
      dcltbdemsec.setIsin(source);
   }  
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setIsin(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of intlkey
	 *	@return intlkey
	 */
   public char[] getIntlkey() throws CFException  {              
   		return dcltbdemsec.getIntlkey();
   }

  
	/**
	*  set variable intlkey
	*  @param value
	**/
   public void setIntlkey(char[] value) throws CFException {
      dcltbdemsec.setIntlkey(value);
   } 

     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setIntlkey(source, sourceIndex);
   	
   }
   
   public void setIntlkey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setIntlkey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey with another Field
	 *	@param value
	 */
   public void setIntlkey(Field source) {
      dcltbdemsec.setIntlkey(source);
   }  
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setIntlkey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry() throws CFException  {              
   		return dcltbdemsec.getCountry();
   }

  
	/**
	*  set variable country
	*  @param value
	**/
   public void setCountry(char[] value) throws CFException {
      dcltbdemsec.setCountry(value);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setCountry(source, sourceIndex);
   	
   }
   
   public void setCountry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setCountry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(Field source) {
      dcltbdemsec.setCountry(source);
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setCountry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sedol
	 *	@return sedol
	 */
   public char[] getSedol() throws CFException  {              
   		return dcltbdemsec.getSedol();
   }

  
	/**
	*  set variable sedol
	*  @param value
	**/
   public void setSedol(char[] value) throws CFException {
      dcltbdemsec.setSedol(value);
   } 

     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setSedol(source, sourceIndex);
   	
   }
   
   public void setSedol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setSedol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol with another Field
	 *	@param value
	 */
   public void setSedol(Field source) {
      dcltbdemsec.setSedol(source);
   }  
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setSedol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dcltbdemsec
	 *	@return dcltbdemsec
	 */   
	 public Dcltbdemsec getDcltbdemsec() {
   	return dcltbdemsec;
   }


	/**
	 *	Returns the value of secErrorMsg
	 *	@return secErrorMsg
	 */
   public char[] getSecErrorMsg() throws CFException  {              
   		return dfhcommarea.getSecErrorMsg();
   }

  
	/**
	*  set variable secErrorMsg
	*  @param value
	**/
   public void setSecErrorMsg(char[] value) throws CFException {
      dfhcommarea.setSecErrorMsg(value);
   } 

     /**
	 * 	Update SecErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecErrorMsg(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setSecErrorMsg(source, sourceIndex);
   	
   }
   
   public void setSecErrorMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setSecErrorMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SecErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setSecErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SecErrorMsg with another Field
	 *	@param value
	 */
   public void setSecErrorMsg(Field source) {
      dfhcommarea.setSecErrorMsg(source);
   }  
   
     /**
	 * 	Update SecErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecErrorMsg(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setSecErrorMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SecErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setSecErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of isin01
	 *	@return isin01
	 */
   public char[] getIsin01() throws CFException  {              
   		return dfhcommarea.getIsin01();
   }

  
	/**
	*  set variable isin01
	*  @param value
	**/
   public void setIsin01(char[] value) throws CFException {
      dfhcommarea.setIsin01(value);
   } 

     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin01(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setIsin01(source, sourceIndex);
   	
   }
   
   public void setIsin01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setIsin01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin01 with another Field
	 *	@param value
	 */
   public void setIsin01(Field source) {
      dfhcommarea.setIsin01(source);
   }  
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin01(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setIsin01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ffmcapmilusd
	 *	@return ffmcapmilusd
	 */
	public int getFfmcapmilusd() throws CFException {        
   		return dcltbdemsec.getFfmcapmilusd();
	}
	
	/**
	 * 	Update Ffmcapmilusd with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd(int number)  throws CFException{
		dcltbdemsec.setFfmcapmilusd(number);
	}


	public void setFfmcapmilusd(long number)  throws CFException{
		dcltbdemsec.setFfmcapmilusd((int)number);
	}


	/**
	 *	Returns the value of country01
	 *	@return country01
	 */
   public char[] getCountry01() throws CFException  {              
   		return dfhcommarea.getCountry01();
   }

  
	/**
	*  set variable country01
	*  @param value
	**/
   public void setCountry01(char[] value) throws CFException {
      dfhcommarea.setCountry01(value);
   } 

     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry01(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setCountry01(source, sourceIndex);
   	
   }
   
   public void setCountry01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setCountry01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setCountry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country01 with another Field
	 *	@param value
	 */
   public void setCountry01(Field source) {
      dfhcommarea.setCountry01(source);
   }  
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry01(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setCountry01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setCountry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight01
	 *	@return sectorweight01
	 */
   public char[] getSectorweight01() throws CFException  {              
   		return dfhcommarea.getSectorweight01();
   }

  
	/**
	*  set variable sectorweight01
	*  @param value
	**/
   public void setSectorweight01(char[] value) throws CFException {
      dfhcommarea.setSectorweight01(value);
   } 

     /**
	 * 	Update Sectorweight01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight01(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setSectorweight01(source, sourceIndex);
   	
   }
   
   public void setSectorweight01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setSectorweight01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setSectorweight01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight01 with another Field
	 *	@param value
	 */
   public void setSectorweight01(Field source) {
      dfhcommarea.setSectorweight01(source);
   }  
   
     /**
	 * 	Update Sectorweight01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight01(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setSectorweight01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setSectorweight01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sedol01
	 *	@return sedol01
	 */
   public char[] getSedol01() throws CFException  {              
   		return dfhcommarea.getSedol01();
   }

  
	/**
	*  set variable sedol01
	*  @param value
	**/
   public void setSedol01(char[] value) throws CFException {
      dfhcommarea.setSedol01(value);
   } 

     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol01(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setSedol01(source, sourceIndex);
   	
   }
   
   public void setSedol01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setSedol01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setSedol01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol01 with another Field
	 *	@param value
	 */
   public void setSedol01(Field source) {
      dfhcommarea.setSedol01(source);
   }  
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol01(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setSedol01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setSedol01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Returns the value of sector01
	 *	@return sector01
	 */
   public char[] getSector01() throws CFException  {              
   		return dfhcommarea.getSector01();
   }

  
	/**
	*  set variable sector01
	*  @param value
	**/
   public void setSector01(char[] value) throws CFException {
      dfhcommarea.setSector01(value);
   } 

     /**
	 * 	Update Sector01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector01(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setSector01(source, sourceIndex);
   	
   }
   
   public void setSector01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setSector01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setSector01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector01 with another Field
	 *	@param value
	 */
   public void setSector01(Field source) {
      dfhcommarea.setSector01(source);
   }  
   
     /**
	 * 	Update Sector01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector01(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setSector01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setSector01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Cf03secuCtx getCf03secuCtx() {
            return Cf03secuCtx.this;
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
        str += dfhcommarea.hashCode();
        str += dcltbdemsec.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public GetSecurityOutCtx clone() {
        GetSecurityOutCtx cloneObj = new GetSecurityOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        cloneObj.dcltbdemsec = new Dcltbdemsec();
        cloneObj.dcltbdemsec.set(dcltbdemsec.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public GetSecurityOutCtx getGetSecurityOutCtx() {
            return new GetSecurityOutCtx();
    }
}
