class Solution {
    public int smallestNumber(int n, int t) {
        
        int temp = n;
        while(true){
            int product = prod(n);
            if(product % t == 0){
                return n;
            }
            n++;
        }
    }
    public static int prod(int n){
        int temp = n;
        int prd = 1;
        while(temp != 0){
            prd *= temp % 10;
            temp /= 10;
        }
        return prd;
    }
}