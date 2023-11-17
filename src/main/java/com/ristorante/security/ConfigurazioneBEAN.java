package com.ristorante.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.ristorante.exception.UtenteNonTrovatoException;
import com.ristorante.repository.UtenteRepository;

@Configuration
public class ConfigurazioneBEAN {
	
	@Autowired
	private UtenteRepository repoU;
	
	@Bean
	  AuthenticationManager authenticationManager (AuthenticationConfiguration configura)throws Exception {
		return configura.getAuthenticationManager();	
	}
	
	@Bean
	 PasswordEncoder enCode() {
		return new BCryptPasswordEncoder();
	}
	

	@Bean 
	AuthenticationProvider AuthenticProvider() {
		DaoAuthenticationProvider daoAut = new DaoAuthenticationProvider();
		daoAut.setPasswordEncoder(enCode());
		return daoAut;
	}
}
