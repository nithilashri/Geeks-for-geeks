class Solution {
    public int kthElement(int a[], int b[], int k) {

        int m = a.length, n = b.length;
        int i = 0, j = 0, count = 0;

        while (i < m && j < n) {
            if (a[i] <= b[j]) {
                count++;
                if (count == k) return a[i];
                i++;
            } else {
                count++;
                if (count == k) return b[j];
                j++;
            }
        }

       
        while (i < m) {
            count++;
            if (count == k) return a[i];
            i++;
        }

    
        while (j < n) {
            count++;
            if (count == k) return b[j];
            j++;
        }

        return -1; 
}
}