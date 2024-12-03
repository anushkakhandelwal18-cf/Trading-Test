package com.cloudframe.app.trdpb007;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.trdpb007.dto.Work;
import com.cloudframe.app.trdpb007.dto.PutBuffer;
import com.cloudframe.app.trdpb007.dto.Mqod;
import com.cloudframe.app.trdpb007.dto.Csq4biimMsg;
import com.cloudframe.app.trdpb007.dto.Mqpmo;
import com.cloudframe.app.trdpb007.dto.Mqmd;


@Context
public class Trdpb007Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Mqmd mqmd;
    Mqod mqod;
    Work work;
    Mqpmo mqpmo;
    PutBuffer putBuffer;


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

    boolean doNotSkipMqPutOne = true;

    public boolean getDoNotSkipMqPutOne() {
        return this.doNotSkipMqPutOne;
    }

    public void setDoNotSkipMqPutOne(boolean doNotSkipMqPutOne) {
            this.doNotSkipMqPutOne = doNotSkipMqPutOne;
        }
    boolean doNotSkipMqDisconnect = true;

    public boolean getDoNotSkipMqDisconnect() {
        return this.doNotSkipMqDisconnect;
    }

    public void setDoNotSkipMqDisconnect(boolean doNotSkipMqDisconnect) {
            this.doNotSkipMqDisconnect = doNotSkipMqDisconnect;
        }

    public Mqmd getMqmd() {
        if (mqmd == null) {
            mqmd = new Mqmd();
        }

        return mqmd;
    }

    public void setMqmd(Mqmd mqmd) {
        this.mqmd = mqmd;
    }
    public Mqod getMqod() {
        if (mqod == null) {
            mqod = new Mqod();
        }

        return mqod;
    }

    public void setMqod(Mqod mqod) {
        this.mqod = mqod;
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
    public Mqpmo getMqpmo() {
        if (mqpmo == null) {
            mqpmo = new Mqpmo();
        }

        return mqpmo;
    }

    public void setMqpmo(Mqpmo mqpmo) {
        this.mqpmo = mqpmo;
    }
    public PutBuffer getPutBuffer() {
        if (putBuffer == null) {
            putBuffer = new PutBuffer();
        }

        return putBuffer;
    }

    public void setPutBuffer(PutBuffer putBuffer) {
        this.putBuffer = putBuffer;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += mqmd.hashCode();
        str += mqod.hashCode();
        str += work.hashCode();
        str += mqpmo.hashCode();
        str += putBuffer.hashCode();
       return str.hashCode();
    }

    public Trdpb007Ctx clone() {
        Trdpb007Ctx cloneObj = new Trdpb007Ctx();
        cloneObj.mqmd = new Mqmd();
        cloneObj.mqmd.set(mqmd.getClonedField());
        cloneObj.mqod = new Mqod();
        cloneObj.mqod.set(mqod.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.mqpmo = new Mqpmo();
        cloneObj.mqpmo.set(mqpmo.getClonedField());
        cloneObj.putBuffer = new PutBuffer();
        cloneObj.putBuffer.set(putBuffer.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class GetProgramInputsOutCtx implements Cloneable {
     Work work = Trdpb007Ctx.this.getWork();

	/**
	 *	Returns the value of tradingParms
	 *	@return tradingParms
	 */
   public char[] getTradingParms() throws CFException  {              
   		return work.getTradingParms();
   }

  
	/**
	*  set variable tradingParms
	*  @param value
	**/
   public void setTradingParms(char[] value) throws CFException {
      work.setTradingParms(value);
   } 


        public Trdpb007Ctx getTrdpb007Ctx() {
            return Trdpb007Ctx.this;
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

    public GetProgramInputsOutCtx clone() {
        GetProgramInputsOutCtx cloneObj = new GetProgramInputsOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public GetProgramInputsOutCtx getGetProgramInputsOutCtx() {
            return new GetProgramInputsOutCtx();
    }
     public class MqConnectInCtx implements Cloneable {
     Work work = Trdpb007Ctx.this.getWork();

	/**
	 *	Returns the value of hconn
	 *	@return hconn
	 */
	public int getHconn() throws CFException {        
   		return work.getHconn();
	}
	
	/**
	 * 	Update Hconn with the passed value
	 *	@param number
	 */
	public void setHconn(int number)  throws CFException{
		work.setHconn(number);
	}


	public void setHconn(long number)  throws CFException{
		work.setHconn((int)number);
	}


	/**
	 *	Returns the value of mqccOk
	 *	@return mqccOk
	 */
	public int getMqccOk() throws CFException {        
   		return work.getMqccOk();
	}
	
	/**
	 * 	Update MqccOk with the passed value
	 *	@param number
	 */
	public void setMqccOk(int number)  throws CFException{
		work.setMqccOk(number);
	}


	public void setMqccOk(long number)  throws CFException{
		work.setMqccOk((int)number);
	}


	/**
	 *	Returns the value of compcode
	 *	@return compcode
	 */
	public int getCompcode() throws CFException {        
   		return work.getCompcode();
	}
	
	/**
	 * 	Update Compcode with the passed value
	 *	@param number
	 */
	public void setCompcode(int number)  throws CFException{
		work.setCompcode(number);
	}


	public void setCompcode(long number)  throws CFException{
		work.setCompcode((int)number);
	}


	/**
	 *	Returns the value of reason
	 *	@return reason
	 */
	public int getReason() throws CFException {        
   		return work.getReason();
	}
	
	/**
	 * 	Update Reason with the passed value
	 *	@param number
	 */
	public void setReason(int number)  throws CFException{
		work.setReason(number);
	}


	public void setReason(long number)  throws CFException{
		work.setReason((int)number);
	}



        public Trdpb007Ctx getTrdpb007Ctx() {
            return Trdpb007Ctx.this;
        }

        public MqConnectOutCtx getMqConnectOutCtx() {
            return new MqConnectOutCtx();
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

    public MqConnectInCtx clone() {
        MqConnectInCtx cloneObj = new MqConnectInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MqConnectInCtx getMqConnectInCtx() {
            return new MqConnectInCtx();
    }
     public class MqConnectOutCtx implements Cloneable {
     Work work = Trdpb007Ctx.this.getWork();

	/**
	 *	Returns the value of hconn
	 *	@return hconn
	 */
	public int getHconn() throws CFException {        
   		return work.getHconn();
	}
	
	/**
	 * 	Update Hconn with the passed value
	 *	@param number
	 */
	public void setHconn(int number)  throws CFException{
		work.setHconn(number);
	}


	public void setHconn(long number)  throws CFException{
		work.setHconn((int)number);
	}


	/**
	 *	Returns the value of mqm
	 *	@return mqm
	 */
   public char[] getMqm() throws CFException  {              
   		return work.getMqm();
   }

  
	/**
	*  set variable mqm
	*  @param value
	**/
   public void setMqm(char[] value) throws CFException {
      work.setMqm(value);
   } 

	/**
	 *	Returns the value of compcode
	 *	@return compcode
	 */
	public int getCompcode() throws CFException {        
   		return work.getCompcode();
	}
	
	/**
	 * 	Update Compcode with the passed value
	 *	@param number
	 */
	public void setCompcode(int number)  throws CFException{
		work.setCompcode(number);
	}


	public void setCompcode(long number)  throws CFException{
		work.setCompcode((int)number);
	}


	/**
	 *	Returns the value of reasonEdit
	 *	@return reasonEdit
	 */
   public char[] getReasonEdit() throws CFException  {              
   		return work.getReasonEdit();
   }

  
	/**
	*  set variable reasonEdit
	*  @param value
	**/
   public void setReasonEdit(char[] value) throws CFException {
      work.setReasonEdit(value);
   } 

     /**
	 * 	Update ReasonEdit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReasonEdit(char[] source, int sourceIndex) throws CFException {
      work.setReasonEdit(source, sourceIndex);
   	
   }
   
   public void setReasonEdit(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setReasonEdit(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ReasonEdit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReasonEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setReasonEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ReasonEdit with another Field
	 *	@param value
	 */
   public void setReasonEdit(Field source) {
      work.setReasonEdit(source);
   }  
   
     /**
	 * 	Update ReasonEdit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReasonEdit(Field source, int sourceIndex,int sourceLen) {
      work.setReasonEdit(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ReasonEdit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReasonEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setReasonEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of compcodeEdit
	 *	@return compcodeEdit
	 */
   public char[] getCompcodeEdit() throws CFException  {              
   		return work.getCompcodeEdit();
   }

  
	/**
	*  set variable compcodeEdit
	*  @param value
	**/
   public void setCompcodeEdit(char[] value) throws CFException {
      work.setCompcodeEdit(value);
   } 

     /**
	 * 	Update CompcodeEdit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompcodeEdit(char[] source, int sourceIndex) throws CFException {
      work.setCompcodeEdit(source, sourceIndex);
   	
   }
   
   public void setCompcodeEdit(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setCompcodeEdit(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompcodeEdit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompcodeEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setCompcodeEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompcodeEdit with another Field
	 *	@param value
	 */
   public void setCompcodeEdit(Field source) {
      work.setCompcodeEdit(source);
   }  
   
     /**
	 * 	Update CompcodeEdit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompcodeEdit(Field source, int sourceIndex,int sourceLen) {
      work.setCompcodeEdit(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompcodeEdit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompcodeEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setCompcodeEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of reason
	 *	@return reason
	 */
	public int getReason() throws CFException {        
   		return work.getReason();
	}
	
	/**
	 * 	Update Reason with the passed value
	 *	@param number
	 */
	public void setReason(int number)  throws CFException{
		work.setReason(number);
	}


	public void setReason(long number)  throws CFException{
		work.setReason((int)number);
	}



        public Trdpb007Ctx getTrdpb007Ctx() {
            return Trdpb007Ctx.this;
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

    public MqConnectOutCtx clone() {
        MqConnectOutCtx cloneObj = new MqConnectOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MqConnectOutCtx getMqConnectOutCtx() {
            return new MqConnectOutCtx();
    }
     public class MqPutOneInCtx implements Cloneable {
     Mqod mqod = Trdpb007Ctx.this.getMqod();
     Mqmd mqmd = Trdpb007Ctx.this.getMqmd();
     Work work = Trdpb007Ctx.this.getWork();
     Mqpmo mqpmo = Trdpb007Ctx.this.getMqpmo();
     PutBuffer putBuffer = Trdpb007Ctx.this.getPutBuffer();

	/**
	 *	Returns the value of mqpmoNoSyncpoint
	 *	@return mqpmoNoSyncpoint
	 */
	public int getMqpmoNoSyncpoint() throws CFException {        
   		return work.getMqpmoNoSyncpoint();
	}
	
	/**
	 * 	Update MqpmoNoSyncpoint with the passed value
	 *	@param number
	 */
	public void setMqpmoNoSyncpoint(int number)  throws CFException{
		work.setMqpmoNoSyncpoint(number);
	}


	public void setMqpmoNoSyncpoint(long number)  throws CFException{
		work.setMqpmoNoSyncpoint((int)number);
	}


	/**
	 *	Returns the value of mqod
	 *	@return mqod
	 */   
	 public Mqod getMqod() {
   	return mqod;
   }


	/**
	 *	Returns the value of mqccOk
	 *	@return mqccOk
	 */
	public int getMqccOk() throws CFException {        
   		return work.getMqccOk();
	}
	
	/**
	 * 	Update MqccOk with the passed value
	 *	@param number
	 */
	public void setMqccOk(int number)  throws CFException{
		work.setMqccOk(number);
	}


	public void setMqccOk(long number)  throws CFException{
		work.setMqccOk((int)number);
	}


	/**
	 *	Returns the value of mqmiNone
	 *	@return mqmiNone
	 */
   public char[] getMqmiNone() throws CFException  {              
   		return work.getMqmiNone();
   }

  
	/**
	*  set variable mqmiNone
	*  @param value
	**/
   public void setMqmiNone(char[] value) throws CFException {
      work.setMqmiNone(value);
   } 

	/**
	 *	Returns the value of mqciNone
	 *	@return mqciNone
	 */
   public char[] getMqciNone() throws CFException  {              
   		return work.getMqciNone();
   }

  
	/**
	*  set variable mqciNone
	*  @param value
	**/
   public void setMqciNone(char[] value) throws CFException {
      work.setMqciNone(value);
   } 

	/**
	 *	Returns the value of putBuffer
	 *	@return putBuffer
	 */   
	 public PutBuffer getPutBuffer() {
   	return putBuffer;
   }


	/**
	 *	Returns the value of mqotQ
	 *	@return mqotQ
	 */
	public int getMqotQ() throws CFException {        
   		return work.getMqotQ();
	}
	
	/**
	 * 	Update MqotQ with the passed value
	 *	@param number
	 */
	public void setMqotQ(int number)  throws CFException{
		work.setMqotQ(number);
	}


	public void setMqotQ(long number)  throws CFException{
		work.setMqotQ((int)number);
	}


	/**
	 *	Returns the value of hconn
	 *	@return hconn
	 */
	public int getHconn() throws CFException {        
   		return work.getHconn();
	}
	
	/**
	 * 	Update Hconn with the passed value
	 *	@param number
	 */
	public void setHconn(int number)  throws CFException{
		work.setHconn(number);
	}


	public void setHconn(long number)  throws CFException{
		work.setHconn((int)number);
	}


	/**
	 *	Returns the value of mqperNotPersistent
	 *	@return mqperNotPersistent
	 */
	public int getMqperNotPersistent() throws CFException {        
   		return work.getMqperNotPersistent();
	}
	
	/**
	 * 	Update MqperNotPersistent with the passed value
	 *	@param number
	 */
	public void setMqperNotPersistent(int number)  throws CFException{
		work.setMqperNotPersistent(number);
	}


	public void setMqperNotPersistent(long number)  throws CFException{
		work.setMqperNotPersistent((int)number);
	}


	/**
	 *	Returns the value of mqmd
	 *	@return mqmd
	 */   
	 public Mqmd getMqmd() {
   	return mqmd;
   }


	/**
	 *	Returns the value of tradingParms
	 *	@return tradingParms
	 */
   public char[] getTradingParms() throws CFException  {              
   		return work.getTradingParms();
   }

  
	/**
	*  set variable tradingParms
	*  @param value
	**/
   public void setTradingParms(char[] value) throws CFException {
      work.setTradingParms(value);
   } 

	/**
	 *	Returns the value of csq4biimMsg
	 *	@return csq4biimMsg
	 */   
	 public Csq4biimMsg getCsq4biimMsg() {
   	return putBuffer.getW03Csq4biim().getCsq4biimMsg();
   }

   /**
	* 	Update Csq4biimMsg with the passed value
	*	@param value
	*/
   public void setCsq4biimMsg(char[] value) throws CFException {
      putBuffer.getW03Csq4biim().setCsq4biimMsg(value);
   }   

     /**
	 * 	Update Csq4biimMsg 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCsq4biimMsg(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	putBuffer.getW03Csq4biim().setCsq4biimMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Csq4biimMsg 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	putBuffer.getW03Csq4biim().setCsq4biimMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Csq4biimMsg with another Field
	 *	@param value
	 */
   public void setCsq4biimMsg(Field source) {
   	putBuffer.getW03Csq4biim().setCsq4biimMsg(source);
   }  
   
     /**
	 * 	Update Csq4biimMsg 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCsq4biimMsg(Field source, int sourceIndex,int sourceLen) {
   	putBuffer.getW03Csq4biim().setCsq4biimMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Csq4biimMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCsq4biimMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	putBuffer.getW03Csq4biim().setCsq4biimMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mqpmo
	 *	@return mqpmo
	 */   
	 public Mqpmo getMqpmo() {
   	return mqpmo;
   }


	/**
	 *	Returns the value of compcode
	 *	@return compcode
	 */
	public int getCompcode() throws CFException {        
   		return work.getCompcode();
	}
	
	/**
	 * 	Update Compcode with the passed value
	 *	@param number
	 */
	public void setCompcode(int number)  throws CFException{
		work.setCompcode(number);
	}


	public void setCompcode(long number)  throws CFException{
		work.setCompcode((int)number);
	}


	/**
	 *	Returns the value of mqpmoDefaultContext
	 *	@return mqpmoDefaultContext
	 */
	public int getMqpmoDefaultContext() throws CFException {        
   		return work.getMqpmoDefaultContext();
	}
	
	/**
	 * 	Update MqpmoDefaultContext with the passed value
	 *	@param number
	 */
	public void setMqpmoDefaultContext(int number)  throws CFException{
		work.setMqpmoDefaultContext(number);
	}


	public void setMqpmoDefaultContext(long number)  throws CFException{
		work.setMqpmoDefaultContext((int)number);
	}


	/**
	 *	Returns the value of mqmtDatagram
	 *	@return mqmtDatagram
	 */
	public int getMqmtDatagram() throws CFException {        
   		return work.getMqmtDatagram();
	}
	
	/**
	 * 	Update MqmtDatagram with the passed value
	 *	@param number
	 */
	public void setMqmtDatagram(int number)  throws CFException{
		work.setMqmtDatagram(number);
	}


	public void setMqmtDatagram(long number)  throws CFException{
		work.setMqmtDatagram((int)number);
	}


	/**
	 *	Returns the value of reason
	 *	@return reason
	 */
	public int getReason() throws CFException {        
   		return work.getReason();
	}
	
	/**
	 * 	Update Reason with the passed value
	 *	@param number
	 */
	public void setReason(int number)  throws CFException{
		work.setReason(number);
	}


	public void setReason(long number)  throws CFException{
		work.setReason((int)number);
	}



        public Trdpb007Ctx getTrdpb007Ctx() {
            return Trdpb007Ctx.this;
        }

        public MqPutOneOutCtx getMqPutOneOutCtx() {
            return new MqPutOneOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += mqod.hashCode();
        str += mqmd.hashCode();
        str += work.hashCode();
        str += mqpmo.hashCode();
        str += putBuffer.hashCode();
       return str.hashCode();
    }

    public MqPutOneInCtx clone() {
        MqPutOneInCtx cloneObj = new MqPutOneInCtx();
        cloneObj.mqod = new Mqod();
        cloneObj.mqod.set(mqod.getClonedField());
        cloneObj.mqmd = new Mqmd();
        cloneObj.mqmd.set(mqmd.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.mqpmo = new Mqpmo();
        cloneObj.mqpmo.set(mqpmo.getClonedField());
        cloneObj.putBuffer = new PutBuffer();
        cloneObj.putBuffer.set(putBuffer.getClonedField());
        return cloneObj;
    }

    }

    public MqPutOneInCtx getMqPutOneInCtx() {
            return new MqPutOneInCtx();
    }
     public class MqPutOneOutCtx implements Cloneable {
     Mqmd mqmd = Trdpb007Ctx.this.getMqmd();
     Mqod mqod = Trdpb007Ctx.this.getMqod();
     Work work = Trdpb007Ctx.this.getWork();
     Mqpmo mqpmo = Trdpb007Ctx.this.getMqpmo();
     PutBuffer putBuffer = Trdpb007Ctx.this.getPutBuffer();

	/**
	 *	Returns the value of mqodObjecttype
	 *	@return mqodObjecttype
	 */
	public int getMqodObjecttype() throws CFException {        
   		return mqod.getMqodObjecttype();
	}
	
	/**
	 * 	Update MqodObjecttype with the passed value
	 *	@param number
	 */
	public void setMqodObjecttype(int number)  throws CFException{
		mqod.setMqodObjecttype(number);
	}


	public void setMqodObjecttype(long number)  throws CFException{
		mqod.setMqodObjecttype((int)number);
	}


	/**
	 *	Returns the value of mqotQ
	 *	@return mqotQ
	 */
	public int getMqotQ() throws CFException {        
   		return work.getMqotQ();
	}
	
	/**
	 * 	Update MqotQ with the passed value
	 *	@param number
	 */
	public void setMqotQ(int number)  throws CFException{
		work.setMqotQ(number);
	}


	public void setMqotQ(long number)  throws CFException{
		work.setMqotQ((int)number);
	}


	/**
	 *	Returns the value of mqmd
	 *	@return mqmd
	 */   
	 public Mqmd getMqmd() {
   	return mqmd;
   }


	/**
	 *	Returns the value of mqmdCorrelid
	 *	@return mqmdCorrelid
	 */
   public char[] getMqmdCorrelid() throws CFException  {              
   		return mqmd.getMqmdCorrelid();
   }

  
	/**
	*  set variable mqmdCorrelid
	*  @param value
	**/
   public void setMqmdCorrelid(char[] value) throws CFException {
      mqmd.setMqmdCorrelid(value);
   } 

     /**
	 * 	Update MqmdCorrelid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqmdCorrelid(char[] source, int sourceIndex) throws CFException {
      mqmd.setMqmdCorrelid(source, sourceIndex);
   	
   }
   
   public void setMqmdCorrelid(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      mqmd.setMqmdCorrelid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MqmdCorrelid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqmdCorrelid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mqmd.setMqmdCorrelid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MqmdCorrelid with another Field
	 *	@param value
	 */
   public void setMqmdCorrelid(Field source) {
      mqmd.setMqmdCorrelid(source);
   }  
   
     /**
	 * 	Update MqmdCorrelid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqmdCorrelid(Field source, int sourceIndex,int sourceLen) {
      mqmd.setMqmdCorrelid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MqmdCorrelid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqmdCorrelid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mqmd.setMqmdCorrelid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mqmdMsgid
	 *	@return mqmdMsgid
	 */
   public char[] getMqmdMsgid() throws CFException  {              
   		return mqmd.getMqmdMsgid();
   }

  
	/**
	*  set variable mqmdMsgid
	*  @param value
	**/
   public void setMqmdMsgid(char[] value) throws CFException {
      mqmd.setMqmdMsgid(value);
   } 

     /**
	 * 	Update MqmdMsgid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqmdMsgid(char[] source, int sourceIndex) throws CFException {
      mqmd.setMqmdMsgid(source, sourceIndex);
   	
   }
   
   public void setMqmdMsgid(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      mqmd.setMqmdMsgid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MqmdMsgid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqmdMsgid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mqmd.setMqmdMsgid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MqmdMsgid with another Field
	 *	@param value
	 */
   public void setMqmdMsgid(Field source) {
      mqmd.setMqmdMsgid(source);
   }  
   
     /**
	 * 	Update MqmdMsgid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqmdMsgid(Field source, int sourceIndex,int sourceLen) {
      mqmd.setMqmdMsgid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MqmdMsgid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqmdMsgid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mqmd.setMqmdMsgid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mqmdPriority
	 *	@return mqmdPriority
	 */
	public int getMqmdPriority() throws CFException {        
   		return mqmd.getMqmdPriority();
	}
	
	/**
	 * 	Update MqmdPriority with the passed value
	 *	@param number
	 */
	public void setMqmdPriority(int number)  throws CFException{
		mqmd.setMqmdPriority(number);
	}


	public void setMqmdPriority(long number)  throws CFException{
		mqmd.setMqmdPriority((int)number);
	}


	/**
	 *	Returns the value of compcode
	 *	@return compcode
	 */
	public int getCompcode() throws CFException {        
   		return work.getCompcode();
	}
	
	/**
	 * 	Update Compcode with the passed value
	 *	@param number
	 */
	public void setCompcode(int number)  throws CFException{
		work.setCompcode(number);
	}


	public void setCompcode(long number)  throws CFException{
		work.setCompcode((int)number);
	}


	/**
	 *	Returns the value of compcodeEdit
	 *	@return compcodeEdit
	 */
   public char[] getCompcodeEdit() throws CFException  {              
   		return work.getCompcodeEdit();
   }

  
	/**
	*  set variable compcodeEdit
	*  @param value
	**/
   public void setCompcodeEdit(char[] value) throws CFException {
      work.setCompcodeEdit(value);
   } 

     /**
	 * 	Update CompcodeEdit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompcodeEdit(char[] source, int sourceIndex) throws CFException {
      work.setCompcodeEdit(source, sourceIndex);
   	
   }
   
   public void setCompcodeEdit(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setCompcodeEdit(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompcodeEdit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompcodeEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setCompcodeEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompcodeEdit with another Field
	 *	@param value
	 */
   public void setCompcodeEdit(Field source) {
      work.setCompcodeEdit(source);
   }  
   
     /**
	 * 	Update CompcodeEdit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompcodeEdit(Field source, int sourceIndex,int sourceLen) {
      work.setCompcodeEdit(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompcodeEdit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompcodeEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setCompcodeEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mqmtDatagram
	 *	@return mqmtDatagram
	 */
	public int getMqmtDatagram() throws CFException {        
   		return work.getMqmtDatagram();
	}
	
	/**
	 * 	Update MqmtDatagram with the passed value
	 *	@param number
	 */
	public void setMqmtDatagram(int number)  throws CFException{
		work.setMqmtDatagram(number);
	}


	public void setMqmtDatagram(long number)  throws CFException{
		work.setMqmtDatagram((int)number);
	}


	/**
	 *	Returns the value of mqod
	 *	@return mqod
	 */   
	 public Mqod getMqod() {
   	return mqod;
   }


	/**
	 *	Returns the value of mqpmoOptions
	 *	@return mqpmoOptions
	 */
	public int getMqpmoOptions() throws CFException {        
   		return mqpmo.getMqpmoOptions();
	}
	
	/**
	 * 	Update MqpmoOptions with the passed value
	 *	@param number
	 */
	public void setMqpmoOptions(int number)  throws CFException{
		mqpmo.setMqpmoOptions(number);
	}


	public void setMqpmoOptions(long number)  throws CFException{
		mqpmo.setMqpmoOptions((int)number);
	}


	/**
	 *	Returns the value of mqmiNone
	 *	@return mqmiNone
	 */
   public char[] getMqmiNone() throws CFException  {              
   		return work.getMqmiNone();
   }

  
	/**
	*  set variable mqmiNone
	*  @param value
	**/
   public void setMqmiNone(char[] value) throws CFException {
      work.setMqmiNone(value);
   } 

	/**
	 *	Returns the value of mqmdMsgtype
	 *	@return mqmdMsgtype
	 */
	public int getMqmdMsgtype() throws CFException {        
   		return mqmd.getMqmdMsgtype();
	}
	
	/**
	 * 	Update MqmdMsgtype with the passed value
	 *	@param number
	 */
	public void setMqmdMsgtype(int number)  throws CFException{
		mqmd.setMqmdMsgtype(number);
	}


	public void setMqmdMsgtype(long number)  throws CFException{
		mqmd.setMqmdMsgtype((int)number);
	}


	/**
	 *	Returns the value of mqmdReplytoq
	 *	@return mqmdReplytoq
	 */
   public char[] getMqmdReplytoq() throws CFException  {              
   		return mqmd.getMqmdReplytoq();
   }

  
	/**
	*  set variable mqmdReplytoq
	*  @param value
	**/
   public void setMqmdReplytoq(char[] value) throws CFException {
      mqmd.setMqmdReplytoq(value);
   } 

     /**
	 * 	Update MqmdReplytoq 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqmdReplytoq(char[] source, int sourceIndex) throws CFException {
      mqmd.setMqmdReplytoq(source, sourceIndex);
   	
   }
   
   public void setMqmdReplytoq(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      mqmd.setMqmdReplytoq(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MqmdReplytoq 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqmdReplytoq(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mqmd.setMqmdReplytoq(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MqmdReplytoq with another Field
	 *	@param value
	 */
   public void setMqmdReplytoq(Field source) {
      mqmd.setMqmdReplytoq(source);
   }  
   
     /**
	 * 	Update MqmdReplytoq 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqmdReplytoq(Field source, int sourceIndex,int sourceLen) {
      mqmd.setMqmdReplytoq(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MqmdReplytoq 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqmdReplytoq(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mqmd.setMqmdReplytoq(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bufflen
	 *	@return bufflen
	 */
	public int getBufflen() throws CFException {        
   		return work.getBufflen();
	}
	
	/**
	 * 	Update Bufflen with the passed value
	 *	@param number
	 */
	public void setBufflen(int number)  throws CFException{
		work.setBufflen(number);
	}


	public void setBufflen(long number)  throws CFException{
		work.setBufflen((int)number);
	}


	/**
	 *	Returns the value of mqciNone
	 *	@return mqciNone
	 */
   public char[] getMqciNone() throws CFException  {              
   		return work.getMqciNone();
   }

  
	/**
	*  set variable mqciNone
	*  @param value
	**/
   public void setMqciNone(char[] value) throws CFException {
      work.setMqciNone(value);
   } 

	/**
	 *	Returns the value of putBuffer
	 *	@return putBuffer
	 */   
	 public PutBuffer getPutBuffer() {
   	return putBuffer;
   }


	/**
	 *	Returns the value of mqodObjectname
	 *	@return mqodObjectname
	 */
   public char[] getMqodObjectname() throws CFException  {              
   		return mqod.getMqodObjectname();
   }

  
	/**
	*  set variable mqodObjectname
	*  @param value
	**/
   public void setMqodObjectname(char[] value) throws CFException {
      mqod.setMqodObjectname(value);
   } 

     /**
	 * 	Update MqodObjectname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqodObjectname(char[] source, int sourceIndex) throws CFException {
      mqod.setMqodObjectname(source, sourceIndex);
   	
   }
   
   public void setMqodObjectname(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      mqod.setMqodObjectname(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MqodObjectname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqodObjectname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mqod.setMqodObjectname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MqodObjectname with another Field
	 *	@param value
	 */
   public void setMqodObjectname(Field source) {
      mqod.setMqodObjectname(source);
   }  
   
     /**
	 * 	Update MqodObjectname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqodObjectname(Field source, int sourceIndex,int sourceLen) {
      mqod.setMqodObjectname(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MqodObjectname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqodObjectname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mqod.setMqodObjectname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hconn
	 *	@return hconn
	 */
	public int getHconn() throws CFException {        
   		return work.getHconn();
	}
	
	/**
	 * 	Update Hconn with the passed value
	 *	@param number
	 */
	public void setHconn(int number)  throws CFException{
		work.setHconn(number);
	}


	public void setHconn(long number)  throws CFException{
		work.setHconn((int)number);
	}


	/**
	 *	Returns the value of mqmdReplytoqmgr
	 *	@return mqmdReplytoqmgr
	 */
   public char[] getMqmdReplytoqmgr() throws CFException  {              
   		return mqmd.getMqmdReplytoqmgr();
   }

  
	/**
	*  set variable mqmdReplytoqmgr
	*  @param value
	**/
   public void setMqmdReplytoqmgr(char[] value) throws CFException {
      mqmd.setMqmdReplytoqmgr(value);
   } 

     /**
	 * 	Update MqmdReplytoqmgr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMqmdReplytoqmgr(char[] source, int sourceIndex) throws CFException {
      mqmd.setMqmdReplytoqmgr(source, sourceIndex);
   	
   }
   
   public void setMqmdReplytoqmgr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      mqmd.setMqmdReplytoqmgr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MqmdReplytoqmgr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMqmdReplytoqmgr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mqmd.setMqmdReplytoqmgr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MqmdReplytoqmgr with another Field
	 *	@param value
	 */
   public void setMqmdReplytoqmgr(Field source) {
      mqmd.setMqmdReplytoqmgr(source);
   }  
   
     /**
	 * 	Update MqmdReplytoqmgr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMqmdReplytoqmgr(Field source, int sourceIndex,int sourceLen) {
      mqmd.setMqmdReplytoqmgr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MqmdReplytoqmgr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMqmdReplytoqmgr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mqmd.setMqmdReplytoqmgr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mqperNotPersistent
	 *	@return mqperNotPersistent
	 */
	public int getMqperNotPersistent() throws CFException {        
   		return work.getMqperNotPersistent();
	}
	
	/**
	 * 	Update MqperNotPersistent with the passed value
	 *	@param number
	 */
	public void setMqperNotPersistent(int number)  throws CFException{
		work.setMqperNotPersistent(number);
	}


	public void setMqperNotPersistent(long number)  throws CFException{
		work.setMqperNotPersistent((int)number);
	}


	/**
	 *	Returns the value of mqmdPersistence
	 *	@return mqmdPersistence
	 */
	public int getMqmdPersistence() throws CFException {        
   		return mqmd.getMqmdPersistence();
	}
	
	/**
	 * 	Update MqmdPersistence with the passed value
	 *	@param number
	 */
	public void setMqmdPersistence(int number)  throws CFException{
		mqmd.setMqmdPersistence(number);
	}


	public void setMqmdPersistence(long number)  throws CFException{
		mqmd.setMqmdPersistence((int)number);
	}


	/**
	 *	Returns the value of tradingParms
	 *	@return tradingParms
	 */
   public char[] getTradingParms() throws CFException  {              
   		return work.getTradingParms();
   }

  
	/**
	*  set variable tradingParms
	*  @param value
	**/
   public void setTradingParms(char[] value) throws CFException {
      work.setTradingParms(value);
   } 

	/**
	 *	Returns the value of mqpmo
	 *	@return mqpmo
	 */   
	 public Mqpmo getMqpmo() {
   	return mqpmo;
   }


	/**
	 *	Returns the value of reasonEdit
	 *	@return reasonEdit
	 */
   public char[] getReasonEdit() throws CFException  {              
   		return work.getReasonEdit();
   }

  
	/**
	*  set variable reasonEdit
	*  @param value
	**/
   public void setReasonEdit(char[] value) throws CFException {
      work.setReasonEdit(value);
   } 

     /**
	 * 	Update ReasonEdit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReasonEdit(char[] source, int sourceIndex) throws CFException {
      work.setReasonEdit(source, sourceIndex);
   	
   }
   
   public void setReasonEdit(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setReasonEdit(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ReasonEdit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReasonEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setReasonEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ReasonEdit with another Field
	 *	@param value
	 */
   public void setReasonEdit(Field source) {
      work.setReasonEdit(source);
   }  
   
     /**
	 * 	Update ReasonEdit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReasonEdit(Field source, int sourceIndex,int sourceLen) {
      work.setReasonEdit(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ReasonEdit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReasonEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setReasonEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of reason
	 *	@return reason
	 */
	public int getReason() throws CFException {        
   		return work.getReason();
	}
	
	/**
	 * 	Update Reason with the passed value
	 *	@param number
	 */
	public void setReason(int number)  throws CFException{
		work.setReason(number);
	}


	public void setReason(long number)  throws CFException{
		work.setReason((int)number);
	}



        public Trdpb007Ctx getTrdpb007Ctx() {
            return Trdpb007Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += mqmd.hashCode();
        str += mqod.hashCode();
        str += work.hashCode();
        str += mqpmo.hashCode();
        str += putBuffer.hashCode();
       return str.hashCode();
    }

    public MqPutOneOutCtx clone() {
        MqPutOneOutCtx cloneObj = new MqPutOneOutCtx();
        cloneObj.mqmd = new Mqmd();
        cloneObj.mqmd.set(mqmd.getClonedField());
        cloneObj.mqod = new Mqod();
        cloneObj.mqod.set(mqod.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.mqpmo = new Mqpmo();
        cloneObj.mqpmo.set(mqpmo.getClonedField());
        cloneObj.putBuffer = new PutBuffer();
        cloneObj.putBuffer.set(putBuffer.getClonedField());
        return cloneObj;
    }

    }

    public MqPutOneOutCtx getMqPutOneOutCtx() {
            return new MqPutOneOutCtx();
    }
     public class MqDisconnectInCtx implements Cloneable {
     Work work = Trdpb007Ctx.this.getWork();

	/**
	 *	Returns the value of hconn
	 *	@return hconn
	 */
	public int getHconn() throws CFException {        
   		return work.getHconn();
	}
	
	/**
	 * 	Update Hconn with the passed value
	 *	@param number
	 */
	public void setHconn(int number)  throws CFException{
		work.setHconn(number);
	}


	public void setHconn(long number)  throws CFException{
		work.setHconn((int)number);
	}


	/**
	 *	Returns the value of mqccOk
	 *	@return mqccOk
	 */
	public int getMqccOk() throws CFException {        
   		return work.getMqccOk();
	}
	
	/**
	 * 	Update MqccOk with the passed value
	 *	@param number
	 */
	public void setMqccOk(int number)  throws CFException{
		work.setMqccOk(number);
	}


	public void setMqccOk(long number)  throws CFException{
		work.setMqccOk((int)number);
	}


	/**
	 *	Returns the value of compcode
	 *	@return compcode
	 */
	public int getCompcode() throws CFException {        
   		return work.getCompcode();
	}
	
	/**
	 * 	Update Compcode with the passed value
	 *	@param number
	 */
	public void setCompcode(int number)  throws CFException{
		work.setCompcode(number);
	}


	public void setCompcode(long number)  throws CFException{
		work.setCompcode((int)number);
	}


	/**
	 *	Returns the value of reason
	 *	@return reason
	 */
	public int getReason() throws CFException {        
   		return work.getReason();
	}
	
	/**
	 * 	Update Reason with the passed value
	 *	@param number
	 */
	public void setReason(int number)  throws CFException{
		work.setReason(number);
	}


	public void setReason(long number)  throws CFException{
		work.setReason((int)number);
	}



        public Trdpb007Ctx getTrdpb007Ctx() {
            return Trdpb007Ctx.this;
        }

        public MqDisconnectOutCtx getMqDisconnectOutCtx() {
            return new MqDisconnectOutCtx();
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

    public MqDisconnectInCtx clone() {
        MqDisconnectInCtx cloneObj = new MqDisconnectInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MqDisconnectInCtx getMqDisconnectInCtx() {
            return new MqDisconnectInCtx();
    }
     public class MqDisconnectOutCtx implements Cloneable {
     Work work = Trdpb007Ctx.this.getWork();

	/**
	 *	Returns the value of hconn
	 *	@return hconn
	 */
	public int getHconn() throws CFException {        
   		return work.getHconn();
	}
	
	/**
	 * 	Update Hconn with the passed value
	 *	@param number
	 */
	public void setHconn(int number)  throws CFException{
		work.setHconn(number);
	}


	public void setHconn(long number)  throws CFException{
		work.setHconn((int)number);
	}


	/**
	 *	Returns the value of compcode
	 *	@return compcode
	 */
	public int getCompcode() throws CFException {        
   		return work.getCompcode();
	}
	
	/**
	 * 	Update Compcode with the passed value
	 *	@param number
	 */
	public void setCompcode(int number)  throws CFException{
		work.setCompcode(number);
	}


	public void setCompcode(long number)  throws CFException{
		work.setCompcode((int)number);
	}


	/**
	 *	Returns the value of reasonEdit
	 *	@return reasonEdit
	 */
   public char[] getReasonEdit() throws CFException  {              
   		return work.getReasonEdit();
   }

  
	/**
	*  set variable reasonEdit
	*  @param value
	**/
   public void setReasonEdit(char[] value) throws CFException {
      work.setReasonEdit(value);
   } 

     /**
	 * 	Update ReasonEdit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReasonEdit(char[] source, int sourceIndex) throws CFException {
      work.setReasonEdit(source, sourceIndex);
   	
   }
   
   public void setReasonEdit(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setReasonEdit(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ReasonEdit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReasonEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setReasonEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ReasonEdit with another Field
	 *	@param value
	 */
   public void setReasonEdit(Field source) {
      work.setReasonEdit(source);
   }  
   
     /**
	 * 	Update ReasonEdit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReasonEdit(Field source, int sourceIndex,int sourceLen) {
      work.setReasonEdit(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ReasonEdit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReasonEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setReasonEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of compcodeEdit
	 *	@return compcodeEdit
	 */
   public char[] getCompcodeEdit() throws CFException  {              
   		return work.getCompcodeEdit();
   }

  
	/**
	*  set variable compcodeEdit
	*  @param value
	**/
   public void setCompcodeEdit(char[] value) throws CFException {
      work.setCompcodeEdit(value);
   } 

     /**
	 * 	Update CompcodeEdit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompcodeEdit(char[] source, int sourceIndex) throws CFException {
      work.setCompcodeEdit(source, sourceIndex);
   	
   }
   
   public void setCompcodeEdit(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setCompcodeEdit(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompcodeEdit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompcodeEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setCompcodeEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompcodeEdit with another Field
	 *	@param value
	 */
   public void setCompcodeEdit(Field source) {
      work.setCompcodeEdit(source);
   }  
   
     /**
	 * 	Update CompcodeEdit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompcodeEdit(Field source, int sourceIndex,int sourceLen) {
      work.setCompcodeEdit(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompcodeEdit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompcodeEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setCompcodeEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of reason
	 *	@return reason
	 */
	public int getReason() throws CFException {        
   		return work.getReason();
	}
	
	/**
	 * 	Update Reason with the passed value
	 *	@param number
	 */
	public void setReason(int number)  throws CFException{
		work.setReason(number);
	}


	public void setReason(long number)  throws CFException{
		work.setReason((int)number);
	}



        public Trdpb007Ctx getTrdpb007Ctx() {
            return Trdpb007Ctx.this;
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

    public MqDisconnectOutCtx clone() {
        MqDisconnectOutCtx cloneObj = new MqDisconnectOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MqDisconnectOutCtx getMqDisconnectOutCtx() {
            return new MqDisconnectOutCtx();
    }
}
