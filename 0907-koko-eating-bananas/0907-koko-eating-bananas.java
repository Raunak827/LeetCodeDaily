class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxV = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            maxV = Math.max(maxV, piles[i]);
        }

        int left = 1, right = maxV;
        while (left < right) {
            int mid = left + (right - left) / 2;
            long hoursTaken = 0;
            for (int num : piles) {
                hoursTaken += (long) ((num - 1) / mid) + 1; 
            }
            if (hoursTaken <= h) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
}