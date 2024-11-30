package com.cloudframe.app;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
@Configuration
public class BatchDataSourceConfiguration {
	
	
	/** 
 	* Primary datasource for Spring Batch 
 	* @return 
 	*/ 
	@Bean
	@Primary
	public DataSource cfBatchDataSource() {
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		return builder.addScript("classpath:org/springframework/batch/core/schema-drop-h2.sql")
			.addScript("classpath:org/springframework/batch/core/schema-h2.sql").setType(EmbeddedDatabaseType.H2) // .H2 or any other DB
			.build();
	}
    
}   
