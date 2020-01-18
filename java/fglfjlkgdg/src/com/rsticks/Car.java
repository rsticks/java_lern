package com.rsticks;

import org.w3c.dom.ls.LSOutput;

import java.util.Collection;

public class Car implements Cloneable{
	private int     maxSpeed;
	private int     seed;
	private String  number;

	public Car(int maxSpeed, int seed, String num)
	{
		this.maxSpeed = maxSpeed;
		this.seed = seed;
		this.number = num;
	}

	@Override
	protected Car clone() throws CloneNotSupportedException {
		return (Car) super.clone();
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

	public Toyota(int maxSpeed, int seed, String num){
		super(maxSpeed, seed, num);
	}

	public void getDrive()
	{
		System.out.println("Gooooo!1! speed: " + super.getMaxSpeed() + "!!!");
	}
}
