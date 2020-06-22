package javaSwing;
import javax.swing.*;
public class Jtable {
	JFrame f;
	Jtable(){
		f=new JFrame();
		String data[][]= {{"1012","Fayas","6000"},
				{"1013","Khan","1200"},
				{"1014","Joy","1234"}};
		String column[]= {"ID","Name","Salary"};
		JTable jt=new JTable(data,column);
		jt.setBounds(30, 40, 200, 300);
		JScrollPane sp=new JScrollPane(jt);
		f.add(sp);
		f.setSize(300, 400);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new Jtable();
	}
}
