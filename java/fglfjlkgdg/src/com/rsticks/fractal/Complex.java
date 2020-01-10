package com.rsticks.fractal;

public class Complex {
	private double im;
	private double re;

	public Complex(double im, double re)
	{
		this.im = im;
		this.re = re;
	}

	public void setIm(double im) {
		this.im = im;
	}

	public void setRe(double re) {
		this.re = re;
	}

	public double getIm() {
		return im;
	}

	public double getRe() {
		return re;
	}
}
