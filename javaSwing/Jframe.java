package javaSwing;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Jframe {
	public static void main(String args[]) {
		JFrame frame = new JFrame("JFrame");
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("jframe");
		JButton button = new JButton();
		button.setText("Button");
		panel.add(label);
		panel.add(button);
		frame.add(panel);
		frame.setSize(200, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
