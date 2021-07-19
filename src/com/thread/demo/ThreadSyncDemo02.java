package com.thread.demo;

/*
synchronized锁：尽量锁在范围小的位置上 范围越小，效率越高
锁在方法上会造成锁的浪费（方法中有多个线程是可以共同使用的）
应该锁在关键位置
 */
public class ThreadSyncDemo02 {
    public static void main(String[] args) {
        Shop shop = new Shop();
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
        Thread t2 = new Thread(){
            @Override
            public void run() {
                try {
                    shop.buy();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
        t2.start();
    }
}
class Shop{
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
}
