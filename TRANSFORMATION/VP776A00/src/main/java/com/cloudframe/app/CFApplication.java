package com.cloudframe.app;

import com.cloudframe.app.exception.Terminate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.beans.BeansException;
import org.springframework.boot.WebApplicationType;
import org.springframework.util.StringUtils;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.business.Vp776a00;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.vp776a00.Vp776a00Ctx;

/**
 * The Vp776a00 application can be started in three different ways
 * 1. Via mainframe JCL
 * 2. Via rest invocation
 * 3. Via console command , inputValue(if any) to be filled in application.properties 
 *  
 * @author CloudFrame Inc. Code Generator
 *
 */
@SpringBootApplication
public class CFApplication {
	private static Logger logger = LoggerFactory.getLogger(CFApplication.class);
	public static void main(String[] args) {
			//logger.info("Running on Java version: " + System.getProperty("java.version"));
	        int exitCode = 0;
		ConfigurableApplicationContext context = SpringApplication.run(CFApplication.class);	
		String appType = context.getEnvironment().getProperty("spring.main.web-application-type");
		if (StringUtils.hasText(appType) && WebApplicationType.NONE.equals(WebApplicationType.valueOf(appType.trim().toUpperCase())))
		 	try {
            GlobalExecutorCtx.load(CFApplication.class, context);
		 		context.registerShutdownHook();
		 		Vp776a00 vp776a00 = (Vp776a00) context.getBean("vp776a00");
				String inputValue = context.getEnvironment().getProperty("inputValue");
				if (!StringUtils.hasText(inputValue))
					throw new CFException(
							"Required Property 'inputValue' is either not available in application.properties or is empty");
				String inputValue1 = context.getEnvironment().getProperty("inputValue1");
				if (!StringUtils.hasText(inputValue1))
					throw new CFException(
							"Required Property 'inputValue1' is either not available in application.properties or is empty");
				String inputValue2 = context.getEnvironment().getProperty("inputValue2");
				if (!StringUtils.hasText(inputValue2))
					throw new CFException(
							"Required Property 'inputValue2' is either not available in application.properties or is empty");
				String inputValue3 = context.getEnvironment().getProperty("inputValue3");
				if (!StringUtils.hasText(inputValue3))
					throw new CFException(
							"Required Property 'inputValue3' is either not available in application.properties or is empty");
				vp776a00.setParameter(new GlobalExecutorCtx().getContext(Vp776a00Ctx.class),inputValue,inputValue1,inputValue2,inputValue3);
			} catch (BeansException | CFException exception) {
				if (exception instanceof BeansException || !((CFException) exception).isTerminated()) {
                    logger.error("Error Info : ", exception);
                    exitCode = 5;
                }
		   	} catch(Exception e) {
		   	    logger.error("Unknown application error Info : ", e.getMessage());
		   	    exitCode = 5;
		   	} finally {
		   	    System.exit(exitCode);
		   		SpringContextHandler.close();
		   		context.close();
		   	}	
	}
}
