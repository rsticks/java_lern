package com.rsticks.fractal;

import java.awt.*;

public class Main {

	public static void main(String[] args) {
		Complex z;
		FractalData data;
		Fractal fr = new Fractal("Fractal");
		fr.setVisible(true);
		fr.setResizable(true);
		Graphics g = fr.getGraphics();

		data = new FractalData(fr.getWidth(), fr.getHeight(), -2.0, -2.0, 2.0);

		PixelComponent pix = new PixelComponent();
		System.out.println("Thread active count: " + Thread.activeCount());
		ThreadsFract threadsFract = new ThreadsFract(data);
		ThreadsFract threadsFract1 = new ThreadsFract(data);
		ThreadsFract threadsFract2 = new ThreadsFract(data);
		ThreadsFract threadsFract3 = new ThreadsFract(data);

		threadsFract.start();
		threadsFract1.start();
		threadsFract2.start();
		threadsFract3.start();
//		pix.paintComponent(g);
//		for (int i = 0; i < 100; i++)
//		{
//			pix.drawPixel(g, 100, i, new Color(255,255,255));
//		}

		//pix.setColor(new Color(243, 255, 246));

//
		int y;
		int x;
		int iteration = 0;
		int max_iteration = 50;
		double t;
		ChangeColor changeColor;

		min = new Complex(-2.0, -2.0);
		max = new Complex(min.getIm() + (2.0 - min.getRe()) * height / width, 2.0);

		factor = new Complex((max.getIm() - min.getIm()) / (height - 1), (max.getRe() - min.getRe()) / (width - 1));

		x = 0;
		y = 0;
		c = new Complex(max.getIm() - y * factor.getIm(), min.getRe() + x * factor.getRe());
		while (y < height)
		{
			c.setIm(max.getIm() - y * factor.getIm());
			x = 0;
			while (x < width)
			{
				c.setRe(min.getRe() + x * factor.getRe());
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
