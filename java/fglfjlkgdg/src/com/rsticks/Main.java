package com.rsticks;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.*;

import java.security.MessageDigest;


public class Main{
    public static void main(@NotNull String[] args)
    {
        int [] array = new int[10];
        List list = new LinkedList();
        list.add("111");
        list.add(123);
        list.add("333");
        list.add("232134");
        list.add(2, "ppp");
        list.set(2, "f");

        System.out.println("size array: " + list.size());
        System.out.println("list content: " + list);
//        Toyota toyo = new Toyota(230, 3, "007");
//
//        toyo.getDrive();
//        System.out.println(toyo);
//        Car car = new Toyota(200, 2, "111");
//
//        System.out.println(car);
//        String str;
//        int[] a1 = {0, 2, 4};
//        int[] a2 = {0, 2, 3, 3, 4, 6};
//
//        Date time = new Date();
//        System.out.println(time.getTime());
        Test.isPalindrome("xttx0");
//
//        int[] arr = Test.mergeArrays(a1, a2);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Test.factorial(3));
    }
}

