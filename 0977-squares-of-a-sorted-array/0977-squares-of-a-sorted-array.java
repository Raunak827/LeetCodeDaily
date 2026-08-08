class Solution {
    public int[] sortedSquares(int[] nums) {
        int []ans = new int[nums.length];
        int left=0,right=nums.length-1;
        for(int i=right;i>=0;i--)
        {
            int lftsq=nums[left] * nums[left];
            int rsq=nums[right] * nums[right];
            if(lftsq>=rsq)
            {
                ans[i] = lftsq;
                left++;
            }
            else
            {
                ans[i] = rsq;
                right--;
            }
            
        }
        return ans;
    }
}