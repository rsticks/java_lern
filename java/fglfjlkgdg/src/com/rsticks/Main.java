package com.rsticks;

import org.jetbrains.annotations.NotNull;

import java.util.*;

import java.security.MessageDigest;


public class Main {

    public static void main(@NotNull String[] args)
    {
        Vector d = new Vector();
        BitSet f;
        d.add(1);
        d.add(2);
        d.add(3);
        d.set(1, 2);

        System.out.println(d.get(1));
        Car car = new Car(200, 2, "xep");
        System.out.println(car);
//        String str;
//        int[] a1 = {0, 2, 4};
//        int[] a2 = {0, 2, 3, 3, 4, 6};
//
//        Date time = new Date();
//        System.out.println(time.getTime());
//        Test.isPalindrome("xttx0");
//
//        int[] arr = Test.mergeArrays(a1, a2);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Test.factorial(3));
    }
}

