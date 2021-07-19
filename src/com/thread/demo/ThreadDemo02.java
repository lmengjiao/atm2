package com.thread.demo;
/*
创建线程的第二种方式 不用继承 用实现
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        Runnable xicai=new xicai();
        Runnable shaoshui=new shaoshui();
        Thread t1 = new Thread(xicai);
        Thread t2 = new Thread(shaoshui);
        t1.start();
        t2.start();
    }
}
class xicai implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("洗菜" + i);
        }
    }
}

class shaoshui implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("烧水" + i);
        }
    }
}
