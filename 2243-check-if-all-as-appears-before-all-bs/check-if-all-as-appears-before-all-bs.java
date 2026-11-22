class Solution {
    public boolean checkString(String s) {
        int start = s.indexOf('b');
        if(start != -1){
            for(int i = start; i < s.length(); i++){
                if(s.charAt(i) == 'a'){
                    return false;
                }
            }
        }
        return true;
    }
}