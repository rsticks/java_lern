package com.rsticks.multiThreading;


import javax.swing.text.Segment;
import java.util.function.UnaryOperator;

public class ThrTest implements Runnable{
	private Thread thr;
	private String nameThr;

	public ThrTest(String threadName) {
		this.nameThr = threadName;
		System.out.println("Thread " + threadName + " created successfully.");
	}

	@Override
	public void run() {

		System.out.println("Thread " + nameThr + " is running...");

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Thread " + nameThr + " " + i);
				Thread.sleep(100);
			}
		}catch (InterruptedException e){
			System.out.println("Thread " + nameThr + " interrupted.");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Leaving thread " + nameThr);
	}
	public void start(){
		System.out.println("Thread " + nameThr + " started successfully");
		if (thr == null)
		{
			thr = new Thread(this, nameThr);
			thr.start();
		}
	}
	public void setThrPriority(int priority)
	{
		thr.setPriority(priority);
	}
}
