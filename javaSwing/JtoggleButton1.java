package javaSwing;
import javax.swing.*;
import java.awt.*;
import javax.swing.text.*;

public class JtoggleButton1 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JToggleButton t1,t2,t3,t4,t5,t6,t7,t8;
	ImageIcon i1,i2,i3,i4,i5,i6,i7;
	public JtoggleButton1() {
		createAndShowGUI();
	}
	private void createAndShowGUI() {
		setTitle("JToggle button");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		i1=new ImageIcon("C:\\Users\\Ashik\\eclipse-workspace\\ashik's project 01\\src\\javaSwing\\Smile.png");
		i2=new ImageIcon("C:\\Users\\Ashik\\eclipse-workspace\\ashik's project 01\\src\\javaSwing\\like.png");
		i3=new ImageIcon("C:\\Users\\Ashik\\eclipse-workspace\\ashik's project 01\\src\\javaSwing\\cat.png");
		i4=new ImageIcon("C:\\Users\\Ashik\\eclipse-workspace\\ashik's project 01\\src\\javaSwing\\fb.png");
		i5=new ImageIcon("C:\\Users\\Ashik\\eclipse-workspace\\ashik's project 01\\src\\javaSwing\\aoo.png");
		i6=new ImageIcon("C:\\Users\\Ashik\\eclipse-workspace\\ashik's project 01\\src\\javaSwing\\blue.png");
		i7=new ImageIcon("C:\\Users\\Ashik\\eclipse-workspace\\ashik's project 01\\src\\javaSwing\\c.png");
		
		t1=new JToggleButton();
		t2=new JToggleButton(new DefaultEditorKit.BeepAction());
		t3=new JToggleButton(i1);
		
		t4=new JToggleButton(i2,true);
		t5=new JToggleButton("Toggle Button 5");
		t6=new JToggleButton("ToggleButton 6",true);
		t7=new JToggleButton("ToggleBUtton 7",i3);
		t8=new JToggleButton("Toggle Button 8",i4,true);
		
		t1.setBackground(Color.LIGHT_GRAY);
		
		t1.setForeground(Color.BLACK);
		t1.setActionCommand("JToggleButton t1");
		t1.setText("Toggle Button 1");
		
		t2.setText("Toggle Button 2");
		t2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		t3.setRolloverEnabled(false);
		
		t4.setRolloverIcon(i5);
		t4.setContentAreaFilled(false);
		t4.setBorderPainted(false);
		//t4.setRolloverIcon(i7);
		
		t7.setIconTextGap(10);
		t7.setVerticalTextPosition(3);
		t7.setHorizontalTextPosition(SwingConstants.CENTER);
		t7.setFocusPainted(false);
		t7.setBorderPainted(false);
		t7.setContentAreaFilled(false);
		
		t8.setEnabled(false);
		t8.setDisabledSelectedIcon(i6);
		t8.setSize(300,300);
		
		System.out.println("T4 is selected"+t4.isFocusPainted());
		System.out.println("Focus painted for T4"+t4.isFocusPainted());
		System.out.println("Border painted for T4"+t4.isBorderPainted());
		System.out.println("Focus painted for T4"+t4.isContentAreaFilled());
		
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		add(t8);
		
		setSize(1000,1000);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JtoggleButton1();
			}
		});
		
	}
}
