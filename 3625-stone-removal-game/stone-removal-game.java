class Solution {
    public boolean canAliceWin(int n) {
        int tar = 10, c = 0;
        while(n >= tar){
            n -= tar;
            tar--;
            c++;
        }
        return c%2==1;
    }
}