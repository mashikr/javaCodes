package javaSwing;
import javax.swing.*;
import java.awt.*;
public class Graphics11 extends Canvas{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		g.drawString("Hello", 40, 40);
		setBackground(Color.white);
		g.fillRect(130, 30, 200, 80);
		g.drawOval(30, 230, 50, 60);
		setForeground(Color.RED);
		g.fillOval(130, 330, 50, 60);
		g.drawArc(30, 360, 40, 50, 90, 60);
		g.fillArc(30, 430, 40, 50, 180, 40);
	}
	
	public static void main(String args[]) {
		Graphics11 m = new Graphics11();
		JFrame f = new JFrame();
		f.add(m);
		f.setSize(400, 400);
		f.setVisible(true);
	}
}