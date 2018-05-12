package com.littlefisher.algorithm;

/**
 *
 * @author jinyn22648
 * @version $$Id: WanShu.java, v 0.1 2018/5/6 下午5:59 jinyn22648 Exp $$
 */
public class WanShu {

    public static void main(String[] args) {
        new WanShu().wanshu(10000);
    }

    public void wanshu(Integer max) {
        int k = 2;
        int num = 0;
        int temp = 1;
        int j = 0;
        for (num = 1; num <= max; num++) {
            k = 2;
            temp = 1;
            j = num;
            while (j >= k) {
                if (j % k == 0) {
                    temp += k;
                    j = j / k;
                } else {
                    k++;
                }
            }
            if (temp == num) {
                System.out.println(temp);
            }

        }
    }
}
