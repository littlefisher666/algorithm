package com.littlefisher.algorithm;

/**
 * 题目：求1+2!+3!+...+20!的和
 * 
 * @author jinyn22648
 * @version $$Id: FactorialSum.java, v 0.1 2018/5/7 下午8:35 jinyn22648 Exp $$
 */
public class FactorialSum {

    public void factorialSum(int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            int result = factorial(i);
            System.out.println("当前阶乘结果: " + result);
            sum += result;
        }
        System.out.println("总和为: " + sum);
    }

    private int factorial(int number) {
        int result = 1;
        while (number != 0) {
            result *= number;
            number--;
        }
        return result;
    }

    public static void main(String[] args) {
        new FactorialSum().factorialSum(10);
    }
}
