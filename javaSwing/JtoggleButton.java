package javaSwing;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import java.awt.*;
public class JtoggleButton extends JFrame implements ItemListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String args[]) {
		new JtoggleButton();
	}
	private JToggleButton button;
	JtoggleButton(){
		setTitle("JToggle Button");
		setLayout(new FlowLayout());
		setJToggleButton();
		setAction();
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void setJToggleButton() {
		button=new JToggleButton("On");
		add(button);
	}
	private void setAction() {
		button.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent eve) {
		if(button.isSelected()) {
			button.setText("OFF");
		}
		else {
			button.setText("ON");
		}
	}
}
