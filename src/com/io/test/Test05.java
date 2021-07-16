package com.io.test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * 要求用户输入一个文件或目录名，并删除当前目录下的该文件或目录。
 * 可自行手动先在当前项目目录中创建一个要删除的文件或目录，若是目录，还可以
 * 在该目录中继续创建若干级目录和文件
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入你的文件名");
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        //将输入的路径传进去
        File file = new File(a);
        //判断是否存在
        boolean exists = file.exists();
        if(exists){
            //存在就删除
            boolean delete = file.delete();
            System.out.println("删除成功");
        }else{
            System.out.println("没有这个目录");
            //不存在就创建
            boolean newFile = file.createNewFile();
            System.out.println(" 创建成功" + newFile);
        }
    }
}
