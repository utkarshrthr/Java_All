package com.ds.queue.primitive;

import com.ds.queue.exception.QueueOverflowException;
import com.ds.queue.exception.QueueUnderflowException;

import java.util.Stack;

public class QueueUsingStack {

    private final Stack<Integer> pushStack;
    private final Stack<Integer> pullStack;
    private int maxSize = 1000;
    private int size = 0;

    public QueueUsingStack(int size) {
        this.maxSize = size;
        this.pushStack = new Stack<>();
        this.pullStack = new Stack<>();
    }

    public QueueUsingStack() {
        this.pushStack = new Stack<>();
        this.pullStack = new Stack<>();
    }

    public void enqueue(int val){
        if(size == maxSize)
            throw new QueueOverflowException("Queue is full");
        pushStack.push(val);
        size++;
    }

    public int dequeue(){
        if(size == 0)
            throw new QueueUnderflowException("Queue is empty");
        if(pullStack.isEmpty()){
            while (!pushStack.isEmpty()){
                pullStack.push(pushStack.pop());
            }
        }
        size--;
        return pullStack.pop();
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
