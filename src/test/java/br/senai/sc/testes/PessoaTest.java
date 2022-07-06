package br.senai.sc.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.senai.sc.testes.exception.NegocioException;

@DisplayName("Testa Classe Pessoa")
public class PessoaTest extends Base {

	private static Logger log = LoggerFactory.getLogger(PessoaTest.class);
	private static PessoaService pessoaService = new PessoaService();
	private static List<Pessoa> pessoas = new ArrayList<>();
	

	@DisplayName("Cadastra pessoa")
	@Test
	public void testeCadastraPessoa() {
		log.info("Testa cadastro pessoa");
		Pessoa pessoa = new Pessoa("Alex", 27, "Masculino");
		Pessoa pessoa1 = new Pessoa("Alguém", 29, "Feminino");
		
		pessoas.add(pessoa);
		pessoas.add(pessoa1);
		
		pessoaService.adicionaNovaPessoa(pessoa);
		pessoaService.adicionaNovaPessoa(pessoa1);
		
		assertEquals(pessoaService.buscarTodos(), pessoas);
	}
	
	@DisplayName("Remover pessoa")
	@Test
	public void testeRemoverPessoa() {
		log.info("Testa remover pessoa");
		
		
		pessoaService.remove(pessoaService.buscarTodos().get(0));
		
		assertEquals(pessoaService.buscarTodos(), pessoaService.buscarTodos());
		
	}
	
}
