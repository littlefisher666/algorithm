package com.littlefisher.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
 * 
 * @author jinyn22648
 * @version $$Id: Compare.java, v 0.1 2018/5/7 下午7:56 jinyn22648 Exp $$
 */
public class Compare {

    public void compare(List<Integer> numberList) {
        int minNum;
        for (int i = 0; i < numberList.size(); i++) {
            minNum = numberList.get(i);
            int currentIndex = i;
            for (int j = i + 1; j < numberList.size(); j++) {
                if (numberList.get(j) < minNum) {
                    currentIndex = j;
                }
            }
            swap(numberList, i, currentIndex);
        }
        System.out.println(numberList);
    }

    private void swap(List<Integer> numberList, int i, int j) {
        int temp = numberList.get(i);
        numberList.set(i, numberList.get(j));
        numberList.set(j, temp);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int item : arr) {
            list.add(item);
        }
        new Compare().compare(list);
    }

}
