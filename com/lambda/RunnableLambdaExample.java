package com.lambda;


class RunnableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable called...................");
    }
}



public class RunnableLambdaExample {
    public static void main(String[] args) {
       // RunnableImpl runnable = new RunnableImpl();
        Thread thread = new Thread(new RunnableImpl());
        thread.start();

        Runnable runnable =  () -> System.out.println("Runnable Start called.......................");
        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread th = new Thread(() -> System.out.println("Runnable Lambada called..................."));
        th.start();


    }
}
