package com.courses.lesson_6_While;

import java.util.Scanner;

/*
Написать программу, высчитывающую факториал введенного целого числа.
 */
public class Task_6_2_1Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
//        int result = getFactorial(value);
        int result = getFactWhile(value);
        System.out.println(result);
    }
        public static int getFactWhile (int f) {
            int value = 1;
            int i = 1;
            while (i <= f) {
                value *= i;
                i++;
            }
            return value;
        }
//    public static int getFactorial(int f){
//        int value2 = 1;
//        for (int i = 1; i <= f; i++) {
//            value2 *= i;
//        }
//        return value2;
//    }
}
