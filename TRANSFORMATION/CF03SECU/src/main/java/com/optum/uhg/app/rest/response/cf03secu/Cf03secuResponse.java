package com.optum.uhg.app.rest.response.cf03secu;

import java.util.List;
import java.util.ArrayList;

import com.cloudframe.app.rest.Metadata;
import com.optum.uhg.app.rest.cf03secu.Dfhcommarea;

public class Cf03secuResponse {
	
	private Metadata metadata;

    private Dfhcommarea responseCommarea ;
    private String responseCommareaAsBlob;
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
     * @return the responseCommarea
     */
    public Dfhcommarea getResponseCommarea() {
       return responseCommarea;
    }

    /**
     * @param responseCommarea the responseCommarea to set
     */
    public void setResponseCommarea(Dfhcommarea responseCommarea) {
       this.responseCommarea = responseCommarea;
    }

    /**
     * @return the requestCommareaAsBlob
     */
    public String getResponseCommareaAsBlob() {
        return responseCommareaAsBlob;
    }

    /**
     * @param responseCommareaAsBlob the responseCommareaAsBlob to set
     */
    public void setResponseCommareaAsBlob(String responseCommareaAsBlob) {
       this.responseCommareaAsBlob = responseCommareaAsBlob;
    }
}
