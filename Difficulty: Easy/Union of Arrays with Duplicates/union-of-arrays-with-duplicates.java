import java.util.*;
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i=0;i<a.length;i++){
            if(i>0 && a[i]==a[i-1]) continue;
           
            
            if(result.contains(a[i])){
                continue;
            }else result.add(a[i]);
        }
          for(int i=0;i<b.length;i++){
            if(i>0 && b[i]==b[i-1]) continue;
           
            
            if(result.contains(b[i])){
                continue;
            }else result.add(b[i]);
        }
        
        Collections.sort(result);
        return result;
    }
}