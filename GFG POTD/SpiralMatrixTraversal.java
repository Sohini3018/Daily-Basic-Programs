// TC - O(m * n)
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        int row_begin = 0;
        int row_end = matrix.length -1;
        int col_begin = 0;
        int col_end = matrix[0].length - 1;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(row_begin <= row_end && col_begin <= col_end) {
            // traverse right
            for(int i = col_begin; i <= col_end; i++) {
                list.add(matrix[row_begin][i]);
            }
            row_begin++;
            
            // traverse down
            for(int i = row_begin; i <= row_end; i++) {
                list.add(matrix[i][col_end]);
            }
            col_end--;
            
            // traverse left
            if(row_begin <= row_end) {
              for(int i = col_end; i >= col_begin; i--) {
                list.add(matrix[row_end][i]);
                }  
            }
            row_end--;
            
            // traverse up
            if(col_begin <= col_end) {
                for(int i = row_end; i >= row_begin; i--) {
                    list.add(matrix[i][col_begin]);
                }
            }
            col_begin++;
        }
        return list;
    }
}
