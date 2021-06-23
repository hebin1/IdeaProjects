package com.thunisoft.day04.demo04;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
/*        //普通使用方式
        Scanner scanner=new Scanner(System.in);
        int  num=scanner.nextInt();
        //匿名对象使用方式
        int nummber=new Scanner(System.in).nextInt();
        System.out.println(nummber);
         //一般传参方式
        methodParam(scanner);
        //匿名对象传参方式
        methodParam(new Scanner(System.in));*/
        Scanner sc=methodReturn();
        System.out.println(sc.next());
    }
    public static  void  methodParam(Scanner scanner){
        System.out.println(scanner.next());
    }
    public static Scanner methodReturn(){
        return  new Scanner(System.in);
    }
}
