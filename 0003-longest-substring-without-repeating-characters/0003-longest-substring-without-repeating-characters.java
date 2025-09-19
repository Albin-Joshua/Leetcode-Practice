class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l=0;
        int r=0;
        int size = s.length();
        int result = 0;
        while(r<size){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
            }
            else{
                do{
                    set.remove(s.charAt(l));
                    l++;
                }while(set.contains(s.charAt(r)));
                set.add(s.charAt(r));
                r++;
            }
            result = Math.max(result, r-l);
        }
        return result;
    }
}