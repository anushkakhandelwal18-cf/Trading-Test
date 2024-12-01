package com.cloudframe.app.rest.request.o529351u;

import java.util.List;
import java.util.ArrayList;
import io.swagger.v3.oas.annotations.media.Schema;

import com.cloudframe.app.rest.Metadata;
import com.cloudframe.app.rest.o529351u.Dfhcommarea;

public class O529351uRequest {
	
	private Metadata metadata ;

    private Dfhcommarea requestCommarea ;
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String requestCommareaAsBlob;
	/**
	 * @return the metadata
	 */
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

     /**
      * @return the requestCommarea
      */
     public Dfhcommarea getRequestCommarea() {
        return requestCommarea;
     }

     /**
      * @param requestCommarea the requestCommarea to set
      */
     public void setRequestCommarea(Dfhcommarea requestCommarea) {
         this.requestCommarea = requestCommarea;
     }

     /**
      * @return the requestCommareaAsBlob
      */
     public String getRequestCommareaAsBlob() {
        return requestCommareaAsBlob;
     }

     /**
      * @param requestCommareaAsBlob the requestCommareaAsBlob to set
      */
     public void setRequestCommareaAsBlob(String requestCommareaAsBlob) {
        this.requestCommareaAsBlob = requestCommareaAsBlob;
     }
}

