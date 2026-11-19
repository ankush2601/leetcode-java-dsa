class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length; 
        Arrays.sort(nums);
        
        int n1 = Math.abs(nums[n-1] - nums[2]);
        int n2 = Math.abs(nums[n-3] - nums[0]);
        int n3 = Math.abs(nums[n-2] - nums[1]);

        return Math.min(n1,Math.min(n2,n3));
    }
}