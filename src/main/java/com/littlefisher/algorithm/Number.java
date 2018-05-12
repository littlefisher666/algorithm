package com.littlefisher.algorithm;

/**
 * 题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 * 
 * @author jinyn22648
 * @version $$Id: Number.java, v 0.1 2018/5/7 下午8:53 jinyn22648 Exp $$
 */
public class Number {

    public void number(Integer number) {
        String str = String.valueOf(number);
        System.out.println(str + "是" + str.length() + "位数");
        for (int i = str.length(); i > 0; i--) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        new Number().number(12345);
    }

}
