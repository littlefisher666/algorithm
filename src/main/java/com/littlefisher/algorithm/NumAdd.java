package com.littlefisher.algorithm;

/**
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)
 * 
 * 程序分析：关键是计算出每一项的值
 * 
 * @author jinyn22648
 * @version $$Id: NumAdd.java, v 0.1 2018/5/6 下午4:56 jinyn22648 Exp $$
 */
public class NumAdd {

    public void numAdd(Integer num, Integer count) {
        int result = 0;
        for (int i = count; i > 0; i--) {
            result += i * num * Math.pow(10, (count - i));
        }
        System.out.println("result=" + result);
    }

    public static void main(String[] args) {
        new NumAdd().numAdd(4, 4);
    }
}
