package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = reader.readLine();
        String y = reader.readLine();
        String z = reader.readLine();
        String t = reader.readLine();
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int c = Integer.parseInt(z);
        int d = Integer.parseInt(t);

        int temp, temp2, max;
        temp = max_number(a, b);
        temp2 = max_number(c, d);
        System.out.println(max_number(temp, temp2));
    }

    public static int max_number(int a, int b)
    {
        if (a > b)
            return a;
        else
            return b;
    }
}
