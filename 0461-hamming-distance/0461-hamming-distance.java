class Solution {
    public int hammingDistance(int x, int y) {
        int n=x^y;
        int res=0;
        for(int i=0; i<31; i++){
            if(((n>>i)&1)==1) res++;
        }
        return res;
    }
}