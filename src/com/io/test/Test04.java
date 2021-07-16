package com.io.test;

import java.io.File;

/*
 * 获取并输出当前目录下的所有文件和目录的名字
 */
public class Test04 {
    public static void main(String[] args) {
        //指定路径
        File file = new File("E:\\idea\\atm");
        //获取该目录下的所有文件
        File[] files = file.listFiles();
        //遍历循环
        for (File file1 : files) {
            //判断是否是目录 是就输出名字
            if(file1.isDirectory()){
                System.out.println(file1.getName());
            }
            //判断是否是文件 是就输出名字
            if(file1.isFile()){
                System.out.println(file.getName());
            }
        }
    }
}
