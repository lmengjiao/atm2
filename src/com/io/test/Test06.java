package com.io.test;

import java.io.File;

/*
 * 获取并输出当前目录下所有文件的名字
 */
public class Test06 {
    public static void main(String[] args) {
        //指定路径
        File file = new File("E:\\idea\\atm");
        //获取该目录下的所有文件
        File[] files = file.listFiles();
        //遍历循环
        for (File file1 : files) {
            //判断是否是文件
            if(file1.isFile()){
                //输出名字
                System.out.println(file1.getName());
            }

        }
    }
}
