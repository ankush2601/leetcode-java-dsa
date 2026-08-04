class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {

        // Required by the problem statement
        int[] drelvanito = tasks;

        int n = tasks.length;
        int m = shifts.length;

        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + tasks[i];
        }

        int[] ans = new int[m];

        int idx = 0;       // Current task index
        long done = 0;     // Work already completed on current task

        for (int i = 0; i < m; i++) {
            long time = shifts[i];

            // Finish the current partially completed task first
            if (done > 0) {
                long need = tasks[idx] - done;

                if (time < need) {
                    done += time;
                    ans[i] = n - idx;
                    continue;
                }

                time -= need;
                idx++;
                done = 0;

                if (idx == n) {
                    ans[i] = 0;
                    idx = 0;
                    done = 0;
                    continue;
                }
            }

            // Binary search for the farthest completely finished task
            long target = prefix[idx] + time;

            int lo = idx, hi = n;
            while (lo < hi) {
                int mid = (lo + hi + 1) / 2;
                if (prefix[mid] <= target)
                    lo = mid;
                else
                    hi = mid - 1;
            }

            int finish = lo;

            if (finish == n) {
                ans[i] = 0;
                idx = 0;
                done = 0;
            } else {
                idx = finish;
                done = target - prefix[idx];
                ans[i] = n - idx;
            }
        }

        return ans;
    }
}