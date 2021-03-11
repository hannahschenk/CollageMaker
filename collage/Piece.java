package uwstout.cs144.projects.project3.collage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

/**
 * Contains methods for the different piece classes to implement
 * 
 * @author Hannah Schenk
 * @version 5.5.17
 *
 */
public interface Piece {
	
	/**
	 * A getter for the position of a piece
	 * @return The position of the piece
	 */
	Point getPosition();
	
	/**
	 * A getter for the dimensions of a piece
	 * @return The dimensions of the piece
	 */
	Dimension getSize();
	
	/**
	 * A getter for the color of a piece
	 * @return The color of the piece
	 */
	Color getColor();
	
	/**
	 * Draws the piece
	 * @param g The graphics object
	 */
	void draw(Graphics g);

}
