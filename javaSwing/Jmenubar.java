package javaSwing;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
public class Jmenubar extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar menubar=new JMenuBar();
	public Jmenubar(String title) {
		setTitle(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setJMenuBar(menubar);
		JMenu file=new JMenu("File");
		JMenu edit=new JMenu("Edit");
		JMenu source=new JMenu("Source");
		menubar.add(file);
		menubar.add(edit);
		menubar.add(source);
	}
	public static void main(String args[]) {
		Jmenubar window= new Jmenubar("Eclips");
		window.setBounds(30, 30, 300, 300);
		window.setVisible(true);
	}
}
