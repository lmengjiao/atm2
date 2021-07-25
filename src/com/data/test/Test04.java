package com.data.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test04 {
    //输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)
    //然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
    public static void main(String[] args) throws ParseException {
        //设置格式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品的日期");
        String a=sc.nextLine();
        System.out.println("请输入商品的保质期");
        int b=sc.nextInt();
        //String转换为Date
        Date ri=sdf.parse(a);
        //新建一个日历
        Calendar c=Calendar.getInstance();
        //把时间放进去
        c.setTime(ri);
        //计算过期日
        c.add(Calendar.DAY_OF_YEAR,b);
        //计算过期日的前两周
        c.add(Calendar.DAY_OF_YEAR,-14);
        //计算过期日前两周的周三
        c.set(Calendar.DAY_OF_WEEK,4);
        //得到这个时间
        ri=c.getTime();
        //设置指定格式
        a=sdf.format(ri);
        System.out.println("促销日为 " + ri);
    }
 
}
