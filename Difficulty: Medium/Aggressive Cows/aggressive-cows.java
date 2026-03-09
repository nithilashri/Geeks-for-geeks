import java.util.*;
class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n = stalls.length;
        int low = 1;
        int high = stalls[n-1] - stalls[0];
        int ans = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(checkDist(stalls,k,mid)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        
        return ans;
        
        
    }
    
    static boolean checkDist(int[] stalls, int k, int dist){
        int currentDist = stalls[0];
        int cows = 1;
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-currentDist>=dist){
                cows++;
                currentDist = stalls[i];
                
                
            }
        }
        if(cows>=k){
            return true;
        }else{
            return false;
        }
        
    }
}