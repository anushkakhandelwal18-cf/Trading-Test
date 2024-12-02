package com.optum.uhg.app;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;


@Configuration
public class OpenApiConfig {

	@Value("${cf.cics.api.name:CicsApi}")
	String cicsApiName;

	@Value("${cf.cics.api.description:}")
	String cicsApiDescription;

	@Value("${cf.cics.api.version:}")
	String cicsApiVersion;

	@Value("${cf.cics.api.company.url:}")
	String cicscompanyUrl;

	@Value("${cf.cics.contact.name:}")
	String cicsContactName;

	@Value("${cf.cics.contact.email:}")
	String cicsContactEmail;

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info().title(cicsApiName)
						.version(cicsApiVersion)
						.description(cicsApiDescription).contact(getContacts()));
	}

	private Contact getContacts() {
		return new Contact()
				.name(cicsContactName)
				.email(cicsContactEmail)
				.url(cicscompanyUrl);
	}
}
