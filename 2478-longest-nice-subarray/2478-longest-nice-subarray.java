class Solution {
    public int longestNiceSubarray(int[] nums) {
        int curr=0;
        int left=0;
        int res=0;
        for(int right=0;right<nums.length;right++){
            while((curr & nums[right]) != 0){
                curr^=nums[left];
                left++;
            }
            curr |= nums[right];
            res=Math.max(res,right-left+1);
        }
        return res;
    }
}