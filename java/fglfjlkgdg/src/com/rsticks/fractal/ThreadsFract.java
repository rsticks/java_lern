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

	public ThreadsFract(FractalData data, int start, int end, PixelComponent p) {
		this.data = data;
		this.start = start;
		this.end = end;
		this.pix = p;
	}

	@Override
	public void run() {
		int iteration = 0;
		int max_iteration = 50;
		ChangeColor changeColor;

		while (start < end)
		{
			data.setImC(start);
			x = 0;
			while (x < data.getWidth())
			{
				data.setReC();
				z = new Complex(c.getRe(), c.getIm());
				iteration = 0;
				while (Math.pow(z.getRe(), 2.0) + Math.pow(z.getIm(), 2.0) <= 4 && iteration < max_iteration)
				{
					z = new Complex(Math.pow(z.getRe(), 2.0) - Math.pow(z.getIm(), 2.0) + c.getRe(),
							2.0 * z.getRe() * z.getIm() + c.getIm());
					iteration++;
				}
				t = (double)iteration / (double)max_iteration;
				changeColor = new ChangeColor(t);
				pix.drawPixel(g, x, y, new Color(changeColor.getR(), changeColor.getG(), changeColor.getB()));
				x++;
			}
			y++;
		}
	}
}
