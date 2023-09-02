public class suduku {

    public static boolean isSafe(char[][] board, int row, int col, int num){
        for(int i=0;i< board.length;i++){
            if(board[i][col]==(char)(num+'0')){
                return false;
            }
        }

        for(int i=0;i< board.length;i++){
            if(board[row][i]==(char)(num+'0')){
                return false;
            }
        }

        int nr = (row/3)*3;
        int nc = (col/3)*3;

        for (int i=nr;i<nr+3;i++){
            for(int j=nc;j<nc+3;j++){
                if(board[i][j]==(char)(num+'0')){
                    return false;
                }
            }
        }

        return  true;
    }
    public static boolean sudukuSolve(char[][] board, int row, int col){
        //Terminqtor
        if(row==board.length){
            return true;
        }

        //Iterator
        int nrow=0;
        int ncol=0;

        if(col== board.length-1){
         nrow = row+1;
         ncol = 0;
        }else {
            nrow = row;
            ncol = col + 1;
        }

        //main loop
        if (board[row][col]!='.'){
            if(sudukuSolve(board, nrow, ncol)){
                return true;
            }
        }else{
            for (int num = 1; num <= board.length ; num++) {
                if(isSafe(board, row, col, num)){
                    board[row][col] = (char) (num+'0');
                    if(sudukuSolve(board, nrow, ncol)){
                        return true;
                    }else {
                        board[row][col] = '.';
                    }
                }
            }
        }

return false;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(sudukuSolve(board,0,0));
    }

}

