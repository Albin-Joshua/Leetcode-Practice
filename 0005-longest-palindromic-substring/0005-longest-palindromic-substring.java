class Solution {
    public String longestPalindrome(String s) {
        int resultLen = 0;
        int resultIndex = 0;

        for(int i=0; i<s.length(); i++){
            int l=i;
            int r=i;
            
            //Odd length possibility check
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(resultLen < r-l+1){
                    resultIndex = l;
                    resultLen = r-l+1;
                }
                l--;
                r++;
            }
            
            //even length possibility check
            l=i;
            r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(resultLen < r-l+1){
                    resultIndex = l;
                    resultLen = r-l+1;
                }
                l--;
                r++;
            }
        }
        return s.substring(resultIndex, resultIndex+resultLen);
    }
}