package layoutManager;
import javax.swing.*;

public class ScrollPanelayout extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ScrollPanelayout() {
		super("ScrollPanelayout");
		ImageIcon img = new ImageIcon("‪E:\\varsity day and chaimanghat pics\\IMG_20180715_092158.jpg");
		JScrollPane png = new JScrollPane(new JLabel(img));
		getContentPane().add(png);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new ScrollPanelayout();
	}
}
