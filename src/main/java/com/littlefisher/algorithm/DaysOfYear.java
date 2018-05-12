package com.littlefisher.algorithm;

import java.util.Calendar;
import java.util.Date;

/**
 * 题目：输入某年某月某日，判断这一天是这一年的第几天？
 * 
 * @author jinyn22648
 * @version $$Id: DaysOfYear.java, v 0.1 2018/5/7 下午7:48 jinyn22648 Exp $$
 */
public class DaysOfYear {

    public void daysOfYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int days = 0;
        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 是否闰年
        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        if (isLeapYear) {
            arr[1] = 29;
        }
        for (int i = 0; i < month - 1; i++) {
            days += arr[i];
        }
        days += day;
        System.out.println("天数为：" + days);
    }

    public static void main(String[] args) {
        new DaysOfYear().daysOfYear(new Date());
    }

}
