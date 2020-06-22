package javaSwing;
import javax.swing.*;
public class Jtextfield {
	public static void main(String args[]) {
		JFrame f=new JFrame("Text Field");
		JTextField t1, t2;
		t1=new JTextField("Welcome to my Eclips");
		t1.setBounds(50, 100, 200, 50);
		t2=new JTextField("Swing");
		t2.setBounds(50, 200, 250, 60);
		
		f.add(t1);
		f.add(t2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
