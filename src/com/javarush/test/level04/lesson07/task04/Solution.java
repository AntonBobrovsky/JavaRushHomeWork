package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int flgP = 0, flgM = 0;
        boolean q;

        for (int i = 0; i < 3; i++)
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String x = reader.readLine();
            int b = Integer.parseInt(x);

            if (isPlus(b))
                flgP++;
            else if (isMinus(b))
                flgM++;
        }
        System.out.println("количество отрицательных чисел: " + flgM);
        System.out.println("количество положительных чисел: " + flgP);
    }

    public static boolean isPlus(int a)
    {
        return (a >= 0);
    }

    public static boolean isMinus(int a)
    {
        return (a < 0);
    }
}
