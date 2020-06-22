package javaSwing;
import javax.swing.*;
public class Jscrollbar {
	Jscrollbar(){
		JFrame f=new JFrame("Scrollbar");
		JScrollBar s=new JScrollBar();
		s.setBounds(100, 100, 20, 200);
		f.add(s);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new Jscrollbar();
	}
}
