class Solution {
    public boolean validDigit(int n, int x) {
        int check=0;
        while(n!=0){
            int dig=n%10;
            if (dig==x){
                check = 1;
                if(n<10){
                    check=0;
                }
            }
            n/=10;
        }
        if(check==0)
        return false;
        else return true;
    }
}