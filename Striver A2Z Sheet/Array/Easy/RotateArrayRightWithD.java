class Solution {
    public void rotate(int[] nums, int k) {
        // brute force
        int len = nums.length;
        k = k % len;
        if(k > len) return;
        int[] temp = new int[len];

        for(int i = len - k, j = 0; i < len; i++) {
            temp[j] = nums[i];
            j++;
        }

        for(int i = 0, j = k; i < len - k; i++) {
            temp[j] = nums[i];
            j++;
        }

        for(int i = 0; i < len; i++) {
            nums[i] = temp[i];
        }
    }
}
