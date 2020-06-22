package javaSwing;
import javax.swing.*;
import java.awt.event.*;
public class Optionpane02 extends WindowAdapter{
	JFrame f;
	Optionpane02(){
		f=new JFrame();
		f.addWindowListener(this);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	public void windowClosing(WindowEvent e) {
		int a=JOptionPane.showConfirmDialog(f, "Are you sure?");
		if(a==JOptionPane.YES_OPTION) {
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	public static void main(String args[]) {
		new Optionpane02();
	}
}