package br.senai.sc.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.senai.sc.testes.exception.NegocioException;

@DisplayName("Testa Classe util")
public class AppTest extends Base {

	private static Logger log = LoggerFactory.getLogger(AppTest.class);
	
	@BeforeEach
	public void beforeEach() {
		log.info("beforeEach");
	}
	
	@BeforeAll
	public static void beforeAll() {
		log.info("beforeAll");
	}
	
	@AfterAll
	public static void AfterAll() {
		log.info("afterAll");
	}

	@DisplayName("Testa metodo de tamanho de String")
	@Test
	public void testaMetodoTamanhoString() {
		log.info("Testa metodo de tamanho de String");
		assertTrue(Util.getTamanhoTexto("Fernando") == 8);
	}

	@DisplayName("Testa validação de idade")
	@Test
	public void testarIdade() {
		log.info("Testa validação de idade");
		assertThrows(NegocioException.class, () -> {
			Util.validaIdade(50);
		});
	}
	
	@DisplayName("Testa timeout")
	@Test
	@Disabled("Deu BO no cliente")
	public void testaTimeOut() {
		log.info("Testa timeout");
		assertTimeout(Duration.ofSeconds(5), () -> {
			espera(4);
		});
	}
	
	@DisplayName("Retorna Ano de nascimento")
	@Test
	public void anoAniversario() {
		log.info("Testa ano de nascimento");
		assertEquals(1994, Util.getAnoAniversario(LocalDate.of(1994, 07, 22)));
	}
	
	@DisplayName("Testa tamanho do nome")
	@Test
	public void testarTamanhoDoNome() {
		log.info("Testa tamanho do nome");
		assertThrows(NegocioException.class, () -> {
			Util.verificaTamanhoNomeCadatroMaior20("alexsonnnnnnnnnnnnnnnn");
		});
	}
	
	@DisplayName("Testa email")
	@Test
	public void testarValidacaoDeEmail() {
		log.info("Testa email");
		assertTrue(Util.emailValido("alexfelipesilveira@gmail.com"));
	}
	
	@DisplayName("Cadastra pessoa")
	@Test
	public void testeCadastraPessoa() {
		log.info("Testa cadastro pessoa");
		Pessoa pessoa = new Pessoa("Alex", 27, "Masculino");
		
	}
	
}
