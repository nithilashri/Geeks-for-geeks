// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        
        int temp;
        int n = arr.length;
        for(int i=0;i<arr.length-1;i++){
            temp=arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
        }
        
        
        
        
        // code here
        
        
        
    }
}