package com.courses.lesson_6_While;

import java.util.Scanner;

public class Task_6_2_4_Recoursion2 {
    public static void main(String[] args) {

        System.out.println(getNumber(8));
    }
    public static int getNumber(int n) {
        if (n == 3) {
            return 3;
        }
        return n * getNumber(n - 1);

    }
}
// 8 = 2520*8 = 20160
// 7 = 360*7 = 2520
// 6 = 60*6 = 360
// 5 = 12*5 = 60
// 4 = 3*4 = 12
// 3 = 3
