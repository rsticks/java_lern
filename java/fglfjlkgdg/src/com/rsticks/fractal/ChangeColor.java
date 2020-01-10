package com.rsticks.fractal;

public class ChangeColor {
	private int r;
	private int g;
	private int b;

	public void setR(int r) {
		this.r = r;
	}

	public void setG(int g) {
		this.g = g;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getR() {
		return r;
	}

	public int getG() {
		return g;
	}

	public int getB() {
		return b;
	}

	public  ChangeColor(int r, int g, int b)
	{
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public	ChangeColor(double t)
	{
		int r = 16;
		int g = 8;
		int b = 0;

		this.r = (int)(8.5 * Math.pow((1 - t), 3) * t * 255);
		this.g = (int)(15 * Math.pow((1 - t), 2) * Math.pow(t, 2) * 255);
		this.b = (int)(9 * (1 - t) * Math.pow(t, 3) * 255);
	}
}
