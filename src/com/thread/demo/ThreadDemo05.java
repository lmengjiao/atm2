package com.thread.demo;
/*
线程的打断
王一博爱喝奶茶 100杯
肖战打断王一博
 */
public class ThreadDemo05 {
    public static void main(String[] args) {
        Thread wang = new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while (true) {
                    try {
                        System.out.println("喝奶茶" + i);
                        i++;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            if(e.getMessage().equals("sleep interrupted"))
                                System.out.println("肖战阻止王一博吃包子");
                            break;
                        }

                    } catch (Exception e) {
                        e.printStackTrace();

                    }
                }
            }
        });
        wang.start();
        Thread xiao = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    wang.interrupt(); //打断王一博
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        xiao.start();
    }
}
