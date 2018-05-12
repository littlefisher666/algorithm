package com.littlefisher.algorithm;

/**
 * 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * 
 * 程序分析：利用while语句,条件为输入的字符不为'\n'.
 * 
 * @author jinyn22648
 * @version $$Id: StrIdentify.java, v 0.1 2018/5/6 下午4:48 jinyn22648 Exp $$
 */
public class StrIdentify {

    public void strIdentify(String str) {
        int abcCount = 0;
        int spaceCount = 0;
        int numCount = 0;
        int otherCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                numCount++;
            } else if (Character.isSpaceChar(c)) {
                spaceCount++;
            } else if (Character.isLetter(c)) {
                abcCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("字母个数" + abcCount);
        System.out.println("数字个数" + numCount);
        System.out.println("空格个数" + spaceCount);
        System.out.println("其他字符个数" + otherCount);
    }

    public static void main(String[] args) {
        new StrIdentify().strIdentify("alk jf;oa9 uwr02 34 u02ifl sdjf;a o9u3 2 3 ");
    }

}
