package uwstout.cs144.projects.project3.collage;

/**
 * Contains methods for the CollagePanel class to implement
 * 
 * @author Hannah Schenk
 * @version 5.5.17
 *
 */
public interface PieceList {
	
	/**
	 * A getter for the number of pieces in the array
	 * 
	 * @return The number of pieces in the array
	 */
	int getPieceCount();
	
	/**
	 * A getter for a piece at a certain position in the array
	 * 
	 * @param pos A position in the array
	 * @return A piece at a certain position in the array
	 */
	Piece getPiece(int pos);
	
	/**
	 * Adds a piece to the array
	 * 
	 * @param newPiece A piece to be added to the array
	 */
	void addPiece(Piece newPiece);
	
	/**
	 * Removes all pieces in the array
	 */
	void removeAllPieces();

}
