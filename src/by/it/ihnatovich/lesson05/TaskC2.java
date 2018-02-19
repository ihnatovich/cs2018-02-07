package by.it.ihnatovich.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    public static void sort(int[] array) {
        //Напишите тут ваш код
        int a, b, t;
        for(a=1; a < array.length; a++)
            for(b=array.length-1; b >= a; b--) {
                if(array[b-1] < array[b]) {
                    t = array[b-1];
                    array[b-1] = array[b];
                    array[b] = t;
                }
            }
    }

    //Напишите тут ваш код
    public static void main(String[] args) {
        int[] abc = new int[20];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            abc[i] = sc.nextInt();
        }
        for(int i=0; i < abc.length; i++) {
            System.out.print(abc[i]+"\n");
        }

        sort(abc);
        for(int i=0; i < abc.length; i++) {
            System.out.print(abc[i]+"\n");
        }
    }

}




