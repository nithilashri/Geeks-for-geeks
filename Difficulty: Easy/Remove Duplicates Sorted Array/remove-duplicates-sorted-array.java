class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int f=0;
        int m = f+1;
         while(f<arr.length){
            
           
           
           while(m<arr.length && arr[m]==arr[f] ) m++;
           result.add(arr[f]);
            f=m;
                
                
            
            
           
            
            
        
            
        }
        return result;
    }
}
