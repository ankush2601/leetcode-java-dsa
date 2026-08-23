class Solution {
    public boolean sumGame(String num) {

        int len = num.length() / 2;

        int s1 = 0, s2 = 0;
        int q1 = 0, q2 = 0;

        for (int i = 0; i < len; i++) {

            if (num.charAt(i) == '?') {
                q1++;
            } else {
                s1 += num.charAt(i) - '0';
            }
        }

        for (int i = len; i < num.length(); i++) {

            if (num.charAt(i) == '?') {
                q2++;
            } else {
                s2 += num.charAt(i) - '0';
            }
        }

        int totalQ = q1 + q2;

        // Odd number of ? => Alice always wins
        if (totalQ % 2 == 1) {
            return true;
        }

        // Bob wins only if he can exactly balance the sums
        return s1 - s2 != 9 * (q2 - q1) / 2;
    }
}