class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr=new int[nums.length-1];
        int idx=-1;
        for(int i:nums){
            arr[i-1]++;
            if(arr[i-1]==2) {
                idx=i;
                break;
            }
        }
        return idx;
    }
}