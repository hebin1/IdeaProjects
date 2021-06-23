package com.thunisoft.day04.demo03;


import java.util.Scanner;//1.导包

/**
 * 实现键盘输入
 * 1.导包
 * import 包路径   类名称
 * java.long包路径下的内容 不需要导包
 * 2.创建
 * 3.使用
 */
public class DemoScanner {
    public static void main(String[] args) {
        //System.in   代表从键盘输入
        Scanner scanner=new Scanner(System.in);//2.创建对象
        System.out.println(scanner.nextInt());
        System.out.println(scanner.next());
    }
}
