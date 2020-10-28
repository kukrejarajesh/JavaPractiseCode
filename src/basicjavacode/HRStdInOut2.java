package basicjavacode;

import java.util.Scanner;

public class HRStdInOut2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 // scanner.useDelimiter(Pattern.compile("\r\n")); 
		//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		  
		  int i= scanner.nextInt();
		  double d= scanner.nextDouble();
		  scanner.nextLine();
		  String s= scanner.nextLine();
		  scanner.close();
		  System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i); 
	}

}
