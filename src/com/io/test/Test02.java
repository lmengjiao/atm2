package com.io.test;

import java.io.File;
import java.util.Scanner;

/*
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println("请输入你的文件名");
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        File file = new File(a);
        String name = file.getName();
        boolean exists = file.exists();
        if (exists) {
            System.out.println("该文件已存在，将创建副本");
            String COPY_NAME = "-副本";
            String newName;
            //判断名称长度是否大于3
            if (name.length() >= COPY_NAME.length() + 1) {
                //判断名称后几位是否为“-副本”
                newName = name.substring(name.length() - 4, name.length() - 1);
                if (COPY_NAME.equals(newName)) {
                    //尾数加1
                    Integer num = Integer.parseInt(name.substring(name.length() - 1, name.length())) + 1;
                    newName = name.substring(0, name.length() - COPY_NAME.length() - 1) + COPY_NAME + num;
                } else {
                    // 直接拼接
                    newName = name + COPY_NAME + "1";
                }
            } else {
                // 直接拼接
                newName = name + COPY_NAME + "1";
            }
            // 判断新生成的文件名 是否已存在
            int count = 0;
            //检测方法;
            //如果已存在，递归调用
        }
    }

}





