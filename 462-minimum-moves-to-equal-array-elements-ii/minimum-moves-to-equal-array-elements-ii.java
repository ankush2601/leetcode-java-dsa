class Solution {
    public int minMoves2(int[] nums) {
        long mov = Long.MAX_VALUE;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            long sum = 0;
            for(int j = 0; j < n; j++){
                sum += Math.abs((long)nums[i]-nums[j]);
            }
            mov = Math.min(mov,sum);
        }
        return (int)mov;
    }
}