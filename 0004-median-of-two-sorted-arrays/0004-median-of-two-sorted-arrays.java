class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i=0;
        int j=0;
        int m1=0;
        int m2=0;
        for(int count=0; count<=(m+n)/2; count++){
            m2=m1;
            if(i<m && j<n){
                if(nums1[i]<nums2[j]){
                    m1 = nums1[i];
                    i++;
                }
                else{
                    m1 = nums2[j];
                    j++;
                }
            }
            else if(i<m){
                m1 = nums1[i];
                i++;
            }
            else{
                m1 = nums2[j];
                j++;
            }
        }
        if((n+m)%2 == 1) return (double) m1;
        else return (double) (m1+m2)/2;
    }
}