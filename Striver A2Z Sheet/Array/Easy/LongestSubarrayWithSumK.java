import java.util.HashMap;

public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int max_len = 0;

        for(int i = 0; i < a.length; i++) {
            long sum = 0;
        
            for(int j = i; j < a.length; j++) {
                sum += a[j];
                if(sum == k) {
                    max_len = (int)Math.max(j - i + 1, max_len);
                }
            }
        }
        return max_len;
    }

    public static int longestSubarrayWithSumK(int []a, long k) {
        // better approach
        // optimal for arrays having 0 and negative values 
       // take a hashmap to store previous sums till now
       HashMap<Long, Integer> map = new HashMap<>();

       // iterate through the array
       long prefix_sum = 0;
       int max_len = 0;

       for(int i = 0; i < a.length; i++) {
           // update the sum
           prefix_sum += a[i];
           long rem_sum = prefix_sum - k;
           // check if map has the rem_sum
           // that means some prefix_sum == k which we need
           // this rem_sum was once a prefix_sum, which was stored with it's index
           // if we get that index, (current_idx - that index) will give us the len
           // which has sum = k
           if(map.containsKey(rem_sum)) {
               // prefix_sum = k + (prefix_sem - k)
               int curr_len = i - map.get(rem_sum);
               max_len = (int)Math.max(curr_len, max_len);
           }else {
               // we will check and keep the previous found small index that already
               // has the prefix_sum
               // as we want to keep the prefix_sum(now rem_sum) len as small as poss
               // to keep the actual k sum length max 
               if(!map.containsKey(prefix_sum)) {
                    map.put(prefix_sum, i);
                }
            }
        }

        return max_len;
    }


    public static int longestSubarrayWithSumK(int []a, long k) {
    // Optimal Approach -- Sliding window -- while loop inside only runs within the subarray so --> kind of approx O(2n)  
    // Initializing pointers and variables
    int left = 0; // Left pointer to track the start of the subarray
    int right = 0; // Right pointer to track the end of the subarray

    long sum = a[0]; // Initializing sum with the first element of the array

    int max_len = 0; // Variable to store the length of the longest subarray with sum equal to k

    // Loop until the right pointer reaches the end of the array
    while(right < a.length) {
        // If the sum exceeds k, move the left pointer to the right and reduce the sum
        while(sum > k && left < right) {
            sum -= a[left]; // Subtract the element at the left pointer from the sum
            left++; // Move the left pointer to the right
        }

        // If the current sum equals k, update the maximum length
        if(sum == k) {
            max_len = (int)Math.max(right - left + 1, max_len); // Calculate the length of the current subarray and update max_len if it is longer
        }

        // Move the right pointer to the right to include the next element in the sum
        right++;
        // Add the element at the new right pointer position to the sum, if right is still within bounds
        if(right < a.length) sum += a[right];
    }

    return max_len; // Return the length of the longest subarray with sum equal to k
}
