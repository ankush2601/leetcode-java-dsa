class Solution {
    public long sumAndMultiply(int n) {
        long ans = 0;
        int sum = 0;
        String str = String.valueOf(n);
        for(int i=0; i<str.length(); i++){
            int ld = str.charAt(i) - '0';
            if((ld) != 0)
            ans = ans*10 + (ld);
            sum += ld;
            
        }
        return ans*sum;
    }
}