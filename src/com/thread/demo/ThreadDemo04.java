package com.thread.demo;

import java.util.Random;

/*
线程的打断 针对sleep
拆炸弹
 */
public class ThreadDemo04 {
    //炸弹的倒计时
    public static int time=4;
    //炸弹的密码
    public static int password=new Random().nextInt(100);
    public static boolean boom=true;
    public static void main(String[] args) {
        System.out.println("炸弹的密码是" + password);
        //第一个线程 炸弹的倒计时 如果完成倒计时就爆炸
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("定时炸弹已安装");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while(time>=0){
                    try {
                        if(time==0){
                            System.out.println("炸弹爆炸");
                            boom=false;
                            break;
                        }
                        time--;
                        System.out.println("time = " + time);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        if(e.getMessage().equals("sleep interrupted")){
                            System.out.println("success ");
                            break;
                        }

                    }
                }
            }
        });
        //第二个线程 打断线程的倒计时 如果打断就不爆炸
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //拆炸弹 因为是模拟 所以用打断的方式，打断线程的boomthread
                System.out.println("开始破解炸弹密码");
                while(boom){
                    if(password==new Random().nextInt(100)){
                        t1.interrupt(); //线程的打断
                        break;
                    }
                }
            }
        });
        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
