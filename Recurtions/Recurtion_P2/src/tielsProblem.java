public class tielsProblem {
    public static void main(String[] args) {
        System.out.println(numType(4,2));
    }
    public static int numType(int row, int col){
        if(row==col){
            return 2;
        }
        if(row<col){
            return 1;
        }

        int verticalAlign = numType(row-col,col);
        int horizentalAlign = numType(row-1,col);
        return verticalAlign+horizentalAlign;

    }
}
