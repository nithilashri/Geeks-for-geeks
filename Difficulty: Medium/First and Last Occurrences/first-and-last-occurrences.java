class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        int low =0;
        int n = arr.length-1;
        while(low<=n){
            if(arr[low]==x){
                result.add(low);
                break;
            }
            low++;
        }
        
        while(n>=0){
            if(arr[n]==x){
                result.add(n);
                return result;
            }
            
            n--;
        }
         result.add(-1);
         result.add(-1);
        
        return result;
        
        
    }
}
