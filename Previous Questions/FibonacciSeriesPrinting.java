import java.util.*;
public class FibonacciSeriesPrinting {
    public static void main(String[] args)
    {

        int a=0,b=1;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth term to print Fibonacci Series:");
        int n=sc.nextInt();
        System.out.println("The Fibonacci Series upto "+n+"th term is:");
        System.out.print(a+"  "+b+"  ");

        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.print(c+"  ");
            a=b;
            b=c;
        }
        sc.close();
    }
}
