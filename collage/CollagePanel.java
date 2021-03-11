package uwstout.cs144.projects.project3.collage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Creates a panel for shapes to be painted on
 * 
 * @author Hannah Schenk
 * @version 5.5.17
 *
 */
public class CollagePanel extends JPanel implements PieceList {
	private int pieceCount = 0;
	private int arraySize = 0;
	private Piece[] pieceArray = new Piece[arraySize];
	
	/**
	 * A constructor for the class
	 */
	public CollagePanel() {
		
		JPanel collagePanel = new JPanel();
		collagePanel.setBackground(Color.white);
		collagePanel.setPreferredSize(new Dimension(800, 800));
	}
	
	/**
	 * Paints the pieces in the array
	 * @param g The Graphics object
	 */
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    for (int i = 0; i < pieceCount; i++) {
	    	Piece p = getPiece(i);
	    	p.draw(g);
	    }
	    
	}
	
	@Override
	public int getPieceCount() {
		return pieceCount;
	}
	
	@Override
	public Piece getPiece(int pos) {
		Piece p = pieceArray[pos];
		return p;
	}
		
	@Override
	public void addPiece(Piece newPiece) {
		if (pieceCount == arraySize) {
			arraySize++;
			Piece[] newPieceArray = new Piece[arraySize];
			for (int i = 0; i < pieceCount; i++) {
				newPieceArray[i] = pieceArray[i];
			}
			pieceArray = newPieceArray;
		}
		pieceArray[pieceCount] = newPiece;
		pieceCount++;
		repaint();
	}

	@Override
	public void removeAllPieces() {
		pieceCount = 0;
		arraySize = 0;
		repaint();
	}
	
	
	

}
