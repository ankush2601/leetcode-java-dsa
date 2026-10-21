
class Solution {
    public int minOperations(String s) {
        int n = s.length();

        // Step 1: Check if already sorted
        boolean sorted = true;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            return 0;
        }

        // Step 2: Cannot sort an unsorted string of length 2
        if (n == 2) {
            return -1;
        }

        // Step 3: Find minimum and maximum characters
        char minChar = 'z';
        char maxChar = 'a';

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            minChar = (char) Math.min(minChar, c);
            maxChar = (char) Math.max(maxChar, c);
        }

        // Step 4: One operation is sufficient
        if (s.charAt(0) == minChar ||
            s.charAt(n - 1) == maxChar) {
            return 1;
        }

        // Step 5: Check interior characters
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == minChar ||
                s.charAt(i) == maxChar) {
                return 2;
            }
        }

        // Step 6: Otherwise, three operations are required
        return 3;
    }
}
