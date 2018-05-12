package com.littlefisher.algorithm;

/**
 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半； 再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 *
 * @author jinyn22648
 * @version $$Id: Ball.java, v 0.1 2018/5/6 下午8:48 jinyn22648 Exp $$
 */
public class Ball {

    public void ball(Double high, Integer count) {
        double currentHigh = high;
        double sum = high;
        for (int i = 2; i <= count; i++) {
            currentHigh = currentHigh * 0.5;
            sum += currentHigh * 2;
        }
        System.out.println("currentHigh=" + currentHigh);
        System.out.println("sum=" + sum);
    }

    public static void main(String[] args) {
        new Ball().ball(1000d, 2);
    }
}
