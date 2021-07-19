package com.thread.demo;
/*
互斥锁 两个线程不在同一个方法上
 */
public class ThreadSyncDemo04 {
    public static void main(String[] args) {
        Shop2 shop = new Shop2();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    shop.buy();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                try {
                    shop.buy2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
        t2.start();
    }
}
class Shop2 {
    //不加锁会同时选衣服试衣服
    //public synchronized void buy() throws InterruptedException {
    public void buy() throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "再选衣服");
        Thread.sleep(5000);
        synchronized (this) { //使用synchronized锁在关键位置
            System.out.println(thread.getName() + "进入试衣间试衣服");
            Thread.sleep(5000);
            System.out.println("试衣完毕");
        }
    }

    public void buy2() throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "在买冰淇淋");

    }
}