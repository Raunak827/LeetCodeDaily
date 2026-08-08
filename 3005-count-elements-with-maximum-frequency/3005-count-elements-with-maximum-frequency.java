class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[]=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
        }
        int max=0;
        int freq=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];
                freq=0;
            }
            if(arr[i]==max) freq++;

        }
        return max*freq;
    }
}