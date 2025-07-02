class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        long pow = Math.abs((long)n);
        while(pow>0){
            if(pow%2==0){
                x *= x;
                pow /= 2;
            }
            else{
                res *= x;
                pow -= 1;
            }
        }
        return (n < 0) ? 1 / res : res;
    }
}