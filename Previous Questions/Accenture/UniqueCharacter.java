/*
String with lowercase alphabets are given.
Return how many unique chars are present.
*/

import java.util.*;
public class UniqueCharacter
{
	public static void main(String[] args) {
		System.out.println(uniqueCharacters(10, "helloworld"));
	}
	
	static int uniqueCharacters(int N, String s)
	{
	    HashSet<Character> set = new HashSet<>();
	    
	    for(int i = 0; i < N; i++)
	    {
	        if(!set.contains(s.charAt(i)))
	            set.add(s.charAt(i));
	    }
	    
	    return set.size();
	}
}
