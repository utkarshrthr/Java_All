package com.core.multithreading.concurrent;

import java.util.concurrent.*;

public class FutureExample {

    public static void main(String[] args) {
        ExecutorService service  = Executors.newFixedThreadPool(2);

        Future<String> future = service.submit(new Task());
        while (!future.isDone()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Waiting..");
        }
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        service.shutdown();
    }

    static class Task implements Callable<String> {

        @Override
        public String call() throws Exception {
            Thread.sleep(10000);
            return "Sample";
        }
    }
}
