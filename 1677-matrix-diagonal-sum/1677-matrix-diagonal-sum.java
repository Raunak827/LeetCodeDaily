class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        int extra= n%2==0 ? 0 : mat[n/2][n/2];
        int j=n-1;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            sum+=mat[i][j];
            j--;
        }
        return sum-extra;
    }
}