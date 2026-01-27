class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int ans = arr[0];
        for(int i=0;i<n;i++){
            leftProduct = leftProduct== 0?1:leftProduct;
            rightProduct = rightProduct ==0?1:rightProduct;
            
            leftProduct*=arr[i];
            rightProduct*= arr[n-i-1];
            ans = Math.max(ans,Math.max(leftProduct,rightProduct));
        }
        
        return ans;
    }
}