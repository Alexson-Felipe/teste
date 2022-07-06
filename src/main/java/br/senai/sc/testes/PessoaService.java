package br.senai.sc.testes;

import java.util.ArrayList;
import java.util.List;

public class PessoaService {

	private static List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	
	public void adicionaNovaPessoa(Pessoa pessoa) {
		listaPessoas.add(pessoa);
	}
	
	public void adicionarTodos(List<Pessoa> pessoas) {
		listaPessoas.addAll(pessoas);
	}
	
	public void remove(Pessoa pessoa) {
		listaPessoas.remove(pessoa);
	}
	
	public void remover(List<Pessoa> pessoas) {
		listaPessoas.removeAll(pessoas);
	}
	
	public List<Pessoa> buscarTodos() {
		return listaPessoas;
	}
	
}
