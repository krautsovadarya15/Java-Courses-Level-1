package com.courses.Lesson_5_functions;
/* 1. Написать функцию, которая принимает два целочисленных параметра и
*     возвращает наибольший из них.
*  2. Написать функцию, которая два целочисленных параметра и
*     возвращает значение, возведенное в куб.
*/
 public class Task_5_1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int result = getMaxValue(a, b);
        System.out.println(result);
        int result2 = getCube(a,b);
        System.out.println(result2);
    }
    public static int getMaxValue(int first, int second) {
        if(first > second){
            return first;
        } else
            return second;
    }
    public static int getCube(int third, int fourth) {
        return (int) Math.pow(third, fourth);
    }

}
