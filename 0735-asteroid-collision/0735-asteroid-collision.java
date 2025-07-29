class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i : asteroids){
            while(!stack.isEmpty() && i<0 && stack.peek()>0){
                if(stack.peek()<-i){
                    stack.pop();
                    continue;
                }
                else if(stack.peek() == -i){
                    stack.pop();
                }
                i=0;
                break;
            }
            if(i!=0) stack.push(i);
        }
        int size = stack.size();
        int[] result = new int[size];
        for(int i=size-1; i>=0; i--){
            result[i] = stack.pop();
        }
        return result;
    }
}