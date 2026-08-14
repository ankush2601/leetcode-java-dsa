class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];

        int l = 0;
        int maxLen = 0;

        for (int r = 0; r < s.length(); r++) {

            int idx = s.charAt(r) - 'a';
            freq[idx]++;

            if (freq[idx] > 2) {

                while (s.charAt(l) != s.charAt(r)) {
                    freq[s.charAt(l) - 'a']--;
                    l++;
                }

                // remove the extra occurrence
                freq[idx]--;
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}
