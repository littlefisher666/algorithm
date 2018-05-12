package com.littlefisher.algorithm;

/**
 * 兔子问题
 *
 * 斐波那契数列求值
 * 
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子， 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * 
 * 程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
 * 
 * @author jinyn22648
 * @version $$Id: Rabbit.java, v 0.1 2018/5/6 下午2:20 jinyn22648 Exp $$
 */
public class Rabbit {

    /**
     * for循环实现
     * 
     * @param month 月份
     */
    public void rabbit(Integer month) {
        Long f1 = 1L;
        Long f2 = 1L;
        Long f;
        for (Integer i = 3; i <= month; i++) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
            System.out.println("第" + i + "个月的兔子对数：" + f2);
        }
    }

    /**
     * 递归方法实现
     * 
     * @param month 月份
     */
    public int fib(int month) {
        // 第一个月
        final Integer monthOne = 1;
        // 第二个月
        final Integer monthTwo = 2;
        if (month == monthOne || month == monthTwo) {
            return 1;
        } else {
            return fib(month - 1) + fib(month - 2);
        }
    }

    public static void main(String[] args) {
        // 假设持续到第15个月
        final Integer month = 15;
        Rabbit rabbit = new Rabbit();
        // 第一种实现方式
        rabbit.rabbit(month);
        System.out.println("----------------我是分割线-----------------");
        // 第二种实现方式
        for (int i = 1; i <= month; i++) {
            System.out.println("第" + i + "个月的兔子对数：" + rabbit.fib(i));
        }
    }
}
