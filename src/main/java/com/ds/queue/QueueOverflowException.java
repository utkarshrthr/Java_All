package com.ds.queue;

public class QueueOverflowException  extends RuntimeException {

    public QueueOverflowException(String message){
        super(message);
    }

    public QueueOverflowException(){

    }
}
