import java.util.*;

class Solution {

    static class Fenwick {
        int[] bit;

        Fenwick(int n) {
            bit = new int[n + 2];
        }

        void add(int idx, int val) {
            while (idx < bit.length) {
                bit[idx] += val;
                idx += idx & -idx;
            }
        }

        int sum(int idx) {
            int ans = 0;
            while (idx > 0) {
                ans += bit[idx];
                idx -= idx & -idx;
            }
            return ans;
        }
    }

    public long countRatioSubarrays(int[] nums, int a, int b) {

        int n = nums.length;

        long[] pref = new long[n + 1];

        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] + (nums[i] % 2 == 1 ? a : -b);
        }

        long[] sorted = pref.clone();
        Arrays.sort(sorted);

        HashMap<Long, Integer> map = new HashMap<>();
        int rank = 1;

        for (long x : sorted) {
            if (!map.containsKey(x))
                map.put(x, rank++);
        }

        Fenwick ft = new Fenwick(rank);

        long ans = 0;

        for (int i = 0; i <= n; i++) {

            int r = map.get(pref[i]);

            ans += ft.sum(r);

            ft.add(r, 1);
        }

        return ans;
    }
}