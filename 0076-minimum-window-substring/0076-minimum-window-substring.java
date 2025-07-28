class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> countS = new HashMap<>();

        for(char c: t.toCharArray()){
            countT.put(c, countT.getOrDefault(c,0)+1);
        }
        int have=0;
        int need=countT.size();
        int l=0;
        int[] res = {-1,-1};
        int resLen = Integer.MAX_VALUE;

        for(int r=0; r<s.length(); r++){
            countS.put(s.charAt(r), countS.getOrDefault(s.charAt(r), 0)+1);

            if(countT.containsKey(s.charAt(r))  && countT.get(s.charAt(r)).equals(countS.get(s.charAt(r)))){
                have++;
            }
            while(have==need){
                if((r-l+1) < resLen){
                    resLen = r-l+1;
                    res[0] = l;
                    res[1] = r;
                }
                char c = s.charAt(l);
                countS.put(c, countS.get(c)-1);
                if(countT.containsKey(c) && countS.get(c)<countT.get(c)){
                    have--;
                }
                l++;
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1]+1);
    }
}