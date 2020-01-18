package com.rsticks.multiThreading;

public class ThreadByExtendingDemo {

	public static void main(String[] args) {
		ThreadByExtending threadOne = new ThreadByExtending("Thread One");
		ThreadByExtending threadTwo = new ThreadByExtending("Thread Two");

		threadOne.start();
		threadTwo.start();
	}
}

class NewThread extends ThreadByExtending{
	Object f;
	Object d;
	int gg;
	int k;
	Integer r;


	public NewThread(String threadName) {
		super(threadName);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}