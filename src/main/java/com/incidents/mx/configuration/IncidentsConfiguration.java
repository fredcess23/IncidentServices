package com.incidents.mx.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.incidents.mx.dao.UserDAO;
import com.incidents.mx.dao.UserDAOImpl;
 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.incidents.mx")
public class IncidentsConfiguration {
     
	@Bean
	public UserDAO user(){
		return new UserDAOImpl();
	}
	
}