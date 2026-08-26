class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int l = 0;
        int ones = 0;
        String res = "";

        for (int r = 0; r < s.length(); r++) {

            if (s.charAt(r) == '1') {
                ones++;
            }

            while (ones > k) {
                if (s.charAt(l) == '1') {
                    ones--;
                }
                l++;
            }

            // Remove unnecessary leading zeros
            while (l <= r && s.charAt(l) == '0' && ones == k) {
                l++;
            }

            if (ones == k) {
                String curr = s.substring(l, r + 1);

                if (res.equals("") ||
                    curr.length() < res.length() ||
                    (curr.length() == res.length() && curr.compareTo(res) < 0)) {
                    res = curr;
                }
            }
        }

        return res;
    }
}