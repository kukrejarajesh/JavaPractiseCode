package basicjavacode;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StdInOutExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  Scanner scanner = new Scanner(System.in);
		 // scanner.useDelimiter(Pattern.compile("\r\n")); 
		  
		  int firstint= scanner.nextInt();
		  int secondint= scanner.nextInt();
		  int thirdint= scanner.nextInt();
		  scanner.close();
		  System.out.println(firstint);
		  System.out.println(secondint);
		  System.out.println(thirdint);
		  
		  
		/*
		 * Scanner scanner = new Scanner(System.in); String myString = scanner.next();
		 * int myInt = scanner.nextInt(); scanner.close();
		 * 
		 * System.out.println("myString is: " + myString);
		 * System.out.println("myInt is: " + myInt);
		 */	  
		  
		 
	}

}
