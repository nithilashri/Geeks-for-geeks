// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int rem =0;
        int count =0;
        int num = n;
        while(num >0){
            rem = num%10;
            num = num/10;
            if(rem!=0 && n%rem==0 ) count ++;
            
        }
        
        return count;
    }
}