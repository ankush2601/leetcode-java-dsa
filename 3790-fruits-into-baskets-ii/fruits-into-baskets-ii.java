class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        boolean visit[] = new boolean[n];
        for(int i = 0; i < n; i++){
            //int f = fruits[i];
            for(int j = 0; j < n; j++){
               // int b = baskets[j];
                if((baskets[j] >= fruits[i] ) && visit[j] ==false){
                    visit[j] = true;
                    break;
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(visit[i] == false){
                ans++;
            }
        }
        return ans;
    }
}