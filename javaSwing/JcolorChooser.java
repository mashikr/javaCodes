package javaSwing;
import javax.swing.*;
import java.awt.*;
public class JcolorChooser extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JcolorChooser() {
		createAndShowGUI();
	}
	private void createAndShowGUI() {
		setTitle("JcolorChooser");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		Color c=JColorChooser.showDialog(this,"Choose a background",Color.red);
		getContentPane().setBackground(c);
		setSize(400, 400);
		setVisible(true);
	}
	public static void main(String args[]) {
		new JcolorChooser();
	}
}
