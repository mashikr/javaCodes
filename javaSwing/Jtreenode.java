package javaSwing;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
public class Jtreenode extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTree tree;
	public Jtreenode() {
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("Root");
		DefaultMutableTreeNode vegetable=new DefaultMutableTreeNode("Vegetable");
		DefaultMutableTreeNode fruitnode=new DefaultMutableTreeNode("Fruits");
		
		root.add(vegetable);
		root.add(fruitnode);
		
		tree=new JTree(root);
		add(tree);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("J Tree Node");
		this.pack();
		this.setVisible(true);
	}
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Jtreenode();
			}
		});
		
	}
}
