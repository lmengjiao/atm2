package com.atm.service;

import com.atm.demo.CustomerDemo;
import com.atm.entity.Customer;
import com.atm.util.TextUtil;

import java.util.List;
import java.util.Scanner;

public class CustomerService {

    //此类是完成顾客的所有业务
    private List<Customer> customerList;
    private Customer customernow;

    public void checkip(String id, String pwd) {
        CustomerDemo customerDemo = CustomerDemo.getInstance();
        customerList = customerDemo.getCustomerList();
        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        for (Customer customer : customerList) {
            if (customer.getId().equals(id) && customer.getPwd().equals(pwd)) {
                customernow = customer;
                System.out.println("欢迎" + customer.getName() + "登录，请注意您的安全");
                TextUtil.oneoption();
                Scanner scanner = new Scanner(System.in);
                String option = scanner.nextLine();
                yioption(option);
            }
        }
    }

    private void yioption(String option) {
        switch (option) {
            case "1":
                System.out.println("余额查询");
                doselectmoney();
                goonehome();
                break;
            case "2":
                System.out.println("取款");
                doqukuan();
                goonehome();
                break;
            case "3":
                System.out.println("转账");
                dozhuanzhang();
                goonehome();
                break;
            case "4":
                System.out.println("存款");
                docunkuan();
                goonehome();
                break;
            case "5":
                System.out.println("退卡");
                dotuika();
                break;


        }
    }

    //退卡
    private void dotuika() {
        System.out.println("您是否继续操作");
        System.out.println("请输入y或者n");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equalsIgnoreCase("y")) { //可以忽略大小写
            TextUtil.welcome();
        } else if (s.equalsIgnoreCase("n")) {
            System.out.println("退卡成功");
        }
    }


    //存款
    private void docunkuan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想存款的金额");
        System.out.println("1.100    2.200    3.其他");
        int cun = sc.nextInt();
        if (cun == 1) {
            double r = customernow.getMoney() + 100;
            System.out.println("您的账户余额是" + r);
            customernow.setMoney(r);
        } else if (cun == 2) {
            double r = customernow.getMoney() + 200;
            System.out.println("您的账户余额是" + r);
            customernow.setMoney(r);
        } else if (cun == 3) {
            System.out.println("请存入1000元及以上的整钱");
            double t = sc.nextDouble();
            if (t % 100 == 0) {
                if (t >= 1000) {
                    double r = customernow.getMoney() + t;
                    System.out.println("您的账户余额是" + r);
                    customernow.setMoney(r);
                } else {
                    System.out.println("您存入的钱小于1000");
                }
            } else {
                System.out.println("请存入整钱");
            }

    }else{
        System.out.println("请放入百元");
    }

}

        //转账
        private void dozhuanzhang() {
            System.out.println("请输入对方的卡号");
            Scanner sc = new Scanner(System.in);
            String oid=sc.nextLine();
            System.out.println("请输入转账的金额");
            Double m=sc.nextDouble();
            Double mymoney=customernow.getMoney()-m;//自己的钱-转账的钱
            Customer other=null;
            for (Customer customer : customerList) {
                if(customer.getId().equals(oid)){
                    other=customer;
                }
            }
            double otherMoney=other.getMoney()+m;//别人的钱+转账的钱
            customernow.setMoney(mymoney);//更新一下钱数
            other.setMoney(otherMoney);
        }

        //取款
        private void doqukuan() {
            System.out.println("请输入取款金额:");
            System.out.println("*****************************************");
            System.out.println("********请输入你想要的操作类型：*********");
            System.out.println("********1.100           2.200*********");
            System.out.println("********3.300           4.500*********");
            System.out.println("********5.800           6.1000*********");
            System.out.println("********7.2000          8.其他*********");
            System.out.println("*****************************************");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a > 0) {
                if(customernow.getMoney()>a){
                    if (a == 1) {
                        double m=customernow.getMoney();
                        m=m-100;
                        System.out.println("请及时拿走现金100元");
                        System.out.println("您的余额是" + m);
                        customernow.setMoney(m);
                    } else if (a == 2) {
                        double m=customernow.getMoney();
                        m=m-200;
                        System.out.println("请及时拿走现金200元");
                        System.out.println("您的余额是" + m);
                        customernow.setMoney(m);
                    } else if (a == 3) {
                        double m=customernow.getMoney();
                        m=m-300;
                        System.out.println("请及时拿走现金300元");
                        System.out.println("您的余额是" + m);
                        customernow.setMoney(m);
                    } else if (a == 4) {
                        double m=customernow.getMoney();
                        m=m-500;
                        System.out.println("请及时拿走现金500元");
                        System.out.println("您的余额是" + m);
                        customernow.setMoney(m);
                    } else if (a == 5) {
                        double m=customernow.getMoney();
                        m=m-800;
                        System.out.println("请及时拿走现金800元");
                        System.out.println("您的余额是" + m);
                        customernow.setMoney(m);
                    } else if (a == 6) {
                        double m=customernow.getMoney();
                        m=m-1000;
                        System.out.println("请及时拿走现金1000元");
                        System.out.println("您的余额是" + m);
                        customernow.setMoney(m);
                    } else if (a == 7) {
                        double m=customernow.getMoney();
                        m=m-2000;
                        System.out.println("请及时拿走现金2000元");
                        System.out.println("您的余额是" + m);
                        customernow.setMoney(m);
                    } else if (a == 8) {
                        System.out.println("请输入您的取款金额");
                        Double mm=sc.nextDouble();
                        double mmm=customernow.getMoney()-mm;
                        if(mm%100==0) {
                            System.out.println("请及时拿走现金" + mm + "元");
                            System.out.println("您的余额是" + mmm);
                            customernow.setMoney(mmm);
                        }else{
                            System.out.println("请取整百");
                        }
                    }
                }else{
                    System.out.println("您的余额不足");
                }
            }else{
                System.out.println("请输入正确的金额");
            }
        }

        //查询余额
        private void doselectmoney() {
            double money = customernow.getMoney();
            System.out.println("您的余额是" + money);

        }

        //回到一级菜单
        private void goonehome() {
            TextUtil.oneoption();
            Scanner sc=new Scanner(System.in);
            String option=sc.nextLine();
            System.out.println("op = " + option);
            yioption(option);
        }
    }


