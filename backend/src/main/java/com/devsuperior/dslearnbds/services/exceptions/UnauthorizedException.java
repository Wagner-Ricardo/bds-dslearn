package com.devsuperior.dslearnbds.services.exceptions;

public class UnauthorizedException extends RuntimeException {

	/**
	 * Essa classe será utilizada para retorna o erro 401
	 * ou seja o token do usuario não foi permitada ou reconhecida
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnauthorizedException(String msg) {
		super(msg);
		
	}
	
	
	

}
