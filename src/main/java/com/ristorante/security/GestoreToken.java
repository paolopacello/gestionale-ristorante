package com.ristorante.security;

import java.awt.RenderingHints.Key;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ristorante.model.Utente;
import com.ristorante.repository.UtenteRepository;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SigningKeyResolver;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class GestoreToken {
	
	@Autowired
	private UtenteRepository rep;
	
private final static String SECRET_KEY="404E635266556A586E3272357538782F413F4428472B4B6250645367566B5970";
	
	private Key getKey() {
		byte[] chiaveInByte = Decoders.BASE64.decode(SECRET_KEY);
		return (Key) Keys.hmacShaKeyFor(chiaveInByte);
	}
	
	public Claims creaClaims(Utente u) {
		Claims c = Jwts.claims()
				.setSubject(u.getUsername());
		c.put("nome", u.getNome());
		c.put("cognome", u.getCognome());
		c.put("ruolo", u.getRuolo());
		return c;
	}
	
	public String creaToken(Utente u) {
		long durata = 1000L*60*60*24*30*3;
		return Jwts.builder()
				.setClaims(creaClaims(u))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+durata))
				.signWith((java.security.Key) getKey(), SignatureAlgorithm.HS256)
				.compact();
	}
	
	private Claims estraiClaims(String token) {
		return Jwts.parserBuilder()
				.setSigningKeyResolver((SigningKeyResolver) getKey())
				.build()
				.parseClaimsJws(token)
				.getBody();
	}
	
	public Utente getUtenteFromToken(String token) {
		Claims c= estraiClaims(token);
		Utente u = rep.findUtenteByUsername(c.getSubject()).orElseThrow();
		return u;
		
	}
	
	public LocalDateTime getDataScadenza(String token) {
		Claims c = estraiClaims(token);
		Date d = (Date) c.getExpiration();
		return d.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}
	
	public String getNomeAndCognome(String token) {
		Claims c = estraiClaims(token);
		String nomeCognome =(String) c.get("nome") + " " + c.get("cognome");
		return nomeCognome;
	}
	
	public boolean isTokenValid(String token) {
		return getDataScadenza(token).isAfter(LocalDateTime.now());
	}
}
