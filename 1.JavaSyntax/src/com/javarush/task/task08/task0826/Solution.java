package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Пять победителей

Пять победителей
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Вывести пять наибольших чисел.
Каждое значение с новой строки.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }



    public static void sort(int[] array) {
        //напишите тут ваш код
        int tmp;
        boolean sorted = false;

        while (!sorted) {//пока проверка по всем эллементам массива не будет возвращать упорядоченно
            //сортировка
            try {
                /*
                Как переместить меньший элемент массива на место большего или наоборот
                Используя пузырьковую сортировку
                 */

                for (int j = 0; j < array.length-1 ; j++) {
                    if (array[j] < array.length-1)
                      for (int i = 0; i < array.length - 1; i++) {
                            if (array[i] < array[i + 1]) {
                                tmp = array[i];
                                array[i] = array[i + 1];
                                array[i + 1] = tmp;
                            }
                        }
                }
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("IndexOutOfBoundsException");
                sorted = true;
            }
        }
        return;

    }
}
