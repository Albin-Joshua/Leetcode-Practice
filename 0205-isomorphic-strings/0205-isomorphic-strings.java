class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] s1 = new int[256];
        int[] t1 = new int[256];
        for(int i=0; i<s.length(); i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if(s1[cs]!=t1[ct]) return false;

            s1[cs] = i+1;
            t1[ct] = i+1;
        }
        return true;
    }
}