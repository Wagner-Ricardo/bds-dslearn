package com.devsuperior.dslearnbds.services.exceptions;

public class ForbiddenException extends RuntimeException {

	/**
	 * Essa classe será utilizada para retornar o erro 403
	 * por que o perfil não é autorizado a ter o recurso
	 * mesmo que esteja locado.
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ForbiddenException(String msg) {
		super(msg);
		
	}
	
	
	

}
