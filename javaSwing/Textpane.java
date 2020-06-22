package javaSwing;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import java.awt.*;
public class Textpane {
	public static void main(String args[]) throws BadLocationException {
		JFrame frame = new JFrame("JTextPane");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = frame.getContentPane();
		JTextPane pane = new JTextPane();
		SimpleAttributeSet att = new SimpleAttributeSet();
		pane.setCharacterAttributes(att, true);
		pane.setText("Welcome");
		att = new SimpleAttributeSet();
		StyleConstants.setItalic(att, true);
		StyleConstants.setForeground(att, Color.red);
		StyleConstants.setBackground(att, Color.blue);
		Document doc = pane.getStyledDocument();
		doc.insertString(doc.getLength(), "To java", att);
		att = new SimpleAttributeSet();
		doc.insertString(doc.getLength(), "World", att);
		JScrollPane scrollpane = new JScrollPane(pane);
		cp.add(scrollpane, BorderLayout.CENTER);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}
