package com.string.test;
/*
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 */
public class Test02 {
    public static void main(String[] args) {
        String str="大家好！";
        String a=str.replaceAll("大家好！","大家好！我是程序员！");
        System.out.println("a = " + a);
        String b=a.replaceAll("大家好！我是程序员！","大家好!我是优秀的程序员!");
        System.out.println("b = " + b);
        String c=b.replaceAll("大家好!我是优秀的程序员!","大家好!我是牛牛的程序员!");
        System.out.println("c = " + c);
        String d=c.replaceAll("大家好!我是牛牛的程序员!","我是牛牛的程序员!");
        System.out.println("d = " + d);
    }
}
