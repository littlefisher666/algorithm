package com.littlefisher.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目：打印出杨辉三角形
 * 
 * @author jinyn22648
 * @version $$Id: YangHuiTriangle.java, v 0.1 2018/5/12 上午9:45 jinyn22648 Exp $$
 */
public class YangHuiTriangle {

    public void yangHuiTriangle(Integer line) {
        final Integer firstNumber = 1;
        Map<Integer, Integer[]> lineMap = new HashMap<>(line);
        Integer[] numberArr;
        for (int i = 1; i <= line; i++) {
            numberArr = new Integer[i];
            lineMap.put(i, numberArr);
            numberArr[0] = firstNumber;
            numberArr[i - 1] = firstNumber;
            if (numberArr.length == 1) {
                continue;
            }
            Integer[] lastNumberArr = lineMap.get(i - 1);
            for (int j = 1; j < lastNumberArr.length; j++) {
                Integer sum = lastNumberArr[j - 1] + lastNumberArr[j];
                numberArr[j] = sum;
            }
        }
        for (Integer lineNum : lineMap.keySet()) {
            if (lineMap.get(lineNum) != null) {
                for (Integer num : lineMap.get(lineNum)) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new YangHuiTriangle().yangHuiTriangle(10);
    }
}
