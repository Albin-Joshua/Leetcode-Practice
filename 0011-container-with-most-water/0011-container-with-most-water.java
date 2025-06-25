class Solution {
    public int maxArea(int[] height) {
        int size = height.length;
        int l=0;
        int r= size-1;
        int maxVolume = 0;
        int minHeight=0;
        int volume = 0;
        int width = 0;
        while(l<r){
            minHeight = Math.min(height[l], height[r]);
            width = r-l;
            volume = minHeight * width;
            maxVolume = Math.max(maxVolume, volume);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxVolume;
        
    }
}