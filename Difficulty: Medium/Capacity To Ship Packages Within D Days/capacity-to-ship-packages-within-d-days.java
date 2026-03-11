// User function Template for Java

class Solution {
    static int leastWeightCapacity(int[] arr, int n, int d) {
        // code here
        int high =0;
        int low =0;
        for(int i=0;i<n;i++){
            low = Math.max(low,arr[i]);
            high += arr[i];
        }
        int ans = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(hasCapacity(arr,d,mid)){
                ans = mid; 
                high = mid-1;
                
            }else{
                low = mid+1;
            }
        }
        
        return ans;
        
    }
    
    static boolean hasCapacity(int[] arr, int d, int capacity){
        int currentWeight = 0;
        int days = 1;
        for(int w : arr){
            if(currentWeight+w<=capacity){
                currentWeight+=w;
            }else{
                days++;
                currentWeight=w;
            }
            if(days>d){
                return false;
            }
        }
        
        return true;
    }
};