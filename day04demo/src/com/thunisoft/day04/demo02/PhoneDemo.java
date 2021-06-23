package com.thunisoft.day04.demo02;

public class PhoneDemo {
    public static void main(String[] args) {
         Phone one=new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.coclor);
        one.brand="苹果";
        one.price=8236.6;
        one.coclor="黑色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.coclor);
        one.call("张三");
        one.sendMassage();
    }
}
