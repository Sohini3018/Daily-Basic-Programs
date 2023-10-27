/*
The function accepts a string “str” of length ‘n’, that contains alphabets and hyphens (-). Implement the function to move all hyphens(-) in the string to the front of the given string.

NOTE:- Return null if str is null.

Example:-

Input:
str.Move-Hyphens-to-Front
Output:
—MoveHyphenstoFront
Explanation:-

The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the string, this output is “— MoveHyphen”

*/

class MoveHyphenInString {
    public static void main(String[] args) {
        System.out.println(MoveHyphen("Move-Hyphens-to-Front"));
    }
    static String MoveHyphen(String s)
    {
        String hyp = "";
        
        for(int i = 0;i < s.length();i++)
        {
            if(s.charAt(i)=='-')
            {
                hyp = s.charAt(i) + hyp;
            }
            else
            {
               hyp = hyp + s.charAt(i);
            }
        }
        
        return hyp;
    }
}
