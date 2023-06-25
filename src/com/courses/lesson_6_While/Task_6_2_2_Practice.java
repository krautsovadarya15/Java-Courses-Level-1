package com.courses.lesson_6_While;

import java.util.Scanner;

/*
Посчитать сумму чисел введенного числа
*/
public class Task_6_2_2_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int result = getSum(number);
        System.out.println(result);

        int result2 = getSum2(number);
        System.out.println(result2);

    }
    public static int getSum(int number){
    int value = 0;
    for (int currentValue = number; currentValue != 0; currentValue/=10){
        value += currentValue % 10;
    }
    return value;
    }

    public static int getSum2(int number){
        int value = 0;
        int currentValue = number;
        while(currentValue != 0){
            value += currentValue % 10;
            currentValue/=10;
        }
        return value;
    }
}
