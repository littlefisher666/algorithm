package com.littlefisher.algorithm;

/**
 * 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 * 
 * @author jinyn22648
 * @version $$Id: FractionAdd.java, v 0.1 2018/5/7 下午8:15 jinyn22648 Exp $$
 */
public class FractionAdd {

    public void fractionAdd(Integer count) {
        int[] numberArr = new int[count + 1];
        numberArr[0] = 1;
        numberArr[1] = 2;
        numberArr[2] = 3;

        long sumNumerator = numberArr[1] * numberArr[1] + numberArr[2] * numberArr[0];
        long sumDenominator = numberArr[0] * numberArr[1];
        for (int i = 3; i <= count; i++) {
            numberArr[i] = numberArr[i - 1] + numberArr[i - 2];
            int currentNumerator = numberArr[i];
            int currentDenominator = numberArr[i - 1];
            System.out.println("当前分子为: " + currentNumerator + " 当前分母为: " + currentDenominator);
            sumNumerator = sumNumerator * currentDenominator + currentNumerator + sumDenominator;
            sumDenominator = sumDenominator * currentDenominator;
            System.out.println("总和的分子为: " + sumNumerator + " 当前总和分母为: " + sumDenominator);
            System.out.println("当前总和为: " + (sumNumerator / sumDenominator));
        }

    }

    public static void main(String[] args) {
        new FractionAdd().fractionAdd(10);
    }
}
