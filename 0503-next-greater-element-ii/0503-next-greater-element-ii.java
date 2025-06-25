class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int length = nums.length;
        Stack<Integer> monotonicStack = new Stack<>();
        int[] result = new int[length];
        Arrays.fill(result, -1);
        for(int i=0; i<length+length-1; i++){
            int currentIndex = i%length;
            while(!monotonicStack.isEmpty() && nums[currentIndex]>nums[monotonicStack.peek()]){
                int index = monotonicStack.pop();
                result[index] = nums[currentIndex];
            }
                monotonicStack.push(currentIndex);
        }
        return result;
    }
}