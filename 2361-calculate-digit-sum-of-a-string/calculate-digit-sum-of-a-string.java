class Solution {
    public String digitSum(String s, int k) {

        // int l = 0, r = 3, n = s.length();
        // StringBuilder sb = new StringBuilder();
        
        while(s.length() > k){
            StringBuilder sb = new StringBuilder();
            int ind = 0;

            while(ind < s.length()){
                int sum = 0;

                for(int j = ind; j < (Math.min(s.length(),ind+k)); j++){
                    sum += s.charAt(j)-'0';
                }

                sb.append(sum);
                ind += k;
            }
            
            s = sb.toString();

        }
        return s;
    }
    
}