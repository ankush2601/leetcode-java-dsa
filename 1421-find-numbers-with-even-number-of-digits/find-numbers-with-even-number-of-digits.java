class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
       for(int num:nums){
           boolean res = f(num);
           if(res == true){
            ans++;
           }
       }
       return ans;
    }
    public static boolean f(int num){
        int dig = 0;
        while(num != 0){
            num /= 10;
            dig++;
        }
        if(dig % 2 == 0){
            return true;
        }
        return false;
    }
}