package uwstout.cs144.projects.project3.collage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JComponent;

/**
 * Draws a circle
 * 
 * @author Hannah Schenk
 * @version 5.5.17
 *
 */
public class Circle extends JComponent implements Piece {
	private Point p;
	private Dimension d;
	private Color c;
	
	/**
	 * A constructor for the class
	 * 
	 * @param p1 The center point of the circle
	 * @param d1 The dimensions of the circle
	 * @param c1 The color of the circle
	 */
	public Circle(Point p1, Dimension d1, Color c1) {
		c = c1;
		d = d1;
		p = p1;
	}

	@Override
	public Point getPosition() {
		return p;
	}

	@Override
	public Dimension getSize() {
		return d;
	}

	@Override
	public Color getColor() {
		return c;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(c);
		g.fillOval(p.x, p.y, d.width, d.height);
	}
	

}
