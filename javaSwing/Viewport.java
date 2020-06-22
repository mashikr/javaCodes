package javaSwing;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;;

public class Viewport {
	public static void main(String args[]) {
		JFrame frame = new JFrame("View Port");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Label");
		label.setPreferredSize(new Dimension(1000,1000));
		JScrollPane jscrollpane = new JScrollPane(label);
		JButton jbutton = new JButton();
		jscrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jscrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jscrollpane.setViewportBorder(new LineBorder(Color.RED));
		jscrollpane.getViewport().add(jbutton,null);
		frame.add(jscrollpane,BorderLayout.CENTER);
		frame.setSize(400, 150);
		frame.setVisible(true);
	}
}
