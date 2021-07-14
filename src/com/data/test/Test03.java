package com.data.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test03 {
    //输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
    public static void main(String[] args) throws ParseException {
        //指定格式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("请输入你的生日 xxxx年-xx月-xx日");
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        //你的生日 String转为date
        Date birth=sdf.parse(a);
        //当前时间
        Date now=new Date();
        //当前时间-生日
        long day=(now.getTime()-birth.getTime());
        //转换成周
        long week=day/1000/60/60/24/7;
        System.out.println("你的生日到现在过了" + week + "周");
        
    }
}
