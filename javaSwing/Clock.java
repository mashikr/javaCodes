package javaSwing;
import javax.swing.*;
import java.text.*;
import java.util.*;

public class Clock implements Runnable{
	JFrame f;
	Thread t = null;
	int hours = 0, minutes = 0, seconds = 0;
	String time="";
	JButton b;
	
	Clock(){
		f = new JFrame();
		t = new Thread(this);
		t.start();
		b = new JButton();
		b.setBounds(100, 100, 100, 50);
		f.add(b);
		f.setSize(300,400);
		f.setVisible(true);
	}
	
	public void run() {
		try {
			while(true) {
				Calendar cal = Calendar.getInstance();
				hours = cal.get(Calendar.HOUR_OF_DAY);
				if(hours>12) hours -= 12;
				minutes = cal.get(Calendar.MINUTE);
				seconds = cal.get(Calendar.SECOND);
				SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
				Date date = cal.getTime();
				time = format.format(date);
				printTime();
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			
		}
	}

	private void printTime() {
		b.setText(time);
	}
	public static void main(String arg[]) {
		new Clock();
	}
}
