package dateAndTime;
import java.util.*;
import java.text.*;
public class DateTime2 {
	public static void main(String args[])
	{
		Date date = new Date();
		SimpleDateFormat ft =new SimpleDateFormat("E dd.mm.yyy 'at' hh:mm:ss a zzz");
		System.out.println("Current Date: "+ft.format(date));
	}
}
