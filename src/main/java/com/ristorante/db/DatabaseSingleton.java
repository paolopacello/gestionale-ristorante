package com.ristorante.db;

public class DatabaseSingleton {
	
	
	private static final DatabaseSingleton instance = new DatabaseSingleton();
	
	private DatabaseSingleton() {
		
	}

	public static DatabaseSingleton getInstance() {
		return instance;
	}
	
	
}
