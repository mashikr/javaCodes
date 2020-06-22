package javaSwing;
import javax.swing.*;
import java.awt.event.*;
public class Jpopup {
	public static void main(String args[]) {
		final JFrame frame=new JFrame("JFrame");
		final JPopupMenu popup=new JPopupMenu();
		JMenuItem menuItem=new JMenuItem("New Project",new ImageIcon("C:\\\\Users\\\\Ashik\\\\eclipse-workspace\\\\ashik's project 01\\\\src\\\\javaSwing\\\\gicon.png"));
		menuItem.setMnemonic(KeyEvent.VK_P);
		menuItem.getAccessibleContext().setAccessibleDescription("New Project");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "New Project Clicked");
			}
		});
		popup.add(menuItem);
		menuItem=new JMenuItem("New File", new ImageIcon("C:\\\\Users\\\\Ashik\\\\eclipse-workspace\\\\ashik's project 01\\\\src\\\\javaSwing\\\\gicon.png"));
		menuItem.setMnemonic(KeyEvent.VK_F);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "New File Clicked");
			}
		});
		frame.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				showPopup(e);
			}
			public void mouseReleased(MouseEvent e) {
				showPopup(e);
			}

			private void showPopup(MouseEvent e) {
				if(e.isPopupTrigger()) {
					popup.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
	}
}
