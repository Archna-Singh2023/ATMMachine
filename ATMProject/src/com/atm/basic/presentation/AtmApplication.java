package com.atm.basic.presentation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AtmApplication {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("atm");

	}

}
