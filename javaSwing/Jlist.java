package javaSwing;
import javax.swing.*;
public class Jlist {
	Jlist(){
		JFrame f=new JFrame();
		DefaultListModel<String> l1=new DefaultListModel<>();
		l1.addElement("Item 1");
		l1.addElement("Item 2");
		l1.addElement("Item 3");
		l1.addElement("Item 4");
		l1.addElement("Item 5");
		
		JList<String> list=new JList<>(l1 );
		list.setBounds(100, 100, 75, 75);
		f.add(list);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new Jlist();
	}
}
