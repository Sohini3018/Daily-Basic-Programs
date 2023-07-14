import java.util.*;
public class VowelConstantCounting {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        int vowel=0,cons=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i'
                    || ch=='I' || ch=='o' || ch=='O' || ch=='u'|| ch=='U')
            {
                vowel++;
            }
            else
            {
                cons++;
            }
        }
        System.out.println("There are "+vowel+" Vowels in the String.");
        System.out.println("There are "+cons+" Consonants in the String.");
    }
}
