import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    char[] col_arr = {'r', 'b', 'r', 'r', 'b', 'g', 'w', 'y', 'y'};
		
		FindOddBaloonColor obj = new FindOddBaloonColor();
		
		System.out.println(obj.findBaloon(col_arr));
	}
}

class FindOddBaloonColor{
    public char findBaloon(char[] color){
        HashMap<Character, Integer> map = new HashMap<>();
        
        char res = ' ';
        
        for(int i = 0; i < color.length; i++)
        {
            if(!map.containsKey(color[i]))
            {
                map.put(color[i], 1);
            }
            else
            {
                map.put(color[i], map.get(color[i]) + 1);
            }
        }
        
        for(int i = 0; i < color.length; i++)
        {
            if(map.get(color[i]) % 2 != 0)
            {
                res = color[i];
                break;
            }
        }
        
        // System.out.println(map);
        
        return res;
        
    }
}

// Output - 'r'
