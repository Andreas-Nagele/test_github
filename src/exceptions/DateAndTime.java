package exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class DateAndTime {

	public static void main(String[] args) throws FileNotFoundException {
		String file = "test.txt";
	   
	    
	    try (PrintWriter pw = new PrintWriter(file)) {
			pw.write(LocalDateTime.now().toString());
			
	    } catch (Exception e) {
	    	e.getStackTrace();
	    } 
	}

}
