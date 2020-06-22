package layoutManager;
import javax.swing.*;
import java.awt.*;
public class Boxlayout extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button buttons[];
	public Boxlayout() {
		buttons = new Button[5];
		for(int i=0; i<5; i++) {
			buttons[i] = new Button("Button "+(i+1));
			add(buttons[i]);
		}
		setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new Boxlayout();
	}
}
