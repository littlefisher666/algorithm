package com.littlefisher.algorithm;

/**
 * 题目：给你一个数组{0,1,2,3,....n}，其中有一个数字缺失，请把缺失的数字找出来
 * 
 * @author jinyn22648
 * @version $$Id: MissingNumber.java, v 0.1 2018/5/12 下午3:48 jinyn22648 Exp $$
 */
public class MissingNumber {

    public void missingNumber(int[] arr) {
        // 套用等差求和公式
        int sum = (arr[0] + arr[arr.length - 1]) * (arr.length + 1) / 2;
        // 遍历数组，得出的sum减去数组每一位元素，最后即是缺失的数字
        for (int value : arr) {
            sum = sum - value;
        }
        System.out.println("缺失的数字是：" + sum);
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 8, 9, 10};
        new MissingNumber().missingNumber(arr);
    }
}
