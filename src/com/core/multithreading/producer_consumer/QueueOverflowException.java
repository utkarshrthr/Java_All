package com.core.multithreading.producer_consumer;

public class QueueOverflowException extends RuntimeException {
	
	private static final long serialVersionUID = -6445240631634901644L;

	public QueueOverflowException(String message) {
		super(message);
	}
}
