class Solution {
    public int minMoves(int[] nums) {
        int mov = 0;
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int x:nums){
            max = Math.max(max,x);
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += Math.abs(nums[i]-max);
        }
        return sum;
    }
}