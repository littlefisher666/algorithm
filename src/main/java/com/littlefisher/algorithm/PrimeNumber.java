package com.littlefisher.algorithm;

/**
 * 题目：求100之内的素数
 * 
 * @author jinyn22648
 * @version $$Id: PrimeNumber.java, v 0.1 2018/5/7 下午8:57 jinyn22648 Exp $$
 */
public class PrimeNumber {

    public void primeNumber(Integer max) {
        for (int i = 1; i <= max; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == i - 1) {
                    System.out.println(i + "是素数");
                }
            }
        }
    }

    public static void main(String[] args) {
        new PrimeNumber().primeNumber(100);
    }
}
