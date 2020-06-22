package submenu;
import java.awt.event.KeyEvent;

import javax.swing.*;
public class Jmenubar02 {
	public static void main(final String args[]) {
		JFrame frame=new JFrame("ABC");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menubar=new JMenuBar();
		
		JMenu fileMenu=new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		menubar.add(fileMenu);
		
		JMenuItem newMenuItem=new JMenuItem("New ",KeyEvent.VK_N);
		fileMenu.add(newMenuItem);
		frame.setJMenuBar(menubar);
		frame.setSize(350, 250);
		frame.setVisible(true);
	}
}
