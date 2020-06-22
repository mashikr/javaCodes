package javaSwing;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
public class Jtreenode01 {
	JFrame f;
	Jtreenode01(){
		f=new JFrame();
		DefaultMutableTreeNode style=new DefaultMutableTreeNode("style");
		DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");
		DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");
		style.add(color);
		style.add(font);
		
		DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");
		DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");
		DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");
		DefaultMutableTreeNode green=new DefaultMutableTreeNode("green ");
		color.add(red);
		color.add(blue);
		color.add(black);
		color.add(green);
		JTree jt=new JTree(style);
		f.add(jt);
		f.setSize(400, 400);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new Jtreenode01();
	}
}
