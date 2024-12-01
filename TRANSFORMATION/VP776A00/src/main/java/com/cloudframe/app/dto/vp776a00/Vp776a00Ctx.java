package com.cloudframe.app.dto.vp776a00;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

 
 
 
 
 
 
 


@Context
public class Vp776a00Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    DfhcommareaGroup dfhcommareaGroup;
    PwaPointerGroup pwaPointerGroup;
    SrpSortRequestParameters srpSortRequestParameters;
    Sc2SortCompare2Group sc2SortCompare2Group;
    Work work;
    SdtSortDataTableGroup sdtSortDataTableGroup;
    Sc1SortCompare1Group sc1SortCompare1Group;


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


    public DfhcommareaGroup getDfhcommareaGroup() {
        if (dfhcommareaGroup == null) {
            dfhcommareaGroup = new DfhcommareaGroup();
        }

        return dfhcommareaGroup;
    }

    public void setDfhcommareaGroup(DfhcommareaGroup dfhcommareaGroup) {
        this.dfhcommareaGroup = dfhcommareaGroup;
    }
    public PwaPointerGroup getPwaPointerGroup() {
        if (pwaPointerGroup == null) {
            pwaPointerGroup = new PwaPointerGroup();
        }

        return pwaPointerGroup;
    }

    public void setPwaPointerGroup(PwaPointerGroup pwaPointerGroup) {
        this.pwaPointerGroup = pwaPointerGroup;
    }
    public SrpSortRequestParameters getSrpSortRequestParameters() {
        if (srpSortRequestParameters == null) {
            srpSortRequestParameters = new SrpSortRequestParameters();
        }

        return srpSortRequestParameters;
    }

    public void setSrpSortRequestParameters(SrpSortRequestParameters srpSortRequestParameters) {
        this.srpSortRequestParameters = srpSortRequestParameters;
    }
    public Sc2SortCompare2Group getSc2SortCompare2Group() {
        if (sc2SortCompare2Group == null) {
            sc2SortCompare2Group = new Sc2SortCompare2Group();
        }

        return sc2SortCompare2Group;
    }

    public void setSc2SortCompare2Group(Sc2SortCompare2Group sc2SortCompare2Group) {
        this.sc2SortCompare2Group = sc2SortCompare2Group;
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
    public SdtSortDataTableGroup getSdtSortDataTableGroup() {
        if (sdtSortDataTableGroup == null) {
            sdtSortDataTableGroup = new SdtSortDataTableGroup();
        }

        return sdtSortDataTableGroup;
    }

    public void setSdtSortDataTableGroup(SdtSortDataTableGroup sdtSortDataTableGroup) {
        this.sdtSortDataTableGroup = sdtSortDataTableGroup;
    }
    public Sc1SortCompare1Group getSc1SortCompare1Group() {
        if (sc1SortCompare1Group == null) {
            sc1SortCompare1Group = new Sc1SortCompare1Group();
        }

        return sc1SortCompare1Group;
    }

    public void setSc1SortCompare1Group(Sc1SortCompare1Group sc1SortCompare1Group) {
        this.sc1SortCompare1Group = sc1SortCompare1Group;
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
        str += pwaPointerGroup.hashCode();
        str += srpSortRequestParameters.hashCode();
        str += sc2SortCompare2Group.hashCode();
        str += work.hashCode();
        str += sdtSortDataTableGroup.hashCode();
        str += sc1SortCompare1Group.hashCode();
       return str.hashCode();
    }

    public Vp776a00Ctx clone() {
        Vp776a00Ctx cloneObj = new Vp776a00Ctx();
        cloneObj.dfhcommareaGroup = new DfhcommareaGroup();
        cloneObj.dfhcommareaGroup.set(dfhcommareaGroup.getClonedField());
        cloneObj.pwaPointerGroup = new PwaPointerGroup();
        cloneObj.pwaPointerGroup.set(pwaPointerGroup.getClonedField());
        cloneObj.srpSortRequestParameters = new SrpSortRequestParameters();
        cloneObj.srpSortRequestParameters.set(srpSortRequestParameters.getClonedField());
        cloneObj.sc2SortCompare2Group = new Sc2SortCompare2Group();
        cloneObj.sc2SortCompare2Group.set(sc2SortCompare2Group.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sdtSortDataTableGroup = new SdtSortDataTableGroup();
        cloneObj.sdtSortDataTableGroup.set(sdtSortDataTableGroup.getClonedField());
        cloneObj.sc1SortCompare1Group = new Sc1SortCompare1Group();
        cloneObj.sc1SortCompare1Group.set(sc1SortCompare1Group.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     DfhcommareaGroup dfhcommareaGroup = Vp776a00Ctx.this.getDfhcommareaGroup();
     SrpSortRequestParameters srpSortRequestParameters = Vp776a00Ctx.this.getSrpSortRequestParameters();
     SdtSortDataTableGroup sdtSortDataTableGroup = Vp776a00Ctx.this.getSdtSortDataTableGroup();


        public Vp776a00Ctx getVp776a00Ctx() {
            return Vp776a00Ctx.this;
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
        str += srpSortRequestParameters.hashCode();
        str += sdtSortDataTableGroup.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.dfhcommareaGroup = new DfhcommareaGroup();
        cloneObj.dfhcommareaGroup.set(dfhcommareaGroup.getClonedField());
        cloneObj.srpSortRequestParameters = new SrpSortRequestParameters();
        cloneObj.srpSortRequestParameters.set(srpSortRequestParameters.getClonedField());
        cloneObj.sdtSortDataTableGroup = new SdtSortDataTableGroup();
        cloneObj.sdtSortDataTableGroup.set(sdtSortDataTableGroup.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class Mainline0000OutCtx implements Cloneable {
     SrpSortRequestParameters srpSortRequestParameters = Vp776a00Ctx.this.getSrpSortRequestParameters();

	/**
	 *	Test condition "00" for isSrpGoodReturn()
	 *	@return  Returns true if isSrpGoodReturn() is "00"
	 */
   public boolean isSrpGoodReturn() throws CFException {
      return srpSortRequestParameters.isSrpGoodReturn();
   }

	/**
	*  set values "00"
	*/
   	public void setSrpGoodReturnTrue()  throws CFException{  			
    	srpSortRequestParameters.setSrpGoodReturnTrue();
   	}

        public Vp776a00Ctx getVp776a00Ctx() {
            return Vp776a00Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += srpSortRequestParameters.hashCode();
       return str.hashCode();
    }

    public Mainline0000OutCtx clone() {
        Mainline0000OutCtx cloneObj = new Mainline0000OutCtx();
        cloneObj.srpSortRequestParameters = new SrpSortRequestParameters();
        cloneObj.srpSortRequestParameters.set(srpSortRequestParameters.getClonedField());
        return cloneObj;
    }

    }

    public Mainline0000OutCtx getMainline0000OutCtx() {
            return new Mainline0000OutCtx();
    }
     public class ValidateRequest0100InCtx implements Cloneable {
     SrpSortRequestParameters srpSortRequestParameters = Vp776a00Ctx.this.getSrpSortRequestParameters();
     Sc1SortCompare1Group sc1SortCompare1Group = Vp776a00Ctx.this.getSc1SortCompare1Group();

public int getSrpKeyLength() throws CFException {  
        return srpSortRequestParameters.getSrpKeyLength();
}
	/**
	 * 	Update SrpKeyLength with the passed value
	 *	@param number
	 */
	public void setSrpKeyLength(int number)  throws CFException{
		srpSortRequestParameters.setSrpKeyLength(number);
	}


	public void setSrpKeyLength(long number)  throws CFException{
	    srpSortRequestParameters.setSrpKeyLength(number);
	}
	

	/**
	 *	Returns the value of srpSortRequestParameters
	 *	@return srpSortRequestParameters
	 */   
	 public SrpSortRequestParameters getSrpSortRequestParameters() {
   	return srpSortRequestParameters;
   }


	/**
	 *	Returns the value of srpSequence
	 *	@return srpSequence
	 */
   public char[] getSrpSequence() throws CFException  {              
   		return srpSortRequestParameters.getSrpSequence();
   }

  
	/**
	*  set variable srpSequence
	*  @param value
	**/
   public void setSrpSequence(char[] value) throws CFException {
      srpSortRequestParameters.setSrpSequence(value);
   } 

     /**
	 * 	Update SrpSequence 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrpSequence(char[] source, int sourceIndex) throws CFException {
      srpSortRequestParameters.setSrpSequence(source, sourceIndex);
   	
   }
   
   public void setSrpSequence(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      srpSortRequestParameters.setSrpSequence(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SrpSequence 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrpSequence(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      srpSortRequestParameters.setSrpSequence(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SrpSequence with another Field
	 *	@param value
	 */
   public void setSrpSequence(Field source) {
      srpSortRequestParameters.setSrpSequence(source);
   }  
   
     /**
	 * 	Update SrpSequence 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrpSequence(Field source, int sourceIndex,int sourceLen) {
      srpSortRequestParameters.setSrpSequence(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SrpSequence 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrpSequence(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      srpSortRequestParameters.setSrpSequence(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getSrpKeyStart() throws CFException {  
        return srpSortRequestParameters.getSrpKeyStart();
}
	/**
	 * 	Update SrpKeyStart with the passed value
	 *	@param number
	 */
	public void setSrpKeyStart(int number)  throws CFException{
		srpSortRequestParameters.setSrpKeyStart(number);
	}


	public void setSrpKeyStart(long number)  throws CFException{
	    srpSortRequestParameters.setSrpKeyStart(number);
	}
	

public int getSrpEntryLength() throws CFException {  
        return srpSortRequestParameters.getSrpEntryLength();
}
	/**
	 * 	Update SrpEntryLength with the passed value
	 *	@param number
	 */
	public void setSrpEntryLength(int number)  throws CFException{
		srpSortRequestParameters.setSrpEntryLength(number);
	}


	public void setSrpEntryLength(long number)  throws CFException{
	    srpSortRequestParameters.setSrpEntryLength(number);
	}
	

	/**
	 *	Returns the value of sc1SortCompare1
	 *	@return sc1SortCompare1
	 */
   public char[] getSc1SortCompare1() throws CFException  {              
   		return sc1SortCompare1Group.getSc1SortCompare1();
   }

  
	/**
	*  set variable sc1SortCompare1
	*  @param value
	**/
   public void setSc1SortCompare1(char[] value) throws CFException {
      sc1SortCompare1Group.setSc1SortCompare1(value);
   } 

     /**
	 * 	Update Sc1SortCompare1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSc1SortCompare1(char[] source, int sourceIndex) throws CFException {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex);
   	
   }
   
   public void setSc1SortCompare1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSc1SortCompare1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sc1SortCompare1 with another Field
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source) {
      sc1SortCompare1Group.setSc1SortCompare1(source);
   }  
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source, int sourceIndex,int sourceLen) {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getSrpEntryCount() throws CFException {  
        return srpSortRequestParameters.getSrpEntryCount();
}
	/**
	 * 	Update SrpEntryCount with the passed value
	 *	@param number
	 */
	public void setSrpEntryCount(int number)  throws CFException{
		srpSortRequestParameters.setSrpEntryCount(number);
	}


	public void setSrpEntryCount(long number)  throws CFException{
	    srpSortRequestParameters.setSrpEntryCount(number);
	}
	


        public Vp776a00Ctx getVp776a00Ctx() {
            return Vp776a00Ctx.this;
        }

        public ValidateRequest0100OutCtx getValidateRequest0100OutCtx() {
            return new ValidateRequest0100OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += srpSortRequestParameters.hashCode();
        str += sc1SortCompare1Group.hashCode();
       return str.hashCode();
    }

    public ValidateRequest0100InCtx clone() {
        ValidateRequest0100InCtx cloneObj = new ValidateRequest0100InCtx();
        cloneObj.srpSortRequestParameters = new SrpSortRequestParameters();
        cloneObj.srpSortRequestParameters.set(srpSortRequestParameters.getClonedField());
        cloneObj.sc1SortCompare1Group = new Sc1SortCompare1Group();
        cloneObj.sc1SortCompare1Group.set(sc1SortCompare1Group.getClonedField());
        return cloneObj;
    }

    }

    public ValidateRequest0100InCtx getValidateRequest0100InCtx() {
            return new ValidateRequest0100InCtx();
    }
     public class ValidateRequest0100OutCtx implements Cloneable {
     SrpSortRequestParameters srpSortRequestParameters = Vp776a00Ctx.this.getSrpSortRequestParameters();
     Sc1SortCompare1Group sc1SortCompare1Group = Vp776a00Ctx.this.getSc1SortCompare1Group();

	/**
	 *	Test condition "03" for isSrpEntryLengthError()
	 *	@return  Returns true if isSrpEntryLengthError() is "03"
	 */
   public boolean isSrpEntryLengthError() throws CFException {
      return srpSortRequestParameters.isSrpEntryLengthError();
   }

	/**
	*  set values "03"
	*/
   	public void setSrpEntryLengthErrorTrue()  throws CFException{  			
    	srpSortRequestParameters.setSrpEntryLengthErrorTrue();
   	}
	/**
	 *	Test condition "02" for isSrpCountError()
	 *	@return  Returns true if isSrpCountError() is "02"
	 */
   public boolean isSrpCountError() throws CFException {
      return srpSortRequestParameters.isSrpCountError();
   }

	/**
	*  set values "02"
	*/
   	public void setSrpCountErrorTrue()  throws CFException{  			
    	srpSortRequestParameters.setSrpCountErrorTrue();
   	}
	/**
	 *	Test condition "04" for isSrpKeyStartError()
	 *	@return  Returns true if isSrpKeyStartError() is "04"
	 */
   public boolean isSrpKeyStartError() throws CFException {
      return srpSortRequestParameters.isSrpKeyStartError();
   }

	/**
	*  set values "04"
	*/
   	public void setSrpKeyStartErrorTrue()  throws CFException{  			
    	srpSortRequestParameters.setSrpKeyStartErrorTrue();
   	}
	/**
	 *	Test condition "05" for isSrpKeyLengthError()
	 *	@return  Returns true if isSrpKeyLengthError() is "05"
	 */
   public boolean isSrpKeyLengthError() throws CFException {
      return srpSortRequestParameters.isSrpKeyLengthError();
   }

	/**
	*  set values "05"
	*/
   	public void setSrpKeyLengthErrorTrue()  throws CFException{  			
    	srpSortRequestParameters.setSrpKeyLengthErrorTrue();
   	}
	/**
	 *	Test condition "06" for isSrpSequenceError()
	 *	@return  Returns true if isSrpSequenceError() is "06"
	 */
   public boolean isSrpSequenceError() throws CFException {
      return srpSortRequestParameters.isSrpSequenceError();
   }

	/**
	*  set values "06"
	*/
   	public void setSrpSequenceErrorTrue()  throws CFException{  			
    	srpSortRequestParameters.setSrpSequenceErrorTrue();
   	}

        public Vp776a00Ctx getVp776a00Ctx() {
            return Vp776a00Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += srpSortRequestParameters.hashCode();
        str += sc1SortCompare1Group.hashCode();
       return str.hashCode();
    }

    public ValidateRequest0100OutCtx clone() {
        ValidateRequest0100OutCtx cloneObj = new ValidateRequest0100OutCtx();
        cloneObj.srpSortRequestParameters = new SrpSortRequestParameters();
        cloneObj.srpSortRequestParameters.set(srpSortRequestParameters.getClonedField());
        cloneObj.sc1SortCompare1Group = new Sc1SortCompare1Group();
        cloneObj.sc1SortCompare1Group.set(sc1SortCompare1Group.getClonedField());
        return cloneObj;
    }

    }

    public ValidateRequest0100OutCtx getValidateRequest0100OutCtx() {
            return new ValidateRequest0100OutCtx();
    }
     public class SortTheTable0200InCtx implements Cloneable {
     PwaPointerGroup pwaPointerGroup = Vp776a00Ctx.this.getPwaPointerGroup();
     Sc2SortCompare2Group sc2SortCompare2Group = Vp776a00Ctx.this.getSc2SortCompare2Group();
     SrpSortRequestParameters srpSortRequestParameters = Vp776a00Ctx.this.getSrpSortRequestParameters();
     Work work = Vp776a00Ctx.this.getWork();
     SdtSortDataTableGroup sdtSortDataTableGroup = Vp776a00Ctx.this.getSdtSortDataTableGroup();
     Sc1SortCompare1Group sc1SortCompare1Group = Vp776a00Ctx.this.getSc1SortCompare1Group();

	/**
	 *	Returns the value of pwaSub1
	 *	@return pwaSub1
	 */
	public short getPwaSub1() throws CFException {        
   		return work.getPwaSub1();
	}
	
	/**
	 * 	Update PwaSub1 with the passed value
	 *	@param number
	 */
	public void setPwaSub1(short number)  throws CFException{
		work.setPwaSub1(number);
	}

	public void setPwaSub1(int number)  throws CFException{
		work.setPwaSub1((short)number);
	}

	public void setPwaSub1(long number)  throws CFException{
		work.setPwaSub1((short)number);
	}



	/**
	 *	Returns the value of sc2SortCompare2Group
	 *	@return sc2SortCompare2Group
	 */   
	 public Sc2SortCompare2Group getSc2SortCompare2Group() {
   	return sc2SortCompare2Group;
   }


	/**
	 *	Returns the value of pwaLimit
	 *	@return pwaLimit
	 */
	public short getPwaLimit() throws CFException {        
   		return work.getPwaLimit();
	}
	
	/**
	 * 	Update PwaLimit with the passed value
	 *	@param number
	 */
	public void setPwaLimit(short number)  throws CFException{
		work.setPwaLimit(number);
	}

	public void setPwaLimit(int number)  throws CFException{
		work.setPwaLimit((short)number);
	}

	public void setPwaLimit(long number)  throws CFException{
		work.setPwaLimit((short)number);
	}



	/**
	 *	Returns the value of srpSequence
	 *	@return srpSequence
	 */
   public char[] getSrpSequence() throws CFException  {              
   		return srpSortRequestParameters.getSrpSequence();
   }

  
	/**
	*  set variable srpSequence
	*  @param value
	**/
   public void setSrpSequence(char[] value) throws CFException {
      srpSortRequestParameters.setSrpSequence(value);
   } 

     /**
	 * 	Update SrpSequence 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrpSequence(char[] source, int sourceIndex) throws CFException {
      srpSortRequestParameters.setSrpSequence(source, sourceIndex);
   	
   }
   
   public void setSrpSequence(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      srpSortRequestParameters.setSrpSequence(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SrpSequence 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrpSequence(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      srpSortRequestParameters.setSrpSequence(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SrpSequence with another Field
	 *	@param value
	 */
   public void setSrpSequence(Field source) {
      srpSortRequestParameters.setSrpSequence(source);
   }  
   
     /**
	 * 	Update SrpSequence 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrpSequence(Field source, int sourceIndex,int sourceLen) {
      srpSortRequestParameters.setSrpSequence(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SrpSequence 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrpSequence(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      srpSortRequestParameters.setSrpSequence(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getSrpEntryLength() throws CFException {  
        return srpSortRequestParameters.getSrpEntryLength();
}
	/**
	 * 	Update SrpEntryLength with the passed value
	 *	@param number
	 */
	public void setSrpEntryLength(int number)  throws CFException{
		srpSortRequestParameters.setSrpEntryLength(number);
	}


	public void setSrpEntryLength(long number)  throws CFException{
	    srpSortRequestParameters.setSrpEntryLength(number);
	}
	

	/**
	 *	Returns the value of pwaSortGap
	 *	@return pwaSortGap
	 */
	public short getPwaSortGap() throws CFException {        
   		return work.getPwaSortGap();
	}
	
	/**
	 * 	Update PwaSortGap with the passed value
	 *	@param number
	 */
	public void setPwaSortGap(short number)  throws CFException{
		work.setPwaSortGap(number);
	}

	public void setPwaSortGap(int number)  throws CFException{
		work.setPwaSortGap((short)number);
	}

	public void setPwaSortGap(long number)  throws CFException{
		work.setPwaSortGap((short)number);
	}



public int getSrpEntryCount() throws CFException {  
        return srpSortRequestParameters.getSrpEntryCount();
}
	/**
	 * 	Update SrpEntryCount with the passed value
	 *	@param number
	 */
	public void setSrpEntryCount(int number)  throws CFException{
		srpSortRequestParameters.setSrpEntryCount(number);
	}


	public void setSrpEntryCount(long number)  throws CFException{
	    srpSortRequestParameters.setSrpEntryCount(number);
	}
	

	/**
	 *	Returns the value of sdtSortDataTableGroup
	 *	@return sdtSortDataTableGroup
	 */   
	 public SdtSortDataTableGroup getSdtSortDataTableGroup() {
   	return sdtSortDataTableGroup;
   }


	/**
	 *	Returns the value of sc1SortCompare1Group
	 *	@return sc1SortCompare1Group
	 */   
	 public Sc1SortCompare1Group getSc1SortCompare1Group() {
   	return sc1SortCompare1Group;
   }


	/**
	 *	Returns the value of sdtSortDataTable
	 *	@return sdtSortDataTable
	 */
   public char[] getSdtSortDataTable() throws CFException  {              
   		return sdtSortDataTableGroup.getSdtSortDataTable();
   }

  
	/**
	*  set variable sdtSortDataTable
	*  @param value
	**/
   public void setSdtSortDataTable(char[] value) throws CFException {
      sdtSortDataTableGroup.setSdtSortDataTable(value);
   } 

     /**
	 * 	Update SdtSortDataTable 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSdtSortDataTable(char[] source, int sourceIndex) throws CFException {
      sdtSortDataTableGroup.setSdtSortDataTable(source, sourceIndex);
   	
   }
   
   public void setSdtSortDataTable(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sdtSortDataTableGroup.setSdtSortDataTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SdtSortDataTable 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSdtSortDataTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sdtSortDataTableGroup.setSdtSortDataTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SdtSortDataTable with another Field
	 *	@param value
	 */
   public void setSdtSortDataTable(Field source) {
      sdtSortDataTableGroup.setSdtSortDataTable(source);
   }  
   
     /**
	 * 	Update SdtSortDataTable 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSdtSortDataTable(Field source, int sourceIndex,int sourceLen) {
      sdtSortDataTableGroup.setSdtSortDataTable(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SdtSortDataTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSdtSortDataTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sdtSortDataTableGroup.setSdtSortDataTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pwaAddress
	 *	@return pwaAddress
	 */
	public int getPwaAddress() throws CFException {        
   		return pwaPointerGroup.getPwaAddress();
	}
	
	/**
	 * 	Update PwaAddress with the passed value
	 *	@param number
	 */
	public void setPwaAddress(int number)  throws CFException{
		pwaPointerGroup.setPwaAddress(number);
	}


	public void setPwaAddress(long number)  throws CFException{
		pwaPointerGroup.setPwaAddress((int)number);
	}



        public Vp776a00Ctx getVp776a00Ctx() {
            return Vp776a00Ctx.this;
        }

        public SortTheTable0200OutCtx getSortTheTable0200OutCtx() {
            return new SortTheTable0200OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += pwaPointerGroup.hashCode();
        str += sc2SortCompare2Group.hashCode();
        str += srpSortRequestParameters.hashCode();
        str += work.hashCode();
        str += sdtSortDataTableGroup.hashCode();
        str += sc1SortCompare1Group.hashCode();
       return str.hashCode();
    }

    public SortTheTable0200InCtx clone() {
        SortTheTable0200InCtx cloneObj = new SortTheTable0200InCtx();
        cloneObj.pwaPointerGroup = new PwaPointerGroup();
        cloneObj.pwaPointerGroup.set(pwaPointerGroup.getClonedField());
        cloneObj.sc2SortCompare2Group = new Sc2SortCompare2Group();
        cloneObj.sc2SortCompare2Group.set(sc2SortCompare2Group.getClonedField());
        cloneObj.srpSortRequestParameters = new SrpSortRequestParameters();
        cloneObj.srpSortRequestParameters.set(srpSortRequestParameters.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sdtSortDataTableGroup = new SdtSortDataTableGroup();
        cloneObj.sdtSortDataTableGroup.set(sdtSortDataTableGroup.getClonedField());
        cloneObj.sc1SortCompare1Group = new Sc1SortCompare1Group();
        cloneObj.sc1SortCompare1Group.set(sc1SortCompare1Group.getClonedField());
        return cloneObj;
    }

    }

    public SortTheTable0200InCtx getSortTheTable0200InCtx() {
            return new SortTheTable0200InCtx();
    }
     public class SortTheTable0200OutCtx implements Cloneable {
     PwaPointerGroup pwaPointerGroup = Vp776a00Ctx.this.getPwaPointerGroup();
     SrpSortRequestParameters srpSortRequestParameters = Vp776a00Ctx.this.getSrpSortRequestParameters();
     Sc2SortCompare2Group sc2SortCompare2Group = Vp776a00Ctx.this.getSc2SortCompare2Group();
     Work work = Vp776a00Ctx.this.getWork();
     SdtSortDataTableGroup sdtSortDataTableGroup = Vp776a00Ctx.this.getSdtSortDataTableGroup();
     Sc1SortCompare1Group sc1SortCompare1Group = Vp776a00Ctx.this.getSc1SortCompare1Group();

	/**
	 *	Returns the value of pwaSub2
	 *	@return pwaSub2
	 */
	public short getPwaSub2() throws CFException {        
   		return work.getPwaSub2();
	}
	
	/**
	 * 	Update PwaSub2 with the passed value
	 *	@param number
	 */
	public void setPwaSub2(short number)  throws CFException{
		work.setPwaSub2(number);
	}

	public void setPwaSub2(int number)  throws CFException{
		work.setPwaSub2((short)number);
	}

	public void setPwaSub2(long number)  throws CFException{
		work.setPwaSub2((short)number);
	}



	/**
	 *	Test condition "C" for isPwaSortComplete()
	 *	@return  Returns true if isPwaSortComplete() is "C"
	 */
   public boolean isPwaSortComplete() throws CFException {
      return work.isPwaSortComplete();
   }

	/**
	*  set values "C"
	*/
   	public void setPwaSortCompleteTrue()  throws CFException{  			
    	work.setPwaSortCompleteTrue();
   	}
	/**
	 *	Returns the value of pwaSub1
	 *	@return pwaSub1
	 */
	public short getPwaSub1() throws CFException {        
   		return work.getPwaSub1();
	}
	
	/**
	 * 	Update PwaSub1 with the passed value
	 *	@param number
	 */
	public void setPwaSub1(short number)  throws CFException{
		work.setPwaSub1(number);
	}

	public void setPwaSub1(int number)  throws CFException{
		work.setPwaSub1((short)number);
	}

	public void setPwaSub1(long number)  throws CFException{
		work.setPwaSub1((short)number);
	}



	/**
	 *	Returns the value of pwaLimit
	 *	@return pwaLimit
	 */
	public short getPwaLimit() throws CFException {        
   		return work.getPwaLimit();
	}
	
	/**
	 * 	Update PwaLimit with the passed value
	 *	@param number
	 */
	public void setPwaLimit(short number)  throws CFException{
		work.setPwaLimit(number);
	}

	public void setPwaLimit(int number)  throws CFException{
		work.setPwaLimit((short)number);
	}

	public void setPwaLimit(long number)  throws CFException{
		work.setPwaLimit((short)number);
	}



	/**
	 *	Returns the value of pwaPointer
	 *	@return pwaPointer
	 */
	public int getPwaPointer() throws CFException {        
   		return pwaPointerGroup.getPwaPointer();
	}
	
	/**
	 * 	Update PwaPointer with the passed value
	 *	@param number
	 */
	public void setPwaPointer(int number)  throws CFException{
		pwaPointerGroup.setPwaPointer(number);
	}


	public void setPwaPointer(long number)  throws CFException{
		pwaPointerGroup.setPwaPointer((int)number);
	}


	/**
	 *	Test condition "I" for isPwaSortIncomplete()
	 *	@return  Returns true if isPwaSortIncomplete() is "I"
	 */
   public boolean isPwaSortIncomplete() throws CFException {
      return work.isPwaSortIncomplete();
   }

	/**
	*  set values "I"
	*/
   	public void setPwaSortIncompleteTrue()  throws CFException{  			
    	work.setPwaSortIncompleteTrue();
   	}
	/**
	 *	Returns the value of sc1SortCompare1
	 *	@return sc1SortCompare1
	 */
   public char[] getSc1SortCompare1() throws CFException  {              
   		return sc1SortCompare1Group.getSc1SortCompare1();
   }

  
	/**
	*  set variable sc1SortCompare1
	*  @param value
	**/
   public void setSc1SortCompare1(char[] value) throws CFException {
      sc1SortCompare1Group.setSc1SortCompare1(value);
   } 

     /**
	 * 	Update Sc1SortCompare1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSc1SortCompare1(char[] source, int sourceIndex) throws CFException {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex);
   	
   }
   
   public void setSc1SortCompare1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSc1SortCompare1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sc1SortCompare1 with another Field
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source) {
      sc1SortCompare1Group.setSc1SortCompare1(source);
   }  
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source, int sourceIndex,int sourceLen) {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sc2SortCompare2
	 *	@return sc2SortCompare2
	 */
   public char[] getSc2SortCompare2() throws CFException  {              
   		return sc2SortCompare2Group.getSc2SortCompare2();
   }

  
	/**
	*  set variable sc2SortCompare2
	*  @param value
	**/
   public void setSc2SortCompare2(char[] value) throws CFException {
      sc2SortCompare2Group.setSc2SortCompare2(value);
   } 

     /**
	 * 	Update Sc2SortCompare2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSc2SortCompare2(char[] source, int sourceIndex) throws CFException {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex);
   	
   }
   
   public void setSc2SortCompare2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sc2SortCompare2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSc2SortCompare2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sc2SortCompare2 with another Field
	 *	@param value
	 */
   public void setSc2SortCompare2(Field source) {
      sc2SortCompare2Group.setSc2SortCompare2(source);
   }  
   
     /**
	 * 	Update Sc2SortCompare2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSc2SortCompare2(Field source, int sourceIndex,int sourceLen) {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sc2SortCompare2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSc2SortCompare2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pwaSortGap
	 *	@return pwaSortGap
	 */
	public short getPwaSortGap() throws CFException {        
   		return work.getPwaSortGap();
	}
	
	/**
	 * 	Update PwaSortGap with the passed value
	 *	@param number
	 */
	public void setPwaSortGap(short number)  throws CFException{
		work.setPwaSortGap(number);
	}

	public void setPwaSortGap(int number)  throws CFException{
		work.setPwaSortGap((short)number);
	}

	public void setPwaSortGap(long number)  throws CFException{
		work.setPwaSortGap((short)number);
	}



public int getSrpEntryCount() throws CFException {  
        return srpSortRequestParameters.getSrpEntryCount();
}
	/**
	 * 	Update SrpEntryCount with the passed value
	 *	@param number
	 */
	public void setSrpEntryCount(int number)  throws CFException{
		srpSortRequestParameters.setSrpEntryCount(number);
	}


	public void setSrpEntryCount(long number)  throws CFException{
	    srpSortRequestParameters.setSrpEntryCount(number);
	}
	

	/**
	 *	Returns the value of pwaAddress
	 *	@return pwaAddress
	 */
	public int getPwaAddress() throws CFException {        
   		return pwaPointerGroup.getPwaAddress();
	}
	
	/**
	 * 	Update PwaAddress with the passed value
	 *	@param number
	 */
	public void setPwaAddress(int number)  throws CFException{
		pwaPointerGroup.setPwaAddress(number);
	}


	public void setPwaAddress(long number)  throws CFException{
		pwaPointerGroup.setPwaAddress((int)number);
	}



        public Vp776a00Ctx getVp776a00Ctx() {
            return Vp776a00Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += pwaPointerGroup.hashCode();
        str += srpSortRequestParameters.hashCode();
        str += sc2SortCompare2Group.hashCode();
        str += work.hashCode();
        str += sdtSortDataTableGroup.hashCode();
        str += sc1SortCompare1Group.hashCode();
       return str.hashCode();
    }

    public SortTheTable0200OutCtx clone() {
        SortTheTable0200OutCtx cloneObj = new SortTheTable0200OutCtx();
        cloneObj.pwaPointerGroup = new PwaPointerGroup();
        cloneObj.pwaPointerGroup.set(pwaPointerGroup.getClonedField());
        cloneObj.srpSortRequestParameters = new SrpSortRequestParameters();
        cloneObj.srpSortRequestParameters.set(srpSortRequestParameters.getClonedField());
        cloneObj.sc2SortCompare2Group = new Sc2SortCompare2Group();
        cloneObj.sc2SortCompare2Group.set(sc2SortCompare2Group.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sdtSortDataTableGroup = new SdtSortDataTableGroup();
        cloneObj.sdtSortDataTableGroup.set(sdtSortDataTableGroup.getClonedField());
        cloneObj.sc1SortCompare1Group = new Sc1SortCompare1Group();
        cloneObj.sc1SortCompare1Group.set(sc1SortCompare1Group.getClonedField());
        return cloneObj;
    }

    }

    public SortTheTable0200OutCtx getSortTheTable0200OutCtx() {
            return new SortTheTable0200OutCtx();
    }
     public class CompareAscending0300InCtx implements Cloneable {
     Sc2SortCompare2Group sc2SortCompare2Group = Vp776a00Ctx.this.getSc2SortCompare2Group();
     SrpSortRequestParameters srpSortRequestParameters = Vp776a00Ctx.this.getSrpSortRequestParameters();
     Work work = Vp776a00Ctx.this.getWork();
     Sc1SortCompare1Group sc1SortCompare1Group = Vp776a00Ctx.this.getSc1SortCompare1Group();

	/**
	 *	Returns the value of pwaSwapEntry
	 *	@return pwaSwapEntry
	 */
   public char[] getPwaSwapEntry() throws CFException  {              
   		return work.getPwaSwapEntry();
   }

  
	/**
	*  set variable pwaSwapEntry
	*  @param value
	**/
   public void setPwaSwapEntry(char[] value) throws CFException {
      work.setPwaSwapEntry(value);
   } 

public int getSrpKeyLength() throws CFException {  
        return srpSortRequestParameters.getSrpKeyLength();
}
	/**
	 * 	Update SrpKeyLength with the passed value
	 *	@param number
	 */
	public void setSrpKeyLength(int number)  throws CFException{
		srpSortRequestParameters.setSrpKeyLength(number);
	}


	public void setSrpKeyLength(long number)  throws CFException{
	    srpSortRequestParameters.setSrpKeyLength(number);
	}
	

	/**
	 *	Returns the value of sc2SortCompare2Group
	 *	@return sc2SortCompare2Group
	 */   
	 public Sc2SortCompare2Group getSc2SortCompare2Group() {
   	return sc2SortCompare2Group;
   }


public int getSrpKeyStart() throws CFException {  
        return srpSortRequestParameters.getSrpKeyStart();
}
	/**
	 * 	Update SrpKeyStart with the passed value
	 *	@param number
	 */
	public void setSrpKeyStart(int number)  throws CFException{
		srpSortRequestParameters.setSrpKeyStart(number);
	}


	public void setSrpKeyStart(long number)  throws CFException{
	    srpSortRequestParameters.setSrpKeyStart(number);
	}
	

public int getSrpEntryLength() throws CFException {  
        return srpSortRequestParameters.getSrpEntryLength();
}
	/**
	 * 	Update SrpEntryLength with the passed value
	 *	@param number
	 */
	public void setSrpEntryLength(int number)  throws CFException{
		srpSortRequestParameters.setSrpEntryLength(number);
	}


	public void setSrpEntryLength(long number)  throws CFException{
	    srpSortRequestParameters.setSrpEntryLength(number);
	}
	

	/**
	 *	Returns the value of sc2SortCompare2
	 *	@return sc2SortCompare2
	 */
   public char[] getSc2SortCompare2() throws CFException  {              
   		return sc2SortCompare2Group.getSc2SortCompare2();
   }

  
	/**
	*  set variable sc2SortCompare2
	*  @param value
	**/
   public void setSc2SortCompare2(char[] value) throws CFException {
      sc2SortCompare2Group.setSc2SortCompare2(value);
   } 

     /**
	 * 	Update Sc2SortCompare2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSc2SortCompare2(char[] source, int sourceIndex) throws CFException {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex);
   	
   }
   
   public void setSc2SortCompare2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sc2SortCompare2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSc2SortCompare2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sc2SortCompare2 with another Field
	 *	@param value
	 */
   public void setSc2SortCompare2(Field source) {
      sc2SortCompare2Group.setSc2SortCompare2(source);
   }  
   
     /**
	 * 	Update Sc2SortCompare2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSc2SortCompare2(Field source, int sourceIndex,int sourceLen) {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sc2SortCompare2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSc2SortCompare2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sc1SortCompare1
	 *	@return sc1SortCompare1
	 */
   public char[] getSc1SortCompare1() throws CFException  {              
   		return sc1SortCompare1Group.getSc1SortCompare1();
   }

  
	/**
	*  set variable sc1SortCompare1
	*  @param value
	**/
   public void setSc1SortCompare1(char[] value) throws CFException {
      sc1SortCompare1Group.setSc1SortCompare1(value);
   } 

     /**
	 * 	Update Sc1SortCompare1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSc1SortCompare1(char[] source, int sourceIndex) throws CFException {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex);
   	
   }
   
   public void setSc1SortCompare1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSc1SortCompare1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sc1SortCompare1 with another Field
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source) {
      sc1SortCompare1Group.setSc1SortCompare1(source);
   }  
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source, int sourceIndex,int sourceLen) {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sc1SortCompare1Group
	 *	@return sc1SortCompare1Group
	 */   
	 public Sc1SortCompare1Group getSc1SortCompare1Group() {
   	return sc1SortCompare1Group;
   }



        public Vp776a00Ctx getVp776a00Ctx() {
            return Vp776a00Ctx.this;
        }

        public CompareAscending0300OutCtx getCompareAscending0300OutCtx() {
            return new CompareAscending0300OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sc2SortCompare2Group.hashCode();
        str += srpSortRequestParameters.hashCode();
        str += work.hashCode();
        str += sc1SortCompare1Group.hashCode();
       return str.hashCode();
    }

    public CompareAscending0300InCtx clone() {
        CompareAscending0300InCtx cloneObj = new CompareAscending0300InCtx();
        cloneObj.sc2SortCompare2Group = new Sc2SortCompare2Group();
        cloneObj.sc2SortCompare2Group.set(sc2SortCompare2Group.getClonedField());
        cloneObj.srpSortRequestParameters = new SrpSortRequestParameters();
        cloneObj.srpSortRequestParameters.set(srpSortRequestParameters.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sc1SortCompare1Group = new Sc1SortCompare1Group();
        cloneObj.sc1SortCompare1Group.set(sc1SortCompare1Group.getClonedField());
        return cloneObj;
    }

    }

    public CompareAscending0300InCtx getCompareAscending0300InCtx() {
            return new CompareAscending0300InCtx();
    }
     public class CompareAscending0300OutCtx implements Cloneable {
     Sc2SortCompare2Group sc2SortCompare2Group = Vp776a00Ctx.this.getSc2SortCompare2Group();
     SrpSortRequestParameters srpSortRequestParameters = Vp776a00Ctx.this.getSrpSortRequestParameters();
     Work work = Vp776a00Ctx.this.getWork();
     Sc1SortCompare1Group sc1SortCompare1Group = Vp776a00Ctx.this.getSc1SortCompare1Group();

	/**
	 *	Returns the value of pwaSwapEntry
	 *	@return pwaSwapEntry
	 */
   public char[] getPwaSwapEntry() throws CFException  {              
   		return work.getPwaSwapEntry();
   }

  
	/**
	*  set variable pwaSwapEntry
	*  @param value
	**/
   public void setPwaSwapEntry(char[] value) throws CFException {
      work.setPwaSwapEntry(value);
   } 

public int getSrpKeyLength() throws CFException {  
        return srpSortRequestParameters.getSrpKeyLength();
}
	/**
	 * 	Update SrpKeyLength with the passed value
	 *	@param number
	 */
	public void setSrpKeyLength(int number)  throws CFException{
		srpSortRequestParameters.setSrpKeyLength(number);
	}


	public void setSrpKeyLength(long number)  throws CFException{
	    srpSortRequestParameters.setSrpKeyLength(number);
	}
	

	/**
	 *	Returns the value of sc2SortCompare2Group
	 *	@return sc2SortCompare2Group
	 */   
	 public Sc2SortCompare2Group getSc2SortCompare2Group() {
   	return sc2SortCompare2Group;
   }


public int getSrpKeyStart() throws CFException {  
        return srpSortRequestParameters.getSrpKeyStart();
}
	/**
	 * 	Update SrpKeyStart with the passed value
	 *	@param number
	 */
	public void setSrpKeyStart(int number)  throws CFException{
		srpSortRequestParameters.setSrpKeyStart(number);
	}


	public void setSrpKeyStart(long number)  throws CFException{
	    srpSortRequestParameters.setSrpKeyStart(number);
	}
	

public int getSrpEntryLength() throws CFException {  
        return srpSortRequestParameters.getSrpEntryLength();
}
	/**
	 * 	Update SrpEntryLength with the passed value
	 *	@param number
	 */
	public void setSrpEntryLength(int number)  throws CFException{
		srpSortRequestParameters.setSrpEntryLength(number);
	}


	public void setSrpEntryLength(long number)  throws CFException{
	    srpSortRequestParameters.setSrpEntryLength(number);
	}
	

	/**
	 *	Test condition "I" for isPwaSortIncomplete()
	 *	@return  Returns true if isPwaSortIncomplete() is "I"
	 */
   public boolean isPwaSortIncomplete() throws CFException {
      return work.isPwaSortIncomplete();
   }

	/**
	*  set values "I"
	*/
   	public void setPwaSortIncompleteTrue()  throws CFException{  			
    	work.setPwaSortIncompleteTrue();
   	}
	/**
	 *	Returns the value of sc2SortCompare2
	 *	@return sc2SortCompare2
	 */
   public char[] getSc2SortCompare2() throws CFException  {              
   		return sc2SortCompare2Group.getSc2SortCompare2();
   }

  
	/**
	*  set variable sc2SortCompare2
	*  @param value
	**/
   public void setSc2SortCompare2(char[] value) throws CFException {
      sc2SortCompare2Group.setSc2SortCompare2(value);
   } 

     /**
	 * 	Update Sc2SortCompare2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSc2SortCompare2(char[] source, int sourceIndex) throws CFException {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex);
   	
   }
   
   public void setSc2SortCompare2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sc2SortCompare2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSc2SortCompare2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sc2SortCompare2 with another Field
	 *	@param value
	 */
   public void setSc2SortCompare2(Field source) {
      sc2SortCompare2Group.setSc2SortCompare2(source);
   }  
   
     /**
	 * 	Update Sc2SortCompare2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSc2SortCompare2(Field source, int sourceIndex,int sourceLen) {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sc2SortCompare2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSc2SortCompare2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sc1SortCompare1
	 *	@return sc1SortCompare1
	 */
   public char[] getSc1SortCompare1() throws CFException  {              
   		return sc1SortCompare1Group.getSc1SortCompare1();
   }

  
	/**
	*  set variable sc1SortCompare1
	*  @param value
	**/
   public void setSc1SortCompare1(char[] value) throws CFException {
      sc1SortCompare1Group.setSc1SortCompare1(value);
   } 

     /**
	 * 	Update Sc1SortCompare1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSc1SortCompare1(char[] source, int sourceIndex) throws CFException {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex);
   	
   }
   
   public void setSc1SortCompare1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSc1SortCompare1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sc1SortCompare1 with another Field
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source) {
      sc1SortCompare1Group.setSc1SortCompare1(source);
   }  
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source, int sourceIndex,int sourceLen) {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sc1SortCompare1Group
	 *	@return sc1SortCompare1Group
	 */   
	 public Sc1SortCompare1Group getSc1SortCompare1Group() {
   	return sc1SortCompare1Group;
   }



        public Vp776a00Ctx getVp776a00Ctx() {
            return Vp776a00Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sc2SortCompare2Group.hashCode();
        str += srpSortRequestParameters.hashCode();
        str += work.hashCode();
        str += sc1SortCompare1Group.hashCode();
       return str.hashCode();
    }

    public CompareAscending0300OutCtx clone() {
        CompareAscending0300OutCtx cloneObj = new CompareAscending0300OutCtx();
        cloneObj.sc2SortCompare2Group = new Sc2SortCompare2Group();
        cloneObj.sc2SortCompare2Group.set(sc2SortCompare2Group.getClonedField());
        cloneObj.srpSortRequestParameters = new SrpSortRequestParameters();
        cloneObj.srpSortRequestParameters.set(srpSortRequestParameters.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sc1SortCompare1Group = new Sc1SortCompare1Group();
        cloneObj.sc1SortCompare1Group.set(sc1SortCompare1Group.getClonedField());
        return cloneObj;
    }

    }

    public CompareAscending0300OutCtx getCompareAscending0300OutCtx() {
            return new CompareAscending0300OutCtx();
    }
     public class CompareDescending0400InCtx implements Cloneable {
     Sc2SortCompare2Group sc2SortCompare2Group = Vp776a00Ctx.this.getSc2SortCompare2Group();
     SrpSortRequestParameters srpSortRequestParameters = Vp776a00Ctx.this.getSrpSortRequestParameters();
     Work work = Vp776a00Ctx.this.getWork();
     Sc1SortCompare1Group sc1SortCompare1Group = Vp776a00Ctx.this.getSc1SortCompare1Group();

	/**
	 *	Returns the value of pwaSwapEntry
	 *	@return pwaSwapEntry
	 */
   public char[] getPwaSwapEntry() throws CFException  {              
   		return work.getPwaSwapEntry();
   }

  
	/**
	*  set variable pwaSwapEntry
	*  @param value
	**/
   public void setPwaSwapEntry(char[] value) throws CFException {
      work.setPwaSwapEntry(value);
   } 

public int getSrpKeyLength() throws CFException {  
        return srpSortRequestParameters.getSrpKeyLength();
}
	/**
	 * 	Update SrpKeyLength with the passed value
	 *	@param number
	 */
	public void setSrpKeyLength(int number)  throws CFException{
		srpSortRequestParameters.setSrpKeyLength(number);
	}


	public void setSrpKeyLength(long number)  throws CFException{
	    srpSortRequestParameters.setSrpKeyLength(number);
	}
	

	/**
	 *	Returns the value of sc2SortCompare2Group
	 *	@return sc2SortCompare2Group
	 */   
	 public Sc2SortCompare2Group getSc2SortCompare2Group() {
   	return sc2SortCompare2Group;
   }


public int getSrpKeyStart() throws CFException {  
        return srpSortRequestParameters.getSrpKeyStart();
}
	/**
	 * 	Update SrpKeyStart with the passed value
	 *	@param number
	 */
	public void setSrpKeyStart(int number)  throws CFException{
		srpSortRequestParameters.setSrpKeyStart(number);
	}


	public void setSrpKeyStart(long number)  throws CFException{
	    srpSortRequestParameters.setSrpKeyStart(number);
	}
	

public int getSrpEntryLength() throws CFException {  
        return srpSortRequestParameters.getSrpEntryLength();
}
	/**
	 * 	Update SrpEntryLength with the passed value
	 *	@param number
	 */
	public void setSrpEntryLength(int number)  throws CFException{
		srpSortRequestParameters.setSrpEntryLength(number);
	}


	public void setSrpEntryLength(long number)  throws CFException{
	    srpSortRequestParameters.setSrpEntryLength(number);
	}
	

	/**
	 *	Returns the value of sc2SortCompare2
	 *	@return sc2SortCompare2
	 */
   public char[] getSc2SortCompare2() throws CFException  {              
   		return sc2SortCompare2Group.getSc2SortCompare2();
   }

  
	/**
	*  set variable sc2SortCompare2
	*  @param value
	**/
   public void setSc2SortCompare2(char[] value) throws CFException {
      sc2SortCompare2Group.setSc2SortCompare2(value);
   } 

     /**
	 * 	Update Sc2SortCompare2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSc2SortCompare2(char[] source, int sourceIndex) throws CFException {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex);
   	
   }
   
   public void setSc2SortCompare2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sc2SortCompare2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSc2SortCompare2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sc2SortCompare2 with another Field
	 *	@param value
	 */
   public void setSc2SortCompare2(Field source) {
      sc2SortCompare2Group.setSc2SortCompare2(source);
   }  
   
     /**
	 * 	Update Sc2SortCompare2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSc2SortCompare2(Field source, int sourceIndex,int sourceLen) {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sc2SortCompare2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSc2SortCompare2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sc1SortCompare1
	 *	@return sc1SortCompare1
	 */
   public char[] getSc1SortCompare1() throws CFException  {              
   		return sc1SortCompare1Group.getSc1SortCompare1();
   }

  
	/**
	*  set variable sc1SortCompare1
	*  @param value
	**/
   public void setSc1SortCompare1(char[] value) throws CFException {
      sc1SortCompare1Group.setSc1SortCompare1(value);
   } 

     /**
	 * 	Update Sc1SortCompare1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSc1SortCompare1(char[] source, int sourceIndex) throws CFException {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex);
   	
   }
   
   public void setSc1SortCompare1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSc1SortCompare1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sc1SortCompare1 with another Field
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source) {
      sc1SortCompare1Group.setSc1SortCompare1(source);
   }  
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source, int sourceIndex,int sourceLen) {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sc1SortCompare1Group
	 *	@return sc1SortCompare1Group
	 */   
	 public Sc1SortCompare1Group getSc1SortCompare1Group() {
   	return sc1SortCompare1Group;
   }



        public Vp776a00Ctx getVp776a00Ctx() {
            return Vp776a00Ctx.this;
        }

        public CompareDescending0400OutCtx getCompareDescending0400OutCtx() {
            return new CompareDescending0400OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sc2SortCompare2Group.hashCode();
        str += srpSortRequestParameters.hashCode();
        str += work.hashCode();
        str += sc1SortCompare1Group.hashCode();
       return str.hashCode();
    }

    public CompareDescending0400InCtx clone() {
        CompareDescending0400InCtx cloneObj = new CompareDescending0400InCtx();
        cloneObj.sc2SortCompare2Group = new Sc2SortCompare2Group();
        cloneObj.sc2SortCompare2Group.set(sc2SortCompare2Group.getClonedField());
        cloneObj.srpSortRequestParameters = new SrpSortRequestParameters();
        cloneObj.srpSortRequestParameters.set(srpSortRequestParameters.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sc1SortCompare1Group = new Sc1SortCompare1Group();
        cloneObj.sc1SortCompare1Group.set(sc1SortCompare1Group.getClonedField());
        return cloneObj;
    }

    }

    public CompareDescending0400InCtx getCompareDescending0400InCtx() {
            return new CompareDescending0400InCtx();
    }
     public class CompareDescending0400OutCtx implements Cloneable {
     Sc2SortCompare2Group sc2SortCompare2Group = Vp776a00Ctx.this.getSc2SortCompare2Group();
     SrpSortRequestParameters srpSortRequestParameters = Vp776a00Ctx.this.getSrpSortRequestParameters();
     Work work = Vp776a00Ctx.this.getWork();
     Sc1SortCompare1Group sc1SortCompare1Group = Vp776a00Ctx.this.getSc1SortCompare1Group();

	/**
	 *	Returns the value of pwaSwapEntry
	 *	@return pwaSwapEntry
	 */
   public char[] getPwaSwapEntry() throws CFException  {              
   		return work.getPwaSwapEntry();
   }

  
	/**
	*  set variable pwaSwapEntry
	*  @param value
	**/
   public void setPwaSwapEntry(char[] value) throws CFException {
      work.setPwaSwapEntry(value);
   } 

public int getSrpKeyLength() throws CFException {  
        return srpSortRequestParameters.getSrpKeyLength();
}
	/**
	 * 	Update SrpKeyLength with the passed value
	 *	@param number
	 */
	public void setSrpKeyLength(int number)  throws CFException{
		srpSortRequestParameters.setSrpKeyLength(number);
	}


	public void setSrpKeyLength(long number)  throws CFException{
	    srpSortRequestParameters.setSrpKeyLength(number);
	}
	

	/**
	 *	Returns the value of sc2SortCompare2Group
	 *	@return sc2SortCompare2Group
	 */   
	 public Sc2SortCompare2Group getSc2SortCompare2Group() {
   	return sc2SortCompare2Group;
   }


public int getSrpKeyStart() throws CFException {  
        return srpSortRequestParameters.getSrpKeyStart();
}
	/**
	 * 	Update SrpKeyStart with the passed value
	 *	@param number
	 */
	public void setSrpKeyStart(int number)  throws CFException{
		srpSortRequestParameters.setSrpKeyStart(number);
	}


	public void setSrpKeyStart(long number)  throws CFException{
	    srpSortRequestParameters.setSrpKeyStart(number);
	}
	

public int getSrpEntryLength() throws CFException {  
        return srpSortRequestParameters.getSrpEntryLength();
}
	/**
	 * 	Update SrpEntryLength with the passed value
	 *	@param number
	 */
	public void setSrpEntryLength(int number)  throws CFException{
		srpSortRequestParameters.setSrpEntryLength(number);
	}


	public void setSrpEntryLength(long number)  throws CFException{
	    srpSortRequestParameters.setSrpEntryLength(number);
	}
	

	/**
	 *	Test condition "I" for isPwaSortIncomplete()
	 *	@return  Returns true if isPwaSortIncomplete() is "I"
	 */
   public boolean isPwaSortIncomplete() throws CFException {
      return work.isPwaSortIncomplete();
   }

	/**
	*  set values "I"
	*/
   	public void setPwaSortIncompleteTrue()  throws CFException{  			
    	work.setPwaSortIncompleteTrue();
   	}
	/**
	 *	Returns the value of sc2SortCompare2
	 *	@return sc2SortCompare2
	 */
   public char[] getSc2SortCompare2() throws CFException  {              
   		return sc2SortCompare2Group.getSc2SortCompare2();
   }

  
	/**
	*  set variable sc2SortCompare2
	*  @param value
	**/
   public void setSc2SortCompare2(char[] value) throws CFException {
      sc2SortCompare2Group.setSc2SortCompare2(value);
   } 

     /**
	 * 	Update Sc2SortCompare2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSc2SortCompare2(char[] source, int sourceIndex) throws CFException {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex);
   	
   }
   
   public void setSc2SortCompare2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sc2SortCompare2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSc2SortCompare2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sc2SortCompare2 with another Field
	 *	@param value
	 */
   public void setSc2SortCompare2(Field source) {
      sc2SortCompare2Group.setSc2SortCompare2(source);
   }  
   
     /**
	 * 	Update Sc2SortCompare2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSc2SortCompare2(Field source, int sourceIndex,int sourceLen) {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sc2SortCompare2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSc2SortCompare2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc2SortCompare2Group.setSc2SortCompare2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sc1SortCompare1
	 *	@return sc1SortCompare1
	 */
   public char[] getSc1SortCompare1() throws CFException  {              
   		return sc1SortCompare1Group.getSc1SortCompare1();
   }

  
	/**
	*  set variable sc1SortCompare1
	*  @param value
	**/
   public void setSc1SortCompare1(char[] value) throws CFException {
      sc1SortCompare1Group.setSc1SortCompare1(value);
   } 

     /**
	 * 	Update Sc1SortCompare1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSc1SortCompare1(char[] source, int sourceIndex) throws CFException {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex);
   	
   }
   
   public void setSc1SortCompare1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSc1SortCompare1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sc1SortCompare1 with another Field
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source) {
      sc1SortCompare1Group.setSc1SortCompare1(source);
   }  
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source, int sourceIndex,int sourceLen) {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sc1SortCompare1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSc1SortCompare1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sc1SortCompare1Group.setSc1SortCompare1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sc1SortCompare1Group
	 *	@return sc1SortCompare1Group
	 */   
	 public Sc1SortCompare1Group getSc1SortCompare1Group() {
   	return sc1SortCompare1Group;
   }



        public Vp776a00Ctx getVp776a00Ctx() {
            return Vp776a00Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sc2SortCompare2Group.hashCode();
        str += srpSortRequestParameters.hashCode();
        str += work.hashCode();
        str += sc1SortCompare1Group.hashCode();
       return str.hashCode();
    }

    public CompareDescending0400OutCtx clone() {
        CompareDescending0400OutCtx cloneObj = new CompareDescending0400OutCtx();
        cloneObj.sc2SortCompare2Group = new Sc2SortCompare2Group();
        cloneObj.sc2SortCompare2Group.set(sc2SortCompare2Group.getClonedField());
        cloneObj.srpSortRequestParameters = new SrpSortRequestParameters();
        cloneObj.srpSortRequestParameters.set(srpSortRequestParameters.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sc1SortCompare1Group = new Sc1SortCompare1Group();
        cloneObj.sc1SortCompare1Group.set(sc1SortCompare1Group.getClonedField());
        return cloneObj;
    }

    }

    public CompareDescending0400OutCtx getCompareDescending0400OutCtx() {
            return new CompareDescending0400OutCtx();
    }
}
