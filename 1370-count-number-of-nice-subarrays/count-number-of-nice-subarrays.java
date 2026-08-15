class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       
        return f(nums,k)-f(nums,k-1);
    }
    public static int f(int[] nums,int k ){
        int c = 0, n = nums.length, l=0,r=0;
        int odd = 0,even=0;
        int maxCount=0;
        while(r < n){
            if(nums[r]%2 !=0){
                odd++;
                even =0;
            } 
            
                while(odd>k){
                    if(nums[l] % 2 != 0){
                        odd--;
                        l++;
                    }
                    else{
                        l++;
                    }
                }
            
            
            maxCount = maxCount+(r-l+1);
            r++;
        }
        return maxCount;
    }
}