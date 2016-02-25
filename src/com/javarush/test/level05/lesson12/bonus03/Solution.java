package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int maximum = ;
        int N = Integer.parseInt(reader.readLine());
        if (N <= 0)
            return;

        ArrayList mas = new ArrayList(N);

        for (int i = 0; i < N; i++)
        {
            int N_ = Integer.parseInt(reader.readLine());
            mas.add(i, N_);
//            System.out.println(mas.get(i));
        }

        Collections.sort(mas);
        System.out.println(mas.get(mas.size() - 1));
    }
}
