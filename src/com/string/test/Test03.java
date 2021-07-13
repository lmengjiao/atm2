package com.string.test;

public class Test03 {
    public static void main(String[] args) {
        /*
         * 编写一个回文字符串，然后调用check方法检查
         * 该字符串是否为回文，然后输出检查结果。
         * 若是回文则输出:是回文
         * 否则输出:不是回文
         */
        String str="12321";
        check(str);
    }

    private static boolean check(String str) {
        char a=str.charAt(0);
        char b=str.charAt(1);
        char c=str.charAt(2);
        char d=str.charAt(3);
        char e=str.charAt(4);
        if(a==e&&b==d){
            System.out.println(str+"是一个回文数");
            return true;
        }else{
            System.out.println(str+"不是一个回文数");
            return false;
        }
    }
}
