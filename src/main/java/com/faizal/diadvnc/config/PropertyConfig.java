package com.faizal.diadvnc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.faizal.diadvnc.examplebeans.TempDataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

	@Value("${mydb.username}")
	private String username;

	@Value("${mydb.password}")
	private String password;

	@Value("${mydb.url}")
	private String url;

	@Bean
	public TempDataSource tempDataSource() {
		return new TempDataSource(username, password, url);
	}

	public static PropertySourcesPlaceholderConfigurer properties() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
