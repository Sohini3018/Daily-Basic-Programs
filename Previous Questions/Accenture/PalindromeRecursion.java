public class PalindromeRecursion {
    public static void main(String[] args) {
        System.out.println(palindrome("abbba", 0, 3));
    }

    static boolean palindrome(String s, int l, int r) {
        
        if(l >= r)
            return true;
        
        return palindrome(s, l + 1, r - 1);
    }
}
