package br.senai.sc.testes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Base {

	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss SSS");
	
	protected static String now() {
		return dtf.format(LocalDateTime.now());
	}
	
	protected void espera(long segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
