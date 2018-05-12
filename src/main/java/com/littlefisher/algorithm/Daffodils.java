package com.littlefisher.algorithm;

/**
 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 * 
 * 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 * 
 * 程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 * 
 * @author jinyn22648
 * @version $$Id: Daffodils.java, v 0.1 2018/5/6 下午3:41 jinyn22648 Exp $$
 */
public class Daffodils {

    /** 最小三位数 */
    private static final Integer THREE_DIGITS_MIN = 100;

    /** 最大三位数 */
    private static final Integer THREE_DIGITS_MAX = 999;

    public void getDaffodils() {
        // 个位数
        int singleDigit;
        // 十位数
        int tensDigit;
        // 百位数
        int hundredsDigit;
        // 各位数字立方和
        int data;
        for (int i = THREE_DIGITS_MIN; i <= THREE_DIGITS_MAX; i++) {
            hundredsDigit = i / 100;
            tensDigit = (i - 100 * hundredsDigit) / 10;
            singleDigit = i - 100 * hundredsDigit - 10 * tensDigit;
            data = singleDigit * singleDigit * singleDigit + tensDigit * tensDigit * tensDigit
                + hundredsDigit * hundredsDigit * hundredsDigit;
            if (data == i) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        new Daffodils().getDaffodils();
    }
}
