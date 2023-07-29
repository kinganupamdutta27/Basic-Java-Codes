import java.util.Scanner;

public class inverted_triangle_patern2 {
    public static void main(String[] args) {
    int n;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Some Value\t");
    n=sc.nextInt();
        for(int i=0;i<n;i++){
            //Printing Space
            for(int j=i;j<n-1;j++){
                System.out.print(" ");
            }
            //Printing Star
            for (int j=0; j<=i; j++) {
                System.out.print("*");
                
            }
            System.out.println("");


        }
        System.out.println();
        //Another Process
        for(int i=1;i<=n;i++){
            //Printing Space
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            //Printing Star
            for (int j=1; j<=i; j++) {
                System.out.print("*");
                
            }
            System.out.println("");


        }
    }
}
