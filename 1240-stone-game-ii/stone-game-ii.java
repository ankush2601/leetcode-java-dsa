class Solution {

    int[][] dp;
    int[] suffix;

    public int stoneGameII(int[] piles) {
        int n = piles.length;

        dp = new int[n][n + 1];
        suffix = new int[n + 1];

        // Suffix sum
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        return solve(piles, 0, 1);
    }

    private int solve(int[] piles, int i, int M) {

        int n = piles.length;

        // Can take all remaining piles
        if (i + 2 * M >= n) {
            return suffix[i];
        }

        // Already calculated
        if (dp[i][M] != 0) {
            return dp[i][M];
        }

        int best = 0;

        // Try taking x piles
        for (int x = 1; x <= 2 * M; x++) {

            int opponent = solve(
                piles,
                i + x,
                Math.max(M, x)
            );

            int current = suffix[i] - opponent;

            best = Math.max(best, current);
        }

        return dp[i][M] = best;
    }
}