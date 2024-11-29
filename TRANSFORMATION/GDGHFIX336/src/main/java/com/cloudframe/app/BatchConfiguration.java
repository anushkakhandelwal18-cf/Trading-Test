package com.cloudframe.app;
 
import com.cloudframe.app.utility.CopyUtil;
import org.springframework.batch.core.configuration.annotation.JobScope;
import java.util.Map;
import com.cloudframe.app.utility.sort.tasks.*;
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
    
    @Autowired
    CopyUtil copyUtil;
    
    private static final String JOBNAME = "GDGHFIX336";
    
    /* Driver Programs used in steps */  
   private static final String SORT = "SORT";
    private static final String IEBGENER_BEAN = "iebgener";
    
    private static final String _JSON = ".json";
    
    private static final String COMPLETED_STATUS = "COMPLETED";
    private static final String CONTINUE_STATUS = "CONTINUE";
    
    /*
     * STEP001 SORT starts here
     * Member Info:
     *        SORT FIELDS=COPY                                                 
     *        OUTREC FIELDS=(1,60,20X)                                         
     */
    
    private static final String STEP001_STEP = "step001";
    @Bean
    @JobScope
    public Gdghfix336Step001InputReader gdghfix336Step001InputReader() {
    	return new Gdghfix336Step001InputReader();
    }
    
    @Bean
    @JobScope
    public Gdghfix336Step001Processor gdghfix336Step001Processor() {
    	return new Gdghfix336Step001Processor();
    }
    
    @Bean
    @JobScope
    public Gdghfix336Step001OutputWriter gdghfix336Step001OutputWriter() {
    	return new Gdghfix336Step001OutputWriter();
    }
    
    @Bean
    @JobScope
    protected Step readGdghfix336Step001SortInput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("readGdghfix336Step001SortInput",jobRepository).tasklet(gdghfix336Step001InputReader(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step processGdghfix336Step001Sort(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("sortGdghfix336Step001Process",jobRepository).tasklet(gdghfix336Step001Processor(), transactionManager).build();  
    }
    
    @Bean
    @JobScope
    protected Step writeGdghfix336Step001SortOutput(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    	return new StepBuilder("writeGdghfix336Step001SortOutput",jobRepository).tasklet(gdghfix336Step001OutputWriter(), transactionManager).build();  
    }
    
    @Bean
    public Step step001Decider(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("step001Decider",jobRepository).tasklet(new Tasklet() {
    
 	      @Override
 	      public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
 	          int rc = 0;
            String stepStatus = COMPLETED_STATUS;
                if (cfStepHandler.stepDecider(STEP001_STEP)) { 
                     try {
 		    	   			cfStepHandler.handleStepOverrides(STEP001_STEP);
                     } catch (CFException e) {
                         rc = 12;
                         cfStepHandler.setAbendCode(e);
                         stepStatus = CONTINUE_STATUS;
                     }
                }
            	  else { stepStatus = CONTINUE_STATUS; }
 		    	  cfStepHandler.postStepExecution(STEP001_STEP, rc, SORT );
    		      cfStepHandler.updateStepExecution(STEP001_STEP, chunkContext , rc+"" , stepStatus);
 		      return RepeatStatus.FINISHED;
 		  } 
 	    }, transactionManager).build();
 	  }
    
    @Bean
    public Flow step001Executor(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
       return new FlowBuilder<SimpleFlow>("step001Executor")
             .start(step001Decider(jobRepository, transactionManager))
             .from(step001Decider(jobRepository, transactionManager)).on(COMPLETED_STATUS)
             .to(readGdghfix336Step001SortInput(jobRepository, transactionManager))
             .next(processGdghfix336Step001Sort(jobRepository, transactionManager))
             .next(writeGdghfix336Step001SortOutput(jobRepository, transactionManager))
             .from(step001Decider(jobRepository, transactionManager)).on("*").end()
 	           .build();
    }
    /*
     * STEP001 SORT Ends here 
     */
    
    /*
     * STEP002 IEBGENER starts here
     */
    
    private static final String STEP002_STEP = "step002";
    
    @Bean
    public Step step002(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
    
      return new StepBuilder(STEP002_STEP,jobRepository).tasklet(
    		new Tasklet() {
    
 		       @Override
 		       public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                      String rcStatus = "";
                      if (cfStepHandler.stepDecider(STEP002_STEP)) {
 	 					int rc = 0; // IEBGENER PROGRAM 
                     try {
 		    	   		cfStepHandler.handleStepOverrides(STEP002_STEP);
 		    	   		rc = copyUtil.performCopy(STEP002_STEP + _JSON);
                          } catch (CFException e) {
                             rc = 12;
                             cfStepHandler.setAbendCode(e);
                          }
 		    	  		rcStatus+=rc;
 		    	   		cfStepHandler.postStepExecution(STEP002_STEP, rc );
                      } 
    			   cfStepHandler.updateStepExecution(STEP002_STEP, chunkContext , rcStatus , COMPLETED_STATUS);
 		          return RepeatStatus.FINISHED;
 		     } 
    
 	     }
 	    , transactionManager).build();
    
    }
    /*
     * STEP002 IEBGENER Ends here 
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
 * STEP001 - SORT
 * STEP002 - IEBGENER
 * 
 * @param jobRepository 
 * @param transactionManager 
 * @return 
 */ 
@Bean 
public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
  GlobalExecutorCtx.load(BatchConfiguration.class, context);
	return new JobBuilder(JOBNAME, jobRepository)
			.start(step001Executor(jobRepository, transactionManager)) /*  */

			.next(step002(jobRepository, transactionManager)) /*  */
		.next(printSummary(jobRepository, transactionManager)) 
		.end() 

			.build();
} 
}
