class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxCount = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int zero = 0;
            for(int j = i; j < n; j++){
                //check is it 0,
              
                    if(nums[j] == 0){
                        zero++;
                    }

                    if(zero > k){
                    break;
                    }
                    else{
                        maxCount = Math.max(maxCount,j-i+1);
                    }
                
                
            }
        }
        return maxCount;
    }
}