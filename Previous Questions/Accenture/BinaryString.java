/*
Problem Description :
The Binary number system only uses two digits, 0 and 1 and number system can be called binary string. You are required to implement the following function:

int OperationsBinaryString(char* str);

The function accepts a string str as its argument. The string str consists of binary digits eparated with an alphabet as follows:

– A denotes AND operation
– B denotes OR operation
– C denotes XOR Operation
You are required to calculate the result of the string str, scanning the string to right taking one opearation at a time, and return the same.

Note:

No order of priorities of operations is required
Length of str is odd
If str is NULL or None (in case of Python), return -1
Input:
str: 1C0C1C1A0B1

Output:
1
*/

class BinaryString {
    public static void main(String[] args) {
        String str = "0C1A1B1C1C1B0A0";
        System.out.println(OperationsBinaryString(str));
    }
    static int OperationsBinaryString(String str)
    {
        if(str==null)
            return 0;
        int res = str.charAt(0) - '0';
        for(int i = 1;i<str.length()-1;i=i+2)
        {
            if(str.charAt(i)=='A')
               res = res & str.charAt(i+1)-'0';
            else if(str.charAt(i)=='B')
                res = res | str.charAt(i+1)-'0';
            else
                res = res ^ str.charAt(i+1)-'0';
        }
        return res;
    }
    
}
