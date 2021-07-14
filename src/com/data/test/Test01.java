package com.data.test;

import java.util.Date;

public class Test01 {
    //使用Date输出当前系统时间，以及3天后这一刻的时间
    public static void main(String[] args) {
        //当前系统时间
        Date date = new Date();
        System.out.println("date = " + date);
        //转换long值
        long time = date.getTime();
        //System.out.println("time = " + time);
        //三天后的时间
        time+=1000*60*60*24*3L;
        date.setTime(time);
        System.out.println("date = " + date);
    }
}
