class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        int n = arr.length;
        for(int i = 0; i < arr.length; i++){
            int currSum = 0;
            for(int j = i; j < n; j++){
                currSum += arr[j];
                if(Math.abs(i-j+1) % 2 == 1){
                    ans += currSum;
                }
            }
        }
        return ans;
    }
}