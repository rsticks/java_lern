package com.rsticks.fractal;

import java.awt.*;

public class ThreadsFract extends Thread {
	private Thread thr;
	private String nameThr;
	private FractalData data;
	private int start;
	private int end;
	private int x;
	private PixelComponent pix;
	private Graphics g;
	private ChangeColor changeColor;

	public ThreadsFract(FractalData data, int start, int end, PixelComponent p, Graphics g) {
		this.data = data;
		this.start = start;
		this.end = end;
		this.pix = p;
		this.g = g;
	}

	@Override
	public void run() {
		int iteration = 0;
		int max_iteration = 50;
		//ChangeColor changeColor;
		double t;

		while (start < end)
		{
			data.setImC(start);
			x = 0;
			while (x < data.getWidth())
			{
				data.setReC(x);
				data.newComplZ();
				iteration = 0;
				while (Math.pow(data.getZ().getRe(), 2.0) + Math.pow(data.getZ().getIm(), 2.0) <= 4 && iteration < max_iteration)
				{
					data.complexZ();
					iteration++;
				}
				t = (double)iteration / (double)max_iteration;
				changeColor = new ChangeColor(t);
				mmm();
				//pix.drawPixel(x, start, new Color(changeColor.getR(), changeColor.getG(), changeColor.getB()));
				x++;
			}
			start++;
		}
	}

	private synchronized void mmm() {
		pix.drawPixel(x, start, new Color(changeColor.getR(), changeColor.getG(), changeColor.getB()));
	}
}
