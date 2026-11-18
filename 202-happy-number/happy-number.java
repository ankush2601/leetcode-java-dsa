class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while(n > 1){
            n = sum(n);
          
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            
        }

        return true;
    }
    public static int sum(int num){
        int ans = 0; 
        while(num != 0){
            int ld = (num % 10);
            ans += ld*ld;
            num /= 10;
        }
        return ans;
    }
}