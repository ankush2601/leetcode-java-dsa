class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
                continue;
            }
            break;
            
        }
        while(true){
            if(set.contains(sum)){
                sum++;
                continue;
            }
            return sum;        
        }
   //     return -1;
    }
}