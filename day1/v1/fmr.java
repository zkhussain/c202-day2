import java.util.*;
import java.util.regex.*;

public class fmr {
	public static void main(String[] args) {
		String line = args[0];
		
		String regex = args[1];
		
		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(line);

		boolean found = false;

		while (m.find()) {
			System.out.println(m.start()+ ":" + 
					m.end());
		}//while
		if (!found) {
			System.out.println("No Match Found.");
		}//if
	}//main
}//fmr class


