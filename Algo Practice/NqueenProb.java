import java.util.ArrayList;
import java.util.List;

public class NqueenProb {
    public static void saveBorad(char[][] board, List<List<String>> allBoard){
        String Ele="";
        List<String> S = new ArrayList<>();
        for(int row=0; row<board.length; row++){
            Ele="";
            for (int col = 0; col < board.length; col++) {
                if(board[row][col]=='Q'){
                    Ele+='Q';
                }else{
                    Ele+='.';
                }
            }
            S.add(Ele);

        }
        allBoard.add(S);
        System.out.println(allBoard);

    }


    public static boolean isSafe(char[][] board, int row, int column){
        //Horizental & Vertical Check
        for (int i = 0; i < board.length; i++) {
            if(board[row][i]=='Q'){
                return false;
            }
             if(board[i][column]=='Q'){
                return false;
            }
        }

        //Upper Left
        for(int rowInx = row, colInx = column; rowInx>=0 && colInx>=0 ;rowInx--, colInx--){
            if(board[rowInx][colInx]=='Q'){
                return false;
            }
        }

        //Upper Right
        for(int rowInx = row, colInx = column; rowInx>=0 && colInx<board.length ;rowInx--, colInx++){
            if(board[rowInx][colInx]=='Q'){
                return false;
            }
        }
          //Lower Right
        for(int rowInx = row, colInx = column; rowInx< board.length && colInx< board.length ;rowInx++, colInx++){
            if(board[rowInx][colInx]=='Q'){
                return false;
            }
        }

        //Lower Left
        for(int rowInx = row, colInx = column; rowInx < board.length && colInx>=0 ;rowInx++, colInx--){
            if(board[rowInx][colInx]=='Q'){
                return false;
            }
        }

        return true;
    }

    public static void NQueenChess(char[][] board, List<List<String>> allBoards, int column){
        if (column==board.length) {
            saveBorad(board, allBoards);
            return;
            
        }

        for(int row = 0; row<board.length; row++){
            if(isSafe(board, row, column)){
                board[row][column]='Q';
                NQueenChess(board, allBoards, column+1);
                board[row][column]='.';
            }
        }
    }

    public static void main(String[] args) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[4][4];
        NQueenChess(board, allBoards, 0);
    }
}
