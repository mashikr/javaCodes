package javaSwing;
import javax.swing.*;
import java.awt.*;
public class Jtoolbar extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JToolBar t1,t2,t3,t4;
	public Jtoolbar() {
		createAndShowGUI();
	}
	private void createAndShowGUI() {
		setTitle("Jtoolbar");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		t1=new JToolBar();
		t2=new JToolBar(JToolBar.VERTICAL);
		t3=new JToolBar("Toolbar 3");
		t4=new JToolBar("Toolbar 4",JToolBar.VERTICAL);
		for(int i=1;i<5;i++) {
			t1.add(new JButton("Button"+i));
			t1.addSeparator();
			t2.add(new JButton("button"+i));
			t3.add(new JButton("button"+i));
			t4.add(new JButton("button"+i));
		}
		t1.setMargin(new Insets(10,10,10,10));
		t1.setRollover(false);
		t1.setFloatable(false);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
	}
	public static void main(String args[]) {
		new Jtoolbar();
	}
}
