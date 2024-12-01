package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class DrstRestartDataAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DrstRestartDataAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DrstRestartDataAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DRST_RESTART_DATA_AREA_LENGTH = 1209;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDrstRetLbmsub90Area;
	
	/**
	* Constructor for DrstRestartDataAreaSerialized
	**/
    public DrstRestartDataAreaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DrstRestartDataAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DRST_RESTART_DATA_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
             beginDrstRetLbmsub90Area = getStartOffset() + 459;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDrstRetLbmsub90AreaCounter = -1;
     public boolean isDrstRetLbmsub90AreaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDrstRetLbmsub90AreaCounter != sharedCounter;
         localDrstRetLbmsub90AreaCounter = sharedCounter; return hasModified;
     }
	protected static final int DRST_RET_LBMSUB_90_AREA_LEN = 750;
	/**
	 * 	serialize this DrstRetLbmsub90Area
	 */
   protected void serializeDrstRetLbmsub90Area(char[] drstRetLbmsub90Area) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(drstRetLbmsub90Area,0,getStringValue(),beginDrstRetLbmsub90Area,DRST_RET_LBMSUB_90_AREA_LEN);
       localDrstRetLbmsub90AreaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDrstRetLbmsub90AreaConstraints(char[] value) {
   			return super.checkConstraints(value , 750 ,false, false);
   }
    /**
	 *	refreshDrstRetLbmsub90Area is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDrstRetLbmsub90Area() {	 
   		return (substring(getStringValue(),beginDrstRetLbmsub90Area,beginDrstRetLbmsub90Area + DRST_RET_LBMSUB_90_AREA_LEN));
   	}




}
  
