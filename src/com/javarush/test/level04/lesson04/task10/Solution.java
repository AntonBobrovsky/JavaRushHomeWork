package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
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

        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int c = Integer.parseInt(z);

        if ((a == b) && (a == c))
            System.out.println(x +' '+ y + ' ' + z);
        else if(a == b)
            System.out.println(x +' '+ y);
        else if(a == c)
            System.out.println(x +' '+ z);
        else if(c == b)
            System.out.println(z +' '+ y);

    }
}