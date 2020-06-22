package javaSwing;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class Jseparator {
	public static void main(String args[]) {
		JFrame frame=new JFrame("Menu Simple Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menuBar=new JMenuBar();
		JMenu fileMenu=new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(fileMenu);
		JMenuItem newMenuItem=new JMenuItem("New",KeyEvent.VK_N);
		fileMenu.add(newMenuItem);
		
		fileMenu.addSeparator();
		
		JMenuItem saveMenuItem=new JMenuItem("Save",KeyEvent.VK_S);
		fileMenu.add(saveMenuItem);
		
		fileMenu.addSeparator();
		
		JMenuItem openMenuItem=new JMenuItem("Open",KeyEvent.VK_O);
		fileMenu.add(openMenuItem);
		
		frame.setJMenuBar(menuBar);
		frame.setSize(350, 250);
		frame.setVisible(true);
	}
}
