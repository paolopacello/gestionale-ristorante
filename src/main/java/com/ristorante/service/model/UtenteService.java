package com.ristorante.service.model;






import com.ristorante.model.Utente;

public interface UtenteService {
	
	public void registraUser(Utente user);
	public void registraRistoratore(Utente ristora);
	public Utente login(String username,String password);
	public Utente userPerId(long id);
	public Utente findUtenteByUsername(String string);
	public Utente findUtenteByUsernameAndPassword(String username, String password);
	
}
