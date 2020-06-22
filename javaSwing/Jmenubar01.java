package javaSwing;
import javax.swing.*;
public class Jmenubar01 {
	JMenu menu,submenu;
	JMenuItem i1,i2,i3,i4,i5,i6,i7,i8;
	Jmenubar01(){
		JFrame f=new JFrame("Menu and MenuItem");
		JMenuBar mb=new JMenuBar();
		menu=new JMenu("File");
		submenu=new JMenu("Edit");
		i1=new JMenuItem("New");
		i2=new JMenuItem("Open");
		i3=new JMenuItem("Open File");
		i4=new JMenuItem("Save");
		i5=new JMenuItem("Save as");
		i6=new JMenuItem("Copy");
		i7=new JMenuItem("Cut");
		i8=new JMenuItem("Paste");
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(i4);
		menu.add(i5);
		submenu.add(i6);
		submenu.add(i7);
		submenu.add(i8);
		menu.add(submenu);
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new Jmenubar01();
	}
}
