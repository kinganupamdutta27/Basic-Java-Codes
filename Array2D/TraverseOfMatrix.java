import java.util.Scanner;

public class TraverseOfMatrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Row Size:\t");
        int n = sc.nextInt();
         System.out.println("Enter the Row Size:\t");
        int m = sc.nextInt();
        int[][] actual_Arrya = new int[n][m];
        int[][] trans_Array = new int[m][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                actual_Arrya[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                trans_Array[j][i]=actual_Arrya[i][j];
            }
        }
        System.out.println("op");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(trans_Array[i][j]+"\t"); 
            }
            System.out.println();
        }

       
    }
}
