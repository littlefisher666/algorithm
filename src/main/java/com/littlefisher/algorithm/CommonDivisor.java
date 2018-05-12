package com.littlefisher.algorithm;

/**
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 
 * 程序分析：利用辗除法。
 * 
 * @author jinyn22648
 * @version $$Id: CommonDivisor.java, v 0.1 2018/5/6 下午4:17 jinyn22648 Exp $$
 */
public class CommonDivisor {

    /**
     * 辗除法
     * 
     * @param a 正整数
     * @param b 正整数
     */
    public void gcd(Integer a, Integer b) {
        int first = a;
        int second = b;
        System.out.println("a=" + a + ";b=" + b);
        int temp;

        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println("最大公约数为" + a);
        System.out.println("最小公倍数为" + first * second / a);
    }

    /**
     * while循环用法
     *
     * @param a 正整数
     * @param b 正整数
     */
    public void commonDivisor(Integer a, Integer b) {
        int k = a > b ? b : a;
        while (k > 1) {
            if (a % k == 0 && b % k == 0) {
                break;
            }
            k--;
        }
        System.out.println("最大公约数为" + k);
        System.out.println("最小公倍数为" + a * b / k);

    }

    public static void main(String[] args) {
        CommonDivisor commonDivisor = new CommonDivisor();
        // 碾除法
        commonDivisor.gcd(60, 400);
        // while循环
        commonDivisor.commonDivisor(60, 400);
    }
}
