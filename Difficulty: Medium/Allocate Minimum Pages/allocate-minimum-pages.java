class Solution {
    public int findPages(int[] arr, int k) {
        // code here
      int n = arr.length;
      if(k>n){
          return -1;
      }
      int low =0;
      int high = 0;
      int ans = -1;
      for(int i=0;i<arr.length;i++){
          low = Math.max(low, arr[i]);
          high = high + arr[i];
      }
      
      while(low<=high){
          int mid = low + (high-low)/2;
          if(findMaxPage(arr,k,mid)){
              ans = mid;
              high = mid - 1;
          }else{
              low=mid+1;
          }
      }
      
      return ans;
      
      
      
      
      
      
      
        
        
        
    }
    
    static boolean findMaxPage(int[] arr, int k, int maxPage){
        int student =1;
        int pages =0;
        for(int i=0;i<arr.length;i++){
            if(pages+arr[i]<=maxPage){
                pages+=arr[i];
            }else{
                student++;
                pages = arr[i];
            }
            if(student>k){
            return false;
        }
        }
        
        
        return true;
        
    }
}