class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int c = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int x = 0, y = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[j] % 2== 0){
                    x++;
                }
                else{
                    y++;
                }
                if(y > 0){
                    if((long)(x*b) <= (long)(a*y)){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}