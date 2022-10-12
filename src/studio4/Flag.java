package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color skyBlue = new Color(130, 181, 240);
		StdDraw.setPenColor(skyBlue);
		StdDraw.filledCircle(.5, .7, .2);
		
		Color newBlue = new Color(64, 142, 232);
		StdDraw.setPenColor(newBlue);
		StdDraw.filledCircle(.5, .25, .25);
		
		Color eyeColor = new Color(8, 8, 8);
		StdDraw.setPenColor(eyeColor);
		StdDraw.filledCircle(.45, .75, 0.02);
		StdDraw.filledCircle(.55, .75, 0.02);
		
		Color noseColor = new Color(233, 92, 75);
		StdDraw.setPenColor(noseColor);
		StdDraw.filledSquare(0.5,0.65,0.015);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5,0.5,0.2, 0.03);
		
		Color button = new Color(254, 254, 250);
		StdDraw.setPenColor(button);
		StdDraw.filledCircle(0.5,0.25,0.03);
		StdDraw.filledCircle(0.5,0.4,0.03);
		StdDraw.filledCircle(0.5,0.1,0.03);
		
		Color hat = new Color(176, 121, 57);
		StdDraw.setPenColor(hat);
		StdDraw.filledRectangle(0.5,0.8,0.25, 0.02);
		StdDraw.filledRectangle(0.5,0.9,0.15, 0.09);

		
	}
}