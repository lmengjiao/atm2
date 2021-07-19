package com.thread.demo;
/*
synchronized锁可以锁静态方法上
 */
public class ThreadSyncDemo03 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                Shop1.buy();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                Shop1.buy();
            }
        };
        t1.start();
        t2.start();
    }
}
class Shop1{
    public synchronized static void buy(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "选衣服");
        try {
            thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getName() + "试衣服");
        try {
            thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getName() + "试衣完毕");
    }
}
