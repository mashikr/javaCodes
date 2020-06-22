package javaSwing;
import java.awt.*;
import javax.swing.*;
public class Titlebar {
	Titlebar(){
		JFrame f = new JFrame();
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\ashik\\OneDrive\\Documents\\eclipse-workspace\\ashik's project 01\\src\\javaSwing\\c.png");
		f.setIconImage(icon);
		f.setLayout(null);
		f.setSize(200,200);
		f.setVisible(true);
	}
	
	public static void main(String args[]) {
		new Titlebar();
	}
}
