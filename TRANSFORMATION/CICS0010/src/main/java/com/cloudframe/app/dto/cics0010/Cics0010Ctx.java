package com.cloudframe.app.dto.cics0010;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

 
import com.cloudframe.app.cics.CICSSession;
 
 


@Context
public class Cics0010Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    LsDfhcommarea lsDfhcommarea;
    DfhcommareaGroup dfhcommareaGroup;


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
    public LsDfhcommarea getLsDfhcommarea() {
        if (lsDfhcommarea == null) {
            lsDfhcommarea = new LsDfhcommarea();
        }

        return lsDfhcommarea;
    }

    public void setLsDfhcommarea(LsDfhcommarea lsDfhcommarea) {
        this.lsDfhcommarea = lsDfhcommarea;
    }
    public DfhcommareaGroup getDfhcommareaGroup() {
        if (dfhcommareaGroup == null) {
            dfhcommareaGroup = new DfhcommareaGroup();
        }

        return dfhcommareaGroup;
    }

    public void setDfhcommareaGroup(DfhcommareaGroup dfhcommareaGroup) {
        this.dfhcommareaGroup = dfhcommareaGroup;
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
        str += lsDfhcommarea.hashCode();
        str += dfhcommareaGroup.hashCode();
       return str.hashCode();
    }

    public Cics0010Ctx clone() {
        Cics0010Ctx cloneObj = new Cics0010Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lsDfhcommarea = new LsDfhcommarea();
        cloneObj.lsDfhcommarea.set(lsDfhcommarea.getClonedField());
        cloneObj.dfhcommareaGroup = new DfhcommareaGroup();
        cloneObj.dfhcommareaGroup.set(dfhcommareaGroup.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     DfhcommareaGroup dfhcommareaGroup = Cics0010Ctx.this.getDfhcommareaGroup();


        public Cics0010Ctx getCics0010Ctx() {
            return Cics0010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dfhcommareaGroup.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.dfhcommareaGroup = new DfhcommareaGroup();
        cloneObj.dfhcommareaGroup.set(dfhcommareaGroup.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainlineInCtx implements Cloneable {
     Work work = Cics0010Ctx.this.getWork();
     LsDfhcommarea lsDfhcommarea = Cics0010Ctx.this.getLsDfhcommarea();

	/**
	 *	Returns the value of lsDfhcommarea
	 *	@return lsDfhcommarea
	 */   
	 public LsDfhcommarea getLsDfhcommarea() {
   	return lsDfhcommarea;
   }


	/**
	 *	Returns the value of lsRequestType
	 *	@return lsRequestType
	 */
	public int getLsRequestType() throws CFException {        
   		return lsDfhcommarea.getLsRequestType();
	}
	
	/**
	 * 	Update LsRequestType with the passed value
	 *	@param number
	 */
	public void setLsRequestType(int number)  throws CFException{
		lsDfhcommarea.setLsRequestType(number);
	}


	public void setLsRequestType(long number)  throws CFException{
		lsDfhcommarea.setLsRequestType((int)number);
	}


	/**
	 *	Returns the value of cicsresp
	 *	@return cicsresp
	 */
	public int getCicsresp() throws CFException {        
   		return work.getCicsresp();
	}
	
	/**
	 * 	Update Cicsresp with the passed value
	 *	@param number
	 */
	public void setCicsresp(int number)  throws CFException{
		work.setCicsresp(number);
	}


	public void setCicsresp(long number)  throws CFException{
		work.setCicsresp((int)number);
	}


	/**
	 *	Returns the value of cicsresp2
	 *	@return cicsresp2
	 */
	public int getCicsresp2() throws CFException {        
   		return work.getCicsresp2();
	}
	
	/**
	 * 	Update Cicsresp2 with the passed value
	 *	@param number
	 */
	public void setCicsresp2(int number)  throws CFException{
		work.setCicsresp2(number);
	}


	public void setCicsresp2(long number)  throws CFException{
		work.setCicsresp2((int)number);
	}



        public Cics0010Ctx getCics0010Ctx() {
            return Cics0010Ctx.this;
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
        str += lsDfhcommarea.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lsDfhcommarea = new LsDfhcommarea();
        cloneObj.lsDfhcommarea.set(lsDfhcommarea.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     Work work = Cics0010Ctx.this.getWork();
     LsDfhcommarea lsDfhcommarea = Cics0010Ctx.this.getLsDfhcommarea();

	/**
	 *	Returns the value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public int getLsReturnCode() throws CFException {
   		return lsDfhcommarea.getLsReturnCode();
	}


	/**
	 *	Returns String value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public char[]  getLsReturnCodeString() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnCodeIsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnCodeIsNumeric();
	}

	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param number
	 */
	public void setLsReturnCode(int number)  throws CFException{
		lsDfhcommarea.setLsReturnCode(number);
	}
	

	public void setLsReturnCode(long number)  throws CFException{
	    lsDfhcommarea.setLsReturnCode(number);
	}
	
	
	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnCode(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnCode(value);
	}
	
	/**
	 * 	Update LsReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnCodeString(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnCode(value);
	}	

	/**
	 *	Returns the value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public long getLsReturnEibresp2() throws CFException {
   		return lsDfhcommarea.getLsReturnEibresp2();
	}


	/**
	 *	Returns String value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public char[]  getLsReturnEibresp2String() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnEibresp2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnEibresp2IsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnEibresp2IsNumeric();
	}

	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *	@param number
	 */
	public void setLsReturnEibresp2(long number)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp2(number);
	}
	

	
	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnEibresp2(value);
	}
	
	/**
	 * 	Update LsReturnEibresp2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2String(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp2(value);
	}	

	/**
	 *	Returns the value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public long getLsReturnEibresp() throws CFException {
   		return lsDfhcommarea.getLsReturnEibresp();
	}


	/**
	 *	Returns String value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public char[]  getLsReturnEibrespString() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnEibrespString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnEibrespIsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnEibrespIsNumeric();
	}

	/**
	 * 	Update LsReturnEibresp with the passed value
	 *	@param number
	 */
	public void setLsReturnEibresp(long number)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp(number);
	}
	

	
	/**
	 * 	Update LsReturnEibresp with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnEibresp(value);
	}
	
	/**
	 * 	Update LsReturnEibresp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibrespString(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp(value);
	}	


        public Cics0010Ctx getCics0010Ctx() {
            return Cics0010Ctx.this;
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
        str += lsDfhcommarea.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lsDfhcommarea = new LsDfhcommarea();
        cloneObj.lsDfhcommarea.set(lsDfhcommarea.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class GetRequestInCtx implements Cloneable {
     Work work = Cics0010Ctx.this.getWork();
     LsDfhcommarea lsDfhcommarea = Cics0010Ctx.this.getLsDfhcommarea();

	/**
	 *	Returns the value of lsRequestData
	 *	@return lsRequestData
	 */
   public char[] getLsRequestData() throws CFException  {              
   		return lsDfhcommarea.getLsRequestData();
   }

  
	/**
	*  set variable lsRequestData
	*  @param value
	**/
   public void setLsRequestData(char[] value) throws CFException {
      lsDfhcommarea.setLsRequestData(value);
   } 

     /**
	 * 	Update LsRequestData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsRequestData(char[] source, int sourceIndex) throws CFException {
      lsDfhcommarea.setLsRequestData(source, sourceIndex);
   	
   }
   
   public void setLsRequestData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsDfhcommarea.setLsRequestData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsRequestData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsDfhcommarea.setLsRequestData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsRequestData with another Field
	 *	@param value
	 */
   public void setLsRequestData(Field source) {
      lsDfhcommarea.setLsRequestData(source);
   }  
   
     /**
	 * 	Update LsRequestData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsRequestData(Field source, int sourceIndex,int sourceLen) {
      lsDfhcommarea.setLsRequestData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsRequestData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsDfhcommarea.setLsRequestData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of channelName
	 *	@return channelName
	 */
   public char[] getChannelName() throws CFException  {              
   		return work.getChannelName();
   }

  
	/**
	*  set variable channelName
	*  @param value
	**/
   public void setChannelName(char[] value) throws CFException {
      work.setChannelName(value);
   } 

	/**
	 *	Returns the value of cicsresp
	 *	@return cicsresp
	 */
	public int getCicsresp() throws CFException {        
   		return work.getCicsresp();
	}
	
	/**
	 * 	Update Cicsresp with the passed value
	 *	@param number
	 */
	public void setCicsresp(int number)  throws CFException{
		work.setCicsresp(number);
	}


	public void setCicsresp(long number)  throws CFException{
		work.setCicsresp((int)number);
	}


	/**
	 *	Returns the value of containerName
	 *	@return containerName
	 */
   public char[] getContainerName() throws CFException  {              
   		return work.getContainerName();
   }

  
	/**
	*  set variable containerName
	*  @param value
	**/
   public void setContainerName(char[] value) throws CFException {
      work.setContainerName(value);
   } 

	/**
	 *	Returns the value of cicsresp2
	 *	@return cicsresp2
	 */
	public int getCicsresp2() throws CFException {        
   		return work.getCicsresp2();
	}
	
	/**
	 * 	Update Cicsresp2 with the passed value
	 *	@param number
	 */
	public void setCicsresp2(int number)  throws CFException{
		work.setCicsresp2(number);
	}


	public void setCicsresp2(long number)  throws CFException{
		work.setCicsresp2((int)number);
	}



        public Cics0010Ctx getCics0010Ctx() {
            return Cics0010Ctx.this;
        }

        public GetRequestOutCtx getGetRequestOutCtx() {
            return new GetRequestOutCtx();
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
        str += lsDfhcommarea.hashCode();
       return str.hashCode();
    }

    public GetRequestInCtx clone() {
        GetRequestInCtx cloneObj = new GetRequestInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lsDfhcommarea = new LsDfhcommarea();
        cloneObj.lsDfhcommarea.set(lsDfhcommarea.getClonedField());
        return cloneObj;
    }

    }

    public GetRequestInCtx getGetRequestInCtx() {
            return new GetRequestInCtx();
    }
     public class GetRequestOutCtx implements Cloneable {
     Work work = Cics0010Ctx.this.getWork();
     LsDfhcommarea lsDfhcommarea = Cics0010Ctx.this.getLsDfhcommarea();

	/**
	 *	Returns the value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public int getLsReturnCode() throws CFException {
   		return lsDfhcommarea.getLsReturnCode();
	}


	/**
	 *	Returns String value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public char[]  getLsReturnCodeString() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnCodeIsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnCodeIsNumeric();
	}

	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param number
	 */
	public void setLsReturnCode(int number)  throws CFException{
		lsDfhcommarea.setLsReturnCode(number);
	}
	

	public void setLsReturnCode(long number)  throws CFException{
	    lsDfhcommarea.setLsReturnCode(number);
	}
	
	
	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnCode(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnCode(value);
	}
	
	/**
	 * 	Update LsReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnCodeString(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnCode(value);
	}	

	/**
	 *	Returns the value of containerLength
	 *	@return containerLength
	 */
	public int getContainerLength() throws CFException {        
   		return work.getContainerLength();
	}
	
	/**
	 * 	Update ContainerLength with the passed value
	 *	@param number
	 */
	public void setContainerLength(int number)  throws CFException{
		work.setContainerLength(number);
	}


	public void setContainerLength(long number)  throws CFException{
		work.setContainerLength((int)number);
	}


	/**
	 *	Returns the value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public long getLsReturnEibresp2() throws CFException {
   		return lsDfhcommarea.getLsReturnEibresp2();
	}


	/**
	 *	Returns String value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public char[]  getLsReturnEibresp2String() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnEibresp2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnEibresp2IsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnEibresp2IsNumeric();
	}

	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *	@param number
	 */
	public void setLsReturnEibresp2(long number)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp2(number);
	}
	

	
	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnEibresp2(value);
	}
	
	/**
	 * 	Update LsReturnEibresp2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2String(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp2(value);
	}	

	/**
	 *	Returns the value of cicsresp
	 *	@return cicsresp
	 */
	public int getCicsresp() throws CFException {        
   		return work.getCicsresp();
	}
	
	/**
	 * 	Update Cicsresp with the passed value
	 *	@param number
	 */
	public void setCicsresp(int number)  throws CFException{
		work.setCicsresp(number);
	}


	public void setCicsresp(long number)  throws CFException{
		work.setCicsresp((int)number);
	}


	/**
	 *	Returns the value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public long getLsReturnEibresp() throws CFException {
   		return lsDfhcommarea.getLsReturnEibresp();
	}


	/**
	 *	Returns String value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public char[]  getLsReturnEibrespString() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnEibrespString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnEibrespIsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnEibrespIsNumeric();
	}

	/**
	 * 	Update LsReturnEibresp with the passed value
	 *	@param number
	 */
	public void setLsReturnEibresp(long number)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp(number);
	}
	

	
	/**
	 * 	Update LsReturnEibresp with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnEibresp(value);
	}
	
	/**
	 * 	Update LsReturnEibresp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibrespString(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp(value);
	}	

	/**
	 *	Returns the value of cicsresp2
	 *	@return cicsresp2
	 */
	public int getCicsresp2() throws CFException {        
   		return work.getCicsresp2();
	}
	
	/**
	 * 	Update Cicsresp2 with the passed value
	 *	@param number
	 */
	public void setCicsresp2(int number)  throws CFException{
		work.setCicsresp2(number);
	}


	public void setCicsresp2(long number)  throws CFException{
		work.setCicsresp2((int)number);
	}



        public Cics0010Ctx getCics0010Ctx() {
            return Cics0010Ctx.this;
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
        str += lsDfhcommarea.hashCode();
       return str.hashCode();
    }

    public GetRequestOutCtx clone() {
        GetRequestOutCtx cloneObj = new GetRequestOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lsDfhcommarea = new LsDfhcommarea();
        cloneObj.lsDfhcommarea.set(lsDfhcommarea.getClonedField());
        return cloneObj;
    }

    }

    public GetRequestOutCtx getGetRequestOutCtx() {
            return new GetRequestOutCtx();
    }
     public class GetRequest0002InCtx implements Cloneable {
     Work work = Cics0010Ctx.this.getWork();
     LsDfhcommarea lsDfhcommarea = Cics0010Ctx.this.getLsDfhcommarea();

	/**
	 *	Returns the value of channelName
	 *	@return channelName
	 */
   public char[] getChannelName() throws CFException  {              
   		return work.getChannelName();
   }

  
	/**
	*  set variable channelName
	*  @param value
	**/
   public void setChannelName(char[] value) throws CFException {
      work.setChannelName(value);
   } 

	/**
	 *	Returns the value of requestData002
	 *	@return requestData002
	 */
   public char[] getRequestData002() throws CFException  {              
   		return work.getRequestData002();
   }

  
	/**
	*  set variable requestData002
	*  @param value
	**/
   public void setRequestData002(char[] value) throws CFException {
      work.setRequestData002(value);
   } 

	/**
	 *	Returns the value of cicsresp
	 *	@return cicsresp
	 */
	public int getCicsresp() throws CFException {        
   		return work.getCicsresp();
	}
	
	/**
	 * 	Update Cicsresp with the passed value
	 *	@param number
	 */
	public void setCicsresp(int number)  throws CFException{
		work.setCicsresp(number);
	}


	public void setCicsresp(long number)  throws CFException{
		work.setCicsresp((int)number);
	}


	/**
	 *	Returns the value of containerName
	 *	@return containerName
	 */
   public char[] getContainerName() throws CFException  {              
   		return work.getContainerName();
   }

  
	/**
	*  set variable containerName
	*  @param value
	**/
   public void setContainerName(char[] value) throws CFException {
      work.setContainerName(value);
   } 

	/**
	 *	Returns the value of cicsresp2
	 *	@return cicsresp2
	 */
	public int getCicsresp2() throws CFException {        
   		return work.getCicsresp2();
	}
	
	/**
	 * 	Update Cicsresp2 with the passed value
	 *	@param number
	 */
	public void setCicsresp2(int number)  throws CFException{
		work.setCicsresp2(number);
	}


	public void setCicsresp2(long number)  throws CFException{
		work.setCicsresp2((int)number);
	}



        public Cics0010Ctx getCics0010Ctx() {
            return Cics0010Ctx.this;
        }

        public GetRequest0002OutCtx getGetRequest0002OutCtx() {
            return new GetRequest0002OutCtx();
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
        str += lsDfhcommarea.hashCode();
       return str.hashCode();
    }

    public GetRequest0002InCtx clone() {
        GetRequest0002InCtx cloneObj = new GetRequest0002InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lsDfhcommarea = new LsDfhcommarea();
        cloneObj.lsDfhcommarea.set(lsDfhcommarea.getClonedField());
        return cloneObj;
    }

    }

    public GetRequest0002InCtx getGetRequest0002InCtx() {
            return new GetRequest0002InCtx();
    }
     public class GetRequest0002OutCtx implements Cloneable {
     Work work = Cics0010Ctx.this.getWork();
     LsDfhcommarea lsDfhcommarea = Cics0010Ctx.this.getLsDfhcommarea();

	/**
	 *	Returns the value of lsRequestData
	 *	@return lsRequestData
	 */
   public char[] getLsRequestData() throws CFException  {              
   		return lsDfhcommarea.getLsRequestData();
   }

  
	/**
	*  set variable lsRequestData
	*  @param value
	**/
   public void setLsRequestData(char[] value) throws CFException {
      lsDfhcommarea.setLsRequestData(value);
   } 

     /**
	 * 	Update LsRequestData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsRequestData(char[] source, int sourceIndex) throws CFException {
      lsDfhcommarea.setLsRequestData(source, sourceIndex);
   	
   }
   
   public void setLsRequestData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsDfhcommarea.setLsRequestData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsRequestData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsDfhcommarea.setLsRequestData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsRequestData with another Field
	 *	@param value
	 */
   public void setLsRequestData(Field source) {
      lsDfhcommarea.setLsRequestData(source);
   }  
   
     /**
	 * 	Update LsRequestData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsRequestData(Field source, int sourceIndex,int sourceLen) {
      lsDfhcommarea.setLsRequestData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsRequestData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsDfhcommarea.setLsRequestData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public int getLsReturnCode() throws CFException {
   		return lsDfhcommarea.getLsReturnCode();
	}


	/**
	 *	Returns String value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public char[]  getLsReturnCodeString() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnCodeIsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnCodeIsNumeric();
	}

	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param number
	 */
	public void setLsReturnCode(int number)  throws CFException{
		lsDfhcommarea.setLsReturnCode(number);
	}
	

	public void setLsReturnCode(long number)  throws CFException{
	    lsDfhcommarea.setLsReturnCode(number);
	}
	
	
	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnCode(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnCode(value);
	}
	
	/**
	 * 	Update LsReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnCodeString(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnCode(value);
	}	

	/**
	 *	Returns the value of containerLength
	 *	@return containerLength
	 */
	public int getContainerLength() throws CFException {        
   		return work.getContainerLength();
	}
	
	/**
	 * 	Update ContainerLength with the passed value
	 *	@param number
	 */
	public void setContainerLength(int number)  throws CFException{
		work.setContainerLength(number);
	}


	public void setContainerLength(long number)  throws CFException{
		work.setContainerLength((int)number);
	}


	/**
	 *	Returns the value of requestData002
	 *	@return requestData002
	 */
   public char[] getRequestData002() throws CFException  {              
   		return work.getRequestData002();
   }

  
	/**
	*  set variable requestData002
	*  @param value
	**/
   public void setRequestData002(char[] value) throws CFException {
      work.setRequestData002(value);
   } 

	/**
	 *	Returns the value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public long getLsReturnEibresp2() throws CFException {
   		return lsDfhcommarea.getLsReturnEibresp2();
	}


	/**
	 *	Returns String value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public char[]  getLsReturnEibresp2String() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnEibresp2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnEibresp2IsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnEibresp2IsNumeric();
	}

	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *	@param number
	 */
	public void setLsReturnEibresp2(long number)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp2(number);
	}
	

	
	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnEibresp2(value);
	}
	
	/**
	 * 	Update LsReturnEibresp2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2String(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp2(value);
	}	

	/**
	 *	Returns the value of cicsresp
	 *	@return cicsresp
	 */
	public int getCicsresp() throws CFException {        
   		return work.getCicsresp();
	}
	
	/**
	 * 	Update Cicsresp with the passed value
	 *	@param number
	 */
	public void setCicsresp(int number)  throws CFException{
		work.setCicsresp(number);
	}


	public void setCicsresp(long number)  throws CFException{
		work.setCicsresp((int)number);
	}


	/**
	 *	Returns the value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public long getLsReturnEibresp() throws CFException {
   		return lsDfhcommarea.getLsReturnEibresp();
	}


	/**
	 *	Returns String value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public char[]  getLsReturnEibrespString() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnEibrespString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnEibrespIsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnEibrespIsNumeric();
	}

	/**
	 * 	Update LsReturnEibresp with the passed value
	 *	@param number
	 */
	public void setLsReturnEibresp(long number)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp(number);
	}
	

	
	/**
	 * 	Update LsReturnEibresp with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnEibresp(value);
	}
	
	/**
	 * 	Update LsReturnEibresp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibrespString(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp(value);
	}	

	/**
	 *	Returns the value of cicsresp2
	 *	@return cicsresp2
	 */
	public int getCicsresp2() throws CFException {        
   		return work.getCicsresp2();
	}
	
	/**
	 * 	Update Cicsresp2 with the passed value
	 *	@param number
	 */
	public void setCicsresp2(int number)  throws CFException{
		work.setCicsresp2(number);
	}


	public void setCicsresp2(long number)  throws CFException{
		work.setCicsresp2((int)number);
	}



        public Cics0010Ctx getCics0010Ctx() {
            return Cics0010Ctx.this;
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
        str += lsDfhcommarea.hashCode();
       return str.hashCode();
    }

    public GetRequest0002OutCtx clone() {
        GetRequest0002OutCtx cloneObj = new GetRequest0002OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lsDfhcommarea = new LsDfhcommarea();
        cloneObj.lsDfhcommarea.set(lsDfhcommarea.getClonedField());
        return cloneObj;
    }

    }

    public GetRequest0002OutCtx getGetRequest0002OutCtx() {
            return new GetRequest0002OutCtx();
    }
     public class GetRequest0003InCtx implements Cloneable {
     Work work = Cics0010Ctx.this.getWork();
     LsDfhcommarea lsDfhcommarea = Cics0010Ctx.this.getLsDfhcommarea();

	/**
	 *	Returns the value of channelName
	 *	@return channelName
	 */
   public char[] getChannelName() throws CFException  {              
   		return work.getChannelName();
   }

  
	/**
	*  set variable channelName
	*  @param value
	**/
   public void setChannelName(char[] value) throws CFException {
      work.setChannelName(value);
   } 

	/**
	 *	Returns the value of cicsresp
	 *	@return cicsresp
	 */
	public int getCicsresp() throws CFException {        
   		return work.getCicsresp();
	}
	
	/**
	 * 	Update Cicsresp with the passed value
	 *	@param number
	 */
	public void setCicsresp(int number)  throws CFException{
		work.setCicsresp(number);
	}


	public void setCicsresp(long number)  throws CFException{
		work.setCicsresp((int)number);
	}


	/**
	 *	Returns the value of containerName
	 *	@return containerName
	 */
   public char[] getContainerName() throws CFException  {              
   		return work.getContainerName();
   }

  
	/**
	*  set variable containerName
	*  @param value
	**/
   public void setContainerName(char[] value) throws CFException {
      work.setContainerName(value);
   } 

	/**
	 *	Returns the value of ls003RequestData
	 *	@return ls003RequestData
	 */
   public char[] getLs003RequestData() throws CFException  {              
   		return work.getLs003RequestData();
   }

  
	/**
	*  set variable ls003RequestData
	*  @param value
	**/
   public void setLs003RequestData(char[] value) throws CFException {
      work.setLs003RequestData(value);
   } 

	/**
	 *	Returns the value of cicsresp2
	 *	@return cicsresp2
	 */
	public int getCicsresp2() throws CFException {        
   		return work.getCicsresp2();
	}
	
	/**
	 * 	Update Cicsresp2 with the passed value
	 *	@param number
	 */
	public void setCicsresp2(int number)  throws CFException{
		work.setCicsresp2(number);
	}


	public void setCicsresp2(long number)  throws CFException{
		work.setCicsresp2((int)number);
	}



        public Cics0010Ctx getCics0010Ctx() {
            return Cics0010Ctx.this;
        }

        public GetRequest0003OutCtx getGetRequest0003OutCtx() {
            return new GetRequest0003OutCtx();
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
        str += lsDfhcommarea.hashCode();
       return str.hashCode();
    }

    public GetRequest0003InCtx clone() {
        GetRequest0003InCtx cloneObj = new GetRequest0003InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lsDfhcommarea = new LsDfhcommarea();
        cloneObj.lsDfhcommarea.set(lsDfhcommarea.getClonedField());
        return cloneObj;
    }

    }

    public GetRequest0003InCtx getGetRequest0003InCtx() {
            return new GetRequest0003InCtx();
    }
     public class GetRequest0003OutCtx implements Cloneable {
     Work work = Cics0010Ctx.this.getWork();
     LsDfhcommarea lsDfhcommarea = Cics0010Ctx.this.getLsDfhcommarea();

	/**
	 *	Returns the value of lsRequestData
	 *	@return lsRequestData
	 */
   public char[] getLsRequestData() throws CFException  {              
   		return lsDfhcommarea.getLsRequestData();
   }

  
	/**
	*  set variable lsRequestData
	*  @param value
	**/
   public void setLsRequestData(char[] value) throws CFException {
      lsDfhcommarea.setLsRequestData(value);
   } 

     /**
	 * 	Update LsRequestData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsRequestData(char[] source, int sourceIndex) throws CFException {
      lsDfhcommarea.setLsRequestData(source, sourceIndex);
   	
   }
   
   public void setLsRequestData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsDfhcommarea.setLsRequestData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsRequestData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsDfhcommarea.setLsRequestData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsRequestData with another Field
	 *	@param value
	 */
   public void setLsRequestData(Field source) {
      lsDfhcommarea.setLsRequestData(source);
   }  
   
     /**
	 * 	Update LsRequestData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsRequestData(Field source, int sourceIndex,int sourceLen) {
      lsDfhcommarea.setLsRequestData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsRequestData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsDfhcommarea.setLsRequestData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public int getLsReturnCode() throws CFException {
   		return lsDfhcommarea.getLsReturnCode();
	}


	/**
	 *	Returns String value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public char[]  getLsReturnCodeString() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnCodeIsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnCodeIsNumeric();
	}

	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param number
	 */
	public void setLsReturnCode(int number)  throws CFException{
		lsDfhcommarea.setLsReturnCode(number);
	}
	

	public void setLsReturnCode(long number)  throws CFException{
	    lsDfhcommarea.setLsReturnCode(number);
	}
	
	
	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnCode(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnCode(value);
	}
	
	/**
	 * 	Update LsReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnCodeString(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnCode(value);
	}	

	/**
	 *	Returns the value of containerLength
	 *	@return containerLength
	 */
	public int getContainerLength() throws CFException {        
   		return work.getContainerLength();
	}
	
	/**
	 * 	Update ContainerLength with the passed value
	 *	@param number
	 */
	public void setContainerLength(int number)  throws CFException{
		work.setContainerLength(number);
	}


	public void setContainerLength(long number)  throws CFException{
		work.setContainerLength((int)number);
	}


	/**
	 *	Returns the value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public long getLsReturnEibresp2() throws CFException {
   		return lsDfhcommarea.getLsReturnEibresp2();
	}


	/**
	 *	Returns String value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public char[]  getLsReturnEibresp2String() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnEibresp2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnEibresp2IsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnEibresp2IsNumeric();
	}

	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *	@param number
	 */
	public void setLsReturnEibresp2(long number)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp2(number);
	}
	

	
	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnEibresp2(value);
	}
	
	/**
	 * 	Update LsReturnEibresp2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2String(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp2(value);
	}	

	/**
	 *	Returns the value of cicsresp
	 *	@return cicsresp
	 */
	public int getCicsresp() throws CFException {        
   		return work.getCicsresp();
	}
	
	/**
	 * 	Update Cicsresp with the passed value
	 *	@param number
	 */
	public void setCicsresp(int number)  throws CFException{
		work.setCicsresp(number);
	}


	public void setCicsresp(long number)  throws CFException{
		work.setCicsresp((int)number);
	}


	/**
	 *	Returns the value of ls003RequestData
	 *	@return ls003RequestData
	 */
   public char[] getLs003RequestData() throws CFException  {              
   		return work.getLs003RequestData();
   }

  
	/**
	*  set variable ls003RequestData
	*  @param value
	**/
   public void setLs003RequestData(char[] value) throws CFException {
      work.setLs003RequestData(value);
   } 

	/**
	 *	Returns the value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public long getLsReturnEibresp() throws CFException {
   		return lsDfhcommarea.getLsReturnEibresp();
	}


	/**
	 *	Returns String value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public char[]  getLsReturnEibrespString() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnEibrespString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnEibrespIsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnEibrespIsNumeric();
	}

	/**
	 * 	Update LsReturnEibresp with the passed value
	 *	@param number
	 */
	public void setLsReturnEibresp(long number)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp(number);
	}
	

	
	/**
	 * 	Update LsReturnEibresp with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnEibresp(value);
	}
	
	/**
	 * 	Update LsReturnEibresp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibrespString(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp(value);
	}	

	/**
	 *	Returns the value of cicsresp2
	 *	@return cicsresp2
	 */
	public int getCicsresp2() throws CFException {        
   		return work.getCicsresp2();
	}
	
	/**
	 * 	Update Cicsresp2 with the passed value
	 *	@param number
	 */
	public void setCicsresp2(int number)  throws CFException{
		work.setCicsresp2(number);
	}


	public void setCicsresp2(long number)  throws CFException{
		work.setCicsresp2((int)number);
	}



        public Cics0010Ctx getCics0010Ctx() {
            return Cics0010Ctx.this;
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
        str += lsDfhcommarea.hashCode();
       return str.hashCode();
    }

    public GetRequest0003OutCtx clone() {
        GetRequest0003OutCtx cloneObj = new GetRequest0003OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lsDfhcommarea = new LsDfhcommarea();
        cloneObj.lsDfhcommarea.set(lsDfhcommarea.getClonedField());
        return cloneObj;
    }

    }

    public GetRequest0003OutCtx getGetRequest0003OutCtx() {
            return new GetRequest0003OutCtx();
    }
}
