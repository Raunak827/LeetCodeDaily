class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int total=n1+n2;
        int j1=0;int j2=0;
        int i = 0, j = 0;
        for(int count = 0; count <= total/2; count++)
        {
            j2=j1;
            if(i != n1 && j != n2){
                if(nums1[i]>nums2[j]) j1=nums2[j++];
                else j1=nums1[i++];
            }
            else if (i < n1) j1=nums1[i++];
            else j1 = nums2[j++];
        }
        if(total%2==1) return (double) j1;
        else return ((double) j1 + (double) j2)/2.0;
        
    }
}