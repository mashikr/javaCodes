package javaSwing;
import javax.swing.*;
public class JRadioButton1 {
	JFrame f;
	JRadioButton1(){
		f=new JFrame("Radio Button");
		JRadioButton r1=new JRadioButton("a) Male");
		JRadioButton r2=new JRadioButton("b) Female");
		r1.setBounds(75, 50, 100, 30);
		r2.setBounds(75, 100, 100, 30);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		f.add(r1);
		f.add(r2);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new JRadioButton1();
	}
}
