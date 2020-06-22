package layoutManager;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Cardlayout extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CardLayout card;
	JButton b1,b2,b3;
	Container c;
	Cardlayout(){
		c = getContentPane();
		card = new CardLayout(40,30);
		c.setLayout(card);
		
		b1 = new JButton ("Apple");
		b2 = new JButton ("Girl");
		b3 = new JButton ("Dog");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		c.add("a", b1);
		c.add("b", b2);
		c.add("c", b3);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		card.next(c);
	}
	
	public static void main(String args[]) {
		Cardlayout cl = new Cardlayout();
		cl.setSize(500, 500);
		cl.setVisible(true);
		cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
