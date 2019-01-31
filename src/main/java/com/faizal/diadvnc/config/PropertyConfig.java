package com.faizal.diadvnc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.faizal.diadvnc.examplebeans.TempDataSource;
import com.faizal.diadvnc.examplebeans.TempJmsSource;

@Configuration
// @PropertySource({ "classpath:datasource.properties",
// "classpath:jmssource.properties" })
@PropertySources({ @PropertySource("classpath:jmssource.properties"),
		@PropertySource("classpath:datasource.properties") })
public class PropertyConfig {

	@Autowired
	Environment env;

	@Value("${mydb.username}")
	private String username;

	@Value("${mydb.password}")
	private String password;

	@Value("${mydb.url}")
	private String url;

	@Value("${myjms.username}")
	private String jmsUsername;

	@Value("${myjms.password}")
	private String jmsPassword;

	@Value("${myjms.url}")
	private String jmsUrl;

	@Bean
	public TempDataSource tempDataSource() {
		return new TempDataSource(env.getProperty("USERNAME"), password, url);
	}

	@Bean
	public TempJmsSource tempJmsSource() {
		return new TempJmsSource(jmsUsername, jmsPassword, jmsUrl);
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
