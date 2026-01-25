import java.util.*;
class Solution {
    int thirdLargest(int arr[]) {
         Arrays.sort(arr);
        int n=arr.length;
        
        
        if(arr.length<=2) return -1;
        
       
        else return arr[n-3];
        
        
        // Your code here
      
    }
}