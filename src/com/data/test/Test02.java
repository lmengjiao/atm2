package com.data.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
    //将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
    public static void main(String[] args) {
        Date date=new Date();
        String p="yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf=new SimpleDateFormat(p);
        String c=sdf.format(date);
        System.out.println("c = " + c);
    }
}
