class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lSum = 0, rSum = 0;
        int temp = k -1;
        while(temp >= 0){
            lSum += cardPoints[temp];
            temp--;
        }
        int max = lSum;
        int rInd = cardPoints.length-1;  //for right sum
        k = k - 1; 
        while(k >= 0){
            lSum = lSum - cardPoints[k];
            rSum += cardPoints[rInd];
            rInd--;
            k--;
            max = Math.max(max,lSum+rSum);
        }
    return max;
    }
}