class Solution {
    public boolean validPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        int count = 0;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return isPalindrome(s, l+1, r) || isPalindrome(s, l, r-1);
            }
            l++;
            r--;
        }
        return true;
    }
    public static boolean isPalindrome(String s, int l, int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}