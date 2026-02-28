class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        //using binomial coefficients
        ArrayList<Integer> result = new ArrayList<>();
        n--;
        int prev = 1;
        result.add(prev);
        
        for(int i=1;i<=n;i++){
            int curr = (prev*(n-i+1))/i;
            result.add(curr);
            prev = curr;
        }
        
        return result;
        
    }
}