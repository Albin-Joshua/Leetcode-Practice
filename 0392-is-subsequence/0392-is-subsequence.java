class Solution {
    public boolean isSubsequence(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        int[][] arr = new int[l1+1][l2+1];
        for(int i=1; i<=l1; i++){
            for(int j=1; j<=l2; j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    arr[i][j] = arr[i-1][j-1]+1;
                }
                else{
                    arr[i][j] = Math.max(arr[i-1][j] , arr[i][j-1]);
                }
            }
        }
        return arr[l1][l2]==l1;
    }
}