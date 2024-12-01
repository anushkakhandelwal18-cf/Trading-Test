package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uTableCountsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uTableCountsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uTableCountsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_TABLE_COUNTS_LENGTH = 40;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginD51uPlnvCnt;
            protected  int beginD51uSpiCnt;
            protected  int beginD51uFrtoCnt;
            protected  int beginD51uPtypCnt;
            protected  int beginD51uIpaCnt;
            protected  int beginD51uCausCnt;
            protected  int beginD51uFcndCnt;
            protected  int beginD51uIcdCnt;
            protected  int beginD51uMoreIcdCnt;
            protected  int beginD51uCflgCnt;
	
	/**
	* Constructor for D51uTableCountsSerialized
	**/
    public D51uTableCountsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uTableCountsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uTableCountsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uTableCountsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,309); // serialize this field at offset 309 by default 
    }
    
	/**
	* sets parent for this D51uTableCountsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 309 by default
    }    
	/**
	* initializes the field in D51uTableCountsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_TABLE_COUNTS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginD51uPlnvCnt = getStartOffset() + 0;	// set offset for serialization
  
             beginD51uSpiCnt = getStartOffset() + 4;	// set offset for serialization
  
             beginD51uFrtoCnt = getStartOffset() + 8;	// set offset for serialization
  
             beginD51uPtypCnt = getStartOffset() + 12;	// set offset for serialization
  
             beginD51uIpaCnt = getStartOffset() + 16;	// set offset for serialization
  
             beginD51uCausCnt = getStartOffset() + 20;	// set offset for serialization
  
             beginD51uFcndCnt = getStartOffset() + 24;	// set offset for serialization
  
             beginD51uIcdCnt = getStartOffset() + 28;	// set offset for serialization
  
             beginD51uMoreIcdCnt = getStartOffset() + 32;	// set offset for serialization
  
             beginD51uCflgCnt = getStartOffset() + 36;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localD51uPlnvCntCounter = -1;
         public boolean isD51uPlnvCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localD51uPlnvCntCounter != sharedCounter;
            localD51uPlnvCntCounter = sharedCounter; return hasModified; 
         }
   protected static final int D_51U_PLNV_CNT_LEN = 4;
  	/**
	 * serializeD51uPlnvCnt
	 */
	protected void serializeD51uPlnvCnt(int d51uPlnvCnt) {
           replaceValue( //  save the value as string
                   getBinaryString( d51uPlnvCnt,D_51U_PLNV_CNT_LEN)
                  ,beginD51uPlnvCnt
                  ,D_51U_PLNV_CNT_LEN
                 );
            localD51uPlnvCntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkD51uPlnvCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshD51uPlnvCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshD51uPlnvCnt() {	 
			return (getInt(beginD51uPlnvCnt));
   	}
         int localD51uSpiCntCounter = -1;
         public boolean isD51uSpiCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localD51uSpiCntCounter != sharedCounter;
            localD51uSpiCntCounter = sharedCounter; return hasModified; 
         }
   protected static final int D_51U_SPI_CNT_LEN = 4;
  	/**
	 * serializeD51uSpiCnt
	 */
	protected void serializeD51uSpiCnt(int d51uSpiCnt) {
           replaceValue( //  save the value as string
                   getBinaryString( d51uSpiCnt,D_51U_SPI_CNT_LEN)
                  ,beginD51uSpiCnt
                  ,D_51U_SPI_CNT_LEN
                 );
            localD51uSpiCntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkD51uSpiCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshD51uSpiCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshD51uSpiCnt() {	 
			return (getInt(beginD51uSpiCnt));
   	}
         int localD51uFrtoCntCounter = -1;
         public boolean isD51uFrtoCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localD51uFrtoCntCounter != sharedCounter;
            localD51uFrtoCntCounter = sharedCounter; return hasModified; 
         }
   protected static final int D_51U_FRTO_CNT_LEN = 4;
  	/**
	 * serializeD51uFrtoCnt
	 */
	protected void serializeD51uFrtoCnt(int d51uFrtoCnt) {
           replaceValue( //  save the value as string
                   getBinaryString( d51uFrtoCnt,D_51U_FRTO_CNT_LEN)
                  ,beginD51uFrtoCnt
                  ,D_51U_FRTO_CNT_LEN
                 );
            localD51uFrtoCntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkD51uFrtoCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshD51uFrtoCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshD51uFrtoCnt() {	 
			return (getInt(beginD51uFrtoCnt));
   	}
         int localD51uPtypCntCounter = -1;
         public boolean isD51uPtypCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localD51uPtypCntCounter != sharedCounter;
            localD51uPtypCntCounter = sharedCounter; return hasModified; 
         }
   protected static final int D_51U_PTYP_CNT_LEN = 4;
  	/**
	 * serializeD51uPtypCnt
	 */
	protected void serializeD51uPtypCnt(int d51uPtypCnt) {
           replaceValue( //  save the value as string
                   getBinaryString( d51uPtypCnt,D_51U_PTYP_CNT_LEN)
                  ,beginD51uPtypCnt
                  ,D_51U_PTYP_CNT_LEN
                 );
            localD51uPtypCntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkD51uPtypCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshD51uPtypCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshD51uPtypCnt() {	 
			return (getInt(beginD51uPtypCnt));
   	}
         int localD51uIpaCntCounter = -1;
         public boolean isD51uIpaCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localD51uIpaCntCounter != sharedCounter;
            localD51uIpaCntCounter = sharedCounter; return hasModified; 
         }
   protected static final int D_51U_IPA_CNT_LEN = 4;
  	/**
	 * serializeD51uIpaCnt
	 */
	protected void serializeD51uIpaCnt(int d51uIpaCnt) {
           replaceValue( //  save the value as string
                   getBinaryString( d51uIpaCnt,D_51U_IPA_CNT_LEN)
                  ,beginD51uIpaCnt
                  ,D_51U_IPA_CNT_LEN
                 );
            localD51uIpaCntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkD51uIpaCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshD51uIpaCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshD51uIpaCnt() {	 
			return (getInt(beginD51uIpaCnt));
   	}
         int localD51uCausCntCounter = -1;
         public boolean isD51uCausCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localD51uCausCntCounter != sharedCounter;
            localD51uCausCntCounter = sharedCounter; return hasModified; 
         }
   protected static final int D_51U_CAUS_CNT_LEN = 4;
  	/**
	 * serializeD51uCausCnt
	 */
	protected void serializeD51uCausCnt(int d51uCausCnt) {
           replaceValue( //  save the value as string
                   getBinaryString( d51uCausCnt,D_51U_CAUS_CNT_LEN)
                  ,beginD51uCausCnt
                  ,D_51U_CAUS_CNT_LEN
                 );
            localD51uCausCntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkD51uCausCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshD51uCausCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshD51uCausCnt() {	 
			return (getInt(beginD51uCausCnt));
   	}
         int localD51uFcndCntCounter = -1;
         public boolean isD51uFcndCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localD51uFcndCntCounter != sharedCounter;
            localD51uFcndCntCounter = sharedCounter; return hasModified; 
         }
   protected static final int D_51U_FCND_CNT_LEN = 4;
  	/**
	 * serializeD51uFcndCnt
	 */
	protected void serializeD51uFcndCnt(int d51uFcndCnt) {
           replaceValue( //  save the value as string
                   getBinaryString( d51uFcndCnt,D_51U_FCND_CNT_LEN)
                  ,beginD51uFcndCnt
                  ,D_51U_FCND_CNT_LEN
                 );
            localD51uFcndCntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkD51uFcndCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshD51uFcndCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshD51uFcndCnt() {	 
			return (getInt(beginD51uFcndCnt));
   	}
         int localD51uIcdCntCounter = -1;
         public boolean isD51uIcdCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localD51uIcdCntCounter != sharedCounter;
            localD51uIcdCntCounter = sharedCounter; return hasModified; 
         }
   protected static final int D_51U_ICD_CNT_LEN = 4;
  	/**
	 * serializeD51uIcdCnt
	 */
	protected void serializeD51uIcdCnt(int d51uIcdCnt) {
           replaceValue( //  save the value as string
                   getBinaryString( d51uIcdCnt,D_51U_ICD_CNT_LEN)
                  ,beginD51uIcdCnt
                  ,D_51U_ICD_CNT_LEN
                 );
            localD51uIcdCntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkD51uIcdCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshD51uIcdCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshD51uIcdCnt() {	 
			return (getInt(beginD51uIcdCnt));
   	}
         int localD51uMoreIcdCntCounter = -1;
         public boolean isD51uMoreIcdCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localD51uMoreIcdCntCounter != sharedCounter;
            localD51uMoreIcdCntCounter = sharedCounter; return hasModified; 
         }
   protected static final int D_51U_MORE_ICD_CNT_LEN = 4;
  	/**
	 * serializeD51uMoreIcdCnt
	 */
	protected void serializeD51uMoreIcdCnt(int d51uMoreIcdCnt) {
           replaceValue( //  save the value as string
                   getBinaryString( d51uMoreIcdCnt,D_51U_MORE_ICD_CNT_LEN)
                  ,beginD51uMoreIcdCnt
                  ,D_51U_MORE_ICD_CNT_LEN
                 );
            localD51uMoreIcdCntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkD51uMoreIcdCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshD51uMoreIcdCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshD51uMoreIcdCnt() {	 
			return (getInt(beginD51uMoreIcdCnt));
   	}
         int localD51uCflgCntCounter = -1;
         public boolean isD51uCflgCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localD51uCflgCntCounter != sharedCounter;
            localD51uCflgCntCounter = sharedCounter; return hasModified; 
         }
   protected static final int D_51U_CFLG_CNT_LEN = 4;
  	/**
	 * serializeD51uCflgCnt
	 */
	protected void serializeD51uCflgCnt(int d51uCflgCnt) {
           replaceValue( //  save the value as string
                   getBinaryString( d51uCflgCnt,D_51U_CFLG_CNT_LEN)
                  ,beginD51uCflgCnt
                  ,D_51U_CFLG_CNT_LEN
                 );
            localD51uCflgCntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkD51uCflgCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshD51uCflgCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshD51uCflgCnt() {	 
			return (getInt(beginD51uCflgCnt));
   	}




}
  
