package basicjavacode;

import java.util.Scanner;

public class SolutionIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// scanner.useDelimiter(Pattern.compile("\r\n"));

		int firstint = scanner.nextInt();
		boolean isWeird = false;
		// int secondint= scanner.nextInt();
		// int thirdint= scanner.nextInt();
		scanner.close();
		if (!(firstint % 2 == 0))
			isWeird = true;
		if (!(firstint == 2 || firstint == 4))
			isWeird = true;
		if((firstint%2==0) && firstint >= 6 && firstint<=20)
			isWeird=true;
		if(firstint>20 && firstint % 2==0)
			isWeird=false;
		if(isWeird)
		System.out.println("Weird");
		else
			System.out.println("not weird");
	}

}
