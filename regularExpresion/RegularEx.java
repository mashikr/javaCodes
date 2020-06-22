package regularExpresion;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularEx {
	public static void main(String args[])
	{
		String line = "This order was placed for SK9000| OK";
		String pattern="(.*)(\\d+)(.*)*";
		
		Pattern r = Pattern.compile(pattern);
		
		Matcher m = r.matcher(line);
		if(m.find()) {
			System.out.println("Found Value: "+m.group(0)) ;
		}
	}
}
