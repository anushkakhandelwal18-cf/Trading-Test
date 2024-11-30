package com.cloudframe.app;
 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.batch.core.configuration.annotation.JobScope;
import java.util.Map;
import com.cloudframe.app.service.Trdpb000;
import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.observability.BatchMetrics;
import com.cloudframe.app.utility.SpringContextHandler;
import com.cloudframe.app.exception.CFException;
import org.springframework.context.ApplicationContext;
import com.cloudframe.app.dto.GlobalExecutorCtx;
    
@Configuration
    
public class BatchConfiguration {
    
    
    @Autowired
    CFStepHandler cfStepHandler;
    
    @Autowired
    ApplicationContext context;
    
    private static final String JOBNAME = "ACCPKRW";
    
    /* Driver Programs used in steps */  
    private static final String TRDPB000_BEAN = "trdpb000";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    
    /*
     * STEP01 TRDPB000 starts here
     * Member Info:
     *   DSN SYSTEM (DBCG)
     *   RUN PROGRAM(TRDPB000) -
     *   PLAN   (CLFRPLAN) -
     *   PARM('KRW 0100')
     *   END
     *   DSN SYSTEM (DBCG)
     *   RUN PROGRAM(TRDPB000) -
     *   PLAN   (CLFRPLAN) -
     *   PARM('KRW 0100')
     *   END
     */
    
    private static final String STEP01_STEP = "step01";
    
    
    @Value("${STEP01.TRDPB000.inputValue:'KRW 0100'}")
    private String step01Trdpb000Parm ;
    
    @Bean
    public Step step01(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(STEP01_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(STEP01_STEP)) {
     int rc = 0;
 	   try { 
 		    	  		rc = ((Trdpb000)cfStepHandler.initAndGetProcessBean(STEP01_STEP,TRDPB000_BEAN)).setParameter(new GlobalExecutorCtx().getContext("TRDPB000"), cfStepHandler.getParm(step01Trdpb000Parm));
 } catch (CFException cfe) { 
 if (cfe.isTerminated()) {
 rc = cfe.getCode();
  } else {
rc = Integer.MAX_VALUE;
cfStepHandler.setAbendCode(cfe);
}
}
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(STEP01_STEP, rc ,TRDPB000_BEAN);
                      } 
    			   cfStepHandler.updateStepExecution(STEP01_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * STEP01 TRDPB000 Ends here 
     */
    
	
	@Bean
	public Step printSummary(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    return new StepBuilder("printSummary", jobRepository).tasklet(new Tasklet() {
	    @Override
	    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
          cfStepHandler.printExecutionSummary();
          return RepeatStatus.FINISHED;
      }
	  }, transactionManager).build();
	}
	    
/** 
 * Execute the Job that consists of 
 * STEP01 - TRDPB000
 * 
 * @param jobRepository 
 * @param transactionManager 
 * @return 
 */ 
@Bean 
public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
  GlobalExecutorCtx.load(BatchConfiguration.class, context);
	return new JobBuilder(JOBNAME, jobRepository)
			.start(step01(jobRepository, transactionManager))		.next(printSummary(jobRepository, transactionManager)) 

			.build();
} 
}
