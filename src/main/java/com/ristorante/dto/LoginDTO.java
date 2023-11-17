package com.ristorante.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginDTO {
	@NotBlank(message ="lo username non può essere vuoto")
	@Size( min=8, message="lo username deve avere almeno 8 caratteri")
	private String username;
	
	@NotBlank(message="la password non può essere vuota")
	@Size(min=8,max=16, message="la password deve contenere minimo 8 caratteri a un massimo di 16")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", message = "la password deve rispettare la regex")
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
