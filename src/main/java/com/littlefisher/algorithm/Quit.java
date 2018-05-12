package com.littlefisher.algorithm;

/**
 * 题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
 * 
 * @author jinyn22648
 * @version $$Id: Quit.java, v 0.1 2018/5/7 下午9:01 jinyn22648 Exp $$
 */
public class Quit {

    private static final Integer OUT = 1;

    private static final Integer IN = 0;

    public void quit(Integer num) {
        int[] arr = new int[num];
        int i = 0;
        int t = 0;
        while (num > 1) {
            if (arr[i] == 0) {
                t++;
                if (t == 3) {
                    t = 0;
                    arr[i] = OUT;
                    num--;
                }
            }
            i++;
            if (i == arr.length) {
                i = 0;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == IN) {
                System.out.println(j + 1);
            }
        }
    }

    public static void main(String[] args) {
        new Quit().quit(100);
    }

}
