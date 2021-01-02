//package com.example.demo;
//
//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.stereotype.Component;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.cors();
//		http.csrf().disable();
//		  http.authorizeRequests().antMatchers("/**").fullyAuthenticated().and
//		 ().httpBasic(); 
//		  
//		  
//		
//	}
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web
//            .ignoring()
//            .antMatchers("/h2-console/**");
//        web
//        .ignoring()
//        .antMatchers("/register/**");
//        web
//        .ignoring()
//        .antMatchers("/allsalads/**"); 
//        web
//        .ignoring()
//        .antMatchers("/findByName/{name}/co**"); 
//    }
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("pasxgeorge").password("{noop}1234").roles("ADMIN");
//		auth.inMemoryAuthentication().withUser("georgekaras").password("{noop}1234").roles("USER");
//	}
//	
//	
//	
//	   
//	
//
//   
//
//   
//	    }
//
//
