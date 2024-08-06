// link - https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int[] arr) {

        long max_sum = Long.MIN_VALUE;
        long sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            // VVIP --> if we do not compare sum before init it to 0
            // the current sum will change to 0 and will be stored in max_sum
            // we'll compare and store actual one first
            // then we'll checl if sum is -ve then reinit to 0
            // {-1, -2, -3} --> max_sum = -1 dry run for this
            
            if(sum > max_sum) max_sum = sum;
            
            if(sum < 0) sum = 0;
        }
        
        return max_sum;
    }
}
