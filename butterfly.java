import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
    int n;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Some Value\t");
    n=sc.nextInt();
        for(int i=1;i<=n;i++){

            //First Half
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //first Left Side Space -+
            for(int j=1;j<=(n-i)*2;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
             System.out.println();
        } 
        /*for(int i=1;i<=n;i++){
            //Second Half
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            for(int j=2;j<=i;j++){
                System.out.print("    ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" *");
            }
            System.out.println();
        }*/
        for(int i=n;i>=1;i--){

            //First Half
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //first Left Side Space -+
            for(int j=1;j<=(n-i)*2;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
             System.out.println();
        } 
    }
}
