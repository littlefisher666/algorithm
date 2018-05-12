package com.littlefisher.algorithm;

import java.util.Arrays;

/**
 * 题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 * 
 * @author jinyn22648
 * @version $$Id: ExchangeNum.java, v 0.1 2018/5/12 下午3:22 jinyn22648 Exp $$
 */
public class ExchangeNum {

    public void exchangeNum(int[] arr) {
        int max = 0;
        int min = arr.length - 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] < arr[i]) {
                max = i;
            }
        }
        swap(arr, 0, max);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[arr.length - 1] > arr[i]) {
                min = i;
            }
        }
        swap(arr, arr.length - 1, min);
        Arrays.stream(arr).forEach(item -> System.out.print(item + " "));
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        new ExchangeNum().exchangeNum(arr);
    }
}
