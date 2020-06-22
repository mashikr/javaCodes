package javaSwing;
import javax.swing.*;
public class Optionpane01 {
	JFrame f;
	Optionpane01(){
		f=new JFrame();
		JOptionPane.showMessageDialog(f,"Successfully update record","Alert",JOptionPane.WARNING_MESSAGE);
	}
	public static void main(String args[]) {
		new Optionpane01();
	}
}
