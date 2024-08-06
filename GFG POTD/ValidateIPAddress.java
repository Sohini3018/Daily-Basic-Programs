class Solution {

    public boolean isValid(String str) {
        String[] arr = str.split("\\.");
        
        if(arr.length != 4) return false;
        
        for(int i = 0; i < arr.length; i++) {
            // check if the string segment is empty
            // if not 0 then length should be >1
            // then check first char should not be 0
          if(arr[i].isEmpty() || (arr[i].charAt(0) == '0' && arr[i].length() > 1))
            return false;
          int num;
          
          // if exception is there that means not a valid number
          // return false in case of that
          try {
              num = Integer.parseInt(arr[i]);
          } catch (Exception e) {
              return false;
          }
          
          if(num < 0 || num > 255) return false;
        }
      
      return true;
    }
}
