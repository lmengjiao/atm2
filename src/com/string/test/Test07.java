package com.string.test;

import java.util.Scanner;

public class Test07 {
    // 作业: 写一个 private 方法, 需要 传一个 string 的 网址参数, 返回 处理后的数据.
    // 假定 大数据获取了 很多网址, 我想要 www -----  com 之间的内容
    // 有一下  几类网址
    // www.oracle.com  ---->  oracle
    // www.oracle.com.cn  ---->  oracle
    // www.java.oracle.com.cn  ---->  java.oracle
    // www.lol.game.qq.com.cn  ---->  lol.game.qq
    // www.game.mycom.com.cn  ---->  game.mycom
    // www.girl.mycom.com.cn  ---->  girl.mycom
    // www.computer.mycom.com.cn  ---->  computer.mycom
    public static void main(String[] args) {
        
        System.out.println(" www.oracle.com");
        System.out.println(" www.oracle.com.cn");
        System.out.println(" www.java.oracle.com.cn");
        System.out.println(" www.lol.game.qq.com.cn");
        System.out.println(" www.game.mycom.com.cn");
        System.out.println(" www.girl.mycom.com.cn");
        System.out.println(" www.locomputer.mycom.com.cn");
        System.out.println("请输入你的网址");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        sub(a);
        
    }

    private static void sub(String a) {
        int aa=a.indexOf("www.");
        int bb=a.indexOf(".com");
        String cc=a.substring(aa+4,bb);
        System.out.println("cc = " + cc);
    }


}
