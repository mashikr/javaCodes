package javaSwing;
import javax.swing.*;
import java.awt.*;
public class LayeredPane extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("deprecation")
	public LayeredPane() {
		super(" layeredPane EXP");
		setSize(200, 200);
		JLayeredPane pan = getLayeredPane();
		
		JButton top = new JButton();
		top.setBackground(Color.WHITE);
		top.setBounds(20, 20, 50, 50);
		
		JButton middle = new JButton();
		middle.setBackground(Color.blue);
		middle.setBounds(40, 40, 50, 50);
		
		JButton bottom = new JButton();
		bottom.setBackground(Color.red);
		bottom.setBounds(60, 60, 50, 50);
		
		pan.add(bottom, new Integer(1));
		pan.add(middle, new Integer(2));
		pan.add(top, new Integer(3));
		
	}
	
	public static void main(String args[]) {
		LayeredPane panel = new LayeredPane();
		panel.setVisible(true);
	}
}
