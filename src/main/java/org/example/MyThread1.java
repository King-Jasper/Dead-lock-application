package org.example;

public class MyThread1 implements Runnable{

private Object lock1;
private Object lock2;

    public MyThread1(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        synchronized (lock1){
            System.out.println(Thread.currentThread().getName()+"locked resource1");
        synchronized (lock2){
            System.out.println(Thread.currentThread().getName()+"locked resource2");
        g    try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        }

    }
}
