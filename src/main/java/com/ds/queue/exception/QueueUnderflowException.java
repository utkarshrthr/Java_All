package com.ds.queue.exception;

public class QueueUnderflowException extends RuntimeException {

    public QueueUnderflowException(String message){
        super(message);
    }

    public QueueUnderflowException(){

    }
}
