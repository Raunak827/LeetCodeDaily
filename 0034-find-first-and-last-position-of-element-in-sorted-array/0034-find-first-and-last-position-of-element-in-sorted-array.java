class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums,target),last(nums,target)};
    }
    private int first(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(end>=start){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target> nums[mid]) start=mid+1;
            else {
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
    private int last(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(end>=start){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target> nums[mid]) start=mid+1;
            else {
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
    }
}