class Solution {
    // brutforce approach
    // this approach will only work if the matrix doesn't has a -1 already
    // else that -1 will be converted to 0 and give wrong result

    // TC - O(n*m)*(n+m) + O(n*m) --> add for second pass
    // SC - O(1)

    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == 0) {
                    // make whole col 0
                    for(int k = 0; k < n; k++) {
                        if(matrix[k][j] != 0)
                            matrix[k][j] = -1;
                    }
                    // make whole row 0
                    for(int l = 0; l < m; l++) {
                        if(matrix[i][l] != 0)
                            matrix[i][l] = -1;
                    }
                }

            }
        }

        // replace all -1 with 0s
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == -1) 
                    matrix[i][j] = 0;
            }
        }
    }
}


class Solution {
    // better approach
    // TC - O(n*m) + O(n*m)
    // SC - O(n) + O(m) --> we have taken extra array space for tracking

    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // take separate tracking arrays for row and columns
        int[] col_tracker = new int[m];
        int[] row_tracker = new int[n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == 0) {
                    // mark that row and col
                    row_tracker[i] = 1;
                    col_tracker[j] = 1;
                }
            }
        }

        // second pass to ckeck if any cell has marking in row or col
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(row_tracker[i] == 1 || col_tracker[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}


class Solution {
    // optimal approach
    // TC - almost same as better
    // SC - almost constant space complexity
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // consider row0 and col0 as tracking arrays
        // row_tracker --> matrix[..][0]  col_tracker --> matrix[0][..]
        // we need one separate var for col0

        int col0 = 1;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == 0) {
                    // mark that row and col
                    // but here will mark as 0 so that we can later check these 0
                    // and mark the rest matrix except col0 and row0
                    matrix[i][0] = 0;

                    if(j != 0)
                        matrix[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }

        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                // no need to make 0 if already 0
                // if element is not 0 then check the tracking arrays
                if(matrix[i][j] != 0) {
                    if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                } 
            }
        }

        // now turn the col_tracker that is row0 into 0
        if(matrix[0][0] == 0) {
            for(int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }
        // now turn the row_tracker that is col0 into 0
        if(col0 == 0) {
            for(int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        } 
    }
}
