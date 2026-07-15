class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = 0;
        int evenSum = 0;
        int e = 2;
        int o = 1;
        int c = 1;
        while(c <= n){
            oddSum += o;
            evenSum += e;
            o += 2;
            e += 2;
            c = c+1; 
        }
        int min =  Math.min(oddSum,evenSum);
        int max =  Math.max(oddSum,evenSum);
        while (min != 0) {
            int rem = max % min;
            max = min;
            min = rem;
    }
    return max;
    }
}