package javaSwing;
import javax.swing.*;
import javax.swing.JProgressBar;
public class Jprogressbar extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JProgressBar jb;
	int i=0,num=0;
	Jprogressbar(){
		jb=new JProgressBar(0,2000);
		jb.setBounds(40,40,160,30);
		jb.setValue(0);
		jb.setStringPainted(true);
		add(jb);
		setSize(250,250);
		setLayout(null);
	}
	public void iterate() {
		while(i<2000) {
			jb.setValue(i);
			i=i+20;
			try {
				Thread.sleep(150);
			}
			catch(Exception e) {
				
			}
		}
	}
	public static void main(String args[]) {
		Jprogressbar m=new Jprogressbar();
		m.setVisible(true);
		m.iterate();
	}
}
