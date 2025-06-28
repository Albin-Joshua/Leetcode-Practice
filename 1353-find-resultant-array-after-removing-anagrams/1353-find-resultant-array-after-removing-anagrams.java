class Solution {
    public List<String> removeAnagrams(String[] words) {
        Stack<String> stack = new Stack<>();
        for(int i=words.length - 1; i>=0; i--){
            String s = words[i];
            if(!stack.isEmpty() && isAnagram(s,stack.peek())) stack.pop();
            stack.push(s);
        }
        List<String> result = new ArrayList<>();
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }

    public boolean isAnagram(String a, String b){
        if(a.length() != b.length()) return false;
        int[] n1 = new int[26];
        for(int i=0; i<a.length(); i++){
            n1[a.charAt(i)-'a']++;
            n1[b.charAt(i)-'a']--;
        }
        for(int j=0; j<26; j++){
            if(n1[j] != 0) return false;
        }
        return true;
    }
}