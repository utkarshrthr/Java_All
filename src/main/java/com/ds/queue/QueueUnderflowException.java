package com.ds.queue;

public class QueueUnderflowException extends RuntimeException {

    public QueueUnderflowException(String message){
        super(message);
    }

    public QueueUnderflowException(){

    }
}
