package basicjavacode;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Loop1 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
    	int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i=1;i<=10;i++)
        {
        	System.out.println(N + "*" + i + "=" + N*i);
        }
        scanner.close();
    }
}
