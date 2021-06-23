package com.thunisoft.day04.demo03;

import java.util.Scanner;

/**
 * 键盘输入两个int，并且求出和值
 * */
public class DemoScannerSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请分别输入两个数字，中间用回车分割；");
        int sum=sc.nextInt()+sc.nextInt();
        System.out.println("最终结果是："+sum);
    }
}
