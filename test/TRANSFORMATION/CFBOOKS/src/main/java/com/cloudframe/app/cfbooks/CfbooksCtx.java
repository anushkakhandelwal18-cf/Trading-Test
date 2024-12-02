package com.cloudframe.app.cfbooks;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.cfbooks.dto.Work;
import com.cloudframe.app.cfbooks.dto.HeaderTime;
import com.cloudframe.app.cfbooks.dto.Sqlwarn;
import com.cloudframe.app.cfbooks.file.records.RepOpFields;
import com.cloudframe.app.cfbooks.dto.Vars;
import com.cloudframe.app.cfbooks.dto.BooksIsbn;
import com.cloudframe.app.cfbooks.dto.Nullvars;
import java.sql.ResultSet;
import com.cloudframe.app.cfbooks.dto.Dclbooks;
import com.cloudframe.app.cfbooks.dto.BooksTitle;
import com.cloudframe.app.cfbooks.dto.Sqlca;
import com.cloudframe.app.cfbooks.dto.HeaderTitle;


@Context
public class CfbooksCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    HeaderTime headerTime;
    Sqlca sqlca;
    Dclbooks dclbooks;
    Nullvars nullvars;
    Work work;
    RepOpFields repOpFields;
    Vars vars;
    HeaderTitle headerTitle;


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


    ResultSet bookscurResultSet;

    public ResultSet getBookscurResultSet() {
        return this.bookscurResultSet;
    }

    public void setBookscurResultSet(ResultSet bookscurResultSet) {
        this.bookscurResultSet = bookscurResultSet;
    }

    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }


    public HeaderTime getHeaderTime() {
        if (headerTime == null) {
            headerTime = new HeaderTime();
        }

        return headerTime;
    }

    public void setHeaderTime(HeaderTime headerTime) {
        this.headerTime = headerTime;
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
    public Dclbooks getDclbooks() {
        if (dclbooks == null) {
            dclbooks = new Dclbooks();
        }

        return dclbooks;
    }

    public void setDclbooks(Dclbooks dclbooks) {
        this.dclbooks = dclbooks;
    }
    public Nullvars getNullvars() {
        if (nullvars == null) {
            nullvars = new Nullvars();
        }

        return nullvars;
    }

    public void setNullvars(Nullvars nullvars) {
        this.nullvars = nullvars;
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
    public RepOpFields getRepOpFields() {
        if (repOpFields == null) {
            repOpFields = new RepOpFields();
        }

        return repOpFields;
    }

    public void setRepOpFields(RepOpFields repOpFields) {
        this.repOpFields = repOpFields;
    }
    public Vars getVars() {
        if (vars == null) {
            vars = new Vars();
        }

        return vars;
    }

    public void setVars(Vars vars) {
        this.vars = vars;
    }
    public HeaderTitle getHeaderTitle() {
        if (headerTitle == null) {
            headerTitle = new HeaderTitle();
        }

        return headerTitle;
    }

    public void setHeaderTitle(HeaderTitle headerTitle) {
        this.headerTitle = headerTitle;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += headerTime.hashCode();
        str += sqlca.hashCode();
        str += dclbooks.hashCode();
        str += nullvars.hashCode();
        str += work.hashCode();
        str += repOpFields.hashCode();
        str += vars.hashCode();
        str += headerTitle.hashCode();
       return str.hashCode();
    }

    public CfbooksCtx clone() {
        CfbooksCtx cloneObj = new CfbooksCtx();
        cloneObj.headerTime = new HeaderTime();
        cloneObj.headerTime.set(headerTime.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dclbooks = new Dclbooks();
        cloneObj.dclbooks.set(dclbooks.getClonedField());
        cloneObj.nullvars = new Nullvars();
        cloneObj.nullvars.set(nullvars.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.repOpFields = new RepOpFields();
        cloneObj.repOpFields.set(repOpFields.getClonedField());
        cloneObj.vars = new Vars();
        cloneObj.vars.set(vars.getClonedField());
        cloneObj.headerTitle = new HeaderTitle();
        cloneObj.headerTitle.set(headerTitle.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainInCtx implements Cloneable {
     HeaderTime headerTime = CfbooksCtx.this.getHeaderTime();
     Sqlca sqlca = CfbooksCtx.this.getSqlca();
     Work work = CfbooksCtx.this.getWork();

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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


        public CfbooksCtx getCfbooksCtx() {
            return CfbooksCtx.this;
        }

        public MainOutCtx getMainOutCtx() {
            return new MainOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += headerTime.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainInCtx clone() {
        MainInCtx cloneObj = new MainInCtx();
        cloneObj.headerTime = new HeaderTime();
        cloneObj.headerTime.set(headerTime.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainInCtx getMainInCtx() {
            return new MainInCtx();
    }
     public class MainOutCtx implements Cloneable {
     HeaderTime headerTime = CfbooksCtx.this.getHeaderTime();
     Sqlca sqlca = CfbooksCtx.this.getSqlca();
     Work work = CfbooksCtx.this.getWork();

	/**
	 *	Returns the value of pageNo
	 *	@return pageNo
	 */
	public int getPageNo() throws CFException {
   		return headerTime.getPageNo();
	}


	/**
	 *	Returns String value of pageNo
	 *	@return pageNo
	 */
	public char[]  getPageNoString() throws CFException {
	     return String.valueOf(headerTime.getPageNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pageNoIsNumeric()  throws CFException{
	    return headerTime.pageNoIsNumeric();
	}

	/**
	 * 	Update PageNo with the passed value
	 *	@param number
	 */
	public void setPageNo(int number)  throws CFException{
		headerTime.setPageNo(number);
	}
	

	public void setPageNo(long number)  throws CFException{
	    headerTime.setPageNo(number);
	}
	
	
	/**
	 * 	Update PageNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setPageNo(char[] value)  throws CFException {
		headerTime.setPageNo(value);
	}
	
	/**
	 * 	Update PageNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPageNoString(char[] value)  throws CFException{
		headerTime.setPageNo(value);
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
	 *	Test condition "Y" for isEndOfFile()
	 *	@return  Returns true if isEndOfFile() is "Y"
	 */
   public boolean isEndOfFile() throws CFException {
      return work.isEndOfFile();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfFileTrue()  throws CFException{  			
    	work.setEndOfFileTrue();
   	}
	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of eofFlag
	 *	@return eofFlag
	 */
   public char[] getEofFlag() throws CFException  {              
   		return work.getEofFlag();
   }

  
	/**
	*  set variable eofFlag
	*  @param value
	**/
   public void setEofFlag(char[] value) throws CFException {
      work.setEofFlag(value);
   } 

	/**
	 *	Returns the value of errMsg
	 *	@return errMsg
	 */
   public char[] getErrMsg() throws CFException  {              
   		return work.getErrMsg();
   }

  
	/**
	*  set variable errMsg
	*  @param value
	**/
   public void setErrMsg(char[] value) throws CFException {
      work.setErrMsg(value);
   } 

	/**
	 *	Test condition 1 for isDontWriteRec88()
	 *	@return  Returns true if isDontWriteRec88() is 1
	 */
   public boolean isDontWriteRec88() throws CFException {
      return work.isDontWriteRec88();
   }

	/**
	*  set values 1
	*/
   	public void setDontWriteRec88True()  throws CFException{  			
    	work.setDontWriteRec88True();
   	}

        public CfbooksCtx getCfbooksCtx() {
            return CfbooksCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += headerTime.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainOutCtx clone() {
        MainOutCtx cloneObj = new MainOutCtx();
        cloneObj.headerTime = new HeaderTime();
        cloneObj.headerTime.set(headerTime.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainOutCtx getMainOutCtx() {
            return new MainOutCtx();
    }
     public class InitializeInCtx implements Cloneable {
     HeaderTime headerTime = CfbooksCtx.this.getHeaderTime();
     Sqlca sqlca = CfbooksCtx.this.getSqlca();
     Dclbooks dclbooks = CfbooksCtx.this.getDclbooks();
     Work work = CfbooksCtx.this.getWork();
     RepOpFields repOpFields = CfbooksCtx.this.getRepOpFields();
     Vars vars = CfbooksCtx.this.getVars();
     HeaderTitle headerTitle = CfbooksCtx.this.getHeaderTitle();

	/**
	 *	Returns the value of timestamp
	 *	@return timestamp
	 */
   public char[] getTimestamp() throws CFException  {              
   		return vars.getTimestamp();
   }

  
	/**
	*  set variable timestamp
	*  @param value
	**/
   public void setTimestamp(char[] value) throws CFException {
      vars.setTimestamp(value);
   } 

     /**
	 * 	Update Timestamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTimestamp(char[] source, int sourceIndex) throws CFException {
      vars.setTimestamp(source, sourceIndex);
   	
   }
   
   public void setTimestamp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vars.setTimestamp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Timestamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTimestamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vars.setTimestamp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Timestamp with another Field
	 *	@param value
	 */
   public void setTimestamp(Field source) {
      vars.setTimestamp(source);
   }  
   
     /**
	 * 	Update Timestamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTimestamp(Field source, int sourceIndex,int sourceLen) {
      vars.setTimestamp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Timestamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTimestamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vars.setTimestamp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of headerTime
	 *	@return headerTime
	 */   
	 public HeaderTime getHeaderTime() {
   	return headerTime;
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
	 *	Returns the value of repOpFields
	 *	@return repOpFields
	 */   
	 public RepOpFields getRepOpFields() {
   	return repOpFields;
   }


	/**
	 *	Returns the value of vars
	 *	@return vars
	 */   
	 public Vars getVars() {
   	return vars;
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


        public CfbooksCtx getCfbooksCtx() {
            return CfbooksCtx.this;
        }

        public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += headerTime.hashCode();
        str += sqlca.hashCode();
        str += dclbooks.hashCode();
        str += work.hashCode();
        str += repOpFields.hashCode();
        str += vars.hashCode();
        str += headerTitle.hashCode();
       return str.hashCode();
    }

    public InitializeInCtx clone() {
        InitializeInCtx cloneObj = new InitializeInCtx();
        cloneObj.headerTime = new HeaderTime();
        cloneObj.headerTime.set(headerTime.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dclbooks = new Dclbooks();
        cloneObj.dclbooks.set(dclbooks.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.repOpFields = new RepOpFields();
        cloneObj.repOpFields.set(repOpFields.getClonedField());
        cloneObj.vars = new Vars();
        cloneObj.vars.set(vars.getClonedField());
        cloneObj.headerTitle = new HeaderTitle();
        cloneObj.headerTitle.set(headerTitle.getClonedField());
        return cloneObj;
    }

    }

    public InitializeInCtx getInitializeInCtx() {
            return new InitializeInCtx();
    }
     public class InitializeOutCtx implements Cloneable {
     HeaderTime headerTime = CfbooksCtx.this.getHeaderTime();
     Sqlca sqlca = CfbooksCtx.this.getSqlca();
     Dclbooks dclbooks = CfbooksCtx.this.getDclbooks();
     Work work = CfbooksCtx.this.getWork();
     RepOpFields repOpFields = CfbooksCtx.this.getRepOpFields();
     Vars vars = CfbooksCtx.this.getVars();
     HeaderTitle headerTitle = CfbooksCtx.this.getHeaderTitle();

	/**
	 *	Returns the value of booksIsbnText
	 *	@return booksIsbnText
	 */
   public char[] getBooksIsbnText() throws CFException  {              
   		return dclbooks.getBooksIsbn().getBooksIsbnText();
   }

  
	/**
	*  set variable booksIsbnText
	*  @param value
	**/
   public void setBooksIsbnText(char[] value) throws CFException {
      dclbooks.getBooksIsbn().setBooksIsbnText(value);
   } 

     /**
	 * 	Update BooksIsbnText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBooksIsbnText(char[] source, int sourceIndex) throws CFException {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex);
   	
   }
   
   public void setBooksIsbnText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BooksIsbnText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksIsbnText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BooksIsbnText with another Field
	 *	@param value
	 */
   public void setBooksIsbnText(Field source) {
      dclbooks.getBooksIsbn().setBooksIsbnText(source);
   }  
   
     /**
	 * 	Update BooksIsbnText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBooksIsbnText(Field source, int sourceIndex,int sourceLen) {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BooksIsbnText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksIsbnText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of timeR
	 *	@return timeR
	 */
   public char[] getTimeR() throws CFException  {              
   		return headerTime.getTimeR();
   }

  
	/**
	*  set variable timeR
	*  @param value
	**/
   public void setTimeR(char[] value) throws CFException {
      headerTime.setTimeR(value);
   } 

     /**
	 * 	Update TimeR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTimeR(char[] source, int sourceIndex) throws CFException {
      headerTime.setTimeR(source, sourceIndex);
   	
   }
   
   public void setTimeR(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      headerTime.setTimeR(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TimeR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTimeR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      headerTime.setTimeR(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TimeR with another Field
	 *	@param value
	 */
   public void setTimeR(Field source) {
      headerTime.setTimeR(source);
   }  
   
     /**
	 * 	Update TimeR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTimeR(Field source, int sourceIndex,int sourceLen) {
      headerTime.setTimeR(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TimeR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTimeR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      headerTime.setTimeR(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of repopStat
	 *	@return repopStat
	 */
	public int getRepopStat() throws CFException {
   		return work.getRepopStat();
	}


	/**
	 *	Returns String value of repopStat
	 *	@return repopStat
	 */
	public char[]  getRepopStatString() throws CFException {
	     return String.valueOf(work.getRepopStatString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean repopStatIsNumeric()  throws CFException{
	    return work.repopStatIsNumeric();
	}

	/**
	 * 	Update RepopStat with the passed value
	 *	@param number
	 */
	public void setRepopStat(int number)  throws CFException{
		work.setRepopStat(number);
	}
	

	public void setRepopStat(long number)  throws CFException{
	    work.setRepopStat(number);
	}
	
	
	/**
	 * 	Update RepopStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setRepopStat(char[] value)  throws CFException {
		work.setRepopStat(value);
	}
	
	/**
	 * 	Update RepopStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRepopStatString(char[] value)  throws CFException{
		work.setRepopStat(value);
	}	

	/**
	 *	Returns the value of booksIsbnLen
	 *	@return booksIsbnLen
	 */
	public short getBooksIsbnLen() throws CFException {        
   		return dclbooks.getBooksIsbn().getBooksIsbnLen();
	}
	
	/**
	 * 	Update BooksIsbnLen with the passed value
	 *	@param number
	 */
	public void setBooksIsbnLen(short number)  throws CFException{
		dclbooks.getBooksIsbn().setBooksIsbnLen(number);
	}

	public void setBooksIsbnLen(int number)  throws CFException{
		dclbooks.getBooksIsbn().setBooksIsbnLen((short)number);
	}

	public void setBooksIsbnLen(long number)  throws CFException{
		dclbooks.getBooksIsbn().setBooksIsbnLen((short)number);
	}



	/**
	 *	Returns the value of vars
	 *	@return vars
	 */   
	 public Vars getVars() {
   	return vars;
   }


	/**
	 *	Returns the value of booksTitleLen
	 *	@return booksTitleLen
	 */
	public short getBooksTitleLen() throws CFException {        
   		return dclbooks.getBooksTitle().getBooksTitleLen();
	}
	
	/**
	 * 	Update BooksTitleLen with the passed value
	 *	@param number
	 */
	public void setBooksTitleLen(short number)  throws CFException{
		dclbooks.getBooksTitle().setBooksTitleLen(number);
	}

	public void setBooksTitleLen(int number)  throws CFException{
		dclbooks.getBooksTitle().setBooksTitleLen((short)number);
	}

	public void setBooksTitleLen(long number)  throws CFException{
		dclbooks.getBooksTitle().setBooksTitleLen((short)number);
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
	 *	Returns the value of dateR
	 *	@return dateR
	 */
   public char[] getDateR() throws CFException  {              
   		return headerTitle.getDateR();
   }

  
	/**
	*  set variable dateR
	*  @param value
	**/
   public void setDateR(char[] value) throws CFException {
      headerTitle.setDateR(value);
   } 

     /**
	 * 	Update DateR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDateR(char[] source, int sourceIndex) throws CFException {
      headerTitle.setDateR(source, sourceIndex);
   	
   }
   
   public void setDateR(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      headerTitle.setDateR(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DateR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDateR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      headerTitle.setDateR(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DateR with another Field
	 *	@param value
	 */
   public void setDateR(Field source) {
      headerTitle.setDateR(source);
   }  
   
     /**
	 * 	Update DateR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDateR(Field source, int sourceIndex,int sourceLen) {
      headerTitle.setDateR(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DateR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDateR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      headerTitle.setDateR(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of timestamp
	 *	@return timestamp
	 */
   public char[] getTimestamp() throws CFException  {              
   		return vars.getTimestamp();
   }

  
	/**
	*  set variable timestamp
	*  @param value
	**/
   public void setTimestamp(char[] value) throws CFException {
      vars.setTimestamp(value);
   } 

     /**
	 * 	Update Timestamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTimestamp(char[] source, int sourceIndex) throws CFException {
      vars.setTimestamp(source, sourceIndex);
   	
   }
   
   public void setTimestamp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vars.setTimestamp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Timestamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTimestamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vars.setTimestamp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Timestamp with another Field
	 *	@param value
	 */
   public void setTimestamp(Field source) {
      vars.setTimestamp(source);
   }  
   
     /**
	 * 	Update Timestamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTimestamp(Field source, int sourceIndex,int sourceLen) {
      vars.setTimestamp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Timestamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTimestamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vars.setTimestamp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of booksTitleText
	 *	@return booksTitleText
	 */
   public char[] getBooksTitleText() throws CFException  {              
   		return dclbooks.getBooksTitle().getBooksTitleText();
   }

  
	/**
	*  set variable booksTitleText
	*  @param value
	**/
   public void setBooksTitleText(char[] value) throws CFException {
      dclbooks.getBooksTitle().setBooksTitleText(value);
   } 

     /**
	 * 	Update BooksTitleText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBooksTitleText(char[] source, int sourceIndex) throws CFException {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex);
   	
   }
   
   public void setBooksTitleText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BooksTitleText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitleText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BooksTitleText with another Field
	 *	@param value
	 */
   public void setBooksTitleText(Field source) {
      dclbooks.getBooksTitle().setBooksTitleText(source);
   }  
   
     /**
	 * 	Update BooksTitleText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBooksTitleText(Field source, int sourceIndex,int sourceLen) {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BooksTitleText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitleText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errLoc
	 *	@return errLoc
	 */
   public char[] getErrLoc() throws CFException  {              
   		return work.getErrLoc();
   }

  
	/**
	*  set variable errLoc
	*  @param value
	**/
   public void setErrLoc(char[] value) throws CFException {
      work.setErrLoc(value);
   } 

	/**
	 *	Returns the value of errMsg
	 *	@return errMsg
	 */
   public char[] getErrMsg() throws CFException  {              
   		return work.getErrMsg();
   }

  
	/**
	*  set variable errMsg
	*  @param value
	**/
   public void setErrMsg(char[] value) throws CFException {
      work.setErrMsg(value);
   } 


        public CfbooksCtx getCfbooksCtx() {
            return CfbooksCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += headerTime.hashCode();
        str += sqlca.hashCode();
        str += dclbooks.hashCode();
        str += work.hashCode();
        str += repOpFields.hashCode();
        str += vars.hashCode();
        str += headerTitle.hashCode();
       return str.hashCode();
    }

    public InitializeOutCtx clone() {
        InitializeOutCtx cloneObj = new InitializeOutCtx();
        cloneObj.headerTime = new HeaderTime();
        cloneObj.headerTime.set(headerTime.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dclbooks = new Dclbooks();
        cloneObj.dclbooks.set(dclbooks.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.repOpFields = new RepOpFields();
        cloneObj.repOpFields.set(repOpFields.getClonedField());
        cloneObj.vars = new Vars();
        cloneObj.vars.set(vars.getClonedField());
        cloneObj.headerTitle = new HeaderTitle();
        cloneObj.headerTitle.set(headerTitle.getClonedField());
        return cloneObj;
    }

    }

    public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
    }
     public class WriteHeaderInCtx implements Cloneable {
     HeaderTime headerTime = CfbooksCtx.this.getHeaderTime();
     Work work = CfbooksCtx.this.getWork();
     RepOpFields repOpFields = CfbooksCtx.this.getRepOpFields();
     HeaderTitle headerTitle = CfbooksCtx.this.getHeaderTitle();

	/**
	 *	Returns the value of headerTime
	 *	@return headerTime
	 */   
	 public HeaderTime getHeaderTime() {
   	return headerTime;
   }


	/**
	 *	Returns the value of headerLine
	 *	@return headerLine
	 */
   public char[] getHeaderLine() throws CFException  {              
   		return work.getHeaderLine();
   }

  
	/**
	*  set variable headerLine
	*  @param value
	**/
   public void setHeaderLine(char[] value) throws CFException {
      work.setHeaderLine(value);
   } 

	/**
	 *	Returns the value of repOpFields
	 *	@return repOpFields
	 */   
	 public RepOpFields getRepOpFields() {
   	return repOpFields;
   }


	/**
	 *	Returns the value of headerLabel
	 *	@return headerLabel
	 */
   public char[] getHeaderLabel() throws CFException  {              
   		return work.getHeaderLabel();
   }

  
	/**
	*  set variable headerLabel
	*  @param value
	**/
   public void setHeaderLabel(char[] value) throws CFException {
      work.setHeaderLabel(value);
   } 

	/**
	 *	Returns the value of headerTitle
	 *	@return headerTitle
	 */   
	 public HeaderTitle getHeaderTitle() {
   	return headerTitle;
   }


	/**
	 *	Returns the value of space
	 *	@return space
	 */
   public char[] getSpace() throws CFException  {              
   		return work.getSpace();
   }

  
	/**
	*  set variable space
	*  @param value
	**/
   public void setSpace(char[] value) throws CFException {
      work.setSpace(value);
   } 


        public CfbooksCtx getCfbooksCtx() {
            return CfbooksCtx.this;
        }

        public WriteHeaderOutCtx getWriteHeaderOutCtx() {
            return new WriteHeaderOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += headerTime.hashCode();
        str += work.hashCode();
        str += repOpFields.hashCode();
        str += headerTitle.hashCode();
       return str.hashCode();
    }

    public WriteHeaderInCtx clone() {
        WriteHeaderInCtx cloneObj = new WriteHeaderInCtx();
        cloneObj.headerTime = new HeaderTime();
        cloneObj.headerTime.set(headerTime.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.repOpFields = new RepOpFields();
        cloneObj.repOpFields.set(repOpFields.getClonedField());
        cloneObj.headerTitle = new HeaderTitle();
        cloneObj.headerTitle.set(headerTitle.getClonedField());
        return cloneObj;
    }

    }

    public WriteHeaderInCtx getWriteHeaderInCtx() {
            return new WriteHeaderInCtx();
    }
     public class WriteHeaderOutCtx implements Cloneable {
     HeaderTime headerTime = CfbooksCtx.this.getHeaderTime();
     Work work = CfbooksCtx.this.getWork();
     RepOpFields repOpFields = CfbooksCtx.this.getRepOpFields();
     HeaderTitle headerTitle = CfbooksCtx.this.getHeaderTitle();

	/**
	 *	Returns the value of repOpFields
	 *	@return repOpFields
	 */   
	 public RepOpFields getRepOpFields() {
   	return repOpFields;
   }


	/**
	 *	Returns the value of repopStat
	 *	@return repopStat
	 */
	public int getRepopStat() throws CFException {
   		return work.getRepopStat();
	}


	/**
	 *	Returns String value of repopStat
	 *	@return repopStat
	 */
	public char[]  getRepopStatString() throws CFException {
	     return String.valueOf(work.getRepopStatString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean repopStatIsNumeric()  throws CFException{
	    return work.repopStatIsNumeric();
	}

	/**
	 * 	Update RepopStat with the passed value
	 *	@param number
	 */
	public void setRepopStat(int number)  throws CFException{
		work.setRepopStat(number);
	}
	

	public void setRepopStat(long number)  throws CFException{
	    work.setRepopStat(number);
	}
	
	
	/**
	 * 	Update RepopStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setRepopStat(char[] value)  throws CFException {
		work.setRepopStat(value);
	}
	
	/**
	 * 	Update RepopStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRepopStatString(char[] value)  throws CFException{
		work.setRepopStat(value);
	}	

	/**
	 *	Returns the value of errLoc
	 *	@return errLoc
	 */
   public char[] getErrLoc() throws CFException  {              
   		return work.getErrLoc();
   }

  
	/**
	*  set variable errLoc
	*  @param value
	**/
   public void setErrLoc(char[] value) throws CFException {
      work.setErrLoc(value);
   } 

	/**
	 *	Returns the value of errMsg
	 *	@return errMsg
	 */
   public char[] getErrMsg() throws CFException  {              
   		return work.getErrMsg();
   }

  
	/**
	*  set variable errMsg
	*  @param value
	**/
   public void setErrMsg(char[] value) throws CFException {
      work.setErrMsg(value);
   } 


        public CfbooksCtx getCfbooksCtx() {
            return CfbooksCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += headerTime.hashCode();
        str += work.hashCode();
        str += repOpFields.hashCode();
        str += headerTitle.hashCode();
       return str.hashCode();
    }

    public WriteHeaderOutCtx clone() {
        WriteHeaderOutCtx cloneObj = new WriteHeaderOutCtx();
        cloneObj.headerTime = new HeaderTime();
        cloneObj.headerTime.set(headerTime.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.repOpFields = new RepOpFields();
        cloneObj.repOpFields.set(repOpFields.getClonedField());
        cloneObj.headerTitle = new HeaderTitle();
        cloneObj.headerTitle.set(headerTitle.getClonedField());
        return cloneObj;
    }

    }

    public WriteHeaderOutCtx getWriteHeaderOutCtx() {
            return new WriteHeaderOutCtx();
    }
     public class FetchCursorInCtx implements Cloneable {
     Sqlca sqlca = CfbooksCtx.this.getSqlca();
     Dclbooks dclbooks = CfbooksCtx.this.getDclbooks();
     Nullvars nullvars = CfbooksCtx.this.getNullvars();
     Work work = CfbooksCtx.this.getWork();

	/**
	 *	Returns the value of booksIsbnText
	 *	@return booksIsbnText
	 */
   public char[] getBooksIsbnText() throws CFException  {              
   		return dclbooks.getBooksIsbn().getBooksIsbnText();
   }

  
	/**
	*  set variable booksIsbnText
	*  @param value
	**/
   public void setBooksIsbnText(char[] value) throws CFException {
      dclbooks.getBooksIsbn().setBooksIsbnText(value);
   } 

     /**
	 * 	Update BooksIsbnText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBooksIsbnText(char[] source, int sourceIndex) throws CFException {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex);
   	
   }
   
   public void setBooksIsbnText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BooksIsbnText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksIsbnText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BooksIsbnText with another Field
	 *	@param value
	 */
   public void setBooksIsbnText(Field source) {
      dclbooks.getBooksIsbn().setBooksIsbnText(source);
   }  
   
     /**
	 * 	Update BooksIsbnText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBooksIsbnText(Field source, int sourceIndex,int sourceLen) {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BooksIsbnText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksIsbnText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of booksPublisherId
	 *	@return booksPublisherId
	 */
	public int getBooksPublisherId() throws CFException {        
   		return dclbooks.getBooksPublisherId();
	}
	
	/**
	 * 	Update BooksPublisherId with the passed value
	 *	@param number
	 */
	public void setBooksPublisherId(int number)  throws CFException{
		dclbooks.setBooksPublisherId(number);
	}


	public void setBooksPublisherId(long number)  throws CFException{
		dclbooks.setBooksPublisherId((int)number);
	}


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Returns the value of dclbooks
	 *	@return dclbooks
	 */   
	 public Dclbooks getDclbooks() {
   	return dclbooks;
   }


	/**
	 *	Returns the value of nullvars
	 *	@return nullvars
	 */   
	 public Nullvars getNullvars() {
   	return nullvars;
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
	 *	Returns the value of booksBookId
	 *	@return booksBookId
	 */
	public int getBooksBookId() throws CFException {        
   		return dclbooks.getBooksBookId();
	}
	
	/**
	 * 	Update BooksBookId with the passed value
	 *	@param number
	 */
	public void setBooksBookId(int number)  throws CFException{
		dclbooks.setBooksBookId(number);
	}


	public void setBooksBookId(long number)  throws CFException{
		dclbooks.setBooksBookId((int)number);
	}


	/**
	 *	Returns the value of booksTitle
	 *	@return booksTitle
	 */   
	 public BooksTitle getBooksTitle() {
   	return dclbooks.getBooksTitle();
   }

   /**
	* 	Update BooksTitle with the passed value
	*	@param value
	*/
   public void setBooksTitle(char[] value) throws CFException {
      dclbooks.setBooksTitle(value);
   }   

     /**
	 * 	Update BooksTitle 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBooksTitle(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	dclbooks.setBooksTitle(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BooksTitle 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitle(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	dclbooks.setBooksTitle(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BooksTitle with another Field
	 *	@param value
	 */
   public void setBooksTitle(Field source) {
   	dclbooks.setBooksTitle(source);
   }  
   
     /**
	 * 	Update BooksTitle 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBooksTitle(Field source, int sourceIndex,int sourceLen) {
   	dclbooks.setBooksTitle(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BooksTitle 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitle(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	dclbooks.setBooksTitle(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of booksIsbnLen
	 *	@return booksIsbnLen
	 */
	public short getBooksIsbnLen() throws CFException {        
   		return dclbooks.getBooksIsbn().getBooksIsbnLen();
	}
	
	/**
	 * 	Update BooksIsbnLen with the passed value
	 *	@param number
	 */
	public void setBooksIsbnLen(short number)  throws CFException{
		dclbooks.getBooksIsbn().setBooksIsbnLen(number);
	}

	public void setBooksIsbnLen(int number)  throws CFException{
		dclbooks.getBooksIsbn().setBooksIsbnLen((short)number);
	}

	public void setBooksIsbnLen(long number)  throws CFException{
		dclbooks.getBooksIsbn().setBooksIsbnLen((short)number);
	}



	/**
	 *	Returns the value of booksTitleLen
	 *	@return booksTitleLen
	 */
	public short getBooksTitleLen() throws CFException {        
   		return dclbooks.getBooksTitle().getBooksTitleLen();
	}
	
	/**
	 * 	Update BooksTitleLen with the passed value
	 *	@param number
	 */
	public void setBooksTitleLen(short number)  throws CFException{
		dclbooks.getBooksTitle().setBooksTitleLen(number);
	}

	public void setBooksTitleLen(int number)  throws CFException{
		dclbooks.getBooksTitle().setBooksTitleLen((short)number);
	}

	public void setBooksTitleLen(long number)  throws CFException{
		dclbooks.getBooksTitle().setBooksTitleLen((short)number);
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
	 *	Returns the value of dateNull
	 *	@return dateNull
	 */
	public short getDateNull() throws CFException {        
   		return nullvars.getDateNull();
	}
	
	/**
	 * 	Update DateNull with the passed value
	 *	@param number
	 */
	public void setDateNull(short number)  throws CFException{
		nullvars.setDateNull(number);
	}

	public void setDateNull(int number)  throws CFException{
		nullvars.setDateNull((short)number);
	}

	public void setDateNull(long number)  throws CFException{
		nullvars.setDateNull((short)number);
	}



	/**
	 *	Returns the value of booksTitleText
	 *	@return booksTitleText
	 */
   public char[] getBooksTitleText() throws CFException  {              
   		return dclbooks.getBooksTitle().getBooksTitleText();
   }

  
	/**
	*  set variable booksTitleText
	*  @param value
	**/
   public void setBooksTitleText(char[] value) throws CFException {
      dclbooks.getBooksTitle().setBooksTitleText(value);
   } 

     /**
	 * 	Update BooksTitleText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBooksTitleText(char[] source, int sourceIndex) throws CFException {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex);
   	
   }
   
   public void setBooksTitleText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BooksTitleText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitleText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BooksTitleText with another Field
	 *	@param value
	 */
   public void setBooksTitleText(Field source) {
      dclbooks.getBooksTitle().setBooksTitleText(source);
   }  
   
     /**
	 * 	Update BooksTitleText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBooksTitleText(Field source, int sourceIndex,int sourceLen) {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BooksTitleText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitleText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of isbnNull
	 *	@return isbnNull
	 */
	public short getIsbnNull() throws CFException {        
   		return nullvars.getIsbnNull();
	}
	
	/**
	 * 	Update IsbnNull with the passed value
	 *	@param number
	 */
	public void setIsbnNull(short number)  throws CFException{
		nullvars.setIsbnNull(number);
	}

	public void setIsbnNull(int number)  throws CFException{
		nullvars.setIsbnNull((short)number);
	}

	public void setIsbnNull(long number)  throws CFException{
		nullvars.setIsbnNull((short)number);
	}



	public BigDecimal getBooksRating() throws CFException{      
   		return dclbooks.getBooksRating();
	}

    public char[] getBooksRatingString() throws CFException {
          return  dclbooks.getBooksRating().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update BooksRating with the passed number
	 *	@param number
	 */
	public void setBooksRating(BigDecimal number)  throws CFException{
		dclbooks.setBooksRating(number);
   }

	/**
	 *	Returns the value of idNull
	 *	@return idNull
	 */
	public short getIdNull() throws CFException {        
   		return nullvars.getIdNull();
	}
	
	/**
	 * 	Update IdNull with the passed value
	 *	@param number
	 */
	public void setIdNull(short number)  throws CFException{
		nullvars.setIdNull(number);
	}

	public void setIdNull(int number)  throws CFException{
		nullvars.setIdNull((short)number);
	}

	public void setIdNull(long number)  throws CFException{
		nullvars.setIdNull((short)number);
	}



	/**
	 *	Returns the value of booksTotalPages
	 *	@return booksTotalPages
	 */
	public int getBooksTotalPages() throws CFException {        
   		return dclbooks.getBooksTotalPages();
	}
	
	/**
	 * 	Update BooksTotalPages with the passed value
	 *	@param number
	 */
	public void setBooksTotalPages(int number)  throws CFException{
		dclbooks.setBooksTotalPages(number);
	}


	public void setBooksTotalPages(long number)  throws CFException{
		dclbooks.setBooksTotalPages((int)number);
	}


	/**
	 *	Returns the value of booksPublishedDate
	 *	@return booksPublishedDate
	 */
   public char[] getBooksPublishedDate() throws CFException  {              
   		return dclbooks.getBooksPublishedDate();
   }

  
	/**
	*  set variable booksPublishedDate
	*  @param value
	**/
   public void setBooksPublishedDate(char[] value) throws CFException {
      dclbooks.setBooksPublishedDate(value);
   } 

     /**
	 * 	Update BooksPublishedDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBooksPublishedDate(char[] source, int sourceIndex) throws CFException {
      dclbooks.setBooksPublishedDate(source, sourceIndex);
   	
   }
   
   public void setBooksPublishedDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclbooks.setBooksPublishedDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BooksPublishedDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksPublishedDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.setBooksPublishedDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BooksPublishedDate with another Field
	 *	@param value
	 */
   public void setBooksPublishedDate(Field source) {
      dclbooks.setBooksPublishedDate(source);
   }  
   
     /**
	 * 	Update BooksPublishedDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBooksPublishedDate(Field source, int sourceIndex,int sourceLen) {
      dclbooks.setBooksPublishedDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BooksPublishedDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksPublishedDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.setBooksPublishedDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pageNull
	 *	@return pageNull
	 */
	public short getPageNull() throws CFException {        
   		return nullvars.getPageNull();
	}
	
	/**
	 * 	Update PageNull with the passed value
	 *	@param number
	 */
	public void setPageNull(short number)  throws CFException{
		nullvars.setPageNull(number);
	}

	public void setPageNull(int number)  throws CFException{
		nullvars.setPageNull((short)number);
	}

	public void setPageNull(long number)  throws CFException{
		nullvars.setPageNull((short)number);
	}



	/**
	 *	Returns the value of booksIsbn
	 *	@return booksIsbn
	 */   
	 public BooksIsbn getBooksIsbn() {
   	return dclbooks.getBooksIsbn();
   }

   /**
	* 	Update BooksIsbn with the passed value
	*	@param value
	*/
   public void setBooksIsbn(char[] value) throws CFException {
      dclbooks.setBooksIsbn(value);
   }   

     /**
	 * 	Update BooksIsbn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBooksIsbn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	dclbooks.setBooksIsbn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BooksIsbn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksIsbn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	dclbooks.setBooksIsbn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BooksIsbn with another Field
	 *	@param value
	 */
   public void setBooksIsbn(Field source) {
   	dclbooks.setBooksIsbn(source);
   }  
   
     /**
	 * 	Update BooksIsbn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBooksIsbn(Field source, int sourceIndex,int sourceLen) {
   	dclbooks.setBooksIsbn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BooksIsbn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksIsbn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	dclbooks.setBooksIsbn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rateNull
	 *	@return rateNull
	 */
	public short getRateNull() throws CFException {        
   		return nullvars.getRateNull();
	}
	
	/**
	 * 	Update RateNull with the passed value
	 *	@param number
	 */
	public void setRateNull(short number)  throws CFException{
		nullvars.setRateNull(number);
	}

	public void setRateNull(int number)  throws CFException{
		nullvars.setRateNull((short)number);
	}

	public void setRateNull(long number)  throws CFException{
		nullvars.setRateNull((short)number);
	}




        public CfbooksCtx getCfbooksCtx() {
            return CfbooksCtx.this;
        }

        public FetchCursorOutCtx getFetchCursorOutCtx() {
            return new FetchCursorOutCtx();
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
        str += dclbooks.hashCode();
        str += nullvars.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FetchCursorInCtx clone() {
        FetchCursorInCtx cloneObj = new FetchCursorInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dclbooks = new Dclbooks();
        cloneObj.dclbooks.set(dclbooks.getClonedField());
        cloneObj.nullvars = new Nullvars();
        cloneObj.nullvars.set(nullvars.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FetchCursorInCtx getFetchCursorInCtx() {
            return new FetchCursorInCtx();
    }
     public class FetchCursorOutCtx implements Cloneable {
     Sqlca sqlca = CfbooksCtx.this.getSqlca();
     Dclbooks dclbooks = CfbooksCtx.this.getDclbooks();
     Nullvars nullvars = CfbooksCtx.this.getNullvars();
     Work work = CfbooksCtx.this.getWork();

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
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of dclbooks
	 *	@return dclbooks
	 */   
	 public Dclbooks getDclbooks() {
   	return dclbooks;
   }


	/**
	 *	Returns the value of nullvars
	 *	@return nullvars
	 */   
	 public Nullvars getNullvars() {
   	return nullvars;
   }


	/**
	 *	Returns the value of errLoc
	 *	@return errLoc
	 */
   public char[] getErrLoc() throws CFException  {              
   		return work.getErrLoc();
   }

  
	/**
	*  set variable errLoc
	*  @param value
	**/
   public void setErrLoc(char[] value) throws CFException {
      work.setErrLoc(value);
   } 

	/**
	 *	Returns the value of errMsg
	 *	@return errMsg
	 */
   public char[] getErrMsg() throws CFException  {              
   		return work.getErrMsg();
   }

  
	/**
	*  set variable errMsg
	*  @param value
	**/
   public void setErrMsg(char[] value) throws CFException {
      work.setErrMsg(value);
   } 


        public CfbooksCtx getCfbooksCtx() {
            return CfbooksCtx.this;
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
        str += dclbooks.hashCode();
        str += nullvars.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FetchCursorOutCtx clone() {
        FetchCursorOutCtx cloneObj = new FetchCursorOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dclbooks = new Dclbooks();
        cloneObj.dclbooks.set(dclbooks.getClonedField());
        cloneObj.nullvars = new Nullvars();
        cloneObj.nullvars.set(nullvars.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FetchCursorOutCtx getFetchCursorOutCtx() {
            return new FetchCursorOutCtx();
    }
     public class SqlmainInCtx implements Cloneable {
     Dclbooks dclbooks = CfbooksCtx.this.getDclbooks();
     Work work = CfbooksCtx.this.getWork();
     RepOpFields repOpFields = CfbooksCtx.this.getRepOpFields();
     Vars vars = CfbooksCtx.this.getVars();

	/**
	 *	Returns the value of booksIsbnText
	 *	@return booksIsbnText
	 */
   public char[] getBooksIsbnText() throws CFException  {              
   		return dclbooks.getBooksIsbn().getBooksIsbnText();
   }

  
	/**
	*  set variable booksIsbnText
	*  @param value
	**/
   public void setBooksIsbnText(char[] value) throws CFException {
      dclbooks.getBooksIsbn().setBooksIsbnText(value);
   } 

     /**
	 * 	Update BooksIsbnText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBooksIsbnText(char[] source, int sourceIndex) throws CFException {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex);
   	
   }
   
   public void setBooksIsbnText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BooksIsbnText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksIsbnText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BooksIsbnText with another Field
	 *	@param value
	 */
   public void setBooksIsbnText(Field source) {
      dclbooks.getBooksIsbn().setBooksIsbnText(source);
   }  
   
     /**
	 * 	Update BooksIsbnText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBooksIsbnText(Field source, int sourceIndex,int sourceLen) {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BooksIsbnText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksIsbnText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of booksPublisherId
	 *	@return booksPublisherId
	 */
	public int getBooksPublisherId() throws CFException {        
   		return dclbooks.getBooksPublisherId();
	}
	
	/**
	 * 	Update BooksPublisherId with the passed value
	 *	@param number
	 */
	public void setBooksPublisherId(int number)  throws CFException{
		dclbooks.setBooksPublisherId(number);
	}


	public void setBooksPublisherId(long number)  throws CFException{
		dclbooks.setBooksPublisherId((int)number);
	}


	/**
	 *	Returns the value of booksTitleText
	 *	@return booksTitleText
	 */
   public char[] getBooksTitleText() throws CFException  {              
   		return dclbooks.getBooksTitle().getBooksTitleText();
   }

  
	/**
	*  set variable booksTitleText
	*  @param value
	**/
   public void setBooksTitleText(char[] value) throws CFException {
      dclbooks.getBooksTitle().setBooksTitleText(value);
   } 

     /**
	 * 	Update BooksTitleText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBooksTitleText(char[] source, int sourceIndex) throws CFException {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex);
   	
   }
   
   public void setBooksTitleText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BooksTitleText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitleText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BooksTitleText with another Field
	 *	@param value
	 */
   public void setBooksTitleText(Field source) {
      dclbooks.getBooksTitle().setBooksTitleText(source);
   }  
   
     /**
	 * 	Update BooksTitleText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBooksTitleText(Field source, int sourceIndex,int sourceLen) {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BooksTitleText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitleText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dclbooks
	 *	@return dclbooks
	 */   
	 public Dclbooks getDclbooks() {
   	return dclbooks;
   }


	/**
	 *	Returns the value of repOpFields
	 *	@return repOpFields
	 */   
	 public RepOpFields getRepOpFields() {
   	return repOpFields;
   }


	/**
	 *	Returns the value of booksBookId
	 *	@return booksBookId
	 */
	public int getBooksBookId() throws CFException {        
   		return dclbooks.getBooksBookId();
	}
	
	/**
	 * 	Update BooksBookId with the passed value
	 *	@param number
	 */
	public void setBooksBookId(int number)  throws CFException{
		dclbooks.setBooksBookId(number);
	}


	public void setBooksBookId(long number)  throws CFException{
		dclbooks.setBooksBookId((int)number);
	}


	public BigDecimal getBooksRating() throws CFException{      
   		return dclbooks.getBooksRating();
	}

    public char[] getBooksRatingString() throws CFException {
          return  dclbooks.getBooksRating().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update BooksRating with the passed number
	 *	@param number
	 */
	public void setBooksRating(BigDecimal number)  throws CFException{
		dclbooks.setBooksRating(number);
   }

	/**
	 *	Returns the value of booksTotalPages
	 *	@return booksTotalPages
	 */
	public int getBooksTotalPages() throws CFException {        
   		return dclbooks.getBooksTotalPages();
	}
	
	/**
	 * 	Update BooksTotalPages with the passed value
	 *	@param number
	 */
	public void setBooksTotalPages(int number)  throws CFException{
		dclbooks.setBooksTotalPages(number);
	}


	public void setBooksTotalPages(long number)  throws CFException{
		dclbooks.setBooksTotalPages((int)number);
	}


	/**
	 *	Returns the value of booksPublishedDate
	 *	@return booksPublishedDate
	 */
   public char[] getBooksPublishedDate() throws CFException  {              
   		return dclbooks.getBooksPublishedDate();
   }

  
	/**
	*  set variable booksPublishedDate
	*  @param value
	**/
   public void setBooksPublishedDate(char[] value) throws CFException {
      dclbooks.setBooksPublishedDate(value);
   } 

     /**
	 * 	Update BooksPublishedDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBooksPublishedDate(char[] source, int sourceIndex) throws CFException {
      dclbooks.setBooksPublishedDate(source, sourceIndex);
   	
   }
   
   public void setBooksPublishedDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclbooks.setBooksPublishedDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BooksPublishedDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksPublishedDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.setBooksPublishedDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BooksPublishedDate with another Field
	 *	@param value
	 */
   public void setBooksPublishedDate(Field source) {
      dclbooks.setBooksPublishedDate(source);
   }  
   
     /**
	 * 	Update BooksPublishedDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBooksPublishedDate(Field source, int sourceIndex,int sourceLen) {
      dclbooks.setBooksPublishedDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BooksPublishedDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksPublishedDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.setBooksPublishedDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of booksTitleLen
	 *	@return booksTitleLen
	 */
	public short getBooksTitleLen() throws CFException {        
   		return dclbooks.getBooksTitle().getBooksTitleLen();
	}
	
	/**
	 * 	Update BooksTitleLen with the passed value
	 *	@param number
	 */
	public void setBooksTitleLen(short number)  throws CFException{
		dclbooks.getBooksTitle().setBooksTitleLen(number);
	}

	public void setBooksTitleLen(int number)  throws CFException{
		dclbooks.getBooksTitle().setBooksTitleLen((short)number);
	}

	public void setBooksTitleLen(long number)  throws CFException{
		dclbooks.getBooksTitle().setBooksTitleLen((short)number);
	}




        public CfbooksCtx getCfbooksCtx() {
            return CfbooksCtx.this;
        }

        public SqlmainOutCtx getSqlmainOutCtx() {
            return new SqlmainOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dclbooks.hashCode();
        str += work.hashCode();
        str += repOpFields.hashCode();
        str += vars.hashCode();
       return str.hashCode();
    }

    public SqlmainInCtx clone() {
        SqlmainInCtx cloneObj = new SqlmainInCtx();
        cloneObj.dclbooks = new Dclbooks();
        cloneObj.dclbooks.set(dclbooks.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.repOpFields = new RepOpFields();
        cloneObj.repOpFields.set(repOpFields.getClonedField());
        cloneObj.vars = new Vars();
        cloneObj.vars.set(vars.getClonedField());
        return cloneObj;
    }

    }

    public SqlmainInCtx getSqlmainInCtx() {
            return new SqlmainInCtx();
    }
     public class SqlmainOutCtx implements Cloneable {
     Dclbooks dclbooks = CfbooksCtx.this.getDclbooks();
     Work work = CfbooksCtx.this.getWork();
     RepOpFields repOpFields = CfbooksCtx.this.getRepOpFields();
     Vars vars = CfbooksCtx.this.getVars();

	/**
	 *	Returns the value of booksIsbnText
	 *	@return booksIsbnText
	 */
   public char[] getBooksIsbnText() throws CFException  {              
   		return dclbooks.getBooksIsbn().getBooksIsbnText();
   }

  
	/**
	*  set variable booksIsbnText
	*  @param value
	**/
   public void setBooksIsbnText(char[] value) throws CFException {
      dclbooks.getBooksIsbn().setBooksIsbnText(value);
   } 

     /**
	 * 	Update BooksIsbnText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBooksIsbnText(char[] source, int sourceIndex) throws CFException {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex);
   	
   }
   
   public void setBooksIsbnText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BooksIsbnText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksIsbnText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BooksIsbnText with another Field
	 *	@param value
	 */
   public void setBooksIsbnText(Field source) {
      dclbooks.getBooksIsbn().setBooksIsbnText(source);
   }  
   
     /**
	 * 	Update BooksIsbnText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBooksIsbnText(Field source, int sourceIndex,int sourceLen) {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BooksIsbnText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksIsbnText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.getBooksIsbn().setBooksIsbnText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of booksPublisherId
	 *	@return booksPublisherId
	 */
	public int getBooksPublisherId() throws CFException {        
   		return dclbooks.getBooksPublisherId();
	}
	
	/**
	 * 	Update BooksPublisherId with the passed value
	 *	@param number
	 */
	public void setBooksPublisherId(int number)  throws CFException{
		dclbooks.setBooksPublisherId(number);
	}


	public void setBooksPublisherId(long number)  throws CFException{
		dclbooks.setBooksPublisherId((int)number);
	}


	/**
	 *	Returns the value of repOpFields
	 *	@return repOpFields
	 */   
	 public RepOpFields getRepOpFields() {
   	return repOpFields;
   }


	/**
	 *	Returns the value of booksBookId
	 *	@return booksBookId
	 */
	public int getBooksBookId() throws CFException {        
   		return dclbooks.getBooksBookId();
	}
	
	/**
	 * 	Update BooksBookId with the passed value
	 *	@param number
	 */
	public void setBooksBookId(int number)  throws CFException{
		dclbooks.setBooksBookId(number);
	}


	public void setBooksBookId(long number)  throws CFException{
		dclbooks.setBooksBookId((int)number);
	}


	/**
	 *	Returns the value of opPubdate
	 *	@return opPubdate
	 */
   public char[] getOpPubdate() throws CFException  {              
   		return repOpFields.getOpPubdate();
   }

  
	/**
	*  set variable opPubdate
	*  @param value
	**/
   public void setOpPubdate(char[] value) throws CFException {
      repOpFields.setOpPubdate(value);
   } 

     /**
	 * 	Update OpPubdate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOpPubdate(char[] source, int sourceIndex) throws CFException {
      repOpFields.setOpPubdate(source, sourceIndex);
   	
   }
   
   public void setOpPubdate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      repOpFields.setOpPubdate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OpPubdate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpPubdate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      repOpFields.setOpPubdate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OpPubdate with another Field
	 *	@param value
	 */
   public void setOpPubdate(Field source) {
      repOpFields.setOpPubdate(source);
   }  
   
     /**
	 * 	Update OpPubdate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOpPubdate(Field source, int sourceIndex,int sourceLen) {
      repOpFields.setOpPubdate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OpPubdate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpPubdate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      repOpFields.setOpPubdate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of booksIsbnLen
	 *	@return booksIsbnLen
	 */
	public short getBooksIsbnLen() throws CFException {        
   		return dclbooks.getBooksIsbn().getBooksIsbnLen();
	}
	
	/**
	 * 	Update BooksIsbnLen with the passed value
	 *	@param number
	 */
	public void setBooksIsbnLen(short number)  throws CFException{
		dclbooks.getBooksIsbn().setBooksIsbnLen(number);
	}

	public void setBooksIsbnLen(int number)  throws CFException{
		dclbooks.getBooksIsbn().setBooksIsbnLen((short)number);
	}

	public void setBooksIsbnLen(long number)  throws CFException{
		dclbooks.getBooksIsbn().setBooksIsbnLen((short)number);
	}



	/**
	 *	Returns the value of opPubid
	 *	@return opPubid
	 */
   public char[] getOpPubid() throws CFException  {              
   		return repOpFields.getOpPubid();
   }

  
	/**
	*  set variable opPubid
	*  @param value
	**/
   public void setOpPubid(char[] value) throws CFException {
      repOpFields.setOpPubid(value);
   } 

     /**
	 * 	Update OpPubid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOpPubid(char[] source, int sourceIndex) throws CFException {
      repOpFields.setOpPubid(source, sourceIndex);
   	
   }
   
   public void setOpPubid(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      repOpFields.setOpPubid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OpPubid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpPubid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      repOpFields.setOpPubid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OpPubid with another Field
	 *	@param value
	 */
   public void setOpPubid(Field source) {
      repOpFields.setOpPubid(source);
   }  
   
     /**
	 * 	Update OpPubid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOpPubid(Field source, int sourceIndex,int sourceLen) {
      repOpFields.setOpPubid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OpPubid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpPubid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      repOpFields.setOpPubid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pages
	 *	@return pages
	 */
	public int getPages() throws CFException {
   		return vars.getPages();
	}


	/**
	 *	Returns String value of pages
	 *	@return pages
	 */
	public char[]  getPagesString() throws CFException {
	     return String.valueOf(vars.getPagesString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pagesIsNumeric()  throws CFException{
	    return vars.pagesIsNumeric();
	}

	/**
	 * 	Update Pages with the passed value
	 *	@param number
	 */
	public void setPages(int number)  throws CFException{
		vars.setPages(number);
	}
	

	public void setPages(long number)  throws CFException{
	    vars.setPages(number);
	}
	
	
	/**
	 * 	Update Pages with the passed value
	 *	@param value (String or char[])
	 */
	public void setPages(char[] value)  throws CFException {
		vars.setPages(value);
	}
	
	/**
	 * 	Update Pages with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPagesString(char[] value)  throws CFException{
		vars.setPages(value);
	}	

	/**
	 *	Returns the value of opTitle
	 *	@return opTitle
	 */
   public char[] getOpTitle() throws CFException  {              
   		return repOpFields.getOpTitle();
   }

  
	/**
	*  set variable opTitle
	*  @param value
	**/
   public void setOpTitle(char[] value) throws CFException {
      repOpFields.setOpTitle(value);
   } 

     /**
	 * 	Update OpTitle 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOpTitle(char[] source, int sourceIndex) throws CFException {
      repOpFields.setOpTitle(source, sourceIndex);
   	
   }
   
   public void setOpTitle(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      repOpFields.setOpTitle(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OpTitle 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpTitle(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      repOpFields.setOpTitle(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OpTitle with another Field
	 *	@param value
	 */
   public void setOpTitle(Field source) {
      repOpFields.setOpTitle(source);
   }  
   
     /**
	 * 	Update OpTitle 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOpTitle(Field source, int sourceIndex,int sourceLen) {
      repOpFields.setOpTitle(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OpTitle 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpTitle(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      repOpFields.setOpTitle(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bookid
	 *	@return bookid
	 */
	public long getBookid() throws CFException {
   		return vars.getBookid();
	}


	/**
	 *	Returns String value of bookid
	 *	@return bookid
	 */
	public char[]  getBookidString() throws CFException {
	     return String.valueOf(vars.getBookidString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bookidIsNumeric()  throws CFException{
	    return vars.bookidIsNumeric();
	}

	/**
	 * 	Update Bookid with the passed value
	 *	@param number
	 */
	public void setBookid(long number)  throws CFException{
		vars.setBookid(number);
	}
	

	
	/**
	 * 	Update Bookid with the passed value
	 *	@param value (String or char[])
	 */
	public void setBookid(char[] value)  throws CFException {
		vars.setBookid(value);
	}
	
	/**
	 * 	Update Bookid with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBookidString(char[] value)  throws CFException{
		vars.setBookid(value);
	}	

	/**
	 *	Returns the value of booksTitleLen
	 *	@return booksTitleLen
	 */
	public short getBooksTitleLen() throws CFException {        
   		return dclbooks.getBooksTitle().getBooksTitleLen();
	}
	
	/**
	 * 	Update BooksTitleLen with the passed value
	 *	@param number
	 */
	public void setBooksTitleLen(short number)  throws CFException{
		dclbooks.getBooksTitle().setBooksTitleLen(number);
	}

	public void setBooksTitleLen(int number)  throws CFException{
		dclbooks.getBooksTitle().setBooksTitleLen((short)number);
	}

	public void setBooksTitleLen(long number)  throws CFException{
		dclbooks.getBooksTitle().setBooksTitleLen((short)number);
	}



	/**
	 *	Returns the value of opIsbn
	 *	@return opIsbn
	 */
   public char[] getOpIsbn() throws CFException  {              
   		return repOpFields.getOpIsbn();
   }

  
	/**
	*  set variable opIsbn
	*  @param value
	**/
   public void setOpIsbn(char[] value) throws CFException {
      repOpFields.setOpIsbn(value);
   } 

     /**
	 * 	Update OpIsbn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOpIsbn(char[] source, int sourceIndex) throws CFException {
      repOpFields.setOpIsbn(source, sourceIndex);
   	
   }
   
   public void setOpIsbn(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      repOpFields.setOpIsbn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OpIsbn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpIsbn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      repOpFields.setOpIsbn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OpIsbn with another Field
	 *	@param value
	 */
   public void setOpIsbn(Field source) {
      repOpFields.setOpIsbn(source);
   }  
   
     /**
	 * 	Update OpIsbn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOpIsbn(Field source, int sourceIndex,int sourceLen) {
      repOpFields.setOpIsbn(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OpIsbn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpIsbn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      repOpFields.setOpIsbn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pubid
	 *	@return pubid
	 */
	public int getPubid() throws CFException {
   		return vars.getPubid();
	}


	/**
	 *	Returns String value of pubid
	 *	@return pubid
	 */
	public char[]  getPubidString() throws CFException {
	     return String.valueOf(vars.getPubidString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pubidIsNumeric()  throws CFException{
	    return vars.pubidIsNumeric();
	}

	/**
	 * 	Update Pubid with the passed value
	 *	@param number
	 */
	public void setPubid(int number)  throws CFException{
		vars.setPubid(number);
	}
	

	public void setPubid(long number)  throws CFException{
	    vars.setPubid(number);
	}
	
	
	/**
	 * 	Update Pubid with the passed value
	 *	@param value (String or char[])
	 */
	public void setPubid(char[] value)  throws CFException {
		vars.setPubid(value);
	}
	
	/**
	 * 	Update Pubid with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPubidString(char[] value)  throws CFException{
		vars.setPubid(value);
	}	

	/**
	 *	Returns the value of opRating
	 *	@return opRating
	 */
   public char[] getOpRating() throws CFException  {              
   		return repOpFields.getOpRating();
   }

  
	/**
	*  set variable opRating
	*  @param value
	**/
   public void setOpRating(char[] value) throws CFException {
      repOpFields.setOpRating(value);
   } 

     /**
	 * 	Update OpRating 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOpRating(char[] source, int sourceIndex) throws CFException {
      repOpFields.setOpRating(source, sourceIndex);
   	
   }
   
   public void setOpRating(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      repOpFields.setOpRating(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OpRating 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpRating(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      repOpFields.setOpRating(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OpRating with another Field
	 *	@param value
	 */
   public void setOpRating(Field source) {
      repOpFields.setOpRating(source);
   }  
   
     /**
	 * 	Update OpRating 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOpRating(Field source, int sourceIndex,int sourceLen) {
      repOpFields.setOpRating(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OpRating 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpRating(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      repOpFields.setOpRating(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of booksTitleText
	 *	@return booksTitleText
	 */
   public char[] getBooksTitleText() throws CFException  {              
   		return dclbooks.getBooksTitle().getBooksTitleText();
   }

  
	/**
	*  set variable booksTitleText
	*  @param value
	**/
   public void setBooksTitleText(char[] value) throws CFException {
      dclbooks.getBooksTitle().setBooksTitleText(value);
   } 

     /**
	 * 	Update BooksTitleText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBooksTitleText(char[] source, int sourceIndex) throws CFException {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex);
   	
   }
   
   public void setBooksTitleText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BooksTitleText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitleText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BooksTitleText with another Field
	 *	@param value
	 */
   public void setBooksTitleText(Field source) {
      dclbooks.getBooksTitle().setBooksTitleText(source);
   }  
   
     /**
	 * 	Update BooksTitleText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBooksTitleText(Field source, int sourceIndex,int sourceLen) {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BooksTitleText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitleText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of opPages
	 *	@return opPages
	 */
   public char[] getOpPages() throws CFException  {              
   		return repOpFields.getOpPages();
   }

  
	/**
	*  set variable opPages
	*  @param value
	**/
   public void setOpPages(char[] value) throws CFException {
      repOpFields.setOpPages(value);
   } 

     /**
	 * 	Update OpPages 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOpPages(char[] source, int sourceIndex) throws CFException {
      repOpFields.setOpPages(source, sourceIndex);
   	
   }
   
   public void setOpPages(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      repOpFields.setOpPages(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OpPages 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpPages(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      repOpFields.setOpPages(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OpPages with another Field
	 *	@param value
	 */
   public void setOpPages(Field source) {
      repOpFields.setOpPages(source);
   }  
   
     /**
	 * 	Update OpPages 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOpPages(Field source, int sourceIndex,int sourceLen) {
      repOpFields.setOpPages(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OpPages 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpPages(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      repOpFields.setOpPages(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getBooksRating() throws CFException{      
   		return dclbooks.getBooksRating();
	}

    public char[] getBooksRatingString() throws CFException {
          return  dclbooks.getBooksRating().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update BooksRating with the passed number
	 *	@param number
	 */
	public void setBooksRating(BigDecimal number)  throws CFException{
		dclbooks.setBooksRating(number);
   }

	/**
	 *	Returns the value of errLoc
	 *	@return errLoc
	 */
   public char[] getErrLoc() throws CFException  {              
   		return work.getErrLoc();
   }

  
	/**
	*  set variable errLoc
	*  @param value
	**/
   public void setErrLoc(char[] value) throws CFException {
      work.setErrLoc(value);
   } 

	/**
	 *	Returns the value of booksTotalPages
	 *	@return booksTotalPages
	 */
	public int getBooksTotalPages() throws CFException {        
   		return dclbooks.getBooksTotalPages();
	}
	
	/**
	 * 	Update BooksTotalPages with the passed value
	 *	@param number
	 */
	public void setBooksTotalPages(int number)  throws CFException{
		dclbooks.setBooksTotalPages(number);
	}


	public void setBooksTotalPages(long number)  throws CFException{
		dclbooks.setBooksTotalPages((int)number);
	}


	/**
	 *	Returns the value of rating
	 *	@return rating
	 */
   public char[] getRating() throws CFException  {              
   		return vars.getRating();
   }

  
	/**
	*  set variable rating
	*  @param value
	**/
   public void setRating(char[] value) throws CFException {
      vars.setRating(value);
   } 

     /**
	 * 	Update Rating 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRating(char[] source, int sourceIndex) throws CFException {
      vars.setRating(source, sourceIndex);
   	
   }
   
   public void setRating(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vars.setRating(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Rating 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRating(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vars.setRating(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Rating with another Field
	 *	@param value
	 */
   public void setRating(Field source) {
      vars.setRating(source);
   }  
   
     /**
	 * 	Update Rating 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRating(Field source, int sourceIndex,int sourceLen) {
      vars.setRating(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Rating 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRating(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vars.setRating(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of booksPublishedDate
	 *	@return booksPublishedDate
	 */
   public char[] getBooksPublishedDate() throws CFException  {              
   		return dclbooks.getBooksPublishedDate();
   }

  
	/**
	*  set variable booksPublishedDate
	*  @param value
	**/
   public void setBooksPublishedDate(char[] value) throws CFException {
      dclbooks.setBooksPublishedDate(value);
   } 

     /**
	 * 	Update BooksPublishedDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBooksPublishedDate(char[] source, int sourceIndex) throws CFException {
      dclbooks.setBooksPublishedDate(source, sourceIndex);
   	
   }
   
   public void setBooksPublishedDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclbooks.setBooksPublishedDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BooksPublishedDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksPublishedDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.setBooksPublishedDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BooksPublishedDate with another Field
	 *	@param value
	 */
   public void setBooksPublishedDate(Field source) {
      dclbooks.setBooksPublishedDate(source);
   }  
   
     /**
	 * 	Update BooksPublishedDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBooksPublishedDate(Field source, int sourceIndex,int sourceLen) {
      dclbooks.setBooksPublishedDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BooksPublishedDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksPublishedDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.setBooksPublishedDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of opBookid
	 *	@return opBookid
	 */
   public char[] getOpBookid() throws CFException  {              
   		return repOpFields.getOpBookid();
   }

  
	/**
	*  set variable opBookid
	*  @param value
	**/
   public void setOpBookid(char[] value) throws CFException {
      repOpFields.setOpBookid(value);
   } 

     /**
	 * 	Update OpBookid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOpBookid(char[] source, int sourceIndex) throws CFException {
      repOpFields.setOpBookid(source, sourceIndex);
   	
   }
   
   public void setOpBookid(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      repOpFields.setOpBookid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OpBookid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpBookid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      repOpFields.setOpBookid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OpBookid with another Field
	 *	@param value
	 */
   public void setOpBookid(Field source) {
      repOpFields.setOpBookid(source);
   }  
   
     /**
	 * 	Update OpBookid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOpBookid(Field source, int sourceIndex,int sourceLen) {
      repOpFields.setOpBookid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OpBookid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpBookid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      repOpFields.setOpBookid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public CfbooksCtx getCfbooksCtx() {
            return CfbooksCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dclbooks.hashCode();
        str += work.hashCode();
        str += repOpFields.hashCode();
        str += vars.hashCode();
       return str.hashCode();
    }

    public SqlmainOutCtx clone() {
        SqlmainOutCtx cloneObj = new SqlmainOutCtx();
        cloneObj.dclbooks = new Dclbooks();
        cloneObj.dclbooks.set(dclbooks.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.repOpFields = new RepOpFields();
        cloneObj.repOpFields.set(repOpFields.getClonedField());
        cloneObj.vars = new Vars();
        cloneObj.vars.set(vars.getClonedField());
        return cloneObj;
    }

    }

    public SqlmainOutCtx getSqlmainOutCtx() {
            return new SqlmainOutCtx();
    }
     public class WriteRecordInCtx implements Cloneable {
     HeaderTime headerTime = CfbooksCtx.this.getHeaderTime();
     Work work = CfbooksCtx.this.getWork();
     RepOpFields repOpFields = CfbooksCtx.this.getRepOpFields();
     Vars vars = CfbooksCtx.this.getVars();

	/**
	 *	Returns the value of pageNo
	 *	@return pageNo
	 */
	public int getPageNo() throws CFException {
   		return headerTime.getPageNo();
	}


	/**
	 *	Returns String value of pageNo
	 *	@return pageNo
	 */
	public char[]  getPageNoString() throws CFException {
	     return String.valueOf(headerTime.getPageNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pageNoIsNumeric()  throws CFException{
	    return headerTime.pageNoIsNumeric();
	}

	/**
	 * 	Update PageNo with the passed value
	 *	@param number
	 */
	public void setPageNo(int number)  throws CFException{
		headerTime.setPageNo(number);
	}
	

	public void setPageNo(long number)  throws CFException{
	    headerTime.setPageNo(number);
	}
	
	
	/**
	 * 	Update PageNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setPageNo(char[] value)  throws CFException {
		headerTime.setPageNo(value);
	}
	
	/**
	 * 	Update PageNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPageNoString(char[] value)  throws CFException{
		headerTime.setPageNo(value);
	}	

	/**
	 *	Returns the value of pageBreak
	 *	@return pageBreak
	 */
   public char[] getPageBreak() throws CFException  {              
   		return work.getPageBreak();
   }

  
	/**
	*  set variable pageBreak
	*  @param value
	**/
   public void setPageBreak(char[] value) throws CFException {
      work.setPageBreak(value);
   } 

	/**
	 *	Returns the value of recCount
	 *	@return recCount
	 */
	public int getRecCount() throws CFException {
   		return vars.getRecCount();
	}


	/**
	 *	Returns String value of recCount
	 *	@return recCount
	 */
	public char[]  getRecCountString() throws CFException {
	     return String.valueOf(vars.getRecCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean recCountIsNumeric()  throws CFException{
	    return vars.recCountIsNumeric();
	}

	/**
	 * 	Update RecCount with the passed value
	 *	@param number
	 */
	public void setRecCount(int number)  throws CFException{
		vars.setRecCount(number);
	}
	

	public void setRecCount(long number)  throws CFException{
	    vars.setRecCount(number);
	}
	
	
	/**
	 * 	Update RecCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setRecCount(char[] value)  throws CFException {
		vars.setRecCount(value);
	}
	
	/**
	 * 	Update RecCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRecCountString(char[] value)  throws CFException{
		vars.setRecCount(value);
	}	

	/**
	 *	Returns the value of repOpFields
	 *	@return repOpFields
	 */   
	 public RepOpFields getRepOpFields() {
   	return repOpFields;
   }


	/**
	 *	Test condition 1 for isDontWriteRec88()
	 *	@return  Returns true if isDontWriteRec88() is 1
	 */
   public boolean isDontWriteRec88() throws CFException {
      return work.isDontWriteRec88();
   }

	/**
	*  set values 1
	*/
   	public void setDontWriteRec88True()  throws CFException{  			
    	work.setDontWriteRec88True();
   	}
	/**
	 *	Returns the value of space
	 *	@return space
	 */
   public char[] getSpace() throws CFException  {              
   		return work.getSpace();
   }

  
	/**
	*  set variable space
	*  @param value
	**/
   public void setSpace(char[] value) throws CFException {
      work.setSpace(value);
   } 


        public CfbooksCtx getCfbooksCtx() {
            return CfbooksCtx.this;
        }

        public WriteRecordOutCtx getWriteRecordOutCtx() {
            return new WriteRecordOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += headerTime.hashCode();
        str += work.hashCode();
        str += repOpFields.hashCode();
        str += vars.hashCode();
       return str.hashCode();
    }

    public WriteRecordInCtx clone() {
        WriteRecordInCtx cloneObj = new WriteRecordInCtx();
        cloneObj.headerTime = new HeaderTime();
        cloneObj.headerTime.set(headerTime.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.repOpFields = new RepOpFields();
        cloneObj.repOpFields.set(repOpFields.getClonedField());
        cloneObj.vars = new Vars();
        cloneObj.vars.set(vars.getClonedField());
        return cloneObj;
    }

    }

    public WriteRecordInCtx getWriteRecordInCtx() {
            return new WriteRecordInCtx();
    }
     public class WriteRecordOutCtx implements Cloneable {
     HeaderTime headerTime = CfbooksCtx.this.getHeaderTime();
     Work work = CfbooksCtx.this.getWork();
     RepOpFields repOpFields = CfbooksCtx.this.getRepOpFields();
     Vars vars = CfbooksCtx.this.getVars();

	/**
	 *	Returns the value of pageNo
	 *	@return pageNo
	 */
	public int getPageNo() throws CFException {
   		return headerTime.getPageNo();
	}


	/**
	 *	Returns String value of pageNo
	 *	@return pageNo
	 */
	public char[]  getPageNoString() throws CFException {
	     return String.valueOf(headerTime.getPageNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pageNoIsNumeric()  throws CFException{
	    return headerTime.pageNoIsNumeric();
	}

	/**
	 * 	Update PageNo with the passed value
	 *	@param number
	 */
	public void setPageNo(int number)  throws CFException{
		headerTime.setPageNo(number);
	}
	

	public void setPageNo(long number)  throws CFException{
	    headerTime.setPageNo(number);
	}
	
	
	/**
	 * 	Update PageNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setPageNo(char[] value)  throws CFException {
		headerTime.setPageNo(value);
	}
	
	/**
	 * 	Update PageNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPageNoString(char[] value)  throws CFException{
		headerTime.setPageNo(value);
	}	

	/**
	 *	Returns the value of recCount
	 *	@return recCount
	 */
	public int getRecCount() throws CFException {
   		return vars.getRecCount();
	}


	/**
	 *	Returns String value of recCount
	 *	@return recCount
	 */
	public char[]  getRecCountString() throws CFException {
	     return String.valueOf(vars.getRecCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean recCountIsNumeric()  throws CFException{
	    return vars.recCountIsNumeric();
	}

	/**
	 * 	Update RecCount with the passed value
	 *	@param number
	 */
	public void setRecCount(int number)  throws CFException{
		vars.setRecCount(number);
	}
	

	public void setRecCount(long number)  throws CFException{
	    vars.setRecCount(number);
	}
	
	
	/**
	 * 	Update RecCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setRecCount(char[] value)  throws CFException {
		vars.setRecCount(value);
	}
	
	/**
	 * 	Update RecCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRecCountString(char[] value)  throws CFException{
		vars.setRecCount(value);
	}	

	/**
	 *	Returns the value of repOpFields
	 *	@return repOpFields
	 */   
	 public RepOpFields getRepOpFields() {
   	return repOpFields;
   }


	/**
	 *	Returns the value of repopStat
	 *	@return repopStat
	 */
	public int getRepopStat() throws CFException {
   		return work.getRepopStat();
	}


	/**
	 *	Returns String value of repopStat
	 *	@return repopStat
	 */
	public char[]  getRepopStatString() throws CFException {
	     return String.valueOf(work.getRepopStatString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean repopStatIsNumeric()  throws CFException{
	    return work.repopStatIsNumeric();
	}

	/**
	 * 	Update RepopStat with the passed value
	 *	@param number
	 */
	public void setRepopStat(int number)  throws CFException{
		work.setRepopStat(number);
	}
	

	public void setRepopStat(long number)  throws CFException{
	    work.setRepopStat(number);
	}
	
	
	/**
	 * 	Update RepopStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setRepopStat(char[] value)  throws CFException {
		work.setRepopStat(value);
	}
	
	/**
	 * 	Update RepopStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRepopStatString(char[] value)  throws CFException{
		work.setRepopStat(value);
	}	

	/**
	 *	Returns the value of recBuffer
	 *	@return recBuffer
	 */
   public char[] getRecBuffer() throws CFException  {              
   		return vars.getRecBuffer();
   }

  
	/**
	*  set variable recBuffer
	*  @param value
	**/
   public void setRecBuffer(char[] value) throws CFException {
      vars.setRecBuffer(value);
   } 

     /**
	 * 	Update RecBuffer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecBuffer(char[] source, int sourceIndex) throws CFException {
      vars.setRecBuffer(source, sourceIndex);
   	
   }
   
   public void setRecBuffer(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vars.setRecBuffer(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RecBuffer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecBuffer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vars.setRecBuffer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RecBuffer with another Field
	 *	@param value
	 */
   public void setRecBuffer(Field source) {
      vars.setRecBuffer(source);
   }  
   
     /**
	 * 	Update RecBuffer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecBuffer(Field source, int sourceIndex,int sourceLen) {
      vars.setRecBuffer(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RecBuffer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecBuffer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vars.setRecBuffer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errLoc
	 *	@return errLoc
	 */
   public char[] getErrLoc() throws CFException  {              
   		return work.getErrLoc();
   }

  
	/**
	*  set variable errLoc
	*  @param value
	**/
   public void setErrLoc(char[] value) throws CFException {
      work.setErrLoc(value);
   } 

	/**
	 *	Returns the value of errMsg
	 *	@return errMsg
	 */
   public char[] getErrMsg() throws CFException  {              
   		return work.getErrMsg();
   }

  
	/**
	*  set variable errMsg
	*  @param value
	**/
   public void setErrMsg(char[] value) throws CFException {
      work.setErrMsg(value);
   } 


        public CfbooksCtx getCfbooksCtx() {
            return CfbooksCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += headerTime.hashCode();
        str += work.hashCode();
        str += repOpFields.hashCode();
        str += vars.hashCode();
       return str.hashCode();
    }

    public WriteRecordOutCtx clone() {
        WriteRecordOutCtx cloneObj = new WriteRecordOutCtx();
        cloneObj.headerTime = new HeaderTime();
        cloneObj.headerTime.set(headerTime.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.repOpFields = new RepOpFields();
        cloneObj.repOpFields.set(repOpFields.getClonedField());
        cloneObj.vars = new Vars();
        cloneObj.vars.set(vars.getClonedField());
        return cloneObj;
    }

    }

    public WriteRecordOutCtx getWriteRecordOutCtx() {
            return new WriteRecordOutCtx();
    }
     public class HousekeepingInCtx implements Cloneable {
     Work work = CfbooksCtx.this.getWork();
     RepOpFields repOpFields = CfbooksCtx.this.getRepOpFields();

	/**
	 *	Returns the value of footer
	 *	@return footer
	 */
   public char[] getFooter() throws CFException  {              
   		return work.getFooter();
   }

  
	/**
	*  set variable footer
	*  @param value
	**/
   public void setFooter(char[] value) throws CFException {
      work.setFooter(value);
   } 

	/**
	 *	Returns the value of repOpFields
	 *	@return repOpFields
	 */   
	 public RepOpFields getRepOpFields() {
   	return repOpFields;
   }



        public CfbooksCtx getCfbooksCtx() {
            return CfbooksCtx.this;
        }

        public HousekeepingOutCtx getHousekeepingOutCtx() {
            return new HousekeepingOutCtx();
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
        str += repOpFields.hashCode();
       return str.hashCode();
    }

    public HousekeepingInCtx clone() {
        HousekeepingInCtx cloneObj = new HousekeepingInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.repOpFields = new RepOpFields();
        cloneObj.repOpFields.set(repOpFields.getClonedField());
        return cloneObj;
    }

    }

    public HousekeepingInCtx getHousekeepingInCtx() {
            return new HousekeepingInCtx();
    }
     public class HousekeepingOutCtx implements Cloneable {
     Work work = CfbooksCtx.this.getWork();
     RepOpFields repOpFields = CfbooksCtx.this.getRepOpFields();

	/**
	 *	Returns the value of repOpFields
	 *	@return repOpFields
	 */   
	 public RepOpFields getRepOpFields() {
   	return repOpFields;
   }


	/**
	 *	Returns the value of repopStat
	 *	@return repopStat
	 */
	public int getRepopStat() throws CFException {
   		return work.getRepopStat();
	}


	/**
	 *	Returns String value of repopStat
	 *	@return repopStat
	 */
	public char[]  getRepopStatString() throws CFException {
	     return String.valueOf(work.getRepopStatString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean repopStatIsNumeric()  throws CFException{
	    return work.repopStatIsNumeric();
	}

	/**
	 * 	Update RepopStat with the passed value
	 *	@param number
	 */
	public void setRepopStat(int number)  throws CFException{
		work.setRepopStat(number);
	}
	

	public void setRepopStat(long number)  throws CFException{
	    work.setRepopStat(number);
	}
	
	
	/**
	 * 	Update RepopStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setRepopStat(char[] value)  throws CFException {
		work.setRepopStat(value);
	}
	
	/**
	 * 	Update RepopStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRepopStatString(char[] value)  throws CFException{
		work.setRepopStat(value);
	}	

	/**
	 *	Returns the value of errLoc
	 *	@return errLoc
	 */
   public char[] getErrLoc() throws CFException  {              
   		return work.getErrLoc();
   }

  
	/**
	*  set variable errLoc
	*  @param value
	**/
   public void setErrLoc(char[] value) throws CFException {
      work.setErrLoc(value);
   } 

	/**
	 *	Returns the value of errMsg
	 *	@return errMsg
	 */
   public char[] getErrMsg() throws CFException  {              
   		return work.getErrMsg();
   }

  
	/**
	*  set variable errMsg
	*  @param value
	**/
   public void setErrMsg(char[] value) throws CFException {
      work.setErrMsg(value);
   } 


        public CfbooksCtx getCfbooksCtx() {
            return CfbooksCtx.this;
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
        str += repOpFields.hashCode();
       return str.hashCode();
    }

    public HousekeepingOutCtx clone() {
        HousekeepingOutCtx cloneObj = new HousekeepingOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.repOpFields = new RepOpFields();
        cloneObj.repOpFields.set(repOpFields.getClonedField());
        return cloneObj;
    }

    }

    public HousekeepingOutCtx getHousekeepingOutCtx() {
            return new HousekeepingOutCtx();
    }
     public class FileErrChkInCtx implements Cloneable {
     Work work = CfbooksCtx.this.getWork();

	/**
	 *	Returns the value of repopStat
	 *	@return repopStat
	 */
	public int getRepopStat() throws CFException {
   		return work.getRepopStat();
	}


	/**
	 *	Returns String value of repopStat
	 *	@return repopStat
	 */
	public char[]  getRepopStatString() throws CFException {
	     return String.valueOf(work.getRepopStatString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean repopStatIsNumeric()  throws CFException{
	    return work.repopStatIsNumeric();
	}

	/**
	 * 	Update RepopStat with the passed value
	 *	@param number
	 */
	public void setRepopStat(int number)  throws CFException{
		work.setRepopStat(number);
	}
	

	public void setRepopStat(long number)  throws CFException{
	    work.setRepopStat(number);
	}
	
	
	/**
	 * 	Update RepopStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setRepopStat(char[] value)  throws CFException {
		work.setRepopStat(value);
	}
	
	/**
	 * 	Update RepopStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRepopStatString(char[] value)  throws CFException{
		work.setRepopStat(value);
	}	

	/**
	 *	Returns the value of errLoc
	 *	@return errLoc
	 */
   public char[] getErrLoc() throws CFException  {              
   		return work.getErrLoc();
   }

  
	/**
	*  set variable errLoc
	*  @param value
	**/
   public void setErrLoc(char[] value) throws CFException {
      work.setErrLoc(value);
   } 

	/**
	 *	Returns the value of errMsg
	 *	@return errMsg
	 */
   public char[] getErrMsg() throws CFException  {              
   		return work.getErrMsg();
   }

  
	/**
	*  set variable errMsg
	*  @param value
	**/
   public void setErrMsg(char[] value) throws CFException {
      work.setErrMsg(value);
   } 

	/**
	 *	Returns the value of errPgm
	 *	@return errPgm
	 */
   public char[] getErrPgm() throws CFException  {              
   		return work.getErrPgm();
   }

  
	/**
	*  set variable errPgm
	*  @param value
	**/
   public void setErrPgm(char[] value) throws CFException {
      work.setErrPgm(value);
   } 


        public CfbooksCtx getCfbooksCtx() {
            return CfbooksCtx.this;
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

    public FileErrChkInCtx clone() {
        FileErrChkInCtx cloneObj = new FileErrChkInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FileErrChkInCtx getFileErrChkInCtx() {
            return new FileErrChkInCtx();
    }
     public class SqlErrChkInCtx implements Cloneable {
     Sqlca sqlca = CfbooksCtx.this.getSqlca();
     Work work = CfbooksCtx.this.getWork();

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
	 *	Returns the value of errLoc
	 *	@return errLoc
	 */
   public char[] getErrLoc() throws CFException  {              
   		return work.getErrLoc();
   }

  
	/**
	*  set variable errLoc
	*  @param value
	**/
   public void setErrLoc(char[] value) throws CFException {
      work.setErrLoc(value);
   } 

	/**
	 *	Returns the value of errMsg
	 *	@return errMsg
	 */
   public char[] getErrMsg() throws CFException  {              
   		return work.getErrMsg();
   }

  
	/**
	*  set variable errMsg
	*  @param value
	**/
   public void setErrMsg(char[] value) throws CFException {
      work.setErrMsg(value);
   } 

	/**
	 *	Returns the value of errPgm
	 *	@return errPgm
	 */
   public char[] getErrPgm() throws CFException  {              
   		return work.getErrPgm();
   }

  
	/**
	*  set variable errPgm
	*  @param value
	**/
   public void setErrPgm(char[] value) throws CFException {
      work.setErrPgm(value);
   } 


        public CfbooksCtx getCfbooksCtx() {
            return CfbooksCtx.this;
        }

        public SqlErrChkOutCtx getSqlErrChkOutCtx() {
            return new SqlErrChkOutCtx();
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

    public SqlErrChkInCtx clone() {
        SqlErrChkInCtx cloneObj = new SqlErrChkInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SqlErrChkInCtx getSqlErrChkInCtx() {
            return new SqlErrChkInCtx();
    }
     public class SqlErrChkOutCtx implements Cloneable {
     Sqlca sqlca = CfbooksCtx.this.getSqlca();
     Work work = CfbooksCtx.this.getWork();

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
	 *	Returns the value of errCode
	 *	@return errCode
	 */
	public long getErrCode() throws CFException {
   		return work.getErrCode();
	}


	/**
	 *	Returns String value of errCode
	 *	@return errCode
	 */
	public char[]  getErrCodeString() throws CFException {
	     return String.valueOf(work.getErrCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errCodeIsNumeric()  throws CFException{
	    return work.errCodeIsNumeric();
	}

	/**
	 * 	Update ErrCode with the passed value
	 *	@param number
	 */
	public void setErrCode(long number)  throws CFException{
		work.setErrCode(number);
	}
	

	
	/**
	 * 	Update ErrCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrCode(char[] value)  throws CFException {
		work.setErrCode(value);
	}
	
	/**
	 * 	Update ErrCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrCodeString(char[] value)  throws CFException{
		work.setErrCode(value);
	}	

	/**
	 *	Returns the value of eofFlag
	 *	@return eofFlag
	 */
   public char[] getEofFlag() throws CFException  {              
   		return work.getEofFlag();
   }

  
	/**
	*  set variable eofFlag
	*  @param value
	**/
   public void setEofFlag(char[] value) throws CFException {
      work.setEofFlag(value);
   } 


        public CfbooksCtx getCfbooksCtx() {
            return CfbooksCtx.this;
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

    public SqlErrChkOutCtx clone() {
        SqlErrChkOutCtx cloneObj = new SqlErrChkOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SqlErrChkOutCtx getSqlErrChkOutCtx() {
            return new SqlErrChkOutCtx();
    }
}
