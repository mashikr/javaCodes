package javaSwing;
import javax.swing.*;
public class Jcombobox {
	JFrame f;
	Jcombobox(){
		f=new JFrame("Combo Box");
		String lang[]= {"C","C++","Java","Phython"};
		JComboBox<Object> cb=new JComboBox<Object>(lang);
		cb.setBounds(50, 50, 150, 20);
		f.add(cb);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400, 400);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new Jcombobox();
	}
}
