class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int[] leftMax = new int[size];
        int[] rightMax = new int[size];
        leftMax[0] = height[0];
        rightMax[size-1] = height[size-1];
        for(int i=1; i<size; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        for(int j=size-2; j>=0; j--){
            rightMax[j] = Math.max(height[j],rightMax[j+1]);
        }
        int result=0;
        for(int k=0; k<size; k++){
            result += Math.min(leftMax[k],rightMax[k]) - height[k];
        }
        return result;
    }
}