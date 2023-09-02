import java.util.Scanner;

public class array2DItemSrc{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[][] arrM = new int[3][3];
        int row = arrM.length;
        int col = arrM[0].length;
         //Input
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter Values:\t");
                arrM[i][j]=sc.nextInt();
            }
         }
         //Search Value
         System.out.println("Enter The Search Value:\n");
         int SCR = sc.nextInt();
         //Output
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arrM[i][j]==SCR)
                System.out.println("The Item "+SCR+" Found in Array Row "+i+" Column "+j);
            }
         }
         System.out.println("Data Not Found");
         //Total array op
          //Output
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
             
                System.out.print(arrM[i][j]+" ");
            }
            System.out.println();
        }

    }
}