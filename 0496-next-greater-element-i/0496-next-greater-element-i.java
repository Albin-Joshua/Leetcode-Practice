class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0){
            return new int[0];
        }
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> Nge = new HashMap<>();

        for(int i=0; i<nums2.length; i++){
            if(stack.isEmpty()){
                stack.push(nums2[i]);
                continue;
            }
            while(!stack.isEmpty() && nums2[i]>stack.peek()){
                Nge.put(stack.peek(),nums2[i]);
                stack.pop();
            }
            if(stack.isEmpty() || nums2[i]<stack.peek()){
                stack.push(nums2[i]);
            }
        }
        while(!stack.isEmpty()){
            Nge.put(stack.pop(),-1);
        }
        for(int i=0; i<nums1.length; i++){
            nums1[i] = Nge.get(nums1[i]);
        }
        return nums1;
    }
}