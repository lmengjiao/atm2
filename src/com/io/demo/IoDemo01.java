package com.io.demo;

import java.io.File;
import java.io.IOException;

/*
File文件 File文件你真行 可读可写可执行
 */
public class IoDemo01 {
    public static void main(String[] args) throws IOException {
        //创建一个file
        File file = new File("io02.txt"); //路径
        System.out.println("file = " + file);
        //得到file的名字
        String name = file.getName();
        System.out.println("name = " + name);
        //得到file的长度
        long length = file.length();
        System.out.println("length = " + length);
       /* try { //创建新文件
            *//*boolean newFile = file.createNewFile();
            System.out.println("newFile = " + newFile);*//*
        } catch (IOException e) {
            System.out.println("不能创建新文件");
            e.printStackTrace();
        }*/
        //查看文件是否存在 一定要有这个代码 否则文件会被覆盖
        boolean exists=file.exists();
        if(exists){
            System.out.println("文件已存在 " + exists);
        }else{
            System.out.println("文件不存在" + exists);
            boolean create=file.createNewFile();
            System.out.println("文件创建成功" + create);
        }
        //查看是否是文件
        boolean isFile=file.isFile();
        System.out.println("isFile = " + isFile);
        //是否是目录
        boolean directory = file.isDirectory();
        System.out.println("directory = " + directory);
        //是否是隐藏文件
        boolean hidden = file.isHidden();
        System.out.println("hidden = " + hidden);
    }   
}
