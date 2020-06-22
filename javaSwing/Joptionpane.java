package javaSwing;
import javax.swing.*;
public class Joptionpane {
	JFrame f;
	Joptionpane(){
		f=new JFrame();
		JOptionPane.showMessageDialog(f, "Hello welcome here");
	}
	public static void main(String args[]) {
		new Joptionpane();
	}
}
