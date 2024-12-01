package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class SysVariablesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class SysVariablesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SysVariablesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_VARIABLES_LENGTH = 36;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSysCvdaCicsstatus;
            protected  int beginSysCvdaInitstatus;
            protected  int beginSysDb2conn;
            protected  int beginSysMqconn;
            protected  int beginSysStartupdate;
	
	/**
	* Constructor for SysVariablesSerialized
	**/
    public SysVariablesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SysVariablesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SysVariablesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SysVariablesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,178); // serialize this field at offset 178 by default 
    }
    
	/**
	* sets parent for this SysVariablesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 178 by default
    }    
	/**
	* initializes the field in SysVariablesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_VARIABLES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSysCvdaCicsstatus = getStartOffset() + 0;	// set offset for serialization
  
             beginSysCvdaInitstatus = getStartOffset() + 4;	// set offset for serialization
  
             beginSysDb2conn = getStartOffset() + 8;	// set offset for serialization
  
  
             beginSysMqconn = getStartOffset() + 24;	// set offset for serialization
  
             beginSysStartupdate = getStartOffset() + 32;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localSysCvdaCicsstatusCounter = -1;
         public boolean isSysCvdaCicsstatusModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSysCvdaCicsstatusCounter != sharedCounter;
            localSysCvdaCicsstatusCounter = sharedCounter; return hasModified; 
         }
   protected static final int SYS_CVDA_CICSSTATUS_LEN = 4;
  	/**
	 * serializeSysCvdaCicsstatus
	 */
	protected void serializeSysCvdaCicsstatus(int sysCvdaCicsstatus) {
           replaceValue( //  save the value as string
                   getBinaryString( sysCvdaCicsstatus,SYS_CVDA_CICSSTATUS_LEN)
                  ,beginSysCvdaCicsstatus
                  ,SYS_CVDA_CICSSTATUS_LEN
                 );
            localSysCvdaCicsstatusCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSysCvdaCicsstatusMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSysCvdaCicsstatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSysCvdaCicsstatus() {	 
			return (getInt(beginSysCvdaCicsstatus));
   	}
         int localSysCvdaInitstatusCounter = -1;
         public boolean isSysCvdaInitstatusModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSysCvdaInitstatusCounter != sharedCounter;
            localSysCvdaInitstatusCounter = sharedCounter; return hasModified; 
         }
   protected static final int SYS_CVDA_INITSTATUS_LEN = 4;
  	/**
	 * serializeSysCvdaInitstatus
	 */
	protected void serializeSysCvdaInitstatus(int sysCvdaInitstatus) {
           replaceValue( //  save the value as string
                   getBinaryString( sysCvdaInitstatus,SYS_CVDA_INITSTATUS_LEN)
                  ,beginSysCvdaInitstatus
                  ,SYS_CVDA_INITSTATUS_LEN
                 );
            localSysCvdaInitstatusCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSysCvdaInitstatusMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSysCvdaInitstatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSysCvdaInitstatus() {	 
			return (getInt(beginSysCvdaInitstatus));
   	}
     int localSysDb2connCounter = -1;
     public boolean isSysDb2connModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSysDb2connCounter != sharedCounter;
         localSysDb2connCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_DB_2CONN_LEN = 8;
	/**
	 * 	serialize this SysDb2conn
	 */
   protected void serializeSysDb2conn(char[] sysDb2conn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sysDb2conn,0,getStringValue(),beginSysDb2conn,SYS_DB_2CONN_LEN);
       localSysDb2connCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSysDb2connConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSysDb2conn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSysDb2conn() {	 
   		return (substring(getStringValue(),beginSysDb2conn,beginSysDb2conn + SYS_DB_2CONN_LEN));
   	}
     int localSysMqconnCounter = -1;
     public boolean isSysMqconnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSysMqconnCounter != sharedCounter;
         localSysMqconnCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_MQCONN_LEN = 8;
	/**
	 * 	serialize this SysMqconn
	 */
   protected void serializeSysMqconn(char[] sysMqconn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sysMqconn,0,getStringValue(),beginSysMqconn,SYS_MQCONN_LEN);
       localSysMqconnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSysMqconnConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSysMqconn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSysMqconn() {	 
   		return (substring(getStringValue(),beginSysMqconn,beginSysMqconn + SYS_MQCONN_LEN));
   	}
        int localSysStartupdateCounter = -1;
        public boolean isSysStartupdateModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSysStartupdateCounter != sharedCounter;
           localSysStartupdateCounter = sharedCounter; return hasModified; 
        }
	    public boolean sysStartupdateIsNumeric() {
	      return decimalIsNumeric(beginSysStartupdate,SYS_STARTUPDATE_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SYS_STARTUPDATE_LEN = 4;
  	/**
	 * 	serializeSysStartupdate
	 */
	protected void serializeSysStartupdate(int sysStartupdate) {
		   putDecimal(beginSysStartupdate,sysStartupdate,SYS_STARTUPDATE_LEN,true);
   }
   

   protected int checkSysStartupdateMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSysStartupdate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSysStartupdate() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSysStartupdate,SYS_STARTUPDATE_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("sysStartupdate", beginSysStartupdate,SYS_STARTUPDATE_LEN);
     }
   	}




}
  
