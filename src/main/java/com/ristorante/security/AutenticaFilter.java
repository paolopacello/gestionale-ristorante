package com.ristorante.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.ristorante.model.Utente;

import io.jsonwebtoken.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class AutenticaFilter extends OncePerRequestFilter {
	
	@Autowired
	private GestoreToken token;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String authHeader = request.getHeader("Authorization");
		System.out.println(request.getRequestURI());
		if(authHeader!=null&&authHeader.startsWith("Bearer ")) {
			String tokenJwr = authHeader.substring(7);
			if(token.isTokenValid(tokenJwr)&&SecurityContextHolder.getContext().getAuthentication()==null) {	
				Utente u = token.getUtenteFromToken(tokenJwr);
				UsernamePasswordAuthenticationToken upat = new UsernamePasswordAuthenticationToken(u,null,((Authentication) u).getAuthorities());
				upat.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(upat);
			}
		}
		try {
			filterChain.doFilter(request, response);
		} catch (java.io.IOException | ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
