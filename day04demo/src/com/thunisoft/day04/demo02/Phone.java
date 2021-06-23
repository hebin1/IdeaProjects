package com.thunisoft.day04.demo02;

/**
 *定义一个类用于模拟“手机”实物
 * 属性：品牌 价格 颜色
 * 行为： 打电话   发短信
 * 成语变量   属性
 * 成员方法     行为
 * 何斌
 */
public class Phone {
    String brand ;//品牌
    String coclor; //颜色
    double price;  //价格
    public void call(String   who){
        System.out.println("给"+who+"打电话");
    }
    public void sendMassage(){
        System.out.println("群发短信 ");
    }

}
