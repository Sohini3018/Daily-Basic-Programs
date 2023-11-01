/*
input = "Hello World"

output = "World Hello"

*/

import java.util.*;
public class ReverseSentenceWords
{
	public static void main(String[] args) {
	    String sentence = "Hello World";
		System.out.println(reverseSentence(sentence));
	}
	
	static String reverseSentence(String sentence)
	{
	   // String str = "";
	    
	   // ArrayList<String> words = new ArrayList<>();
	    
	   // for(int i = 0;i < sentence.length();i++)
	   // {
	   //     if(sentence.charAt(i) == ' ')
	   //     {
	   //         words.add(str);
	   //         words.add(" ");
	   //         str = "";
	            
	   //     }
	   //     else
	   //     {
	   //         str = str + sentence.charAt(i);
	   //     }
	   // }
	   // words.add(str);
	    
	   // String newSentence = "";
	   // for(int i = words.size() - 1;i >= 0;i--)
	   // {
	   //     newSentence = newSentence + words.get(i);
	   // }
	    
	   // return newSentence;
	   
	   String[] words = sentence.split(" ");
	   
	   String newSentence = "";
	   
	   for(int i = words.length - 1;i>=0;i--)
	   {
	       if(i == 0)
	       {
	           newSentence = newSentence + words[i];
	       }
	       else
	       {
	           newSentence = newSentence + words[i] + " ";
	       }
	       
	   }
	   
	   return newSentence;
	}
}
