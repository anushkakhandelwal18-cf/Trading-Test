package com.cloudframe.app.dto.trdpb006;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

 
 
 
 
 
import java.sql.ResultSet;
 
 
 
 
 
import com.cloudframe.app.file.records.trdpb006.ReporderRecord;


@Context
public class Trdpb006Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Header1 header1;
    Sqlca sqlca;
    PageHeader pageHeader;
    DetailHdr1 detailHdr1;
    Dcltbtrdcus dcltbtrdcus;
    Work work;
    Dcltbtrdord dcltbtrdord;
    ReporderRecord reporderRecord;
    DetailRec detailRec;
    Dcltbtrdsec dcltbtrdsec;


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


    ResultSet clientOrdersResultSet;

    public ResultSet getClientOrdersResultSet() {
        return this.clientOrdersResultSet;
    }

    public void setClientOrdersResultSet(ResultSet clientOrdersResultSet) {
        this.clientOrdersResultSet = clientOrdersResultSet;
    }

    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }


    public Header1 getHeader1() {
        if (header1 == null) {
            header1 = new Header1();
        }

        return header1;
    }

    public void setHeader1(Header1 header1) {
        this.header1 = header1;
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
    public PageHeader getPageHeader() {
        if (pageHeader == null) {
            pageHeader = new PageHeader();
        }

        return pageHeader;
    }

    public void setPageHeader(PageHeader pageHeader) {
        this.pageHeader = pageHeader;
    }
    public DetailHdr1 getDetailHdr1() {
        if (detailHdr1 == null) {
            detailHdr1 = new DetailHdr1();
        }

        return detailHdr1;
    }

    public void setDetailHdr1(DetailHdr1 detailHdr1) {
        this.detailHdr1 = detailHdr1;
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
    public Dcltbtrdord getDcltbtrdord() {
        if (dcltbtrdord == null) {
            dcltbtrdord = new Dcltbtrdord();
        }

        return dcltbtrdord;
    }

    public void setDcltbtrdord(Dcltbtrdord dcltbtrdord) {
        this.dcltbtrdord = dcltbtrdord;
    }
    public ReporderRecord getReporderRecord() {
        if (reporderRecord == null) {
            reporderRecord = new ReporderRecord();
        }

        return reporderRecord;
    }

    public void setReporderRecord(ReporderRecord reporderRecord) {
        this.reporderRecord = reporderRecord;
    }
    public DetailRec getDetailRec() {
        if (detailRec == null) {
            detailRec = new DetailRec();
        }

        return detailRec;
    }

    public void setDetailRec(DetailRec detailRec) {
        this.detailRec = detailRec;
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


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += header1.hashCode();
        str += sqlca.hashCode();
        str += pageHeader.hashCode();
        str += detailHdr1.hashCode();
        str += dcltbtrdcus.hashCode();
        str += work.hashCode();
        str += dcltbtrdord.hashCode();
        str += reporderRecord.hashCode();
        str += detailRec.hashCode();
        str += dcltbtrdsec.hashCode();
       return str.hashCode();
    }

    public Trdpb006Ctx clone() {
        Trdpb006Ctx cloneObj = new Trdpb006Ctx();
        cloneObj.header1 = new Header1();
        cloneObj.header1.set(header1.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.pageHeader = new PageHeader();
        cloneObj.pageHeader.set(pageHeader.getClonedField());
        cloneObj.detailHdr1 = new DetailHdr1();
        cloneObj.detailHdr1.set(detailHdr1.getClonedField());
        cloneObj.dcltbtrdcus = new Dcltbtrdcus();
        cloneObj.dcltbtrdcus.set(dcltbtrdcus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        cloneObj.reporderRecord = new ReporderRecord();
        cloneObj.reporderRecord.set(reporderRecord.getClonedField());
        cloneObj.detailRec = new DetailRec();
        cloneObj.detailRec.set(detailRec.getClonedField());
        cloneObj.dcltbtrdsec = new Dcltbtrdsec();
        cloneObj.dcltbtrdsec.set(dcltbtrdsec.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Sqlca sqlca = Trdpb006Ctx.this.getSqlca();
     Work work = Trdpb006Ctx.this.getWork();

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
	 *	Test condition "Y" for isEndOfOrders88()
	 *	@return  Returns true if isEndOfOrders88() is "Y"
	 */
   public boolean isEndOfOrders88() throws CFException {
      return work.isEndOfOrders88();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfOrders88True()  throws CFException{  			
    	work.setEndOfOrders88True();
   	}

        public Trdpb006Ctx getTrdpb006Ctx() {
            return Trdpb006Ctx.this;
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
        str += sqlca.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     Sqlca sqlca = Trdpb006Ctx.this.getSqlca();
     Work work = Trdpb006Ctx.this.getWork();

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



        public Trdpb006Ctx getTrdpb006Ctx() {
            return Trdpb006Ctx.this;
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
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class InitializeOutCtx implements Cloneable {
     Work work = Trdpb006Ctx.this.getWork();

	/**
	 *	Test condition "P" for isPrintPageHeader88()
	 *	@return  Returns true if isPrintPageHeader88() is "P"
	 */
   public boolean isPrintPageHeader88() throws CFException {
      return work.isPrintPageHeader88();
   }

	/**
	*  set values "P"
	*/
   	public void setPrintPageHeader88True()  throws CFException{  			
    	work.setPrintPageHeader88True();
   	}
	/**
	 *	Returns the value of endOfOrdersSw
	 *	@return endOfOrdersSw
	 */
   public char[] getEndOfOrdersSw() throws CFException  {              
   		return work.getEndOfOrdersSw();
   }

  
	/**
	*  set variable endOfOrdersSw
	*  @param value
	**/
   public void setEndOfOrdersSw(char[] value) throws CFException {
      work.setEndOfOrdersSw(value);
   } 


        public Trdpb006Ctx getTrdpb006Ctx() {
            return Trdpb006Ctx.this;
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

    public InitializeOutCtx clone() {
        InitializeOutCtx cloneObj = new InitializeOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
    }
     public class OpenOrderCursorRptfileInCtx implements Cloneable {
     Sqlca sqlca = Trdpb006Ctx.this.getSqlca();
     Work work = Trdpb006Ctx.this.getWork();
     ReporderRecord reporderRecord = Trdpb006Ctx.this.getReporderRecord();

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Returns the value of reporderRecord
	 *	@return reporderRecord
	 */   
	 public ReporderRecord getReporderRecord() {
   	return reporderRecord;
   }



        public Trdpb006Ctx getTrdpb006Ctx() {
            return Trdpb006Ctx.this;
        }

        public OpenOrderCursorRptfileOutCtx getOpenOrderCursorRptfileOutCtx() {
            return new OpenOrderCursorRptfileOutCtx();
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
        str += reporderRecord.hashCode();
       return str.hashCode();
    }

    public OpenOrderCursorRptfileInCtx clone() {
        OpenOrderCursorRptfileInCtx cloneObj = new OpenOrderCursorRptfileInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reporderRecord = new ReporderRecord();
        cloneObj.reporderRecord.set(reporderRecord.getClonedField());
        return cloneObj;
    }

    }

    public OpenOrderCursorRptfileInCtx getOpenOrderCursorRptfileInCtx() {
            return new OpenOrderCursorRptfileInCtx();
    }
     public class OpenOrderCursorRptfileOutCtx implements Cloneable {
     Sqlca sqlca = Trdpb006Ctx.this.getSqlca();
     Work work = Trdpb006Ctx.this.getWork();
     ReporderRecord reporderRecord = Trdpb006Ctx.this.getReporderRecord();

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
	 *	Returns the value of reporderFileStatus
	 *	@return reporderFileStatus
	 */
   public char[] getReporderFileStatus() throws CFException  {              
   		return work.getReporderFileStatus();
   }

  
	/**
	*  set variable reporderFileStatus
	*  @param value
	**/
   public void setReporderFileStatus(char[] value) throws CFException {
      work.setReporderFileStatus(value);
   } 


        public Trdpb006Ctx getTrdpb006Ctx() {
            return Trdpb006Ctx.this;
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
        str += reporderRecord.hashCode();
       return str.hashCode();
    }

    public OpenOrderCursorRptfileOutCtx clone() {
        OpenOrderCursorRptfileOutCtx cloneObj = new OpenOrderCursorRptfileOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reporderRecord = new ReporderRecord();
        cloneObj.reporderRecord.set(reporderRecord.getClonedField());
        return cloneObj;
    }

    }

    public OpenOrderCursorRptfileOutCtx getOpenOrderCursorRptfileOutCtx() {
            return new OpenOrderCursorRptfileOutCtx();
    }
     public class FetchProcessOrdersInCtx implements Cloneable {
     Header1 header1 = Trdpb006Ctx.this.getHeader1();
     Sqlca sqlca = Trdpb006Ctx.this.getSqlca();
     PageHeader pageHeader = Trdpb006Ctx.this.getPageHeader();
     DetailHdr1 detailHdr1 = Trdpb006Ctx.this.getDetailHdr1();
     Dcltbtrdcus dcltbtrdcus = Trdpb006Ctx.this.getDcltbtrdcus();
     Work work = Trdpb006Ctx.this.getWork();
     Dcltbtrdord dcltbtrdord = Trdpb006Ctx.this.getDcltbtrdord();
     ReporderRecord reporderRecord = Trdpb006Ctx.this.getReporderRecord();
     DetailRec detailRec = Trdpb006Ctx.this.getDetailRec();
     Dcltbtrdsec dcltbtrdsec = Trdpb006Ctx.this.getDcltbtrdsec();

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
	 *	Returns the value of detailHdr2
	 *	@return detailHdr2
	 */
   public char[] getDetailHdr2() throws CFException  {              
   		return work.getDetailHdr2();
   }

  
	/**
	*  set variable detailHdr2
	*  @param value
	**/
   public void setDetailHdr2(char[] value) throws CFException {
      work.setDetailHdr2(value);
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
	 *	Returns the value of detailRec
	 *	@return detailRec
	 */   
	 public DetailRec getDetailRec() {
   	return detailRec;
   }


	/**
	 *	Returns the value of dcltbtrdsec
	 *	@return dcltbtrdsec
	 */   
	 public Dcltbtrdsec getDcltbtrdsec() {
   	return dcltbtrdsec;
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
	 *	Returns the value of pagenum
	 *	@return pagenum
	 */
	public int getPagenum() throws CFException {
   		return work.getPagenum();
	}


	/**
	 *	Returns String value of pagenum
	 *	@return pagenum
	 */
	public char[]  getPagenumString() throws CFException {
	     return String.valueOf(work.getPagenumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pagenumIsNumeric()  throws CFException{
	    return work.pagenumIsNumeric();
	}

	/**
	 * 	Update Pagenum with the passed value
	 *	@param number
	 */
	public void setPagenum(int number)  throws CFException{
		work.setPagenum(number);
	}
	

	public void setPagenum(long number)  throws CFException{
	    work.setPagenum(number);
	}
	
	
	/**
	 * 	Update Pagenum with the passed value
	 *	@param value (String or char[])
	 */
	public void setPagenum(char[] value)  throws CFException {
		work.setPagenum(value);
	}
	
	/**
	 * 	Update Pagenum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPagenumString(char[] value)  throws CFException{
		work.setPagenum(value);
	}	

	/**
	 *	Returns the value of emptyHdr
	 *	@return emptyHdr
	 */
   public char[] getEmptyHdr() throws CFException  {              
   		return work.getEmptyHdr();
   }

  
	/**
	*  set variable emptyHdr
	*  @param value
	**/
   public void setEmptyHdr(char[] value) throws CFException {
      work.setEmptyHdr(value);
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
	 *	Returns the value of buyerSellerCustId
	 *	@return buyerSellerCustId
	 */
   public char[] getBuyerSellerCustId() throws CFException  {              
   		return work.getBuyerSellerCustId();
   }

  
	/**
	*  set variable buyerSellerCustId
	*  @param value
	**/
   public void setBuyerSellerCustId(char[] value) throws CFException {
      work.setBuyerSellerCustId(value);
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
	 *	Returns the value of prevCustid
	 *	@return prevCustid
	 */
   public char[] getPrevCustid() throws CFException  {              
   		return work.getPrevCustid();
   }

  
	/**
	*  set variable prevCustid
	*  @param value
	**/
   public void setPrevCustid(char[] value) throws CFException {
      work.setPrevCustid(value);
   } 

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of pageHeader
	 *	@return pageHeader
	 */   
	 public PageHeader getPageHeader() {
   	return pageHeader;
   }


	/**
	 *	Returns the value of prevBuySell
	 *	@return prevBuySell
	 */
   public char[] getPrevBuySell() throws CFException  {              
   		return work.getPrevBuySell();
   }

  
	/**
	*  set variable prevBuySell
	*  @param value
	**/
   public void setPrevBuySell(char[] value) throws CFException {
      work.setPrevBuySell(value);
   } 

	/**
	 *	Returns the value of detailHdr1
	 *	@return detailHdr1
	 */   
	 public DetailHdr1 getDetailHdr1() {
   	return detailHdr1;
   }


	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of reporderRecord
	 *	@return reporderRecord
	 */   
	 public ReporderRecord getReporderRecord() {
   	return reporderRecord;
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
	 *	Returns the value of header1
	 *	@return header1
	 */   
	 public Header1 getHeader1() {
   	return header1;
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
	 *	Returns the value of dcltbtrdcus
	 *	@return dcltbtrdcus
	 */   
	 public Dcltbtrdcus getDcltbtrdcus() {
   	return dcltbtrdcus;
   }


	/**
	 *	Returns the value of prevOrderStatus
	 *	@return prevOrderStatus
	 */
   public char[] getPrevOrderStatus() throws CFException  {              
   		return work.getPrevOrderStatus();
   }

  
	/**
	*  set variable prevOrderStatus
	*  @param value
	**/
   public void setPrevOrderStatus(char[] value) throws CFException {
      work.setPrevOrderStatus(value);
   } 

	/**
	 *	Returns the value of maxOrdersPerPage
	 *	@return maxOrdersPerPage
	 */
	public int getMaxOrdersPerPage() throws CFException {        
   		return work.getMaxOrdersPerPage();
	}
	
	/**
	 * 	Update MaxOrdersPerPage with the passed value
	 *	@param number
	 */
	public void setMaxOrdersPerPage(int number)  throws CFException{
		work.setMaxOrdersPerPage(number);
	}


	public void setMaxOrdersPerPage(long number)  throws CFException{
		work.setMaxOrdersPerPage((int)number);
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



        public Trdpb006Ctx getTrdpb006Ctx() {
            return Trdpb006Ctx.this;
        }

        public FetchProcessOrdersOutCtx getFetchProcessOrdersOutCtx() {
            return new FetchProcessOrdersOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += header1.hashCode();
        str += sqlca.hashCode();
        str += pageHeader.hashCode();
        str += detailHdr1.hashCode();
        str += dcltbtrdcus.hashCode();
        str += work.hashCode();
        str += dcltbtrdord.hashCode();
        str += reporderRecord.hashCode();
        str += detailRec.hashCode();
        str += dcltbtrdsec.hashCode();
       return str.hashCode();
    }

    public FetchProcessOrdersInCtx clone() {
        FetchProcessOrdersInCtx cloneObj = new FetchProcessOrdersInCtx();
        cloneObj.header1 = new Header1();
        cloneObj.header1.set(header1.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.pageHeader = new PageHeader();
        cloneObj.pageHeader.set(pageHeader.getClonedField());
        cloneObj.detailHdr1 = new DetailHdr1();
        cloneObj.detailHdr1.set(detailHdr1.getClonedField());
        cloneObj.dcltbtrdcus = new Dcltbtrdcus();
        cloneObj.dcltbtrdcus.set(dcltbtrdcus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        cloneObj.reporderRecord = new ReporderRecord();
        cloneObj.reporderRecord.set(reporderRecord.getClonedField());
        cloneObj.detailRec = new DetailRec();
        cloneObj.detailRec.set(detailRec.getClonedField());
        cloneObj.dcltbtrdsec = new Dcltbtrdsec();
        cloneObj.dcltbtrdsec.set(dcltbtrdsec.getClonedField());
        return cloneObj;
    }

    }

    public FetchProcessOrdersInCtx getFetchProcessOrdersInCtx() {
            return new FetchProcessOrdersInCtx();
    }
     public class FetchProcessOrdersOutCtx implements Cloneable {
     Header1 header1 = Trdpb006Ctx.this.getHeader1();
     Sqlca sqlca = Trdpb006Ctx.this.getSqlca();
     PageHeader pageHeader = Trdpb006Ctx.this.getPageHeader();
     Dcltbtrdcus dcltbtrdcus = Trdpb006Ctx.this.getDcltbtrdcus();
     DetailHdr1 detailHdr1 = Trdpb006Ctx.this.getDetailHdr1();
     Work work = Trdpb006Ctx.this.getWork();
     Dcltbtrdord dcltbtrdord = Trdpb006Ctx.this.getDcltbtrdord();
     ReporderRecord reporderRecord = Trdpb006Ctx.this.getReporderRecord();
     DetailRec detailRec = Trdpb006Ctx.this.getDetailRec();
     Dcltbtrdsec dcltbtrdsec = Trdpb006Ctx.this.getDcltbtrdsec();

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
	 *	Returns the value of detTradeid
	 *	@return detTradeid
	 */
   public char[] getDetTradeid() throws CFException  {              
   		return detailRec.getDetTradeid();
   }

  
	/**
	*  set variable detTradeid
	*  @param value
	**/
   public void setDetTradeid(char[] value) throws CFException {
      detailRec.setDetTradeid(value);
   } 

     /**
	 * 	Update DetTradeid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetTradeid(char[] source, int sourceIndex) throws CFException {
      detailRec.setDetTradeid(source, sourceIndex);
   	
   }
   
   public void setDetTradeid(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailRec.setDetTradeid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DetTradeid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetTradeid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetTradeid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DetTradeid with another Field
	 *	@param value
	 */
   public void setDetTradeid(Field source) {
      detailRec.setDetTradeid(source);
   }  
   
     /**
	 * 	Update DetTradeid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetTradeid(Field source, int sourceIndex,int sourceLen) {
      detailRec.setDetTradeid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DetTradeid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetTradeid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetTradeid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of detFigi
	 *	@return detFigi
	 */
   public char[] getDetFigi() throws CFException  {              
   		return detailRec.getDetFigi();
   }

  
	/**
	*  set variable detFigi
	*  @param value
	**/
   public void setDetFigi(char[] value) throws CFException {
      detailRec.setDetFigi(value);
   } 

     /**
	 * 	Update DetFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetFigi(char[] source, int sourceIndex) throws CFException {
      detailRec.setDetFigi(source, sourceIndex);
   	
   }
   
   public void setDetFigi(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailRec.setDetFigi(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DetFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DetFigi with another Field
	 *	@param value
	 */
   public void setDetFigi(Field source) {
      detailRec.setDetFigi(source);
   }  
   
     /**
	 * 	Update DetFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetFigi(Field source, int sourceIndex,int sourceLen) {
      detailRec.setDetFigi(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DetFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetFigi(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of reporderFileStatus
	 *	@return reporderFileStatus
	 */
   public char[] getReporderFileStatus() throws CFException  {              
   		return work.getReporderFileStatus();
   }

  
	/**
	*  set variable reporderFileStatus
	*  @param value
	**/
   public void setReporderFileStatus(char[] value) throws CFException {
      work.setReporderFileStatus(value);
   } 

	/**
	 *	Returns the value of dcltbtrdsec
	 *	@return dcltbtrdsec
	 */   
	 public Dcltbtrdsec getDcltbtrdsec() {
   	return dcltbtrdsec;
   }


	/**
	 *	Returns the value of pagenum
	 *	@return pagenum
	 */
	public int getPagenum() throws CFException {
   		return work.getPagenum();
	}


	/**
	 *	Returns String value of pagenum
	 *	@return pagenum
	 */
	public char[]  getPagenumString() throws CFException {
	     return String.valueOf(work.getPagenumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pagenumIsNumeric()  throws CFException{
	    return work.pagenumIsNumeric();
	}

	/**
	 * 	Update Pagenum with the passed value
	 *	@param number
	 */
	public void setPagenum(int number)  throws CFException{
		work.setPagenum(number);
	}
	

	public void setPagenum(long number)  throws CFException{
	    work.setPagenum(number);
	}
	
	
	/**
	 * 	Update Pagenum with the passed value
	 *	@param value (String or char[])
	 */
	public void setPagenum(char[] value)  throws CFException {
		work.setPagenum(value);
	}
	
	/**
	 * 	Update Pagenum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPagenumString(char[] value)  throws CFException{
		work.setPagenum(value);
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
	 *	Returns the value of buyerSellerCustId
	 *	@return buyerSellerCustId
	 */
   public char[] getBuyerSellerCustId() throws CFException  {              
   		return work.getBuyerSellerCustId();
   }

  
	/**
	*  set variable buyerSellerCustId
	*  @param value
	**/
   public void setBuyerSellerCustId(char[] value) throws CFException {
      work.setBuyerSellerCustId(value);
   } 

	/**
	 *	Returns the value of detType
	 *	@return detType
	 */
   public char[] getDetType() throws CFException  {              
   		return detailRec.getDetType();
   }

  
	/**
	*  set variable detType
	*  @param value
	**/
   public void setDetType(char[] value) throws CFException {
      detailRec.setDetType(value);
   } 

     /**
	 * 	Update DetType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetType(char[] source, int sourceIndex) throws CFException {
      detailRec.setDetType(source, sourceIndex);
   	
   }
   
   public void setDetType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailRec.setDetType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DetType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DetType with another Field
	 *	@param value
	 */
   public void setDetType(Field source) {
      detailRec.setDetType(source);
   }  
   
     /**
	 * 	Update DetType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetType(Field source, int sourceIndex,int sourceLen) {
      detailRec.setDetType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DetType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prevCustid
	 *	@return prevCustid
	 */
   public char[] getPrevCustid() throws CFException  {              
   		return work.getPrevCustid();
   }

  
	/**
	*  set variable prevCustid
	*  @param value
	**/
   public void setPrevCustid(char[] value) throws CFException {
      work.setPrevCustid(value);
   } 

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of prevBuySell
	 *	@return prevBuySell
	 */
   public char[] getPrevBuySell() throws CFException  {              
   		return work.getPrevBuySell();
   }

  
	/**
	*  set variable prevBuySell
	*  @param value
	**/
   public void setPrevBuySell(char[] value) throws CFException {
      work.setPrevBuySell(value);
   } 

	/**
	 *	Test condition "P" for isPrintPageHeader88()
	 *	@return  Returns true if isPrintPageHeader88() is "P"
	 */
   public boolean isPrintPageHeader88() throws CFException {
      return work.isPrintPageHeader88();
   }

	/**
	*  set values "P"
	*/
   	public void setPrintPageHeader88True()  throws CFException{  			
    	work.setPrintPageHeader88True();
   	}
	/**
	 *	Returns the value of phCustomer
	 *	@return phCustomer
	 */
   public char[] getPhCustomer() throws CFException  {              
   		return pageHeader.getPhCustomer();
   }

  
	/**
	*  set variable phCustomer
	*  @param value
	**/
   public void setPhCustomer(char[] value) throws CFException {
      pageHeader.setPhCustomer(value);
   } 

     /**
	 * 	Update PhCustomer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPhCustomer(char[] source, int sourceIndex) throws CFException {
      pageHeader.setPhCustomer(source, sourceIndex);
   	
   }
   
   public void setPhCustomer(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pageHeader.setPhCustomer(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PhCustomer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPhCustomer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pageHeader.setPhCustomer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PhCustomer with another Field
	 *	@param value
	 */
   public void setPhCustomer(Field source) {
      pageHeader.setPhCustomer(source);
   }  
   
     /**
	 * 	Update PhCustomer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPhCustomer(Field source, int sourceIndex,int sourceLen) {
      pageHeader.setPhCustomer(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PhCustomer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPhCustomer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pageHeader.setPhCustomer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of reporderRecord
	 *	@return reporderRecord
	 */   
	 public ReporderRecord getReporderRecord() {
   	return reporderRecord;
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
	 *	Returns the value of dcltbtrdcus
	 *	@return dcltbtrdcus
	 */   
	 public Dcltbtrdcus getDcltbtrdcus() {
   	return dcltbtrdcus;
   }


	/**
	 *	Test condition "Sell Orders Report for Client : " for isPhSellOrders88()
	 *	@return  Returns true if isPhSellOrders88() is "Sell Orders Report for Client : "
	 */
   public boolean isPhSellOrders88() throws CFException {
      return pageHeader.isPhSellOrders88();
   }

	/**
	*  set values "Sell Orders Report for Client : "
	*/
   	public void setPhSellOrders88True()  throws CFException{  			
    	pageHeader.setPhSellOrders88True();
   	}
	/**
	 *	Returns the value of detSymbol
	 *	@return detSymbol
	 */
   public char[] getDetSymbol() throws CFException  {              
   		return detailRec.getDetSymbol();
   }

  
	/**
	*  set variable detSymbol
	*  @param value
	**/
   public void setDetSymbol(char[] value) throws CFException {
      detailRec.setDetSymbol(value);
   } 

     /**
	 * 	Update DetSymbol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetSymbol(char[] source, int sourceIndex) throws CFException {
      detailRec.setDetSymbol(source, sourceIndex);
   	
   }
   
   public void setDetSymbol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailRec.setDetSymbol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DetSymbol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetSymbol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetSymbol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DetSymbol with another Field
	 *	@param value
	 */
   public void setDetSymbol(Field source) {
      detailRec.setDetSymbol(source);
   }  
   
     /**
	 * 	Update DetSymbol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetSymbol(Field source, int sourceIndex,int sourceLen) {
      detailRec.setDetSymbol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DetSymbol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetSymbol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetSymbol(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of phPagenum
	 *	@return phPagenum
	 */
   public char[] getPhPagenum() throws CFException  {              
   		return pageHeader.getPhPagenum();
   }

  
	/**
	*  set variable phPagenum
	*  @param value
	**/
   public void setPhPagenum(char[] value) throws CFException {
      pageHeader.setPhPagenum(value);
   } 

     /**
	 * 	Update PhPagenum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPhPagenum(char[] source, int sourceIndex) throws CFException {
      pageHeader.setPhPagenum(source, sourceIndex);
   	
   }
   
   public void setPhPagenum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pageHeader.setPhPagenum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PhPagenum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPhPagenum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pageHeader.setPhPagenum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PhPagenum with another Field
	 *	@param value
	 */
   public void setPhPagenum(Field source) {
      pageHeader.setPhPagenum(source);
   }  
   
     /**
	 * 	Update PhPagenum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPhPagenum(Field source, int sourceIndex,int sourceLen) {
      pageHeader.setPhPagenum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PhPagenum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPhPagenum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pageHeader.setPhPagenum(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of dcltbtrdord
	 *	@return dcltbtrdord
	 */   
	 public Dcltbtrdord getDcltbtrdord() {
   	return dcltbtrdord;
   }


	/**
	 *	Returns the value of phCustomerDesc
	 *	@return phCustomerDesc
	 */
   public char[] getPhCustomerDesc() throws CFException  {              
   		return pageHeader.getPhCustomerDesc();
   }

  
	/**
	*  set variable phCustomerDesc
	*  @param value
	**/
   public void setPhCustomerDesc(char[] value) throws CFException {
      pageHeader.setPhCustomerDesc(value);
   } 

     /**
	 * 	Update PhCustomerDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPhCustomerDesc(char[] source, int sourceIndex) throws CFException {
      pageHeader.setPhCustomerDesc(source, sourceIndex);
   	
   }
   
   public void setPhCustomerDesc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pageHeader.setPhCustomerDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PhCustomerDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPhCustomerDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pageHeader.setPhCustomerDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PhCustomerDesc with another Field
	 *	@param value
	 */
   public void setPhCustomerDesc(Field source) {
      pageHeader.setPhCustomerDesc(source);
   }  
   
     /**
	 * 	Update PhCustomerDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPhCustomerDesc(Field source, int sourceIndex,int sourceLen) {
      pageHeader.setPhCustomerDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PhCustomerDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPhCustomerDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pageHeader.setPhCustomerDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition " " for isPrintDetail88()
	 *	@return  Returns true if isPrintDetail88() is " "
	 */
   public boolean isPrintDetail88() throws CFException {
      return work.isPrintDetail88();
   }

	/**
	*  set values " "
	*/
   	public void setPrintDetail88True()  throws CFException{  			
    	work.setPrintDetail88True();
   	}
	/**
	 *	Test condition "D" for isPrintDetailHdr88()
	 *	@return  Returns true if isPrintDetailHdr88() is "D"
	 */
   public boolean isPrintDetailHdr88() throws CFException {
      return work.isPrintDetailHdr88();
   }

	/**
	*  set values "D"
	*/
   	public void setPrintDetailHdr88True()  throws CFException{  			
    	work.setPrintDetailHdr88True();
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
	 *	Returns the value of detDescription
	 *	@return detDescription
	 */
   public char[] getDetDescription() throws CFException  {              
   		return detailRec.getDetDescription();
   }

  
	/**
	*  set variable detDescription
	*  @param value
	**/
   public void setDetDescription(char[] value) throws CFException {
      detailRec.setDetDescription(value);
   } 

     /**
	 * 	Update DetDescription 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetDescription(char[] source, int sourceIndex) throws CFException {
      detailRec.setDetDescription(source, sourceIndex);
   	
   }
   
   public void setDetDescription(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailRec.setDetDescription(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DetDescription 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetDescription(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DetDescription with another Field
	 *	@param value
	 */
   public void setDetDescription(Field source) {
      detailRec.setDetDescription(source);
   }  
   
     /**
	 * 	Update DetDescription 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetDescription(Field source, int sourceIndex,int sourceLen) {
      detailRec.setDetDescription(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DetDescription 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetDescription(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Buyer" for isDh1Buyer88()
	 *	@return  Returns true if isDh1Buyer88() is "Buyer"
	 */
   public boolean isDh1Buyer88() throws CFException {
      return detailHdr1.isDh1Buyer88();
   }

	/**
	*  set values "Buyer"
	*/
   	public void setDh1Buyer88True()  throws CFException{  			
    	detailHdr1.setDh1Buyer88True();
   	}
	/**
	 *	Test condition " Buy Orders Report for Client : " for isPhBuyOrders88()
	 *	@return  Returns true if isPhBuyOrders88() is " Buy Orders Report for Client : "
	 */
   public boolean isPhBuyOrders88() throws CFException {
      return pageHeader.isPhBuyOrders88();
   }

	/**
	*  set values " Buy Orders Report for Client : "
	*/
   	public void setPhBuyOrders88True()  throws CFException{  			
    	pageHeader.setPhBuyOrders88True();
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
	 *	Returns the value of h1OrderStatusDesc
	 *	@return h1OrderStatusDesc
	 */
   public char[] getH1OrderStatusDesc() throws CFException  {              
   		return header1.getH1OrderStatusDesc();
   }

  
	/**
	*  set variable h1OrderStatusDesc
	*  @param value
	**/
   public void setH1OrderStatusDesc(char[] value) throws CFException {
      header1.setH1OrderStatusDesc(value);
   } 

     /**
	 * 	Update H1OrderStatusDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setH1OrderStatusDesc(char[] source, int sourceIndex) throws CFException {
      header1.setH1OrderStatusDesc(source, sourceIndex);
   	
   }
   
   public void setH1OrderStatusDesc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      header1.setH1OrderStatusDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update H1OrderStatusDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setH1OrderStatusDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      header1.setH1OrderStatusDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update H1OrderStatusDesc with another Field
	 *	@param value
	 */
   public void setH1OrderStatusDesc(Field source) {
      header1.setH1OrderStatusDesc(source);
   }  
   
     /**
	 * 	Update H1OrderStatusDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setH1OrderStatusDesc(Field source, int sourceIndex,int sourceLen) {
      header1.setH1OrderStatusDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update H1OrderStatusDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setH1OrderStatusDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      header1.setH1OrderStatusDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of detBuyerSeller
	 *	@return detBuyerSeller
	 */
   public char[] getDetBuyerSeller() throws CFException  {              
   		return detailRec.getDetBuyerSeller();
   }

  
	/**
	*  set variable detBuyerSeller
	*  @param value
	**/
   public void setDetBuyerSeller(char[] value) throws CFException {
      detailRec.setDetBuyerSeller(value);
   } 

     /**
	 * 	Update DetBuyerSeller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetBuyerSeller(char[] source, int sourceIndex) throws CFException {
      detailRec.setDetBuyerSeller(source, sourceIndex);
   	
   }
   
   public void setDetBuyerSeller(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailRec.setDetBuyerSeller(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DetBuyerSeller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetBuyerSeller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetBuyerSeller(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DetBuyerSeller with another Field
	 *	@param value
	 */
   public void setDetBuyerSeller(Field source) {
      detailRec.setDetBuyerSeller(source);
   }  
   
     /**
	 * 	Update DetBuyerSeller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetBuyerSeller(Field source, int sourceIndex,int sourceLen) {
      detailRec.setDetBuyerSeller(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DetBuyerSeller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetBuyerSeller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetBuyerSeller(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "H" for isPrintHeader188()
	 *	@return  Returns true if isPrintHeader188() is "H"
	 */
   public boolean isPrintHeader188() throws CFException {
      return work.isPrintHeader188();
   }

	/**
	*  set values "H"
	*/
   	public void setPrintHeader188True()  throws CFException{  			
    	work.setPrintHeader188True();
   	}
	/**
	 *	Returns the value of detAmount
	 *	@return detAmount
	 */
   public char[] getDetAmount() throws CFException  {              
   		return detailRec.getDetAmount();
   }

  
	/**
	*  set variable detAmount
	*  @param value
	**/
   public void setDetAmount(char[] value) throws CFException {
      detailRec.setDetAmount(value);
   } 

     /**
	 * 	Update DetAmount 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetAmount(char[] source, int sourceIndex) throws CFException {
      detailRec.setDetAmount(source, sourceIndex);
   	
   }
   
   public void setDetAmount(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailRec.setDetAmount(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DetAmount 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetAmount(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetAmount(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DetAmount with another Field
	 *	@param value
	 */
   public void setDetAmount(Field source) {
      detailRec.setDetAmount(source);
   }  
   
     /**
	 * 	Update DetAmount 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetAmount(Field source, int sourceIndex,int sourceLen) {
      detailRec.setDetAmount(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DetAmount 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetAmount(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetAmount(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isEndOfOrders88()
	 *	@return  Returns true if isEndOfOrders88() is "Y"
	 */
   public boolean isEndOfOrders88() throws CFException {
      return work.isEndOfOrders88();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfOrders88True()  throws CFException{  			
    	work.setEndOfOrders88True();
   	}
	/**
	 *	Test condition "Seller" for isDh1Seller88()
	 *	@return  Returns true if isDh1Seller88() is "Seller"
	 */
   public boolean isDh1Seller88() throws CFException {
      return detailHdr1.isDh1Seller88();
   }

	/**
	*  set values "Seller"
	*/
   	public void setDh1Seller88True()  throws CFException{  			
    	detailHdr1.setDh1Seller88True();
   	}
	/**
	 *	Returns the value of detTradingXchng
	 *	@return detTradingXchng
	 */
   public char[] getDetTradingXchng() throws CFException  {              
   		return detailRec.getDetTradingXchng();
   }

  
	/**
	*  set variable detTradingXchng
	*  @param value
	**/
   public void setDetTradingXchng(char[] value) throws CFException {
      detailRec.setDetTradingXchng(value);
   } 

     /**
	 * 	Update DetTradingXchng 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetTradingXchng(char[] source, int sourceIndex) throws CFException {
      detailRec.setDetTradingXchng(source, sourceIndex);
   	
   }
   
   public void setDetTradingXchng(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailRec.setDetTradingXchng(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DetTradingXchng 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetTradingXchng(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetTradingXchng(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DetTradingXchng with another Field
	 *	@param value
	 */
   public void setDetTradingXchng(Field source) {
      detailRec.setDetTradingXchng(source);
   }  
   
     /**
	 * 	Update DetTradingXchng 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetTradingXchng(Field source, int sourceIndex,int sourceLen) {
      detailRec.setDetTradingXchng(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DetTradingXchng 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetTradingXchng(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetTradingXchng(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of prevOrderStatus
	 *	@return prevOrderStatus
	 */
   public char[] getPrevOrderStatus() throws CFException  {              
   		return work.getPrevOrderStatus();
   }

  
	/**
	*  set variable prevOrderStatus
	*  @param value
	**/
   public void setPrevOrderStatus(char[] value) throws CFException {
      work.setPrevOrderStatus(value);
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
	 *	Returns the value of detCurrency
	 *	@return detCurrency
	 */
   public char[] getDetCurrency() throws CFException  {              
   		return detailRec.getDetCurrency();
   }

  
	/**
	*  set variable detCurrency
	*  @param value
	**/
   public void setDetCurrency(char[] value) throws CFException {
      detailRec.setDetCurrency(value);
   } 

     /**
	 * 	Update DetCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetCurrency(char[] source, int sourceIndex) throws CFException {
      detailRec.setDetCurrency(source, sourceIndex);
   	
   }
   
   public void setDetCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailRec.setDetCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DetCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DetCurrency with another Field
	 *	@param value
	 */
   public void setDetCurrency(Field source) {
      detailRec.setDetCurrency(source);
   }  
   
     /**
	 * 	Update DetCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetCurrency(Field source, int sourceIndex,int sourceLen) {
      detailRec.setDetCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DetCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of detQuantity
	 *	@return detQuantity
	 */
   public char[] getDetQuantity() throws CFException  {              
   		return detailRec.getDetQuantity();
   }

  
	/**
	*  set variable detQuantity
	*  @param value
	**/
   public void setDetQuantity(char[] value) throws CFException {
      detailRec.setDetQuantity(value);
   } 

     /**
	 * 	Update DetQuantity 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetQuantity(char[] source, int sourceIndex) throws CFException {
      detailRec.setDetQuantity(source, sourceIndex);
   	
   }
   
   public void setDetQuantity(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailRec.setDetQuantity(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DetQuantity 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetQuantity(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetQuantity(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DetQuantity with another Field
	 *	@param value
	 */
   public void setDetQuantity(Field source) {
      detailRec.setDetQuantity(source);
   }  
   
     /**
	 * 	Update DetQuantity 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetQuantity(Field source, int sourceIndex,int sourceLen) {
      detailRec.setDetQuantity(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DetQuantity 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetQuantity(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailRec.setDetQuantity(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of h1OrderStatusCode
	 *	@return h1OrderStatusCode
	 */
	public int getH1OrderStatusCode() throws CFException {
   		return header1.getH1OrderStatusCode();
	}


	/**
	 *	Returns String value of h1OrderStatusCode
	 *	@return h1OrderStatusCode
	 */
	public char[]  getH1OrderStatusCodeString() throws CFException {
	     return String.valueOf(header1.getH1OrderStatusCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean h1OrderStatusCodeIsNumeric()  throws CFException{
	    return header1.h1OrderStatusCodeIsNumeric();
	}

	/**
	 * 	Update H1OrderStatusCode with the passed value
	 *	@param number
	 */
	public void setH1OrderStatusCode(int number)  throws CFException{
		header1.setH1OrderStatusCode(number);
	}
	

	public void setH1OrderStatusCode(long number)  throws CFException{
	    header1.setH1OrderStatusCode(number);
	}
	
	
	/**
	 * 	Update H1OrderStatusCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setH1OrderStatusCode(char[] value)  throws CFException {
		header1.setH1OrderStatusCode(value);
	}
	
	/**
	 * 	Update H1OrderStatusCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setH1OrderStatusCodeString(char[] value)  throws CFException{
		header1.setH1OrderStatusCode(value);
	}	


        public Trdpb006Ctx getTrdpb006Ctx() {
            return Trdpb006Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += header1.hashCode();
        str += sqlca.hashCode();
        str += pageHeader.hashCode();
        str += dcltbtrdcus.hashCode();
        str += detailHdr1.hashCode();
        str += work.hashCode();
        str += dcltbtrdord.hashCode();
        str += reporderRecord.hashCode();
        str += detailRec.hashCode();
        str += dcltbtrdsec.hashCode();
       return str.hashCode();
    }

    public FetchProcessOrdersOutCtx clone() {
        FetchProcessOrdersOutCtx cloneObj = new FetchProcessOrdersOutCtx();
        cloneObj.header1 = new Header1();
        cloneObj.header1.set(header1.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.pageHeader = new PageHeader();
        cloneObj.pageHeader.set(pageHeader.getClonedField());
        cloneObj.dcltbtrdcus = new Dcltbtrdcus();
        cloneObj.dcltbtrdcus.set(dcltbtrdcus.getClonedField());
        cloneObj.detailHdr1 = new DetailHdr1();
        cloneObj.detailHdr1.set(detailHdr1.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dcltbtrdord = new Dcltbtrdord();
        cloneObj.dcltbtrdord.set(dcltbtrdord.getClonedField());
        cloneObj.reporderRecord = new ReporderRecord();
        cloneObj.reporderRecord.set(reporderRecord.getClonedField());
        cloneObj.detailRec = new DetailRec();
        cloneObj.detailRec.set(detailRec.getClonedField());
        cloneObj.dcltbtrdsec = new Dcltbtrdsec();
        cloneObj.dcltbtrdsec.set(dcltbtrdsec.getClonedField());
        return cloneObj;
    }

    }

    public FetchProcessOrdersOutCtx getFetchProcessOrdersOutCtx() {
            return new FetchProcessOrdersOutCtx();
    }
     public class ClosOrderCursorRptfileInCtx implements Cloneable {
     Sqlca sqlca = Trdpb006Ctx.this.getSqlca();
     Work work = Trdpb006Ctx.this.getWork();

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Returns the value of reporderFileStatus
	 *	@return reporderFileStatus
	 */
   public char[] getReporderFileStatus() throws CFException  {              
   		return work.getReporderFileStatus();
   }

  
	/**
	*  set variable reporderFileStatus
	*  @param value
	**/
   public void setReporderFileStatus(char[] value) throws CFException {
      work.setReporderFileStatus(value);
   } 


        public Trdpb006Ctx getTrdpb006Ctx() {
            return Trdpb006Ctx.this;
        }

        public ClosOrderCursorRptfileOutCtx getClosOrderCursorRptfileOutCtx() {
            return new ClosOrderCursorRptfileOutCtx();
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
       return str.hashCode();
    }

    public ClosOrderCursorRptfileInCtx clone() {
        ClosOrderCursorRptfileInCtx cloneObj = new ClosOrderCursorRptfileInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ClosOrderCursorRptfileInCtx getClosOrderCursorRptfileInCtx() {
            return new ClosOrderCursorRptfileInCtx();
    }
     public class ClosOrderCursorRptfileOutCtx implements Cloneable {
     Sqlca sqlca = Trdpb006Ctx.this.getSqlca();
     Work work = Trdpb006Ctx.this.getWork();

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
	 *	Returns the value of reporderFileStatus
	 *	@return reporderFileStatus
	 */
   public char[] getReporderFileStatus() throws CFException  {              
   		return work.getReporderFileStatus();
   }

  
	/**
	*  set variable reporderFileStatus
	*  @param value
	**/
   public void setReporderFileStatus(char[] value) throws CFException {
      work.setReporderFileStatus(value);
   } 


        public Trdpb006Ctx getTrdpb006Ctx() {
            return Trdpb006Ctx.this;
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
       return str.hashCode();
    }

    public ClosOrderCursorRptfileOutCtx clone() {
        ClosOrderCursorRptfileOutCtx cloneObj = new ClosOrderCursorRptfileOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ClosOrderCursorRptfileOutCtx getClosOrderCursorRptfileOutCtx() {
            return new ClosOrderCursorRptfileOutCtx();
    }
     public class TerminateOutCtx implements Cloneable {


        public Trdpb006Ctx getTrdpb006Ctx() {
            return Trdpb006Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
       return str.hashCode();
    }

    public TerminateOutCtx clone() {
        TerminateOutCtx cloneObj = new TerminateOutCtx();
        return cloneObj;
    }

    }

    public TerminateOutCtx getTerminateOutCtx() {
            return new TerminateOutCtx();
    }
}
