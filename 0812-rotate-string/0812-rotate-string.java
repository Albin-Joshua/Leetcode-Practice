class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        int n = s.length();
        String temp = s;
        for(int i=0; i<n; i++){
            StringBuilder r = new StringBuilder();
            r.append(temp.charAt(n-1)).append(temp.substring(0,n-1));
            temp = r.toString();
            if(temp.equals(goal)){
                return true;
            }
        }
        return false;
    }
}