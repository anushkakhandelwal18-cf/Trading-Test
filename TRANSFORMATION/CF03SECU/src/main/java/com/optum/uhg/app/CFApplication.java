package com.optum.uhg.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.optum.uhg.app.dto.cf03secu.Cf03secuCtx;

/**
 * The application can be started  Via rest invocation
 *  
 * @author CloudFrame Inc. Code Generator
 *
 */
@SpringBootApplication
@ComponentScan(basePackages =  {"com.cloudframe.app","com.optum.uhg.app"} )
public class CFApplication {
	public static void main(String[] args) {
			//logger.info("Running on Java version: " + System.getProperty("java.version"));
	        int exitCode = 0;
            ConfigurableApplicationContext context = SpringApplication.run(CFApplication.class);
            GlobalExecutorCtx.load(CFApplication.class, context);

	}
}
