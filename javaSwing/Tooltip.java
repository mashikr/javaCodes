package javaSwing;
import javax.swing.*;
public class Tooltip {
	public static void main(String args[]) {
		JFrame f = new JFrame("Password Tool Tip");
		JPasswordField pf = new JPasswordField();
		pf.setBounds(100,100,100,30);
		pf.setToolTipText("Enter your password");
		JLabel l1 = new JLabel("Password");
		l1.setBounds(20,100,80,30);
		
		f.add(pf);
		f.add(l1);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}
}
