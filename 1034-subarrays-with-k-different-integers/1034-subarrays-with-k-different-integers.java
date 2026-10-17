class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    public int helper(int []nums,int k){
        if(k<0) return 0;
        int ptr=0;
        int res=0;
        int count=0;
        int track[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            int right=nums[i];
            track[right]++;
            if(track[right]==1) count++;
            while(count>k){
                int left=nums[ptr];
                track[left]--;
                if(track[left]==0) count--;
                ptr++;
            }
            res+=i-ptr+1;


        }
        return res;
    }
}