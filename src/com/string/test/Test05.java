package com.string.test;

import java.util.Random;
import java.util.Scanner;

public class Test05 {
    /* 随机生成一个5位的英文字母验证码(大小写混搭)
      然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
      然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
   */
    public static void main(String[] args) {
        String code = "";
        Random random = new Random();
        for(int i=0;i<5;i++){
            code+=random.nextInt(2)==0?(char)('A'+random.nextInt(26)):(char)('a'+random.nextInt(26));
        }
        System.out.println("验证码是" + code);
        System.out.println("请输入验证码");
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        if(a.equalsIgnoreCase(code)){
            System.out.println("验证成功");
        }else{
            System.out.println("验证失败");
        }
    }
}
