package javaSwing;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

public class JDesktoppane extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JDesktoppane() {
		CustomDesktopPane deskpan = new CustomDesktopPane();
		Container contentPane = getContentPane();
		contentPane.add(BorderLayout.CENTER, deskpan);
		deskpan.display(deskpan);
		setTitle("JDesktop");
		setSize(400, 400);
		setVisible(true);
	}
	public static void main(String args[]) {
		new JDesktoppane();
	}
}
