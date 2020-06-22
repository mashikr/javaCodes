package javaSwing;
import javax.swing.*;
public class Jlabel {
	public static void main(String args[]) {
		JFrame f=new JFrame ("Label Example");
		JLabel l1,l2;
		l1=new JLabel ("First Label");
		l1.setBounds(50, 50, 100, 350);
		l2=new JLabel ("2nd Label");
		l2.setBounds(50, 50, 100, 30);
		
		f.add(l1);
		f.add(l2);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}
}
