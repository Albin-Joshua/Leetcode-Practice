class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int n = prices.length;
        int[] answers = new int[n];
        stack.push(prices[n-1]);
        answers[n-1] = prices[n-1];
        for(int i=n-2; i>=0 ; i--){
            if(!stack.isEmpty() && prices[i] >= stack.peek()){
                answers[i] = prices[i] - stack.peek();
                stack.push(prices[i]);
                continue;
            }
            while(!stack.isEmpty() && prices[i] < stack.peek()){
                stack.pop();
            }
            if(!stack.isEmpty()){
                answers[i] = prices[i] - stack.peek();
            }
            else{
                answers[i] = prices[i];
            }
            stack.push(prices[i]);
        }
        return answers;
        
    }
}