// User function Template for Java

class Solution {
    public String longestCommonPrefix(String arr[]) {
        Arrays.sort(arr);
        String min_string = arr[0];
        int min = min_string.length();
        
        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < min_string.length(); j++) {
                if(arr[i].charAt(j) != min_string.charAt(j)) {
                    min = Math.min(min, j);
                    break;
                }
            }
        }
        if(min == 0) {
            return "-1";
        } else {
            return min_string.substring(0, min);
        }
    }
}
