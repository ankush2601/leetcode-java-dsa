class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] ans = new int[n];

        // Case 1: k = 0
        if (k == 0) {
            return ans;
        }

        // Case 2: k > 0
        if (k > 0) {

            int sum = 0;

            // First window
            for (int i = 1; i <= k; i++) {
                sum += code[i % n];
            }

            // Slide window
            for (int i = 0; i < n; i++) {

                ans[i] = sum;

                // Remove first element of current window
                sum -= code[(i + 1) % n];

                // Add next element
                sum += code[(i + k + 1) % n];
            }
        }

        // Case 3: k < 0
        else {

            int window = -k;
            int sum = 0;

            // First window for index 0
            for (int i = 1; i <= window; i++) {
                sum += code[(n - i) % n];
            }

            // Slide window
            for (int i = 0; i < n; i++) {

                ans[i] = sum;

                // Remove oldest element
                sum -= code[(i - window + n) % n];

                // Add new element
                sum += code[i];
            }
        }

        return ans;
    }
}