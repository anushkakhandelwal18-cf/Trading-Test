package com.optum.uhg.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.optum.uhg.app.service.Cf03secu;
import com.optum.uhg.app.rest.request.cf03secu.Cf03secuRequest;
import com.optum.uhg.app.rest.response.cf03secu.Cf03secuResponse;
import com.cloudframe.app.exception.CFException;
import com.optum.uhg.app.exception.DatabaseException;
import com.optum.uhg.app.exception.BusinessException;
import com.optum.uhg.app.dto.cf03secu.Cf03secuCtx;
import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.rest.Metadata;
import com.cloudframe.app.utility.CFUtil;
import com.optum.uhg.app.rest.cf03secu.Dfhcommarea;

/**
 * This class has controller methods for every cics program
 *
 * @author CloudFrame Inc.
 *
 */

@RestController
public class ApiController {
	private Logger logger = LoggerFactory.getLogger(ApiController.class);
	private ObjectMapper om = new ObjectMapper();
	

	@Autowired
  	@Qualifier("cf03secu")
	Cf03secu cf03secu;
	@PostMapping(value = "/cf03secu")
    public ResponseEntity<Cf03secuResponse> postCommarea(
        @RequestBody Cf03secuRequest cf03secuRequest) throws Exception {
            Cf03secuCtx cf03secuCtx = null;
    		try {
    			cf03secuCtx = handleRequest(cf03secuRequest);
                cf03secu.process(cf03secuCtx);
                return new ResponseEntity<>(sendBackResponse(cf03secuCtx , cf03secuRequest.getMetadata()), HttpStatus.OK);
    		} catch (CFException ex) {
    			if (ex.isTerminated()) {
                    return new ResponseEntity<>(sendBackResponse(cf03secuCtx , cf03secuRequest.getMetadata()), HttpStatus.OK);
    			} else if (ex.isDb2Related()) {
    				DatabaseException dbe = DatabaseException.getException(ex.getMessage(), ex);
    				dbe.setRc(ex.getCode());
    				throw dbe;
    			} else {
    				BusinessException be = BusinessException.getException(ex.getMessage(), ex);
    				be.setRc(ex.getCode());
    				throw be;
    			}
    		} catch (Exception ex) {
com.optum.uhg.app.exception.RuntimeException rt = com.optum.uhg.app.exception.RuntimeException
    					.getException(ex.getMessage(), ex);
    			rt.setRc(12);
    			throw rt;
    		}
    }

      private Cf03secuCtx handleRequest(Cf03secuRequest cf03secuRequest) throws InstantiationException, IllegalAccessException, CFException {
         logObj("Request", cf03secuRequest);
         Cf03secuCtx programCtx = new GlobalExecutorCtx().getContext(Cf03secuCtx.class);
         Metadata reqMetadata = cf03secuRequest.getMetadata();
         if(reqMetadata.isBlobRequest()) {
           programCtx.getDfhcommarea().setCharArray(CFUtil.toCharArr(cf03secuRequest.getRequestCommareaAsBlob()));
         } else {
          cf03secuRequest.getRequestCommarea().setDfhcommarea(programCtx.getDfhcommarea());
         }
         return programCtx;
     }

     private Cf03secuResponse sendBackResponse(Cf03secuCtx cf03secuCtx, Metadata metadata) throws CFException {
        Cf03secuResponse responseObj = new Cf03secuResponse();
        responseObj.setMetadata(metadata);
        if (responseObj.getMetadata().isBlobResponse()) {
          responseObj.setResponseCommareaAsBlob(CFUtil.toString(cf03secuCtx.getDfhcommarea().toCharArray()));
        } else {
          responseObj.setResponseCommarea(new Dfhcommarea());
          responseObj.getResponseCommarea().populateFrom(cf03secuCtx.getDfhcommarea());
        }
        logObj("Response", responseObj);
        return responseObj;
     }



	private void logObj(String type, Object obj) {
		if (logger.isDebugEnabled())
			try { logger.debug("{}  : {}", type, om.writeValueAsString(obj)); } 
			catch (JsonProcessingException e) {
              logger.debug("Unable to parse {} . Error message : {} " ,  type , e.getMessage());
			}
	}



}

