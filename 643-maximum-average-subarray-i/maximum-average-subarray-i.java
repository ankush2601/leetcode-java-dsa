class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Double.NEGATIVE_INFINITY,d = 0;
        int r = 0, l = 0, n = nums.length;
        while(r<n){
            d += nums[r];
            if((r-l+1)>k){
                d -= nums[l++];
            }
            if((r-l+1) == k){
                max = Math.max(max,d/k);
            }
            r++;
        }
        return max;
    }
}