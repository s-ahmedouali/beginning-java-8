package com.funcoding.java8;

/**
 * Created by s.ahmedouali on 15/10/2015.
 */
public class RunnableLambda {

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello  from [" + Thread.currentThread().getName() + "]");
            }
        };

        Thread t1 = new Thread(r);
        t1.start();

        Runnable rLambda = () -> System.out.println("Hello  from [" + Thread.currentThread().getName() + "]");
        Thread t2 = new Thread(rLambda);
        t2.start();

    }
}
