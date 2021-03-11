package uwstout.cs144.projects.project3.collage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Combines the CollagePanel and ButtonPanel into one panel
 * 
 * @author Hannah Schenk
 * @version 5.5.17
 *
 */
public class MainPanel extends JPanel {
	private static final Dimension SMALL = new Dimension(50, 50);
	private static final Dimension MEDIUM = new Dimension(100, 100);
	private static final Dimension LARGE = new Dimension(150, 150);
	
	private static final Dimension RECT_SMALL = new Dimension(50, 76);
	private static final Dimension RECT_MEDIUM = new Dimension(100, 150);
	private static final Dimension RECT_LARGE = new Dimension(150, 226);
	
	private Point p;
	private Color c;
	private Dimension d;
	
	private String size;
	private String shape;
	
	private ButtonPanel buttonPanel;
	private CollagePanel collagePanel;
	
	/**
	 * A constructor for the class
	 * 
	 * @param window A JFrame for the ButtonPanel constructor
	 */
	public MainPanel(JFrame window) {
		setLayout(new BorderLayout());
		 
		buttonPanel = new ButtonPanel(window);
		
		JButton clearButton = new JButton("Clear");
		
		buttonPanel.add(clearButton);
		clearButton.setAlignmentX(CENTER_ALIGNMENT);
		
		clearButton.addActionListener(new ClearListener());
		
		collagePanel = new CollagePanel();
		collagePanel.setBackground(Color.white);
		collagePanel.setPreferredSize(new Dimension(800, 800));
		
		add(buttonPanel, BorderLayout.EAST);
		add(collagePanel, BorderLayout.CENTER);
		
		addMouseListener(new PieceListener());
	}
	
	/**
	 * A listener for when the mouse is released
	 * 
	 * @author Hannah Schenk
	 * @version 5.5.17
	 *
	 */
	private class PieceListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			//not used
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			//not used
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			//not used
		}

		@Override
		public void mousePressed(MouseEvent e) {
			//not used
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			shape = buttonPanel.getSelectedShape();
			size = buttonPanel.getSelectedSize();
			
			Point point = e.getPoint();
			p = point;
			Piece piece = null;
			for (int i = 0; i < collagePanel.getPieceCount(); i++) {
				piece = collagePanel.getPiece(i);
			}
			
			System.out.println(collagePanel.getPieceCount() + " " + piece 
					+ " " + buttonPanel.getSelectedShape() 
					+ " " + buttonPanel.getSelectedSize());
			
			if (shape.equals("Circle")) {
				c = Color.red;
				if (size.equals("Small")) {
					d = SMALL;
					p.x = p.x - 25;
					p.y = p.y - 25;
				}
				if (size.equals("Medium")) {
					d = MEDIUM;
					p.x = p.x - 50;
					p.y = p.y - 50;

				}
				if (size.equals("Large")) {
					d = LARGE;
					p.x = p.x - 75;
					p.y = p.y - 75;

				}
				Circle circle = new Circle(p, d, c);
				collagePanel.addPiece(circle);
				
				
			}
			
			if (shape.equals("Square")) {
				c = Color.blue;
				if (size.equals("Small")) {
					d = SMALL;
					p.x = p.x - 25;
					p.y = p.y - 25;
				}
				if (size.equals("Medium")) {
					d = MEDIUM;
					p.x = p.x - 50;
					p.y = p.y - 50;

				}
				if (size.equals("Large")) {
					d = LARGE;
					p.x = p.x - 75;
					p.y = p.y - 75;

				}
				Square square = new Square(p, d, c);
				collagePanel.addPiece(square);
			}
			
			if (shape.equals("Rectangle")) {
				c = Color.yellow;
				if (size.equals("Small")) {
					d = RECT_SMALL;
					p.x = p.x - 25;
					p.y = p.y - 38;
				}
				if (size.equals("Medium")) {
					d = RECT_MEDIUM;
					p.x = p.x - 50;
					p.y = p.y - 75;

				}
				if (size.equals("Large")) {
					d = RECT_LARGE;
					p.x = p.x - 75;
					p.y = p.y - 113;

				}
				Rectangle rect = new Rectangle(p, d, c);
				collagePanel.addPiece(rect);
			}
			
		}
		
	}
	
	/**
	 * A listener for when the clear button is pressed
	 * 
	 * @author Hannah Schenk
	 * @version 5.5.17
	 *
	 */
	private class ClearListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			collagePanel.removeAllPieces();	
		}
	}

}
