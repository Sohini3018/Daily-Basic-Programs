public class Solution {
    public int solve(int A, int B) {
        int a = Math.min(A-1, B-1);
        int b = Math.min(8-A, 8-B);
        
        int c = Math.min(A-1, 8-B);
        int d = Math.min(8-A, B-1);
        
        return a+b+c+d;
    }
}
