class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] inComing = new int[n+1];
        int[] outGoing = new int[n+1];

        for(int[] num:trust){
            inComing[num[0]]++;//0 trusts 1, so 0 indexed believed 1 indexed
            outGoing[num[1]]++;//1 getting trusted by 0, so 1 indexed gains trust
        }
        for(int i=1; i<=n; i++){
            if(inComing[i]==0 && outGoing[i]==n-1) return i;// i believes in 0 people and he is believed by n-1 people(neglecting himself)
        }
        return -1;
    }
}