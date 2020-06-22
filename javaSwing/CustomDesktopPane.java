package javaSwing;
import java.awt.Container;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class CustomDesktopPane extends JDesktopPane{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int numFrame = 3, x = 30, y = 30;
	public void display(CustomDesktopPane dp) {
		for(int i=0; i<numFrame; i++) {
			JInternalFrame jframe = new JInternalFrame("Internal Frame " + i,true,true,true,true);
			jframe.setBounds(x,y,250,85);
			Container c1 = jframe.getContentPane();
			c1.add(new JLabel("I Love my country"));
			dp.add(jframe);
			jframe.setVisible(true);
			y+=85;
		}
	}
}
