class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int temp = 0;
        int temp1 = 0;
        for(String str : operations){
            if(str.equals("C")){
                stack.pop();
            }
            else if(str.equals("D")){
                temp = stack.peek();
                temp *= 2;
                stack.push(temp);
            }
            else if(str.equals("+")){
                temp = stack.pop();
                temp1 = temp + stack.peek();
                stack.push(temp);
                stack.push(temp1);
            }
            else{
                stack.push(Integer.parseInt(str));
            }
        }
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        return sum;
    }
}