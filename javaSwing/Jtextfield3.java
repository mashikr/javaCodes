package javaSwing;
import javax.swing.*;
public class Jtextfield3 {
	Jtextfield3(){
		JFrame f=new JFrame("Multiple line");
		JTextArea ta=new JTextArea("Welcome here");
		ta.setBounds(10, 30, 200, 200);
		f.add(ta);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new Jtextfield3();
	}
}
