package com.courses.lesson_6_While;
/*
 В 1626 году индейцы продали Манхеттен за 24 дол.
 Написать программу, которая высчитывает сумму,
 получившуюся бы в текущем году, если бы индейцы
 положили эти деньги в банк под 5% годовых.
 */
public class Task_6_2_3_Practice {
    public static void main(String[] args) {
        int Year = 2023-2020;
        int sum = 24;
        double result = getSum(Year, sum);
        System.out.println(result);
    }
    public static double getSum (int Year, int sum){
//        int year = Year;
        double SUM = sum;
        double percent = 0;
//        double result = 0;
        for(int i = 1; i <= Year; i++){
            percent = SUM * 5 / 100;
            SUM += percent;
//            result = SUM;
        }
        return SUM;
    }
}
