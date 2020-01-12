package com.rsticks.fractal;

import java.awt.*;

public class Main {
	public static void main(String[] args) {
		int width;
		int height;
		Complex complex;
		Complex min;
		Complex max;
		Complex factor;
		Complex c;
		Complex z;

		Fractal fr = new Fractal("Fractal");
		fr.setVisible(true);
		fr.setResizable(true);
		//fr.setSize(1000,1000);
		Graphics g = fr.getGraphics();

		width = fr.getWidth();
		height = fr.getHeight();
		System.out.println(Integer.toString(width) + " " + Integer.toString(height));

		PixelComponent pix = new PixelComponent();
//		pix.paintComponent(g);
//		for (int i = 0; i < 100; i++)
//		{
//			pix.drawPixel(g, 100, i, new Color(255,255,255));
//		}

		//pix.setColor(new Color(243, 255, 246));


		int y;
		int x;
		int iteration = 0;
		int max_iteration = 50;
		double t;
		ChangeColor changeColor;

		min = new Complex(-4.0, -2.0);
		max = new Complex(min.getIm() + (4.0 - min.getRe()) * height / width, 4.0);
//		max.re = 2.0;
//		max.im = min.im + (max.re - min.re) * HEIGHT / WIDTH;

		factor = new Complex((max.getIm() - min.getIm()) / (height - 1), (max.getRe() - min.getRe()) / (width - 1));

//		factor = init_complex(
//				(max.re - min.re) / (WIDTH - 1),
//				(max.im - min.im) / (HEIGHT - 1));


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
				//c.re = min.re + x * factor.re;
				z = new Complex(c.getRe(), c.getIm());
				//z = init_complex(c.re, c.im);
				iteration = 0;
				// pow(z.re, 2.0) + pow(z.im, 2.0) <= 4 && iter < max_iter
				while (Math.pow(z.getRe(), 2.0) + Math.pow(z.getIm(), 2.0) <= 4 && iteration < max_iteration)
				{
					z = new Complex(Math.pow(z.getRe(), 2.0) - Math.pow(z.getIm(), 2.0) + c.getRe(),
							2.0 * z.getRe() * z.getIm() + c.getIm());
//					z = init_complex((pow(z.re, 2.0) - pow(z.im, 2.0)) + c.re, 2.0 * z.re * z.im + c.im);
					iteration++;
				}
				t = (double)iteration / (double)max_iteration;
//				if (t != 0)
//					System.out.println("не ноль");
				changeColor = new ChangeColor(t);
				pix.drawPixel(g, x, y, new Color(changeColor.getR(), changeColor.getG(), changeColor.getB()));
				// Установка цвета точки
				x++;
			}
			y++;
		}

	}
}
