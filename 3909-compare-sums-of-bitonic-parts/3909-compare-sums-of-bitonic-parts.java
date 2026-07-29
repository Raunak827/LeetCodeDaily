class Solution {
    public int compareBitonicSums(int[] nums) {
        int start=0;
        int end=nums.length-1;
        long sum1=0;
        long sum2=0;
        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] > nums[mid + 1]) {
                end = mid; 
            } else {
                start = mid + 1;
            }
        }
        int peak = start;      
        for (int i = 0; i <= peak; i++) sum1 += nums[i];
        for (int i = peak; i < nums.length; i++) sum2 += nums[i];
        if(sum1>sum2) return 0;
        else if(sum1==sum2) return -1;
        else return 1;
    }
}