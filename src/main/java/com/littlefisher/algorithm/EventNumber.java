package com.littlefisher.algorithm;

/**
 * 题目：一个偶数总能表示为两个素数之和。
 * 
 * @author jinyn22648
 * @version $$Id: EventNumber.java, v 0.1 2018/5/12 下午3:10 jinyn22648 Exp $$
 */
public class EventNumber {

    public void eventNumber(Integer number) {
        if (number <= 0 || number % 2 != 0) {
            System.out.println("不是非零偶数");
        }

        for (int i = 1; i <= number / 2; i++) {
            if (checkIsPrimeNumber(i) && checkIsPrimeNumber(number - i)) {
                System.out.println(number + "是" + i + "和" + (number - i) + "这2个素数之和");
            }
        }
    }

    private boolean checkIsPrimeNumber(Integer number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new EventNumber().eventNumber(200);
    }
}
