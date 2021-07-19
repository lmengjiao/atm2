package com.thread.demo;
/*
线程中的阻塞
河南电信 -3000张电话卡

 */
public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            //Thread.sleep(2000);
            System.out.println("访问" + i);
        }
    //main就是一个线程 是一个主线程
        //拿到当前的线程
        Thread thread = Thread.currentThread();
        //线程的名字
        String name = thread.getName();
        System.out.println("name = " + name);
        //线程的id
        long id = thread.getId();
        System.out.println("id = " + id);
        //是否守护线程  例如王者中保存视频
        boolean daemon = thread.isDaemon();
        System.out.println("daemon = " + daemon);
        //线程的优先级（不准确 默认是5）
        int priority = thread.getPriority();
        System.out.println("priority = " + priority);
        //线程是否活着
        boolean alive = thread.isAlive();
        System.out.println("alive = " + alive);
    }
}
