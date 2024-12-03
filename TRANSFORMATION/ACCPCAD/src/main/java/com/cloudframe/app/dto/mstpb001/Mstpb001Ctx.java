package com.cloudframe.app.dto.mstpb001;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

 
 
 
 
 


@Context
public class Mstpb001Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Dcltbtrdcus dcltbtrdcus;
    Work work;
    Sqlca sqlca;
    LsCustomerIo lsCustomerIo;


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


    public Dcltbtrdcus getDcltbtrdcus() {
        if (dcltbtrdcus == null) {
            dcltbtrdcus = new Dcltbtrdcus();
        }

        return dcltbtrdcus;
    }

    public void setDcltbtrdcus(Dcltbtrdcus dcltbtrdcus) {
        this.dcltbtrdcus = dcltbtrdcus;
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
    public LsCustomerIo getLsCustomerIo() {
        if (lsCustomerIo == null) {
            lsCustomerIo = new LsCustomerIo();
        }

        return lsCustomerIo;
    }

    public void setLsCustomerIo(LsCustomerIo lsCustomerIo) {
        this.lsCustomerIo = lsCustomerIo;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dcltbtrdcus.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
        str += lsCustomerIo.hashCode();
       return str.hashCode();
    }

    public Mstpb001Ctx clone() {
        Mstpb001Ctx cloneObj = new Mstpb001Ctx();
        cloneObj.dcltbtrdcus = new Dcltbtrdcus();
        cloneObj.dcltbtrdcus.set(dcltbtrdcus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.lsCustomerIo = new LsCustomerIo();
        cloneObj.lsCustomerIo.set(lsCustomerIo.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     LsCustomerIo lsCustomerIo = Mstpb001Ctx.this.getLsCustomerIo();


        public Mstpb001Ctx getMstpb001Ctx() {
            return Mstpb001Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += lsCustomerIo.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.lsCustomerIo = new LsCustomerIo();
        cloneObj.lsCustomerIo.set(lsCustomerIo.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     LsCustomerIo lsCustomerIo = Mstpb001Ctx.this.getLsCustomerIo();

	/**
	 *	Test condition "S" for isCustomerException88()
	 *	@return  Returns true if isCustomerException88() is "S"
	 */
   public boolean isCustomerException88() throws CFException {
      return lsCustomerIo.isCustomerException88();
   }

	/**
	*  set values "S"
	*/
   	public void setCustomerException88True()  throws CFException{  			
    	lsCustomerIo.setCustomerException88True();
   	}
	/**
	 *	Returns the value of lsCustomerErrorMsg
	 *	@return lsCustomerErrorMsg
	 */
   public char[] getLsCustomerErrorMsg() throws CFException  {              
   		return lsCustomerIo.getLsCustomerErrorMsg();
   }

  
	/**
	*  set variable lsCustomerErrorMsg
	*  @param value
	**/
   public void setLsCustomerErrorMsg(char[] value) throws CFException {
      lsCustomerIo.setLsCustomerErrorMsg(value);
   } 

     /**
	 * 	Update LsCustomerErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsCustomerErrorMsg(char[] source, int sourceIndex) throws CFException {
      lsCustomerIo.setLsCustomerErrorMsg(source, sourceIndex);
   	
   }
   
   public void setLsCustomerErrorMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsCustomerIo.setLsCustomerErrorMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsCustomerErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsCustomerIo.setLsCustomerErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsCustomerErrorMsg with another Field
	 *	@param value
	 */
   public void setLsCustomerErrorMsg(Field source) {
      lsCustomerIo.setLsCustomerErrorMsg(source);
   }  
   
     /**
	 * 	Update LsCustomerErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsCustomerErrorMsg(Field source, int sourceIndex,int sourceLen) {
      lsCustomerIo.setLsCustomerErrorMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsCustomerErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsCustomerIo.setLsCustomerErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Mstpb001Ctx getMstpb001Ctx() {
            return Mstpb001Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += lsCustomerIo.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.lsCustomerIo = new LsCustomerIo();
        cloneObj.lsCustomerIo.set(lsCustomerIo.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class GetCustomerInCtx implements Cloneable {
     Dcltbtrdcus dcltbtrdcus = Mstpb001Ctx.this.getDcltbtrdcus();
     Work work = Mstpb001Ctx.this.getWork();
     Sqlca sqlca = Mstpb001Ctx.this.getSqlca();
     LsCustomerIo lsCustomerIo = Mstpb001Ctx.this.getLsCustomerIo();

	/**
	 *	Returns the value of cusDescription
	 *	@return cusDescription
	 */
   public char[] getCusDescription() throws CFException  {              
   		return dcltbtrdcus.getCusDescription();
   }

  
	/**
	*  set variable cusDescription
	*  @param value
	**/
   public void setCusDescription(char[] value) throws CFException {
      dcltbtrdcus.setCusDescription(value);
   } 

     /**
	 * 	Update CusDescription 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCusDescription(char[] source, int sourceIndex) throws CFException {
      dcltbtrdcus.setCusDescription(source, sourceIndex);
   	
   }
   
   public void setCusDescription(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdcus.setCusDescription(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CusDescription 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCusDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdcus.setCusDescription(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CusDescription with another Field
	 *	@param value
	 */
   public void setCusDescription(Field source) {
      dcltbtrdcus.setCusDescription(source);
   }  
   
     /**
	 * 	Update CusDescription 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCusDescription(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdcus.setCusDescription(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CusDescription 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCusDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdcus.setCusDescription(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of dcltbtrdcus
	 *	@return dcltbtrdcus
	 */   
	 public Dcltbtrdcus getDcltbtrdcus() {
   	return dcltbtrdcus;
   }


	/**
	 *	Returns the value of cusCurrency
	 *	@return cusCurrency
	 */
   public char[] getCusCurrency() throws CFException  {              
   		return dcltbtrdcus.getCusCurrency();
   }

  
	/**
	*  set variable cusCurrency
	*  @param value
	**/
   public void setCusCurrency(char[] value) throws CFException {
      dcltbtrdcus.setCusCurrency(value);
   } 

     /**
	 * 	Update CusCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCusCurrency(char[] source, int sourceIndex) throws CFException {
      dcltbtrdcus.setCusCurrency(source, sourceIndex);
   	
   }
   
   public void setCusCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdcus.setCusCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CusCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCusCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdcus.setCusCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CusCurrency with another Field
	 *	@param value
	 */
   public void setCusCurrency(Field source) {
      dcltbtrdcus.setCusCurrency(source);
   }  
   
     /**
	 * 	Update CusCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCusCurrency(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdcus.setCusCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CusCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCusCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdcus.setCusCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of lsCustomerId
	 *	@return lsCustomerId
	 */
   public char[] getLsCustomerId() throws CFException  {              
   		return lsCustomerIo.getLsCustomerId();
   }

  
	/**
	*  set variable lsCustomerId
	*  @param value
	**/
   public void setLsCustomerId(char[] value) throws CFException {
      lsCustomerIo.setLsCustomerId(value);
   } 

     /**
	 * 	Update LsCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsCustomerId(char[] source, int sourceIndex) throws CFException {
      lsCustomerIo.setLsCustomerId(source, sourceIndex);
   	
   }
   
   public void setLsCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsCustomerIo.setLsCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsCustomerIo.setLsCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsCustomerId with another Field
	 *	@param value
	 */
   public void setLsCustomerId(Field source) {
      lsCustomerIo.setLsCustomerId(source);
   }  
   
     /**
	 * 	Update LsCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsCustomerId(Field source, int sourceIndex,int sourceLen) {
      lsCustomerIo.setLsCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsCustomerIo.setLsCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of cusStatus
	 *	@return cusStatus
	 */
   public char[] getCusStatus() throws CFException  {              
   		return dcltbtrdcus.getCusStatus();
   }

  
	/**
	*  set variable cusStatus
	*  @param value
	**/
   public void setCusStatus(char[] value) throws CFException {
      dcltbtrdcus.setCusStatus(value);
   } 

     /**
	 * 	Update CusStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCusStatus(char[] source, int sourceIndex) throws CFException {
      dcltbtrdcus.setCusStatus(source, sourceIndex);
   	
   }
   
   public void setCusStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdcus.setCusStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CusStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCusStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdcus.setCusStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CusStatus with another Field
	 *	@param value
	 */
   public void setCusStatus(Field source) {
      dcltbtrdcus.setCusStatus(source);
   }  
   
     /**
	 * 	Update CusStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCusStatus(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdcus.setCusStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CusStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCusStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdcus.setCusStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Mstpb001Ctx getMstpb001Ctx() {
            return Mstpb001Ctx.this;
        }

        public GetCustomerOutCtx getGetCustomerOutCtx() {
            return new GetCustomerOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dcltbtrdcus.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
        str += lsCustomerIo.hashCode();
       return str.hashCode();
    }

    public GetCustomerInCtx clone() {
        GetCustomerInCtx cloneObj = new GetCustomerInCtx();
        cloneObj.dcltbtrdcus = new Dcltbtrdcus();
        cloneObj.dcltbtrdcus.set(dcltbtrdcus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.lsCustomerIo = new LsCustomerIo();
        cloneObj.lsCustomerIo.set(lsCustomerIo.getClonedField());
        return cloneObj;
    }

    }

    public GetCustomerInCtx getGetCustomerInCtx() {
            return new GetCustomerInCtx();
    }
     public class GetCustomerOutCtx implements Cloneable {
     Dcltbtrdcus dcltbtrdcus = Mstpb001Ctx.this.getDcltbtrdcus();
     Work work = Mstpb001Ctx.this.getWork();
     Sqlca sqlca = Mstpb001Ctx.this.getSqlca();
     LsCustomerIo lsCustomerIo = Mstpb001Ctx.this.getLsCustomerIo();

	/**
	 *	Returns the value of lsCustomerDescription
	 *	@return lsCustomerDescription
	 */
   public char[] getLsCustomerDescription() throws CFException  {              
   		return lsCustomerIo.getLsCustomerDescription();
   }

  
	/**
	*  set variable lsCustomerDescription
	*  @param value
	**/
   public void setLsCustomerDescription(char[] value) throws CFException {
      lsCustomerIo.setLsCustomerDescription(value);
   } 

     /**
	 * 	Update LsCustomerDescription 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsCustomerDescription(char[] source, int sourceIndex) throws CFException {
      lsCustomerIo.setLsCustomerDescription(source, sourceIndex);
   	
   }
   
   public void setLsCustomerDescription(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsCustomerIo.setLsCustomerDescription(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsCustomerDescription 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsCustomerIo.setLsCustomerDescription(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsCustomerDescription with another Field
	 *	@param value
	 */
   public void setLsCustomerDescription(Field source) {
      lsCustomerIo.setLsCustomerDescription(source);
   }  
   
     /**
	 * 	Update LsCustomerDescription 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsCustomerDescription(Field source, int sourceIndex,int sourceLen) {
      lsCustomerIo.setLsCustomerDescription(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsCustomerDescription 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsCustomerIo.setLsCustomerDescription(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "A" for isCustomerActive88()
	 *	@return  Returns true if isCustomerActive88() is "A"
	 */
   public boolean isCustomerActive88() throws CFException {
      return lsCustomerIo.isCustomerActive88();
   }

	/**
	*  set values "A"
	*/
   	public void setCustomerActive88True()  throws CFException{  			
    	lsCustomerIo.setCustomerActive88True();
   	}
	/**
	 *	Returns the value of cusDescription
	 *	@return cusDescription
	 */
   public char[] getCusDescription() throws CFException  {              
   		return dcltbtrdcus.getCusDescription();
   }

  
	/**
	*  set variable cusDescription
	*  @param value
	**/
   public void setCusDescription(char[] value) throws CFException {
      dcltbtrdcus.setCusDescription(value);
   } 

     /**
	 * 	Update CusDescription 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCusDescription(char[] source, int sourceIndex) throws CFException {
      dcltbtrdcus.setCusDescription(source, sourceIndex);
   	
   }
   
   public void setCusDescription(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdcus.setCusDescription(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CusDescription 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCusDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdcus.setCusDescription(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CusDescription with another Field
	 *	@param value
	 */
   public void setCusDescription(Field source) {
      dcltbtrdcus.setCusDescription(source);
   }  
   
     /**
	 * 	Update CusDescription 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCusDescription(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdcus.setCusDescription(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CusDescription 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCusDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdcus.setCusDescription(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dcltbtrdcus
	 *	@return dcltbtrdcus
	 */   
	 public Dcltbtrdcus getDcltbtrdcus() {
   	return dcltbtrdcus;
   }


	/**
	 *	Returns the value of cusCustomerId
	 *	@return cusCustomerId
	 */
   public char[] getCusCustomerId() throws CFException  {              
   		return dcltbtrdcus.getCusCustomerId();
   }

  
	/**
	*  set variable cusCustomerId
	*  @param value
	**/
   public void setCusCustomerId(char[] value) throws CFException {
      dcltbtrdcus.setCusCustomerId(value);
   } 

     /**
	 * 	Update CusCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCusCustomerId(char[] source, int sourceIndex) throws CFException {
      dcltbtrdcus.setCusCustomerId(source, sourceIndex);
   	
   }
   
   public void setCusCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdcus.setCusCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CusCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCusCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdcus.setCusCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CusCustomerId with another Field
	 *	@param value
	 */
   public void setCusCustomerId(Field source) {
      dcltbtrdcus.setCusCustomerId(source);
   }  
   
     /**
	 * 	Update CusCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCusCustomerId(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdcus.setCusCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CusCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCusCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdcus.setCusCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsCustomerCurrency
	 *	@return lsCustomerCurrency
	 */
   public char[] getLsCustomerCurrency() throws CFException  {              
   		return lsCustomerIo.getLsCustomerCurrency();
   }

  
	/**
	*  set variable lsCustomerCurrency
	*  @param value
	**/
   public void setLsCustomerCurrency(char[] value) throws CFException {
      lsCustomerIo.setLsCustomerCurrency(value);
   } 

     /**
	 * 	Update LsCustomerCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsCustomerCurrency(char[] source, int sourceIndex) throws CFException {
      lsCustomerIo.setLsCustomerCurrency(source, sourceIndex);
   	
   }
   
   public void setLsCustomerCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsCustomerIo.setLsCustomerCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsCustomerCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsCustomerIo.setLsCustomerCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsCustomerCurrency with another Field
	 *	@param value
	 */
   public void setLsCustomerCurrency(Field source) {
      lsCustomerIo.setLsCustomerCurrency(source);
   }  
   
     /**
	 * 	Update LsCustomerCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsCustomerCurrency(Field source, int sourceIndex,int sourceLen) {
      lsCustomerIo.setLsCustomerCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsCustomerCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsCustomerIo.setLsCustomerCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsCustomerErrorMsg
	 *	@return lsCustomerErrorMsg
	 */
   public char[] getLsCustomerErrorMsg() throws CFException  {              
   		return lsCustomerIo.getLsCustomerErrorMsg();
   }

  
	/**
	*  set variable lsCustomerErrorMsg
	*  @param value
	**/
   public void setLsCustomerErrorMsg(char[] value) throws CFException {
      lsCustomerIo.setLsCustomerErrorMsg(value);
   } 

     /**
	 * 	Update LsCustomerErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsCustomerErrorMsg(char[] source, int sourceIndex) throws CFException {
      lsCustomerIo.setLsCustomerErrorMsg(source, sourceIndex);
   	
   }
   
   public void setLsCustomerErrorMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsCustomerIo.setLsCustomerErrorMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsCustomerErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsCustomerIo.setLsCustomerErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsCustomerErrorMsg with another Field
	 *	@param value
	 */
   public void setLsCustomerErrorMsg(Field source) {
      lsCustomerIo.setLsCustomerErrorMsg(source);
   }  
   
     /**
	 * 	Update LsCustomerErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsCustomerErrorMsg(Field source, int sourceIndex,int sourceLen) {
      lsCustomerIo.setLsCustomerErrorMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsCustomerErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsCustomerIo.setLsCustomerErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Test condition "N" for isCustomerNotFound88()
	 *	@return  Returns true if isCustomerNotFound88() is "N"
	 */
   public boolean isCustomerNotFound88() throws CFException {
      return lsCustomerIo.isCustomerNotFound88();
   }

	/**
	*  set values "N"
	*/
   	public void setCustomerNotFound88True()  throws CFException{  			
    	lsCustomerIo.setCustomerNotFound88True();
   	}
	/**
	 *	Returns the value of cusCurrency
	 *	@return cusCurrency
	 */
   public char[] getCusCurrency() throws CFException  {              
   		return dcltbtrdcus.getCusCurrency();
   }

  
	/**
	*  set variable cusCurrency
	*  @param value
	**/
   public void setCusCurrency(char[] value) throws CFException {
      dcltbtrdcus.setCusCurrency(value);
   } 

     /**
	 * 	Update CusCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCusCurrency(char[] source, int sourceIndex) throws CFException {
      dcltbtrdcus.setCusCurrency(source, sourceIndex);
   	
   }
   
   public void setCusCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbtrdcus.setCusCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CusCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCusCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdcus.setCusCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CusCurrency with another Field
	 *	@param value
	 */
   public void setCusCurrency(Field source) {
      dcltbtrdcus.setCusCurrency(source);
   }  
   
     /**
	 * 	Update CusCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCusCurrency(Field source, int sourceIndex,int sourceLen) {
      dcltbtrdcus.setCusCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CusCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCusCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbtrdcus.setCusCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Test condition "I" for isCustomerInactive88()
	 *	@return  Returns true if isCustomerInactive88() is "I"
	 */
   public boolean isCustomerInactive88() throws CFException {
      return lsCustomerIo.isCustomerInactive88();
   }

	/**
	*  set values "I"
	*/
   	public void setCustomerInactive88True()  throws CFException{  			
    	lsCustomerIo.setCustomerInactive88True();
   	}
	/**
	 *	Returns the value of lsCustomerId
	 *	@return lsCustomerId
	 */
   public char[] getLsCustomerId() throws CFException  {              
   		return lsCustomerIo.getLsCustomerId();
   }

  
	/**
	*  set variable lsCustomerId
	*  @param value
	**/
   public void setLsCustomerId(char[] value) throws CFException {
      lsCustomerIo.setLsCustomerId(value);
   } 

     /**
	 * 	Update LsCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsCustomerId(char[] source, int sourceIndex) throws CFException {
      lsCustomerIo.setLsCustomerId(source, sourceIndex);
   	
   }
   
   public void setLsCustomerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsCustomerIo.setLsCustomerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsCustomerIo.setLsCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsCustomerId with another Field
	 *	@param value
	 */
   public void setLsCustomerId(Field source) {
      lsCustomerIo.setLsCustomerId(source);
   }  
   
     /**
	 * 	Update LsCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsCustomerId(Field source, int sourceIndex,int sourceLen) {
      lsCustomerIo.setLsCustomerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsCustomerIo.setLsCustomerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "S" for isCustomerException88()
	 *	@return  Returns true if isCustomerException88() is "S"
	 */
   public boolean isCustomerException88() throws CFException {
      return lsCustomerIo.isCustomerException88();
   }

	/**
	*  set values "S"
	*/
   	public void setCustomerException88True()  throws CFException{  			
    	lsCustomerIo.setCustomerException88True();
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


        public Mstpb001Ctx getMstpb001Ctx() {
            return Mstpb001Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dcltbtrdcus.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
        str += lsCustomerIo.hashCode();
       return str.hashCode();
    }

    public GetCustomerOutCtx clone() {
        GetCustomerOutCtx cloneObj = new GetCustomerOutCtx();
        cloneObj.dcltbtrdcus = new Dcltbtrdcus();
        cloneObj.dcltbtrdcus.set(dcltbtrdcus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.lsCustomerIo = new LsCustomerIo();
        cloneObj.lsCustomerIo.set(lsCustomerIo.getClonedField());
        return cloneObj;
    }

    }

    public GetCustomerOutCtx getGetCustomerOutCtx() {
            return new GetCustomerOutCtx();
    }
}
