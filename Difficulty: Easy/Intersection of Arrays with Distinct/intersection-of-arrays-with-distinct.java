import java.util.*;
class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        int count =0;
        int m=a.length;
        int n=b.length;
        Arrays.sort(a);
        Arrays.sort(b);
        
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(a[i]==b[j]){
                count++;
                i++;
                j++;
            }
            else if(a[i]>b[j]) j++;
            else i++;
            
        }
        return count;
        
    }
}