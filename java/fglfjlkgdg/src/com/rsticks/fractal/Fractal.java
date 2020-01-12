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
