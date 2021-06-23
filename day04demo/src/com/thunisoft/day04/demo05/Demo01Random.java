package com.thunisoft.day04.demo05;

import java.util.Random;

/**
 * Random用来生成随机数字
 */
public class Demo01Random {
    public static void main(String[] args) {
        Random random=new Random();//创建对象
        System.out.println(random.nextInt(99));
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(99));

        }

    }
}
