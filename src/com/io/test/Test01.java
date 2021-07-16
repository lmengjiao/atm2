package com.io.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2016-03-23 14:22:16
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //文件地址
        File file = new File("myfile.txt");
        //判断文件是否存在
        boolean exists = file.exists();
        if(exists){
            System.out.println("文件已存在");
        }else{
            System.out.println("文件不存在");
            //创建文件
            boolean newFile = file.createNewFile();
            System.out.println("文件创建成功" + newFile);
        }
        System.out.println("file = " + file);
        //得到文件的名字
        String name = file.getName();
        System.out.println("name = " + name);
        //得到文件的大小
        long length = file.length();
        System.out.println("length = " + length);
        //得到文件的最后修改时间
        long l = file.lastModified();
        //转换成Date类型
        Date time=new Date(l);
        //指定日期格式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:MM:ss");
        String time1=sdf.format(time);
        System.out.println("time1 = " + time1);
    }
}