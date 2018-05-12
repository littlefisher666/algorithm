package com.littlefisher.algorithm;

/**
 * 题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。问第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个人多大？
 * 
 * @author jinyn22648
 * @version $$Id: Age.java, v 0.1 2018/5/7 下午8:48 jinyn22648 Exp $$
 */
public class Age {

    private int age(Integer count) {
        if (count > 1) {
            return age(count - 1) + 2;
        } else {
            return 10;
        }
    }

    public static void main(String[] args) {
        int age = new Age().age(5);
        System.out.println("年龄为: " + age);
    }
}
