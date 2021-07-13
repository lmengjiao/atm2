package com.string.test;

import java.util.Scanner;

public class Test04 {
    //要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
    public static void main(String[] args) {
        System.out.println("请输入你的email地址");
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String[] b=a.split("@");
        System.out.println(b[0]);
    }
}
