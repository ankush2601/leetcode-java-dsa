class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int l = 0, r = 0, maxCount = 0;
        int p = 1;
        if(k <= 1){
            return 0;
        }
        while(r < n){
            p  *= nums[r];
            while(p >= k){
                p = p / nums[l];
                l++;
            }
            maxCount += (r-l+1);
            r++;
        }
        return maxCount;
    }
}