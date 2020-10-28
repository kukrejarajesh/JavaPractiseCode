package basicjavacode;
import java.util.*;
import java.io.*;

class Loop2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            System.out.println("a="+a);
            System.out.println("b="+b);
            System.out.println("c="+n);
            int output=a;
            int dummy=0;
            for(int j=0;j<n;j++) {
            	output= output + b*(2^j);
            	dummy=2^j;
            	System.out.println("2 power j=" + dummy);
            	System.out.printf(output + " ");
            }
            	
            	
            
        }
        in.close();
    }
}