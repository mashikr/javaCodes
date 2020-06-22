package javaSwing;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

public class Jeditor {
	JFrame myframe = null;
	public static void main(String args[]) {
		(new Jeditor()).test();
	}
	
	private void test() {
		myframe = new JFrame("JEditorPane");
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setSize(400,400);
		JEditorPane mypane = new JEditorPane();
		mypane.setContentType("text/plain");
		mypane.setText("\r\n" + 
				"\r\n" + 
				"QUICK LINK\r\n" + 
				"BTEB Admission\r\n" + 
				"(Session: 2019 - 2020)\r\n" + 
				"Govt. Programs\r\n" + 
				"\r\n" + 
				"Private Programs\r\n" + 
				"\r\n" + 
				"Help Line (8:00 AM to 8:00 PM)\r\n" + 
				"\r\n" + 
				"BUET\r\n" + 
				"01727 233524\r\n" + 
				"01789 309981\r\n" + 
				"\r\n" + 
				"BTEB\r\n" + 
				"09612 288288\r\n" + 
				"\r\n" + 
				"© 2018 Bangladesh Technical Education Board, All Rights Reserved");
		myframe.setContentPane(mypane);
		myframe.setVisible(true);
	}
}
