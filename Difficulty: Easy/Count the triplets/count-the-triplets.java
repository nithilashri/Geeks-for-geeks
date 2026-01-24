import java.util.Arrays;

class Solution {
    int countTriplet(int arr[]) {

        int n = arr.length;
        if (n < 3) return 0;

        Arrays.sort(arr);
        int count = 0;

        
        for (int k = n - 1; k >= 2; k--) {

            int i = 0;
            int j = k - 1;

            
            while (i < j) {
                int sum = arr[i] + arr[j];

                if (sum == arr[k]) {
                    count++;
                    i++;
                    j--;
                } 
                else if (sum < arr[k]) {
                    i++;
                } 
                else {
                    j--;
                }
            }
        }

        return count;
    }
}
