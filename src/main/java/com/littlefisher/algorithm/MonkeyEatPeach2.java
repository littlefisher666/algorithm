package com.littlefisher.algorithm;

/**
 * 题目：海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
 * 
 * @author jinyn22648
 * @version $$Id: MonkeyEatPeach.java, v 0.1 2018/5/7 下午8:09 jinyn22648 Exp $$
 */
public class MonkeyEatPeach2 {

    public void monkeyEatPeach(Integer minLastPeach, Integer numOfMonkey) {
        int sum = minLastPeach;
        for (int i = 1; i <= numOfMonkey; i++) {
            sum = sum * 5 + 1;
        }
        System.out.println("总数为：" + sum);
    }

    public static void main(String[] args) {
        new MonkeyEatPeach2().monkeyEatPeach(1, 5);
    }

}
