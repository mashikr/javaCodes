package javaSwing;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Jbutton {
	Jbutton(){
		JFrame frame=new JFrame();
		JButton b=new JButton("Click Me");
		
		b.setBounds(50, 50, 90, 50);
		frame.add(b);
		frame.setSize(300, 200);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new Jbutton();
	}
}
