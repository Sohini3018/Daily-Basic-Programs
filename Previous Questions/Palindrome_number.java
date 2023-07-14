import java.util.*;
public class Palindrome_number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int temp=num,rev_num=0;
        while(temp!=0)
        {
            int r=temp%10;
            rev_num=rev_num*10+r;
            temp=temp/10;
        }
        if(rev_num==num)
            System.out.println(num+" is a palindrome number.");
        else
            System.out.println(num+" is not a  palindrome number.");
    }
}
