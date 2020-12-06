package com.core.multithreading.producer_consumer;

public class QueueUnderflowException extends RuntimeException {

	private static final long serialVersionUID = -6445240631634901644L;

	public QueueUnderflowException(String message) {
		super(message);
	}
}
