package uwstout.cs144.projects.project3.collage;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * Creates a panel that holds several buttons
 * 
 * @author Hannah Schenk
 * @version 5.5.17
 *
 */
public class ButtonPanel extends JPanel {
	private JComboBox<String> sizeCombo;
	
	private JFrame collageWindow;
	private ButtonGroup group = new ButtonGroup();
	
	/**
	 * A constructor for the class
	 * 
	 * @param window The window so the quit button can interact with it
	 */
	public ButtonPanel(JFrame window) {
		collageWindow = window;
		
		
		BoxLayout layout = new BoxLayout(this, BoxLayout.PAGE_AXIS);
		setLayout(layout);
		setPreferredSize(new Dimension(200, 500));
		
		JPanel shapeRadio;
		shapeRadio = createRadio();
		add(shapeRadio);
		
		sizeCombo = createCombo();
		add(sizeCombo);
		
		
		
		JButton quitButton = new JButton("Quit");
		quitButton.addActionListener(new QuitListener());
		add(quitButton);
		quitButton.setAlignmentX(CENTER_ALIGNMENT);
		
	}
	
	
	/**
	 * Creates a combo box for size
	 * 
	 * @return The combo box
	 */
	private JComboBox<String> createCombo() {
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Small");
		combo.addItem("Medium");
		combo.addItem("Large");
		
		combo.setSelectedIndex(0);
		
		combo.setMaximumSize(new Dimension(100, 25));
		combo.setAlignmentX(CENTER_ALIGNMENT);
		
		return combo;
	}
	
	/**
	 * A getter for the selected size of the combo box
	 * 
	 * @return The selected size
	 */
	public String getSelectedSize() {
		String size = (String) sizeCombo.getSelectedItem();
		return size;
	}
	
	/**
	 * Creates a radio button for shape
	 * 
	 * @return The radio button
	 */
	private JPanel createRadio() {
		JRadioButton square = new JRadioButton("Square");
		square.setActionCommand("Square");
		JRadioButton circle = new JRadioButton("Circle");
		circle.setActionCommand("Circle");
		JRadioButton rectangle = new JRadioButton("Rectangle");
		rectangle.setActionCommand("Rectangle");
		
		//adds buttons to group so that only one in group can be selected
		group.add(square);
		group.add(circle);
		group.add(rectangle);
		
		//adds buttons to a panel
		JPanel radioPanel = new JPanel();
		radioPanel.add(square);
		radioPanel.add(circle);
		radioPanel.add(rectangle);
		
		//sets selected to square
		square.setSelected(true);
		
		radioPanel.setAlignmentX(CENTER_ALIGNMENT);
		
		GridLayout grid = new GridLayout(3, 0);
		radioPanel.setLayout(grid);
		
		radioPanel.setMaximumSize(new Dimension(140, 70));

	
		return radioPanel;
		
	}
	
	/**
	 * A getter for the selected shape of the radio button
	 * 
	 * @return The selected shape
	 */
	public String getSelectedShape() {
		String shape = group.getSelection().getActionCommand(); 
	    return shape;
	}
	
	/**
	 * A listener for the quit button
	 * 
	 * @author Hannah Schenk
	 * @version 5.5.17
	 *
	 */
	private class QuitListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			collageWindow.dispose();

		}
	}
	
	
}

