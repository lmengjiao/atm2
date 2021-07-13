package com.string.test;

public class Test01 {
    public static void main(String[] args) {
        String str="HelloWorld";
        test01(str);
        test02(str);
        test03(str);
        test04(str);
        test05(str);
        test06();
        test07(str);
        test08(str);
        test09(str);
    }

    // 9:将"HelloWorld"分别转换为全大写和全小写并输出。
    private static void test09(String str) {
        String a=str.toUpperCase();
        System.out.println("a = " + a);
        String b=str.toLowerCase();
        System.out.println("b = " + b);
    }

    //8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
    private static void test08(String str) {
        boolean a=str.startsWith("h");
        System.out.println("a = " + a);
        boolean b=str.endsWith("ld");
        System.out.println("b = " + b);
    }

    //7:输出"HelloWorld"中第6个字符"W"
    private static void test07(String str) {
        char a=str.charAt(5);
        System.out.println("a = " + a);
    }

    //:将字符串"  Hello   "中两边的空白去除后输出
    private static void test06() {
        String str="   hello   ";
        String a=str.trim();
        System.out.println("a = " + a);
    }

    //5:截取"HelloWorld"中的"World"并输出
    private static void test05(String str) {
        String a=str.substring(5);
        System.out.println("a = " + a);
    }

    //4.截取"HelloWorld"中的"Hello"并输出
    private static void test04(String str) {
        String a=str.substring(0,5);
        System.out.println("a = " + a);
    }

    //3.输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
    private static void test03(String str) {
        int a=str.indexOf("o",5);
        System.out.println("a = " + a);
    }

    //2.输出"HelloWorld"中"o"的位置
    private static void test02(String str) {
        int a=str.indexOf("o");
        System.out.println("a = " + a);
    }

    //1:输出字符串"HelloWorld"的字符串长度
    private static void test01(String str) {
        int length=str.length();
        System.out.println("length = " + length);
    }
}
