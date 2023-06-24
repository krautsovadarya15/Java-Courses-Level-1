package com.courses.Lesson_5_functions;

public class Task_5_2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int result2 = getCube(a,b);
        System.out.println(result2);
    }
    public static int getCube(int third, int fourth) {
        return (int) Math.pow(third, fourth);
    }
}
