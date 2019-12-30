package com.rsticks;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

import java.security.MessageDigest;


public class Main {

    public static void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();

        if (x < toX) {
            while (robot.getDirection() != Direction.RIGHT)
                robot.turnLeft();
            while (x < toX) {
                robot.stepForward();
                x = robot.getX();
            }
        } else if (x > toX) {
            while (robot.getDirection() != Direction.LEFT)
                robot.turnLeft();
            while (x > toX) {
                robot.stepForward();
                x = robot.getX();
            }
        }
        if (y < toY)
        {
            while (robot.getDirection() != Direction.UP)
                robot.turnLeft();
            while (y < toY) {
                robot.stepForward();
                y = robot.getY();
            }
        } else if (y > toY)
        {
            while (robot.getDirection() != Direction.DOWN)
                robot.turnLeft();
            while (y > toY) {
                robot.stepForward();
                y = robot.getY();
            }
        }
    }

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

