import java.util.*;
class Solution {
    public boolean findTriplets(int[] arr) {
        Arrays.sort(arr);
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            int lo=i+1;
            int hi=n-1;
            while(lo<hi){
                int sum = arr[i]+arr[lo]+arr[hi];
                if(sum==0) return true;
                else if(sum<0){
                    lo++;
                }else hi--;
            }
        }
        return false;
        
        
        // code here.
    }
}