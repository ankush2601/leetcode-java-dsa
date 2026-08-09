class Solution {
    public boolean stoneGame(int[] piles) {
        int a = 0;
        int b = 0;
        int max = 0;
        for(int i = 0; i < piles.length-1; i++){
            if(i % 2 == 0){                
                a += Math.max(piles[i],piles[i+1]);
            }
            else{
                b += piles[i];
            }
        } 
        return a>b?true:false;
    }
}