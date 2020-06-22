package javaSwing;
import java.awt.*;
import javax.swing.*;

public class ImageShow extends Canvas{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("‪C:\\Users\\ashik\\OneDrive\\Documents\\eclipse-workspace\\ashik's project 01\\src\\javaSwing\\like.png");
		g.drawImage(i, 120, 120, this);
	}
	public static void main(String args[]) {
		ImageShow m = new ImageShow();
		JFrame f = new JFrame();
		f.add(m);
		f.setSize(400, 400);
		f.setVisible(true);
	}
}
