package uwstout.cs144.projects.project3.collage;

import javax.swing.JFrame;

/**
 * Creates a window
 * 
 * @author Hannah Schenk
 * @version 5.5.17
 *
 */
public class CollageMaker {
	
	/**
	 * Creates a window
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		JFrame window = new JFrame("Collage Maker");
		
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		MainPanel main = new MainPanel(window);
		window.add(main);
	
		window.pack();
		window.setVisible(true);
		
	}

}
