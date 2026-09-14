class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        for(int i = 0; i < k; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                ans++;
            }
        }
        int count = ans;
        int l = 0, r = k; 
        while(r < s.length()){
            char c1 = s.charAt(r);
            char c2 = s.charAt(l);
            if(c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u'){
                count++;
              
            }
            if(c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u'){
                count--;
              
            }
            r++;
            l++;
            //max count
            ans = Math.max(ans,count);
        }
        return ans;
    }
}