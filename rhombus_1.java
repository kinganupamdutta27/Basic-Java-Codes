import java.util.Scanner;

public class rhombus_1 {
    public static void main(String[] args) {
    int n;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Some Value\t");
    n=sc.nextInt();
    for(int i=1;i<=n;i++){
        //Space Printing
        for(int j=1;j<=n-i;j++){
            System.out.print(' ');
        }
        //printing Star
        for(int j=1;j<=n;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}
