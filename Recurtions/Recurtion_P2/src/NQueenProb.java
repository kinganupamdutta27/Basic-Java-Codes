import java.util.ArrayList;
import java.util.List;


public class NQueenProb {

    public static void saveBoard(char[][] board,List<List<String>> allBoards) {
        String row;
        List<String> NewBoard = new ArrayList<>();

        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length; j++){
                if(board[i][j]=='Q'){
                    row+='Q';
                }else{
                    row+='.';
                }
            }
            NewBoard.add(row);
        }
        allBoards.add(NewBoard);
        System.out.println(NewBoard);
    }

    public static boolean isSafe(int row, int col, char[][] board){
        //Horizontal Check
        for(int colIndex=0;colIndex<board.length;colIndex++){
            if(board[row][colIndex]=='Q'){
                return false;
            }
        }
        //Vertical Check
        for (int rowIndex=0; rowIndex< board.length;rowIndex++ ){
            if(board[rowIndex][col]=='Q'){
                return false;
            }
        }
        //Upper Left Diagonal
        for(int rowIndex=row, colIndex=col; rowIndex>=0 && colIndex>=0; rowIndex--,colIndex--){
            if(board[rowIndex][colIndex]=='Q'){
                return false;
            }
        }
        //Upper Right Diagonal
        for(int rowIndex=row, colIndex=col; rowIndex>=0 && colIndex< board.length; rowIndex--,colIndex++){
            if(board[rowIndex][colIndex]=='Q'){
                return false;
            }
        }

        //Lower right Diagonal
        for(int rowIndex=row, colIndex=col; rowIndex< board.length && colIndex< board.length; rowIndex++,colIndex++){
            if(board[rowIndex][colIndex]=='Q'){
                return false;
            }
        }
        //Lower left Diagonal
        for(int rowIndex=row, colIndex=col; rowIndex< board.length && colIndex>=0; rowIndex++,colIndex--){
            if(board[rowIndex][colIndex]=='Q'){
                return false;
            }
        }

        return true;

    }
    public static void helper(char[][] board, List<List<String>> allBoards,int col){
        if(col==board.length){
            saveBoard(board, allBoards);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col, board)){
                board[row][col]='Q';
                helper(board, allBoards, col+1);
                board[row][col]='.';
            }
        }

    }

    public static void main(String[] args) {

        List<List<String>> allBoards = new ArrayList<>();
        char[][] Board = new char[4][4];
        helper(Board,allBoards,0);

    }
}
