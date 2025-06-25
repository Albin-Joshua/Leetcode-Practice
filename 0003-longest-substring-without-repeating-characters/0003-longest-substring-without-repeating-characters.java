/*Implemented using SlidingWindow concept.
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> string = new HashSet<>();
        int result = 0;
        int left = 0;
        for(int right=0; right<s.length(); right++){
            while(string.contains(s.charAt(right))){
                string.remove(s.charAt(left));
                left++;
            }
            string.add(s.charAt(right));
            result = Math.max(result, right-left+1);
        }
        return result;
    }
}
*/

/*Instead of using while loop inside the for loop to move the left pointer to move from duplicate elements
we can use HASHMAP to store the value of last occurence of the character already appeared*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> duplicate = new HashMap<>();
        int result = 0;
        int left = 0;
        for(int right = 0;right<s.length(); right++ ){
            if(duplicate.containsKey(s.charAt(right))){
                left = Math.max(left, duplicate.get(s.charAt(right))+1);
            }
            duplicate.put(s.charAt(right), right);
            result = Math.max(result, right-left+1);
        }
        return result;
    }
}