package br.senai.sc.testes;
import java.time.LocalDate;
import java.util.Objects;

import br.senai.sc.testes.exception.NegocioException;

public class Util {
	
	public static int getTamanhoTexto(final String texto) {
		return Objects.isNull(texto) ? 0 : texto.length();
	}
	
	public static void validaIdade(final int idade) {
		if (idade > 30) {
			throw new NegocioException("Idade maior que 30");
		}
	}
	
	 public static int getAnoAniversario(LocalDate aniversario) {
		 return aniversario.getYear();
	 }
	
	 public static void verificaTamanhoNomeCadatroMaior20(final String nome) {
		 if (Objects.nonNull(nome) && nome.length() > 20) {
				throw new NegocioException("Nome é maior que 20");
			}
	 } 
	 
	 public static boolean emailValido(final String email) {
		 
			if (email.contains("@") && email.contains(".")) {
					return true;
			}
		 
		 return false;
	 }
	 
}
