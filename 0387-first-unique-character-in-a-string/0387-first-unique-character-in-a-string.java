class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(count[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;

        // Map<Character,Integer> freq =new HashMap<>();
        // for(int i=0; i<s.length(); i++){
        //     freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        // }
        // for(int i=0; i<s.length(); i++){
        //     if(freq.get(s.charAt(i))==1){
        //         return i;
        //     }
        // }
        // return -1;
    }
}