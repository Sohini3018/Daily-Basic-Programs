public class Main
{
	public static void main(String[] args) {
		System.out.println(changeCase("Hello World"));
	}
	
	static String changeCase(String s)
	{
	    char[] letter = new char[s.length()];
	    
	    for(int i = 0;i<s.length();i++)
	    {
	        if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
	        {
	            letter[i] = Character.toUpperCase(s.charAt(i));
	        }
	        else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
	        {
	            letter[i] = Character.toLowerCase(s.charAt(i));
	        }
	        else
	        {
	            letter[i] = s.charAt(i);
	        }
	    }
	    
	    String st = "";
	    for(int i = 0;i<s.length();i++)
	    {
	        st = st + letter[i];
	    }
	    
	    return st;
	}
}
