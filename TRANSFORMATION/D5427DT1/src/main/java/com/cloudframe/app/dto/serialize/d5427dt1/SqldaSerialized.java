package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class SqldaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SqldaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SqldaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SQLDA_LENGTH = 33016;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqldaid;
            protected  int beginSqldabc;
            protected  int beginSqln;
            protected  int beginSqld;
           protected int beginSqlvar;
           protected static final int SQLVAR_SIZE = 750;
	
	/**
	* Constructor for SqldaSerialized
	**/
    public SqldaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SqldaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SQLDA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSqldaid = getStartOffset() + 0;	// set offset for serialization
  
             beginSqldabc = getStartOffset() + 8;	// set offset for serialization
  
             beginSqln = getStartOffset() + 12;	// set offset for serialization
  
             beginSqld = getStartOffset() + 14;	// set offset for serialization
  
	        beginSqlvar = getStartOffset() + 16; // set offset for serialization
  
	   /*  end of offset */
	}
     int localSqldaidCounter = -1;
     public boolean isSqldaidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqldaidCounter != sharedCounter;
         localSqldaidCounter = sharedCounter; return hasModified;
     }
	protected static final int SQLDAID_LEN = 8;
	/**
	 * 	serialize this Sqldaid
	 */
   protected void serializeSqldaid(char[] sqldaid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqldaid,0,getStringValue(),beginSqldaid,SQLDAID_LEN);
       localSqldaidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqldaidConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSqldaid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqldaid() {	 
   		return (substring(getStringValue(),beginSqldaid,beginSqldaid + SQLDAID_LEN));
   	}
         int localSqldabcCounter = -1;
         public boolean isSqldabcModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqldabcCounter != sharedCounter;
            localSqldabcCounter = sharedCounter; return hasModified; 
         }
   protected static final int SQLDABC_LEN = 4;
  	/**
	 * serializeSqldabc
	 */
	protected void serializeSqldabc(int sqldabc) {
           replaceValue( //  save the value as string
                   getBinaryString( sqldabc,SQLDABC_LEN)
                  ,beginSqldabc
                  ,SQLDABC_LEN
                 );
            localSqldabcCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSqldabcMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSqldabc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSqldabc() {	 
			return (getInt(beginSqldabc));
   	}
         int localSqlnCounter = -1;
         public boolean isSqlnModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlnCounter != sharedCounter;
            localSqlnCounter = sharedCounter; return hasModified; 
         }
   protected static final int SQLN_LEN = 2;
  	/**
	 * serializeSqln
	 */
	protected void serializeSqln(short sqln) {
           replaceValue( //  save the value as string
                   getBinaryString( sqln,SQLN_LEN)
                  ,beginSqln
                  ,SQLN_LEN
                 );
            localSqlnCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSqlnMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSqln is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSqln() {	 
			return (getShort(beginSqln));
   	}
         int localSqldCounter = -1;
         public boolean isSqldModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqldCounter != sharedCounter;
            localSqldCounter = sharedCounter; return hasModified; 
         }
   protected static final int SQLD_LEN = 2;
  	/**
	 * serializeSqld
	 */
	protected void serializeSqld(short sqld) {
           replaceValue( //  save the value as string
                   getBinaryString( sqld,SQLD_LEN)
                  ,beginSqld
                  ,SQLD_LEN
                 );
            localSqldCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSqldMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSqld is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSqld() {	 
			return (getShort(beginSqld));
   	}

		public int sqlvarSize() {
			return SQLVAR_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 16 + (dependValue *  44);
     }
     
     public int getVariableLength(int idx) {
     	return 16 + (idx *  44);
     }
}
  
