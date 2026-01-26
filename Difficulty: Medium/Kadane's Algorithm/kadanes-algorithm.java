class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n = arr.length;
        if(n==1) return arr[0];
        int maxi = arr[0];
        int res = arr[0];
        for(int i=1;i<n;i++){
            maxi = Math.max(arr[i],arr[i]+maxi);
            res=Math.max(maxi, res);
            
        }
        return res;
        
    }
}
