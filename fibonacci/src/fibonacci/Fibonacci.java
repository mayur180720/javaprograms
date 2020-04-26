package fibonacci;

import java.util.Scanner;


public class Fibonacci {
    static void fib(){
    System.out.println("the program is to show the fibonacci series.");
    System.out.println("how many numbers of the fibonacci series to show ?");
    int i, a1=0, a2=1, no, a3;
    Scanner s = new Scanner(System.in);
    no = s.nextInt();
    System.out.println("\n"+a1+ "\t " +a2);
    for(i=0; i<(no-2) ;i++)
    {
    a3 = a1 + a2;
    System.out.println("\t"+a3);
    a1 = a2; a2 = a3;
    }
        
    
    
    }

    
    public static void main(String[] args) {
       fib();
    }
    
}
