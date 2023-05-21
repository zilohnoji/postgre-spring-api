package com.donatoordep.poshibernate.exceptions;

public class ResourceNotFound extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFound(String error) {
		super(error);
	}
}
