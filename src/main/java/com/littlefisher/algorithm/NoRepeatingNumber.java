package com.littlefisher.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？ 1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。
 *
 * @author jinyn22648
 * @version $$Id: NoRepeatingNumber.java, v 0.1 2018/5/6 下午9:04 jinyn22648 Exp $$
 */
public class NoRepeatingNumber {

    public void noRepeatingNumber(List<Integer> numbers) {
        Set<Integer> numberList = new HashSet<>();
        for (Integer a : numbers) {
            for (Integer b : numbers) {
                for (Integer c : numbers) {
                    String number = "" + a + b + c;

                    numberList.add(Integer.valueOf(number));
                }
            }
        }
        System.out.println(numberList);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(0);
        new NoRepeatingNumber().noRepeatingNumber(numbers);
    }
}
