class Kadanes {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;

        for(int i = 0; i < nums.length; i++)
        {
            curr_sum = curr_sum + nums[i];

            if(curr_sum > max_sum)
                max_sum = curr_sum;

            if(curr_sum < 0)
                curr_sum = 0;
        }

        return max_sum;
    }
}
