class Solution {
    int floorSqrt(int n) {
        // code here
        int sqrt=0;
        while(n>0){
            sqrt = (int)Math.sqrt(n);
        if(sqrt*sqrt == n){
            
            break;
            
        }
        n--;
            
        }
        return sqrt;
        
        
    }
}