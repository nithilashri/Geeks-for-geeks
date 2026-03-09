import java.util.*;

class Solution {

    public int findPages(int[] arr, int k) {

        int n = arr.length;
        if(k > n) return -1;

        int low = 0;
        int high = 0;

        for(int i = 0; i < arr.length; i++){
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        int ans = -1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(canAllocate(arr, k, mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }

    static boolean canAllocate(int[] arr, int k, int pages){

        int currentSum = 0;
        int count = 1;

        for(int i = 0; i < arr.length; i++){

            if(currentSum + arr[i] <= pages){
                currentSum += arr[i];
            }
            else{
                count++;
                currentSum = arr[i];
            }

            if(count > k)
                return false;
        }

        return true;
    }
}