class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            result.add(0);
            
        }
        
        for(int i=0;i<n;i++){
            int index = arr[i]-1;
            result.set(index, result.get(index)+1);
        }
        
        return result;
    }
}
