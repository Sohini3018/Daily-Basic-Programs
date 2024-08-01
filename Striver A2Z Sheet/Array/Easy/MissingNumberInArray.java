class Solution {
    public int missingNumber(int[] nums) {
        // bruteforce
        // search for each number in each iteration of the array

        for(int num = 0; num <= nums.length; num++) {
            // initial flag
            int flag = 0;

            for(int i = 0; i < nums.length; i++) {
                // check if the number matches with any element in array
                // then turn the flag 1 and break that particular iteration
                if(nums[i] == num) {
                    flag = 1;
                    break;
                }
            }

            // with each number check what's it's  flag
            // if flag 0 means none matched and the array was fully searched
            if(flag == 0) {
                return num;
            }
        }
        return 0;
    }

    public int missingNumber(int[] nums) {
        // better
        // we will use present array

        int present[] = new int[nums.length + 1];

        // assign 1 for the number that is present
        for(int i = 0; i < nums.length; i++) {
            int index = nums[i];
            present[index] = 1;
        }

        // so the number which is not there in nums
        // will still have 0 in present array
        // search that index which has 0 
        for(int i = 0; i < present.length; i++) {
            if(present[i] == 0) {
                return i;
            }
        }

        return -1;
        
    }


    public int missingNumber(int[] nums) {
        // optimal
        // we will use sum method

        int arr_sum = 0;
        for(int i = 0; i < nums.length; i++) {
            arr_sum += nums[i];
        }

        int n = nums.length; // because we have 0 so nums length is n
        int actual_sum = n * (n + 1) / 2;

        return (actual_sum - arr_sum);
    }

    public int missingNumber(int[] nums) {
        // optimal
        // we will use xor method

        int arr_xor = nums[0];
        for(int i = 1; i < nums.length; i++) {
            arr_xor = arr_xor ^ nums[i];
        }

        int actual_xor = 0;
        for(int i = 1; i <= nums.length; i++) {
            actual_xor = actual_xor ^ i;
        }
        // try to use this in single loop
        // O(2n) --> O(n)

        return (arr_xor ^ actual_xor);
    }
}
