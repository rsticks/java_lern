package com.rsticks;

public class LeapYearCount
{
    public static int leapYearCount(int year)
    {
        int count;

        count = 0;
        while (year != 0)
        {
            if (((0 == year % 4) && (0 != year % 100)) || (0 == year % 400))
                count++;
            year--;
        }
        return (count);
    }
}
