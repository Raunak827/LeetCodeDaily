class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long min=1;
        long max=piles[0];
        for(long i:piles){
            max=Math.max(i,max);
        }
        long ans=max;
        while(min<=max){
            long mid = min + (max - min) / 2;
            long hours=0;
            for(long pile:piles){
                hours += (pile + mid - 1) / mid;
            }
            if (hours <= h) {
            ans = mid;
            max = mid - 1;
            }
            else{
            min=mid+1;
            }
        }
        return (int)ans;
    }
}