package com.cloudframe.app;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.cics0010.Cics0010Ctx;

/**
 * The application can be started  Via rest invocation
 *  
 * @author CloudFrame Inc. Code Generator
 *
 */
@SpringBootApplication
public class CFApplication {
	public static void main(String[] args) {
			//logger.info("Running on Java version: " + System.getProperty("java.version"));
	        int exitCode = 0;
            ConfigurableApplicationContext context = SpringApplication.run(CFApplication.class);
            GlobalExecutorCtx.load(CFApplication.class, context);

	}
}
