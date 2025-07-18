class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max=0;
        for(int i=0;i<heights.length; i++){
            while(stack.peek()!=-1 && heights[i]<=heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width = i-stack.peek()-1;
                max = Math.max(max, height*width);
            }
            stack.push(i);
        }
        while(stack.peek()!=-1){
            int height = heights[stack.pop()];
            int width = heights.length-stack.peek()-1;
            max = Math.max(max, height*width);
        }
        return max;
    }
}