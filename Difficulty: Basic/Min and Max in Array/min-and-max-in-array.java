class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> minmax = new ArrayList<>();
        
        int n = arr.length;
        int min = arr[0];
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min) min = arr[i];
        }
        minmax.add(min);
        
        for(int i=1;i<n;i++){
            if(arr[i]>max) max=arr[i];
        }
        minmax.add(max);
        
        return minmax;
        
        
        
        
        
    }
}
