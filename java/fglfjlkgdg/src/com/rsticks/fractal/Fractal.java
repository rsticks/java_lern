package com.rsticks.fractal;

import javax.swing.*;
import java.awt.*;

public class Fractal extends JFrame {

	public Fractal(String name){
		super(name);
		this.setBounds(50,50, 1000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
//
//	@Override
//	public void paint(Graphics g) {
//			super.paint(g);
//			g.drawLine(1,1,500,500);
//	}

}

class PixelComponent extends JComponent
{
	private Color color;

	public PixelComponent(Color color)
	{
		super();
		this.color = color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public PixelComponent()
	{
		this(Color.BLACK);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		g.setColor(color);
		g.fillRect(0, 0, 500, 500);
	}
	public void drawPixel(Graphics g, int x, int y, Color color1)
	{
		super.paintComponent(g);

		g.setColor(color1);
		g.fillRect(x, y, 1, 1);
	}
}

class FractalData{
	private int width;
	private int height;

	private Complex min;
	private Complex max;

	private Complex factor;
	private Complex c;

	public FractalData(int width, int height, double min_re, double min_im, double max_re) {
		this.width = width;
		this.height = height;

		min = new Complex(min_im, min_re);
		max = new Complex(min.getIm() + (2.0 - min.getRe()) * height / width, max_re);
		factor = new Complex((max.getIm() - min.getIm()) / (height - 1), (max.getRe() - min.getRe()) / (width - 1));
		c = new Complex(max.getIm() - 0 * factor.getIm(), min.getRe() + 0 * factor.getRe());
	}

	public void setImC(int y)
	{
		c.setIm(max.getIm() - y * factor.getIm());
	}

	public void setReC(int x)
	{
		c.setRe(min.getRe() + x * factor.getRe());
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Complex getMin() {
		return min;
	}

	public Complex getMax() {
		return max;
	}

	public Complex getFactor() {
		return factor;
	}

	public void setFactor(Complex factor) {
		this.factor = factor;
	}

	public Complex getC() {
		return c;
	}

	public void setC(Complex c) {
		this.c = c;
	}
}