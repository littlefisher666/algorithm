package com.littlefisher.algorithm;

/**
 * 题目：输出9*9口诀。
 * 
 * @author jinyn22648
 * @version $$Id: Nine.java, v 0.1 2018/5/7 下午8:07 jinyn22648 Exp $$
 */
public class Nine {

    public void nine() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(j + "*" + i + "=" + j * i);
            }
        }
    }

    public static void main(String[] args) {
        new Nine().nine();
    }
}
