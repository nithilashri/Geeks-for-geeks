// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int num = n;
        int reverse =0;
        int digit =0;
        
        while(num>0){
            digit = num%10;
            reverse = reverse*10 + digit;
            num = num/10;
            
            
            
        }
        
        return reverse;
    }
}