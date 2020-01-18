package com.rsticks.multiThreading;

import com.rsticks.multiThreading.ThrTest;

public class MultithreadingDemo {
	public static void main(String[] args) {
		ThrTest one = new ThrTest("One thread");
		ThrTest two = new ThrTest("two thread");
		one.start();
		System.out.println("===============================================================================");
		two.start();

	}
}
