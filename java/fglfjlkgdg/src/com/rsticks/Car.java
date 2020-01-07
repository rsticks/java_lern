package com.rsticks;

import java.util.Collection;

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

	public int getMaxSpeed() {
		return maxSpeed;
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

class Toyota  extends Car{

	public Toyota(int maxSpeed, int seed, String num) {
		super(maxSpeed, seed, num);
	}

	public void getDrive()
	{
		System.out.println("Gooooo!1! speed: " + super.getMaxSpeed() + "!!!");
	}
}
