package com.rsticks;

import java.lang.reflect.Array;
import java.math.*;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.abs;

public class Quiz
{

    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
    }

    public static boolean doubleExpression(double a, double b, double c)
    {
        double g;
        double p;

        p = 0.0001;
        g = a + b;
        if (Math.abs(g - c) > p)
            return (false);
        else
            return true;
    }

    public static int flipBit(int value, int bitIndex)
    {
        int bit;

        bit = (1 << (bitIndex - 1));
        if (bit == (value & bit))
            value ^= bit;
        else
            value |= bit;
        return value;
    }


    public static char charExpression(int a) {
        char b;

        b = ((char) ('\\' + a));
        return b;
    }

    public static boolean isPowerOfTwo(int value)
    {
        Integer val;

        value = Math.abs(value);
        val = value;
        value = val.bitCount(value);
        if (value == 1)
            return true;
        else
            return false;
    }

    public static void stringi()
    {
        String str;

        str = "A" + 12;
        System.out.println(str);
    }
}

class Test{

    public static boolean isPalindrome(String text) {
        StringBuilder bstr;
        Pattern patern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = patern.matcher(text);
        String str = matcher.replaceAll("");
        //str = str.toUpperCase();
        bstr = new StringBuilder(str);
        //bstr.reverse().toString();
        if (str.equalsIgnoreCase(bstr.reverse().toString()))
            return true;
        else
            return false;
    }
}