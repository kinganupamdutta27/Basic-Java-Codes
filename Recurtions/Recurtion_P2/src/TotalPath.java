public class TotalPath {
    public static void main(String[] args) {
        System.out.println(TotalPath(0,0,10,10));
    }
    public static int TotalPath(int i,int j, int row, int column){
        if(i==row || j == column){
            return 0;
        }

        if(i==row-1 && j==column-1){
            return 1;
        }

        int rowTotal = TotalPath(i+1,j,row, column);

        int colTotal = TotalPath(i,j+1, row,column);

        return rowTotal+colTotal;

    }
}
