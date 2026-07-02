class Solution {
    public boolean isPalindrome(int x) {
       // x=Math.abs(x);
        String s=String.valueOf(x);
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)-'0'!=s.charAt(r)-'0'){
                return false;
            }
            l++;
            r--;

        }
        return true;
    }
}