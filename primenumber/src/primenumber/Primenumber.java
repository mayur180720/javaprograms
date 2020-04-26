
package primenumber;

import java.util.Scanner;


public class Primenumber {
    static void prime(){
    System.out.println("this program is made to check wheather a number is prime or not..");
    System.out.println("enter a number : ");
    int pno = 0;
    int j = 0;
    Scanner s = new Scanner(System.in);
    pno = s.nextInt();
    for(int i = 2; i <= pno/2 ; i++)
    {
    if(pno % i == 0)
    {
        j++;
    }
    }
    if(j == 0)
    {
    System.out.println(+pno+ " is a prime number.");
    }
    else{
    System.out.println(+pno+ " is not a prime number.");
    }
    
    
}
   
    public static void main(String[] args) {
       prime();
    }
    
}
