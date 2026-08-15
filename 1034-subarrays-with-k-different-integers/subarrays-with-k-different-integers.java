class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        int ans = f(nums,k)-f(nums,k-1);
        return ans;
    }
    public static int f(int[] nums, int k){
        int n = nums.length;
        int l = 0, r = 0;
        int maxCount = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r<n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);

            while(map.size() > k){                
                map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                }
                l++;
            }
            
            maxCount += (r-l+1);
            r++;
        }
        return maxCount;
    }
}