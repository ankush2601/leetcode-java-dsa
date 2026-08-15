class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       
        int ans = f(nums,goal)-f(nums,goal-1);
        return ans;
   }
   public static int f(int[] nums, int goal){
     int count = 0,n = nums.length,l=0, r=0,sum=0;
        while(r < n){
            if(goal<0){
                return 0;
            }
            while(r<n){
                sum+= nums[r];
                while(sum>goal){
                    sum -= nums[l];
                    l++;
                }
                count += (r-l+1);
                r++;
            }
        }
        return count;
   }
}