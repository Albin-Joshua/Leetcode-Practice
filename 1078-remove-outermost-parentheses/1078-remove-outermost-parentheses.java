class Solution {
    public String removeOuterParentheses(String s) {
        int l=0;
        int r=0;
        int sum=0;
        StringBuilder res = new StringBuilder();
        while(r<s.length()){
            if(s.charAt(r)=='(') sum++;
            else sum--;
            if(sum==0){
                res.append(s.substring(l+1,r));
                l=r+1;
            }
            r++;
        }
        return res.toString();
    }
}