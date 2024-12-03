package com.cloudframe.app.progb.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:28. using version 5.0.0.163
**/


import com.cloudframe.app.progb.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 


	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
