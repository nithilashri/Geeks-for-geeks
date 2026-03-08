class Solution {

    public int minTime(int[] arr, int k) {

        int low = 0;
        int high = 0;

        for(int i = 0; i < arr.length; i++){
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        int ans = high;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(checkPartition(arr, k, mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }


    static boolean checkPartition(int[] arr, int k, int highPart){

        int currentSum = 0;
        int painters = 1;

        for(int i = 0; i < arr.length; i++){

            if(currentSum + arr[i] <= highPart){
                currentSum += arr[i];
            }
            else{
                painters++;
                currentSum = arr[i];
            }

            if(painters > k)
                return false;
        }

        return true;
    }
}