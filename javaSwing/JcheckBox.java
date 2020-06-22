package javaSwing;
import javax.swing.*;
public class JcheckBox {
	JcheckBox(){
		JFrame f=new JFrame ("CheckBox");
		JCheckBox checkbox1=new JCheckBox("Java");
		checkbox1.setBounds(100, 100, 100, 20);
		
		JCheckBox checkbox2=new JCheckBox("C++",true);
		checkbox2.setBounds(100, 120, 100, 20);
		
		//JLabel l1=new JLabel("Java")
		f.add(checkbox1);
		f.add(checkbox2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new JcheckBox();
	}
}
