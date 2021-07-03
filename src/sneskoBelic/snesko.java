package sneskoBelic;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class snesko extends Canvas{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JFrame frame = new JFrame("proba");
		  Canvas canvas = new snesko();
		  frame.add(canvas);
		  frame.pack();
		  frame.setSize(400, 400);
		  frame.setVisible(true);
	}
	
	public void paint(Graphics g) {
		final int MID = 170;
		final int TOP = 50;
		
		setBackground(Color.pink);
		
		g.setColor(Color.white);
		g.fillOval(MID-20, TOP, 40, 40);
		g.fillOval(MID-35, TOP+38, 70, 70);
		g.fillOval(MID-50, TOP+105, 100, 80);
		
		g.setColor(Color.black);
		g.fillOval(MID-10, TOP+15, 5, 5);
		g.fillOval(MID+5, TOP+15, 5, 5);
		g.fillOval(MID-5, TOP+50, 10, 10);
		g.fillOval(MID-5, TOP+80, 10, 10);
		g.fillOval(MID-5, TOP+120, 10, 10);
		
		g.drawLine(MID+25, TOP+60, MID+90, TOP+35);
		g.drawLine(MID+50, TOP+50, MID+70, TOP+20);
		g.drawLine(MID+50, TOP+50, MID+280-190, TOP+60);
		
		g.drawLine(MID-20, TOP+5, MID+20, TOP+5);
		g.fillRect(MID-15, TOP-35, 30,40);
		
		g.drawLine(20,20,30,30);
		g.drawLine(15,35,30,20);
		
		g.drawLine(40,40,50,50);
		g.drawLine(40,50,50,30);
		
		g.setColor(Color.orange);
		int a [] = {165, 175, 160};
		int b [] = {70, 80,70};
		g.fillPolygon (a, b, 3);
		
		
		
		
	}

}
