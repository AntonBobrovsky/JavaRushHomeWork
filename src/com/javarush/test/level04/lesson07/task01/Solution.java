package com.javarush.test.level04.lesson07.task01;

/* Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если,
«положительное четное число» - если  число равно 0число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = reader.readLine();
        int a = Integer.parseInt(x);

        if (func1(a))
            System.out.println("отрицательное четное число");
        else if (func2(a))
            System.out.println("отрицательное нечетное число");
        else if (func3(a))
            System.out.println("нулевое число");
        else if (func4(a))
            System.out.println("положительное четное число");
        else if (func5(a))
            System.out.println("положительное нечетное число");
    }

    public static boolean func1(int a)
    {
        return (a < 0 && a % 2 == 0);
    }

    public static boolean func2(int a)
    {
        return (a < 0 && a % 2 != 0);
    }

    public static boolean func3(int a)
    {
        return (a == 0);
    }

    public static boolean func4(int a)
    {
        return (a > 0 && a % 2 == 0);
    }

    public static boolean func5(int a)
    {
        return (a > 0 && a % 2 > 0);
    }
}
