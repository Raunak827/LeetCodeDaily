class Solution {
    public int[] sortedSquares(int[] nums) {
        int []ans = new int[nums.length];
        int left=0,right=nums.length-1;
        for(int i=right;i>=0;i--)
        {
            if(Math.abs(nums[left])>=Math.abs(nums[right]))
            {
                ans[i] = nums[left] * nums[left];
                left++;
            }
            else
            {
                ans[i] = nums[right] * nums[right];
                right--;
            }
            
        }
        return ans;
    }
}