package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 37002;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSavHcdsChargeInfo;
           protected static final int SAV_HCDS_CHARGE_INFO_SIZE = 80;
            protected  int beginSazgrpNumGrp;
           protected int beginSazgrpGroups;
           protected static final int SAZGRP_GROUPS_SIZE = 99;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	        beginSavHcdsChargeInfo = getStartOffset() + 0; // set offset for serialization
  
  
  
             beginSazgrpNumGrp = getStartOffset() + 17200;	// set offset for serialization
  
	        beginSazgrpGroups = getStartOffset() + 17202; // set offset for serialization
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
         int localW02AbsoluteTimeCounter = -1;
         public boolean isW02AbsoluteTimeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localW02AbsoluteTimeCounter != sharedCounter;
            localW02AbsoluteTimeCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkW02AbsoluteTimeMaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     int localDdSpirulesCounter = -1;
     public boolean isDdSpirulesModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDdSpirulesCounter != sharedCounter;
         localDdSpirulesCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDdSpirulesConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localDdPlanvaraCounter = -1;
     public boolean isDdPlanvaraModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDdPlanvaraCounter != sharedCounter;
         localDdPlanvaraCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDdPlanvaraConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
         int localCicsDfhrespCodeCounter = -1;
         public boolean isCicsDfhrespCodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCicsDfhrespCodeCounter != sharedCounter;
            localCicsDfhrespCodeCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCicsDfhrespCodeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localFirstTimeThruCounter = -1;
     public boolean isFirstTimeThruModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFirstTimeThruCounter != sharedCounter;
         localFirstTimeThruCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFirstTimeThruConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localPlanVarFoundSwCounter = -1;
     public boolean isPlanVarFoundSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanVarFoundSwCounter != sharedCounter;
         localPlanVarFoundSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPlanVarFoundSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localPosTierFoundSwCounter = -1;
     public boolean isPosTierFoundSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPosTierFoundSwCounter != sharedCounter;
         localPosTierFoundSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPosTierFoundSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localNewPlanVarFoundSwCounter = -1;
     public boolean isNewPlanVarFoundSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNewPlanVarFoundSwCounter != sharedCounter;
         localNewPlanVarFoundSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkNewPlanVarFoundSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localEndOfPlanAltCounter = -1;
     public boolean isEndOfPlanAltModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndOfPlanAltCounter != sharedCounter;
         localEndOfPlanAltCounter = sharedCounter; return hasModified;
     }

   protected char[] checkEndOfPlanAltConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localEndOfSpiRuleCounter = -1;
     public boolean isEndOfSpiRuleModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndOfSpiRuleCounter != sharedCounter;
         localEndOfSpiRuleCounter = sharedCounter; return hasModified;
     }

   protected char[] checkEndOfSpiRuleConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localTopsCnvSvcCounter = -1;
     public boolean isTopsCnvSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTopsCnvSvcCounter != sharedCounter;
         localTopsCnvSvcCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTopsCnvSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localNbrEqualCounter = -1;
     public boolean isNbrEqualModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNbrEqualCounter != sharedCounter;
         localNbrEqualCounter = sharedCounter; return hasModified;
     }

   protected char[] checkNbrEqualConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSearchCompleteCounter = -1;
     public boolean isSearchCompleteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSearchCompleteCounter != sharedCounter;
         localSearchCompleteCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSearchCompleteConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFromPsFoundCounter = -1;
     public boolean isFromPsFoundModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFromPsFoundCounter != sharedCounter;
         localFromPsFoundCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFromPsFoundConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFromSvcFoundCounter = -1;
     public boolean isFromSvcFoundModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFromSvcFoundCounter != sharedCounter;
         localFromSvcFoundCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFromSvcFoundConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFromPrvFoundCounter = -1;
     public boolean isFromPrvFoundModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFromPrvFoundCounter != sharedCounter;
         localFromPrvFoundCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFromPrvFoundConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFromIcd9FoundCounter = -1;
     public boolean isFromIcd9FoundModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFromIcd9FoundCounter != sharedCounter;
         localFromIcd9FoundCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFromIcd9FoundConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFromCauseFoundCounter = -1;
     public boolean isFromCauseFoundModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFromCauseFoundCounter != sharedCounter;
         localFromCauseFoundCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFromCauseFoundConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localUseDiagnosisSwCounter = -1;
     public boolean isUseDiagnosisSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUseDiagnosisSwCounter != sharedCounter;
         localUseDiagnosisSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkUseDiagnosisSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIpaCodeFoundCounter = -1;
     public boolean isIpaCodeFoundModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIpaCodeFoundCounter != sharedCounter;
         localIpaCodeFoundCounter = sharedCounter; return hasModified;
     }

   protected char[] checkIpaCodeFoundConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localCpeFlgFoundCounter = -1;
     public boolean isCpeFlgFoundModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpeFlgFoundCounter != sharedCounter;
         localCpeFlgFoundCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCpeFlgFoundConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIpaAndGtnFoundCounter = -1;
     public boolean isIpaAndGtnFoundModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIpaAndGtnFoundCounter != sharedCounter;
         localIpaAndGtnFoundCounter = sharedCounter; return hasModified;
     }

   protected char[] checkIpaAndGtnFoundConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localGtnLoadedCounter = -1;
     public boolean isGtnLoadedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGtnLoadedCounter != sharedCounter;
         localGtnLoadedCounter = sharedCounter; return hasModified;
     }

   protected char[] checkGtnLoadedConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSameTableCounter = -1;
     public boolean isSameTableModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSameTableCounter != sharedCounter;
         localSameTableCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSameTableConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localKeyCompleteCounter = -1;
     public boolean isKeyCompleteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localKeyCompleteCounter != sharedCounter;
         localKeyCompleteCounter = sharedCounter; return hasModified;
     }

   protected char[] checkKeyCompleteConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWithMmiSw2010Counter = -1;
     public boolean isWithMmiSw2010Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWithMmiSw2010Counter != sharedCounter;
         localWithMmiSw2010Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWithMmiSw2010Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localMmiFoundSwCounter = -1;
     public boolean isMmiFoundSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMmiFoundSwCounter != sharedCounter;
         localMmiFoundSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkMmiFoundSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localPrimDiagFoundCounter = -1;
     public boolean isPrimDiagFoundModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrimDiagFoundCounter != sharedCounter;
         localPrimDiagFoundCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPrimDiagFoundConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localD529351uDb2DsmCounter = -1;
     public boolean isD529351uDb2DsmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD529351uDb2DsmCounter != sharedCounter;
         localD529351uDb2DsmCounter = sharedCounter; return hasModified;
     }

   protected char[] checkD529351uDb2DsmConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localNewSpiSwCounter = -1;
     public boolean isNewSpiSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNewSpiSwCounter != sharedCounter;
         localNewSpiSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkNewSpiSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localPrimeSpiSwCounter = -1;
     public boolean isPrimeSpiSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrimeSpiSwCounter != sharedCounter;
         localPrimeSpiSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPrimeSpiSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
         int localMedSvcNbrCounter = -1;
         public boolean isMedSvcNbrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMedSvcNbrCounter != sharedCounter;
            localMedSvcNbrCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkMedSvcNbrMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localMedSvcCounter = -1;
     public boolean isMedSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMedSvcCounter != sharedCounter;
         localMedSvcCounter = sharedCounter; return hasModified;
     }

   protected char[] checkMedSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localFeSpiEnableIndCounter = -1;
     public boolean isFeSpiEnableIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFeSpiEnableIndCounter != sharedCounter;
         localFeSpiEnableIndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFeSpiEnableIndConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localFePrimeSpiEnableIndCounter = -1;
     public boolean isFePrimeSpiEnableIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFePrimeSpiEnableIndCounter != sharedCounter;
         localFePrimeSpiEnableIndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFePrimeSpiEnableIndConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
         int localKeySubCounter = -1;
         public boolean isKeySubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localKeySubCounter != sharedCounter;
            localKeySubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkKeySubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSubCounter = -1;
         public boolean isSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSubCounter != sharedCounter;
            localSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localPosSubCounter = -1;
         public boolean isPosSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPosSubCounter != sharedCounter;
            localPosSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkPosSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localGenSubCounter = -1;
         public boolean isGenSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localGenSubCounter != sharedCounter;
            localGenSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkGenSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localNewSubCounter = -1;
         public boolean isNewSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNewSubCounter != sharedCounter;
            localNewSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkNewSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localPsSubCounter = -1;
         public boolean isPsSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPsSubCounter != sharedCounter;
            localPsSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkPsSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSvcSubCounter = -1;
         public boolean isSvcSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSvcSubCounter != sharedCounter;
            localSvcSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSvcSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localPvSubCounter = -1;
         public boolean isPvSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPvSubCounter != sharedCounter;
            localPvSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkPvSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localIcd9SubCounter = -1;
         public boolean isIcd9SubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIcd9SubCounter != sharedCounter;
            localIcd9SubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIcd9SubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localCauseSubCounter = -1;
         public boolean isCauseSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCauseSubCounter != sharedCounter;
            localCauseSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCauseSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localIpaSubCounter = -1;
         public boolean isIpaSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIpaSubCounter != sharedCounter;
            localIpaSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIpaSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localCflgSubCounter = -1;
         public boolean isCflgSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCflgSubCounter != sharedCounter;
            localCflgSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCflgSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSub01Counter = -1;
         public boolean isSub01Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSub01Counter != sharedCounter;
            localSub01Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSub01MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localDiagSubCounter = -1;
         public boolean isDiagSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDiagSubCounter != sharedCounter;
            localDiagSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkDiagSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localS1Counter = -1;
         public boolean isS1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localS1Counter != sharedCounter;
            localS1Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkS1MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localDSubCounter = -1;
         public boolean isDSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDSubCounter != sharedCounter;
            localDSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkDSubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localISubCounter = -1;
         public boolean isISubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localISubCounter != sharedCounter;
            localISubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkISubMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localS2Counter = -1;
         public boolean isS2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localS2Counter != sharedCounter;
            localS2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkS2MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSavHpriceCountCounter = -1;
         public boolean isSavHpriceCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSavHpriceCountCounter != sharedCounter;
            localSavHpriceCountCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSavHpriceCountMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSavNbrOfOccurances2Counter = -1;
         public boolean isSavNbrOfOccurances2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSavNbrOfOccurances2Counter != sharedCounter;
            localSavNbrOfOccurances2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSavNbrOfOccurances2MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
 
   
  protected  static final int SAV_HCDS_CHARGE_INFO_LEN = 215;
   /**
	 *	serializeSavHcdsChargeInfo as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeSavHcdsChargeInfo(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginSavHcdsChargeInfo + index*SAV_HCDS_CHARGE_INFO_LEN)
   	          , SAV_HCDS_CHARGE_INFO_LEN 
   	          );
   }
         int localSavMpriceCountCounter = -1;
         public boolean isSavMpriceCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSavMpriceCountCounter != sharedCounter;
            localSavMpriceCountCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSavMpriceCountMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSavNbrOfOccurances3Counter = -1;
         public boolean isSavNbrOfOccurances3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSavNbrOfOccurances3Counter != sharedCounter;
            localSavNbrOfOccurances3Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSavNbrOfOccurances3MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
        int localSazgrpNumGrpCounter = -1;
        public boolean isSazgrpNumGrpModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSazgrpNumGrpCounter != sharedCounter;
           localSazgrpNumGrpCounter = sharedCounter; return hasModified; 
        }
	    public boolean sazgrpNumGrpIsNumeric() {
	      return decimalIsNumeric(beginSazgrpNumGrp,SAZGRP_NUM_GRP_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SAZGRP_NUM_GRP_LEN = 2;
  	/**
	 * 	serializeSazgrpNumGrp
	 */
	protected void serializeSazgrpNumGrp(int sazgrpNumGrp) {
		   putDecimal(beginSazgrpNumGrp,sazgrpNumGrp,SAZGRP_NUM_GRP_LEN,false);
   }
   

   protected int checkSazgrpNumGrpMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1000 /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshSazgrpNumGrp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSazgrpNumGrp() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSazgrpNumGrp,SAZGRP_NUM_GRP_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("sazgrpNumGrp", beginSazgrpNumGrp,SAZGRP_NUM_GRP_LEN);
     }
   	}
 
   
  protected  static final int SAZGRP_GROUPS_LEN = 200;
   /**
	 *	serializeSazgrpGroups as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeSazgrpGroups(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginSazgrpGroups + index*SAZGRP_GROUPS_LEN)
   	          , SAZGRP_GROUPS_LEN 
   	          );
   }
     int localFunctionFlagCounter = -1;
     public boolean isFunctionFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionFlagCounter != sharedCounter;
         localFunctionFlagCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFunctionFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localIllogicalCondCounter = -1;
     public boolean isIllogicalCondModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIllogicalCondCounter != sharedCounter;
         localIllogicalCondCounter = sharedCounter; return hasModified;
     }

   protected char[] checkIllogicalCondConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
         int localDfhb0020Counter = -1;
         public boolean isDfhb0020Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDfhb0020Counter != sharedCounter;
            localDfhb0020Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkDfhb0020MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localDfhb0021Counter = -1;
         public boolean isDfhb0021Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDfhb0021Counter != sharedCounter;
            localDfhb0021Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkDfhb0021MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localDfhc0040Counter = -1;
     public boolean isDfhc0040Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDfhc0040Counter != sharedCounter;
         localDfhc0040Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDfhc0040Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localDfheiv0Counter = -1;
     public boolean isDfheiv0Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDfheiv0Counter != sharedCounter;
         localDfheiv0Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDfheiv0Constraints(char[] value) {
   			return super.checkConstraints(value , 77 ,false, false);
   }
     int localLsEqiRecordCounter = -1;
     public boolean isLsEqiRecordModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsEqiRecordCounter != sharedCounter;
         localLsEqiRecordCounter = sharedCounter; return hasModified;
     }

   protected char[] checkLsEqiRecordConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }

		public int savHcdsChargeInfoSize() {
			return SAV_HCDS_CHARGE_INFO_SIZE;
		}
		public int sazgrpGroupsSize() {
			return SAZGRP_GROUPS_SIZE;
		}



}
  
