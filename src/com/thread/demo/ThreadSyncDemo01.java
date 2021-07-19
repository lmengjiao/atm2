package com.thread.demo;
/*
线程并发 多个线程同时操作一个资源诞生的安全问题
比如多个账户抢票
多线程的安全问题 需要加锁
synchronized锁 将原本各干各的多线程（异步）变为按顺序执行（同步）
缺点是因为有序，需要等待方法中的程序走完才能进行下一个线程，所以效率不高。
在不同位置起到不同效果
 */
public class ThreadSyncDemo01 {
    public static void main(String[] args) {
        Tickets t = new Tickets();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                //模拟黄牛1取票
                while(true){
                    int ticket = t.getTicket();
                    Thread.yield(); //线程的切换
                    System.out.println(getName() + "线程"+ticket);
                }
            }
        };
    }


    Tickets t = new Tickets();
    Thread t2 = new Thread(){
        @Override
        public void run() {
            //模拟黄牛2取票
            while(true){
                int ticket = t.getTicket();
                Thread.yield(); //线程的切换
                System.out.println(getName() + "线程"+ticket);
            }
        }
    };

}

class Tickets{
    private int ticket=20;

    public int getTicket() {
        if(ticket==0){
            System.out.println("票没有了");
            throw new RuntimeException("票没有了");
        }
        Thread.yield(); //线程的切换
        return ticket--;
    }
}