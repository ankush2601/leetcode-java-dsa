class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int n = nums.length;
        int maxCount = 0;
        int l = 0, r = 0;
        while(r < n){
            if(nums[l] != 1 ||nums[r]  != 1){
                l = r; 
                l++;
                r++;
                continue;
            }
            maxCount=Math.max(maxCount,r-l+1);
            r++;
        }
        return maxCount;
    }
}