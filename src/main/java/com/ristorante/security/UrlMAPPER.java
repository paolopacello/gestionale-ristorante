package com.ristorante.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.ristorante.model.Ruolo;

@Configuration
@EnableWebSecurity
public class UrlMAPPER {
	@Autowired
	private AutenticaFilter filter;
	@Autowired
	private AuthenticationProvider provider;
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
		.csrf(AbstractHttpConfigurer::disable)
		.headers(t -> t.frameOptions(f -> f.disable()))
		
		.authorizeHttpRequests(auth -> 
				auth.requestMatchers("/all/**").permitAll()
				.requestMatchers("/cliente/**").hasRole(Ruolo.CLIENTE.getRuolo())
				.requestMatchers("/ristoratore/**").hasRole(Ruolo.RISTORATORE.getRuolo())
				.requestMatchers("/admin/**").hasRole(Ruolo.ADMIN.getRuolo())
				.anyRequest().permitAll())
		.sessionManagement(sess ->sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
		.cors(AbstractHttpConfigurer::disable)
		.authenticationProvider(provider)
		.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
		return http.build();
	}
}
