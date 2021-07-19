package com.thread.demo;
/*
线程
创建现成的第一种方式 缺点直接继承Thread 浪费一次继承的机会
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        //创建线程
        Thread t1 = new HotWater(); //烧水
        Thread t2 = new CleanCai(); //洗菜
        t1.start();
        t2.start();
        //像这样 做一会烧水 做一会洗菜 叫做异步 没有先后顺序之分
        //如果是 把烧水全部完成 在做洗菜 叫做同步 同步是有先后顺序的
    }
}

//如果只是一个 new Thread 他只是一个线程，线程中没有方法（任务） 没意义
//需要自己创建一个线程 继承他的任务（方法）
//线程中最有意义的就是run()方法
class HotWater extends Thread{
    //重要的方法
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("烧了" + i +"瓶水");
        }
    }
}
class CleanCai extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("洗了" + i + "颗菜");
        }
    }
}
