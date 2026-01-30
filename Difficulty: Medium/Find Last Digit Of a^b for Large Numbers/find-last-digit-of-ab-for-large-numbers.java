class Solution {
    static int getLastDigit(String a, String b) {

        // Case 1: a^0 = 1
        if (b.equals("0"))
            return 1;

        // Step 1: take last digit of a
        int base = a.charAt(a.length() - 1) - '0';

        // Case 2: base = 0
        if (base == 0)
            return 0;

        // Step 2: find b % 4
        int exp = 0;
        for (int i = 0; i < b.length(); i++) {
            exp = (exp * 10 + (b.charAt(i) - '0')) % 4;
        }

        if (exp == 0)
            exp = 4;

        // Step 3: multiply only exp times
        int ans = 1;
        for (int i = 0; i < exp; i++) {
            ans = (ans * base) % 10;
        }

        return ans;
    }
}
