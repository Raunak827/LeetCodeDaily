class Solution {
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res= new ArrayList<>();
        char[][] board= new char[n][n];
        for(int i=0;i<n;i++) Arrays.fill(board[i],'.');
        boolean[] columns = new boolean[n];
        boolean[] diagonal1= new boolean[2*n];
        boolean[] diagonal2= new boolean[2*n];
        generate(0,n,board,columns,diagonal1,diagonal2,res);
        return res;
    }
    void generate(int row, int n,char[][] board,boolean[] columns, boolean[] diagonal1, boolean []diagonal2, List<List<String>> res)
    {
        if(row==n)
        {
            List<String> ls= new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                ls.add(new String(board[i]));
            }
            res.add(ls);
            return;
        }
        for(int col=0;col<n;col++)
        {
            if(columns[col] || diagonal1[row+col] || diagonal2[n-row+col]) continue;
            
            board[row][col]='Q';
            columns[col]=true;
            diagonal1[row+col]=true;
            diagonal2[n-row+col]=true;
            generate(row+1,n,board,columns,diagonal1,diagonal2,res);
            board[row][col]='.';
            columns[col] = false;
            diagonal1[row + col] = false;
            diagonal2[n - row + col] = false;
            }
        }
    }
