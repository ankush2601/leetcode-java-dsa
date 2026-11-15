
class Solution {
    public int numOfSubarrays(int[] arr) {

        int even = 1, odd = 0;
        int sum = 0, c = 0;
        int mod = 1000000007;

        for (int num : arr) {

            sum += num;

            if (sum % 2 == 0) {
                c = (c + odd) % mod;
                even++;
            } else {
                c = (c + even) % mod;
                odd++;
            }
        }

        return c;
    }
}
