package com.littlefisher.algorithm;

/**
 * 题目：企业发放的奖金根据利润提成。 利润(I)低于或等于10万元时，奖金可提10%； 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，
 * 高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%； 40万到60万之间时高于40万元的部分，可提成3%； 60万到100万之间时，高于60万元的部分，可提成1.5%，
 * 高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
 * 
 * @author jinyn22648
 * @version $$Id: MoneyAward.java, v 0.1 2018/5/7 下午6:57 jinyn22648 Exp $$
 */
public class MoneyAward {

    public void moneyAward(long money) {
        double rate1 = 0.1;
        double rate2 = 0.075;
        double rate3 = 0.05;
        double rate4 = 0.03;
        double rate5 = 0.014;
        double rate6 = 0.01;
        long reward = 0;
        if (money >= 0 && money <= 100000) {
            reward = (long)(money * rate1);
        } else if (money <= 200000) {
            reward = (long)(100000 * rate1 + (money - 100000) * rate2);
        } else if (money <= 400000) {
            reward = (long)(100000 * rate1 + 100000 * rate2 + (money - 200000) * rate3);
        } else if (money <= 600000) {
            reward = (long)(10000 * rate1 + 100000 * rate2 + 200000 * rate3 + (money - 400000) * rate4);
        } else if (money <= 1000000) {
            reward
                = (long)(10000 * rate1 + 100000 * rate2 + 200000 * rate3 + 200000 * rate4 + (money - 6000000) * rate5);
        } else {
            reward = (long)(10000 * rate1 + 100000 * rate2 + 200000 * rate3 + 200000 * rate4 + 400000 * rate5
                + (money - 1000000) * rate6);
        }
        System.out.println("奖金为：" + reward);
    }

    public static void main(String[] args) {
        new MoneyAward().moneyAward(800000);
    }
}
