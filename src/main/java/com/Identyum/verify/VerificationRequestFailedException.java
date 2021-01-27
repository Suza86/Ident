package com.Identyum.verify;


public class VerificationRequestFailedException extends Throwable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VerificationRequestFailedException() {
        this("Failed to verify request.");
    }

    public VerificationRequestFailedException(String message) {
        super(message);
    }

    public VerificationRequestFailedException(Throwable cause) {
        super(cause);
    }
}