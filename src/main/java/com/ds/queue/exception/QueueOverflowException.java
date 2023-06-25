package com.ds.queue.exception;

public class QueueOverflowException  extends RuntimeException {

    public QueueOverflowException(String message){
        super(message);
    }

    public QueueOverflowException(){

    }
}
