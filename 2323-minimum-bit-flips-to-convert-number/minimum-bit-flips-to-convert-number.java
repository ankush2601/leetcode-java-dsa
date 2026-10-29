class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = start ^ goal;
        int count = 0;
        while(ans != 0){
            int bit = ans % 2;
            ans /= 2;
            if(bit == 1) count++;
        }
        return count;
    }
}