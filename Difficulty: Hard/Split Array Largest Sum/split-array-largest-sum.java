class Solution {
    public int splitArray(int[] arr, int k) {
        // code here
        
        int low =0;
        int high =0;
        for(int i=0;i<arr.length;i++){
            low = Math.max(low, arr[i]);
            high += arr[i];
        }
        int ans = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(checkSplit(arr,k,mid)){
                ans = mid;
                high = mid-1;;
            }else{
                low = mid +1;
            }
        }
        
        return ans;
        
    }
    
    static boolean checkSplit(int[] arr, int k, int split){
        int currentSum = 0;
        int currSplit = 1;
        for(int i=0;i<arr.length;i++){
            if(currentSum+arr[i]<=split){
                currentSum+=arr[i];
            }else{
                currentSum = arr[i];
                currSplit++;
            }
            
            if(currSplit>k){
                return false;
            }
        }
        return true;
    }
};