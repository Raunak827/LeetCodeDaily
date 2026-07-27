class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++)
        {
            int find=target-numbers[i];
            int match=Binary(i+1,numbers.length-1,find,numbers);
            if(match!=-1) return new int[] { i+1, match+1};
        }
        return new int[0];
    }
    private int Binary(int start,int end, int target, int[] nums){
        int ans=0;
        while(end>=start)
        {
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target> nums[mid]) start=mid+1;
            else {
                return mid;
            }
        }
        return -1;
    }
}