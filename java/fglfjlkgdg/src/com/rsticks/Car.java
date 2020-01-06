package com.rsticks;

public class Car{
	private int     maxSpeed;
	private int     seed;
	String          number;

	public Car(int maxSpeed, int seed, String num)
	{
		this.maxSpeed = maxSpeed;
		this.seed = seed;
		this.number = num;
	}

	@Override
	public String toString()
	{
		return "Car info:" +
				"\nMax Sped:" + maxSpeed +
				"\nseeds:" + seed +
				"\nnumber:" + number;
	}
}
