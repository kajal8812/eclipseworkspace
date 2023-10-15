package com.learning.spring.learnoauth;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class OauthSecurityConfiguration {

@Bean
@Order(SecurityProperties.BASIC_AUTH_ORDER)
SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http ) throws Exception {
	http.authorizeRequests().anyRequest().authenticated();

http.oauth2Login(Customizer.withDefaults());
return http.build();

}
	
	
	
}
