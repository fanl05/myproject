package com.vip.juc;

/**
 * @author Ryland
 */
public class DeadLockTest {

    /**
     * cmd: jps
     * cmd: jstack xxx
     */
    public static void main(String[] args) {

        Object o1 = new Object();
        Object o2 = new Object();

        new Thread(() -> {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + " get o1");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + " get o2");
                }
            }
        },"t1").start();

        new Thread(() -> {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + " get o2");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + " get o1");
                }
            }
        },"t2").start();

    }

}
