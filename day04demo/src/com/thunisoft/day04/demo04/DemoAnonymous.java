package com.thunisoft.day04.demo04;

/**
 * 匿名对象只能使用一次，下次使用需要重新创建
 * 如果确定一个对象只需要使用一次的话 就可以创建匿名对象
 */
public class DemoAnonymous {
    public static void main(String[] args) {
         Person one=new Person();
         one.name="高圆圆";
        one.showName();
        System.out.println("================================");
        new Person().name="赵又廷";
        new Person().showName();
    }
}
