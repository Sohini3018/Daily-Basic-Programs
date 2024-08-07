class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
       
       int new_arr[] = new int[k];
       
       int i = 0, j = 0, itr = 0;
       
       while(i < arr1.length && j < arr2.length && itr < k) {
           if(arr1[i] < arr2[j]) {
               new_arr[itr] = arr1[i];
               i++;
           }else if (arr2[j] < arr1[i]) {
               new_arr[itr] = arr2[j];
               j++;
           } else {
               new_arr[itr] = arr1[i];
               i++;
           }
           
           itr++;
       }
       
       while(i < arr1.length && itr < k) {
           new_arr[itr] = arr1[i];
           i++;
           itr++;
       }
       
       while(j < arr2.length && itr < k) {
           new_arr[itr] = arr2[j];
           j++;
           itr++;
       }
       
       return new_arr[k - 1];
    }
}
