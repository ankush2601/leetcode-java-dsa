
class Solution {
    public int maxLength(int[] nums) {
        int res = 0, n = nums.length;

        for(int i = 0; i < n; i++){
            int prod = 1, gcd = 0, lcm = 1;

            for(int j = i; j < n; j++){
                prod *= nums[j];

                gcd = f_gcd(gcd, nums[j]);
                lcm = f_lcm(lcm, nums[j]);

                if(prod == gcd * lcm){
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }

    public static int f_gcd(int a, int b){
        while(b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int f_lcm(int a, int b){
        return (a / f_gcd(a, b)) * b;
    }
}
