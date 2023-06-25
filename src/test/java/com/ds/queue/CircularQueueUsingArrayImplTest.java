package com.ds.queue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CircularQueueUsingArrayImplTest {

    @Test
    public void emptyQueueTest(){
        CircularQueueUsingArray circularQueue = new CircularQueueUsingArray(6);
        Assertions.assertEquals("[]", circularQueue.toString());
    }

    @Test
    public void queueEnqueueTest(){
        CircularQueueUsingArray circularQueue = new CircularQueueUsingArray(6);
        circularQueue.enqueue(1);
        Assertions.assertEquals(1, circularQueue.size());
        Assertions.assertFalse(circularQueue.isEmpty());
    }

    @Test
    public void queueDequeueTest(){
        CircularQueueUsingArray circularQueue = new CircularQueueUsingArray(6);
        int[] input = {7, 2, 5, 3, 0, 8, 4, 0, 9, 0, 6};
        for(int inp: input){
            if(inp == 0){
                 circularQueue.dequeue();
            }
            else {
                circularQueue.enqueue(inp);
            }
        }
        Assertions.assertEquals(5, circularQueue.size());
        Assertions.assertFalse(circularQueue.isEmpty());
        Assertions.assertEquals("[3, 8, 4, 9, 6]", circularQueue.toString());
    }
}
