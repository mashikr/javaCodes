package javaSwing;
import java.awt.*;
import javax.swing.*;
public class Splitpane {
	private static void createAndShow() {
		final JFrame frame = new JFrame ("JSplit");
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout());
		String option1[] = {"apple","ball","cat","doll","egg"};
		JComboBox<String> box1 = new JComboBox<String>(option1);
		String option2[] = {"101","201","301","401","501"};
		JComboBox<String> box2 =new JComboBox<String>(option2);
		Panel panel1 = new Panel();
		panel1.add(box1);
		Panel panel2 = new Panel();
		panel2.add(box2);
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,panel1,panel2);
		frame.getContentPane().add(splitPane);
	}
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShow();
			}
			
		});
	}
}
