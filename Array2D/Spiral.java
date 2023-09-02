import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Row Size 'n':\t");
        int n = sc.nextInt();
        System.out.println("Enter The Column 'm' Size:\t");
        int m= sc.nextInt();
        int[][] arr2d =  new int[n][m];
        System.out.println("Enter Values:\t");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2d[i][j]=sc.nextInt();
            }
        }
        System.out.println("Actula Output\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr2d[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\n");

        //Spiral Printing Logic

        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        while(rowStart<=rowEnd && colStart<=colEnd){
            //Printing The 1st Row 1st Column
            for(int col=colStart;col<=colEnd;col++){
                System.out.print(arr2d[rowStart][col]+"\t");
            }

            rowStart++;
            //Printing the all Elements of n th Column
            for(int row = rowStart; row<=rowEnd; row++){
                System.out.print(arr2d[row][colEnd]+"\t");
            }

            colEnd--;
            //Last Row Printing
            for(int col=colEnd;col>=colStart;col--){
                System.out.print(arr2d[rowEnd][col]+"\t");
            }

            rowEnd--;
            //First Column Printing
            for(int row=rowEnd;row>=rowStart;row--){
                System.out.print(arr2d[row][colStart]+"\t");
            }

            colStart++;
        }

    }
}
