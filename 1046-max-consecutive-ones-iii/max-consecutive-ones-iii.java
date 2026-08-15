class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxCount = 0, l = 0, r = 0, zero=0;
        int n = nums.length;
        while(r < n){
            if(nums[r]==0){
                zero++;
            }
            if(zero>k){
                while(zero>k){
                    if(nums[l]==0){
                        zero--;
                        l++;
                    }
                    else{
                        l++;
                    }
                }
            }
            maxCount = Math.max(maxCount,r-l+1);
            r++;
        }
        return maxCount;
    }
}