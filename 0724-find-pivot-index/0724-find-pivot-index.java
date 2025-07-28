class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] l = new int[n];
        int[] r = new int[n];
        l[0] = 0;
        r[n-1] = 0;
        for(int i=1; i<n; i++){
            l[i] = l[i-1] + nums[i-1];
        }
        for(int i=n-2; i>=0; i--){
            r[i] = r[i+1] + nums[i+1];
        }
        int res=-1;
        for(int i=0; i<n; i++){
            if(l[i]==r[i]){
                res=i;
                break;
            }
        }
        return res;
    }
}