package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int mas[] = new int[3];

        for (int i = 0; i != 3; ++i)
        {
            String x = reader.readLine();
            int a = Integer.parseInt(x);
            mas[i] = a;
        }

        if (mas[0] == mas[1])
            System.out.println(3);
        else if (mas[1] == mas[2])
            System.out.println(1);
        else if (mas[0] == mas[2])
            System.out.println(2);
    }
}
