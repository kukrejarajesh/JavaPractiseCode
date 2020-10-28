package basicjavacode;

import java.util.Scanner;

public class OutputFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		String[] outString=new String[3];
        int[] outInt=new int[3];
        
		for(int i=0;i<3;i++){
            outString[i]=sc.next();
            outInt[i] =sc.nextInt();
            //Complete this line
            //System.out.printf();
                      
            
		}
		
		System.out.println("================================");
		for(int i=0;i<3;i++){
        System.out.printf("%-15s", outString[i]);
        System.out.printf("%03d\n", outInt[i]);
		}
		
		 System.out.println("================================");
		sc.close();
		
	}

}
