package com.data.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
        //设置格式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身份证号");
        String a=sc.nextLine();
        //判断长度
        if(a.length()==18){
            String year=a.substring(6,10);
            String month=a.substring(10,12);
            String day=a.substring(12,14);
            //出生年月日
            String h=year + "-" + month + "-" + day;
            System.out.println("出生日期:" + h);
            //20年后年月日
            Integer yearr=Integer.parseInt(year);
            int year2=yearr+20;
            String j=year2 + "-" + month + "-" + day;
            System.out.println("20岁生日:" + j);
            //20年后年月日转成date
            Date k=sdf.parse(j);
            //新建一个日历
            Calendar c=Calendar.getInstance();
            //设置时间
            c.setTime(k);
            //设置周三
            c.set(Calendar.DAY_OF_WEEK,4);
            //得到周三
            k=c.getTime();
            //date转string
            j=sdf.format(k);
            System.out.println("周三 " + j);
        }else{
            System.out.println("请输入正确的格式");
        }

    }
}
