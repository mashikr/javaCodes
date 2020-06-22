package javaSwing;
import javax.swing.*;

public class Rootpane {
	public static void main(String args[]) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JRootPane root = f.getRootPane();
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("File");
		bar.add(menu);
		menu.add("Open");
		menu.add("Close");
		root.setJMenuBar(bar);
		root.getContentPane().add(new JButton("Press Me"));
		f.pack();
		f.setVisible(true);
	}
}
