package javaSwing;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class Jcombo {
	public static void main(String args[]) {
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton jb=new JButton("OK");
		
		String[] ms= {"Java","Jbuilder","JFC","Swing"};
		final JList<Object> jlist1=new JList<Object>(ms);
		jb.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object contents=jlist1.getSelectedValue();
				System.out.println(contents);
			}
		});
		frame.add(jlist1,"Center");
		frame.add(jb,"South");
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}
