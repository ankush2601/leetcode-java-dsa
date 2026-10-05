class Solution {
    public int hammingWeight(int n) {
        int c = 0;
        while(n != 0){
            c += (n & 1); //if n is odd then add 1 in c;
            n = n >> 1;     //this mean n/2
        }
        return c;
    }
}