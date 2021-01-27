package com.Identyum.verify;


public class VerificationNotFoundException extends Throwable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VerificationNotFoundException() {
        this("Failed to find verification.");
    }

    public VerificationNotFoundException(String message) {
        super(message);
    }
}