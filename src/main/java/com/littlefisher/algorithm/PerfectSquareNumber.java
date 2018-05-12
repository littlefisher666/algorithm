package com.littlefisher.algorithm;

/**
 * 题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 * 
 * @author jinyn22648
 * @version $$Id: PerfectSquareNumber.java, v 0.1 2018/5/7 下午7:43 jinyn22648 Exp $$
 */
public class PerfectSquareNumber {

    public void perfectSquareNumber(int max) {

        for (int i = 0; i < max; i++) {
            if ((Math.sqrt(i + 100) % 1 == 0) && (Math.sqrt(i + 168) % 1 == 0)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        new PerfectSquareNumber().perfectSquareNumber(100000);
    }

}
