class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        int low=0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==k){
                return true;
            }
            if (arr[mid]>k){
               high = mid-1;
            }else{
                
                low = mid+1;
                
            }
            
            
        }
        
        return false;
        
            
        
    }
}