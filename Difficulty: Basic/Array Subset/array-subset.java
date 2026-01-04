
import java.util.Arrays;
class Solution {
    public boolean isSubset(int a[], int b[]) {
        
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        int m=a.length;
        int n=b.length;
        while(i<m && j<n){
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]==b[j]){
                i++;
                j++;
            }
            else if(a[i]>b[j]){
                return false;
            }
             
        }
        return j==n;
        
    }
}
        // Your code here
        