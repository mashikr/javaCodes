package javaSwing;
import javax.swing.*;
import java.awt.event.*;
public class JcheckBox2 extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l;
	JCheckBox cb1, cb2, cb3;
	JButton b;
	JcheckBox2(){
		l=new JLabel("Food Order");
		l.setBounds(50, 50, 300, 20);
		cb1=new JCheckBox("Burger @ 120");
		cb1.setBounds(100, 100, 150, 20);
		
		cb2=new JCheckBox("Tea @ 150");
		cb2.setBounds(100, 150, 150, 20);
		
		cb3=new JCheckBox("Juice @ 80");
		cb3.setBounds(100, 200, 150, 20);
		
		b=new JButton("Order");
		b.setBounds(100, 250, 80, 30);
		b.addActionListener(this);
		add(l);
		add(cb1);
		add(cb2);
		add(cb3);
		add(b);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		float amount=0;
		String msg="";
		if(cb1.isSelected()) {
			amount+=120;
			msg="Burger: 120\n";
		}
		if(cb2.isSelected()) {
			amount+=150;
			msg+="Tea: 150\n";
		}
		if(cb3.isSelected()) {
			amount+=80;
			msg+="Juice: 80\n";
		}
		
		msg+="---------------------\n";
		JOptionPane.showMessageDialog(this, msg+"Total: "+amount);
	}
	
	public static void main(String args[]) {
		new JcheckBox2();
	}
}
