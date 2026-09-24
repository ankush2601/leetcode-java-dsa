class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int s = f(nums,i);
            if(s == i){
                return i;
            }
        }
        return -1;
    }
    public static int  f(int[] nums,int i){
        int sum = 0; 
        int temp = nums[i];
        while(temp != 0){
            int ld = temp % 10;
            sum += ld;
            temp /= 10;
        }
        return sum;
    }
}