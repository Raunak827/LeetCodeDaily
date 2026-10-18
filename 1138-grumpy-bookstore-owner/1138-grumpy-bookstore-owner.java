class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int already=0;
        int n=customers.length;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0) already+=customers[i];
        }
        int additional=0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1) additional+=customers[i];
        }
        int max=additional;
        for (int i = minutes; i < n; i++) {
            if(grumpy[i]==1) additional+=customers[i];
            if(grumpy[i-minutes]==1)  
                additional-=customers[i-minutes];
            max=Math.max(additional,max);

        }
        return max+already;
    }
}