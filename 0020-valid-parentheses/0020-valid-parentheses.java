class Solution {
    public boolean isValid(String s) {
        if(s.length()==0 || s.length()%2==1){
            return false;
        }
        Map<Character,Character> parantheses = new HashMap<>();
        parantheses.put('(',')');
        parantheses.put('{','}');
        parantheses.put('[',']');
        Stack<Character> validity = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                validity.push(c);
                continue;
            }
            if(!validity.isEmpty() && c == parantheses.get(validity.peek())){
                validity.pop();
            }
            else{
                return false;
            }
        }
        if(validity.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}