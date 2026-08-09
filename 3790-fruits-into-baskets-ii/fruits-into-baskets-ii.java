class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        boolean visit[] = new boolean[n];
        int l = 0;
        while(l < n){
            int start = 0;
            while(start < n){
                if((fruits[l] <= baskets[start]) && visit[start] == false){
                    visit[start] = true;
                    break;
                }
                start++;
            }
            l++;
        }
        int c = 0;
        for(boolean count : visit){
            if(count == false){
                c++;
            }
        }
        return c;
    }
}