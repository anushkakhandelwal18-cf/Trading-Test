package com.cloudframe.app.mstpb002;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.mstpb002.dto.Work;
import com.cloudframe.app.mstpb002.dto.LsSecurityIo;
import com.cloudframe.app.mstpb002.dto.Sqlca;
import com.cloudframe.app.mstpb002.dto.Dcltbtrdsec;
import com.cloudframe.app.mstpb002.dto.Sqlwarn;


@Context
public class Mstpb002Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    LsSecurityIo lsSecurityIo;
    Dcltbtrdsec dcltbtrdsec;
    Work work;
    Sqlca sqlca;


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


    public LsSecurityIo getLsSecurityIo() {
        if (lsSecurityIo == null) {
            lsSecurityIo = new LsSecurityIo();
        }

        return lsSecurityIo;
    }

    public void setLsSecurityIo(LsSecurityIo lsSecurityIo) {
        this.lsSecurityIo = lsSecurityIo;
    }
    public Dcltbtrdsec getDcltbtrdsec() {
        if (dcltbtrdsec == null) {
            dcltbtrdsec = new Dcltbtrdsec();
        }

        return dcltbtrdsec;
    }

    public void setDcltbtrdsec(Dcltbtrdsec dcltbtrdsec) {
        this.dcltbtrdsec = dcltbtrdsec;
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
    public Sqlca getSqlca() {
        if (sqlca == null) {
            sqlca = new Sqlca();
        }

        return sqlca;
    }

    public void setSqlca(Sqlca sqlca) {
        this.sqlca = sqlca;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += lsSecurityIo.hashCode();
        str += dcltbtrdsec.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public Mstpb002Ctx clone() {
        Mstpb002Ctx cloneObj = new Mstpb002Ctx();
        cloneObj.lsSecurityIo = new LsSecurityIo();
        cloneObj.lsSecurityIo.set(lsSecurityIo.getClonedField());
        cloneObj.dcltbtrdsec = new Dcltbtrdsec();
        cloneObj.dcltbtrdsec.set(dcltbtrdsec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     LsSecurityIo lsSecurityIo = Mstpb002Ctx.this.getLsSecurityIo();


        public Mstpb002Ctx getMstpb002Ctx() {
            return Mstpb002Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += lsSecurityIo.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.lsSecurityIo = new LsSecurityIo();
        cloneObj.lsSecurityIo.set(lsSecurityIo.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     LsSecurityIo lsSecurityIo = Mstpb002Ctx.this.getLsSecurityIo();

	/**
	 *	Test condition "S" for isSecurityException88()
	 *	@return  Returns true if isSecurityException88() is "S"
	 */
   public boolean isSecurityException88() throws CFException {
      return lsSecurityIo.isSecurityException88();
   }

	/**
	*  set values "S"
	*/
   	public void setSecurityException88True()  throws CFException{  			
    	lsSecurityIo.setSecurityException88True();
   	}
	/**
	 *	Returns the value of lsSecurityErrorMsg
	 *	@return lsSecurityErrorMsg
	 */
   public char[] getLsSecurityErrorMsg() throws CFException  {              
   		return lsSecurityIo.getLsSecurityErrorMsg();
   }

  
	/**
	*  set variable lsSecurityErrorMsg
	*  @param value
	**/
   public void setLsSecurityErrorMsg(char[] value) throws CFException {
      lsSecurityIo.setLsSecurityErrorMsg(value);
   } 

     /**
	 * 	Update LsSecurityErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsSecurityErrorMsg(char[] source, int sourceIndex) throws CFException {
      lsSecurityIo.setLsSecurityErrorMsg(source, sourceIndex);
   	
   }
   
   public void setLsSecurityErrorMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsSecurityIo.setLsSecurityErrorMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsSecurityErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsSecurityErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsSecurityIo.setLsSecurityErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsSecurityErrorMsg with another Field
	 *	@param value
	 */
   public void setLsSecurityErrorMsg(Field source) {
      lsSecurityIo.setLsSecurityErrorMsg(source);
   }  
   
     /**
	 * 	Update LsSecurityErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsSecurityErrorMsg(Field source, int sourceIndex,int sourceLen) {
      lsSecurityIo.setLsSecurityErrorMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsSecurityErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsSecurityErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsSecurityIo.setLsSecurityErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Mstpb002Ctx getMstpb002Ctx() {
            return Mstpb002Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += lsSecurityIo.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.lsSecurityIo = new LsSecurityIo();
        cloneObj.lsSecurityIo.set(lsSecurityIo.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class GetSecurityInCtx implements Cloneable {
     LsSecurityIo lsSecurityIo = Mstpb002Ctx.this.getLsSecurityIo();
     Dcltbtrdsec dcltbtrdsec = Mstpb002Ctx.this.getDcltbtrdsec();
     Work work = Mstpb002Ctx.this.getWork();
     Sqlca sqlca = Mstpb002Ctx.this.getSqlca();

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
	 *	Returns the value of lsFigi
	 *	@return lsFigi
	 */
   public char[] getLsFigi() throws CFException  {              
   		return lsSecurityIo.getLsFigi();
   }

  
	/**
	*  set variable lsFigi
	*  @param value
	**/
   public void setLsFigi(char[] value) throws CFException {
      lsSecurityIo.setLsFigi(value);
   } 

     /**
	 * 	Update LsFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsFigi(char[] source, int sourceIndex) throws CFException {
      lsSecurityIo.setLsFigi(source, sourceIndex);
   	
   }
   
   public void setLsFigi(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsSecurityIo.setLsFigi(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsSecurityIo.setLsFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsFigi with another Field
	 *	@param value
	 */
   public void setLsFigi(Field source) {
      lsSecurityIo.setLsFigi(source);
   }  
   
     /**
	 * 	Update LsFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsFigi(Field source, int sourceIndex,int sourceLen) {
      lsSecurityIo.setLsFigi(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsSecurityIo.setLsFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of secCurrency
	 *	@return secCurrency
	 */
   public char[] getSecCurrency() throws CFException  {              
   		return dcltbtrdsec.getSecCurrency();
   }

  
	/**
	*  set variable secCurrency
	*  @param value
	**/
   public void setSecCurrency(char[] value) throws CFException {
      dcltbtrdsec.setSecCurrency(value);
   } 

     /**
	 * 	Update SecCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecCurrency(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsec.setSecCurrency(source, sourceIndex);
   	
   }
   
   public void setSecCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsec.setSecCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SecCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SecCurrency with another Field
	 *	@param value
	 */
   public void setSecCurrency(Field source) {
      dcltbtrdsec.setSecCurrency(source);
   }  
   
     /**
	 * 	Update SecCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecCurrency(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsec.setSecCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SecCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of dcltbtrdsec
	 *	@return dcltbtrdsec
	 */   
	 public Dcltbtrdsec getDcltbtrdsec() {
   	return dcltbtrdsec;
   }


	/**
	 *	Returns the value of secSymbol
	 *	@return secSymbol
	 */
   public char[] getSecSymbol() throws CFException  {              
   		return dcltbtrdsec.getSecSymbol();
   }

  
	/**
	*  set variable secSymbol
	*  @param value
	**/
   public void setSecSymbol(char[] value) throws CFException {
      dcltbtrdsec.setSecSymbol(value);
   } 

     /**
	 * 	Update SecSymbol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecSymbol(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsec.setSecSymbol(source, sourceIndex);
   	
   }
   
   public void setSecSymbol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsec.setSecSymbol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SecSymbol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecSymbol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecSymbol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SecSymbol with another Field
	 *	@param value
	 */
   public void setSecSymbol(Field source) {
      dcltbtrdsec.setSecSymbol(source);
   }  
   
     /**
	 * 	Update SecSymbol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecSymbol(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsec.setSecSymbol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SecSymbol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecSymbol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecSymbol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of secType
	 *	@return secType
	 */
   public char[] getSecType() throws CFException  {              
   		return dcltbtrdsec.getSecType();
   }

  
	/**
	*  set variable secType
	*  @param value
	**/
   public void setSecType(char[] value) throws CFException {
      dcltbtrdsec.setSecType(value);
   } 

     /**
	 * 	Update SecType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecType(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsec.setSecType(source, sourceIndex);
   	
   }
   
   public void setSecType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsec.setSecType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SecType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SecType with another Field
	 *	@param value
	 */
   public void setSecType(Field source) {
      dcltbtrdsec.setSecType(source);
   }  
   
     /**
	 * 	Update SecType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecType(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsec.setSecType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SecType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of secShareClassFigi
	 *	@return secShareClassFigi
	 */
   public char[] getSecShareClassFigi() throws CFException  {              
   		return dcltbtrdsec.getSecShareClassFigi();
   }

  
	/**
	*  set variable secShareClassFigi
	*  @param value
	**/
   public void setSecShareClassFigi(char[] value) throws CFException {
      dcltbtrdsec.setSecShareClassFigi(value);
   } 

     /**
	 * 	Update SecShareClassFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecShareClassFigi(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsec.setSecShareClassFigi(source, sourceIndex);
   	
   }
   
   public void setSecShareClassFigi(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsec.setSecShareClassFigi(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SecShareClassFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecShareClassFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecShareClassFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SecShareClassFigi with another Field
	 *	@param value
	 */
   public void setSecShareClassFigi(Field source) {
      dcltbtrdsec.setSecShareClassFigi(source);
   }  
   
     /**
	 * 	Update SecShareClassFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecShareClassFigi(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsec.setSecShareClassFigi(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SecShareClassFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecShareClassFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecShareClassFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of secDescription
	 *	@return secDescription
	 */
   public char[] getSecDescription() throws CFException  {              
   		return dcltbtrdsec.getSecDescription();
   }

  
	/**
	*  set variable secDescription
	*  @param value
	**/
   public void setSecDescription(char[] value) throws CFException {
      dcltbtrdsec.setSecDescription(value);
   } 

     /**
	 * 	Update SecDescription 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecDescription(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsec.setSecDescription(source, sourceIndex);
   	
   }
   
   public void setSecDescription(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsec.setSecDescription(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SecDescription 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecDescription(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SecDescription with another Field
	 *	@param value
	 */
   public void setSecDescription(Field source) {
      dcltbtrdsec.setSecDescription(source);
   }  
   
     /**
	 * 	Update SecDescription 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecDescription(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsec.setSecDescription(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SecDescription 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecDescription(source, sourceIndex, sourceLen, targetIndex, targetLen);
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


        public Mstpb002Ctx getMstpb002Ctx() {
            return Mstpb002Ctx.this;
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
        str += lsSecurityIo.hashCode();
        str += dcltbtrdsec.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public GetSecurityInCtx clone() {
        GetSecurityInCtx cloneObj = new GetSecurityInCtx();
        cloneObj.lsSecurityIo = new LsSecurityIo();
        cloneObj.lsSecurityIo.set(lsSecurityIo.getClonedField());
        cloneObj.dcltbtrdsec = new Dcltbtrdsec();
        cloneObj.dcltbtrdsec.set(dcltbtrdsec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public GetSecurityInCtx getGetSecurityInCtx() {
            return new GetSecurityInCtx();
    }
     public class GetSecurityOutCtx implements Cloneable {
     LsSecurityIo lsSecurityIo = Mstpb002Ctx.this.getLsSecurityIo();
     Dcltbtrdsec dcltbtrdsec = Mstpb002Ctx.this.getDcltbtrdsec();
     Work work = Mstpb002Ctx.this.getWork();
     Sqlca sqlca = Mstpb002Ctx.this.getSqlca();

	/**
	 *	Returns the value of lsShareClassFigi
	 *	@return lsShareClassFigi
	 */
   public char[] getLsShareClassFigi() throws CFException  {              
   		return lsSecurityIo.getLsShareClassFigi();
   }

  
	/**
	*  set variable lsShareClassFigi
	*  @param value
	**/
   public void setLsShareClassFigi(char[] value) throws CFException {
      lsSecurityIo.setLsShareClassFigi(value);
   } 

     /**
	 * 	Update LsShareClassFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsShareClassFigi(char[] source, int sourceIndex) throws CFException {
      lsSecurityIo.setLsShareClassFigi(source, sourceIndex);
   	
   }
   
   public void setLsShareClassFigi(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsSecurityIo.setLsShareClassFigi(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsShareClassFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsShareClassFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsSecurityIo.setLsShareClassFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsShareClassFigi with another Field
	 *	@param value
	 */
   public void setLsShareClassFigi(Field source) {
      lsSecurityIo.setLsShareClassFigi(source);
   }  
   
     /**
	 * 	Update LsShareClassFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsShareClassFigi(Field source, int sourceIndex,int sourceLen) {
      lsSecurityIo.setLsShareClassFigi(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsShareClassFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsShareClassFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsSecurityIo.setLsShareClassFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of lsSymbol
	 *	@return lsSymbol
	 */
   public char[] getLsSymbol() throws CFException  {              
   		return lsSecurityIo.getLsSymbol();
   }

  
	/**
	*  set variable lsSymbol
	*  @param value
	**/
   public void setLsSymbol(char[] value) throws CFException {
      lsSecurityIo.setLsSymbol(value);
   } 

     /**
	 * 	Update LsSymbol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsSymbol(char[] source, int sourceIndex) throws CFException {
      lsSecurityIo.setLsSymbol(source, sourceIndex);
   	
   }
   
   public void setLsSymbol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsSecurityIo.setLsSymbol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsSymbol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsSymbol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsSecurityIo.setLsSymbol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsSymbol with another Field
	 *	@param value
	 */
   public void setLsSymbol(Field source) {
      lsSecurityIo.setLsSymbol(source);
   }  
   
     /**
	 * 	Update LsSymbol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsSymbol(Field source, int sourceIndex,int sourceLen) {
      lsSecurityIo.setLsSymbol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsSymbol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsSymbol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsSecurityIo.setLsSymbol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "A" for isSecurityActive88()
	 *	@return  Returns true if isSecurityActive88() is "A"
	 */
   public boolean isSecurityActive88() throws CFException {
      return lsSecurityIo.isSecurityActive88();
   }

	/**
	*  set values "A"
	*/
   	public void setSecurityActive88True()  throws CFException{  			
    	lsSecurityIo.setSecurityActive88True();
   	}
	/**
	 *	Returns the value of lsFigi
	 *	@return lsFigi
	 */
   public char[] getLsFigi() throws CFException  {              
   		return lsSecurityIo.getLsFigi();
   }

  
	/**
	*  set variable lsFigi
	*  @param value
	**/
   public void setLsFigi(char[] value) throws CFException {
      lsSecurityIo.setLsFigi(value);
   } 

     /**
	 * 	Update LsFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsFigi(char[] source, int sourceIndex) throws CFException {
      lsSecurityIo.setLsFigi(source, sourceIndex);
   	
   }
   
   public void setLsFigi(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsSecurityIo.setLsFigi(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsSecurityIo.setLsFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsFigi with another Field
	 *	@param value
	 */
   public void setLsFigi(Field source) {
      lsSecurityIo.setLsFigi(source);
   }  
   
     /**
	 * 	Update LsFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsFigi(Field source, int sourceIndex,int sourceLen) {
      lsSecurityIo.setLsFigi(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsSecurityIo.setLsFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of secCurrency
	 *	@return secCurrency
	 */
   public char[] getSecCurrency() throws CFException  {              
   		return dcltbtrdsec.getSecCurrency();
   }

  
	/**
	*  set variable secCurrency
	*  @param value
	**/
   public void setSecCurrency(char[] value) throws CFException {
      dcltbtrdsec.setSecCurrency(value);
   } 

     /**
	 * 	Update SecCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecCurrency(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsec.setSecCurrency(source, sourceIndex);
   	
   }
   
   public void setSecCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsec.setSecCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SecCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SecCurrency with another Field
	 *	@param value
	 */
   public void setSecCurrency(Field source) {
      dcltbtrdsec.setSecCurrency(source);
   }  
   
     /**
	 * 	Update SecCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecCurrency(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsec.setSecCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SecCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "S" for isSecurityException88()
	 *	@return  Returns true if isSecurityException88() is "S"
	 */
   public boolean isSecurityException88() throws CFException {
      return lsSecurityIo.isSecurityException88();
   }

	/**
	*  set values "S"
	*/
   	public void setSecurityException88True()  throws CFException{  			
    	lsSecurityIo.setSecurityException88True();
   	}
	/**
	 *	Returns the value of secSymbol
	 *	@return secSymbol
	 */
   public char[] getSecSymbol() throws CFException  {              
   		return dcltbtrdsec.getSecSymbol();
   }

  
	/**
	*  set variable secSymbol
	*  @param value
	**/
   public void setSecSymbol(char[] value) throws CFException {
      dcltbtrdsec.setSecSymbol(value);
   } 

     /**
	 * 	Update SecSymbol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecSymbol(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsec.setSecSymbol(source, sourceIndex);
   	
   }
   
   public void setSecSymbol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsec.setSecSymbol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SecSymbol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecSymbol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecSymbol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SecSymbol with another Field
	 *	@param value
	 */
   public void setSecSymbol(Field source) {
      dcltbtrdsec.setSecSymbol(source);
   }  
   
     /**
	 * 	Update SecSymbol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecSymbol(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsec.setSecSymbol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SecSymbol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecSymbol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecSymbol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsCurrency
	 *	@return lsCurrency
	 */
   public char[] getLsCurrency() throws CFException  {              
   		return lsSecurityIo.getLsCurrency();
   }

  
	/**
	*  set variable lsCurrency
	*  @param value
	**/
   public void setLsCurrency(char[] value) throws CFException {
      lsSecurityIo.setLsCurrency(value);
   } 

     /**
	 * 	Update LsCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsCurrency(char[] source, int sourceIndex) throws CFException {
      lsSecurityIo.setLsCurrency(source, sourceIndex);
   	
   }
   
   public void setLsCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsSecurityIo.setLsCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsSecurityIo.setLsCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsCurrency with another Field
	 *	@param value
	 */
   public void setLsCurrency(Field source) {
      lsSecurityIo.setLsCurrency(source);
   }  
   
     /**
	 * 	Update LsCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsCurrency(Field source, int sourceIndex,int sourceLen) {
      lsSecurityIo.setLsCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsSecurityIo.setLsCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of secFigi
	 *	@return secFigi
	 */
   public char[] getSecFigi() throws CFException  {              
   		return dcltbtrdsec.getSecFigi();
   }

  
	/**
	*  set variable secFigi
	*  @param value
	**/
   public void setSecFigi(char[] value) throws CFException {
      dcltbtrdsec.setSecFigi(value);
   } 

     /**
	 * 	Update SecFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecFigi(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsec.setSecFigi(source, sourceIndex);
   	
   }
   
   public void setSecFigi(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsec.setSecFigi(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SecFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SecFigi with another Field
	 *	@param value
	 */
   public void setSecFigi(Field source) {
      dcltbtrdsec.setSecFigi(source);
   }  
   
     /**
	 * 	Update SecFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecFigi(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsec.setSecFigi(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SecFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsDescription
	 *	@return lsDescription
	 */
   public char[] getLsDescription() throws CFException  {              
   		return lsSecurityIo.getLsDescription();
   }

  
	/**
	*  set variable lsDescription
	*  @param value
	**/
   public void setLsDescription(char[] value) throws CFException {
      lsSecurityIo.setLsDescription(value);
   } 

     /**
	 * 	Update LsDescription 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsDescription(char[] source, int sourceIndex) throws CFException {
      lsSecurityIo.setLsDescription(source, sourceIndex);
   	
   }
   
   public void setLsDescription(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsSecurityIo.setLsDescription(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsDescription 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsSecurityIo.setLsDescription(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsDescription with another Field
	 *	@param value
	 */
   public void setLsDescription(Field source) {
      lsSecurityIo.setLsDescription(source);
   }  
   
     /**
	 * 	Update LsDescription 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsDescription(Field source, int sourceIndex,int sourceLen) {
      lsSecurityIo.setLsDescription(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsDescription 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsSecurityIo.setLsDescription(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of secDescription
	 *	@return secDescription
	 */
   public char[] getSecDescription() throws CFException  {              
   		return dcltbtrdsec.getSecDescription();
   }

  
	/**
	*  set variable secDescription
	*  @param value
	**/
   public void setSecDescription(char[] value) throws CFException {
      dcltbtrdsec.setSecDescription(value);
   } 

     /**
	 * 	Update SecDescription 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecDescription(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsec.setSecDescription(source, sourceIndex);
   	
   }
   
   public void setSecDescription(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsec.setSecDescription(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SecDescription 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecDescription(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SecDescription with another Field
	 *	@param value
	 */
   public void setSecDescription(Field source) {
      dcltbtrdsec.setSecDescription(source);
   }  
   
     /**
	 * 	Update SecDescription 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecDescription(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsec.setSecDescription(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SecDescription 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecDescription(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of lsType
	 *	@return lsType
	 */
   public char[] getLsType() throws CFException  {              
   		return lsSecurityIo.getLsType();
   }

  
	/**
	*  set variable lsType
	*  @param value
	**/
   public void setLsType(char[] value) throws CFException {
      lsSecurityIo.setLsType(value);
   } 

     /**
	 * 	Update LsType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsType(char[] source, int sourceIndex) throws CFException {
      lsSecurityIo.setLsType(source, sourceIndex);
   	
   }
   
   public void setLsType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsSecurityIo.setLsType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsSecurityIo.setLsType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsType with another Field
	 *	@param value
	 */
   public void setLsType(Field source) {
      lsSecurityIo.setLsType(source);
   }  
   
     /**
	 * 	Update LsType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsType(Field source, int sourceIndex,int sourceLen) {
      lsSecurityIo.setLsType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsSecurityIo.setLsType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dcltbtrdsec
	 *	@return dcltbtrdsec
	 */   
	 public Dcltbtrdsec getDcltbtrdsec() {
   	return dcltbtrdsec;
   }


	/**
	 *	Test condition "N" for isSecurityNotFound88()
	 *	@return  Returns true if isSecurityNotFound88() is "N"
	 */
   public boolean isSecurityNotFound88() throws CFException {
      return lsSecurityIo.isSecurityNotFound88();
   }

	/**
	*  set values "N"
	*/
   	public void setSecurityNotFound88True()  throws CFException{  			
    	lsSecurityIo.setSecurityNotFound88True();
   	}
	/**
	 *	Returns the value of secType
	 *	@return secType
	 */
   public char[] getSecType() throws CFException  {              
   		return dcltbtrdsec.getSecType();
   }

  
	/**
	*  set variable secType
	*  @param value
	**/
   public void setSecType(char[] value) throws CFException {
      dcltbtrdsec.setSecType(value);
   } 

     /**
	 * 	Update SecType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecType(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsec.setSecType(source, sourceIndex);
   	
   }
   
   public void setSecType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsec.setSecType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SecType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SecType with another Field
	 *	@param value
	 */
   public void setSecType(Field source) {
      dcltbtrdsec.setSecType(source);
   }  
   
     /**
	 * 	Update SecType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecType(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsec.setSecType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SecType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsSecurityErrorMsg
	 *	@return lsSecurityErrorMsg
	 */
   public char[] getLsSecurityErrorMsg() throws CFException  {              
   		return lsSecurityIo.getLsSecurityErrorMsg();
   }

  
	/**
	*  set variable lsSecurityErrorMsg
	*  @param value
	**/
   public void setLsSecurityErrorMsg(char[] value) throws CFException {
      lsSecurityIo.setLsSecurityErrorMsg(value);
   } 

     /**
	 * 	Update LsSecurityErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsSecurityErrorMsg(char[] source, int sourceIndex) throws CFException {
      lsSecurityIo.setLsSecurityErrorMsg(source, sourceIndex);
   	
   }
   
   public void setLsSecurityErrorMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsSecurityIo.setLsSecurityErrorMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsSecurityErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsSecurityErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsSecurityIo.setLsSecurityErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsSecurityErrorMsg with another Field
	 *	@param value
	 */
   public void setLsSecurityErrorMsg(Field source) {
      lsSecurityIo.setLsSecurityErrorMsg(source);
   }  
   
     /**
	 * 	Update LsSecurityErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsSecurityErrorMsg(Field source, int sourceIndex,int sourceLen) {
      lsSecurityIo.setLsSecurityErrorMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsSecurityErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsSecurityErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsSecurityIo.setLsSecurityErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of secShareClassFigi
	 *	@return secShareClassFigi
	 */
   public char[] getSecShareClassFigi() throws CFException  {              
   		return dcltbtrdsec.getSecShareClassFigi();
   }

  
	/**
	*  set variable secShareClassFigi
	*  @param value
	**/
   public void setSecShareClassFigi(char[] value) throws CFException {
      dcltbtrdsec.setSecShareClassFigi(value);
   } 

     /**
	 * 	Update SecShareClassFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecShareClassFigi(char[] source, int sourceIndex) throws CFException {
      dcltbtrdsec.setSecShareClassFigi(source, sourceIndex);
   	
   }
   
   public void setSecShareClassFigi(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdsec.setSecShareClassFigi(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SecShareClassFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecShareClassFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecShareClassFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SecShareClassFigi with another Field
	 *	@param value
	 */
   public void setSecShareClassFigi(Field source) {
      dcltbtrdsec.setSecShareClassFigi(source);
   }  
   
     /**
	 * 	Update SecShareClassFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecShareClassFigi(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdsec.setSecShareClassFigi(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SecShareClassFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecShareClassFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdsec.setSecShareClassFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Mstpb002Ctx getMstpb002Ctx() {
            return Mstpb002Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += lsSecurityIo.hashCode();
        str += dcltbtrdsec.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public GetSecurityOutCtx clone() {
        GetSecurityOutCtx cloneObj = new GetSecurityOutCtx();
        cloneObj.lsSecurityIo = new LsSecurityIo();
        cloneObj.lsSecurityIo.set(lsSecurityIo.getClonedField());
        cloneObj.dcltbtrdsec = new Dcltbtrdsec();
        cloneObj.dcltbtrdsec.set(dcltbtrdsec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public GetSecurityOutCtx getGetSecurityOutCtx() {
            return new GetSecurityOutCtx();
    }
}
