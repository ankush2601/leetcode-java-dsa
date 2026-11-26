class Solution {
    public boolean canAliceWin(int n) {
        int tar = 10, c = 0;
        while(n > 0 && n >= tar){
            n -= tar;
            tar--;
            c++;
        }
        if(tar % 2 == 1){
            return true;
        }
        return false;
    }
}