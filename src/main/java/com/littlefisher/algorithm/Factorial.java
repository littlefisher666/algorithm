package com.littlefisher.algorithm;

/**
 * 利用递归方法求5!
 * 
 * @author jinyn22648
 * @version $$Id: Factorial.java, v 0.1 2018/5/7 下午8:41 jinyn22648 Exp $$
 */
public class Factorial {

    private int factorial(int number) {
        if (number > 0) {
            return factorial(number - 1) * number;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int sum = new Factorial().factorial(5);
        System.out.println("阶乘为: " + sum);
    }
}
