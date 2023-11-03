/*
Print each word in s separated by a line after converting the case of the letter

Output -

SAVE
cHANGES
iN
tHE
eDITOR

*/
public class CamelCaseString
{
	public static void main(String[] args) {
		printCamelCase("saveChangesInTheEditor");
	}
	
	static void printCamelCase(String s)
	{
	    for(int i = 0;i < s.length();i++)
	    {
	        if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
	        {
	            System.out.println();
	            System.out.print(Character.toLowerCase(s.charAt(i)));
	        }
	        else
	        {
	            System.out.print(Character.toUpperCase(s.charAt(i)));
	        }
	    }
	}
}
