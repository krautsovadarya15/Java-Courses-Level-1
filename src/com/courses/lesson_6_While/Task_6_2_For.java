package com.courses.lesson_6_While;
/* Бесконечные циклы
    for (;;){
        }
    while (true){
        }
 */
public class Task_6_2_For {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        for (int i = 0; i < 10; i++) {
            if (i == 6){
//                break;
                continue;
            }
         System.out.println(i + "line");
        }
     System.out.println("Finish");
    }
}
