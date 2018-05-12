package com.littlefisher.algorithm;

/**
 * 题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 * 
 * @author jinyn22648
 * @version $$Id: PalindromeNumber.java, v 0.1 2018/5/12 下午3:39 jinyn22648 Exp $$
 */
public class PalindromeNumber {

    public void palindromeNumber(Integer number) {
        char[] chars = number.toString().toCharArray();
        int i = 0;
        for (; i <= chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                break;
            }
        }
        if (i == chars.length / 2 + 1) {
            System.out.println(number + "是回文数");
        } else {
            System.out.println(number + "不是回文数");
        }
    }

    public static void main(String[] args) {
        new PalindromeNumber().palindromeNumber(12344321);
    }

}
