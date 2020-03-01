
package Fibonacci;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args)
    {
        System.out.println("Enter n'th number of series that you want to know :");
        Scanner sc=new Scanner(System.in);
        int maxNumber=sc.nextInt();
        
        System.out.println("Enter first value :");
        Scanner sc1=new Scanner(System.in);
        int preNumber=sc1.nextInt();
        
        
        System.out.println("Enter second value :");
        Scanner sc2=new Scanner(System.in);
        int nextNumber=sc2.nextInt();
        
        for(int i=1;i<=maxNumber;i++)
        {
            System.out.print(preNumber +" ");
            int sum=preNumber+nextNumber;
            preNumber=nextNumber;
            nextNumber=sum;
        }
    }
    
}
