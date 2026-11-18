class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Double.NEGATIVE_INFINITY, sum = 0;
        int n =  nums.length;
        int  l = 0, r = 0;
        
        while(r < n ){
            sum += nums[r];
            if((r-l+1) > k){
                sum -= nums[l++];

            }
            if((r-l+1)==k){
                
            max = Math.max(max,sum/k);
            }
            r++;
        }
        return max;
    }
   
}