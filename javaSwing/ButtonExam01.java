package javaSwing;
import javax.swing.*;
public class ButtonExam01 {
	ButtonExam01(){
		JFrame f=new JFrame("Button Example");
		JButton b=new JButton(new ImageIcon("C:\\Users\\Ashik\\eclipse-workspace\\ashik's project 01\\src\\javaSwing\\gicon.png"));
		b.setBounds(100, 100, 512, 512);
		f.add(b);
		f.setSize(1000, 1000);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new ButtonExam01();
	}
}
