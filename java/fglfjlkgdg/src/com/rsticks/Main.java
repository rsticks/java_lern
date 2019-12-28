package com.rsticks;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

import java.security.MessageDigest;


public class Main {

    public static void main(@NotNull String[] args)
    {
        String str;
        int[] a1 = {0, 2, 4};
        int[] a2 = {0, 2, 3, 3, 4, 6};

        str = 'A' + '1' + "2";
        Test.isPalindrome("Madam, I'm Adam!");
        int[] arr = Test.mergeArrays(a1, a2);
        System.out.println(Arrays.toString(arr));
//        System.out.println(Test.factorial(3));
    }
}

