package com.thunisoft.day04.demo03;

import java.util.Scanner;

/**
 * 键盘输入三个数，然后求出最大值
 */
public class DemoScannerMax {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int max=0;
        for (int i=0;i<3;i++){
            int num=scanner.nextInt();
            if(max<num){
                max=num;
            }

        }
        System.out.println(max);
        }


}
