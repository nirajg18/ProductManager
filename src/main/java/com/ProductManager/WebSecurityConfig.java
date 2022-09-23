//package com.ProductManager;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@Deprecated
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//
//	@Override
//	@Bean
//	protected UserDetailsService userDetailsService() {
//		
//		UserDetails user1 = User.withUsername("namhm")
//				.password("$2a$10$rAT.y.wPaC/iBBJ5iPydf.Hgqz7ONrngjDCNQVpfJi1g9ogcXez76")
//				.roles("USER")
//				.build();
//		
//		return new InMemoryUserDetailsManager(user1);
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//		.anyRequest().authenticated()
//		.and().formLogin().loginPage("/login").permitAll()
//		.and().logout().permitAll();
//		
//	}
//
//	
//}
