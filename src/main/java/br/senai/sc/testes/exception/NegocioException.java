package br.senai.sc.testes.exception;

public class NegocioException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NegocioException() {
		super();
	}
	
	public NegocioException(final String erro) {
		super(erro);
	}
	
}
