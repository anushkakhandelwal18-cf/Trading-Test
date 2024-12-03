package com.cloudframe.app.trdpb007.dto;

/**
*  The class PutBuffer is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:38. using version 5.0.0.163
**/


import com.cloudframe.app.trdpb007.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PutBuffer extends PutBufferSerialized { 
   
				private W03Csq4biim w03Csq4biim = new W03Csq4biim();
	
	/**
	* Constructor for PutBuffer
	**/
    public PutBuffer() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			w03Csq4biim.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of w03Csq4biim
	 *	@return w03Csq4biim
	 */   
	 public W03Csq4biim getW03Csq4biim() {
   	return w03Csq4biim;
   }
   /**
	* 	Update W03Csq4biim with the passed value
	*   Corresponding COBOL Variable is W03-CSQ4BIIM
	*	@param value
	*/
   public void setW03Csq4biim(char[] value) {
      w03Csq4biim.setString(value); 
   }   
    
     /**
	 * 	Update W03Csq4biim 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setW03Csq4biim(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,w03Csq4biim.begin,w03Csq4biim.length());
   }
   
     /**
	 * 	Update W03Csq4biim 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setW03Csq4biim(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,w03Csq4biim.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update W03Csq4biim with another Field
	 *	@param value
	 */
   public void setW03Csq4biim(Field source) {
   	replace(source,0,source.length(),w03Csq4biim.begin,w03Csq4biim.length());
   }  
   
     /**
	 * 	Update W03Csq4biim 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setW03Csq4biim(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,w03Csq4biim.begin,w03Csq4biim.length());
   }
   
     /**
	 * 	Update W03Csq4biim 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setW03Csq4biim(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,w03Csq4biim.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getPutBufferFieldLength() {
			return PUT_BUFFER_LENGTH;
		}

}
  
