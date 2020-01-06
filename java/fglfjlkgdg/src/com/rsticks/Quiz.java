package com.rsticks;

import javax.swing.*;
import java.lang.reflect.Array;
import java.math.*;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Date;
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

class Test
{

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

    public static BigInteger factorial(int value)
    {
        BigInteger bi;
        if (value > 0)
            bi = BigInteger.valueOf(1);
        else
            bi = BigInteger.valueOf(0);
        BigInteger val = BigInteger.valueOf(value);
        while (value > 0)
        {
            bi = bi.multiply(val);
            value--;
            val = BigInteger.valueOf(value);
        }
        return bi;
    }

    public static int[] mergeArrays(int[] a1, int[] a2)
    {
        int[] arr;
        int size1 = a1.length;
        int size2 = a2.length;
        arr = new int[size1 + size2];
        int i = 0;
        int j = 0;

        while (size1 > i || size2 > j)
        {
            if (size1 != i && size2 != j) {
                if (a1[i] < a2[j]) {
                    arr[i + j] = a1[i];
                    i++;
                } else {
                    arr[i + j] = a2[j];
                    j++;
                }
            }
            else if (size1 == i){
                arr[i + j] = a2[j];
                j++;
            }
            else{
                arr[i + j] = a1[i];
                i++;
            }
        }
        return arr;
    }
}