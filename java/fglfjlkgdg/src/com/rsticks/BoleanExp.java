package com.rsticks;

public class BoleanExp
{
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d)
    {
        int count;

        count = 0;
        if (a == true)
            count++;
        if (b == true)
            count++;
        if (c == true)
            count++;
        if (d == true)
            count++;
        if (count == 2)
            return (true);
        else
            return (false);
    }
}
