/*
Note: When comparing 2 strings please check both sides.
Sometimes the characters of 1 string may be present in the other but the count can be different.
Sometimes any extra char can be present in the other string. 
So, both side comparison is required.

But

If we are comparing the count of each character and the length of the strings are exactly the same then 1 sided comparison is ok.
Because if any extra char is there the count of each char must be diff.
*/

// 2 Pseudo equal string code - 

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        if(checkStrings(s1, s2) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    
    static boolean checkStrings(String s1, String s2)
    {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        for(int i = 0; i < s1.length(); i++)
        {
            arr1[s1.charAt(i) - 'a'] = arr1[s1.charAt(i) - 'a'] + 1;
        }
        
        for(int i = 0; i < s2.length(); i++)
        {
            arr2[s2.charAt(i) - 'a'] = arr2[s2.charAt(i) - 'a'] + 1;
        }
        
        for(int i = 0; i < s1.length(); i++)
        {
            if(arr1[s1.charAt(i) - 'a'] != arr2[s1.charAt(i) - 'a'])
                return false;
        }
        return true;
        
    }
}


// One more 

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0;i < word1.length(); i++)
        {
            if(map1.containsKey(word1.charAt(i)))
            {
                map1.put(word1.charAt(i), map1.get(word1.charAt(i)) + 1);
            }
            else
            {
                map1.put(word1.charAt(i), 1);
            }
        }

        for(int i = 0;i < word2.length(); i++)
        {
            if(map2.containsKey(word2.charAt(i)))
            {
                map2.put(word2.charAt(i), map2.get(word2.charAt(i)) + 1);
            }
            else
            {
                map2.put(word2.charAt(i), 1);
            }
        }

        for(int i = 0; i < word1.length(); i++)
        {
            if(Math.abs(map1.get(word1.charAt(i)) - map2.getOrDefault(word1.charAt(i), 0)) > 3)
                return false;
        }

        for(int i = 0; i < word2.length(); i++)
        {
            if(Math.abs(map2.get(word2.charAt(i)) - map1.getOrDefault(word2.charAt(i), 0)) > 3)
                return false;
        }

        return true;

    }
}
